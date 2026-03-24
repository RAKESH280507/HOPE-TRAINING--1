lc 172. Factorial Trailing Zeroes

class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        while(n>0)
        {
            n/=5;
            c+=n;
        }
        return c;

    }
}