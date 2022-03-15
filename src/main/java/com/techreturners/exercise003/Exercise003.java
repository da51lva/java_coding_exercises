package com.techreturners.exercise003;

public class Exercise003 {

    private static final String[] ICE_CREAMS = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};

    int getIceCreamCode(String iceCreamFlavour) {
        for(int i = 0; i < ICE_CREAMS.length; i++){
            if (ICE_CREAMS[i] == iceCreamFlavour){
                return i;
            }
        }
        return -1;
    }

    String[] iceCreamFlavours() {
        return ICE_CREAMS;
    }

}
