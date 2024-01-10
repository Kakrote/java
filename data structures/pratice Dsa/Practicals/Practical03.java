import java.util.Scanner;
public class Practical03 {
    int maxHand(int n){
        int totalhand=n*(n-1)/2;
        return totalhand;
    }
    public static void main(String[] args) {
        Practical03 p2=new Practical03();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of persion in the room");
        int n=sc.nextInt();
        int a=p2.maxHand(n);
        System.out.printf("Total no of hand sakes done  by %d is %d \t",n,a);
    }
}
