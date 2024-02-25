import java.io.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Welcome to the Anshul Book store:---");
        System.out.println("1-All Books available\t\t2-Add new book\n3-Remove a book\t\t\t\t4-Issue a book");
        System.out.println("Waiting for your input... ");
        int ch = sc.nextInt();
    //    File file = new File("books.txt");
//        file.createNewFile();
        switch (ch) {
            case 1:
                // Code to display all books
                show();
                break;
            case 2:
                addBook();
                break;
            case 3:
                // Code to remove a book
                remove();
                break; 
            case 4:
                // Code to issue a book
                break;
            default:
                System.out.println("You have entered the wrong option, sorry!");
        }
        sc.close(); // Close the Scanner object
    }

    public static void addBook() throws IOException {
        System.out.println("Enter the name of the book:");
        try (FileWriter fw = new FileWriter("books.txt",true)) {
            Scanner sc1=new Scanner(System.in);
            String book=sc1.nextLine();
            Calendar c=Calendar.getInstance();
            LocalDateTime t= LocalDateTime.now();
            DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-mm-yyyy h:m:s");
            String s=t.format(df);
            fw.write( book+ "\t->"+s+"\n");
        } catch (IOException e) {
            System.out.println("An error occurred while adding the book: " + e.getMessage());
        }
//        sc1.close();
    }
    public static void show(){
        try {
            File f=new File("books.txt");
            f.createNewFile();
            Scanner sc2=new Scanner(f);
            while (sc2.hasNextLine()){
                System.out.println(sc2.nextLine());
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void remove() throws IOException{
        File file=new File("books.txt");
        File temp=new File("temp.txt");
        BufferedReader reader=new BufferedReader(new FileReader(file));
        BufferedWriter writer=new BufferedWriter(new FileWriter(temp));
        boolean flag=false;
        String bname;
        Scanner so=new Scanner(System.in);
        System.out.println("Enter the name of the book: ");
        bname=so.nextLine();
        Scanner so1=new Scanner(file);
        while (so1.hasNextLine()) {
            if(so1.nextLine().contains(bname)){
                flag=true;
            }
        }
        if(flag){
            System.out.println(bname+"\tThe book is avilable in the liblary: ");
            String str;
            while (so1.hasNextLine()) {
                // str=so1.nextLine();
                writer.write(so1.nextLine()+"\n");
            }
            file.delete();
            temp.renameTo(file);
        }
        else{
            System.out.println("sorry the book is not avilable.");
        }

    }

}
