package com.whatsapp;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.RawContacts;
import android.text.TextUtils;
import com.actionbarsherlock.R;
import com.whatsapp.contact.ContactProvider;
import com.whatsapp.contact.j;
import com.whatsapp.util.Log;
import com.whatsapp.util.bm;
import com.whatsapp.util.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class m8 extends m3 {
    public static String D;
    private static final HashMap G;
    public static String H;
    public static String I;
    public static String J;
    public static String[] K;
    public static String L;
    public static String O;
    public static String P;
    private static final String[] R;
    public static String f;
    public static String g;
    public static String i;
    public static String j;
    public static String l;
    public static String m;
    public static String o;
    public static String p;
    public static String u;
    public static String w;
    public static String x;
    public static String z;
    public int A;
    public transient boolean B;
    public ar C;
    @Deprecated
    public String E;
    public String F;
    public int M;
    public String N;
    public String Q;
    public g9 h;
    public boolean k;
    public String n;
    public boolean q;
    public long r;
    public String s;
    public String t;
    public Integer v;
    public long y;

    public static boolean d(String str) {
        try {
            if (!b(str)) {
                if (!f(str)) {
                    try {
                        return false;
                    }
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void c() {
        int i = m3.d;
        for (String str : App.R.snapshot().keySet()) {
            try {
                if (str.startsWith(x())) {
                    App.R.remove(str);
                    continue;
                }
                if (i != 0) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.B = true;
    }

    public void a(byte[] bArr, byte[] bArr2) {
        try {
            if (bArr != null) {
                f.a(bArr, m());
            }
            if (bArr2 != null) {
                f.a(bArr2, a());
            }
        } catch (FileNotFoundException e) {
            throw e;
        } catch (Throwable e2) {
            Log.b(R[33], e2);
        } catch (FileNotFoundException e3) {
            throw e3;
        } catch (Throwable e22) {
            Log.b(R[32], e22);
        }
    }

    public Uri n() {
        return ContentUris.withAppendedId(ContactProvider.e, this.y);
    }

    public String d() {
        String a = a(App.p);
        return (a == null || App.as()) ? a : R[65] + a + "\u202c";
    }

    public static boolean b(String str) {
        if (str != null) {
            try {
                if (str.endsWith(R[36])) {
                    return true;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return false;
    }

    public void a(int i, int i2) {
        try {
            if (this.e.equals(App.P.d().e)) {
                App.P.d().a(i, i2);
                try {
                    if (m3.d == 0) {
                        return;
                    }
                }
            }
            this.M = i;
            this.A = i2;
            this.r = System.currentTimeMillis();
            App.P.a(this);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public String s() {
        try {
            return this.C == null ? ar.getDefault().getText() : this.C.getText();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String o() {
        /*
        r1_this = this;
        r0 = r1.h;	 Catch:{ IllegalArgumentException -> 0x0013 }
        if (r0 == 0) goto L_0x0019;
    L_0x0004:
        r0 = r1.Q;	 Catch:{ IllegalArgumentException -> 0x0015 }
        if (r0 == 0) goto L_0x0019;
    L_0x0008:
        r0 = r1.Q;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r0 = r0.length();	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r0 == 0) goto L_0x0019;
    L_0x0010:
        r0 = r1.Q;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        r0 = com.whatsapp.App.p;
        r0 = r1.a(r0);
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m8.o():java.lang.String");
    }

    public boolean h() {
        try {
            if (!d(this.e)) {
                if (TextUtils.isEmpty(this.N)) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public boolean b(boolean z) {
        try {
            if (this.e.equals(App.P.d().e)) {
                return App.P.d().b(z);
            }
            try {
                return this.r + 604800000 < System.currentTimeMillis();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static boolean a(List list, ik ikVar) {
        int i = m3.d;
        if (list == null) {
            return false;
        }
        boolean z = false;
        for (m8 m8Var : list) {
            try {
                boolean z2;
                if (ikVar.a(m8Var) || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i != 0) {
                    return z2;
                }
                z = z2;
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        return z;
    }

    public String c(int i, float f) {
        return x() + "_" + Integer.toString(i) + "_" + Float.toString(f);
    }

    public Uri a(ContentResolver contentResolver) {
        return y() == null ? null : RawContacts.getContactLookupUri(contentResolver, y());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            try {
                if (obj.getClass() == getClass()) {
                    m8 m8Var = (m8) obj;
                    try {
                        if (!TextUtils.equals(this.e, m8Var.e)) {
                            return false;
                        }
                        try {
                            if (this.h == null) {
                                return m8Var.h == null;
                            } else {
                                return this.h.equals(m8Var.h);
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        }
        return false;
    }

    public boolean b() {
        return this.e.substring(this.e.lastIndexOf("@") + 1, this.e.length()).equals(R[64]);
    }

    public String u() {
        String g = g();
        if (g != null) {
            return g;
        }
        long c = App.aT.c(this.e);
        if (c == 0) {
            try {
                return "";
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (c != 1) {
            return App.p.getString(R.string.conversation_last_seen) + " " + bm.f(App.p, App.c(c));
        } else {
            try {
                return App.p.getString(R.string.conversation_contact_online);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    @Deprecated
    public String i() {
        try {
            try {
                if (bd.b(this.e)) {
                    return this.E != null ? this.E : this.e.substring(0, this.e.indexOf("-")) + R[34];
                } else {
                    try {
                        return l() ? App.af() + R[35] : null;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public int hashCode() {
        try {
            return this.h != null ? this.h.hashCode() : this.e.hashCode();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static m8 a(Cursor cursor) {
        boolean z = true;
        try {
            String string = cursor.getString(1);
            if (cursor.getInt(2) != 1) {
                z = false;
            }
            m8 m8Var = new m8(string, z, cursor.getString(3), cursor.getLong(4), cursor.getString(5));
            m8Var.y = cursor.getLong(0);
            return m8Var;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public Uri b(ContentResolver contentResolver) {
        Uri uri = null;
        Uri a = a(contentResolver);
        if (a != null) {
            try {
                uri = Contacts.lookupContact(contentResolver, a);
            } catch (Throwable e) {
                Log.c(e);
            } catch (Throwable e2) {
                Log.c(e2);
            } catch (SecurityException e3) {
                throw e3;
            }
        }
        return uri;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream c(boolean r5) {
        /*
        r4_this = this;
        r0 = 0;
        r1 = r4.B;	 Catch:{ FileNotFoundException -> 0x00b6 }
        if (r1 == 0) goto L_0x00b5;
    L_0x0005:
        if (r5 == 0) goto L_0x0068;
    L_0x0007:
        r0 = r4.m();
        r1 = r0.exists();
        if (r1 != 0) goto L_0x00a9;
    L_0x0011:
        r0 = r4.a();
        r1 = r4.M;
        if (r1 <= 0) goto L_0x00a9;
    L_0x0019:
        r1 = android.os.Environment.getExternalStorageState();
        r2 = R;	 Catch:{ FileNotFoundException -> 0x00b8 }
        r3 = 29;
        r2 = r2[r3];	 Catch:{ FileNotFoundException -> 0x00b8 }
        r2 = r1.equals(r2);	 Catch:{ FileNotFoundException -> 0x00b8 }
        if (r2 == 0) goto L_0x0064;
    L_0x0029:
        r2 = R;	 Catch:{ FileNotFoundException -> 0x00b8 }
        r3 = 30;
        r2 = r2[r3];	 Catch:{ FileNotFoundException -> 0x00b8 }
        r1 = r1.equals(r2);	 Catch:{ FileNotFoundException -> 0x00b8 }
        if (r1 != 0) goto L_0x0064;
    L_0x0035:
        r1 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x00ba }
        r1.<init>();	 Catch:{ FileNotFoundException -> 0x00ba }
        r2 = R;	 Catch:{ FileNotFoundException -> 0x00ba }
        r3 = 28;
        r2 = r2[r3];	 Catch:{ FileNotFoundException -> 0x00ba }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00ba }
        r2 = r4.e;	 Catch:{ FileNotFoundException -> 0x00ba }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00ba }
        r2 = R;	 Catch:{ FileNotFoundException -> 0x00ba }
        r3 = 27;
        r2 = r2[r3];	 Catch:{ FileNotFoundException -> 0x00ba }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00ba }
        r2 = r4.M;	 Catch:{ FileNotFoundException -> 0x00ba }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00ba }
        r1 = r1.toString();	 Catch:{ FileNotFoundException -> 0x00ba }
        com.whatsapp.util.Log.e(r1);	 Catch:{ FileNotFoundException -> 0x00ba }
        r1 = 0;
        r4.M = r1;	 Catch:{ FileNotFoundException -> 0x00ba }
    L_0x0064:
        r1 = com.whatsapp.m3.d;
        if (r1 == 0) goto L_0x00a9;
    L_0x0068:
        r0 = r4.a();
        r1 = r0.exists();
        if (r1 != 0) goto L_0x00a9;
    L_0x0072:
        r0 = r4.m();
        r1 = r4.A;	 Catch:{ FileNotFoundException -> 0x00bc }
        if (r1 <= 0) goto L_0x00a9;
    L_0x007a:
        r1 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x00bc }
        r1.<init>();	 Catch:{ FileNotFoundException -> 0x00bc }
        r2 = R;	 Catch:{ FileNotFoundException -> 0x00bc }
        r3 = 31;
        r2 = r2[r3];	 Catch:{ FileNotFoundException -> 0x00bc }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00bc }
        r2 = r4.e;	 Catch:{ FileNotFoundException -> 0x00bc }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00bc }
        r2 = R;	 Catch:{ FileNotFoundException -> 0x00bc }
        r3 = 26;
        r2 = r2[r3];	 Catch:{ FileNotFoundException -> 0x00bc }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00bc }
        r2 = r4.A;	 Catch:{ FileNotFoundException -> 0x00bc }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x00bc }
        r1 = r1.toString();	 Catch:{ FileNotFoundException -> 0x00bc }
        com.whatsapp.util.Log.e(r1);	 Catch:{ FileNotFoundException -> 0x00bc }
        r1 = 0;
        r4.A = r1;	 Catch:{ FileNotFoundException -> 0x00bc }
    L_0x00a9:
        r1 = r0.exists();
        if (r1 == 0) goto L_0x00c4;
    L_0x00af:
        r1 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x00be }
        r1.<init>(r0);	 Catch:{ FileNotFoundException -> 0x00be }
        r0 = r1;
    L_0x00b5:
        return r0;
    L_0x00b6:
        r0 = move-exception;
        throw r0;
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r0 = move-exception;
        throw r0;
    L_0x00be:
        r0 = move-exception;
        r0 = r4.a(r5);
        goto L_0x00b5;
    L_0x00c4:
        r0 = r4.a(r5);
        goto L_0x00b5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m8.c(boolean):java.io.InputStream");
    }

    private m8(String str, boolean z, String str2, long j, String str3) {
        this.y = -1;
        this.h = null;
        this.v = null;
        this.k = false;
        this.E = null;
        this.B = true;
        this.e = str;
        this.q = z;
        this.N = str3;
        this.h = new g9(j, str2);
    }

    public static File a(String str) {
        File file = new File(App.ao, R[62]);
        if (!file.exists()) {
            file.mkdirs();
            try {
                new File(file, R[60]).createNewFile();
            } catch (IOException e) {
            }
        }
        int indexOf = str.indexOf("@");
        if (indexOf <= 0) {
            return new File(file, str + R[59]);
        }
        try {
            return new File(file, str.substring(0, indexOf) + R[61]);
        } catch (IOException e2) {
            throw e2;
        }
    }

    public void v() {
        m().delete();
        a().delete();
    }

    public String a(SharedPreferences sharedPreferences) {
        if (sharedPreferences.getBoolean(R[63], true)) {
            try {
                if (this.h != null) {
                    return q();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean w() {
        /*
        r6_this = this;
        r0 = r6.e;
        if (r0 != 0) goto L_0x00af;
    L_0x0004:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r2 = 45;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r0 = r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r2 = r6.y;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r2 = 39;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r2 = r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r0 = r6.e;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        if (r0 != 0) goto L_0x00a6;
    L_0x0026:
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r3 = 40;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00a4 }
    L_0x002c:
        r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00a9 }
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00a9 }
        r2 = 46;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00a9 }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x00a9 }
        r0 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00a9 }
        if (r0 != 0) goto L_0x0049;
    L_0x003c:
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2 = 42;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00ab }
        r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r0 = com.whatsapp.m3.d;	 Catch:{ IllegalArgumentException -> 0x00ab }
        if (r0 == 0) goto L_0x005e;
    L_0x0049:
        r0 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2 = r0.a;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r0 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2 = "-";
        r0 = r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2 = r2.b;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ab }
    L_0x005e:
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r2 = 41;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0 = r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x00ad }
        r2 = r6.v;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r2 = 43;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0 = r1.append(r0);	 Catch:{ IllegalArgumentException -> 0x00ad }
        r2 = r6.q;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ad }
        r2 = r6.y;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r4 = -1;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x00a2;
    L_0x0084:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x00ad }
        r2 = R;	 Catch:{ IllegalArgumentException -> 0x00ad }
        r3 = 44;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0 = r0.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ad }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x00ad }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x00ad }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x00ad }
    L_0x00a2:
        r0 = 0;
    L_0x00a3:
        return r0;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r0 = r6.e;
        goto L_0x002c;
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = move-exception;
        throw r0;
    L_0x00af:
        r0 = r6.e;
        r0 = com.whatsapp.bd.b(r0);
        goto L_0x00a3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m8.w():boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t() {
        /*
        r11_this = this;
        r5 = 2;
        r10 = 1;
        r7 = 0;
        r6 = com.whatsapp.m3.d;
        r0 = r11.h;
        if (r0 == 0) goto L_0x00d6;
    L_0x0009:
        r0 = 4;
        r2 = new java.lang.String[r0];
        r0 = R;
        r1 = 53;
        r0 = r0[r1];
        r2[r7] = r0;
        r0 = R;
        r1 = 54;
        r0 = r0[r1];
        r2[r10] = r0;
        r0 = R;
        r1 = 55;
        r0 = r0[r1];
        r2[r5] = r0;
        r0 = 3;
        r1 = R;
        r3 = 56;
        r1 = r1[r3];
        r2[r0] = r1;
        r0 = com.whatsapp.App.e;
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;
        r3 = R;
        r4 = 49;
        r3 = r3[r4];
        r4 = new java.lang.String[r5];
        r5 = r11.h;
        r8 = r5.a;
        r5 = java.lang.Long.toString(r8);
        r4[r7] = r5;
        r5 = R;
        r7 = 47;
        r5 = r5[r7];
        r4[r10] = r5;
        r5 = 0;
        r0 = r0.query(r1, r2, r3, r4, r5);
        if (r0 == 0) goto L_0x00d6;
    L_0x0052:
        r1 = r0.moveToNext();	 Catch:{ IllegalArgumentException -> 0x00e7 }
        if (r1 == 0) goto L_0x00d3;
    L_0x0058:
        r1 = R;	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r2 = 52;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r1 = r0.getColumnIndex(r1);	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r1 = r0.getString(r1);	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r11.Q = r1;	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r1 = R;	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r2 = 50;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r1 = r0.getColumnIndex(r1);	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r1 = r0.getString(r1);	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r11.F = r1;	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r2 = 11;
        if (r1 >= r2) goto L_0x00d3;
    L_0x007e:
        r1 = R;
        r2 = 48;
        r1 = r1[r2];
        r1 = r0.getColumnIndex(r1);
        r1 = r0.getString(r1);
        r2 = R;
        r3 = 51;
        r2 = r2[r3];
        r2 = r0.getColumnIndex(r2);
        r2 = r0.getString(r2);
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        if (r3 != 0) goto L_0x00c1;
    L_0x00a0:
        r3 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IllegalArgumentException -> 0x00eb }
        if (r3 != 0) goto L_0x00c1;
    L_0x00a6:
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ed }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x00ed }
        r3 = r3.append(r2);	 Catch:{ IllegalArgumentException -> 0x00ed }
        r4 = " ";
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x00ed }
        r3 = r3.append(r1);	 Catch:{ IllegalArgumentException -> 0x00ed }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x00ed }
        r11.n = r3;	 Catch:{ IllegalArgumentException -> 0x00ed }
        if (r6 == 0) goto L_0x00d3;
    L_0x00c1:
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ IllegalArgumentException -> 0x00ef }
        if (r3 != 0) goto L_0x00cb;
    L_0x00c7:
        r11.n = r2;	 Catch:{ IllegalArgumentException -> 0x00f1 }
        if (r6 == 0) goto L_0x00d3;
    L_0x00cb:
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IllegalArgumentException -> 0x00f3 }
        if (r2 != 0) goto L_0x00d3;
    L_0x00d1:
        r11.n = r1;	 Catch:{ IllegalArgumentException -> 0x00f3 }
    L_0x00d3:
        r0.close();
    L_0x00d6:
        r0 = r11.Q;	 Catch:{ IllegalArgumentException -> 0x00f5 }
        if (r0 != 0) goto L_0x00de;
    L_0x00da:
        r0 = "";
        r11.Q = r0;	 Catch:{ IllegalArgumentException -> 0x00f5 }
    L_0x00de:
        r0 = r11.F;	 Catch:{ IllegalArgumentException -> 0x00f7 }
        if (r0 != 0) goto L_0x00e6;
    L_0x00e2:
        r0 = "";
        r11.F = r0;	 Catch:{ IllegalArgumentException -> 0x00f7 }
    L_0x00e6:
        return;
    L_0x00e7:
        r0 = move-exception;
        throw r0;
    L_0x00e9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00eb }
    L_0x00eb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ed }
    L_0x00ed:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ef }
    L_0x00ef:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f1 }
    L_0x00f1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f3 }
    L_0x00f3:
        r0 = move-exception;
        throw r0;
    L_0x00f5:
        r0 = move-exception;
        throw r0;
    L_0x00f7:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m8.t():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.whatsapp.contact.j r8) {
        /*
        r7_this = this;
        r1 = 1;
        r2 = com.whatsapp.m3.d;
        r0 = 0;
        r3 = new com.whatsapp.g9;
        r4 = r8.e();
        r6 = r8.a();
        r3.<init>(r4, r6);
        r4 = r7.h;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        if (r4 == 0) goto L_0x001d;
    L_0x0015:
        r4 = r7.h;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r4 = r4.equals(r3);	 Catch:{ IllegalArgumentException -> 0x00a4 }
        if (r4 != 0) goto L_0x0020;
    L_0x001d:
        r7.h = r3;
        r0 = r1;
    L_0x0020:
        r3 = r8.g();	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r3 = android.text.TextUtils.isEmpty(r3);	 Catch:{ IllegalArgumentException -> 0x00a6 }
        if (r3 != 0) goto L_0x0040;
    L_0x002a:
        r3 = r7.N;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r4 = r8.g();	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r3 = android.text.TextUtils.equals(r3, r4);	 Catch:{ IllegalArgumentException -> 0x00a6 }
        if (r3 != 0) goto L_0x0040;
    L_0x0036:
        r0 = r8.g();
        r7.N = r0;
        r7.t();
        r0 = r1;
    L_0x0040:
        r3 = r7.v;
        r3 = r3.intValue();
        r4 = r8.b();
        if (r3 == r4) goto L_0x006c;
    L_0x004c:
        r0 = r8.b();	 Catch:{ IllegalArgumentException -> 0x00a8 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x00a8 }
        r7.v = r0;	 Catch:{ IllegalArgumentException -> 0x00a8 }
        r0 = r7.v;	 Catch:{ IllegalArgumentException -> 0x00a8 }
        r0 = r0.intValue();	 Catch:{ IllegalArgumentException -> 0x00a8 }
        if (r0 == 0) goto L_0x0063;
    L_0x005e:
        r0 = 0;
        r7.s = r0;	 Catch:{ IllegalArgumentException -> 0x00aa }
        if (r2 == 0) goto L_0x0086;
    L_0x0063:
        r0 = r8.f();	 Catch:{ IllegalArgumentException -> 0x00ac }
        r7.s = r0;	 Catch:{ IllegalArgumentException -> 0x00ac }
        if (r2 == 0) goto L_0x0086;
    L_0x006b:
        r0 = r1;
    L_0x006c:
        r2 = r7.v;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r2 = r2.intValue();	 Catch:{ IllegalArgumentException -> 0x00ae }
        if (r2 != 0) goto L_0x0087;
    L_0x0074:
        r2 = r7.s;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r3 = r8.f();	 Catch:{ IllegalArgumentException -> 0x00ae }
        r2 = android.text.TextUtils.equals(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00ae }
        if (r2 != 0) goto L_0x0087;
    L_0x0080:
        r0 = r8.f();
        r7.s = r0;
    L_0x0086:
        r0 = r1;
    L_0x0087:
        r2 = r8.d();	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        if (r2 != 0) goto L_0x00b2;
    L_0x0091:
        r2 = r7.n;	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r3 = r8.d();	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r2 = android.text.TextUtils.equals(r2, r3);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        if (r2 != 0) goto L_0x00b2;
    L_0x009d:
        r0 = r8.d();
        r7.n = r0;
    L_0x00a3:
        return r1;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00aa }
    L_0x00aa:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ac }
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ae }
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r1 = r0;
        goto L_0x00a3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m8.a(com.whatsapp.contact.j):boolean");
    }

    public boolean l() {
        return b(this.e);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap a(int r4, float r5, boolean r6) {
        /*
        r3_this = this;
        if (r6 == 0) goto L_0x0011;
    L_0x0002:
        r0 = com.whatsapp.App.R;
        r1 = r3.c(r4, r5);
        r0 = r0.get(r1);
        r0 = (android.graphics.Bitmap) r0;
        if (r0 == 0) goto L_0x0011;
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = r3.a(r4, r5);
        if (r6 == 0) goto L_0x0010;
    L_0x0017:
        if (r0 == 0) goto L_0x0010;
    L_0x0019:
        r1 = com.whatsapp.App.R;	 Catch:{ IllegalArgumentException -> 0x0023 }
        r2 = r3.c(r4, r5);	 Catch:{ IllegalArgumentException -> 0x0023 }
        r1.put(r2, r0);	 Catch:{ IllegalArgumentException -> 0x0023 }
        goto L_0x0010;
    L_0x0023:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m8.a(int, float, boolean):android.graphics.Bitmap");
    }

    public boolean r() {
        try {
            return b(App.p.getResources().getDimensionPixelSize(R.dimen.small_avatar_size), App.p.getResources().getDimension(R.dimen.small_avatar_radius)) != null;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static m8 b(Cursor cursor) {
        return new m8(cursor);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap a(int r14, float r15) {
        /*
        r13_this = this;
        r12 = 0;
        r0 = 1;
        r6 = 0;
        r1 = 0;
        r10 = com.whatsapp.m3.d;
        r2 = 0;
        r3 = (float) r14;
        r4 = com.whatsapp.am1.a();	 Catch:{ IOException -> 0x00a0 }
        r4 = r4.g;	 Catch:{ IOException -> 0x00a0 }
        r5 = 1119879168; // 0x42c00000 float:96.0 double:5.532938244E-315;
        r4 = r4 * r5;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 < 0) goto L_0x00cf;
    L_0x0015:
        r1 = r13.B;	 Catch:{ SQLiteException -> 0x00a2, OutOfMemoryError -> 0x0250, all -> 0x0284 }
        if (r1 == 0) goto L_0x02b1;
    L_0x0019:
        r1 = r13.c(r0);	 Catch:{ SQLiteException -> 0x00a2, OutOfMemoryError -> 0x0250, all -> 0x0284 }
    L_0x001d:
        r3 = r13.e;	 Catch:{ IOException -> 0x00d2 }
        if (r3 == 0) goto L_0x0057;
    L_0x0021:
        r3 = r13.w();	 Catch:{ IOException -> 0x00d2 }
        if (r3 == 0) goto L_0x002d;
    L_0x0027:
        r3 = r13.b();	 Catch:{ IOException -> 0x00d4 }
        if (r3 != 0) goto L_0x0057;
    L_0x002d:
        if (r0 == 0) goto L_0x0044;
    L_0x002f:
        r3 = r13.M;	 Catch:{ IOException -> 0x00d8 }
        if (r3 == 0) goto L_0x003a;
    L_0x0033:
        r3 = 1;
        r3 = r13.b(r3);	 Catch:{ IOException -> 0x00da }
        if (r3 == 0) goto L_0x0057;
    L_0x003a:
        r3 = r13.e;	 Catch:{ IOException -> 0x00dc }
        r4 = r13.M;	 Catch:{ IOException -> 0x00dc }
        r5 = 1;
        com.whatsapp.App.a(r3, r4, r5);	 Catch:{ IOException -> 0x00dc }
        if (r10 == 0) goto L_0x0057;
    L_0x0044:
        r3 = r13.A;	 Catch:{ IOException -> 0x00de }
        if (r3 == 0) goto L_0x004f;
    L_0x0048:
        r3 = 0;
        r3 = r13.b(r3);	 Catch:{ IOException -> 0x00e0 }
        if (r3 == 0) goto L_0x0057;
    L_0x004f:
        r3 = r13.e;	 Catch:{ IOException -> 0x00e2 }
        r4 = r13.A;	 Catch:{ IOException -> 0x00e2 }
        r5 = 2;
        com.whatsapp.App.a(r3, r4, r5);	 Catch:{ IOException -> 0x00e2 }
    L_0x0057:
        if (r1 == 0) goto L_0x0233;
    L_0x0059:
        r3 = new android.graphics.BitmapFactory$Options;	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        r3.<init>();	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        r4 = 1;
        r3.inJustDecodeBounds = r4;	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        r4 = 0;
        android.graphics.BitmapFactory.decodeStream(r1, r4, r3);	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        r1.close();	 Catch:{ IOException -> 0x00e7 }
        r8 = r13.c(r0);	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        if (r8 != 0) goto L_0x012a;
    L_0x006e:
        r0 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r0.<init>();	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r1 = R;	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r3 = 21;
        r1 = r1[r3];	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r0 = r0.append(r1);	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r1 = r13.e;	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r0 = r0.append(r1);	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r1 = R;	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r3 = 20;
        r1 = r1[r3];	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r0 = r0.append(r1);	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r0 = r0.toString();	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        if (r8 == 0) goto L_0x0099;
    L_0x0096:
        r8.close();	 Catch:{ IOException -> 0x0123 }
    L_0x0099:
        if (r6 == 0) goto L_0x009e;
    L_0x009b:
        r2.recycle();	 Catch:{ IOException -> 0x0128 }
    L_0x009e:
        r0 = r6;
    L_0x009f:
        return r0;
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x00a2, OutOfMemoryError -> 0x0250, all -> 0x0284 }
    L_0x00a2:
        r0 = move-exception;
        r1 = r6;
        r2 = r6;
    L_0x00a5:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x029f }
        r3.<init>();	 Catch:{ all -> 0x029f }
        r4 = R;	 Catch:{ all -> 0x029f }
        r5 = 14;
        r4 = r4[r5];	 Catch:{ all -> 0x029f }
        r3 = r3.append(r4);	 Catch:{ all -> 0x029f }
        r0 = r0.toString();	 Catch:{ all -> 0x029f }
        r0 = r3.append(r0);	 Catch:{ all -> 0x029f }
        r0 = r0.toString();	 Catch:{ all -> 0x029f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x029f }
        if (r1 == 0) goto L_0x00c8;
    L_0x00c5:
        r1.close();	 Catch:{ IOException -> 0x0249 }
    L_0x00c8:
        if (r2 == 0) goto L_0x00cd;
    L_0x00ca:
        r2.recycle();	 Catch:{ IOException -> 0x024e }
    L_0x00cd:
        r0 = r6;
        goto L_0x009f;
    L_0x00cf:
        r0 = r1;
        goto L_0x0015;
    L_0x00d2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d4 }
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d6 }
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d8 }
    L_0x00d8:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00da }
    L_0x00da:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00dc }
    L_0x00dc:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
    L_0x00e4:
        r0 = move-exception;
        r2 = r6;
        goto L_0x00a5;
    L_0x00e7:
        r0 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        r3.<init>();	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        r4 = R;	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        r5 = 15;
        r4 = r4[r5];	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        r3 = r3.append(r4);	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        r4 = r13.e;	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        r3 = r3.append(r4);	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        r4 = R;	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        r5 = 19;
        r4 = r4[r5];	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        r3 = r3.append(r4);	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        r3 = r3.toString();	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        com.whatsapp.util.Log.e(r3);	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        com.whatsapp.util.Log.c(r0);	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        if (r1 == 0) goto L_0x0116;
    L_0x0113:
        r1.close();	 Catch:{ IOException -> 0x011d }
    L_0x0116:
        if (r6 == 0) goto L_0x011b;
    L_0x0118:
        r2.recycle();	 Catch:{ IOException -> 0x0121 }
    L_0x011b:
        r0 = r6;
        goto L_0x009f;
    L_0x011d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x011f }
    L_0x011f:
        r0 = move-exception;
        goto L_0x011b;
    L_0x0121:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x011f }
    L_0x0123:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0125 }
    L_0x0125:
        r0 = move-exception;
        goto L_0x009e;
    L_0x0128:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0125 }
    L_0x012a:
        r0 = r3.outWidth;	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r0 = r0 / r14;
        r1 = r3.outHeight;	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r1 = r1 / r14;
        r0 = java.lang.Math.max(r0, r1);	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r3.inSampleSize = r0;	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r0 = 1;
        r3.inDither = r0;	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r0 = 0;
        r3.inJustDecodeBounds = r0;	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r0 = 0;
        r3.inScaled = r0;	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r0 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r3.inPreferredConfig = r0;	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        r0 = 0;
        r9 = android.graphics.BitmapFactory.decodeStream(r8, r0, r3);	 Catch:{ SQLiteException -> 0x02ac, OutOfMemoryError -> 0x02a7, all -> 0x029a }
        if (r9 != 0) goto L_0x0183;
    L_0x014a:
        r0 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r0.<init>();	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r1 = R;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r2 = 17;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r0 = r0.append(r1);	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r1 = r13.e;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r0 = r0.append(r1);	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r1 = R;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r2 = 16;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r0 = r0.append(r1);	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r0 = r0.toString();	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        if (r8 == 0) goto L_0x0175;
    L_0x0172:
        r8.close();	 Catch:{ IOException -> 0x017d }
    L_0x0175:
        if (r9 == 0) goto L_0x017a;
    L_0x0177:
        r9.recycle();	 Catch:{ IOException -> 0x0181 }
    L_0x017a:
        r0 = r6;
        goto L_0x009f;
    L_0x017d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x017f }
    L_0x017f:
        r0 = move-exception;
        goto L_0x017a;
    L_0x0181:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x017f }
    L_0x0183:
        r0 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r7 = android.graphics.Bitmap.createBitmap(r14, r14, r0);	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r0 = new android.graphics.Canvas;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r0.<init>(r7);	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r5 = new android.graphics.Paint;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r5.<init>();	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r1 = new android.graphics.RectF;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r2 = 0;
        r3 = 0;
        r4 = (float) r14;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r11 = (float) r14;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r1.<init>(r2, r3, r4, r11);	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r2 = 1;
        r5.setAntiAlias(r2);	 Catch:{ IOException -> 0x0220 }
        r2 = 1;
        r5.setDither(r2);	 Catch:{ IOException -> 0x0220 }
        r2 = 1;
        r5.setFilterBitmap(r2);	 Catch:{ IOException -> 0x0220 }
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r11 = 0;
        r0.drawARGB(r2, r3, r4, r11);	 Catch:{ IOException -> 0x0220 }
        r2 = -1;
        r5.setColor(r2);	 Catch:{ IOException -> 0x0220 }
        r2 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1));
        if (r2 != 0) goto L_0x01bc;
    L_0x01b7:
        r0.drawRect(r1, r5);	 Catch:{ IOException -> 0x0220 }
        if (r10 == 0) goto L_0x01cc;
    L_0x01bc:
        r2 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1));
        if (r2 <= 0) goto L_0x01c5;
    L_0x01c0:
        r0.drawRoundRect(r1, r15, r15, r5);	 Catch:{ IOException -> 0x0224 }
        if (r10 == 0) goto L_0x01cc;
    L_0x01c5:
        r2 = 0;
        r3 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r4 = 1;
        r0.drawArc(r1, r2, r3, r4, r5);	 Catch:{ IOException -> 0x0226 }
    L_0x01cc:
        r1 = new android.graphics.PorterDuffXfermode;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r2 = android.graphics.PorterDuff.Mode.SRC_IN;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r1.<init>(r2);	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r5.setXfermode(r1);	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r2 = new android.graphics.RectF;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r1 = 0;
        r3 = 0;
        r4 = (float) r14;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r11 = (float) r14;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r2.<init>(r1, r3, r4, r11);	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r1 = r9.getWidth();	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r3 = r9.getHeight();	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r1 = r1 - r3;
        r3 = r1 / 2;
        if (r3 <= 0) goto L_0x01fd;
    L_0x01ec:
        r1 = new android.graphics.Rect;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r4 = 0;
        r11 = r9.getWidth();	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r11 = r11 - r3;
        r12 = r9.getHeight();	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r1.<init>(r3, r4, r11, r12);	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        if (r10 == 0) goto L_0x020d;
    L_0x01fd:
        r1 = new android.graphics.Rect;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r4 = 0;
        r10 = -r3;
        r11 = r9.getWidth();	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r12 = r9.getHeight();	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r3 = r3 + r12;
        r1.<init>(r4, r10, r11, r3);	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
    L_0x020d:
        r0.drawBitmap(r9, r1, r2, r5);	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        r9.recycle();	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
        if (r8 == 0) goto L_0x0218;
    L_0x0215:
        r8.close();	 Catch:{ IOException -> 0x022d }
    L_0x0218:
        if (r9 == 0) goto L_0x021d;
    L_0x021a:
        r9.recycle();	 Catch:{ IOException -> 0x0231 }
    L_0x021d:
        r0 = r7;
        goto L_0x009f;
    L_0x0220:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0222 }
    L_0x0222:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0224 }
    L_0x0224:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0226 }
    L_0x0226:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x0228, OutOfMemoryError -> 0x02aa }
    L_0x0228:
        r0 = move-exception;
        r1 = r8;
        r2 = r9;
        goto L_0x00a5;
    L_0x022d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x022f }
    L_0x022f:
        r0 = move-exception;
        goto L_0x021d;
    L_0x0231:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x022f }
    L_0x0233:
        r0 = 0;
        r13.B = r0;	 Catch:{ SQLiteException -> 0x00e4, OutOfMemoryError -> 0x02a3, all -> 0x0297 }
        if (r1 == 0) goto L_0x023b;
    L_0x0238:
        r1.close();	 Catch:{ IOException -> 0x0243 }
    L_0x023b:
        if (r6 == 0) goto L_0x0240;
    L_0x023d:
        r2.recycle();	 Catch:{ IOException -> 0x0247 }
    L_0x0240:
        r0 = r6;
        goto L_0x009f;
    L_0x0243:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0245 }
    L_0x0245:
        r0 = move-exception;
        goto L_0x0240;
    L_0x0247:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0245 }
    L_0x0249:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x024b }
    L_0x024b:
        r0 = move-exception;
        goto L_0x00cd;
    L_0x024e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x024b }
    L_0x0250:
        r0 = move-exception;
        r8 = r6;
        r9 = r6;
    L_0x0253:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x029c }
        r1.<init>();	 Catch:{ all -> 0x029c }
        r2 = R;	 Catch:{ all -> 0x029c }
        r3 = 18;
        r2 = r2[r3];	 Catch:{ all -> 0x029c }
        r1 = r1.append(r2);	 Catch:{ all -> 0x029c }
        r0 = r0.toString();	 Catch:{ all -> 0x029c }
        r0 = r1.append(r0);	 Catch:{ all -> 0x029c }
        r0 = r0.toString();	 Catch:{ all -> 0x029c }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x029c }
        if (r8 == 0) goto L_0x0276;
    L_0x0273:
        r8.close();	 Catch:{ IOException -> 0x027e }
    L_0x0276:
        if (r9 == 0) goto L_0x027b;
    L_0x0278:
        r9.recycle();	 Catch:{ IOException -> 0x0282 }
    L_0x027b:
        r0 = r6;
        goto L_0x009f;
    L_0x027e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0280 }
    L_0x0280:
        r0 = move-exception;
        goto L_0x027b;
    L_0x0282:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0280 }
    L_0x0284:
        r0 = move-exception;
        r8 = r6;
    L_0x0286:
        if (r8 == 0) goto L_0x028b;
    L_0x0288:
        r8.close();	 Catch:{ IOException -> 0x0291 }
    L_0x028b:
        if (r6 == 0) goto L_0x0290;
    L_0x028d:
        r6.recycle();	 Catch:{ IOException -> 0x0295 }
    L_0x0290:
        throw r0;
    L_0x0291:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0293 }
    L_0x0293:
        r1 = move-exception;
        goto L_0x0290;
    L_0x0295:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x0293 }
    L_0x0297:
        r0 = move-exception;
        r8 = r1;
        goto L_0x0286;
    L_0x029a:
        r0 = move-exception;
        goto L_0x0286;
    L_0x029c:
        r0 = move-exception;
        r6 = r9;
        goto L_0x0286;
    L_0x029f:
        r0 = move-exception;
        r8 = r1;
        r6 = r2;
        goto L_0x0286;
    L_0x02a3:
        r0 = move-exception;
        r8 = r1;
        r9 = r6;
        goto L_0x0253;
    L_0x02a7:
        r0 = move-exception;
        r9 = r6;
        goto L_0x0253;
    L_0x02aa:
        r0 = move-exception;
        goto L_0x0253;
    L_0x02ac:
        r0 = move-exception;
        r1 = r8;
        r2 = r6;
        goto L_0x00a5;
    L_0x02b1:
        r1 = r6;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m8.a(int, float):android.graphics.Bitmap");
    }

    public static boolean f(String str) {
        return R[2].equals(str);
    }

    public String a(Context context) {
        try {
            if (R[0].equals(this.e)) {
                return context.getString(R.string.broadcasts);
            }
            try {
                if (!TextUtils.isEmpty(this.N)) {
                    return this.N;
                }
                try {
                    if (w()) {
                        return context.getString(R.string.group_subject_unknown);
                    }
                    if (!l()) {
                        return "\u202a" + a() + "\u202c";
                    }
                    return String.format(App.aX.a(R.plurals.broadcast_n_recipients, bd.i(this.e).h()), new Object[]{Integer.valueOf(r0)});
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(java.lang.String r6) {
        /*
        r5_this = this;
        r1 = 1;
        r0 = 0;
        r3 = com.whatsapp.m3.d;
        r2 = android.text.TextUtils.isEmpty(r6);	 Catch:{ IllegalArgumentException -> 0x000c }
        if (r2 == 0) goto L_0x000e;
    L_0x000a:
        r0 = r1;
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r2 = r5.N;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x001e;
    L_0x0016:
        r2 = r5.N;
        r2 = com.whatsapp.util.a5.b(r2);
        if (r3 == 0) goto L_0x0030;
    L_0x001e:
        r2 = r5.l();	 Catch:{ IllegalArgumentException -> 0x0057 }
        if (r2 == 0) goto L_0x002c;
    L_0x0024:
        r2 = r5.e;
        r2 = com.whatsapp.bd.h(r2);
        if (r3 == 0) goto L_0x0030;
    L_0x002c:
        r2 = r5.a();
    L_0x0030:
        if (r2 == 0) goto L_0x000b;
    L_0x0032:
        r2 = r2.toLowerCase();
        r3 = r2.startsWith(r6);	 Catch:{ IllegalArgumentException -> 0x0059 }
        if (r3 != 0) goto L_0x0055;
    L_0x003c:
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x005b }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x005b }
        r4 = " ";
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x005b }
        r3 = r3.append(r6);	 Catch:{ IllegalArgumentException -> 0x005b }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x005b }
        r2 = r2.contains(r3);	 Catch:{ IllegalArgumentException -> 0x005b }
        if (r2 == 0) goto L_0x000b;
    L_0x0055:
        r0 = r1;
        goto L_0x000b;
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m8.c(java.lang.String):boolean");
    }

    public static void a(Collection collection, String str, String str2) {
        int i = m3.d;
        int size = collection.size();
        try {
            Log.i(str + R[38] + size);
            if (App.aa >= 1 && size < 5000) {
                for (m8 m8Var : collection) {
                    if (i != 0) {
                        return;
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static File g(String str) {
        File file = new File(App.p.getFilesDir(), R[23]);
        try {
            if (!file.exists()) {
                file.mkdirs();
            }
            return new File(file, str + R[22]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public String x() {
        try {
            return this.h != null ? this.h.toString() : this.e;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public m8(g9 g9Var, String str, int i, String str2) {
        this.y = -1;
        this.h = null;
        this.v = null;
        this.k = false;
        this.E = null;
        this.B = true;
        this.h = g9Var;
        this.N = str;
        this.v = Integer.valueOf(i);
        this.s = str2;
    }

    public int k() {
        try {
            if (d(this.e)) {
                return R.drawable.avatar_broadcast;
            }
            try {
                if (bd.b(this.e)) {
                    return this.e.contains(R[3]) ? R.drawable.avatar_group_tmp : R.drawable.avatar_group;
                } else {
                    return R.drawable.avatar_contact;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri y() {
        /*
        r4_this = this;
        r0 = r4.h;	 Catch:{ IllegalArgumentException -> 0x001a }
        if (r0 == 0) goto L_0x0018;
    L_0x0004:
        r0 = r4.h;	 Catch:{ IllegalArgumentException -> 0x001c }
        r0 = r0.a;	 Catch:{ IllegalArgumentException -> 0x001c }
        r2 = -2;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0018;
    L_0x000e:
        r0 = r4.h;	 Catch:{ IllegalArgumentException -> 0x001e }
        r0 = r0.a;	 Catch:{ IllegalArgumentException -> 0x001e }
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x0020;
    L_0x0018:
        r0 = 0;
    L_0x0019:
        return r0;
    L_0x001a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001c }
    L_0x001c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;
    L_0x0020:
        r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI;
        r1 = r4.h;
        r2 = r1.a;
        r0 = android.content.ContentUris.withAppendedId(r0, r2);
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m8.y():android.net.Uri");
    }

    protected InputStream a(boolean z) {
        int i = m3.d;
        ContentResolver contentResolver = App.p.getContentResolver();
        InputStream a = a(contentResolver, z);
        if (a == null) {
            Iterator it = App.P.j(this).iterator();
            while (it.hasNext()) {
                a = new m8(this.h.b, ((Long) it.next()).longValue(), this.N, 0, null).a(contentResolver, z);
                if (a == null || i != 0) {
                    if (i != 0) {
                        break;
                    }
                }
                break;
            }
        }
        return a;
    }

    private String q() {
        Cursor query;
        try {
            Uri b = b(App.e);
            if (b != null) {
                query = App.e.query(b, null, null, null, null);
                if (query != null) {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndex(R[37]));
                        query.close();
                        return string;
                    }
                    query.close();
                }
            }
        } catch (Throwable e) {
            Log.c(e);
        } catch (Throwable th) {
            query.close();
        }
        try {
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(int r12, int r13, float r14) {
        /*
        r11 = 0;
        r2 = 0;
        r8 = com.whatsapp.m3.d;
        r1 = com.whatsapp.App.p;
        r1 = r1.getResources();
        r7 = r1.getDrawable(r12);
        r1 = android.graphics.Bitmap.Config.ARGB_8888;
        r9 = android.graphics.Bitmap.createBitmap(r13, r13, r1);
        r1 = new android.graphics.Canvas;
        r1.<init>(r9);
        r7.setBounds(r2, r2, r13, r13);
        r2 = r7 instanceof android.graphics.drawable.BitmapDrawable;
        if (r2 == 0) goto L_0x006b;
    L_0x0020:
        r6 = new android.graphics.Paint;
        r6.<init>();
        r2 = new android.graphics.RectF;
        r3 = (float) r13;
        r4 = (float) r13;
        r2.<init>(r11, r11, r3, r4);
        r3 = 1;
        r6.setAntiAlias(r3);	 Catch:{ IllegalArgumentException -> 0x006f }
        r3 = 1;
        r6.setDither(r3);	 Catch:{ IllegalArgumentException -> 0x006f }
        r3 = 1;
        r6.setFilterBitmap(r3);	 Catch:{ IllegalArgumentException -> 0x006f }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r10 = 0;
        r1.drawARGB(r3, r4, r5, r10);	 Catch:{ IllegalArgumentException -> 0x006f }
        r3 = -1;
        r6.setColor(r3);	 Catch:{ IllegalArgumentException -> 0x006f }
        r3 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1));
        if (r3 < 0) goto L_0x004c;
    L_0x0047:
        r1.drawRoundRect(r2, r14, r14, r6);	 Catch:{ IllegalArgumentException -> 0x0071 }
        if (r8 == 0) goto L_0x0053;
    L_0x004c:
        r3 = 0;
        r4 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r5 = 1;
        r1.drawArc(r2, r3, r4, r5, r6);	 Catch:{ IllegalArgumentException -> 0x0071 }
    L_0x0053:
        r3 = new android.graphics.PorterDuffXfermode;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r4 = android.graphics.PorterDuff.Mode.SRC_IN;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r3.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r6.setXfermode(r3);	 Catch:{ IllegalArgumentException -> 0x0073 }
        r0 = r7;
        r0 = (android.graphics.drawable.BitmapDrawable) r0;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r3 = r0;
        r3 = r3.getBitmap();	 Catch:{ IllegalArgumentException -> 0x0073 }
        r4 = 0;
        r1.drawBitmap(r3, r4, r2, r6);	 Catch:{ IllegalArgumentException -> 0x0073 }
        if (r8 == 0) goto L_0x006e;
    L_0x006b:
        r7.draw(r1);	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x006e:
        return r9;
    L_0x006f:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalArgumentException -> 0x0071 }
    L_0x0071:
        r1 = move-exception;
        throw r1;
    L_0x0073:
        r1 = move-exception;
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m8.a(int, int, float):android.graphics.Bitmap");
    }

    public File m() {
        try {
            return this.e.equals(App.P.d().e) ? App.P.d().m() : a(this.e);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String g() {
        /*
        r5_this = this;
        r0 = 0;
        r4 = 1;
        r1 = r5.l();	 Catch:{ IllegalArgumentException -> 0x0009 }
        if (r1 == 0) goto L_0x000b;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r1 = r5.w();
        if (r1 == 0) goto L_0x005b;
    L_0x0011:
        r1 = com.whatsapp.App.aT;
        r2 = r5.e;
        r1 = r1.d(r2);
        if (r1 == 0) goto L_0x0057;
    L_0x001b:
        r2 = com.whatsapp.App.P;
        r3 = r1.b;
        r2 = r2.a(r3);
        r3 = r1.a;	 Catch:{ IllegalArgumentException -> 0x003b }
        if (r3 != 0) goto L_0x003d;
    L_0x0027:
        r0 = com.whatsapp.App.p;	 Catch:{ IllegalArgumentException -> 0x003b }
        r1 = 2131624179; // 0x7f0e00f3 float:1.887553E38 double:1.0531622767E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IllegalArgumentException -> 0x003b }
        r4 = 0;
        r2 = r2.o();	 Catch:{ IllegalArgumentException -> 0x003b }
        r3[r4] = r2;	 Catch:{ IllegalArgumentException -> 0x003b }
        r0 = r0.getString(r1, r3);	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0008;
    L_0x003b:
        r0 = move-exception;
        throw r0;
    L_0x003d:
        r1 = r1.a;	 Catch:{ IllegalArgumentException -> 0x0055 }
        if (r1 != r4) goto L_0x0057;
    L_0x0041:
        r0 = com.whatsapp.App.p;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r1 = 2131624180; // 0x7f0e00f4 float:1.8875532E38 double:1.053162277E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IllegalArgumentException -> 0x0055 }
        r4 = 0;
        r2 = r2.o();	 Catch:{ IllegalArgumentException -> 0x0055 }
        r3[r4] = r2;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r0 = r0.getString(r1, r3);	 Catch:{ IllegalArgumentException -> 0x0055 }
        goto L_0x0008;
    L_0x0055:
        r0 = move-exception;
        throw r0;
    L_0x0057:
        r1 = com.whatsapp.m3.d;
        if (r1 == 0) goto L_0x0008;
    L_0x005b:
        r1 = com.whatsapp.App.aT;
        r2 = r5.e;
        r1 = r1.b(r2, r0);
        if (r1 != 0) goto L_0x0071;
    L_0x0065:
        r0 = com.whatsapp.App.p;	 Catch:{ IllegalArgumentException -> 0x006f }
        r1 = 2131624175; // 0x7f0e00ef float:1.8875522E38 double:1.0531622747E-314;
        r0 = r0.getString(r1);	 Catch:{ IllegalArgumentException -> 0x006f }
        goto L_0x0008;
    L_0x006f:
        r0 = move-exception;
        throw r0;
    L_0x0071:
        if (r1 != r4) goto L_0x0008;
    L_0x0073:
        r0 = com.whatsapp.App.p;	 Catch:{ IllegalArgumentException -> 0x007d }
        r1 = 2131624176; // 0x7f0e00f0 float:1.8875524E38 double:1.053162275E-314;
        r0 = r0.getString(r1);	 Catch:{ IllegalArgumentException -> 0x007d }
        goto L_0x0008;
    L_0x007d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m8.g():java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence a(android.content.res.Resources r2) {
        /*
        r1_this = this;
        r0 = r1.v;	 Catch:{ IllegalArgumentException -> 0x0013 }
        if (r0 == 0) goto L_0x0028;
    L_0x0004:
        r0 = r1.v;	 Catch:{ IllegalArgumentException -> 0x0015 }
        r0 = r0.intValue();	 Catch:{ IllegalArgumentException -> 0x0015 }
        if (r0 != 0) goto L_0x0019;
    L_0x000c:
        r0 = r1.s;	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r0 == 0) goto L_0x0019;
    L_0x0010:
        r0 = r1.s;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        r0 = r1.v;
        r0 = r0.intValue();
        r0 = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(r0);
        r0 = r2.getString(r0);
        goto L_0x0012;
    L_0x0028:
        r0 = 0;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m8.a(android.content.res.Resources):java.lang.CharSequence");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r6_this = this;
        r1 = com.whatsapp.m3.d;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r3 = 4;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r0 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r4 = r6.y;	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r0.append(r4);	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r3 = 12;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r3 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r0 = r6.e;	 Catch:{ IllegalArgumentException -> 0x00b7 }
        if (r0 != 0) goto L_0x00b9;
    L_0x0023:
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00b7 }
        r4 = 10;
        r0 = r0[r4];	 Catch:{ IllegalArgumentException -> 0x00b7 }
    L_0x0029:
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00bd }
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00bd }
        r3 = 13;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00bd }
        r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00bd }
        r0 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00bd }
        if (r0 != 0) goto L_0x0044;
    L_0x0039:
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00bf }
        r3 = 9;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00bf }
        r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00bf }
        if (r1 == 0) goto L_0x0059;
    L_0x0044:
        r0 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00bf }
        r4 = r0.a;	 Catch:{ IllegalArgumentException -> 0x00bf }
        r0 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x00bf }
        r3 = "-";
        r0 = r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x00bf }
        r3 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00bf }
        r3 = r3.b;	 Catch:{ IllegalArgumentException -> 0x00bf }
        r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x00bf }
    L_0x0059:
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r3 = 8;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r0 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r3 = r6.v;	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r3 = 11;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r0 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r3 = r6.q;	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x00c1 }
        r0 = r6.w();	 Catch:{ IllegalArgumentException -> 0x00c1 }
        if (r0 == 0) goto L_0x009f;
    L_0x007d:
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r3 = 5;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r0 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r3 = com.whatsapp.App.p;	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r3 = r6.a(r3);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r3 = 6;
        r0 = r0[r3];	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r0 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r3 = r6.b;	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r0.append(r3);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        if (r1 == 0) goto L_0x00b2;
    L_0x009f:
        r0 = com.whatsapp.App.aa;	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r1 = 1;
        if (r0 < r1) goto L_0x00b2;
    L_0x00a4:
        r0 = R;	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r1 = 7;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r0 = r2.append(r0);	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r1 = r6.N;	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x00c5 }
    L_0x00b2:
        r0 = r2.toString();
        return r0;
    L_0x00b7:
        r0 = move-exception;
        throw r0;
    L_0x00b9:
        r0 = r6.e;
        goto L_0x0029;
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m8.toString():java.lang.String");
    }

    public m8(String str) {
        super(str);
        this.y = -1;
        this.h = null;
        this.v = null;
        this.k = false;
        this.E = null;
        this.B = true;
        this.q = true;
        this.h = null;
    }

    static {
        String[] strArr = new String[66];
        String str = "\u0002j\u00058X\u0003y\u0019-";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            int i3;
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i4 = 0; length > i4; i4++) {
                char c = cArr[i4];
                switch (i4 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 96;
                        break;
                    case ay.f /*1*/:
                        i3 = 24;
                        break;
                    case ay.n /*2*/:
                        i3 = 106;
                        break;
                    case ay.p /*3*/:
                        i3 = 89;
                        break;
                    default:
                        i3 = 60;
                        break;
                }
                cArr[i4] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0002j\u00058X\u0003y\u0019-";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u0014}\u0007)";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\u0012w\u001d\u0006U\u0004%";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "@v\u000b4Y]";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "@k\u001e8H\u0015kW";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "@v\u000b4Y]";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "@h\u00026R\u0005%";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "Hv\u001f5PI";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "Hv\u001f5PI";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "@q\u0019.]]";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "@r\u0003=\u0001";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "@s\u000f \u0001";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "\u0017y\t6R\u0014y\t-\u0013\u0007}\u001e)T\u000fl\u0005?]\u0013lE<N\u0012w\u0018y";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\u0017y\t6R\u0014y\t-\u0013\u0007}\u001e)T\u000fl\u0005?]\u0013lE";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "@|\u000f:S\u0004}9-N\u0005y\u0007yN\u0005l\u001f+R\u00138\u0004,P\f";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "\u0017y\t6R\u0014y\t-\u0013\u0007}\u001e)T\u000fl\u0005?]\u0013lE";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "\u0017y\t6R\u0014y\t-\u0013\u0007}\u001e)T\u000fl\u0005?]\u0013lE6I\u00145\u0005?\u0011\r}\u00076N\u00198";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "@}\u0018+S\u00128\t5S\u0013q\u0004>\u001c\u0013l\u0018<]\r";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "@k\u001e+Y\u0001uJ0O@v\u001f5P";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "\u0017y\t6R\u0014y\t-\u0013\u0007}\u001e)T\u000fl\u0005?]\u0013lE";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "Nr";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "!n\u000b-]\u0012k";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = " kD.T\u0001l\u00198L\u00106\u0004<H";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "\u0014}\u0007)";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "@l\u0002,Q\u00028\f0P\u00058\u00070O\u0013q\u0004>\u001c\t|P";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "@~\u001f5P@~\u00035Y@u\u0003*O\tv\ryU\u0004\"";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "\u0017y\t6R\u0014y\t-\u0013\u0007}\u001e)T\u000fl\u0005*H\u0012}\u000b4\u0013";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "\rw\u001f7H\u0005|";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "\rw\u001f7H\u0005|5+S";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "\u0017y\t6R\u0014y\t-\u0013\u0007}\u001e)T\u000fl\u0005*H\u0012}\u000b4\u0013";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "\u0015h\u000e8H\u0005H\u00026H\u000f^\u00035Y\u0013";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "\u0015h\u000e8H\u0005H\u00026H\u000f^\u00035Y\u0013";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = " kD.T\u0001l\u00198L\u00106\u0004<H";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = " kD.T\u0001l\u00198L\u00106\u0004<H";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = " z\u00186]\u0004{\u000b*H";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "\u0003m\u0019-S\rG\u00180R\u0007l\u00057Y";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "O{\u0005,R\u00148";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "@r\u0003=\u0001";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "Hv\u001f5PI";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "@h\u00026R\u0005%";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "Hv\u001f5PI";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "@q\u0019.]]";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "\u0010j\u0005;P\u0005u\u000b-U\u00038\t6R\u0014y\t-\u0006";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "\u0012w\u001d\u0006U\u0004%";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "@s\u000f \u0001";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "\u0016v\u000ew]\u000e|\u00186U\u00046\t,N\u0013w\u0018wU\u0014}\u0007vR\u0001u\u000f";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "\u0004y\u001e8\u000b";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "\u0012y\u001d\u0006_\u000fv\u001e8_\u0014G\u0003=\u001c]8Uy}.\\J4U\r}\u001e L\u0005%U";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "\u0004y\u001e8\u000f";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "\u0004y\u001e8\u0005";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "\u0004y\u001e8\u000e";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "\u0004y\u001e8\u000e";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "\u0004y\u001e8\u000f";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "\u0004y\u001e8\u000b";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "\u0004y\u001e8\u0005";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "!u\u000b#S\u000eP\u00054Y7q\u000e>Y\u0014Y\u001c8H\u0001j\u0019";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "Nr";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "Nr\u001a>";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = "Nv\u00054Y\u0004q\u000b";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "Nr\u001a>";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "0j\u0005?U\f}J\tU\u0003l\u001f+Y\u0013";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "\u0003m\u0019-S\rG\u00180R\u0007l\u00057Y";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "\u0014}\u0007)";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "\u204e\u2032";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i2] = str;
                    R = strArr3;
                    str = "?q\u000e";
                    i = -1;
                    while (true) {
                        toCharArray = str.toCharArray();
                        int length2 = toCharArray.length;
                        char[] cArr2 = toCharArray;
                        for (int i5 = 0; length2 > i5; i5++) {
                            char c2 = cArr2[i5];
                            switch (i5 % 5) {
                                case PBE.MD5 /*0*/:
                                    i3 = 96;
                                    break;
                                case ay.f /*1*/:
                                    i3 = 24;
                                    break;
                                case ay.n /*2*/:
                                    i3 = 106;
                                    break;
                                case ay.p /*3*/:
                                    i3 = 89;
                                    break;
                                default:
                                    i3 = 60;
                                    break;
                            }
                            cArr2[i5] = (char) (i3 ^ c2);
                        }
                        str = new String(cArr2).intern();
                        switch (i) {
                            case PBE.MD5 /*0*/:
                                j = str;
                                str = "\tk5.T\u0001l\u00198L\u0010G\u001f*Y\u0012";
                                i = 1;
                                break;
                            case ay.f /*1*/:
                                D = str;
                                str = "\u0013l\u000b-I\u0013";
                                i = 2;
                                break;
                            case ay.n /*2*/:
                                g = str;
                                str = "\u000em\u0007;Y\u0012";
                                i = 3;
                                break;
                            case ay.p /*3*/:
                                p = str;
                                str = "\u0012y\u001d\u0006_\u000fv\u001e8_\u0014G\u0003=";
                                i = 4;
                                break;
                            case aj.i /*4*/:
                                J = str;
                                str = "\u0004q\u0019)P\u0001a57]\r}";
                                i = 5;
                                break;
                            case aV.r /*5*/:
                                w = str;
                                str = "\u0010p\u00057Y?l\u0013)Y";
                                i = 6;
                                break;
                            case aV.i /*6*/:
                                I = str;
                                str = "\u0010p\u00057Y?t\u000b;Y\f";
                                i = 7;
                                break;
                            case a8.s /*7*/:
                                z = str;
                                str = "\u0015v\u0019<Y\u000eG\u0007*[?{\u0005,R\u0014";
                                i = 8;
                                break;
                            case a8.n /*8*/:
                                H = str;
                                str = "\u0010p\u0005-S?l\u0019";
                                i = 9;
                                break;
                            case a6.D /*9*/:
                                i = str;
                                str = "\u0014p\u001f4^?l\u0019";
                                i = 10;
                                break;
                            case a6.h /*10*/:
                                O = str;
                                str = "\u0010p\u0005-S?q\u000e\u0006H\tu\u000f*H\u0001u\u001a";
                                i = 11;
                                break;
                            case a6.e /*11*/:
                                P = str;
                                str = "\u0007q\u001c<R?v\u000b4Y";
                                i = 12;
                                break;
                            case a6.s /*12*/:
                                L = str;
                                str = "\u0006y\u00070P\u0019G\u00048Q\u0005";
                                i = 13;
                                break;
                            case a6.z /*13*/:
                                f = str;
                                str = "\u0017y57]\r}";
                                i = 14;
                                break;
                            case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                                x = str;
                                str = "\u0013w\u0018-c\u000ey\u0007<";
                                i = 15;
                                break;
                            case vk.SherlockTheme_actionModeBackground /*15*/:
                                u = str;
                                str = "\u0013l\u000b-I\u0013G\u001e0Q\u0005k\u001e8Q\u0010";
                                i = 16;
                                break;
                            case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                                m = str;
                                str = "\u0003y\u00065]\u0002q\u00060H\u0019";
                                i = 17;
                                break;
                            case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                                o = str;
                                K = new String[]{l, j, D, g, p, J, w, I, z, H, i, O, P, L, f, x, u, m, o};
                                G = new HashMap();
                            default:
                                l = str;
                                str = "\nq\u000e";
                                i = 0;
                                break;
                        }
                    }
                default:
                    strArr2[i2] = str;
                    str = "\u000fh\u000f7\u007f\u000fv\u001e8_\u0014H\u00026H\u000fQ\u0004)I\u0014K\u001e+Y\u0001u";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static boolean e(String str) {
        return str.substring(str.lastIndexOf("@") + 1, str.length()).equals(R[25]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private m8(android.database.Cursor r9) {
        /*
        r8_this = this;
        r6 = 0;
        r1 = 0;
        r0 = 1;
        r2 = r9.getString(r0);
        r3 = 3;
        r3 = r9.getString(r3);
        r4 = 17;
        r4 = r9.getLong(r4);
        r8.<init>(r2, r3, r4);
        r2 = -1;
        r8.y = r2;
        r8.h = r6;
        r8.v = r6;
        r8.k = r1;
        r8.E = r6;
        r8.B = r0;
        r2 = r9.getLong(r1);
        r8.y = r2;
        r2 = 6;
        r2 = r9.getString(r2);
        r8.N = r2;
        r2 = 7;
        r2 = r9.getInt(r2);
        r2 = java.lang.Integer.valueOf(r2);
        r8.v = r2;
        r2 = 8;
        r2 = r9.getString(r2);
        r8.s = r2;
        r2 = 4;
        r2 = r9.getString(r2);
        r3 = 5;
        r4 = r9.getLong(r3);
        r6 = 0;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 > 0) goto L_0x0059;
    L_0x0053:
        r6 = -2;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x006c;
    L_0x0059:
        if (r2 == 0) goto L_0x006c;
    L_0x005b:
        r3 = com.whatsapp.contact.j.a(r2);	 Catch:{ IllegalArgumentException -> 0x00c6 }
        if (r3 == 0) goto L_0x006c;
    L_0x0061:
        r3 = new com.whatsapp.g9;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r3.<init>(r4, r2);	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r8.h = r3;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        r3 = com.whatsapp.m3.d;	 Catch:{ IllegalArgumentException -> 0x00c8 }
        if (r3 == 0) goto L_0x0070;
    L_0x006c:
        if (r2 == 0) goto L_0x0070;
    L_0x006e:
        r8.E = r2;	 Catch:{ IllegalArgumentException -> 0x00ca }
    L_0x0070:
        r2 = 2;
        r2 = r9.getInt(r2);	 Catch:{ IllegalArgumentException -> 0x00cc }
        if (r2 != r0) goto L_0x00ce;
    L_0x0077:
        r8.q = r0;
        r0 = 9;
        r0 = r9.getInt(r0);
        r8.a = r0;
        r0 = 10;
        r0 = r9.getInt(r0);
        r8.M = r0;
        r0 = 11;
        r0 = r9.getInt(r0);
        r8.A = r0;
        r0 = 12;
        r0 = r9.getLong(r0);
        r8.r = r0;
        r0 = 13;
        r0 = r9.getString(r0);
        r8.Q = r0;
        r0 = 14;
        r0 = r9.getString(r0);
        r8.F = r0;
        r0 = 15;
        r0 = r9.getString(r0);
        r8.t = r0;
        r0 = 16;
        r0 = r9.getString(r0);
        r8.n = r0;
        r0 = 18;
        r0 = r9.getString(r0);
        r0 = com.whatsapp.ar.fromText(r0);
        r8.C = r0;
        return;
    L_0x00c6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c8 }
    L_0x00c8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ca }
    L_0x00ca:
        r0 = move-exception;
        throw r0;
    L_0x00cc:
        r0 = move-exception;
        throw r0;
    L_0x00ce:
        r0 = r1;
        goto L_0x0077;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m8.<init>(android.database.Cursor):void");
    }

    public Bitmap b(int i, float f) {
        return (Bitmap) App.R.get(c(i, f));
    }

    @TargetApi(17)
    public File p() {
        File file = new File(App.p.getFilesDir(), R[57]);
        try {
            if (!file.exists()) {
                file.mkdirs();
            }
            file.setExecutable(true, false);
            File file2 = new File(file, this.e + R[58]);
            try {
                if (file2.exists()) {
                    return file2;
                }
                OutputStream fileOutputStream;
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (IOException e) {
                    fileOutputStream = null;
                }
                Bitmap a = a(512, App.p.getResources().getDimension(R.dimen.small_avatar_radius), false);
                if (fileOutputStream == null || a == null) {
                    return null;
                }
                a.compress(CompressFormat.JPEG, 100, fileOutputStream);
                return file2;
            } catch (IOException e2) {
                throw e2;
            }
        } catch (IOException e22) {
            throw e22;
        }
    }

    public String f() {
        return bd.b(this.e) ? this.e.substring(0, this.e.indexOf("-")) + R[24] : null;
    }

    public m8(j jVar) {
        this(jVar.a(), jVar.e(), jVar.g(), jVar.b(), jVar.f());
        this.n = jVar.d();
    }

    public long e() {
        try {
            return this.h == null ? 0 : this.h.a;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public Bitmap j() {
        return a(k());
    }

    public InputStream a(ContentResolver contentResolver, boolean z) {
        Uri b = b(contentResolver);
        if (b == null) {
            return null;
        }
        if (z) {
            try {
                if (VERSION.SDK_INT >= 14) {
                    try {
                        Method declaredMethod = Contacts.class.getDeclaredMethod(R[1], new Class[]{ContentResolver.class, Uri.class, Boolean.TYPE});
                        declaredMethod.setAccessible(true);
                        return (InputStream) declaredMethod.invoke(null, new Object[]{contentResolver, b, Boolean.valueOf(true)});
                    } catch (Throwable e) {
                        Log.c(e);
                    } catch (Throwable e2) {
                        Log.c(e2);
                    } catch (Throwable e22) {
                        Log.c(e22);
                    } catch (Throwable e222) {
                        Log.c(e222);
                    } catch (Throwable e2222) {
                        Log.c(e2222);
                    }
                }
            } catch (SecurityException e3) {
                throw e3;
            }
        }
        return Contacts.openContactPhotoInputStream(contentResolver, b);
    }

    public File a() {
        try {
            return this.e.equals(App.P.d().e) ? App.P.d().m() : g(this.e);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public m8(String str, long j, String str2, int i, String str3) {
        this(new g9(j, str), str2, i, str3);
    }

    public static Bitmap a(int i) {
        Bitmap bitmap = (Bitmap) G.get(Integer.valueOf(i));
        if (bitmap != null) {
            return bitmap;
        }
        bitmap = a(i, App.p.getResources().getDimensionPixelSize(R.dimen.small_avatar_size), App.p.getResources().getDimension(R.dimen.small_avatar_radius));
        G.put(Integer.valueOf(i), bitmap);
        return bitmap;
    }
}
