import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.IDynamicGraph.Status;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;

import junit.framework.Assert;

public class testing {

	public static void main(String[] args) throws XmlException, IOException, SoapUIException {
		// TODO Auto-generated method stub

		//write a object for WsdlProject class and pass the SoapUi project path
		WsdlProject project = new WsdlProject("C:\\Users\\Admin\\Documents\\REST-Project-1-soapui-project.xml");
	//using object get the Suite name
		WsdlTestSuite test	=project.getTestSuiteByName("TestSuiteV2");
	//iterate through test cases present in testSuite	
		for (int i=0; i<test.getTestCaseCount();i++)
		{
			//get the each test case
			WsdlTestCase test1= test.getTestCaseAt(i);
			//write code to execute test
			TestRunner runner=test1.run(new PropertiesMap(), false);
			
			//validating the results
			Assert.assertEquals(Status.FINISHED,runner.getStatus());
			
			//Import jcommander 1.7 jar also fromm outside
		}
			
	}

}
