package com.whatsapp;

import android.os.AsyncTask;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import com.whatsapp.wallpaper.p;
import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class jw extends AsyncTask {
    private static final String[] z;
    private final boolean a;

    static {
        String[] strArr = new String[7];
        String str = "^Vl\u0019}";
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
                        i3 = 46;
                        break;
                    case ay.f /*1*/:
                        i3 = 57;
                        break;
                    case ay.n /*2*/:
                        i3 = 27;
                        break;
                    case ay.p /*3*/:
                        i3 = 124;
                        break;
                    default:
                        i3 = 15;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "OIkSmOZp\t\u007f\u0001NwS}KU~\u001d|K";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "LXx\u0017z^]y";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "OIkSmOZp\t\u007f\u0001NwS}KU~\u001d|K";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "OIkSmOZp\t\u007f\u0001NwS}KU~\u001d|K";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "OIkSmOZp\t\u007f\u0001NwSnMHn\u0015}K";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "OIkSmOZp\t\u007f\u0001\\i\u000e`\\\u0019";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void a(Boolean bool) {
        Conversation.C();
        if (App.a6() != null) {
            App.a6().c();
        }
        if (bool == null) {
            a54.b();
        }
    }

    protected void onPostExecute(Object obj) {
        a((Boolean) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected jw(boolean z) {
        this.a = z;
    }

    protected Boolean a(Void[] voidArr) {
        Boolean a;
        IOException e;
        Boolean valueOf = Boolean.valueOf(false);
        PowerManager powerManager = (PowerManager) App.p.getSystemService(z[0]);
        WakeLock wakeLock = null;
        if (powerManager != null) {
            wakeLock = powerManager.newWakeLock(1, z[3]);
        }
        try {
            if (wakeLock != null) {
                wakeLock.acquire();
            }
            Log.i(z[6]);
            a = App.aJ.a(false, this.a);
            try {
                p.b(App.p);
                if (wakeLock != null) {
                    try {
                        if (wakeLock.isHeld()) {
                            wakeLock.release();
                            Log.i(z[5]);
                        }
                    } catch (IOException e2) {
                        throw e2;
                    }
                }
            } catch (IOException e3) {
                e = e3;
                try {
                    Log.e(z[1] + e.toString());
                    if (wakeLock != null) {
                        try {
                            if (wakeLock.isHeld()) {
                                wakeLock.release();
                                Log.i(z[2]);
                            }
                        } catch (IOException e22) {
                            throw e22;
                        }
                    }
                } catch (Throwable th) {
                    if (wakeLock != null) {
                        try {
                            if (wakeLock.isHeld()) {
                                wakeLock.release();
                                Log.i(z[4]);
                            }
                        } catch (IOException e222) {
                            throw e222;
                        }
                    }
                }
                return a;
            }
        } catch (IOException e2222) {
            throw e2222;
        } catch (IOException e22222) {
            IOException iOException = e22222;
            a = valueOf;
            e = iOException;
        }
        return a;
    }

    protected void onPreExecute() {
        App.J = false;
        if (App.a6() != null) {
            App.a6().a(R.string.msg_store_backup_db_title, R.string.msg_store_backup_db_message);
        }
    }
}
