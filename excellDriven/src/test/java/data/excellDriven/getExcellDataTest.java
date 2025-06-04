package data.excellDriven;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class getExcellDataTest {

	
	@Test
	public void getExcellData() throws IOException
	{
		excellDataDriven data= new excellDataDriven();
	ArrayList a=	data.getData("peggy");
System.out.println(a.get(2));
	}
}
