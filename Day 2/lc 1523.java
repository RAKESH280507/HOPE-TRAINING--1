lc 1523

class Solution {
    public int countOdds(int low, int high) {
        int c=0;
        if(low%2==0)
        {
            low+=1;
        }
        while(low<=high)
        {
            low+=2;
            c++;
        }
        return c;
    }
}