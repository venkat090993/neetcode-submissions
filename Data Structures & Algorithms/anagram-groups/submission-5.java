class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupMap = new HashMap();
        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);
            groupMap.computeIfAbsent(sortedKey, k -> new ArrayList()).add(word);
        }
        return new ArrayList(groupMap.values());
    }
}
