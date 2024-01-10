public class some_methods {
    static int sum(int x, int y){// this will chage the value of a,b
        int z;
        if(x>y){
            z=x+y;
         }
         else{z=y-x;}
         System.out.println(z);
         return z; // this return function will return the value of z to c and then c will have the value of z
    }
    public static void main(String[] args) {
        /**methods in java
         * we create method so we dont have to write same logic every time we need same logic
         * to solve this we use methods 
         * methods are nothing but a funtion which is use several time
        */
        int a,b,c;
        a=70;
        b=30;
        c=sum(a,b); // this value will diliver to the function we have created
    }
}
