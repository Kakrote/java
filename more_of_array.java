import java.util.*;
public class more_of_array {
    public static void main(String[] args) {
        String name[]=new String[2];
        name[0]="anshul";
        name[1]="mandeep";
        String name2[]=new String[2];
        name2[0]="nikhil";
        name2[1]="sakshi";
        // here are some array methods 
        // 1:- equal()              to check if two arrays are equal or not
        if(Arrays.equals(name,name2)){
            System.out.println("match");
        }
        else System.out.println("not match");
        // 2:- fill()               to fill an array with the value
        int m_numbers[]=new int[4];// difene the lenth of an array
        Arrays.fill(m_numbers,1);// (array,value you wnat to give an array)
        for(int i=0;i<=m_numbers.length;++i){
            System.out.println(m_numbers[i]);
        }
        // 3:- sort()             // it sort the elements of an array
        String s[]=new String[2];
        s[0]="herro";
        s[1]="zero";
        Arrays.sort(s);
        for(int r=0;r<=2;r++){
            System.out.println(s[r]);
        }
        // 4:- binarysearch()
        int index=Arrays.binarySearch(s,"hero");
        System.out.println("anshhul's index value is "+ index);

    }
}
