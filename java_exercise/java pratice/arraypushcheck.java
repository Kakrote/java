// package java pratice;

public class arraypushcheck {
    public static void main(String[] args) {
        int[]arr=new int[3];
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        int[]temp=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        temp[3]=2;
        arr=temp;
    }
}
