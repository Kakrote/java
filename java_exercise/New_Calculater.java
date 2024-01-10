import java.util.Scanner;

class CustomExceptions extends Exception{
    public CustomExceptions(){
        System.out.println("This is a illegal statement");
    }
}
class calculater{
    public double add(double a,double b, char op) throws CustomExceptions{
        if(a==8||b==9){
            throw new CustomExceptions();
        }
        return a+b;
    }
    public double subtract(double a,double b, char op) throws CustomExceptions{
        if(op!='-'){
            throw new CustomExceptions();
        }
        return a-b;
    }
    public double multiply(double a,double b, char op) throws CustomExceptions{
        if(op!='*'){
            throw new CustomExceptions();
        }
        return a*b;
    }
    public double divides(double a,double b, char op) throws CustomExceptions,ArithmeticException{
        if(op!='/'){
            throw new CustomExceptions();
        }
        return a/b;
    }
}
public class New_Calculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        calculater cal=new calculater();
        while (true) {
            System.out.println("Enter the numbers:-");
            double a=sc.nextInt();
            char op=sc.next().charAt(0);
            double b=sc.nextInt();
            double rsult;
            switch(op){
                case '+'->{
                    try{
                        
                        rsult= cal.add(a, b, op);
                        System.out.println(rsult);
                        break;
                    }
                    catch(Exception e){
                        System.out.println(e.toString());
                        break;
                    }
                }
                case '-'->{
                    try{
                        
                        rsult=cal.subtract(a, b, op);
                        System.out.println(rsult);
                        break;
                    }
                    catch(Exception e){
                        System.out.println(e);
                        break;
                    }
                }
                case '*'->{
                    try{

                        rsult=cal.multiply(a, b, op);
                        System.out.println(rsult);
                        break;
                    }
                    catch(Exception e){
                        System.out.println(e);
                        break;
                    }
                }
                case '/'->{
                    try{

                        rsult=cal.divides(a, b, op);
                        System.out.println(rsult);
                        break;
                    }
                    catch(Exception e){
                        System.out.println(e);
                        break;
                    }
                }
            }
            
        }
    }
}