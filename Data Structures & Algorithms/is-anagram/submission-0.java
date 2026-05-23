class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        String sortedC = new String(cs);
        String sortedT = new String(ct);
        return sortedC.equals(sortedT);
    }
}
