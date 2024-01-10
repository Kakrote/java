import java.util.Scanner;
public class CL09_switch_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:- ");
        int age=sc.nextInt();
        switch(age){
            case 4:
            System.out.println("You are baby ");
            break;
            case 18:
            System.out.println("Your are a adult ");
            break;
            case 25:
            System.out.println("You are mature now ");
            break;
            default:
            System.out.println("Out of syllabus ");
        }
    }
}
//Note    There is a inhence switch case  which is like:
//         switch(var){
    //        case 1->{code}          this method does not requier any break stetment
//          }
