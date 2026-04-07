package com.notificationapp.factory;

import com.notificationapp.model.Notification;
import com.notificationapp.model.PushNotification;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}