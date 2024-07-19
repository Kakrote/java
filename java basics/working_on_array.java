/**
 * working_on_array
 */
import java.util.Scanner;
import java.util.*;
public class working_on_array {

    public static void main(String[] args) {
        //pratice q1

       /**  float marks[]={45.7f,45.36f,44.30f,50.55f,95.5f};
        float sum=0;
        for(float ele:marks){
            sum=sum+ele;
        }
        System.out.println(sum);*/
        
        // finding an given number is in given array or not

      /**   float marks[]={10.2f,65.5f,45.5f,75.36f,95.5f};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find in the given array");
        float num=sc.nextFloat();
        boolean fund=false;
        for(float ele:marks){
            if(num==ele){
                fund=true;
                break;
            }
        }
        if(fund){
            System.out.println("The number is found in the array");
        }
        else System.out.println("The number is not found in the given array");*/
        
        // Adding two matrix of 2x3:

        /**int mat1[][]={{10,20,30},{40,50,60}};
        int mat2[][]={{20,30,40},{50,60,70}};
        int result[][]={{0,0,0},
                        {0,0,0} };
        for(int i=0;i<mat1.length;i++){// for rows 
            for(int j=0;j<mat1[i].length;j++){//for colums

                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]+" ");// the extra space is given to create a space between the values
            }
        System.out.println("");// to sperate the tow rows
        }*/
        
        // to revers an array

        /**int marks[]={1,2,3,4,5,6};
        int l=marks.length;
        int a=Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<a;i++){
            // swap marks[i] and marks[l-1-i]
            temp=marks[i];
            marks[i]=marks[l-1-i];
            marks[l-1-i]=temp;
        }
        for(int element:marks){
            System.out.print(" "+element+" ");
        }*/

        // finding maximum number in array

        /**int marks[]={1,-2100,31,81,555};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int element:marks){
            if(element>max){
                max=element;
            }
            if(element<min){
                min=element;
            }
        }
        System.out.println("the maximum value is "+max+"\nthe minimum value is "+min);*/

        // shorting by the logig:

       /**  int arr[]={10,21,23,21,45,88,2,4,5};
        boolean is_short=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                is_short=false;     // This will tell the array is sorted or not
            
            }break;
        }
        if(is_short){
            System.out.println("The array is not shorted\nto short the array press y");
            Scanner sc=new Scanner(System.in);
            char option=sc.next().charAt(0);
            if(option=='y'||option=='Y'){
                Arrays.sort(arr);
            }

        }
        for(int element:arr){
            System.out.print(element+" ");
        }*/ 
        
    }
}