//package oops;
/*Note:- 1-there could be only one public class in program 
 *       2-we can access this class variables and methods by insilising the object of the class.
 */
class Employ{ // This is a custom class
    int id;
    String name;
    // All the methos of this class will be aceesble to the main class through the objects.
}
public class first_custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class ");
        Employ e=new Employ();// we can create many objects as many as we need.
        e.id=123;
        e.name="Anshul";
        System.out.println(e.id+" "+e.name);
    }
}