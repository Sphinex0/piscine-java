public class Palindrome {
    public static boolean isPalindrome(String s) {
        return s == null ? false : s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}