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
     * Timer以后台线程的形式为
     * A facility for threads to schedule tasks for future execution in a
     * background thread.  Tasks may be scheduled for one-time execution, or for
     * repeated execution at regular intervals.
     *
     * <p>Corresponding to each {@code Timer} object is a single background
     * thread that is used to execute all of the timer's tasks, sequentially.
     * Timer tasks should complete quickly.  If a timer task takes excessive time
     * to complete, it "hogs" the timer's task execution thread.  This can, in
     * turn, delay the execution of subsequent tasks, which may "bunch up" and
     * execute in rapid succession when (and if) the offending task finally
     * completes.
     *
     * <p>After the last live reference to a {@code Timer} object goes away
     * <i>and</i> all outstanding tasks have completed execution, the timer's task
     * execution thread terminates gracefully (and becomes subject to garbage
     * collection).  However, this can take arbitrarily long to occur.  By
     * default, the task execution thread does not run as a <i>daemon thread</i>,
     * so it is capable of keeping an application from terminating.  If a caller
     * wants to terminate a timer's task execution thread rapidly, the caller
     * should invoke the timer's {@code cancel} method.
     *
     * <p>If the timer's task execution thread terminates unexpectedly, for
     * example, because its {@code stop} method is invoked, any further
     * attempt to schedule a task on the timer will result in an
     * {@code IllegalStateException}, as if the timer's {@code cancel}
     * method had been invoked.
     *
     * <p>This class is thread-safe: multiple threads can share a single
     * {@code Timer} object without the need for external synchronization.
     *
     * <p>This class does <i>not</i> offer real-time guarantees: it schedules
     * tasks using the {@code Object.wait(long)} method.
     *
     * <p>Java 5.0 introduced the {@code java.util.concurrent} package and
     * one of the concurrency utilities therein is the {@link
     * java.util.concurrent.ScheduledThreadPoolExecutor
     * ScheduledThreadPoolExecutor} which is a thread pool for repeatedly
     * executing tasks at a given rate or delay.  It is effectively a more
     * versatile replacement for the {@code Timer}/{@code TimerTask}
     * combination, as it allows multiple service threads, accepts various
     * time units, and doesn't require subclassing {@code TimerTask} (just
     * implement {@code Runnable}).  Configuring {@code
     * ScheduledThreadPoolExecutor} with one thread makes it equivalent to
     * {@code Timer}.
     *
     * <p>Implementation note: This class scales to large numbers of concurrently
     * scheduled tasks (thousands should present no problem).  Internally,
     * it uses a binary heap to represent its task queue, so the cost to schedule
     * a task is O(log n), where n is the number of concurrently scheduled tasks.
     *
     * <p>Implementation note: All constructors start a timer thread.
     *
     * @author  Josh Bloch
     * @see     TimerTask
     * @see     Object#wait(long)
     * @since   1.3
     */

    private String classNote;
}
