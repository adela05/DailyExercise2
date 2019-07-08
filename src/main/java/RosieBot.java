public class RosieBot implements Robot {
    private int uniqueID;
    private static int rosieCount = 0;

    //Construtor
    public RosieBot(){
        this.uniqueID = incrementCount();
    }
    /* For this Static method (incrementCount method) can only connect with other static methods and variable
    *  inside the class. It cannot be passed to other Class. Only way to do that is to call it inside the
    *  Constructor as a value to a Variable.   */
    private static int incrementCount(){
        return ++rosieCount;
    }
    // Creating Setter and Getter for the variable
    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }
    // implementing the Interfaces from Robot.
    public void turnOn(){
        System.out.println("is on");
    }
    public void turnOff(){
        System.out.println("is off");
    }
}


