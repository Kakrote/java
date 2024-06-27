public class Subseq {
    public static void main(String[] args) {
        subseq("abc", " ");
    }
    static void subseq(String str,String ans){// str is the original string and ans will contain the subseq of the original string.
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch=str.charAt(0);
        subseq(str.substring(1),ans+ch);// this will return the function with adding (left part of the tree)
        subseq(str.substring(1),ans);// this will return the function with ingoring (right part of the tree)
        // subseq(ans,str.substring(1));
    }
}
