package java;

class MyThread1 implements Runnable{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am running Thread 1");
            i++;
        }
    }
}
class MyThread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am running Thread 2 ,Moye moye!");
            i++;
        }
    }
}
public class CL_13_multithreading_using_runable_interface {
    public static void main(String[] args) {
        // To call the the Threads in this method we cant simply apply and run the stat method
        // we have to fallow a process here.
        // create a object
        MyThread1 bullet1=new MyThread1();
        //without gun the bullets are of no use 
        //create a gun to shoot the bullet 
        Thread gun1=new Thread(bullet1);
        MyThread2 bullet2=new MyThread2();
        //without gun the bullets are of no use 
        // creating a gun to shoot the bullet
        Thread gun2=new Thread(bullet2);
        gun1.start(); 
        // now we are using the guns to fire the bullets 
        gun2.start();
    }
}
