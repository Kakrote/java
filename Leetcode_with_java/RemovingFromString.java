public class RemovingFromString {
    public static void main(String[] args) {
        String str="aabbapplasssappleaaa";
        StringBuilder ans=new StringBuilder();
        // System.out.println(removed(str, 0, ans));
        System.out.println(removingAppNotApple(str));
    }
    static StringBuilder removed(String str,int i,StringBuilder ans){
        if(i==str.length()){
            return ans;
        }
        if(str.charAt(i)!='a'&&str.charAt(i)!='A'){
            ans.append(str.charAt(i));
            
        }
        return removed(str, i+1, ans);
        // return ans;

    }
    static String removingApple(String str){
        // this approch we are not passing the ans in argument but makeing it inside the body of the function.
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return removingApple(str.substring(5));
        }
        else{
            return str.charAt(0)+removingApple(str.substring(1));
        }
    }


    static String removingAppNotApple(String str){
        // This unction will remove app not apple if a string has apple it wont remove any thing but if it has appl it will remove app from it
        // this approch we are not passing the ans in argument but makeing it inside the body of the function.
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app")&&!str.startsWith("apple")){// this is to remove a app only if its not apple 
            return removingAppNotApple(str.substring(3));
        }
        else{
            return str.charAt(0)+removingAppNotApple(str.substring(1));
        }
    }
}

