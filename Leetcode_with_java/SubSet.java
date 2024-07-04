import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr2[]={1,2,3};
        // List<List<Integer>> ans=subset(arr);
        List<List<Integer>> ans=subsetDublicate(arr2);
        for(List<Integer> list:ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subset(int[] arr){ // creating a list of list type which will be of Integer type.
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());// at the begning it will have an empty list [[]] like this.

        for(int num:arr){
            int size=outer.size(); // the outer list will contain all the lists[[]],[[1],[]],[[],[1],[2],[1,2]]....
            for(int i=0;i<size;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));// this is sort way to create the copy of the inner list to the outer list
                internal.add(num);// adding every number in the outer list to the inner list new one 
                outer.add(internal);// adding every inner list to the outer list and moving to the next step.


            }
        }
        return outer;
    }
    static List<List<Integer>> subsetDublicate(int[] arr){ // creating a list of list type which will be of Integer type.
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());// at the begning it will have an empty list [[]] like this.

        int start=0;
        int end =0;

        for(int n=0;n<arr.length;n++){
            start=0;
            // if current == privious start=end+1
            if(n>0 && arr[n]==arr[n-1]){

                start=end+1;

            }
            end=outer.size()-1;
            int size=outer.size(); // the outer list will contain all the lists[[]],[[1],[]],[[],[1],[2],[1,2]]....
            for(int i=start;i<size;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));// this is sort way to create the copy of the inner list to the outer list
                internal.add(arr[n]);// adding every number in the outer list to the inner list new one 
                outer.add(internal);// adding every inner list to the outer list and moving to the next step.


            }
        }
        return outer;
    }
}
