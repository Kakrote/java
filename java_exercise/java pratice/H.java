

public class H {
    public static void main(String[] args) {
        int ans=facto(3);
        System.out.println(ans);
    }
    public static int facto(int n){
        if(n==0){
            return 1;
        }
       return n*facto(n-1);
    }
}
