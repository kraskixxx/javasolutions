package palindrome;

/**
 * @author Samet BUDAK
 * @since
 */
public class PalindromeControlWithStringBuffer {

    public static boolean isPalindrome(String text){
        return text.equals(new StringBuilder(text).reverse().toString());
    }
}
