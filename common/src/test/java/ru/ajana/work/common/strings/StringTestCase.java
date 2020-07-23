package ru.ajana.work.common.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringTestCase {

    @Test
    public void testSame() {
        String s = "\t abc \n";
        assertEquals("abc", s.trim());
        //  assertEquals("abc", s.strip()); // JDK 11
    }

    @Test
    public void testDifferent() {
        Character c = '\u2000';
        String s = c + "abc" + c;

        assertTrue(Character.isWhitespace(c));
        assertEquals(s, s.trim());
        //assertEquals("abc", s.strip()); // JDK 11
    }
}
