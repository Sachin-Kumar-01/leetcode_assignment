class Solution {
    private int fnc(int[]nums,int k){
         int left=0;
        int right=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(right<nums.length){
            int n=nums[right];
            map.put(n,map.getOrDefault(n,0)+1);

            while(map.size()>k){
                int m=nums[left];
                map.put(m,map.get(m)-1);
                if(map.get(m)==0) map.remove(m);
                left++;
            }
           
             count += right - left + 1;           
            


            right++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
       return fnc(nums,k)-fnc(nums,k-1);
    }
}