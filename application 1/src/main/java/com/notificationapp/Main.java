package com.notificationapp;

import com.notificationapp.factory.EmailNotificationFactory;
import com.notificationapp.factory.NotificationFactory;
import com.notificationapp.factory.PushNotificationFactory;
import com.notificationapp.factory.SmsNotificationFactory;

public class Main {
    public static void main(String[] args) {
        
        NotificationFactory emailFactory = new EmailNotificationFactory();
        emailFactory.processNotification("notificação e-mail.");

        NotificationFactory smsFactory = new SmsNotificationFactory();
        smsFactory.processNotification("notificação SMS.");

        NotificationFactory pushFactory = new PushNotificationFactory();
        pushFactory.processNotification("notificação push.");
    }
}