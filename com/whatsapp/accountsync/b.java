package com.whatsapp.accountsync;

import android.os.AsyncTask;
import com.whatsapp.bd;

public class b extends AsyncTask {
    final ProfileActivity a;

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    public b(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    protected void onPreExecute() {
        if (!this.a.isFinishing()) {
            this.a.showDialog(104);
        }
    }

    protected Void a(Void[] voidArr) {
        int i = PerformSyncManager.a;
        int i2 = 0;
        while (bd.e && i2 < 45000) {
            try {
                i2 += 200;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    if (i != 0) {
                        break;
                    }
                }
            } catch (InterruptedException e2) {
                throw e2;
            }
        }
        if (i2 >= 45000) {
            try {
                if (bd.e) {
                    bd.d();
                }
            } catch (InterruptedException e22) {
                throw e22;
            }
        }
        return null;
    }

    protected void a(Void voidR) {
        this.a.removeDialog(104);
        ProfileActivity.a(this.a);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
