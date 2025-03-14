import java.lang.reflect.Array;
import java.util.*;
import java.math.BigInteger;

public class NumberConverter {
    private final Map<Integer, String> romanMap;
    private final Map<Character, Integer> romanCharMap;

    //Constructor
    public NumberConverter() {
        romanMap = new LinkedHashMap<>();
        romanMap.put(1000,"M");
        romanMap.put(900,"CM");
        romanMap.put(500,"D");
        romanMap.put(400,"CD");
        romanMap.put(100,"C");
        romanMap.put(90,"XC");
        romanMap.put(50,"L");
        romanMap.put(40,"XL");
        romanMap.put(10,"X");
        romanMap.put(9,"IX");
        romanMap.put(5,"V");
        romanMap.put(4,"IV");
        romanMap.put(1,"I");

        romanCharMap = new HashMap<>();
        romanCharMap.put('I', 1);
        romanCharMap.put('V', 5);
        romanCharMap.put('X', 10);
        romanCharMap.put('L', 50);
        romanCharMap.put('C', 100);
        romanCharMap.put('D', 500);
        romanCharMap.put('M', 1000);

    }

    //Methods
    // Converts a Binary Number to a Decimal Number
    public String binaryToDecimal(String binary){
       BigInteger decimal = new BigInteger(binary, 2);
       return decimal.toString();
    }

    // Converts a Decimal Number to a Binary Number
    public String decimalToBinary(String decimal){
        String binary = "";
        int newDecimal = Integer.parseInt(decimal);
        while (newDecimal != 0){
            int remainder = newDecimal%2;
            newDecimal = newDecimal/2;
            binary = remainder + binary;
        }
        return binary;
    }

    // Converts a Roman Number to a Decimal Number
    public String romanToDecimal(String roman){
        roman = roman.toUpperCase();
        int decimal = 0;
        int previousValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int currentValue = romanCharMap.get(roman.charAt(i));
            if (currentValue < previousValue) {
                decimal -= currentValue;

            } else {
                decimal += currentValue;
            }
            previousValue = currentValue;
        }
        return String.valueOf(decimal);

    }

    // Converts a Decimal Number to a Roman Number
    public String decimalToRoman(String decimal){
        int newDecimal = Integer.parseInt(decimal);
        StringBuilder roman = new StringBuilder();

        for (Map.Entry<Integer, String> entry : romanMap.entrySet()) {
            while (newDecimal >= entry.getKey()) {
                roman.append(entry.getValue());
                newDecimal -= entry.getKey();
            }
        }
        return roman.toString();
    }

    // Converts a Hexadecimal Number to a Decimal Number
    public String hexadecimalToDecimal(String hexadecimal){
        int decimal = Integer.parseInt(hexadecimal, 16);
        return String.valueOf(decimal);
    }

    // Converts a Decimal Number to a Hexadecimal Number
    public String decimalToHexadecimal(String decimal){
        int decimalNum = Integer.parseInt(decimal);
        return Integer.toHexString(decimalNum).toUpperCase();
    }

    // Converts a Octal Number to a Decimal Number
    public String octalToDecimal(String octal){
        int octalNum = Integer.parseInt(octal);
        String decimal = Integer.toOctalString(octalNum);
        return decimal;
    }

    // Converts a Decimal Number to a Octal Number
    public String decimalToOctal(String decimal){
        int octal = Integer.parseInt(decimal, 8);
        return String.valueOf(octal);
    }

}
