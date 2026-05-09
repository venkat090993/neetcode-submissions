class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        // I have to sanitise the string removing non alpha numerical values
        // 2 pointer -> l and r -> see if they are same if no return false -> fail first
        // at the end return true;

        const sanitizedString = s.replace(/[^a-z0-9]/gi,'').toLowerCase();
        let l = 0, r = sanitizedString.length - 1;
        while(l < r){
            if(sanitizedString[l] !== sanitizedString[r]){
                return false;
            }else{
                l++;
                r--;
            }
        }

        return true;
    }
}
