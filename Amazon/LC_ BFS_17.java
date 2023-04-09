class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList();
        String[] letters = new String[]{"","","abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        Queue<String> q = new LinkedList();
        
        q.add("");
        int index = 0;
        while(index<digits.length()){
            int size = q.size();
            while(size-->0){
                String prefix = q.poll();
                char arr_index = digits.charAt(index);
                for(char suffix: letters[arr_index - '0'].toCharArray())
                    q.offer(prefix+suffix);
            }
            index++;
        }
  
        return new ArrayList(q);
        
    }
}
