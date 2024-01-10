//preper the game of stone paper secessers
/**
 * practice9
 */
import java.util.Scanner;
 public class practice9 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the game:-\nTo continue press Y");
        int i=1;
        char c=sc.next().charAt(0);
        if (c=='y'||c=='Y'){while (i<=3) {
            System.out.println("Round"+i);
            System.out.println("s-Stone\np-Paper\nc-Sicssers\nenter player 1");
            char p_1=sc.next().charAt(0);
            System.out.println("enter player 2");
            char p_2=sc.next().charAt(0);
            if(p_1==p_2){System.out.println("Drow");}
            else if (p_1=='s'||p_1=='S'&&p_2=='p'||p_2=='P'){System.out.println("player 1 is the winner");}
            else if (p_1=='s'||p_1=='S'&&p_2=='c'||p_2=='C'){System.err.println("player 1 is the winner");}
            else if (p_1=='c'||p_1=='C'&&p_2=='p'||p_2=='P'){System.out.println("player 1 is the winner");}
            else if (p_1=='c'||p_1=='C'&&p_2=='s'||p_2=='S'){System.out.println("player 2 is the winner");}
            else if (p_1=='p'||p_1=='P'&&p_2=='S'||p_2=='s'){System.out.println("player 2 is the winner");}
            else if (p_1=='p'||p_1=='P'&&p_2=='s'||p_2=='s'){System.out.println("player 2 is the winner");}
            else System.out.println("wrong input");
            i++;
        }}
        else {System.out.println("Thankyou for visiting");}
        
    }
}// This code has many bugs 
// keep in mind to fix those bugs okay: