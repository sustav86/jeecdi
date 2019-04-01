package com.sustav.eventobservers;

import javax.enterprise.event.Observes;

public class LogEventListener {
    public void logEvent(@Observes LogEvent event){
        System.out.println("Message Date: " + event.getDate());
    }
}
