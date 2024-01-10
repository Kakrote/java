
import java.util.Scanner;
public class Binary_search_array {
    static int[] sorting(int a[],int l){
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
        // for(int e:a) System.out.print(e+" ");
        return a;
    }
    static int search(int a[],int l,int num){
        int lower=0;
        int upper=l;
        while(lower<=upper){
            int mid=(lower+upper)/2;
            if(a[mid]==num){
            return mid;
            }
            if(num>a[mid]){
                lower=lower+mid;
            }
            if(num<a[mid]){
                upper=mid-1;
            }
            // else return -1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,10,2,41,14,25,35,18,56,64,90,100};
        int l=a.length;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to be serch:-  ");
        int num=sc.nextInt();
        sorting(a, l);
        for(int e:a) System.out.print(e+" ");
        System.out.println("\n"+num+" at index "+search(a, l, num));
    }
}