package palindrome;

/**
 * @author Samet BUDAK
 * @since
 */
public class PalindromeControl {

    public static void main(String[] args) {
        System.out.println("Is aaa palindrome ?:" + isPalindrome("aaa"));
        System.out.println("Is abc palindrome ?:" + isPalindrome("abc"));

        System.out.println("Is abba palindrome ?:" + isPalindrome("abba"));
        System.out.println("Is defg palindrome ?:" + isPalindrome("defg"));
        
        System.out.println("\nIs aaa palindrome ?: " + PalindromeControlWithStringBuffer.isPalindrome("aaa"));
        System.out.println("Is abc palindrome ?: " + PalindromeControlWithStringBuffer.isPalindrome("abc"));

        System.out.println("Is abba palindrome ?:" + PalindromeControlWithStringBuffer.isPalindrome("abba"));
        System.out.println("Is defg palindrome ?:" + PalindromeControlWithStringBuffer.isPalindrome("defg"));

        System.out.println("\nIs aaa palindrome ?:" + PalindromeCharArray.isPalindrome("aaa"));
        System.out.println("Is abc palindrome ?:" + PalindromeCharArray.isPalindrome("abc"));

        System.out.println("Is abba palindrome ?:" + PalindromeCharArray.isPalindrome("abba"));
        System.out.println("Is defg palindrome ?:" + PalindromeCharArray.isPalindrome("defg"));
    }

    /**
     * Java method to check if given String is Palindrome
     * @param text
     * @return true if text is palindrome, otherwise return false
     */
    public static boolean isPalindrome(String text) {
        String reverse = reverse(text);
        if(text.equals(reverse)){
            return true;
        }
        return false;
    }

    /**
     * Java method to reverse String using recursion
     * @param text
     * @return reversed String of text
     */
    private static String reverse(String text) {
        if(text == null || text.isEmpty()){
            return text;
        }
        return text.charAt(text.length()-1) + reverse(text.substring(0,text.length()-1));
    }
}
