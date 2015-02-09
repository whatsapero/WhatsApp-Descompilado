package com.whatsapp;

import android.os.AsyncTask;

class cw extends AsyncTask {
    final dc a;

    cw(dc dcVar) {
        this.a = dcVar;
    }

    public void a(Boolean bool) {
        Conversation.a(this.a.a, bool);
        Conversation.n(this.a.a).setEnabled(bool.booleanValue());
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected Boolean a(Void[] voidArr) {
        return Boolean.valueOf(App.aJ.s(this.a.a.r.e));
    }

    public void onPostExecute(Object obj) {
        a((Boolean) obj);
    }
}
