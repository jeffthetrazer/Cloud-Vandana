import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffle(array);
        
        // Print the shuffled array
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    // Fisher-Yates shuffle algorithm
    public static void shuffle(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
