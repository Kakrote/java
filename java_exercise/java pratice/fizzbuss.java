/**
 * fizzbuss
 */
public class fizzbuss {

    public static void main(String[] args) {
        fizz(20);
    }
    public static void fizz(int n){
        for(int i=1;i<=n;i++){
            if(i%15==0){
                System.out.println("fizzbuzz");
            }
           else if(i%3==0){
                System.out.println("fizz");
            }
            else if(i%5==0){
                System.out.println("buzz");

            }
            else{
                System.out.println(i);
            }
        }
    }
}