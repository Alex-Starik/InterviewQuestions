package InterviewQuestions;
/*
Write a return method that can remove the duplicated values from String

Ex:  removeDup("AAABBBCCC")  ==> ABC
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

// Solution1:
public class RemoveDuplicates {

    public static void main(String[] args) {


        String str = "AAABBBCCC";
        String NonDup = "";

        for (int i = 0; i < str.length(); i++){
            if (!NonDup.contains(""+str.charAt(i))){
                NonDup += str.charAt(i);
            }
        }

        System.out.println(NonDup);
        System.out.println("================================");
    }
}

//Solution2:
class RemoveDuplicates2 {
    public static void main(String[] args) {
        String str = "AAABBBCCC";

        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(",", "").replace("[", "").replace("]", "").replace(" ", "");

        System.out.println(str);
    }
}
