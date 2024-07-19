// Programe to convert a low grade to a high grade
public class CL06_type_casting {
    public static void main(String[] args) {
        char grade='E';
       // grade=grade-4; this will give an error as grade os char type and 4 is int
       // to solve this error we use type casting
       grade=(char)(grade-4); // this will give the result A 
        System.out.println(grade);
    }
}
