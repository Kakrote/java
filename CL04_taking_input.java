import java.util.Scanner;// to import the Scanner in java 
public class CL04_taking_input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);// this creats the object for the the import class Scanner (system.in) to read the keybord value
        System.out.println("Enter the the number 1:- ");
        int a=sc.nextInt();// this a class method of class Scanner to take input
        System.out.println("Enter the number 2:- ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.print("The sum of the two numbers is:- ");
        System.out.println(sum);
        System.out.println("write a line "); 
        String str= sc.next();// this will read only one world as if you enter Anshul is good oy it will read only Anshul
        System.out.println(str);
        // to make it read full line we use the method nextLine()
        System.out.println("now write again and see the diffrence");
        String s=sc.nextLine();
        System.out.println(s);
    }
}
// note1:- Scanner is the class hence the first letter should be in the capital(pascal method)
//     2:- nextInt is the method of the class scanner
//     3:- sc is the object created for the class Scanner 