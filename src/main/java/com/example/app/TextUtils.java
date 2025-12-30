package com.example.app;

public final class TextUtils {

    private TextUtils() {
        // utility class
    }

    public static String normalizeUsername(String username) {
        if (username == null) {
            throw new IllegalArgumentException("username cannot be null");
        }
        return username.trim().toLowerCase();
    }

    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }

        int at = email.indexOf('@');
        if (at <= 0) { // нет '@' или пустое имя
            return false;
        }

        String domain = email.substring(at + 1);
        return !domain.isEmpty() && domain.contains(".");
    }
}
