package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG=LogManager.getLogger(App.class);
    public static void main(String[] args)
    {
    	String message="Hello, World";

    	LOG.info("hello");
    	LOG.info("hi");

    	LOG.debug(message + "will be printed on debug");
    	LOG.info(message + "will be printed on info");
    	LOG.info("first change at remote server");
        System.out.println( message );

    }
}
