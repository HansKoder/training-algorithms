import java.util.HashMap;

public class Anagram {

    public int getCountAnagram (String[] arrWords, String word) {
        if (arrWords.length == 0 || word.isEmpty()) return 0;

        int count = 0;
        HashMap<Character, Integer> lookUp = new HashMap<>();

        for (int i = 0; i < arrWords.length; i++) {
            String compare = arrWords[i];

            if (compare.length() < word.length()) continue;

            if (word.equalsIgnoreCase(compare)) {
                count++;
                continue;
            }

            for (int l = 0; l < compare.length(); l++) {
                Character character = compare.charAt(l);

                int low = 0;
                int high = word.length() - 1;

                HashMap<Integer, Integer> x = new HashMap<>();

                while (low < high) {
                    if (character.equals(word.charAt(low)) || character.equals(word.charAt(high))) {
                        if (lookUp.getOrDefault(character, 0) > 0) {
                            lookUp.clear();
                        } else {
                            lookUp.put(character, 1);
                        }

                        break;
                    }

                    low++;
                    high--;
                }

                if (lookUp.size() == word.length()) {
                    count++;
                    lookUp.clear();
                }
            }
        }

        return count;
    }

}
