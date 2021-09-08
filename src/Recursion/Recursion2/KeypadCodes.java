package Recursion.Recursion2;

import java.util.ArrayList;

public class KeypadCodes {
    public static void main(String[] args) {
        keypadCode("16","");
    }

    public static String getCode(char ch) {
        return switch (ch) {
            case '1' -> "abc";
            case '2' -> "def";
            case '3' -> "ghi";
            case '4' -> "jk";
            case '5' -> "lmno";
            case '6' -> "pqr";
            case '7' -> "stu";
            case '8' -> "vwx";
            case '9' -> "yz";
            case '0' -> "@#";
            default -> "";
        };
    }

    public static void keypadCode(String ques, String ans) {
        //base case
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        //work
        String ch = getCode(ques.charAt(0));
        String roq = ques.substring(1);
        for (int i = 0; i < ch.length(); i++) {
            char rr = ch.charAt(i);
            keypadCode(roq, ans + rr);
        }
    }

    //Iterative code for Keypad Combination
    public static void KPC2(String str) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("");

        for (int i = 0; i < str.length(); i++) { // 145

            ArrayList<String> nl = new ArrayList<String>();

            String code = getCode(str.charAt(i));

            for (String val : list) { // list // a b c

                for (int j = 0; j < code.length(); j++) { // options
                    nl.add(val + code.charAt(j)); // aj ak bj bk cj ck
                }

            }

            list = nl;
        }

        System.out.println(list);

    }

}
