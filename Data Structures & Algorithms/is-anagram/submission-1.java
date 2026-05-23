class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> counter = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            int sc = counter.getOrDefault(s.charAt(i), 0);
            counter.put(s.charAt(i), sc + 1);
            int tc = counter.getOrDefault(t.charAt(i), 0);
            counter.put(t.charAt(i), tc - 1);
        }
        for(int val : counter.values()){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
}
