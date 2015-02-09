package com.whatsapp;

import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.contact.ContactProvider;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class x5 {
    public static final String a;
    private static final String[] z;
    private atc b;

    public void m(m8 m8Var) {
        try {
            if (m8Var.N != null) {
                long currentTimeMillis = System.currentTimeMillis();
                ContentValues contentValues = new ContentValues(6);
                contentValues.put(m8.w, m8Var.N);
                contentValues.put(m8.I, m8Var.v);
                contentValues.put(m8.z, m8Var.s);
                contentValues.put(m8.L, m8Var.Q);
                contentValues.put(m8.f, m8Var.F);
                contentValues.put(m8.u, m8Var.n);
                String str = a + z[56] + m8.J + z[59];
                try {
                    this.b.a(ContactProvider.e, contentValues, str, new String[]{m8Var.e, String.valueOf(m8Var.h.a)});
                } catch (IllegalArgumentException e) {
                    Log.e(z[57] + m8Var + ' ' + e);
                }
                Log.a(z[58], null, new Object[]{m8Var, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public x5(Context context) {
        ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(ContactProvider.e);
        if (acquireContentProviderClient != null) {
            try {
                this.b = new mc(acquireContentProviderClient, null);
                if (m3.d == 0) {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        Log.e(z[50] + ContactProvider.e);
        ContentProvider contactProvider = new ContactProvider();
        contactProvider.attachInfo(context, null);
        this.b = new f(contactProvider);
    }

    public ArrayList j(m8 m8Var) {
        int i = m3.d;
        try {
            if (m8Var != null) {
                try {
                    if (m8Var.h != null) {
                        if (m8Var.e != null) {
                            if (m8Var.N != null) {
                                long currentTimeMillis = System.currentTimeMillis();
                                String str = m8.j + z[12] + m8.w + z[9] + m8.J + z[11];
                                ArrayList arrayList = new ArrayList();
                                Cursor a = this.b.a(ContactProvider.e, new String[]{m8.J}, str, new String[]{m8Var.e, m8Var.N, String.valueOf(m8Var.h.a)}, m8.J + z[14]);
                                if (a == null) {
                                    try {
                                        Log.e(z[13] + m8Var);
                                        return arrayList;
                                    } catch (IllegalArgumentException e) {
                                        throw e;
                                    }
                                }
                                while (a.moveToNext()) {
                                    arrayList.add(Long.valueOf(a.getLong(0)));
                                    if (i != 0) {
                                        break;
                                    }
                                }
                                a.close();
                                Log.a(z[10], null, new Object[]{Integer.valueOf(arrayList.size()), m8Var, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
                                return arrayList;
                            }
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            }
            return new ArrayList();
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public void b(ArrayList arrayList) {
        a(arrayList, e4.CALL);
    }

    public ArrayList a() {
        int i = m3.d;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Cursor a = this.b.a(ContactProvider.e, m8.K, m8.D + z[70] + m8.J + z[67] + m8.J + z[68] + m8.j + z[73], new String[]{App.af() + z[74]}, null);
        if (a == null) {
            try {
                Log.e(z[72]);
                return arrayList;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            arrayList.add(m8.b(a));
            if (i != 0) {
                break;
            }
        }
        a.close();
        Log.i(z[69] + arrayList.size() + z[71] + (System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.Collection r13, java.util.Map r14) {
        /*
        r12_this = this;
        r7 = com.whatsapp.m3.d;
        r8 = java.lang.System.currentTimeMillis();
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r0 = com.whatsapp.m8.j;
        r0 = r3.append(r0);
        r1 = z;
        r2 = 60;
        r1 = r1[r2];
        r0.append(r1);
        r1 = r13.iterator();
    L_0x001e:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0034;
    L_0x0024:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        android.database.DatabaseUtils.appendEscapedSQLString(r3, r0);
        r0 = 44;
        r3.append(r0);
        if (r7 == 0) goto L_0x001e;
    L_0x0034:
        r0 = r3.length();
        r0 = r0 + -1;
        r1 = r3.length();
        r2 = ")";
        r3.replace(r0, r1, r2);
        r6 = 0;
        r0 = r12.b;
        r1 = com.whatsapp.contact.ContactProvider.e;
        r2 = com.whatsapp.m8.K;
        r3 = r3.toString();
        r4 = 0;
        r5 = 0;
        r2 = r0.a(r1, r2, r3, r4, r5);
        if (r2 != 0) goto L_0x0100;
    L_0x0056:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0071 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0071 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0071 }
        r2 = 62;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0071 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0071 }
        r0 = r0.append(r13);	 Catch:{ IllegalArgumentException -> 0x0071 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x0071 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x0071 }
    L_0x0070:
        return;
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r1 = r0;
    L_0x0074:
        r0 = r2.moveToNext();
        if (r0 == 0) goto L_0x00fe;
    L_0x007a:
        r3 = com.whatsapp.m8.b(r2);
        r0 = r3.e;
        r0 = r14.get(r0);
        r0 = (com.whatsapp.m8) r0;
        if (r0 == 0) goto L_0x00aa;
    L_0x0088:
        r4 = r0.h;	 Catch:{ IllegalArgumentException -> 0x00ee }
        if (r4 != 0) goto L_0x0090;
    L_0x008c:
        r4 = r3.h;	 Catch:{ IllegalArgumentException -> 0x00f0 }
        if (r4 != 0) goto L_0x00aa;
    L_0x0090:
        r4 = r0.h;	 Catch:{ IllegalArgumentException -> 0x00f2 }
        if (r4 == 0) goto L_0x00a2;
    L_0x0094:
        r4 = r3.h;	 Catch:{ IllegalArgumentException -> 0x00f4 }
        if (r4 == 0) goto L_0x00a2;
    L_0x0098:
        r4 = r0.h;	 Catch:{ IllegalArgumentException -> 0x00f6 }
        r4 = r4.a;	 Catch:{ IllegalArgumentException -> 0x00f6 }
        r10 = -2;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x00aa;
    L_0x00a2:
        r4 = r3.q;	 Catch:{ IllegalArgumentException -> 0x00f8 }
        if (r4 == 0) goto L_0x00fc;
    L_0x00a6:
        r0 = r0.q;	 Catch:{ IllegalArgumentException -> 0x00fa }
        if (r0 != 0) goto L_0x00fc;
    L_0x00aa:
        r0 = r3.e;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r14.put(r0, r3);	 Catch:{ IllegalArgumentException -> 0x00fa }
        r1 = r1 + 1;
        r0 = r1;
    L_0x00b2:
        if (r7 == 0) goto L_0x0073;
    L_0x00b4:
        r2.close();
        r1 = z;
        r2 = 61;
        r1 = r1[r2];
        r2 = 0;
        r3 = 4;
        r3 = new java.lang.Object[r3];
        r4 = 0;
        r0 = java.lang.Integer.valueOf(r0);
        r3[r4] = r0;
        r0 = 1;
        r4 = r14.size();
        r4 = java.lang.Integer.valueOf(r4);
        r3[r0] = r4;
        r0 = 2;
        r4 = r13.size();
        r4 = java.lang.Integer.valueOf(r4);
        r3[r0] = r4;
        r0 = 3;
        r4 = java.lang.System.currentTimeMillis();
        r4 = r4 - r8;
        r4 = java.lang.Long.valueOf(r4);
        r3[r0] = r4;
        com.whatsapp.util.Log.a(r1, r2, r3);
        goto L_0x0070;
    L_0x00ee:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f0 }
    L_0x00f0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f2 }
    L_0x00f2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f4 }
    L_0x00f4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f6 }
    L_0x00f6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f8 }
    L_0x00f8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00fa }
    L_0x00fa:
        r0 = move-exception;
        throw r0;
    L_0x00fc:
        r0 = r1;
        goto L_0x00b2;
    L_0x00fe:
        r0 = r1;
        goto L_0x00b4;
    L_0x0100:
        r1 = r6;
        goto L_0x0074;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.x5.a(java.util.Collection, java.util.Map):void");
    }

    public void c() {
        try {
            this.b.a(ContactProvider.f, null, null);
        } catch (IllegalArgumentException e) {
            Log.e(z[110] + e);
        }
    }

    public void l(m8 m8Var) {
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put(m8.x, m8Var.t);
        a(contentValues, m8Var.e);
        Log.a(z[40], null, new Object[]{m8Var.e, contentValues, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
    }

    private static ContentProviderOperation i(m8 m8Var) {
        return ContentProviderOperation.newDelete(ContactProvider.e).withSelection(m8.l + z[63], new String[]{String.valueOf(m8Var.y)}).build();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.ArrayList r14, com.whatsapp.e4 r15) {
        /*
        r13_this = this;
        r6 = com.whatsapp.m3.d;
        r8 = java.lang.System.currentTimeMillis();
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r0 = com.whatsapp.m8.D;	 Catch:{ IllegalArgumentException -> 0x00eb }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00eb }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00eb }
        r1 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00eb }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00eb }
        r0 = com.whatsapp.m8.j;	 Catch:{ IllegalArgumentException -> 0x00eb }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00eb }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00eb }
        r1 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00eb }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00eb }
        r0 = com.whatsapp.e4.BROADCAST;	 Catch:{ IllegalArgumentException -> 0x00eb }
        if (r15 != r0) goto L_0x005c;
    L_0x002b:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00eb }
        r1 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00eb }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00eb }
        r0 = com.whatsapp.m8.J;	 Catch:{ IllegalArgumentException -> 0x00eb }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00eb }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00eb }
        r1 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00eb }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00eb }
        r0 = com.whatsapp.m8.J;	 Catch:{ IllegalArgumentException -> 0x00eb }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00eb }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00eb }
        r1 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00eb }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00eb }
        r0 = -2;
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00eb }
        r0 = 41;
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00eb }
        if (r6 == 0) goto L_0x0077;
    L_0x005c:
        r0 = com.whatsapp.e4.CALL;	 Catch:{ IllegalArgumentException -> 0x00ed }
        if (r15 != r0) goto L_0x0077;
    L_0x0060:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00ef }
        r1 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00ef }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00ef }
        r0 = com.whatsapp.m8.o;	 Catch:{ IllegalArgumentException -> 0x00ef }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00ef }
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00ef }
        r1 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00ef }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x00ef }
    L_0x0077:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = com.whatsapp.m8.w;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = com.whatsapp.m8.j;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = com.whatsapp.m8.I;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r5 = r0.toString();
        r0 = r13.b;
        r1 = com.whatsapp.contact.ContactProvider.e;
        r2 = com.whatsapp.m8.K;
        r3 = r3.toString();
        r4 = 1;
        r4 = new java.lang.String[r4];
        r7 = 0;
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r11 = com.whatsapp.App.af();
        r10 = r10.append(r11);
        r11 = z;
        r12 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r11 = r11[r12];
        r10 = r10.append(r11);
        r10 = r10.toString();
        r4[r7] = r10;
        r1 = r0.a(r1, r2, r3, r4, r5);
        if (r1 != 0) goto L_0x00f3;
    L_0x00e1:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x00f1 }
        r1 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00f1 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x00f1 }
    L_0x00ea:
        return;
    L_0x00eb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ed }
    L_0x00ed:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ef }
    L_0x00ef:
        r0 = move-exception;
        throw r0;
    L_0x00f1:
        r0 = move-exception;
        throw r0;
    L_0x00f3:
        r2 = new java.util.ArrayList;
        r2.<init>();
    L_0x00f8:
        r0 = r1.moveToNext();
        if (r0 == 0) goto L_0x021f;
    L_0x00fe:
        r3 = com.whatsapp.m8.b(r1);
        r0 = r3.e;	 Catch:{ IllegalArgumentException -> 0x025e }
        r0 = com.whatsapp.m8.f(r0);	 Catch:{ IllegalArgumentException -> 0x025e }
        if (r0 == 0) goto L_0x010c;
    L_0x010a:
        if (r6 == 0) goto L_0x00f8;
    L_0x010c:
        r0 = com.whatsapp.e4.CALL;	 Catch:{ IllegalArgumentException -> 0x0260 }
        if (r15 != r0) goto L_0x011c;
    L_0x0110:
        r0 = com.whatsapp.ge.l;	 Catch:{ IllegalArgumentException -> 0x0260 }
        r4 = r3.e;	 Catch:{ IllegalArgumentException -> 0x0260 }
        r0 = r0.a(r4);	 Catch:{ IllegalArgumentException -> 0x0260 }
        if (r0 != 0) goto L_0x011c;
    L_0x011a:
        if (r6 == 0) goto L_0x00f8;
    L_0x011c:
        r0 = r14.isEmpty();	 Catch:{ IllegalArgumentException -> 0x0264 }
        if (r0 == 0) goto L_0x0127;
    L_0x0122:
        r14.add(r3);	 Catch:{ IllegalArgumentException -> 0x0264 }
        if (r6 == 0) goto L_0x00f8;
    L_0x0127:
        r0 = r14.size();
        r0 = r0 + -1;
        r0 = r14.get(r0);
        r0 = (com.whatsapp.m8) r0;
        r4 = r3.h;	 Catch:{ IllegalArgumentException -> 0x0266 }
        if (r4 == 0) goto L_0x0153;
    L_0x0137:
        r4 = r0.N;	 Catch:{ IllegalArgumentException -> 0x0266 }
        if (r4 == 0) goto L_0x0153;
    L_0x013b:
        r4 = r0.N;	 Catch:{ IllegalArgumentException -> 0x0268 }
        r5 = r3.N;	 Catch:{ IllegalArgumentException -> 0x0268 }
        r4 = r4.equalsIgnoreCase(r5);	 Catch:{ IllegalArgumentException -> 0x0268 }
        if (r4 == 0) goto L_0x0153;
    L_0x0145:
        r4 = r0.e;	 Catch:{ IllegalArgumentException -> 0x026a }
        if (r4 == 0) goto L_0x0153;
    L_0x0149:
        r4 = r0.e;	 Catch:{ IllegalArgumentException -> 0x026c }
        r5 = r3.e;	 Catch:{ IllegalArgumentException -> 0x026c }
        r4 = r4.equals(r5);	 Catch:{ IllegalArgumentException -> 0x026c }
        if (r4 != 0) goto L_0x0158;
    L_0x0153:
        r14.add(r3);	 Catch:{ IllegalArgumentException -> 0x026e }
        if (r6 == 0) goto L_0x00f8;
    L_0x0158:
        r4 = r0.h;	 Catch:{ IllegalArgumentException -> 0x0270 }
        if (r4 != 0) goto L_0x0181;
    L_0x015c:
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0270 }
        r5 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0270 }
        r5 = 0;
        r7 = 1;
        r7 = new java.lang.Object[r7];	 Catch:{ IllegalArgumentException -> 0x0270 }
        r10 = 0;
        r7[r10] = r0;	 Catch:{ IllegalArgumentException -> 0x0270 }
        com.whatsapp.util.Log.a(r4, r5, r7);	 Catch:{ IllegalArgumentException -> 0x0270 }
        r4 = r14.size();	 Catch:{ IllegalArgumentException -> 0x0270 }
        r4 = r4 + -1;
        r14.remove(r4);	 Catch:{ IllegalArgumentException -> 0x0270 }
        r14.add(r3);	 Catch:{ IllegalArgumentException -> 0x0270 }
        r4 = i(r0);	 Catch:{ IllegalArgumentException -> 0x0270 }
        r2.add(r4);	 Catch:{ IllegalArgumentException -> 0x0270 }
        if (r6 == 0) goto L_0x00f8;
    L_0x0181:
        r4 = r3.h;	 Catch:{ IllegalArgumentException -> 0x0272 }
        r5 = r0.h;	 Catch:{ IllegalArgumentException -> 0x0272 }
        r4 = r4.equals(r5);	 Catch:{ IllegalArgumentException -> 0x0272 }
        if (r4 == 0) goto L_0x01a4;
    L_0x018b:
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0272 }
        r5 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0272 }
        r5 = 0;
        r7 = 1;
        r7 = new java.lang.Object[r7];	 Catch:{ IllegalArgumentException -> 0x0272 }
        r10 = 0;
        r7[r10] = r3;	 Catch:{ IllegalArgumentException -> 0x0272 }
        com.whatsapp.util.Log.a(r4, r5, r7);	 Catch:{ IllegalArgumentException -> 0x0272 }
        r4 = i(r3);	 Catch:{ IllegalArgumentException -> 0x0272 }
        r2.add(r4);	 Catch:{ IllegalArgumentException -> 0x0272 }
        if (r6 == 0) goto L_0x00f8;
    L_0x01a4:
        r4 = r3.h;	 Catch:{ IllegalArgumentException -> 0x0274 }
        r4 = r4.a;	 Catch:{ IllegalArgumentException -> 0x0274 }
        r10 = -2;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x01dd;
    L_0x01ae:
        r4 = r0.h;	 Catch:{ IllegalArgumentException -> 0x0274 }
        r4 = r4.a;	 Catch:{ IllegalArgumentException -> 0x0274 }
        r10 = -2;
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 != 0) goto L_0x01dd;
    L_0x01b8:
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0276 }
        r5 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0276 }
        r5 = 0;
        r7 = 1;
        r7 = new java.lang.Object[r7];	 Catch:{ IllegalArgumentException -> 0x0276 }
        r10 = 0;
        r7[r10] = r0;	 Catch:{ IllegalArgumentException -> 0x0276 }
        com.whatsapp.util.Log.a(r4, r5, r7);	 Catch:{ IllegalArgumentException -> 0x0276 }
        r4 = r14.size();	 Catch:{ IllegalArgumentException -> 0x0276 }
        r4 = r4 + -1;
        r14.remove(r4);	 Catch:{ IllegalArgumentException -> 0x0276 }
        r14.add(r3);	 Catch:{ IllegalArgumentException -> 0x0276 }
        r4 = i(r0);	 Catch:{ IllegalArgumentException -> 0x0276 }
        r2.add(r4);	 Catch:{ IllegalArgumentException -> 0x0276 }
        if (r6 == 0) goto L_0x00f8;
    L_0x01dd:
        r4 = r3.y;	 Catch:{ IllegalArgumentException -> 0x0278 }
        r10 = r0.y;	 Catch:{ IllegalArgumentException -> 0x0278 }
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 >= 0) goto L_0x020a;
    L_0x01e5:
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0278 }
        r5 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0278 }
        r5 = 0;
        r7 = 1;
        r7 = new java.lang.Object[r7];	 Catch:{ IllegalArgumentException -> 0x0278 }
        r10 = 0;
        r7[r10] = r0;	 Catch:{ IllegalArgumentException -> 0x0278 }
        com.whatsapp.util.Log.a(r4, r5, r7);	 Catch:{ IllegalArgumentException -> 0x0278 }
        r4 = r14.size();	 Catch:{ IllegalArgumentException -> 0x0278 }
        r4 = r4 + -1;
        r14.remove(r4);	 Catch:{ IllegalArgumentException -> 0x0278 }
        r14.add(r3);	 Catch:{ IllegalArgumentException -> 0x0278 }
        r4 = i(r0);	 Catch:{ IllegalArgumentException -> 0x0278 }
        r2.add(r4);	 Catch:{ IllegalArgumentException -> 0x0278 }
        if (r6 == 0) goto L_0x00f8;
    L_0x020a:
        r4 = z;
        r5 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r4 = r4[r5];
        r5 = 0;
        r7 = 2;
        r7 = new java.lang.Object[r7];
        r10 = 0;
        r7[r10] = r0;
        r0 = 1;
        r7[r0] = r3;
        com.whatsapp.util.Log.c(r4, r5, r7);
        if (r6 == 0) goto L_0x00f8;
    L_0x021f:
        r1.close();
        r0 = r13.b;	 Catch:{ IllegalArgumentException -> 0x027a, RemoteException -> 0x0296, OperationApplicationException -> 0x029d }
        r0.a(r2);	 Catch:{ IllegalArgumentException -> 0x027a, RemoteException -> 0x0296, OperationApplicationException -> 0x029d }
    L_0x0227:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r14.size();
        r0 = r0.append(r1);
        r1 = z;
        r2 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r15);
        r1 = z;
        r2 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r2 = java.lang.System.currentTimeMillis();
        r2 = r2 - r8;
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x00ea;
    L_0x025e:
        r0 = move-exception;
        throw r0;
    L_0x0260:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0262 }
    L_0x0262:
        r0 = move-exception;
        throw r0;
    L_0x0264:
        r0 = move-exception;
        throw r0;
    L_0x0266:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0268 }
    L_0x0268:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x026a }
    L_0x026a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x026c }
    L_0x026c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x026e }
    L_0x026e:
        r0 = move-exception;
        throw r0;
    L_0x0270:
        r0 = move-exception;
        throw r0;
    L_0x0272:
        r0 = move-exception;
        throw r0;
    L_0x0274:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0276 }
    L_0x0276:
        r0 = move-exception;
        throw r0;
    L_0x0278:
        r0 = move-exception;
        throw r0;
    L_0x027a:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0227;
    L_0x0296:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x029d:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.x5.a(java.util.ArrayList, com.whatsapp.e4):void");
    }

    public void b(m8 m8Var) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (m8Var.e == null) {
                Log.w(z[99]);
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(m8.j, m8Var.e);
            contentValues.put(m8.D, Boolean.valueOf(true));
            contentValues.put(m8.g, m8Var.b);
            contentValues.put(m8.m, Long.valueOf(m8Var.c));
            contentValues.put(m8.w, m8Var.N);
            contentValues.put(m8.z, m8Var.s);
            contentValues.put(m8.H, Integer.valueOf(m8Var.a));
            try {
                m8Var.y = ContentUris.parseId(this.b.a(ContactProvider.e, contentValues));
            } catch (IllegalArgumentException e) {
                Log.e(z[97] + m8Var + ' ' + e);
            }
            Log.a(z[98], null, new Object[]{m8Var, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public m8 a(g9 g9Var) {
        long currentTimeMillis = System.currentTimeMillis();
        String str = m8.J + z[6] + m8.p + z[5];
        Cursor a = this.b.a(ContactProvider.e, m8.K, str, new String[]{String.valueOf(g9Var.a), g9Var.b}, null);
        if (a == null) {
            try {
                Log.e(z[7] + g9Var);
                return null;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        m8 b;
        if (a.moveToNext()) {
            b = m8.b(a);
        } else {
            b = null;
        }
        int count = a.getCount();
        a.close();
        Log.a(z[8], null, new Object[]{Integer.valueOf(count), g9Var, b, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
        return b;
    }

    public ArrayList a(String str) {
        int i = m3.d;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Cursor a = this.b.a(ContactProvider.e, m8.K, m8.j + z[47] + str + z[48], null, null);
        if (a == null) {
            try {
                Log.e(z[49] + str);
                return arrayList;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            arrayList.add(m8.b(a));
            if (i != 0) {
                break;
            }
        }
        a.close();
        Log.a(z[46], null, new Object[]{Integer.valueOf(arrayList.size()), str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
        return arrayList;
    }

    public void c(ArrayList arrayList) {
        a(arrayList, e4.BROADCAST);
    }

    public Map e() {
        int i = m3.d;
        long currentTimeMillis = System.currentTimeMillis();
        Map hashMap = new HashMap();
        Cursor a = this.b.a(ContactProvider.e, m8.K, null, null, null);
        if (a == null) {
            try {
                Log.e(z[104]);
                return hashMap;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            m8 b = m8.b(a);
            try {
                if (b.h != null) {
                    if (TextUtils.isEmpty(b.h.b)) {
                        continue;
                    } else {
                        hashMap.put(b.h.b, b);
                        continue;
                    }
                }
                if (i != 0) {
                    break;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        a.close();
        Log.a(z[103], null, new Object[]{Integer.valueOf(hashMap.size()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
        return hashMap;
    }

    public m8 a(Uri uri) {
        m8 m8Var = null;
        long currentTimeMillis = System.currentTimeMillis();
        Cursor a = this.b.a(uri, m8.K, null, null, null);
        if (a == null) {
            try {
                Log.e(z[91] + uri);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        if (a.moveToNext()) {
            m8Var = m8.b(a);
        }
        int count = a.getCount();
        a.close();
        Log.i(z[89] + count + z[88] + uri + ' ' + m8Var + z[90] + (System.currentTimeMillis() - currentTimeMillis));
        return m8Var;
    }

    public void g(m8 m8Var) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (m8Var.e == null) {
                Log.w(z[53]);
                return;
            }
            String af = App.af();
            if (af == null) {
                try {
                    Log.w(z[55]);
                    return;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            try {
                if (m8Var.w() || !m8Var.e.startsWith(af)) {
                    ContentValues contentValues = new ContentValues(3);
                    contentValues.put(m8.j, m8Var.e);
                    contentValues.put(m8.D, Boolean.valueOf(true));
                    contentValues.put(m8.g, m8Var.b);
                    contentValues.put(m8.m, Long.valueOf(m8Var.c));
                    try {
                        m8Var.y = ContentUris.parseId(this.b.a(ContactProvider.e, contentValues));
                    } catch (IllegalArgumentException e2) {
                        Log.e(z[51] + m8Var + ' ' + e2);
                    }
                    Log.a(z[54], null, new Object[]{m8Var, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
                    return;
                }
                Log.i(z[52]);
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    public void a(Collection collection) {
        Throwable e;
        int i = m3.d;
        try {
            if (collection.isEmpty()) {
                Log.i(z[75]);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList(collection.size());
            for (Pair pair : collection) {
                try {
                    if (TextUtils.isEmpty((CharSequence) pair.first)) {
                        Log.i(z[77]);
                        if (i == 0) {
                            continue;
                        }
                    }
                    try {
                        Object text;
                        if (pair.second == null) {
                            text = ar.getDefault().getText();
                        } else {
                            text = ((ar) pair.second).getText();
                        }
                        arrayList.add(ContentProviderOperation.newUpdate(ContactProvider.e).withValue(m8.o, text).withSelection(m8.j + z[79], new String[]{(String) pair.first}).build());
                    } catch (RemoteException e2) {
                        throw e2;
                    }
                    if (i == 0) {
                    }
                } catch (RemoteException e22) {
                    throw e22;
                }
            }
            try {
                break;
                this.b.a(arrayList);
                Log.i(z[78] + collection.size() + z[76] + (System.currentTimeMillis() - currentTimeMillis));
            } catch (RemoteException e3) {
                e = e3;
                throw new RuntimeException(e);
            } catch (OperationApplicationException e4) {
                e = e4;
                throw new RuntimeException(e);
            }
        } catch (RemoteException e222) {
            throw e222;
        }
    }

    public void e(ArrayList arrayList) {
        int i = m3.d;
        long currentTimeMillis = System.currentTimeMillis();
        int size = arrayList.size();
        Cursor a = this.b.a(ContactProvider.e, m8.K, m8.j + z[94], null, null);
        if (a == null) {
            try {
                Log.e(z[92]);
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            arrayList.add(m8.b(a));
            if (i != 0) {
                break;
            }
        }
        a.close();
        Log.a(z[93], null, new Object[]{Integer.valueOf(arrayList.size() - size), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
    }

    static {
        String[] strArr = new String[153];
        String str = "KJo\u007fa[\u0004zr-ZAbxy[\u0004mrcJEmi~\u001e";
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
                        i3 = 62;
                        break;
                    case ay.f /*1*/:
                        i3 = 36;
                        break;
                    case ay.n /*2*/:
                        i3 = 14;
                        break;
                    case ay.p /*3*/:
                        i3 = 29;
                        break;
                    default:
                        i3 = 13;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "ZAbxy[@.~bPPo~yM\u0004r=yWIk'-\u001b@";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "ZF.tcWPg|aW^oidQJ.ihMP. -\u001bF.a-JMcx7\u001e\u0001j";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "KJo\u007fa[\u0004zr-_G\u007fhdLA.~xLWao-XK|=xPO`rzP\u0004|xlMK`";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u001e\u0019.\"";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001e\u0019.\"-\u007fjJ=";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "KJo\u007fa[\u0004zr-YAz=nQJz|nJ\u0004ld-UAw=";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "XAz~e[@.8i\u001eGasy_Gzn-\\].vhG\u0019+n-\u001bW.a-JMcx7\u001e\u0001j";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001e\u0019.\"-\u007fjJ=";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "XK{si\u001e\u0001j=~WIgqlL\u0004mrcJEmi~\u001ePa=(M\u0004r=yWIk'-\u001b@";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u001e\u00053=2";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u001e\u0019.\"-\u007fjJ=";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    str = "KJo\u007fa[\u0004zr-YAz=dZW.rk\u001eWgpdRE|=nQJz|nJW.";
                    obj = 12;
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    str = "\u001ee]^";
                    i = 14;
                    strArr2 = strArr3;
                    obj = 13;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    strArr2 = strArr3;
                    str = "\u001ek\\=%\u001e";
                    obj = 14;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0016\u0004";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u001em]=Cqp.SXrh.4-\u0017\u0004OSI\u001e";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u001em]=Cqp.SXrh.\\Cz\u0004";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u001ee@Y-";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "LEyBnQJz|nJ{gy";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0012\u0004";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u001ee]^";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "KJo\u007fa[\u0004zr-YAz=nQJz|nJ\u0004~tnUA|=aWWz";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u001e\u0019.";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u001e\u0019.";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u001e\u0019.--\u007fjJ=";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "~W je_P}|}N\n`xy";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u001b@.~bPPo~yM\u0004}xa[Gzxi\u001eBao-WJxty[\u0004r=yWIk'-\u001b@";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    str = "\u001em]=Cqp.SXrh.\\Cz\u0004";
                    obj = 28;
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    strArr2 = strArr3;
                    str = "\u0012\u0004";
                    obj = 29;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "RE}iRJMcxR]K`il]Pky-\u0000\u00041";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "RE}iRJMcxR]K`il]Pky-za]^-rmCTY\u001e\u0015>-";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u001e\u00053=2";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u0012\u0004";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "KTj|y[@.~bPPo~y\u001eWz|yKW.wdZ\u0019+n-\u001bW.a-JMcx7\u001e\u0001j";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    str = "KJo\u007fa[\u0004zr-KTj|y[\u0004mrcJEmi-MPoixM\u0004";
                    obj = 35;
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    strArr2 = strArr3;
                    str = "VE}=iKTbtn_Pk=nVAmv-XEgqhZ\u0004";
                    obj = 36;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "XEgqhZ\u0004jh\u007fWJi=iKTbtn_Pk=nQJz|nJ\u0004jxy[GztbP\u0004hr\u007f\u001eNgy-\u0016\u0001}4-B\u0004zt`[\u001e.8i";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u001b@.yxNHg~lJA.~bPPo~yM\u0004jxy[Gzxi\u001eSgie\u001eNgy-\u0016\u0001}4-B\u0004zt`[\u001e.8i";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "KTj|y[@.je_P}|}N\u0004`|`[\u0004hr\u007f\u001eGasy_Gz=gW@38~\u001e\u0001}=q\u001ePgph\u0004\u0004+y";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "KTj|y[@.meQPa=dZ\u0004hr\u007f\u001eGasy_Gz=gW@38~\u001e\u0001}=q\u001ePgph\u0004\u0004+y";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "KJo\u007fa[\u0004zr-KTj|y[\u0004fraZK{i-]K`il]P.|cZVati\u001eM`{b\u001e";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "]K`khLWoidQJ}2lZ@ky-]K`il]P4=(M";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "KTj|y[@.ubR@ahy\u001eGasy_Gz=lP@|rdZ\u0004gskQ\u0004|x~KHz (\\\u0004+n-B\u0004zt`[\u001e.8i";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "KTj|y[@.ihST.z\u007fQQ~=~KFdxnJ\u0019+n-]Vk|yWK`IdSA38~\u001eKbyGW@38~\u001eJkjGW@38~\u001eX.idSA4=(Z";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "XAz~e[@.8i\u001eGasy_Gzn-\\].meQJk=cKIlx\u007f\u001e\u0001}=q\u001ePgph\u0004\u0004+y";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u001ehGVH\u001e\u0003+";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u001b\u0003";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "KJo\u007fa[\u0004zr-YAz=nQJz|nJW.\u007ft\u001eTfrc[\u0004`h`\\A|=";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "KJo\u007fa[\u0004zr-XM`y-]K`il]P.m\u007fQRgyhL\u0004mqd[Jz=oG\u0004{od\u001e";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "KJo\u007fa[\u0004zr-_@j=xPO`rzP\u0004mrcJEmi-";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "KJo\u007fa[\u0004zr-_@j=xPO`rzP\u0004mrcJEmi-ZQk=yQ\u0004c|y]Lgsj\u001eNgy-NVk{dF";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "KJo\u007fa[\u0004zr-_@j=xPO`rzP\u0004mrcJEmi-IMzu-PQbq-TMj";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "KJesbIJ.~bPPo~y\u001eEjyhZ\u001e.8~\u001eX.idSA4=(Z";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "KJo\u007fa[\u0004zr-_@j=xPO`rzP\u0004mrcJEmi-ZQk=yQ\u0004`haR\u0004cx-LAmr\u007fZ";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u001ee@Y-";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "KJo\u007fa[\u0004zr-KTj|y[\u0004mrcJEmi-_JjobW@.tcXK.";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "KTj|y[@.~bPPo~y\u001eE`y\u007fQMj=dPBa=(M\u0004r=yWIk'-\u001b@";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\u001e\u0019.\"";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u001em@=%";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "RKoyhZ\u0004+y\"\u001b@.~bPRko~_PgrcM\u0004bt~J\u0004mrcJEmi~\u001eB|r`\u001e\u0001j=gW@}=q\u001ePgph\u0004\u0004+y";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "KJo\u007fa[\u0004zr-RKoy-]K`khLWoidQJ}=aWWz=nQJz|nJW.";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u001e\u0019.\"";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\u001e\u0019.\"";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "KJo\u007fa[\u0004zr-ZAbxy[\u0004mrcJEmi-";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "ZAbxy[\u0004mrcJEmi-\u001bW.a-JMcx-\u0004\u0004+y";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u001ejAI-pqBQ-\u007fjJ=";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "\u001e\u00053= \u000f\u0004OSI\u001e";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i] = str;
                    i = 69;
                    str = "LAzh\u007fPAj=";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i] = str;
                    i = 70;
                    str = "\u001e\u0019.,-\u007fjJ=";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i] = str;
                    i = 71;
                    str = "\u001eM`ydHMjhlR\u0004mrcJEmi~\u001eX.idSA4=";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i] = str;
                    i = 72;
                    str = "KJo\u007fa[\u0004zr-YAz=lRH.tcZMxtiKEb=nVEzn";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i] = str;
                    i = 73;
                    str = "\u001e\u00053=2";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i] = str;
                    i = 74;
                    str = "~W je_P}|}N\n`xy";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i] = str;
                    i = 75;
                    str = "KTj|y[\u0004m|aREltaWPgx~\u001eGoqa[@.jdJLahy\u001eE`d-]K`il]P}";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i] = str;
                    i = 76;
                    str = "\u001eGasy_Gzn-]Ebql\\MbtyG\u0004}ilJQ}=q\u001ePgph\u0004\u0004";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i] = str;
                    i = 77;
                    str = "MOgm}WJi=xN@oidPC.~lRHo\u007fdRMzd-ZA{=yQ\u0004kp}J].wdZ";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i] = str;
                    i = 78;
                    str = "KTj|y[@.";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u001e\u0019.\"";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case 78:
                    strArr2[i] = str;
                    i = 80;
                    str = "LAzh\u007fPAj=(Z\u0004j\u007f-]K`il]P}=q\u001ePgph\u0004\u0004+y";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case 79:
                    strArr2[i] = str;
                    i = 81;
                    str = "KJo\u007fa[\u0004zr-YAz=lRH.yo\u001eGasy_Gzn";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case 80:
                    strArr2[i] = str;
                    i = 82;
                    str = "]K`il]P.{hJGfxi\u001eFw=gW@38~\u001eVknxRP38~\u001eGahcJ\u0019+n-B\u0004zt`[\u001e.8i";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case 81:
                    strArr2[i] = str;
                    i = 83;
                    str = "KJo\u007fa[\u0004zr-YAz=nQJz|nJ\u0004ld-TMj=";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case 82:
                    strArr2[i] = str;
                    i = 84;
                    str = "RCk";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case 83:
                    strArr2[i] = str;
                    i = 85;
                    str = "]E`sbJ\u0004ixy\u001eGasy_Gz=oG\u0004`haR\u0004dti";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case 84:
                    strArr2[i] = str;
                    i = 86;
                    str = "_JjobW@.tcXK.sxRHg{d[@.{bL\u0004mrcJEmi-\u001bW.a-JMcx7\u001e\u0001j";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case 85:
                    strArr2[i] = str;
                    i = 87;
                    str = "KJo\u007fa[\u0004zr-PQbqdX].~bPPo~y\u001eE`y\u007fQMj=dPBa=";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case 86:
                    strArr2[i] = str;
                    i = 88;
                    str = "\u001eGasy_Gzn-\\].h\u007fW\u0019";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case 87:
                    strArr2[i] = str;
                    i = 89;
                    str = "XAz~e[@.";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case 88:
                    strArr2[i] = str;
                    i = 90;
                    str = "\u001eX.idSA4=";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case 89:
                    strArr2[i] = str;
                    i = 91;
                    str = "KJo\u007fa[\u0004zr-YAz=nQJz|nJ\u0004ld-KVg=";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case 90:
                    strArr2[i] = str;
                    i = 92;
                    str = "KJo\u007fa[\u0004zr-YAz=lRH.\u007f\u007fQEj~lMPbt~J\u0004mulJW";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case 91:
                    strArr2[i] = str;
                    i = 93;
                    str = "LAzh\u007fPAj=(Z\u0004lob_@m|~J\u0004bt~J\u0004mulJW.a-JMcx7\u001e\u0001j";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case 92:
                    strArr2[i] = str;
                    i = 94;
                    str = "\u001ehGVH\u001e\u0003+\u007f\u007fQEj~lMP)";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case 93:
                    strArr2[i] = str;
                    i = 95;
                    str = "ZAbxy[@.|aR\u0004mrcJEmi~\u001eX.idSA4=(Z";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case 94:
                    strArr2[i] = str;
                    i = 96;
                    str = "KJo\u007fa[\u0004zr-ZAbxy[\u0004z|oRA}=";
                    obj = 95;
                    strArr2 = strArr3;
                    break;
                case 95:
                    strArr2[i] = str;
                    i = 97;
                    str = "KJo\u007fa[\u0004zr-_@j=jLK{m-]Loi-";
                    obj = 96;
                    strArr2 = strArr3;
                    break;
                case 96:
                    strArr2[i] = str;
                    i = 98;
                    str = "YVah}\u001eGf|y\u001eEjyhZ\u001e.8~\u001eX.idSA4=(Z";
                    obj = 97;
                    strArr2 = strArr3;
                    break;
                case 97:
                    strArr2[i] = str;
                    i = 99;
                    str = "KJo\u007fa[\u0004zr-_@j=jLK{m-]Loi-IMzu-PQbq-TMj";
                    obj = 98;
                    strArr2 = strArr3;
                    break;
                case 98:
                    strArr2[i] = str;
                    i = 100;
                    str = "KJo\u007fa[\u0004zr-]Lk~f\u001enGY-[\\gny[Jmx-";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case 99:
                    strArr2[i] = str;
                    i = 101;
                    str = "]K`il]P.xuWWzxc]A.~e[Ge=gW@38~\u001eAvt~JW38o\u001eX.idSA4=(Z";
                    obj = 100;
                    strArr2 = strArr3;
                    break;
                case 100:
                    strArr2[i] = str;
                    i = 102;
                    str = "KTj|y[@.hcMAks-SA}nlYA.~bKJz=kQV.~bPPo~y\u001eNgy0\u001bW.8~\u001eX.idSA4=(Z";
                    obj = 101;
                    strArr2 = strArr3;
                    break;
                case 101:
                    strArr2[i] = str;
                    i = 103;
                    str = "LAzh\u007fPAj=(Z\u0004j\u007f-]K`il]P}=kQV.ntPG.a-JMcx7\u001e\u0001j";
                    obj = 102;
                    strArr2 = strArr3;
                    break;
                case 102:
                    strArr2[i] = str;
                    i = 104;
                    str = "KJo\u007fa[\u0004zr-YAz=lRH.yo\u001eGasy_Gzn-XK|=~GJm";
                    obj = 103;
                    strArr2 = strArr3;
                    break;
                case 103:
                    strArr2[i] = str;
                    i = 105;
                    str = "KJo\u007fa[\u0004zr-KTj|y[\u0004mrcJEmi-\\].wdZ\u0004";
                    obj = 104;
                    strArr2 = strArr3;
                    break;
                case 104:
                    strArr2[i] = str;
                    i = 106;
                    str = "\u001e\u0019.,";
                    obj = 105;
                    strArr2 = strArr3;
                    break;
                case 105:
                    strArr2[i] = str;
                    i = 107;
                    str = "KJo\u007fa[\u0004zr-YAz=z_Gasy_Gzn-XK|=l]GahcJ\u0004}dc]";
                    obj = 106;
                    strArr2 = strArr3;
                    break;
                case 106:
                    strArr2[i] = str;
                    i = 108;
                    str = "LAzod[Rky-\u001b@.je_P}|}N\u0004mrcJEmi~\u001eBao-_GmrxPP.ntPG.a-JMcx7\u001e\u0001j";
                    obj = 107;
                    strArr2 = strArr3;
                    break;
                case 107:
                    strArr2[i] = str;
                    i = 109;
                    str = "KTj|y[@.z\u007fQQ~=dPBa=kQV.wdZ\u0019+n-\u001bW.a-JMcx7\u001e\u0001j";
                    obj = 108;
                    strArr2 = strArr3;
                    break;
                case 108:
                    strArr2[i] = str;
                    i = 110;
                    str = "KJo\u007fa[\u0004zr-LAcr{[\u0004j|y_Fonh\u001e";
                    obj = 109;
                    strArr2 = strArr3;
                    break;
                case 109:
                    strArr2[i] = str;
                    i = 111;
                    str = "a{gs~[VzBbL{|x}REmxRa";
                    obj = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i] = str;
                    i = 112;
                    str = "KTj|y[\u0004ao-_@j=nQJz|nJ\u0004}vdNTky-XK|=gW@38~";
                    obj = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i] = str;
                    i = 113;
                    str = "KJo\u007fa[\u0004zr-KTj|y[\u0004ao-_@j=nQJz|nJW.";
                    obj = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i] = str;
                    i = 114;
                    str = "KTj|y[@.r\u007f\u001eEjyhZ\u0004+y-]K`il]P}=kLKc=l\u001eHgny\u001eKh=(Z\u0004mrcJEmi~\u001eX.idSA4=(Z";
                    obj = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i] = str;
                    i = 115;
                    str = "KJo\u007fa[\u0004zr-YAz=nQJz|nJW.\u007ft\u001eNgy-";
                    obj = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i] = str;
                    i = 116;
                    str = "XAz~e[@.8i\u001eGasy_Gzn-\\].wdZ\u0019+n-B\u0004zt`[\u001e.8i";
                    obj = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i] = str;
                    i = 117;
                    str = "\u001eGasy_Gzn-";
                    obj = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i] = str;
                    i = 118;
                    str = "KJo\u007fa[\u0004zr-_@j=";
                    obj = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i] = str;
                    i = 119;
                    str = "_@jxi\u001e\u0001j=nQJz|nJW.5(Z\u0004yulJWom}\u0017\u0004r=yWIk'-\u001b@";
                    obj = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i] = str;
                    i = 120;
                    str = "_@j=nQJz|nJW.~lRHky-IMzubKP.|cG\u0004mrcJEmi~";
                    obj = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i] = str;
                    i = 121;
                    str = "MOgm}[@.|iZM`z-]K`il]P.yx[\u0004zr-[I~it\u001eNgy7\u001e";
                    obj = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i] = str;
                    i = 122;
                    str = "\u001e\u0019.,-\u007fjJ=";
                    obj = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i] = str;
                    i = 123;
                    str = "\u001e\u00053=2";
                    obj = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i] = str;
                    i = 124;
                    str = "~W je_P}|}N\n`xy";
                    obj = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i] = str;
                    i = 125;
                    str = "WJjt{W@{|a\u001eGasy_Gz=nQQ`i-SM}ndPC.~xLWao";
                    obj = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i] = str;
                    i = 126;
                    str = "\u001e\u00053= \u000f\u0004OSI\u001e";
                    obj = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i] = str;
                    i = 127;
                    str = "KJo\u007fa[\u0004zr-YAz=dP@gkdZQoq-]K`il]P.~bKJz";
                    obj = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i] = str;
                    i = 128;
                    str = "WJjt{W@{|a\u001eGasy_Gz=nQQ`i7\u001e\u0001j=q\u001ePgph\u0004\u0004+y";
                    obj = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i] = str;
                    i = 129;
                    str = "\u001ejAI-pqBQ-\u007fjJ=";
                    obj = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i] = str;
                    i = 130;
                    str = "\u001ehGVH\u001e\u0003+0(\u0019";
                    obj = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i] = str;
                    i = 131;
                    str = "KJo\u007fa[\u0004zr-YAz=lRH.z\u007fQQ~=nVEzn";
                    obj = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i] = str;
                    i = 132;
                    str = "LAzh\u007fPAj=(Z\u0004iobKT.~e_P}=q\u001ePgph\u0004\u0004+y";
                    obj = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i] = str;
                    i = 133;
                    str = "LAcr{WJi=~WI.~lL@.yxNHg~lJA.~bPPo~y\u001e\u0001}";
                    obj = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i] = str;
                    i = 134;
                    str = "\u001eGasy_Gzn-MAbxnJAj=kQV.md]Oko-\u0016Gasy[\\z ";
                    obj = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i] = str;
                    i = 135;
                    str = "LAcr{WJi=iKTbtn_Pk=nQJz|nJ\u0004ytyV\u0004`haR\u0004ext\u001e\u0001}";
                    obj = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i] = str;
                    i = 136;
                    str = "\u001e\u0019.,-\u007fjJ=";
                    obj = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i] = str;
                    i = 137;
                    str = "\u001e\u00053=2";
                    obj = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i] = str;
                    i = 138;
                    str = "~W je_P}|}N\n`xy";
                    obj = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i] = str;
                    i = 139;
                    str = "LAcr{WJi=iKTbtn_Pk=nQJz|nJ\u0004ytyV\u0004c|y]Lgsj\u001eOkd-\u001bW";
                    obj = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i] = str;
                    i = 140;
                    str = "\u0012\u0004";
                    obj = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i] = str;
                    i = 141;
                    str = "\u001ee@Y-\u0016";
                    obj = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i] = str;
                    i = 142;
                    str = "\u001ee]^";
                    obj = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i] = str;
                    i = 143;
                    str = "\u001e\u001a.--qv.";
                    obj = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i] = str;
                    i = 144;
                    str = "]K`il]P}=lLA.ti[Jztn_H\"=t[P.sbJ\u0004&8~\u0012\u0004+n$";
                    obj = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i] = str;
                    i = 145;
                    str = "\u001e\u0019.:lRHaj*\u0017";
                    obj = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i] = str;
                    i = 146;
                    str = "\u001e\u0019.";
                    obj = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i] = str;
                    i = 147;
                    str = "KJo\u007fa[\u0004zr-_T~qt\u001eGasy_Gz=}WGex\u007f\u001eHgny\u001e@k0iKTk=o_Pmu-";
                    obj = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i] = str;
                    i = 148;
                    str = "KJo\u007fa[\u0004zr-YAz=nQJz|nJ\u0004~tnUA|=aWWz";
                    obj = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i] = str;
                    i = 149;
                    str = "\u0012\u0004";
                    obj = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i] = str;
                    i = 150;
                    str = "LAcr{WJi=iKTbtn_Pk=nQJz|nJ\u0004ytyV\u0004~ohXA|xc]A.{bL\u0004brz[V.ti\u001e\u0001}";
                    obj = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i] = str;
                    i = 151;
                    str = "\u001ee@Y-\u0016";
                    obj = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i] = str;
                    i = 152;
                    str = "\u0017\u0004r=yWIk'-";
                    obj = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i] = str;
                    z = strArr3;
                    StringBuilder append = new StringBuilder().append(m8.j);
                    char[] toCharArray2 = "\u001e\u0019.\"".toCharArray();
                    i3 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (i = 0; i3 > i; i++) {
                        int i4;
                        char c2 = cArr2[i];
                        switch (i % 5) {
                            case PBE.MD5 /*0*/:
                                i4 = 62;
                                break;
                            case ay.f /*1*/:
                                i4 = 36;
                                break;
                            case ay.n /*2*/:
                                i4 = 14;
                                break;
                            case ay.p /*3*/:
                                i4 = 29;
                                break;
                            default:
                                i4 = 13;
                                break;
                        }
                        cArr2[i] = (char) (i4 ^ c2);
                    }
                    a = append.append(new String(cArr2).intern()).toString();
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "ZAbxy[\u0004mrcJEmi~\u001eGoqa[@.jdJLahy\u001eE`d-]K`il]P}";
                    obj = null;
                    break;
            }
        }
    }

    public void a(m8 m8Var) {
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues(3);
        contentValues.put(m8.i, Integer.valueOf(m8Var.M));
        contentValues.put(m8.O, Integer.valueOf(m8Var.A));
        contentValues.put(m8.P, Long.valueOf(m8Var.r));
        a(contentValues, m8Var.e);
        Log.a(z[41], null, new Object[]{m8Var.e, contentValues, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
    }

    public void b(Collection collection) {
        int i = m3.d;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(collection.size());
        for (m8 m8Var : collection) {
            try {
                if (m8Var.N == null || TextUtils.isEmpty(m8Var.e)) {
                    Log.a(z[112], null, new Object[]{m8Var.e});
                    if (i == 0) {
                        continue;
                    }
                }
                Builder newInsert = ContentProviderOperation.newInsert(ContactProvider.e);
                try {
                    if (m8Var.y > 0) {
                        newInsert.withValue(m8.l, Long.valueOf(m8Var.y));
                    }
                    try {
                        newInsert.withValue(m8.j, m8Var.e);
                        newInsert.withValue(m8.D, Boolean.valueOf(m8Var.q));
                        newInsert.withValue(m8.g, m8Var.b);
                        newInsert.withValue(m8.m, Long.valueOf(m8Var.c));
                        try {
                            Object valueOf;
                            newInsert.withValue(m8.p, m8Var.h != null ? m8Var.h.b : null);
                            String str = m8.J;
                            if (m8Var.h != null) {
                                valueOf = Long.valueOf(m8Var.h.a);
                            } else {
                                valueOf = null;
                            }
                            try {
                                newInsert.withValue(str, valueOf);
                                newInsert.withValue(m8.w, m8Var.N);
                                newInsert.withValue(m8.I, m8Var.v);
                                newInsert.withValue(m8.z, m8Var.s);
                                if (m8Var.Q == null && m8Var.F == null) {
                                    m8Var.t();
                                }
                                newInsert.withValue(m8.L, m8Var.Q);
                                newInsert.withValue(m8.f, m8Var.F);
                                newInsert.withValue(m8.u, m8Var.n);
                                newInsert.withValue(m8.o, m8Var.s());
                                newInsert.withValue(m8.H, Integer.valueOf(m8Var.a));
                                newInsert.withValue(m8.i, Integer.valueOf(m8Var.M));
                                newInsert.withValue(m8.O, Integer.valueOf(m8Var.A));
                                newInsert.withValue(m8.P, Long.valueOf(m8Var.r));
                                newInsert.withValue(m8.x, m8Var.t);
                                newInsert.withValue(z[111], Boolean.valueOf(true));
                                arrayList.add(newInsert.build());
                            } catch (IllegalArgumentException e) {
                                throw e;
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                } catch (IllegalArgumentException e2222) {
                    throw e2222;
                }
                if (i == 0) {
                }
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            } catch (IllegalArgumentException e222222) {
                throw e222222;
            }
        }
        try {
            break;
            this.b.a(arrayList);
        } catch (IllegalArgumentException e2222222) {
            Log.e(z[113] + e2222222);
        } catch (Throwable e3) {
            throw new RuntimeException(e3);
        } catch (Throwable e32) {
            throw new RuntimeException(e32);
        }
        Log.a(z[114], null, new Object[]{Integer.valueOf(arrayList.size()), Integer.valueOf(collection.size()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
    }

    public boolean c(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor a = this.b.a(ContactProvider.e, ContactProvider.a, a, new String[]{str}, null);
        if (a == null) {
            try {
                Log.e(z[100] + str);
                return false;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            boolean z;
            if (a.moveToNext()) {
                if (a.getLong(0) > 0) {
                    z = true;
                    a.close();
                    Log.a(z[101], null, new Object[]{str, Boolean.valueOf(z), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
                    return z;
                }
            }
            z = false;
            a.close();
            Log.a(z[101], null, new Object[]{str, Boolean.valueOf(z), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
            return z;
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void k(m8 m8Var) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.b.a(ContactProvider.e, m8.l + z[64], new String[]{String.valueOf(m8Var.y)});
        } catch (IllegalArgumentException e) {
            Log.e(z[65] + m8Var.y + ' ' + e);
        }
        Log.a(z[66], null, new Object[]{m8Var, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
    }

    public ArrayList b() {
        int i = m3.d;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Cursor a = this.b.a(ContactProvider.e, new String[]{m8.l, m8.j, m8.D, m8.p, m8.J, m8.w}, m8.D + z[106], null, null);
        if (a == null) {
            try {
                Log.e(z[107]);
                return arrayList;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            m8 a2 = m8.a(a);
            try {
                if (!a2.w()) {
                    arrayList.add(a2);
                    continue;
                }
                if (i != 0) {
                    break;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        a.close();
        Log.a(z[108], null, new Object[]{Integer.valueOf(arrayList.size()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.m8 d(java.lang.String r13) {
        /*
        r12_this = this;
        r8 = com.whatsapp.m3.d;
        r10 = java.lang.System.currentTimeMillis();
        if (r13 != 0) goto L_0x0015;
    L_0x0008:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0013 }
        r1 = 85;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0013 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IllegalArgumentException -> 0x0013 }
        r1 = 0;
    L_0x0012:
        return r1;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r7 = 0;
        r6 = 0;
        r0 = r12.b;
        r1 = com.whatsapp.contact.ContactProvider.e;
        r2 = com.whatsapp.m8.K;
        r3 = a;
        r4 = 1;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r4[r5] = r13;
        r5 = 0;
        r3 = r0.a(r1, r2, r3, r4, r5);
        if (r3 != 0) goto L_0x004a;
    L_0x002c:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0048 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r2 = 83;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0048 }
        r0 = r0.append(r1);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r0 = r0.append(r13);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x0048 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r1 = 0;
        goto L_0x0012;
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r0 = r6;
        r1 = r7;
    L_0x004c:
        r2 = r3.moveToNext();
        if (r2 == 0) goto L_0x00a0;
    L_0x0052:
        r2 = com.whatsapp.m8.b(r3);
        if (r1 == 0) goto L_0x0060;
    L_0x0058:
        r4 = r1.h;	 Catch:{ IllegalArgumentException -> 0x00db }
        if (r4 != 0) goto L_0x0063;
    L_0x005c:
        r4 = r2.h;	 Catch:{ IllegalArgumentException -> 0x00db }
        if (r4 == 0) goto L_0x0063;
    L_0x0060:
        if (r8 == 0) goto L_0x00eb;
    L_0x0062:
        r1 = r2;
    L_0x0063:
        r4 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalArgumentException -> 0x00dd }
        r5 = z;	 Catch:{ IllegalArgumentException -> 0x00dd }
        r6 = 84;
        r5 = r5[r6];	 Catch:{ IllegalArgumentException -> 0x00dd }
        r4 = r4.equalsIgnoreCase(r5);	 Catch:{ IllegalArgumentException -> 0x00dd }
        if (r4 == 0) goto L_0x0090;
    L_0x0071:
        r4 = r1.h;	 Catch:{ IllegalArgumentException -> 0x00df }
        if (r4 == 0) goto L_0x0090;
    L_0x0075:
        r4 = r1.h;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r4 = r4.a;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r6 = -2;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 != 0) goto L_0x0090;
    L_0x007f:
        r4 = r2.h;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        if (r4 == 0) goto L_0x0090;
    L_0x0083:
        r4 = r2.h;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r4 = r4.a;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r6 = -2;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 == 0) goto L_0x0090;
    L_0x008d:
        if (r8 == 0) goto L_0x00eb;
    L_0x008f:
        r1 = r2;
    L_0x0090:
        r4 = r1.q;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        if (r4 != 0) goto L_0x0099;
    L_0x0094:
        r4 = r2.q;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        if (r4 == 0) goto L_0x0099;
    L_0x0098:
        r1 = r2;
    L_0x0099:
        r4 = r2.h;
        if (r4 != 0) goto L_0x009e;
    L_0x009d:
        r0 = r2;
    L_0x009e:
        if (r8 == 0) goto L_0x004c;
    L_0x00a0:
        r2 = r3.getCount();
        r3.close();	 Catch:{ IllegalArgumentException -> 0x00e7 }
        if (r1 == 0) goto L_0x00ac;
    L_0x00a9:
        com.whatsapp.ok.f(r1);	 Catch:{ IllegalArgumentException -> 0x00e7 }
    L_0x00ac:
        if (r0 == 0) goto L_0x00b3;
    L_0x00ae:
        if (r0 == r1) goto L_0x00b3;
    L_0x00b0:
        r12.k(r0);	 Catch:{ IllegalArgumentException -> 0x00e9 }
    L_0x00b3:
        r0 = z;
        r3 = 82;
        r0 = r0[r3];
        r3 = 0;
        r4 = 4;
        r4 = new java.lang.Object[r4];
        r5 = 0;
        r4[r5] = r13;
        r5 = 1;
        r4[r5] = r1;
        r5 = 2;
        r2 = java.lang.Integer.valueOf(r2);
        r4[r5] = r2;
        r2 = 3;
        r6 = java.lang.System.currentTimeMillis();
        r6 = r6 - r10;
        r5 = java.lang.Long.valueOf(r6);
        r4[r2] = r5;
        com.whatsapp.util.Log.a(r0, r3, r4);
        goto L_0x0012;
    L_0x00db:
        r0 = move-exception;
        throw r0;
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00df }
    L_0x00df:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e1 }
    L_0x00e1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e3 }
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        throw r0;
    L_0x00e7:
        r0 = move-exception;
        throw r0;
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r1 = r2;
        goto L_0x0099;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.x5.d(java.lang.String):com.whatsapp.m8");
    }

    public ArrayList i() {
        int i = m3.d;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Cursor a = this.b.a(ContactProvider.e, m8.K, m8.j + z[130], null, null);
        if (a == null) {
            try {
                Log.e(z[131]);
                return arrayList;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            arrayList.add(m8.b(a));
            if (i != 0) {
                break;
            }
        }
        a.close();
        Log.a(z[132], null, new Object[]{Integer.valueOf(arrayList.size()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
        return arrayList;
    }

    public void h(m8 m8Var) {
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put(m8.H, Integer.valueOf(m8Var.a));
        a(contentValues, m8Var.e);
        Log.a(z[102], null, new Object[]{m8Var.e, contentValues, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
    }

    public boolean e(m8 m8Var) {
        try {
            if (m8Var.N == null) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues(7);
            contentValues.put(m8.D, Boolean.valueOf(true));
            contentValues.put(m8.p, m8Var.h.b);
            contentValues.put(m8.J, Long.valueOf(m8Var.h.a));
            contentValues.put(m8.w, m8Var.N);
            contentValues.put(m8.I, m8Var.v);
            contentValues.put(m8.z, m8Var.s);
            contentValues.put(m8.u, m8Var.n);
            try {
                int a = this.b.a(ContactProvider.e, contentValues, a, new String[]{m8Var.e});
                try {
                    boolean z;
                    ok.c(m8Var);
                    App.aH.sendEmptyMessage(1);
                    Log.a(z[43], null, new Object[]{m8Var});
                    if (a > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Log.a(z[44], null, new Object[]{Boolean.valueOf(z), m8Var, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
                    return z;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                Log.e(z[42] + m8Var + ' ' + e2);
                return false;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(java.util.ArrayList r10) {
        /*
        r9_this = this;
        r6 = 1;
        r8 = 0;
        r1 = com.whatsapp.m3.d;
        r0 = r10.isEmpty();	 Catch:{ IllegalArgumentException -> 0x0013 }
        if (r0 == 0) goto L_0x0015;
    L_0x000a:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0013 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0013 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x0013 }
    L_0x0012:
        return;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r2 = java.lang.System.currentTimeMillis();
        r4 = new java.util.ArrayList;
        r0 = r10.size();
        r4.<init>(r0);
        r5 = r10.iterator();
    L_0x0026:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x003b;
    L_0x002c:
        r0 = r5.next();
        r0 = (com.whatsapp.m8) r0;
        r0 = i(r0);
        r4.add(r0);
        if (r1 == 0) goto L_0x0026;
    L_0x003b:
        r0 = r9.b;	 Catch:{ IllegalArgumentException -> 0x0058, RemoteException -> 0x007c, OperationApplicationException -> 0x0083 }
        r0.a(r4);	 Catch:{ IllegalArgumentException -> 0x0058, RemoteException -> 0x007c, OperationApplicationException -> 0x0083 }
    L_0x0040:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        r1 = 0;
        r4 = new java.lang.Object[r6];
        r6 = java.lang.System.currentTimeMillis();
        r2 = r6 - r2;
        r2 = java.lang.Long.valueOf(r2);
        r4[r8] = r2;
        com.whatsapp.util.Log.a(r0, r1, r4);
        goto L_0x0012;
    L_0x0058:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = z;
        r4 = r4[r8];
        r1 = r1.append(r4);
        r1 = r1.append(r10);
        r4 = 32;
        r1 = r1.append(r4);
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0040;
    L_0x007c:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x0083:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.x5.d(java.util.ArrayList):void");
    }

    public ArrayList b(String str) {
        int i = m3.d;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Cursor a = this.b.a(ContactProvider.e, m8.K, a, new String[]{str}, null);
        if (a == null) {
            try {
                Log.e(z[115] + str);
                return arrayList;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            arrayList.add(m8.b(a));
            if (i != 0) {
                break;
            }
        }
        a.close();
        Log.a(z[116], null, new Object[]{Integer.valueOf(arrayList.size()), str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
        return arrayList;
    }

    public void a(String str, long j, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put(m8.g, str2);
        contentValues.put(m8.m, Long.valueOf(j));
        try {
            this.b.a(ContactProvider.e, contentValues, a, new String[]{str});
        } catch (IllegalArgumentException e) {
            Log.e(z[36] + str + z[34] + str2 + ' ' + e);
        }
        ok.b(str);
        Log.a(z[35], null, new Object[]{str, contentValues, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.ArrayList r17, java.util.Set r18) {
        /*
        r16_this = this;
        r9 = com.whatsapp.m3.d;
        r10 = new java.util.HashSet;
        r10.<init>();
        r8 = 0;
        r2 = com.whatsapp.App.e;	 Catch:{ Exception -> 0x016e, all -> 0x0179 }
        r3 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI;	 Catch:{ Exception -> 0x016e, all -> 0x0179 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ Exception -> 0x016e, all -> 0x0179 }
        r5 = 0;
        r6 = z;	 Catch:{ Exception -> 0x016e, all -> 0x0179 }
        r7 = 20;
        r6 = r6[r7];	 Catch:{ Exception -> 0x016e, all -> 0x0179 }
        r4[r5] = r6;	 Catch:{ Exception -> 0x016e, all -> 0x0179 }
        r5 = z;	 Catch:{ Exception -> 0x016e, all -> 0x0179 }
        r6 = 31;
        r5 = r5[r6];	 Catch:{ Exception -> 0x016e, all -> 0x0179 }
        r6 = 1;
        r6 = new java.lang.String[r6];	 Catch:{ Exception -> 0x016e, all -> 0x0179 }
        r7 = 0;
        r12 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x016e, all -> 0x0179 }
        r14 = 31536000000; // 0x757b12c00 float:3.89605073E14 double:1.55808542072E-313;
        r12 = r12 - r14;
        r11 = java.lang.String.valueOf(r12);	 Catch:{ Exception -> 0x016e, all -> 0x0179 }
        r6[r7] = r11;	 Catch:{ Exception -> 0x016e, all -> 0x0179 }
        r7 = z;	 Catch:{ Exception -> 0x016e, all -> 0x0179 }
        r11 = 32;
        r7 = r7[r11];	 Catch:{ Exception -> 0x016e, all -> 0x0179 }
        r2 = r2.query(r3, r4, r5, r6, r7);	 Catch:{ Exception -> 0x016e, all -> 0x0179 }
    L_0x003c:
        r3 = r2.moveToNext();	 Catch:{ Exception -> 0x0244, all -> 0x023f }
        if (r3 == 0) goto L_0x0050;
    L_0x0042:
        r3 = 0;
        r4 = r2.getLong(r3);	 Catch:{ Exception -> 0x0244, all -> 0x023f }
        r3 = java.lang.Long.valueOf(r4);	 Catch:{ Exception -> 0x0244, all -> 0x023f }
        r10.add(r3);	 Catch:{ Exception -> 0x0244, all -> 0x023f }
        if (r9 == 0) goto L_0x003c;
    L_0x0050:
        if (r2 == 0) goto L_0x0055;
    L_0x0052:
        r2.close();	 Catch:{ Exception -> 0x016c }
    L_0x0055:
        r12 = java.lang.System.currentTimeMillis();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = com.whatsapp.m8.D;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 26;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = com.whatsapp.m8.p;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 29;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = com.whatsapp.m8.w;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 18;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = z;
        r4 = 16;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = com.whatsapp.m8.I;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 24;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = 2;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 15;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = com.whatsapp.m8.I;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 25;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = 0;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 19;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = com.whatsapp.m8.z;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 17;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = com.whatsapp.m8.j;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 33;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r5 = r2.toString();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = com.whatsapp.m8.w;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 30;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = com.whatsapp.m8.p;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 21;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = com.whatsapp.m8.I;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 22;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r7 = r2.toString();
        r0 = r16;
        r2 = r0.b;
        r3 = com.whatsapp.contact.ContactProvider.e;
        r4 = com.whatsapp.m8.K;
        r6 = 1;
        r6 = new java.lang.String[r6];
        r8 = 0;
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r14 = com.whatsapp.App.af();
        r11 = r11.append(r14);
        r14 = z;
        r15 = 27;
        r14 = r14[r15];
        r11 = r11.append(r14);
        r11 = r11.toString();
        r6[r8] = r11;
        r3 = r2.a(r3, r4, r5, r6, r7);
        if (r3 != 0) goto L_0x0184;
    L_0x0162:
        r2 = z;	 Catch:{ Exception -> 0x0182 }
        r3 = 23;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0182 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ Exception -> 0x0182 }
    L_0x016b:
        return;
    L_0x016c:
        r2 = move-exception;
        throw r2;
    L_0x016e:
        r2 = move-exception;
        r2 = r8;
    L_0x0170:
        if (r2 == 0) goto L_0x0055;
    L_0x0172:
        r2.close();	 Catch:{ Exception -> 0x0177 }
        goto L_0x0055;
    L_0x0177:
        r2 = move-exception;
        throw r2;
    L_0x0179:
        r2 = move-exception;
    L_0x017a:
        if (r8 == 0) goto L_0x017f;
    L_0x017c:
        r8.close();	 Catch:{ Exception -> 0x0180 }
    L_0x017f:
        throw r2;
    L_0x0180:
        r2 = move-exception;
        throw r2;
    L_0x0182:
        r2 = move-exception;
        throw r2;
    L_0x0184:
        r2 = r3.moveToNext();
        if (r2 == 0) goto L_0x01fe;
    L_0x018a:
        r4 = com.whatsapp.m8.b(r3);
        r2 = r4.e;
        r2 = com.whatsapp.m8.d(r2);
        if (r2 != 0) goto L_0x0184;
    L_0x0196:
        r2 = r4.w();	 Catch:{ Exception -> 0x0231 }
        if (r2 == 0) goto L_0x019e;
    L_0x019c:
        if (r9 == 0) goto L_0x0184;
    L_0x019e:
        if (r18 == 0) goto L_0x01ac;
    L_0x01a0:
        r2 = r4.N;	 Catch:{ Exception -> 0x0233 }
        r0 = r18;
        r2 = r0.contains(r2);	 Catch:{ Exception -> 0x0233 }
        if (r2 == 0) goto L_0x01ac;
    L_0x01aa:
        if (r9 == 0) goto L_0x0184;
    L_0x01ac:
        r6 = r4.e();	 Catch:{ Exception -> 0x0235 }
        r2 = java.lang.Long.valueOf(r6);	 Catch:{ Exception -> 0x0235 }
        r2 = r10.contains(r2);	 Catch:{ Exception -> 0x0235 }
        if (r2 != 0) goto L_0x01c2;
    L_0x01ba:
        r2 = r10.isEmpty();	 Catch:{ Exception -> 0x0237 }
        if (r2 != 0) goto L_0x01c2;
    L_0x01c0:
        if (r9 == 0) goto L_0x0184;
    L_0x01c2:
        r2 = r17.isEmpty();	 Catch:{ Exception -> 0x0239 }
        if (r2 == 0) goto L_0x01cf;
    L_0x01c8:
        r0 = r17;
        r0.add(r4);	 Catch:{ Exception -> 0x0239 }
        if (r9 == 0) goto L_0x0184;
    L_0x01cf:
        r2 = r17.size();
        r2 = r2 + -1;
        r0 = r17;
        r2 = r0.get(r2);
        r2 = (com.whatsapp.m8) r2;
        r5 = r2.N;	 Catch:{ Exception -> 0x023b }
        r6 = r4.N;	 Catch:{ Exception -> 0x023b }
        r5 = r5.equalsIgnoreCase(r6);	 Catch:{ Exception -> 0x023b }
        if (r5 == 0) goto L_0x01f5;
    L_0x01e7:
        r2 = r2.h;	 Catch:{ Exception -> 0x023d }
        r2 = r2.b;	 Catch:{ Exception -> 0x023d }
        r5 = r4.h;	 Catch:{ Exception -> 0x023d }
        r5 = r5.b;	 Catch:{ Exception -> 0x023d }
        r2 = r2.equals(r5);	 Catch:{ Exception -> 0x023d }
        if (r2 != 0) goto L_0x01fc;
    L_0x01f5:
        r0 = r17;
        r0.add(r4);	 Catch:{ Exception -> 0x023d }
        if (r9 == 0) goto L_0x0184;
    L_0x01fc:
        if (r9 == 0) goto L_0x0184;
    L_0x01fe:
        r3.close();	 Catch:{ Exception -> 0x022f }
        r2 = z;	 Catch:{ Exception -> 0x022f }
        r3 = 28;
        r2 = r2[r3];	 Catch:{ Exception -> 0x022f }
        r3 = 0;
        r4 = 2;
        r4 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x022f }
        r5 = 0;
        r6 = r17.size();	 Catch:{ Exception -> 0x022f }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ Exception -> 0x022f }
        r4[r5] = r6;	 Catch:{ Exception -> 0x022f }
        r5 = 1;
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x022f }
        r6 = r6 - r12;
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ Exception -> 0x022f }
        r4[r5] = r6;	 Catch:{ Exception -> 0x022f }
        com.whatsapp.util.Log.a(r2, r3, r4);	 Catch:{ Exception -> 0x022f }
        r2 = com.whatsapp.DialogToastActivity.i;	 Catch:{ Exception -> 0x022f }
        if (r2 == 0) goto L_0x016b;
    L_0x0229:
        r2 = r9 + 1;
        com.whatsapp.m3.d = r2;	 Catch:{ Exception -> 0x022f }
        goto L_0x016b;
    L_0x022f:
        r2 = move-exception;
        throw r2;
    L_0x0231:
        r2 = move-exception;
        throw r2;
    L_0x0233:
        r2 = move-exception;
        throw r2;
    L_0x0235:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0237 }
    L_0x0237:
        r2 = move-exception;
        throw r2;
    L_0x0239:
        r2 = move-exception;
        throw r2;
    L_0x023b:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x023d }
    L_0x023d:
        r2 = move-exception;
        throw r2;
    L_0x023f:
        r3 = move-exception;
        r8 = r2;
        r2 = r3;
        goto L_0x017a;
    L_0x0244:
        r3 = move-exception;
        goto L_0x0170;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.x5.a(java.util.ArrayList, java.util.Set):void");
    }

    public void f(m8 m8Var) {
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues(7);
        contentValues.put(m8.J, Integer.valueOf(-1));
        contentValues.put(m8.w, (String) null);
        contentValues.put(m8.L, (String) null);
        contentValues.put(m8.f, (String) null);
        contentValues.put(m8.u, (String) null);
        contentValues.put(m8.I, Integer.valueOf(-1));
        contentValues.put(m8.z, (String) null);
        try {
            this.b.a(ContentUris.withAppendedId(ContactProvider.e, m8Var.y), contentValues, null, null);
        } catch (IllegalArgumentException e) {
            Log.e(z[87] + m8Var + ' ' + e);
        }
        m8Var.h = null;
        m8Var.N = null;
        m8Var.v = Integer.valueOf(-1);
        m8Var.s = null;
        m8Var.Q = null;
        m8Var.F = null;
        m8Var.n = null;
        ok.c(m8Var);
        Log.a(z[86], null, new Object[]{m8Var, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
    }

    public boolean d(m8 m8Var) {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor a = this.b.a(ContactProvider.e, ContactProvider.a, a, new String[]{m8Var.e}, null);
        if (a == null) {
            try {
                Log.e(z[37] + m8Var);
                return false;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (a.moveToNext()) {
            if (a.getLong(0) > 1) {
                try {
                    Log.a(z[39], null, new Object[]{Long.valueOf(r2), m8Var.e, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
                    a.close();
                    return true;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            a.close();
            return false;
        } else {
            a.close();
            Log.c(z[38], null, new Object[]{m8Var.e, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
            return false;
        }
    }

    public void d() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.b.a(ContactProvider.e, null, null);
        } catch (IllegalArgumentException e) {
            Log.e(z[96] + e);
        }
        Log.a(z[95], null, new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
    }

    public void c(m8 m8Var) {
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues(5);
        contentValues.put(m8.w, m8Var.N);
        contentValues.put(m8.z, m8Var.s);
        contentValues.put(m8.H, Integer.valueOf(m8Var.a));
        contentValues.put(m8.p, m8Var.E);
        contentValues.put(m8.D, Boolean.valueOf(m8Var.q));
        a(contentValues, m8Var.e);
        Log.a(z[109], null, new Object[]{m8Var.e, contentValues, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
    }

    public void c(Collection collection) {
        int i = m3.d;
        try {
            if (collection.isEmpty()) {
                Log.i(z[120]);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList(collection.size());
            int i2 = 0;
            for (m8 m8Var : collection) {
                try {
                    if (TextUtils.isEmpty(m8Var.e)) {
                        Log.i(z[121] + m8Var);
                        if (i == 0) {
                            continue;
                        }
                    }
                    try {
                        if (m8Var.Q == null && m8Var.F == null) {
                            m8Var.t();
                        }
                        try {
                            if (m8Var.q) {
                                i2++;
                            }
                            arrayList.add(ContentProviderOperation.newInsert(ContactProvider.e).withValue(m8.j, m8Var.e).withValue(m8.D, Boolean.valueOf(m8Var.q)).withValue(m8.g, m8Var.b).withValue(m8.m, Long.valueOf(m8Var.c)).withValue(m8.p, m8Var.h.b).withValue(m8.J, Long.valueOf(m8Var.h.a)).withValue(m8.w, m8Var.N).withValue(m8.I, m8Var.v).withValue(m8.z, m8Var.s).withValue(m8.L, m8Var.Q).withValue(m8.f, m8Var.F).withValue(m8.u, m8Var.n).withValue(m8.o, m8Var.s()).build());
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    }
                    if (i == 0) {
                    }
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            }
            try {
                break;
                this.b.a(arrayList);
            } catch (IllegalArgumentException e2222) {
                Log.e(z[118] + collection.size() + z[117] + e2222);
            } catch (Throwable e3) {
                throw new RuntimeException(e3);
            } catch (Throwable e32) {
                throw new RuntimeException(e32);
            }
            Log.a(z[119], null, new Object[]{Integer.valueOf(collection.size()), Integer.valueOf(i2), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
        } catch (IllegalArgumentException e22222) {
            throw e22222;
        }
    }

    public void a(ArrayList arrayList) {
        a(arrayList, e4.NORMAL);
    }

    private int a(ContentValues contentValues, String str) {
        int i = 0;
        try {
            i = this.b.a(ContactProvider.e, contentValues, a, new String[]{str});
        } catch (IllegalArgumentException e) {
            Log.e(z[105] + str + ' ' + e);
        }
        return i;
    }

    public ArrayList g() {
        int i = m3.d;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Cursor a = this.b.a(ContactProvider.e, m8.K, null, null, null);
        if (a == null) {
            try {
                Log.e(z[81]);
                return arrayList;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        while (a.moveToNext()) {
            arrayList.add(m8.b(a));
            if (i != 0) {
                break;
            }
        }
        a.close();
        Log.a(z[80], null, new Object[]{Integer.valueOf(arrayList.size()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
        return arrayList;
    }

    public void a(m8 m8Var, String str, String str2, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues(3);
        contentValues.put(m8.j, str);
        contentValues.put(m8.w, str2);
        contentValues.put(m8.z, Long.toString(j));
        a(contentValues, m8Var.e);
        ok.b(m8Var.e);
        ok.b(str);
        Log.a(z[45], null, new Object[]{str2, Long.valueOf(j), m8Var.e, str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
    }

    public boolean f() {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor a = this.b.a(ContactProvider.e, ContactProvider.a, null, null, null);
        if (a == null) {
            try {
                Log.e(z[4]);
                return false;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            boolean z;
            if (a.moveToNext()) {
                if (a.getLong(0) > 0) {
                    z = true;
                    a.close();
                    Log.a(z[3], null, new Object[]{Boolean.valueOf(z), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
                    return z;
                }
            }
            z = false;
            a.close();
            Log.a(z[3], null, new Object[]{Boolean.valueOf(z), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
            return z;
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public int h() {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor a = this.b.a(ContactProvider.e, ContactProvider.a, m8.D + z[122] + m8.J + z[129] + m8.J + z[126] + m8.j + z[123], new String[]{App.af() + z[124]}, null);
        if (a == null) {
            try {
                Log.e(z[127]);
                return 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (a.moveToNext()) {
            int i = a.getInt(0);
            Log.a(z[128], null, new Object[]{Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
            a.close();
            return i;
        } else {
            a.close();
            Log.w(z[125]);
            return -1;
        }
    }
}
