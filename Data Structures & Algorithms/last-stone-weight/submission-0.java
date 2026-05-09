class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b - a);
        for(int i : stones){
            pq.offer(i);
        }
        while(pq.size() > 1){
            int stone1 = pq.poll();
            int stone2 = pq.poll();
            int standing_weight = stone1 - stone2;
            pq.offer(standing_weight);
        }

        return pq.peek();
    }
}
