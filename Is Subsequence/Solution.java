class Solution {
    public boolean isSubsequence(String s, String t) {
      int i=0,j;
      for(j=0; j<t.length() && i<s.length() ;j++)
      {
        char a = s.charAt(i);
        char b = t.charAt(j);
        if(a==b)
        {
            i++;
        }
      }
      if(i==s.length())
        {
            return true;
        }
        return false;
    }
}
