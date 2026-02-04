class Solution {
    public void rotate(int[][] matrix) {
        //Step 1 - Transpose the array
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<i;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Step 2 - Reverse every single row
        for (int i = 0; i < matrix.length; i++) {
            int low = 0;
            int high = matrix[0].length - 1;

            while(low < high) {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++; high--;
            }
        }
    }
}
