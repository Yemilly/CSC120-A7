
import java.util.ArrayList;

/* This is a stub for the House class */

public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  private boolean hasElevator;


/**
 * 
 * @param name
 * @param address
 * @param nFloors
 * @param hasDiningRoom
 */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    this.hasElevator = hasElevator();

  }

  /** Accessor for hasDiningRoom
   * @return
   */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /** Accessor for number of residents 
   * @return
   */
  public int nResidents() {
    return this.residents.size();
  }

  /** Accessor for residents moving in
   * @param name
   */
  public void moveIn(String name) {
    // check if this.residents contains name
    if (this.residents.contains(name)) {
      //   if so: throw and exception
      throw new RuntimeException(name + " is already a resident of " + this.name);
    }
    // if we're good to go, add to roster
    this.residents.add(name);
    System.out.println(name + " has just moved into " + this.name + "! Go say hello :-)");
  }


  /** Accessor for residents moving out
   * @param name
   * @return
   */
  public String moveOut(String name) {
    if(!this.residents.contains(name)){
      throw new RuntimeException(name + "is not apart of this house");
      
    }
    this.residents.remove(name);
    return name;
    }


    public String toString() {
    String description = super.toString();
    description += " There are currently " + this.nResidents() + " people living in this house.";
    description += " This house ";
    if (this.hasDiningRoom) {
      description += "has";
    } else {
      description += "does not have";
    }
    description += " an active dining room.";
    return description;
  }



  public void showOptions(){
    super.showOptions();
    System.out.println("+ moveIn()\n + moveOut() \n + hasDiningRoom()\n + nResidents() \n+ goToFloor(activeFloor)\n");
  }

  public boolean hasElevator(){
    return this.hasElevator;
  }


  public void goToFloor(int floorNum){
    if(this.hasElevator()){
      super.goToFloor(floorNum);}
      else{
        throw new RuntimeException("Sorry, no elevator available, take the stairs");
      }
}

  public static void main(String[] args) {
    House gardiner = new House("Gardiner", "1 Paradise Rd", 4, false);
    System.out.println(gardiner);
    gardiner.moveIn("Yemilly");
    gardiner.moveIn("ghost");
    System.out.println(gardiner.nResidents());
    gardiner.moveOut("ghost");
    gardiner.showOptions();
    gardiner.enter();
    gardiner.goUp();
    gardiner.goToFloor(3);



  }

}