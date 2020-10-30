package com.rakovets.course.javabasics.wordsMonitoring;

import java.util.*;

public class TextMonitoring {
    public int getCountUniqueWords(HashMap<String, Integer> map) {
        int numberOfUniqueWords = 0;
        for (Map.Entry<String, Integer> word : map.entrySet()) {
            if (word.getValue() == 1) {
                numberOfUniqueWords += 1;
            }
        }
        return numberOfUniqueWords;
    }

    public Collection<String> getUniqueWords(HashMap<String, Integer> map) {
        HashMap<String, Integer> uniqueWords = new HashMap<>();
        for (Map.Entry<String, Integer> word : map.entrySet()) {
            if (word.getValue() == 1) {
                uniqueWords.put(word.getKey(), word.getValue());
            }
        }
        Collection<String> uniqueWordsOnly = uniqueWords.keySet();
        return uniqueWordsOnly;
    }

    public int getWord(HashMap<String, Integer> map, String word) {
        return map.get(word);
    }
    public Map<String, Integer> getWordFrequencyDesc(boolean isAscendingFrequency, HashMap<String, Integer> map) {

        return null;
    }
}
