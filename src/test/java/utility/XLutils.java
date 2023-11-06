package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLutils {
public static FileInputStream fis;
public static FileOutputStream fos;
public static XSSFWorkbook wb;
public static XSSFSheet xs;
 public static XSSFRow rw;
 public static XSSFCell c1;
 public static int getrowcount(String xlfile,String xlsheet) throws IOException {
	 fis=new FileInputStream(xlfile);
	wb=new XSSFWorkbook(fis);
	xs=wb.getSheet(xlsheet);
	int rowcount =xs.getLastRowNum();
	wb.close();
	fis.close();
	return rowcount;
 }
	public static  int getcellcount(String xlfile,String xlsheet,int rownum) throws IOException {
		fis=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fis);
		xs=wb.getSheet(xlsheet);
		
		rw=xs.getRow(rownum);
		int cellcount=rw.getLastCellNum();
		wb.close();
		fis.close();
		return cellcount;
	}
	public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		fis=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fis);
		xs=wb.getSheet(xlsheet);
		rw=xs.getRow(rownum);
	c1=rw.getCell(colnum);
		String data;
		try 
		{
			DataFormatter formatter = new DataFormatter();
            String cellData = formatter.formatCellValue(c1);
            return cellData;
		}
		catch (Exception e) 
		{
			data="";
		}
		wb.close();
		fis.close();
		return data;
	}
	
	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
	{
		fis=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fis);
		xs=wb.getSheet(xlsheet);
		rw=xs.getRow(rownum);
		c1=rw.createCell(colnum);
		c1.setCellValue(data);
		fos=new FileOutputStream(xlfile);
		wb.write(fos);		
		wb.close();
		fis.close();
		fos.close();
	}

}
	
	 
	 
 
 



