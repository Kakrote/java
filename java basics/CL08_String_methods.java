public class CL08_String_methods {
    public static void main(String[] args) {
        // Now in cl07 we lewarn about few concept of string like how to write and print a string
        // In this cl08 we will we learning more about string methods
        // Lest's start with the .lenth()
        String name="Anshul";// alway rember the string strat with 0 not from 1
        int value=name.length();
        System.out.println(name+" the lenth of your string is  "+ value);// this will print 6 as the length of the string
        // Now lets .toLowerCase() methord:- note:- toLowerCase is written in camel case
        String name1=name.toLowerCase();
        System.out.println(name1);// This will convert the letters in lower case which wher in upper case before
        // Simelerly toUpperCase also work
        // Now let's see another method called .trim()
        String str="   Anshul is the best boy   ";
        System.out.println("Normarly this would have printed as it is written ");
        System.out.println(str);
        String strtrim=str.trim();// this will trim the space before Anshul and space after boy
        System.out.println("After trime method it will print without space ");
        System.out.println(strtrim);
        System.out.println("clearly the diffrence could be seen in the intial and the final project ");
        //Now let see the another method .substring(int)
        String str1=name.substring(3);
        System.out.println(str1);// This will print the string from index value 3
        // This method also use a end value upto which it has to print
        System.out.println(name.substring(3,5));//This will start printing value from infeex value 3 to index value 5 only
        //Now the next method we will learn about is .replace(a,b) whear a and b are char and a will be replace by b
        String str2=name.replace('A','B');
        System.out.println(str2);// this will print Banshul insted of Anshul as A is replaced by B 
        // There is one more way to use replace() method
        System.out.println(name.replace("Ans", "Bil"));// this will replace Ans to Bil
    }
}
