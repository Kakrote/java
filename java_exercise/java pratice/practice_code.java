import java.util.Scanner;
/**
 * practice_code
 */
public class practice_code {

    static void print(String name){
        System.out.println("Your name is "+name);
    }
    static void sum(int x,int y){
        int z=x+y;
        System.out.printf("The sum of %d and %d is %d",x,y,z);
    }
    static void Factorial(int fac){
        int m=1;
        for(int i=1;i<=fac;i++){
            m=m*i;
        }
        System.out.println("The fatorial of "+fac+" is "+m);
    }
    static void check(int m1){
        if(m1%2==0){
            System.out.printf("The %d is even ",m1);
        }
        else System.out.printf("The %d is odd ",m1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in);
        Scanner s4=new Scanner(System.in);
        Scanner s5=new Scanner(System.in);
        Scanner s6=new Scanner(System.in);
        int n;
        System.out.println("--------Enter your choice-------- ");
        System.out.println("1-Print your name\n2-Sum of two numbers\n3-Factorial of the number\n4-Check even or odd\n5-Swaping the values\n6-Find the largest number in the array");
        n=sc.nextInt();
       if(n==1){
        System.out.println("enter your name ");
        String your_name=s1.nextLine();
        print(your_name);
       }
       else if(n==2){
           System.out.println("Enter first number:");
        int num1=s2.nextInt();
        System.out.println("Enter secound number:");
        int num2=s2.nextInt();
        sum(num1,num2);
       }
       else if(n==3){
        System.out.println("Enter the number:");
        int fa=s3.nextInt();
        Factorial(fa);
       }
       else if(n==4){
        System.out.println("Enter the number:");
        int num=s4.nextInt();
        check(num);
       }
       else if(n==5){
        System.out.println("Enter the number for a ");
        int a=s5.nextInt();
        System.out.println("Enter the number for b ");
        int b=s5.nextInt();
        System.out.printf("Before swaping a=%d b=%d ",a,b);
        int temp=a;
        a=b;
        b=temp;
        System.out.printf("\nAfter swaping a=%d b=%d ",a,b);
        
       }
       else if(n==6){
        System.out.println("Enter five numbers ");
        int []num=new int[5];
        num[0]=s6.nextInt();
        num[1]=s6.nextInt();
        num[2]=s6.nextInt();
        num[3]=s6.nextInt();
        num[4]=s6.nextInt();
        int max=0;
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("The maximum number is "+max);
       }
    }
}