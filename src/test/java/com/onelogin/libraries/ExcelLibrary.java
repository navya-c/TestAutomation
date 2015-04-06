package com.onelogin.libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary
{
	
	public String getExcelData(String sheetname,int row,int cell)
	{
		String retval=null;
		try
		{ 
			FileInputStream Fis = new FileInputStream("Data.xlsx");
			Workbook wb= WorkbookFactory.create(Fis);
			Sheet sh=wb.getSheet(sheetname);
			Row r=sh.getRow(row);
			Cell c=r.getCell(cell);
			retval=c.getStringCellValue();
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
		catch(InvalidFormatException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		return retval;
		
	}
	
	
	public void writeToExcel(String sheetname,int row,int cell,String data)
	{
		try
		{
		  FileInputStream Fis = new FileInputStream("Data.xlsx");
		  Workbook wb= WorkbookFactory.create(Fis);
		  Sheet sh=wb.getSheet(sheetname);
		  Row r=sh.getRow(row);
		  Cell c = r.createCell(cell);
		  c.setCellValue(data);
		  FileOutputStream fos=new FileOutputStream("Data.xlsx");
		  wb.write(fos);
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
		catch(InvalidFormatException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
	
	public int getRowCount(String sheetname)
	{
		int retval=0;
		try
		{
			FileInputStream fis = new FileInputStream("Data.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(sheetname);
			retval=sh.getLastRowNum();
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
		catch(InvalidFormatException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		return retval;
	}
		

}
