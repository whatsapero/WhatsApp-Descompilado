package com.whatsapp.util;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class br {
    private static final BlockingQueue a;
    private static final ThreadFactory b;
    private static final ThreadPoolExecutor c;

    public static void a(Runnable runnable) {
        c.execute(runnable);
    }

    static {
        a = new LinkedBlockingQueue(2048);
        b = new b5();
        c = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, a, b);
    }
}
