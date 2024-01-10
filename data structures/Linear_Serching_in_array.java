import java.util.*;
public class Linear_Serching_in_array {// code for linear search;

    static void serching(int arr[],int n,int se){
        // int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==se){
                System.out.println("Match found at the index of "+(i+1 ));
                
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements for the array");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the element to be serarch in the array");
        int se=s.nextInt();
        serching(arr,n,se);
    }   
}
