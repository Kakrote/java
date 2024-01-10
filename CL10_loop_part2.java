/** This is the class for do while loop
 * and it will clear the diffrence between while and do while loop 
 * so read the code clearfully  
 */
import java.util.Scanner;
public class CL10_loop_part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        do{System.out.printf(n+"-Code  has run %d time\n",n);
           n++;
    }
        while(n<6);
    }
}
// The main diffrence in While and do while loop is 
// In while loop it will first check the condition and the exicute the code
// On other hand in do while loop it first excute the code and the check the condition
// So in while loop code will exicute only if the condition gets true  but in do while loop code will get excute at least onces even if the condition is false
