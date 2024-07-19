import java.util.Scanner;

class Myexception extends Exception{
    @Override
    public String toString(){// these are predefine functon in Exception class
        return "I am to string()";

    }
    @Override
    public String getMessage(){
        return "I am get message()";
    }
}
public class CL_17_Exception_classinjava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int a=sc.nextInt();
        if(a<9){
            try{
                throw new Myexception();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);//by defult calls the toString function.
                e.printStackTrace();
            }
            System.out.println("finished");
        }

    }
}
