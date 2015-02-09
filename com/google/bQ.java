package com.google;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;

final class bq {
    private static final char[] a;
    private static final String[] z;

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
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
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = ".\u0013k4";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000a:
        r2 = r2.toCharArray();
        r6 = r2.length;
        r7 = r6;
        r8 = r1;
        r6 = r2;
    L_0x0012:
        if (r7 > r8) goto L_0x0038;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = ":\u001b\u0010T\"O";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        r0 = 45;
        r0 = new char[r0];
        r0 = new short[]{(short) 48, (short) 49, (short) 50, (short) 51, (short) 52, (short) 53, (short) 54, (short) 55, (short) 56, (short) 57, (short) 65, (short) 66, (short) 67, (short) 68, (short) 69, (short) 70, (short) 71, (short) 72, (short) 73, (short) 74, (short) 75, (short) 76, (short) 77, (short) 78, (short) 79, (short) 80, (short) 81, (short) 82, (short) 83, (short) 84, (short) 85, (short) 86, (short) 87, (short) 88, (short) 89, (short) 90, (short) 32, (short) 36, (short) 37, (short) 42, (short) 43, (short) 45, (short) 46, (short) 47, (short) 58};
        a = r0;
        return;
    L_0x0038:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0049;
            case 1: goto L_0x004c;
            case 2: goto L_0x004f;
            case 3: goto L_0x0052;
            default: goto L_0x003f;
        };
    L_0x003f:
        r2 = 19;
    L_0x0041:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0049:
        r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        goto L_0x0041;
    L_0x004c:
        r2 = 89;
        goto L_0x0041;
    L_0x004f:
        r2 = 34;
        goto L_0x0041;
    L_0x0052:
        r2 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bq.<clinit>():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.gd a(byte[] r12, com.google.eB r13, com.google.Y r14, java.util.Map r15) {
        /*
        r11 = com.google.eB.g;
        r0 = new com.google.e_;
        r0.<init>(r12);
        r1 = new java.lang.StringBuilder;
        r2 = 50;
        r1.<init>(r2);
        r4 = new java.util.ArrayList;
        r2 = 1;
        r4.<init>(r2);
        r3 = -1;
        r6 = -1;
        r2 = 0;
        r5 = 0;
        r10 = r2;
        r2 = r6;
    L_0x001a:
        r6 = r0.a();	 Catch:{ IllegalArgumentException -> 0x0052 }
        r7 = 4;
        if (r6 >= r7) goto L_0x0025;
    L_0x0021:
        r6 = com.google.cq.TERMINATOR;	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r11 == 0) goto L_0x0116;
    L_0x0025:
        r6 = 4;
        r6 = r0.a(r6);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r6 = com.google.cq.forBits(r6);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r9 = r6;
    L_0x002f:
        r6 = com.google.cq.TERMINATOR;	 Catch:{ IllegalArgumentException -> 0x0058 }
        if (r9 == r6) goto L_0x0111;
    L_0x0033:
        r6 = com.google.cq.FNC1_FIRST_POSITION;	 Catch:{ IllegalArgumentException -> 0x0058 }
        if (r9 == r6) goto L_0x003b;
    L_0x0037:
        r6 = com.google.cq.FNC1_SECOND_POSITION;	 Catch:{ IllegalArgumentException -> 0x005a }
        if (r9 != r6) goto L_0x003e;
    L_0x003b:
        r5 = 1;
        if (r11 == 0) goto L_0x0111;
    L_0x003e:
        r8 = r5;
        r5 = com.google.cq.STRUCTURED_APPEND;	 Catch:{ IllegalArgumentException -> 0x005c }
        if (r9 != r5) goto L_0x006e;
    L_0x0043:
        r2 = r0.a();	 Catch:{ IllegalArgumentException -> 0x005e }
        r3 = 16;
        if (r2 >= r3) goto L_0x0060;
    L_0x004b:
        r0 = com.google.ga.a();	 Catch:{ IllegalArgumentException -> 0x0050 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        r0 = com.google.ga.a();
        throw r0;
    L_0x0058:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0050 }
    L_0x0060:
        r2 = 8;
        r3 = r0.a(r2);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r2 = 8;
        r2 = r0.a(r2);	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r11 == 0) goto L_0x00e8;
    L_0x006e:
        r6 = r2;
        r7 = r3;
        r2 = com.google.cq.ECI;	 Catch:{ IllegalArgumentException -> 0x0085 }
        if (r9 != r2) goto L_0x010e;
    L_0x0074:
        r2 = a(r0);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r3 = com.google.d_.getCharacterSetECIByValue(r2);	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r3 != 0) goto L_0x0087;
    L_0x007e:
        r0 = com.google.ga.a();	 Catch:{ IllegalArgumentException -> 0x0083 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0087:
        if (r11 == 0) goto L_0x011f;
    L_0x0089:
        r2 = com.google.cq.HANZI;	 Catch:{ IllegalArgumentException -> 0x00d6 }
        if (r9 != r2) goto L_0x00a2;
    L_0x008d:
        r2 = 4;
        r2 = r0.a(r2);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r5 = r9.getCharacterCountBits(r13);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r5 = r0.a(r5);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r10 = 1;
        if (r2 != r10) goto L_0x00a0;
    L_0x009d:
        b(r0, r1, r5);	 Catch:{ IllegalArgumentException -> 0x00d8 }
    L_0x00a0:
        if (r11 == 0) goto L_0x011f;
    L_0x00a2:
        r2 = r9.getCharacterCountBits(r13);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r2 = r0.a(r2);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r5 = com.google.cq.NUMERIC;	 Catch:{ IllegalArgumentException -> 0x00da }
        if (r9 != r5) goto L_0x00b3;
    L_0x00ae:
        a(r0, r1, r2);	 Catch:{ IllegalArgumentException -> 0x00da }
        if (r11 == 0) goto L_0x011f;
    L_0x00b3:
        r5 = com.google.cq.ALPHANUMERIC;	 Catch:{ IllegalArgumentException -> 0x00dc }
        if (r9 != r5) goto L_0x00bc;
    L_0x00b7:
        a(r0, r1, r2, r8);	 Catch:{ IllegalArgumentException -> 0x00de }
        if (r11 == 0) goto L_0x011f;
    L_0x00bc:
        r5 = com.google.cq.BYTE;	 Catch:{ IllegalArgumentException -> 0x00e0 }
        if (r9 != r5) goto L_0x00c6;
    L_0x00c0:
        r5 = r15;
        a(r0, r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x00e2 }
        if (r11 == 0) goto L_0x011f;
    L_0x00c6:
        r5 = com.google.cq.KANJI;	 Catch:{ IllegalArgumentException -> 0x00e4 }
        if (r9 != r5) goto L_0x00cf;
    L_0x00ca:
        c(r0, r1, r2);	 Catch:{ IllegalArgumentException -> 0x00e6 }
        if (r11 == 0) goto L_0x011f;
    L_0x00cf:
        r0 = com.google.ga.a();	 Catch:{ IllegalArgumentException -> 0x00d4 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d4 }
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x00d8:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x00da:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00dc }
    L_0x00dc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e6 }
    L_0x00e6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d4 }
    L_0x00e8:
        r6 = r2;
        r5 = r3;
        r2 = r8;
        r3 = r10;
    L_0x00ec:
        r7 = com.google.cq.TERMINATOR;	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r9 != r7) goto L_0x0119;
    L_0x00f0:
        r0 = new com.google.gd;	 Catch:{ IllegalArgumentException -> 0x0105 }
        r2 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0105 }
        r1 = r4.isEmpty();	 Catch:{ IllegalArgumentException -> 0x0105 }
        if (r1 == 0) goto L_0x0107;
    L_0x00fc:
        r3 = 0;
    L_0x00fd:
        if (r14 != 0) goto L_0x0109;
    L_0x00ff:
        r4 = 0;
    L_0x0100:
        r1 = r12;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        return r0;
    L_0x0105:
        r0 = move-exception;
        throw r0;
    L_0x0107:
        r3 = r4;
        goto L_0x00fd;
    L_0x0109:
        r4 = r14.toString();
        goto L_0x0100;
    L_0x010e:
        r3 = r10;
        goto L_0x0089;
    L_0x0111:
        r6 = r2;
        r2 = r5;
        r5 = r3;
        r3 = r10;
        goto L_0x00ec;
    L_0x0116:
        r9 = r6;
        goto L_0x002f;
    L_0x0119:
        r10 = r3;
        r3 = r5;
        r5 = r2;
        r2 = r6;
        goto L_0x001a;
    L_0x011f:
        r2 = r8;
        r5 = r7;
        goto L_0x00ec;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bq.a(byte[], com.google.eB, com.google.Y, java.util.Map):com.google.gd");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(com.google.e_ r5, java.lang.StringBuilder r6, int r7) {
        /*
        r2 = com.google.eB.g;
        r0 = r7 * 13;
        r1 = r5.a();	 Catch:{ UnsupportedEncodingException -> 0x000f }
        if (r0 <= r1) goto L_0x0011;
    L_0x000a:
        r0 = com.google.ga.a();	 Catch:{ UnsupportedEncodingException -> 0x000f }
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x000f }
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r0 = r7 * 2;
        r3 = new byte[r0];
        r0 = 0;
        r1 = r0;
    L_0x0017:
        if (r7 <= 0) goto L_0x0048;
    L_0x0019:
        r0 = 13;
        r0 = r5.a(r0);
        r4 = r0 / 96;
        r4 = r4 << 8;
        r0 = r0 % 96;
        r0 = r0 | r4;
        r4 = 959; // 0x3bf float:1.344E-42 double:4.74E-321;
        if (r0 >= r4) goto L_0x0030;
    L_0x002a:
        r4 = 41377; // 0xa1a1 float:5.7982E-41 double:2.0443E-319;
        r0 = r0 + r4;
        if (r2 == 0) goto L_0x0034;
    L_0x0030:
        r4 = 42657; // 0xa6a1 float:5.9775E-41 double:2.10754E-319;
        r0 = r0 + r4;
    L_0x0034:
        r4 = r0 >> 8;
        r4 = r4 & 255;
        r4 = (byte) r4;
        r3[r1] = r4;
        r4 = r1 + 1;
        r0 = r0 & 255;
        r0 = (byte) r0;
        r3[r4] = r0;
        r0 = r1 + 2;
        r7 = r7 + -1;
        if (r2 == 0) goto L_0x005c;
    L_0x0048:
        r0 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0056 }
        r1 = z;	 Catch:{ UnsupportedEncodingException -> 0x0056 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ UnsupportedEncodingException -> 0x0056 }
        r0.<init>(r3, r1);	 Catch:{ UnsupportedEncodingException -> 0x0056 }
        r6.append(r0);	 Catch:{ UnsupportedEncodingException -> 0x0056 }
        return;
    L_0x0056:
        r0 = move-exception;
        r0 = com.google.ga.a();
        throw r0;
    L_0x005c:
        r1 = r0;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bq.b(com.google.e_, java.lang.StringBuilder, int):void");
    }

    private static int a(e_ e_Var) {
        int a = e_Var.a(8);
        if ((a & 128) == 0) {
            return a & 127;
        }
        if ((a & 192) == 128) {
            return ((a & 63) << 8) | e_Var.a(8);
        } else if ((a & 224) == 192) {
            return ((a & 31) << 16) | e_Var.a(16);
        } else {
            throw ga.a();
        }
    }

    private static char a(int i) {
        try {
            if (i < a.length) {
                return a[i];
            }
            throw ga.a();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private static void a(e_ e_Var, StringBuilder stringBuilder, int i, d_ d_Var, Collection collection, Map map) {
        int i2 = eB.g;
        try {
            if (i * 8 > e_Var.a()) {
                throw ga.a();
            }
            String a;
            Object obj = new Object[i];
            int i3 = 0;
            while (i3 < i) {
                obj[i3] = (byte) e_Var.a(8);
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
            if (d_Var == null) {
                a = gL.a(obj, map);
            } else {
                a = d_Var.name();
            }
            try {
                stringBuilder.append(new String(obj, a));
                collection.add(obj);
            } catch (UnsupportedEncodingException e) {
                throw ga.a();
            }
        } catch (UnsupportedEncodingException e2) {
            throw e2;
        }
    }

    private static void a(e_ e_Var, StringBuilder stringBuilder, int i) {
        int a;
        int i2 = eB.g;
        int i3 = i;
        while (i3 >= 3) {
            try {
                if (e_Var.a() >= 10) {
                    a = e_Var.a(10);
                    if (a < 1000) {
                        stringBuilder.append(a(a / 100));
                        stringBuilder.append(a((a / 10) % 10));
                        stringBuilder.append(a(a % 10));
                        i3 -= 3;
                        if (i2 != 0) {
                            break;
                        }
                    }
                    try {
                        throw ga.a();
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                throw ga.a();
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        try {
            if (i3 == 2) {
                try {
                    if (e_Var.a() < 7) {
                        throw ga.a();
                    }
                    a = e_Var.a(7);
                    if (a >= 100) {
                        try {
                            throw ga.a();
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    }
                    try {
                        stringBuilder.append(a(a / 10));
                        stringBuilder.append(a(a % 10));
                        if (i2 == 0) {
                            return;
                        }
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    } catch (IllegalArgumentException e2222) {
                        throw e2222;
                    }
                } catch (IllegalArgumentException e22222) {
                    throw e22222;
                }
            }
            if (i3 != 1) {
                return;
            }
            if (e_Var.a() < 4) {
                throw ga.a();
            }
            i3 = e_Var.a(4);
            if (i3 >= 10) {
                try {
                    throw ga.a();
                } catch (IllegalArgumentException e222222) {
                    throw e222222;
                }
            }
            stringBuilder.append(a(i3));
        } catch (IllegalArgumentException e2222222) {
            throw e2222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void c(com.google.e_ r5, java.lang.StringBuilder r6, int r7) {
        /*
        r0 = 0;
        r2 = com.google.eB.g;
        r1 = r7 * 13;
        r3 = r5.a();	 Catch:{ UnsupportedEncodingException -> 0x0010 }
        if (r1 <= r3) goto L_0x0012;
    L_0x000b:
        r0 = com.google.ga.a();	 Catch:{ UnsupportedEncodingException -> 0x0010 }
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x0010 }
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r1 = r7 * 2;
        r3 = new byte[r1];
        r1 = r0;
    L_0x0017:
        if (r7 <= 0) goto L_0x0044;
    L_0x0019:
        r0 = 13;
        r0 = r5.a(r0);
        r4 = r0 / 192;
        r4 = r4 << 8;
        r0 = r0 % 192;
        r0 = r0 | r4;
        r4 = 7936; // 0x1f00 float:1.1121E-41 double:3.921E-320;
        if (r0 >= r4) goto L_0x0030;
    L_0x002a:
        r4 = 33088; // 0x8140 float:4.6366E-41 double:1.63476E-319;
        r0 = r0 + r4;
        if (r2 == 0) goto L_0x0034;
    L_0x0030:
        r4 = 49472; // 0xc140 float:6.9325E-41 double:2.44424E-319;
        r0 = r0 + r4;
    L_0x0034:
        r4 = r0 >> 8;
        r4 = (byte) r4;
        r3[r1] = r4;
        r4 = r1 + 1;
        r0 = (byte) r0;
        r3[r4] = r0;
        r0 = r1 + 2;
        r7 = r7 + -1;
        if (r2 == 0) goto L_0x0058;
    L_0x0044:
        r0 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        r1 = z;	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        r0.<init>(r3, r1);	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        r6.append(r0);	 Catch:{ UnsupportedEncodingException -> 0x0052 }
        return;
    L_0x0052:
        r0 = move-exception;
        r0 = com.google.ga.a();
        throw r0;
    L_0x0058:
        r1 = r0;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bq.c(com.google.e_, java.lang.StringBuilder, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.e_ r9, java.lang.StringBuilder r10, int r11, boolean r12) {
        /*
        r8 = 37;
        r7 = 11;
        r6 = 6;
        r5 = 1;
        r2 = com.google.eB.g;
        r0 = r10.length();
        r1 = r11;
    L_0x000d:
        if (r1 <= r5) goto L_0x0036;
    L_0x000f:
        r3 = r9.a();	 Catch:{ IllegalArgumentException -> 0x001a }
        if (r3 >= r7) goto L_0x001c;
    L_0x0015:
        r0 = com.google.ga.a();	 Catch:{ IllegalArgumentException -> 0x001a }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001a }
    L_0x001a:
        r0 = move-exception;
        throw r0;
    L_0x001c:
        r3 = r9.a(r7);
        r4 = r3 / 45;
        r4 = a(r4);
        r10.append(r4);
        r3 = r3 % 45;
        r3 = a(r3);
        r10.append(r3);
        r1 = r1 + -2;
        if (r2 == 0) goto L_0x000d;
    L_0x0036:
        if (r1 != r5) goto L_0x0050;
    L_0x0038:
        r1 = r9.a();	 Catch:{ IllegalArgumentException -> 0x0043 }
        if (r1 >= r6) goto L_0x0045;
    L_0x003e:
        r0 = com.google.ga.a();	 Catch:{ IllegalArgumentException -> 0x0043 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r1 = r9.a(r6);
        r1 = a(r1);
        r10.append(r1);
    L_0x0050:
        if (r12 == 0) goto L_0x007e;
    L_0x0052:
        r1 = r10.length();
        if (r0 >= r1) goto L_0x007e;
    L_0x0058:
        r1 = r10.charAt(r0);	 Catch:{ IllegalArgumentException -> 0x007f }
        if (r1 != r8) goto L_0x007a;
    L_0x005e:
        r1 = r10.length();	 Catch:{ IllegalArgumentException -> 0x0081 }
        r1 = r1 + -1;
        if (r0 >= r1) goto L_0x0075;
    L_0x0066:
        r1 = r0 + 1;
        r1 = r10.charAt(r1);	 Catch:{ IllegalArgumentException -> 0x0083 }
        if (r1 != r8) goto L_0x0075;
    L_0x006e:
        r1 = r0 + 1;
        r10.deleteCharAt(r1);	 Catch:{ IllegalArgumentException -> 0x0085 }
        if (r2 == 0) goto L_0x007a;
    L_0x0075:
        r1 = 29;
        r10.setCharAt(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0085 }
    L_0x007a:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0052;
    L_0x007e:
        return;
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0085 }
    L_0x0085:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.bq.a(com.google.e_, java.lang.StringBuilder, int, boolean):void");
    }
}
