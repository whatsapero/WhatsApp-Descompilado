package com.whatsapp.contact;

import android.content.Context;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.telephony.PhoneNumberUtils;
import com.actionbarsherlock.R;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.util.Log;
import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class j {
    private static final String[] e;
    private static boolean f;
    private static final String[] h;
    private static final String[] k;
    private static final String[] z;
    private final String a;
    private final String b;
    private final String c;
    private String d;
    private boolean g;
    private final int i;
    private final String j;
    private final long l;

    static Cursor a(String str, String str2) {
        Cursor query = App.e.query(Phone.CONTENT_URI, k, z[3], new String[]{str}, null);
        if (query != null) {
            Log.a(z[2], null, new Object[]{str2, str, Integer.valueOf(query.getCount())});
        }
        return query;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
        r6_this = this;
        r0 = 1;
        r1 = 0;
        if (r7 != 0) goto L_0x0005;
    L_0x0004:
        return r1;
    L_0x0005:
        if (r6 != r7) goto L_0x0009;
    L_0x0007:
        r1 = r0;
        goto L_0x0004;
    L_0x0009:
        r2 = r6.getClass();	 Catch:{ NullPointerException -> 0x0065 }
        r3 = r7.getClass();	 Catch:{ NullPointerException -> 0x0065 }
        if (r2 != r3) goto L_0x0004;
    L_0x0013:
        r7 = (com.whatsapp.contact.j) r7;
        r2 = r6.e();	 Catch:{ NullPointerException -> 0x0067 }
        r4 = r7.e();	 Catch:{ NullPointerException -> 0x0067 }
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x0073;
    L_0x0021:
        r2 = r6.g();	 Catch:{ NullPointerException -> 0x0069 }
        r3 = r7.g();	 Catch:{ NullPointerException -> 0x0069 }
        r2 = android.text.TextUtils.equals(r2, r3);	 Catch:{ NullPointerException -> 0x0069 }
        if (r2 == 0) goto L_0x0073;
    L_0x002f:
        r2 = r6.a();	 Catch:{ NullPointerException -> 0x006b }
        r3 = r7.a();	 Catch:{ NullPointerException -> 0x006b }
        r2 = android.text.TextUtils.equals(r2, r3);	 Catch:{ NullPointerException -> 0x006b }
        if (r2 == 0) goto L_0x0073;
    L_0x003d:
        r2 = r6.b();	 Catch:{ NullPointerException -> 0x006d }
        r3 = r7.b();	 Catch:{ NullPointerException -> 0x006d }
        if (r2 != r3) goto L_0x0073;
    L_0x0047:
        r2 = r6.f();	 Catch:{ NullPointerException -> 0x006f }
        r3 = r7.f();	 Catch:{ NullPointerException -> 0x006f }
        r2 = android.text.TextUtils.equals(r2, r3);	 Catch:{ NullPointerException -> 0x006f }
        if (r2 == 0) goto L_0x0073;
    L_0x0055:
        r2 = r6.c();	 Catch:{ NullPointerException -> 0x0071 }
        r3 = r7.c();	 Catch:{ NullPointerException -> 0x0071 }
        r2 = android.text.TextUtils.equals(r2, r3);	 Catch:{ NullPointerException -> 0x0071 }
        if (r2 == 0) goto L_0x0073;
    L_0x0063:
        r1 = r0;
        goto L_0x0004;
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r0 = r1;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.j.equals(java.lang.Object):boolean");
    }

    static j a(Cursor cursor) {
        String str = null;
        String stripSeparators = PhoneNumberUtils.stripSeparators(cursor.getString(2));
        try {
            if (!PhoneNumberUtils.isGlobalPhoneNumber(stripSeparators)) {
                return null;
            }
            try {
                long j = cursor.getLong(0);
                String string = cursor.getString(1);
                int i = cursor.getInt(3);
                String string2 = cursor.getString(4);
                if (f) {
                    str = cursor.getString(5);
                }
                return new j(j, string, stripSeparators, i, string2, str);
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public String c() {
        return this.c;
    }

    public int b() {
        return this.i;
    }

    static j a(Context context, String str, String str2) {
        String stripSeparators = PhoneNumberUtils.stripSeparators(str2);
        try {
            if (!PhoneNumberUtils.isGlobalPhoneNumber(stripSeparators)) {
                return null;
            }
            return new j(-2, str, stripSeparators, 0, context.getString(R.string.contact_sim), null);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static boolean a(String str) {
        try {
            if (5 <= str.length()) {
                if (str.length() <= 20) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public int hashCode() {
        boolean z = false;
        try {
            int hashCode = (a() == null ? 0 : a().hashCode()) + ((((((((int) (this.l >>> 32)) + 0) * 31) + ((int) this.l)) * 31) + this.i) * 31);
            if (i.a) {
                try {
                    if (!DialogToastActivity.i) {
                        z = true;
                    }
                    DialogToastActivity.i = z;
                } catch (NullPointerException e) {
                    throw e;
                }
            }
            return hashCode;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String d() {
        /*
        r10_this = this;
        r6 = 0;
        r1 = 2;
        r4 = 0;
        r3 = 1;
        r7 = com.whatsapp.contact.i.a;
        r0 = r10.g;	 Catch:{ NullPointerException -> 0x000d }
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        r0 = r10.d;	 Catch:{ NullPointerException -> 0x000d }
    L_0x000c:
        return r0;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r2 = new java.lang.String[r1];
        r0 = z;
        r1 = 4;
        r0 = r0[r1];
        r2[r4] = r0;
        r0 = z;
        r1 = 5;
        r0 = r0[r1];
        r2[r3] = r0;
        r0 = com.whatsapp.App.e;	 Catch:{ all -> 0x00b3 }
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;	 Catch:{ all -> 0x00b3 }
        r3 = z;	 Catch:{ all -> 0x00b3 }
        r4 = 6;
        r3 = r3[r4];	 Catch:{ all -> 0x00b3 }
        r4 = 2;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x00b3 }
        r5 = 0;
        r8 = r10.e();	 Catch:{ all -> 0x00b3 }
        r8 = java.lang.Long.toString(r8);	 Catch:{ all -> 0x00b3 }
        r4[r5] = r8;	 Catch:{ all -> 0x00b3 }
        r5 = 1;
        r8 = z;	 Catch:{ all -> 0x00b3 }
        r9 = 7;
        r8 = r8[r9];	 Catch:{ all -> 0x00b3 }
        r4[r5] = r8;	 Catch:{ all -> 0x00b3 }
        r5 = 0;
        r1 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x00b3 }
        if (r1 == 0) goto L_0x0091;
    L_0x0045:
        r0 = 1;
        r10.g = r0;	 Catch:{ NullPointerException -> 0x009a }
        r0 = r1.moveToNext();	 Catch:{ NullPointerException -> 0x009a }
        if (r0 == 0) goto L_0x0091;
    L_0x004e:
        r0 = 0;
        r0 = r1.getString(r0);	 Catch:{ all -> 0x009c }
        r2 = 1;
        r2 = r1.getString(r2);	 Catch:{ all -> 0x009c }
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ NullPointerException -> 0x00a3 }
        if (r3 != 0) goto L_0x007f;
    L_0x005e:
        r3 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NullPointerException -> 0x00a3 }
        if (r3 != 0) goto L_0x007f;
    L_0x0064:
        r3 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00a5 }
        r3.<init>();	 Catch:{ NullPointerException -> 0x00a5 }
        r3 = r3.append(r2);	 Catch:{ NullPointerException -> 0x00a5 }
        r4 = " ";
        r3 = r3.append(r4);	 Catch:{ NullPointerException -> 0x00a5 }
        r3 = r3.append(r0);	 Catch:{ NullPointerException -> 0x00a5 }
        r3 = r3.toString();	 Catch:{ NullPointerException -> 0x00a5 }
        r10.d = r3;	 Catch:{ NullPointerException -> 0x00a5 }
        if (r7 == 0) goto L_0x0091;
    L_0x007f:
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ NullPointerException -> 0x00a7 }
        if (r3 != 0) goto L_0x0089;
    L_0x0085:
        r10.d = r2;	 Catch:{ NullPointerException -> 0x00a9 }
        if (r7 == 0) goto L_0x0091;
    L_0x0089:
        r2 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NullPointerException -> 0x00ab }
        if (r2 != 0) goto L_0x0091;
    L_0x008f:
        r10.d = r0;	 Catch:{ NullPointerException -> 0x00ad }
    L_0x0091:
        if (r1 == 0) goto L_0x0096;
    L_0x0093:
        r1.close();	 Catch:{ NullPointerException -> 0x00af }
    L_0x0096:
        r0 = r10.d;
        goto L_0x000c;
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x009c }
    L_0x009c:
        r0 = move-exception;
    L_0x009d:
        if (r1 == 0) goto L_0x00a2;
    L_0x009f:
        r1.close();	 Catch:{ NullPointerException -> 0x00b1 }
    L_0x00a2:
        throw r0;
    L_0x00a3:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00a5 }
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x009c }
    L_0x00af:
        r0 = move-exception;
        throw r0;
    L_0x00b1:
        r0 = move-exception;
        throw r0;
    L_0x00b3:
        r0 = move-exception;
        r1 = r6;
        goto L_0x009d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.j.d():java.lang.String");
    }

    public String g() {
        return this.a;
    }

    public String f() {
        return this.j;
    }

    private j(long j, String str, String str2, int i, String str3, String str4) {
        if (str2 == null) {
            throw new NullPointerException(z[1]);
        }
        try {
            this.l = j;
            this.a = str;
            this.b = str2;
            this.i = i;
            this.j = str3;
            this.c = str4;
            this.g = f;
            if (f) {
                this.d = str4;
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public String a() {
        return this.b;
    }

    static Cursor a(m mVar, String str) {
        Cursor query = App.e.query(Phone.CONTENT_URI, k, mVar.getWhereClause(), mVar.getWhereArgs(), null);
        if (query != null) {
            Log.a(z[0], null, new Object[]{str, mVar.name(), Integer.valueOf(query.getCount())});
        }
        return query;
    }

    public long e() {
        return this.l;
    }

    static {
        boolean z = true;
        String[] strArr = new String[8];
        String str = "\bN-\u0018H\bY";
        boolean z2 = true;
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
                        i3 = 61;
                        break;
                    case ay.n /*2*/:
                        i3 = 8;
                        break;
                    case ay.p /*3*/:
                        i3 = 107;
                        break;
                    default:
                        i3 = 103;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            try {
                switch (z2) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "\bN-\u0018H\bY";
                        i = 2;
                        strArr2 = strArr3;
                        z2 = true;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "I\\|\nV\r\u0000(T";
                        i = 3;
                        strArr2 = strArr3;
                        z2 = true;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        str = "I\\|\nP";
                        i = 4;
                        strArr2 = strArr3;
                        z2 = true;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "I\\|\n^";
                        z2 = true;
                        break;
                    case aj.i /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "_\\\u007f4\u0004BS|\n\u0004Yba\u000fG\u0010\u001d7K&cy(\u0006\u000e@X|\u0012\u0017H\u001d5KX";
                        z2 = true;
                        strArr2 = strArr3;
                        break;
                    case aV.r /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "[SlE\u0006CYz\u0004\u000eI\u0013k\u001e\u0015^RzE\u000eYXeD\tLPm";
                        z2 = true;
                        strArr2 = strArr3;
                        break;
                    case aV.i /*6*/:
                        strArr2[i] = str;
                        z = strArr3;
                        strArr = new String[5];
                        str = "_\\\u007f4\u0004BS|\n\u0004Yba\u000f";
                        z2 = true;
                        strArr2 = strArr;
                        strArr3 = strArr;
                        i = 0;
                        break;
                    case a8.s /*7*/:
                        strArr2[i] = str;
                        str = "IT{\u001b\u000bLDW\u0005\u0006@X";
                        z2 = true;
                        i = 1;
                        strArr2 = strArr3;
                        break;
                    case a8.n /*8*/:
                        strArr2[i] = str;
                        str = "I\\|\nV";
                        z2 = true;
                        i = 2;
                        strArr2 = strArr3;
                        break;
                    case a6.D /*9*/:
                        strArr2[i] = str;
                        str = "I\\|\nU";
                        z2 = true;
                        i = 3;
                        strArr2 = strArr3;
                        break;
                    case a6.h /*10*/:
                        strArr2[i] = str;
                        str = "I\\|\nT";
                        z2 = true;
                        i = 4;
                        strArr2 = strArr3;
                        break;
                    case a6.e /*11*/:
                        strArr2[i] = str;
                        e = strArr3;
                        strArr = new String[6];
                        str = "_\\\u007f4\u0004BS|\n\u0004Yba\u000f";
                        z2 = true;
                        strArr2 = strArr;
                        strArr3 = strArr;
                        i = 0;
                        break;
                    case a6.s /*12*/:
                        strArr2[i] = str;
                        str = "IT{\u001b\u000bLDW\u0005\u0006@X";
                        z2 = true;
                        i = 1;
                        strArr2 = strArr3;
                        break;
                    case a6.z /*13*/:
                        strArr2[i] = str;
                        str = "I\\|\nV";
                        z2 = true;
                        i = 2;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                        strArr2[i] = str;
                        str = "I\\|\nU";
                        z2 = true;
                        i = 3;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeBackground /*15*/:
                        strArr2[i] = str;
                        str = "I\\|\nT";
                        z2 = true;
                        i = 4;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                        strArr2[i] = str;
                        i = 5;
                        str = "^Rz\u001f8FXq";
                        z2 = true;
                        strArr2 = strArr3;
                        break;
                    case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                        strArr2[i] = str;
                        h = strArr3;
                        if (VERSION.SDK_INT < 11) {
                            z = false;
                        }
                        try {
                            String[] strArr4;
                            f = z;
                            if (VERSION.SDK_INT >= 11) {
                                strArr4 = h;
                            } else {
                                strArr4 = e;
                            }
                            k = strArr4;
                        } catch (NullPointerException e) {
                            throw e;
                        }
                    default:
                        strArr2[i] = str;
                        str = "CHe\t\u0002_\u001de\u001e\u0014Y\u001df\u0004\u0013\r_mK\tXQd";
                        i = 1;
                        strArr2 = strArr3;
                        z2 = false;
                        break;
                }
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
    }
}
