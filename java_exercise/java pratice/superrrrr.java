// package java pratice;
class dog{
    public  void drow(){
        System.out.println("drowing a shape ");
    }
}
public class superrrrr extends dog {
    public  void drow(){
        super.drow();// calls for the mathod of parent class
        System.out.println("drow dog ");
    }
    public static void main(String[] args) {
        superrrrr obj =new superrrrr();
        obj.drow();
    }
}
