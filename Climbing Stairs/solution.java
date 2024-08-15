class Solution {
    public int climbStairs(int n) {
        //the problem simply resembles the fibonacci sequence
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int current = first + second;
            first = second;
            second = current;
        }
        return second;
    }
}
