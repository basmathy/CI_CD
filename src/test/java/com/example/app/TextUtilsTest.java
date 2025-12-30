package com.example.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextUtilsTest {

    @Test
    void normalizeUsername_trimsAndLowercases() {
        assertEquals("alice", TextUtils.normalizeUsername("  Alice "));
        assertEquals("bob", TextUtils.normalizeUsername("BOB"));
    }

    @Test
    void normalizeUsername_nullThrows() {
        assertThrows(IllegalArgumentException.class, () -> TextUtils.normalizeUsername(null));
    }

    @Test
    void isValidEmail_validCases() {
        assertTrue(TextUtils.isValidEmail("user@example.com"));
        assertTrue(TextUtils.isValidEmail("admin@test.org"));
    }

    @Test
    void isValidEmail_invalidCases() {
        assertFalse(TextUtils.isValidEmail("invalid-email"));
        assertFalse(TextUtils.isValidEmail("user@domain"));
        assertFalse(TextUtils.isValidEmail("@example.com"));
        assertFalse(TextUtils.isValidEmail(null));
    }
}
