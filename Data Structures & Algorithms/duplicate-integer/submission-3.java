

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> rmDuplicate = new HashSet<>();

        for(int num: nums){
            rmDuplicate.add(num);
        }

        if(nums.length != rmDuplicate.size()){
            return true;
        }
        return false;
    }
}