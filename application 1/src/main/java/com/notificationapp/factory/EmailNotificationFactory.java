package com.notificationapp.factory;

import com.notificationapp.model.EmailNotification;
import com.notificationapp.model.Notification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}