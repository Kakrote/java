import java.util.Scanner;
public class numbers_counting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int i;
        for(i=0;n!=0;i++){
            n=n/10;
        }
        System.out.println("Length of the given number is "+ i);
    }
}
