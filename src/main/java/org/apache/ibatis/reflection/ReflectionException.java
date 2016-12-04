package org.apache.ibatis.reflection;

import org.apache.ibatis.exceptions.PersistenceException;

public class ReflectionException extends PersistenceException
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public ReflectionException() {
        super();
    }

    public ReflectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReflectionException(String message) {
        super(message);
    }

    public ReflectionException(Throwable cause) {
        super(cause);
    }

}
