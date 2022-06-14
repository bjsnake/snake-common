package com.snake.common.start;

import org.springframework.cloud.client.SpringCloudApplication;

import java.lang.annotation.*;

/**
 * common启动类注解
 *
 * @author snake
 * @time 2021/2/20 14:45
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringCloudApplication
public @interface CommonApplication {
}
