package org.example;

public class Umbrella {
    public int totalPrice(IWeather weather, int quantity, int price) {
        var isSunny = weather.isSunny();
        var totalPrice = quantity * price;

        if (isSunny) {
            totalPrice = (int) (totalPrice * 0.9);
        }
        return totalPrice;
    }
}
