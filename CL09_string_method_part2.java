public class CL09_string_method_part2 {
    public static void main(String[] args) {
        // hear we will disscus more methods related to string
        //.Startwith()- this method return the bullean 
        String name="Anshul";
        System.out.println(name.startsWith("A"));// this will give you true as answer
        //.endswith(char)- is similer as .startswith(char)
        //.charAt(int)- this will print the value the at the given index number
        System.out.println(name.charAt(4));
        // .indexOf(chr):- will tell you the index value of the given string
        System.out.println(name.indexOf('A'));// this indexOf only return only 1st index value
        //Same thing is also be used as
        String name1="Annshhnnsj";
        System.out.println(name1.indexOf("nns", 5));//this will print the index of nns but start it search from index value 5
        // .lastindexof(int) is same it delivers the value from last only
        // .equal(str) :- this will cheak whether the string is equal or not and it will return either true or false
        System.out.println(name.equals("Anshul"));
        // note this equal method is case sensitive hence it will return false if the cases of the string doest matches
        // to over come this problem we have another method called .equalIgnoeCase()
        System.out.println(name.equalsIgnoreCase("anshul"));//this will ingnore the case
        String s="Anshul is a good boy and he will love his girlfrind with his heart \n only if he has a girfriend";
        System.out.println(s);
    }
}
