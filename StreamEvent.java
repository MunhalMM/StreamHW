package com.telran.project.streamexample;

import java.util.Objects;

public class StreamEvent {
    private String name;
    private String location;
    private String eventType;

    public StreamEvent(String name, String location, String eventType) {
        this.name = name;
        this.location = location;
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "\nEvent{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", eventType='" + eventType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreamEvent event = (StreamEvent) o;
        return Objects.equals(location, event.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }
}
