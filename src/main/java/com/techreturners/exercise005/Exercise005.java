package com.techreturners.exercise005;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise005 {

    private static final int NO_OF_LETTERS_IN_ALPHABET = 26;
    private static final Pattern PATTERN = Pattern.compile("[a-z]");

    public boolean isPangram(String input) {

        String lowerCaseInput = input.toLowerCase();
        Matcher matcher = PATTERN.matcher(lowerCaseInput);
        Set<String> matches = new HashSet<String>(); //stores unique matches

        //add every match to Set to create unique matches
        while (matcher.find()){
            matches.add(matcher.group());
        }

        if (matches.size() == NO_OF_LETTERS_IN_ALPHABET)//checks every letter in alphabet was matched
            return true;
        else
            return false;

    }

}
