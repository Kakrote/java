import java.util.Scanner;
/**
 * Practical01
 */
public class Practical01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        boolean check=false;
        String alpa="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<alpa.length();i++){
            if(str.charAt(0)==alpa.charAt(i)){
                // System.out.println("Not a alphabet");
                check=true;
                // continue;
            }
            // else System.out.println("Is a alphabet");
        }
        if(check==true){
            System.out.println("IS a alphabet");
        }
        else System.out.println("Not a alphabet");

    }
}