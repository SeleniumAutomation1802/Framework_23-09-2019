package com.nrown.core.framework.utilities;

import java.util.concurrent.TimeUnit;

public interface Global
{
	public static final int syncTime = 60;
	public static final TimeUnit timeType = TimeUnit.SECONDS;
	public static final String browser = "chrome";
	public static final String pathOfScreenShotFld= "";
	public static final String chromeServer = "C:\\Pritam\\EclipseWorkspace\\Phase1_MileStone1\\Server\\chromedriver.exe";
	public static final String ieserver = "C:\\Pritam\\EclipseWorkspace\\Phase1_MileStone1\\Server\\IEDriverServer.exe";
	public static final String ffserver = "C:\\Pritam\\EclipseWorkspace\\Phase1_MileStone1\\Server\\gecko.exe";
	public static final String dataPath = "C:\\Pritam\\EclipseWorkspace\\Phase1_MileStone1\\TestDataSuite\\TestData.xlsx";
	public static final String propertyPath = "C:\\Pritam\\EclipseWorkspace\\Phase1_MileStone1\\Environment\\config.properties";
}
