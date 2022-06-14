package com.snake.common.rpc.config.feign;

import com.snake.common.rpc.config.ExceptionWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * feign异常配置
 *
 * @author snake
 * @time 2021/02/20
 */
@Configuration
public class FeignConfiguration {

    @Bean
    public ErrorDecoder feignErrorDecoder(ObjectMapper objectMapper, ExceptionWrapper exceptionWrapper) {
        return new FeignErrorDecoder(objectMapper, exceptionWrapper);
    }

}
