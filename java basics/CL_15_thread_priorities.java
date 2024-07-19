class Mythreads extends Thread{
    public Mythreads(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<199){
            System.out.println(this.getName());
            i++;
        }
    }
}
public class CL_15_thread_priorities {
    public static void main(String[] args) {
        Mythreads t1=new Mythreads("Thread 1(least important of all)");
        Mythreads t2=new Mythreads("Thread 2");
        Mythreads t3=new Mythreads("Thread 3");
        Mythreads t4=new Mythreads("Thread 4(most important Thread of the all)");
        //Setting max priority to the thread 4;
        t4.setPriority(Thread.MAX_PRIORITY);
        //Setting min priority to the thread 1
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
//By defult the priority is normal which is 5
//Min is 1
//Max is 10
