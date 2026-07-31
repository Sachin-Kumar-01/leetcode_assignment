class Solution {
    public int majorityElement(int[] nums) {
    
    //    for(int i=0;i<nums.length;i++) {
    //        int count=0;
    //     for(int j=i;j<nums.length;j++){
    //         if(nums[i]==nums[j]){
    //             count++;
    //         }
    //     }
    //     if(count>(nums.length/2)){
    //         return nums[i];
    //     }
        
    //    }
    //    return -1;
    int c=0;
    int x=0;
    for(int i=0;i<nums.length;i++){
      if(c==0) {
        c=1;
        x=nums[i];
      }
      else if(nums[i]==x){
        c++;
      }
      else{ 
        c--;
      }

    }
    int cc=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==x){
            cc++;
        }
    }
    if(cc>(nums.length/2)){
        return x;
    }
    return -1;
    

    }
}