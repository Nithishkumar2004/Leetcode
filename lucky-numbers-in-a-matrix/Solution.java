class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
      
        List<Integer> luckyNumbers = new ArrayList<>();
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        // Step 1: Find minimum values in each row and their column indices
        int[] minInRows = new int[numRows];
        // Column index of the min value in each row
        int[] minInRowsColIndex = new int[numRows]; 

        for (int i = 0; i < numRows; i++) {
            int minValue = Integer.MAX_VALUE;
            int minValueColIndex = -1;
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                    minValueColIndex = j;
                }
            }
            minInRows[i] = minValue;
            minInRowsColIndex[i] = minValueColIndex;
        }

        // Step 2: Find maximum values in each column
        int[] maxInCols = new int[numCols];

        for (int j = 0; j < numCols; j++) {
            int maxValue = Integer.MIN_VALUE;
            for (int i = 0; i < numRows; i++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
            maxInCols[j] = maxValue;
        }

        // Step 3: Determine which row minimums are also column maximums
        for (int i = 0; i < numRows; i++) {
            int rowMinValue = minInRows[i];
            int colIndex = minInRowsColIndex[i];
            if (rowMinValue == maxInCols[colIndex]) {
                luckyNumbers.add(rowMinValue);
            }
        }

        return luckyNumbers;
    }
}
