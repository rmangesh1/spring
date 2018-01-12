package mang.no.study;

import java.util.Objects;

/**
 * Created by mrana on 19.12.2017.
 */
public class NotificationWrapper {

    private Notification notification;

    private NotificationWrapper(Notification notification) {
        this.notification = notification;
    }

    public static NotificationWrapper wrap(Notification notification) {
        return new NotificationWrapper(notification);
    }

    public Notification unWrap() {
        return notification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        NotificationWrapper notificationWrapper = (NotificationWrapper) o;

        return this.notification.getEmail().equals(notificationWrapper.unWrap().getEmail()) && this.notification.getType().equals(notificationWrapper.unWrap().getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.notification.getEmail(), this.notification.getType());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NotificationWrapper{");
        sb.append("notification=").append(notification);
        sb.append('}');
        return sb.toString();
    }
}
