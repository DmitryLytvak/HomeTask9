package ua.ithillel.java.сontroller;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import ua.ithillel.java.model.FileLoggerConfiguration;

public class FileLoggerConfigurationLoader {
	
	public static FileLoggerConfiguration load(String url) {
		Properties properties = new Properties();
		try (FileReader fileReader = new FileReader(url)) {
			properties.load(fileReader);
			String logging_level = properties.getProperty("logging_level");
			String max_size = properties.getProperty("max_size");
			
			return new FileLoggerConfiguration(url, logging_level, max_size);
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
}
