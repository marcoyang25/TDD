package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UmbrellaTest {

    @Test
    void shouldReturnTotalPriceWhenSunny() {
        Umbrella umbrella = new Umbrella();
        var weather = new StubWeather();
        var price = umbrella.totalPrice(weather, 1, 100);
        assertEquals(90, price);
    }
}

class StubWeather implements IWeather {

    @Override
    public boolean isSunny() {
        return true;
    }
}