/**
 * pratice11
 */
public class pratice11 {

    public static void main(String[] args) {
        String sr[]={"anshul"};
        int l=sr.length;
        String temp;
        int m=sr[0].length();
        for(int i=0;i<l;i++){
            for(int j=0;j<sr[i].length();j++){
                temp=sr[j];
                sr[j]=sr[m-1-j];
                sr[m-1-j]=temp;
            }
        }
    for(String element:sr){
        System.out.print(element+" ");
    }
}}