class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans=new int [2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(map.containsKey(x)){
                ans[0]=map.get(x);
                ans[1]=i;
            }map.put(nums[i],i);
        }return ans;




        // for(int i=0;i<nums.length;i++){
        //     arr[0]=i;
        //     for(int j=i+1;j<nums.length;j++){

        //         if(nums[i]+nums[j]==target){
        //             arr[1]=j;
        //             return arr;
        //         }
        //     }

        // }return null;
    }
}