package de.neuefische;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "car",
                "cat",
                "dog",
                "train",
                "car",
                "train",
                "train",
                "snowboarding",
                "ski",
                "ski",
                "car"
        };

        System.out.println(countUniques(words));
        System.out.println(getUniques(words));
    }

    // Schreib eine Funktion, die die Anzahl der Wiederholungen vom jeden einzigartigem Wort zurück gibt.
    public static Map<String, Integer> countUniques (String[] words) {
        Map<String, Integer> counts = new HashMap<>();

        for (String word : words) {
            counts.putIfAbsent(word, 0);
            counts.put(word, counts.get(word) + 1);
        }

        return counts;
    }

    // Schreib eine Funktion, die uns alle Unikaten der Wörter aus einer String Liste gibt.
    public static Set<String> getUniques (String[] words) {
        Set<String> uniques = new HashSet<>();

        for (String word : words) {
            uniques.add(word);
        }

        return uniques;
    }
}