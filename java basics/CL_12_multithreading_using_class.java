class MyThread extends Thread{
    public void run(){
        int i=0;
        while (i<10) {
            
            System.out.println("I have a girlfriend and she is cute");
            i++;
        }

    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while (i<10) {
            
            System.out.println(" I am single and i dont have any girlfrind ,Moye Moye!");
            i++;
        }
    }
}
public class CL_12_multithreading_using_class {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        MyThread2 mt2=new MyThread2();
        mt.start();// these will call the run methods and run randamly with the threads.
        mt2.start();
    }
}
