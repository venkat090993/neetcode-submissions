class Solution {
    public boolean isAnagram(String s, String t) {
HashMap<Character, Integer> frequencyMap = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(Character c : s.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c,0)+1);
        }

        for(Character c : t.toCharArray()){
            Integer countOfCurrentChar = frequencyMap.get(c);
            if(countOfCurrentChar == null || countOfCurrentChar == 0){
                return false;
            }else{
                frequencyMap.put(c, countOfCurrentChar -1);
            }
        }

        return true;
    }
}
