// to convert the latters after space into Capital latters

public class Pratice2 {
    public static void main(String[] args) {
        String str="Anshul is the good boy and also he is very inteligent.";
        char val[]=str.toCharArray();
        int len=str.length();
        for(int i=0;i<len;i++){
            // System.out.println(val[i]);
            if(str.charAt(i)==' '){
                val[i+1]=str.toUpperCase().charAt(i+1);
            }
        }
        val.toString();
        System.out.println(val);
    }
}