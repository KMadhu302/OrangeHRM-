package com.StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="OrangeHRMApplication",glue="com.StepDefination",
monochrome = true, // monochrome will remove junk data from the test result shown in the console
//dryRun=true // will compare the feature file with the user define method class
              // for any new steps added in the scenario of the feature file it
              // immediately creates user define methods without running the previous scenarios 
      tags ="@SmokeTest,@ReTesting ,@Regression "// tags are implemented particular scenarios and runs multiple scenarios 
      // plugins - to create reports
    		  

		
		
		
		)
		
public class TestRunner  {

	
}
