class Solution {
    public int longestConsecutive(int[] nums) {
        // definition of consecutive numbers -> 
        // it has a starting and ending with exactly diff of 1 between each other
        // There can be multiple such sequences in an array

        // When I can say that the current number is a starting number?
        // when it does not have any other number before it.

        // I can sort and get list of numbers ignoring the duplicates

        // or else I maintain a hashset of all elements
        // loop from 0 -> n-1
        // I check if a number less than a current number is present in the set -> if yes, I move on
        // if No, I start from then increment the number by 1 and see if it is in the set -> yes, continue  No, break
        // During this process, I have a global count and block count and update max

        Set<Integer> set = new HashSet<>(); // handles duplicate
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int totalCount = 0;
        for(int i = 0; i<nums.length; i++){
            // is the start of the sequence
            if(set.contains(nums[i]-1)){
                continue;
            }
            int startOfSequence = nums[i];
            int count = 1;
            while(set.contains(startOfSequence + 1)){
                startOfSequence++;
                count++;
            }
            totalCount = Math.max(totalCount, count);
        }

        return totalCount;

    }
}
