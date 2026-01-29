/**
 * I mp le me nt Tr ie
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Use recursion (DFS) or iterative traversal; watch for null/base cases.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: Tree
 */
package problem75LC;

public class ImplementTrie {
    private TrieNode root;
    public ImplementTrie() {
        root = new TrieNode();
    }
    private class TrieNode {
        private TrieNode[] children;
        private boolean isWord;

        public TrieNode(){
            this.children = new TrieNode[26];
            this.isWord = false;
        }
    }
    
    public void insert(String word) {
        if(word == null || word.isEmpty()) return;
        word = word.toLowerCase();
        TrieNode current = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(current.children[c-'a']== null){
                current.children[c-'a'] = new TrieNode();
            }
            current = current.children[c-'a']
        }
        current.isWord = true;

    }
    
    public boolean search(String word) {
        if(word==null | word.isEmpty()) return false;
        word = word.toLowerCase();
        TrieNode current = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            int index = c-'a';
            if(current.children[index]==null)return false;
            else current = current.children[index];
        }
        return current.isWord;
    }
    
    public boolean startsWith(String prefix) {
        if(prefix==null | prefix.isEmpty()) return false;
        prefix = prefix.toLowerCase();
        TrieNode current = root;
        for(int i=0; i<prefix.length(); i++){
            char c = prefix.charAt(i);
            int index = c-'a';
            if(current.children[index]==null)return false;
            else current = current.children[index];
        }
        return true;
    }
}

