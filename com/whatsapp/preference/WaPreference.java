package com.whatsapp.preference;

import android.content.Context;
import android.os.Build.VERSION;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.App;
import com.whatsapp.b7;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class WaPreference extends Preference {
    private static final String[] z;
    private int a;

    static {
        String[] strArr = new String[4];
        String str = "A\u0002&V";
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
                        i3 = 40;
                        break;
                    case ay.f /*1*/:
                        i3 = 97;
                        break;
                    case ay.n /*2*/:
                        i3 = 73;
                        break;
                    case ay.p /*3*/:
                        i3 = 56;
                        break;
                    default:
                        i3 = 102;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "@\u0015=H\\\u0007N:[\u000eM\f(KHI\u000f-J\tA\u0005g[\tEN(H\r\u0007\u0013,KII\u000f-J\tA\u0005";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "A\u0002&V";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "@\u0015=H\\\u0007N:[\u000eM\f(KHI\u000f-J\tA\u0005g[\tEN(H\r\u0007\u0013,KII\u000f-J\tA\u0005";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public WaPreference(Context context) {
        super(context);
    }

    public WaPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (VERSION.SDK_INT < 11 && attributeSet != null) {
            this.a = attributeSet.getAttributeResourceValue(z[1], z[0], 0);
        }
    }

    public static View a(View view) {
        b7.a(view);
        if (!App.as()) {
            View findViewById = view.findViewById(16908310);
            if (findViewById != null) {
                findViewById.getLayoutParams().width = -1;
            }
            findViewById = view.findViewById(16908304);
            if (findViewById != null) {
                findViewById.getLayoutParams().width = -1;
            }
        }
        return view;
    }

    protected View onCreateView(ViewGroup viewGroup) {
        return a(super.onCreateView(viewGroup));
    }

    public WaPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (VERSION.SDK_INT < 11 && attributeSet != null) {
            this.a = attributeSet.getAttributeResourceValue(z[2], z[3], 0);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onBindView(android.view.View r4) {
        /*
        r3_this = this;
        r2 = 0;
        super.onBindView(r4);
        r0 = r3.a;
        if (r0 == 0) goto L_0x003d;
    L_0x0008:
        r0 = 16908310; // 0x1020016 float:2.387729E-38 double:8.353815E-317;
        r0 = r4.findViewById(r0);
        if (r0 == 0) goto L_0x003d;
    L_0x0011:
        r1 = r0 instanceof android.widget.TextView;
        if (r1 == 0) goto L_0x003d;
    L_0x0015:
        r0 = (android.widget.TextView) r0;
        r1 = com.whatsapp.App.as();
        if (r1 == 0) goto L_0x0026;
    L_0x001d:
        r1 = r3.a;
        r0.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r2, r2);
        r1 = com.whatsapp.preference.WaListPreference.a;
        if (r1 == 0) goto L_0x002b;
    L_0x0026:
        r1 = r3.a;
        r0.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r1, r2);
    L_0x002b:
        r1 = r3.getContext();
        r1 = r1.getResources();
        r2 = 2131361856; // 0x7f0a0040 float:1.8343476E38 double:1.053032672E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r0.setCompoundDrawablePadding(r1);
    L_0x003d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.preference.WaPreference.onBindView(android.view.View):void");
    }
}
