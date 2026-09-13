class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1)
        return stones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int s : stones){
            pq.offer(s);
        }

        while(pq.size() > 1)
        pq.offer(pq.poll() - pq.poll());

        return pq.poll();

    }
}