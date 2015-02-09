package com.whatsapp;

import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class j_ {
    private static j_ b;
    private static final String[] z;
    private fj a;
    private WakeLock c;
    private ArrayList d;
    private Handler e;

    static {
        String[] strArr = new String[3];
        String str = "\n]~\u0013=\bF{\u0018!\u001f[~\u0013#\tQo\u0013}\rA\u007f\u00037\\";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 124;
                        break;
                    case ay.f /*1*/:
                        i3 = 52;
                        break;
                    case ay.n /*2*/:
                        i3 = 26;
                        break;
                    case ay.p /*3*/:
                        i3 = 118;
                        break;
                    default:
                        i3 = 82;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\f[m\u0013 ";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\n]~\u0013=\bF{\u0018!\u001f[~\u0013";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static synchronized j_ a() {
        j_ j_Var;
        synchronized (j_.class) {
            if (b == null) {
                b = new j_();
            }
            j_Var = b;
        }
        return j_Var;
    }

    public void a(b bVar) {
        bVar.a = 1;
        MediaData mediaData = (MediaData) bVar.A;
        mediaData.transferring = true;
        mediaData.progress = 0;
        App.aJ.a(bVar, false, -1);
        synchronized (this.d) {
            Log.i(z[0] + bVar.e.a + " " + mediaData.file.getAbsolutePath());
            this.d.add(bVar);
            this.d.notifyAll();
        }
        if (this.a == null) {
            this.a = new fj(this);
            this.a.setPriority(1);
            this.a.start();
        }
    }

    private j_() {
        this.d = new ArrayList();
        this.e = new Handler();
        PowerManager powerManager = (PowerManager) App.p.getSystemService(z[2]);
        if (powerManager != null) {
            this.c = powerManager.newWakeLock(1, z[1]);
        }
    }

    static Handler c(j_ j_Var) {
        return j_Var.e;
    }

    static ArrayList a(j_ j_Var) {
        return j_Var.d;
    }

    static WakeLock b(j_ j_Var) {
        return j_Var.c;
    }
}
