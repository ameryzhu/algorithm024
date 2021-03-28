class Trie {

    class TrieNode {
        Map<Character, TrieNode> next = new HashMap<>();
        boolean isEnd = false;
    }


    TrieNode root = new TrieNode();

    public Trie() {
    }

    public void insert(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            if (!curr.next.containsKey(c)) {
                TrieNode tmp = new TrieNode();
                curr.next.put(c, tmp);
                curr = tmp;
            } else {
                curr = curr.next.get(c);
            }
        }
        curr.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            if (!curr.next.containsKey(c)) return false;
            curr = curr.next.get(c);
        }
        return curr.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for (char c : prefix.toCharArray()) {
            if (!curr.next.containsKey(c)) return false;
            curr = curr.next.get(c);
        }
        return true;
    }

}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
