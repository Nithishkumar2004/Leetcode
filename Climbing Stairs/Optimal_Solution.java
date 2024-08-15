class Solution {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        // Calculate the golden ratio (phi) and its conjugate (psi)
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;
        
        // Apply Binet's formula adjusted for the standard Fibonacci sequence
        double fib = (Math.pow(phi, n+1) - Math.pow(psi, n+1)) / Math.sqrt(5);

        // Round to the nearest integer since the result should be an integer
        return (int)Math.round(fib);
    }
}
