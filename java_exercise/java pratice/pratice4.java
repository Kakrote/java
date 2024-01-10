//Write a code to convert the the string into lower case
import java.util.Scanner;
public class pratice4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=str.toLowerCase();
        System.out.print(str+"\n this line will be converted into lower case\n"+str1+"\n");// \n is the newline charter
        //replace spaces with _ only
        String text=sc.nextLine();
        System.out.println(text.replaceAll(" ", "_"));
    }
}