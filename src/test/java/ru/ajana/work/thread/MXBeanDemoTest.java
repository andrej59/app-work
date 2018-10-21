package ru.ajana.work.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Threads;

public class MXBeanDemoTest {

  private static final ThreadMXBean THREAD_MX_BEAN = ManagementFactory.getThreadMXBean();

  @Benchmark
  @Threads(10)
  @Test
  public void testAllocatedBytes() {
    long tid = Thread.currentThread().getId();
    THREAD_MX_BEAN.getThreadCpuTime(tid);
  }
}