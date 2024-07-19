interface Demo{
    void meth1();
}
public class CL_24_Anyoumos_And_lambda {
    public static void main(String[] args) {
        Demo d1=new Demo() {
            @Override
            public void meth1() {//This is the example of anyomous class
                System.out.println("Hello ");
            }
        };       
        d1.meth1();
        Demo d2=()->{System.out.println("neha");};//This is the example of lambda function 
        d2.meth1();
    }
}
