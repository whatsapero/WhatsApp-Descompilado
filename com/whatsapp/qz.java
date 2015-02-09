package com.whatsapp;

import android.view.View;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import com.whatsapp.util.ar;
import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class qz extends ar {
    private static final String[] z;
    final ChangeNumber b;

    static {
        String[] strArr = new String[7];
        String str = "L\u001cO\u0014\u0019\u0006\u0000\u0007";
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
                        i3 = 99;
                        break;
                    case ay.f /*1*/:
                        i3 = 114;
                        break;
                    case ay.n /*2*/:
                        i3 = 58;
                        break;
                    case ay.p /*3*/:
                        i3 = 121;
                        break;
                    default:
                        i3 = 123;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0000\u001a[\u0017\u001c\u0006\u001cO\u0014\u0019\u0006\u0000\u0015\t\u0013\f\u001c_V\u0018\u0000O";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0000\u001a[\u0017\u001c\u0006\u001cO\u0014\u0019\u0006\u0000\u0015\n\u000e\u0001\u001fS\rT\u0000\u0011\u001a";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0000\u001a[\u0017\u001c\u0006\u001cO\u0014\u0019\u0006\u0000\u0015\t\u0013\f\u001c_Y\u001d\u0002\u001bV\u001c\u001fC\u0006H\u0010\u0016/\u0017[\u001d\u0012\r\u0015`\u001c\t\fR\\\u000b\u0014\u000eRy\u0016\u000e\r\u0006H\u0000+\u000b\u001dT\u001c2\r\u0014U";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "C\u0002RD";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "C\u0018S\u001dF";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "?6";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(View view) {
        String trim = ChangeNumber.a(this.b).e.getText().toString().trim();
        String toString = ChangeNumber.a(this.b).c.getText().toString();
        try {
            if (ChangeNumber.a(this.b, trim, toString, ChangeNumber.a(this.b))) {
                try {
                    if (ChangeNumber.a(this.b, this.b.r.e.getText().toString().trim(), this.b.r.c.getText().toString(), this.b.r)) {
                        int parseInt = Integer.parseInt(trim);
                        toString = toString.replaceAll(z[1], "");
                        try {
                            toString = ats.a(parseInt, toString);
                        } catch (Throwable e) {
                            Log.b(z[4], e);
                        }
                        try {
                            Log.i(z[2] + trim + z[0] + toString);
                            ChangeNumber.e(trim);
                            ChangeNumber.b(toString);
                            Log.w(z[3] + ChangeNumber.a() + z[5] + ChangeNumber.b() + z[6] + App.an.jabber_id);
                            this.b.showDialog(1);
                            ChangeNumber.c(this.b).sendEmptyMessageDelayed(4, 30000);
                            if (!App.a(ChangeNumber.a(), ChangeNumber.b(), ChangeNumber.b(this.b), ChangeNumber.d(this.b))) {
                                ChangeNumber.c(this.b).removeMessages(4);
                                this.b.removeDialog(1);
                                this.b.f(this.b.getString(R.string.register_check_connectivity, new Object[]{this.b.getString(R.string.connectivity_self_help_instructions)}));
                            }
                        } catch (IOException e2) {
                            throw e2;
                        }
                    }
                } catch (IOException e22) {
                    throw e22;
                }
            }
        } catch (IOException e222) {
            throw e222;
        }
    }

    qz(ChangeNumber changeNumber) {
        this.b = changeNumber;
    }
}
