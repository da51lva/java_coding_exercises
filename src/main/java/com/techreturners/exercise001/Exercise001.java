package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {

    public String capitalizeWord(String word) {
        String firstLetter = word.substring(0, 1);
        String remainingString = word.substring(1, word.length());
        return firstLetter.toUpperCase() + remainingString;
    }

    public String generateInitials(String firstName, String lastName) {
        String firstInitial = firstName.substring(0, 1).toUpperCase();
        String lastInitial = lastName.substring(0, 1).toUpperCase();
        return firstInitial + "." + lastInitial;
    }

    public double addVat(double originalPrice, double vatRate) {
        double vatRateAsDecimal = 1 + vatRate / 100;
        double newPrice = originalPrice * vatRateAsDecimal;
        double newPriceRounded = Math.round(newPrice * 100.0) / 100.0; //rounds to 2 decimal places
        return newPriceRounded;
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
