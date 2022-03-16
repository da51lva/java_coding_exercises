package com.techreturners.exercise005;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Exercise005Test {

    private Exercise005 ex005;

    @Before
    public void setup() {
        ex005 = new Exercise005();
    }

    @Test
    public void checkEmptySentenceIsNotAPangram() {
        assertFalse(ex005.isPangram(""));
    }

    @Test
    public void checkPerfectLowerCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void checkPerfectLowerCaseReverseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("zyxwvutsrqponmlkjihgfedcba"));
    }

    @Test
    public void checkPerfectUpperCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }


    @Test
    public void checkSentenceWithLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("the quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void checkSentenceWithMixedUpperAndLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("The Five boXing wiZards Jump QuicklY"));
    }


    @Test
    public void checkSentenceWithMissingLetterXIsNotAPangram() {
        assertFalse(ex005.isPangram("the quick brown fo jumps over the lazy dog"));
    }

    @Test
    public void checkSentenceWithMissingLetterHIsNotAPangram() {
        assertFalse(ex005.isPangram("five boxing wizards jump quickly at it"));
    }

    @Test
    public void checkSentenceWithUnderscoresIsAPangram() {
        assertTrue(ex005.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }

    @Test
    public void checkSentenceWithNumbersIsAPangram() {
        assertTrue(ex005.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs"));
    }

    @Test
    public void checkSentenceWithSymbolsIsAPangram() {
        assertTrue(ex005.isPangram("%the. qu+ick =bro*<wn fox $£jumps over/ the lazy? dog!"));
    }

    @Test
    public void checkSentenceWithNumbersSymbolsUpperCaseLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("10 Quick browN foxes + 2 SLOW white raBbits & a goat, Jump over the lAzY dog!?"));
    }

    @Test
    public void checkLargeInputSentenceIsNotAPanGram(){
        char[] chars = new char[9999999];
        Arrays.fill(chars, 'a');

        String str = new String(chars);
        assertFalse(ex005.isPangram(str));
    }

    @Test
    public void checkLargeInputSentenceIsAPanGram(){
        char[] chars = new char[9999999];
        Arrays.fill(chars, 'a');

        String str = new String(chars + "abcdefghijklmnopqrstuvwxyz");
        assertTrue(ex005.isPangram(str));
    }
}
