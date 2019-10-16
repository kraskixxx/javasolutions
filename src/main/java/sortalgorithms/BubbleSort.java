package sortalgorithms;

/**
 * @author Samet BUDAK
 * @since
 */
public class BubbleSort {

    public static void sort(int[] input) {
        int inputLength = input.length;
        int temp;
        boolean isSorted;
        for (int i = 0; i < input.length; i++) {
            isSorted = true;
            for (int j = 1; j < (inputLength-i); j++){
                if(input[j-1] > input[j]) {
                    temp = input[j-1];
                    input[j-1] = input[j];
                    input[j] = temp;
                    isSorted = false;
                }
            }

            if(isSorted){
                break;
            }
            System.out.println("\n");
        }
    }
}
