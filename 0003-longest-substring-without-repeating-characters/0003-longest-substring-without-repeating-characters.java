class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        int i=0, j=0;
        Set<Character> st = new HashSet<Character>();
        int res = 0;
        while(j<s.length() && i<s.length()){
            if(!st.contains(s.charAt(j))){
                st.add(s.charAt(j));
                res = Math.max(res, j-i);
                j++;
            }else{
                st.remove(s.charAt(i));
                i++;
            }
        }
        return res+1;
    }
}