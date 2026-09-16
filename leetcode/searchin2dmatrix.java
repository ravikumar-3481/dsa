package leetcode;

public class searchin2dmatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int startrow = 0 , endrow = m-1;

        while (startrow <= endrow) {
            int midrow = startrow + (endrow - startrow) / 2;
            if (target >= matrix[midrow][0] && target <= matrix[midrow][n-1]) {
                return searchInRow(matrix, target, midrow);
            } else if (target >= matrix[midrow][n-1]) {
                startrow = midrow + 1;
            } else {
                endrow = midrow - 1;
            }
        }

        return false;
    }

    private boolean searchInRow(int[][] matrix, int target, int row) {
        int n = matrix[0].length;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == matrix[row][mid]) {
                return true;
            } else if (target > matrix[row][mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        searchin2dmatrix s2m = new searchin2dmatrix();
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 13, 16, 20},
            {23, 30, 34, 60}
        };
        System.out.println("Searching targer in matrix.....");
        System.out.println(s2m.searchMatrix(matrix, 34));

    }
}

// return true