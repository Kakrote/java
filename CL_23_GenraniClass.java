class Genraci<T1>{
    int val;
    private T1 t1;
    public Genraci(int val,T1 t1){
        this.val=val;
        this.t1=t1;

    }
    public int getval(){
        return val;
    }
    public void setval(){
        this.val=val;
    }
    public T1 getT1(){
        return t1;
    }
    public void setT1(){
        this.t1=t1;
    }
}
public class CL_23_GenraniClass {
    public static void main(String[] args) {
        Genraci<String> g1=new Genraci(789, "This is MYSting");
        String str=g1.getT1();
        System.out.println(str);
    }
}
