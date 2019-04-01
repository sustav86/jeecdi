package com.sustav;

import com.sustav.eventobservers.LogEvent;
import com.sustav.eventobservers.LogObserver;
import com.sustav.interceptors.ConsoleLog;
import com.sustav.qualifier.Protocol;
import com.sustav.qualifier.ProtocolType;
import com.sustav.qualifier.Sender;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

@Alternative
public class LoggerImpl implements Logger {

    @Inject private DateSource dateSource;
    @Inject private Integer random;
    @Inject private LogObserver logObserver;

    @Inject
    @Protocol(type = ProtocolType.HTTP)
    private Sender sender;

    @ConsoleLog
    public void print(String message) {
        logObserver.observe(new LogEvent());
        System.out.println(message + " , current time is: " + dateSource.getDate() + " , random: " + random);
        sender.send(new byte[10]);
    }

}
