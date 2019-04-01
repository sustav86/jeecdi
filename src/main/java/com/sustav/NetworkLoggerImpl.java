package com.sustav;

import javax.enterprise.inject.Alternative;

@Alternative
public class NetworkLoggerImpl implements Logger {
    public void print(String message) {
        System.out.println("Send log message to remote log system");
    }
}
