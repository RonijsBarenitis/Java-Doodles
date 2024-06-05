package Menu;

import Tech.HouseRobber;

import java.util.Scanner;

public class MainMenu {

    private Scanner menuScan = new Scanner(System.in);
    public void printAllOptions() {
        System.out.println("0: Quit");
        System.out.println("1: House robber demo");
        System.out.println("2: That");
        System.out.println("1: Booh");
    }

    public void menuOps(){

        boolean continueMenu = true;

        do{
            System.out.println("Please enter the number of your choice: ");
            String menuChoice = menuScan.next();
            switch (menuChoice){
                case "0":
                    continueMenu = false;
                    break;
                case "1":
                    houseRobber();
                    break;
                default:
                    System.out.println("Invalid choice, please enter a valid number");
                    break;
            }
        } while (continueMenu);
    }

    private void houseRobber() {
        HouseRobber robber = new HouseRobber();
        robber.rob();
    }


}
