import Menu.MainMenu;

public class Main {
    public static void main(String[] args) {

        printWelcomeMsg();
        MainMenu menu = new MainMenu();
        menu.printAllOptions();
        menu.menuOps();
        printGoodbyeMsg();
    }

    private static void printWelcomeMsg() {
        System.out.println("This app will have various doodles, simple games, and functions for possible tech interview questions.");
    }

    private static void printGoodbyeMsg() {
        System.out.println("Thanks for stopping by! See you later!");
    }
}