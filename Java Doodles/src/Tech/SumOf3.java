package Tech;

/*Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in
the array which gives the sum of zero.
Note: The solution set must not contain duplicate triplets.
For example, given array S = [-1, 0, 1, 2, -1, -4],
A solution set is:
   [
   [-1, 0, 1],
   [-1, -1, 2]
   ]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOf3 {

    public void sum() {

        int[] nums = {-4, -3, -3, -2, -1, 0, 1, 2, 2, 3, 4, -4, 0, 4};

        System.out.println("The number array is: " +Arrays.toString(nums));

        List<List<Integer>>  result = new ArrayList<>();

        Arrays.sort(nums);  //Sort the array of numbers in ascending order to better compare the numbers

        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) { //Skip over nth repetition of a number to avoid duplicate triplets
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
            int target = -nums[i];

            while(j < k) {
                if(nums[j] + nums[k] == target) {
                    ArrayList<Integer> temp = new ArrayList<Integer>();

                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);

                    result.add(temp);

                    j++;
                    k--;

                    while(j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while(j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if(nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        System.out.println("The set of results is: " +result);
    }
}
