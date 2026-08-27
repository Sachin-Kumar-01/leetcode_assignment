class Solution {
    public boolean isPalindrome(int x) {
        int y=0;
    int z=x;
        while(x>0){
            int last=x%10;
            x/=10;
            y=y*10+last;
        }
        if(z!=y)  return false;
        return true;
    }
}