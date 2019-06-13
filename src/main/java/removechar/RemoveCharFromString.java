package removechar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Samet BUDAK
 * @since
 */
public class RemoveCharFromString {

    private static final Logger logger = LoggerFactory.getLogger(RemoveCharFromString.class);

    /**
     * Method for removing givcen character from a String
     * @param word
     * @param unWanted
     * @return
     */
    public static String remove(String word, char unWanted){
        StringBuilder sb = new StringBuilder();
        char[] letters = word.toCharArray();

        for (char c : letters){
            if(c != unWanted){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
