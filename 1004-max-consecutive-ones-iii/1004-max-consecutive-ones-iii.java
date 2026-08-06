class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int maxlen=0;
        int zeroes=0;


        while(right<nums.length){
            if(nums[right]==0){
                zeroes++;

            }
            while(zeroes>k){
                if(nums[left]==0) zeroes--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;

        // while(right<nums.length){
        //     if(nums[right]==0) zeroes++;
        //     if(zeroes<=k){
        //     maxlen=Math.max(maxlen,right-left+1);
        //     }
        //     else {
        //         if(nums[left]==0) zeroes--;
        //         left++;
        //     }
        //     right++;
        // }
        // return maxlen;
    }
}