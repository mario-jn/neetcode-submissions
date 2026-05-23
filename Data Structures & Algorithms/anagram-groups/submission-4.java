class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();

        if(strs.length == 1){
            result.add(Arrays.asList(strs));
            return result;
        }

        Map<List<Integer>, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            List<Integer> key = countCharFrequency(strs[i]);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }
        
        for(List<String> val : map.values()){
            result.add(val);
        }

        return result;
    }

    private List<Integer> countCharFrequency(String str){
        int[] counterArr = new int[26];
        for(int i = 0; i < str.length(); i++){
            counterArr[str.charAt(i) - 'a']++;
        }
        List<Integer> counter = new ArrayList<>();
        for(int val : counterArr){
            counter.add(val);
        }
        return counter;
    }
}
