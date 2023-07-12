package Assignment_4;

public class Q8 {
    public int[] shuffle(int[] nums, int n) {
        int temp = 2 * n;
        int [] arr = new int[temp];
        for(int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
            arr[(2 * i )+ 1] = nums[i + n];
        }
        return arr;
    }

    public static void main(String[] args) {
        Q8 obj = new Q8();
        int[] num = {2,5,1,3,4,7};
        int m= 3;
        var result = obj.shuffle(num,m);
        System.out.print("[");
        for (int x:result
             ) {
            System.out.print(x+" ");
        }
        System.out.print("]");
    }
}
