class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencies = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer frequency = frequencies.getOrDefault(nums[i], 0);
            frequencies.put(nums[i], frequency + 1);
        }

        List<List<Integer>> pairs = new ArrayList<>();
        for(Integer num : frequencies.keySet()){
            List<Integer> pair = new ArrayList();
            pair.add(num);
            pair.add(frequencies.get(num));
            pairs.add(pair);
        }
        pairs.sort((a, b) -> Integer.compare(b.get(1), a.get(1)));

        List<Integer> results = new ArrayList<>();
        for(int i = 0; i < k; i++){
            results.add(pairs.get(i).get(0));
        }
        return results.stream().mapToInt(Integer::intValue).toArray();
    }

}
