class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int res = 0;
        int[] curr = intervals[0];

        for(int i=1; i<n; i++){
            int[] newi = intervals[i];

            if(curr[1] <= newi[0]){
                curr = newi;
            }
            else if(curr[1] <= newi[1]){
                res++;
            }
            else if(curr[1] > newi[1]){
                curr = newi;
                res++;
            }
            
        }

        return res;
    }
}