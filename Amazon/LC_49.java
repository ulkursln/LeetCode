class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap();
        
        for(String str: strs){
            int[] chars = new int[26];
            for(char ch: str.toCharArray()){
                chars[ch-'a']++;
            }
            
            StringBuilder key = new StringBuilder();
            for(int ch: chars){
                key.append(ch); key.append("-");
            }
            
            List<String> anagrams = map.getOrDefault(key.toString(), new ArrayList());
            anagrams.add(str);
            map.put(key.toString(), anagrams);
        }
        
        //List<List<String>> ans = new ArrayList();
        //for(String key: map.keySet()){
            //ans.add(map.get(key));
        //}
        //return ans;
        
        
        //instead short way
        return new ArrayList(map.values());
        
    }
}
