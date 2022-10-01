package ua.ithillel.java;

import ua.ithillel.java.Controller.FileLogger;
import ua.ithillel.java.Controller.FileLoggerConfigurationLoader;

public class Main {
	
	private static final FileLogger logger =
			new FileLogger(FileLoggerConfigurationLoader.load("./src/resources/log.properties"));
	
	public static void main(String[] args) {
		String infoMessage = "my log info";
		logger.info(infoMessage);
		String debugMessage = "my debug message";
		logger.debug(debugMessage);
	}
	
}
