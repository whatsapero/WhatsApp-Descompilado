package com.whatsapp;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.widget.Toast;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class tp extends AsyncTask {
    private static final String z;
    private ProgressDialog a;
    final WebImagePicker b;
    private d6 c;

    static {
        char[] toCharArray = "y:\r".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 92;
                    break;
                case ay.f /*1*/:
                    i2 = 8;
                    break;
                case ay.n /*2*/:
                    i2 = 61;
                    break;
                case ay.p /*3*/:
                    i2 = 122;
                    break;
                default:
                    i2 = 126;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void onPostExecute(Object obj) {
        a((Boolean) obj);
    }

    protected void onPreExecute() {
        this.a = new ProgressDialog(this.b);
        this.a.setProgressStyle(1);
        this.a.setMessage(this.b.getString(R.string.photo_loading));
        this.a.setCancelable(true);
        this.a.setOnCancelListener(new zc(this));
        this.a.show();
    }

    protected void a(Integer[] numArr) {
        if (this.a != null) {
            this.a.setProgress(numArr[0].intValue());
        }
    }

    static ProgressDialog a(tp tpVar) {
        return tpVar.a;
    }

    protected void onProgressUpdate(Object[] objArr) {
        a((Integer[]) objArr);
    }

    tp(WebImagePicker webImagePicker, d6 d6Var) {
        this.b = webImagePicker;
        this.c = d6Var;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    static ProgressDialog a(tp tpVar, ProgressDialog progressDialog) {
        tpVar.a = progressDialog;
        return progressDialog;
    }

    protected void a(Boolean bool) {
        if (this.a != null) {
            this.a.dismiss();
        }
        this.a = null;
        if (WebImagePicker.i(this.b) == this) {
            WebImagePicker.a(this.b, null);
        }
        if (bool.booleanValue()) {
            this.b.setResult(-1);
            this.b.finish();
            if (App.az == 0) {
                return;
            }
        }
        if (!isCancelled()) {
            Toast.makeText(this.b.getApplicationContext(), this.b.getString(R.string.error_load_image), 1).show();
        }
    }

    protected Boolean a(Void[] voidArr) {
        boolean z = true;
        int i = App.az;
        try {
            InputStream openStream = new URL(this.c.b.replace(" ", z)).openStream();
            OutputStream openOutputStream = App.e.openOutputStream(WebImagePicker.g(this.b));
            byte[] bArr = new byte[1024];
            int i2 = 0;
            int i3 = 0;
            while (!isCancelled()) {
                int read = openStream.read(bArr, 0, 1024);
                if (read == -1 && i == 0) {
                    break;
                }
                openOutputStream.write(bArr, 0, read);
                read += i3;
                if (this.c.a != 0) {
                    i3 = (read * 100) / this.c.a;
                } else {
                    i3 = 0;
                }
                if (i3 != i2) {
                    publishProgress(new Integer[]{Integer.valueOf(i3)});
                } else {
                    i3 = i2;
                }
                if (i != 0) {
                    break;
                }
                i2 = i3;
                i3 = read;
            }
            openOutputStream.close();
            try {
                if (isCancelled()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } catch (Exception e) {
                throw e;
            }
        } catch (Throwable e2) {
            try {
                if (!isCancelled()) {
                    Log.c(e2);
                }
                return Boolean.FALSE;
            } catch (Exception e3) {
                throw e3;
            }
        }
    }
}
