package ua.ithillel.java;

import ua.ithillel.java.сontroller.FileLogger;
import ua.ithillel.java.сontroller.FileLoggerConfigurationLoader;

public class Main {
	
	private static final FileLogger logger =
			new FileLogger(FileLoggerConfigurationLoader.load("./src/log.properties"));
	
	public static void main(String[] args) {
		String infoMessage = "my log info" + "\n";
		logger.info(infoMessage);
		String debugMessage = "my debug message" + "\n";
		logger.debug(debugMessage);
	}
	
}
