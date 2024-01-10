class Base{
    int x;
    public int get(){
        return x;
    }
    public void set(int x){
        this.x=x;
    }
    public void printMe(){
        System.out.println("This is me funtion....");
    }
}
// to inherit the Base class we will use extends keyword. 
class Drived extends Base{
    int y;
    // public int get(){
    //     return y;
    // }
    // public void set(int y){
    //     this.y=y;
    // }
}
public class Inheritenc_in_java { 
 public static void main(String[] args) {
    Drived d=new Drived();
    d.printMe();  
    d.set(19);
    System.out.println(d.get());
    // Note:- did you notice that the printMe funtion was not in the Drived class but in the Base class 
    //        but even though it was not in Drived class we still manage to use it with the help of object of our 
    //        Drived class.
    //        This is called inheritence.
 }   
}
