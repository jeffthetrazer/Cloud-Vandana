
import java.util.HashMap;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String romanNumeral = sc.next();

        int result = romanToInt(romanNumeral);
        System.out.println("The integer equivalent of " + romanNumeral + " is " + result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanMap.get(s.charAt(i));

            if (curValue < prevValue) {
                total -= curValue;
            } else {
                total += curValue;
            }

            prevValue = curValue;
        }

        return total;
    }
}
