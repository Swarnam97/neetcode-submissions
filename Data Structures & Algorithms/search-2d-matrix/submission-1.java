class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0, r = m*n-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            int ro = mid/n;
            int c = mid%n;
            if(matrix[ro][c] < target)
            l = mid +1;
            else if(matrix[ro][c] > target)
            r = mid - 1;
            else
            return true;
        }

        return false;
    }
}