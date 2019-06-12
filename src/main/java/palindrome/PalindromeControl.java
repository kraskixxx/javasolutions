package palindrome;

/**
 * @author Samet BUDAK
 * @since
 */
public class PalindromeControl {

    public static void main(String[] args) {
        System.out.println("Is aaa palindrom?:" + isPalindrom("aaa"));
        System.out.println("Is abc palindrom?:" + isPalindrom("abc"));

        System.out.println("Is abba palindrom?:" + isPalindrom("abba"));
        System.out.println("Is defg palindrom?:" + isPalindrom("defg"));
    }

    /**
     * Java method to check if given String is Palindrome
     * @param text
     * @return true if text is palindrome, otherwise return false
     */
    public static boolean isPalindrom(String text) {
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
