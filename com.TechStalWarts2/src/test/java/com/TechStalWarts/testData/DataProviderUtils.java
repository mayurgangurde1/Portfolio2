package com.TechStalWarts.testData;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.testng.annotations.DataProvider;

import com.TechStalWarts.constants.FrameWorkConstants;

public final class DataProviderUtils {
	private static List<Map<String, String>> list=new ArrayList<Map<String,String>>();

	@DataProvider
	public static Object[] getData(Method method) {

		String testName=method.getName(); //contains all the test methods 

		if(list.isEmpty()) 
		{

			list=ExcelUtils.getTestDetails(FrameWorkConstants.getIterationsheet()); 
			//everytime data provider is called this list gets called , that should not be happened hence this loop applied
		}

		List<Map<String, String >> smaiilList=new ArrayList<Map<String,String>>();

		for(int i=0;i<list.size();i++) {
			if(list.get(i).get("testname").equals(testName) && list.get(i).get("execute").equals("yes")) {
				smaiilList.add(list.get(i));
			}
		}

	//	System.out.println(smaiilList.toArray().toString());
		return smaiilList.toArray();
	} 	
}
