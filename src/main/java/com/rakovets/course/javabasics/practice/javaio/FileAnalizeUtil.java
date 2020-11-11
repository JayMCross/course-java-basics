package com.rakovets.course.javabasics.practice.javaio;


import java.io.*;
import java.util.*;

public class FileAnalizeUtil {
    public List<String> listOfStringsFromFile(String filePath) throws IOException {
        List<String> list = new LinkedList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String string = bufferedReader.readLine();
            while (bufferedReader.ready()) {
                list.add(string);
            }
        }
        return list;
    }

    public List<String> listOfWordsThatStartWithAVowel(String filePath) throws IOException {
        List<String> list = new LinkedList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            char[] vowelChars = new char[]{'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
            String string = new String();
            int ch = bufferedReader.read();
            while (ch != -1) {
                string += (char) ch;
            }
            string = string.trim();
            for (String word : string.split(" ")) {
                for (char vowel : vowelChars) {
                    if (word.charAt(0) == vowel) {
                        list.add(word);
                    }
                }
            }
        }
        return list;
    }

    public List<String> wordsLastCharIsTheSameAsFirstCharOfTheNext(String filePath) throws IOException {
        List<String> list = new LinkedList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String string = new String();
            int ch = bufferedReader.read();
            while (ch != -1) {
                string += (char) ch;
            }
            string = string.trim();
            String[] word = string.split(" ");
            for (int i = 0; i < word.length; i++) {
                if ((word[i] != "") && (word[i + 1] != "")) {
                    int wordLength = word[i].length();
                    if (word[i].charAt(wordLength - 1) == word[i + 1].charAt(0)) {
                        list.add(word[i]);
                    }
                }
            }
        }
        return list;
    }

    public void sortInts(String filePath) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, false))) {
            StringBuilder stringBuilder = new StringBuilder();
            int ch = bufferedReader.read();
            while (ch != -1) {
                stringBuilder.append((char) ch);
            }
            String string = stringBuilder.toString();
            if ((string != null) && (string != "")) {
                String[] sep = string.trim().split(" ");
                int[] ints = new int[sep.length];
                for (int i = 0; i < ints.length; i++) {
                    ints[i] = Integer.parseInt(sep[i]);
                }
                Arrays.sort(ints);
                for (int num : ints) {
                    bufferedWriter.write(num + ", ");
                    bufferedWriter.flush();
                }
            }
        }
    }

    public Map<Character, Integer> lettersFrequency(String filePath) throws IOException {
        HashMap<Character, Integer> map = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    Integer val = map.get(c);
                    if (val != null) {
                        map.put(c, val + 1);
                    } else {
                        map.put(c, 1);
                    }
                }
            }
        }
        return map;
    }

    public Map<String, Integer> wordsFrequency(String filePath) {
        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line = bufferedReader.readLine();
            for (String w : line) {
                Integer n = map.get(w);
                n = (n == null) ? 1 : ++n;
                map.put(w, n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
