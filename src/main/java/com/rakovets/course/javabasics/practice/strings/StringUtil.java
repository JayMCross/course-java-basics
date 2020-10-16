package com.rakovets.course.javabasics.practice.strings;

public class StringUtil {
    public static void main(String[] args) {
        System.out.println(getConcat());
        System.out.println(getequals(String string));
    }
    String getConcat() { // таск 1 конкатенация/ join(объединение) +
     String str1 = "Hello";
     String str2 = "Dmitry Rakovets";
     String str3 = String.join(" ", str1, str2);
     System.out.println(str3);
 }
    void index() { // таск 2 поиск быквы +
     String foundx = "this sentense include x";
     int index = foundx.indexOf('x');
     System.out.println("Индекс данной буквы: " + index);
    }
     String getequals() { // таск 3 сравнение двух строк equals(без учета регистра) +
        String str1 = "ORDINARY WORD";
        String str2 = "ordinary word";
        System.out.println(str1.equals(str2));
    }
    void trim() { // таск 4 trim и UpperCase +
        String str = " Java Basic ";
        str = str.trim();
        System.out.println(str.toUpperCase());
    }
    void getChars() { // таск 5 +
        String str = "два фламинго стоят на тонких ногах";
        int start = 10;
        int end = 32;
        char[] dst = new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst);
    }
    void replace() { // таск 6 замена +
        String str = "Listen joy division - it is :( :( :(";
        String replStr1 = str.replace(":(", ":)");
        System.out.println(replStr1);
    }



}


