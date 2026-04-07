package com.notificationapp;

import com.notificationapp.factory.EmailNotificationFactory;
import com.notificationapp.factory.NotificationFactory;
import com.notificationapp.factory.PushNotificationFactory;
import com.notificationapp.factory.SmsNotificationFactory;
import com.notificationapp.factory.WhatsAppNotificationFactory;

public class Main {
    public static void main(String[] args) {
        
        NotificationFactory emailFactory = new EmailNotificationFactory();
        emailFactory.processNotification("notificação e-mail.");

        NotificationFactory smsFactory = new SmsNotificationFactory();
        smsFactory.processNotification("notificação SMS");

        NotificationFactory pushFactory = new PushNotificationFactory();
        pushFactory.processNotification("notificação push.");

        NotificationFactory whatsAppFactory = new WhatsAppNotificationFactory();
        whatsAppFactory.processNotification("notificação WhatsApp.");
    }
}