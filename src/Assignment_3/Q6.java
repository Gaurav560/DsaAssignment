package Assignment_3;

class Q6 {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Q6 obj = new Q6();
        int[] num = {2,2,1};
        var result = obj.singleNumber(num);
        System.out.println(result);
    }
}
