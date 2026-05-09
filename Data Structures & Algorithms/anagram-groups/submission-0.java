class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groupKeyAndList = new HashMap();
        for(String str: strs){

            int[] countBucketArr = new int[26];

           for(char ch: str.toCharArray()){
                countBucketArr[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int el: countBucketArr){
                sb.append(el).append("#");
            }

            String key = sb.toString();
            
            groupKeyAndList.computeIfAbsent(key, ignored -> new ArrayList()).add(str);

        }

       return  groupKeyAndList.values().stream().toList();
        
    }
}
