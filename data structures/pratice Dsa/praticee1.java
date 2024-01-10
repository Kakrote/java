// package pratice Dsa;

import java.util.Scanner;

public class praticee1 {
    static int val=0;
    static int value(int n,int a[]){
        int num=1;
        for(int i=0;i<n;i++){
            num=num*10;
        }
        for(int i=0;i<n;i++){
            num/=10;
            val=val+(num*a[i]);
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arry");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the numbers:- ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b=value(n, a);
        System.out.println(b );
    }
}
