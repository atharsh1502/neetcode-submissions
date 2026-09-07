class Solution {
    public int[] twoSum(int[] nums, int target) {
        int m,n;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                m=i;
                n=j;
                if(nums[m]+nums[n] == target){
                    return new int[]{m,n};
                }
            }
        }
        return new int[]{};
    }
}
