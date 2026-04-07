package com.notificationapp.model;

public class WhatsAppNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("WhatsApp: " + message);
    }
}