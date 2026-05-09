class Solution {
    public boolean hasDuplicate(int[] nums) {
        // I can sort - loop and see if the element at ith position and i+1 position are same
        // Return true if yes, and no at end of array. but o(nlogn) time complexity

        // I can keep a hashset -> add it -> the nature of hashset is that if there is already existing item, it returns null, then return true
        // end of loop, return false

       HashSet<Integer> set = new HashSet<>();
       for(int n : nums){
        if(set.add(n) == false){
            return true;
        }
       }

       return false;
        
    }
}