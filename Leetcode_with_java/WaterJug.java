public class WaterJug {
    public static void main(String[] args) {
        
    }
    // to check if the jugs can fill the target is to check the hcf of the x and y
    public boolean canMeasureWater(int x, int y, int target) {
        int h = gcf(x, y);
        // case 1 when x=1 and y=1 and target =1 as (0,1) true 
        if(x==y && y==target){
            return true;
        }
        // case 2 when x=1 y=1 and target =5 there is no possible way to fill the target 
        if(x==y){
            return false;
        }
        // case 3 this is the standard case for the rest 
        if(x!=y && target%h==0){
            return true;
        }
        return false;
      
    }
    public int gcf(int x,int y){
        while(y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return x;
    }
}
