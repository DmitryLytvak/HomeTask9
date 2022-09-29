package ua.ithillel.java.model;

public class FileMaxSizeReachedException extends RuntimeException{
	
	public FileMaxSizeReachedException(String message) {
		super(message);
	}
}
