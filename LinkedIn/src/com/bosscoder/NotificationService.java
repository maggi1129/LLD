package com.bosscoder;

import java.util.List;
import java.util.Map;

public interface NotificationService {

    void sendNotification(Notification notification, Member member);
}

class NotificationServiceImpl implements NotificationService {

    Map<Member, List<Notification>> memberNotificationMap;
    @Override
    public void sendNotification(Notification notification, Member member) {

    }
}
