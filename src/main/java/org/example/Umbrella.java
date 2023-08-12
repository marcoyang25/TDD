package org.example;

public class Umbrella {

    private final IWeather weather;

    public Umbrella(IWeather weather) {
        this.weather = weather;
    }

    public int totalPrice(int quantity, int price) {
        var isSunny = weather.isSunny();
        var totalPrice = quantity * price;

        if (isSunny) {
            totalPrice = (int) (totalPrice * 0.9);
        }
        return totalPrice;
    }
}
