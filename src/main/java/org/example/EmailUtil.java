package org.example;

public class EmailUtil implements IEmailUtil {

    @Override
    public void sendCustomer(String email) {
        System.out.printf("Send an email to: %s%n", email);
    }
}
