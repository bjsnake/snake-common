package com.snake.common.rpc.config.hystrix;

import com.snake.common.rpc.config.ExceptionWrapper;
import com.netflix.hystrix.exception.HystrixBadRequestException;

public class HystrixExceptionWrapper implements ExceptionWrapper {
    @Override
    public Exception wrap(Exception wrapped) {
        return new HystrixBadRequestException(wrapped.getMessage(), wrapped);
    }
}
