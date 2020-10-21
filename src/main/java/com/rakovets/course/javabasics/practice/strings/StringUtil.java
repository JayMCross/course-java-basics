package com.rakovets.course.javabasics.practice.strings;

public class StringUtil {
    public static void main(String[] args) {

    }

    public String stringAddition(String str1, String str2) {
        String str3 = str1.concat(str2);
        return str3;
    }

    public int stringIndex(String str, String symbol) {
        return str.indexOf(symbol);
    }

    public boolean ifEqual(String str1, String str2) {
        return str1.equals(str2);
    }

    public String trimmedUpper(String str) {
        return str.trim().toUpperCase();
    }

    public String substringFrom10(String str) {
        if (str.length() < 10) {
            return "the string does not have enough characters";
        }
        String str2 = str.substring(10);
        if (str2.length() > 23) {
            str2 = str2.substring(0, 23);
        }
        return str2;
    }

    public String smileReplacement(String str) {
        return str.replace(":(", ":)");
    }

    public boolean ifFirstAndFinal(String str, String word) {
        if (str.startsWith(word) && str.endsWith(word)) {
            return true;
        }
        return false;
    }


    public String ifPalindrome(String str) {
        String response = new String();
        StringBuilder strRev = new StringBuilder();
        strRev.append(str);
        strRev = strRev.reverse();
        if (str.equalsIgnoreCase(String.valueOf(strRev))) {
            response = "is palindrome";
        } else {
            response = "not palindrome";
        }
        return response;
    }

    public String[] stringSplitting(String str, int devisor) {

        int devisedPartsCol = str.length() / devisor;
        if (str.length() % devisor != 0) {
            devisedPartsCol++;
        }
        String[] splittedStrArr = new String[devisedPartsCol];
        for (int i = 0; i < devisedPartsCol; i++) {
            splittedStrArr[i] = str.substring(i * devisor, (i + 1) * devisor);
        }
        return splittedStrArr;
    }

    public int howManyWords(String str) {
        int counter = 0;
        if (str.length() != 0) {
            counter++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                    counter++;
                }
            }
        }
        return counter;
    }
}


