import java.io.*;
import java.util.*;
/**
 * practicecode123
 */
public class practicecode123 {
    static int hcf(int a, int b){
        int result=Math.min(a,b);
        while (result>0) {
            if(a%result==0&&b%result==0){
                break;
            }
            result--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number ");
        int n1=sc.nextInt();
        System.out.println("Enter the 2nd number ");
        int n2=sc.nextInt();
        sc.close();
        System.out.println("The hcf of "+n1+" and "+n2+" is "+hcf(n1, n2));
    }
    
}