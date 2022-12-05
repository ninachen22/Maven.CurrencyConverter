package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {
    @Override
    public Double convertToTargetAmt(CurrencyType currencyType) {
        return currencyType.getRate() / getCurrencyType().getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.RUPEE;
    }
}
