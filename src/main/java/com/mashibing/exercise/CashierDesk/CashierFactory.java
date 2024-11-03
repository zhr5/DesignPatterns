package com.mashibing.exercise.CashierDesk;

public class CashierFactory {
    public static AbstractCashier createCashier(String businessType) {
        switch (businessType) {
            case "A":
                return new CashierForBusinessA();
            case "B":
                return new CashierForBusinessB();
            default:
                throw new IllegalArgumentException("Unknown business type: " + businessType);
        }
    }
}

