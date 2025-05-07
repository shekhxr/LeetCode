class TrieNode {
    private TrieNode children[];
    private final int R = 26;
    private boolean isEnd;

    public TrieNode() {
        children = new TrieNode[R];
    }

    public boolean containsKey(char ch) {
        return children[ch - 'a'] != null;
    }

    public TrieNode get(char ch) {
        return children[ch - 'a'];
    }

    public void put(char ch, TrieNode node) {
        children[ch - 'a'] = node;
    }

    public void setEnd() {
        isEnd = true;
    }

    public boolean isEnd() {
        return isEnd;
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }    
    
    
    public void insert(String word) {
        TrieNode curr = root;
        for(int i=0;i<word.length();i++) {
            char currChar = word.charAt(i);
            if(!curr.containsKey(currChar)) {
                curr.put(currChar, new TrieNode());
            }
            curr = curr.get(currChar);
        }
        curr.setEnd();
    }
    
    public TrieNode searchPrefix(String word) {
        TrieNode curr = root;
        for(int i=0;i<word.length();i++) {
            char currChar = word.charAt(i);
            if(!curr.containsKey(currChar)) {
                return null;
            }
            curr = curr.get(currChar); 
        }
        return curr;
    }

    public boolean search(String word) {
        TrieNode curr = searchPrefix(word);
        return curr != null && curr.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = searchPrefix(prefix);
        return curr != null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
