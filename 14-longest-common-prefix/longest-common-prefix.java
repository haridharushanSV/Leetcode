class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        String str = strs[0];
        for(int i = 0; i < strs.length; i++) {
            if(str.length() > strs[i].length()) str = strs[i];
        }
        for(int i = 0; i < strs.length; i++) {
            int n = str.length();
            for(int j = 0; j < n; j++) {
                if(str.charAt(j) != strs[i].charAt(j)) {
                    str = str.substring(0, j);
                    break;
                }
            }
            if(str.length() == 0) return "";
        }
        return str;
    }
}