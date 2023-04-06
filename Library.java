import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building{

  private Hashtable<String,Boolean> collection;
  private boolean hasElevator;
  
  /** library class:
   * @param name
   * @param address
   * @param nFloors
  */

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.hasElevator = hasElevator();
      this.collection= new Hashtable<String,Boolean>();
    
      //System.out.println("You have built a library: 📖");
    }



  /** add book:
   * @param title
   * @return
   */
    public void addTitle(String title){
      this.collection.put(title, true);


    }


    /** remove book:
     * @param title
     * @return
     */
    public String removeTitle(String title){
      this.collection.remove(title);
      return title;
      
    } // return the title that we removed

    /**check out book:
     * @param title
     */
    public void checkOut(String title){
      this.collection.replace(title, true, false);

    }
    
  /**return book:
   * @param title
   */
    public void returnBook(String title){
      this.collection.replace(title, false, true);
      
    }


    /** check if title appears as a key in the collection:
     * @param title
     * @return
     */
    public boolean containsTitle (String title){// returns true if the title appears as a key in the Libary's collection, false otherwise
      return this.collection.containsKey(title);
    }

    /**returns true if the title is currently available, false otherwise
     * @param title
     * @return
     */
    public boolean isAvailable(String title){
      if(this.collection.get(title)){
      return true;
    } else{
      return false;
    }
  }
    
    /**prints out the entire collection in an easy-to-read way (including checkout status)

     */
     public void printCollection(){
      for(String title: this.collection.keySet()){
        System.out.println("Title:" + title +"Available" + this.collection.get(title));
      }

    }

    public void showOptions(){
      super.showOptions();
      System.out.println("+ addTitle() \n + removeTitle() \n + checkOut() \n + returnBook() \n + containsTitle() \n + isAvailable() \n + printCollection() \n + goToFloor()");
    }

    public boolean hasElevator(){
      return this.hasElevator;

    }


    public void goToFloor(int floorNum){
      if(this.hasElevator()){
        super.goToFloor(floorNum);
      } else{ throw new RuntimeException("Sorry, elevator not available, take the stairs!");
      }
    }



    public static void main(String[] args) {
      Library neilson = new Library("neilson", "7 Neilson Drive",4);
      neilson.addTitle("The Lorax by Dr. Seuss");
      neilson.addTitle("Mexican Gothic");
      neilson.checkOut("Mexican Gothic");
      neilson.returnBook("Mexican Gothic");
      neilson.printCollection();
      neilson.showOptions();
      neilson.enter();
      neilson.goToFloor(2);




    }
  
  }