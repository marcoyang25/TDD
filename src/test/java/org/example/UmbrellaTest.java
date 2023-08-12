package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UmbrellaTest {

    @Test
    void shouldReturnTotalPriceWhenSunny() {
        var weather = new StubWeather();
        Umbrella umbrella = new Umbrella(weather);
        var price = umbrella.totalPrice(1, 100);
        assertEquals(90, price);
    }
}

class StubWeather implements IWeather {

    @Override
    public boolean isSunny() {
        return true;
    }
}