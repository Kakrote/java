/**
 * Sorting_array
 */
public class Insertion_Sorting_array {

    public static void main(String[] args) {
        int a[]={1,10,20,5,3,4,2};
        int l=a.length;
        int temp=0;
        for(int i=l-1;i>=0;i--){
            for(int j=l-1;j>0;j--){
                if(a[i]>a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
            
        }
        for(int e:a) System.out.print(e+" ");
    }
}