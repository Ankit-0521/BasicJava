package ANDROID;

import java.util.Scanner;

public class check_vowel {
    public static void main(String[] args) {
      // boolean isVowel = false;
        Scanner h = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = h.next().charAt(0);
       /* switch (ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : isVowel = true;

        }
        if (isVowel == true)
        {
            System.out.println(ch+ " is Vowel ");
        }
        else {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                System.out.println(ch+ " is constant");
            else
                System.out.println(" character is not an alphabet");

        }

        */

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is Vowel");
                break;

            default:
                System.out.println(ch+ " is consonent");

        }
    }
}