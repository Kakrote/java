public class ReversingString {
    public static void main(String[] args) {
        String str="Anshul";
        System.out.println("Orignal String is ");
        System.out.println(str);
        int l=str.length();
        System.out.println("String after reversing:-");
        for(int i=l-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println(" ");
    }
}
