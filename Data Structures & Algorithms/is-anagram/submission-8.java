class Solution {
    public boolean isAnagram(String s, String t) {
        // Directly I know I have to use hashSet to save the freq of elements of first string
        // Reduce the elements of the second string
        // Check if the value of the hashmap is less than 0
        // return bool

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> freqHashMap = new HashMap<>();
        for(char c : s.toCharArray()){
            freqHashMap.put(c, freqHashMap.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            if(freqHashMap.get(c) == null || freqHashMap.get(c).equals(0)){
                return false;
            }
            freqHashMap.put(c, freqHashMap.get(c) - 1);
        }

        return true;


    }
}
