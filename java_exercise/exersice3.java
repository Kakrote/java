import java.util.Scanner;
public class exersice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Day:- ");
        int Day=sc.nextInt();
        switch(Day){
            case 1->System.out.println("Monday");
            case 2->System.out.println("Tuseday");
            case 3->System.out.println("Wednesday");
            case 4->System.out.println("Thursday");
            case 5->System.out.println("Friday");
            case 6->System.out.println("Saterday");
            case 7->System.out.println("Sunday");
            default->{System.out.println("Wrong Entry");}
        }
            
    }
}
