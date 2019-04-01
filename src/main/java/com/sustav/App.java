package com.sustav;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
//        initializer.addPackages(App.class.getPackage());
        SeContainer container = initializer.initialize();

        Logger logger = container.select(Logger.class).get();
        logger.print("Hello, SE Container");

    }
}
