/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        TreeMap<Integer,Integer> mp = new TreeMap<>();

        for(Interval i : intervals){
            mp.put(i.start, mp.getOrDefault(i.start,0) + 1);
            mp.put(i.end , mp.getOrDefault(i.end,0) - 1);
        }

        int res = 0;
        int temp = 0;
        for(int key : mp.keySet()){
            temp += mp.get(key);
            res = Math.max(res,temp);
        }
        return res;
    }
}
