import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[_a-z0-9]{6,}$");
        String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
        for (String s:
             validAccount) {
            Matcher matcher = pattern.matcher(s);
            System.out.println(matcher.matches());
        }
    }
}