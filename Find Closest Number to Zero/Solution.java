class Solution {
    public int findClosestNumber(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int x:nums) 
        {
            if(Math.abs(x)<Math.abs(ans))
            {
                ans=x;
            }
            else if (Math.abs(x) == Math.abs(ans) && x > ans)
            {
                ans = x; 
            }
        }
        return ans;
    }
}
