class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0;
        int rightsum=0;
        int totalsum=0;
        int maxsum=0;
        int n=cardPoints.length;
        for(int i=0;i<k;i++){
            leftsum+=cardPoints[i];
            totalsum=leftsum+rightsum;
            maxsum=Math.max(maxsum,totalsum);
        }
        while(k-1>=0){
            totalsum=0;
            leftsum-=cardPoints[k-1];
            rightsum+=cardPoints[n-1];
            totalsum=leftsum+rightsum;
            maxsum=Math.max(maxsum,totalsum);
            k--;
            n--;
        }
        return maxsum;
    }
}