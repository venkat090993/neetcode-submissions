class Solution {
    public boolean isAnagram(String s, String t) {
if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for(char c : s.toCharArray()){
            // I have to add it to array with default value 0
            // if already exists, then I have to add value + 1
            frequencyMap.put(c, frequencyMap.getOrDefault(c,0) + 1);
        }

        for( char c : t.toCharArray()){
            // I want to iterate again and if exist I remove one by one
            if(frequencyMap.get(c) == null || frequencyMap.get(c) == 0){
                return false;
            }
            frequencyMap.put(c, frequencyMap.get(c) - 1);
        }
        return true;
    }
}
