// package Leetcode_with_java;

// celling of a number means if the target element is not in the array then find the nearest greater number in the array.
public class celling_number {

    public static void main(String[] args) {
        int [] arr={2,3,4,9,14,16,18};
        int target=16;
        int a=celling(arr, target);
        System.out.println(a);

    }
    public static int celling(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while (start<=end) {
            if(target==arr[mid]){
                return mid;
            }            
            else if(target<arr[mid]){
                end=mid;

            }
            else if (target>arr[mid]){
                start=mid;
            }
        }
        return -1;

    }
}