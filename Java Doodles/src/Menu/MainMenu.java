package Menu;

import Tech.HouseRobber;
import Tech.PlusOne;
import Tech.PowerOfTwo;
import Tech.SumOf3;
import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class MainMenu {

    private Scanner menuScan = new Scanner(System.in);
    public void printAllOptions() {
        System.out.println("0: Quit");
        System.out.println("1: House robber demo");
        System.out.println("2: Sum of three");
        System.out.println("3: Power of two");
        System.out.println("4: Jolly Jumper");
        System.out.println("5: Plus One");
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
                case "2":
                    sumOf3();
                    break;
                case "3":
                    powerOfTwo();
                    break;
                case "4":
                    jollyJumper();
                    break;
                case "5":
                    plusOne();
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

    private void sumOf3() {
        SumOf3 sumOf3 = new SumOf3();
        sumOf3.sum();
    }

    private void powerOfTwo() {
        PowerOfTwo power = new PowerOfTwo();
        power.powerOfTwo();
    }

    private void jollyJumper(){

    }

    private void plusOne(){
        PlusOne plus = new PlusOne();
        plus.plusOneSolution();

    }

}
