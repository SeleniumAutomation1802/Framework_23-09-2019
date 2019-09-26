package com.nrown.core.framework.datalayer;

import java.io.FileInputStream;
import java.util.Properties;

import com.nrown.core.framework.utilities.Global;

public class Property
{
	public static String getConfigData(String key)
	{
		String value = null;
		try
		{
			Properties p1 = new Properties();
			FileInputStream fis = new FileInputStream(Global.propertyPath);
			
			p1.load(fis);
			
			value = p1.getProperty(key);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}
}
