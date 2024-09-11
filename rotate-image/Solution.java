class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        Queue<Integer> queue = new LinkedList<>();

       for(int i=0;i<col;i++)
        {
            for(int j=row-1;j>=0;j--)
            {
                queue.add(matrix[j][i]);
            }
        }

        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
               matrix[i][j]=queue.remove();
            }
        }

    }
}
