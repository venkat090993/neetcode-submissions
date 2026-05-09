class Solution {
    public boolean isPalindrome(String s) {
        String normalisedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int l = 0;
        int r = normalisedString.toCharArray().length - 1;
        while(l <= r){
            if(normalisedString.charAt(l) == normalisedString.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}

// abcba 
//  lr
// abba