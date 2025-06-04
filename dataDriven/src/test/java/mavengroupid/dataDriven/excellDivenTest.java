package mavengroupid.dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excellDivenTest {

	public ArrayList<String> getData(String testCase) throws IOException {
		ArrayList<String> a= new ArrayList<String>();
		FileInputStream Fis= new FileInputStream("F:\\Robots\\Robot2_DataCapturing\\customer.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		
		//search for no of sheets present in excell
	int sheets=	workbook.getNumberOfSheets();
	for (int i=0;i<sheets;i++) {
	if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
	XSSFSheet sheet=	workbook.getSheetAt(i);
	Iterator<Row> rows= sheet.iterator();
Row row=rows.next();
//iterate through cell of the row
int k=0;
int column=0;
Iterator<Cell> c= row.cellIterator();
while(c.hasNext()) {
	Cell value= c.next();
	if(value.getStringCellValue().equalsIgnoreCase("city")) {
		column=k;
	}
	k++;
}
System.out.println(column);
while(rows.hasNext()) {
	Row r= rows.next();
	if(r.getCell(column).getStringCellValue().equalsIgnoreCase("testCase")) {
	Iterator<Cell>	ce= r.cellIterator();
	while(ce.hasNext()) {
  a.add(ce.next().getStringCellValue());
	}
	}
}
	}
	}
	return a;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Get hold of path of excell loacted
	
	}

}
