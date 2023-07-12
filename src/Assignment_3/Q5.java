package Assignment_3;

class Q5 {
    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1; i >= 0; i--){

            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;

            }else if(digits[i]==9){
                digits[i]=0;
            }
        }

        int[] arr=new int[digits.length+1];
        arr[0]=1;
        return arr;
    }

    public static void main(String[] args) {
        Q5 obj = new Q5();
        int[] num = {1,2,3};
        var result = obj.plusOne(num);
        System.out.print("[");
        for (int x:result
             ) {
            System.out.print(x+" ");
        }
        System.out.print("]");

    }
}
