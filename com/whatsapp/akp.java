package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.protocol.b;

class akp extends AsyncTask {
    final b a;
    final jg b;

    akp(jg jgVar, b bVar) {
        this.b = jgVar;
        this.a = bVar;
    }

    protected void a(byte[] bArr) {
        boolean z;
        ((MediaData) this.a.A).transferring = false;
        this.a.O = 1;
        this.a.b(bArr);
        l7 l7Var = App.aJ;
        b bVar = this.a;
        if (bArr != null) {
            z = true;
        } else {
            z = false;
        }
        l7Var.a(bVar, z, -1);
    }

    protected byte[] a(Void[] voidArr) {
        return us.a(this.a.K, this.a.G);
    }

    protected void onPostExecute(Object obj) {
        a((byte[]) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
