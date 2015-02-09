package de.greenrobot.event.util;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import de.greenrobot.event.g;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class k {
    public static Class a;
    public static int b;
    private static final String[] z;

    public static Dialog a(Context context, Bundle bundle, OnClickListener onClickListener) {
        boolean z = h.a;
        Builder builder = new Builder(context);
        try {
            builder.setTitle(bundle.getString(z[3]));
            builder.setMessage(bundle.getString(z[2]));
            if (b != 0) {
                builder.setIcon(b);
            }
            builder.setPositiveButton(17039370, onClickListener);
            Dialog create = builder.create();
            if (z) {
                g.o++;
            }
            return create;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public static void a(DialogInterface dialogInterface, int i, Activity activity, Bundle bundle) {
        if (a != null) {
            try {
                f.a.b.b().b(a.newInstance());
            } catch (Throwable e) {
                throw new RuntimeException(z[1], e);
            }
        }
        if (bundle.getBoolean(z[0], false) && activity != null) {
            try {
                activity.finish();
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    static {
        String[] strArr = new String[4];
        String str = ">g\u0018j\u0015?gX\u007f\b8mB#\u0002,gXy\u0005/q\u0018h\u0015(mDi\u000e;nYjI<kXd\u00142]Wk\u0013?pii\u000e;nYj";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 90;
                        break;
                    case ay.f /*1*/:
                        i4 = 2;
                        break;
                    case ay.n /*2*/:
                        i4 = 54;
                        break;
                    case ay.p /*3*/:
                        i4 = 13;
                        break;
                    default:
                        i4 = 103;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = ">g\u0018j\u0015?gX\u007f\b8mB#\u0002,gXy\u0005/q\u0018h\u0015(mDi\u000e;nYjI7gE~\u0006=g";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = ">g\u0018j\u0015?gX\u007f\b8mB#\u0002,gXy\u0005/q\u0018h\u0015(mDi\u000e;nYjI.kBa\u0002";
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    b = 0;
                default:
                    strArr2[i2] = str;
                    str = "\u001ftSc\u0013zaWc\t5v\u0016o\u0002zaYc\u0014.pCn\u0013?f";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
