package com.snake.common.service.event.demo;

import com.snake.common.service.event.BaseDomainEvent;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 领域事件示例
 *
 * @author snake
 * @date 2021/02/21
 */
@NoArgsConstructor
@Getter
public class DemoEvent extends BaseDomainEvent<String> {

    private String demoField;

    public DemoEvent(String eventId,String data,String demoField) {
        super(eventId,data);
        this.demoField = demoField;
    }

}