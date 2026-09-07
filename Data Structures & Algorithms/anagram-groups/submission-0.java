class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> str = new HashMap<>();

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            str.putIfAbsent(sortedS, new ArrayList<>());
            str.get(sortedS).add(s);
        }
        
        return new ArrayList<>(str.values());
    }
}
