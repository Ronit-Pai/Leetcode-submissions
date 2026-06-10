class Solution {

    public boolean binarySearch(int[] arr, int k) {
        return search(arr, 0, arr.length - 1, k);
    }

    private boolean search(int[] arr, int left, int right, int k) {
        if (left > right) {
            return false; 
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == k) {
            return true;
        } else if (arr[mid] > k) {
            return search(arr, left, mid - 1, k);
        } else {
            return search(arr, mid + 1, right, k);
        }
    }
}