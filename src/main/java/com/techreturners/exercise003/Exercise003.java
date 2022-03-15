package com.techreturners.exercise003;

public class Exercise003 {

    private static final String[] ICE_CREAMS = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};

    int getIceCreamCode(String iceCreamFlavour) {
        for(int i = 0; i < ICE_CREAMS.length; i++){
            if (ICE_CREAMS[i] == iceCreamFlavour){
                return i;
            }
        }
        throw new UnsupportedOperationException(("Pip's ice cream store does not contain the flavour '"+iceCreamFlavour+"'"));
    }

    String[] iceCreamFlavours() {
        throw new UnsupportedOperationException(("You can delete this statement and add your code here."));
    }

}
