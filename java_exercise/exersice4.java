import java.util.Scanner;
public class exersice4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:- ");
        int year=sc.nextInt();
        int leap=(year%4);
        if(leap==0){System.out.printf("Yes the year %d is a leap year\n ",year);}
        else{System.out.printf("The year %d is not an leap year\n ",year);}
    }
}
