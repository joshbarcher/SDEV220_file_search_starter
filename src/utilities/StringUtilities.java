package utilities;

/**
 * This class contains utility functions for
 * working with strings.
 *
 * @author Josh Archer
 * @version 1.0
 */
public class StringUtilities
{
    /**
     * Removes punctuation and numbers from a given string.
     * @param input the input string to clean
     * @return a string with all punctuation and numbers
     * removed
     */
    public static String cleanString(String input)
    {
        String[] badChars = {"!", ":", ".", ",", "-", "?", "\"", "'",
            "(", ")", "*", "_", "[", "]", "{", "}", "&", "@", "^", "%",
                "$", ";", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (String character : badChars)
        {
            input = input.replace(character, " ");
        }
        return input;
    }
}
