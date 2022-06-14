package com.snake.common.base.utils.tree;

/**
 * @author snake
 * @date 2020/11/13
 */
public abstract class IDTree<T extends Treeable> extends AbstractTree<T> {
    @Override
    public Object key() {
        return getId();
    }

    @Override
    public Object parentKey() {
        return getParentId();
    }

    public abstract Long getId();

    public abstract Long getParentId();

}
