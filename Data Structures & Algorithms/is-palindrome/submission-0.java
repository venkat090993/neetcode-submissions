class Solution {
    public boolean isPalindrome(String s) {
        String normalisedString = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int size = normalisedString.length();
        char[] charArray = normalisedString.toCharArray();
        int i = 0;
        int j = size - 1;
        while(i < j){
           if( charArray[i] == charArray[j]){
            i++;
            j--;
           }else{
            return false;
           }
        }

        return true;

    }
}
