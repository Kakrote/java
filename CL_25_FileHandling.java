import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class CL_25_FileHandling {
    public static void main(String[] args) throws IOException {
        //code to create a file:
        /*File f=new File("first.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
        //code to writte in a file.
        FileWriter f1=new FileWriter("first.txt");
        f1.write("This is the first my first file and i create it by using java heheheh|\n hello Anshul how are you");
        f1.close();

        // reading a file 

        File f3=new File("first.txt");
        try{
            Scanner sc=new Scanner(f3);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());

            }
            sc.close();

        }
        catch(Exception e){
            System.out.println("Can't find the file");
            e.printStackTrace();
        }
         */
        //deleting a file
        File f4=new File("first.txt");
        if(f4.delete()){
            System.out.println("the file has been deleted");
        }
        else{
            System.out.println("The file is not deleted sorry!");
        }

    }
}
