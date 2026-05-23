class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(hm.containsKey(difference)){
                int j = hm.get(difference);
                if(i<j){
                    return new int[] {i, j};
                }else{
                    return new int[] {j, i};
                }
            }else{
                hm.put(nums[i], i);
            }
        }
        // for(int n : hm.keySet()){
        //     Integer remainder = target - n;
        //     Integer mIndex = hm.getOrDefault(remainder, null);
        //     if(mIndex != null){
        //         int nIndex = hm.get(n);
        //         if(nIndex < mIndex)
        //             return new int[] {nIndex, mIndex};
        //         else
        //             return new int[] {mIndex, nIndex};
        //     }
        // }
        return null;
    }
}
