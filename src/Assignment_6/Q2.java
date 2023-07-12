package Assignment_6;

public class Q2 {

    public boolean searchMatrix(int[][] matrix, int target) {

        int i = 0 , j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0){
            if(matrix[i][j] > target){
                j--;
            }else if(matrix[i][j] < target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Q2 obj = new Q2();
        int[][] num ={{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        var result = obj.searchMatrix(num,target);
        System.out.print(result);

    }

}
