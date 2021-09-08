package Recursion.Recursion2;

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
}
