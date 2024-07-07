import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MazeProblems {
    public static void main(String[] args) {
        // System.out.println(countWays(3, 3));
        // paths("",3,3);
        // System.out.println(pathsList("", 3, 3));
        boolean bord [][]={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        pathsObsticals("", bord, 0, 0);// passing the starting index 
        
    }
    static int countWays(int r,int c){
        if(r==1 || c==1){
            return 1;

        }
        int down=countWays(r-1, c);
        int right=countWays(r, c-1);

        return down+right;
    }
    static void paths(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            paths(p+'D', r-1, c);
        }
        if(c>1){
            paths(p+'R', r, c-1);
        }
    }
    static List<String> pathsList(String p,int r,int c){
        if(r==1&&c==1){
            ArrayList<String>ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<String> down=new ArrayList<>();
        List<String> right=new ArrayList<>();
        if(r>1){
            down=pathsList(p+'D', r-1, c);

        }
        if(c>1){
            right=pathsList(p+'R', r, c-1);
        }
        down.addAll(right);
        return down;
    }

    static void pathsObsticals(String p,boolean [][]maze,int r,int c){
        if(r==maze.length-1&&c==maze[0].length-1){//maze.lenght will give the rows and the maze[0].length will give the column length 
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false){ // will check for the obsticals in the matrix 
            return;
        }
        if(r<maze.length-1){
            pathsObsticals(p+'D',maze, r+1, c);
        }
        if(c<maze[0].length-1){
            pathsObsticals(p+'R',maze, r, c+1);
        }
    }
}
