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
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
        //Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int n = intervals.size();

        for(int i=1; i<n; i++){
            Interval last = intervals.get(i-1);
            Interval curr = intervals.get(i);
            
            if(curr.start < last.end)
            return false;
        }
        return true;
    }
}
