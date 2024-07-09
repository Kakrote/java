public class NQueens {
    public static void main(String[] args) {
        int n=4;
        boolean [][]bord=new boolean[n][n];
        System.out.println( queens(bord, 0));
    }
    static int queens(boolean [][]bord,int r){

        if(r==bord.length){
            display(bord);
            System.out.println();
            return 1;
        }
        int count=0;
        // placing the queen in the bord
        for(int c=0;c<bord.length;c++){
            if(isSafe(bord,r,c)){
                bord[r][c]=true;
                count+=queens(bord, r+1);
                bord[r][c]=false;
            }
        }
        return count;

    }
    static boolean isSafe (boolean[][]bord,int r,int c){
        // checking vertical in the row
        for(int i=0;i<r;i++){
            if(bord[i][c]){// meaing if there is a queen already
                return false;
            }
        }
        // checking diognaly left in the bord
        int maxLeft=Math.min(r,c);
        for(int i=1;i<=maxLeft;i++){
            if(bord[r-i][c-i]){
                return false;
            }
        }
        // checking diognal right in the bord
        int maxRight=Math.min(r,bord.length-c-1);
        for(int i=1;i<=maxRight;i++){
            if(bord[r-i][c+i]){
                return false;
            }
        }
        return true;
    }


    static void display(boolean [][] bord){
        for(boolean[]r : bord){
            for(boolean eliment:r){
                if(eliment){
                    System.out.print("Q"+" ");
                }
                else{
                    System.out.print("X"+" ");
                }
            }
            System.out.println();
        }
    }
}
