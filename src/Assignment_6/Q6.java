package Assignment_6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q6 {

    public int[] findOriginalArray(int[] changed) {
        int[] temp = new int[changed.length/2];
        Queue<Integer> x = new LinkedList<>();
        Arrays.sort(changed);
        int i = 0;
        for(int num : changed){
            if(!x.isEmpty() && x.peek()==num)
                temp[i++] = x.poll()/2;
            else x.add(num*2);
        }
        return x.size()>0 ? new int[]{}:temp;
    }

    public static void main(String[] args) {
        Q6 obj = new Q6();
        int[] num ={1,3,4,2,6,8};
        var result = obj.findOriginalArray(num);
        System.out.print("[");
        for (int x:result
        ) {
            System.out.print(x+" ");
        }
        System.out.print("]");

    }
}
