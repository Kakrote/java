// package java;

import java.util.Scanner;

/**
 * CustomException
 */
class Mycustom extends Exception{
    public Mycustom(int r){
        if(r<0){
            System.out.println("The area cant be negative ");
        }
    }
}
class area {
    public void area_calculater(int r) throws Mycustom{// to indicate that this function could throw an exception;
        if(r<0){
            throw new Mycustom(r);
        }
        double ar=Math.PI*r*r;
        System.out.println(ar);
    }
}
 public class CustomException {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        area a=new area();
        try{

            a.area_calculater(r);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("the program has been ended thankyou for using our program");
        
    }
}