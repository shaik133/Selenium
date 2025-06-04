/**
 * 
 */
package cucmber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author Admin
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\FinalApi\\src\\test\\java\\features\\library.feature",
				glue="stepDefinations")
public class TestRunner {

}
