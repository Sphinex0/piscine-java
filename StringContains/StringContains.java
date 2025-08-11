public class StringContains {
    public static boolean isStringContainedIn(String subString, String s) {
        return s == null ? false : s.contains(subString == null ? "" : subString);
    }
}