package com.whatsapp;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.widget.Toast;
import com.actionbarsherlock.R;
import com.whatsapp.fieldstats.al;
import com.whatsapp.protocol.b;

class amr extends AsyncTask {
    final Conversation a;
    private b b;
    private ProgressDialog c;
    private String d;
    private boolean e;

    public jn a(Void[] voidArr) {
        jn a = App.aJ.a(this.a.r.e, this.b, this.e, this.d, 100, Conversation.q(this.a));
        if (!(a == null || a.a == null)) {
            a.a.moveToPosition(Math.max(0, (a.a.getCount() - a.b) - 50));
        }
        return a;
    }

    public void a(jn jnVar) {
        this.c.dismiss();
        if (!isCancelled()) {
            if (jnVar != null) {
                if (jnVar.a != null) {
                    Conversation.a(this.a, jnVar.a);
                    Conversation.q(this.a).b();
                    this.a.aS.changeCursor(jnVar.a);
                }
                this.a.bd.setTranscriptMode(0);
                this.a.bd.setSelection(jnVar.b);
                Conversation.a(this.a, null);
                if (App.az == 0) {
                    return;
                }
            }
            Toast.makeText(this.a.getApplicationContext(), this.a.getString(R.string.not_found), 0).show();
        }
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    public amr(Conversation conversation, String str, boolean z, b bVar) {
        this.a = conversation;
        this.d = str;
        this.e = z;
        this.b = bVar;
        this.c = ProgressDialog.show(conversation, "", conversation.getString(R.string.searching), true, false);
        this.c.setCancelable(true);
        al.a(App.p, com.whatsapp.fieldstats.b.CONTENT_SEARCH_C, Integer.valueOf(1));
    }

    public void onPostExecute(Object obj) {
        a((jn) obj);
    }
}
