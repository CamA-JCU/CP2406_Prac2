package cp2406;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ch3e4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );   // Create the Scanner.
        System.out.println("Enter one line of text: ");
        String line = scanner.nextLine();
        StringTokenizer tokens = new StringTokenizer(line);
        while (tokens.hasMoreElements()) {
            String str = tokens.nextToken();
            str = filterLetters(str);
            System.out.println(str);
        }
    }

    private static String filterLetters(String str) {
        char[] arr = str.toCharArray();
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (!Character.isLetter(ch)) {
                if (i == 0 || i == arr.length-1){
                    continue;
                }
                if (Character.isLetter(arr[i-1])
                        && Character.isLetter(arr[i+1])) {
                    result = result + ch;
                    continue;
                }
            }
            if (Character.isLetter(ch)) {
                result = result + ch;
                continue;
            }
        }
        return result;
    }

}
