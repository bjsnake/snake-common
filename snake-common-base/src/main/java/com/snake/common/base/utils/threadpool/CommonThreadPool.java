package com.snake.common.base.utils.threadpool;

/**
 * 描述：通用线程池
 * 时间: 2022/6/16 15:57
 *
 * @author snake
 */
public class CommonThreadPool {

    /**
     * 单例线程池
     */
    private volatile static ThreadPoolService threadPoolService;

    /**
     * 构造方法私有化
     */
    private CommonThreadPool(){

    }

    /**
     * 单例线程池获取
     * @return
     */
    public static ThreadPoolService getBlockThreadPool() {
        if (threadPoolService == null) {
            synchronized (CommonThreadPool.class) {
                if (threadPoolService == null) {
                    threadPoolService = new ThreadPoolServiceImpl();
                }
            }
        }
        return threadPoolService;
    }

}

