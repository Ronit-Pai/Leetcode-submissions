class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length * ( nums.length + 1 ) / 2;
        int new_sum = 0;
        for ( int i = 0; i < nums.length; i++ ){
             new_sum = new_sum + nums[i];
        }
        int res = sum - new_sum;
        return res;
    }
}