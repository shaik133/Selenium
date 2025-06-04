package mavengroupid.maventest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class datadrivenExcell {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("F:\\Robots\\Robot2_DataCapturing\\customer.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
	}

}
