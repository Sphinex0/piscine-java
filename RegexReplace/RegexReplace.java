import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplace {
    public static String removeUnits(String s) {
        // your code here
        Pattern pattern = Pattern.compile("cm|€");
        Matcher matches = pattern.matcher(s).replaceAll("s");
        return ; 
    }
    
    public static String obfuscateEmail(String s) {
        // your code here
    }
}