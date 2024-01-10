import java.util.Scanner;

class Liblary {
    String new_book;
    Scanner sc = new Scanner(System.in);
    String books[] = new String[100];
    int no_of_books = 0;
    void add_Book() {
        System.out.print("Enter the name of the book:- ");
        new_book = sc.nextLine();
        for (int i = 0; i <= no_of_books; i++) {
            if (books[i] == new_book) {
                System.out.println("Book already present");
                break;
            } 
        }
        no_of_books+=1;
        books[no_of_books]=new_book;
    }
    void issu(){
        String issu_book;
        Scanner s2=new Scanner(System.in);
        System.out.print("Enter the book:- ");
        issu_book=s2.nextLine();
        for(int i=0;i<no_of_books;i++){
            if(books[i]==issu_book){
                System.out.println("The book as been issued.");
                books[i]=null;
                return;
            }
        }
    }
    void display() {
        System.out.println("the avilable books are:");
        for(int i=1;i<=no_of_books;i++){
            System.out.println(i+":- "+books[i]);
        }
    }
}

/**
 * Online_Lib
 */
public class Online_Lib {

    public static void main(String[] args) {
        int op;
        Liblary l=new Liblary();
        Scanner s = new Scanner(System.in);
        while (true) {

            System.out.println("1-Issu books\n2-Return books\n3-Add new book\n4-Display avilable books\n5-Exit.");
            op = s.nextInt();
            switch (op) {
                case 1 -> {
                    l.issu();
                }
                case 2 -> {

                }
                case 3 -> {
                    l.add_Book();
                }
                case 4 -> {
                    l.display();
                }
                case 5 -> {
                    System.exit(0);
                }
            }

        }
    }
}