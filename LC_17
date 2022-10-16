class Solution {
    String[] arr = new String[]{"", "", "abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        
        List<String> ans = new ArrayList();
        if(digits.length()==0) return ans;
        helper(digits, 0, new StringBuilder(), ans);
        return ans;
    }
    
    void helper(String digits, int index, StringBuilder sb, List<String> ans ){
        
        if(sb.length()==digits.length()){
            ans.add(sb.toString());
            return;
        }
        
        int arr_index = digits.charAt(index)- '0';
        for( char letter :arr[arr_index].toCharArray()){
            
            sb.append(letter);
            helper(digits, index+1, sb, ans);
            sb.setLength(sb.length()-1);
        }
        
    }
}
