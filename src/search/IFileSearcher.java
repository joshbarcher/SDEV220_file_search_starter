package search;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Represents an object that stores and calculates
 * statistics on basic text files.
 *
 * DO NOT EDIT THIS FILE!
 *
 * @author Josh Archer
 * @version 1.0
 */
public interface IFileSearcher
{
    //searching ******************************

    /**
     * Determines if the file contains a word.
     *
     * @param word the word to search for
     * @return true if the word exists, or
     * otherwise false
     */
    boolean containsWord(String word);

    /**
     * Returns the number of times a word shows
     * up in the file.
     *
     * @param word the word to search for
     * @return the frequency of the word
     */
    int wordCount(String word);

    /**
     * Returns the lines that a word shows up on.
     * @param word the word to search for
     * @return a list of lines from the file with
     * their line numbers
     */
    List<String> wordSearch(String word);

    //access to maps *************************

    /**
     * Returns a Map of the frequency of words in
     * the file.
     *
     * @return a map of word frequencies
     */
    Map<String, Integer> wordFrequecies();

    /**
     * Returns a Map of word to line occurrences.
     *
     * @return a Map of words to a list of
     * lines in the file
     */
    Map<String, List<String>> wordSearches();

    /**
     * Returns a Set of words found in the file.
     *
     * @return a Set of words
     */
    Set<String> words();

    //general details ************************

    /**
     * Returns the number of unique words found in
     * the file.
     *
     * @return the number of unique words
     */
    int uniqueWordsCount();

    /**
     * Returns the number of words found in the file.
     *
     * @return the number of words
     */
    int allWordsCount();
}
