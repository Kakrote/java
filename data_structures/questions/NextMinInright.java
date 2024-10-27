package questions;

import java.util.Arrays;

public class NextMinInright {

    public static int [] nextMiniInRight(int []arr){
        int []ans=new int[arr.length];
        int [] stack=new int[arr.length];
        int j=0;
        stack[0]=-1;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            while(j>0&&curr<=stack[j]){
                j--;
                if(j>0){

                    stack[j]=curr;
                }
            }
            j++;
            ans[i]=stack[j-1];
            stack[j]=curr;
        }
        return ans;

    }

    public static void main(String[] args) {
        int []ques={2,3,1,4};
        System.out.println(Arrays.toString(nextMiniInRight(ques)));
    }
}