import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;

public class RestApi {

	
	@Test
	public void restApi() throws XmlException, IOException, SoapUIException
	{
		WsdlProject project = new WsdlProject("C:\\Users\\Admin\\Documents\\REST-Project-1-soapui-project.xml");
	WsdlTestSuite	suite=project.getTestSuiteByName("TestSuiteV2");
	TestCase	testcase=suite.getTestCaseByName("Addbook");
TestRunner	runner= testcase.run(new PropertiesMap(), false);

		
	}
}
