import java.util.Scanner;

/**
 * practice3
 */
public class practice3 {
    static void output(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=arr[i]*arr[i];
                    arr[j]=arr[i];
                }
            }
        }
        System.out.println("The reslutent array is ");
        for(int e:arr) System.out.print(e+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array.");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array.");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        output(arr, n);

    }
}
