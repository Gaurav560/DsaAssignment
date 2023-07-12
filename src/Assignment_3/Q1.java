package Assignment_3;

import java.util.Arrays;
import java.util.HashSet;

class Q1 {
    int differ = Integer.MAX_VALUE;
    int  closest_3sum = 0;
    int Tar  = 0;
    boolean flag = false;
    public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int closestSum = nums[0] + nums[1] + nums[2]; // Initialize closest sum with the sum of the first three elements

            for (int i = 0; i < nums.length - 2; i++) {
                int j = i + 1;
                int k = nums.length - 1;

                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                        closestSum = sum; // Update closest sum if the current sum is closer to the target
                    }

                    if (sum < target) {
                        j++; // Increment j to increase the sum
                    } else {
                        k--; // Decrement k to decrease the sum
                    }
                }
            }

            return closestSum;

    }


    public static void main(String[] args) {
        Q1 obj = new Q1();
        int[] num= {-1,2,1,-4} ;
        int target = 1;
        var result = obj.threeSumClosest(num,target);
        System.out.println(result);
    }
}

