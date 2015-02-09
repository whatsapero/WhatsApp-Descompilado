package com.whatsapp;

import android.os.AsyncTask;
import android.os.Build.VERSION;

public class a5w {
    public static AsyncTask a(AsyncTask asyncTask, Object[] objArr) {
        return VERSION.SDK_INT >= 11 ? asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, objArr) : asyncTask.execute(objArr);
    }
}
