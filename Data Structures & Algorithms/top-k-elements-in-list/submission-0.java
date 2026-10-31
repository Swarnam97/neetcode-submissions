class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        int[] res = new int[k];
        for(int i=0; i<nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i],0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a,b) -> Integer.compare(count.get(a),count.get(b)));

        for(int n : count.keySet()){
            heap.add(n);
            if(heap.size() > k)
            heap.poll();
        }

        for(int i=0; i<k; i++){
            res[i] = heap.poll();
        }

        return res;
    }
}
