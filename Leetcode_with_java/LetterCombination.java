import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    public static void main(String[] args) {
        System.out.println(phonList("", "92"));
    }
    static void phonePad(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+",");
            return;

        }

        int digit=up.charAt(0)-'0';// converting '2'into 2 charecter into integer value.
        int s=(digit-2)*3;// include this 
        int e=((digit-2)*3)+3;//exclude this

        if(digit==7){// becuse the 7 digit have 4 leeters bond to it pqrs 
            for(int i=s;i<=e;i++){
                char ch=(char)('a'+i);
                phonePad(p+ch, up.substring(1));
            }
        }
        else if (digit==8) {

            for(int i=s+1;i<=e;i++){
                char ch=(char)('a'+i);
                phonePad(p+ch, up.substring(1));
            }
            
        }
        else if(digit==9){
            for(int i=s+1;i<=e+1;i++){
                char ch=(char)('a'+i);
                phonePad(p+ch, up.substring(1));
            }
        }
        else{

            for(int i=s;i<e;i++){
    
                char ch=(char)('a'+i);
                phonePad(p+ch,up.substring(1));
                // phonePad(p, up.substring(1));
            }
        }


    }
    static List<String> phonList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        int digit=up.charAt(0)-'0';// converting '2'into 2 charecter into integer value.
        int s=(digit-2)*3;// include this 
        int e=((digit-2)*3)+3;//exclude this

        ArrayList<String> ans=new ArrayList<>();

        if(digit==7){// becuse the 7 digit have 4 leeters bond to it pqrs 
            for(int i=s;i<=e;i++){
                char ch=(char)('a'+i);
                ans.addAll(phonList(p+ch, up.substring(1)));
            }
        }
        else if (digit==8) {

            for(int i=s+1;i<=e;i++){
                char ch=(char)('a'+i);
                ans.addAll(phonList(p+ch, up.substring(1)));
            }
            
        }
        else if(digit==9){
            for(int i=s+1;i<=e+1;i++){
                char ch=(char)('a'+i);
                ans.addAll(phonList(p+ch, up.substring(1)));
            }
        }
        else{

            for(int i=s;i<e;i++){
    
                char ch=(char)('a'+i);
                ans.addAll(phonList(p+ch, up.substring(1)));
                // phonePad(p, up.substring(1));
            }
        }
        return ans;
        

    }

    public List<String> letterCombinations(String digits) {
        List<String> lis=solutionCombination("", digits);
        List<String>liss=new ArrayList<>();
        if(digits.isEmpty()){
            return liss;
        }
        return lis;
    }
    public ArrayList<String> solutionCombination(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int dig=up.charAt(0)-'0';
        int s=(dig-2)*3;// include this 
        int e=((dig-2)*3)+3;//exclude this

        
        ArrayList<String> list=new ArrayList<>();

        if(dig==7){// becuse the 7 digit have 4 leeters bond to it pqrs 
            for(int i=s;i<=e;i++){
                char ch=(char)('a'+i);
                list.addAll(solutionCombination(p+ch, up.substring(1)));
            }
        }
        else if (dig==8) {

            for(int i=s+1;i<=e;i++){
                char ch=(char)('a'+i);
                list.addAll(solutionCombination(p+ch, up.substring(1)));
            }
            
        }
        else if(dig==9){
            for(int i=s+1;i<=e+1;i++){
                char ch=(char)('a'+i);
                list.addAll(solutionCombination(p+ch, up.substring(1)));
            }
        }
        else{

            for(int i=s;i<e;i++){
    
                char ch=(char)('a'+i);
                list.addAll(solutionCombination(p+ch, up.substring(1)));
                // phonePad(p, up.substring(1));
            }
        }
        return list;
    }
}
