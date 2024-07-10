public class NKinghts {
    public static void main(String[] args) {
        int n=4;
        boolean[][] bord=new boolean[n][n];
        kinght(bord, 0, 0, n);
    }
    static void kinght(boolean[][] bord,int r,int c,int k){
        if(k==0){
            display(bord);
            System.out.println();
            return ;
        }
        if(r==bord.length-1 && c==bord.length-1){
            return ;
        }
        if(c==bord.length-1){
            kinght(bord, r+1, 0, k);
            return;
        }
        if(isSafe(bord,r,c)){
            bord[r][c]=true;
            kinght(bord, r, c+1, k-1);
            bord[r][c]=false;
        }
        kinght(bord, r, c+1, k); // this will skip the squre of its not safe for kinght to be put on


    }

    static boolean isSafe(boolean[][] bord,int r,int c){
        if(isValid(bord, r-2, c-1)){
            if(bord[r-2][c-1]){
                return false;
            }
        }
        if(isValid(bord, r-2, c+1)){
            if(bord[r-2][c+1]){
                return false;
            }
        }
        if(isValid(bord, r-1, c+2)){
            if(bord[r-1][c+2]){
                return false;
            }
        }
        if(isValid(bord, r-1, c-2)){
            if(bord[r-1][c-2]){
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] bord,int r,int c){
        if(r>=0 && r<bord.length && c>=0&&c<bord.length){
            return true;
        }
        return false;
    }

    static void display(boolean[][]bord){
        for(boolean[]r:bord){
            for(boolean eliment:r){
                if(eliment){
                    System.out.print(" K " );
                }
                else{
                    System.out.print(" 0 ");
                }

            }
            System.out.println();
        }
    }
}
