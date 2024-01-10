// program to calculate the percentage of the 5 subject:-
import java.util.Scanner;

/**
 * exersies1
 */
public class exersies1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc isthe obj of the class Scanner   
        System.out.println("Enter the total marks of each subject");
        int Tm = sc.nextInt();
        float Tm2 = Tm*5; // this will give the total marks of 5 subjects
        System.out.println("Enter the marks of each subjects- ");
        System.out.print("English:- ");
        int E = sc.nextInt();
        System.out.print("Maths:- ");
        int M = sc.nextInt();
        System.out.print("Science:- ");
        int S = sc.nextInt();
        System.out.print("Hindi:- ");
        int H = sc.nextInt();
        System.out.print("Socialsience:- ");
        int Ss = sc.nextInt();
        System.out.print("Total marks obtain are:- ");
        int Tmo=E+M+S+H+Ss;
        System.out.println(Tmo);
        float percent = (Tmo/500.0f)*100; // this is the mistake point 
        System.out.print("Your percentage according to the given data is :- ");
        System.out.println(percent);
        System.out.println(Tm2);

    }
}