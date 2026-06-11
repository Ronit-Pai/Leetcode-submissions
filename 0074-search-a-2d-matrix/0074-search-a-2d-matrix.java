class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        return search(matrix, 0, m * n - 1, target, n);
    }

    private boolean search(int[][] matrix, int left, int right, int target, int cols) {
        if (left > right) {
            return false;
        }

        int mid = left + (right - left) / 2;
        int row = mid / cols;
        int col = mid % cols;

        if (matrix[row][col] == target) {
            return true;
        } else if (matrix[row][col] > target) {
            return search(matrix, left, mid - 1, target, cols);
        } else {
            return search(matrix, mid + 1, right, target, cols);
        }
    }
}