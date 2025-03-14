
public class Controller {
    private NumberConverter numberConverter;
    private ConsoleUI consoleUI;

    //constructor
    public Controller(NumberConverter numberConverter, ConsoleUI consoleUI) {
        this.numberConverter = numberConverter;
        this.consoleUI = consoleUI;
    }

    public void start() {
        boolean running = true;
        while (running) {
            consoleUI.displayMenu();
            int choice = consoleUI.getUserInput();
            switch (choice) {
                case 1:
                    System.out.print("ENTER A BINARY NUMBER TO CONVERT: ");
                    String binary = consoleUI.getUserInputAsString();
                    if (isValidBinary(binary)) {
                        String decimalResult = numberConverter.binaryToDecimal(binary);
                        consoleUI.displayResult(decimalResult);
                    } else {
                        consoleUI.displayErrorMessage(" INVALID BINARY NUMBER");
                    }
                    break;
                case 2:
                    System.out.print("ENTER A DECIMAL NUMBER TO CONVERT: ");
                    String decToBinary = consoleUI.getUserInputAsString();
                    String binaryResult = numberConverter.decimalToBinary(decToBinary);
                    consoleUI.displayResult(binaryResult);
                    break;
                case 3:
                    System.out.print("ENTER A ROMAN NUMBER TO CONVERT: ");
                    String roman = consoleUI.getUserInputAsString();
                    if (roman != null && isValidRoman(roman)){
                        String decimalResult = numberConverter.romanToDecimal(roman);
                        consoleUI.displayResult(decimalResult);
                    }else {
                        consoleUI.displayErrorMessage("INVALID ROMAN NUMBER");
                    }
                    break;
                case 4:
                    System.out.print("ENTER A DECIMAL NUMBER TO CONVERT: ");
                    String decToRoman = consoleUI.getUserInputAsString();
                    String romanResult = numberConverter.decimalToRoman(decToRoman);
                    consoleUI.displayResult(romanResult);
                    break;
                case 5:
                    System.out.print("ENTER A HEXADECIMAL NUMBER TO CONVERT: ");
                    String hexadecimal = consoleUI.getUserInputAsString();
                    if (isValidHexadecimal(hexadecimal)) {
                        String hexToDecimalResult = numberConverter.hexadecimalToDecimal(hexadecimal);
                        consoleUI.displayResult(hexToDecimalResult);
                    } else {
                        consoleUI.displayErrorMessage("INVALID HEXADECIMAL NUMBER");
                    }
                    break;
                case 6:
                    System.out.print("ENTER A DECIMAL NUMBER TO CONVERT: ");
                    String decToHexadecimal = consoleUI.getUserInputAsString();
                    String hexadecimalResult = numberConverter.decimalToHexadecimal(decToHexadecimal);
                    consoleUI.displayResult(hexadecimalResult);
                    break;
                case 7:
                    System.out.print("ENTER AN OCTAL NUMBER TO CONVERT: ");
                    String octal = consoleUI.getUserInputAsString();
                    String octalToDecimalResult = numberConverter.octalToDecimal(octal);
                    consoleUI.displayResult(octalToDecimalResult);
                    break;
                case 8:
                    System.out.print("ENTER A DECIMAL NUMBER TO CONVERT: ");
                    String octToDecimal = consoleUI.getUserInputAsString();
                    String octalResult = numberConverter.decimalToOctal(octToDecimal);
                    consoleUI.displayResult(octalResult);
                    break;
                case 9:
                    running = false;
                    System.out.println("************** THANK YOU! *************");
                    break;
                default:
                    System.out.println("INVALID OPTION. TRY AGAIN");
            }
        }
    }
    private boolean isValidBinary(String binary) {

        return binary.matches("[01]+");
    }

    private boolean isValidRoman(String roman) {
        roman = roman.toUpperCase();
        return roman.matches("^[IVXLCDM]+$");
    }

    public boolean isValidHexadecimal(String hexadecimal) {
        hexadecimal = hexadecimal.toUpperCase();
        return hexadecimal.matches("[0-9A-F]+");
    }

}