lc 169. Majority element

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        int tor=nums[0];
        int max=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i]==nums[i-1]){
             c++;
           }else {
            if(c>max){
                max=c;
                tor=nums[i-1];
            }
            c=1;
           }
        }
        if(c>max){
            tor=nums[nums.length-1];
        }
        return tor;
    }
}
