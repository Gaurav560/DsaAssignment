package Assignment_4;

import java.util.Arrays;

class Q6 {
    public int[] sortedSquares(int[] nums) {

        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        Q6 obj = new Q6();
        int[] num = {-4,-1,0,3,10};
        var result = obj.sortedSquares(num);
        System.out.print("[");
        for (int x:result
             ) {
            System.out.print(x+" ");
        }
        System.out.print("]");

    }
}
