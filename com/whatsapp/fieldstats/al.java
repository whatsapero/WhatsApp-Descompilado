package com.whatsapp.fieldstats;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;
import com.whatsapp.vk;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.EnumMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class al {
    private static volatile OutputStream a;
    private static final EnumMap b;
    private static final byte[] c;
    private static final Handler d;
    private static final HandlerThread e;
    private static volatile long f;
    private static final EnumMap g;
    private static final String[] z;

    private static double a(Integer num) {
        return num == null ? Double.NaN : num.doubleValue();
    }

    public static void a(Context context, b bVar, Double d) {
        ByteBuffer a = s.a();
        try {
            double d2;
            byte type = bVar.getType();
            int code = bVar.getCode();
            long currentTimeMillis = System.currentTimeMillis();
            if (d == null) {
                d2 = Double.NaN;
            } else {
                d2 = d.doubleValue();
            }
            s.a(type, code, currentTimeMillis, Double.valueOf(d2), a);
            a.flip();
            a(context, a, false);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public static synchronized boolean e(Context context) {
        boolean z;
        synchronized (al.class) {
            try {
                if (new File(context.getFilesDir(), z[5]).length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
        return z;
    }

    static OutputStream b() {
        return a;
    }

    private static void a(long j, OutputStream outputStream) {
        outputStream.write(c);
        int i = (int) (j / 1000);
        outputStream.write((byte) i);
        outputStream.write((byte) (i >> 8));
        outputStream.write((byte) (i >> 16));
        outputStream.write((byte) (i >> 24));
        outputStream.flush();
    }

    private static synchronized void g(Context context) {
        synchronized (al.class) {
            try {
                i(context);
            } catch (Throwable e) {
                Log.b(z[8], e);
                f(context);
            } catch (Throwable th) {
            }
        }
    }

    static {
        String[] strArr = new String[31];
        String str = "7\u0002;<X4\u0010f$V'";
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
                        i4 = 64;
                        break;
                    case ay.f /*1*/:
                        i4 = 99;
                        break;
                    case ay.n /*2*/:
                        i4 = 72;
                        break;
                    case ay.p /*3*/:
                        i4 = 72;
                        break;
                    default:
                        i4 = 57;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "iC<'\u00194\u000b-hI%\r,!W'C=8U/\u0002,hJ4\u0002<;\u0019&\n$-\u0019h";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "5\r)*U%C<'\u0019$\u0006$-M%C8-W$\n&/\u00195\u0013$'X$C;<X4\u0010h.P,\u0006h`";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "7\u0002;<X4\u0010f$V'Mx";
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "7\u0002;<X4\u0010f$V'Mx";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "7\u0002;<X4\u0010f$V'";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "7\u0002;<X4\u0010f,P-\u0010";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    str = "5\r)*U%C<'\u00195\u0013,)M%C+)Z(\u0006,h])\u000e-&J)\f&;\u0019&\n$-";
                    i = 7;
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    strArr2 = strArr3;
                    str = "7\u0002;<X4\u0010f$V'";
                    i = 8;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "#\u0016::\\.\u0017h;@3\u0017-%\u00194\n%-\u0019)\u0010h!U,\u0006/)UzC";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "7\u0002;<X4\u0010f,P-\u0010";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "`\u00060!J4\u0010h*L4C!;\u0019.\f<hK%\u0002,)[,\u0006";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "7\u0002;<X4\u0010f$V'";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "7\u0002;<X4\u0010f$V'Mx";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "7\u0002;<X4\u0010f$V'Mx";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "0\u0006&,P.\u0004h;M!\u0017;hL0\u000f')]`\u0001$'Z+\u0006,hJ4\u0002<;\u00192\f<)M)\f&";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = ")\fh-K2\f:h[,\f+#\\$C;<X4\u0010h:V4\u0002<!V.";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "0\u0006&,P.\u0004h;M!\u0017;hL0\u000f')]`\f*$P4\u0006:)M%\u0007h,L%C<'\u0019%\u001b+-J3\n>-\u00193\n2-";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = ")L'h\\2\u0011':\u00197\u000b!$\\`\u0014:!M)\r/hI%\r,!W'C;<X4\u0010h$X3\u0017h:V4\u0002<-\u00194\n%-\u0019&\n$-";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "5\r)*U%C<'\u0019/\u0013-&\u00190\u0006&,P.\u0004h;M!\u0017;hU!\u0010<hK/\u0017)<\\`\u0017!%\\`\u0005!$\\`\u0005':\u00197\u0011!<P.\u0004";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "7\u0002;<X4\u0010f<P-\u0006;<X-\u0013";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "\t,\r0Z%\u0013<!V.C,=K)\r/hK%\u0002,h_2\f%hI%\r,!W'C;<X4\u0010h$X3\u0017h:V4\u0002<-\u00194\n%-\u0019&\n$-";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "7\u0002;<X4\u0010f<P-\u0006;<X-\u0013";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "5\r)*U%C<'\u00192\u0006),\u0019#\u0002+ \\$C,!T%\r;!V.\u0010h.P,\u0006";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "7\u0002;<X4\u0010f$V'Mx";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "5\r)*U%C<'\u00197\u0011!<\\`\u0017'hJ4\u0002<;\u0019&\n$-";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "5\r)*U%C<'\u0019/\u0013-&\u00193\u0017)<J`\u0005!$\\";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "5\r)*U%C<'\u0019#\u0011-)M%C;<X4\u0010h.P,\u0006";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "7\u0002;<X4\u0010f,P-\u0010";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "\u0013\u0017)<J";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    e = new HandlerThread(z[30]);
                    e.start();
                    d = new Handler(e.getLooper(), new b5());
                    c = new byte[]{(byte) 87, (byte) 65, (byte) 83, (byte) 84, (byte) 65, (byte) 84, (byte) 83, (byte) 1};
                    b = new EnumMap(y.class);
                    g = new EnumMap(y.class);
                default:
                    strArr2[i2] = str;
                    str = "5\r)*U%C<'\u00192\u0006&)T%C;<X4\u0010h.P,\u0006h`";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static synchronized boolean j(Context context) {
        boolean delete;
        synchronized (al.class) {
            delete = new File(context.getFilesDir(), z[14]).delete();
        }
        return delete;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r10, com.whatsapp.fieldstats.y r11, java.lang.String r12) {
        /*
        r6 = com.whatsapp.fieldstats.al.class;
        monitor-enter(r6);
        r7 = com.whatsapp.fieldstats.a1.a;	 Catch:{ all -> 0x0021 }
        r0 = b;	 Catch:{ all -> 0x0021 }
        r0 = r0.get(r11);	 Catch:{ all -> 0x0021 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0021 }
        r1 = b;	 Catch:{ IllegalStateException -> 0x001b }
        r1 = r1.containsKey(r11);	 Catch:{ IllegalStateException -> 0x001b }
        if (r1 == 0) goto L_0x002a;
    L_0x0015:
        if (r0 != 0) goto L_0x0024;
    L_0x0017:
        if (r12 != 0) goto L_0x002a;
    L_0x0019:
        monitor-exit(r6);
        return;
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x0024:
        r0 = r0.equals(r12);	 Catch:{ all -> 0x0021 }
        if (r0 != 0) goto L_0x0019;
    L_0x002a:
        r5 = com.whatsapp.fieldstats.s.b();	 Catch:{ all -> 0x0021 }
        if (r12 != 0) goto L_0x0047;
    L_0x0030:
        r0 = r11.getType();	 Catch:{ IllegalStateException -> 0x0074 }
        r1 = r11.getCode();	 Catch:{ IllegalStateException -> 0x0074 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x0074 }
        r8 = 9221120237041090560; // 0x7ff8000000000000 float:0.0 double:NaN;
        r4 = java.lang.Double.valueOf(r8);	 Catch:{ IllegalStateException -> 0x0074 }
        com.whatsapp.fieldstats.s.a(r0, r1, r2, r4, r5);	 Catch:{ IllegalStateException -> 0x0074 }
        if (r7 == 0) goto L_0x0057;
    L_0x0047:
        r0 = r11.getType();	 Catch:{ IllegalStateException -> 0x0074 }
        r1 = r11.getCode();	 Catch:{ IllegalStateException -> 0x0074 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x0074 }
        r4 = r12;
        com.whatsapp.fieldstats.s.a(r0, r1, r2, r4, r5);	 Catch:{ IllegalStateException -> 0x0074 }
    L_0x0057:
        r5.flip();	 Catch:{ IllegalStateException -> 0x0076 }
        if (r12 != 0) goto L_0x006a;
    L_0x005c:
        r0 = g;	 Catch:{ IllegalStateException -> 0x0078 }
        r1 = 0;
        r0.put(r11, r1);	 Catch:{ IllegalStateException -> 0x0078 }
        r0 = b;	 Catch:{ IllegalStateException -> 0x0078 }
        r1 = 0;
        r0.put(r11, r1);	 Catch:{ IllegalStateException -> 0x0078 }
        if (r7 == 0) goto L_0x006f;
    L_0x006a:
        r0 = b;	 Catch:{ IllegalStateException -> 0x0078 }
        r0.put(r11, r12);	 Catch:{ IllegalStateException -> 0x0078 }
    L_0x006f:
        r0 = 1;
        a(r10, r5, r0);	 Catch:{ all -> 0x0021 }
        goto L_0x0019;
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0021 }
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0021 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fieldstats.al.a(android.content.Context, com.whatsapp.fieldstats.y, java.lang.String):void");
    }

    public static synchronized byte[] q(Context context) {
        byte[] toByteArray;
        synchronized (al.class) {
            ByteArrayOutputStream byteArrayOutputStream;
            try {
                int i = a1.a;
                File file = new File(context.getFilesDir(), z[15]);
                byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                do {
                    int read = fileInputStream.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } while (i == 0);
                fileInputStream.close();
            } catch (Throwable e) {
                Log.b(e);
            } catch (Throwable e2) {
                Log.c(e2);
            } catch (Throwable th) {
            }
            toByteArray = byteArrayOutputStream.toByteArray();
        }
        return toByteArray;
    }

    public static void a(Context context, y yVar) {
        a(context, yVar, (Double) null);
    }

    private static synchronized void m(Context context) {
        DataInputStream dataInputStream;
        Throwable th;
        Throwable th2;
        synchronized (al.class) {
            try {
                DataInputStream dataInputStream2 = null;
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(new File(context.getFilesDir(), z[23])));
                    try {
                        f = dataInputStream.readLong();
                        if (dataInputStream != null) {
                            try {
                                dataInputStream.close();
                            } catch (IOException e) {
                            }
                        }
                    } catch (FileNotFoundException e2) {
                        try {
                            f = -1;
                            if (dataInputStream != null) {
                                try {
                                    dataInputStream.close();
                                } catch (IOException e3) {
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            dataInputStream2 = dataInputStream;
                            th2 = th;
                            if (dataInputStream2 != null) {
                                dataInputStream2.close();
                            }
                            throw th2;
                        }
                    } catch (Throwable th32) {
                        th = th32;
                        dataInputStream2 = dataInputStream;
                        th2 = th;
                        try {
                            Log.c(z[22], th2);
                            f = -1;
                            if (dataInputStream2 != null) {
                                try {
                                    dataInputStream2.close();
                                } catch (IOException e4) {
                                }
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            if (dataInputStream2 != null) {
                                dataInputStream2.close();
                            }
                            throw th2;
                        }
                    }
                } catch (FileNotFoundException e5) {
                    dataInputStream = null;
                    f = -1;
                    if (dataInputStream != null) {
                        dataInputStream.close();
                    }
                } catch (IOException e6) {
                    th2 = e6;
                    Log.c(z[22], th2);
                    f = -1;
                    if (dataInputStream2 != null) {
                        dataInputStream2.close();
                    }
                }
            } catch (IOException e7) {
            } catch (IllegalStateException e8) {
                throw e8;
            } catch (Throwable th5) {
            }
        }
    }

    private static synchronized void i(Context context) {
        synchronized (al.class) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(context.getFilesDir(), z[29]))));
            objectOutputStream.writeObject(g);
            objectOutputStream.writeObject(b);
            objectOutputStream.close();
        }
    }

    private static synchronized void f(Context context) {
        synchronized (al.class) {
            new File(context.getFilesDir(), z[7]).delete();
        }
    }

    public static synchronized boolean c(Context context) {
        boolean z;
        synchronized (al.class) {
            try {
                try {
                    if (new File(context.getFilesDir(), z[13]).length() >= 153600) {
                        if (o(context)) {
                            z = true;
                        }
                    }
                    z = false;
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (Throwable th) {
            }
        }
        return z;
    }

    public static void a(Context context, aw awVar) {
        double d;
        if (awVar == null) {
            d = Double.NaN;
        } else {
            d = (double) awVar.getCode();
        }
        a(context, y.PLATFORM, Double.valueOf(d));
    }

    private static synchronized boolean h(Context context) {
        boolean z;
        synchronized (al.class) {
            try {
                if (new File(context.getFilesDir(), z[25]).length() >= 524288) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
        return z;
    }

    public static void a(Context context, y yVar, Integer num) {
        a(context, yVar, Double.valueOf(a(num)));
    }

    private static synchronized void a(Context context) {
        synchronized (al.class) {
            try {
                File file = new File(context.getFilesDir(), z[9]);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis / 1000 >= 0) {
                    if (currentTimeMillis / 1000 < 4294967296L) {
                        OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                        a(currentTimeMillis, bufferedOutputStream);
                        a = bufferedOutputStream;
                    }
                }
                throw new IllegalStateException(z[10] + currentTimeMillis);
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (Throwable th) {
            }
        }
    }

    private static synchronized void a() {
        synchronized (al.class) {
            try {
                if (a != null) {
                    a.close();
                    a = null;
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
    }

    private static double a(Boolean bool) {
        if (bool == null) {
            return Double.NaN;
        }
        try {
            return (double) (bool.booleanValue() ? 1 : 0);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public static void a(Context context, y yVar, Boolean bool) {
        a(context, yVar, Double.valueOf(a(bool)));
    }

    public static synchronized void a(Context context, c cVar) {
        synchronized (al.class) {
            cVar.updateFields(context);
        }
    }

    private static synchronized boolean n(Context context) {
        boolean z = false;
        synchronized (al.class) {
            try {
                File file = new File(context.getFilesDir(), z[6]);
                if (file.exists()) {
                    if (file.length() != 0) {
                        OutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true));
                        a(System.currentTimeMillis(), bufferedOutputStream);
                        a = bufferedOutputStream;
                        z = true;
                    }
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (Throwable th) {
            }
        }
        return z;
    }

    private static synchronized void a(Context context, long j) {
        DataOutputStream dataOutputStream;
        Throwable e;
        synchronized (al.class) {
            try {
                f = j;
                DataOutputStream dataOutputStream2 = null;
                try {
                    dataOutputStream = new DataOutputStream(new FileOutputStream(new File(context.getFilesDir(), z[21])));
                    try {
                        dataOutputStream.writeLong(j);
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (IOException e2) {
                            }
                        }
                    } catch (FileNotFoundException e3) {
                        e = e3;
                        try {
                            Log.c(z[20], e);
                            if (dataOutputStream != null) {
                                try {
                                    dataOutputStream.close();
                                } catch (IOException e4) {
                                }
                            }
                        } catch (Throwable th) {
                            e = th;
                            dataOutputStream2 = dataOutputStream;
                            if (dataOutputStream2 != null) {
                                dataOutputStream2.close();
                            }
                            throw e;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        dataOutputStream2 = dataOutputStream;
                        try {
                            Log.c(z[19], e);
                            if (dataOutputStream2 != null) {
                                try {
                                    dataOutputStream2.close();
                                } catch (IOException e6) {
                                }
                            }
                        } catch (Throwable th2) {
                            e = th2;
                            if (dataOutputStream2 != null) {
                                dataOutputStream2.close();
                            }
                            throw e;
                        }
                    }
                } catch (FileNotFoundException e7) {
                    e = e7;
                    dataOutputStream = null;
                    Log.c(z[20], e);
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                    }
                } catch (IOException e8) {
                    e = e8;
                    Log.c(z[19], e);
                    if (dataOutputStream2 != null) {
                        dataOutputStream2.close();
                    }
                }
            } catch (IOException e9) {
            } catch (IllegalStateException e10) {
                throw e10;
            } catch (Throwable th3) {
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r9, com.whatsapp.fieldstats.y r10, java.lang.Double r11) {
        /*
        r8 = com.whatsapp.fieldstats.al.class;
        monitor-enter(r8);
        r0 = g;	 Catch:{ all -> 0x001f }
        r0 = r0.get(r10);	 Catch:{ all -> 0x001f }
        r0 = (java.lang.Double) r0;	 Catch:{ all -> 0x001f }
        r1 = g;	 Catch:{ IllegalStateException -> 0x0019 }
        r1 = r1.containsKey(r10);	 Catch:{ IllegalStateException -> 0x0019 }
        if (r1 == 0) goto L_0x0028;
    L_0x0013:
        if (r0 != 0) goto L_0x0022;
    L_0x0015:
        if (r11 != 0) goto L_0x0028;
    L_0x0017:
        monitor-exit(r8);
        return;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
    L_0x0022:
        r0 = r0.equals(r11);	 Catch:{ all -> 0x001f }
        if (r0 != 0) goto L_0x0017;
    L_0x0028:
        r5 = com.whatsapp.fieldstats.s.a();	 Catch:{ all -> 0x001f }
        r0 = r10.getType();	 Catch:{ IllegalStateException -> 0x0062 }
        r1 = r10.getCode();	 Catch:{ IllegalStateException -> 0x0062 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x0062 }
        if (r11 != 0) goto L_0x0064;
    L_0x003a:
        r6 = 9221120237041090560; // 0x7ff8000000000000 float:0.0 double:NaN;
    L_0x003c:
        r4 = java.lang.Double.valueOf(r6);	 Catch:{ IllegalStateException -> 0x0069 }
        com.whatsapp.fieldstats.s.a(r0, r1, r2, r4, r5);	 Catch:{ IllegalStateException -> 0x0069 }
        r5.flip();	 Catch:{ IllegalStateException -> 0x0069 }
        if (r11 != 0) goto L_0x0058;
    L_0x0048:
        r0 = g;	 Catch:{ IllegalStateException -> 0x006b }
        r1 = 0;
        r0.put(r10, r1);	 Catch:{ IllegalStateException -> 0x006b }
        r0 = b;	 Catch:{ IllegalStateException -> 0x006b }
        r1 = 0;
        r0.put(r10, r1);	 Catch:{ IllegalStateException -> 0x006b }
        r0 = com.whatsapp.fieldstats.a1.a;	 Catch:{ IllegalStateException -> 0x006b }
        if (r0 == 0) goto L_0x005d;
    L_0x0058:
        r0 = g;	 Catch:{ IllegalStateException -> 0x006b }
        r0.put(r10, r11);	 Catch:{ IllegalStateException -> 0x006b }
    L_0x005d:
        r0 = 1;
        a(r9, r5, r0);	 Catch:{ all -> 0x001f }
        goto L_0x0017;
    L_0x0062:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x001f }
    L_0x0064:
        r6 = r11.doubleValue();	 Catch:{ all -> 0x001f }
        goto L_0x003c;
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x001f }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fieldstats.al.a(android.content.Context, com.whatsapp.fieldstats.y, java.lang.Double):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void k(android.content.Context r6) {
        /*
        r2 = com.whatsapp.fieldstats.al.class;
        monitor-enter(r2);
        r0 = g;	 Catch:{ all -> 0x0050 }
        r0.clear();	 Catch:{ all -> 0x0050 }
        r0 = b;	 Catch:{ all -> 0x0050 }
        r0.clear();	 Catch:{ all -> 0x0050 }
        r3 = new java.io.File;	 Catch:{ all -> 0x0050 }
        r0 = r6.getFilesDir();	 Catch:{ all -> 0x0050 }
        r1 = z;	 Catch:{ all -> 0x0050 }
        r4 = 11;
        r1 = r1[r4];	 Catch:{ all -> 0x0050 }
        r3.<init>(r0, r1);	 Catch:{ all -> 0x0050 }
        r0 = r3.exists();	 Catch:{ Exception -> 0x004a }
        if (r0 == 0) goto L_0x0028;
    L_0x0022:
        r0 = r3.canRead();	 Catch:{ Exception -> 0x004a }
        if (r0 != 0) goto L_0x0053;
    L_0x0028:
        r0 = r3.exists();	 Catch:{ Exception -> 0x004c }
        if (r0 == 0) goto L_0x0048;
    L_0x002e:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x004e }
        r0.<init>();	 Catch:{ Exception -> 0x004e }
        r0 = r0.append(r3);	 Catch:{ Exception -> 0x004e }
        r1 = z;	 Catch:{ Exception -> 0x004e }
        r3 = 12;
        r1 = r1[r3];	 Catch:{ Exception -> 0x004e }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x004e }
        r0 = r0.toString();	 Catch:{ Exception -> 0x004e }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x004e }
    L_0x0048:
        monitor-exit(r2);
        return;
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x0053:
        r4 = new java.io.ObjectInputStream;	 Catch:{ all -> 0x0050 }
        r0 = new java.io.BufferedInputStream;	 Catch:{ all -> 0x0050 }
        r1 = new java.io.FileInputStream;	 Catch:{ all -> 0x0050 }
        r1.<init>(r3);	 Catch:{ all -> 0x0050 }
        r0.<init>(r1);	 Catch:{ all -> 0x0050 }
        r4.<init>(r0);	 Catch:{ all -> 0x0050 }
        r0 = r4.readObject();	 Catch:{ Exception -> 0x007c }
        r0 = (java.util.EnumMap) r0;	 Catch:{ Exception -> 0x007c }
        r1 = r4.readObject();	 Catch:{ Exception -> 0x007c }
        r1 = (java.util.EnumMap) r1;	 Catch:{ Exception -> 0x007c }
        r5 = g;	 Catch:{ Exception -> 0x007c }
        r5.putAll(r0);	 Catch:{ Exception -> 0x007c }
        r0 = b;	 Catch:{ Exception -> 0x007c }
        r0.putAll(r1);	 Catch:{ Exception -> 0x007c }
    L_0x0078:
        r4.close();	 Catch:{ all -> 0x0050 }
        goto L_0x0048;
    L_0x007c:
        r0 = move-exception;
        com.whatsapp.util.Log.b(r0);	 Catch:{ all -> 0x0050 }
        r3.delete();	 Catch:{ all -> 0x0050 }
        goto L_0x0078;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fieldstats.al.k(android.content.Context):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void a(android.content.Context r7, java.nio.ByteBuffer r8, boolean r9) {
        /*
        r2 = 1;
        r1 = 0;
        r3 = com.whatsapp.fieldstats.al.class;
        monitor-enter(r3);
        r0 = a;	 Catch:{ IllegalStateException -> 0x0054 }
        if (r0 != 0) goto L_0x000c;
    L_0x0009:
        n(r7);	 Catch:{ IOException -> 0x0059 }
    L_0x000c:
        r0 = a;	 Catch:{ IllegalStateException -> 0x0064 }
        if (r0 != 0) goto L_0x0016;
    L_0x0010:
        a(r7);	 Catch:{ IOException -> 0x0066 }
        p(r7);	 Catch:{ IOException -> 0x0066 }
    L_0x0016:
        r0 = a;	 Catch:{ all -> 0x0056 }
        if (r0 == 0) goto L_0x0052;
    L_0x001a:
        r0 = a;	 Catch:{ IOException -> 0x0071 }
        r4 = r8.array();	 Catch:{ IOException -> 0x0071 }
        r5 = r8.arrayOffset();	 Catch:{ IOException -> 0x0071 }
        r6 = r8.remaining();	 Catch:{ IOException -> 0x0071 }
        r0.write(r4, r5, r6);	 Catch:{ IOException -> 0x0071 }
        if (r9 != 0) goto L_0x0036;
    L_0x002d:
        r0 = d;	 Catch:{ IOException -> 0x0071 }
        r4 = 0;
        r0 = r0.hasMessages(r4);	 Catch:{ IOException -> 0x0071 }
        if (r0 == 0) goto L_0x0080;
    L_0x0036:
        r0 = r2;
    L_0x0037:
        r4 = d;	 Catch:{ IOException -> 0x0082 }
        r5 = 1;
        r4.removeMessages(r5);	 Catch:{ IOException -> 0x0082 }
        r4 = d;	 Catch:{ IOException -> 0x0082 }
        r5 = 0;
        r4.removeMessages(r5);	 Catch:{ IOException -> 0x0082 }
        r4 = d;	 Catch:{ IOException -> 0x0082 }
        if (r0 == 0) goto L_0x0084;
    L_0x0047:
        r0 = android.os.Message.obtain(r4, r1, r7);	 Catch:{ IOException -> 0x0075 }
        r1 = d;	 Catch:{ IOException -> 0x0075 }
        r4 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r1.sendMessageDelayed(r0, r4);	 Catch:{ IOException -> 0x0075 }
    L_0x0052:
        monitor-exit(r3);
        return;
    L_0x0054:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
    L_0x0059:
        r0 = move-exception;
        r4 = z;	 Catch:{ all -> 0x0056 }
        r5 = 27;
        r4 = r4[r5];	 Catch:{ all -> 0x0056 }
        com.whatsapp.util.Log.c(r4, r0);	 Catch:{ all -> 0x0056 }
        goto L_0x000c;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0056 }
    L_0x0066:
        r0 = move-exception;
        r4 = z;	 Catch:{ all -> 0x0056 }
        r5 = 28;
        r4 = r4[r5];	 Catch:{ all -> 0x0056 }
        com.whatsapp.util.Log.b(r4, r0);	 Catch:{ all -> 0x0056 }
        goto L_0x0016;
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        r1 = z;	 Catch:{ all -> 0x0056 }
        r2 = 26;
        r1 = r1[r2];	 Catch:{ all -> 0x0056 }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x0056 }
        goto L_0x0052;
    L_0x0080:
        r0 = r1;
        goto L_0x0037;
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0075 }
    L_0x0084:
        r1 = r2;
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fieldstats.al.a(android.content.Context, java.nio.ByteBuffer, boolean):void");
    }

    static void b(Context context) {
        g(context);
    }

    private static synchronized void l(Context context) {
        synchronized (al.class) {
            try {
                a();
                File file = new File(context.getFilesDir(), z[0]);
                File file2 = new File(context.getFilesDir(), z[4]);
                try {
                    if (file2.exists()) {
                        if (!file2.delete()) {
                            Log.w(z[3] + file2 + ')');
                        }
                    }
                    if (file.exists()) {
                        if (!file.renameTo(file2)) {
                            throw new IOException(z[1] + file + z[2] + file2 + ')');
                        }
                    }
                    f(context);
                    a(context, System.currentTimeMillis());
                    a(context);
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            } catch (IllegalStateException e222) {
                throw e222;
            } catch (Throwable th) {
            }
        }
    }

    public static void a(Context context, b bVar, Integer num) {
        a(context, bVar, Double.valueOf(a(num)));
    }

    public static synchronized boolean r(Context context) {
        boolean z;
        synchronized (al.class) {
            try {
                if (f == 0) {
                    m(context);
                }
                try {
                    if (f + 86400000 < System.currentTimeMillis()) {
                        if (o(context)) {
                            z = true;
                        }
                    }
                    z = false;
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            } catch (Throwable th) {
            }
        }
        return z;
    }

    public static synchronized void d(Context context) {
        synchronized (al.class) {
            try {
                k(context);
            } catch (Throwable e) {
                Log.b(z[24], e);
                f(context);
            } catch (Throwable th) {
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean o(android.content.Context r5) {
        /*
        r0 = 0;
        r2 = com.whatsapp.fieldstats.al.class;
        monitor-enter(r2);
        r1 = e(r5);	 Catch:{ IOException -> 0x001b }
        if (r1 == 0) goto L_0x0022;
    L_0x000a:
        r1 = h(r5);	 Catch:{ IOException -> 0x001b }
        if (r1 != 0) goto L_0x0022;
    L_0x0010:
        r1 = z;	 Catch:{ IOException -> 0x001d }
        r3 = 16;
        r1 = r1[r3];	 Catch:{ IOException -> 0x001d }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IOException -> 0x001d }
    L_0x0019:
        monitor-exit(r2);
        return r0;
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x0022:
        r1 = e(r5);	 Catch:{ IOException -> 0x003c }
        if (r1 == 0) goto L_0x0034;
    L_0x0028:
        r1 = z;	 Catch:{ IOException -> 0x003c }
        r3 = 18;
        r1 = r1[r3];	 Catch:{ IOException -> 0x003c }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IOException -> 0x003c }
        j(r5);	 Catch:{ IOException -> 0x003c }
    L_0x0034:
        l(r5);	 Catch:{ IOException -> 0x003e }
        p(r5);	 Catch:{ IOException -> 0x003e }
        r0 = 1;
        goto L_0x0019;
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x001f }
    L_0x003e:
        r1 = move-exception;
        r3 = z;	 Catch:{ all -> 0x001f }
        r4 = 17;
        r3 = r3[r4];	 Catch:{ all -> 0x001f }
        com.whatsapp.util.Log.b(r3, r1);	 Catch:{ all -> 0x001f }
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fieldstats.al.o(android.content.Context):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void p(android.content.Context r12) {
        /*
        r8 = com.whatsapp.fieldstats.al.class;
        monitor-enter(r8);
        r9 = com.whatsapp.fieldstats.a1.a;	 Catch:{ all -> 0x00c4 }
        r2 = a;	 Catch:{ all -> 0x00c4 }
        if (r2 == 0) goto L_0x00c0;
    L_0x0009:
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x00c4 }
        r7 = com.whatsapp.fieldstats.s.a();	 Catch:{ all -> 0x00c4 }
        r2 = g;	 Catch:{ all -> 0x00c4 }
        r2 = r2.entrySet();	 Catch:{ all -> 0x00c4 }
        r10 = r2.iterator();	 Catch:{ all -> 0x00c4 }
    L_0x001b:
        r2 = r10.hasNext();	 Catch:{ all -> 0x00c4 }
        if (r2 == 0) goto L_0x0065;
    L_0x0021:
        r2 = r10.next();	 Catch:{ all -> 0x00c4 }
        r0 = r2;
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x00c4 }
        r6 = r0;
        r2 = r6.getValue();	 Catch:{ IllegalStateException -> 0x00c2 }
        if (r2 == 0) goto L_0x0063;
    L_0x002f:
        r7.clear();	 Catch:{ IllegalStateException -> 0x00c2 }
        r2 = r6.getKey();	 Catch:{ IllegalStateException -> 0x00c2 }
        r2 = (com.whatsapp.fieldstats.y) r2;	 Catch:{ IllegalStateException -> 0x00c2 }
        r2 = r2.getType();	 Catch:{ IllegalStateException -> 0x00c2 }
        r3 = r6.getKey();	 Catch:{ IllegalStateException -> 0x00c2 }
        r3 = (com.whatsapp.fieldstats.y) r3;	 Catch:{ IllegalStateException -> 0x00c2 }
        r3 = r3.getCode();	 Catch:{ IllegalStateException -> 0x00c2 }
        r6 = r6.getValue();	 Catch:{ IllegalStateException -> 0x00c2 }
        r6 = (java.lang.Double) r6;	 Catch:{ IllegalStateException -> 0x00c2 }
        com.whatsapp.fieldstats.s.a(r2, r3, r4, r6, r7);	 Catch:{ IllegalStateException -> 0x00c2 }
        r7.flip();	 Catch:{ IllegalStateException -> 0x00c2 }
        r2 = a;	 Catch:{ IllegalStateException -> 0x00c2 }
        r3 = r7.array();	 Catch:{ IllegalStateException -> 0x00c2 }
        r6 = r7.arrayOffset();	 Catch:{ IllegalStateException -> 0x00c2 }
        r11 = r7.remaining();	 Catch:{ IllegalStateException -> 0x00c2 }
        r2.write(r3, r6, r11);	 Catch:{ IllegalStateException -> 0x00c2 }
    L_0x0063:
        if (r9 == 0) goto L_0x001b;
    L_0x0065:
        r7 = com.whatsapp.fieldstats.s.b();	 Catch:{ all -> 0x00c4 }
        r2 = b;	 Catch:{ all -> 0x00c4 }
        r2 = r2.entrySet();	 Catch:{ all -> 0x00c4 }
        r10 = r2.iterator();	 Catch:{ all -> 0x00c4 }
    L_0x0073:
        r2 = r10.hasNext();	 Catch:{ all -> 0x00c4 }
        if (r2 == 0) goto L_0x00bd;
    L_0x0079:
        r2 = r10.next();	 Catch:{ all -> 0x00c4 }
        r0 = r2;
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x00c4 }
        r6 = r0;
        r2 = r6.getValue();	 Catch:{ IllegalStateException -> 0x00c7 }
        if (r2 == 0) goto L_0x00bb;
    L_0x0087:
        r7.clear();	 Catch:{ IllegalStateException -> 0x00c7 }
        r2 = r6.getKey();	 Catch:{ IllegalStateException -> 0x00c7 }
        r2 = (com.whatsapp.fieldstats.y) r2;	 Catch:{ IllegalStateException -> 0x00c7 }
        r2 = r2.getType();	 Catch:{ IllegalStateException -> 0x00c7 }
        r3 = r6.getKey();	 Catch:{ IllegalStateException -> 0x00c7 }
        r3 = (com.whatsapp.fieldstats.y) r3;	 Catch:{ IllegalStateException -> 0x00c7 }
        r3 = r3.getCode();	 Catch:{ IllegalStateException -> 0x00c7 }
        r6 = r6.getValue();	 Catch:{ IllegalStateException -> 0x00c7 }
        r6 = (java.lang.String) r6;	 Catch:{ IllegalStateException -> 0x00c7 }
        com.whatsapp.fieldstats.s.a(r2, r3, r4, r6, r7);	 Catch:{ IllegalStateException -> 0x00c7 }
        r7.flip();	 Catch:{ IllegalStateException -> 0x00c7 }
        r2 = a;	 Catch:{ IllegalStateException -> 0x00c7 }
        r3 = r7.array();	 Catch:{ IllegalStateException -> 0x00c7 }
        r6 = r7.arrayOffset();	 Catch:{ IllegalStateException -> 0x00c7 }
        r11 = r7.remaining();	 Catch:{ IllegalStateException -> 0x00c7 }
        r2.write(r3, r6, r11);	 Catch:{ IllegalStateException -> 0x00c7 }
    L_0x00bb:
        if (r9 == 0) goto L_0x0073;
    L_0x00bd:
        g(r12);	 Catch:{ all -> 0x00c4 }
    L_0x00c0:
        monitor-exit(r8);
        return;
    L_0x00c2:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00c4 }
    L_0x00c4:
        r2 = move-exception;
        monitor-exit(r8);
        throw r2;
    L_0x00c7:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00c4 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.fieldstats.al.p(android.content.Context):void");
    }
}
