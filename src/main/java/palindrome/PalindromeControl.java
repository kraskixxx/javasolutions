package palindrome;

/**
 * @author Samet BUDAK
 * @since
 */
public class PalindromeControl {

    public static void main(String[] args) {
        System.out.println("Is aaa palindrom?:" + isPalindrome("aaa"));
        System.out.println("Is abc palindrom?:" + isPalindrome("abc"));

        System.out.println("Is abba palindrom?:" + isPalindrome("abba"));
        System.out.println("Is defg palindrom?:" + isPalindrome("defg"));



        System.out.println("Is aaa palindrom?:" + PalindromeControlWithStringBuffer.isPalindrome("aaa"));
        System.out.println("Is abc palindrom?:" + PalindromeControlWithStringBuffer.isPalindrome("abc"));

        System.out.println("Is abba palindrom?:" + PalindromeControlWithStringBuffer.isPalindrome("abba"));
        System.out.println("Is defg palindrom?:" + PalindromeControlWithStringBuffer.isPalindrome("defg"));
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
