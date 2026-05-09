class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int maxFreq = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums){
            int freq = freqMap.getOrDefault(num,0)+1;
            freqMap.put(num, freq);
            maxFreq = Math.max(maxFreq, freq);
        }
        // To sort the values and bucket it -> I know a technique called bucket sort
        List<Integer>[] buckets = new ArrayList[maxFreq+1];
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            Integer value = entry.getKey();
            Integer freq = entry.getValue();
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList();
            }
            buckets[freq].add(value);
        }

        List<Integer> result = new ArrayList<>();
        int i = buckets.length - 1;
        while(i > 0 && result.size() < k){
            if(buckets[i]!= null){
                for(int val: buckets[i]){
                    result.add(val);
                }
            }
            i--;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();


    }
}
