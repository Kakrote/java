import java.util.Scanner;
public class exercies5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the website:- ");
        String copname=sc.nextLine();
        if(copname.endsWith(".org")){System.out.println(copname+" is Organigation Website ");}
        else if(copname.endsWith(".in")){System.out.println(copname+" is Indian Website");}
        else if(copname.endsWith(".com")){System.out.println(copname+" is Commercial Website");}
        else {System.out.println(copname+" Does not exist");}
    }
}
