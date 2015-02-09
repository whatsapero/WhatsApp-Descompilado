package android.support.v4.content;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

abstract class ModernAsyncTask {
    public static final Executor THREAD_POOL_EXECUTOR;
    private static volatile Executor sDefaultExecutor;
    private static final InternalHandler sHandler;
    private static final BlockingQueue sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;
    private final FutureTask mFuture;
    private volatile Status mStatus;
    private final AtomicBoolean mTaskInvoked;
    private final WorkerRunnable mWorker;

    abstract class WorkerRunnable implements Callable {
        Object[] mParams;

        private WorkerRunnable() {
        }

        WorkerRunnable(AnonymousClass_1 anonymousClass_1) {
            this();
        }
    }

    class AnonymousClass_3 extends FutureTask {
        private static final String[] z;
        final ModernAsyncTask this$0;

        static {
            String[] strArr = new String[3];
            String str = "44Oi\u0006\u00075\u001d,\u001b\u00169\u001a~\u0011\u0011z\u0018d\u001d\u0019?Oi\f\u00109\u001ax\u001d\u001b=Oh\u001b<4-m\u0017\u001e=\u001dc\u0001\u001b>G%";
            Object obj = -1;
            String[] strArr2 = strArr;
            String[] strArr3 = strArr;
            int i = 0;
            while (true) {
                char[] toCharArray = str.toCharArray();
                int length = toCharArray.length;
                char[] cArr = toCharArray;
                for (int i2 = 0; length > i2; i2++) {
                    int i3;
                    char c = cArr[i2];
                    switch (i2 % 5) {
                        case PBE.MD5 /*0*/:
                            i3 = 117;
                            break;
                        case ay.f /*1*/:
                            i3 = 90;
                            break;
                        case ay.n /*2*/:
                            i3 = 111;
                            break;
                        case ay.p /*3*/:
                            i3 = 12;
                            break;
                        default:
                            i3 = 116;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        i = 2;
                        strArr2 = strArr3;
                        str = "44Oi\u0006\u00075\u001d,\u001b\u00169\u001a~\u0011\u0011z\u0018d\u001d\u0019?Oi\f\u00109\u001ax\u001d\u001b=Oh\u001b<4-m\u0017\u001e=\u001dc\u0001\u001b>G%";
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "4)\u0016b\u0017!;\u001cg";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        protected void done() {
            try {
                ModernAsyncTask.access$400(this.this$0, get());
            } catch (Throwable e) {
                Log.w(z[1], e);
            } catch (ExecutionException e2) {
                throw new RuntimeException(z[0], e2.getCause());
            } catch (CancellationException e3) {
                ModernAsyncTask.access$400(this.this$0, null);
            } catch (Throwable e4) {
                RuntimeException runtimeException = new RuntimeException(z[2], e4);
            }
        }

        AnonymousClass_3(ModernAsyncTask modernAsyncTask, Callable callable) {
            this.this$0 = modernAsyncTask;
            super(callable);
        }
    }

    class AsyncTaskResult {
        final Object[] mData;
        final ModernAsyncTask mTask;

        AsyncTaskResult(ModernAsyncTask modernAsyncTask, Object[] objArr) {
            this.mTask = modernAsyncTask;
            this.mData = objArr;
        }
    }

    class InternalHandler extends Handler {
        InternalHandler(AnonymousClass_1 anonymousClass_1) {
            this();
        }

        public void handleMessage(Message message) {
            AsyncTaskResult asyncTaskResult = (AsyncTaskResult) message.obj;
            switch (message.what) {
                case ay.f /*1*/:
                    ModernAsyncTask.access$500(asyncTaskResult.mTask, asyncTaskResult.mData[0]);
                    if (!Loader.a) {
                        return;
                    }
                    break;
                case ay.n /*2*/:
                    break;
                default:
                    return;
            }
            asyncTaskResult.mTask.onProgressUpdate(asyncTaskResult.mData);
        }

        private InternalHandler() {
        }
    }

    public enum Status {
        ;
        private static final android.support.v4.content.ModernAsyncTask.Status[] $VALUES;
        public static final android.support.v4.content.ModernAsyncTask.Status FINISHED;
        public static final android.support.v4.content.ModernAsyncTask.Status PENDING;
        public static final android.support.v4.content.ModernAsyncTask.Status RUNNING;
        private static final String[] z;

        static {
            String[] strArr = new String[3];
            String str = "<\u0002,+\u000f \u0010";
            int i = -1;
            String[] strArr2 = strArr;
            String[] strArr3 = strArr;
            int i2 = 0;
            while (true) {
                char[] toCharArray = str.toCharArray();
                int length = toCharArray.length;
                char[] cArr = toCharArray;
                for (int i3 = 0; length > i3; i3++) {
                    int i4;
                    char c = cArr[i3];
                    switch (i3 % 5) {
                        case PBE.MD5 /*0*/:
                            i4 = 110;
                            break;
                        case ay.f /*1*/:
                            i4 = 87;
                            break;
                        case ay.n /*2*/:
                            i4 = 98;
                            break;
                        case ay.p /*3*/:
                            i4 = 101;
                            break;
                        default:
                            i4 = 70;
                            break;
                    }
                    cArr[i3] = (char) (i4 ^ c);
                }
                str = new String(cArr).intern();
                switch (i) {
                    case PBE.MD5 /*0*/:
                        strArr2[i2] = str;
                        str = "(\u001e,,\u0015&\u0012&";
                        i2 = 2;
                        strArr2 = strArr3;
                        i = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i2] = str;
                        z = strArr3;
                        PENDING = new android.support.v4.content.ModernAsyncTask.Status(z[1], 0);
                        RUNNING = new android.support.v4.content.ModernAsyncTask.Status(z[0], 1);
                        FINISHED = new android.support.v4.content.ModernAsyncTask.Status(z[2], 2);
                        $VALUES = new android.support.v4.content.ModernAsyncTask.Status[]{PENDING, RUNNING, FINISHED};
                    default:
                        strArr2[i2] = str;
                        str = ">\u0012,!\u000f \u0010";
                        i2 = 1;
                        strArr2 = strArr3;
                        i = 0;
                        break;
                }
            }
        }
    }

    protected abstract Object doInBackground(Object[] objArr);

    private Object postResult(Object obj) {
        sHandler.obtainMessage(1, new AsyncTaskResult(this, new Object[]{obj})).sendToTarget();
        return obj;
    }

    private void postResultIfNotInvoked(Object obj) {
        if (!this.mTaskInvoked.get()) {
            postResult(obj);
        }
    }

    protected void onPostExecute(Object obj) {
    }

    static void access$500(ModernAsyncTask modernAsyncTask, Object obj) {
        modernAsyncTask.finish(obj);
    }

    static {
        sThreadFactory = new ThreadFactory() {
            private static final String z;
            private final AtomicInteger mCount;

            static {
                char[] toCharArray = "y\u0005|a!Z+k}=W>yw8\u0014I".toCharArray();
                int length = toCharArray.length;
                char[] cArr = toCharArray;
                for (int i = 0; length > i; i++) {
                    int i2;
                    char c = cArr[i];
                    switch (i % 5) {
                        case PBE.MD5 /*0*/:
                            i2 = 52;
                            break;
                        case ay.f /*1*/:
                            i2 = 106;
                            break;
                        case ay.n /*2*/:
                            i2 = 24;
                            break;
                        case ay.p /*3*/:
                            i2 = 4;
                            break;
                        default:
                            i2 = 83;
                            break;
                    }
                    cArr[i] = (char) (i2 ^ c);
                }
                z = new String(cArr).intern();
            }

            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, z + this.mCount.getAndIncrement());
            }

            {
                this.mCount = new AtomicInteger(1);
            }
        };
        sPoolWorkQueue = new LinkedBlockingQueue(10);
        THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory);
        sHandler = new InternalHandler(null);
        sDefaultExecutor = THREAD_POOL_EXECUTOR;
    }

