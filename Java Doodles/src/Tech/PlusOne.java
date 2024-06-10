package Tech;

/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer. The digits are stored
such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
*/

import java.util.Arrays;

public class PlusOne {

    public void plusOneSolution() {
        int[] nums = {9,9,9,9};
        System.out.println("The initial array is: " +Arrays.toString(nums));
        System.out.println("The PlusOne array is: " +Arrays.toString(plusOne(nums)));
    }

    private int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) { //If the last digit is smaller than 9, add 1 to it and return the array
                digits[i]++;
                return digits;
            }

            digits[i] = 0; //If the digit in position i is 9, reassign it to 0, to +1 the array in next step
        }

        int[] result = new int[digits.length + 1]; //In an array of all 9s, add the increase to the next tenth(hundredth, thousandth etc)
        result[0] = 1;

        return result;
    }
}
