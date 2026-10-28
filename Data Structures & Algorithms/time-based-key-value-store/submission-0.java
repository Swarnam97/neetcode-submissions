class TimeMap {

    class TimeValue {
        public String val;
        int time;

        public TimeValue(int timestamp, String val){
            this.time = timestamp;
            this.val = val;
        }
    }

    HashMap<String, ArrayList<TimeValue>> entries;

    public TimeMap() {
        entries = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {

        if(!entries.containsKey(key)){
            entries.put(key, new ArrayList<>());
        }

        ArrayList<TimeValue> arr = entries.get(key);
        arr.add(new TimeValue(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!entries.containsKey(key))
        return "";

        ArrayList<TimeValue> timeStamps = entries.get(key);
        TimeValue t = binarySearch(timeStamps,timestamp);

        if(t.time == -1)
        return "";

        return t.val;
    }

    private TimeValue binarySearch(ArrayList<TimeValue>arr, int target){
        int l = 0, r = arr.size() - 1;
        int ind = -1;

        while(l <= r){
            int m = l + (r-l)/2;
            TimeValue t = arr.get(m);

            if(t.time <= target){
                ind = m;
                l = m+1;
            }
            else
            r = m -1;
        }
        
        if(ind == -1)
        return new TimeValue(-1,"");

        return arr.get(ind);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */