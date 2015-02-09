package com.whatsapp;

import android.annotation.TargetApi;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

@TargetApi(16)
class ans extends ant {
    private static final int[] e;
    private static final String[] z;
    private CountDownLatch d;
    private Thread f;
    private boolean g;
    private Exception h;
    private int i;

    static void a(ans com_whatsapp_ans) {
        com_whatsapp_ans.b();
    }

    static {
        String[] strArr = new String[18];
        String str = "\"z;Wg&p1[p0p Uw0|=Fg7z P";
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
                        i4 = 84;
                        break;
                    case ay.f /*1*/:
                        i4 = 21;
                        break;
                    case ay.n /*2*/:
                        i4 = 82;
                        break;
                    case ay.p /*3*/:
                        i4 = 52;
                        break;
                    default:
                        i4 = 2;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "5t1\u0019r&z4]n1";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\"z;Wg&p1[p0p Uw0|=Fg7z P-t";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "9t*\u0019k:e'@/'|(Q";
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "6|&Fc p";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\"z;Wg&p1[p0p Uw0|=Fg7z P-tp<Wm0p \u0014m!a\"Avtw'Rd1g!\u0014j5c7\u0014a<t<Sg0;";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\"z;Wg&p1[p0p Uw0|=Fg7z P-t";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "'t?Dn18 Uv1";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\"z;Wg&p1[p0p Uw0|=Fg7z P-tp<Wm0p \u0014m!a\"Avts=Fo5ar\\c'51\\c:r7P\" zr";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\"z;Wg&p1[p0p Uw0|=Fg7z P-t";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "5`6]m{x\"\u0000cyy3@o";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    str = "\"z;Wg&p1[p0p Uw0|=Fg7z P-t";
                    i = 11;
                    i2 = 12;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    strArr2 = strArr3;
                    str = "5`6]m{x\"\u0000cyy3@o";
                    i = 12;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "9|?Q";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "'a3Fvtg7Wm&q;Zets3]n1q";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "\"z;Wg&p1[p0p Uw0|=Fg7z P";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "zt3W";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    e = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000};
                default:
                    strArr2[i2] = str;
                    str = "7}3Zl1y\u007fWm!{&";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public void d() {
    }

