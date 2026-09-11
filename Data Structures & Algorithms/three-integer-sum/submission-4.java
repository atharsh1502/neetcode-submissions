public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer,Integer> c = new HashMap<>();
        Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         for (int k = j + 1; k < nums.length; k++) {
        //             if (nums[i] + nums[j] + nums[k] == 0) {
        //                 List<Integer> tmp = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 res.add(tmp);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(res);

        for(int i:nums){
            c.put(i,c.getOrDefault(i,0)+1);
        }

        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            c.put(nums[i],c.get(nums[i])-1);
            if(i>0 && nums[i] == nums[i-1]) continue;

            for(int j=i+1;j<nums.length;j++){
                c.put(nums[j],c.get(nums[j])-1);
                if(j>i+1 && nums[j] == nums[j-1]) continue;

                int target= -(nums[i]+nums[j]);
                if(c.getOrDefault(target,0)>0){
                    res.add(Arrays.asList(nums[i],nums[j],target));
                }
            }
            for(int j=i+1;j<nums.length;j++){
                c.put(nums[j],c.get(nums[j])+1);
            }
        }
        return res;
    }
}