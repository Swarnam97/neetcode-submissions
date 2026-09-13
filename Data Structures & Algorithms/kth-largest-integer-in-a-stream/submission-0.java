class KthLargest {
    PriorityQueue<Integer> min = new PriorityQueue<>();
    int K;

    public KthLargest(int k, int[] nums) {
        K = k;
        for(int n : nums){
            min.offer(n);
            if(min.size() > K){
            min.poll();
        }
        }

    }
    
    public int add(int val) {
        min.add(val);
        while(min.size() > K){
            min.poll();
        }
        return min.peek();
    }
}
