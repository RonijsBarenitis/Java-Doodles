package Tech;

/*You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it
will automatically contact the police if two adjacent houses were broken into on the same night.
Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of
money you can rob tonight without alerting the police.*/


import java.util.Arrays;

public class HouseRobber {

    public void rob() {

        int[] moneyHouses = {300, 500, 100, 900, 1100, 350, 200, 2000, 3000, 150, 650};

        System.out.println("The houses on the street have the fallowing amount of money in them: \n" + Arrays.toString(moneyHouses));

        if(moneyHouses.length == 0) {
            System.out.println("There are no houses to rob!!");
        }

        if(moneyHouses.length == 1) {
            System.out.println("There's only 1 house, so only " +moneyHouses[0] +" can be stolen.");
        }

        int[] moneyStolen = new int[moneyHouses.length];

        moneyStolen[0] = moneyHouses[0];
        moneyStolen[1] = moneyHouses[0] > moneyHouses[1] ? moneyHouses[0] : moneyHouses[1];

        for(int i = 2; i < moneyHouses.length; i++) {
            moneyStolen[i] = Math.max(moneyStolen[i - 2] + moneyHouses[i], moneyStolen[i - 1]);
        }

        System.out.println("Maximum potential of stolen money: "+moneyStolen[moneyStolen.length - 1]);
    }
}
