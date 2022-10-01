package ua.ithillel.java.model;

public class FileMaxSizeReachedException extends RuntimeException {
	
	public FileMaxSizeReachedException(long size, int maxSize) {
		super(String.format(
				"File full! File size %d , maximum allowed file size %d", size,
				maxSize));
	}
}