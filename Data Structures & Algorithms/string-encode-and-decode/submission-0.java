class Solution {

    public String encode(List<String> strs) {
        StringBuilder e_s = new StringBuilder();
        for(String str:strs){
            e_s.append(str.length()).append('#').append(str);
        } 
        return e_s.toString();
    }

    public List<String> decode(String str) {
        List<String> d_s = new ArrayList<>();
        int i=0;
        while (i < str.length()) {
            int j = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            String actualStr = str.substring(i, i + length);
            d_s.add(actualStr);
            i += length;
        }
        return d_s;
    }
}
