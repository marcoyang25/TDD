package org.example;

public class Order {

    private final IEmailUtil emailUtil;
    private final IWeather weather;

    public Order(IEmailUtil emailUtil, IWeather weather) {
        this.emailUtil = emailUtil;
        this.weather = weather;
    }

    void insertOrder(String email, int quantity, int price) {
        Umbrella umbrella = new Umbrella(weather);
        umbrella.totalPrice(quantity, price);
        emailUtil.sendCustomer(email);
    }

}
