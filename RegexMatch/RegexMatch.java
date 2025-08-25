import java.util.regex.Pattern;

public class RegexMatch {
    public static boolean containsOnlyAlpha(String s) {
        return Pattern.matches("\\p{Alpha}+", s);
    }
    
    public static boolean startWithLetterAndEndWithNumber(String s) {
        // your code here
        return Pattern.matches("\\w.*\\d", s);
    }
    
    public static boolean containsAtLeast3SuccessiveA(String s) {
        return Pattern.matches(".*AAA.*", s);
    }
}