package com.snake.common.base.exception;


/**
 * 系统异常
 *
 * @author snake
 * @time 2021/03/05
 */
public class SystemException extends ServiceException {

    public SystemException() {
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }

}
