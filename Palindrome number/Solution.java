class Solution {
    public boolean isPalindrome(int x) {
        //to check negative numbers
        if(x<0)
        return false;
        //to check palindrome
        int temp=x,reverse=0,carry=0;
        while(temp>0)
        {
            carry = temp%10;
            reverse=(reverse*10)+carry;
            temp/=10;
        }
        return reverse==x;
    }
}
