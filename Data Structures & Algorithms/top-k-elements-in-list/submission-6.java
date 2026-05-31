class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> counter = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];  // max possible frequency is input length + 1
        
        for(int num : nums){
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry : counter.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int k0 = 0;
        for(int j = freq.length - 1; j >= 0 && k0 < k; j--){
            for(int n : freq[j]){
                result[k0++] = n;
                if(k0 == k){
                    return result;
                }
            }
        }

        return result;
    }

}
