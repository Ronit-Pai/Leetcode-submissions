class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        Reverse(nums, 0, n - 1);
        Reverse(nums, 0, k - 1);
        Reverse(nums, k, n - 1);
        return;
    }
    void Reverse(int[] nums, int a, int b) {
        while (b > a) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
        return;
    }
}