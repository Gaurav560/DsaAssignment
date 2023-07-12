package Assignment_6;

class Q1 {
    public int[] diStringMatch(String s) {
        int low = 0;
        int size = s.length();
        int high = size;
        int[] output = new int[size+1];
        char[] arr = s.toCharArray();
        for(int i=0;i<size;i++){
            if(arr[i] == 'I'){
                output[i] = low;
                low++;
            }
            else{
                output[i] = high;
                high--;
            }
        }
        output[size] = high;
        return output;
    }
    public static void main(String[] args) {
        Q1 obj = new Q1();
        String num ="IDID";
        var result = obj.diStringMatch(num);
        System.out.print("[");
        for (int x:result
        ) {
            System.out.print(x+" ");
        }
        System.out.print("]");

    }
}
