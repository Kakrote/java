import java.util.Scanner;
public class practice_switch_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:- ");
        int age = sc.nextInt();
        switch(age){
            case 4->{
                System.out.println("baby");}                 //This method is called inhence switch method
            case 18->{System.out.println("adult");}
            case 25->{System.out.println("Mature");}
            default->{System.out.println("Nothing");}
        }
    }
}
