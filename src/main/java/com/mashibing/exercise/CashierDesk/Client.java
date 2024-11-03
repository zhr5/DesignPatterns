package com.mashibing.exercise.CashierDesk;

public class Client {
    public static void main(String[] args) {
        String businessType = "A"; // 可以根据实际业务需求动态设置
        AbstractCashier cashier = CashierFactory.createCashier(businessType);
        cashier.processCheckout();
    }
}

