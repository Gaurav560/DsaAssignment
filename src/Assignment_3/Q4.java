package Assignment_3;

class Q4 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }

        return start;
    }
        public static void main(String[] args) {
            Q4 obj = new Q4();
            int[] num = {1,3,5,6};
            int target = 5;
            var result = obj.searchInsert(num,target);
            System.out.println(result);
        }
    }
