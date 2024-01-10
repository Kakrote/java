// To convert meter into kilometer:
import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in meter:- ");
        float number=sc.nextFloat();
        double convert= number/1000.d;// Main conveter programe
        System.out.println("The distance is "+convert+" Km ");
    }
}
