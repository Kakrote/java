class Base1{
    public int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x=x;
    }
    Base1(){
        System.out.println("I am constructor of Base class:- ");
    }
    Base1(int n){
        System.out.println("This is the onerlorder constructor"+n);
    }
}
/**
 * Driver1
 */
class Driver1 extends Base1{
    Driver1(){
        super(10);// This keyword use to give the call to the over lireded constructor of the base class.
        System.out.println("I am constructor for class Driver:- ");
    }
    public int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
    }
}
public class constuction_inheritence {
    public static void main(String[] args) {
        // Base1 b=new Base1();
        // this will be a constructor and will call it self by defult
        Driver1 d=new Driver1();
        // if there is no constructor for base class then it wil by defult call the constuctor for base class automatically
        // first it will call the constructor of base class then it will call driver constructor.

    }
}