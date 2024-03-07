import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramTest {

    @Test
    @DisplayName("should get twice since there two words are anagram with the word listen")
    void should () {
        String[] words = new String[] {"silent", "play", "hello_listen_to_me", "other"};

        Anagram anagram = new Anagram();
        assertEquals(2, anagram.getCountAnagram(words, "listen"));
    }

}
