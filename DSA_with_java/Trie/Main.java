import java.util.*;

class Node {
    Node[] children;
    boolean isEnd;

    public Node() {
        children = new Node[26];
        isEnd = false;
    }
}

class Trie {

    private Node root;

    public Trie() {
        root = new Node();
    }

    // INSERT
    public void insert(String word) {
        Node temp = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (temp.children[index] == null) {
                temp.children[index] = new Node();
            }

            temp = temp.children[index];
        }

        temp.isEnd = true;
    }

    // SEARCH
    public boolean search(String word) {
        Node temp = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (temp.children[index] == null) {
                return false;
            }

            temp = temp.children[index];
        }

        return temp.isEnd;
    }

    // PREFIX CHECK
    public boolean startsWith(String prefix) {
        Node temp = root;

        for (char c : prefix.toCharArray()) {
            int index = c - 'a';

            if (temp.children[index] == null) {
                return false;
            }

            temp = temp.children[index];
        }

        return true;
    }

    // COLLECT ALL WORDS
    private void collectAllWords(Node node, String current, List<String> result) {

        if (node.isEnd) {
            result.add(current);
        }

        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                char ch = (char) ('a' + i);
                collectAllWords(node.children[i], current + ch, result);
            }
        }
    }

    // AUTOCOMPLETE (FIXED)
    public List<String> autocomplete(String prefix) {

        Node temp = root;

        for (char c : prefix.toCharArray()) {
            int index = c - 'a';

            if (temp.children[index] == null) {
                return new ArrayList<>();
            }

            temp = temp.children[index];
        }

        List<String> result = new ArrayList<>();
        collectAllWords(temp, prefix, result);

        return result;
    }
}

public class Main{
    public static void main(String[] args) {
        Trie t1 = new Trie();
    }
}