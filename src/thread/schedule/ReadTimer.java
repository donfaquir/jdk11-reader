package thread.schedule;

import java.util.Timer;
import java.util.TimerTask;

/**
 * {@link Timer} 说明
 * @Author caichangqing
 * @Date 2020/11/1823:41
 * @Since 1.0
 **/
public class ReadTimer {

    /**
     * 类注释翻译
     * Timer是以后台线程的形式为，方便线程按计划执行一些未来任务的工具；任务可以一次性执行，也可以按照一定间隔定期执行；
     *
     * 每个Timer对象都对应唯一一个后台线程，这个后台线程用于顺序执行这个Timer对象所有任务。（如何保证顺序执行的）
     * Timer的任务应该是快速完成的任务，如果一个任务执行时间过长，它会占用Timer的任务执行线程，这反过来会延迟后续任务的执行，
     * 当这个缓慢的任务最终执行完毕，有可能造成后续任务连续快速的执行完毕，造成捆绑执行的问题（问题：与定时任务间隔执行的初衷不符）
     *
     * 当没有对Timer对象的引用和所有任务都执行完毕后，Timer对象对应的任务执行线程会被优雅停止，并最终由GC回收，但是回收的周期是不确定的，
     * 可能是任意时间。默认条件下，这个任务执行线程不作为守护线程执行，这可以防止应用程序终止。如果调用者希望快速终止执行线程，可以显式
     * 调用Timer的cancel方法；
     *
     * 如果计时器的任务执行线程意外终止(例如，因为它的{@code Stop}方法被调用)，则任何在计时器上调度任务的进一步尝试都将
     * 导致{@code IllegalStateException}，这和调用了计时器的{@code Cancel}方法效果一样。
     *
     * 这个类是线程安全的，多线程可以共用一个Timer对象而不必所额外的同步措施
     *
     * 此类不提供实时性保证：它使用{@code Object.Wait(Long)}方法调度任务。（描述：通过延迟执行作为周期判断，不以系统时间作为判断）
     *
     * Java5.0引入了{@code java.util.current}包，其中的一个并发实用程序是
     * {@link java.util.concurrent.ScheduledThreadPoolExecutor ScheduledThreadPoolExecutor}，它是一个线程池，用于以给定的
     * 速率或延迟重复执行任务。它有效地替代了{@code Timer}/{@code TimerTask}组合，因为它允许多个服务线程，接受各种时间单位，并且不需要
     * 子类化{@code TimerTask}(只需实现{@code Runnable})。
     *
     * {@code ScheduledThreadPoolExecutor}指定一个任务执行线程时，效果相当于{@code Timer}。
     *
     * 实现说明：这个类可以扩展到大量并发调度的任务(数千个任务应该不会出现问题)。
     * 在内部，它使用二进制堆来表示其任务队列，因此调度一个任务的时间复杂度是O(Logn)，其中n是并发调度的任务数。
     *
     * 实现说明：所有构造函数都启动一个计时器线程。
     *
     * @author  Josh Bloch
     * @see     TimerTask
     * @see     Object#wait(long)
     * @since   1.3
     */

    private String 类注释;

    private String[] 参考文章 = new String[]{
            "https://baijiahao.baidu.com/s?id=1645906817252040900&wfr=spider&for=pc"
    };
}
