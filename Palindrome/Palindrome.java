public class Palindrome {
    public static boolean isPalindrome(String s) {
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}