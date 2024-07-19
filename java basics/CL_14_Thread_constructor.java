/**
 * CL_14_Thread_constructor
 */
class Mythr1 extends Thread{
   public Mythr1(String name){

       super(name);
   }


    public void run(){
        System.out.println("Hi iam Anshul");
        while (true) {
            
        }
    }
}
// class Mythr2 extends Thread(String name){
//     public Mythr2(String name){

//         super(name);
//     }
//     public void run(){
//         System.out.println("Thankyou");

//     }
// }
 public class CL_14_Thread_constructor {

    public static void main(String[] args) {
        Mythr1 m1=new Mythr1("Anshul");
        // Mythr2 m2=new Mythr2();
        m1.start();
        System.out.println("name is "+m1.getName()+m1.getId());
        // m2.start("Neha");
    }
}