package Assignment_6;

public class Q3 {

    public boolean validMountainArray(int[] arr) {
        int f1=0,f2=0,f3=0,false_Flag=0;
        for(int i=0;i<arr.length-1 && arr.length >= 3;i++){
            if(arr[i] < arr[i+1]){
                if(f2==1 ||  f3==1) false_Flag=1;
                f1=1;
            }
            else if(arr[i] == arr[i+1]){
                if(f1==0 || f3==1) false_Flag=1;
                f2=1;

            }
            else if(arr[i] > arr[i+1]){
                if(f1==0) false_Flag=1;
                f3=1;
            }
        }
        if( f1==1 && f3==1 && false_Flag==0) return true;
        return false;
        // return false;
    }

    public static void main(String[] args) {
        Q3 obj = new Q3();
        int[] num ={2,1};
        var result = obj.validMountainArray(num);
        System.out.print(result);

    }
}
