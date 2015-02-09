package com.whatsapp.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

public final class bm extends AsyncTask {
    private final Context a;

    public bm(Context context) {
        this.a = context;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void onPostExecute(Object obj) {
        a((Boolean) obj);
    }

    protected void a(Boolean bool) {
        if (bool.booleanValue()) {
            Intent intent = new Intent(this.a, CaptivePortalActivity.class);
            intent.setFlags(268435456);
            this.a.startActivity(intent);
        }
    }

    protected Boolean a(Void[] voidArr) {
        try {
            return Boolean.valueOf(MessageService.x());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return Boolean.valueOf(false);
        }
    }
}
