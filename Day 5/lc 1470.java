lc 1470. Shuffle the Array

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[]
        for(int i=0;i<nums.length;i++)
        {
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[i+n]; 
        }
        return arr;
    }
}