package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

/*
Write a return  method that can find the unique characters from the String

Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */
public class FindTheUnique {

    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println(Unique(str));
        System.out.println("==================================");
        System.out.println(Unique2(str));
        System.out.println("==================================");
        System.out.println(Unique3(str));
    }

    public static String Unique (String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++){
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static String Unique2 (String str){
        String [] arr = str.split("");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++){
                if (arr[i].equals(arr[j])){
                    count++;
                }
            }
            if(count==1){
                result += arr[i];
            }
        }
        return result;
    }

    public static String Unique3 (String str) {
        String result = "";
        for (String each : str.split("")) {
            result += (Collections.frequency(Arrays.asList(str.split("")), each) == 1) ? each : "";
        }
        return result;
    }
}
