package com.whatsapp.gallerypicker;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class bs extends AsyncTask {
    private static final String z;
    final ImageGallery a;
    final boolean b;
    final boolean c;

    static {
        char[] toCharArray = "3Fb\u0007>=Jo\f>(R,\u000176\u000ba\u001581Nw\u0013{;Xp\t<4Ng".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 90;
                    break;
                case ay.f /*1*/:
                    i2 = 43;
                    break;
                case ay.n /*2*/:
                    i2 = 3;
                    break;
                case ay.p /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    bs(ImageGallery imageGallery, boolean z, boolean z2) {
        this.a = imageGallery;
        this.b = z;
        this.c = z2;
    }

    protected Void a(Void[] voidArr) {
        boolean z;
        int i = ImagePreview.y;
        ImageGallery imageGallery = this.a;
        if (this.b) {
            z = false;
        } else {
            z = true;
        }
        v a = ImageGallery.a(imageGallery, z);
        int b = a.b();
        this.a.runOnUiThread(new ah(this, b));
        int i2 = 0;
        a5 a5Var = null;
        while (i2 < b && (!isCancelled() || i != 0)) {
            aw a2 = a.a(i2);
            if (a2 == null && i == 0) {
                break;
            }
            a5 a3 = this.a.a(a2.c());
            if (a5Var == null || !a5Var.equals(a3)) {
                if (a5Var != null) {
                    this.a.runOnUiThread(new q(this, a5Var));
                }
                a3.a = 0;
                a5Var = a3;
            }
            r0.a++;
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        if (!(a5Var == null || isCancelled())) {
            this.a.runOnUiThread(new bu(this, a5Var));
        }
        a.e();
        Log.i(z);
        return null;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(Void voidR) {
        ImageGallery.d(this.a).notifyDataSetChanged();
    }
}
