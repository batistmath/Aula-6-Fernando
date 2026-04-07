package com.notificationapp.factory;

import com.notificationapp.model.Notification;
import com.notificationapp.model.WhatsAppNotification;

public class WhatsAppNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new WhatsAppNotification();
    }
}