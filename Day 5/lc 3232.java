lc 3232. Find if Digit Game Can Be Won

class Solution {
    public boolean canAliceWin(int[] nums) {
        int a=0,b=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>9)
            {
                a=a+nums[i];
            }
            else
            {
                b=b+nums[i];
            }
        }
        if(a>b||b>a)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}