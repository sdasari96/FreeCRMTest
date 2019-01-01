package seleniumwd;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel_ReadWrite {

	public static void main(String[] args) throws Exception
	{
		FileInputStream f = new FileInputStream("D:\\Sneha\\Selenium\\IFS.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("Business Interface");
		String s1=s.getCell(7,8).getContents();
		s=wb.getSheet("Business Interface");
		s1+=s.getCell(5,5).getContents();
		
		FileOutputStream fo = new FileOutputStream("D:\\Sneha\\Selenium\\Output.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet ws=wwb.createSheet("Result Sheet", 1);
		Label l=new Label(0,0,s1);
		ws.addCell(l);
		wwb.write();
		wwb.close();
		
	}

}
