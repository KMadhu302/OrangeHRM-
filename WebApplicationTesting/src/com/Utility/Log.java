package com.Utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log 
{
	// Class is Created with User-Defined Method

	public static Logger log = Logger.getLogger("Log");

	public static void info(String message) // user-defined method with parameter
	{
	// PropertyConfigurator - its a class of Log4j of Apache
	// Log4j.properties is the file which contains information related to the path of the folder
	//   of the project into which certain files should be created and save with the test results
	PropertyConfigurator.configure("Log4j (1).properties");
	log.info(message);

	}


}
