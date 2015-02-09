package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class qx {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r12, java.lang.Object r13, java.lang.StringBuffer r14, java.lang.StringBuffer r15) {
        /*
        r4 = com.google.android.gms.internal.qw.a;
        if (r13 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r1 = r13 instanceof com.google.android.gms.internal.qw;
        if (r1 == 0) goto L_0x00e6;
    L_0x0009:
        r5 = r14.length();
        if (r12 == 0) goto L_0x0025;
    L_0x000f:
        r1 = r15.append(r14);	 Catch:{ NoSuchMethodException -> 0x012c }
        r2 = dl(r12);	 Catch:{ NoSuchMethodException -> 0x012c }
        r1 = r1.append(r2);	 Catch:{ NoSuchMethodException -> 0x012c }
        r2 = " <\n";
        r1.append(r2);	 Catch:{ NoSuchMethodException -> 0x012c }
        r1 = "  ";
        r14.append(r1);	 Catch:{ NoSuchMethodException -> 0x012c }
    L_0x0025:
        r6 = r13.getClass();
        r7 = r6.getFields();
        r8 = r7.length;
        r1 = 0;
        r3 = r1;
    L_0x0030:
        if (r3 >= r8) goto L_0x008c;
    L_0x0032:
        r1 = r7[r3];
        r2 = r1.getModifiers();
        r9 = r1.getName();
        r10 = r2 & 1;
        r11 = 1;
        if (r10 != r11) goto L_0x0088;
    L_0x0041:
        r2 = r2 & 8;
        r10 = 8;
        if (r2 == r10) goto L_0x0088;
    L_0x0047:
        r2 = "_";
        r2 = r9.startsWith(r2);	 Catch:{ NoSuchMethodException -> 0x012e }
        if (r2 != 0) goto L_0x0088;
    L_0x004f:
        r2 = "_";
        r2 = r9.endsWith(r2);	 Catch:{ NoSuchMethodException -> 0x0130 }
        if (r2 != 0) goto L_0x0088;
    L_0x0057:
        r2 = r1.getType();
        r10 = r1.get(r13);
        r1 = r2.isArray();
        if (r1 == 0) goto L_0x0085;
    L_0x0065:
        r1 = r2.getComponentType();
        r2 = java.lang.Byte.TYPE;	 Catch:{ NoSuchMethodException -> 0x0132 }
        if (r1 != r2) goto L_0x0072;
    L_0x006d:
        a(r9, r10, r14, r15);	 Catch:{ NoSuchMethodException -> 0x0132 }
        if (r4 == 0) goto L_0x0083;
    L_0x0072:
        if (r10 != 0) goto L_0x0138;
    L_0x0074:
        r1 = 0;
    L_0x0075:
        r2 = 0;
    L_0x0076:
        if (r2 >= r1) goto L_0x0083;
    L_0x0078:
        r11 = java.lang.reflect.Array.get(r10, r2);
        a(r9, r11, r14, r15);
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x0076;
    L_0x0083:
        if (r4 == 0) goto L_0x0088;
    L_0x0085:
        a(r9, r10, r14, r15);	 Catch:{ NoSuchMethodException -> 0x013e }
    L_0x0088:
        r1 = r3 + 1;
        if (r4 == 0) goto L_0x0180;
    L_0x008c:
        r3 = r6.getMethods();
        r7 = r3.length;
        r1 = 0;
        r2 = r1;
    L_0x0093:
        if (r2 >= r7) goto L_0x00d6;
    L_0x0095:
        r1 = r3[r2];
        r1 = r1.getName();
        r8 = "set";
        r8 = r1.startsWith(r8);
        if (r8 == 0) goto L_0x00d2;
    L_0x00a3:
        r8 = 3;
        r8 = r1.substring(r8);
        r1 = 0;
        r9 = new java.lang.StringBuilder;	 Catch:{ NoSuchMethodException -> 0x0140 }
        r9.<init>();	 Catch:{ NoSuchMethodException -> 0x0140 }
        r10 = "has";
        r9 = r9.append(r10);	 Catch:{ NoSuchMethodException -> 0x0140 }
        r9 = r9.append(r8);	 Catch:{ NoSuchMethodException -> 0x0140 }
        r9 = r9.toString();	 Catch:{ NoSuchMethodException -> 0x0140 }
        r10 = 0;
        r10 = new java.lang.Class[r10];	 Catch:{ NoSuchMethodException -> 0x0140 }
        r1 = r6.getMethod(r9, r10);	 Catch:{ NoSuchMethodException -> 0x0140 }
    L_0x00c3:
        r9 = 0;
        r9 = new java.lang.Object[r9];	 Catch:{ NoSuchMethodException -> 0x0144 }
        r1 = r1.invoke(r13, r9);	 Catch:{ NoSuchMethodException -> 0x0144 }
        r1 = (java.lang.Boolean) r1;	 Catch:{ NoSuchMethodException -> 0x0144 }
        r1 = r1.booleanValue();	 Catch:{ NoSuchMethodException -> 0x0144 }
        if (r1 != 0) goto L_0x0148;
    L_0x00d2:
        r1 = r2 + 1;
        if (r4 == 0) goto L_0x017d;
    L_0x00d6:
        if (r12 == 0) goto L_0x00e4;
    L_0x00d8:
        r14.setLength(r5);	 Catch:{ NoSuchMethodException -> 0x0175 }
        r1 = r15.append(r14);	 Catch:{ NoSuchMethodException -> 0x0175 }
        r2 = ">\n";
        r1.append(r2);	 Catch:{ NoSuchMethodException -> 0x0175 }
    L_0x00e4:
        if (r4 == 0) goto L_0x0004;
    L_0x00e6:
        r1 = dl(r12);
        r2 = r15.append(r14);
        r1 = r2.append(r1);
        r2 = ": ";
        r1.append(r2);
        r1 = r13 instanceof java.lang.String;
        if (r1 == 0) goto L_0x0113;
    L_0x00fb:
        r1 = r13;
        r1 = (java.lang.String) r1;
        r1 = dm(r1);
        r2 = "\"";
        r2 = r15.append(r2);	 Catch:{ NoSuchMethodException -> 0x0177 }
        r1 = r2.append(r1);	 Catch:{ NoSuchMethodException -> 0x0177 }
        r2 = "\"";
        r1.append(r2);	 Catch:{ NoSuchMethodException -> 0x0177 }
        if (r4 == 0) goto L_0x0125;
    L_0x0113:
        r1 = r13 instanceof byte[];	 Catch:{ NoSuchMethodException -> 0x0179 }
        if (r1 == 0) goto L_0x0122;
    L_0x0117:
        r0 = r13;
        r0 = (byte[]) r0;	 Catch:{ NoSuchMethodException -> 0x017b }
        r1 = r0;
        r1 = (byte[]) r1;	 Catch:{ NoSuchMethodException -> 0x017b }
        a(r1, r15);	 Catch:{ NoSuchMethodException -> 0x017b }
        if (r4 == 0) goto L_0x0125;
    L_0x0122:
        r15.append(r13);	 Catch:{ NoSuchMethodException -> 0x017b }
    L_0x0125:
        r1 = "\n";
        r15.append(r1);
        goto L_0x0004;
    L_0x012c:
        r1 = move-exception;
        throw r1;
    L_0x012e:
        r1 = move-exception;
        throw r1;	 Catch:{ NoSuchMethodException -> 0x0130 }
    L_0x0130:
        r1 = move-exception;
        throw r1;
    L_0x0132:
        r1 = move-exception;
        throw r1;	 Catch:{ NoSuchMethodException -> 0x0134 }
    L_0x0134:
        r1 = move-exception;
        throw r1;	 Catch:{ NoSuchMethodException -> 0x0136 }
    L_0x0136:
        r1 = move-exception;
        throw r1;
    L_0x0138:
        r1 = java.lang.reflect.Array.getLength(r10);
        goto L_0x0075;
    L_0x013e:
        r1 = move-exception;
        throw r1;
    L_0x0140:
        r9 = move-exception;
        if (r4 == 0) goto L_0x00d2;
    L_0x0143:
        goto L_0x00c3;
    L_0x0144:
        r1 = move-exception;
        throw r1;	 Catch:{ NoSuchMethodException -> 0x0146 }
    L_0x0146:
        r1 = move-exception;
        throw r1;
    L_0x0148:
        r1 = 0;
        r9 = new java.lang.StringBuilder;	 Catch:{ NoSuchMethodException -> 0x0171 }
        r9.<init>();	 Catch:{ NoSuchMethodException -> 0x0171 }
        r10 = "get";
        r9 = r9.append(r10);	 Catch:{ NoSuchMethodException -> 0x0171 }
        r9 = r9.append(r8);	 Catch:{ NoSuchMethodException -> 0x0171 }
        r9 = r9.toString();	 Catch:{ NoSuchMethodException -> 0x0171 }
        r10 = 0;
        r10 = new java.lang.Class[r10];	 Catch:{ NoSuchMethodException -> 0x0171 }
        r1 = r6.getMethod(r9, r10);	 Catch:{ NoSuchMethodException -> 0x0171 }
    L_0x0163:
        r9 = 0;
        r9 = new java.lang.Object[r9];	 Catch:{ NoSuchMethodException -> 0x016f }
        r1 = r1.invoke(r13, r9);	 Catch:{ NoSuchMethodException -> 0x016f }
        a(r8, r1, r14, r15);	 Catch:{ NoSuchMethodException -> 0x016f }
        goto L_0x00d2;
    L_0x016f:
        r1 = move-exception;
        throw r1;
    L_0x0171:
        r9 = move-exception;
        if (r4 == 0) goto L_0x00d2;
    L_0x0174:
        goto L_0x0163;
    L_0x0175:
        r1 = move-exception;
        throw r1;
    L_0x0177:
        r1 = move-exception;
        throw r1;	 Catch:{ NoSuchMethodException -> 0x0179 }
    L_0x0179:
        r1 = move-exception;
        throw r1;	 Catch:{ NoSuchMethodException -> 0x017b }
    L_0x017b:
        r1 = move-exception;
        throw r1;
    L_0x017d:
        r2 = r1;
        goto L_0x0093;
    L_0x0180:
        r3 = r1;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.qx.a(java.lang.String, java.lang.Object, java.lang.StringBuffer, java.lang.StringBuffer):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(byte[] r8, java.lang.StringBuffer r9) {
        /*
        r7 = 92;
        r1 = 0;
        r6 = 34;
        r2 = com.google.android.gms.internal.qw.a;
        if (r8 != 0) goto L_0x000f;
    L_0x0009:
        r0 = "\"\"";
        r9.append(r0);
    L_0x000e:
        return;
    L_0x000f:
        r9.append(r6);
        r0 = r1;
    L_0x0013:
        r3 = r8.length;
        if (r0 >= r3) goto L_0x004c;
    L_0x0016:
        r3 = r8[r0];
        r3 = r3 & 255;
        if (r3 == r7) goto L_0x001e;
    L_0x001c:
        if (r3 != r6) goto L_0x0028;
    L_0x001e:
        r4 = r9.append(r7);
        r5 = (char) r3;
        r4.append(r5);
        if (r2 == 0) goto L_0x0048;
    L_0x0028:
        r4 = 32;
        if (r3 < r4) goto L_0x0036;
    L_0x002c:
        r4 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        if (r3 >= r4) goto L_0x0036;
    L_0x0030:
        r4 = (char) r3;
        r9.append(r4);
        if (r2 == 0) goto L_0x0048;
    L_0x0036:
        r4 = "\\%03o";
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r3 = java.lang.Integer.valueOf(r3);
        r5[r1] = r3;
        r3 = java.lang.String.format(r4, r5);
        r9.append(r3);
    L_0x0048:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0013;
    L_0x004c:
        r9.append(r6);
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.qx.a(byte[], java.lang.StringBuffer):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String bh(java.lang.String r8) {
        /*
        r1 = 0;
        r2 = com.google.android.gms.internal.qw.a;
        r3 = r8.length();
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r0 = r1;
    L_0x000d:
        if (r0 >= r3) goto L_0x003e;
    L_0x000f:
        r5 = r8.charAt(r0);
        r6 = 32;
        if (r5 < r6) goto L_0x0028;
    L_0x0017:
        r6 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r5 > r6) goto L_0x0028;
    L_0x001b:
        r6 = 34;
        if (r5 == r6) goto L_0x0028;
    L_0x001f:
        r6 = 39;
        if (r5 == r6) goto L_0x0028;
    L_0x0023:
        r4.append(r5);
        if (r2 == 0) goto L_0x003a;
    L_0x0028:
        r6 = "\\u%04x";
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r5 = java.lang.Integer.valueOf(r5);
        r7[r1] = r5;
        r5 = java.lang.String.format(r6, r7);
        r4.append(r5);
    L_0x003a:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x000d;
    L_0x003e:
        r0 = r4.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.qx.bh(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String dl(java.lang.String r6) {
        /*
        r1 = com.google.android.gms.internal.qw.a;
        r2 = new java.lang.StringBuffer;
        r2.<init>();
        r0 = 0;
    L_0x0008:
        r3 = r6.length();
        if (r0 >= r3) goto L_0x0039;
    L_0x000e:
        r3 = r6.charAt(r0);
        if (r0 != 0) goto L_0x001d;
    L_0x0014:
        r4 = java.lang.Character.toLowerCase(r3);
        r2.append(r4);
        if (r1 == 0) goto L_0x0035;
    L_0x001d:
        r4 = java.lang.Character.isUpperCase(r3);
        if (r4 == 0) goto L_0x0032;
    L_0x0023:
        r4 = 95;
        r4 = r2.append(r4);
        r5 = java.lang.Character.toLowerCase(r3);
        r4.append(r5);
        if (r1 == 0) goto L_0x0035;
    L_0x0032:
        r2.append(r3);
    L_0x0035:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0008;
    L_0x0039:
        r0 = r2.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.qx.dl(java.lang.String):java.lang.String");
    }

    private static String dm(String str) {
        if (!str.startsWith("http") && str.length() > 200) {
            str = str.substring(0, 200) + "[...]";
        }
        return bh(str);
    }

    public static String g(qw qwVar) {
        if (qwVar == null) {
            try {
                return "";
            } catch (IllegalAccessException e) {
                throw e;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            a(null, qwVar, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e2) {
            return "Error printing proto: " + e2.getMessage();
        } catch (InvocationTargetException e3) {
            return "Error printing proto: " + e3.getMessage();
        }
    }
}
