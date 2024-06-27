import java.util.Scanner;

public class TryMathFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pow=sc.nextInt();
        int ans=(int)Math.pow(2,pow);
        System.out.println(ans);
    }
}
