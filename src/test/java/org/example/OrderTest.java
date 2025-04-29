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
        mockEmailUtil.verifyCalledOnce();
    }

}

class MockEmailUtil implements IEmailUtil {
    String receiveEmail;
    int callCount = 0;

    public String getReceiveEmail() {
        return receiveEmail;
    }

    @Override
    public void sendCustomer(String email) {
        callCount++;
        receiveEmail = email;
    }

    public void verifyCalledOnce() {
        if (callCount != 1) {
            throw new AssertionError("Expected sendCustomer to be called exactly once, but was called " + callCount + " times");
        }
    }

    public int getCallCount() {
        return callCount;
    }
}