lc 657. Robot Return to Origin

class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(char c: moves.toCharArray())
        {
            if(c=='R')
            {
                x++;
            }
            else if(c=='L')
            {
                x--;
            }
            else if(c=='D')
            {
                y--;
            }
            else
            {
                y++;
            }
        }
        if(x==0 && y==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}