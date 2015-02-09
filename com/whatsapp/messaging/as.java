package com.whatsapp.messaging;

import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.dns.DnsCacheEntrySerializable;
import com.whatsapp.vk;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

final class as {
    private static final String[] m;
    private static final String[] z;
    private final Random a;
    private final String b;
    private final SSLSocketFactory c;
    private final int d;
    private final SocketFactory e;
    private final List f;
    private ao g;
    private final InetSocketAddress h;
    private int i;
    private final int j;
    private final boolean k;
    private final List l;

    public static boolean e() {
        return TextUtils.equals(z[2], App.p.getSharedPreferences(z[0], 0).getString(z[1], null));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
        r4_this = this;
        r0 = 0;
        r2 = com.whatsapp.messaging.au.a;
        r1 = com.whatsapp.messaging.p.a;	 Catch:{ IllegalStateException -> 0x00b7 }
        r3 = r4.g;	 Catch:{ IllegalStateException -> 0x00b7 }
        r3 = r3.ordinal();	 Catch:{ IllegalStateException -> 0x00b7 }
        r1 = r1[r3];	 Catch:{ IllegalStateException -> 0x00b7 }
        switch(r1) {
            case 1: goto L_0x0018;
            case 2: goto L_0x0044;
            case 3: goto L_0x004a;
            case 4: goto L_0x006e;
            case 5: goto L_0x0074;
            case 6: goto L_0x007a;
            case 7: goto L_0x0095;
            case 8: goto L_0x00af;
            default: goto L_0x0010;
        };
    L_0x0010:
        r1 = r4.g;	 Catch:{ IllegalStateException -> 0x00e7 }
        r2 = com.whatsapp.messaging.ao.END;	 Catch:{ IllegalStateException -> 0x00e7 }
        if (r1 == r2) goto L_0x0017;
    L_0x0016:
        r0 = 1;
    L_0x0017:
        return r0;
    L_0x0018:
        r1 = r4.h;	 Catch:{ IllegalStateException -> 0x00b9 }
        if (r1 == 0) goto L_0x0022;
    L_0x001c:
        r1 = com.whatsapp.messaging.ao.DEBUG_CHAT_HOST;	 Catch:{ IllegalStateException -> 0x00bb }
        r4.g = r1;	 Catch:{ IllegalStateException -> 0x00bb }
        if (r2 == 0) goto L_0x0010;
    L_0x0022:
        r1 = r4.f;	 Catch:{ IllegalStateException -> 0x00bd }
        r1 = r1.isEmpty();	 Catch:{ IllegalStateException -> 0x00bd }
        if (r1 != 0) goto L_0x0030;
    L_0x002a:
        r1 = com.whatsapp.messaging.ao.OVERRIDES;	 Catch:{ IllegalStateException -> 0x00bf }
        r4.g = r1;	 Catch:{ IllegalStateException -> 0x00bf }
        if (r2 == 0) goto L_0x0010;
    L_0x0030:
        r1 = r4.b;	 Catch:{ IllegalStateException -> 0x00c1 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IllegalStateException -> 0x00c1 }
        if (r1 != 0) goto L_0x003e;
    L_0x0038:
        r1 = com.whatsapp.messaging.ao.IP_OVERRIDE_PORT_1;	 Catch:{ IllegalStateException -> 0x00c3 }
        r4.g = r1;	 Catch:{ IllegalStateException -> 0x00c3 }
        if (r2 == 0) goto L_0x0010;
    L_0x003e:
        r1 = com.whatsapp.messaging.ao.PRIMARY;	 Catch:{ IllegalStateException -> 0x00c5 }
        r4.g = r1;	 Catch:{ IllegalStateException -> 0x00c5 }
        if (r2 == 0) goto L_0x0010;
    L_0x0044:
        r1 = com.whatsapp.messaging.ao.END;	 Catch:{ IllegalStateException -> 0x00c7 }
        r4.g = r1;	 Catch:{ IllegalStateException -> 0x00c7 }
        if (r2 == 0) goto L_0x0010;
    L_0x004a:
        r1 = r4.i;	 Catch:{ IllegalStateException -> 0x00c9 }
        r1 = r1 + 1;
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00c9 }
        r1 = r4.i;	 Catch:{ IllegalStateException -> 0x00c9 }
        r3 = r4.f;	 Catch:{ IllegalStateException -> 0x00c9 }
        r3 = r3.size();	 Catch:{ IllegalStateException -> 0x00c9 }
        if (r1 < r3) goto L_0x0010;
    L_0x005a:
        r1 = r4.b;	 Catch:{ IllegalStateException -> 0x00cb }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IllegalStateException -> 0x00cb }
        if (r1 == 0) goto L_0x0068;
    L_0x0062:
        r1 = com.whatsapp.messaging.ao.PRIMARY;	 Catch:{ IllegalStateException -> 0x00cd }
        r4.g = r1;	 Catch:{ IllegalStateException -> 0x00cd }
        if (r2 == 0) goto L_0x0010;
    L_0x0068:
        r1 = com.whatsapp.messaging.ao.IP_OVERRIDE_PORT_1;	 Catch:{ IllegalStateException -> 0x00cf }
        r4.g = r1;	 Catch:{ IllegalStateException -> 0x00cf }
        if (r2 == 0) goto L_0x0010;
    L_0x006e:
        r1 = com.whatsapp.messaging.ao.IP_OVERRIDE_PORT_2;	 Catch:{ IllegalStateException -> 0x00d1 }
        r4.g = r1;	 Catch:{ IllegalStateException -> 0x00d1 }
        if (r2 == 0) goto L_0x0010;
    L_0x0074:
        r1 = com.whatsapp.messaging.ao.PRIMARY;	 Catch:{ IllegalStateException -> 0x00d3 }
        r4.g = r1;	 Catch:{ IllegalStateException -> 0x00d3 }
        if (r2 == 0) goto L_0x0010;
    L_0x007a:
        r1 = r4.l;	 Catch:{ IllegalStateException -> 0x00d5 }
        r1 = r1.isEmpty();	 Catch:{ IllegalStateException -> 0x00d5 }
        if (r1 == 0) goto L_0x008c;
    L_0x0082:
        r1 = r4.k;	 Catch:{ IllegalStateException -> 0x00d7 }
        if (r1 == 0) goto L_0x00d9;
    L_0x0086:
        r1 = com.whatsapp.messaging.ao.HTTP;	 Catch:{ IllegalStateException -> 0x00d7 }
    L_0x0088:
        r4.g = r1;	 Catch:{ IllegalStateException -> 0x00dc }
        if (r2 == 0) goto L_0x0010;
    L_0x008c:
        r1 = com.whatsapp.messaging.ao.FALLBACKS;	 Catch:{ IllegalStateException -> 0x00de }
        r4.g = r1;	 Catch:{ IllegalStateException -> 0x00de }
        r1 = 0;
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00de }
        if (r2 == 0) goto L_0x0010;
    L_0x0095:
        r1 = r4.i;	 Catch:{ IllegalStateException -> 0x00e0 }
        r1 = r1 + 1;
        r4.i = r1;	 Catch:{ IllegalStateException -> 0x00e0 }
        r1 = r4.i;	 Catch:{ IllegalStateException -> 0x00e0 }
        r3 = r4.l;	 Catch:{ IllegalStateException -> 0x00e0 }
        r3 = r3.size();	 Catch:{ IllegalStateException -> 0x00e0 }
        if (r1 < r3) goto L_0x0010;
    L_0x00a5:
        r1 = r4.k;	 Catch:{ IllegalStateException -> 0x00e2 }
        if (r1 == 0) goto L_0x00e4;
    L_0x00a9:
        r1 = com.whatsapp.messaging.ao.HTTP;	 Catch:{ IllegalStateException -> 0x00e2 }
    L_0x00ab:
        r4.g = r1;	 Catch:{ IllegalStateException -> 0x00b5 }
        if (r2 == 0) goto L_0x0010;
    L_0x00af:
        r1 = com.whatsapp.messaging.ao.END;	 Catch:{ IllegalStateException -> 0x00b5 }
        r4.g = r1;	 Catch:{ IllegalStateException -> 0x00b5 }
        goto L_0x0010;
    L_0x00b5:
        r0 = move-exception;
        throw r0;
    L_0x00b7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b9 }
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c7 }
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00cb }
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00cf }
    L_0x00cf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d1 }
    L_0x00d1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d3 }
    L_0x00d3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d5 }
    L_0x00d5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d7 }
    L_0x00d7:
        r0 = move-exception;
        throw r0;
    L_0x00d9:
        r1 = com.whatsapp.messaging.ao.END;
        goto L_0x0088;
    L_0x00dc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;
    L_0x00e4:
        r1 = com.whatsapp.messaging.ao.END;
        goto L_0x00ab;
    L_0x00e7:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.as.c():boolean");
    }

    public OutputStream a(Socket socket) {
        try {
            return this.g == ao.HTTP ? new q(socket.getOutputStream()) : socket.getOutputStream();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static {
        String[] strArr = new String[10];
        String str = "<X\u001f#@7V\u0006~V/G-}E:Q\u0017\u007fR1T\u0017~";
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
                        i3 = 95;
                        break;
                    case ay.f /*1*/:
                        i3 = 55;
                        break;
                    case ay.n /*2*/:
                        i3 = 114;
                        break;
                    case ay.p /*3*/:
                        i3 = 13;
                        break;
                    default:
                        i3 = 55;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "f\u0006";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "<X\u001ccR<C\u001bbY\u0000D\u0017|B:Y\u0011h\u0018+E\u000bRT0Y\u001chT+\u0018W~\u0017wZ\u0017y_0SM-\u0012=\u001e";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0012B\u0001y\u0017<V\u001ea\u00172X\u0004hc0y\u0017uC\u007fQ\u001b\u007fD+";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001cV\u001ccX+\u0017\u0000hC-^\u0017{R\u007fV\u0016iE:D\u0001-G>D\u0006-R1S";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\nY\u0000hT0P\u001cdM:SR~C>C\u0017-";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001cV\u001ccX+\u0017\u0000hC-^\u0017{R\u007fD\u001dn\\:CR}V,CRhY;";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0012B\u0001y\u0017<V\u001ea\u00172X\u0004hc0y\u0017uC\u007fQ\u001b\u007fD+";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\nY\u0000hT0P\u001cdM:SR~C>C\u0017-";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    strArr = new String[16];
                    str = ":\u0006\\z_>C\u0001lG/\u0019\u001chCq";
                    obj = 9;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i = 0;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    str = ":\u0005\\z_>C\u0001lG/\u0019\u001chCq";
                    obj = 10;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    str = ":\u0004\\z_>C\u0001lG/\u0019\u001chCq";
                    obj = 11;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    str = ":\u0003\\z_>C\u0001lG/\u0019\u001chCq";
                    obj = 12;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    str = ":\u0002\\z_>C\u0001lG/\u0019\u001chCq";
                    obj = 13;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 5;
                    str = ":\u0001\\z_>C\u0001lG/\u0019\u001chCq";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ":\u0000\\z_>C\u0001lG/\u0019\u001chCq";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ":\u000f\\z_>C\u0001lG/\u0019\u001chCq";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ":\u000e\\z_>C\u0001lG/\u0019\u001chCq";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ":\u0006B#@7V\u0006~V/G\\cR+\u0019";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 10;
                    str = ":\u0006C#@7V\u0006~V/G\\cR+\u0019";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ":\u0006@#@7V\u0006~V/G\\cR+\u0019";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ":\u0006A#@7V\u0006~V/G\\cR+\u0019";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ":\u0006F#@7V\u0006~V/G\\cR+\u0019";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ":\u0006G#@7V\u0006~V/G\\cR+\u0019";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ":\u0006D#@7V\u0006~V/G\\cR+\u0019";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    m = strArr3;
                default:
                    strArr2[i] = str;
                    str = "<T";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private as(InetSocketAddress inetSocketAddress, String str, List list, Random random, boolean z) {
        int i;
        boolean z2 = au.a;
        this.g = ao.START;
        this.h = inetSocketAddress;
        this.b = str;
        this.a = random;
        this.f = new ArrayList();
        this.l = new ArrayList();
        if (list != null) {
            for (DnsCacheEntrySerializable dnsCacheEntrySerializable : list) {
                try {
                    if (dnsCacheEntrySerializable.isForceOverride()) {
                        this.f.add(dnsCacheEntrySerializable);
                        if (!z2) {
                            continue;
                            if (z2) {
                                break;
                            }
                        }
                    }
                    this.l.add(dnsCacheEntrySerializable);
                    continue;
                    if (z2) {
                        break;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        }
        this.c = aw.a();
        this.e = SocketFactory.getDefault();
        z2 = random.nextBoolean();
        if (z2) {
            i = 443;
        } else {
            i = 5222;
        }
        try {
            this.j = i;
            if (z2) {
                i = 5222;
            } else {
                i = 443;
            }
            this.d = i;
            this.k = z;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public as(InetSocketAddress inetSocketAddress, String str, List list, Random random) {
        this(inetSocketAddress, str, list, random, e());
    }

    private InetSocketAddress b() {
        try {
            List b;
            switch (p.a[this.g.ordinal()]) {
                case ay.f /*1*/:
                    throw new IllegalStateException(z[4]);
                case ay.n /*2*/:
                    return this.h;
                case ay.p /*3*/:
                    return ((DnsCacheEntrySerializable) this.f.get(this.i)).getInetSocketAddress();
                case aj.i /*4*/:
                    return new InetSocketAddress(this.b, this.j);
                case aV.r /*5*/:
                    return new InetSocketAddress(this.b, this.d);
                case aV.i /*6*/:
                    b = App.C.b(m[this.a.nextInt(m.length)]);
                    try {
                        return new InetSocketAddress((InetAddress) b.get(this.a.nextInt(b.size())), this.a.nextBoolean() ? 443 : 5222);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                case a8.s /*7*/:
                    return ((DnsCacheEntrySerializable) this.l.get(this.i)).getInetSocketAddress();
                case a8.n /*8*/:
                    b = App.C.b(m[this.a.nextInt(m.length)]);
                    return new InetSocketAddress((InetAddress) b.get(this.a.nextInt(b.size())), 80);
                case a6.D /*9*/:
                    throw new IllegalStateException(z[5]);
                default:
                    throw new IllegalStateException(z[6] + this.g);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
        throw e2;
    }

    public InputStream b(Socket socket) {
        try {
            return this.g == ao.HTTP ? new a1(socket.getInputStream()) : socket.getInputStream();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public Socket a(int i) {
        try {
            if (this.g == ao.HTTP) {
                al.a(App.p.getApplicationContext(), b.PSEUDO_HTTP_CONNECTION_ATTEMPT, Integer.valueOf(1));
            }
            SocketAddress b = b();
            boolean a = a();
            Log.a(z[3], null, new Object[]{b, Boolean.valueOf(a)});
            Socket createSocket = this.e.createSocket();
            createSocket.connect(b, i);
            if (!a) {
                return createSocket;
            }
            createSocket = this.c.createSocket(createSocket, b.getHostName(), b.getPort(), true);
            ((SSLSocket) createSocket).startHandshake();
            return createSocket;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void f() {
        try {
            if (this.g == ao.HTTP) {
                al.a(App.p.getApplicationContext(), b.PSEUDO_HTTP_CONNECTION_FAILURE, Integer.valueOf(1));
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void d() {
        try {
            if (this.g == ao.HTTP) {
                al.a(App.p.getApplicationContext(), b.PSEUDO_HTTP_CONNECTION_SUCCESS, Integer.valueOf(1));
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private boolean a() {
        try {
            switch (p.a[this.g.ordinal()]) {
                case ay.f /*1*/:
                    throw new IllegalStateException(z[8]);
                case ay.n /*2*/:
                case aj.i /*4*/:
                case aV.r /*5*/:
                case aV.i /*6*/:
                case a8.n /*8*/:
                    return false;
                case ay.p /*3*/:
                    return ((DnsCacheEntrySerializable) this.f.get(this.i)).isSecureSocket();
                case a8.s /*7*/:
                    return ((DnsCacheEntrySerializable) this.l.get(this.i)).isSecureSocket();
                case a6.D /*9*/:
                    throw new IllegalStateException(z[7]);
                default:
                    throw new IllegalStateException(z[9] + this.g);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
        throw e;
    }
}
