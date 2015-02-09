package com.whatsapp;

import com.whatsapp.c2dm.C2DMRegistrar;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class gn extends fc {
    private static final String[] z;

    static {
        String[] strArr = new String[14];
        String str = "F{KO\u001e";
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
                        i3 = 52;
                        break;
                    case ay.f /*1*/:
                        i3 = 30;
                        break;
                    case ay.n /*2*/:
                        i3 = 39;
                        break;
                    case ay.p /*3*/:
                        i3 = 46;
                        break;
                    default:
                        i3 = 103;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "UnW\u0001\nQmTO\u0000Q1UK\u0004QwQK\u0003\u001bzR^\u000b]}FZ\u0002\u0014";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "Ym@O\u0003P{C\u0001\u0001FqJq\tUsB\u000e\u000eG>BC\u0017@g\u0007\u000e\r]z\u001d";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0014sB]\u0014UyB\u0014";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "DwDZ\u0012F{";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "F{KO\u001e";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "tm\tY\u000fUjTO\u0017D0IK\u0013";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "]pQG\u0014";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "UpC\\\b]z\t\\\u0002GqR\\\u0004Q$\b\u0001\u0004[s\tY\u000fUjTO\u0017D1\u0015\u001fT\u0005.\u001e\u0017Q\u0001/";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "UnW\u0001\nQmTO\u0000Q1UK\u0004QwQK\u0003\u001bpBY\u0012Fr\u0007";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "UnW\u0001\nQmTO\u0000Q1UK\u0004QwQK\u0003\u001bpBY\u0012Fr\u0007";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "WqJ\u0000\u0000[q@B\u0002\u001anUA\u0004QmT\u0000\u0000UnW]";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "UnW\u0001\nQmTO\u0000Q}OO\tS{C\u000e\u0012ZuIA\u0010Z>SW\u0017Q>";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "DwDZ\u0012F{";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a() {
        if (App.aJ.n()) {
            App.a(new tr(this));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.whatsapp.protocol.b r7, int r8) {
        /*
        r6_this = this;
        r5 = 0;
        r4 = 1;
        r1 = com.whatsapp.App.az;
        switch(r8) {
            case -1: goto L_0x0093;
            case 0: goto L_0x0007;
            case 1: goto L_0x0022;
            case 2: goto L_0x0007;
            case 3: goto L_0x002a;
            case 4: goto L_0x0022;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 13;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x0021:
        return;
    L_0x0022:
        com.whatsapp.App.j(r7);
        com.whatsapp.App.r(r7);
        if (r1 == 0) goto L_0x0021;
    L_0x002a:
        r0 = r7.A;
        r0 = (com.whatsapp.MediaData) r0;
        if (r0 == 0) goto L_0x0021;
    L_0x0030:
        r2 = r0.transferred;
        if (r2 == 0) goto L_0x0021;
    L_0x0034:
        r2 = com.whatsapp.App.p;
        com.whatsapp.util.f.a(r2, r7);
        r2 = new com.whatsapp.a5j;
        r3 = r7.t;
        r0 = r0.dedupeDownload;
        r2.<init>(r3, r0);
        com.whatsapp.App.a(r2);
        r0 = r7.j;
        r2 = 2;
        if (r0 != r2) goto L_0x0060;
    L_0x004a:
        r0 = r7.w;
        if (r0 != r4) goto L_0x0060;
    L_0x004e:
        r0 = r7.r;
        if (r0 == 0) goto L_0x005b;
    L_0x0052:
        r0 = com.whatsapp.App.o;
        com.whatsapp.App.a(r4, r0);
        com.whatsapp.App.o = r4;
        if (r1 == 0) goto L_0x0021;
    L_0x005b:
        com.whatsapp.App.a(r4, r5);
        if (r1 == 0) goto L_0x0021;
    L_0x0060:
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 16;
        if (r0 < r2) goto L_0x0021;
    L_0x0066:
        r0 = de.greenrobot.event.g.b();
        r2 = com.whatsapp.bz.class;
        r0 = r0.b(r2);
        r0 = (com.whatsapp.bz) r0;
        r2 = com.whatsapp.Conversation.r();
        if (r2 == 0) goto L_0x008e;
    L_0x0078:
        r0 = r0.a();
        if (r0 != 0) goto L_0x008e;
    L_0x007e:
        r0 = com.whatsapp.Conversation.t();
        r0 = r0.u;
        r2 = r7.e;
        r2 = r2.c;
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0091;
    L_0x008e:
        com.whatsapp.App.a(r4, r4, r4, r5);
    L_0x0091:
        if (r1 == 0) goto L_0x0021;
    L_0x0093:
        if (r1 == 0) goto L_0x0021;
    L_0x0095:
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gn.b(com.whatsapp.protocol.b, int):void");
    }

    public void a(b bVar) {
        int i = App.az;
        if (bVar != null) {
            App.a(z[2], bVar);
            if (!bVar.e.b) {
                App.h(bVar);
                if (i == 0) {
                    return;
                }
            }
            if (bVar.a == 6) {
                if (bVar instanceof at) {
                    App.a(((at) bVar).P);
                    if (i == 0) {
                        return;
                    }
                }
                if (bVar.k == 6) {
                    App.a(bVar.e.a, bVar.e.c, z[1]);
                    if (i == 0) {
                        return;
                    }
                }
                return;
            }
            if (z[0].equals(bVar.u)) {
                App.d(bVar.e.a, 200);
            }
        }
    }

    public void a(b bVar, boolean z) {
        if (bVar != null) {
            App.a(z[10], bVar);
            Log.i(z[11] + z);
            App.h(bVar);
            if (!bVar.e.b && z && App.n(bVar) && App.b(bVar)) {
                s3.a().a(bVar);
            }
        }
    }

    public void c(b bVar) {
        if (bVar.r != null && !App.af && bVar.j != 8 && System.currentTimeMillis() - bVar.D > 900000) {
            App.af = true;
            boolean f = App.f(App.p);
            if (f) {
                App.c(App.p, App.w(App.p) + 1);
                if (App.f(App.p) != f) {
                    App.s(App.p);
                }
            }
        }
    }

    public void a(Collection collection, Map map) {
        int i = App.az;
        HashMap hashMap = new HashMap();
        for (b bVar : collection) {
            Collection collection2 = (Collection) hashMap.get(bVar.e.c);
            if (collection2 == null) {
                collection2 = new ArrayList();
                hashMap.put(bVar.e.c, collection2);
            }
            collection2.add(bVar);
            if (i != 0) {
                break;
            }
        }
        for (Entry entry : hashMap.entrySet()) {
            Integer num = (Integer) map.get(entry.getKey());
            App.a((String) entry.getKey(), (Collection) entry.getValue(), num == null ? 0 : num.intValue());
            if (i != 0) {
                return;
            }
        }
    }

    private void a(long j) {
        if (!App.aN && j > 900000 && App.f(App.p)) {
            C2DMRegistrar.a(App.p);
            App.B(z[12]);
            App.aN = true;
        }
    }

    gn() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.b r12, int r13) {
        /*
        r11_this = this;
        r5 = com.whatsapp.App.az;
        if (r12 == 0) goto L_0x0135;
    L_0x0004:
        r2 = r12.j;	 Catch:{ Exception -> 0x0136 }
        r3 = 8;
        if (r2 == r3) goto L_0x0135;
    L_0x000a:
        r2 = r12.j;	 Catch:{ Exception -> 0x0138 }
        if (r2 != 0) goto L_0x0063;
    L_0x000e:
        r3 = 0;
        r2 = new android.text.SpannableString;	 Catch:{ Exception -> 0x013e }
        r4 = r12.f();	 Catch:{ Exception -> 0x013e }
        r2.<init>(r4);	 Catch:{ Exception -> 0x013e }
        r4 = 1;
        android.text.util.Linkify.addLinks(r2, r4);	 Catch:{ Exception -> 0x013e }
        r4 = 0;
        r6 = r2.length();	 Catch:{ Exception -> 0x013e }
        r7 = android.text.style.URLSpan.class;
        r2 = r2.getSpans(r4, r6, r7);	 Catch:{ Exception -> 0x013e }
        r2 = (android.text.style.URLSpan[]) r2;	 Catch:{ Exception -> 0x013e }
        if (r2 == 0) goto L_0x0143;
    L_0x002b:
        r3 = r2.length;	 Catch:{ Exception -> 0x013a }
        if (r3 <= 0) goto L_0x0143;
    L_0x002e:
        r3 = 1;
    L_0x002f:
        r4 = 0;
        if (r3 == 0) goto L_0x0340;
    L_0x0032:
        r2 = r2.length;	 Catch:{ Exception -> 0x013e }
    L_0x0033:
        r4 = r12.f();	 Catch:{ Exception -> 0x013e }
        r4 = r4.length();	 Catch:{ Exception -> 0x013e }
        if (r4 == 0) goto L_0x004e;
    L_0x003d:
        r4 = new com.whatsapp.fieldstats.m;	 Catch:{ Exception -> 0x013e }
        r4.<init>();	 Catch:{ Exception -> 0x013e }
        r6 = (double) r2;	 Catch:{ Exception -> 0x013e }
        r2 = java.lang.Double.valueOf(r6);	 Catch:{ Exception -> 0x013e }
        r4.a = r2;	 Catch:{ Exception -> 0x013e }
        r2 = com.whatsapp.App.p;	 Catch:{ Exception -> 0x013e }
        com.whatsapp.fieldstats.al.a(r2, r4);	 Catch:{ Exception -> 0x013e }
    L_0x004e:
        if (r3 == 0) goto L_0x0063;
    L_0x0050:
        r2 = com.whatsapp.ConversationRowText.a(r12);	 Catch:{ Exception -> 0x0146 }
        if (r2 == 0) goto L_0x0063;
    L_0x0056:
        r2 = com.whatsapp.App.b(r12);	 Catch:{ Exception -> 0x0148 }
        if (r2 == 0) goto L_0x0063;
    L_0x005c:
        r2 = com.whatsapp.s3.a();	 Catch:{ Exception -> 0x0148 }
        r2.a(r12);	 Catch:{ Exception -> 0x0148 }
    L_0x0063:
        r2 = r12.e;
        r2 = r2.b;
        if (r2 != 0) goto L_0x01f3;
    L_0x0069:
        r2 = java.lang.System.currentTimeMillis();
        r6 = r12.D;
        r6 = r2 - r6;
        r2 = r12.e;
        r4 = r2.c;
        r3 = com.whatsapp.v.b(r4);
        r2 = com.whatsapp.App.aT;	 Catch:{ Exception -> 0x014a }
        r8 = r12.F;	 Catch:{ Exception -> 0x014a }
        r2 = r2.b(r4, r8);	 Catch:{ Exception -> 0x014a }
        if (r2 < 0) goto L_0x008d;
    L_0x0083:
        r2 = com.whatsapp.App.aT;	 Catch:{ Exception -> 0x014a }
        r8 = r12.F;	 Catch:{ Exception -> 0x014a }
        r2.a(r4, r8);	 Catch:{ Exception -> 0x014a }
        com.whatsapp.App.u(r4);	 Catch:{ Exception -> 0x014a }
    L_0x008d:
        r2 = r3.w();	 Catch:{ Exception -> 0x014c }
        if (r2 == 0) goto L_0x0153;
    L_0x0093:
        r2 = r12.F;	 Catch:{ Exception -> 0x014e }
        if (r2 == 0) goto L_0x0150;
    L_0x0097:
        r2 = com.whatsapp.App.P;	 Catch:{ Exception -> 0x014e }
        r8 = r12.F;	 Catch:{ Exception -> 0x014e }
        r2 = r2.a(r8);	 Catch:{ Exception -> 0x014e }
    L_0x009f:
        r8 = r12.J;	 Catch:{ Exception -> 0x0156 }
        r8 = android.text.TextUtils.isEmpty(r8);	 Catch:{ Exception -> 0x0156 }
        if (r8 == 0) goto L_0x00d3;
    L_0x00a7:
        r8 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0156 }
        r8.<init>();	 Catch:{ Exception -> 0x0156 }
        r9 = z;	 Catch:{ Exception -> 0x0156 }
        r10 = 3;
        r9 = r9[r10];	 Catch:{ Exception -> 0x0156 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x0156 }
        r8 = r8.append(r4);	 Catch:{ Exception -> 0x0156 }
        r9 = z;	 Catch:{ Exception -> 0x0156 }
        r10 = 4;
        r9 = r9[r10];	 Catch:{ Exception -> 0x0156 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x0156 }
        r9 = r12.e;	 Catch:{ Exception -> 0x0156 }
        r9 = r9.toString();	 Catch:{ Exception -> 0x0156 }
        r8 = r8.append(r9);	 Catch:{ Exception -> 0x0156 }
        r8 = r8.toString();	 Catch:{ Exception -> 0x0156 }
        com.whatsapp.util.Log.w(r8);	 Catch:{ Exception -> 0x0156 }
    L_0x00d3:
        if (r2 == 0) goto L_0x00f3;
    L_0x00d5:
        r8 = r12.J;	 Catch:{ Exception -> 0x0158 }
        r8 = android.text.TextUtils.isEmpty(r8);	 Catch:{ Exception -> 0x0158 }
        if (r8 != 0) goto L_0x00f3;
    L_0x00dd:
        r8 = r12.J;	 Catch:{ Exception -> 0x015a }
        r9 = r2.t;	 Catch:{ Exception -> 0x015a }
        r8 = r8.equals(r9);	 Catch:{ Exception -> 0x015a }
        if (r8 != 0) goto L_0x00f3;
    L_0x00e7:
        r8 = r12.J;	 Catch:{ Exception -> 0x015a }
        r2.t = r8;	 Catch:{ Exception -> 0x015a }
        r8 = new com.whatsapp.ax;	 Catch:{ Exception -> 0x015a }
        r8.<init>(r11, r2);	 Catch:{ Exception -> 0x015a }
        com.whatsapp.App.b(r8);	 Catch:{ Exception -> 0x015a }
    L_0x00f3:
        r2 = com.whatsapp.App.a(r12, r3, r2);	 Catch:{ Exception -> 0x015c }
        if (r2 == 0) goto L_0x0106;
    L_0x00f9:
        r2 = com.whatsapp.App.b(r12);	 Catch:{ Exception -> 0x015e }
        if (r2 == 0) goto L_0x0106;
    L_0x00ff:
        r2 = com.whatsapp.s3.a();	 Catch:{ Exception -> 0x015e }
        r2.a(r12);	 Catch:{ Exception -> 0x015e }
    L_0x0106:
        r2 = de.greenrobot.event.g.b();
        r8 = com.whatsapp.bz.class;
        r2 = r2.b(r8);
        r2 = (com.whatsapp.bz) r2;
        r8 = com.whatsapp.Conversation.r();	 Catch:{ Exception -> 0x0160 }
        if (r8 == 0) goto L_0x01a5;
    L_0x0118:
        r2 = r2.a();	 Catch:{ Exception -> 0x0162 }
        if (r2 != 0) goto L_0x01a5;
    L_0x011e:
        r2 = com.whatsapp.Conversation.t();	 Catch:{ Exception -> 0x0164 }
        r2 = r2.u;	 Catch:{ Exception -> 0x0164 }
        r2 = r2.equals(r4);	 Catch:{ Exception -> 0x0164 }
        if (r2 == 0) goto L_0x01a5;
    L_0x012a:
        r2 = r12.r;	 Catch:{ Exception -> 0x0166 }
        if (r2 == 0) goto L_0x016a;
    L_0x012e:
        r11.a(r6);	 Catch:{ Exception -> 0x0168 }
        r2 = com.whatsapp.App.o;	 Catch:{ Exception -> 0x0168 }
        if (r2 == 0) goto L_0x016a;
    L_0x0135:
        return;
    L_0x0136:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0138 }
    L_0x0138:
        r2 = move-exception;
        throw r2;
    L_0x013a:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x013c }
    L_0x013c:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x013e }
    L_0x013e:
        r2 = move-exception;
        r2 = r3;
        r3 = r2;
        goto L_0x004e;
    L_0x0143:
        r3 = 0;
        goto L_0x002f;
    L_0x0146:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0148 }
    L_0x0148:
        r2 = move-exception;
        throw r2;
    L_0x014a:
        r2 = move-exception;
        throw r2;
    L_0x014c:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x014e }
    L_0x014e:
        r2 = move-exception;
        throw r2;
    L_0x0150:
        r2 = 0;
        goto L_0x009f;
    L_0x0153:
        r2 = r3;
        goto L_0x009f;
    L_0x0156:
        r2 = move-exception;
        throw r2;
    L_0x0158:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x015a }
    L_0x015a:
        r2 = move-exception;
        throw r2;
    L_0x015c:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x015e }
    L_0x015e:
        r2 = move-exception;
        throw r2;
    L_0x0160:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0162 }
    L_0x0162:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0164 }
    L_0x0164:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0166 }
    L_0x0166:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0168 }
    L_0x0168:
        r2 = move-exception;
        throw r2;
    L_0x016a:
        r2 = 1;
        com.whatsapp.App.o = r2;	 Catch:{ Exception -> 0x0300 }
        r2 = r3.e;	 Catch:{ Exception -> 0x0300 }
        r8 = com.whatsapp.Conversation.t();	 Catch:{ Exception -> 0x0300 }
        r8 = r8.r;	 Catch:{ Exception -> 0x0300 }
        r8 = r8.e;	 Catch:{ Exception -> 0x0300 }
        r2 = r2.equals(r8);	 Catch:{ Exception -> 0x0300 }
        if (r2 == 0) goto L_0x0195;
    L_0x017d:
        r2 = com.whatsapp.notification.q.c();	 Catch:{ Exception -> 0x0302 }
        r2.a();	 Catch:{ Exception -> 0x0302 }
        r2 = com.whatsapp.Conversation.k;	 Catch:{ Exception -> 0x0302 }
        if (r2 == 0) goto L_0x0195;
    L_0x0188:
        r2 = z;	 Catch:{ Exception -> 0x0302 }
        r8 = 9;
        r2 = r2[r8];	 Catch:{ Exception -> 0x0302 }
        r2 = android.net.Uri.parse(r2);	 Catch:{ Exception -> 0x0302 }
        com.whatsapp.App.a(r2);	 Catch:{ Exception -> 0x0302 }
    L_0x0195:
        r2 = com.whatsapp.a12.n();	 Catch:{ Exception -> 0x0304 }
        if (r2 == 0) goto L_0x01eb;
    L_0x019b:
        r2 = z;	 Catch:{ Exception -> 0x0306 }
        r8 = 8;
        r2 = r2[r8];	 Catch:{ Exception -> 0x0306 }
        r12.u = r2;	 Catch:{ Exception -> 0x0306 }
        if (r5 == 0) goto L_0x01eb;
    L_0x01a5:
        r2 = r3.a;	 Catch:{ Exception -> 0x0308 }
        r2 = r2 + 1;
        r3.a = r2;	 Catch:{ Exception -> 0x0308 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0308 }
        r8 = 16;
        if (r2 < r8) goto L_0x01b8;
    L_0x01b1:
        r2 = com.whatsapp.notification.q.c();	 Catch:{ Exception -> 0x0308 }
        r2.b(r4, r12);	 Catch:{ Exception -> 0x0308 }
    L_0x01b8:
        r2 = new com.whatsapp.px;	 Catch:{ Exception -> 0x030a }
        r2.<init>(r11, r3);	 Catch:{ Exception -> 0x030a }
        com.whatsapp.App.b(r2);	 Catch:{ Exception -> 0x030a }
        r2 = r12.r;	 Catch:{ Exception -> 0x030a }
        if (r2 == 0) goto L_0x01dc;
    L_0x01c4:
        r2 = r12.j;	 Catch:{ Exception -> 0x030c }
        r3 = 2;
        if (r2 != r3) goto L_0x01ce;
    L_0x01c9:
        r2 = r12.w;	 Catch:{ Exception -> 0x030e }
        r3 = 1;
        if (r2 == r3) goto L_0x01d7;
    L_0x01ce:
        r2 = 1;
        r3 = com.whatsapp.App.o;	 Catch:{ Exception -> 0x030e }
        com.whatsapp.App.a(r2, r3);	 Catch:{ Exception -> 0x030e }
        r2 = 1;
        com.whatsapp.App.o = r2;	 Catch:{ Exception -> 0x030e }
    L_0x01d7:
        r11.a(r6);	 Catch:{ Exception -> 0x0310 }
        if (r5 == 0) goto L_0x01eb;
    L_0x01dc:
        r2 = r12.j;	 Catch:{ Exception -> 0x0312 }
        r3 = 2;
        if (r2 != r3) goto L_0x01e6;
    L_0x01e1:
        r2 = r12.w;	 Catch:{ Exception -> 0x0314 }
        r3 = 1;
        if (r2 == r3) goto L_0x01eb;
    L_0x01e6:
        r2 = 1;
        r3 = 0;
        com.whatsapp.App.a(r2, r3);	 Catch:{ Exception -> 0x0314 }
    L_0x01eb:
        com.whatsapp.App.m(r12);	 Catch:{ Exception -> 0x0316 }
        com.whatsapp.App.h(r12);	 Catch:{ Exception -> 0x0316 }
        if (r5 == 0) goto L_0x0135;
    L_0x01f3:
        r2 = r12.e;	 Catch:{ Exception -> 0x0318 }
        r2 = r2.b;	 Catch:{ Exception -> 0x0318 }
        if (r2 == 0) goto L_0x022e;
    L_0x01f9:
        r2 = z;	 Catch:{ Exception -> 0x031a }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ Exception -> 0x031a }
        r3 = r12.u;	 Catch:{ Exception -> 0x031a }
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x031a }
        if (r2 == 0) goto L_0x022e;
    L_0x0206:
        r2 = r12.j;	 Catch:{ Exception -> 0x031c }
        r3 = 5;
        if (r2 != r3) goto L_0x021e;
    L_0x020b:
        r2 = r12.A;	 Catch:{ Exception -> 0x031e }
        if (r2 == 0) goto L_0x021e;
    L_0x020f:
        r2 = r12.A;	 Catch:{ Exception -> 0x0320 }
        r2 = r2 instanceof com.whatsapp.MediaData;	 Catch:{ Exception -> 0x0320 }
        if (r2 == 0) goto L_0x021e;
    L_0x0215:
        r2 = r12.A;	 Catch:{ Exception -> 0x0322 }
        r2 = (com.whatsapp.MediaData) r2;	 Catch:{ Exception -> 0x0322 }
        r3 = 1;
        r2.transferred = r3;	 Catch:{ Exception -> 0x0322 }
        if (r5 == 0) goto L_0x0229;
    L_0x021e:
        r2 = r12.j;	 Catch:{ Exception -> 0x0324 }
        if (r2 == 0) goto L_0x0229;
    L_0x0222:
        r2 = com.whatsapp.s3.a();	 Catch:{ Exception -> 0x0324 }
        r2.a(r12);	 Catch:{ Exception -> 0x0324 }
    L_0x0229:
        com.whatsapp.App.j(r12);	 Catch:{ Exception -> 0x0326 }
        if (r5 == 0) goto L_0x0135;
    L_0x022e:
        r2 = r12.e;	 Catch:{ Exception -> 0x0328 }
        r2 = r2.b;	 Catch:{ Exception -> 0x0328 }
        if (r2 == 0) goto L_0x025d;
    L_0x0234:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0328 }
        r2.<init>();	 Catch:{ Exception -> 0x0328 }
        r3 = com.whatsapp.App.af();	 Catch:{ Exception -> 0x0328 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0328 }
        r3 = z;	 Catch:{ Exception -> 0x0328 }
        r4 = 7;
        r3 = r3[r4];	 Catch:{ Exception -> 0x0328 }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0328 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0328 }
        r3 = r12.e;	 Catch:{ Exception -> 0x0328 }
        r3 = r3.c;	 Catch:{ Exception -> 0x0328 }
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x0328 }
        if (r2 == 0) goto L_0x025d;
    L_0x0258:
        com.whatsapp.App.m(r12);	 Catch:{ Exception -> 0x032a }
        if (r5 == 0) goto L_0x0135;
    L_0x025d:
        com.whatsapp.App.m(r12);	 Catch:{ Exception -> 0x032c }
        r2 = -1;
        if (r13 != r2) goto L_0x026b;
    L_0x0263:
        r2 = r12.a;	 Catch:{ Exception -> 0x032e }
        r3 = 6;
        if (r2 == r3) goto L_0x026b;
    L_0x0268:
        com.whatsapp.App.j(r12);	 Catch:{ Exception -> 0x032e }
    L_0x026b:
        r2 = de.greenrobot.event.g.b();
        r3 = com.whatsapp.bz.class;
        r2 = r2.b(r3);
        r2 = (com.whatsapp.bz) r2;
        r3 = com.whatsapp.bd.a(r12);	 Catch:{ Exception -> 0x0330 }
        if (r3 == 0) goto L_0x02cd;
    L_0x027d:
        r3 = com.whatsapp.Conversation.r();	 Catch:{ Exception -> 0x0332 }
        if (r3 == 0) goto L_0x0299;
    L_0x0283:
        r2 = r2.a();	 Catch:{ Exception -> 0x0334 }
        if (r2 != 0) goto L_0x0299;
    L_0x0289:
        r2 = com.whatsapp.Conversation.t();	 Catch:{ Exception -> 0x0336 }
        r2 = r2.u;	 Catch:{ Exception -> 0x0336 }
        r3 = r12.e;	 Catch:{ Exception -> 0x0336 }
        r3 = r3.c;	 Catch:{ Exception -> 0x0336 }
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x0336 }
        if (r2 != 0) goto L_0x02cd;
    L_0x0299:
        r2 = r12.k;	 Catch:{ Exception -> 0x0336 }
        r4 = 1;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x02b7;
    L_0x02a1:
        r2 = r12.e;
        r2 = r2.c;
        r2 = com.whatsapp.v.b(r2);
        r3 = r2.a;
        r3 = r3 + 1;
        r2.a = r3;
        r3 = new com.whatsapp.si;
        r3.<init>(r11, r2);
        com.whatsapp.App.b(r3);
    L_0x02b7:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0338 }
        r3 = 16;
        if (r2 < r3) goto L_0x02c8;
    L_0x02bd:
        r2 = com.whatsapp.notification.q.c();	 Catch:{ Exception -> 0x0338 }
        r3 = r12.e;	 Catch:{ Exception -> 0x0338 }
        r3 = r3.c;	 Catch:{ Exception -> 0x0338 }
        r2.b(r3, r12);	 Catch:{ Exception -> 0x0338 }
    L_0x02c8:
        r2 = 1;
        r3 = 0;
        com.whatsapp.App.a(r2, r3);
    L_0x02cd:
        r2 = r12.a;	 Catch:{ Exception -> 0x033a }
        r3 = 6;
        if (r2 != r3) goto L_0x02df;
    L_0x02d2:
        r2 = r12 instanceof com.whatsapp.at;	 Catch:{ Exception -> 0x033c }
        if (r2 == 0) goto L_0x02df;
    L_0x02d6:
        r0 = r12;
        r0 = (com.whatsapp.at) r0;	 Catch:{ Exception -> 0x033c }
        r2 = r0;
        r2 = r2.P;	 Catch:{ Exception -> 0x033c }
        com.whatsapp.App.a(r2);	 Catch:{ Exception -> 0x033c }
    L_0x02df:
        r2 = r12.a;	 Catch:{ Exception -> 0x033e }
        r3 = 6;
        if (r2 != r3) goto L_0x0135;
    L_0x02e4:
        r2 = r12.k;	 Catch:{ Exception -> 0x02fe }
        r4 = 6;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x0135;
    L_0x02ec:
        r2 = r12.e;	 Catch:{ Exception -> 0x02fe }
        r2 = r2.a;	 Catch:{ Exception -> 0x02fe }
        r3 = r12.e;	 Catch:{ Exception -> 0x02fe }
        r3 = r3.c;	 Catch:{ Exception -> 0x02fe }
        r4 = z;	 Catch:{ Exception -> 0x02fe }
        r5 = 5;
        r4 = r4[r5];	 Catch:{ Exception -> 0x02fe }
        com.whatsapp.App.a(r2, r3, r4);	 Catch:{ Exception -> 0x02fe }
        goto L_0x0135;
    L_0x02fe:
        r2 = move-exception;
        throw r2;
    L_0x0300:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0302 }
    L_0x0302:
        r2 = move-exception;
        throw r2;
    L_0x0304:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0306 }
    L_0x0306:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0308 }
    L_0x0308:
        r2 = move-exception;
        throw r2;
    L_0x030a:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x030c }
    L_0x030c:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x030e }
    L_0x030e:
        r2 = move-exception;
        throw r2;
    L_0x0310:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0312 }
    L_0x0312:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0314 }
    L_0x0314:
        r2 = move-exception;
        throw r2;
    L_0x0316:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0318 }
    L_0x0318:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x031a }
    L_0x031a:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x031c }
    L_0x031c:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x031e }
    L_0x031e:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0320 }
    L_0x0320:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0322 }
    L_0x0322:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0324 }
    L_0x0324:
        r2 = move-exception;
        throw r2;
    L_0x0326:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0328 }
    L_0x0328:
        r2 = move-exception;
        throw r2;
    L_0x032a:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x032c }
    L_0x032c:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x032e }
    L_0x032e:
        r2 = move-exception;
        throw r2;
    L_0x0330:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0332 }
    L_0x0332:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0334 }
    L_0x0334:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0336 }
    L_0x0336:
        r2 = move-exception;
        throw r2;
    L_0x0338:
        r2 = move-exception;
        throw r2;
    L_0x033a:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x033c }
    L_0x033c:
        r2 = move-exception;
        throw r2;
    L_0x033e:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x02fe }
    L_0x0340:
        r2 = r4;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gn.a(com.whatsapp.protocol.b, int):void");
    }
}
