package com.whatsapp;

import android.os.AsyncTask;

class av2 extends AsyncTask {
    final Conversations a;

    protected Boolean a(Void[] voidArr) {
        try {
            return Boolean.valueOf(b1.i());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return Boolean.valueOf(false);
        }
    }

    private av2(Conversations conversations) {
        this.a = conversations;
    }

    protected void onPreExecute() {
        this.a.showDialog(1);
    }

    protected void a(Boolean bool) {
        this.a.removeDialog(1);
        Conversations.a(this.a, bool.booleanValue());
    }

    protected void onPostExecute(Object obj) {
        a((Boolean) obj);
    }

    av2(Conversations conversations, a3o com_whatsapp_a3o) {
        this(conversations);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
