package com.sustav.eventobservers;

import java.util.Date;

public class LogEvent {
    Date date = new Date();
    public String getDate() {
        return date.toString();
    }
}
