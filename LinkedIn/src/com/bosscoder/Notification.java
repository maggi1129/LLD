package com.bosscoder;

import java.util.Date;

public abstract class Notification {

    Date notificationDate;
    long timeToLive;
    String text;
    byte[] icon;
}

class WebNotification extends Notification{

    // web specific behavior
}

class AppNotification extends Notification{
 // app specific behaviour
}