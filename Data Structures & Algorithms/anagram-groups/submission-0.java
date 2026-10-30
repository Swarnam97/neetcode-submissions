class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s : strs){
           int[] count = new int[26];

           for(int i=0; i<s.length(); i++)
           count[s.charAt(i) - 'a'] ++;

           map.putIfAbsent(Arrays.toString(count),new ArrayList<>());
           map.get(Arrays.toString(count)).add(s);
        }

        return new ArrayList<>(map.values());
    }
}