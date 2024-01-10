import java.util.Random;
import java.util.Scanner;

/**
 * Game
 */
public class Game {
    static int rounds=3;
    static int p1_sor=0,p2_sor=0;
    static void dicision_panal(char p1,String p2){
        if(p1=='s'||p1=='S'&&p2=="Paper") {
            System.out.println(p2);
            p2_sor++;}
        else if(p1=='s'||p1=='S'&&p2=="Cessers") {
            System.out.println(p2);
            p1_sor++;}
        else if(p1=='c'||p1=='C'&&p2=="Paper") {    
            System.out.println(p2);
            p1_sor++;}
        else if(p1=='p'||p1=='P'&&p2=="Stone") {        
            System.out.println(p2);
            p1_sor++;}
        else if(p1=='c'||p1=='C'&&p2=="Stone") {
            System.out.println(p2);        
            p2_sor++;}
        else if(p1=='p'||p1=='P'&&p2=="Cessers") {
            System.out.println(p2);
            p2_sor++;}
        else {
            p1_sor++;
            p2_sor++;
        }
    }
    static String result(int p1_sor,int p2_sor){
        if(p1_sor>p2_sor) return "Player 1 is winner";
        else if(p1_sor<p2_sor) return "Player 2 is winner";
        else return "Game is drow";
    }
    static void play(){
        Scanner s1=new Scanner(System.in);
        String option[]={"Stone","Paper","Cessers"};
        System.out.println("S-stone\nP-paper\nC-cessers");
        for(int i=0;i<rounds;i++){
            System.out.println("\t--Round "+(i+1));
            char p1=s1.next().charAt(0);
            Random r=new Random();
            int index=r.nextInt(option.length);
            String p2=option[index];
            dicision_panal(p1, p2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("\t----Welcome to the Game----");
        System.out.println("1-New Game\n2-Exit");
        while(true){
            ch=sc.nextInt();
            switch(ch){
                case 1->{
                    play();
                    System.out.println("player 1 scour is "+p1_sor+"\tplayer 2 scour is "+p2_sor);
                    System.out.println(result(p1_sor, p2_sor));
                } 
                case 2-> System.exit(0);
            }
            
        }
    }
}