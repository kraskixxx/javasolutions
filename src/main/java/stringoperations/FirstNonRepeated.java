package stringoperations;

import java.util.HashMap;

/**
 * @author Samet BUDAK
 * @since
 */
public class FirstNonRepeated {

    /**
     * Find The First Non Repeated Character In A String 
     * @param input
     * @return
     */
    public static Character firstNonRepeatedCharacter(String input) {
        HashMap<Character,Integer> characterHashTable = new HashMap<Character, Integer>();
        int i,length;
        Character character;
        length = input.length();
        for (i = 0; i<length; i++) {
            character = input.charAt(i);
            if(characterHashTable.containsKey(character)){
                characterHashTable.put(character, characterHashTable.get(character)+1);
            } else {
                characterHashTable.put(character, 1);
            }
        }

        for (i = 0; i<length; i++) {
            character = input.charAt(i);
            if(characterHashTable.get(character) == 1){
                return character;
            }
        }
        return null;
    }
}
