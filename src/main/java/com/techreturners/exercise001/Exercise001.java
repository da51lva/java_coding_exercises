package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {

    public String capitalizeWord(String word) {
        String firstLetter = word.substring(0,1);
        String remainingString = word.substring(1,word.length());
        return firstLetter.toUpperCase() + remainingString;
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return "";
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        return 0.0;
    }

    public String reverse(String sentence) {
        // Add your code here
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
