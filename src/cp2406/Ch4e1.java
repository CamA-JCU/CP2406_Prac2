package cp2406;

/*
To "capitalize" a string means to change the first letter of each word in the string to upper case
(if it is not already upper case). For example, a capitalized version of
 "Now is the time to act!" is "Now Is The Time To Act!".
 Write a subroutine named printCapitalized that will print a capitalized version of a string to standard output.
 The string to be printed should be a parameter to the subroutine. Test your subroutine with a main() routine that
  gets a line of input from the user and applies the subroutine to it.

Note that a letter is the first letter of a word if it is not immediately preceded in the string by another letter.
Recall from Exercise 3.4 that there is a standard boolean-valued function Character.isLetter(char) that can be used
to test whether its parameter is a letter. There is another standard char-valued function, Character.toUpperCase(char),
 that returns a capitalized version of the single character passed to it as a parameter.
 That is, if the parameter is a letter, it returns the upper-case version.
 If the parameter is not a letter, it just returns a copy of the parameter.
 */

import java.util.Scanner;

public class Ch4e1 {
    public static void main(String[] args) {
        String result;
        Scanner scanner = new Scanner( System.in );   // Create the Scanner.
        System.out.println("Enter one line of text: ");
        String line = scanner.nextLine();
//        System.out.println(line);
        result = printCapitalized(line);
        System.out.println(result);
    }   // end of main()

    public static String printCapitalized(String str) {
        char[] arr = str.toCharArray();
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (i == 0) {
                if (Character.isLetter(ch)) {
                    ch = Character.toUpperCase(ch);
                }
            } else {
                if (Character.isSpaceChar(arr[i-1]) && Character.isLetter(ch)) {
                    ch = Character.toUpperCase(ch);
                }
            }
            result += ch;
        }
        return result;
    }  // end of printCapitalized()
}
