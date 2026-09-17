class Solution {
    
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> min = new PriorityQueue<>
        ((a,b) -> Integer.compare(b[0],a[0]));

        for(int i=0; i<points.length; i++){
            int x = points[i][0];
            int y = points[i][1];
            int dis = x*x + y*y;
            min.add(new int[]{dis,i});
            if(min.size() > k)
            min.poll();
        }

        int[][] res = new int[k][2];
        int i =0;
        while(min.size() > 0){
            int[] t = min.poll();
            res[i++] = new int[]{points[t[1]][0],points[t[1]][1]};
        }

        return res;
    }
}