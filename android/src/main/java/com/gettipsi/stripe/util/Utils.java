package com.gettipsi.stripe.util;

import com.stripe.android.model.Card;

/**
 * Created by dmitriy on 11/25/16
 */

public class Utils {

    public static String validateCard(final Card card) {
        if (!card.validateNumber()) {
            return "Le numéro de carte est invalide.";
//            return "The card number that you entered is invalid";
        } else if (!card.validateExpiryDate()) {
            return "La date d'expiration est invalide.";
//            return "The expiration date that you entered is invalid";
        } else if (!card.validateCVC()) {
            return "Le cryptogramme visuel est invalide.";
//            return "The CVC code that you entered is invalid";
        }
        return null;
    }

}