    protected void onCancelled() {
    }

    public final boolean isCancelled() {
        return this.mFuture.isCancelled();
    }

    static void access$400(ModernAsyncTask modernAsyncTask, Object obj) {
        modernAsyncTask.postResultIfNotInvoked(obj);
    }

    protected void onProgressUpdate(Object[] objArr) {
    }

    static AtomicBoolean access$200(ModernAsyncTask modernAsyncTask) {
        return modernAsyncTask.mTaskInvoked;
    }

    protected void onCancelled(Object obj) {
        onCancelled();
    }

    static Object access$300(ModernAsyncTask modernAsyncTask, Object obj) {
        return modernAsyncTask.postResult(obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void finish(java.lang.Object r2) {
        /*
        r1_this = this;
        r0 = r1.isCancelled();
        if (r0 == 0) goto L_0x000d;
    L_0x0006:
        r1.onCancelled(r2);
        r0 = android.support.v4.content.Loader.a;
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        r1.onPostExecute(r2);
    L_0x0010:
        r0 = android.support.v4.content.ModernAsyncTask.Status.FINISHED;
        r1.mStatus = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.ModernAsyncTask.finish(java.lang.Object):void");
    }

    public ModernAsyncTask() {
        this.mStatus = Status.PENDING;
        this.mTaskInvoked = new AtomicBoolean();
        this.mWorker = new WorkerRunnable() {
            final ModernAsyncTask this$0;

            {
                this.this$0 = r2;
            }

            public Object call() {
                ModernAsyncTask.access$200(this.this$0).set(true);
                Process.setThreadPriority(10);
                return ModernAsyncTask.access$300(this.this$0, this.this$0.doInBackground(this.mParams));
            }
        };
        this.mFuture = new AnonymousClass_3(this, this.mWorker);
    }
}
