package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfChar4 {
    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(FrequencyOfChar(str));
    }

    public static String FrequencyOfChar (String str) {
        String nonDup="", result="";

        for (int i = 0; i < str.length(); i++){
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup += str.charAt(i);
            }
        }
        for (int i = 0; i < nonDup.length(); i++){
            int num = Collections.frequency(Arrays.asList(str.split("")), ""+nonDup.charAt(i));
            result += ""+nonDup.charAt(i)+num;
        }
        return result;
    }
}

