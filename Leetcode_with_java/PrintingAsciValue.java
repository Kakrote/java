import java.util.Arrays;

/**
 * PrintingAsciValue
 */
public class PrintingAsciValue {

    public static void main(String[] args) {
        // StringBuilder []s=new StringBuilder[255];
        char []c =new char[255];
        int [] arr=new int[255];
        for(int i=0;i<255;i++){
            arr[i]=i+1;
            c[i]=(char)arr[i];
            
        }
        // String s1=new String(c);
        for(int i=0;i<255;i++){
            System.out.print(""+c[i]);
        }


    }
}