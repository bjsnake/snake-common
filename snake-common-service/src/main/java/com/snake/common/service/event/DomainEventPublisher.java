package com.snake.common.service.event;

/**
 * 领域事件发布接口
 *
 * @author snake
 * @date  2021/02/21
 */
public interface DomainEventPublisher {

    /**
     * 发布事件
     *
     * @param event 领域事件
     */
    void publishEvent(BaseDomainEvent event);

}
