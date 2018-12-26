package ru.ajana.work.common.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class MXBeanDemo {

  private static final ThreadMXBean THREAD_MX_BEAN = ManagementFactory.getThreadMXBean();

  public void doVerb() {
    long tid = Thread.currentThread().getId();
    //THREAD_MX_BEAN.getThreadAllocatedBytes(tid);

  }
}
