class Solution {

    int check(int[] weights, int cap){
        int max = cap, day = 1;
        for(int weight : weights){
                if(cap - weight < 0 )
                {
                    day++;
                    cap = max;
                }
                cap -= weight;
        }
        
        return day;
    }

    public int shipWithinDays(int[] weights, int days) {
        int max = weights[0], sum = 0;

        for(int weight : weights){
            max = Math.max(max,weight);
            sum += weight;
        }
        
        int l = max, h = sum, ans = sum;
        while(l <= h){
            int mid = l + (h-l)/2;
            int day = check(weights,mid);
            if(day > days)
                l = mid + 1;
            else{
                ans = Math.min(ans,mid);
                h = mid - 1;
            } 
              
        }

         return ans;   
        
    }
}

// 10 
// 1,2,3,4 ...5..6..   --- 
//11. -- 1,2,3,4,....5,6..
//12. ---- 