package umesh.codeChallenege;

import umesh.helperDS.Trie;
import umesh.helperDS.TrieNode;

/**
 * <Pre>
 * This problem was asked by Twitter.
 *
 * Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.
 *
 * For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
 *
 * Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.
 * </Pre>
 */
public class DailyCodeChallenge11_d {

    private static String[] givenDictionary = {"dog", "dear", "deal", "death"};

    public static TrieNode addNode(TrieNode parent, Character character, boolean isWordEnd) {
        TrieNode node = parent.location.get(character);
        if (node == null) {
            node = new TrieNode();
            node.isWordComplete = isWordEnd;
            parent.location.put(character, node);
            return node;
        }
        return node;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertNode(givenDictionary[0]);
        trie.insertNode(givenDictionary[1]);
        trie.insertNode(givenDictionary[2]);
        trie.insertNode(givenDictionary[3]);
        //trie.printNode();
        System.out.println(trie.searchByInitial("de"));

    }

}
