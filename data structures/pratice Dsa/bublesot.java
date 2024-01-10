import java.util.Scanner;
/**
 * bublesot
 */
public class bublesot {

    public static void main(String[] args) {
        int arr[]={1,2,40,50,7,9,10};
        int l=arr.length;
        int temp;
        System.out.println("Array before sorting:-");
        for(int e:arr){
            System.out.print(e+" ");
        }
        
        // logic for buble sort 

        for(int i=0;i<l;i++){
            for(int j=0;j<l-1;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\nArray after sorting:");
        for(int e:arr) System.out.print(e+" ");
    }
}