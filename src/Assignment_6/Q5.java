package Assignment_6;

import java.util.Arrays;

public class Q5 {

    public int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int sum = 0;
        int length = nums1.length;
        for (int i = 0; i < length; i++)
            sum += nums1[i] * nums2[length - 1 - i];
        return sum;
    }


    public static void main(String[] args) {
        Q5 obj = new Q5();
        int[] num1 ={5,3,4,2};
        int[] num2 ={4,2,2,5};
        var result = obj.minProductSum(num1,num2);
        System.out.print(result);

    }
}
