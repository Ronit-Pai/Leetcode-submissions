class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int neg = 1, i = 0;
        long num = 0;

        if ( s.length() == 0)
            return 0;
        if ( s.charAt(0) == '-'){
            neg = -1;
            i++;
        } else if ( s.charAt(0) == '+') {
            i++;
        } else {

        }
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') 
                break; 

            num = num * 10 + (ch - '0'); 
            if (neg * num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE; 
            if (neg * num < Integer.MIN_VALUE) 
                return Integer.MIN_VALUE;

            i++;
        }
        return (int) (neg * num);
    }
}