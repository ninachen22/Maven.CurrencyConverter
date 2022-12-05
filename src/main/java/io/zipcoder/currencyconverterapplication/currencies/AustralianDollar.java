package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {
    @Override
    public Double convertToTargetAmt(CurrencyType currencyType) {
        return currencyType.getRate() / getCurrencyType().getRate();
//        return ConvertableCurrency.super.convertToTargetAmt(currencyType);
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.AUSTRALIAN_DOLLAR;
    }
}
