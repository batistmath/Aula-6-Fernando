package com.notificationapp.factory;

import com.notificationapp.model.Notification;

public abstract class NotificationFactory {
    
    public abstract Notification createNotification();

    public void processNotification(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}