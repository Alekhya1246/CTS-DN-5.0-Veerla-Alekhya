package com.sample.models;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.error(".....this is an Error message!....");
        logger.warn("....this is a Warning message!....");

    }
}  