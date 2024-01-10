import java.util.Scanner;
 public class deleting_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int arr[]=new int[10];
        System.out.println("Note:- the length of the array should be less the 10\n\nEnter the length of the array:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.printf("Enter the value for arr[%d]:- ",i);
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter the value to be delete:- ");
        int num=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                c=i;
            }
        }
        int temp;
        for(int i=c;i<n;i++){
            temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
        }
        n-=1;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}