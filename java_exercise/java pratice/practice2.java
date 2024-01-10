import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        System.out.println("Enter your name:- ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();// this will read the entier string with space otherwise in normal case it would have not read the space
        System.out.print("Hello "+ name +" Have a good day ");
    }
}
