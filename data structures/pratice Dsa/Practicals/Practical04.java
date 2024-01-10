import java.util.Scanner;
public class Practical04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int b=a;
        for(int i=0;i<a;i++){
            b+=1;
        }
        System.out.printf("Double of %d is %d\t",a,b);
    }
}
