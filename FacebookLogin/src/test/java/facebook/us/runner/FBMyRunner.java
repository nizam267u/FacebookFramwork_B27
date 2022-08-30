package facebook.us.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
	@CucumberOptions(
			plugin = {"pretty","json:target/cucumber.json" },		 	
			features = {".//Features/"}, 
	        glue = {"facebook.us.stepdefinitions",}, 	
	        	  // dryRun = false,  // Stop the execution and give me new steps = true
	        	                               // If false then browser and steps 
	                monochrome = true, 
	              // strict = true,
			tags = "@Smoke")   
	public class FBMyRunner extends AbstractTestNGCucumberTests {

}
