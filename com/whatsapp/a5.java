package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class a5 extends AsyncTask {
    private static final String[] z;
    final ContactInfo a;

    static {
        String[] strArr = new String[17];
        String str = "N\u0011\u001fndN\n\u0018tcBQ\u0004jaL\n\u0014~";
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
                        i3 = 45;
                        break;
                    case ay.f /*1*/:
                        i3 = 126;
                        break;
                    case ay.n /*2*/:
                        i3 = 113;
                        break;
                    case ay.p /*3*/:
                        i3 = 26;
                        break;
                    default:
                        i3 = 5;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "I\u001f\u0005{4";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "_\u001f\u0006EfB\u0010\u0005{fY!\u0018~";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "r\u0017\u0015";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    str = "_\u001f\u0006EfB\u0010\u0005{fY!\u0018~8\u0012^0TA\r\u0013\u0018w`Y\u0007\u0001\u007f8\n\b\u001f~+L\u0010\u0015hjD\u001a_yp_\r\u001eh+D\n\u0014w*]\u0016\u001et`r\bC=";
                    obj = 4;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "q:";
                    obj = 5;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "N\u0011\u001fndN\n.sa";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "q:";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "I\u001f\u0005{6";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "_\u001f\u0006EfB\u0010\u0005{fY!\u0018~";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "I\u001f\u0005{4";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "N\u0011\u001fndN\n.sa";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "N\u0011\u001fndN\n.sa\u0010AQ[Ki^\u001cshH\n\bj`\u0010Y\u0007ta\u0003\u001f\u001f~wB\u0017\u00154fX\f\u0002uw\u0003\u0017\u0005\u007fh\u0002\u000e\u0019ukH!\u0007(\"";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "I\u001f\u0005{7";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "I\u001f\u0005{6";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "r\u0017\u0015";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "I\u001f\u0005{7";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a() {
        int i = App.az;
        ArrayList h = App.P.h();
        List arrayList = new ArrayList();
        Iterator it = h.iterator();
        while (it.hasNext()) {
            m8 m8Var = (m8) it.next();
            if (!isCancelled() || i != 0) {
                if (!(!m8Var.w() || m8Var.b() || m8Var.N == null)) {
                    Set j = bd.i(m8Var.e).j();
                    if (j != null && j.contains(ContactInfo.e(this.a).e)) {
                        arrayList.add(m8Var);
                        continue;
                    }
                }
                if (i != 0) {
                    break;
                }
            }
            break;
        }
        if (!isCancelled()) {
            this.a.runOnUiThread(new iy(this, arrayList));
        }
    }

    private void b() {
        int a = ContactInfo.a(this.a, ContactInfo.e(this.a).e, new vh(this));
        if (a != 0 && !isCancelled()) {
            this.a.runOnUiThread(new anr(this, a));
        }
    }

    public void a(Void voidR) {
        this.a.setSupportProgressBarIndeterminateVisibility(false);
        Log.i(z[0]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r14_this = this;
        r13 = 3;
        r12 = 2;
        r5 = 0;
        r8 = 0;
        r7 = 1;
        r9 = com.whatsapp.App.az;
        r0 = r14.a;
        r0 = r0.getContentResolver();
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;
        r2 = new java.lang.String[r12];
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r2[r8] = r3;
        r3 = z;
        r4 = 12;
        r3 = r3[r4];
        r2[r7] = r3;
        r3 = z;
        r4 = 5;
        r3 = r3[r4];
        r4 = new java.lang.String[r7];
        r6 = r14.a;
        r6 = com.whatsapp.ContactInfo.e(r6);
        r10 = r6.e();
        r6 = java.lang.String.valueOf(r10);
        r4[r8] = r6;
        r1 = r0.query(r1, r2, r3, r4, r5);
        if (r1 == 0) goto L_0x01f9;
    L_0x003d:
        r0 = r1.moveToNext();
        if (r0 == 0) goto L_0x01f6;
    L_0x0043:
        r0 = z;
        r2 = 7;
        r0 = r0[r2];
        r0 = r1.getColumnIndex(r0);
        r0 = r1.getString(r0);
    L_0x0050:
        r1.close();
        r6 = r0;
        r0 = r5;
    L_0x0055:
        r10 = new java.util.ArrayList;
        r10.<init>();
        r1 = new com.whatsapp.ash;
        r2 = r14.a;
        r3 = r14.a;
        r3 = com.whatsapp.ContactInfo.e(r3);
        r1.<init>(r2, r3);
        r10.add(r1);
        if (r6 == 0) goto L_0x01f3;
    L_0x006c:
        r0 = r14.a;
        r0 = r0.getContentResolver();
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;
        r2 = 5;
        r2 = new java.lang.String[r2];
        r3 = z;
        r4 = 16;
        r3 = r3[r4];
        r2[r8] = r3;
        r3 = z;
        r3 = r3[r13];
        r2[r7] = r3;
        r3 = z;
        r3 = r3[r12];
        r2[r12] = r3;
        r3 = z;
        r3 = r3[r7];
        r2[r13] = r3;
        r3 = 4;
        r4 = z;
        r11 = 15;
        r4 = r4[r11];
        r2[r3] = r4;
        r3 = z;
        r4 = 13;
        r3 = r3[r4];
        r4 = new java.lang.String[r7];
        r4[r8] = r6;
        r0 = r0.query(r1, r2, r3, r4, r5);
        r3 = r0;
    L_0x00a9:
        if (r3 == 0) goto L_0x01d1;
    L_0x00ab:
        r1 = r7;
    L_0x00ac:
        r0 = r3.moveToNext();
        if (r0 == 0) goto L_0x0185;
    L_0x00b2:
        r0 = z;
        r2 = 11;
        r0 = r0[r2];
        r0 = r3.getColumnIndex(r0);
        r2 = r3.getString(r0);
        if (r2 != 0) goto L_0x00c4;
    L_0x00c2:
        if (r9 == 0) goto L_0x00ac;
    L_0x00c4:
        r0 = r14.isCancelled();
        if (r0 == 0) goto L_0x00cc;
    L_0x00ca:
        if (r9 == 0) goto L_0x0185;
    L_0x00cc:
        r0 = z;
        r4 = 10;
        r0 = r0[r4];
        r0 = r3.getColumnIndex(r0);
        r4 = r3.getLong(r0);
        r0 = z;
        r6 = 14;
        r0 = r0[r6];
        r0 = r3.getColumnIndex(r0);
        r6 = r3.getInt(r0);
        r0 = z;
        r11 = 9;
        r0 = r0[r11];
        r0 = r3.getColumnIndex(r0);
        r0 = r3.getString(r0);
        if (r6 != 0) goto L_0x00fa;
    L_0x00f8:
        if (r0 != 0) goto L_0x0108;
    L_0x00fa:
        r0 = r14.a;
        r0 = r0.getResources();
        r6 = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(r6);
        r0 = r0.getString(r6);
    L_0x0108:
        r6 = new com.whatsapp.ash;
        r11 = r14.a;
        r6.<init>(r11, r2, r0);
        r0 = com.whatsapp.App.P;
        r11 = new com.whatsapp.g9;
        r12 = android.telephony.PhoneNumberUtils.stripSeparators(r2);
        r11.<init>(r4, r12);
        r0 = r0.a(r11);
        if (r0 == 0) goto L_0x0129;
    L_0x0120:
        r4 = r0.q;
        if (r4 == 0) goto L_0x0129;
    L_0x0124:
        r0 = r0.e;
        com.whatsapp.ash.a(r6, r0);
    L_0x0129:
        r0 = z;
        r4 = 6;
        r0 = r0[r4];
        r4 = "";
        r4 = r2.replaceAll(r0, r4);
        r5 = r10.iterator();
        r2 = r7;
    L_0x0139:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x01f0;
    L_0x013f:
        r0 = r5.next();
        r0 = (com.whatsapp.ash) r0;
        r0 = com.whatsapp.ash.c(r0);
        r0 = r0.toString();
        r11 = z;
        r12 = 8;
        r11 = r11[r12];
        r12 = "";
        r0 = r0.replaceAll(r11, r12);
        r11 = r4.endsWith(r0);
        if (r11 != 0) goto L_0x0165;
    L_0x015f:
        r0 = r0.endsWith(r4);
        if (r0 == 0) goto L_0x01ed;
    L_0x0165:
        if (r9 == 0) goto L_0x01ea;
    L_0x0167:
        r0 = r8;
    L_0x0168:
        if (r9 == 0) goto L_0x01e7;
    L_0x016a:
        if (r0 == 0) goto L_0x0182;
    L_0x016c:
        r0 = com.whatsapp.ash.d(r6);
        if (r0 == 0) goto L_0x0179;
    L_0x0172:
        r10.add(r1, r6);
        r1 = r1 + 1;
        if (r9 == 0) goto L_0x0182;
    L_0x0179:
        r0 = com.whatsapp.App.aR();
        if (r0 != 0) goto L_0x0182;
    L_0x017f:
        r10.add(r6);
    L_0x0182:
        r0 = r1;
        if (r9 == 0) goto L_0x01e4;
    L_0x0185:
        r1 = r7;
    L_0x0186:
        r0 = r10.size();
        if (r1 >= r0) goto L_0x01ce;
    L_0x018c:
        r0 = r10.get(r1);
        r0 = (com.whatsapp.ash) r0;
        r2 = com.whatsapp.ash.d(r0);
        if (r2 == 0) goto L_0x01a5;
    L_0x0198:
        r2 = com.whatsapp.ash.d(r0);
        r2 = com.whatsapp.m3.b(r2);
        com.whatsapp.ash.b(r0, r2);
        if (r9 == 0) goto L_0x01ca;
    L_0x01a5:
        r2 = com.whatsapp.ash.c(r0);
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x01ca;
    L_0x01af:
        r2 = com.whatsapp.ash.c(r0);
        r2 = r2.charAt(r8);
        r4 = 43;
        if (r2 != r4) goto L_0x01ca;
    L_0x01bb:
        r2 = com.whatsapp.ash.c(r0);
        r2 = r2.substring(r7);
        r2 = com.whatsapp.m3.a(r2);
        com.whatsapp.ash.b(r0, r2);
    L_0x01ca:
        r0 = r1 + 1;
        if (r9 == 0) goto L_0x01e2;
    L_0x01ce:
        r3.close();
    L_0x01d1:
        r0 = r14.isCancelled();
        if (r0 != 0) goto L_0x01e1;
    L_0x01d7:
        r0 = r14.a;
        r1 = new com.whatsapp.sc;
        r1.<init>(r14, r10);
        r0.runOnUiThread(r1);
    L_0x01e1:
        return;
    L_0x01e2:
        r1 = r0;
        goto L_0x0186;
    L_0x01e4:
        r1 = r0;
        goto L_0x00ac;
    L_0x01e7:
        r2 = r0;
        goto L_0x0139;
    L_0x01ea:
        r0 = r8;
        goto L_0x016a;
    L_0x01ed:
        r0 = r2;
        goto L_0x0168;
    L_0x01f0:
        r0 = r2;
        goto L_0x016a;
    L_0x01f3:
        r3 = r0;
        goto L_0x00a9;
    L_0x01f6:
        r0 = r5;
        goto L_0x0050;
    L_0x01f9:
        r6 = r5;
        r0 = r1;
        goto L_0x0055;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5.c():void");
    }

    public void onPostExecute(Object obj) {
        a((Void) obj);
    }

    static void a(a5 a5Var, ArrayList arrayList) {
        a5Var.a(arrayList);
    }

    private void a(ArrayList arrayList) {
        if (!isCancelled()) {
            this.a.runOnUiThread(new lo(this, arrayList));
        }
    }

    public Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    private void d() {
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.mid_avatar_size);
        Bitmap a = ContactInfo.e(this.a).a(dimensionPixelSize, this.a.getResources().getDimension(R.dimen.mid_avatar_radius), false);
        if (a == null) {
            a = ContactInfo.e(this.a).j();
            if (a != null) {
                a = Bitmap.createScaledBitmap(a, dimensionPixelSize, dimensionPixelSize, true);
            }
        }
        if (!isCancelled()) {
            this.a.runOnUiThread(new dv(this, a));
        }
    }

    public Void a(Void[] voidArr) {
        if (!isCancelled()) {
            d();
        }
        if (!isCancelled()) {
            b();
        }
        if (!isCancelled()) {
            a();
        }
        if (!isCancelled()) {
            c();
        }
        return null;
    }

    a5(ContactInfo contactInfo) {
        this.a = contactInfo;
    }
}
