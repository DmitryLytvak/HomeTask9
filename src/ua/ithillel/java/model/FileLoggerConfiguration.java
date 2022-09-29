package ua.ithillel.java.model;

public class FileLoggerConfiguration {
	
	private final String file;
	private final String level;
	private final String maxSize;
	
	public FileLoggerConfiguration(String file, String level, String maxSize) {
		this.file = file;
		this.level = level;
		this.maxSize = maxSize;
	}
	
	public String getFile() {
		return file;
	}
	
	public String getLevel() {
		return level;
	}
	
	public String getMaxSize() {
		return maxSize;
	}
	
}
