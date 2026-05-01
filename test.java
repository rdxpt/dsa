import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * t es t
 *
 * Purpose:
 * - DSA practice solution (revision notes at top).
 *
 * Key idea:
 * - Summarize the core trick you used (2â€“3 bullets) after solving once.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: DSA
 */
public class test{
    public static int maxActivated(int[][] points){
        int x = points[0][0];
        int xC = 1;
        int y = points[0][1];
        int yC = points[]
    }
    public static void main(String[] args) {
    }
}

/*
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
 */
