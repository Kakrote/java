public class Removing_Duplicate_From_String {

    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        removeDuplicate("aabcc", ans, 0, new boolean[256]);
        System.out.println(ans);
    }

    public static void removeDuplicate(String str, StringBuilder ans, int i, boolean[] seen) {
        if (i == str.length()) {
            return;
        }

        char currentChar = str.charAt(i);

        if (!seen[currentChar]) {
            ans.append(currentChar);
            seen[currentChar] = true;
        }

        removeDuplicate(str, ans, i + 1, seen);
    }
}
