import java.util.Scanner;
public class practice10 {
    int sum(int x,int y){
        int z=x+y;
        return z;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the two numbers ");
        a=sc.nextInt();
        b=sc.nextInt();
        practice10 obj=new practice10();// as the int sum funtion is not static we had to create a seprate obj for the perpouse
        c=obj.sum(a, b);
        System.out.println("The sum of the number is "+c);
    }
}
