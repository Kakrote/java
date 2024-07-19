import java.util.Scanner;

public class fabonachi_series {
    static int febonachi(int n){
        int fab1=0;
        int fab2=1;
        int fab=0;
        System.out.print(fab1+" "+fab2);
        for(int i=2;i<n;i++){
            fab=fab1+fab2;
            //System.out.print(" "+fab);
            fab1=fab2;
            fab2=fab;
            System.out.print(" "+fab+" ");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number upto which you need the series:");
        int num=sc.nextInt();
        febonachi(num);
        
    }
}
