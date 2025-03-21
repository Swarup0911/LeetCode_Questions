package LeetCode_Questions;
import java.util.*;
public class IntegerToRoman {
    
    public static String intToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = 
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = 
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = 
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num / 1000] + 
               hundreds[(num % 1000) / 100] + 
               tens[(num % 100) / 10] + 
               units[num % 10];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter an integer (1-3999): ");
        int num = scanner.nextInt();

        String romanNumeral = intToRoman(num);

        // Print Output
        System.out.println("Roman Numeral: " + romanNumeral);

        scanner.close();
    }
}


