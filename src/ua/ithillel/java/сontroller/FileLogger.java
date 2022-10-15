package ua.ithillel.java.сontroller;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import ua.ithillel.java.model.FileLoggerConfiguration;
import ua.ithillel.java.model.FileMaxSizeReachedException;
import ua.ithillel.java.model.LoggingLevel;

public class FileLogger {
	
	private final FileLoggerConfiguration fileLoggerConfiguration;
	
	public FileLogger(FileLoggerConfiguration fileLoggerConfiguration) {
		this.fileLoggerConfiguration = fileLoggerConfiguration;
	}
	
	public void debug(String message) {
		String level = fileLoggerConfiguration.getLevel();
		if (LoggingLevel.DEBUG.toString().equalsIgnoreCase(level)) {
			try {
				toFile(message);
			} catch (FileMaxSizeReachedException e) {
				System.out.println(e);
			}
		}
	}
	
	public void info(String message) {
		try {
			toFile(message);
		} catch (FileMaxSizeReachedException e) {
			System.out.println(e);
		}
	}
	
	private void toFile(String message) {
		try (FileWriter writer = new FileWriter("src/ua/ithillel/java/log.txt", true)) {
			String fileBody = "[" + LocalDateTime.now() + "]: ["
					+ fileLoggerConfiguration.getLevel() + "]: Message - " + message;
			writer.write(fileBody);
			writer.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
