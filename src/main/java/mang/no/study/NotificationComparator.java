package mang.no.study;

import java.util.Comparator;

/**
 * Created by mrana on 19.12.2017.
 */
public class NotificationComparator implements Comparator<Notification> {
    @Override
    public int compare(Notification o1, Notification o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
