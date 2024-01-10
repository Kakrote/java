import java.util.Scanner;
public class adding_1st_last_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int last_num=n%10;
        int s=0;
        while(n>=1){
            s=s+n/10;
            s=s/10;
        }
        System.out.println("the sum of 1st and last digit of "+last_num+" is "+s);

    }
}
