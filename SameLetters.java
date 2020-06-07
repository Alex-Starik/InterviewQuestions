package InterviewQuestions;
/*
Write a return method that check if a string is build out of the same letters as another string.

Ex:  same("abc",  "cab"); -> true

same("abc",  "abb"); -> false:
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

// Solution1:
public class SameLetters {
    public static void main(String[] args) {
        String str1 = "Moloko";
        String str2 = "oMolkoooo";

        System.out.println(same(str1, str2));
        System.out.println("===================================");
        System.out.println(same1(str1,str2));
    }

    public static boolean same (String str1, String str2){
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String a1="", a2="";

        for (char each : ch1){
            a1+=each;
        }

        for (char each : ch2){
            a2+=each;
        }
            return a1.equals(a2);

    }

    // Solution2:   Works fine if the length of a string are the same!!!
    public static boolean same1 (String str1, String str2){
        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();

        System.out.println(str1);
        System.out.println(str2);

        return str1.equals(str2);
    }
}
