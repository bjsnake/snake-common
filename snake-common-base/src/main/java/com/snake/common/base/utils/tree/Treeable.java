package com.snake.common.base.utils.tree;

import java.util.List;

/**
 * @author snake
 * @date 2020/11/13
 */
public interface Treeable<T extends Treeable> {

    Object key();

    Object parentKey();

    T children(List<T> children);

    List<T> children();

    void add(T child);
}
