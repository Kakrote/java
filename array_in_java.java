import java.util.*;
public class array_in_java {
    public static void main(String[] args) {
        String marks[]=new String[2];
        marks[0]="Anshul";
        marks[1]="Neha";
        int index=Arrays.binarySearch(marks,"Neha");
        System.out.println("The index value for neha is "+index);
        marks[index]="Muskhan";
        System.out.println("The new vlaue for "+index+" is "+marks[index]);
        
        }
            
        }
