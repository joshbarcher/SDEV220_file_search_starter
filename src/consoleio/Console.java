package consoleio;

import java.util.Scanner;

/**
 * A helper class for writing Java console programs.
 *
 * @author Josh Archer
 * @version 1.0
 */
public class Console
{
    private static Scanner console = new Scanner(System.in);

    /**
     * Reads a single line from the console.
     * @param prompt the prompt to show the user
     * @return a line of text
     */
    public static String readLine(String prompt)
    {
        System.out.print(prompt);
        return console.nextLine();
    }

    /**
     * Reads a single integer from the console.
     * @param prompt the prompt to show the user
     * @return an integer
     */
    public static int readInt(String prompt)
    {
        System.out.print(prompt);
        while (!console.hasNextInt())
        {
            System.out.print(prompt);
            console.nextLine(); //clear the new line...
        }

        int result = console.nextInt();
        console.nextLine(); //clear the new line...
        return result;
    }

    /**
     * Reads a single double from the console.
     * @param prompt the prompt to show the user
     * @return a double
     */
    public static double readDouble(String prompt)
    {
        System.out.print(prompt);
        while (!console.hasNextDouble())
        {
            System.out.print(prompt);
            console.nextLine(); //clear the new line...
        }

        double result = console.nextDouble();
        console.nextLine(); //clear the new line...
        return result;
    }

    /**
     * Reads a single boolean from the console.
     * @param prompt the prompt to show the user
     * @return a boolean
     */
    public static boolean readBoolean(String prompt)
    {
        System.out.print(prompt);
        while (!console.hasNextBoolean())
        {
            System.out.print(prompt);
            console.nextLine(); //clear the new line...
        }

        boolean result = console.nextBoolean();
        console.nextLine(); //clear the new line...
        return result;
    }
}