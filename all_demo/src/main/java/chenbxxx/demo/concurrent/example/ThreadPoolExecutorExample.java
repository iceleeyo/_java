package chenbxxx.demo.concurrent.example;

import java.util.concurrent.*;

/**
 * @author chenbxxx
 * @email ai654778@vip.qq.com
 * @date 2018/8/27
 */
public class ThreadPoolExecutorExample {

    /**
     * 可缓存线程池：
     * 1. 线程数无限制
     * 2. 有空闲线程则复用空闲线程，若无空闲线程则新建线程
     * 3. 一定程度上减少频繁创建/销毁线程，减少系统开销
     */
    ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    /**
     * 定长线程池
     *  1. 可控制线程最大并发数
     *  2. 超出的线程会在队列中等待
     */
    ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);

    /**
     * 定长线程池：
     * 1. 支持定时及周期性任务执行。
     */
    ExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(10);

    /**
     * 单线程化的线程池：
     * 1. 有且仅有一个工作线程执行任务
     * 2. 所有任务按照指定顺序执行，即遵循队列的入队出队规则
     */
    ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
    public static void main(String[] args) {
        /**
         * `SynchronousQueue`该阻塞队列不会保留任何线程,接收到任务之后就交给线程处理,池中无可用线程就创建.
         *      `maximumPoolSize`通常为`Integer.MAX_VALUE`.
         */
        SynchronousQueue<Runnable> synchronousQueue = new SynchronousQueue<>();

        /**
         * `LinkedBlockingQueue`在接收到任务时,活动线程小于`corePoolSize`则创建执行线程,否则无限存储.
         *      `maximumPoolSize`失效
         */
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();

        /**
         *  `ArrayBlockQueue`该线程可以指定等待队列的容量,接收到任务时,活动线程小于`corePoolSize`则创建并执行,等于则入队列,队列满则抛错.
         */
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(10);

       ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 100,
                20, TimeUnit.MINUTES, synchronousQueue, r -> new Thread("TestThread"+r));
    }
}