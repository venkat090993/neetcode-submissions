class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupMap = new HashMap();
        for(String word: strs){
            // char[] chars = word.toCharArray();
            // Arrays.sort(chars);
            // String sortedKey = new String(chars);
            int[] freqCountArray = new int[26];
            for(char c : word.toCharArray()){
            // I know all the char has a ascii value assigned to it a -> 96 all the way to z -> 122
            // a-a = 0 and z-a = 25, look at this -> exactly the index
            freqCountArray[c-'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int val: freqCountArray){
                sb.append(val).append("#");
            }
            String key = sb.toString();

            groupMap.computeIfAbsent(key, k -> new ArrayList()).add(word);
        }
        return new ArrayList(groupMap.values());
    }
}
