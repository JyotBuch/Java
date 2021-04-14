//Code to https://leetcode.com/problems/reverse-integer/

class Solution {
    public int reverse(int x) {
       boolean posneg = (x < 0) ? true : false; 
        long rev = 0;
        x = Math.abs(x);
        while (x > 0){

            rev *= 10; 
            rev += (x % 10); 
            x /= 10;
        }
        if (posneg) rev *= -1;

        if ((Integer.MIN_VALUE <= rev) && (rev <= Integer.MAX_VALUE))
            return (int)rev;

        else 
            return 0;
    }
}
