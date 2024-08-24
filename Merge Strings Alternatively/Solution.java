class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int a=0,b=0;
        StringBuilder merged = new StringBuilder();
        while(a<len1&&b<len2)
        {
            merged.append(word1.charAt(a++));
            merged.append(word2.charAt(b++));
        }
        while(a<len1)
        {
            merged.append(word1.charAt(a++));
        }
        while(b<len2)
        {
            merged.append(word2.charAt(b++));
        }

        return merged.toString();
    }
}
