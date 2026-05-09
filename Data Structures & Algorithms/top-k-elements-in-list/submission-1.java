class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer, Integer> valueToFreqMap = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int value = nums[i];
            valueToFreqMap.put(value, valueToFreqMap.getOrDefault(value, 0)+1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for(int key : valueToFreqMap.keySet()) {
            int freq = valueToFreqMap.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);

        }

        System.out.println(bucket);
            List<Integer> result = new ArrayList<>();
            for ( int i = bucket.length - 1; i>=0 && result.size() < k; i--){
                if (bucket[i] != null)  result.addAll(bucket[i]);
            }

            return result.stream().mapToInt(n -> n).toArray();      
    }
}
