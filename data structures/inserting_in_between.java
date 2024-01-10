import java.util.*;
public class inserting_in_between {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[8];
        System.out.println("Enter the length of the array ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.printf("Enter the value for a[%d]:- ",i);
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be insert: ");
        int num=sc.nextInt();
        System.out.println("Enter the postion number where to insert:- ");
        int pos=sc.nextInt();
        int j;
        for(j=n-1;j>=pos;j--){
            arr[j+1]=arr[j];
        }
        arr[pos]=num;
        n+=1;
        System.out.println("The array after the uptation is ");
        for(int element=0;element<n;element++){
            System.out.print(" "+arr[element]+" ");
        }
    }
}