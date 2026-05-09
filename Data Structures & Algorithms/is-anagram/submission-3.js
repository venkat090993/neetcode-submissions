class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
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
  
   const val = Object.values(map).reduce((acc, item)=>{
     return acc+item
   })
    
   if(val > 0){
     return false;
   }
   
   return true;
    }
}
