class Solution {

    public String encode(List<String> strs) {
        return String.join(";", strs) + ";" + strs.size();
    }

    public List<String> decode(String str) {
        String[] strs = str.split(";");
        Integer strSize = Integer.parseInt(strs[strs.length - 1]);
        List<String> result = new ArrayList<String>(strSize);
        for(int i = 0; i < strSize; i++){
            result.add(strs[i]);
        }
        return result;
    }
}
