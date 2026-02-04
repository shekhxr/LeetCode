class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        //Step 1 - Put 1 at the beginning of every row
        for(int i=0;i<m;i++) {
            if(grid[i][0] == 0) {
                for(int j=0;j<grid[0].length;j++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }

        //Step 2 - Flip those columns where(No. of 0s > No. of 1s)
        for(int j=1;j<n;j++) {
            int zeroes = 0, ones = 0;
            for(int i=0;i<m;i++) {
                if(grid[i][j] == 0) zeroes++;
                else ones++;
            }

            if(zeroes > ones) {
                for(int i=0;i<m;i++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }

        //Step 3 - Calculate Score
        int score = 0;
        int x = 1;
        for(int j=n-1;j>=0;j--) {
            for(int i=0;i<m;i++) {
                score += grid[i][j] * x;
            }

            x *= 2;
        }

        return score;
    }
}
