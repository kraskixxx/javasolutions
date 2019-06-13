package palindrome;

/**
 * @author Samet BUDAK
 * @since
 */
public class PalindromeCharArray {

    public static boolean isPalindrome(String text) {
        int length = text.length();
        char[] charArray = text.toCharArray();
        for (int i = 0; i < length/2; i++) {
            if(charArray[i] != charArray[length-1-i]){
                return false;
            }
        }
        return true;
    }
}
