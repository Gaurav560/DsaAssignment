package Assignment_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q8 {

    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int r1 = mat1.length, c1 = mat1[0].length, c2 = mat2[0].length;
        int[][] res = new int[r1][c2];
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for (int i = 0; i < r1; ++i) {
            for (int j = 0; j < c1; ++j) {
                if (mat1[i][j] != 0) {
                    mp.computeIfAbsent(i, k -> new ArrayList<>()).add(j);
                }
            }
        }
        for (int i = 0; i < r1; ++i) {
            for (int j = 0; j < c2; ++j) {
                if (mp.containsKey(i)) {
                    for (int k : mp.get(i)) {
                        res[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Q8 obj = new Q8();
        int[][] num1 ={{1, 0, 0}, {-1, 0, 3}};
        int[][] num2 ={{7, 0, 0}, {0, 0, 0}, {0, 0, 1}};
        var result = obj.multiply(num1,num2);
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

