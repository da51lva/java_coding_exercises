package com.techreturners.exercise001;

import java.util.Iterator;
import java.util.List;

public class Exercise001 {

    public String capitalizeWord(String word) {
        String firstLetter = word.substring(0, 1);
        String remainingString = word.substring(1);
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
        return Math.round(newPrice * 100.0) / 100.0; //multiplication and division by 100.0 rounds to 2 decimal places
    }

    public String reverse(String sentence) {
        return new StringBuilder(sentence).reverse().toString();

    }

    public int countLinuxUsers(List<User> users) {
        Iterator<User> itr = users.iterator();
        int count = 0;
        while(itr.hasNext()){
            User user = itr.next();
            if(user.getType() == "Linux"){
                count++;
            }
        }
        return count;
    }
}
