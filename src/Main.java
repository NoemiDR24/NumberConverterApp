public class Main {
    public static void main(String[] args) {

        NumberConverter numberConverter = new NumberConverter();
        ConsoleUI consoleUI = new ConsoleUI();
        Controller controller = new Controller(numberConverter, consoleUI);
        controller.start();

    }


}