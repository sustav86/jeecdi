package com.sustav.decorators;

import com.sustav.Logger;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class LoggerDecorator implements Logger {
    public final static String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Inject
    @Delegate
    private Logger delegate;

    public void print(String message) {
        delegate.print(ANSI_GREEN + message + ANSI_RESET);
    }
}
