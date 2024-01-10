/*Recurtion in java  */
import java.util.Scanner;
public class recurtion {

    // this is a example of the itrative approuch

    /*static int factoorial(int n){ 
        int fac=1;
        for(int i=n;i>0;i--){
            fac=fac*i;
            
        }
        return fac;
    }*/

    // now the recution approuch
    /* Why we use recurtion method 
     * becoz it is faster method to the thing
     * it take less time and space then an itrative method
     */

    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num=sc.nextInt();
        sc.close();
        int c=factorial(num);
        System.out.println("The factorial is "+c); 
    }
}
