import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumberOfMatchingSubSeq {
    public static void main(String[] args) {
        NumberOfMatchingSubSeq obj=new NumberOfMatchingSubSeq();
        String s="dsahjpjauf";
        String[]words={"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"};
        int sol=obj.numMatchingSubseq(s,words);
        System.out.println(sol);
    }
    public int numMatchingSubseq(String s, String[] words) {
        int count=0;
        List sq=subseq("", s);
        System.out.println(sq);
        for(int i=0;i<words.length;i++){
            for(int j=0;j<sq.size();j++){
                if(words[i].equals(sq.get(j))){
                    count++;
                }
            }
        }
        return count;
    }
    public ArrayList<String> subseq(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char ch=up.charAt(0);
        ArrayList<String>left=subseq(p+ch, up.substring(1));
        ArrayList<String>right=subseq(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
