class Solution {
    public int numRescueBoats(int[] people, int limit) {
        //int max = Arrays.stream(people).max().getAsInt();
        int max = people[0];
        for(int i=1; i<people.length; i++){
            max = Math.max(max,people[i]);
        }

        int count[] = new int[max+1];

        for(int p : people){
            count[p++]++;
        }

        int idx = 0;
        for(int i=1; i<=max; i++){
            while(count[i] > 0){
                people[idx++] = i;
                count[i] --;
            }
            
        }

        int l = 0, r = people.length - 1;
        int ans = 0;
        while(l <= r){
            int rem = limit - people[r--];
            ans++;
            if(rem >= people[l])
            rem -= people[l++];
        }

        return ans;
    }
}
// 0, 1, 2, 1 - 1, 2, 2, 3