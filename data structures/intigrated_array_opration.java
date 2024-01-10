import java.lang.reflect.Array;
import java.util.*;
public class intigrated_array_opration {
    static void head(int n, int arr[]){
        System.out.println("pos");
        for(int i=0;i<n;i++){
            System.out.format("%d = %d\n",i,arr[i]);
        }
    }
    static int insert(int l, int arr[]){
        Scanner s1=new Scanner(System.in);
        int val,pos;
        System.out.print("Enter the value to be insert in the array:- ");
        val=s1.nextInt();
        System.out.print("Enter the postion for inserting the value:- ");
        pos=s1.nextInt();
        for(int i=l-1;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=val;
        l+=1;
        System.out.println("The value has been insert in the array");
        //head(l, arr);
        System.out.println("pos");
        for(int i=0;i<l;i++){
            System.out.printf("%d = %d\n",i,arr[i]);
            //return arr[i];
        }
        return l;
    }
    static void deleting(int n,int arr[]){
        Scanner s2=new Scanner(System.in);
        int temp=0;
        System.out.print("Enter the value you want to delete:- ");
        int val=s2.nextInt();
        int in=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==val){
                in=i;
            }
        }
        for(int i=in;i<n-1;i++){
            temp=arr[in+1];
            arr[in+1]=arr[in];
            arr[in]=temp;

        }
        n-=1;
        //head(n, arr);
        System.out.println("pos");
        for(int i=0;i<n;i++){
            System.out.printf("%d = %d\n",i,arr[i]);
        }
    }
    static int arr[]=new int[10];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array:- ");
        int l=sc.nextInt();
        for(int i=0;i<l;i++){
            System.out.printf("Enter the value for arr[%d]:- ",i);
            arr[i]=sc.nextInt();
        }
        head(l, arr);
        while(l>0){
            System.out.println("----Enter your choies----");
            System.out.println("1-Inserting value in the array\n2-Deletig value from array");
            int ch=sc.nextInt();
            switch(ch){
                case 1->insert(l, arr);
                case 2->deleting(l, arr);
                case 3->System.exit(0);
                default->System.out.println("Wrong input");
            }
        }
    }
    
}