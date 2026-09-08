class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> topK = new HashMap<>();
        for(int i:nums){
            topK.put(i,topK.getOrDefault(i,0)+1);
        }
        return topK.entrySet().stream()
        .sorted((a,b)-> b.getValue() - a.getValue())
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();
    }
}
