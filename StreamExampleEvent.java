package com.telran.project.streamexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleEvent {
    public static void main(String[] args) {
        StreamEvent eventOne = new StreamEvent("EventOne", "Berlin", "Music");
        StreamEvent eventTwo = new StreamEvent("EventTwo", "Moscow", "Film");
        StreamEvent eventThree = new StreamEvent("EventThree", "Berlin", "Sport");
        StreamEvent eventFour = new StreamEvent("EventFour", "New-York", "Exhibition");
        StreamEvent eventFive = new StreamEvent("EventFive", "Baku", "Concert");

        List<StreamEvent> eventList = new ArrayList<>();
        eventList.add(eventOne);
        eventList.add(eventTwo);
        eventList.add(eventThree);
        eventList.add(eventFour);
        eventList.add(eventFive);

        List<StreamEvent> collect = eventList.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

    }
}
