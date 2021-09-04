package cp2406;

/*
The hexadecimal digits are the ordinary, base-10 digits '0' through '9'
plus the letters 'A' through 'F'.
In the hexadecimal system, these digits represent the values 0 through 15,
 respectively. Write a function named hexValue that uses a switch
 statement to find the hexadecimal value of a given character.
 The character is a parameter to the function, and its hexadecimal
 value is the return value of the function. You should count lower
 case letters 'a' through 'f' as having the same value as the
 corresponding upper case letters. If the parameter is not one of
 the legal hexadecimal digits, return -1 as the value of the function.

A hexadecimal integer is a sequence of hexadecimal digits,
such as 34A7, ff8, 174204, or FADE. If str is a string containing a
hexadecimal integer, then the corresponding base-10 integer can be
computed as follows:

value = 0;
for ( i = 0; i < str.length();  i++ )
   value = value*16 + hexValue( str.charAt(i) );
Of course, this is not valid if str contains any characters that
are not hexadecimal digits. Write a program that reads a string from
the user. If all the characters in the string are hexadecimal digits,
print out the corresponding base-10 value. If not, print out an error
message.


 */

import java.util.Scanner;

public class Ch4e2 {
    public static void main(String[] args) {
        String hex;
        long dec = 0;
        Scanner scanner = new Scanner( System.in );   // Create the Scanner.
        System.out.println("Enter a hexadecimal number: ");
        hex = scanner.nextLine();
        for (int i = 0; i < hex.length(); i++) {
            int digit = hexValue(hex.charAt(i));
            if (digit == -1) {
                System.out.println("Error: Input is not hexadecimal number");
                return;
            }
            dec = 16*dec + digit;
        }
        System.out.println("Base-10 value: " + dec);
    }   // end main

    private static int hexValue(char ch) {
        ch = Character.toLowerCase(ch); // 'A' to 'a'
        if (Character.isDigit(ch)){
            return Integer.parseInt("" + ch);
        }
        switch(ch) {
            case 'a':
                return 10;
            case 'b':
                return 11;
            case 'c':
                return 12;
            case 'd':
                return 13;
            case 'e':
                return 14;
            case 'f':
                return 15;
            default:
                return -1;
        }
    }   // end hexValue
}
