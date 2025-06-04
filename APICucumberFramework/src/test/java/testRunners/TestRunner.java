/**
 * 
 */
package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author Admin
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\APICucumberFramework\\src\\test\\java\\features",
glue={"stepDefinations"})
public class TestRunner {

}
