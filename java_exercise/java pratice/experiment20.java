// package java pratice;

public class experiment20 {
    public static void main(String[] args) {
        int[][]bord={
            {1,2,3,4},
            {5,6,7,8},
            {10,34,22,3}
        };
        System.out.println(bord.length);
        for(int[]num:bord){
            for(int i=0;i<num.length;i++){
                System.out.println(num[i]);
            }
        }

    }
}
