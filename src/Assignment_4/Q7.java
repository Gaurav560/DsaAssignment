package Assignment_4;

public class Q7 {
        public int maxCount(int m, int n, int[][] ops) {
            int k=ops.length;
            for (int i=0;i<k;i++)
            {
                int z=ops[i][0] ,x=ops[i][1];
                n=Math.min(n,x);
                m=Math.min(m,z);
            }
            return (m*n);
        }
    public static void main(String[] args) {
        Q7 obj = new Q7();
        int[][] num = {{2,2}, {3,3}};
        int m= 3;
        int n= 3;
        var result = obj.maxCount(m,n,num);
        System.out.print(result);

    }
}