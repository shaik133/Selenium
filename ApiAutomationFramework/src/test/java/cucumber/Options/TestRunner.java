/**
 * 
 */
package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author Admin
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature",
					glue= {"stepDefinations"})
public class TestRunner {

}
