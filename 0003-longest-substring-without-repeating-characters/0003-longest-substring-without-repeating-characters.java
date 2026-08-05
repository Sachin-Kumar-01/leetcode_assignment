class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int maxlen=0;
        int len=0;
        HashSet<Character> uniset=new HashSet<>();

        while(r<s.length()){

            if(!uniset.contains(s.charAt(r))) {
           
            uniset.add(s.charAt(r));
            len++;
            maxlen=Math.max(r-l+1,maxlen);
            r++;
            }
            else{
                uniset.remove(s.charAt(l));
                l++;
            }
        }
        return maxlen;
    }
}