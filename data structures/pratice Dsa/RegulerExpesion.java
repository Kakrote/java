import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulerExpesion {
    public static void main(String[] args) {
        String reg = "Anshul pundir";
        String[] str = {
            "Anshul",
            "pundir",
            "Anshul pundir"
        };

        Pattern patt = Pattern.compile(reg);
        for (String s : str) {
            Matcher match = patt.matcher(s); // Use matcher() method, not match()
            if (match.find()) {
                System.out.println("Found in: " + s);
            } else {
                System.out.println("Not found: " + s);
            }
        }
    }
}
