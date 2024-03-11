import org.example.PasswordSecurity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordSecurityTest {

    @Test
    @DisplayName("Should be the output equal to 3 since the password 100110, could be all 1 or all 0 without being divided")
    void shouldBeAllOneOrAllZero () {
        PasswordSecurity passwordSecurity = new PasswordSecurity();
        String pwd = "100110";
        assertEquals(3, passwordSecurity.getNumberOfChanges(pwd));
    }

    @Test
    @DisplayName("Should be the output equal to 2 since the password 101011, could be all 1 without being divided")
    void shouldBeAllOne () {
        PasswordSecurity passwordSecurity = new PasswordSecurity();
        String pwd = "101011";
        assertEquals(2, passwordSecurity.getNumberOfChanges(pwd));
    }

    @Test
    @DisplayName("Should be the output equal to 3 since the password 1110011000, It has two substring length 8 of 1 and length 2 of 0, with 3 changes")
    void shouldBeTwoSubstring () {
        PasswordSecurity passwordSecurity = new PasswordSecurity();
        String pwd = "1110011000";
        assertEquals(3, passwordSecurity.getNumberOfChanges(pwd));
    }
}
