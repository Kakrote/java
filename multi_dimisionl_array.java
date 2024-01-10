import java.util.*;
public class multi_dimisionl_array {
    public static void main(String[] args) {
        //multidiminosnal array;
        //2-D array;
        int flats[][]= new int[2][3];// two rows and 3 colums;
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        System.out.println("lenth of the array flats is "+flats.length);
        for(int i=0;i<flats.length;i++){
           // System.out.println("flats[i].length= "+flats[i].length);
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");

            }
            System.out.println("");
        }

    }
}
