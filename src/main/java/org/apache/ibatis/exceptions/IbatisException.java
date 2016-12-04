package org.apache.ibatis.exceptions;
/**
 * 
 * Ibatis异常，所有异常的父类，但废弃了
 */
@Deprecated
public class IbatisException extends RuntimeException
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public IbatisException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public IbatisException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public IbatisException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public IbatisException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }
    
    

}
