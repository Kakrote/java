class Phone{
    void display(){
        System.out.println("I am a phone");
    }
}
class Smart_Phone extends Phone{
    void display(){
        System.out.println("I am Smart Phone");
    }
    void motorola(){// this is the own funtion of class Smart-phone thats why we can not call this by the obj of class phone.
        System.out.println("Hi iam motorola and i am a smart phone");
    }
}
/**
 * Dynamic_Method_Dispatch
 */
public class Dynamic_Method_Dispatch {

    public static void main(String[] args) {
        Phone obj=new Smart_Phone();
        obj.display();// the display function of sub-class will we get run.
        // This is also called run time polymorishm.
    }
}
/*
 * we can create object of super class and can call the method of sub class if it is getting overriding 
 * but me can't call the method that is not getting overriding.
 */