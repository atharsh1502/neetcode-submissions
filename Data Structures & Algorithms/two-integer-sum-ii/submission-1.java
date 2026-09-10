class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> num = new HashMap<>();

        for(int i=0;i<numbers.length; i++){
            int temp=target-numbers[i];
            if(num.containsKey(temp)){
                return new int[]{num.get(temp), i+1};
            }
            num.put(numbers[i],i+1);
        }
        return new int[0];
    }
}
