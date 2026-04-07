package com.notificationapp.factory;

import com.notificationapp.model.Notification;
import com.notificationapp.model.SmsNotification;

public class SmsNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}