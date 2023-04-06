
/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /** cafe class:
     * @param name
     * @param address
     * @param nFloors
     */
    public Cafe(String name, String address, int nFloors) {
        super(name,address,nFloors);
        this.nCoffeeOunces=100;
        this.nSugarPackets=200;
        this.nCreams=300;
        this.nCups=400;
        
        //System.out.println("You have built a cafe: ☕");
    }
    
    
    /** accessor for sell coffee:
     * @param size
     * @param nSugarPackets
     * @param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        this.nCoffeeOunces = size;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = 1;

    }

    /** accessor for restock:
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    
     private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }
    public void showOptions(){
        super.showOptions();
        System.out.println("Cafe.showOptions()");
    
    }

    public void goToFloor(int floorNum){
        if(floorNum>1){
            throw new RuntimeException("no upper level available");
        } else{
            this.activeFloor=1;

        }
    }




    public static void main(String[] args) {
        Cafe myCafe= new Cafe("compass cafe", "7 Neilson Drive", 4);
        myCafe.sellCoffee(12, 2, 3);
        System.out.println("hello");
        myCafe.restock(100, 100, 100, 100);
        myCafe.showOptions();
        myCafe.enter();
        myCafe.exit();

    }
    
}
