package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {

    @Test
    void shouldSendEmailToMarco() {
        MockEmailUtil mockEmailUtil = new MockEmailUtil();
        Order order = new Order(mockEmailUtil, new Weather());
        order.insertOrder("marco@gmail.com", 1, 100);
        assertEquals("marco@gmail.com", mockEmailUtil.getReceiveEmail());
    }

}

class MockEmailUtil implements IEmailUtil {

    String receiveEmail;

    public String getReceiveEmail() {
        return receiveEmail;
    }

    @Override
    public void sendCustomer(String email) {
        receiveEmail = email;
    }
}