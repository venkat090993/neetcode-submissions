class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> groupHashMap = new HashMap<>();

        for(String word : strs){
            int[] intArray = new int[26];
            for(int i = 0; i < word.length(); i++){
                char currChar = word.charAt(i);
                int idxToAdd = currChar - 'a';
                intArray[idxToAdd]++;
            }

            StringBuilder str = new StringBuilder();
            Arrays.stream(intArray).forEach((int currentVal)->{
                str.append(currentVal+"#");
            });
            String hashedString = str.toString();
            groupHashMap.computeIfAbsent(hashedString, key -> new ArrayList<>()).add(word);
        }

        List<List<String>> result = new ArrayList<>();

        for(List<String> groupedArr: groupHashMap.values()){
            result.add(groupedArr);
        }
        
        return result;
    }
}
