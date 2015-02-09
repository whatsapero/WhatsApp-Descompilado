package com.whatsapp;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import com.coremedia.iso.boxes.TimeToSampleBox.Entry;
import com.googlecode.mp4parser.authoring.Track;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

@TargetApi(16)
public class id {
    private static Boolean c;
    private static String f;
    private static final byte[] j;
    private static final int[] l;
    private static final String[] z;
    private long a;
    private long b;
    private long d;
    protected File e;
    private File g;
    private File h;
    private float i;
    private a1y k;
    private int m;
    private boolean n;
    private long o;
    private File p;

    public void g() {
        this.g = new File(this.e.getAbsoluteFile() + z[182]);
        try {
            d();
            if (!this.n) {
                if (!b(this.p)) {
                    e();
                }
            }
            if (!this.n) {
                a();
            }
            try {
                this.g.delete();
                if (this.h != null) {
                    this.h.delete();
                }
                try {
                    if (this.n) {
                        this.e.delete();
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        } catch (Throwable th) {
            try {
                this.g.delete();
                if (this.h != null) {
                    this.h.delete();
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        }
    }

    private static boolean b(String str) {
        if (str == null) {
            return false;
        }
        try {
            if (str.equals(z[192])) {
                return false;
            }
            try {
                if (str.equals(z[190])) {
                    return false;
                }
                try {
                    if (str.equals(z[189])) {
                        return false;
                    }
                    try {
                        if (str.equals(z[191])) {
                            return false;
                        }
                        try {
                            return !str.equals(z[188]);
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
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
    }

    public void h() {
        this.n = true;
    }

    public boolean b() {
        try {
            return this.g != null;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void d() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Iterative traversal limit reached, method: com.whatsapp.id.d():void
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r45_this = this;
        r32 = com.whatsapp.App.az;
        r34 = java.lang.System.currentTimeMillis();
        r2 = 0;
        r0 = r45;
        r0.b = r2;
        r2 = 0;
        r0 = r45;
        r0.d = r2;
        r2 = new com.whatsapp.util.bj;
        r0 = r45;
        r3 = r0.p;
        r2.<init>(r3);
        r5 = r2.e();
        r3 = r2.d();
        r4 = r2.b();
        r2 = r2.a();
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = z;
        r8 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r0 = r45;
        r7 = r0.p;
        r7 = r7.getAbsolutePath();
        r6 = r6.append(r7);
        r7 = z;
        r8 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r0 = r45;
        r7 = r0.p;
        r8 = r7.length();
        r6 = r6.append(r8);
        r7 = z;
        r8 = 48;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r4 = r6.append(r4);
        r6 = z;
        r7 = 66;
        r6 = r6[r7];
        r4 = r4.append(r6);
        r4 = r4.append(r5);
        r6 = "x";
        r4 = r4.append(r6);
        r4 = r4.append(r3);
        r6 = z;
        r7 = 37;
        r6 = r6[r7];
        r4 = r4.append(r6);
        r2 = r4.append(r2);
        r4 = z;
        r6 = 36;
        r4 = r4[r6];
        r2 = r2.append(r4);
        r0 = r45;
        r6 = r0.o;
        r2 = r2.append(r6);
        r4 = z;
        r6 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r4 = r4[r6];
        r2 = r2.append(r4);
        r0 = r45;
        r6 = r0.a;
        r2 = r2.append(r6);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        if (r5 <= r3) goto L_0x11cb;
    L_0x00bd:
        r0 = r45;	 Catch:{ IllegalStateException -> 0x0161 }
        r2 = r0.m;	 Catch:{ IllegalStateException -> 0x0161 }
        if (r5 <= r2) goto L_0x11c7;
    L_0x00c3:
        r0 = r45;
        r4 = r0.m;
        r2 = r3 * r4;
        r2 = r2 / r5;
        if (r32 == 0) goto L_0x11c4;
    L_0x00cc:
        r0 = r45;	 Catch:{ IllegalStateException -> 0x0163 }
        r6 = r0.m;	 Catch:{ IllegalStateException -> 0x0163 }
        if (r2 <= r6) goto L_0x11c4;
    L_0x00d2:
        r0 = r45;
        r2 = r0.m;
        r4 = r5 * r2;
        r3 = r4 / r3;
    L_0x00da:
        r4 = r3 * r2;
        r4 = (float) r4;
        r0 = r45;
        r5 = r0.i;
        r4 = r4 * r5;
        r9 = (int) r4;
        r11 = 30;
        r12 = android.media.MediaCodecList.getCodecCount();
        r6 = 0;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r7 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r5 = r5[r7];
        r4 = r4.append(r5);
        r4 = r4.append(r12);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = 0;
        r7 = r4;
    L_0x0106:
        if (r7 >= r12) goto L_0x11bc;
    L_0x0108:
        if (r6 != 0) goto L_0x11bc;
    L_0x010a:
        r8 = android.media.MediaCodecList.getCodecInfoAt(r7);
        r4 = r8.isEncoder();	 Catch:{ IllegalStateException -> 0x0165 }
        if (r4 != 0) goto L_0x0116;
    L_0x0114:
        if (r32 == 0) goto L_0x11b9;
    L_0x0116:
        r4 = r8.getName();	 Catch:{ IllegalStateException -> 0x0167 }
        r4 = b(r4);	 Catch:{ IllegalStateException -> 0x0167 }
        if (r4 != 0) goto L_0x0122;
    L_0x0120:
        if (r32 == 0) goto L_0x11b9;
    L_0x0122:
        r10 = r8.getSupportedTypes();
        r5 = 0;
        r4 = 0;
    L_0x0128:
        r13 = r10.length;
        if (r4 >= r13) goto L_0x0140;
    L_0x012b:
        if (r5 != 0) goto L_0x0140;
    L_0x012d:
        r13 = r10[r4];	 Catch:{ IllegalStateException -> 0x016b }
        r14 = z;	 Catch:{ IllegalStateException -> 0x016b }
        r15 = 57;	 Catch:{ IllegalStateException -> 0x016b }
        r14 = r14[r15];	 Catch:{ IllegalStateException -> 0x016b }
        r13 = r13.equals(r14);	 Catch:{ IllegalStateException -> 0x016b }
        if (r13 == 0) goto L_0x013c;
    L_0x013b:
        r5 = 1;
    L_0x013c:
        r4 = r4 + 1;
        if (r32 == 0) goto L_0x0128;
    L_0x0140:
        if (r5 == 0) goto L_0x11b9;
    L_0x0142:
        r4 = r8;
    L_0x0143:
        r5 = r7 + 1;
        if (r32 == 0) goto L_0x11c0;
    L_0x0147:
        r31 = r4;
    L_0x0149:
        if (r31 != 0) goto L_0x016d;
    L_0x014b:
        r2 = z;	 Catch:{ IllegalStateException -> 0x015f }
        r3 = 152; // 0x98 float:2.13E-43 double:7.5E-322;	 Catch:{ IllegalStateException -> 0x015f }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x015f }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x015f }
        r2 = new java.io.FileNotFoundException;	 Catch:{ IllegalStateException -> 0x015f }
        r3 = z;	 Catch:{ IllegalStateException -> 0x015f }
        r4 = 3;	 Catch:{ IllegalStateException -> 0x015f }
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x015f }
        r2.<init>(r3);	 Catch:{ IllegalStateException -> 0x015f }
        throw r2;	 Catch:{ IllegalStateException -> 0x015f }
    L_0x015f:
        r2 = move-exception;
        throw r2;
    L_0x0161:
        r2 = move-exception;
        throw r2;
    L_0x0163:
        r2 = move-exception;
        throw r2;
    L_0x0165:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0167 }
    L_0x0167:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0169 }
    L_0x0169:
        r2 = move-exception;
        throw r2;
    L_0x016b:
        r2 = move-exception;
        throw r2;
    L_0x016d:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 75;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = r31.getName();
        r4 = r4.append(r5);
        r5 = z;
        r6 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = z;
        r6 = 60;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r5 = 0;
        r4 = z;
        r6 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r4 = r4[r6];
        r0 = r31;
        r7 = r0.getCapabilitiesForType(r4);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r6 = z;
        r8 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r6 = r6[r8];
        r4 = r4.append(r6);
        r6 = r7.colorFormats;
        r6 = r6.length;
        r4 = r4.append(r6);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = 0;
    L_0x01ca:
        r6 = r7.colorFormats;
        r6 = r6.length;
        if (r4 >= r6) goto L_0x01f6;
    L_0x01cf:
        if (r5 != 0) goto L_0x01f6;
    L_0x01d1:
        r6 = r7.colorFormats;
        r6 = r6[r4];
        switch(r6) {
            case 19: goto L_0x0210;
            case 20: goto L_0x0210;
            case 21: goto L_0x0210;
            case 39: goto L_0x0210;
            case 2130706688: goto L_0x0210;
            default: goto L_0x01d8;
        };
    L_0x01d8:
        r8 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0254 }
        r8.<init>();	 Catch:{ IllegalStateException -> 0x0254 }
        r10 = z;	 Catch:{ IllegalStateException -> 0x0254 }
        r13 = 18;	 Catch:{ IllegalStateException -> 0x0254 }
        r10 = r10[r13];	 Catch:{ IllegalStateException -> 0x0254 }
        r8 = r8.append(r10);	 Catch:{ IllegalStateException -> 0x0254 }
        r6 = r8.append(r6);	 Catch:{ IllegalStateException -> 0x0254 }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x0254 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x0254 }
    L_0x01f2:
        r4 = r4 + 1;
        if (r32 == 0) goto L_0x01ca;
    L_0x01f6:
        r10 = r5;
        if (r10 != 0) goto L_0x0256;
    L_0x01f9:
        r2 = z;	 Catch:{ IllegalStateException -> 0x020e }
        r3 = 38;	 Catch:{ IllegalStateException -> 0x020e }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x020e }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x020e }
        r2 = new java.io.FileNotFoundException;	 Catch:{ IllegalStateException -> 0x020e }
        r3 = z;	 Catch:{ IllegalStateException -> 0x020e }
        r4 = 153; // 0x99 float:2.14E-43 double:7.56E-322;	 Catch:{ IllegalStateException -> 0x020e }
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x020e }
        r2.<init>(r3);	 Catch:{ IllegalStateException -> 0x020e }
        throw r2;	 Catch:{ IllegalStateException -> 0x020e }
    L_0x020e:
        r2 = move-exception;
        throw r2;
    L_0x0210:
        r8 = z;	 Catch:{ IllegalStateException -> 0x024e }
        r10 = 15;	 Catch:{ IllegalStateException -> 0x024e }
        r8 = r8[r10];	 Catch:{ IllegalStateException -> 0x024e }
        r10 = r31.getName();	 Catch:{ IllegalStateException -> 0x024e }
        r8 = r8.equals(r10);	 Catch:{ IllegalStateException -> 0x024e }
        if (r8 == 0) goto L_0x0224;
    L_0x0220:
        r8 = 19;
        if (r6 == r8) goto L_0x0227;
    L_0x0224:
        if (r32 == 0) goto L_0x11b6;
    L_0x0226:
        r5 = r6;
    L_0x0227:
        r8 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0252 }
        r8.<init>();	 Catch:{ IllegalStateException -> 0x0252 }
        r10 = z;	 Catch:{ IllegalStateException -> 0x0252 }
        r13 = 132; // 0x84 float:1.85E-43 double:6.5E-322;	 Catch:{ IllegalStateException -> 0x0252 }
        r10 = r10[r13];	 Catch:{ IllegalStateException -> 0x0252 }
        r8 = r8.append(r10);	 Catch:{ IllegalStateException -> 0x0252 }
        r8 = r8.append(r6);	 Catch:{ IllegalStateException -> 0x0252 }
        r10 = z;	 Catch:{ IllegalStateException -> 0x0252 }
        r13 = 46;	 Catch:{ IllegalStateException -> 0x0252 }
        r10 = r10[r13];	 Catch:{ IllegalStateException -> 0x0252 }
        r8 = r8.append(r10);	 Catch:{ IllegalStateException -> 0x0252 }
        r8 = r8.toString();	 Catch:{ IllegalStateException -> 0x0252 }
        com.whatsapp.util.Log.i(r8);	 Catch:{ IllegalStateException -> 0x0252 }
        if (r32 == 0) goto L_0x01f2;
    L_0x024d:
        goto L_0x01d8;
    L_0x024e:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0250 }
    L_0x0250:
        r2 = move-exception;
        throw r2;
    L_0x0252:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0254 }
    L_0x0254:
        r2 = move-exception;
        throw r2;
    L_0x0256:
        r4 = r31.getName();
        r5 = z;
        r6 = 86;
        r5 = r5[r6];
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0270;
    L_0x0266:
        r2 = r2 + 15;
        r2 = r2 & -32;
        r3 = r3 + 15;
        r3 = r3 & -32;
        if (r32 == 0) goto L_0x11b2;
    L_0x0270:
        r2 = r2 + 7;
        r5 = r2 & -16;
        r2 = r3 + 7;
        r4 = r2 & -16;
    L_0x0278:
        r2 = r31.getName();	 Catch:{ IllegalStateException -> 0x04e2 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x04e2 }
        r6 = 154; // 0x9a float:2.16E-43 double:7.6E-322;	 Catch:{ IllegalStateException -> 0x04e2 }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x04e2 }
        r2 = r2.equals(r3);	 Catch:{ IllegalStateException -> 0x04e2 }
        if (r2 == 0) goto L_0x02eb;	 Catch:{ IllegalStateException -> 0x04e2 }
    L_0x0288:
        r2 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalStateException -> 0x04e2 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x04e2 }
        r6 = 155; // 0x9b float:2.17E-43 double:7.66E-322;	 Catch:{ IllegalStateException -> 0x04e2 }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x04e2 }
        r2 = r2.equals(r3);	 Catch:{ IllegalStateException -> 0x04e2 }
        if (r2 == 0) goto L_0x02eb;
    L_0x0296:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x04e4 }
        r3 = 18;
        if (r2 >= r3) goto L_0x02eb;
    L_0x029c:
        r2 = r4 * r5;
        r3 = 306176; // 0x4ac00 float:4.29044E-40 double:1.51271E-318;
        if (r2 <= r3) goto L_0x02eb;
    L_0x02a3:
        r2 = 4689003676092596224; // 0x4112b00000000000 float:0.0 double:306176.0;
        r6 = r4 * r5;
        r6 = (double) r6;
        r2 = r2 / r6;
        r2 = java.lang.Math.sqrt(r2);
        r6 = (double) r4;
        r2 = r2 * r6;
        r2 = (int) r2;
        r6 = 4689003676092596224; // 0x4112b00000000000 float:0.0 double:306176.0;
        r3 = r4 * r5;
        r14 = (double) r3;
        r6 = r6 / r14;
        r6 = java.lang.Math.sqrt(r6);
        r4 = (double) r5;
        r4 = r4 * r6;
        r3 = (int) r4;
        r4 = r2 & -16;
        r5 = r3 & -8;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r6 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r3 = r3[r6];
        r2 = r2.append(r3);
        r2 = r2.append(r4);
        r3 = "x";
        r2 = r2.append(r3);
        r2 = r2.append(r5);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
    L_0x02eb:
        r2 = r31.getName();
        r3 = z;
        r6 = 13;
        r3 = r3[r6];
        r2 = r2.startsWith(r3);
        if (r2 == 0) goto L_0x11ae;
    L_0x02fb:
        r2 = r4 + 15;
        r2 = r2 / 16;
        r3 = r2 * 16;
        r2 = r5 + 15;
        r2 = r2 / 16;
        r2 = r2 * 16;
    L_0x0307:
        r6 = r3 / 2;
        r7 = r3 * r2;
        r6 = r6 * 2;
        r6 = r6 * r2;
        r6 = r6 / 2;
        r33 = r7 + r6;
        r6 = r31.getName();
        r36 = android.media.MediaCodec.createByCodecName(r6);
        r6 = z;
        r7 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r6 = r6[r7];
        com.whatsapp.util.Log.i(r6);
        r6 = z;
        r7 = 96;
        r6 = r6[r7];
        r6 = android.media.MediaFormat.createVideoFormat(r6, r4, r5);
        r7 = z;	 Catch:{ IllegalStateException -> 0x04e8 }
        r8 = 20;	 Catch:{ IllegalStateException -> 0x04e8 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x04e8 }
        r6.setInteger(r7, r9);	 Catch:{ IllegalStateException -> 0x04e8 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x04e8 }
        r8 = 27;	 Catch:{ IllegalStateException -> 0x04e8 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x04e8 }
        r6.setInteger(r7, r11);	 Catch:{ IllegalStateException -> 0x04e8 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x04e8 }
        r8 = 10;	 Catch:{ IllegalStateException -> 0x04e8 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x04e8 }
        r6.setInteger(r7, r10);	 Catch:{ IllegalStateException -> 0x04e8 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x04e8 }
        r8 = 42;	 Catch:{ IllegalStateException -> 0x04e8 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x04e8 }
        r8 = 10;	 Catch:{ IllegalStateException -> 0x04e8 }
        r6.setInteger(r7, r8);	 Catch:{ IllegalStateException -> 0x04e8 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x04e8 }
        r8 = 137; // 0x89 float:1.92E-43 double:6.77E-322;	 Catch:{ IllegalStateException -> 0x04e8 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x04e8 }
        r6.setInteger(r7, r3);	 Catch:{ IllegalStateException -> 0x04e8 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x04e8 }
        r7 = 6;	 Catch:{ IllegalStateException -> 0x04e8 }
        r3 = r3[r7];	 Catch:{ IllegalStateException -> 0x04e8 }
        r6.setInteger(r3, r2);	 Catch:{ IllegalStateException -> 0x04e8 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x04e8 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x04e8 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x04e8 }
        r7 = 32;	 Catch:{ IllegalStateException -> 0x04e8 }
        r3 = r3[r7];	 Catch:{ IllegalStateException -> 0x04e8 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x04e8 }
        r2 = r2.append(r6);	 Catch:{ IllegalStateException -> 0x04e8 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x04e8 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x04e8 }
        r2 = 0;	 Catch:{ IllegalStateException -> 0x04e8 }
        r3 = 0;	 Catch:{ IllegalStateException -> 0x04e8 }
        r7 = 1;	 Catch:{ IllegalStateException -> 0x04e8 }
        r0 = r36;	 Catch:{ IllegalStateException -> 0x04e8 }
        r0.configure(r6, r2, r3, r7);	 Catch:{ IllegalStateException -> 0x04e8 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x04e8 }
        r3 = 33;	 Catch:{ IllegalStateException -> 0x04e8 }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x04e8 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x04e8 }
        r36.start();	 Catch:{ IllegalStateException -> 0x04e8 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x04e8 }
        r3 = 7;	 Catch:{ IllegalStateException -> 0x04e8 }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x04e8 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x04e8 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x04e8 }
        r3 = 16;
        if (r2 != r3) goto L_0x03fa;
    L_0x03a0:
        r2 = 21;
        if (r10 != r2) goto L_0x03fa;
    L_0x03a4:
        r2 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x04ea }
        r3 = z;	 Catch:{ IllegalStateException -> 0x04ea }
        r6 = 51;	 Catch:{ IllegalStateException -> 0x04ea }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x04ea }
        r2 = r2.equals(r3);	 Catch:{ IllegalStateException -> 0x04ea }
        if (r2 != 0) goto L_0x03fa;
    L_0x03b2:
        r2 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x04ec }
        r3 = z;	 Catch:{ IllegalStateException -> 0x04ec }
        r6 = 92;	 Catch:{ IllegalStateException -> 0x04ec }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x04ec }
        r2 = r2.equals(r3);	 Catch:{ IllegalStateException -> 0x04ec }
        if (r2 != 0) goto L_0x03fa;
    L_0x03c0:
        r2 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x04ee }
        r3 = z;	 Catch:{ IllegalStateException -> 0x04ee }
        r6 = 62;	 Catch:{ IllegalStateException -> 0x04ee }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x04ee }
        r2 = r2.startsWith(r3);	 Catch:{ IllegalStateException -> 0x04ee }
        if (r2 != 0) goto L_0x03fa;
    L_0x03ce:
        r2 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x04f0 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x04f0 }
        r6 = 34;	 Catch:{ IllegalStateException -> 0x04f0 }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x04f0 }
        r2 = r2.startsWith(r3);	 Catch:{ IllegalStateException -> 0x04f0 }
        if (r2 != 0) goto L_0x03fa;
    L_0x03dc:
        r2 = z;	 Catch:{ IllegalStateException -> 0x04f2 }
        r3 = 135; // 0x87 float:1.89E-43 double:6.67E-322;	 Catch:{ IllegalStateException -> 0x04f2 }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x04f2 }
        r3 = r31.getName();	 Catch:{ IllegalStateException -> 0x04f2 }
        r2 = r2.equals(r3);	 Catch:{ IllegalStateException -> 0x04f2 }
        if (r2 == 0) goto L_0x03fa;
    L_0x03ec:
        r10 = 2141391872; // 0x7fa30c00 float:NaN double:1.057988158E-314;
        r2 = z;	 Catch:{ IllegalStateException -> 0x04f4 }
        r3 = 143; // 0x8f float:2.0E-43 double:7.07E-322;	 Catch:{ IllegalStateException -> 0x04f4 }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x04f4 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x04f4 }
        if (r32 == 0) goto L_0x0426;	 Catch:{ IllegalStateException -> 0x04f4 }
    L_0x03fa:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x04f4 }
        r3 = 16;
        if (r2 == r3) goto L_0x0406;
    L_0x0400:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x04f6 }
        r3 = 17;
        if (r2 != r3) goto L_0x0426;
    L_0x0406:
        r2 = 21;
        if (r10 != r2) goto L_0x0426;
    L_0x040a:
        r2 = z;	 Catch:{ IllegalStateException -> 0x04fa }
        r3 = 41;	 Catch:{ IllegalStateException -> 0x04fa }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x04fa }
        r3 = r31.getName();	 Catch:{ IllegalStateException -> 0x04fa }
        r2 = r2.equals(r3);	 Catch:{ IllegalStateException -> 0x04fa }
        if (r2 == 0) goto L_0x0426;
    L_0x041a:
        r10 = 2141391872; // 0x7fa30c00 float:NaN double:1.057988158E-314;
        r2 = z;
        r3 = 82;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
    L_0x0426:
        r37 = r36.getInputBuffers();
        r26 = r36.getOutputBuffers();
        r38 = new java.io.FileOutputStream;
        r0 = r45;
        r2 = r0.g;
        r0 = r38;
        r0.<init>(r2);
        r39 = r38.getChannel();
        r40 = new android.media.MediaExtractor;
        r40.<init>();
        r0 = r45;
        r2 = r0.p;
        r2 = r2.getAbsolutePath();
        r0 = r40;
        r0.setDataSource(r2);
        r6 = r40.getTrackCount();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r7 = 9;
        r3 = r3[r7];
        r2 = r2.append(r3);
        r2 = r2.append(r6);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = r4 + -1;
        r2 = r4 + -1;
        r3 = -1;
        r2 = 0;
    L_0x0473:
        if (r2 >= r6) goto L_0x11ab;
    L_0x0475:
        r0 = r40;
        r7 = r0.getTrackFormat(r2);
        r8 = z;
        r9 = 11;
        r8 = r8[r9];
        r8 = r7.getString(r8);
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r11 = z;
        r13 = 80;
        r11 = r11[r13];
        r9 = r9.append(r11);
        r9 = r9.append(r2);
        r11 = z;
        r13 = 19;
        r11 = r11[r13];
        r9 = r9.append(r11);
        r9 = r9.append(r8);
        r11 = z;
        r13 = 76;
        r11 = r11[r13];
        r9 = r9.append(r11);
        r7 = r9.append(r7);
        r7 = r7.toString();
        com.whatsapp.util.Log.i(r7);
        r7 = z;
        r9 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r7 = r7[r9];
        r7 = r8.startsWith(r7);
        if (r7 == 0) goto L_0x04ca;
    L_0x04c7:
        if (r32 == 0) goto L_0x04cf;
    L_0x04c9:
        r3 = r2;
    L_0x04ca:
        r2 = r2 + 1;
        if (r32 == 0) goto L_0x0473;
    L_0x04ce:
        r2 = r3;
    L_0x04cf:
        if (r2 >= 0) goto L_0x04fc;
    L_0x04d1:
        r2 = z;	 Catch:{ IllegalStateException -> 0x04e0 }
        r3 = 26;	 Catch:{ IllegalStateException -> 0x04e0 }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x04e0 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x04e0 }
        r2 = new com.whatsapp.util.a6;	 Catch:{ IllegalStateException -> 0x04e0 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x04e0 }
        throw r2;	 Catch:{ IllegalStateException -> 0x04e0 }
    L_0x04e0:
        r2 = move-exception;
        throw r2;
    L_0x04e2:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x04e4 }
    L_0x04e4:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x04e6 }
    L_0x04e6:
        r2 = move-exception;
        throw r2;
    L_0x04e8:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x04ea }
    L_0x04ea:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x04ec }
    L_0x04ec:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x04ee }
    L_0x04ee:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x04f0 }
    L_0x04f0:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x04f2 }
    L_0x04f2:
        r2 = move-exception;
        throw r2;
    L_0x04f4:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x04f6 }
    L_0x04f6:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x04f8 }
    L_0x04f8:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x04fa }
    L_0x04fa:
        r2 = move-exception;
        throw r2;
    L_0x04fc:
        r0 = r40;
        r9 = r0.getTrackFormat(r2);
        r3 = z;
        r6 = 43;
        r3 = r3[r6];
        r11 = r9.getString(r3);
        r3 = z;	 Catch:{ IllegalStateException -> 0x0538 }
        r6 = 84;	 Catch:{ IllegalStateException -> 0x0538 }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x0538 }
        r3 = r3.equals(r11);	 Catch:{ IllegalStateException -> 0x0538 }
        if (r3 == 0) goto L_0x053a;	 Catch:{ IllegalStateException -> 0x0538 }
    L_0x0518:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0538 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0538 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0538 }
        r4 = 23;	 Catch:{ IllegalStateException -> 0x0538 }
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0538 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0538 }
        r2 = r2.append(r11);	 Catch:{ IllegalStateException -> 0x0538 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0538 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x0538 }
        r2 = new com.whatsapp.util.a6;	 Catch:{ IllegalStateException -> 0x0538 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0538 }
        throw r2;	 Catch:{ IllegalStateException -> 0x0538 }
    L_0x0538:
        r2 = move-exception;
        throw r2;
    L_0x053a:
        r0 = r40;
        r0.selectTrack(r2);
        r2 = z;
        r3 = 45;
        r2 = r2[r3];
        r28 = r9.getLong(r2);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r6 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r3 = r3[r6];
        r2 = r2.append(r3);
        r3 = r9.toString();
        r2 = r2.append(r3);
        r3 = z;
        r6 = 50;
        r3 = r3[r6];
        r2 = r2.append(r3);
        r0 = r28;
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r6 = android.media.MediaCodec.createDecoderByType(r11);
        if (r6 != 0) goto L_0x05b5;
    L_0x057d:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x05b3 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x05b3 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x05b3 }
        r4 = 2;	 Catch:{ IllegalStateException -> 0x05b3 }
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x05b3 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x05b3 }
        r2 = r2.append(r11);	 Catch:{ IllegalStateException -> 0x05b3 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x05b3 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x05b3 }
        r2 = new java.io.FileNotFoundException;	 Catch:{ IllegalStateException -> 0x05b3 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x05b3 }
        r3.<init>();	 Catch:{ IllegalStateException -> 0x05b3 }
        r4 = z;	 Catch:{ IllegalStateException -> 0x05b3 }
        r5 = 127; // 0x7f float:1.78E-43 double:6.27E-322;	 Catch:{ IllegalStateException -> 0x05b3 }
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x05b3 }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x05b3 }
        r3 = r3.append(r11);	 Catch:{ IllegalStateException -> 0x05b3 }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x05b3 }
        r2.<init>(r3);	 Catch:{ IllegalStateException -> 0x05b3 }
        throw r2;	 Catch:{ IllegalStateException -> 0x05b3 }
    L_0x05b3:
        r2 = move-exception;
        throw r2;
    L_0x05b5:
        r2 = z;
        r3 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0dd6 }
        r7 = 17;	 Catch:{ IllegalStateException -> 0x0dd6 }
        if (r3 != r7) goto L_0x11a7;	 Catch:{ IllegalStateException -> 0x0dd6 }
    L_0x05c5:
        r3 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalStateException -> 0x0dd6 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0dd6 }
        r8 = 117; // 0x75 float:1.64E-43 double:5.8E-322;	 Catch:{ IllegalStateException -> 0x0dd6 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0dd6 }
        r3 = r3.equals(r7);	 Catch:{ IllegalStateException -> 0x0dd6 }
        if (r3 == 0) goto L_0x0de0;
    L_0x05d3:
        r3 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x0dd8 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0dd8 }
        r8 = 49;	 Catch:{ IllegalStateException -> 0x0dd8 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0dd8 }
        r3 = r3.startsWith(r7);	 Catch:{ IllegalStateException -> 0x0dd8 }
        if (r3 != 0) goto L_0x060b;
    L_0x05e1:
        r3 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x0dda }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0dda }
        r8 = 112; // 0x70 float:1.57E-43 double:5.53E-322;	 Catch:{ IllegalStateException -> 0x0dda }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0dda }
        r3 = r3.startsWith(r7);	 Catch:{ IllegalStateException -> 0x0dda }
        if (r3 != 0) goto L_0x060b;
    L_0x05ef:
        r3 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x0ddc }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0ddc }
        r8 = 149; // 0x95 float:2.09E-43 double:7.36E-322;	 Catch:{ IllegalStateException -> 0x0ddc }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0ddc }
        r3 = r3.startsWith(r7);	 Catch:{ IllegalStateException -> 0x0ddc }
        if (r3 != 0) goto L_0x060b;
    L_0x05fd:
        r3 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x0dde }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0dde }
        r8 = 119; // 0x77 float:1.67E-43 double:5.9E-322;	 Catch:{ IllegalStateException -> 0x0dde }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0dde }
        r3 = r3.startsWith(r7);	 Catch:{ IllegalStateException -> 0x0dde }
        if (r3 == 0) goto L_0x11a7;
    L_0x060b:
        r2 = new com.whatsapp.v6;
        r2.<init>(r4, r5);
        r3 = z;
        r7 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r3 = r3[r7];
        com.whatsapp.util.Log.i(r3);
        r30 = r2;
    L_0x061b:
        if (r30 != 0) goto L_0x0e07;
    L_0x061d:
        r2 = 0;
    L_0x061e:
        r3 = 0;
        r7 = 0;
        r6.configure(r9, r2, r3, r7);	 Catch:{ IllegalStateException -> 0x0e0d }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0e0d }
        r3 = 140; // 0x8c float:1.96E-43 double:6.9E-322;	 Catch:{ IllegalStateException -> 0x0e0d }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0e0d }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0e0d }
        r22 = r6;
    L_0x062e:
        r22.start();
        r2 = z;
        r3 = 21;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r41 = r22.getInputBuffers();
        r19 = r22.getOutputBuffers();
        r42 = new android.media.MediaCodec$BufferInfo;
        r42.<init>();
        r43 = new android.media.MediaCodec$BufferInfo;
        r43.<init>();
        r24 = 0;
        r0 = r45;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r2 = r0.o;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r6 = 0;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));	 Catch:{ IllegalStateException -> 0x0fb7 }
        if (r2 <= 0) goto L_0x0698;	 Catch:{ IllegalStateException -> 0x0fb7 }
    L_0x0658:
        r0 = r45;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r2 = r0.o;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r2 = r2 * r6;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r6 = 0;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r0 = r40;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r0.seekTo(r2, r6);	 Catch:{ IllegalStateException -> 0x0fb7 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0fb7 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r6 = 121; // 0x79 float:1.7E-43 double:6.0E-322;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x0fb7 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0fb7 }
        r0 = r45;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r6 = r0.o;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r6 = r6 * r8;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r2 = r2.append(r6);	 Catch:{ IllegalStateException -> 0x0fb7 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r6 = 54;	 Catch:{ IllegalStateException -> 0x0fb7 }
        r3 = r3[r6];	 Catch:{ IllegalStateException -> 0x0fb7 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0fb7 }
        r6 = r40.getSampleTime();	 Catch:{ IllegalStateException -> 0x0fb7 }
        r2 = r2.append(r6);	 Catch:{ IllegalStateException -> 0x0fb7 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0fb7 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0fb7 }
    L_0x0698:
        r2 = new com.whatsapp.VideoFrameConverter;
        r2.<init>();
        r14 = 0;
        r3 = 0;
        if (r30 == 0) goto L_0x06b6;
    L_0x06a1:
        r3 = r4 * 4;
        r3 = r3 * r5;
        r13 = java.nio.ByteBuffer.allocateDirect(r3);	 Catch:{ Exception -> 0x1124, all -> 0x111c }
        r3 = 11;	 Catch:{ Exception -> 0x1124, all -> 0x111c }
        r6 = 0;	 Catch:{ Exception -> 0x1124, all -> 0x111c }
        r7 = 0;	 Catch:{ Exception -> 0x1124, all -> 0x111c }
        r8 = r4 + -1;	 Catch:{ Exception -> 0x1124, all -> 0x111c }
        r9 = r5 + -1;	 Catch:{ Exception -> 0x1124, all -> 0x111c }
        r11 = r4;	 Catch:{ Exception -> 0x1124, all -> 0x111c }
        r12 = r5;	 Catch:{ Exception -> 0x1124, all -> 0x111c }
        r2.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ Exception -> 0x1124, all -> 0x111c }
        r3 = r13;
    L_0x06b6:
        r23 = 0;
        r6 = 0;
        r8 = r14;
    L_0x06ba:
        if (r23 != 0) goto L_0x119a;
    L_0x06bc:
        r0 = r45;	 Catch:{ IllegalStateException -> 0x0fb9 }
        r7 = r0.n;	 Catch:{ IllegalStateException -> 0x0fb9 }
        if (r7 != 0) goto L_0x119a;
    L_0x06c2:
        r27 = r6 + 1;
        if (r27 >= 0) goto L_0x06e2;
    L_0x06c6:
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0fbb }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x0fbb }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0fbb }
        r9 = 113; // 0x71 float:1.58E-43 double:5.6E-322;	 Catch:{ IllegalStateException -> 0x0fbb }
        r7 = r7[r9];	 Catch:{ IllegalStateException -> 0x0fbb }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x0fbb }
        r0 = r27;	 Catch:{ IllegalStateException -> 0x0fbb }
        r6 = r6.append(r0);	 Catch:{ IllegalStateException -> 0x0fbb }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x0fbb }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x0fbb }
    L_0x06e2:
        r6 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r22;	 Catch:{ Exception -> 0x0fbd }
        r13 = r0.dequeueInputBuffer(r6);	 Catch:{ Exception -> 0x0fbd }
        if (r27 >= 0) goto L_0x0707;
    L_0x06ed:
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x109c }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x109c }
        r7 = z;	 Catch:{ IllegalStateException -> 0x109c }
        r9 = 58;	 Catch:{ IllegalStateException -> 0x109c }
        r7 = r7[r9];	 Catch:{ IllegalStateException -> 0x109c }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x109c }
        r6 = r6.append(r13);	 Catch:{ IllegalStateException -> 0x109c }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x109c }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x109c }
    L_0x0707:
        if (r13 >= 0) goto L_0x0725;
    L_0x0709:
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x109e }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x109e }
        r7 = z;	 Catch:{ IllegalStateException -> 0x109e }
        r9 = 106; // 0x6a float:1.49E-43 double:5.24E-322;	 Catch:{ IllegalStateException -> 0x109e }
        r7 = r7[r9];	 Catch:{ IllegalStateException -> 0x109e }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x109e }
        r6 = r6.append(r13);	 Catch:{ IllegalStateException -> 0x109e }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x109e }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x109e }
        if (r32 == 0) goto L_0x119a;
    L_0x0725:
        r6 = r41[r13];	 Catch:{ Exception -> 0x0fbd }
        r7 = 0;	 Catch:{ Exception -> 0x0fbd }
        r0 = r40;	 Catch:{ Exception -> 0x0fbd }
        r6 = r0.readSampleData(r6, r7);	 Catch:{ Exception -> 0x0fbd }
        if (r6 >= 0) goto L_0x0748;	 Catch:{ Exception -> 0x0fbd }
    L_0x0730:
        r7 = z;	 Catch:{ Exception -> 0x0fbd }
        r9 = 16;	 Catch:{ Exception -> 0x0fbd }
        r7 = r7[r9];	 Catch:{ Exception -> 0x0fbd }
        com.whatsapp.util.Log.i(r7);	 Catch:{ Exception -> 0x0fbd }
        r14 = 0;	 Catch:{ Exception -> 0x0fbd }
        r15 = 0;	 Catch:{ Exception -> 0x0fbd }
        r16 = 0;	 Catch:{ Exception -> 0x0fbd }
        r18 = 4;	 Catch:{ Exception -> 0x0fbd }
        r12 = r22;	 Catch:{ Exception -> 0x0fbd }
        r12.queueInputBuffer(r13, r14, r15, r16, r18);	 Catch:{ Exception -> 0x0fbd }
        r23 = 1;
        if (r32 == 0) goto L_0x07bf;
    L_0x0748:
        if (r27 >= 0) goto L_0x0776;
    L_0x074a:
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10a0 }
        r7.<init>();	 Catch:{ IllegalStateException -> 0x10a0 }
        r9 = z;	 Catch:{ IllegalStateException -> 0x10a0 }
        r11 = 116; // 0x74 float:1.63E-43 double:5.73E-322;	 Catch:{ IllegalStateException -> 0x10a0 }
        r9 = r9[r11];	 Catch:{ IllegalStateException -> 0x10a0 }
        r7 = r7.append(r9);	 Catch:{ IllegalStateException -> 0x10a0 }
        r7 = r7.append(r6);	 Catch:{ IllegalStateException -> 0x10a0 }
        r9 = z;	 Catch:{ IllegalStateException -> 0x10a0 }
        r11 = 78;	 Catch:{ IllegalStateException -> 0x10a0 }
        r9 = r9[r11];	 Catch:{ IllegalStateException -> 0x10a0 }
        r7 = r7.append(r9);	 Catch:{ IllegalStateException -> 0x10a0 }
        r14 = r40.getSampleTime();	 Catch:{ IllegalStateException -> 0x10a0 }
        r7 = r7.append(r14);	 Catch:{ IllegalStateException -> 0x10a0 }
        r7 = r7.toString();	 Catch:{ IllegalStateException -> 0x10a0 }
        com.whatsapp.util.Log.i(r7);	 Catch:{ IllegalStateException -> 0x10a0 }
    L_0x0776:
        r14 = 0;
        r16 = r40.getSampleTime();	 Catch:{ IllegalStateException -> 0x10a2 }
        r18 = 0;	 Catch:{ IllegalStateException -> 0x10a2 }
        r12 = r22;	 Catch:{ IllegalStateException -> 0x10a2 }
        r15 = r6;	 Catch:{ IllegalStateException -> 0x10a2 }
        r12.queueInputBuffer(r13, r14, r15, r16, r18);	 Catch:{ IllegalStateException -> 0x10a2 }
        if (r27 >= 0) goto L_0x079f;	 Catch:{ IllegalStateException -> 0x10a2 }
    L_0x0785:
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10a2 }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x10a2 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x10a2 }
        r9 = 67;	 Catch:{ IllegalStateException -> 0x10a2 }
        r7 = r7[r9];	 Catch:{ IllegalStateException -> 0x10a2 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x10a2 }
        r6 = r6.append(r13);	 Catch:{ IllegalStateException -> 0x10a2 }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x10a2 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x10a2 }
    L_0x079f:
        r6 = r40.advance();	 Catch:{ Exception -> 0x0fbd }
        if (r27 >= 0) goto L_0x07bf;
    L_0x07a5:
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10a4 }
        r7.<init>();	 Catch:{ IllegalStateException -> 0x10a4 }
        r9 = z;	 Catch:{ IllegalStateException -> 0x10a4 }
        r11 = 70;	 Catch:{ IllegalStateException -> 0x10a4 }
        r9 = r9[r11];	 Catch:{ IllegalStateException -> 0x10a4 }
        r7 = r7.append(r9);	 Catch:{ IllegalStateException -> 0x10a4 }
        r6 = r7.append(r6);	 Catch:{ IllegalStateException -> 0x10a4 }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x10a4 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x10a4 }
    L_0x07bf:
        r6 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r22;	 Catch:{ Exception -> 0x0fbd }
        r1 = r42;	 Catch:{ Exception -> 0x0fbd }
        r20 = r0.dequeueOutputBuffer(r1, r6);	 Catch:{ Exception -> 0x0fbd }
        if (r27 >= 0) goto L_0x07e8;
    L_0x07cc:
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10a6 }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x10a6 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x10a6 }
        r9 = 126; // 0x7e float:1.77E-43 double:6.23E-322;	 Catch:{ IllegalStateException -> 0x10a6 }
        r7 = r7[r9];	 Catch:{ IllegalStateException -> 0x10a6 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x10a6 }
        r0 = r20;	 Catch:{ IllegalStateException -> 0x10a6 }
        r6 = r6.append(r0);	 Catch:{ IllegalStateException -> 0x10a6 }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x10a6 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x10a6 }
    L_0x07e8:
        if (r20 < 0) goto L_0x1197;
    L_0x07ea:
        r6 = 0;
        r0 = r42;	 Catch:{ Exception -> 0x0fbd }
        r12 = r0.presentationTimeUs;	 Catch:{ Exception -> 0x0fbd }
        r0 = r45;	 Catch:{ Exception -> 0x0fbd }
        r14 = r0.o;	 Catch:{ Exception -> 0x0fbd }
        r16 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x0fbd }
        r14 = r14 * r16;	 Catch:{ Exception -> 0x0fbd }
        r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));	 Catch:{ Exception -> 0x0fbd }
        if (r7 < 0) goto L_0x118f;	 Catch:{ Exception -> 0x0fbd }
    L_0x07fb:
        r12 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;	 Catch:{ Exception -> 0x0fbd }
        r0 = r36;	 Catch:{ Exception -> 0x0fbd }
        r7 = r0.dequeueInputBuffer(r12);	 Catch:{ Exception -> 0x0fbd }
        if (r27 >= 0) goto L_0x0820;
    L_0x0806:
        r9 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10a8 }
        r9.<init>();	 Catch:{ IllegalStateException -> 0x10a8 }
        r11 = z;	 Catch:{ IllegalStateException -> 0x10a8 }
        r12 = 103; // 0x67 float:1.44E-43 double:5.1E-322;	 Catch:{ IllegalStateException -> 0x10a8 }
        r11 = r11[r12];	 Catch:{ IllegalStateException -> 0x10a8 }
        r9 = r9.append(r11);	 Catch:{ IllegalStateException -> 0x10a8 }
        r9 = r9.append(r7);	 Catch:{ IllegalStateException -> 0x10a8 }
        r9 = r9.toString();	 Catch:{ IllegalStateException -> 0x10a8 }
        com.whatsapp.util.Log.i(r9);	 Catch:{ IllegalStateException -> 0x10a8 }
    L_0x0820:
        if (r7 < 0) goto L_0x1189;
    L_0x0822:
        r18 = r37[r7];	 Catch:{ Exception -> 0x0fbd }
        r18.clear();	 Catch:{ Exception -> 0x0fbd }
        if (r30 == 0) goto L_0x1186;	 Catch:{ Exception -> 0x0fbd }
    L_0x0829:
        r9 = 1;	 Catch:{ Exception -> 0x0fbd }
        r30.e();	 Catch:{ Exception -> 0x0fbd }
        r6 = 1;	 Catch:{ Exception -> 0x0fbd }
        r0 = r22;	 Catch:{ Exception -> 0x0fbd }
        r1 = r20;	 Catch:{ Exception -> 0x0fbd }
        r0.releaseOutputBuffer(r1, r6);	 Catch:{ Exception -> 0x0fbd }
        r30.d();	 Catch:{ Exception -> 0x0fbd }
        r30.b();	 Catch:{ Exception -> 0x0fbd }
        r11 = 0;	 Catch:{ Exception -> 0x0fbd }
        r12 = 0;	 Catch:{ Exception -> 0x0fbd }
        r15 = 6407; // 0x1907 float:8.978E-42 double:3.1655E-320;	 Catch:{ Exception -> 0x0fbd }
        r16 = 5121; // 0x1401 float:7.176E-42 double:2.53E-320;	 Catch:{ Exception -> 0x0fbd }
        r13 = r4;	 Catch:{ Exception -> 0x0fbd }
        r14 = r5;	 Catch:{ Exception -> 0x0fbd }
        r17 = r3;	 Catch:{ Exception -> 0x0fbd }
        android.opengl.GLES20.glReadPixels(r11, r12, r13, r14, r15, r16, r17);	 Catch:{ Exception -> 0x0fbd }
        r6 = 0;	 Catch:{ Exception -> 0x0fbd }
        r3.position(r6);	 Catch:{ Exception -> 0x0fbd }
        r0 = r18;	 Catch:{ Exception -> 0x0fbd }
        r2.a(r3, r0);	 Catch:{ Exception -> 0x0fbd }
        if (r32 == 0) goto L_0x08f2;	 Catch:{ Exception -> 0x0fbd }
    L_0x0853:
        r6 = r19[r20];	 Catch:{ Exception -> 0x0fbd }
        r0 = r42;	 Catch:{ IllegalStateException -> 0x10aa }
        r11 = r0.offset;	 Catch:{ IllegalStateException -> 0x10aa }
        r6.position(r11);	 Catch:{ IllegalStateException -> 0x10aa }
        r0 = r42;	 Catch:{ IllegalStateException -> 0x10aa }
        r11 = r0.offset;	 Catch:{ IllegalStateException -> 0x10aa }
        r0 = r42;	 Catch:{ IllegalStateException -> 0x10aa }
        r12 = r0.size;	 Catch:{ IllegalStateException -> 0x10aa }
        r11 = r11 + r12;	 Catch:{ IllegalStateException -> 0x10aa }
        r6.limit(r11);	 Catch:{ IllegalStateException -> 0x10aa }
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10aa }
        r12 = r0.d;	 Catch:{ IllegalStateException -> 0x10aa }
        r14 = 0;
        r11 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r11 == 0) goto L_0x0874;
    L_0x0872:
        if (r27 >= 0) goto L_0x08d8;
    L_0x0874:
        r11 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10ac }
        r11.<init>();	 Catch:{ IllegalStateException -> 0x10ac }
        r12 = z;	 Catch:{ IllegalStateException -> 0x10ac }
        r13 = 133; // 0x85 float:1.86E-43 double:6.57E-322;	 Catch:{ IllegalStateException -> 0x10ac }
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x10ac }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ac }
        r0 = r42;	 Catch:{ IllegalStateException -> 0x10ac }
        r12 = r0.offset;	 Catch:{ IllegalStateException -> 0x10ac }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ac }
        r12 = z;	 Catch:{ IllegalStateException -> 0x10ac }
        r13 = 64;	 Catch:{ IllegalStateException -> 0x10ac }
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x10ac }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ac }
        r0 = r42;	 Catch:{ IllegalStateException -> 0x10ac }
        r12 = r0.size;	 Catch:{ IllegalStateException -> 0x10ac }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ac }
        r12 = z;	 Catch:{ IllegalStateException -> 0x10ac }
        r13 = 25;	 Catch:{ IllegalStateException -> 0x10ac }
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x10ac }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ac }
        r0 = r42;	 Catch:{ IllegalStateException -> 0x10ac }
        r12 = r0.presentationTimeUs;	 Catch:{ IllegalStateException -> 0x10ac }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ac }
        r12 = z;	 Catch:{ IllegalStateException -> 0x10ac }
        r13 = 131; // 0x83 float:1.84E-43 double:6.47E-322;	 Catch:{ IllegalStateException -> 0x10ac }
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x10ac }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ac }
        r0 = r42;	 Catch:{ IllegalStateException -> 0x10ac }
        r12 = r0.flags;	 Catch:{ IllegalStateException -> 0x10ac }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ac }
        r12 = z;	 Catch:{ IllegalStateException -> 0x10ac }
        r13 = 134; // 0x86 float:1.88E-43 double:6.6E-322;	 Catch:{ IllegalStateException -> 0x10ac }
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x10ac }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10ac }
        r0 = r33;	 Catch:{ IllegalStateException -> 0x10ac }
        r11 = r11.append(r0);	 Catch:{ IllegalStateException -> 0x10ac }
        r11 = r11.toString();	 Catch:{ IllegalStateException -> 0x10ac }
        com.whatsapp.util.Log.i(r11);	 Catch:{ IllegalStateException -> 0x10ac }
    L_0x08d8:
        r0 = r18;	 Catch:{ IllegalStateException -> 0x10ae }
        r2.a(r6, r0);	 Catch:{ IllegalStateException -> 0x10ae }
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10ae }
        r12 = r0.d;	 Catch:{ IllegalStateException -> 0x10ae }
        r14 = 0;
        r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r6 == 0) goto L_0x08e9;
    L_0x08e7:
        if (r27 >= 0) goto L_0x08f2;
    L_0x08e9:
        r6 = z;	 Catch:{ IllegalStateException -> 0x10b0 }
        r11 = 144; // 0x90 float:2.02E-43 double:7.1E-322;	 Catch:{ IllegalStateException -> 0x10b0 }
        r6 = r6[r11];	 Catch:{ IllegalStateException -> 0x10b0 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x10b0 }
    L_0x08f2:
        r14 = 0;
        r0 = r42;	 Catch:{ IllegalStateException -> 0x10b2 }
        r0 = r0.presentationTimeUs;	 Catch:{ IllegalStateException -> 0x10b2 }
        r16 = r0;	 Catch:{ IllegalStateException -> 0x10b2 }
        r0 = r42;	 Catch:{ IllegalStateException -> 0x10b2 }
        r0 = r0.flags;	 Catch:{ IllegalStateException -> 0x10b2 }
        r18 = r0;	 Catch:{ IllegalStateException -> 0x10b2 }
        r12 = r36;	 Catch:{ IllegalStateException -> 0x10b2 }
        r13 = r7;	 Catch:{ IllegalStateException -> 0x10b2 }
        r15 = r33;	 Catch:{ IllegalStateException -> 0x10b2 }
        r12.queueInputBuffer(r13, r14, r15, r16, r18);	 Catch:{ IllegalStateException -> 0x10b2 }
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10b2 }
        r6 = r0.d;	 Catch:{ IllegalStateException -> 0x10b2 }
        r12 = 0;
        r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r6 == 0) goto L_0x0913;
    L_0x0911:
        if (r27 >= 0) goto L_0x091c;
    L_0x0913:
        r6 = z;	 Catch:{ IllegalStateException -> 0x10b4 }
        r7 = 101; // 0x65 float:1.42E-43 double:5.0E-322;	 Catch:{ IllegalStateException -> 0x10b4 }
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x10b4 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x10b4 }
    L_0x091c:
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10b6 }
        r6 = r0.d;	 Catch:{ IllegalStateException -> 0x10b6 }
        r12 = 1;	 Catch:{ IllegalStateException -> 0x10b6 }
        r6 = r6 + r12;	 Catch:{ IllegalStateException -> 0x10b6 }
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10b6 }
        r0.d = r6;	 Catch:{ IllegalStateException -> 0x10b6 }
        r0 = r42;	 Catch:{ IllegalStateException -> 0x10b6 }
        r6 = r0.presentationTimeUs;	 Catch:{ IllegalStateException -> 0x10b6 }
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10b6 }
        r12 = r0.o;	 Catch:{ IllegalStateException -> 0x10b6 }
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ IllegalStateException -> 0x10b6 }
        r12 = r12 * r14;	 Catch:{ IllegalStateException -> 0x10b6 }
        r6 = r6 - r12;	 Catch:{ IllegalStateException -> 0x10b6 }
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10b6 }
        r0.b = r6;	 Catch:{ IllegalStateException -> 0x10b6 }
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10b6 }
        r6 = r0.a;	 Catch:{ IllegalStateException -> 0x10b6 }
        r12 = 0;	 Catch:{ IllegalStateException -> 0x10b6 }
        r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));	 Catch:{ IllegalStateException -> 0x10b6 }
        if (r6 <= 0) goto L_0x0981;	 Catch:{ IllegalStateException -> 0x10b6 }
    L_0x0941:
        r0 = r42;	 Catch:{ IllegalStateException -> 0x10b6 }
        r6 = r0.presentationTimeUs;	 Catch:{ IllegalStateException -> 0x10b6 }
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10b6 }
        r12 = r0.a;	 Catch:{ IllegalStateException -> 0x10b6 }
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r12 = r12 * r14;
        r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r6 <= 0) goto L_0x0981;
    L_0x0950:
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0fbd }
        r6.<init>();	 Catch:{ Exception -> 0x0fbd }
        r7 = z;	 Catch:{ Exception -> 0x0fbd }
        r11 = 104; // 0x68 float:1.46E-43 double:5.14E-322;	 Catch:{ Exception -> 0x0fbd }
        r7 = r7[r11];	 Catch:{ Exception -> 0x0fbd }
        r6 = r6.append(r7);	 Catch:{ Exception -> 0x0fbd }
        r0 = r42;	 Catch:{ Exception -> 0x0fbd }
        r12 = r0.presentationTimeUs;	 Catch:{ Exception -> 0x0fbd }
        r6 = r6.append(r12);	 Catch:{ Exception -> 0x0fbd }
        r7 = " ";	 Catch:{ Exception -> 0x0fbd }
        r6 = r6.append(r7);	 Catch:{ Exception -> 0x0fbd }
        r0 = r45;	 Catch:{ Exception -> 0x0fbd }
        r12 = r0.a;	 Catch:{ Exception -> 0x0fbd }
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x0fbd }
        r12 = r12 * r14;	 Catch:{ Exception -> 0x0fbd }
        r6 = r6.append(r12);	 Catch:{ Exception -> 0x0fbd }
        r6 = r6.toString();	 Catch:{ Exception -> 0x0fbd }
        com.whatsapp.util.Log.i(r6);	 Catch:{ Exception -> 0x0fbd }
        r23 = 1;
    L_0x0981:
        r6 = 0;
        r6 = (r28 > r6 ? 1 : (r28 == r6 ? 0 : -1));
        if (r6 == 0) goto L_0x117f;
    L_0x0987:
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10b8 }
        r6 = r0.o;	 Catch:{ IllegalStateException -> 0x10b8 }
        r12 = 0;
        r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r6 > 0) goto L_0x10bc;
    L_0x0991:
        r6 = 0;
    L_0x0993:
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10c5 }
        r12 = r0.a;	 Catch:{ IllegalStateException -> 0x10c5 }
        r14 = 0;
        r11 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r11 > 0) goto L_0x10c7;
    L_0x099d:
        r12 = r28;
    L_0x099f:
        r14 = 100;
        r0 = r42;	 Catch:{ Exception -> 0x0fbd }
        r0 = r0.presentationTimeUs;	 Catch:{ Exception -> 0x0fbd }
        r16 = r0;	 Catch:{ Exception -> 0x0fbd }
        r16 = r16 - r6;	 Catch:{ Exception -> 0x0fbd }
        r14 = r14 * r16;	 Catch:{ Exception -> 0x0fbd }
        r6 = r12 - r6;	 Catch:{ Exception -> 0x0fbd }
        r6 = r14 / r6;	 Catch:{ Exception -> 0x0fbd }
        r6 = (int) r6;
        r0 = r24;
        if (r6 == r0) goto L_0x117f;
    L_0x09b4:
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10d0 }
        r7 = r0.k;	 Catch:{ IllegalStateException -> 0x10d0 }
        if (r7 == 0) goto L_0x117f;
    L_0x09ba:
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10d2 }
        r7 = r0.n;	 Catch:{ IllegalStateException -> 0x10d2 }
        if (r7 != 0) goto L_0x09ca;	 Catch:{ IllegalStateException -> 0x10d2 }
    L_0x09c0:
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10d2 }
        r7 = r0.k;	 Catch:{ IllegalStateException -> 0x10d2 }
        r7 = r7.a(r6);	 Catch:{ IllegalStateException -> 0x10d2 }
        if (r7 == 0) goto L_0x10d6;
    L_0x09ca:
        r7 = 1;
    L_0x09cb:
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10d9 }
        r0.n = r7;	 Catch:{ IllegalStateException -> 0x10d9 }
        r7 = 5;	 Catch:{ IllegalStateException -> 0x10d9 }
        if (r6 < r7) goto L_0x09d6;	 Catch:{ IllegalStateException -> 0x10d9 }
    L_0x09d2:
        r7 = r6 % 5;	 Catch:{ IllegalStateException -> 0x10d9 }
        if (r7 != 0) goto L_0x1176;
    L_0x09d6:
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10db }
        r7.<init>();	 Catch:{ IllegalStateException -> 0x10db }
        r11 = z;	 Catch:{ IllegalStateException -> 0x10db }
        r12 = 90;	 Catch:{ IllegalStateException -> 0x10db }
        r11 = r11[r12];	 Catch:{ IllegalStateException -> 0x10db }
        r7 = r7.append(r11);	 Catch:{ IllegalStateException -> 0x10db }
        r7 = r7.append(r6);	 Catch:{ IllegalStateException -> 0x10db }
        r11 = z;	 Catch:{ IllegalStateException -> 0x10db }
        r12 = 118; // 0x76 float:1.65E-43 double:5.83E-322;	 Catch:{ IllegalStateException -> 0x10db }
        r11 = r11[r12];	 Catch:{ IllegalStateException -> 0x10db }
        r7 = r7.append(r11);	 Catch:{ IllegalStateException -> 0x10db }
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10db }
        r12 = r0.d;	 Catch:{ IllegalStateException -> 0x10db }
        r7 = r7.append(r12);	 Catch:{ IllegalStateException -> 0x10db }
        r11 = z;	 Catch:{ IllegalStateException -> 0x10db }
        r12 = 59;	 Catch:{ IllegalStateException -> 0x10db }
        r11 = r11[r12];	 Catch:{ IllegalStateException -> 0x10db }
        r7 = r7.append(r11);	 Catch:{ IllegalStateException -> 0x10db }
        r0 = r45;	 Catch:{ IllegalStateException -> 0x10db }
        r12 = r0.b;	 Catch:{ IllegalStateException -> 0x10db }
        r7 = r7.append(r12);	 Catch:{ IllegalStateException -> 0x10db }
        r7 = r7.toString();	 Catch:{ IllegalStateException -> 0x10db }
        com.whatsapp.util.Log.i(r7);	 Catch:{ IllegalStateException -> 0x10db }
        r7 = r23;
        r44 = r9;
        r9 = r6;
        r6 = r44;
    L_0x0a1b:
        r12 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r36;	 Catch:{ Exception -> 0x0fbd }
        r1 = r43;	 Catch:{ Exception -> 0x0fbd }
        r12 = r0.dequeueOutputBuffer(r1, r12);	 Catch:{ Exception -> 0x0fbd }
        if (r27 >= 0) goto L_0x0a42;
    L_0x0a28:
        r11 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10dd }
        r11.<init>();	 Catch:{ IllegalStateException -> 0x10dd }
        r13 = z;	 Catch:{ IllegalStateException -> 0x10dd }
        r14 = 122; // 0x7a float:1.71E-43 double:6.03E-322;	 Catch:{ IllegalStateException -> 0x10dd }
        r13 = r13[r14];	 Catch:{ IllegalStateException -> 0x10dd }
        r11 = r11.append(r13);	 Catch:{ IllegalStateException -> 0x10dd }
        r11 = r11.append(r12);	 Catch:{ IllegalStateException -> 0x10dd }
        r11 = r11.toString();	 Catch:{ IllegalStateException -> 0x10dd }
        com.whatsapp.util.Log.i(r11);	 Catch:{ IllegalStateException -> 0x10dd }
    L_0x0a42:
        if (r12 < 0) goto L_0x0a74;
    L_0x0a44:
        r11 = r26[r12];	 Catch:{ Exception -> 0x0fbd }
        r0 = r43;	 Catch:{ IllegalStateException -> 0x10df }
        r13 = r0.offset;	 Catch:{ IllegalStateException -> 0x10df }
        r11.position(r13);	 Catch:{ IllegalStateException -> 0x10df }
        r0 = r43;	 Catch:{ IllegalStateException -> 0x10df }
        r13 = r0.offset;	 Catch:{ IllegalStateException -> 0x10df }
        r0 = r43;	 Catch:{ IllegalStateException -> 0x10df }
        r14 = r0.size;	 Catch:{ IllegalStateException -> 0x10df }
        r13 = r13 + r14;	 Catch:{ IllegalStateException -> 0x10df }
        r11.limit(r13);	 Catch:{ IllegalStateException -> 0x10df }
        r0 = r39;	 Catch:{ IllegalStateException -> 0x10df }
        r0.write(r11);	 Catch:{ IllegalStateException -> 0x10df }
        r11.clear();	 Catch:{ IllegalStateException -> 0x10df }
        r11 = 0;	 Catch:{ IllegalStateException -> 0x10df }
        r0 = r36;	 Catch:{ IllegalStateException -> 0x10df }
        r0.releaseOutputBuffer(r12, r11);	 Catch:{ IllegalStateException -> 0x10df }
        if (r27 >= 0) goto L_0x0a72;	 Catch:{ IllegalStateException -> 0x10df }
    L_0x0a69:
        r11 = z;	 Catch:{ IllegalStateException -> 0x10df }
        r13 = 79;	 Catch:{ IllegalStateException -> 0x10df }
        r11 = r11[r13];	 Catch:{ IllegalStateException -> 0x10df }
        com.whatsapp.util.Log.i(r11);	 Catch:{ IllegalStateException -> 0x10df }
    L_0x0a72:
        if (r32 == 0) goto L_0x1172;
    L_0x0a74:
        r11 = -3;
        if (r12 != r11) goto L_0x116e;
    L_0x0a77:
        r11 = r36.getOutputBuffers();	 Catch:{ Exception -> 0x0fbd }
        r13 = z;	 Catch:{ IllegalStateException -> 0x10e1 }
        r14 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ IllegalStateException -> 0x10e1 }
        r13 = r13[r14];	 Catch:{ IllegalStateException -> 0x10e1 }
        com.whatsapp.util.Log.i(r13);	 Catch:{ IllegalStateException -> 0x10e1 }
        if (r32 == 0) goto L_0x0aa7;
    L_0x0a86:
        r13 = -2;
        if (r12 != r13) goto L_0x0aa7;
    L_0x0a89:
        r12 = r36.getOutputFormat();	 Catch:{ Exception -> 0x0fbd }
        r13 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0fbd }
        r13.<init>();	 Catch:{ Exception -> 0x0fbd }
        r14 = z;	 Catch:{ Exception -> 0x0fbd }
        r15 = 129; // 0x81 float:1.81E-43 double:6.37E-322;	 Catch:{ Exception -> 0x0fbd }
        r14 = r14[r15];	 Catch:{ Exception -> 0x0fbd }
        r13 = r13.append(r14);	 Catch:{ Exception -> 0x0fbd }
        r12 = r13.append(r12);	 Catch:{ Exception -> 0x0fbd }
        r12 = r12.toString();	 Catch:{ Exception -> 0x0fbd }
        com.whatsapp.util.Log.i(r12);	 Catch:{ Exception -> 0x0fbd }
    L_0x0aa7:
        if (r32 == 0) goto L_0x1165;
    L_0x0aa9:
        r8 = r8 + 1;
        if (r27 >= 0) goto L_0x1165;
    L_0x0aad:
        r12 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x10e3 }
        r12.<init>();	 Catch:{ IllegalStateException -> 0x10e3 }
        r13 = z;	 Catch:{ IllegalStateException -> 0x10e3 }
        r14 = 146; // 0x92 float:2.05E-43 double:7.2E-322;	 Catch:{ IllegalStateException -> 0x10e3 }
        r13 = r13[r14];	 Catch:{ IllegalStateException -> 0x10e3 }
        r12 = r12.append(r13);	 Catch:{ IllegalStateException -> 0x10e3 }
        r12 = r12.append(r8);	 Catch:{ IllegalStateException -> 0x10e3 }
        r12 = r12.toString();	 Catch:{ IllegalStateException -> 0x10e3 }
        com.whatsapp.util.Log.i(r12);	 Catch:{ IllegalStateException -> 0x10e3 }
        r44 = r6;
        r6 = r7;
        r7 = r9;
        r9 = r11;
        r11 = r44;
    L_0x0ace:
        if (r11 != 0) goto L_0x0ad8;
    L_0x0ad0:
        r11 = 0;
        r0 = r22;	 Catch:{ IllegalStateException -> 0x10e5 }
        r1 = r20;	 Catch:{ IllegalStateException -> 0x10e5 }
        r0.releaseOutputBuffer(r1, r11);	 Catch:{ IllegalStateException -> 0x10e5 }
    L_0x0ad8:
        if (r27 >= 0) goto L_0x0ae3;
    L_0x0ada:
        r11 = z;	 Catch:{ IllegalStateException -> 0x10e7 }
        r12 = 72;	 Catch:{ IllegalStateException -> 0x10e7 }
        r11 = r11[r12];	 Catch:{ IllegalStateException -> 0x10e7 }
        com.whatsapp.util.Log.i(r11);	 Catch:{ IllegalStateException -> 0x10e7 }
    L_0x0ae3:
        if (r32 == 0) goto L_0x115a;
    L_0x0ae5:
        r23 = r6;
        r24 = r7;
        r26 = r9;
        r9 = r8;
    L_0x0aec:
        r6 = -3;
        r0 = r20;
        if (r0 != r6) goto L_0x1156;
    L_0x0af1:
        r6 = r22.getOutputBuffers();	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r7 = z;	 Catch:{ IllegalStateException -> 0x10e9 }
        r8 = 88;	 Catch:{ IllegalStateException -> 0x10e9 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x10e9 }
        com.whatsapp.util.Log.i(r7);	 Catch:{ IllegalStateException -> 0x10e9 }
        if (r32 == 0) goto L_0x1149;
    L_0x0b00:
        r25 = r6;
    L_0x0b02:
        r6 = -2;
        r0 = r20;
        if (r0 != r6) goto L_0x1138;
    L_0x0b07:
        r11 = r22.getOutputFormat();	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = z;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r7 = 14;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = r6[r7];	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r12 = r11.getInteger(r6);	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = z;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r7 = 141; // 0x8d float:1.98E-43 double:6.97E-322;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = r6[r7];	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r8 = r11.getInteger(r6);	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = z;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r7 = 39;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = r6[r7];	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r7 = r11.getInteger(r6);	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = z;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r13 = 65;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = r6[r13];	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r15 = r11.getInteger(r6);	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = z;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r13 = 85;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = r6[r13];	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r17 = r11.getInteger(r6);	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = z;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r13 = 17;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = r6[r13];	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r16 = r11.getInteger(r6);	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = z;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r13 = 1;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = r6[r13];	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r18 = r11.getInteger(r6);	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6.<init>();	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r13 = z;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r14 = 110; // 0x6e float:1.54E-43 double:5.43E-322;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r13 = r13[r14];	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = r6.append(r13);	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = r6.append(r11);	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = r6.toString();	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        com.whatsapp.util.Log.i(r6);	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = z;	 Catch:{ Exception -> 0x10ef, all -> 0x10fb }
        r13 = 87;	 Catch:{ Exception -> 0x10ef, all -> 0x10fb }
        r6 = r6[r13];	 Catch:{ Exception -> 0x10ef, all -> 0x10fb }
        r6 = r11.getInteger(r6);	 Catch:{ Exception -> 0x10ef, all -> 0x10fb }
        if (r6 <= r7) goto L_0x1146;
    L_0x0b76:
        r14 = r6;
    L_0x0b77:
        r6 = z;	 Catch:{ Exception -> 0x10f3, all -> 0x10fb }
        r7 = 68;	 Catch:{ Exception -> 0x10f3, all -> 0x10fb }
        r6 = r6[r7];	 Catch:{ Exception -> 0x10f3, all -> 0x10fb }
        r6 = r11.getInteger(r6);	 Catch:{ Exception -> 0x10f3, all -> 0x10fb }
        if (r6 <= r8) goto L_0x1143;
    L_0x0b83:
        r13 = r6;
    L_0x0b84:
        r6 = 1079; // 0x437 float:1.512E-42 double:5.33E-321;
        r0 = r18;
        if (r0 != r6) goto L_0x0bb9;
    L_0x0b8a:
        r6 = 1088; // 0x440 float:1.525E-42 double:5.375E-321;
        if (r14 != r6) goto L_0x0bb9;
    L_0x0b8e:
        r6 = z;	 Catch:{ IllegalStateException -> 0x10f7 }
        r7 = 97;	 Catch:{ IllegalStateException -> 0x10f7 }
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x10f7 }
        r7 = r31.getName();	 Catch:{ IllegalStateException -> 0x10f7 }
        r6 = r6.equals(r7);	 Catch:{ IllegalStateException -> 0x10f7 }
        if (r6 != 0) goto L_0x0bae;
    L_0x0b9e:
        r6 = z;	 Catch:{ IllegalStateException -> 0x10f9 }
        r7 = 77;	 Catch:{ IllegalStateException -> 0x10f9 }
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x10f9 }
        r7 = r31.getName();	 Catch:{ IllegalStateException -> 0x10f9 }
        r6 = r6.equals(r7);	 Catch:{ IllegalStateException -> 0x10f9 }
        if (r6 == 0) goto L_0x0bb9;
    L_0x0bae:
        r6 = z;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r7 = 55;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = r6[r7];	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        com.whatsapp.util.Log.i(r6);	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r14 = 1080; // 0x438 float:1.513E-42 double:5.336E-321;
    L_0x0bb9:
        r6 = 25;
        if (r12 != r6) goto L_0x0bd9;
    L_0x0bbd:
        r6 = z;	 Catch:{ IllegalStateException -> 0x10ff }
        r7 = 91;	 Catch:{ IllegalStateException -> 0x10ff }
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x10ff }
        r7 = r31.getName();	 Catch:{ IllegalStateException -> 0x10ff }
        r6 = r6.equals(r7);	 Catch:{ IllegalStateException -> 0x10ff }
        if (r6 == 0) goto L_0x0bd9;
    L_0x0bcd:
        r6 = z;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r7 = 73;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r6 = r6[r7];	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        com.whatsapp.util.Log.i(r6);	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r12 = 2130706688; // 0x7f000100 float:1.7014638E38 double:1.052708976E-314;
    L_0x0bd9:
        r6 = 2141391876; // 0x7fa30c04 float:NaN double:1.05798816E-314;
        if (r12 != r6) goto L_0x0be2;
    L_0x0bde:
        r12 = 21;
        if (r32 == 0) goto L_0x0bff;
    L_0x0be2:
        r6 = 2130706433; // 0x7f000001 float:1.701412E38 double:1.05270885E-314;
        if (r12 != r6) goto L_0x0bff;
    L_0x0be7:
        r6 = f;	 Catch:{ IllegalStateException -> 0x1101 }
        if (r6 == 0) goto L_0x0bfd;
    L_0x0beb:
        r6 = f;	 Catch:{ IllegalStateException -> 0x1103 }
        r6 = r6.toLowerCase();	 Catch:{ IllegalStateException -> 0x1103 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x1103 }
        r8 = 12;	 Catch:{ IllegalStateException -> 0x1103 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x1103 }
        r6 = r6.startsWith(r7);	 Catch:{ IllegalStateException -> 0x1103 }
        if (r6 != 0) goto L_0x0bff;
    L_0x0bfd:
        r12 = 19;
    L_0x0bff:
        if (r30 != 0) goto L_0x1138;
    L_0x0c01:
        r11 = r2;
        r19 = r10;
        r20 = r4;
        r21 = r5;
        r11.a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x1105 }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x1105 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x1105 }
        r8 = 63;	 Catch:{ IllegalStateException -> 0x1105 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r12);	 Catch:{ IllegalStateException -> 0x1105 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r13);	 Catch:{ IllegalStateException -> 0x1105 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r14);	 Catch:{ IllegalStateException -> 0x1105 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r15);	 Catch:{ IllegalStateException -> 0x1105 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1105 }
        r0 = r16;	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r0);	 Catch:{ IllegalStateException -> 0x1105 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1105 }
        r0 = r17;	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r0);	 Catch:{ IllegalStateException -> 0x1105 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1105 }
        r0 = r18;	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r0);	 Catch:{ IllegalStateException -> 0x1105 }
        r7 = ")";	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1105 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x1105 }
        r8 = 94;	 Catch:{ IllegalStateException -> 0x1105 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r10);	 Catch:{ IllegalStateException -> 0x1105 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r4);	 Catch:{ IllegalStateException -> 0x1105 }
        r7 = " ";	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r5);	 Catch:{ IllegalStateException -> 0x1105 }
        r7 = ")";	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.append(r7);	 Catch:{ IllegalStateException -> 0x1105 }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x1105 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x1105 }
        r7 = r23;
        r6 = r9;
        r8 = r24;
        r11 = r26;
        r9 = r25;
    L_0x0c9e:
        r0 = r42;	 Catch:{ IllegalStateException -> 0x1107 }
        r12 = r0.flags;	 Catch:{ IllegalStateException -> 0x1107 }
        r12 = r12 & 4;	 Catch:{ IllegalStateException -> 0x1107 }
        if (r12 == 0) goto L_0x0cb1;	 Catch:{ IllegalStateException -> 0x1107 }
    L_0x0ca6:
        r12 = z;	 Catch:{ IllegalStateException -> 0x1107 }
        r13 = 83;	 Catch:{ IllegalStateException -> 0x1107 }
        r12 = r12[r13];	 Catch:{ IllegalStateException -> 0x1107 }
        com.whatsapp.util.Log.i(r12);	 Catch:{ IllegalStateException -> 0x1107 }
        if (r32 == 0) goto L_0x1135;
    L_0x0cb1:
        if (r32 == 0) goto L_0x1128;
    L_0x0cb3:
        r3 = r6;
    L_0x0cb4:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 74;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r45;
        r5 = r0.n;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 28;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r45;
        r6 = r0.d;
        r4 = r4.append(r6);
        r5 = z;
        r6 = 0;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r45;
        r6 = r0.b;
        r4 = r4.append(r6);
        r5 = z;
        r6 = 4;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r3 = r4.append(r3);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r22.stop();
        r3 = z;
        r4 = 35;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r22.release();
        r3 = z;
        r4 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r4 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r36;
        r1 = r43;
        r3 = r0.dequeueOutputBuffer(r1, r4);
    L_0x0d25:
        if (r3 < 0) goto L_0x0d54;
    L_0x0d27:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 61;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r3);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = 0;
        r0 = r36;
        r0.releaseOutputBuffer(r3, r4);
        r4 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r36;
        r1 = r43;
        r3 = r0.dequeueOutputBuffer(r1, r4);
        if (r32 == 0) goto L_0x0d25;
    L_0x0d54:
        r3 = z;
        r4 = 81;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r36.stop();
        r3 = z;
        r4 = 95;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r36.release();
        r3 = z;
        r4 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r40.release();
        r3 = z;
        r4 = 40;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r2.a();
        r39.close();	 Catch:{ IOException -> 0x110f }
        r38.close();	 Catch:{ IOException -> 0x110f }
    L_0x0d8a:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0dd4 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0dd4 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0dd4 }
        r4 = 29;	 Catch:{ IllegalStateException -> 0x0dd4 }
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0dd4 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0dd4 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x0dd4 }
        r4 = r4 - r34;	 Catch:{ IllegalStateException -> 0x0dd4 }
        r2 = r2.append(r4);	 Catch:{ IllegalStateException -> 0x0dd4 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0dd4 }
        r4 = 100;	 Catch:{ IllegalStateException -> 0x0dd4 }
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0dd4 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0dd4 }
        r0 = r45;	 Catch:{ IllegalStateException -> 0x0dd4 }
        r3 = r0.g;	 Catch:{ IllegalStateException -> 0x0dd4 }
        r4 = r3.length();	 Catch:{ IllegalStateException -> 0x0dd4 }
        r2 = r2.append(r4);	 Catch:{ IllegalStateException -> 0x0dd4 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0dd4 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0dd4 }
        r0 = r45;	 Catch:{ IllegalStateException -> 0x0dd4 }
        r2 = r0.g;	 Catch:{ IllegalStateException -> 0x0dd4 }
        r2 = r2.length();	 Catch:{ IllegalStateException -> 0x0dd4 }
        r4 = 0;	 Catch:{ IllegalStateException -> 0x0dd4 }
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ IllegalStateException -> 0x0dd4 }
        if (r2 != 0) goto L_0x111b;	 Catch:{ IllegalStateException -> 0x0dd4 }
    L_0x0dce:
        r2 = new com.whatsapp.util.a6;	 Catch:{ IllegalStateException -> 0x0dd4 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0dd4 }
        throw r2;	 Catch:{ IllegalStateException -> 0x0dd4 }
    L_0x0dd4:
        r2 = move-exception;
        throw r2;
    L_0x0dd6:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0dd8 }
    L_0x0dd8:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0dda }
    L_0x0dda:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0ddc }
    L_0x0ddc:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0dde }
    L_0x0dde:
        r2 = move-exception;
        throw r2;
    L_0x0de0:
        r3 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalStateException -> 0x0e05 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0e05 }
        r8 = 93;	 Catch:{ IllegalStateException -> 0x0e05 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0e05 }
        r3 = r3.equals(r7);	 Catch:{ IllegalStateException -> 0x0e05 }
        if (r3 == 0) goto L_0x11a7;	 Catch:{ IllegalStateException -> 0x0e05 }
    L_0x0dee:
        r3 = android.os.Build.MODEL;	 Catch:{ IllegalStateException -> 0x0e05 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0e05 }
        r8 = 98;	 Catch:{ IllegalStateException -> 0x0e05 }
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0e05 }
        r3 = r3.startsWith(r7);	 Catch:{ IllegalStateException -> 0x0e05 }
        if (r3 == 0) goto L_0x11a7;
    L_0x0dfc:
        r2 = new com.whatsapp.v6;
        r2.<init>(r4, r5);
        r30 = r2;
        goto L_0x061b;
    L_0x0e05:
        r2 = move-exception;
        throw r2;
    L_0x0e07:
        r2 = r30.c();	 Catch:{ IllegalStateException -> 0x0e0d }
        goto L_0x061e;
    L_0x0e0d:
        r2 = move-exception;
        r7 = r2;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r8 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r3 = r3[r8];
        r2 = r2.append(r3);
        r3 = r7.toString();
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r6.release();
        r13 = new java.util.ArrayList;
        r13.<init>();
        r2 = 0;
        r8 = r2;
    L_0x0e37:
        if (r8 >= r12) goto L_0x0e9c;
    L_0x0e39:
        r14 = android.media.MediaCodecList.getCodecInfoAt(r8);
        r2 = r14.isEncoder();	 Catch:{ IllegalStateException -> 0x0eb0 }
        if (r2 == 0) goto L_0x0e45;
    L_0x0e43:
        if (r32 == 0) goto L_0x0e98;
    L_0x0e45:
        r15 = r14.getSupportedTypes();
        r3 = 0;
        r2 = 0;
    L_0x0e4b:
        r0 = r15.length;
        r16 = r0;
        r0 = r16;
        if (r2 >= r0) goto L_0x0e63;
    L_0x0e52:
        if (r3 != 0) goto L_0x0e63;
    L_0x0e54:
        r16 = r15[r2];	 Catch:{ IllegalStateException -> 0x0eb2 }
        r0 = r16;	 Catch:{ IllegalStateException -> 0x0eb2 }
        r16 = r0.equals(r11);	 Catch:{ IllegalStateException -> 0x0eb2 }
        if (r16 == 0) goto L_0x0e5f;
    L_0x0e5e:
        r3 = 1;
    L_0x0e5f:
        r2 = r2 + 1;
        if (r32 == 0) goto L_0x0e4b;
    L_0x0e63:
        if (r3 == 0) goto L_0x0e98;
    L_0x0e65:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0eb4 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0eb4 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0eb4 }
        r16 = 136; // 0x88 float:1.9E-43 double:6.7E-322;	 Catch:{ IllegalStateException -> 0x0eb4 }
        r3 = r3[r16];	 Catch:{ IllegalStateException -> 0x0eb4 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0eb4 }
        r3 = r14.getName();	 Catch:{ IllegalStateException -> 0x0eb4 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0eb4 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0eb4 }
        r16 = 52;	 Catch:{ IllegalStateException -> 0x0eb4 }
        r3 = r3[r16];	 Catch:{ IllegalStateException -> 0x0eb4 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0eb4 }
        r3 = java.util.Arrays.deepToString(r15);	 Catch:{ IllegalStateException -> 0x0eb4 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0eb4 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0eb4 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0eb4 }
        r13.add(r14);	 Catch:{ IllegalStateException -> 0x0eb4 }
    L_0x0e98:
        r2 = r8 + 1;
        if (r32 == 0) goto L_0x11a4;
    L_0x0e9c:
        r2 = r13.isEmpty();	 Catch:{ IllegalStateException -> 0x0eae }
        if (r2 == 0) goto L_0x0eb6;	 Catch:{ IllegalStateException -> 0x0eae }
    L_0x0ea2:
        r2 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0eae }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0eae }
        r4 = 30;	 Catch:{ IllegalStateException -> 0x0eae }
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0eae }
        r2.<init>(r3, r7);	 Catch:{ IllegalStateException -> 0x0eae }
        throw r2;	 Catch:{ IllegalStateException -> 0x0eae }
    L_0x0eae:
        r2 = move-exception;
        throw r2;
    L_0x0eb0:
        r2 = move-exception;
        throw r2;
    L_0x0eb2:
        r2 = move-exception;
        throw r2;
    L_0x0eb4:
        r2 = move-exception;
        throw r2;
    L_0x0eb6:
        r7 = r13.iterator();
        r3 = r6;
    L_0x0ebb:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x11a1;
    L_0x0ec1:
        r2 = r7.next();
        r2 = (android.media.MediaCodecInfo) r2;
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0fad }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x0fad }
        r8 = z;	 Catch:{ IllegalStateException -> 0x0fad }
        r12 = 53;	 Catch:{ IllegalStateException -> 0x0fad }
        r8 = r8[r12];	 Catch:{ IllegalStateException -> 0x0fad }
        r6 = r6.append(r8);	 Catch:{ IllegalStateException -> 0x0fad }
        r8 = r2.getName();	 Catch:{ IllegalStateException -> 0x0fad }
        r6 = r6.append(r8);	 Catch:{ IllegalStateException -> 0x0fad }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x0fad }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x0fad }
        r6 = z;	 Catch:{ IllegalStateException -> 0x0fad }
        r8 = 69;	 Catch:{ IllegalStateException -> 0x0fad }
        r6 = r6[r8];	 Catch:{ IllegalStateException -> 0x0fad }
        r8 = r2.getName();	 Catch:{ IllegalStateException -> 0x0fad }
        r6 = r6.equals(r8);	 Catch:{ IllegalStateException -> 0x0fad }
        if (r6 == 0) goto L_0x0f15;	 Catch:{ IllegalStateException -> 0x0fad }
    L_0x0ef5:
        r6 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0fad }
        r6.<init>();	 Catch:{ IllegalStateException -> 0x0fad }
        r8 = z;	 Catch:{ IllegalStateException -> 0x0fad }
        r12 = 31;	 Catch:{ IllegalStateException -> 0x0fad }
        r8 = r8[r12];	 Catch:{ IllegalStateException -> 0x0fad }
        r6 = r6.append(r8);	 Catch:{ IllegalStateException -> 0x0fad }
        r8 = r2.getName();	 Catch:{ IllegalStateException -> 0x0fad }
        r6 = r6.append(r8);	 Catch:{ IllegalStateException -> 0x0fad }
        r6 = r6.toString();	 Catch:{ IllegalStateException -> 0x0fad }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IllegalStateException -> 0x0fad }
        if (r32 == 0) goto L_0x0ebb;
    L_0x0f15:
        r3 = r2.getName();
        r6 = android.media.MediaCodec.createByCodecName(r3);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r8 = z;
        r12 = 56;
        r8 = r8[r12];
        r3 = r3.append(r8);
        r8 = r2.getName();
        r3 = r3.append(r8);
        r8 = z;
        r12 = 5;
        r8 = r8[r12];
        r3 = r3.append(r8);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r3 = 0;
        r8 = 0;
        r12 = 0;
        r6.configure(r9, r3, r8, r12);	 Catch:{ Exception -> 0x0faf }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0faf }
        r3.<init>();	 Catch:{ Exception -> 0x0faf }
        r8 = z;	 Catch:{ Exception -> 0x0faf }
        r12 = 145; // 0x91 float:2.03E-43 double:7.16E-322;	 Catch:{ Exception -> 0x0faf }
        r8 = r8[r12];	 Catch:{ Exception -> 0x0faf }
        r3 = r3.append(r8);	 Catch:{ Exception -> 0x0faf }
        r2 = r2.getName();	 Catch:{ Exception -> 0x0faf }
        r2 = r3.append(r2);	 Catch:{ Exception -> 0x0faf }
        r3 = z;	 Catch:{ Exception -> 0x0faf }
        r8 = 24;	 Catch:{ Exception -> 0x0faf }
        r3 = r3[r8];	 Catch:{ Exception -> 0x0faf }
        r2 = r2.append(r3);	 Catch:{ Exception -> 0x0faf }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0faf }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0faf }
    L_0x0f72:
        if (r6 != 0) goto L_0x119d;
    L_0x0f74:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0fab }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0fab }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0fab }
        r4 = 8;	 Catch:{ IllegalStateException -> 0x0fab }
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0fab }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0fab }
        r2 = r2.append(r11);	 Catch:{ IllegalStateException -> 0x0fab }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0fab }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x0fab }
        r2 = new java.io.FileNotFoundException;	 Catch:{ IllegalStateException -> 0x0fab }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0fab }
        r3.<init>();	 Catch:{ IllegalStateException -> 0x0fab }
        r4 = z;	 Catch:{ IllegalStateException -> 0x0fab }
        r5 = 150; // 0x96 float:2.1E-43 double:7.4E-322;	 Catch:{ IllegalStateException -> 0x0fab }
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0fab }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x0fab }
        r3 = r3.append(r11);	 Catch:{ IllegalStateException -> 0x0fab }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x0fab }
        r2.<init>(r3);	 Catch:{ IllegalStateException -> 0x0fab }
        throw r2;	 Catch:{ IllegalStateException -> 0x0fab }
    L_0x0fab:
        r2 = move-exception;
        throw r2;
    L_0x0fad:
        r2 = move-exception;
        throw r2;
    L_0x0faf:
        r2 = move-exception;
        r6.release();
        r2 = 0;
        r3 = r2;
        goto L_0x0ebb;
    L_0x0fb7:
        r2 = move-exception;
        throw r2;
    L_0x0fb9:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x0fbb }
    L_0x0fbb:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x0fbd:
        r3 = move-exception;
    L_0x0fbe:
        r4 = z;	 Catch:{ all -> 0x0fc8 }
        r5 = 120; // 0x78 float:1.68E-43 double:5.93E-322;	 Catch:{ all -> 0x0fc8 }
        r4 = r4[r5];	 Catch:{ all -> 0x0fc8 }
        com.whatsapp.util.Log.b(r4, r3);	 Catch:{ all -> 0x0fc8 }
        throw r3;	 Catch:{ all -> 0x0fc8 }
    L_0x0fc8:
        r3 = move-exception;
    L_0x0fc9:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 71;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r45;
        r5 = r0.n;
        r4 = r4.append(r5);
        r5 = z;
        r6 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r45;
        r6 = r0.d;
        r4 = r4.append(r6);
        r5 = z;
        r6 = 44;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r45;
        r6 = r0.b;
        r4 = r4.append(r6);
        r5 = z;
        r6 = 47;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r8);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r22.stop();
        r4 = z;
        r5 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r4 = r4[r5];
        com.whatsapp.util.Log.i(r4);
        r22.release();
        r4 = z;
        r5 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r4 = r4[r5];
        com.whatsapp.util.Log.i(r4);
        r4 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r36;
        r1 = r43;
        r4 = r0.dequeueOutputBuffer(r1, r4);
    L_0x103c:
        if (r4 < 0) goto L_0x106b;
    L_0x103e:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r4);
        r5 = r5.toString();
        com.whatsapp.util.Log.i(r5);
        r5 = 0;
        r0 = r36;
        r0.releaseOutputBuffer(r4, r5);
        r4 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r36;
        r1 = r43;
        r4 = r0.dequeueOutputBuffer(r1, r4);
        if (r32 == 0) goto L_0x103c;
    L_0x106b:
        r4 = z;
        r5 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r4 = r4[r5];
        com.whatsapp.util.Log.i(r4);
        r36.stop();
        r4 = z;
        r5 = 99;
        r4 = r4[r5];
        com.whatsapp.util.Log.i(r4);
        r36.release();
        r4 = z;
        r5 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r4 = r4[r5];
        com.whatsapp.util.Log.i(r4);
        r40.release();
        r4 = z;
        r5 = 89;
        r4 = r4[r5];
        com.whatsapp.util.Log.i(r4);
        r2.a();
        throw r3;
    L_0x109c:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x109e:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fbd }
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10a0:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fbd }
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10a2:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fbd }
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10a4:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fbd }
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10a6:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fbd }
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10a8:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fbd }
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10aa:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x10ac }
    L_0x10ac:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10ae:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x10b0 }
    L_0x10b0:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10b2:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x10b4 }
    L_0x10b4:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10b6:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fbd }
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10b8:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x10ba }
    L_0x10ba:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10bc:
        r0 = r45;	 Catch:{ Exception -> 0x0fbd }
        r6 = r0.o;	 Catch:{ Exception -> 0x0fbd }
        r12 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x0fbd }
        r6 = r6 * r12;	 Catch:{ Exception -> 0x0fbd }
        goto L_0x0993;	 Catch:{ Exception -> 0x0fbd }
    L_0x10c5:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fbd }
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10c7:
        r0 = r45;	 Catch:{ Exception -> 0x0fbd }
        r12 = r0.a;	 Catch:{ Exception -> 0x0fbd }
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ Exception -> 0x0fbd }
        r12 = r12 * r14;	 Catch:{ Exception -> 0x0fbd }
        goto L_0x099f;	 Catch:{ Exception -> 0x0fbd }
    L_0x10d0:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fbd }
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10d2:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x10d4 }
    L_0x10d4:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10d6:
        r7 = 0;
        goto L_0x09cb;
    L_0x10d9:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x10db }
    L_0x10db:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10dd:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fbd }
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10df:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fbd }
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10e1:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fbd }
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10e3:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fbd }
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10e5:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fbd }
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10e7:
        r3 = move-exception;	 Catch:{ Exception -> 0x0fbd }
        throw r3;	 Catch:{ Exception -> 0x0fbd }
    L_0x10e9:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
    L_0x10eb:
        r3 = move-exception;
        r8 = r9;
        goto L_0x0fbe;
    L_0x10ef:
        r6 = move-exception;
        r14 = r7;
        goto L_0x0b77;
    L_0x10f3:
        r6 = move-exception;
        r13 = r8;
        goto L_0x0b84;
    L_0x10f7:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x10f9 }
    L_0x10f9:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
    L_0x10fb:
        r3 = move-exception;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        r8 = r9;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        goto L_0x0fc9;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
    L_0x10ff:
        r3 = move-exception;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        throw r3;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
    L_0x1101:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x1103 }
    L_0x1103:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
    L_0x1105:
        r3 = move-exception;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
        throw r3;	 Catch:{ Exception -> 0x10eb, all -> 0x10fb }
    L_0x1107:
        r3 = move-exception;
        throw r3;	 Catch:{ IllegalStateException -> 0x1109 }
    L_0x1109:
        r3 = move-exception;
        throw r3;	 Catch:{ Exception -> 0x110b, all -> 0x1120 }
    L_0x110b:
        r3 = move-exception;
        r8 = r6;
        goto L_0x0fbe;
    L_0x110f:
        r2 = move-exception;
        r3 = z;
        r4 = 22;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x0d8a;
    L_0x111b:
        return;
    L_0x111c:
        r3 = move-exception;
        r8 = r14;
        goto L_0x0fc9;
    L_0x1120:
        r3 = move-exception;
        r8 = r6;
        goto L_0x0fc9;
    L_0x1124:
        r3 = move-exception;
        r8 = r14;
        goto L_0x0fbe;
    L_0x1128:
        r23 = r7;
        r24 = r8;
        r19 = r9;
        r26 = r11;
        r8 = r6;
        r6 = r27;
        goto L_0x06ba;
    L_0x1135:
        r3 = r6;
        goto L_0x0cb4;
    L_0x1138:
        r7 = r23;
        r6 = r9;
        r8 = r24;
        r11 = r26;
        r9 = r25;
        goto L_0x0c9e;
    L_0x1143:
        r6 = r8;
        goto L_0x0b83;
    L_0x1146:
        r6 = r7;
        goto L_0x0b76;
    L_0x1149:
        r7 = r23;
        r8 = r24;
        r11 = r26;
        r44 = r6;
        r6 = r9;
        r9 = r44;
        goto L_0x0c9e;
    L_0x1156:
        r25 = r19;
        goto L_0x0b02;
    L_0x115a:
        r11 = r9;
        r9 = r19;
        r44 = r7;
        r7 = r6;
        r6 = r8;
        r8 = r44;
        goto L_0x0c9e;
    L_0x1165:
        r44 = r6;
        r6 = r7;
        r7 = r9;
        r9 = r11;
        r11 = r44;
        goto L_0x0ace;
    L_0x116e:
        r11 = r26;
        goto L_0x0a86;
    L_0x1172:
        r11 = r26;
        goto L_0x0aa7;
    L_0x1176:
        r7 = r23;
        r44 = r9;
        r9 = r6;
        r6 = r44;
        goto L_0x0a1b;
    L_0x117f:
        r6 = r9;
        r7 = r23;
        r9 = r24;
        goto L_0x0a1b;
    L_0x1186:
        r9 = r6;
        goto L_0x0853;
    L_0x1189:
        r7 = r23;
        r9 = r24;
        goto L_0x0a1b;
    L_0x118f:
        r7 = r23;
        r9 = r24;
        r11 = r26;
        goto L_0x0aa9;
    L_0x1197:
        r9 = r8;
        goto L_0x0aec;
    L_0x119a:
        r3 = r8;
        goto L_0x0cb4;
    L_0x119d:
        r22 = r6;
        goto L_0x062e;
    L_0x11a1:
        r6 = r3;
        goto L_0x0f72;
    L_0x11a4:
        r8 = r2;
        goto L_0x0e37;
    L_0x11a7:
        r30 = r2;
        goto L_0x061b;
    L_0x11ab:
        r2 = r3;
        goto L_0x04cf;
    L_0x11ae:
        r2 = r5;
        r3 = r4;
        goto L_0x0307;
    L_0x11b2:
        r5 = r2;
        r4 = r3;
        goto L_0x0278;
    L_0x11b6:
        r5 = r6;
        goto L_0x01f2;
    L_0x11b9:
        r4 = r6;
        goto L_0x0143;
    L_0x11bc:
        r31 = r6;
        goto L_0x0149;
    L_0x11c0:
        r7 = r5;
        r6 = r4;
        goto L_0x0106;
    L_0x11c4:
        r3 = r4;
        goto L_0x00da;
    L_0x11c7:
        r2 = r3;
        r3 = r5;
        goto L_0x00da;
    L_0x11cb:
        r2 = r3;
        r4 = r5;
        goto L_0x00cc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.id.d():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f() {
        /*
        r28_this = this;
        r16 = com.whatsapp.App.az;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r28;
        r4 = r0.o;
        r2 = r2.append(r4);
        r3 = z;
        r4 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r28;
        r4 = r0.a;
        r2 = r2.append(r4);
        r3 = z;
        r4 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r28;
        r3 = r0.p;
        r4 = r3.length();
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r18 = java.lang.System.currentTimeMillis();
        r0 = r28;
        r2 = r0.o;	 Catch:{ IllegalArgumentException -> 0x00a1 }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 > 0) goto L_0x0060;
    L_0x0056:
        r0 = r28;
        r2 = r0.a;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x006c;
    L_0x0060:
        r0 = r28;
        r2 = r0.o;	 Catch:{ IllegalArgumentException -> 0x009f }
        r0 = r28;
        r4 = r0.a;	 Catch:{ IllegalArgumentException -> 0x009f }
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x00a5;
    L_0x006c:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x009f }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x009f }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x009f }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x009f }
        r5 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x009f }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x009f }
        r0 = r28;
        r4 = r0.o;	 Catch:{ IllegalArgumentException -> 0x009f }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x009f }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x009f }
        r5 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x009f }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x009f }
        r0 = r28;
        r4 = r0.a;	 Catch:{ IllegalArgumentException -> 0x009f }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x009f }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x009f }
        r2.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x009f }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x009f }
    L_0x009f:
        r2 = move-exception;
        throw r2;
    L_0x00a1:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x00a3:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x009f }
    L_0x00a5:
        r2 = new java.io.FileInputStream;
        r0 = r28;
        r3 = r0.p;
        r2.<init>(r3);
        r2 = r2.getChannel();
        r2 = com.googlecode.mp4parser.authoring.container.mp4.MovieCreator.build(r2);
        r3 = r2.getTracks();
        r4 = r3.iterator();
    L_0x00be:
        r2 = r4.hasNext();
        if (r2 == 0) goto L_0x00f6;
    L_0x00c4:
        r2 = r4.next();
        r2 = (com.googlecode.mp4parser.authoring.Track) r2;
        r5 = r2.getSyncSamples();	 Catch:{ IllegalArgumentException -> 0x0224 }
        if (r5 == 0) goto L_0x00f4;
    L_0x00d0:
        r5 = r2.getSyncSamples();	 Catch:{ IllegalArgumentException -> 0x0226 }
        r5 = r5.length;	 Catch:{ IllegalArgumentException -> 0x0226 }
        if (r5 <= 0) goto L_0x00f4;
    L_0x00d7:
        r6 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r0 = r28;
        r8 = r0.o;	 Catch:{ IllegalArgumentException -> 0x0228 }
        r8 = (double) r8;	 Catch:{ IllegalArgumentException -> 0x0228 }
        r10 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r8 = r8 / r10;
        r5 = 0;
        r8 = a(r2, r8, r5);	 Catch:{ IllegalArgumentException -> 0x0228 }
        r6 = r6 * r8;
        r6 = (long) r6;	 Catch:{ IllegalArgumentException -> 0x0228 }
        r0 = r28;
        r0.o = r6;	 Catch:{ IllegalArgumentException -> 0x0228 }
        if (r16 == 0) goto L_0x00f6;
    L_0x00f4:
        if (r16 == 0) goto L_0x00be;
    L_0x00f6:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r0 = r28;
        r4 = r0.o;
        r2 = r2.append(r4);
        r4 = z;
        r5 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r0 = r28;
        r4 = r0.a;
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r17 = new com.googlecode.mp4parser.authoring.Movie;
        r17.<init>();
        r20 = r3.iterator();
    L_0x012f:
        r2 = r20.hasNext();
        if (r2 == 0) goto L_0x01cf;
    L_0x0135:
        r3 = r20.next();
        r3 = (com.googlecode.mp4parser.authoring.Track) r3;
        r12 = 0;
        r10 = 0;
        r8 = 0;
        r6 = 0;
        r4 = 0;
        r2 = 0;
        r14 = r12;
        r12 = r10;
        r10 = r8;
        r8 = r6;
        r6 = r4;
        r4 = r2;
    L_0x014c:
        r2 = r3.getDecodingTimeEntries();
        r2 = r2.size();
        if (r4 >= r2) goto L_0x01c2;
    L_0x0156:
        r2 = r3.getDecodingTimeEntries();
        r2 = r2.get(r4);
        r2 = (com.coremedia.iso.boxes.TimeToSampleBox.Entry) r2;
        r5 = 0;
    L_0x0161:
        r0 = (long) r5;
        r22 = r0;
        r24 = r2.getCount();
        r21 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1));
        if (r21 >= 0) goto L_0x01be;
    L_0x016c:
        r21 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1));
        if (r21 <= 0) goto L_0x0187;
    L_0x0170:
        r0 = r28;
        r0 = r0.o;	 Catch:{ IllegalArgumentException -> 0x022a }
        r22 = r0;
        r0 = r22;
        r0 = (double) r0;
        r22 = r0;
        r24 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r22 = r22 / r24;
        r21 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1));
        if (r21 > 0) goto L_0x0187;
    L_0x0186:
        r8 = r14;
    L_0x0187:
        r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1));
        if (r10 <= 0) goto L_0x019c;
    L_0x018b:
        r0 = r28;
        r10 = r0.a;	 Catch:{ IllegalArgumentException -> 0x022c }
        r10 = (double) r10;
        r22 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r10 = r10 / r22;
        r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1));
        if (r10 > 0) goto L_0x019c;
    L_0x019b:
        r6 = r14;
    L_0x019c:
        r10 = r2.getDelta();
        r10 = (double) r10;
        r21 = r3.getTrackMetaData();
        r22 = r21.getTimescale();
        r0 = r22;
        r0 = (double) r0;
        r22 = r0;
        r10 = r10 / r22;
        r10 = r10 + r12;
        r22 = 1;
        r14 = r14 + r22;
        r5 = r5 + 1;
        if (r16 == 0) goto L_0x0231;
    L_0x01b9:
        r26 = r12;
        r12 = r10;
        r10 = r26;
    L_0x01be:
        r2 = r4 + 1;
        if (r16 == 0) goto L_0x022e;
    L_0x01c2:
        r4 = r8;
        r2 = new com.googlecode.mp4parser.authoring.tracks.CroppedTrack;
        r2.<init>(r3, r4, r6);
        r0 = r17;
        r0.addTrack(r2);
        if (r16 == 0) goto L_0x012f;
    L_0x01cf:
        r2 = new com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
        r2.<init>();
        r0 = r17;
        r2 = r2.build(r0);
        r3 = new java.io.FileOutputStream;
        r0 = r28;
        r4 = r0.e;
        r3.<init>(r4);
        r4 = r3.getChannel();
        r2.writeContainer(r4);
        r3.close();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r4 = java.lang.System.currentTimeMillis();
        r4 = r4 - r18;
        r2 = r2.append(r4);
        r3 = z;
        r4 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r28;
        r3 = r0.e;
        r4 = r3.length();
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        return;
    L_0x0224:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0226 }
    L_0x0226:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0228 }
    L_0x0228:
        r2 = move-exception;
        throw r2;
    L_0x022a:
        r2 = move-exception;
        throw r2;
    L_0x022c:
        r2 = move-exception;
        throw r2;
    L_0x022e:
        r4 = r2;
        goto L_0x014c;
    L_0x0231:
        r26 = r12;
        r12 = r10;
        r10 = r26;
        goto L_0x0161;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.id.f():void");
    }

    public static boolean c(File file) {
        return i();
    }

    public boolean c() {
        return this.n;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r30_this = this;
        r18 = com.whatsapp.App.az;
        r2 = z;
        r3 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r20 = java.lang.System.currentTimeMillis();
        r19 = new com.googlecode.mp4parser.authoring.Movie;
        r19.<init>();
        r6 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0 = r30;
        r2 = r0.b;
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x002e;
    L_0x0020:
        r2 = 1000000000; // 0x3b9aca00 float:0.0047237873 double:4.94065646E-315;
        r0 = r30;
        r4 = r0.d;
        r2 = r2 * r4;
        r0 = r30;
        r4 = r0.b;
        r6 = r2 / r4;
    L_0x002e:
        r3 = new com.googlecode.mp4parser.authoring.tracks.H264TrackImpl;
        r2 = new java.io.FileInputStream;
        r0 = r30;
        r4 = r0.g;
        r2.<init>(r4);
        r4 = r2.getChannel();
        r2 = z;
        r5 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        r5 = r2[r5];
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3.<init>(r4, r5, r6, r8);
        r0 = r19;
        r0.addTrack(r3);	 Catch:{ IllegalArgumentException -> 0x0240 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0240 }
        r4 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x0240 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalArgumentException -> 0x0240 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0240 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0240 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0240 }
        r5 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0240 }
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0240 }
        r0 = r30;
        r4 = r0.o;	 Catch:{ IllegalArgumentException -> 0x0240 }
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0240 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0240 }
        r5 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0240 }
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0240 }
        r0 = r30;
        r4 = r0.a;	 Catch:{ IllegalArgumentException -> 0x0240 }
        r2 = r2.append(r4);	 Catch:{ IllegalArgumentException -> 0x0240 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x0240 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalArgumentException -> 0x0240 }
        r0 = r30;
        r2 = r0.h;	 Catch:{ IllegalArgumentException -> 0x0240 }
        if (r2 == 0) goto L_0x00af;
    L_0x008c:
        r0 = r30;
        r2 = r0.h;	 Catch:{ IllegalArgumentException -> 0x0240 }
        r2 = r2.exists();	 Catch:{ IllegalArgumentException -> 0x0240 }
        if (r2 == 0) goto L_0x01eb;
    L_0x0096:
        r2 = new com.googlecode.mp4parser.authoring.tracks.AACTrackImpl;
        r4 = new java.io.FileInputStream;
        r0 = r30;
        r5 = r0.h;
        r4.<init>(r5);
        r4 = r4.getChannel();
        r2.<init>(r4);
        r0 = r19;
        r0.addTrack(r2);
        if (r18 == 0) goto L_0x01eb;
    L_0x00af:
        r2 = new java.io.FileInputStream;
        r0 = r30;
        r4 = r0.p;
        r2.<init>(r4);
        r2 = r2.getChannel();
        r2 = com.googlecode.mp4parser.authoring.container.mp4.MovieCreator.build(r2);
        r2 = r2.getTracks();
        r22 = r2.iterator();
    L_0x00c8:
        r2 = r22.hasNext();
        if (r2 == 0) goto L_0x01eb;
    L_0x00ce:
        r5 = r22.next();
        r5 = (com.googlecode.mp4parser.authoring.Track) r5;
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0242 }
        r4 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x0242 }
        r4 = r5.getHandler();	 Catch:{ IllegalArgumentException -> 0x0242 }
        r2 = r2.equals(r4);	 Catch:{ IllegalArgumentException -> 0x0242 }
        if (r2 != 0) goto L_0x01da;
    L_0x00e4:
        r0 = r30;
        r6 = r0.o;	 Catch:{ IllegalArgumentException -> 0x0244 }
        r8 = 0;
        r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r2 > 0) goto L_0x00ff;
    L_0x00ee:
        r0 = r30;
        r6 = r0.a;	 Catch:{ IllegalArgumentException -> 0x0246 }
        r8 = 0;
        r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r2 > 0) goto L_0x00ff;
    L_0x00f8:
        r0 = r19;
        r0.addTrack(r5);	 Catch:{ IllegalArgumentException -> 0x0246 }
        if (r18 == 0) goto L_0x01cf;
    L_0x00ff:
        r14 = 0;
        r12 = 0;
        r10 = 0;
        r8 = 0;
        r6 = 0;
        r2 = 0;
        r4 = r2;
    L_0x010b:
        r2 = r5.getDecodingTimeEntries();
        r2 = r2.size();
        if (r4 >= r2) goto L_0x0198;
    L_0x0115:
        r2 = r5.getDecodingTimeEntries();
        r2 = r2.get(r4);
        r2 = (com.coremedia.iso.boxes.TimeToSampleBox.Entry) r2;
        r16 = 0;
        r28 = r16;
        r16 = r14;
        r14 = r12;
        r12 = r10;
        r10 = r8;
        r8 = r6;
        r6 = r28;
    L_0x012b:
        r0 = (long) r6;
        r24 = r0;
        r26 = r2.getCount();
        r7 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1));
        if (r7 >= 0) goto L_0x0258;
    L_0x0136:
        r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
        if (r7 <= 0) goto L_0x0152;
    L_0x013a:
        r0 = r30;
        r0 = r0.o;	 Catch:{ IllegalArgumentException -> 0x0248 }
        r24 = r0;
        r0 = r24;
        r0 = (double) r0;
        r24 = r0;
        r26 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r24 = r24 / r26;
        r7 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1));
        if (r7 > 0) goto L_0x0152;
    L_0x0150:
        r10 = r16;
    L_0x0152:
        r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
        if (r7 <= 0) goto L_0x0172;
    L_0x0156:
        r0 = r30;
        r12 = r0.a;	 Catch:{ IllegalArgumentException -> 0x024a }
        r24 = 0;
        r7 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1));
        if (r7 <= 0) goto L_0x0170;
    L_0x0160:
        r0 = r30;
        r12 = r0.a;	 Catch:{ IllegalArgumentException -> 0x024a }
        r12 = (double) r12;
        r24 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r12 = r12 / r24;
        r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1));
        if (r7 > 0) goto L_0x0172;
    L_0x0170:
        r8 = r16;
    L_0x0172:
        r12 = r2.getDelta();
        r12 = (double) r12;
        r7 = r5.getTrackMetaData();
        r24 = r7.getTimescale();
        r0 = r24;
        r0 = (double) r0;
        r24 = r0;
        r12 = r12 / r24;
        r12 = r12 + r14;
        r24 = 1;
        r16 = r16 + r24;
        r6 = r6 + 1;
        if (r18 == 0) goto L_0x0251;
    L_0x018f:
        r6 = r8;
        r8 = r10;
        r10 = r14;
        r14 = r16;
    L_0x0194:
        r2 = r4 + 1;
        if (r18 == 0) goto L_0x024e;
    L_0x0198:
        r28 = r6;
        r6 = r8;
        r8 = r28;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r10 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        r4 = r4[r10];
        r2 = r2.append(r4);
        r2 = r2.append(r6);
        r4 = z;
        r10 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r4 = r4[r10];
        r2 = r2.append(r4);
        r2 = r2.append(r8);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r4 = new com.googlecode.mp4parser.authoring.tracks.CroppedTrack;
        r4.<init>(r5, r6, r8);
        r0 = r19;
        r0.addTrack(r4);
    L_0x01cf:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x024c }
        r4 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x024c }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalArgumentException -> 0x024c }
        if (r18 == 0) goto L_0x01e9;
    L_0x01da:
        r2 = r3.getTrackMetaData();	 Catch:{ IllegalArgumentException -> 0x024c }
        r4 = r5.getTrackMetaData();	 Catch:{ IllegalArgumentException -> 0x024c }
        r4 = r4.getMatrix();	 Catch:{ IllegalArgumentException -> 0x024c }
        r2.setMatrix(r4);	 Catch:{ IllegalArgumentException -> 0x024c }
    L_0x01e9:
        if (r18 == 0) goto L_0x00c8;
    L_0x01eb:
        r2 = new com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
        r2.<init>();
        r0 = r19;
        r2 = r2.build(r0);
        r3 = new java.io.FileOutputStream;
        r0 = r30;
        r4 = r0.e;
        r3.<init>(r4);
        r4 = r3.getChannel();
        r2.writeContainer(r4);
        r3.close();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r4 = java.lang.System.currentTimeMillis();
        r4 = r4 - r20;
        r2 = r2.append(r4);
        r3 = z;
        r4 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r30;
        r3 = r0.e;
        r4 = r3.length();
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        return;
    L_0x0240:
        r2 = move-exception;
        throw r2;
    L_0x0242:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0244 }
    L_0x0244:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0246 }
    L_0x0246:
        r2 = move-exception;
        throw r2;
    L_0x0248:
        r2 = move-exception;
        throw r2;
    L_0x024a:
        r2 = move-exception;
        throw r2;
    L_0x024c:
        r2 = move-exception;
        throw r2;
    L_0x024e:
        r4 = r2;
        goto L_0x010b;
    L_0x0251:
        r28 = r14;
        r14 = r12;
        r12 = r28;
        goto L_0x012b;
    L_0x0258:
        r6 = r8;
        r8 = r10;
        r10 = r12;
        r12 = r14;
        r14 = r16;
        goto L_0x0194;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.id.a():void");
    }

    private static double a(Track track, double d, boolean z) {
        int i = App.az;
        double[] dArr = new double[track.getSyncSamples().length];
        long j = 0;
        double d2 = 0.0d;
        int i2 = 0;
        while (i2 < track.getDecodingTimeEntries().size()) {
            Entry entry = (Entry) track.getDecodingTimeEntries().get(i2);
            long j2 = j;
            double d3 = d2;
            int i3 = 0;
            while (((long) i3) < entry.getCount()) {
                try {
                    if (Arrays.binarySearch(track.getSyncSamples(), 1 + j2) >= 0) {
                        dArr[Arrays.binarySearch(track.getSyncSamples(), 1 + j2)] = d3;
                    }
                    d3 += ((double) entry.getDelta()) / ((double) track.getTrackMetaData().getTimescale());
                    j2++;
                    i3++;
                    if (i != 0) {
                        break;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            d2 = d3;
            j = j2;
            int i4 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i4;
        }
        d2 = 0.0d;
        int length = dArr.length;
        int i5 = 0;
        while (i5 < length) {
            double d4 = dArr[i5];
            if (d4 > d) {
                return z ? d4 : d2;
            } else {
                i3 = i5 + 1;
                if (i != 0) {
                    break;
                }
                i5 = i3;
                d2 = d4;
            }
        }
        return dArr[dArr.length - 1];
    }

    public void a(float f) {
        this.i = f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e() {
        /*
        r35_this = this;
        r18 = com.whatsapp.App.az;
        r20 = java.lang.System.currentTimeMillis();
        r2 = new java.io.File;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r0 = r35;
        r4 = r0.e;
        r4 = r4.getAbsoluteFile();
        r3 = r3.append(r4);
        r4 = z;
        r5 = 205; // 0xcd float:2.87E-43 double:1.013E-321;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.toString();
        r2.<init>(r3);
        r0 = r35;
        r0.h = r2;
        r19 = new java.io.FileOutputStream;
        r0 = r35;
        r2 = r0.h;
        r0 = r19;
        r0.<init>(r2);
        r22 = r19.getChannel();
        r23 = new android.media.MediaExtractor;
        r23.<init>();
        r0 = r35;
        r2 = r0.p;
        r2 = r2.getAbsolutePath();
        r0 = r23;
        r0.setDataSource(r2);
        r4 = r23.getTrackCount();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r5 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r3 = -1;
        r2 = 0;
    L_0x006f:
        if (r2 >= r4) goto L_0x0646;
    L_0x0071:
        r0 = r23;
        r5 = r0.getTrackFormat(r2);
        r6 = z;
        r7 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        r6 = r6[r7];
        r6 = r5.getString(r6);
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = z;
        r9 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r7 = r7.append(r2);
        r8 = z;
        r9 = 207; // 0xcf float:2.9E-43 double:1.023E-321;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r7 = r7.append(r6);
        r8 = z;
        r9 = 216; // 0xd8 float:3.03E-43 double:1.067E-321;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r5 = r7.append(r5);
        r5 = r5.toString();
        com.whatsapp.util.Log.i(r5);
        r5 = z;
        r7 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        r5 = r5[r7];
        r5 = r6.startsWith(r5);
        if (r5 == 0) goto L_0x00c6;
    L_0x00c3:
        if (r18 == 0) goto L_0x0643;
    L_0x00c5:
        r3 = r2;
    L_0x00c6:
        r2 = r2 + 1;
        if (r18 == 0) goto L_0x006f;
    L_0x00ca:
        r7 = r3;
    L_0x00cb:
        if (r7 >= 0) goto L_0x00dc;
    L_0x00cd:
        r2 = z;	 Catch:{ IOException -> 0x00da }
        r3 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00da }
        com.whatsapp.util.Log.w(r2);	 Catch:{ IOException -> 0x00da }
        r23.release();	 Catch:{ IOException -> 0x00da }
    L_0x00d9:
        return;
    L_0x00da:
        r2 = move-exception;
        throw r2;
    L_0x00dc:
        r8 = android.media.MediaCodecList.getCodecCount();
        r4 = 0;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r5 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r2 = r2.append(r8);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        r5 = r2;
    L_0x00fd:
        if (r5 >= r8) goto L_0x063c;
    L_0x00ff:
        if (r4 != 0) goto L_0x063c;
    L_0x0101:
        r6 = android.media.MediaCodecList.getCodecInfoAt(r5);
        r2 = r6.isEncoder();	 Catch:{ IOException -> 0x014f }
        if (r2 != 0) goto L_0x010d;
    L_0x010b:
        if (r18 == 0) goto L_0x0639;
    L_0x010d:
        r9 = r6.getSupportedTypes();
        r3 = 0;
        r2 = 0;
    L_0x0113:
        r10 = r9.length;
        if (r2 >= r10) goto L_0x012b;
    L_0x0116:
        if (r3 != 0) goto L_0x012b;
    L_0x0118:
        r10 = r9[r2];	 Catch:{ IOException -> 0x0151 }
        r11 = z;	 Catch:{ IOException -> 0x0151 }
        r12 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;
        r11 = r11[r12];	 Catch:{ IOException -> 0x0151 }
        r10 = r10.equals(r11);	 Catch:{ IOException -> 0x0151 }
        if (r10 == 0) goto L_0x0127;
    L_0x0126:
        r3 = 1;
    L_0x0127:
        r2 = r2 + 1;
        if (r18 == 0) goto L_0x0113;
    L_0x012b:
        if (r3 == 0) goto L_0x0639;
    L_0x012d:
        r2 = r6;
    L_0x012e:
        r3 = r5 + 1;
        if (r18 == 0) goto L_0x063f;
    L_0x0132:
        r3 = r2;
    L_0x0133:
        if (r3 != 0) goto L_0x0153;
    L_0x0135:
        r2 = z;	 Catch:{ IOException -> 0x014d }
        r3 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r2 = r2[r3];	 Catch:{ IOException -> 0x014d }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x014d }
        r23.release();	 Catch:{ IOException -> 0x014d }
        r2 = new java.io.FileNotFoundException;	 Catch:{ IOException -> 0x014d }
        r3 = z;	 Catch:{ IOException -> 0x014d }
        r4 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r3 = r3[r4];	 Catch:{ IOException -> 0x014d }
        r2.<init>(r3);	 Catch:{ IOException -> 0x014d }
        throw r2;	 Catch:{ IOException -> 0x014d }
    L_0x014d:
        r2 = move-exception;
        throw r2;
    L_0x014f:
        r2 = move-exception;
        throw r2;
    L_0x0151:
        r2 = move-exception;
        throw r2;
    L_0x0153:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 213; // 0xd5 float:2.98E-43 double:1.05E-321;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r3.getName();
        r2 = r2.append(r4);
        r4 = z;
        r5 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = z;
        r5 = 233; // 0xe9 float:3.27E-43 double:1.15E-321;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r0 = r23;
        r4 = r0.getTrackFormat(r7);
        r2 = z;
        r5 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r2 = r2[r5];
        r5 = r4.getString(r2);
        r0 = r23;
        r0.selectTrack(r7);
        r2 = z;
        r6 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r2 = r2[r6];
        r16 = r4.getLong(r2);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r6 = z;
        r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r6 = r6[r7];
        r2 = r2.append(r6);
        r6 = r4.toString();
        r2 = r2.append(r6);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = android.media.MediaCodec.createDecoderByType(r5);
        if (r2 != 0) goto L_0x0204;
    L_0x01c8:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0202 }
        r2.<init>();	 Catch:{ IOException -> 0x0202 }
        r3 = z;	 Catch:{ IOException -> 0x0202 }
        r4 = 222; // 0xde float:3.11E-43 double:1.097E-321;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0202 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0202 }
        r2 = r2.append(r5);	 Catch:{ IOException -> 0x0202 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0202 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0202 }
        r23.release();	 Catch:{ IOException -> 0x0202 }
        r2 = new java.io.FileNotFoundException;	 Catch:{ IOException -> 0x0202 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0202 }
        r3.<init>();	 Catch:{ IOException -> 0x0202 }
        r4 = z;	 Catch:{ IOException -> 0x0202 }
        r6 = 234; // 0xea float:3.28E-43 double:1.156E-321;
        r4 = r4[r6];	 Catch:{ IOException -> 0x0202 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0202 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x0202 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0202 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x0202 }
        throw r2;	 Catch:{ IOException -> 0x0202 }
    L_0x0202:
        r2 = move-exception;
        throw r2;
    L_0x0204:
        r5 = z;
        r6 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        r5 = r5[r6];
        r5 = r4.getInteger(r5);
        r6 = z;
        r7 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        r6 = r6[r7];
        r6 = r4.getInteger(r6);
        r7 = 2;
        r3 = r3.getName();
        r24 = android.media.MediaCodec.createByCodecName(r3);
        r3 = z;
        r8 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        r3 = r3[r8];
        r3 = android.media.MediaFormat.createAudioFormat(r3, r5, r6);
        r8 = z;
        r9 = 214; // 0xd6 float:3.0E-43 double:1.057E-321;
        r8 = r8[r9];
        r9 = 96000; // 0x17700 float:1.34525E-40 double:4.74303E-319;
        r3.setInteger(r8, r9);
        r8 = z;
        r9 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        r8 = r8[r9];
        r3.setInteger(r8, r5);
        r8 = z;
        r9 = 223; // 0xdf float:3.12E-43 double:1.1E-321;
        r8 = r8[r9];
        r3.setInteger(r8, r6);
        r8 = z;
        r9 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r8 = r8[r9];
        r3.setInteger(r8, r7);
        r7 = z;
        r8 = 226; // 0xe2 float:3.17E-43 double:1.117E-321;
        r7 = r7[r8];
        r8 = 64000; // 0xfa00 float:8.9683E-41 double:3.162E-319;
        r3.setInteger(r7, r8);
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = z;
        r9 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r7 = r7.append(r3);
        r7 = r7.toString();
        com.whatsapp.util.Log.i(r7);
        r7 = 0;
        r8 = 0;
        r9 = 1;
        r0 = r24;
        r0.configure(r3, r7, r8, r9);
        r24.start();
        r25 = r24.getInputBuffers();
        r13 = r24.getOutputBuffers();
        r3 = 0;
        r7 = 0;
        r8 = 0;
        r2.configure(r4, r3, r7, r8);
        r2.start();
        r26 = r2.getInputBuffers();
        r15 = r2.getOutputBuffers();
        r27 = new android.media.MediaCodec$BufferInfo;
        r27.<init>();
        r28 = new android.media.MediaCodec$BufferInfo;
        r28.<init>();
        r12 = 0;
        r0 = r35;
        r8 = r0.o;	 Catch:{ IOException -> 0x05c3 }
        r10 = 0;
        r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r3 <= 0) goto L_0x02f1;
    L_0x02b1:
        r0 = r35;
        r8 = r0.o;	 Catch:{ IOException -> 0x05c3 }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 * r10;
        r3 = 0;
        r0 = r23;
        r0.seekTo(r8, r3);	 Catch:{ IOException -> 0x05c3 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x05c3 }
        r3.<init>();	 Catch:{ IOException -> 0x05c3 }
        r4 = z;	 Catch:{ IOException -> 0x05c3 }
        r7 = 235; // 0xeb float:3.3E-43 double:1.16E-321;
        r4 = r4[r7];	 Catch:{ IOException -> 0x05c3 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x05c3 }
        r0 = r35;
        r8 = r0.o;	 Catch:{ IOException -> 0x05c3 }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 * r10;
        r3 = r3.append(r8);	 Catch:{ IOException -> 0x05c3 }
        r4 = z;	 Catch:{ IOException -> 0x05c3 }
        r7 = 218; // 0xda float:3.05E-43 double:1.077E-321;
        r4 = r4[r7];	 Catch:{ IOException -> 0x05c3 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x05c3 }
        r8 = r23.getSampleTime();	 Catch:{ IOException -> 0x05c3 }
        r3 = r3.append(r8);	 Catch:{ IOException -> 0x05c3 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x05c3 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IOException -> 0x05c3 }
    L_0x02f1:
        r3 = 7;
        r0 = new byte[r3];
        r29 = r0;
        r3 = 0;
        r4 = -1;
        r29[r3] = r4;
        r3 = 1;
        r4 = -15;
        r29[r3] = r4;
        r3 = 1;
        r3 = (byte) r3;
        r4 = a(r5);
        r4 = (byte) r4;
        r0 = (byte) r6;
        r30 = r0;
        r5 = 2;
        r3 = r3 << 6;
        r3 = (byte) r3;
        r29[r5] = r3;
        r3 = 2;
        r5 = r29[r3];
        r4 = r4 << 2;
        r4 = r4 | r5;
        r4 = (byte) r4;
        r29[r3] = r4;
        r3 = 2;
        r4 = r29[r3];
        r5 = r30 >> 2;
        r4 = r4 | r5;
        r4 = (byte) r4;
        r29[r3] = r4;
        r3 = 3;
        r4 = 0;
        r29[r3] = r4;
        r3 = 4;
        r4 = 0;
        r29[r3] = r4;
        r3 = 5;
        r4 = 0;
        r29[r3] = r4;
        r3 = 6;
        r4 = -4;
        r29[r3] = r4;
        r11 = 0;
        r14 = 0;
        r4 = 0;
    L_0x0334:
        if (r4 != 0) goto L_0x0636;
    L_0x0336:
        r0 = r35;
        r3 = r0.n;	 Catch:{ all -> 0x05c7 }
        if (r3 != 0) goto L_0x0636;
    L_0x033c:
        r6 = 0;
        r3 = r2.dequeueInputBuffer(r6);	 Catch:{ all -> 0x05c7 }
        if (r3 < 0) goto L_0x0633;
    L_0x0344:
        r5 = r26[r3];	 Catch:{ all -> 0x05c7 }
        r6 = 0;
        r0 = r23;
        r10 = r0.readSampleData(r5, r6);	 Catch:{ all -> 0x05c7 }
        if (r10 >= 0) goto L_0x0363;
    L_0x034f:
        r4 = z;	 Catch:{ all -> 0x05c7 }
        r5 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        r4 = r4[r5];	 Catch:{ all -> 0x05c7 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ all -> 0x05c7 }
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r8 = 4;
        r2.queueInputBuffer(r3, r4, r5, r6, r8);	 Catch:{ all -> 0x05c7 }
        r4 = 1;
        if (r18 == 0) goto L_0x0630;
    L_0x0363:
        r9 = r4;
        r4 = 0;
        r6 = r23.getSampleTime();	 Catch:{ IOException -> 0x05c5 }
        r8 = 0;
        r5 = r10;
        r2.queueInputBuffer(r3, r4, r5, r6, r8);	 Catch:{ IOException -> 0x05c5 }
        r23.advance();	 Catch:{ IOException -> 0x05c5 }
        r3 = r9;
    L_0x0372:
        if (r18 == 0) goto L_0x037d;
    L_0x0374:
        r4 = z;	 Catch:{ IOException -> 0x05d8 }
        r5 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        r4 = r4[r5];	 Catch:{ IOException -> 0x05d8 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x05d8 }
    L_0x037d:
        r4 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r27;
        r31 = r2.dequeueOutputBuffer(r0, r4);	 Catch:{ all -> 0x05c7 }
        if (r31 < 0) goto L_0x062b;
    L_0x0388:
        r0 = r27;
        r4 = r0.presentationTimeUs;	 Catch:{ IOException -> 0x05da }
        r0 = r35;
        r6 = r0.o;	 Catch:{ IOException -> 0x05da }
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 * r8;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 < 0) goto L_0x0626;
    L_0x0397:
        r4 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r24;
        r5 = r0.dequeueInputBuffer(r4);	 Catch:{ all -> 0x05c7 }
        if (r5 < 0) goto L_0x0623;
    L_0x03a2:
        r4 = r25[r5];	 Catch:{ all -> 0x05c7 }
        r32 = r15[r31];	 Catch:{ all -> 0x05c7 }
        r0 = r27;
        r6 = r0.offset;	 Catch:{ IOException -> 0x05dc }
        r0 = r32;
        r0.position(r6);	 Catch:{ IOException -> 0x05dc }
        r0 = r27;
        r6 = r0.offset;	 Catch:{ IOException -> 0x05dc }
        r0 = r27;
        r7 = r0.size;	 Catch:{ IOException -> 0x05dc }
        r6 = r6 + r7;
        r0 = r32;
        r0.limit(r6);	 Catch:{ IOException -> 0x05dc }
        r4.clear();	 Catch:{ IOException -> 0x05dc }
        r0 = r32;
        r4.put(r0);	 Catch:{ IOException -> 0x05dc }
        r6 = 0;
        r0 = r27;
        r7 = r0.size;	 Catch:{ IOException -> 0x05dc }
        r0 = r27;
        r8 = r0.presentationTimeUs;	 Catch:{ IOException -> 0x05dc }
        r0 = r27;
        r10 = r0.flags;	 Catch:{ IOException -> 0x05dc }
        r4 = r24;
        r4.queueInputBuffer(r5, r6, r7, r8, r10);	 Catch:{ IOException -> 0x05dc }
        r0 = r27;
        r4 = r0.offset;	 Catch:{ IOException -> 0x05dc }
        r0 = r32;
        r0.position(r4);	 Catch:{ IOException -> 0x05dc }
        r0 = r27;
        r4 = r0.offset;	 Catch:{ IOException -> 0x05dc }
        r0 = r27;
        r5 = r0.size;	 Catch:{ IOException -> 0x05dc }
        r4 = r4 + r5;
        r0 = r32;
        r0.limit(r4);	 Catch:{ IOException -> 0x05dc }
        r0 = r35;
        r4 = r0.a;	 Catch:{ IOException -> 0x05dc }
        r6 = 0;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 <= 0) goto L_0x0408;
    L_0x03f8:
        r0 = r27;
        r4 = r0.presentationTimeUs;	 Catch:{ IOException -> 0x05dc }
        r0 = r35;
        r6 = r0.a;	 Catch:{ IOException -> 0x05dc }
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 * r8;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 <= 0) goto L_0x0408;
    L_0x0407:
        r3 = 1;
    L_0x0408:
        r4 = 0;
        r4 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1));
        if (r4 == 0) goto L_0x0623;
    L_0x040e:
        r0 = r35;
        r4 = r0.o;	 Catch:{ IOException -> 0x05de }
        r6 = 0;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 > 0) goto L_0x05e2;
    L_0x0418:
        r4 = 0;
    L_0x041a:
        r0 = r35;
        r6 = r0.a;	 Catch:{ IOException -> 0x05eb }
        r8 = 0;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 > 0) goto L_0x05ed;
    L_0x0424:
        r6 = r16;
    L_0x0426:
        r8 = 100;
        r0 = r27;
        r0 = r0.presentationTimeUs;	 Catch:{ all -> 0x05c7 }
        r32 = r0;
        r32 = r32 - r4;
        r8 = r8 * r32;
        r4 = r6 - r4;
        r4 = r8 / r4;
        r5 = (int) r4;	 Catch:{ all -> 0x05c7 }
        if (r5 == r12) goto L_0x0623;
    L_0x0439:
        r0 = r35;
        r4 = r0.k;	 Catch:{ all -> 0x05c7 }
        r6 = 100;
        r4 = r4.a(r6);	 Catch:{ all -> 0x05c7 }
        r0 = r35;
        r0.n = r4;	 Catch:{ all -> 0x05c7 }
    L_0x0447:
        r6 = 0;
        r0 = r24;
        r1 = r28;
        r4 = r0.dequeueOutputBuffer(r1, r6);	 Catch:{ all -> 0x05c7 }
        r7 = r4;
        r6 = r13;
        r4 = r11;
    L_0x0454:
        r8 = -1;
        if (r7 == r8) goto L_0x04f2;
    L_0x0457:
        if (r7 < 0) goto L_0x04b3;
    L_0x0459:
        r8 = r6[r7];	 Catch:{ all -> 0x05c7 }
        r0 = r28;
        r9 = r0.offset;	 Catch:{ all -> 0x05c7 }
        r8.position(r9);	 Catch:{ all -> 0x05c7 }
        r0 = r28;
        r9 = r0.offset;	 Catch:{ all -> 0x05c7 }
        r0 = r28;
        r10 = r0.size;	 Catch:{ all -> 0x05c7 }
        r9 = r9 + r10;
        r8.limit(r9);	 Catch:{ all -> 0x05c7 }
        r4 = r4 + 1;
        r0 = r28;
        r9 = r0.size;	 Catch:{ all -> 0x05c7 }
        r0 = r28;
        r10 = r0.offset;	 Catch:{ all -> 0x05c7 }
        r9 = r9 - r10;
        r9 = r9 + 7;
        r10 = r9 & 7;
        r11 = r9 >> 3;
        r11 = r11 & 255;
        r9 = r9 >> 11;
        r9 = r9 & 3;
        r12 = 3;
        r13 = r30 & 3;
        r13 = r13 << 6;
        r9 = r9 | r13;
        r9 = (byte) r9;
        r29[r12] = r9;	 Catch:{ IOException -> 0x05f6 }
        r9 = 4;
        r11 = (byte) r11;	 Catch:{ IOException -> 0x05f6 }
        r29[r9] = r11;	 Catch:{ IOException -> 0x05f6 }
        r9 = 5;
        r10 = r10 << 5;
        r10 = r10 | 31;
        r10 = (byte) r10;	 Catch:{ IOException -> 0x05f6 }
        r29[r9] = r10;	 Catch:{ IOException -> 0x05f6 }
        r9 = java.nio.ByteBuffer.wrap(r29);	 Catch:{ IOException -> 0x05f6 }
        r0 = r22;
        r0.write(r9);	 Catch:{ IOException -> 0x05f6 }
        r0 = r22;
        r0.write(r8);	 Catch:{ IOException -> 0x05f6 }
        r8.clear();	 Catch:{ IOException -> 0x05f6 }
        r8 = 0;
        r0 = r24;
        r0.releaseOutputBuffer(r7, r8);	 Catch:{ IOException -> 0x05f6 }
        if (r18 == 0) goto L_0x04e6;
    L_0x04b3:
        r8 = -3;
        if (r7 != r8) goto L_0x04c5;
    L_0x04b6:
        r6 = r24.getOutputBuffers();	 Catch:{ all -> 0x05c7 }
        r8 = z;	 Catch:{ IOException -> 0x05f8 }
        r9 = 236; // 0xec float:3.31E-43 double:1.166E-321;
        r8 = r8[r9];	 Catch:{ IOException -> 0x05f8 }
        com.whatsapp.util.Log.i(r8);	 Catch:{ IOException -> 0x05f8 }
        if (r18 == 0) goto L_0x04e6;
    L_0x04c5:
        r8 = -2;
        if (r7 != r8) goto L_0x04e6;
    L_0x04c8:
        r7 = r24.getOutputFormat();	 Catch:{ all -> 0x05c7 }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x05c7 }
        r8.<init>();	 Catch:{ all -> 0x05c7 }
        r9 = z;	 Catch:{ all -> 0x05c7 }
        r10 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;
        r9 = r9[r10];	 Catch:{ all -> 0x05c7 }
        r8 = r8.append(r9);	 Catch:{ all -> 0x05c7 }
        r7 = r8.append(r7);	 Catch:{ all -> 0x05c7 }
        r7 = r7.toString();	 Catch:{ all -> 0x05c7 }
        com.whatsapp.util.Log.i(r7);	 Catch:{ all -> 0x05c7 }
    L_0x04e6:
        r8 = 0;
        r0 = r24;
        r1 = r28;
        r7 = r0.dequeueOutputBuffer(r1, r8);	 Catch:{ all -> 0x05c7 }
        if (r18 == 0) goto L_0x0454;
    L_0x04f2:
        if (r18 == 0) goto L_0x061f;
    L_0x04f4:
        r14 = r14 + 1;
        r11 = r4;
        r4 = r14;
    L_0x04f8:
        r7 = 0;
        r0 = r31;
        r2.releaseOutputBuffer(r0, r7);	 Catch:{ IOException -> 0x05fa }
        if (r18 == 0) goto L_0x0616;
    L_0x0500:
        r7 = r6;
    L_0x0501:
        r6 = -3;
        r0 = r31;
        if (r0 != r6) goto L_0x0613;
    L_0x0506:
        r6 = r2.getOutputBuffers();	 Catch:{ all -> 0x05c7 }
        r8 = z;	 Catch:{ IOException -> 0x05fc }
        r9 = 227; // 0xe3 float:3.18E-43 double:1.12E-321;
        r8 = r8[r9];	 Catch:{ IOException -> 0x05fc }
        com.whatsapp.util.Log.i(r8);	 Catch:{ IOException -> 0x05fc }
        if (r18 == 0) goto L_0x0538;
    L_0x0515:
        r8 = -2;
        r0 = r31;
        if (r0 != r8) goto L_0x0538;
    L_0x051a:
        r8 = r2.getOutputFormat();	 Catch:{ all -> 0x05c7 }
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x05c7 }
        r9.<init>();	 Catch:{ all -> 0x05c7 }
        r10 = z;	 Catch:{ all -> 0x05c7 }
        r12 = 232; // 0xe8 float:3.25E-43 double:1.146E-321;
        r10 = r10[r12];	 Catch:{ all -> 0x05c7 }
        r9 = r9.append(r10);	 Catch:{ all -> 0x05c7 }
        r8 = r9.append(r8);	 Catch:{ all -> 0x05c7 }
        r8 = r8.toString();	 Catch:{ all -> 0x05c7 }
        com.whatsapp.util.Log.i(r8);	 Catch:{ all -> 0x05c7 }
    L_0x0538:
        r34 = r3;
        r3 = r4;
        r4 = r34;
    L_0x053d:
        r0 = r27;
        r8 = r0.flags;	 Catch:{ IOException -> 0x05fe }
        r8 = r8 & 4;
        if (r8 == 0) goto L_0x0550;
    L_0x0545:
        r8 = z;	 Catch:{ IOException -> 0x05fe }
        r9 = 228; // 0xe4 float:3.2E-43 double:1.126E-321;
        r8 = r8[r9];	 Catch:{ IOException -> 0x05fe }
        com.whatsapp.util.Log.i(r8);	 Catch:{ IOException -> 0x05fe }
        if (r18 == 0) goto L_0x0552;
    L_0x0550:
        if (r18 == 0) goto L_0x060d;
    L_0x0552:
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x05c7 }
        r4.<init>();	 Catch:{ all -> 0x05c7 }
        r5 = z;	 Catch:{ all -> 0x05c7 }
        r6 = 215; // 0xd7 float:3.01E-43 double:1.06E-321;
        r5 = r5[r6];	 Catch:{ all -> 0x05c7 }
        r4 = r4.append(r5);	 Catch:{ all -> 0x05c7 }
        r4 = r4.append(r11);	 Catch:{ all -> 0x05c7 }
        r5 = z;	 Catch:{ all -> 0x05c7 }
        r6 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;
        r5 = r5[r6];	 Catch:{ all -> 0x05c7 }
        r4 = r4.append(r5);	 Catch:{ all -> 0x05c7 }
        r3 = r4.append(r3);	 Catch:{ all -> 0x05c7 }
        r3 = r3.toString();	 Catch:{ all -> 0x05c7 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ all -> 0x05c7 }
        r2.stop();
        r2.release();
        r24.stop();
        r24.release();
        r23.release();
        r22.close();	 Catch:{ IOException -> 0x0602 }
        r19.close();	 Catch:{ IOException -> 0x0602 }
    L_0x058f:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 221; // 0xdd float:3.1E-43 double:1.09E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r4 = java.lang.System.currentTimeMillis();
        r4 = r4 - r20;
        r2 = r2.append(r4);
        r3 = z;
        r4 = 237; // 0xed float:3.32E-43 double:1.17E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r35;
        r3 = r0.n;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        goto L_0x00d9;
    L_0x05c3:
        r2 = move-exception;
        throw r2;
    L_0x05c5:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05c7 }
    L_0x05c7:
        r3 = move-exception;
        r2.stop();
        r2.release();
        r24.stop();
        r24.release();
        r23.release();
        throw r3;
    L_0x05d8:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05c7 }
    L_0x05da:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05c7 }
    L_0x05dc:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05c7 }
    L_0x05de:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x05e0 }
    L_0x05e0:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05c7 }
    L_0x05e2:
        r0 = r35;
        r4 = r0.o;	 Catch:{ all -> 0x05c7 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        goto L_0x041a;
    L_0x05eb:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05c7 }
    L_0x05ed:
        r0 = r35;
        r6 = r0.a;	 Catch:{ all -> 0x05c7 }
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 * r8;
        goto L_0x0426;
    L_0x05f6:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05c7 }
    L_0x05f8:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05c7 }
    L_0x05fa:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05c7 }
    L_0x05fc:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05c7 }
    L_0x05fe:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x0600 }
    L_0x0600:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05c7 }
    L_0x0602:
        r2 = move-exception;
        r3 = z;
        r4 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x058f;
    L_0x060d:
        r14 = r3;
        r12 = r5;
        r15 = r6;
        r13 = r7;
        goto L_0x0334;
    L_0x0613:
        r6 = r15;
        goto L_0x0515;
    L_0x0616:
        r7 = r6;
        r6 = r15;
        r34 = r4;
        r4 = r3;
        r3 = r34;
        goto L_0x053d;
    L_0x061f:
        r11 = r4;
        r4 = r14;
        goto L_0x04f8;
    L_0x0623:
        r5 = r12;
        goto L_0x0447;
    L_0x0626:
        r4 = r11;
        r5 = r12;
        r6 = r13;
        goto L_0x04f4;
    L_0x062b:
        r4 = r14;
        r5 = r12;
        r7 = r13;
        goto L_0x0501;
    L_0x0630:
        r3 = r4;
        goto L_0x0372;
    L_0x0633:
        r3 = r4;
        goto L_0x0374;
    L_0x0636:
        r3 = r14;
        goto L_0x0552;
    L_0x0639:
        r2 = r4;
        goto L_0x012e;
    L_0x063c:
        r3 = r4;
        goto L_0x0133;
    L_0x063f:
        r5 = r3;
        r4 = r2;
        goto L_0x00fd;
    L_0x0643:
        r7 = r2;
        goto L_0x00cb;
    L_0x0646:
        r7 = r3;
        goto L_0x00cb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.id.e():void");
    }

    public static boolean b(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[4];
            fileInputStream.skip(4);
            fileInputStream.read(bArr);
            fileInputStream.close();
            if (Arrays.equals(bArr, j)) {
                return true;
            }
            Log.w(z[186] + file.getAbsolutePath() + z[187]);
            return false;
        } catch (IOException e) {
            Log.w(z[185] + e.toString());
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r8) {
        /*
        r2 = com.whatsapp.App.az;
        r1 = "";
        r0 = new java.lang.ProcessBuilder;	 Catch:{ IOException -> 0x0040 }
        r3 = 2;
        r3 = new java.lang.String[r3];	 Catch:{ IOException -> 0x0040 }
        r4 = 0;
        r5 = z;	 Catch:{ IOException -> 0x0040 }
        r6 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0040 }
        r3[r4] = r5;	 Catch:{ IOException -> 0x0040 }
        r4 = 1;
        r3[r4] = r8;	 Catch:{ IOException -> 0x0040 }
        r0.<init>(r3);	 Catch:{ IOException -> 0x0040 }
        r3 = 1;
        r0 = r0.redirectErrorStream(r3);	 Catch:{ IOException -> 0x0040 }
        r3 = r0.start();	 Catch:{ IOException -> 0x0040 }
        r4 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x0040 }
        r0 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x0040 }
        r5 = r3.getInputStream();	 Catch:{ IOException -> 0x0040 }
        r0.<init>(r5);	 Catch:{ IOException -> 0x0040 }
        r4.<init>(r0);	 Catch:{ IOException -> 0x0040 }
        r0 = "";
    L_0x0031:
        r0 = r4.readLine();	 Catch:{ IOException -> 0x0040 }
        if (r0 == 0) goto L_0x0063;
    L_0x0037:
        if (r2 == 0) goto L_0x0061;
    L_0x0039:
        r4.close();	 Catch:{ IOException -> 0x005f }
        r3.destroy();	 Catch:{ IOException -> 0x005f }
    L_0x003f:
        return r0;
    L_0x0040:
        r0 = move-exception;
        r7 = r0;
        r0 = r1;
        r1 = r7;
    L_0x0044:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        goto L_0x003f;
    L_0x005f:
        r1 = move-exception;
        goto L_0x0044;
    L_0x0061:
        r1 = r0;
        goto L_0x0031;
    L_0x0063:
        r0 = r1;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.id.a(java.lang.String):java.lang.String");
    }

    public void a(a1y com_whatsapp_a1y) {
        this.k = com_whatsapp_a1y;
    }

    static {
        String[] strArr = new String[266];
        String str = "{E;mo/H!q4";
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
                        i4 = 91;
                        break;
                    case ay.f /*1*/:
                        i4 = 33;
                        break;
                    case ay.n /*2*/:
                        i4 = 78;
                        break;
                    case ay.p /*3*/:
                        i4 = 31;
                        break;
                    default:
                        i4 = 14;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktB/q)/\u0001-mk:U+?j>B!{k)\u0001(p|{";
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = "\u0015Nn|a?D-?}.Q>p|/H x.-H*zat@8|";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "{R%v~=H<lz=S/rk(\u001b";
                    i = 3;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "{B<zo/D*";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "(M'|kvI+vi3U";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<?}/@<kk?";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktB/q)/\u0001-mk:U+?j>B!{k)\u0001(p|{";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktO;rl>Snph{U<~m0Rt";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "8N\"p|vG!mc:U";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "6H#z";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    str = "6Ux*6b";
                    i = 11;
                    i2 = 12;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    strArr2 = strArr3;
                    str = "\u0014l\u00161@-H*vou";
                    i = 12;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    str = "8N\"p|vG!mc:U";
                    i = 13;
                    i2 = 14;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    strArr2 = strArr3;
                    str = "\u0014l\u00161]\u001eb`~x8\u000f+qm";
                    i = 14;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD6k|:B:p|{c\u001bYH\u001es\u0011YB\u001af\u0011Z@\u001f~\u0001YQ\bu\u001cZO\u0016";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "8S!o#/N>";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktR%v~+H x..O=j~+N<kk?\u0001-pb4Snya)L/k.";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "{L'rka";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "9H:mo/D";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?}/@<kk?";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktB\"p}>";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktL'rk{";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "{H=?a0";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "{E+|a?D<]{=G+mG5G!1~)D=z`/@:va5u'rk\u000eRt";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktO!k.:\u00018vj>Nnyg7D";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "=S/rkvS/kk";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "{G<~c>Rt";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktG'qg(I+{4{";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "\u0015Nn{k8N*z|(\u0001";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<0}0H>?";
                    i = 30;
                    i2 = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    strArr2 = strArr3;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktB!qh2F;mk{D |a?D<?y2U&?a.U>jz{G!mc:Un";
                    i = 31;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<?m4O(vi.S+{";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "\bi\u0018";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?}/N>ok?";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "{G<pca";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "{S!ko/H!q4";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktO!?e5N9q.8N\"p|{G!mc:U=?}.Q!mz>E";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "3D'xf/";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD6k|:B:p|{S+sk:R+{";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "\u0014l\u00161eh\u000f8vj>N`z`8N*z|u@8|";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "2\f(mo6Dcv`/D<io7";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "6H#z";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "{E;mo/H!q4";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "?T<~z2N J}";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "{G!m.\u0014l\u00161]\u001eb`~x8\u000f+qm";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "{R%v~=H<lz=S/rk(\u001b";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "{C'k|:U+%";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "\u0017fc[6k";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "{E;mo/H!q4";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "\u001cucQ9k\u0011~";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "a\u0001";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<0z)Xn";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "{@-k{:Mt";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?y4S%~|4T {.(@#l{5Fnv`8N<mk8Unwk2F&k";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "-H*zat@8|";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "-H*za/S/q}8N*z|tE+|a?D<0j>P;z{>\u000e'q~.Un";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "{E;mo/H!q4";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = "-H*zat@8|";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<?j)@'qg5Fn";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "\u001cucV7j\u0011~";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktB!qh2F;mk{G<~c>\u0001-p`-D<kk)\u0001(ma6\u001bf";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "{E+|a?D<]{=G+mG5G!1}2[+%";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "8S!o#7D(k";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "{G<~c>\u001b";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "-H*za/S/q}8N*z|tE+|a?D<0\u007f.D;z!2O>jz{";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "(U<vj>";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "\u0014l\u00161g/U'~cuW'{k4\u000f*zm4E+m :W-";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD6k|:B:p|t@*io5B+?";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE!qk{B/qm>M\"zja";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i2] = str;
                    i2 = 72;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<0|>M+~}>\u000e!jz+T:";
                    i = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i2] = str;
                    i2 = 73;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?m4M!m.=N<ro/\u0001(p|{i;~g,D'?g(\u0001|.=k\u0016~)8c\u0019";
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE!qk{B/qm>M\"zja";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktG!j`?\u0001";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i2] = str;
                    i2 = 76;
                    str = "{G!mc:Ut";
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i2] = str;
                    i2 = 77;
                    str = "\u0014l\u00161K#X p}u`\u0018\\ \u001eO-pj>S";
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i2] = str;
                    i2 = 78;
                    str = "{U'rka";
                    i = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i2] = str;
                    i2 = 79;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<0|>M+~}>\u000e!jz+T:";
                    i = 78;
                    strArr2 = strArr3;
                    break;
                case 78:
                    strArr2[i2] = str;
                    i2 = 80;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktU<~m0\u001b";
                    i = 79;
                    strArr2 = strArr3;
                    break;
                case 79:
                    strArr2[i2] = str;
                    i2 = 81;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<?j)@'qk?";
                    i = 80;
                    strArr2 = strArr3;
                    break;
                case 80:
                    strArr2[i2] = str;
                    i2 = 82;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<?y4S%~|4T {.,S!qi{B!sa)\u0001(p|6@:?h4Snw{:V+v";
                    i = 81;
                    strArr2 = strArr3;
                    break;
                case 81:
                    strArr2[i2] = str;
                    i2 = 83;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?A.U>jz\u0019T(yk)\u0001\fJH\u001dd\u001c@H\u0017`\t@K\u0015e\u0011PH\u0004r\u001aMK\u001al";
                    i = 82;
                    strArr2 = strArr3;
                    break;
                case 82:
                    strArr2[i2] = str;
                    i2 = 84;
                    str = "-H*zatT t`4V ";
                    i = 83;
                    strArr2 = strArr3;
                    break;
                case 83:
                    strArr2[i2] = str;
                    i2 = 85;
                    str = "8S!o#)H)wz";
                    i = 84;
                    strArr2 = strArr3;
                    break;
                case 84:
                    strArr2[i2] = str;
                    i2 = 86;
                    str = "\u0014l\u00161\u007f8N#1x2E+p >O-pj>S`~x8";
                    i = 85;
                    strArr2 = strArr3;
                    break;
                case 85:
                    strArr2[i2] = str;
                    i2 = 87;
                    str = "(M'|kvI+vi3U";
                    i = 86;
                    strArr2 = strArr3;
                    break;
                case 86:
                    strArr2[i2] = str;
                    i2 = 88;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?a.U>jz{C;yh>S=?f:W+?m3@ xk?";
                    i = 87;
                    strArr2 = strArr3;
                    break;
                case 87:
                    strArr2[i2] = str;
                    i2 = 89;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD6k|:B:p|{S+sk:R+{";
                    i = 88;
                    strArr2 = strArr3;
                    break;
                case 88:
                    strArr2[i2] = str;
                    i2 = 90;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktQ<pi)D=l.";
                    i = 89;
                    strArr2 = strArr3;
                    break;
                case 89:
                    strArr2[i2] = str;
                    i2 = 91;
                    str = "\u0014l\u00161eh\u000f8vj>N`z`8N*z|u@8|";
                    i = 90;
                    strArr2 = strArr3;
                    break;
                case 90:
                    strArr2[i2] = str;
                    i2 = 92;
                    str = "\b`\u0003L[\u0015fcLI\u0013\f\u0007(9l";
                    i = 91;
                    strArr2 = strArr3;
                    break;
                case 91:
                    strArr2[i2] = str;
                    i2 = 93;
                    str = "\u001aL/ea5";
                    i = 92;
                    strArr2 = strArr3;
                    break;
                case 92:
                    strArr2[i2] = str;
                    i2 = 94;
                    str = "{U!%&";
                    i = 93;
                    strArr2 = strArr3;
                    break;
                case 93:
                    strArr2[i2] = str;
                    i2 = 95;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<?}/N>ok?";
                    i = 94;
                    strArr2 = strArr3;
                    break;
                case 94:
                    strArr2[i2] = str;
                    i2 = 96;
                    str = "-H*zat@8|";
                    i = 95;
                    strArr2 = strArr3;
                    break;
                case 95:
                    strArr2[i2] = str;
                    i2 = 97;
                    str = "\u0014l\u00161]\u001eb`~x8\u000f+qm";
                    i = 96;
                    strArr2 = strArr3;
                    break;
                case 96:
                    strArr2[i2] = str;
                    i2 = 98;
                    str = "\bez&=kt\u001c";
                    i = 97;
                    strArr2 = strArr3;
                    break;
                case 97:
                    strArr2[i2] = str;
                    i2 = 99;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<?}/N>ok?";
                    i = 98;
                    strArr2 = strArr3;
                    break;
                case 98:
                    strArr2[i2] = str;
                    i2 = 100;
                    str = "{R'eka";
                    i = 99;
                    strArr2 = strArr3;
                    break;
                case 99:
                    strArr2[i2] = str;
                    i2 = 101;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<0\u007f.D;z!2O>jz";
                    i = 100;
                    strArr2 = strArr3;
                    break;
                case 100:
                    strArr2[i2] = str;
                    i2 = 102;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<?|>M+~}>E";
                    i = 101;
                    strArr2 = strArr3;
                    break;
                case 101:
                    strArr2[i2] = str;
                    i2 = 103;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<0j>P;z{>\u000e'q~.Un";
                    i = 102;
                    strArr2 = strArr3;
                    break;
                case 102:
                    strArr2[i2] = str;
                    i2 = 104;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD {./H#z.?D:zm/D*?";
                    i = 103;
                    strArr2 = strArr3;
                    break;
                case 103:
                    strArr2[i2] = str;
                    i2 = 105;
                    str = "{R'eka";
                    i = 104;
                    strArr2 = strArr3;
                    break;
                case 104:
                    strArr2[i2] = str;
                    i2 = 106;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<0j>P;z{>\u000e'q~.Un#.k";
                    i = 105;
                    strArr2 = strArr3;
                    break;
                case 105:
                    strArr2[i2] = str;
                    i2 = 107;
                    str = "{R;o~4S:v`<\u0001";
                    i = 106;
                    strArr2 = strArr3;
                    break;
                case 106:
                    strArr2[i2] = str;
                    i2 = 108;
                    str = "{U!%";
                    i = 107;
                    strArr2 = strArr3;
                    break;
                case 107:
                    strArr2[i2] = str;
                    i2 = 109;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<?|>M+~}>E";
                    i = 108;
                    strArr2 = strArr3;
                    break;
                case 108:
                    strArr2[i2] = str;
                    i2 = 110;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?a.U>jz{G!mc:Unwo(\u0001-wo5F+{./Nn";
                    i = 109;
                    strArr2 = strArr3;
                    break;
                case 109:
                    strArr2[i2] = str;
                    i2 = 111;
                    str = "-H*za";
                    i = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i2] = str;
                    i2 = 112;
                    str = "\u0017fcI]b\u0019~";
                    i = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i2] = str;
                    i2 = 113;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktM!p~{";
                    i = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i2] = str;
                    i2 = 114;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<?j)@'qg5Fn";
                    i = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i2] = str;
                    i2 = 115;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?h4S#~za";
                    i = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i2] = str;
                    i2 = 116;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD6k|:B:p|tR/r~7Dnlg!Dt";
                    i = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i2] = str;
                    i2 = 117;
                    str = "\u0017f\u000b";
                    i = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i2] = str;
                    i2 = 118;
                    str = "{G<~c>Rt";
                    i = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i2] = str;
                    i2 = 119;
                    str = "\u0017fcY=i\u0011";
                    i = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i2] = str;
                    i2 = 120;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{k";
                    i = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i2] = str;
                    i2 = 121;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktR+ze{U!%";
                    i = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i2] = str;
                    i2 = 122;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<0j>P;z{>\u000e!jz+T:?";
                    i = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i2] = str;
                    i2 = 123;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktO;rl>Snph{B!{k8Rt?";
                    i = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i2] = str;
                    i2 = 124;
                    str = "{G<~c>Rt";
                    i = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i2] = str;
                    i2 = 125;
                    str = "-H*zat@8|";
                    i = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i2] = str;
                    i2 = 126;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<0j>P;z{>\u000e!jz+T:?";
                    i = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i2] = str;
                    i2 = 127;
                    str = "\u0018@ 8z{B<zo/Dn{k8N*z|{G!m.";
                    i = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i2] = str;
                    i2 = 128;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<?a.U>jz{C;yh>S=?f:W+?m3@ xk?";
                    i = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i2] = str;
                    i2 = 129;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<?a.U>jz{G!mc:Unwo(\u0001-wo5F+{./Nn";
                    i = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i2] = str;
                    i2 = 130;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<?j)@'qk?";
                    i = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i2] = str;
                    i2 = 131;
                    str = "{E+|a?D<]{=G+mG5G!1h7@)l4";
                    i = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i2] = str;
                    i2 = 132;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktR%v~+H x.";
                    i = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i2] = str;
                    i2 = 133;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktB!qx>S:?j>B!{k)c;yh>S\u0007qh4\u000f!yh(D:%";
                    i = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i2] = str;
                    i2 = 134;
                    str = "{D |a?D<Y|:L+Lg!Dt";
                    i = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i2] = str;
                    i2 = 135;
                    str = "\u0014l\u00161]\u001eb`~x8\u000f+qm";
                    i = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i2] = str;
                    i2 = 136;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?";
                    i = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i2] = str;
                    i2 = 137;
                    str = "(U<vj>";
                    i = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i2] = str;
                    i2 = 138;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktG!mm>\u0001(mo6Dn{g6D lg4O=?h4Snra/N<pb:\u0001:p.";
                    i = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i2] = str;
                    i2 = 139;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?m)D/kk?";
                    i = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i2] = str;
                    i2 = 140;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?m4O(vi.S+{";
                    i = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i2] = str;
                    i2 = 141;
                    str = ",H*kf";
                    i = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i2] = str;
                    i2 = 142;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?|>M+~}>E";
                    i = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i2] = str;
                    i2 = 143;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<?y4S%~|4T {.,S!qi{B!sa)\u0001(p|6@:?h4Snlo6R;qi";
                    i = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i2] = str;
                    i2 = 144;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktB!qx>S:zj";
                    i = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i2] = str;
                    i2 = 145;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?";
                    i = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i2] = str;
                    i2 = 146;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktG<~c>\u0001=tg+Q+{.";
                    i = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i2] = str;
                    i2 = 147;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktB!sa)\u0001(p|6@:l4{";
                    i = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i2] = str;
                    i2 = 148;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?h:H\"zj{U!?m4O(vi.S+3.,H\"s./S7?j2G(z|>O:?a5Dn";
                    i = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i2] = str;
                    i2 = 149;
                    str = "\rrw'>\u0004\u0015\t";
                    i = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i2] = str;
                    i2 = 150;
                    str = "\u0018@ 8z{B<zo/Dn{k8N*z|{G!m.";
                    i = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i2] = str;
                    i2 = 151;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?}/N>ok?";
                    i = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i2] = str;
                    i2 = 152;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktO!?m4E+|.(T>oa)U'qi{W'{k4\u000e/im";
                    i = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i2] = str;
                    i2 = 153;
                    str = "\u0015Nnt`4V ?m4M!m.=N<ro/Rnl{+N<kk?";
                    i = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i2] = str;
                    i2 = 154;
                    str = "\u0014l\u00161C\u000fj`IG\u001fd\u00011K\u0015b\u0001[K\t\u000f\u000fIM";
                    i = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i2] = str;
                    i2 = 155;
                    str = "6N:p|4M/";
                    i = 154;
                    strArr2 = strArr3;
                    break;
                case 154:
                    strArr2[i2] = str;
                    i2 = 156;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktD |a?D<?m)D/kk?";
                    i = 155;
                    strArr2 = strArr3;
                    break;
                case 155:
                    strArr2[i2] = str;
                    i2 = 157;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktR!j|8Dt";
                    i = 156;
                    strArr2 = strArr3;
                    break;
                case 156:
                    strArr2[i2] = str;
                    i2 = 158;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktE+|a?D<?|>M+~}>E";
                    i = 157;
                    strArr2 = strArr3;
                    break;
                case 157:
                    strArr2[i2] = str;
                    i2 = 159;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{ktW'{k4N;k~.U=j|=@-z.8S+~z>E";
                    i = 158;
                    strArr2 = strArr3;
                    break;
                case 158:
                    strArr2[i2] = str;
                    i2 = 160;
                    str = "tR7lz>La}g5\u000e)zz+S!o";
                    i = 159;
                    strArr2 = strArr3;
                    break;
                case 159:
                    strArr2[i2] = str;
                    i2 = 161;
                    str = "<D:lw(U+r~)N>z|/Xa";
                    i = 160;
                    strArr2 = strArr3;
                    break;
                case 160:
                    strArr2[i2] = str;
                    i2 = 162;
                    str = "-H*za/S/q}8N*z|tU<vctR:~|/\u0001(ma6\u0001";
                    i = 161;
                    strArr2 = strArr3;
                    break;
                case 161:
                    strArr2[i2] = str;
                    i2 = 163;
                    str = "-H*za/S/q}8N*z|tU<vctG'qg(I+{4{";
                    i = 162;
                    strArr2 = strArr3;
                    break;
                case 162:
                    strArr2[i2] = str;
                    i2 = 164;
                    str = "{R'eka";
                    i = 163;
                    strArr2 = strArr3;
                    break;
                case 163:
                    strArr2[i2] = str;
                    i2 = 165;
                    str = "-H*za/S/q}8N*z|tU<vct\u0001=f`8\u0001=~c+M+?z)H#?h)N#?";
                    i = 164;
                    strArr2 = strArr3;
                    break;
                case 164:
                    strArr2[i2] = str;
                    i2 = 166;
                    str = "/H#zH)N#%";
                    i = 165;
                    strArr2 = strArr3;
                    break;
                case 165:
                    strArr2[i2] = str;
                    i2 = 167;
                    str = "{U!?";
                    i = 166;
                    strArr2 = strArr3;
                    break;
                case 166:
                    strArr2[i2] = str;
                    i2 = 168;
                    str = "{U'rk\u000fNt";
                    i = 167;
                    strArr2 = strArr3;
                    break;
                case 167:
                    strArr2[i2] = str;
                    i2 = 169;
                    str = "{U!?";
                    i = 168;
                    strArr2 = strArr3;
                    break;
                case 168:
                    strArr2[i2] = str;
                    i2 = 170;
                    str = "{R'eka";
                    i = 169;
                    strArr2 = strArr3;
                    break;
                case 169:
                    strArr2[i2] = str;
                    i2 = 171;
                    str = "-H*za/S/q}8N*z|tL;g!{W'{k4\u0001/{j>E";
                    i = 170;
                    strArr2 = strArr3;
                    break;
                case 170:
                    strArr2[i2] = str;
                    i2 = 172;
                    str = ">O)";
                    i = 171;
                    strArr2 = strArr3;
                    break;
                case 171:
                    strArr2[i2] = str;
                    i2 = 173;
                    str = "{D {]:L>ska";
                    i = 172;
                    strArr2 = strArr3;
                    break;
                case 172:
                    strArr2[i2] = str;
                    i2 = 174;
                    str = "-H*za/S/q}8N*z|tL;g!=H v}3D*%.";
                    i = 173;
                    strArr2 = strArr3;
                    break;
                case 173:
                    strArr2[i2] = str;
                    i2 = 175;
                    str = "-H*za/S/q}8N*z|tL;g!{U'rk\u001dS!r4";
                    i = 174;
                    strArr2 = strArr3;
                    break;
                case 174:
                    strArr2[i2] = str;
                    i2 = 176;
                    str = "-H*z";
                    i = 175;
                    strArr2 = strArr3;
                    break;
                case 175:
                    strArr2[i2] = str;
                    i2 = 177;
                    str = "{R'eka";
                    i = 176;
                    strArr2 = strArr3;
                    break;
                case 176:
                    strArr2[i2] = str;
                    i2 = 178;
                    str = "-H*za/S/q}8N*z|tL;g!{R:~|/r/r~7Dt";
                    i = 177;
                    strArr2 = strArr3;
                    break;
                case 177:
                    strArr2[i2] = str;
                    i2 = 179;
                    str = "{U'rk\u000fNt";
                    i = 178;
                    strArr2 = strArr3;
                    break;
                case 178:
                    strArr2[i2] = str;
                    i2 = 180;
                    str = "-H*za/S/q}8N*z|tL;g!{@;{g4\u0001/{j>E";
                    i = 179;
                    strArr2 = strArr3;
                    break;
                case 179:
                    strArr2[i2] = str;
                    i2 = 181;
                    str = "-H*za/S/q}8N*z|tL;g!(U/mz";
                    i = 180;
                    strArr2 = strArr3;
                    break;
                case 180:
                    strArr2[i2] = str;
                    i2 = 182;
                    str = "uI|):";
                    i = 181;
                    strArr2 = strArr3;
                    break;
                case 181:
                    strArr2[i2] = str;
                    i2 = 183;
                    str = "{C>l.2Rnqa/\u0001=j~+N<kk?";
                    i = 182;
                    strArr2 = strArr3;
                    break;
                case 182:
                    strArr2[i2] = str;
                    i2 = 184;
                    str = "-H*za/S/q}8N*z|tR/r~7H x.)@:z.";
                    i = 183;
                    strArr2 = strArr3;
                    break;
                case 183:
                    strArr2[i2] = str;
                    i2 = 185;
                    str = "-H*za/S/q}8N*z|tH=v}4L+{g:\u000e";
                    i = 184;
                    strArr2 = strArr3;
                    break;
                case 184:
                    strArr2[i2] = str;
                    i2 = 186;
                    str = "-H*za/S/q}8N*z|tH=v}4L+{g:\u000e";
                    i = 185;
                    strArr2 = strArr3;
                    break;
                case 185:
                    strArr2[i2] = str;
                    i2 = 187;
                    str = "{H=?`4Unv}4\u0001,~}>\u0001#zj2@n|a5U/v`>S";
                    i = 186;
                    strArr2 = strArr3;
                    break;
                case 186:
                    strArr2[i2] = str;
                    i2 = 188;
                    str = "\u0014l\u00161C\u001as\u0018ZB\u0017\u000f\u0018VJ\u001en`W<m\u0015\u000bQM\u0014e\u000bM";
                    i = 187;
                    strArr2 = strArr3;
                    break;
                case 187:
                    strArr2[i2] = str;
                    i2 = 189;
                    str = "\u0014l\u00161K#X p}u@8| >O-";
                    i = 188;
                    strArr2 = strArr3;
                    break;
                case 188:
                    strArr2[i2] = str;
                    i2 = 190;
                    str = "\u0014l\u00161]\u000f\u000f\u0018YCui|):\u001eO-";
                    i = 189;
                    strArr2 = strArr3;
                    break;
                case 189:
                    strArr2[i2] = str;
                    i2 = 191;
                    str = "\u0014l\u00161C\u001as\u0018ZB\u0017\u000f\u0018VJ\u001en`WYub\u0001[Ol\u0014z-K\u0015b\u0001[K\t";
                    i = 190;
                    strArr2 = strArr3;
                    break;
                case 190:
                    strArr2[i2] = str;
                    i2 = 192;
                    str = "\u0014l\u00161i4N)skuI|):uD |a?D<";
                    i = 191;
                    strArr2 = strArr3;
                    break;
                case 191:
                    strArr2[i2] = str;
                    i2 = 193;
                    str = "/H#zH)N#%";
                    i = 192;
                    strArr2 = strArr3;
                    break;
                case 192:
                    strArr2[i2] = str;
                    i2 = 194;
                    str = "{U'rk\u000fNt";
                    i = 193;
                    strArr2 = strArr3;
                    break;
                case 193:
                    strArr2[i2] = str;
                    i2 = 195;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000enqa{B!{k8\u0001=j~+N<kg5Fn~{?H!0c+\u0015/2b:U#";
                    i = 194;
                    strArr2 = strArr3;
                    break;
                case 194:
                    strArr2[i2] = str;
                    i2 = 196;
                    str = "{R;o~4S:v`<\u0001";
                    i = 195;
                    strArr2 = strArr3;
                    break;
                case 195:
                    strArr2[i2] = str;
                    i2 = 197;
                    str = "?T<~z2N J}";
                    i = 196;
                    strArr2 = strArr3;
                    break;
                case 196:
                    strArr2[i2] = str;
                    i2 = 198;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e\u0000jc9D<?a=\u0001:mo8J=%";
                    i = 197;
                    strArr2 = strArr3;
                    break;
                case 197:
                    strArr2[i2] = str;
                    i2 = 199;
                    str = "{R%v~+D*%";
                    i = 198;
                    strArr2 = strArr3;
                    break;
                case 198:
                    strArr2[i2] = str;
                    i2 = 200;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e*zm4E+m.=N<ro/\u001b";
                    i = 199;
                    strArr2 = strArr3;
                    break;
                case 199:
                    strArr2[i2] = str;
                    i2 = 201;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e+gz)@-ka)\u0001\fJH\u001dd\u001c@H\u0017`\t@K\u0015e\u0011PH\u0004r\u001aMK\u001al";
                    i = 200;
                    strArr2 = strArr3;
                    break;
                case 200:
                    strArr2[i2] = str;
                    i2 = 202;
                    str = ":T*va";
                    i = 201;
                    strArr2 = strArr3;
                    break;
                case 201:
                    strArr2[i2] = str;
                    i2 = 203;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e-sa(D";
                    i = 202;
                    strArr2 = strArr3;
                    break;
                case 202:
                    strArr2[i2] = str;
                    i2 = 204;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e-p`=H)j|2O)?k5B!{k)\u00019vz3\u0001!jz+T:?h4S#~z{";
                    i = 203;
                    strArr2 = strArr3;
                    break;
                case 203:
                    strArr2[i2] = str;
                    i2 = 205;
                    str = "u@/|";
                    i = 204;
                    strArr2 = strArr3;
                    break;
                case 204:
                    strArr2[i2] = str;
                    i2 = 206;
                    str = ":T*vatL>+ovM/kc";
                    i = 205;
                    strArr2 = strArr3;
                    break;
                case 205:
                    strArr2[i2] = str;
                    i2 = 207;
                    str = "6H#z4";
                    i = 206;
                    strArr2 = strArr3;
                    break;
                case 206:
                    strArr2[i2] = str;
                    i2 = 208;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e p.:T*va{U<~m0R";
                    i = 207;
                    strArr2 = strArr3;
                    break;
                case 207:
                    strArr2[i2] = str;
                    i2 = 209;
                    str = "\u0015Nn|a?D-?}.Q>p|/H x.:T*vatL>+ovM/kc";
                    i = 208;
                    strArr2 = strArr3;
                    break;
                case 208:
                    strArr2[i2] = str;
                    i2 = 210;
                    str = "6H#z";
                    i = 209;
                    strArr2 = strArr3;
                    break;
                case 209:
                    strArr2[i2] = str;
                    i2 = 211;
                    str = "8I/q`>Mc|a.O:";
                    i = 210;
                    strArr2 = strArr3;
                    break;
                case 210:
                    strArr2[i2] = str;
                    i2 = 212;
                    str = ":@-2~)N(vb>";
                    i = 211;
                    strArr2 = strArr3;
                    break;
                case 211:
                    strArr2[i2] = str;
                    i2 = 213;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e(p{5En";
                    i = 212;
                    strArr2 = strArr3;
                    break;
                case 212:
                    strArr2[i2] = str;
                    i2 = 214;
                    str = "9H:mo/D";
                    i = 213;
                    strArr2 = strArr3;
                    break;
                case 213:
                    strArr2[i2] = str;
                    i2 = 215;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e>ma8D=lk?\u0001(mo6D=%";
                    i = 214;
                    strArr2 = strArr3;
                    break;
                case 214:
                    strArr2[i2] = str;
                    i2 = 216;
                    str = "{G!mc:Ut";
                    i = 215;
                    strArr2 = strArr3;
                    break;
                case 215:
                    strArr2[i2] = str;
                    i2 = 217;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e+qm4E+m.4T:o{/\u0001(p|6@:?f:Rn|f:O)zj{U!?";
                    i = 216;
                    strArr2 = strArr3;
                    break;
                case 216:
                    strArr2[i2] = str;
                    i2 = 218;
                    str = "{@-k{:Mt";
                    i = 217;
                    strArr2 = strArr3;
                    break;
                case 217:
                    strArr2[i2] = str;
                    i2 = 219;
                    str = "(@#ob>\f<~z>";
                    i = 218;
                    strArr2 = strArr3;
                    break;
                case 218:
                    strArr2[i2] = str;
                    i2 = 220;
                    str = "(@#ob>\f<~z>";
                    i = 219;
                    strArr2 = strArr3;
                    break;
                case 219:
                    strArr2[i2] = str;
                    i2 = 221;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u0001(v`2R&zja\u0001";
                    i = 220;
                    strArr2 = strArr3;
                    break;
                case 220:
                    strArr2[i2] = str;
                    i2 = 222;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e-~`|Un||>@:z.?D-pj>Snya)\u0001";
                    i = 221;
                    strArr2 = strArr3;
                    break;
                case 221:
                    strArr2[i2] = str;
                    i2 = 223;
                    str = "8I/q`>Mc|a.O:";
                    i = 222;
                    strArr2 = strArr3;
                    break;
                case 222:
                    strArr2[i2] = str;
                    i2 = 224;
                    str = ":T*vatL>+ovM/kc";
                    i = 223;
                    strArr2 = strArr3;
                    break;
                case 223:
                    strArr2[i2] = str;
                    i2 = 225;
                    str = "6H#z";
                    i = 224;
                    strArr2 = strArr3;
                    break;
                case 224:
                    strArr2[i2] = str;
                    i2 = 226;
                    str = "6@62g5Q;k#(H4z";
                    i = 225;
                    strArr2 = strArr3;
                    break;
                case 225:
                    strArr2[i2] = str;
                    i2 = 227;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e*zm4E+m.4T:o{/\u0001,jh=D<l.3@8z.8I/qi>E`";
                    i = 226;
                    strArr2 = strArr3;
                    break;
                case 226:
                    strArr2[i2] = str;
                    i2 = 228;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e*zm4E+m.\u0014T:o{/c;yh>Sn][\u001dg\u000bMQ\u001dm\u000fXQ\u001eo\n@A\u001d~\u001dK\\\u001e`\u0003";
                    i = 227;
                    strArr2 = strArr3;
                    break;
                case 227:
                    strArr2[i2] = str;
                    i2 = 229;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e jc9D<?a=\u0001-pj>B=%.";
                    i = 228;
                    strArr2 = strArr3;
                    break;
                case 228:
                    strArr2[i2] = str;
                    i2 = 230;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e:mo8Jt";
                    i = 229;
                    strArr2 = strArr3;
                    break;
                case 229:
                    strArr2[i2] = str;
                    i2 = 231;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e*zm4E+m.\u0012O>jz\u0019T(V`?D6?2{\u0011";
                    i = 230;
                    strArr2 = strArr3;
                    break;
                case 230:
                    strArr2[i2] = str;
                    i2 = 232;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e*zm4E+m.4T:o{/\u0001(p|6@:?f:Rn|f:O)zj{U!?";
                    i = 231;
                    strArr2 = strArr3;
                    break;
                case 231:
                    strArr2[i2] = str;
                    i2 = 233;
                    str = ":T*vatL>+ovM/kc";
                    i = 232;
                    strArr2 = strArr3;
                    break;
                case 232:
                    strArr2[i2] = str;
                    i2 = 234;
                    str = "\u0018@ 8z{B<zo/Dn{k8N*z|{G!m.";
                    i = 233;
                    strArr2 = strArr3;
                    break;
                case 233:
                    strArr2[i2] = str;
                    i2 = 235;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e=zk0\u0001:p4";
                    i = 234;
                    strArr2 = strArr3;
                    break;
                case 234:
                    strArr2[i2] = str;
                    i2 = 236;
                    str = "-H*za/S/q}8N*z|tU<~`(B!{kt@;{g4\u000e+qm4E+m.4T:o{/\u0001,jh=D<l.3@8z.8I/qi>E";
                    i = 235;
                    strArr2 = strArr3;
                    break;
                case 235:
                    strArr2[i2] = str;
                    i2 = 237;
                    str = "{B/qm>M\"zja";
                    i = 236;
                    strArr2 = strArr3;
                    break;
                case 236:
                    strArr2[i2] = str;
                    i2 = 238;
                    str = "\u001cucV6n\u0014|";
                    i = 237;
                    strArr2 = strArr3;
                    break;
                case 237:
                    strArr2[i2] = str;
                    i2 = 239;
                    str = "\u001cucL8h\u0010~";
                    i = 238;
                    strArr2 = strArr3;
                    break;
                case 238:
                    strArr2[i2] = str;
                    i2 = 240;
                    str = "\u001cucO=j\u0010~";
                    i = 239;
                    strArr2 = strArr3;
                    break;
                case 239:
                    strArr2[i2] = str;
                    i2 = 241;
                    str = "-H*za/S/q}8N*z|tH=k|:O=|a?D=j~+N<kk?\u000e(p{5En";
                    i = 240;
                    strArr2 = strArr3;
                    break;
                case 240:
                    strArr2[i2] = str;
                    i2 = 242;
                    str = "-H*za/S/q}8N*z|tH=k|:O=|a?D=j~+N<kk?\u000e jc9D<?a=\u0001-pj>B=%.";
                    i = 241;
                    strArr2 = strArr3;
                    break;
                case 241:
                    strArr2[i2] = str;
                    i2 = 243;
                    str = "9P";
                    i = 242;
                    strArr2 = strArr3;
                    break;
                case 242:
                    strArr2[i2] = str;
                    i2 = 244;
                    str = "\u001cucO;j\u0010~";
                    i = 243;
                    strArr2 = strArr3;
                    break;
                case 243:
                    strArr2[i2] = str;
                    i2 = 245;
                    str = "\u001cucO=j\u0010}";
                    i = 244;
                    strArr2 = strArr3;
                    break;
                case 244:
                    strArr2[i2] = str;
                    i2 = 246;
                    str = ")N`rk?H/kk0\u000f>so/G!mc";
                    i = 245;
                    strArr2 = strArr3;
                    break;
                case 245:
                    strArr2[i2] = str;
                    i2 = 247;
                    str = "\u001cucV7j\u0011~X";
                    i = 246;
                    strArr2 = strArr3;
                    break;
                case 246:
                    strArr2[i2] = str;
                    i2 = 248;
                    str = "-H*zat@8|";
                    i = 247;
                    strArr2 = strArr3;
                    break;
                case 247:
                    strArr2[i2] = str;
                    i2 = 249;
                    str = "9P\u0011^\u007f.@<v}n";
                    i = 248;
                    strArr2 = strArr3;
                    break;
                case 248:
                    strArr2[i2] = str;
                    i2 = 250;
                    str = "-H*za/S/q}8N*z|tH=k|:O=|a?D=j~+N<kk?\u000e p.>O-pj>Snya.O*";
                    i = 249;
                    strArr2 = strArr3;
                    break;
                case 249:
                    strArr2[i2] = str;
                    i2 = 251;
                    str = "\u001cucO=j\u0011~";
                    i = 250;
                    strArr2 = strArr3;
                    break;
                case 250:
                    strArr2[i2] = str;
                    i2 = 252;
                    str = "(@#l{5F";
                    i = 251;
                    strArr2 = strArr3;
                    break;
                case 251:
                    strArr2[i2] = str;
                    i2 = 253;
                    str = "(@#l{5F";
                    i = 252;
                    strArr2 = strArr3;
                    break;
                case 252:
                    strArr2[i2] = str;
                    i2 = 254;
                    str = ")N`}a:S*1~7@:ya)L";
                    i = 253;
                    strArr2 = strArr3;
                    break;
                case 253:
                    strArr2[i2] = str;
                    i2 = 255;
                    str = "-H*za/S/q}8N*z|tH=k|:O=|a?D=j~+N<kk?\u000e;q}.Q>p|/D*?c4E+s.";
                    i = 254;
                    strArr2 = strArr3;
                    break;
                case 254:
                    strArr2[i2] = str;
                    i2 = 256;
                    str = "\u0014l\u00161C\u000fj`IG\u001fd\u00011K\u0015b\u0001[K\t\u000f\u000fIM";
                    i = 255;
                    strArr2 = strArr3;
                    break;
                case 255:
                    strArr2[i2] = str;
                    i2 = 257;
                    str = "\u001cucO;j\u0011~";
                    i = 256;
                    strArr2 = strArr3;
                    break;
                case 256:
                    strArr2[i2] = str;
                    i2 = 258;
                    str = "\u001cucV6n\u0014~";
                    i = 257;
                    strArr2 = strArr3;
                    break;
                case 257:
                    strArr2[i2] = str;
                    i2 = 259;
                    str = "-H*za/S/q}8N*z|tH=k|:O=|a?D=j~+N<kk?\u000e,po)Ea";
                    i = 258;
                    strArr2 = strArr3;
                    break;
                case 258:
                    strArr2[i2] = str;
                    i2 = 260;
                    str = "\u001cucL8h\u0010|";
                    i = 259;
                    strArr2 = strArr3;
                    break;
                case 259:
                    strArr2[i2] = str;
                    i2 = 261;
                    str = "\u001cucL8h\u0010}";
                    i = 260;
                    strArr2 = strArr3;
                    break;
                case 260:
                    strArr2[i2] = str;
                    i2 = 262;
                    str = "\u001cucV6i\u0017~";
                    i = 261;
                    strArr2 = strArr3;
                    break;
                case 261:
                    strArr2[i2] = str;
                    i2 = 263;
                    str = "\u001cucO;j\u0010}";
                    i = 262;
                    strArr2 = strArr3;
                    break;
                case 262:
                    strArr2[i2] = str;
                    i2 = 264;
                    str = "\blcX=c\u0017\b";
                    i = 263;
                    strArr2 = strArr3;
                    break;
                case 263:
                    strArr2[i2] = str;
                    i2 = 265;
                    str = "\u001cucV6i\u0017|";
                    i = 264;
                    strArr2 = strArr3;
                    break;
                case 264:
                    strArr2[i2] = str;
                    z = strArr3;
                    j = new byte[]{(byte) 102, (byte) 116, (byte) 121, (byte) 112};
                    l = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000};
                default:
                    strArr2[i2] = str;
                    i2 = 1;
                    strArr2 = strArr3;
                    str = "8S!o#9N:ka6";
                    i = 0;
                    break;
            }
        }
    }

    private static int a(int i) {
        int i2 = App.az;
        int i3 = 0;
        while (i3 < l.length) {
            try {
                if (i != l[i3]) {
                    i3++;
                    if (i2 != 0) {
                        break;
                    }
                }
                return i3;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        Log.e(z[184] + i + z[183]);
        return 0;
    }

    public id(File file, File file2, long j, long j2) {
        this.m = 640;
        this.i = 3.0f;
        this.p = file;
        this.e = file2;
        this.o = j;
        this.a = j2;
        if (j >= 0 && j2 > 0 && j == j2) {
            try {
                throw new IllegalArgumentException(z[193] + j + z[194] + j2);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public static boolean i() {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r3 = 16;
        r1 = 1;
        r2 = 0;
        r6 = com.whatsapp.App.az;
        r0 = c;	 Catch:{ IllegalArgumentException -> 0x0245 }
        if (r0 != 0) goto L_0x023e;	 Catch:{ IllegalArgumentException -> 0x0245 }
    L_0x000a:
        r0 = java.lang.Boolean.FALSE;	 Catch:{ IllegalArgumentException -> 0x0245 }
        c = r0;	 Catch:{ IllegalArgumentException -> 0x0245 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0245 }
        if (r0 < r3) goto L_0x023e;
    L_0x0012:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0247 }
        if (r0 != r3) goto L_0x0289;
    L_0x0016:
        r0 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalArgumentException -> 0x0249 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0249 }
        r4 = 252; // 0xfc float:3.53E-43 double:1.245E-321;	 Catch:{ IllegalArgumentException -> 0x0249 }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0249 }
        r0 = r0.equals(r3);	 Catch:{ IllegalArgumentException -> 0x0249 }
        if (r0 == 0) goto L_0x0289;
    L_0x0024:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x024b }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x024b }
        r4 = 251; // 0xfb float:3.52E-43 double:1.24E-321;	 Catch:{ IllegalArgumentException -> 0x024b }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x024b }
        r0 = r0.equals(r3);	 Catch:{ IllegalArgumentException -> 0x024b }
        if (r0 != 0) goto L_0x00e8;
    L_0x0032:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x024d }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x024d }
        r4 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;	 Catch:{ IllegalArgumentException -> 0x024d }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x024d }
        r0 = r0.equals(r3);	 Catch:{ IllegalArgumentException -> 0x024d }
        if (r0 != 0) goto L_0x00e8;
    L_0x0040:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x024f }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x024f }
        r4 = 245; // 0xf5 float:3.43E-43 double:1.21E-321;	 Catch:{ IllegalArgumentException -> 0x024f }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x024f }
        r0 = r0.equals(r3);	 Catch:{ IllegalArgumentException -> 0x024f }
        if (r0 != 0) goto L_0x00e8;
    L_0x004e:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x0251 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0251 }
        r4 = 257; // 0x101 float:3.6E-43 double:1.27E-321;	 Catch:{ IllegalArgumentException -> 0x0251 }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0251 }
        r0 = r0.equals(r3);	 Catch:{ IllegalArgumentException -> 0x0251 }
        if (r0 != 0) goto L_0x00e8;
    L_0x005c:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x0253 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0253 }
        r4 = 244; // 0xf4 float:3.42E-43 double:1.206E-321;	 Catch:{ IllegalArgumentException -> 0x0253 }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0253 }
        r0 = r0.equals(r3);	 Catch:{ IllegalArgumentException -> 0x0253 }
        if (r0 != 0) goto L_0x00e8;
    L_0x006a:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x0255 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0255 }
        r4 = 263; // 0x107 float:3.69E-43 double:1.3E-321;	 Catch:{ IllegalArgumentException -> 0x0255 }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0255 }
        r0 = r0.equals(r3);	 Catch:{ IllegalArgumentException -> 0x0255 }
        if (r0 != 0) goto L_0x00e8;
    L_0x0078:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x0257 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0257 }
        r4 = 247; // 0xf7 float:3.46E-43 double:1.22E-321;	 Catch:{ IllegalArgumentException -> 0x0257 }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0257 }
        r0 = r0.equals(r3);	 Catch:{ IllegalArgumentException -> 0x0257 }
        if (r0 != 0) goto L_0x00e8;
    L_0x0086:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x0259 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0259 }
        r4 = 258; // 0x102 float:3.62E-43 double:1.275E-321;	 Catch:{ IllegalArgumentException -> 0x0259 }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0259 }
        r0 = r0.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x0259 }
        if (r0 != 0) goto L_0x00e8;
    L_0x0094:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x025b }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x025b }
        r4 = 238; // 0xee float:3.34E-43 double:1.176E-321;	 Catch:{ IllegalArgumentException -> 0x025b }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x025b }
        r0 = r0.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x025b }
        if (r0 != 0) goto L_0x00e8;
    L_0x00a2:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x025d }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x025d }
        r4 = 265; // 0x109 float:3.71E-43 double:1.31E-321;	 Catch:{ IllegalArgumentException -> 0x025d }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x025d }
        r0 = r0.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x025d }
        if (r0 != 0) goto L_0x00e8;
    L_0x00b0:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x025f }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x025f }
        r4 = 262; // 0x106 float:3.67E-43 double:1.294E-321;	 Catch:{ IllegalArgumentException -> 0x025f }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x025f }
        r0 = r0.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x025f }
        if (r0 != 0) goto L_0x00e8;
    L_0x00be:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x0261 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0261 }
        r4 = 239; // 0xef float:3.35E-43 double:1.18E-321;	 Catch:{ IllegalArgumentException -> 0x0261 }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0261 }
        r0 = r0.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x0261 }
        if (r0 != 0) goto L_0x00e8;
    L_0x00cc:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x0263 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0263 }
        r4 = 260; // 0x104 float:3.64E-43 double:1.285E-321;	 Catch:{ IllegalArgumentException -> 0x0263 }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0263 }
        r0 = r0.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x0263 }
        if (r0 != 0) goto L_0x00e8;	 Catch:{ IllegalArgumentException -> 0x0263 }
    L_0x00da:
        r0 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x0263 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x0263 }
        r4 = 261; // 0x105 float:3.66E-43 double:1.29E-321;	 Catch:{ IllegalArgumentException -> 0x0263 }
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x0263 }
        r0 = r0.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x0263 }
        if (r0 == 0) goto L_0x0289;
    L_0x00e8:
        r0 = r1;
    L_0x00e9:
        r3 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalArgumentException -> 0x0265 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0265 }
        r5 = 243; // 0xf3 float:3.4E-43 double:1.2E-321;	 Catch:{ IllegalArgumentException -> 0x0265 }
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0265 }
        r3 = r3.equals(r4);	 Catch:{ IllegalArgumentException -> 0x0265 }
        if (r3 == 0) goto L_0x0106;	 Catch:{ IllegalArgumentException -> 0x0265 }
    L_0x00f7:
        r3 = android.os.Build.DEVICE;	 Catch:{ IllegalArgumentException -> 0x0265 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0265 }
        r5 = 249; // 0xf9 float:3.49E-43 double:1.23E-321;	 Catch:{ IllegalArgumentException -> 0x0265 }
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0265 }
        r3 = r3.startsWith(r4);	 Catch:{ IllegalArgumentException -> 0x0265 }
        if (r3 == 0) goto L_0x0106;
    L_0x0105:
        r0 = r1;
    L_0x0106:
        r3 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalArgumentException -> 0x0267 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0267 }
        r5 = 253; // 0xfd float:3.55E-43 double:1.25E-321;	 Catch:{ IllegalArgumentException -> 0x0267 }
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0267 }
        r3 = r3.equals(r4);	 Catch:{ IllegalArgumentException -> 0x0267 }
        if (r3 == 0) goto L_0x0123;	 Catch:{ IllegalArgumentException -> 0x0267 }
    L_0x0114:
        r3 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x0267 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0267 }
        r5 = 264; // 0x108 float:3.7E-43 double:1.304E-321;	 Catch:{ IllegalArgumentException -> 0x0267 }
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0267 }
        r3 = r3.equals(r4);	 Catch:{ IllegalArgumentException -> 0x0267 }
        if (r3 == 0) goto L_0x0123;
    L_0x0122:
        r0 = r1;
    L_0x0123:
        r3 = 0;
        if (r0 == 0) goto L_0x0150;
    L_0x0126:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0269 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0269 }
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0269 }
        r5 = 255; // 0xff float:3.57E-43 double:1.26E-321;	 Catch:{ IllegalArgumentException -> 0x0269 }
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0269 }
        r0 = r0.append(r4);	 Catch:{ IllegalArgumentException -> 0x0269 }
        r4 = android.os.Build.MANUFACTURER;	 Catch:{ IllegalArgumentException -> 0x0269 }
        r0 = r0.append(r4);	 Catch:{ IllegalArgumentException -> 0x0269 }
        r4 = "-";	 Catch:{ IllegalArgumentException -> 0x0269 }
        r0 = r0.append(r4);	 Catch:{ IllegalArgumentException -> 0x0269 }
        r4 = android.os.Build.MODEL;	 Catch:{ IllegalArgumentException -> 0x0269 }
        r0 = r0.append(r4);	 Catch:{ IllegalArgumentException -> 0x0269 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x0269 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IllegalArgumentException -> 0x0269 }
        if (r6 == 0) goto L_0x0286;
    L_0x0150:
        r7 = android.media.MediaCodecList.getCodecCount();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r5 = 242; // 0xf2 float:3.39E-43 double:1.196E-321;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r0 = r0.append(r7);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r5 = r2;
        r0 = r2;
        r4 = r3;
    L_0x0171:
        if (r5 >= r7) goto L_0x027e;
    L_0x0173:
        if (r0 != 0) goto L_0x027e;
    L_0x0175:
        r8 = android.media.MediaCodecList.getCodecInfoAt(r5);
        r3 = r8.isEncoder();	 Catch:{ IllegalArgumentException -> 0x026b }
        if (r3 != 0) goto L_0x0181;
    L_0x017f:
        if (r6 == 0) goto L_0x027b;
    L_0x0181:
        r3 = r8.getName();	 Catch:{ IllegalArgumentException -> 0x026f }
        r3 = b(r3);	 Catch:{ IllegalArgumentException -> 0x026f }
        if (r3 != 0) goto L_0x018d;
    L_0x018b:
        if (r6 == 0) goto L_0x027b;
    L_0x018d:
        r9 = r8.getSupportedTypes();
        r3 = r0;
        r0 = r2;
    L_0x0193:
        r10 = r9.length;
        if (r0 >= r10) goto L_0x01ab;
    L_0x0196:
        if (r3 != 0) goto L_0x01ab;
    L_0x0198:
        r10 = r9[r0];	 Catch:{ IllegalArgumentException -> 0x0271 }
        r11 = z;	 Catch:{ IllegalArgumentException -> 0x0271 }
        r12 = 248; // 0xf8 float:3.48E-43 double:1.225E-321;	 Catch:{ IllegalArgumentException -> 0x0271 }
        r11 = r11[r12];	 Catch:{ IllegalArgumentException -> 0x0271 }
        r10 = r10.equals(r11);	 Catch:{ IllegalArgumentException -> 0x0271 }
        if (r10 == 0) goto L_0x01a7;
    L_0x01a6:
        r3 = r1;
    L_0x01a7:
        r0 = r0 + 1;
        if (r6 == 0) goto L_0x0193;
    L_0x01ab:
        if (r3 == 0) goto L_0x01cf;
    L_0x01ad:
        r4 = r8.getName();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r9 = z;
        r10 = 241; // 0xf1 float:3.38E-43 double:1.19E-321;
        r9 = r9[r10];
        r0 = r0.append(r9);
        r8 = r8.getName();
        r0 = r0.append(r8);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
    L_0x01cf:
        r0 = r3;
        r3 = r4;
    L_0x01d1:
        r4 = r5 + 1;
        if (r6 == 0) goto L_0x0282;
    L_0x01d5:
        r1 = r0;
        r0 = r3;
    L_0x01d7:
        if (r1 == 0) goto L_0x01df;
    L_0x01d9:
        r1 = java.lang.Boolean.TRUE;	 Catch:{ IllegalArgumentException -> 0x0273 }
        c = r1;	 Catch:{ IllegalArgumentException -> 0x0273 }
        if (r6 == 0) goto L_0x01ec;	 Catch:{ IllegalArgumentException -> 0x0273 }
    L_0x01df:
        r1 = java.lang.Boolean.FALSE;	 Catch:{ IllegalArgumentException -> 0x0273 }
        c = r1;	 Catch:{ IllegalArgumentException -> 0x0273 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0273 }
        r2 = 250; // 0xfa float:3.5E-43 double:1.235E-321;	 Catch:{ IllegalArgumentException -> 0x0273 }
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0273 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalArgumentException -> 0x0273 }
    L_0x01ec:
        r1 = java.lang.Boolean.TRUE;	 Catch:{ IllegalArgumentException -> 0x0275 }
        r2 = c;	 Catch:{ IllegalArgumentException -> 0x0275 }
        r1 = r1.equals(r2);	 Catch:{ IllegalArgumentException -> 0x0275 }
        if (r1 == 0) goto L_0x023e;
    L_0x01f6:
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0277 }
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;	 Catch:{ IllegalArgumentException -> 0x0277 }
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0277 }
        r0 = r1.equals(r0);	 Catch:{ IllegalArgumentException -> 0x0277 }
        if (r0 == 0) goto L_0x023e;
    L_0x0202:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0279 }
        r1 = 254; // 0xfe float:3.56E-43 double:1.255E-321;	 Catch:{ IllegalArgumentException -> 0x0279 }
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0279 }
        r0 = a(r0);	 Catch:{ IllegalArgumentException -> 0x0279 }
        f = r0;	 Catch:{ IllegalArgumentException -> 0x0279 }
        r0 = f;	 Catch:{ IllegalArgumentException -> 0x0279 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x0279 }
        if (r0 == 0) goto L_0x0222;	 Catch:{ IllegalArgumentException -> 0x0279 }
    L_0x0216:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0279 }
        r1 = 246; // 0xf6 float:3.45E-43 double:1.215E-321;	 Catch:{ IllegalArgumentException -> 0x0279 }
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0279 }
        r0 = a(r0);	 Catch:{ IllegalArgumentException -> 0x0279 }
        f = r0;	 Catch:{ IllegalArgumentException -> 0x0279 }
    L_0x0222:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 259; // 0x103 float:3.63E-43 double:1.28E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = f;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
    L_0x023e:
        r0 = c;
        r0 = r0.booleanValue();
        return r0;
    L_0x0245:
        r0 = move-exception;
        throw r0;
    L_0x0247:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0249 }
    L_0x0249:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x024b }
    L_0x024b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x024d }
    L_0x024d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x024f }
    L_0x024f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0251 }
    L_0x0251:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0253 }
    L_0x0253:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0255 }
    L_0x0255:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0257 }
    L_0x0257:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0259 }
    L_0x0259:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x025b }
    L_0x025b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x025d }
    L_0x025d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x025f }
    L_0x025f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0261 }
    L_0x0261:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0263 }
    L_0x0263:
        r0 = move-exception;
        throw r0;
    L_0x0265:
        r0 = move-exception;
        throw r0;
    L_0x0267:
        r0 = move-exception;
        throw r0;
    L_0x0269:
        r0 = move-exception;
        throw r0;
    L_0x026b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x026d }
    L_0x026d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x026f }
    L_0x026f:
        r0 = move-exception;
        throw r0;
    L_0x0271:
        r0 = move-exception;
        throw r0;
    L_0x0273:
        r0 = move-exception;
        throw r0;
    L_0x0275:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0277 }
    L_0x0277:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0279 }
    L_0x0279:
        r0 = move-exception;
        throw r0;
    L_0x027b:
        r3 = r4;
        goto L_0x01d1;
    L_0x027e:
        r1 = r0;
        r0 = r4;
        goto L_0x01d7;
    L_0x0282:
        r5 = r4;
        r4 = r3;
        goto L_0x0171;
    L_0x0286:
        r0 = r3;
        goto L_0x01ec;
    L_0x0289:
        r0 = r2;
        goto L_0x00e9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.id.i():boolean");
    }

    public static boolean a(File file) {
        try {
            if (VERSION.SDK_INT < 9) {
                return false;
            }
            try {
                return !b(file) ? c(file) : true;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
