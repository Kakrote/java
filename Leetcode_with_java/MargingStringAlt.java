public class MargingStringAlt {

    public static void main(String[] args) {
        MargingStringAlt obj=new MargingStringAlt();
        System.out.println(obj.mergeAlternately("ab", "pqr"));
    }
    public String mergeAlternately(String word1, String word2) {
           int i=0;
           int j=0;
           StringBuilder merged=new StringBuilder();
           while(i<word1.length()||j<word2.length()){
            if(i<word1.length()){
                merged.append(word1.charAt(i));
                i++;
            }
            if(j<word2.length()){
                merged.append(word2.charAt(j));
                j++;
            }
           }
           return merged.toString();
    }
}
