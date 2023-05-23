package com.TechStalWarts.testData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.TechStalWarts.constants.FrameWorkConstants;

public final class ExcelUtils {
	private ExcelUtils() {

	}

	public static List<Map<String, String>> getTestDetails(String sheetName){
		List<Map<String,String>> list=null;

		FileInputStream fs = null;
		try {
			fs = new FileInputStream(FrameWorkConstants.getExcelFilePath());
			XSSFWorkbook workbook=new XSSFWorkbook(fs);

			XSSFSheet sheet=workbook.getSheet(sheetName);

			Map<String ,String> map=null;
			list=new ArrayList<Map<String,String>>();

			int lastRowNum=sheet.getLastRowNum();
			int lastCellNum=sheet.getRow(0).getLastCellNum();

			for(int i=1; i<=lastRowNum ; i++) {
				map=new HashMap<String, String>();
				for(int j=0;j<lastCellNum;j++) {
					String key=sheet.getRow(0).getCell(j).getStringCellValue();
					String value=sheet.getRow(i).getCell(j).getStringCellValue();
					map.put(key, value);

				}
				list.add(map);
			}

		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		}
		catch (IOException e) {

			e.printStackTrace();
		}
		catch(NullPointerException n) {
			n.getLocalizedMessage();
		}

		finally {
			try {
				if(Objects.nonNull(fs)) 
				{
					fs.close();
				}

			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		System.out.println(list);
		return list;

	}


}
