class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        if (length == 0) 
        {
            return "";
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[length - 1];
        int minLength = Math.min(first.length(), last.length());
        int i;
        for (i = 0; i < minLength; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
        }
        return first.substring(0, i);
    }
}
