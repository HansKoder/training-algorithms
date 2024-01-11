package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Solution {

    public int similarPassword (String word) {
        int countOfVowels = 0; // 1

        List<Integer> vowels = Arrays
                .asList('a', 'e','i','o','u')
                .stream().map(x -> x - 96)
                .collect(Collectors.toList());

        // Loop for counting vowels
        BiPredicate<Integer, List<Integer>> isVowel = (v, l) -> l.stream().anyMatch(i -> i.equals(v));
        for (char character : word.toCharArray()) if (isVowel.test(character - 96, vowels))  countOfVowels++;

        int countOfConsonants = word.length() - countOfVowels;
        int count = 0;

        // Loop for turning into a vowel
        for (char character : word.toCharArray()){
            if (character == 'z' || isVowel.test(character - 96, vowels)) continue;

            Integer increased = (character - 96) + 1;
            if (isVowel.test(increased, vowels)) {
                count++;
                if ( (countOfVowels + count) >= (countOfConsonants - count)) return count;

            }
        }

        return -1;
    }

}
