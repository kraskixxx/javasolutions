package palindrome;

import stringoperations.FirstNonRepeated;

/**
 * @author Samet BUDAK
 * @since
 */
public class MainClass {

    public static void main(String[] args) {
        Character character = FirstNonRepeated.firstNonRepeatedCharacter("wvfkjhdnsömcvfhdskljfhnewdvckj dnsvlıb nre");
        System.out.println("Tekrar Etmeyen ilk karakter : " + character);
    }
}
