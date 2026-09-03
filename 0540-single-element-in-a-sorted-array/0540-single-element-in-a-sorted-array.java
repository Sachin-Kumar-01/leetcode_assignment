class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];
        int low=1;
        int high=n-2;
        int mid;
        int number=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid] !=nums[mid+1]){
                number=nums[mid];
                break;
            }
            if(mid%2==1 && nums[mid]==nums[mid-1]) low=mid+1;
            if(mid%2==1 && nums[mid]==nums[mid+1]) high=mid-1;
            if(mid%2==0 && nums[mid]==nums[mid+1]) low=mid+1;
            if(mid%2==0 && nums[mid]==nums[mid-1]) high=mid-1;
        }
        return number;
    }
}