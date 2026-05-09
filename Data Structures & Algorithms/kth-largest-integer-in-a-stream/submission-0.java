
public class KthLargest {

    int size;
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        this.size = k;
        for(int i : nums){
            this.add(i);
        }
    }

    public int add(int val) {
        if(priorityQueue.size() < size){
            priorityQueue.offer(val);
            return priorityQueue.peek();
        }

        if(priorityQueue.peek() < val){
            priorityQueue.poll();
            priorityQueue.offer(val);
        }

        return priorityQueue.peek();
    }
}
