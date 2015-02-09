package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.ContactsContract.RawContacts;
import android.text.TextUtils;
import android.util.Pair;
import com.actionbarsherlock.R;
import com.whatsapp.contact.e;
import com.whatsapp.contact.i;
import com.whatsapp.contact.j;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ok {
    private static final Map b;
    private static mf c;
    private static final String[] z;
    private x5 a;

    public void m(m8 m8Var) {
        this.a.m(m8Var);
    }

    static void b(String str) {
        b.remove(str);
    }

    public int c() {
        int h = this.a.h();
        Log.i(z[26] + h);
        return h;
    }

    public void e(ArrayList arrayList) {
        this.a.a(arrayList);
    }

    public void g(String str) {
        this.a.a(str, 0, null);
    }

    static boolean f(m8 m8Var) {
        return b.put(m8Var.e, m8Var) == null;
    }

    public void d(Collection collection) {
        int i = m3.d;
        this.a.a(collection);
        for (Pair pair : collection) {
            b((String) pair.first);
            if (i != 0) {
                return;
            }
        }
    }

    public int l() {
        Throwable e;
        int i = m3.d;
        System.currentTimeMillis();
        Cursor query;
        try {
            query = App.e.query(RawContacts.CONTENT_URI, new String[]{z[0]}, null, null, null);
            if (query != null) {
                int i2 = 0;
                do {
                    try {
                        if (!query.moveToNext()) {
                            break;
                        }
                        i2 += query.getInt(0);
                    } catch (Exception e2) {
                        throw e2;
                    } catch (Exception e3) {
                        e = e3;
                    }
                } while (i == 0);
                if (query == null) {
                    return i2;
                }
                try {
                    query.close();
                    return i2;
                } catch (Exception e22) {
                    throw e22;
                }
            }
            if (query != null) {
                try {
                    query.close();
                } catch (Exception e222) {
                    throw e222;
                }
            }
            return 0;
        } catch (Exception e4) {
            e = e4;
            query = null;
            try {
                Log.c(e);
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th) {
                e = th;
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e2222) {
                        throw e2222;
                    }
                }
                throw e;
            }
            return 0;
        } catch (Throwable th2) {
            e = th2;
            query = null;
            if (query != null) {
                query.close();
            }
            throw e;
        }
    }

    public void l(m8 m8Var) {
        this.a.b(m8Var);
    }

    public void o(m8 m8Var) {
        this.a.c(m8Var);
        App.aH.sendEmptyMessage(0);
    }

    public void n(m8 m8Var) {
        this.a.g(m8Var);
    }

    public void a(ArrayList arrayList) {
        int i = m3.d;
        this.a.d(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m8 m8Var = (m8) it.next();
            m8Var.v();
            m8Var.c();
            c(m8Var);
            if (i != 0) {
                return;
            }
        }
    }

    public m8 a(g9 g9Var) {
        int i = m3.d;
        synchronized (b) {
            for (m8 m8Var : b.values()) {
                if (!g9Var.equals(m8Var.h)) {
                    if (i != 0) {
                        break;
                    }
                }
                return m8Var;
            }
            return this.a.a(g9Var);
        }
    }

    public m8 d(String str) {
        if (App.af() != null && str.equals(App.af() + z[2])) {
            return d();
        }
        m8 m8Var = (m8) b.get(str);
        return m8Var == null ? this.a.d(str) : m8Var;
    }

    public void b(m8 m8Var) {
        Collection arrayList = new ArrayList();
        arrayList.add(m8Var);
        b(arrayList);
    }

    public void e(m8 m8Var) {
        this.a.h(m8Var);
    }

    public Map g() {
        return this.a.e();
    }

    public void b(Collection collection) {
        this.a.b(collection);
        App.a(new ArrayList(collection));
    }

    public void a(ArrayList arrayList, Set set) {
        this.a.a(arrayList, set);
    }

    public Intent a(m8 m8Var, boolean z) {
        String a = a5.a(m8Var.a(App.p));
        Parcelable intent = new Intent(App.p.getApplicationContext(), Conversation.class);
        intent.setAction(z[25]);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.putExtra(z[21], m8Var.e);
        intent.putExtra(z[19], a);
        Intent intent2 = new Intent();
        intent2.putExtra(z[23], intent);
        intent2.putExtra(z[24], false);
        intent2.putExtra(z[22], a);
        if (z) {
            int dimensionPixelSize = App.p.getResources().getDimensionPixelSize(R.dimen.shortcut_image_size);
            Parcelable a2 = m8Var.a(dimensionPixelSize, App.p.getResources().getDimension(R.dimen.small_avatar_radius), false);
            if (a2 == null) {
                a2 = m8Var.j();
                if (!(a2 == null || (a2.getWidth() == dimensionPixelSize && a2.getHeight() == dimensionPixelSize))) {
                    a2 = Bitmap.createScaledBitmap(a2, dimensionPixelSize, dimensionPixelSize, true);
                }
            }
            intent2.putExtra(z[20], a2);
        }
        return intent2;
    }

    public boolean j() {
        return this.a.f();
    }

    public void a(String str, String str2, String str3) {
        m8 a = a(str);
        a.N = str3;
        if (!(str2 == null || str2.startsWith(App.af()))) {
            a.a++;
        }
        this.a.c(a);
    }

    public void a() {
        this.a.d();
    }

    static void c(m8 m8Var) {
        b(m8Var.e);
    }

    static x5 a(ok okVar) {
        return okVar.a;
    }

    public void a(m8 m8Var) {
        this.a.a(m8Var);
    }

    public boolean h(String str) {
        if (str == null) {
            return false;
        }
        m8 d = d();
        return d != null && str.equals(d.e);
    }

    public void h(m8 m8Var) {
        this.a.l(m8Var);
    }

    public void k(m8 m8Var) {
        App.p.getApplicationContext().sendBroadcast(a(m8Var, false).setAction(z[31]));
    }

    public void c(Collection collection) {
        this.a.c(collection);
        App.a(new ArrayList(collection));
    }

    public void a(String str, long j, String str2) {
        this.a.a(str, j, str2);
    }

    public m8 a(Uri uri) {
        int i = m3.d;
        synchronized (b) {
            for (m8 m8Var : b.values()) {
                if (!uri.equals(m8Var.n())) {
                    if (i != 0) {
                        break;
                    }
                }
                return m8Var;
            }
            return this.a.a(uri);
        }
    }

    public ArrayList h() {
        return this.a.i();
    }

    public void b() {
        b.clear();
    }

    public void d(ArrayList arrayList) {
        this.a.c(arrayList);
    }

    public ArrayList e() {
        return this.a.a();
    }

    public void c(ArrayList arrayList) {
        this.a.e(arrayList);
    }

    public void g(m8 m8Var) {
        App.p.getApplicationContext().sendBroadcast(a(m8Var, true).setAction(z[1]));
    }

    public ArrayList j(m8 m8Var) {
        return this.a.j(m8Var);
    }

    public ok(Context context) {
        this.a = new x5(context);
    }

    public m8 f(String str) {
        m8 m8Var = (m8) b.get(str);
        return m8Var != null ? m8Var : this.a.d(str);
    }

    public void b(ArrayList arrayList) {
        this.a.b(arrayList);
    }

    public void i(m8 m8Var) {
        App.P.d(m8Var);
    }

    public void a(Uri uri, m8 m8Var) {
        Context applicationContext = App.p.getApplicationContext();
        if (a(applicationContext, uri, m8Var)) {
            App.b(applicationContext, (int) R.string.add_anonymous_contact_with_no_displayname, 0);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.content.Context r12, android.net.Uri r13, com.whatsapp.m8 r14) {
        /*
        r11_this = this;
        r10 = com.whatsapp.m3.d;
        r0 = 3;
        r2 = new java.lang.String[r0];
        r0 = 0;
        r1 = z;
        r3 = 9;
        r1 = r1[r3];
        r2[r0] = r1;
        r0 = 1;
        r1 = z;
        r3 = 7;
        r1 = r1[r3];
        r2[r0] = r1;
        r0 = 2;
        r1 = z;
        r3 = 6;
        r1 = r1[r3];
        r2[r0] = r1;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 < r1) goto L_0x0055;
    L_0x0024:
        r0 = 5;
        r0 = new java.lang.String[r0];
        r1 = 0;
        r3 = z;
        r4 = 12;
        r3 = r3[r4];
        r0[r1] = r3;
        r1 = 1;
        r3 = z;
        r4 = 17;
        r3 = r3[r4];
        r0[r1] = r3;
        r1 = 2;
        r3 = z;
        r4 = 14;
        r3 = r3[r4];
        r0[r1] = r3;
        r1 = 3;
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r0[r1] = r3;
        r1 = 4;
        r3 = z;
        r4 = 13;
        r3 = r3[r4];
        r0[r1] = r3;
        if (r10 == 0) goto L_0x01dc;
    L_0x0055:
        r0 = 4;
        r0 = new java.lang.String[r0];
        r1 = 0;
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r0[r1] = r3;
        r1 = 1;
        r3 = z;
        r4 = 18;
        r3 = r3[r4];
        r0[r1] = r3;
        r1 = 2;
        r3 = z;
        r4 = 10;
        r3 = r3[r4];
        r0[r1] = r3;
        r1 = 3;
        r3 = z;
        r4 = 8;
        r3 = r3[r4];
        r0[r1] = r3;
        r6 = r0;
    L_0x007c:
        r0 = z;
        r1 = 16;
        r0 = r0[r1];
        if (r14 != 0) goto L_0x00c2;
    L_0x0084:
        r0 = z;	 Catch:{ Exception -> 0x00b5 }
        r1 = 15;
        r0 = r0[r1];	 Catch:{ Exception -> 0x00b5 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00b5 }
        r0 = com.whatsapp.App.aX();	 Catch:{ Exception -> 0x00b5 }
        if (r0 == 0) goto L_0x00b9;
    L_0x0093:
        r0 = com.whatsapp.contact.c.INTERACTIVE_DELTA;	 Catch:{ Exception -> 0x00b7 }
    L_0x0095:
        r0 = com.whatsapp.contact.i.d(r12, r0);
        r1 = r0.isFailure();	 Catch:{ Exception -> 0x00bc }
        if (r1 == 0) goto L_0x00a7;
    L_0x009f:
        r1 = com.whatsapp.App.a0;	 Catch:{ Exception -> 0x00bc }
        r2 = 0;
        r1.a(r2);	 Catch:{ Exception -> 0x00bc }
        if (r10 == 0) goto L_0x00b3;
    L_0x00a7:
        r0 = r0.isSuccess();	 Catch:{ Exception -> 0x00be }
        if (r0 == 0) goto L_0x00b3;
    L_0x00ad:
        r0 = com.whatsapp.App.a0;	 Catch:{ Exception -> 0x00c0 }
        r1 = 0;
        r0.b(r1);	 Catch:{ Exception -> 0x00c0 }
    L_0x00b3:
        r0 = 1;
    L_0x00b4:
        return r0;
    L_0x00b5:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00b7 }
    L_0x00b7:
        r0 = move-exception;
        throw r0;
    L_0x00b9:
        r0 = com.whatsapp.contact.c.BACKGROUND_DELTA;
        goto L_0x0095;
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        throw r0;
    L_0x00c2:
        r7 = 0;
        r9 = 0;
        r0 = com.whatsapp.App.e;	 Catch:{ all -> 0x01d1 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r13;
        r8 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x01d1 }
        if (r8 != 0) goto L_0x00d9;
    L_0x00d0:
        r0 = 1;
        if (r8 == 0) goto L_0x00b4;
    L_0x00d3:
        r8.close();	 Catch:{ Exception -> 0x00d7 }
        goto L_0x00b4;
    L_0x00d7:
        r0 = move-exception;
        throw r0;
    L_0x00d9:
        r0 = r9;
    L_0x00da:
        r1 = r8.moveToNext();	 Catch:{ all -> 0x01a7 }
        if (r1 == 0) goto L_0x019c;
    L_0x00e0:
        r1 = 2;
        r1 = r8.getInt(r1);	 Catch:{ all -> 0x01a7 }
        r2 = 1;
        if (r1 != r2) goto L_0x019a;
    L_0x00e8:
        r0 = 0;
        r0 = r8.getLong(r0);	 Catch:{ all -> 0x01a7 }
        r2 = 1;
        r2 = r8.getString(r2);	 Catch:{ all -> 0x01a7 }
        if (r2 == 0) goto L_0x00fa;
    L_0x00f4:
        r3 = r2.length();	 Catch:{ Exception -> 0x01a5 }
        if (r3 != 0) goto L_0x00fd;
    L_0x00fa:
        r9 = 1;
        if (r10 == 0) goto L_0x0100;
    L_0x00fd:
        r9 = 0;
        r14.N = r2;	 Catch:{ all -> 0x01a7 }
    L_0x0100:
        r2 = 1;
        r4 = new java.lang.String[r2];	 Catch:{ all -> 0x01a7 }
        r2 = 0;
        r0 = java.lang.Long.toString(r0);	 Catch:{ all -> 0x01a7 }
        r4[r2] = r0;	 Catch:{ all -> 0x01a7 }
        r7 = 0;
        r0 = com.whatsapp.App.e;	 Catch:{ Exception -> 0x01d7, all -> 0x01d4 }
        r1 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI;	 Catch:{ Exception -> 0x01d7, all -> 0x01d4 }
        r2 = z;	 Catch:{ Exception -> 0x01d7, all -> 0x01d4 }
        r3 = 11;
        r3 = r2[r3];	 Catch:{ Exception -> 0x01d7, all -> 0x01d4 }
        r5 = 0;
        r2 = r6;
        r1 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ Exception -> 0x01d7, all -> 0x01d4 }
        if (r1 == 0) goto L_0x0194;
    L_0x011d:
        r0 = r1.moveToNext();	 Catch:{ Exception -> 0x01af }
        if (r0 == 0) goto L_0x0194;
    L_0x0123:
        r0 = new com.whatsapp.g9;	 Catch:{ Exception -> 0x01bc }
        r2 = 0;
        r2 = r1.getLong(r2);	 Catch:{ Exception -> 0x01bc }
        r4 = 1;
        r4 = r1.getString(r4);	 Catch:{ Exception -> 0x01bc }
        r4 = android.telephony.PhoneNumberUtils.stripSeparators(r4);	 Catch:{ Exception -> 0x01bc }
        r0.<init>(r2, r4);	 Catch:{ Exception -> 0x01bc }
        r14.h = r0;	 Catch:{ Exception -> 0x01bc }
        r0 = 2;
        r0 = r1.getInt(r0);	 Catch:{ Exception -> 0x01bc }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Exception -> 0x01bc }
        r14.v = r0;	 Catch:{ Exception -> 0x01bc }
        r0 = 3;
        r0 = r1.getString(r0);	 Catch:{ Exception -> 0x01bc }
        r14.s = r0;	 Catch:{ Exception -> 0x01bc }
        r0 = r1.getColumnCount();	 Catch:{ Exception -> 0x01bc }
        r2 = 4;
        if (r0 <= r2) goto L_0x01c5;
    L_0x0151:
        r0 = 4;
        r0 = r1.getString(r0);	 Catch:{ Exception -> 0x01bc }
    L_0x0156:
        r14.n = r0;	 Catch:{ Exception -> 0x01c7 }
        if (r9 == 0) goto L_0x0160;
    L_0x015a:
        r0 = r14.h;	 Catch:{ Exception -> 0x01c7 }
        r0 = r0.b;	 Catch:{ Exception -> 0x01c7 }
        r14.N = r0;	 Catch:{ Exception -> 0x01c7 }
    L_0x0160:
        r0 = r14.h;	 Catch:{ Exception -> 0x01b1 }
        r0 = r0.b;	 Catch:{ Exception -> 0x01b1 }
        if (r0 == 0) goto L_0x011d;
    L_0x0166:
        r0 = r14.h;	 Catch:{ Exception -> 0x01b1 }
        r0 = r0.b;	 Catch:{ Exception -> 0x01b1 }
        r0 = r0.length();	 Catch:{ Exception -> 0x01b1 }
        if (r0 <= 0) goto L_0x011d;
    L_0x0170:
        r0 = com.whatsapp.contact.i.a();	 Catch:{ Exception -> 0x01c9 }
        if (r0 != 0) goto L_0x0185;
    L_0x0176:
        r0 = z;	 Catch:{ Exception -> 0x01c9 }
        r2 = 5;
        r0 = r0[r2];	 Catch:{ Exception -> 0x01c9 }
        r2 = 0;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x01c9 }
        r4 = 0;
        r3[r4] = r14;	 Catch:{ Exception -> 0x01c9 }
        com.whatsapp.util.Log.c(r0, r2, r3);	 Catch:{ Exception -> 0x01c9 }
    L_0x0185:
        r0 = r11.a;	 Catch:{ Exception -> 0x01b1 }
        r0.e(r14);	 Catch:{ Exception -> 0x01b1 }
        r0 = new com.whatsapp.zr;	 Catch:{ Exception -> 0x01b1 }
        r0.<init>(r11, r14);	 Catch:{ Exception -> 0x01b1 }
        r0.start();	 Catch:{ Exception -> 0x01b1 }
        if (r10 == 0) goto L_0x011d;
    L_0x0194:
        if (r1 == 0) goto L_0x01da;
    L_0x0196:
        r1.close();	 Catch:{ Exception -> 0x01cb }
        r0 = r9;
    L_0x019a:
        if (r10 == 0) goto L_0x00da;
    L_0x019c:
        if (r8 == 0) goto L_0x00b4;
    L_0x019e:
        r8.close();	 Catch:{ Exception -> 0x01a3 }
        goto L_0x00b4;
    L_0x01a3:
        r0 = move-exception;
        throw r0;
    L_0x01a5:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x01a7 }
    L_0x01a7:
        r0 = move-exception;
        r1 = r8;
    L_0x01a9:
        if (r1 == 0) goto L_0x01ae;
    L_0x01ab:
        r1.close();	 Catch:{ Exception -> 0x01cf }
    L_0x01ae:
        throw r0;
    L_0x01af:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01b1 }
    L_0x01b1:
        r0 = move-exception;
    L_0x01b2:
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x01be }
        if (r1 == 0) goto L_0x01da;
    L_0x01b7:
        r1.close();	 Catch:{ all -> 0x01a7 }
        r0 = r9;
        goto L_0x019a;
    L_0x01bc:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01b1 }
    L_0x01be:
        r0 = move-exception;
    L_0x01bf:
        if (r1 == 0) goto L_0x01c4;
    L_0x01c1:
        r1.close();	 Catch:{ Exception -> 0x01cd }
    L_0x01c4:
        throw r0;	 Catch:{ all -> 0x01a7 }
    L_0x01c5:
        r0 = 0;
        goto L_0x0156;
    L_0x01c7:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01b1 }
    L_0x01c9:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01b1 }
    L_0x01cb:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x01a7 }
    L_0x01cd:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x01a7 }
    L_0x01cf:
        r0 = move-exception;
        throw r0;
    L_0x01d1:
        r0 = move-exception;
        r1 = r7;
        goto L_0x01a9;
    L_0x01d4:
        r0 = move-exception;
        r1 = r7;
        goto L_0x01bf;
    L_0x01d7:
        r0 = move-exception;
        r1 = r7;
        goto L_0x01b2;
    L_0x01da:
        r0 = r9;
        goto L_0x019a;
    L_0x01dc:
        r6 = r0;
        goto L_0x007c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ok.a(android.content.Context, android.net.Uri, com.whatsapp.m8):boolean");
    }

    public void a(Collection collection) {
        if (collection.size() > 0) {
            Map hashMap = new HashMap();
            this.a.a(collection, hashMap);
            b.putAll(hashMap);
        }
    }

    public void a(String str, String str2, String str3, long j) {
        m8 d = this.a.d(str);
        if (d == null) {
            d = new m8(str);
            this.a.g(d);
        }
        d.N = str3;
        d.s = Long.toString(j);
        d.E = str2;
        this.a.c(d);
    }

    public m8 a(m8 m8Var, String str, String str2, long j) {
        this.a.a(m8Var, str, str2, j);
        return a(str);
    }

    public ArrayList c(String str) {
        return this.a.a(str);
    }

    public mf d() {
        if (App.af() == null) {
            return null;
        }
        if (c == null || !c.e.equals(App.af() + z[32])) {
            c = new mf();
        }
        return c;
    }

    public void k() {
        this.a.c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(java.util.Collection r8) {
        /*
        r7_this = this;
        r1 = com.whatsapp.m3.d;
        r0 = z;
        r2 = 29;
        r0 = r0[r2];
        r2 = z;
        r3 = 28;
        r2 = r2[r3];
        com.whatsapp.m8.a(r8, r0, r2);
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.iterator();
    L_0x001a:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0075;
    L_0x0020:
        r0 = r3.next();
        r0 = (com.whatsapp.m8) r0;
        if (r0 == 0) goto L_0x0073;
    L_0x0028:
        r4 = r0.e;
        if (r4 == 0) goto L_0x003a;
    L_0x002c:
        r4 = r0.e;
        r5 = z;
        r6 = 27;
        r5 = r5[r6];
        r4 = r4.equals(r5);
        if (r4 != 0) goto L_0x001a;
    L_0x003a:
        r4 = r0.w();
        if (r4 == 0) goto L_0x0042;
    L_0x0040:
        if (r1 == 0) goto L_0x001a;
    L_0x0042:
        r4 = r0.q;
        if (r4 == 0) goto L_0x0070;
    L_0x0046:
        r4 = r7.a;
        r4 = r4.d(r0);
        if (r4 != 0) goto L_0x0070;
    L_0x004e:
        r4 = r0.e;
        r4 = com.whatsapp.v.d(r4);
        if (r4 != 0) goto L_0x0060;
    L_0x0056:
        r4 = com.whatsapp.App.aJ;
        r5 = r0.e;
        r4 = r4.t(r5);
        if (r4 == 0) goto L_0x006b;
    L_0x0060:
        r4 = r0.h;
        if (r4 == 0) goto L_0x0073;
    L_0x0064:
        r4 = r7.a;
        r4.f(r0);
        if (r1 == 0) goto L_0x0073;
    L_0x006b:
        r2.add(r0);
        if (r1 == 0) goto L_0x0073;
    L_0x0070:
        r2.add(r0);
    L_0x0073:
        if (r1 == 0) goto L_0x001a;
    L_0x0075:
        r0 = r2.size();
        if (r0 <= 0) goto L_0x007e;
    L_0x007b:
        r7.a(r2);
    L_0x007e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ok.e(java.util.Collection):void");
    }

    public ArrayList i() {
        return this.a.b();
    }

    public m8 a(String str) {
        m8 d = d(str);
        if (d != null) {
            return d;
        }
        d = new m8(str);
        this.a.g(d);
        return d;
    }

    public ArrayList f() {
        return this.a.g();
    }

    public ArrayList e(String str) {
        return this.a.b(str);
    }

    public void d(m8 m8Var) {
        j a = e.a(m8Var.a(App.p));
        if (a != null && !TextUtils.isEmpty(a.a())) {
            m8Var.h = new g9(a.e(), a.a());
            m8Var.v = Integer.valueOf(a.b());
            m8Var.s = a.f();
            m8Var.n = a.d();
            if (!TextUtils.isEmpty(a.g())) {
                m8Var.N = a.g();
            }
            if (!i.a()) {
                Log.w(z[33]);
            }
            this.a.e(m8Var);
            new zr(this, m8Var).start();
        }
    }

    public void i(String str) {
        j a = e.a(str);
        if (a != null && !TextUtils.isEmpty(a.a())) {
            m8 m8Var = new m8(a);
            if (!i.a()) {
                Log.w(z[30]);
            }
            new xc(this, m8Var).start();
        }
    }

    static {
        String[] strArr = new String[34];
        String str = "pRv\u001f\u001eiY";
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
                        i3 = 6;
                        break;
                    case ay.f /*1*/:
                        i3 = 55;
                        break;
                    case ay.n /*2*/:
                        i3 = 4;
                        break;
                    case ay.p /*3*/:
                        i3 = 108;
                        break;
                    default:
                        i3 = 119;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "FD*\u001b\u001fgCw\r\u0007v\u0019j\t\u0003";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "bVp\rD";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "tVs3\u0014iYp\r\u0014rhm\b";
                    obj = 3;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "eXj\u0018\u0016eCi\r\u0019gPa\u001eXsG`\r\u0003chl\u0003\u001bbXq\u0018(eXj\u0018\u0016eC[\r\u0019bEk\u0005\u0013Y^j\n\u0018<\u0017!\u001f";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    str = "oY[\u001a\u001eu^f\u0000\u0012YPv\u0003\u0002v";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "b^w\u001c\u001bgN[\u0002\u0016kR";
                    obj = 6;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "bVp\rD";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "Y^`";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "bVp\rE";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "eXj\u0018\u0016eC[\u0005\u0013;\b";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "tVs3\u0014iYp\r\u0014rhm\b";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "uXv\u0018(mR}";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "bVp\rE";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "sG`\r\u0003c\u007fk\u0000\u0013IBp/\u0018hCe\u000f\u0003)Pa\u0018(hBh\u0000(qVg\u0003\u0019rVg\u0018";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "eXj\u0018\u0016eC[\u0005\u0013;\b";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "bVp\rF";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "bVp\rF";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "b^w\u001c\u001bgNj\r\u001ac";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "gY`\u001e\u0018oS*\u0005\u0019rRj\u0018YcOp\u001e\u0016(Dl\u0003\u0005rTq\u0018YOtK\"";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "l^`";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "gY`\u001e\u0018oS*\u0005\u0019rRj\u0018YcOp\u001e\u0016(Dl\u0003\u0005rTq\u0018YHvI)";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "gY`\u001e\u0018oS*\u0005\u0019rRj\u0018YcOp\u001e\u0016(Dl\u0003\u0005rTq\u0018YOyP)9R";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "bBt\u0000\u001eeVp\t";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "gY`\u001e\u0018oS*\u0005\u0019rRj\u0018YgTp\u0005\u0018h\u0019I->H";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "oY`\u0005\u0001eXq\u0002\u0003)Tk\u0019\u0019r\u0017";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "URv\u001a\u0012twwB\u0000nVp\u001f\u0016vG*\u0002\u0012r";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "bRh";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "bUm\u0002\u0011i\u0018i\r\u0019gPa\u001eXbRh\t\u0003ctk\u0002\u0003gTp\u001f";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "eXj\u0018\u0016eCi\r\u0019gPa\u001eXe_a\u000f\u001cYVj\b(gS`3\u0014iYp\r\u0014r\u0018w\u0015\u0019ehe\u0000\u0005cV`\u0015(oY[\u001c\u0005iPv\t\u0004u";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "eXiB\u0016hSv\u0003\u001eb\u0019h\r\u0002hTl\t\u0005(Vg\u0018\u001eiY*99OyW86J{[??IeP/\"R";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "FD*\u001b\u001fgCw\r\u0007v\u0019j\t\u0003";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "eXj\u0018\u0016eCi\r\u0019gPa\u001eXsG`\r\u0003chl\u0003\u001bbhk\u0019\u0003YTk\u0002\u0003gTpC\u0004\u007fYg3\u0016jEa\r\u0013\u007fhm\u0002(vEk\u000b\u0005cDw";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = Collections.synchronizedMap(new HashMap());
                default:
                    strArr2[i] = str;
                    str = "eXiB\u0016hSv\u0003\u001eb\u0019h\r\u0002hTl\t\u0005(Vg\u0018\u001eiY*%9UcE ;YdL#%RtQ8";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
