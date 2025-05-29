class Solution {
    public void solve(char[][] board) {
        if(board == null || board.length == 0) {
            return;
        }

        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if((i == 0 || i == board.length-1 || j == 0 || j == board[0].length-1) 
                    && board[i][j] == 'O') {
                    dfs(i, j, board);
                }
            }
        }

        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if(board[i][j] == 'T') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    public void dfs(int row, int col, char board[][]) {
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length
            || board[row][col] != 'O') {
            return;
        }

        board[row][col] = 'T';

        dfs(row + 1, col, board);
        dfs(row, col + 1, board);
        dfs(row - 1, col, board);
        dfs(row, col - 1, board);
    }
}
