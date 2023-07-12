package Assignment_6;

import java.util.HashMap;

public class Q4 {

    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++) {
            sum += (nums[i] == 0 ? -1 : nums[i]);
            if(sum == 0)
                maxLength = i+1;
            else if(hmap.containsKey(sum)) {
                maxLength = Math.max(maxLength,i - hmap.get(sum));
            }
            else
                hmap.put(sum,i);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Q4 obj = new Q4();
        int[] num ={0,1};
        var result = obj.findMaxLength(num);
        System.out.print(result);

    }
}
