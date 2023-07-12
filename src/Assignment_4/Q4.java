package Assignment_4;

import java.util.Arrays;

class Q4 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2)
        {
            sum=sum+nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Q4 obj = new Q4();
        int[] num = {1,4,3,2};
        var result = obj.arrayPairSum(num);
        System.out.println(result);
    }
}
