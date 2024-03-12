package org.example;

public class PasswordSecurity {

    public int getNumberOfChanges (String pwd) {
        int changes = 0;

        for (int i = 0; i < pwd.length() - 1; i++) if (pwd.charAt(i) != pwd.charAt(i + 1)) changes++;

        return Math.min(changes, pwd.length() - changes);
    }

}
