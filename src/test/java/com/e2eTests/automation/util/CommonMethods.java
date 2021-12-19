package com.e2eTests.automation.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonMethods {

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);
	
	public static Properties prop;
	public void readFromFile(String url) throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properities");
		prop.load(fis);
		Setup.driver.get(prop.getProperty(url));
	}
}
