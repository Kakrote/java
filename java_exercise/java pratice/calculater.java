import java.util.*;
import java.io.*;
public class calculater {
    static void grapic(){
        System.out.print("1  2  3\n4  5  6\n7  8  9\n0  +  -\n*  /  %\n");
    }
    public static void main(String[] args) {
        int num1,num2,cal;
        char ch;
        Scanner sc=new Scanner(System.in);
        grapic();
        while(true){
        System.out.println("Enter the expression");
        num1=sc.nextInt();
        ch=sc.next().charAt(0);
        num2=sc.nextInt();
        switch(ch){
            case '+'->{
            cal=num1+num2;
            System.out.println(cal);}
            case '-'->{
            cal=num1-num2;
            System.out.println(cal);}
            case '/'->{
            cal=num1/num2;
            System.out.println(cal);}
            case '%'->{
            cal=num1%num2;
            System.out.println(cal);}
            default ->{System.out.println("wrong entry");}
        }
    }
    }
}
