class TrieNode {
    HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>(); 
    String word = null;
    public TrieNode() {

    }
}
class Solution {
    char fullBoard[][] = null;
    ArrayList<String> ans = new ArrayList<String>();

    public List<String> findWords(char board[][], String words[]) {
        TrieNode root = new TrieNode();

        for(String word : words) {
            TrieNode node = root;
            for(Character letter : word.toCharArray()) {
                if(node.children.containsKey(letter)) {
                    node = node.children.get(letter);
                } else {
                    TrieNode newNode = new TrieNode();
                    node.children.put(letter, newNode);
                    node = newNode;
                }
            }
            node.word = word;
        }

        this.fullBoard = board;
        
        for(int row =0; row<board.length; row++){
            for(int col=0; col<board[0].length; col++){
               if(root.children.containsKey(board[row][col])){
                   backtracking(row,col,root);
               } 
            }
        }
        
        return ans;
    }

    public void backtracking(int row, int col, TrieNode parent){
        Character letter = fullBoard[row][col];
        TrieNode currNode = parent.children.get(letter);
        
        if(currNode.word != null){
            ans.add(currNode.word);
            currNode.word=null;
        }

        fullBoard[row][col] = '#';
        
        int[] rowOffset = {-1,0,1,0};
        int[] colOffset = {0,1,0,-1};
        
        for(int i=0; i<4; i++){
            int newRow = row + rowOffset[i];
            int newCol = col + colOffset[i];
            
            if(newRow <0 || newCol <0 || newRow >= fullBoard.length || newCol >= fullBoard[0].length){
                continue;
            }

            if(currNode.children.containsKey(fullBoard[newRow][newCol])){
                backtracking(newRow, newCol, currNode);
            }
        }
        
        fullBoard[row][col] = letter;
        
        if(currNode.children.isEmpty()){
            parent.children.remove(letter);
        }
    }    
}
