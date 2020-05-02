package umesh.helperDS;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insertNode(String data) {
        TrieNode nextNode = root;
        Map<Character, TrieNode> location;
        for (int i = 0; i < data.length(); i++) {
            location = nextNode.location;
            nextNode = location.get(data.charAt(i));
            if (nextNode == null) {
                nextNode = new TrieNode(data.charAt(i));
                location.put(data.charAt(i), nextNode);
            }
        }
        nextNode.markWordComplete();
    }

    public void printNode() {
        printNode(root);

    }

    // O(n)
    public List<String> searchByInitial(String initials) {
        TrieNode nextNode = root;
        Map<Character, TrieNode> location;
        for (int i = 0; i < initials.length(); i++) {
            location = nextNode.location;
            nextNode = location.get(initials.charAt(i));
            if (nextNode == null) {
                break;
            }
        }
        List<String> list = new ArrayList<>();
        getEndWord(initials, list, nextNode.location);
        return list;
    }

    // O(n)
    public void getEndWord(String initial, List<String> finalList, Map<Character, TrieNode> location) {
        if (location == null || location.size() == 0) {
            finalList.add(initial);
            return;
        }
        for (
            Entry<Character, TrieNode> entry : location.entrySet()) {
            getEndWord(initial + entry.getKey(), finalList, entry.getValue().location);
        }
    }

    public void printNode(TrieNode nextNode) {
        System.out.println("---------Printing for " + nextNode.value + " ------");
        System.out.println(nextNode.location.keySet());
        System.out.println(nextNode.isWordComplete);
        System.out.println("------------------");
        nextNode.location.forEach((key, value) -> printNode(value));
    }
}