    private static int b(int i) {
        boolean z = ant.a;
        int i2 = 0;
        while (i2 < e.length) {
            try {
                if (i != e[i2]) {
                    i2++;
                    if (z) {
                        break;
                    }
                }
                return i2;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return 0;
    }

    public void f() {
        try {
            this.g = false;
            if (this.f != null) {
                try {
                    this.f.join();
                    this.f = null;
                } catch (Throwable e) {
                    Log.b(z[0], e);
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public ans(String str) {
        boolean z = true;
        boolean z2 = ant.a;
        this.i = 1;
        this.c = new File(str + z[17]);
        this.b = 32000;
        if (z2) {
            try {
                if (DialogToastActivity.i) {
                    z = false;
                }
                DialogToastActivity.i = z;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    public void a() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r22_this = this;
        r16 = com.whatsapp.ant.a;
        r2 = 22050; // 0x5622 float:3.0899E-41 double:1.0894E-319;
        r3 = 16;
        r4 = 2;
        r2 = android.media.AudioRecord.getMinBufferSize(r2, r3, r4);
        r7 = 1;
    L_0x000c:
        if (r7 >= r2) goto L_0x0012;
    L_0x000e:
        r7 = r7 * 2;
        if (r16 == 0) goto L_0x000c;
    L_0x0012:
        r2 = z;
        r3 = 11;
        r2 = r2[r3];
        r8 = android.media.MediaCodec.createEncoderByType(r2);
        r2 = new android.media.MediaFormat;
        r2.<init>();
        r3 = z;
        r4 = 14;
        r3 = r3[r4];
        r4 = z;
        r5 = 13;
        r4 = r4[r5];
        r2.setString(r3, r4);
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        r4 = 1;
        r2.setInteger(r3, r4);
        r3 = z;
        r4 = 8;
        r3 = r3[r4];
        r4 = 22050; // 0x5622 float:3.0899E-41 double:1.0894E-319;
        r2.setInteger(r3, r4);
        r3 = z;
        r4 = 5;
        r3 = r3[r4];
        r4 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r2.setInteger(r3, r4);
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r4 = 2;
        r2.setInteger(r3, r4);
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r2.setInteger(r3, r7);
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r8.configure(r2, r3, r4, r5);	 Catch:{ IllegalStateException -> 0x01cb }
        r8.start();
        r17 = r8.getInputBuffers();
        r9 = r8.getOutputBuffers();
        r18 = new android.media.MediaCodec$BufferInfo;
        r18.<init>();
        r2 = 7;
        r0 = new byte[r2];
        r19 = r0;
        r2 = 0;
        r3 = -1;
        r19[r2] = r3;
        r2 = 1;
        r3 = -15;
        r19[r2] = r3;
        r2 = 22050; // 0x5622 float:3.0899E-41 double:1.0894E-319;
        r2 = b(r2);
        r2 = (byte) r2;
        r3 = 2;
        r4 = 64;
        r4 = (byte) r4;
        r19[r3] = r4;
        r3 = 2;
        r4 = r19[r3];
        r2 = r2 << 2;
        r2 = r2 | r4;
        r2 = (byte) r2;
        r19[r3] = r2;
        r2 = 2;
        r3 = r19[r2];
        r3 = r3 | 0;
        r3 = (byte) r3;
        r19[r2] = r3;
        r2 = 3;
        r3 = 0;
        r19[r2] = r3;
        r2 = 4;
        r3 = 0;
        r19[r2] = r3;
        r2 = 5;
        r3 = 0;
        r19[r2] = r3;
        r2 = 6;
        r3 = -4;
        r19[r2] = r3;
        r0 = new byte[r7];
        r20 = r0;
        r2 = new android.media.AudioRecord;
        r0 = r22;
        r3 = r0.i;
        r4 = 22050; // 0x5622 float:3.0899E-41 double:1.0894E-319;
        r5 = 16;
        r6 = 2;
        r2.<init>(r3, r4, r5, r6, r7);
        r2.startRecording();	 Catch:{ IllegalStateException -> 0x01de }
        r0 = r22;
        r3 = r0.d;
        r3.countDown();
        r6 = 0;
        r4 = 0;
        r5 = new java.io.FileOutputStream;	 Catch:{ all -> 0x024b }
        r3 = r22.b();	 Catch:{ all -> 0x024b }
        r5.<init>(r3);	 Catch:{ all -> 0x024b }
        r4 = r5.getChannel();	 Catch:{ all -> 0x01fa }
        r6 = r9;
    L_0x00dd:
        r0 = r22;
        r3 = r0.g;	 Catch:{ all -> 0x01fa }
        if (r3 != 0) goto L_0x01f4;
    L_0x00e3:
        r3 = 1;
        r15 = r3;
    L_0x00e5:
        r3 = 0;
        r0 = r20;
        r11 = r2.read(r0, r3, r7);	 Catch:{ all -> 0x01fa }
        r12 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r9 = r8.dequeueInputBuffer(r12);	 Catch:{ all -> 0x01fa }
        if (r9 < 0) goto L_0x0108;
    L_0x00f5:
        r3 = r17[r9];	 Catch:{ all -> 0x01fa }
        r3.clear();	 Catch:{ IllegalStateException -> 0x01f8 }
        r0 = r20;
        r3.put(r0);	 Catch:{ IllegalStateException -> 0x01f8 }
        r10 = 0;
        r12 = 0;
        if (r15 == 0) goto L_0x0212;
    L_0x0104:
        r14 = 4;
    L_0x0105:
        r8.queueInputBuffer(r9, r10, r11, r12, r14);	 Catch:{ all -> 0x01fa }
    L_0x0108:
        r10 = 0;
        r0 = r18;
        r3 = r8.dequeueOutputBuffer(r0, r10);	 Catch:{ all -> 0x01fa }
        r21 = r3;
        r3 = r6;
        r6 = r21;
    L_0x0115:
        r9 = -1;
        if (r6 == r9) goto L_0x01ae;
    L_0x0118:
        if (r6 < 0) goto L_0x0172;
    L_0x011a:
        r9 = r3[r6];	 Catch:{ all -> 0x01fa }
        r0 = r18;
        r10 = r0.offset;	 Catch:{ all -> 0x01fa }
        r9.position(r10);	 Catch:{ all -> 0x01fa }
        r0 = r18;
        r10 = r0.offset;	 Catch:{ all -> 0x01fa }
        r0 = r18;
        r11 = r0.size;	 Catch:{ all -> 0x01fa }
        r10 = r10 + r11;
        r9.limit(r10);	 Catch:{ all -> 0x01fa }
        r0 = r18;
        r10 = r0.flags;	 Catch:{ all -> 0x01fa }
        r10 = r10 & 2;
        r11 = 2;
        if (r10 == r11) goto L_0x0169;
    L_0x0138:
        r0 = r18;
        r10 = r0.size;	 Catch:{ all -> 0x01fa }
        r0 = r18;
        r11 = r0.offset;	 Catch:{ all -> 0x01fa }
        r10 = r10 - r11;
        r10 = r10 + 7;
        r11 = r10 & 7;
        r12 = r10 >> 3;
        r12 = r12 & 255;
        r10 = r10 >> 11;
        r10 = r10 & 3;
        r13 = 3;
        r10 = r10 | 64;
        r10 = (byte) r10;	 Catch:{ all -> 0x01fa }
        r19[r13] = r10;	 Catch:{ all -> 0x01fa }
        r10 = 4;
        r12 = (byte) r12;	 Catch:{ all -> 0x01fa }
        r19[r10] = r12;	 Catch:{ all -> 0x01fa }
        r10 = 5;
        r11 = r11 << 5;
        r11 = r11 | 31;
        r11 = (byte) r11;	 Catch:{ all -> 0x01fa }
        r19[r10] = r11;	 Catch:{ all -> 0x01fa }
        r10 = java.nio.ByteBuffer.wrap(r19);	 Catch:{ all -> 0x01fa }
        r4.write(r10);	 Catch:{ all -> 0x01fa }
        r4.write(r9);	 Catch:{ all -> 0x01fa }
    L_0x0169:
        r9.clear();	 Catch:{ IllegalStateException -> 0x0215 }
        r9 = 0;
        r8.releaseOutputBuffer(r6, r9);	 Catch:{ IllegalStateException -> 0x0215 }
        if (r16 == 0) goto L_0x01a4;
    L_0x0172:
        r9 = -3;
        if (r6 != r9) goto L_0x0183;
    L_0x0175:
        r3 = r8.getOutputBuffers();	 Catch:{ all -> 0x01fa }
        r9 = z;	 Catch:{ IllegalStateException -> 0x0217 }
        r10 = 6;
        r9 = r9[r10];	 Catch:{ IllegalStateException -> 0x0217 }
        com.whatsapp.util.Log.i(r9);	 Catch:{ IllegalStateException -> 0x0217 }
        if (r16 == 0) goto L_0x01a4;
    L_0x0183:
        r9 = -2;
        if (r6 != r9) goto L_0x01a4;
    L_0x0186:
        r6 = r8.getOutputFormat();	 Catch:{ all -> 0x01fa }
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01fa }
        r9.<init>();	 Catch:{ all -> 0x01fa }
        r10 = z;	 Catch:{ all -> 0x01fa }
        r11 = 9;
        r10 = r10[r11];	 Catch:{ all -> 0x01fa }
        r9 = r9.append(r10);	 Catch:{ all -> 0x01fa }
        r6 = r9.append(r6);	 Catch:{ all -> 0x01fa }
        r6 = r6.toString();	 Catch:{ all -> 0x01fa }
        com.whatsapp.util.Log.i(r6);	 Catch:{ all -> 0x01fa }
    L_0x01a4:
        r10 = 0;
        r0 = r18;
        r6 = r8.dequeueOutputBuffer(r0, r10);	 Catch:{ all -> 0x01fa }
        if (r16 == 0) goto L_0x0115;
    L_0x01ae:
        if (r15 == 0) goto L_0x01b2;
    L_0x01b0:
        if (r16 == 0) goto L_0x01b4;
    L_0x01b2:
        if (r16 == 0) goto L_0x024e;
    L_0x01b4:
        r8.stop();	 Catch:{ IllegalStateException -> 0x0219 }
        r8.release();	 Catch:{ IllegalStateException -> 0x0219 }
        if (r5 == 0) goto L_0x01bf;
    L_0x01bc:
        r4.close();	 Catch:{ IOException -> 0x021b }
    L_0x01bf:
        if (r5 == 0) goto L_0x01c4;
    L_0x01c1:
        r5.close();	 Catch:{ IOException -> 0x0227, IllegalStateException -> 0x0225 }
    L_0x01c4:
        r2.stop();
        r2.release();
        return;
    L_0x01cb:
        r2 = move-exception;
        com.whatsapp.util.Log.c(r2);
        r0 = r22;
        r0.h = r2;
        r8.release();
        r0 = r22;
        r3 = r0.d;
        r3.countDown();
        throw r2;
    L_0x01de:
        r2 = move-exception;
        com.whatsapp.util.Log.c(r2);
        r0 = r22;
        r0.h = r2;
        r8.stop();
        r8.release();
        r0 = r22;
        r3 = r0.d;
        r3.countDown();
        throw r2;
    L_0x01f4:
        r3 = 0;
        r15 = r3;
        goto L_0x00e5;
    L_0x01f8:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x01fa }
    L_0x01fa:
        r3 = move-exception;
    L_0x01fb:
        r8.stop();	 Catch:{ IllegalStateException -> 0x0231 }
        r8.release();	 Catch:{ IllegalStateException -> 0x0231 }
        if (r5 == 0) goto L_0x0206;
    L_0x0203:
        r4.close();	 Catch:{ IOException -> 0x0233 }
    L_0x0206:
        if (r5 == 0) goto L_0x020b;
    L_0x0208:
        r5.close();	 Catch:{ IOException -> 0x0240, IllegalStateException -> 0x023e }
    L_0x020b:
        r2.stop();
        r2.release();
        throw r3;
    L_0x0212:
        r14 = 0;
        goto L_0x0105;
    L_0x0215:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x01fa }
    L_0x0217:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x01fa }
    L_0x0219:
        r2 = move-exception;
        throw r2;
    L_0x021b:
        r3 = move-exception;
        r4 = z;
        r6 = 3;
        r4 = r4[r6];
        com.whatsapp.util.Log.b(r4, r3);
        goto L_0x01bf;
    L_0x0225:
        r2 = move-exception;
        throw r2;
    L_0x0227:
        r3 = move-exception;
        r4 = z;
        r5 = 7;
        r4 = r4[r5];
        com.whatsapp.util.Log.b(r4, r3);
        goto L_0x01c4;
    L_0x0231:
        r2 = move-exception;
        throw r2;
    L_0x0233:
        r4 = move-exception;
        r6 = z;
        r7 = 10;
        r6 = r6[r7];
        com.whatsapp.util.Log.b(r6, r4);
        goto L_0x0206;
    L_0x023e:
        r2 = move-exception;
        throw r2;
    L_0x0240:
        r4 = move-exception;
        r5 = z;
        r6 = 12;
        r5 = r5[r6];
        com.whatsapp.util.Log.b(r5, r4);
        goto L_0x020b;
    L_0x024b:
        r3 = move-exception;
        r5 = r6;
        goto L_0x01fb;
    L_0x024e:
        r6 = r3;
        goto L_0x00dd;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ans.b():void");
    }

    static boolean a(ans com_whatsapp_ans, boolean z) {
        com_whatsapp_ans.g = z;
        return z;
    }

    public void e() {
        try {
            if (this.f != null) {
                throw new IllegalStateException();
            }
            this.g = true;
            this.f = new Thread(new aff(this));
            this.d = new CountDownLatch(1);
            this.f.start();
            try {
                this.d.await();
                if (this.h != null) {
                    throw new RuntimeException(z[15], this.h);
                }
            } catch (Throwable e) {
                Log.b(z[16], e);
            }
        } catch (InterruptedException e2) {
            throw e2;
        }
    }

    public void a(int i) {
        this.i = i;
    }
}
