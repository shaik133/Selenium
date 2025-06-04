package cucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

public class testRunner {

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/java/Feature",
			glue="stepDefination")
		public void test()
		{
		
		
		
		}
			
	
}
