package umesh.helperDS;

import java.util.HashMap;
import java.util.Map;


public class TrieNode {

    public Character value;
    public Map<Character, TrieNode> location;
    public Boolean isWordComplete = false;

    public void markWordComplete() {
        this.isWordComplete = true;
    }

    public TrieNode(Character value) {
        this.value = value;
        location = new HashMap<>();
    }

    public TrieNode() {
        location = new HashMap<>();
    }
}
