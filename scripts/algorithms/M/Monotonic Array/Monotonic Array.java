class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums[0]<nums[nums.length-1]){
            for(int i=0;i<nums.length-1;i++){
            if(!(nums[i]<=nums[i+1])) return false;
        }
        }else{
            for(int i=0;i<nums.length-1;i++){
            if(!(nums[i]>=nums[i+1])) return false;
        }
        }
        return true;
    }
}
