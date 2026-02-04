class Solution {
    public int[][] generateMatrix(int n) {
        int result[][] = new int[n][n];
        int curr = 1;
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = n - 1;

        while(startRow <= endRow && startCol <= endCol) {
            //Left to Right
            for(int j=startCol; j<= endCol;j++) {
                result[startRow][j] = curr++;
            }

            //Top to Bottom
            for(int i=startRow+1;i<=endRow;i++) {
                result[i][endCol] = curr++;
            }

            //Right to Left
            for(int j=endCol-1;j>=startCol;j--) {
                result[endRow][j] = curr++;
            }

            //Bottom to Top
            for(int i=endRow-1;i>startRow;i--) {
                result[i][startCol] = curr++;
            }

            startRow++; startCol++;endRow--; endCol--;
        }
        return result;
    }
}
