
import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String input = sc.next();
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        // Remove spaces and convert the string to lowercase
        s = s.replaceAll(" ", "").toLowerCase();

        // Create a set to store the unique characters in the string
        HashSet<Character> characterSet = new HashSet<>();

        // Iterate through the string and add each character to the set
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                characterSet.add(c);
            }
        }

        // Check if the set contains all 26 letters of the alphabet
        return characterSet.size() == 26;
    }
}

