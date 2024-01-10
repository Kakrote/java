import java.util.Scanner;

public class parcticecode2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n=sc.nextInt(); 
        System.out.println("Enter 2nd number");
        int m=sc.nextInt();
        int hcf=0;
        if(n<m){
            for(int i=1;i<n;i++){
                for(int j=1;j<n;j++){
                if(n%i==0&&m%j==0){
                 if(i==j){
                    hcf=i;
                 }   
                }
                }
            }
        }
        else{
            for(int i=1;i<m;i++){
                for(int j=1;j<m;j++){
                if(n%i==0&&m%j==0){
                    if(i==j){
                        hcf=i;
                    }
                }}
                
            }
        }
        System.out.println("the hcf of "+n+" and "+m+" is "+hcf);
        
    }
}
