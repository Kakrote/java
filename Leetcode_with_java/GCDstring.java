public class GCDstring {
    public static void main(String[] args) {
        GCDstring obj = new GCDstring();
        String ans = obj.gcdOfStrings("apple", "appleappleapple");
        System.out.println(ans);
    }

    public String gcdOfStrings(String str1, String str2) {
        // Use .equals() to compare the content of the strings
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
