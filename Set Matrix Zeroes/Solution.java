class Solution {
    public void setZeroes(int[][] matrix) {
        
        int c = matrix[0].length;
        int r = matrix.length;
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                row.add(i);
                col.add(j);
                }
            }
        }
        for(int x:row)
        {
            for(int i=0;i<c;i++)
            {
                matrix[x][i]=0;
            }
        }
        for(int y:col)
        {
            for(int i=0;i<r;i++)
            {
                matrix[i][y]=0;
            }
        }
    }
}
