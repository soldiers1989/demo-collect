package org.sun.h2.db.exception;

/**
 * @author Jungle
 * @create 2018-01-19 15:19
 */
public class DBException extends RuntimeException {

    public DBException(String message) {
        super(message);
    }

    public DBException(String message, Throwable cause) {
        super(message, cause);
    }

    public DBException(Throwable cause) {
        super(cause);
    }
}
