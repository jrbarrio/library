package com.roldan.library.application;

import com.google.inject.Singleton;

@Singleton
public class Service {

    public static final String GREETING = "Hello";

    public String getGreeting() {
        return GREETING;
    }

}
