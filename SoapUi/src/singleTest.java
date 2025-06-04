import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.IDynamicGraph.Status;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;

import junit.framework.Assert;

public class singleTest {

	@Test
	public void singlTest() throws XmlException, IOException, SoapUIException
	{
		WsdlProject project = new WsdlProject("C:\\Users\\Admin\\Documents\\REST-Project-1-soapui-project.xml");
		WsdlTestSuite test =project.getTestSuiteByName("TestSuite");
		WsdlTestCase case1 = test.getTestCaseByName("addEmployee");
		
	TestRunner runner=	case1.run(new PropertiesMap(), false);
	Assert.assertEquals(Status.FINISHED, runner.getStatus());
	}
}
