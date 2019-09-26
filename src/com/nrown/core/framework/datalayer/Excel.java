package com.nrown.core.framework.datalayer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.nrown.core.framework.utilities.Global;

public class Excel
{
	public static FileInputStream fis = null;
	public static XSSFWorkbook workbook = null;
	public static Sheet sheet = null;
	public static Row row = null;
	public static Cell cell = null;
	
	public static Object readData(String sheetName, int rowNum, int colNum)
	{
		Object o1 = null;
		try
		{
			fis = new FileInputStream(Global.dataPath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
			row = sheet.getRow(rowNum);
			cell = row.getCell(colNum);
			CellType cellType = cell.getCellType();
			
			switch(cellType)
			{
				case STRING:
					o1 =  cell.getStringCellValue();
					break;
				case NUMERIC:
					o1 =  cell.getNumericCellValue();
					break;
				case BOOLEAN:
					o1 =  cell.getBooleanCellValue();
					break;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return o1;
	}
	
	public static void setData(String sheetName, int rowNum, int colNum, String res)
	{
		try
		{
			fis = new FileInputStream(Global.dataPath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
			row = sheet.getRow(rowNum);
			cell = row.createCell(colNum);
			cell.setCellType(CellType.STRING);
			cell.setCellValue(res);
			// Open the excel sheet in the write mode
			FileOutputStream fos = new FileOutputStream(Global.dataPath);
			workbook.write(fos);
			fos.close();
			System.out.println("Success");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static List<Object> getAllRowData(String sheetName, int rowNum)
	{
		List<Object> lst = new ArrayList<Object>();
		try
		{
			fis = new FileInputStream(Global.dataPath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
			
			row = sheet.getRow(rowNum);
			
			Iterator<Cell> cellItr = row.cellIterator();
			
			while(cellItr.hasNext())
			{
				Cell cell = cellItr.next();
				
				CellType cType = cell.getCellType();
				
				switch(cType)
				{
					case STRING:
						String val = cell.getStringCellValue();
						lst.add(val);
						break;
					case NUMERIC:
						double val1 = cell.getNumericCellValue();
						lst.add(val1);
						break;
					case BOOLEAN:
						boolean val3 = cell.getBooleanCellValue();
						lst.add(val3);
						break;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return lst;
	}
}