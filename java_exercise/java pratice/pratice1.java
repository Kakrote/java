
import java.util.Scanner;
public class pratice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // to calculate the marks of the studends;
        System.out.println("Enter the marks  per subject:- ");
        System.out.print("English:- ");
        float E=sc.nextFloat();
        System.out.print("Maths:- ");
        float M=sc.nextFloat();
        System.out.print("Sience:- ");
        float S=sc.nextFloat();
        System.out.print("Social:- ");
        float Ss=sc.nextFloat();
        float sum_of_marks= E+M+S+Ss;
        float percentage=(sum_of_marks/400.0f)*100;
        System.out.print("Percentage obtain by the student is:- "+percentage);


    }
}
