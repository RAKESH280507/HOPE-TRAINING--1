9. Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        int a=0;
        int num = x;
        int rev =0;
        while(num>0)
        {
            a=num%10;
            rev=rev*10+a;
            num/=10;
        }
        if(x==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}