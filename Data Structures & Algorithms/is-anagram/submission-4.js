class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {

if(s.length !== t.length) return false;

      
        const map = {};
    for(let char of s){
       if(map[char]){
        map[char] = map[char] + 1;
       }else{
        map[char] = 1
       }
    }
        
    for(let tChar of t){
      if(!map[tChar]){
        return false;
      }
      
      map[tChar]--;
    }
   
   return true;
    }
}
