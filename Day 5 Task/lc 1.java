lc 1. Two sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        int stat=0;
        while(stat!=nums.length-1){
        for(int itr=0;itr<nums.length;itr++){
            if(stat!=itr && nums[stat]+nums[itr]==target){
                res[0]=stat;
                res[1]=itr;
                
            }   
        }
        stat++;
        }
        return res;
    }
