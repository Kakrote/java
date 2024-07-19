/**Method  overlording meaing
 * two or more methods having same name but diffrent function;
 */
public class method_overlording {
    static void joke(){
        // this is a user difine method of string type
        // this is of a static type which means we don't have to create any objects to acess this method
        System.out.println("No joke for you mother fucker");
    }
    static void joke(int a){// this funtion have same name but this function takes parameter
        System.out.println("mother fuker "+a);
    }
    public static void main(String[] args) {
      //  joke();// we dont need to create any object for calling the function joke() because it is written in static keyword
        int a=50;
        joke(a);// this have same name but givs argument
        
    }}