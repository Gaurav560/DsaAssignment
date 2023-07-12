package Assignment_4;

class Q3 {
        public int[][] transpose(int[][] matrix) {
            int[][] ani = new int[matrix[0].length][matrix.length];

            for(int i = 0; i<matrix.length;i++){
                for(int j =0; j< matrix[i].length; j++ ){
                    ani[j][i] = matrix[i][j];
                }
            }
            return ani;
        }

    public static void main(String[] args) {
        Q3 obj = new Q3();
        int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
        var result = obj.transpose(num);
        System.out.print("[");
        for (int[] x:result
             ) {
            System.out.print("[");
            for (int y:x
                 ) {
                System.out.print(y+" ");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
}
