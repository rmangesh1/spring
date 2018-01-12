package mang.no.study;

import java.time.LocalDateTime;

/**
 * Created by mrana on 19.12.2017.
 */
public class Notification {

    private Long id;

    private String email;

    private String type;

    private LocalDateTime date;

    public Notification() {
    }

    public Notification(Long id, String email, String type, LocalDateTime date) {
        this.id = id;
        this.email = email;
        this.type = type;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notification that = (Notification) o;

        if (!id.equals(that.id)) return false;
        if (!email.equals(that.email)) return false;
        if (!type.equals(that.type)) return false;
        return date.equals(that.date);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Notification{");
        sb.append("id=").append(id);
        sb.append(", email='").append(email).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}
