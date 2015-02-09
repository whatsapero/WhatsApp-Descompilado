package com.whatsapp;

import android.os.AsyncTask;

class ir extends AsyncTask {
    final HomeActivity a;

    private ir(HomeActivity homeActivity) {
        this.a = homeActivity;
    }

    protected void a(Boolean bool) {
        this.a.removeDialog(1);
        HomeActivity.a(this.a, bool.booleanValue());
    }

    protected Boolean a(Void[] voidArr) {
        try {
            return Boolean.valueOf(b1.i());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return Boolean.valueOf(false);
        }
    }

    protected void onPreExecute() {
        this.a.showDialog(1);
    }

    protected void onPostExecute(Object obj) {
        a((Boolean) obj);
    }

    ir(HomeActivity homeActivity, n5 n5Var) {
        this(homeActivity);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
