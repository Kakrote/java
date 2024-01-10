import java.util.Scanner;

/**
 * CL_16_Error_handling
 */
public class CL_16_Error_handling {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        // System.out.println("The number will give the quasent "+100/k);// This will throw an an error if we put k=0
        // to solve the error we will use try and cathch ;
        try{
            System.out.println("the quesent is "+1000/k);
        }
        catch(Exception e){
            System.out.println("this is the exception soory ");
            System.out.println(e);
        }
        System.out.println("rest of the code ");
    }
} 