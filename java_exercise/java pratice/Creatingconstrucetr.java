// package java pratice;

public class Creatingconstrucetr {
    String name="ramesh";
    public  Creatingconstrucetr(){
        int age=30;
        this.name="anshul";
    }
    public static void main(String[] args) {
        Creatingconstrucetr obj=new Creatingconstrucetr();
        System.out.println(obj.name);
    }
}
