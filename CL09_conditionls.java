import java.util.Scanner;
public class CL09_conditionls {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your age:- ");
        int age = sc.nextInt();
        if(age>=18){// Give the condition 
            System.out.println("yes you can drive ");
        }
        else{//if the condition does not stisfy the print this
            System.out.println("No you can not drive\n");
        }
    }
}
//Note else is just optional 