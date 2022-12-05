package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convertToTargetAmt(CurrencyType currencyType) {
        // parameter is target currency type
        // just converting the type to the value associated with it
        // and dividing by the base currency type rate
        // which returns the target conversion amt
        return currencyType.getRate() / getCurrencyType().getRate();
//        return Double.MAX_VALUE;
    }

    CurrencyType getCurrencyType(); // for base currency type
}
