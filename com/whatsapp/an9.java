package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.fieldstats.as;
import com.whatsapp.util.Log;

public class an9 extends AsyncTask {
    final SearchFAQ a;

    protected void a(Void voidR) {
        this.a.removeDialog(1);
        SearchFAQ.a(this.a).n = Double.valueOf((double) as.EMAIL_SEND.getCode());
        or.a(this.a, SearchFAQ.b(this.a), SearchFAQ.d(this.a), SearchFAQ.c(this.a), SearchFAQ.e(this.a));
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    protected Void a(Void[] voidArr) {
        Log.h();
        Log.g();
        return null;
    }

    protected an9(SearchFAQ searchFAQ) {
        this.a = searchFAQ;
    }

    protected void onPreExecute() {
        this.a.showDialog(1);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
