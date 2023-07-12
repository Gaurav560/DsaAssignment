package Assignment_4;

class Q5 {
    public int arrangeCoins(int n) {
        int i = 1;
        while(n > 0){
            i++;
            n = n-i;
        }
        return i-1;
    }

    public static void main(String[] args) {
        Q5 obj = new Q5();
        int num = 5;

        var result = obj.arrangeCoins(num);
        System.out.println(result);
    }
}
