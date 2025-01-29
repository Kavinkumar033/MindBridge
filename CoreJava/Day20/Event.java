package Day20;

import java.time.Duration;
import java.time.LocalDateTime;

public class Event {
    String name;
    LocalDateTime datetime;
    Duration duration;

    public Event(String name, LocalDateTime datetime, Duration duration) {
        this.name = name;
        this.datetime = datetime;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", datetime=" + datetime.toLocalDate()+
                ", duration=" + duration.toHours() +
                '}';
    }
}
