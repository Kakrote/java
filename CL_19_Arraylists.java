import java.util.*;
public class CL_19_Arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();//This is the genreric syntex;
        ArrayList<Integer> l2=new ArrayList<>();//This is the genreric syntex;
        l2.add(10);
        l2.add(11);
        l2.add(12);

        l1.add(5);
        l1.add(4);
        l1.add(3);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println("The items are add and displayed as");
        l1.add(1,6);
        l1.add(1,7);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println("After using addall method we can actully add all the elements of an array to another array from the las");
        // adding the elements of l2 in l1;
        l1.addAll(l2);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

    }
}
// there are similerarly many other methods in ArrayList class which could be access through the the documantation in oracal.