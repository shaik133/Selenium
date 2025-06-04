package Tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class test5 {

@Test
public void emi() {
	System.out.println("emi1");
}

@BeforeMethod
public void beforMethod() {
	System.out.println("This is running prior to 'monthEmi' method run");
}
@Parameters ({"URL"})
@Test
public void monthEmi(String urlname) {
	System.out.println("EMI2");
	System.out.println(urlname);
}

}
