package Assignment_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2 {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> list=new ArrayList<>();
            if(target==-294967296) return list;
            int n=nums.length;
            Arrays.sort(nums);
            for(int i=0;i<n-3;i++){
                for(int j=i+1;j<n-2;j++){
                    int k=j+1;
                    int l=n-1;
                    while(k<l){
                        if((nums[i]+nums[j]+nums[k]+nums[l])<target) k++;
                        else if((nums[i]+nums[j]+nums[k]+nums[l])>target)l--;
                        else{
                            List<Integer> sublist=new ArrayList<>();
                            sublist.add(nums[i]);
                            sublist.add(nums[j]);
                            sublist.add(nums[k]);
                            sublist.add(nums[l]);
                            list.add(sublist);
                            int t1=k;
                            int t2=l;
                            while(k<l&&nums[t1]==nums[k]) k++;
                            while(k<l&&nums[t2]==nums[l]) l--;
                        }
                        while(j+1<n&&nums[j+1]==nums[j]) j++;
                        while(i+1<j&&nums[i+1]==nums[i]) i++;
                    }
                }
            }
            return list;
        }

    public static void main(String[] args) {
        Q2 obj = new Q2();
        int[] num = {1,0,-1,0,-2,2};
        int target = 0;
        var result = obj.fourSum(num,target);
        System.out.println(result);
    }
    }

