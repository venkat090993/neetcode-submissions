class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freqCount = new HashMap();
        
        for(int num : nums){
            freqCount.put(num, freqCount.getOrDefault(num,0) + 1);
        }

        Integer maxFreq = Integer.MIN_VALUE;

        for(int val : freqCount.values()){
            if(val > maxFreq){
                maxFreq = val;
            }
        }

        List<Integer>[] buckets = new List[maxFreq + 1];

        for(int key: freqCount.keySet()){

            int frequency = freqCount.get(key);

            if(buckets[frequency] != null){
                buckets[frequency].add(key);
            }else{
                buckets[frequency] = new ArrayList();
                buckets[frequency].add(key);
            }
        }

        List<Integer> result = new ArrayList<>();
        
        for(int i = maxFreq; i>=1 && result.size() < k ; i--){
            if(buckets[i] != null){
                for(int num: buckets[i]){
                    result.add(num);
                    if(result.size() == k){
                    break;
                    }
                }
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
