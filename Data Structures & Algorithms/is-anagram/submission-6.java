class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> hashMap = new HashMap<>();
        
        char[] sCharArray = s.toCharArray();

        for(char c : sCharArray){
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }

        char[] tCharArray = t.toCharArray();

        for(char o : tCharArray){
            if(hashMap.get(o) == null || hashMap.get(o) <= 0){
                return false;
            }else{
                hashMap.put(o, hashMap.get(o) - 1);
            }
        }

        return hashMap.values().stream().reduce(0,Integer::sum) == 0;
    }
}
