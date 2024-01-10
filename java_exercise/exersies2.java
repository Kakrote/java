import java.util.Scanner;
public class exersies2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the your name:- ");
        String name=sc.nextLine();
        System.out.println("Enter your total marks:- ");
        int marks=sc.nextInt();
        float percentage=(marks/500.0f)*100.0f;
        if(percentage<33){System.out.println(percentage+"  You are fail");}
        else if(percentage<50){System.out.println(percentage+" You are not eligible for the course ");}
        else if(percentage==50){System.out.println(percentage+" You are eligible for the course\nBut not for the schoership");}
        else{System.out.println(percentage+" Please follow the instuctions ");}
        System.out.println("Thanking you for your time sir");
    }
}
