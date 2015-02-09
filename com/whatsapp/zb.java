package com.whatsapp;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;

class zb extends AsyncTask {
    private Runnable a;
    final Conversation b;
    private long c;
    private String d;
    private Handler e;
    private boolean f;

    static String a(zb zbVar) {
        return zbVar.d;
    }

    public zb(Conversation conversation, String str, boolean z) {
        this.b = conversation;
        this.d = str;
        this.f = z;
        this.c = SystemClock.uptimeMillis();
    }

    protected void a(String str) {
        if (this.d.equals(this.b.r.e)) {
            Conversation.d(this.b, str);
            this.e = new Handler();
            this.a = new a18(this);
            if (this.f) {
                this.e.postAtTime(this.a, this.c + 3000);
                if (App.az == 0) {
                    return;
                }
            }
            this.a.run();
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void onPostExecute(Object obj) {
        a((String) obj);
    }

    protected String a(Void[] voidArr) {
        return bd.h(this.d);
    }

    protected void a() {
        super.cancel(false);
        if (this.e != null) {
            this.e.removeCallbacks(this.a);
        }
        this.e = null;
        this.a = null;
    }
}
