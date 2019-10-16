package sortalgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Samet BUDAK
 * @since
 */
public class CountingSort {

    static int[] input = {4, 1, 2, 7, 10, 1, 2, 4, 4, 7, 1, 2, 1, 10, 1, 2, 4, 1, 2, 7, 10, 1, 2};

    int k = 10;

    public static void countingSort(int[] input, int k) {

        int counter[] = new int[k+1];

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        try {
            br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void permutation(String input) {
        permutation("", input);
    }

    public static void permutation(String prefix, String input) {
        int length = input.length();
        if(length == 0){
            System.out.println(prefix);
        } else{

            for(int i = 0; i < length ; i++){
                permutation(prefix + input.charAt(i) , input.substring(0,i) + input.substring(i+1));
            }
        }
    }
}
