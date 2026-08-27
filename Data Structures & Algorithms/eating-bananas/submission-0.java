class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i=0; i<piles.length; i++)
        max = Math.max(piles[i], max);

        int l = 1, r = max, res = max;
        while(l<=r){
            int mid = l + (r-l)/2;
            long time = 0;
            for(int p : piles){
                time += (p + mid - 1) / mid;
            }
                if(time <=h ){
                    res = mid;
                    r = mid - 1;
                }
                else
                l = mid +1;
        }

        return res;
    }
}