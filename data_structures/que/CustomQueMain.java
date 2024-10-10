package que;

public class CustomQueMain {
    public static void main(String[] args) throws CustomQueException {
        CustomCerculerQue Que=new CustomCerculerQue();
        Que.insert(10);
        Que.insert(11);
        Que.insert(12);
        Que.insert(13);
        
        Que.display();
        // System.out.println(Que.sizeQue());
        Que.remove();
        Que.remove();
        // // Que.insert(14);
        Que.insert(24);
        Que.insert(34);
        Que.insert(44);
        // Que.remove();
        // Que.remove();
        // Que.remove();
        Que.display();
        // System.out.println(Que.sizeQue());

    }
}
