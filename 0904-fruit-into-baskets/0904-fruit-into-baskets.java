class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int right=0;
        int maxlen=0;
        HashMap<Integer,Integer> mpp= new HashMap<>();
        while(right<fruits.length){
            int c1=fruits[right];
            mpp.put(c1,mpp.getOrDefault(c1,0)+1);
            while(mpp.size()>2){
                int c2=fruits[left] ;
                mpp.put(c2,mpp.get(c2)-1);
                left++;
                if(mpp.get(c2)==0){
                    mpp.remove(c2);
                }
            }
            if(mpp.size()<=2){
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
        }
        return maxlen;
    }
}