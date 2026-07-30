class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int arr[]=new int[nums.length];
        // int i=0;
        // int j=1;
        // for(int k=0;k<nums.length;k++){
        //     if(nums[k]>0){
        //         arr[i]=nums[k];
        //         i=i+2;
        //     }
        //     else{
        //         arr[j]=nums[k];
        //         j=j+2;
        //     }
        // }
        // return arr;
        int pos_arr[]=new int[nums.length/2];
        int pos_ind=0;
        int neg_arr[]=new int[nums.length/2];
        int neg_ind=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos_arr[pos_ind]=nums[i];
                pos_ind++;
            }
            else{
                neg_arr[neg_ind]=nums[i];
                neg_ind++;
            }
        }
        for(int i=0;i<nums.length/2;i++){
            nums[2*i]=pos_arr[i];
            nums[2*i+1]=neg_arr[i];
        }
        return nums;
    }
}