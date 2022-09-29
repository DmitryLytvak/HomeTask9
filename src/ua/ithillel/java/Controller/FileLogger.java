package ua.ithillel.java.Controller;

import java.time.LocalDateTime;
import ua.ithillel.java.model.FileLoggerConfiguration;
import ua.ithillel.java.model.LoggingLevel;

public class FileLogger {
	
	private final FileLoggerConfiguration fileLoggerConfiguration;
	
	public FileLogger(FileLoggerConfiguration fileLoggerConfiguration) {
		this.fileLoggerConfiguration = fileLoggerConfiguration;
	}
	
	public void	debug(String message) {
		String level = fileLoggerConfiguration.getLevel();
		if (LoggingLevel.DEBUG.toString().equalsIgnoreCase(level)) {
			String fileBody = "[" + LocalDateTime.now() + "]: [" + level + "]: Message - " + message;

		}
	}
	
	public void info(String message) {
		String fileBody = "[" + LocalDateTime.now() + "]: ["
				+ fileLoggerConfiguration.getLevel() + "]: Message - " + message;
	}

}
