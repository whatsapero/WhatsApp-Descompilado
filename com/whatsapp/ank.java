package com.whatsapp;

import android.media.MediaRecorder;
import com.whatsapp.util.Log;
import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class ank extends ant {
    private static boolean d;
    private static final String[] z;
    private a33 e;
    private MediaRecorder f;
    private wb g;
    private String h;
    private String i;

    static {
        String[] strArr = new String[17];
        String str = "\f_\u007f>";
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
                        i3 = 34;
                        break;
                    case ay.f /*1*/:
                        i3 = 108;
                        break;
                    case ay.n /*2*/:
                        i3 = 24;
                        break;
                    case ay.p /*3*/:
                        i3 = 78;
                        break;
                    default:
                        i3 = 62;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\f\ru<";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "T\u0003q-[P\t{!LF\tjaNP\th/LG";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\f\ry-";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\f]";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "C\u0019|'Q\r_\u007f>N";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\f\ru<";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "T\u0003q-[P\t{!LF\tjaNP\th/LG\ny'RG\b7<[N\ty=[";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\f\ry-";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "T\u0003q-[P\t{!LF\tjaMV\rj:XC\u0005t+Z";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "T\u0003q-[P\t{!LF\tjaMV\rj:XC\u0005t+Z\r\u001e}\"[C\u001f}";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\f\ru<";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "T\u0003q-[P\t{!LF\tjaMV\rj:XC\u0005t+Z\r\u001cj+NC\u001e}";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "T\u0003q-[P\t{!LF\tjaMV\rj:XC\u0005t+Z\r\u001fl/LV\ny'RG\b";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "T\u0003q-[P\t{!LF\tjaXK\u0014y/]\r\u000ey*\u001eO\u001c})\u0013\u0016Ly;ZK\u00038!\\H\t{:\u001eV\u0015h+\u0004";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "T\u0003q-[P\t{!LF\tjaXK\u0014y/]\r\tu>J[V8";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\f\ru<";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void e() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: com.whatsapp.ank.e():void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:113)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:223)
	at jadx.core.ProcessClass.process(ProcessClass.java:20)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
Caused by: java.lang.NullPointerException
*/
        /*
        r0_this = this;
        r4 = 10;
        r3 = 1;
        r0 = r6.f;
        r0.start();
        return;
        r0 = move-exception;
        r1 = z;
        r2 = 10;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r4) goto L_0x00a6;
        r1 = d;
        if (r1 != 0) goto L_0x00a6;
        r0 = r6.f;
        r0.release();
        r0 = new android.media.MediaRecorder;
        r0.<init>();
        r6.f = r0;
        r0 = r6.f;
        r0.setAudioSource(r3);
        r0 = r6.f;
        r1 = 3;
        r0.setOutputFormat(r1);
        r0 = r6.f;
        r0.setAudioEncoder(r3);
        r0 = new java.io.File;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r6.i;
        r1 = r1.append(r2);
        r2 = z;
        r3 = 12;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r6.c = r0;
        r0 = 12200; // 0x2fa8 float:1.7096E-41 double:6.0276E-320;
        r6.b = r0;
        r0 = r6.f;
        r1 = r6.c;
        r1 = r1.getAbsolutePath();
        r0.setOutputFile(r1);
        r0 = r6.f;
        r1 = com.whatsapp.ge.k;
        r2 = (long) r1;
        r4 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r2 = r2 * r4;
        r0.setMaxFileSize(r2);
        r0 = r6.f;
        r0.prepare();
        r0 = r6.f;
        r0.start();
        r0 = 1;
        d = r0;
        goto L_0x0008;
        r0 = move-exception;
        r1 = z;
        r2 = 14;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        throw r0;
        r0 = move-exception;
        r1 = z;
        r2 = 13;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        r1 = z;
        r2 = 11;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x0020;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ank.e():void");
    }

    public void f() {
        try {
            if (this.f != null) {
                this.f.stop();
            }
            try {
                if (this.g != null) {
                    this.g.removeMessages(0);
                }
                try {
                    if (this.e != null) {
                        this.e.a();
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    static a33 a(ank com_whatsapp_ank) {
        return com_whatsapp_ank.e;
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        int i = 0;
        boolean z = ant.a;
        byte[] bArr = new byte[7];
        byte[] bArr2 = new byte[8192];
        int i2 = 0;
        while (inputStream.read(bArr) == bArr.length) {
            int i3 = (((bArr[3] & 3) << 11) | ((bArr[4] & 255) << 3)) | ((bArr[5] & 224) >> 5);
            try {
                if ((bArr[2] & 192) != 64) {
                    if (i2 == 0) {
                        i2 = 1;
                        Log.w(z[15] + ((bArr[2] & 192) >> 6));
                    }
                    bArr[2] = (byte) ((bArr[2] & 60) | 64);
                }
                i3 -= bArr.length;
                if (i3 > 0) {
                    try {
                        outputStream.write(bArr);
                        inputStream.read(bArr2, 0, i3);
                        outputStream.write(bArr2, 0, i3);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                    if (!z) {
                        continue;
                        if (z) {
                            break;
                        }
                    }
                }
                i++;
                continue;
                if (z) {
                    break;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        if (i > 0) {
            try {
                Log.w(z[16] + i);
            } catch (RuntimeException e22) {
                throw e22;
            }
        }
    }

    static MediaRecorder b(ank com_whatsapp_ank) {
        return com_whatsapp_ank.f;
    }

    public ank(String str, String str2) {
        this.i = str;
        this.h = str2;
    }

    public void a() {
        try {
            if (this.f != null) {
                this.f.release();
                this.f = null;
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
        r10_this = this;
        r2 = 0;
        r3 = 1;
        r4 = com.whatsapp.ant.a;
        r0 = new android.media.MediaRecorder;
        r0.<init>();
        r10.f = r0;
        r0 = r10.f;
        r0.setAudioSource(r3);
        r1 = 0;
        r0 = z;	 Catch:{ Exception -> 0x0142 }
        r5 = 6;
        r0 = r0[r5];	 Catch:{ Exception -> 0x0142 }
        r5 = r10.h;	 Catch:{ Exception -> 0x0142 }
        r0 = r0.equals(r5);	 Catch:{ Exception -> 0x0142 }
        if (r0 == 0) goto L_0x004f;
    L_0x001e:
        r0 = new java.io.File;	 Catch:{ Exception -> 0x0142 }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0142 }
        r5.<init>();	 Catch:{ Exception -> 0x0142 }
        r6 = r10.i;	 Catch:{ Exception -> 0x0142 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x0142 }
        r6 = z;	 Catch:{ Exception -> 0x0142 }
        r7 = 0;
        r6 = r6[r7];	 Catch:{ Exception -> 0x0142 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x0142 }
        r5 = r5.toString();	 Catch:{ Exception -> 0x0142 }
        r0.<init>(r5);	 Catch:{ Exception -> 0x0142 }
        r10.c = r0;	 Catch:{ Exception -> 0x0142 }
        r0 = 12200; // 0x2fa8 float:1.7096E-41 double:6.0276E-320;
        r10.b = r0;	 Catch:{ Exception -> 0x0142 }
        r0 = r10.f;	 Catch:{ Exception -> 0x0142 }
        r5 = 1;
        r0.setOutputFormat(r5);	 Catch:{ Exception -> 0x0142 }
        r0 = r10.f;	 Catch:{ Exception -> 0x0142 }
        r5 = 1;
        r0.setAudioEncoder(r5);	 Catch:{ Exception -> 0x0142 }
        if (r4 == 0) goto L_0x010f;
    L_0x004f:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0144 }
        r5 = 10;
        if (r0 < r5) goto L_0x0059;
    L_0x0055:
        r0 = d;	 Catch:{ Exception -> 0x0146 }
        if (r0 == 0) goto L_0x008a;
    L_0x0059:
        r0 = new java.io.File;	 Catch:{ Exception -> 0x0148 }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0148 }
        r5.<init>();	 Catch:{ Exception -> 0x0148 }
        r6 = r10.i;	 Catch:{ Exception -> 0x0148 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x0148 }
        r6 = z;	 Catch:{ Exception -> 0x0148 }
        r7 = 1;
        r6 = r6[r7];	 Catch:{ Exception -> 0x0148 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x0148 }
        r5 = r5.toString();	 Catch:{ Exception -> 0x0148 }
        r0.<init>(r5);	 Catch:{ Exception -> 0x0148 }
        r10.c = r0;	 Catch:{ Exception -> 0x0148 }
        r0 = 12200; // 0x2fa8 float:1.7096E-41 double:6.0276E-320;
        r10.b = r0;	 Catch:{ Exception -> 0x0148 }
        r0 = r10.f;	 Catch:{ Exception -> 0x0148 }
        r5 = 3;
        r0.setOutputFormat(r5);	 Catch:{ Exception -> 0x0148 }
        r0 = r10.f;	 Catch:{ Exception -> 0x0148 }
        r5 = 1;
        r0.setAudioEncoder(r5);	 Catch:{ Exception -> 0x0148 }
        if (r4 == 0) goto L_0x010f;
    L_0x008a:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x014a }
        r5 = 14;
        if (r0 < r5) goto L_0x014e;
    L_0x0090:
        r0 = 22050; // 0x5622 float:3.0899E-41 double:1.0894E-319;
        r5 = 1;
        r6 = 2;
        r0 = android.media.AudioRecord.getMinBufferSize(r0, r5, r6);	 Catch:{ Exception -> 0x014a }
        if (r0 <= 0) goto L_0x014e;
    L_0x009a:
        r0 = new java.io.File;	 Catch:{ Exception -> 0x014c }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x014c }
        r5.<init>();	 Catch:{ Exception -> 0x014c }
        r6 = r10.i;	 Catch:{ Exception -> 0x014c }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x014c }
        r6 = z;	 Catch:{ Exception -> 0x014c }
        r7 = 4;
        r6 = r6[r7];	 Catch:{ Exception -> 0x014c }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x014c }
        r5 = r5.toString();	 Catch:{ Exception -> 0x014c }
        r0.<init>(r5);	 Catch:{ Exception -> 0x014c }
        r10.c = r0;	 Catch:{ Exception -> 0x014c }
        r0 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r10.b = r0;	 Catch:{ Exception -> 0x014c }
        r0 = r10.f;	 Catch:{ Exception -> 0x014c }
        r5 = 6;
        r0.setOutputFormat(r5);	 Catch:{ Exception -> 0x014c }
        r0 = r10.f;	 Catch:{ Exception -> 0x014c }
        r5 = 3;
        r0.setAudioEncoder(r5);	 Catch:{ Exception -> 0x014c }
        r0 = r10.f;	 Catch:{ Exception -> 0x014c }
        r5 = 22050; // 0x5622 float:3.0899E-41 double:1.0894E-319;
        r0.setAudioSamplingRate(r5);	 Catch:{ Exception -> 0x014c }
        r0 = r10.f;	 Catch:{ Exception -> 0x014c }
        r5 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r0.setAudioEncodingBitRate(r5);	 Catch:{ Exception -> 0x014c }
        r0 = new java.io.File;	 Catch:{ Exception -> 0x014c }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x014c }
        r5.<init>();	 Catch:{ Exception -> 0x014c }
        r6 = r10.i;	 Catch:{ Exception -> 0x014c }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x014c }
        r6 = z;	 Catch:{ Exception -> 0x014c }
        r7 = 5;
        r6 = r6[r7];	 Catch:{ Exception -> 0x014c }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x014c }
        r6 = z;	 Catch:{ Exception -> 0x014c }
        r7 = 9;
        r6 = r6[r7];	 Catch:{ Exception -> 0x014c }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x014c }
        r5 = r5.toString();	 Catch:{ Exception -> 0x014c }
        r0.<init>(r5);	 Catch:{ Exception -> 0x014c }
        r1 = new com.whatsapp.wb;	 Catch:{ Exception -> 0x0240 }
        r5 = 0;
        r1.<init>(r10, r5);	 Catch:{ Exception -> 0x0240 }
        r10.g = r1;	 Catch:{ Exception -> 0x0240 }
        r1 = r10.g;	 Catch:{ Exception -> 0x0240 }
        r5 = 0;
        r6 = 50;
        r1.sendEmptyMessageDelayed(r5, r6);	 Catch:{ Exception -> 0x0240 }
    L_0x010e:
        r1 = r0;
    L_0x010f:
        if (r1 == 0) goto L_0x011c;
    L_0x0111:
        r0 = r10.f;	 Catch:{ Exception -> 0x01a7 }
        r1 = r1.getAbsolutePath();	 Catch:{ Exception -> 0x01a7 }
        r0.setOutputFile(r1);	 Catch:{ Exception -> 0x01a7 }
        if (r4 == 0) goto L_0x0127;
    L_0x011c:
        r0 = r10.f;	 Catch:{ Exception -> 0x01a9 }
        r1 = r10.c;	 Catch:{ Exception -> 0x01a9 }
        r1 = r1.getAbsolutePath();	 Catch:{ Exception -> 0x01a9 }
        r0.setOutputFile(r1);	 Catch:{ Exception -> 0x01a9 }
    L_0x0127:
        r0 = r10.f;
        r1 = com.whatsapp.ge.k;
        r6 = (long) r1;
        r8 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r6 = r6 * r8;
        r0.setMaxFileSize(r6);
        r0 = r10.f;	 Catch:{ Exception -> 0x01ab }
        r0.prepare();	 Catch:{ Exception -> 0x01ab }
    L_0x0138:
        r0 = com.whatsapp.DialogToastActivity.i;	 Catch:{ Exception -> 0x0239 }
        if (r0 == 0) goto L_0x0141;
    L_0x013c:
        if (r4 == 0) goto L_0x023d;
    L_0x013e:
        r0 = r2;
    L_0x013f:
        com.whatsapp.ant.a = r0;
    L_0x0141:
        return;
    L_0x0142:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0144 }
    L_0x0144:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0146 }
    L_0x0146:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0148 }
    L_0x0148:
        r0 = move-exception;
        throw r0;
    L_0x014a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x014c }
    L_0x014c:
        r0 = move-exception;
        goto L_0x010f;
    L_0x014e:
        r0 = new java.io.File;	 Catch:{ Exception -> 0x01a3 }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01a3 }
        r5.<init>();	 Catch:{ Exception -> 0x01a3 }
        r6 = r10.i;	 Catch:{ Exception -> 0x01a3 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x01a3 }
        r6 = z;	 Catch:{ Exception -> 0x01a3 }
        r7 = 2;
        r6 = r6[r7];	 Catch:{ Exception -> 0x01a3 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x01a3 }
        r5 = r5.toString();	 Catch:{ Exception -> 0x01a3 }
        r0.<init>(r5);	 Catch:{ Exception -> 0x01a3 }
        r10.c = r0;	 Catch:{ Exception -> 0x01a3 }
        r0 = 16000; // 0x3e80 float:2.2421E-41 double:7.905E-320;
        r5 = 1;
        r6 = 2;
        r0 = android.media.AudioRecord.getMinBufferSize(r0, r5, r6);	 Catch:{ Exception -> 0x01a3 }
        if (r0 <= 0) goto L_0x0190;
    L_0x0177:
        r0 = 12650; // 0x316a float:1.7726E-41 double:6.25E-320;
        r10.b = r0;	 Catch:{ Exception -> 0x01a3 }
        r0 = r10.f;	 Catch:{ Exception -> 0x01a3 }
        r5 = 4;
        r0.setOutputFormat(r5);	 Catch:{ Exception -> 0x01a3 }
        r0 = r10.f;	 Catch:{ Exception -> 0x01a3 }
        r5 = 2;
        r0.setAudioEncoder(r5);	 Catch:{ Exception -> 0x01a3 }
        r0 = r10.f;	 Catch:{ Exception -> 0x01a3 }
        r5 = 16000; // 0x3e80 float:2.2421E-41 double:7.905E-320;
        r0.setAudioSamplingRate(r5);	 Catch:{ Exception -> 0x01a3 }
        if (r4 == 0) goto L_0x0244;
    L_0x0190:
        r0 = 12200; // 0x2fa8 float:1.7096E-41 double:6.0276E-320;
        r10.b = r0;	 Catch:{ Exception -> 0x01a5 }
        r0 = r10.f;	 Catch:{ Exception -> 0x01a5 }
        r5 = 3;
        r0.setOutputFormat(r5);	 Catch:{ Exception -> 0x01a5 }
        r0 = r10.f;	 Catch:{ Exception -> 0x01a5 }
        r5 = 1;
        r0.setAudioEncoder(r5);	 Catch:{ Exception -> 0x01a5 }
        r0 = r1;
        goto L_0x010e;
    L_0x01a3:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01a5 }
    L_0x01a5:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x014c }
    L_0x01a7:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x01a9 }
    L_0x01a9:
        r0 = move-exception;
        throw r0;
    L_0x01ab:
        r0 = move-exception;
        r1 = z;	 Catch:{ Exception -> 0x022c }
        r5 = 3;
        r1 = r1[r5];	 Catch:{ Exception -> 0x022c }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ Exception -> 0x022c }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x022c }
        r5 = 10;
        if (r1 < r5) goto L_0x0220;
    L_0x01ba:
        r1 = d;	 Catch:{ Exception -> 0x022c }
        if (r1 != 0) goto L_0x0220;
    L_0x01be:
        r1 = r10.f;	 Catch:{ RuntimeException -> 0x022e }
        r1.release();	 Catch:{ RuntimeException -> 0x022e }
    L_0x01c3:
        r1 = 1;
        d = r1;	 Catch:{ Exception -> 0x022a }
        r1 = new android.media.MediaRecorder;	 Catch:{ Exception -> 0x022a }
        r1.<init>();	 Catch:{ Exception -> 0x022a }
        r10.f = r1;	 Catch:{ Exception -> 0x022a }
        r1 = r10.f;	 Catch:{ Exception -> 0x022a }
        r5 = 1;
        r1.setAudioSource(r5);	 Catch:{ Exception -> 0x022a }
        r1 = new java.io.File;	 Catch:{ Exception -> 0x022a }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x022a }
        r5.<init>();	 Catch:{ Exception -> 0x022a }
        r6 = r10.i;	 Catch:{ Exception -> 0x022a }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x022a }
        r6 = z;	 Catch:{ Exception -> 0x022a }
        r7 = 7;
        r6 = r6[r7];	 Catch:{ Exception -> 0x022a }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x022a }
        r5 = r5.toString();	 Catch:{ Exception -> 0x022a }
        r1.<init>(r5);	 Catch:{ Exception -> 0x022a }
        r10.c = r1;	 Catch:{ Exception -> 0x022a }
        r1 = 12200; // 0x2fa8 float:1.7096E-41 double:6.0276E-320;
        r10.b = r1;	 Catch:{ Exception -> 0x022a }
        r1 = r10.f;	 Catch:{ Exception -> 0x022a }
        r5 = 3;
        r1.setOutputFormat(r5);	 Catch:{ Exception -> 0x022a }
        r1 = r10.f;	 Catch:{ Exception -> 0x022a }
        r5 = 1;
        r1.setAudioEncoder(r5);	 Catch:{ Exception -> 0x022a }
        r1 = r10.f;	 Catch:{ Exception -> 0x022a }
        r5 = r10.c;	 Catch:{ Exception -> 0x022a }
        r5 = r5.getAbsolutePath();	 Catch:{ Exception -> 0x022a }
        r1.setOutputFile(r5);	 Catch:{ Exception -> 0x022a }
        r1 = r10.f;	 Catch:{ Exception -> 0x022a }
        r5 = com.whatsapp.ge.k;	 Catch:{ Exception -> 0x022a }
        r6 = (long) r5;	 Catch:{ Exception -> 0x022a }
        r8 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r6 = r6 * r8;
        r1.setMaxFileSize(r6);	 Catch:{ Exception -> 0x022a }
        r1 = r10.f;	 Catch:{ Exception -> 0x022a }
        r1.prepare();	 Catch:{ Exception -> 0x022a }
        if (r4 == 0) goto L_0x0138;
    L_0x0220:
        r1 = new java.io.IOException;	 Catch:{ Exception -> 0x022a }
        r0 = r0.toString();	 Catch:{ Exception -> 0x022a }
        r1.<init>(r0);	 Catch:{ Exception -> 0x022a }
        throw r1;	 Catch:{ Exception -> 0x022a }
    L_0x022a:
        r0 = move-exception;
        throw r0;
    L_0x022c:
        r0 = move-exception;
        throw r0;
    L_0x022e:
        r1 = move-exception;
        r5 = z;
        r6 = 8;
        r5 = r5[r6];
        com.whatsapp.util.Log.b(r5, r1);
        goto L_0x01c3;
    L_0x0239:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x023b }
    L_0x023b:
        r0 = move-exception;
        throw r0;
    L_0x023d:
        r0 = r3;
        goto L_0x013f;
    L_0x0240:
        r1 = move-exception;
        r1 = r0;
        goto L_0x010f;
    L_0x0244:
        r0 = r1;
        goto L_0x010e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ank.d():void");
    }

    static String c(ank com_whatsapp_ank) {
        return com_whatsapp_ank.i;
    }

    static a33 a(ank com_whatsapp_ank, a33 com_whatsapp_a33) {
        com_whatsapp_ank.e = com_whatsapp_a33;
        return com_whatsapp_a33;
    }
}
