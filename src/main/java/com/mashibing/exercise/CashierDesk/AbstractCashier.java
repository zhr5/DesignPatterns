package com.mashibing.exercise.CashierDesk;

public abstract class AbstractCashier {
    // 展示模块
    protected void displayHeader() {
        System.out.println("Default Header");
    }

    protected void displayOrderDetails() {
        System.out.println("Default Order Details");
    }

    protected void displayCountdown() {
        System.out.println("Default Countdown");
    }

    // 通道路由
    protected void routePayment() {
        System.out.println("Default Payment Route");
    }

    // 模板方法
    public final void processCheckout() {
        displayHeader();
        displayOrderDetails();
        displayCountdown();
        routePayment();
    }
}

