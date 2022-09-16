package com.tucan.mvp.exception;

/**
 * Exception for mark if a file has bugs.
 * @author a.barreda.bonis
 */
public class FileWithBugException extends Exception {
    /**
	 * Default serial
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Exception constructor.
	 * @param message Message of exception.
	 */
	public FileWithBugException (String message) {
        super(message);
    }
}