package com.mashibing.exercise.CashierDesk;

public class CashierForBusinessB extends AbstractCashier {
    @Override
    protected void displayHeader() {
        System.out.println("Custom Header for Business B");
    }

    @Override
    protected void displayOrderDetails() {
        System.out.println("Custom Order Details for Business B");
    }

    @Override
    protected void displayCountdown() {
        System.out.println("Custom Countdown for Business B");
    }

    @Override
    protected void routePayment() {
        System.out.println("Custom Payment Route for Business B");
    }
}