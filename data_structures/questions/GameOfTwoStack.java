package questions;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GameOfTwoStack {

    static int twoStack(int maxSum,List<Integer>a,List<Integer>b){
        return twoStack(maxSum, a, b,0,0)-1;
    }
    private static int twoStack(int maxSum,List<Integer>a,List<Integer>b,int sum,int steps){
        if(sum>maxSum){
            return steps;
        }
        if(a.isEmpty() || b.isEmpty()){
            return steps;
        }

        int left=twoStack(maxSum, a.subList(1, a.size()), b,a.get(0)+sum,steps+1);
        int right=twoStack(maxSum, a, b.subList(1, b.size()),b.get(0)+sum,steps+1);

        return Math.max(left, right);

    }

    public static void main(String[] args) {
        Integer[] arr1={4,2,4,6,1};
        Integer[] arr2={2,1,8,5};
        List<Integer> a=new ArrayList<>(Arrays.asList(arr1));
        List<Integer> b=new ArrayList<>(Arrays.asList(arr2));
        int ans=twoStack(62, a, b);
        System.out.println(ans);
    }
    
}
