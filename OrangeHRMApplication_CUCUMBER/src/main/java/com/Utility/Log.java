package com.Utility;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

public class Log 
{
	//class is created with -user define method
		public static Logger log=Logger.getLogger("Log");
		
	 public static void info(String message) //user define method with parameter
	 
	 {
		 //property configurator-its a class of Log4j of apache 
		 //Log4j propertis file which contains information related to path of the folder
		 //of the project into certain files should be created and save with test results
		 
		 PropertyConfigurator.configure("Log4j.properties");
		 log.info(message);
	 }

}
