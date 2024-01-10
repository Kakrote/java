abstract class Parent{
    void show(){
        System.out.println("THis is method of abstract class:- ");
    }
    abstract public void display();// This should not have a body.
}
class child extends Parent{
    public void display(){
        System.err.println("this is overriding of display:");
    }
    void play(){
        System.out.println("this is play funtion:");
    }
}
public class Abstract_class {
    public static void main(String[] args) {
        // Parent p=new Parent(); --> This is error;
        child c=new child();
        c.display();
    }
}
