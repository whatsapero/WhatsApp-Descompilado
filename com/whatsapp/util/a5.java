package com.whatsapp.util;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.SparseIntArray;
import com.whatsapp.am1;
import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class a5 {
    private static final ax a;
    private static final ax b;
    private static boolean c;
    private static final ax d;
    private static SparseIntArray e;
    private static boolean f;
    private static final String[] z;

    public static CharSequence c(String str, Context context) {
        SpannableStringBuilder a = a(str, context);
        return a == null ? str : a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.SpannableStringBuilder a(java.lang.String r13, android.content.Context r14, com.whatsapp.util.ax r15) {
        /*
        r9 = com.whatsapp.util.Log.e;
        if (r13 != 0) goto L_0x0006;
    L_0x0004:
        r0 = 0;
    L_0x0005:
        return r0;
    L_0x0006:
        r2 = 0;
        r7 = 0;
        r1 = 0;
        r10 = r13.length();
        r0 = 0;
        r8 = r0;
        r0 = r2;
    L_0x0010:
        if (r8 >= r10) goto L_0x00f0;
    L_0x0012:
        r5 = r13.codePointAt(r8);
        r2 = java.lang.Character.charCount(r5);
        r4 = 0;
        r3 = 0;
        r6 = e(r5);
        if (r6 == 0) goto L_0x00eb;
    L_0x0022:
        r6 = r8 + r2;
        if (r6 >= r10) goto L_0x00eb;
    L_0x0026:
        r4 = r8 + r2;
        r6 = r13.codePointAt(r4);
        r4 = b(r5, r6);
        if (r4 <= 0) goto L_0x0039;
    L_0x0032:
        r11 = java.lang.Character.charCount(r6);
        r2 = r2 + r11;
        if (r9 == 0) goto L_0x00eb;
    L_0x0039:
        r3 = a(r5, r6);
        if (r3 == 0) goto L_0x00e6;
    L_0x003f:
        r6 = java.lang.Character.charCount(r6);
        r2 = r2 + r6;
        r12 = r3;
        r3 = r4;
        r4 = r12;
    L_0x0047:
        if (r3 != 0) goto L_0x0063;
    L_0x0049:
        if (r4 != 0) goto L_0x0063;
    L_0x004b:
        r3 = f;
        if (r3 == 0) goto L_0x005f;
    L_0x004f:
        r3 = r5 & -4096;
        r6 = 61440; // 0xf000 float:8.6096E-41 double:3.03554E-319;
        if (r3 != r6) goto L_0x005f;
    L_0x0056:
        r3 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r3 = r3 | r5;
        r3 = a(r3);
        if (r9 == 0) goto L_0x0063;
    L_0x005f:
        r3 = a(r5);
    L_0x0063:
        r6 = b(r3);
        if (r6 != 0) goto L_0x006b;
    L_0x0069:
        if (r4 == 0) goto L_0x00d0;
    L_0x006b:
        if (r0 != 0) goto L_0x0072;
    L_0x006d:
        r0 = new android.text.SpannableStringBuilder;
        r0.<init>(r13);
    L_0x0072:
        if (r4 != 0) goto L_0x00c7;
    L_0x0074:
        r3 = a(r14, r3);
    L_0x0078:
        if (r3 == 0) goto L_0x00c4;
    L_0x007a:
        r3 = r15.a(r3, r14);
        r11 = new android.text.style.ImageSpan;
        r4 = 0;
        r11.<init>(r3, r4);
        r3 = r8 + r2;
        if (r3 >= r10) goto L_0x00fd;
    L_0x0088:
        r3 = r8 + r2;
        r3 = r13.codePointAt(r3);
        r4 = 65024; // 0xfe00 float:9.1118E-41 double:3.2126E-319;
        if (r3 < r4) goto L_0x00fd;
    L_0x0093:
        r4 = 65039; // 0xfe0f float:9.1139E-41 double:3.21335E-319;
        if (r3 > r4) goto L_0x00fd;
    L_0x0098:
        r2 = r2 + 1;
        r6 = r2;
    L_0x009b:
        r2 = f;
        if (r2 == 0) goto L_0x00bb;
    L_0x009f:
        r2 = r1 + r6;
        r3 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r3 = r3 & r5;
        r3 = (char) r3;
        r3 = java.lang.Character.toString(r3);
        r4 = 0;
        r5 = 1;
        r0.replace(r1, r2, r3, r4, r5);
        r2 = r1 + 1;
        r3 = 33;
        r0.setSpan(r11, r1, r2, r3);
        r2 = r6 + -1;
        r1 = r1 - r2;
        if (r9 == 0) goto L_0x00c2;
    L_0x00bb:
        r2 = r1 + r6;
        r3 = 33;
        r0.setSpan(r11, r1, r2, r3);
    L_0x00c2:
        if (r9 == 0) goto L_0x00cd;
    L_0x00c4:
        r0 = 0;
        goto L_0x0005;
    L_0x00c7:
        r3 = new com.whatsapp.util.be;
        r3.<init>(r4);
        goto L_0x0078;
    L_0x00cd:
        if (r9 == 0) goto L_0x00f8;
    L_0x00cf:
        r2 = r6;
    L_0x00d0:
        r7 = 1;
        r3 = r1;
        r1 = r0;
        r0 = r7;
    L_0x00d4:
        r3 = r3 + r2;
        r2 = r2 + r8;
        if (r9 == 0) goto L_0x00f2;
    L_0x00d8:
        r12 = r0;
        r0 = r1;
        r1 = r12;
    L_0x00db:
        if (r0 == 0) goto L_0x0005;
    L_0x00dd:
        if (r1 != 0) goto L_0x0005;
    L_0x00df:
        r1 = " ";
        r0.append(r1);
        goto L_0x0005;
    L_0x00e6:
        r12 = r3;
        r3 = r4;
        r4 = r12;
        goto L_0x0047;
    L_0x00eb:
        r12 = r3;
        r3 = r4;
        r4 = r12;
        goto L_0x0047;
    L_0x00f0:
        r1 = r7;
        goto L_0x00db;
    L_0x00f2:
        r8 = r2;
        r7 = r0;
        r0 = r1;
        r1 = r3;
        goto L_0x0010;
    L_0x00f8:
        r2 = r6;
        r3 = r1;
        r1 = r0;
        r0 = r7;
        goto L_0x00d4;
    L_0x00fd:
        r6 = r2;
        goto L_0x009b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.a5.a(java.lang.String, android.content.Context, com.whatsapp.util.ax):android.text.SpannableStringBuilder");
    }

    public static String f(int i) {
        return f ? new String(Character.toChars(65535 & i)) : new String(Character.toChars(i));
    }

    public static SpannableStringBuilder a(String str, Context context, Paint paint, float f) {
        return a(str, context, paint == null ? d : new v(paint, f));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.CharSequence r10) {
        /*
        r9 = 9633; // 0x25a1 float:1.3499E-41 double:4.7593E-320;
        r1 = com.whatsapp.util.Log.e;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r10.length();
        r0 = 0;
    L_0x000e:
        if (r0 >= r3) goto L_0x0051;
    L_0x0010:
        r4 = java.lang.Character.codePointAt(r10, r0);
        r5 = java.lang.Character.charCount(r4);
        r6 = b(r4);
        if (r6 == 0) goto L_0x0047;
    L_0x001e:
        r6 = android.os.Build.VERSION.SDK_INT;
        r7 = 16;
        if (r6 >= r7) goto L_0x0029;
    L_0x0024:
        r2.append(r9);
        if (r1 == 0) goto L_0x004e;
    L_0x0029:
        r6 = d(r4);
        r7 = c(r6);
        if (r7 != 0) goto L_0x0039;
    L_0x0033:
        r7 = android.os.Build.VERSION.SDK_INT;
        r8 = 19;
        if (r7 < r8) goto L_0x0042;
    L_0x0039:
        r6 = java.lang.Character.toChars(r6);
        r2.append(r6);
        if (r1 == 0) goto L_0x0045;
    L_0x0042:
        r2.append(r9);
    L_0x0045:
        if (r1 == 0) goto L_0x004e;
    L_0x0047:
        r4 = java.lang.Character.toChars(r4);
        r2.append(r4);
    L_0x004e:
        r0 = r0 + r5;
        if (r1 == 0) goto L_0x000e;
    L_0x0051:
        r0 = r2.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.a5.a(java.lang.CharSequence):java.lang.String");
    }

    public static SpannableStringBuilder b(String str, Context context) {
        return a(str, context, a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable a(android.content.Context r5, int r6) {
        /*
        r0 = e;
        r0 = r0.get(r6);
        if (r0 != 0) goto L_0x004a;
    L_0x0008:
        r0 = 1044480; // 0xff000 float:1.463628E-39 double:5.160417E-318;
        r0 = r0 & r6;
        r1 = 57344; // 0xe000 float:8.0356E-41 double:2.83317E-319;
        if (r0 != r1) goto L_0x0019;
    L_0x0011:
        r0 = java.lang.Integer.toHexString(r6);
        r1 = com.whatsapp.util.Log.e;
        if (r1 == 0) goto L_0x0033;
    L_0x0019:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = java.lang.Integer.toHexString(r6);
        r0 = r0.append(r1);
        r0 = r0.toString();
    L_0x0033:
        r1 = r5.getResources();
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r0 = r1.getIdentifier(r0, r2, r3);
        r1 = e;
        r1.put(r6, r0);
    L_0x004a:
        r1 = 0;
        r2 = r5.getResources();	 Catch:{ Exception -> 0x0054 }
        r0 = r2.getDrawable(r0);	 Catch:{ Exception -> 0x0054 }
    L_0x0053:
        return r0;
    L_0x0054:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r0.toString();
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r1;
        goto L_0x0053;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.a5.a(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public static int[] g(int i) {
        if (i < 60417 || i > 60462) {
            switch (i) {
                case 57872:
                    return new int[]{35, 8419};
                case 57884:
                    return new int[]{49, 8419};
                case 57885:
                    return new int[]{50, 8419};
                case 57886:
                    return new int[]{51, 8419};
                case 57887:
                    return new int[]{52, 8419};
                case 57888:
                    return new int[]{53, 8419};
                case 57889:
                    return new int[]{54, 8419};
                case 57890:
                    return new int[]{55, 8419};
                case 57891:
                    return new int[]{56, 8419};
                case 57892:
                    return new int[]{57, 8419};
                case 57893:
                    return new int[]{48, 8419};
                default:
                    return null;
            }
        }
        String str;
        switch (i) {
            case 58635:
                str = z[49];
                break;
            case 58636:
                str = z[30];
                break;
            case 58637:
                str = z[9];
                break;
            case 58638:
                str = z[10];
                break;
            case 58639:
                str = z[59];
                break;
            case 58640:
                str = z[34];
                break;
            case 58641:
                str = z[42];
                break;
            case 58642:
                str = z[44];
                break;
            case 58643:
                str = z[37];
                break;
            case 58644:
                str = z[22];
                break;
            case 60417:
                str = z[7];
                break;
            case 60418:
                str = z[32];
                break;
            case 60419:
                str = z[47];
                break;
            case 60420:
                str = z[27];
                break;
            case 60421:
                str = z[11];
                break;
            case 60422:
                str = z[25];
                break;
            case 60423:
                str = z[20];
                break;
            case 60424:
                str = z[16];
                break;
            case 60425:
                str = z[38];
                break;
            case 60426:
                str = z[21];
                break;
            case 60427:
                str = z[50];
                break;
            case 60428:
                str = z[56];
                break;
            case 60429:
                str = z[24];
                break;
            case 60430:
                str = z[53];
                break;
            case 60431:
                str = z[6];
                break;
            case 60432:
                str = z[51];
                break;
            case 60433:
                str = z[35];
                break;
            case 60434:
                str = z[33];
                break;
            case 60435:
                str = z[29];
                break;
            case 60436:
                str = z[18];
                break;
            case 60437:
                str = z[26];
                break;
            case 60438:
                str = z[52];
                break;
            case 60439:
                str = z[36];
                break;
            case 60440:
                str = z[55];
                break;
            case 60441:
                str = z[58];
                break;
            case 60442:
                str = z[4];
                break;
            case 60443:
                str = z[19];
                break;
            case 60444:
                str = z[15];
                break;
            case 60445:
                str = z[23];
                break;
            case 60446:
                str = z[48];
                break;
            case 60447:
                str = z[43];
                break;
            case 60448:
                str = z[31];
                break;
            case 60449:
                str = z[40];
                break;
            case 60450:
                str = z[28];
                break;
            case 60451:
                str = z[17];
                break;
            case 60452:
                str = z[45];
                break;
            case 60453:
                str = z[57];
                break;
            case 60454:
                str = z[39];
                break;
            case 60455:
                str = z[8];
                break;
            case 60456:
                str = z[14];
                break;
            case 60457:
                str = z[12];
                break;
            case 60458:
                str = z[46];
                break;
            case 60459:
                str = z[5];
                break;
            case 60460:
                str = z[41];
                break;
            case 60461:
                str = z[13];
                break;
            case 60462:
                str = z[54];
                break;
            default:
                str = null;
                break;
        }
        if (str == null) {
            return null;
        }
        return new int[]{(str.charAt(0) + 127462) - 65, (str.charAt(1) + 127462) - 65};
    }

    private static String a(int i, int i2) {
        return (i < 127462 || i > 127487 || i2 < 127462 || i2 > 127487) ? null : Character.toString((char) ((i - 127462) + 65)) + Character.toString((char) ((i2 - 127462) + 65));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r6) {
        /*
        r1 = com.whatsapp.util.Log.e;
        r0 = f;
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return r6;
    L_0x0007:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = 0;
    L_0x000d:
        r3 = r6.length();
        if (r0 >= r3) goto L_0x0046;
    L_0x0013:
        r3 = r6.charAt(r0);
        r4 = r3 & -4096;
        r5 = 61440; // 0xf000 float:8.6096E-41 double:3.03554E-319;
        if (r4 != r5) goto L_0x003f;
    L_0x001e:
        r4 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r4 = r4 | r3;
        r5 = a(r4);
        r5 = b(r5);
        if (r5 != 0) goto L_0x0031;
    L_0x002b:
        r5 = e(r4);
        if (r5 == 0) goto L_0x003a;
    L_0x0031:
        r4 = java.lang.Character.toChars(r4);
        r2.append(r4);
        if (r1 == 0) goto L_0x003d;
    L_0x003a:
        r2.append(r3);
    L_0x003d:
        if (r1 == 0) goto L_0x0042;
    L_0x003f:
        r2.append(r3);
    L_0x0042:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x000d;
    L_0x0046:
        r6 = r2.toString();
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.a5.a(java.lang.String):java.lang.String");
    }

    public static int h(int i) {
        return f ? 1 : Character.charCount(i);
    }

    public static CharSequence d(String str, Context context) {
        SpannableStringBuilder b = b(str, context);
        return b == null ? str : b;
    }

    public static void a(Editable editable, Context context) {
        int i = Log.e;
        if (!c) {
            int i2;
            int codePointAt;
            String toString;
            c = true;
            String toString2 = editable.toString();
            ImageSpan[] imageSpanArr = (ImageSpan[]) editable.getSpans(0, toString2.length(), ImageSpan.class);
            int i3 = 0;
            while (i3 < imageSpanArr.length) {
                editable.removeSpan(imageSpanArr[i3]);
                i3++;
                if (i != 0) {
                    break;
                }
            }
            int length = toString2.length();
            if (f) {
                i2 = 0;
                i3 = 0;
                while (i2 < length) {
                    codePointAt = toString2.codePointAt(i2);
                    int charCount = Character.charCount(codePointAt);
                    if (charCount > 1 && (e(codePointAt) || b(a(codePointAt)))) {
                        editable.replace(i3, i3 + charCount, f(codePointAt));
                        i3 -= charCount - 1;
                    }
                    i2 += charCount;
                    i3 += charCount;
                    if (i != 0) {
                        break;
                    }
                }
                toString = editable.toString();
                length = toString.length();
            } else {
                toString = toString2;
            }
            int i4 = 0;
            while (i4 < length) {
                int codePointAt2 = toString.codePointAt(i4);
                codePointAt = Character.charCount(codePointAt2);
                String str = null;
                if (f && (codePointAt2 & -4096) == 61440) {
                    codePointAt2 |= 65536;
                }
                if (!e(codePointAt2) || i4 + codePointAt >= length) {
                    boolean z = false;
                } else {
                    i2 = toString.codePointAt(i4 + codePointAt);
                    int charCount2 = Character.charCount(i2);
                    if (f && (i2 & -4096) == 61440) {
                        i2 |= 65536;
                    }
                    int b = b(codePointAt2, i2);
                    if (b > 0) {
                        codePointAt += charCount2;
                        if (i == 0) {
                            i2 = b;
                        }
                    }
                    String a = a(codePointAt2, i2);
                    if (a != null) {
                        codePointAt += charCount2;
                        str = a;
                        i2 = b;
                    } else {
                        str = a;
                        i2 = b;
                    }
                }
                if (i2 == 0 && str == null) {
                    codePointAt2 = a(codePointAt2);
                } else {
                    codePointAt2 = i2;
                }
                if (b(codePointAt2) || str != null) {
                    Drawable a2;
                    if (str == null) {
                        a2 = a(context, codePointAt2);
                    } else {
                        a2 = new be(str);
                    }
                    if (a2 != null) {
                        a2.setBounds(0, 0, (int) am1.a().c((float) a2.getIntrinsicWidth()), (int) am1.a().c((float) a2.getIntrinsicWidth()));
                        ImageSpan imageSpan = new ImageSpan(a2, 0);
                        if (i4 + codePointAt < length) {
                            codePointAt2 = toString.codePointAt(i4 + codePointAt);
                            if (codePointAt2 >= 65024 && codePointAt2 <= 65039) {
                                codePointAt2 = codePointAt + 1;
                                editable.setSpan(imageSpan, i4, i4 + codePointAt2, 33);
                                codePointAt = codePointAt2;
                            }
                        }
                        codePointAt2 = codePointAt;
                        editable.setSpan(imageSpan, i4, i4 + codePointAt2, 33);
                        codePointAt = codePointAt2;
                    }
                }
                codePointAt2 = i4 + codePointAt;
                if (i != 0) {
                    break;
                }
                i4 = codePointAt2;
            }
            c = false;
        }
    }

    private static boolean c(int i) {
        switch (i) {
            case 9745:
            case 9748:
            case 9749:
            case 9757:
            case 57872:
            case 57884:
            case 57885:
            case 57886:
            case 57887:
            case 57888:
            case 57889:
            case 57890:
            case 57891:
            case 57892:
            case 57893:
            case 58634:
            case 58635:
            case 58636:
            case 58637:
            case 58638:
            case 58639:
            case 58640:
            case 58641:
            case 58642:
            case 58643:
            case 58644:
            case 60417:
            case 60418:
            case 60419:
            case 60420:
            case 60421:
            case 60422:
            case 60423:
            case 60424:
            case 60425:
            case 60426:
            case 60427:
            case 60428:
            case 60429:
            case 60430:
            case 60431:
            case 60432:
            case 60433:
            case 60434:
            case 60435:
            case 60436:
            case 60437:
            case 60438:
            case 60439:
            case 127757:
            case 127758:
            case 127760:
            case 127762:
            case 127766:
            case 127767:
            case 127768:
            case 127770:
            case 127772:
            case 127773:
            case 127774:
            case 127794:
            case 127795:
            case 127819:
            case 127824:
            case 127868:
            case 127943:
            case 127945:
            case 127972:
            case 128000:
            case 128001:
            case 128002:
            case 128003:
            case 128004:
            case 128005:
            case 128006:
            case 128007:
            case 128008:
            case 128009:
            case 128010:
            case 128011:
            case 128015:
            case 128016:
            case 128019:
            case 128021:
            case 128022:
            case 128042:
            case 128101:
            case 128108:
            case 128109:
            case 128113:
            case 128114:
            case 128115:
            case 128173:
            case 128182:
            case 128183:
            case 128236:
            case 128237:
            case 128239:
            case 128245:
            case 128256:
            case 128257:
            case 128258:
            case 128260:
            case 128261:
            case 128262:
            case 128263:
            case 128264:
            case 128265:
            case 128277:
            case 128300:
            case 128301:
            case 128348:
            case 128349:
            case 128350:
            case 128351:
            case 128353:
            case 128354:
            case 128355:
            case 128356:
            case 128357:
            case 128358:
            case 128359:
            case 128512:
            case 128519:
            case 128520:
            case 128526:
            case 128528:
            case 128529:
            case 128533:
            case 128535:
            case 128537:
            case 128539:
            case 128543:
            case 128550:
            case 128551:
            case 128556:
            case 128558:
            case 128559:
            case 128564:
            case 128566:
            case 128641:
            case 128642:
            case 128646:
            case 128648:
            case 128650:
            case 128651:
            case 128653:
            case 128654:
            case 128656:
            case 128660:
            case 128662:
            case 128664:
            case 128667:
            case 128668:
            case 128669:
            case 128670:
            case 128671:
            case 128672:
            case 128673:
            case 128675:
            case 128678:
            case 128686:
            case 128687:
            case 128688:
            case 128689:
            case 128691:
            case 128692:
            case 128693:
            case 128695:
            case 128696:
            case 128703:
            case 128705:
            case 128706:
            case 128707:
            case 128708:
            case 128709:
                return false;
            default:
                return true;
        }
    }

    static {
        boolean z = true;
        String[] strArr = new String[60];
        String str = "Y7>8^_):";
        boolean z2 = true;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            int i2;
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 61;
                        break;
                    case ay.f /*1*/:
                        i2 = 69;
                        break;
                    case ay.n /*2*/:
                        i2 = 95;
                        break;
                    case ay.p /*3*/:
                        i2 = 79;
                        break;
                    default:
                        i2 = 63;
                        break;
                }
                cArr[i3] = (char) (i2 ^ c);
            }
            str = new String(cArr).intern();
            switch (z2) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "X(0%VH16#\u0010Z +*RR/6&\\R+=6\\R!:`";
                    i = 2;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "^*2aHU$+<^M5";
                    i = 3;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u007f\u0004";
                    z2 = true;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "n\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "~\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "t\u000b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "v\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "{\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "y\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "g\u0004";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "m\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "h\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "q\u0007";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "~\f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "i\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "u\u000b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "i\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    str = "\u007f\u0000";
                    z2 = true;
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    strArr2 = strArr3;
                    str = "s\t";
                    z2 = true;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "k\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "v\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "~\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "u\u000e";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "|\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "x\u0002";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "n\u0004";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "z\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "|\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "h\u0016";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "x\u0006";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "p\u001d";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "n\u0002";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "z\u0007";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "i\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "t\u0001";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "~\u000b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "p\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "w\n";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "z\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "h\u0004";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "x\u0016";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "y\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "o\u0010";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "u\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "m\u0011";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u007f\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "~\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "w\u0015";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "~\n";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "t\t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "~\u0004";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "s\u0002";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "e\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "|\u0011";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "~\t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "t\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "|\u0010";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "t\u0011";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i] = str;
                    z = strArr3;
                    String str2 = Build.MANUFACTURER;
                    char[] toCharArray2 = "n*16".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (i2 = 0; length2 > i2; i2++) {
                        int i4;
                        char c2 = cArr2[i2];
                        switch (i2 % 5) {
                            case PBE.MD5 /*0*/:
                                i4 = 61;
                                break;
                            case ay.f /*1*/:
                                i4 = 69;
                                break;
                            case ay.n /*2*/:
                                i4 = 95;
                                break;
                            case ay.p /*3*/:
                                i4 = 79;
                                break;
                            default:
                                i4 = 63;
                                break;
                        }
                        cArr2[i2] = (char) (i4 ^ c2);
                    }
                    if (!str2.startsWith(new String(cArr2).intern()) || VERSION.SDK_INT >= 19) {
                        z = false;
                    }
                    f = z;
                    e = new SparseIntArray(900);
                    a = new j();
                    d = new as();
                    b = new b();
                default:
                    strArr2[i] = str;
                    str = "X(\u0000";
                    i = 1;
                    strArr2 = strArr3;
                    z2 = false;
                    break;
            }
        }
    }

    private static boolean e(int i) {
        if (i >= 127462 && i <= 127487) {
            return true;
        }
        switch (i) {
            case vk.SherlockTheme_searchViewSearchIcon /*35*/:
            case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
            case vk.SherlockTheme_windowMinWidthMajor /*49*/:
            case vk.SherlockTheme_windowMinWidthMinor /*50*/:
            case vk.SherlockTheme_dividerVertical /*51*/:
            case vk.SherlockTheme_actionDropDownStyle /*52*/:
            case vk.SherlockTheme_actionButtonStyle /*53*/:
            case vk.SherlockTheme_homeAsUpIndicator /*54*/:
            case vk.SherlockTheme_dropDownListViewStyle /*55*/:
            case vk.SherlockTheme_popupMenuStyle /*56*/:
            case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.lang.CharSequence r12) {
        /*
        r1 = 0;
        r5 = com.whatsapp.util.Log.e;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = r12.length();
        r4 = r1;
    L_0x000d:
        if (r4 >= r7) goto L_0x006c;
    L_0x000f:
        r8 = java.lang.Character.codePointAt(r12, r4);
        r0 = java.lang.Character.charCount(r8);
        r2 = 0;
        r3 = e(r8);
        if (r3 == 0) goto L_0x0077;
    L_0x001e:
        r3 = r4 + r0;
        if (r3 >= r7) goto L_0x0077;
    L_0x0022:
        r3 = r4 + r0;
        r9 = java.lang.Character.codePointAt(r12, r3);
        r3 = b(r8, r9);
        if (r3 <= 0) goto L_0x0035;
    L_0x002e:
        r10 = java.lang.Character.charCount(r9);
        r0 = r0 + r10;
        if (r5 == 0) goto L_0x0073;
    L_0x0035:
        r2 = a(r8, r9);
        if (r2 == 0) goto L_0x0073;
    L_0x003b:
        r9 = java.lang.Character.charCount(r9);
        r0 = r0 + r9;
        r11 = r3;
        r3 = r0;
        r0 = r11;
    L_0x0043:
        if (r0 != 0) goto L_0x004b;
    L_0x0045:
        if (r2 != 0) goto L_0x004b;
    L_0x0047:
        r0 = a(r8);
    L_0x004b:
        r0 = b(r0);
        if (r0 != 0) goto L_0x0053;
    L_0x0051:
        if (r2 == 0) goto L_0x0061;
    L_0x0053:
        r0 = r1;
    L_0x0054:
        if (r0 >= r3) goto L_0x005f;
    L_0x0056:
        r2 = 32;
        r6.append(r2);
        r0 = r0 + 1;
        if (r5 == 0) goto L_0x0054;
    L_0x005f:
        if (r5 == 0) goto L_0x0068;
    L_0x0061:
        r0 = java.lang.Character.toChars(r8);
        r6.append(r0);
    L_0x0068:
        r0 = r4 + r3;
        if (r5 == 0) goto L_0x0071;
    L_0x006c:
        r0 = r6.toString();
        return r0;
    L_0x0071:
        r4 = r0;
        goto L_0x000d;
    L_0x0073:
        r11 = r3;
        r3 = r0;
        r0 = r11;
        goto L_0x0043;
    L_0x0077:
        r3 = r0;
        r0 = r1;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.a5.b(java.lang.CharSequence):java.lang.String");
    }

    public static CharSequence b(String str, Context context, Paint paint) {
        SpannableStringBuilder a = a(str, context, paint);
        return a == null ? str : a;
    }

    private static int a(int i) {
        switch (i) {
            case 169:
                return 57934;
            case 174:
                return 57935;
            case 8482:
                return 58679;
            case 8598:
                return 57911;
            case 8599:
                return 57910;
            case 8600:
                return 57912;
            case 8601:
                return 57913;
            case 9193:
                return 57916;
            case 9194:
                return 57917;
            case 9654:
                return 57914;
            case 9664:
                return 57915;
            case 9728:
                return 57418;
            case 9729:
                return 57417;
            case 9742:
                return 57353;
            case 9748:
                return 57419;
            case 9749:
                return 57413;
            case 9757:
                return 57359;
            case 9786:
                return 58388;
            case 9800:
                return 57919;
            case 9801:
                return 57920;
            case 9802:
                return 57921;
            case 9803:
                return 57922;
            case 9804:
                return 57923;
            case 9805:
                return 57924;
            case 9806:
                return 57925;
            case 9807:
                return 57926;
            case 9808:
                return 57927;
            case 9809:
                return 57928;
            case 9810:
                return 57929;
            case 9811:
                return 57930;
            case 9824:
                return 57870;
            case 9827:
                return 57871;
            case 9829:
                return 57868;
            case 9830:
                return 57869;
            case 9832:
                return 57635;
            case 9855:
                return 57866;
            case 9888:
                return 57938;
            case 9889:
                return 57661;
            case 9917:
                return 57368;
            case 9918:
                return 57366;
            case 9924:
                return 57416;
            case 9934:
                return 57931;
            case 9962:
                return 57399;
            case 9970:
                return 57633;
            case 9971:
                return 57364;
            case 9973:
                return 57372;
            case 9978:
                return 57634;
            case 9981:
                return 57402;
            case 9986:
                return 58131;
            case 9992:
                return 57373;
            case 9994:
                return 57360;
            case 9995:
                return 57362;
            case 9996:
                return 57361;
            case 10024:
                return 58158;
            case 10035:
                return 57862;
            case 10036:
                return 57861;
            case 10060:
                return 58163;
            case 10067:
                return 57376;
            case 10068:
                return 58166;
            case 10069:
                return 58167;
            case 10071:
                return 57377;
            case 10084:
                return 57378;
            case 10145:
                return 57908;
            case 10175:
                return 57873;
            case 11013:
                return 57909;
            case 11014:
                return 57906;
            case 11015:
                return 57907;
            case 11088:
                return 58159;
            case 11093:
                return 58162;
            case 12349:
                return 57644;
            case 12951:
                return 58125;
            case 12953:
                return 58133;
            case 126980:
                return 57645;
            case 127344:
                return 58674;
            case 127345:
                return 58675;
            case 127358:
                return 58677;
            case 127359:
                return 57679;
            case 127374:
                return 58676;
            case 127378:
                return 57876;
            case 127380:
                return 57897;
            case 127381:
                return 57874;
            case 127383:
                return 57933;
            case 127385:
                return 57875;
            case 127386:
                return 57646;
            case 127489:
                return 57859;
            case 127490:
                return 57896;
            case 127514:
                return 57878;
            case 127535:
                return 57900;
            case 127539:
                return 57899;
            case 127541:
                return 57898;
            case 127542:
                return 57877;
            case 127543:
                return 57879;
            case 127544:
                return 57880;
            case 127545:
                return 57895;
            case 127546:
                return 57901;
            case 127568:
                return 57894;
            case 127744:
                return 58435;
            case 127746:
                return 58428;
            case 127747:
                return 58443;
            case 127748:
                return 57421;
            case 127749:
                return 58441;
            case 127750:
                return 57670;
            case 127751:
                return 58442;
            case 127752:
                return 58444;
            case 127754:
                return 58430;
            case 127769:
                return 57420;
            case 127775:
                return 58165;
            case 127796:
                return 58119;
            case 127797:
                return 58120;
            case 127799:
                return 58116;
            case 127800:
                return 57392;
            case 127801:
                return 57394;
            case 127802:
                return 58115;
            case 127803:
                return 58117;
            case 127806:
                return 58436;
            case 127808:
                return 57616;
            case 127809:
                return 57624;
            case 127810:
                return 57625;
            case 127811:
                return 58439;
            case 127813:
                return 58185;
            case 127814:
                return 58186;
            case 127817:
                return 58184;
            case 127818:
                return 58182;
            case 127822:
                return 58181;
            case 127827:
                return 58183;
            case 127828:
                return 57632;
            case 127832:
                return 58173;
            case 127833:
                return 58178;
            case 127834:
                return 58174;
            case 127835:
                return 58177;
            case 127836:
                return 58176;
            case 127837:
                return 58175;
            case 127838:
                return 58169;
            case 127839:
                return 58171;
            case 127841:
                return 58172;
            case 127842:
                return 58179;
            case 127843:
                return 58180;
            case 127846:
                return 58170;
            case 127847:
                return 58431;
            case 127856:
                return 57414;
            case 127857:
                return 58188;
            case 127858:
                return 58189;
            case 127859:
                return 57671;
            case 127860:
                return 57411;
            case 127861:
                return 58168;
            case 127862:
                return 58123;
            case 127864:
                return 57412;
            case 127866:
                return 57415;
            case 127867:
                return 58124;
            case 127872:
                return 58132;
            case 127873:
                return 57618;
            case 127874:
                return 58187;
            case 127875:
                return 58437;
            case 127876:
                return 57395;
            case 127877:
                return 58440;
            case 127878:
                return 57623;
            case 127879:
                return 58432;
            case 127880:
                return 58128;
            case 127881:
                return 58130;
            case 127884:
                return 57667;
            case 127885:
                return 58422;
            case 127886:
                return 58424;
            case 127887:
                return 58427;
            case 127888:
                return 58434;
            case 127889:
                return 58438;
            case 127890:
                return 58426;
            case 127891:
                return 58425;
            case 127905:
                return 57636;
            case 127906:
                return 58419;
            case 127908:
                return 57404;
            case 127909:
                return 57405;
            case 127910:
                return 58631;
            case 127911:
                return 58122;
            case 127912:
                return 58626;
            case 127913:
                return 58627;
            case 127915:
                return 57637;
            case 127916:
                return 58148;
            case 127919:
                return 57648;
            case 127920:
                return 57651;
            case 127921:
                return 58412;
            case 127925:
                return 57406;
            case 127926:
                return 58150;
            case 127927:
                return 57408;
            case 127928:
                return 57409;
            case 127930:
                return 57410;
            case 127934:
                return 57365;
            case 127935:
                return 57363;
            case 127936:
                return 58410;
            case 127937:
                return 57650;
            case 127939:
                return 57621;
            case 127940:
                return 57367;
            case 127942:
                return 57649;
            case 127944:
                return 58411;
            case 127946:
                return 58413;
            case 127968:
                return 57398;
            case 127970:
                return 57400;
            case 127971:
                return 57683;
            case 127973:
                return 57685;
            case 127974:
                return 57677;
            case 127975:
                return 57684;
            case 127976:
                return 57688;
            case 127977:
                return 58625;
            case 127978:
                return 57686;
            case 127979:
                return 57687;
            case 127980:
                return 58628;
            case 127981:
                return 58632;
            case 127983:
                return 58629;
            case 127984:
                return 58630;
            case 128013:
                return 58669;
            case 128014:
                return 57652;
            case 128017:
                return 58665;
            case 128018:
                return 58664;
            case 128020:
                return 58670;
            case 128023:
                return 58671;
            case 128024:
                return 58662;
            case 128025:
                return 57610;
            case 128026:
                return 58433;
            case 128027:
                return 58661;
            case 128031:
                return 57369;
            case 128032:
                return 58658;
            case 128036:
                return 58659;
            case 128038:
                return 58657;
            case 128039:
                return 57429;
            case 128040:
                return 58663;
            case 128043:
                return 58672;
            case 128044:
                return 58656;
            case 128045:
                return 57427;
            case 128046:
                return 58667;
            case 128047:
                return 57424;
            case 128048:
                return 58668;
            case 128049:
                return 57423;
            case 128051:
                return 57428;
            case 128052:
                return 57370;
            case 128053:
                return 57609;
            case 128054:
                return 57426;
            case 128055:
                return 57611;
            case 128056:
                return 58673;
            case 128057:
                return 58660;
            case 128058:
                return 58666;
            case 128059:
                return 57425;
            case 128064:
                return 58393;
            case 128066:
                return 58395;
            case 128067:
                return 58394;
            case 128068:
                return 58396;
            case 128070:
                return 57902;
            case 128071:
                return 57903;
            case 128072:
                return 57904;
            case 128073:
                return 57905;
            case 128074:
                return 57357;
            case 128075:
                return 58398;
            case 128076:
                return 58400;
            case 128077:
                return 57358;
            case 128078:
                return 58401;
            case 128079:
                return 58399;
            case 128080:
                return 58402;
            case 128081:
                return 57614;
            case 128082:
                return 58136;
            case 128084:
                return 58114;
            case 128085:
                return 57350;
            case 128087:
                return 58137;
            case 128088:
                return 58145;
            case 128089:
                return 58146;
            case 128092:
                return 58147;
            case 128095:
                return 57351;
            case 128096:
                return 57662;
            case 128097:
                return 58138;
            case 128098:
                return 58139;
            case 128099:
                return 58678;
            case 128102:
                return 57345;
            case 128103:
                return 57346;
            case 128104:
                return 57348;
            case 128105:
                return 57349;
            case 128107:
                return 58408;
            case 128110:
                return 57682;
            case 128111:
                return 58409;
            case 128113:
                return 58645;
            case 128114:
                return 58646;
            case 128115:
                return 58647;
            case 128116:
                return 58648;
            case 128117:
                return 58649;
            case 128118:
                return 58650;
            case 128119:
                return 58651;
            case 128120:
                return 58652;
            case 128123:
                return 57627;
            case 128124:
                return 57422;
            case 128125:
                return 57612;
            case 128126:
                return 57643;
            case 128127:
                return 57626;
            case 128128:
                return 57628;
            case 128129:
                return 57939;
            case 128130:
                return 58654;
            case 128131:
                return 58655;
            case 128132:
                return 58140;
            case 128133:
                return 58141;
            case 128134:
                return 58142;
            case 128135:
                return 58143;
            case 128136:
                return 58144;
            case 128137:
                return 57659;
            case 128138:
                return 58127;
            case 128139:
                return 57347;
            case 128141:
                return 57396;
            case 128142:
                return 57397;
            case 128143:
                return 57617;
            case 128144:
                return 58118;
            case 128145:
                return 58405;
            case 128146:
                return 58429;
            case 128147:
                return 58151;
            case 128148:
                return 57379;
            case 128151:
                return 58152;
            case 128152:
                return 58153;
            case 128153:
                return 58154;
            case 128154:
                return 58155;
            case 128155:
                return 58156;
            case 128156:
                return 58157;
            case 128157:
                return 58423;
            case 128159:
                return 57860;
            case 128161:
                return 57615;
            case 128162:
                return 58164;
            case 128163:
                return 58129;
            case 128164:
                return 57660;
            case 128166:
                return 58161;
            case 128168:
                return 58160;
            case 128169:
                return 57434;
            case 128170:
                return 57676;
            case 128176:
                return 57647;
            case 128177:
                return 57673;
            case 128185:
                return 57674;
            case 128186:
                return 57631;
            case 128187:
                return 57356;
            case 128188:
                return 57630;
            case 128189:
                return 58134;
            case 128191:
                return 57638;
            case 128192:
                return 57639;
            case 128214:
                return 57672;
            case 128221:
                return 58113;
            case 128224:
                return 57355;
            case 128225:
                return 57675;
            case 128226:
                return 57666;
            case 128227:
                return 58135;
            case 128233:
                return 57603;
            case 128235:
                return 57601;
            case 128238:
                return 57602;
            case 128241:
                return 57354;
            case 128242:
                return 57604;
            case 128243:
                return 57936;
            case 128244:
                return 57937;
            case 128246:
                return 57867;
            case 128247:
                return 57352;
            case 128250:
                return 57642;
            case 128251:
                return 57640;
            case 128252:
                return 57641;
            case 128266:
                return 57665;
            case 128269:
                return 57620;
            case 128273:
                return 57407;
            case 128274:
                return 57668;
            case 128275:
                return 57669;
            case 128276:
                return 58149;
            case 128285:
                return 57932;
            case 128286:
                return 57863;
            case 128293:
                return 57629;
            case 128296:
                return 57622;
            case 128299:
                return 57619;
            case 128303:
                return 57918;
            case 128304:
                return 57865;
            case 128305:
                return 57393;
            case 128306:
                return 57882;
            case 128307:
                return 57883;
            case 128308:
                return 57881;
            case 128336:
                return 57380;
            case 128337:
                return 57381;
            case 128338:
                return 57382;
            case 128339:
                return 57383;
            case 128340:
                return 57384;
            case 128341:
                return 57385;
            case 128342:
                return 57386;
            case 128343:
                return 57387;
            case 128344:
                return 57388;
            case 128345:
                return 57389;
            case 128346:
                return 57390;
            case 128347:
                return 57391;
            case 128507:
                return 57403;
            case 128508:
                return 58633;
            case 128509:
                return 58653;
            case 128513:
                return 58372;
            case 128514:
                return 58386;
            case 128515:
                return 57431;
            case 128516:
                return 58389;
            case 128521:
                return 58373;
            case 128522:
                return 57430;
            case 128524:
                return 58378;
            case 128525:
                return 57606;
            case 128527:
                return 58370;
            case 128530:
                return 58382;
            case 128531:
                return 57608;
            case 128532:
                return 58371;
            case 128534:
                return 58375;
            case 128536:
                return 58392;
            case 128538:
                return 58391;
            case 128540:
                return 57605;
            case 128541:
                return 58377;
            case 128542:
                return 57432;
            case 128544:
                return 57433;
            case 128545:
                return 58390;
            case 128546:
                return 58387;
            case 128547:
                return 58374;
            case 128549:
                return 58369;
            case 128552:
                return 58379;
            case 128554:
                return 58376;
            case 128557:
                return 58385;
            case 128560:
                return 58383;
            case 128561:
                return 57607;
            case 128562:
                return 58384;
            case 128563:
                return 58381;
            case 128567:
                return 58380;
            case 128581:
                return 58403;
            case 128582:
                return 58404;
            case 128583:
                return 58406;
            case 128588:
                return 58407;
            case 128591:
                return 58397;
            case 128640:
                return 57613;
            case 128643:
                return 57374;
            case 128644:
                return 58421;
            case 128645:
                return 57375;
            case 128647:
                return 58420;
            case 128649:
                return 57401;
            case 128652:
                return 57689;
            case 128655:
                return 57680;
            case 128657:
                return 58417;
            case 128658:
                return 58416;
            case 128659:
                return 58418;
            case 128661:
                return 57690;
            case 128663:
                return 57371;
            case 128665:
                return 58414;
            case 128666:
                return 58415;
            case 128674:
                return 57858;
            case 128676:
                return 57653;
            case 128677:
                return 57678;
            case 128679:
                return 57655;
            case 128684:
                return 58126;
            case 128685:
                return 57864;
            case 128690:
                return 57654;
            case 128694:
                return 57857;
            case 128697:
                return 57656;
            case 128698:
                return 57657;
            case 128699:
                return 57681;
            case 128700:
                return 57658;
            case 128701:
                return 57664;
            case 128702:
                return 58121;
            case 128704:
                return 57663;
            default:
                return i;
        }
    }

    public static int d(int i) {
        switch (i) {
            case 57345:
                return 128102;
            case 57346:
                return 128103;
            case 57347:
                return 128139;
            case 57348:
                return 128104;
            case 57349:
                return 128105;
            case 57350:
                return 128085;
            case 57351:
                return 128095;
            case 57352:
                return 128247;
            case 57353:
                return 9742;
            case 57354:
                return 128241;
            case 57355:
                return 128224;
            case 57356:
                return 128187;
            case 57357:
                return 128074;
            case 57358:
                return 128077;
            case 57359:
                return 9757;
            case 57360:
                return 9994;
            case 57361:
                return 9996;
            case 57362:
                return 9995;
            case 57363:
                return 127935;
            case 57364:
                return 9971;
            case 57365:
                return 127934;
            case 57366:
                return 9918;
            case 57367:
                return 127940;
            case 57368:
                return 9917;
            case 57369:
                return 128031;
            case 57370:
                return 128052;
            case 57371:
                return 128663;
            case 57372:
                return 9973;
            case 57373:
                return 9992;
            case 57374:
                return 128643;
            case 57375:
                return 128645;
            case 57376:
                return 10067;
            case 57377:
                return 10071;
            case 57378:
                return 10084;
            case 57379:
                return 128148;
            case 57380:
                return 128336;
            case 57381:
                return 128337;
            case 57382:
                return 128338;
            case 57383:
                return 128339;
            case 57384:
                return 128340;
            case 57385:
                return 128341;
            case 57386:
                return 128342;
            case 57387:
                return 128343;
            case 57388:
                return 128344;
            case 57389:
                return 128345;
            case 57390:
                return 128346;
            case 57391:
                return 128347;
            case 57392:
                return 127800;
            case 57393:
                return 128305;
            case 57394:
                return 127801;
            case 57395:
                return 127876;
            case 57396:
                return 128141;
            case 57397:
                return 128142;
            case 57398:
                return 127968;
            case 57399:
                return 9962;
            case 57400:
                return 127970;
            case 57401:
                return 128649;
            case 57402:
                return 9981;
            case 57403:
                return 128507;
            case 57404:
                return 127908;
            case 57405:
                return 127909;
            case 57406:
                return 127925;
            case 57407:
                return 128273;
            case 57408:
                return 127927;
            case 57409:
                return 127928;
            case 57410:
                return 127930;
            case 57411:
                return 127860;
            case 57412:
                return 127864;
            case 57413:
                return 9749;
            case 57414:
                return 127856;
            case 57415:
                return 127866;
            case 57416:
                return 9924;
            case 57417:
                return 9729;
            case 57418:
                return 9728;
            case 57419:
                return 9748;
            case 57420:
                return 127769;
            case 57421:
                return 127748;
            case 57422:
                return 128124;
            case 57423:
                return 128049;
            case 57424:
                return 128047;
            case 57425:
                return 128059;
            case 57426:
                return 128054;
            case 57427:
                return 128045;
            case 57428:
                return 128051;
            case 57429:
                return 128039;
            case 57430:
                return 128522;
            case 57431:
                return 128515;
            case 57432:
                return 128542;
            case 57433:
                return 128544;
            case 57434:
                return 128169;
            case 57601:
                return 128235;
            case 57602:
                return 128238;
            case 57603:
                return 128233;
            case 57604:
                return 128242;
            case 57605:
                return 128540;
            case 57606:
                return 128525;
            case 57607:
                return 128561;
            case 57608:
                return 128531;
            case 57609:
                return 128053;
            case 57610:
                return 128025;
            case 57611:
                return 128055;
            case 57612:
                return 128125;
            case 57613:
                return 128640;
            case 57614:
                return 128081;
            case 57615:
                return 128161;
            case 57616:
                return 127808;
            case 57617:
                return 128143;
            case 57618:
                return 127873;
            case 57619:
                return 128299;
            case 57620:
                return 128269;
            case 57621:
                return 127939;
            case 57622:
                return 128296;
            case 57623:
                return 127878;
            case 57624:
                return 127809;
            case 57625:
                return 127810;
            case 57626:
                return 128127;
            case 57627:
                return 128123;
            case 57628:
                return 128128;
            case 57629:
                return 128293;
            case 57630:
                return 128188;
            case 57631:
                return 128186;
            case 57632:
                return 127828;
            case 57633:
                return 9970;
            case 57634:
                return 9978;
            case 57635:
                return 9832;
            case 57636:
                return 127905;
            case 57637:
                return 127915;
            case 57638:
                return 128191;
            case 57639:
                return 128192;
            case 57640:
                return 128251;
            case 57641:
                return 128252;
            case 57642:
                return 128250;
            case 57643:
                return 128126;
            case 57644:
                return 12349;
            case 57645:
                return 126980;
            case 57646:
                return 127386;
            case 57647:
                return 128176;
            case 57648:
                return 127919;
            case 57649:
                return 127942;
            case 57650:
                return 127937;
            case 57651:
                return 127920;
            case 57652:
                return 128014;
            case 57653:
                return 128676;
            case 57654:
                return 128690;
            case 57655:
                return 128679;
            case 57656:
                return 128697;
            case 57657:
                return 128698;
            case 57658:
                return 128700;
            case 57659:
                return 128137;
            case 57660:
                return 128164;
            case 57661:
                return 9889;
            case 57662:
                return 128096;
            case 57663:
                return 128704;
            case 57664:
                return 128701;
            case 57665:
                return 128266;
            case 57666:
                return 128226;
            case 57667:
                return 127884;
            case 57668:
                return 128274;
            case 57669:
                return 128275;
            case 57670:
                return 127750;
            case 57671:
                return 127859;
            case 57672:
                return 128214;
            case 57673:
                return 128177;
            case 57674:
                return 128185;
            case 57675:
                return 128225;
            case 57676:
                return 128170;
            case 57677:
                return 127974;
            case 57678:
                return 128677;
            case 57679:
                return 127359;
            case 57680:
                return 128655;
            case 57681:
                return 128699;
            case 57682:
                return 128110;
            case 57683:
                return 127971;
            case 57684:
                return 127975;
            case 57685:
                return 127973;
            case 57686:
                return 127978;
            case 57687:
                return 127979;
            case 57688:
                return 127976;
            case 57689:
                return 128652;
            case 57690:
                return 128661;
            case 57857:
                return 128694;
            case 57858:
                return 128674;
            case 57859:
                return 127489;
            case 57860:
                return 128159;
            case 57861:
                return 10036;
            case 57862:
                return 10035;
            case 57863:
                return 128286;
            case 57864:
                return 128685;
            case 57865:
                return 128304;
            case 57866:
                return 9855;
            case 57867:
                return 128246;
            case 57868:
                return 9829;
            case 57869:
                return 9830;
            case 57870:
                return 9824;
            case 57871:
                return 9827;
            case 57873:
                return 10175;
            case 57874:
                return 127381;
            case 57875:
                return 127385;
            case 57876:
                return 127378;
            case 57877:
                return 127542;
            case 57878:
                return 127514;
            case 57879:
                return 127543;
            case 57880:
                return 127544;
            case 57881:
                return 128308;
            case 57882:
                return 128306;
            case 57883:
                return 128307;
            case 57894:
                return 127568;
            case 57895:
                return 127545;
            case 57896:
                return 127490;
            case 57897:
                return 127380;
            case 57898:
                return 127541;
            case 57899:
                return 127539;
            case 57900:
                return 127535;
            case 57901:
                return 127546;
            case 57902:
                return 128070;
            case 57903:
                return 128071;
            case 57904:
                return 128072;
            case 57905:
                return 128073;
            case 57906:
                return 11014;
            case 57907:
                return 11015;
            case 57908:
                return 10145;
            case 57909:
                return 11013;
            case 57910:
                return 8599;
            case 57911:
                return 8598;
            case 57912:
                return 8600;
            case 57913:
                return 8601;
            case 57914:
                return 9654;
            case 57915:
                return 9664;
            case 57916:
                return 9193;
            case 57917:
                return 9194;
            case 57918:
                return 128303;
            case 57919:
                return 9800;
            case 57920:
                return 9801;
            case 57921:
                return 9802;
            case 57922:
                return 9803;
            case 57923:
                return 9804;
            case 57924:
                return 9805;
            case 57925:
                return 9806;
            case 57926:
                return 9807;
            case 57927:
                return 9808;
            case 57928:
                return 9809;
            case 57929:
                return 9810;
            case 57930:
                return 9811;
            case 57931:
                return 9934;
            case 57932:
                return 128285;
            case 57933:
                return 127383;
            case 57934:
                return 169;
            case 57935:
                return 174;
            case 57936:
                return 128243;
            case 57937:
                return 128244;
            case 57938:
                return 9888;
            case 57939:
                return 128129;
            case 58113:
                return 128221;
            case 58114:
                return 128084;
            case 58115:
                return 127802;
            case 58116:
                return 127799;
            case 58117:
                return 127803;
            case 58118:
                return 128144;
            case 58119:
                return 127796;
            case 58120:
                return 127797;
            case 58121:
                return 128702;
            case 58122:
                return 127911;
            case 58123:
                return 127862;
            case 58124:
                return 127867;
            case 58125:
                return 12951;
            case 58126:
                return 128684;
            case 58127:
                return 128138;
            case 58128:
                return 127880;
            case 58129:
                return 128163;
            case 58130:
                return 127881;
            case 58131:
                return 9986;
            case 58132:
                return 127872;
            case 58133:
                return 12953;
            case 58134:
                return 128189;
            case 58135:
                return 128227;
            case 58136:
                return 128082;
            case 58137:
                return 128087;
            case 58138:
                return 128097;
            case 58139:
                return 128098;
            case 58140:
                return 128132;
            case 58141:
                return 128133;
            case 58142:
                return 128134;
            case 58143:
                return 128135;
            case 58144:
                return 128136;
            case 58145:
                return 128088;
            case 58146:
                return 128089;
            case 58147:
                return 128092;
            case 58148:
                return 127916;
            case 58149:
                return 128276;
            case 58150:
                return 127926;
            case 58151:
                return 128147;
            case 58152:
                return 128151;
            case 58153:
                return 128152;
            case 58154:
                return 128153;
            case 58155:
                return 128154;
            case 58156:
                return 128155;
            case 58157:
                return 128156;
            case 58158:
                return 10024;
            case 58159:
                return 11088;
            case 58160:
                return 128168;
            case 58161:
                return 128166;
            case 58162:
                return 11093;
            case 58163:
                return 10060;
            case 58164:
                return 128162;
            case 58165:
                return 127775;
            case 58166:
                return 10068;
            case 58167:
                return 10069;
            case 58168:
                return 127861;
            case 58169:
                return 127838;
            case 58170:
                return 127846;
            case 58171:
                return 127839;
            case 58172:
                return 127841;
            case 58173:
                return 127832;
            case 58174:
                return 127834;
            case 58175:
                return 127837;
            case 58176:
                return 127836;
            case 58177:
                return 127835;
            case 58178:
                return 127833;
            case 58179:
                return 127842;
            case 58180:
                return 127843;
            case 58181:
                return 127822;
            case 58182:
                return 127818;
            case 58183:
                return 127827;
            case 58184:
                return 127817;
            case 58185:
                return 127813;
            case 58186:
                return 127814;
            case 58187:
                return 127874;
            case 58188:
                return 127857;
            case 58189:
                return 127858;
            case 58369:
                return 128549;
            case 58370:
                return 128527;
            case 58371:
                return 128532;
            case 58372:
                return 128513;
            case 58373:
                return 128521;
            case 58374:
                return 128547;
            case 58375:
                return 128534;
            case 58376:
                return 128554;
            case 58377:
                return 128541;
            case 58378:
                return 128524;
            case 58379:
                return 128552;
            case 58380:
                return 128567;
            case 58381:
                return 128563;
            case 58382:
                return 128530;
            case 58383:
                return 128560;
            case 58384:
                return 128562;
            case 58385:
                return 128557;
            case 58386:
                return 128514;
            case 58387:
                return 128546;
            case 58388:
                return 9786;
            case 58389:
                return 128516;
            case 58390:
                return 128545;
            case 58391:
                return 128538;
            case 58392:
                return 128536;
            case 58393:
                return 128064;
            case 58394:
                return 128067;
            case 58395:
                return 128066;
            case 58396:
                return 128068;
            case 58397:
                return 128591;
            case 58398:
                return 128075;
            case 58399:
                return 128079;
            case 58400:
                return 128076;
            case 58401:
                return 128078;
            case 58402:
                return 128080;
            case 58403:
                return 128581;
            case 58404:
                return 128582;
            case 58405:
                return 128145;
            case 58406:
                return 128583;
            case 58407:
                return 128588;
            case 58408:
                return 128107;
            case 58409:
                return 128111;
            case 58410:
                return 127936;
            case 58411:
                return 127944;
            case 58412:
                return 127921;
            case 58413:
                return 127946;
            case 58414:
                return 128665;
            case 58415:
                return 128666;
            case 58416:
                return 128658;
            case 58417:
                return 128657;
            case 58418:
                return 128659;
            case 58419:
                return 127906;
            case 58420:
                return 128647;
            case 58421:
                return 128644;
            case 58422:
                return 127885;
            case 58423:
                return 128157;
            case 58424:
                return 127886;
            case 58425:
                return 127891;
            case 58426:
                return 127890;
            case 58427:
                return 127887;
            case 58428:
                return 127746;
            case 58429:
                return 128146;
            case 58430:
                return 127754;
            case 58431:
                return 127847;
            case 58432:
                return 127879;
            case 58433:
                return 128026;
            case 58434:
                return 127888;
            case 58435:
                return 127744;
            case 58436:
                return 127806;
            case 58437:
                return 127875;
            case 58438:
                return 127889;
            case 58439:
                return 127811;
            case 58440:
                return 127877;
            case 58441:
                return 127749;
            case 58442:
                return 127751;
            case 58443:
                return 127747;
            case 58444:
                return 127752;
            case 58625:
                return 127977;
            case 58626:
                return 127912;
            case 58627:
                return 127913;
            case 58628:
                return 127980;
            case 58629:
                return 127983;
            case 58630:
                return 127984;
            case 58631:
                return 127910;
            case 58632:
                return 127981;
            case 58633:
                return 128508;
            case 58645:
                return 128113;
            case 58646:
                return 128114;
            case 58647:
                return 128115;
            case 58648:
                return 128116;
            case 58649:
                return 128117;
            case 58650:
                return 128118;
            case 58651:
                return 128119;
            case 58652:
                return 128120;
            case 58653:
                return 128509;
            case 58654:
                return 128130;
            case 58655:
                return 128131;
            case 58656:
                return 128044;
            case 58657:
                return 128038;
            case 58658:
                return 128032;
            case 58659:
                return 128036;
            case 58660:
                return 128057;
            case 58661:
                return 128027;
            case 58662:
                return 128024;
            case 58663:
                return 128040;
            case 58664:
                return 128018;
            case 58665:
                return 128017;
            case 58666:
                return 128058;
            case 58667:
                return 128046;
            case 58668:
                return 128048;
            case 58669:
                return 128013;
            case 58670:
                return 128020;
            case 58671:
                return 128023;
            case 58672:
                return 128043;
            case 58673:
                return 128056;
            case 58674:
                return 127344;
            case 58675:
                return 127345;
            case 58676:
                return 127374;
            case 58677:
                return 127358;
            case 58678:
                return 128099;
            case 58679:
                return 8482;
            default:
                return i;
        }
    }

    public static boolean b(int i) {
        switch (i) {
            case 8252:
            case 8265:
            case 8505:
            case 8596:
            case 8597:
            case 8617:
            case 8618:
            case 8986:
            case 8987:
            case 9195:
            case 9196:
            case 9200:
            case 9203:
            case 9410:
            case 9642:
            case 9643:
            case 9723:
            case 9724:
            case 9725:
            case 9726:
            case 9745:
            case 9851:
            case 9875:
            case 9898:
            case 9899:
            case 9925:
            case 9940:
            case 9989:
            case 9993:
            case 9999:
            case 10002:
            case 10004:
            case 10006:
            case 10052:
            case 10055:
            case 10062:
            case 10133:
            case 10134:
            case 10135:
            case 10160:
            case 10548:
            case 10549:
            case 11035:
            case 11036:
            case 12336:
            case 57345:
            case 57346:
            case 57347:
            case 57348:
            case 57349:
            case 57350:
            case 57351:
            case 57352:
            case 57353:
            case 57354:
            case 57355:
            case 57356:
            case 57357:
            case 57358:
            case 57359:
            case 57360:
            case 57361:
            case 57362:
            case 57363:
            case 57364:
            case 57365:
            case 57366:
            case 57367:
            case 57368:
            case 57369:
            case 57370:
            case 57371:
            case 57372:
            case 57373:
            case 57374:
            case 57375:
            case 57376:
            case 57377:
            case 57378:
            case 57379:
            case 57380:
            case 57381:
            case 57382:
            case 57383:
            case 57384:
            case 57385:
            case 57386:
            case 57387:
            case 57388:
            case 57389:
            case 57390:
            case 57391:
            case 57392:
            case 57393:
            case 57394:
            case 57395:
            case 57396:
            case 57397:
            case 57398:
            case 57399:
            case 57400:
            case 57401:
            case 57402:
            case 57403:
            case 57404:
            case 57405:
            case 57406:
            case 57407:
            case 57408:
            case 57409:
            case 57410:
            case 57411:
            case 57412:
            case 57413:
            case 57414:
            case 57415:
            case 57416:
            case 57417:
            case 57418:
            case 57419:
            case 57420:
            case 57421:
            case 57422:
            case 57423:
            case 57424:
            case 57425:
            case 57426:
            case 57427:
            case 57428:
            case 57429:
            case 57430:
            case 57431:
            case 57432:
            case 57433:
            case 57434:
            case 57601:
            case 57602:
            case 57603:
            case 57604:
            case 57605:
            case 57606:
            case 57607:
            case 57608:
            case 57609:
            case 57610:
            case 57611:
            case 57612:
            case 57613:
            case 57614:
            case 57615:
            case 57616:
            case 57617:
            case 57618:
            case 57619:
            case 57620:
            case 57621:
            case 57622:
            case 57623:
            case 57624:
            case 57625:
            case 57626:
            case 57627:
            case 57628:
            case 57629:
            case 57630:
            case 57631:
            case 57632:
            case 57633:
            case 57634:
            case 57635:
            case 57636:
            case 57637:
            case 57638:
            case 57639:
            case 57640:
            case 57641:
            case 57642:
            case 57643:
            case 57644:
            case 57645:
            case 57646:
            case 57647:
            case 57648:
            case 57649:
            case 57650:
            case 57651:
            case 57652:
            case 57653:
            case 57654:
            case 57655:
            case 57656:
            case 57657:
            case 57658:
            case 57659:
            case 57660:
            case 57661:
            case 57662:
            case 57663:
            case 57664:
            case 57665:
            case 57666:
            case 57667:
            case 57668:
            case 57669:
            case 57670:
            case 57671:
            case 57672:
            case 57673:
            case 57674:
            case 57675:
            case 57676:
            case 57677:
            case 57678:
            case 57679:
            case 57680:
            case 57681:
            case 57682:
            case 57683:
            case 57684:
            case 57685:
            case 57686:
            case 57687:
            case 57688:
            case 57689:
            case 57690:
            case 57857:
            case 57858:
            case 57859:
            case 57860:
            case 57861:
            case 57862:
            case 57863:
            case 57864:
            case 57865:
            case 57866:
            case 57867:
            case 57868:
            case 57869:
            case 57870:
            case 57871:
            case 57872:
            case 57873:
            case 57874:
            case 57875:
            case 57876:
            case 57877:
            case 57878:
            case 57879:
            case 57880:
            case 57881:
            case 57882:
            case 57883:
            case 57884:
            case 57885:
            case 57886:
            case 57887:
            case 57888:
            case 57889:
            case 57890:
            case 57891:
            case 57892:
            case 57893:
            case 57894:
            case 57895:
            case 57896:
            case 57897:
            case 57898:
            case 57899:
            case 57900:
            case 57901:
            case 57902:
            case 57903:
            case 57904:
            case 57905:
            case 57906:
            case 57907:
            case 57908:
            case 57909:
            case 57910:
            case 57911:
            case 57912:
            case 57913:
            case 57914:
            case 57915:
            case 57916:
            case 57917:
            case 57918:
            case 57919:
            case 57920:
            case 57921:
            case 57922:
            case 57923:
            case 57924:
            case 57925:
            case 57926:
            case 57927:
            case 57928:
            case 57929:
            case 57930:
            case 57931:
            case 57932:
            case 57933:
            case 57934:
            case 57935:
            case 57936:
            case 57937:
            case 57938:
            case 57939:
            case 58113:
            case 58114:
            case 58115:
            case 58116:
            case 58117:
            case 58118:
            case 58119:
            case 58120:
            case 58121:
            case 58122:
            case 58123:
            case 58124:
            case 58125:
            case 58126:
            case 58127:
            case 58128:
            case 58129:
            case 58130:
            case 58131:
            case 58132:
            case 58133:
            case 58134:
            case 58135:
            case 58136:
            case 58137:
            case 58138:
            case 58139:
            case 58140:
            case 58141:
            case 58142:
            case 58143:
            case 58144:
            case 58145:
            case 58146:
            case 58147:
            case 58148:
            case 58149:
            case 58150:
            case 58151:
            case 58152:
            case 58153:
            case 58154:
            case 58155:
            case 58156:
            case 58157:
            case 58158:
            case 58159:
            case 58160:
            case 58161:
            case 58162:
            case 58163:
            case 58164:
            case 58165:
            case 58166:
            case 58167:
            case 58168:
            case 58169:
            case 58170:
            case 58171:
            case 58172:
            case 58173:
            case 58174:
            case 58175:
            case 58176:
            case 58177:
            case 58178:
            case 58179:
            case 58180:
            case 58181:
            case 58182:
            case 58183:
            case 58184:
            case 58185:
            case 58186:
            case 58187:
            case 58188:
            case 58189:
            case 58369:
            case 58370:
            case 58371:
            case 58372:
            case 58373:
            case 58374:
            case 58375:
            case 58376:
            case 58377:
            case 58378:
            case 58379:
            case 58380:
            case 58381:
            case 58382:
            case 58383:
            case 58384:
            case 58385:
            case 58386:
            case 58387:
            case 58388:
            case 58389:
            case 58390:
            case 58391:
            case 58392:
            case 58393:
            case 58394:
            case 58395:
            case 58396:
            case 58397:
            case 58398:
            case 58399:
            case 58400:
            case 58401:
            case 58402:
            case 58403:
            case 58404:
            case 58405:
            case 58406:
            case 58407:
            case 58408:
            case 58409:
            case 58410:
            case 58411:
            case 58412:
            case 58413:
            case 58414:
            case 58415:
            case 58416:
            case 58417:
            case 58418:
            case 58419:
            case 58420:
            case 58421:
            case 58422:
            case 58423:
            case 58424:
            case 58425:
            case 58426:
            case 58427:
            case 58428:
            case 58429:
            case 58430:
            case 58431:
            case 58432:
            case 58433:
            case 58434:
            case 58435:
            case 58436:
            case 58437:
            case 58438:
            case 58439:
            case 58440:
            case 58441:
            case 58442:
            case 58443:
            case 58444:
            case 58625:
            case 58626:
            case 58627:
            case 58628:
            case 58629:
            case 58630:
            case 58631:
            case 58632:
            case 58633:
            case 58634:
            case 58635:
            case 58636:
            case 58637:
            case 58638:
            case 58639:
            case 58640:
            case 58641:
            case 58642:
            case 58643:
            case 58644:
            case 58645:
            case 58646:
            case 58647:
            case 58648:
            case 58649:
            case 58650:
            case 58651:
            case 58652:
            case 58653:
            case 58654:
            case 58655:
            case 58656:
            case 58657:
            case 58658:
            case 58659:
            case 58660:
            case 58661:
            case 58662:
            case 58663:
            case 58664:
            case 58665:
            case 58666:
            case 58667:
            case 58668:
            case 58669:
            case 58670:
            case 58671:
            case 58672:
            case 58673:
            case 58674:
            case 58675:
            case 58676:
            case 58677:
            case 58678:
            case 58679:
            case 60417:
            case 60418:
            case 60419:
            case 60420:
            case 60421:
            case 60422:
            case 60423:
            case 60424:
            case 60425:
            case 60426:
            case 60427:
            case 60428:
            case 60429:
            case 60430:
            case 60431:
            case 60432:
            case 60433:
            case 60434:
            case 60435:
            case 60436:
            case 60437:
            case 60438:
            case 60439:
            case 60440:
            case 60441:
            case 60442:
            case 60443:
            case 60444:
            case 60445:
            case 60446:
            case 60447:
            case 60448:
            case 60449:
            case 60450:
            case 60451:
            case 60452:
            case 60453:
            case 60454:
            case 60455:
            case 60456:
            case 60457:
            case 60458:
            case 60459:
            case 60460:
            case 60461:
            case 60462:
            case 127183:
            case 127377:
            case 127379:
            case 127382:
            case 127384:
            case 127538:
            case 127540:
            case 127569:
            case 127745:
            case 127753:
            case 127755:
            case 127756:
            case 127757:
            case 127758:
            case 127759:
            case 127760:
            case 127761:
            case 127762:
            case 127763:
            case 127764:
            case 127765:
            case 127766:
            case 127767:
            case 127768:
            case 127770:
            case 127771:
            case 127772:
            case 127773:
            case 127774:
            case 127776:
            case 127792:
            case 127793:
            case 127794:
            case 127795:
            case 127804:
            case 127805:
            case 127807:
            case 127812:
            case 127815:
            case 127816:
            case 127819:
            case 127820:
            case 127821:
            case 127823:
            case 127824:
            case 127825:
            case 127826:
            case 127829:
            case 127830:
            case 127831:
            case 127840:
            case 127844:
            case 127845:
            case 127848:
            case 127849:
            case 127850:
            case 127851:
            case 127852:
            case 127853:
            case 127854:
            case 127855:
            case 127863:
            case 127865:
            case 127868:
            case 127882:
            case 127883:
            case 127904:
            case 127907:
            case 127914:
            case 127917:
            case 127918:
            case 127922:
            case 127923:
            case 127924:
            case 127929:
            case 127931:
            case 127932:
            case 127933:
            case 127938:
            case 127943:
            case 127945:
            case 127969:
            case 127972:
            case 127982:
            case 128000:
            case 128001:
            case 128002:
            case 128003:
            case 128004:
            case 128005:
            case 128006:
            case 128007:
            case 128008:
            case 128009:
            case 128010:
            case 128011:
            case 128012:
            case 128015:
            case 128016:
            case 128019:
            case 128021:
            case 128022:
            case 128028:
            case 128029:
            case 128030:
            case 128033:
            case 128034:
            case 128035:
            case 128037:
            case 128041:
            case 128042:
            case 128050:
            case 128060:
            case 128061:
            case 128062:
            case 128069:
            case 128083:
            case 128086:
            case 128090:
            case 128091:
            case 128093:
            case 128094:
            case 128100:
            case 128101:
            case 128106:
            case 128108:
            case 128109:
            case 128112:
            case 128121:
            case 128122:
            case 128140:
            case 128149:
            case 128150:
            case 128158:
            case 128160:
            case 128165:
            case 128167:
            case 128171:
            case 128172:
            case 128173:
            case 128174:
            case 128175:
            case 128178:
            case 128179:
            case 128180:
            case 128181:
            case 128182:
            case 128183:
            case 128184:
            case 128190:
            case 128193:
            case 128194:
            case 128195:
            case 128196:
            case 128197:
            case 128198:
            case 128199:
            case 128200:
            case 128201:
            case 128202:
            case 128203:
            case 128204:
            case 128205:
            case 128206:
            case 128207:
            case 128208:
            case 128209:
            case 128210:
            case 128211:
            case 128212:
            case 128213:
            case 128215:
            case 128216:
            case 128217:
            case 128218:
            case 128219:
            case 128220:
            case 128222:
            case 128223:
            case 128228:
            case 128229:
            case 128230:
            case 128231:
            case 128232:
            case 128234:
            case 128236:
            case 128237:
            case 128239:
            case 128240:
            case 128245:
            case 128249:
            case 128256:
            case 128257:
            case 128258:
            case 128259:
            case 128260:
            case 128261:
            case 128262:
            case 128263:
            case 128264:
            case 128265:
            case 128267:
            case 128268:
            case 128270:
            case 128271:
            case 128272:
            case 128277:
            case 128278:
            case 128279:
            case 128280:
            case 128281:
            case 128282:
            case 128283:
            case 128284:
            case 128287:
            case 128288:
            case 128289:
            case 128290:
            case 128291:
            case 128292:
            case 128294:
            case 128295:
            case 128297:
            case 128298:
            case 128300:
            case 128301:
            case 128302:
            case 128309:
            case 128310:
            case 128311:
            case 128312:
            case 128313:
            case 128314:
            case 128315:
            case 128316:
            case 128317:
            case 128348:
            case 128349:
            case 128350:
            case 128351:
            case 128352:
            case 128353:
            case 128354:
            case 128355:
            case 128356:
            case 128357:
            case 128358:
            case 128359:
            case 128510:
            case 128511:
            case 128512:
            case 128517:
            case 128518:
            case 128519:
            case 128520:
            case 128523:
            case 128526:
            case 128528:
            case 128529:
            case 128533:
            case 128535:
            case 128537:
            case 128539:
            case 128543:
            case 128548:
            case 128550:
            case 128551:
            case 128553:
            case 128555:
            case 128556:
            case 128558:
            case 128559:
            case 128564:
            case 128565:
            case 128566:
            case 128568:
            case 128569:
            case 128570:
            case 128571:
            case 128572:
            case 128573:
            case 128574:
            case 128575:
            case 128576:
            case 128584:
            case 128585:
            case 128586:
            case 128587:
            case 128589:
            case 128590:
            case 128641:
            case 128642:
            case 128646:
            case 128648:
            case 128650:
            case 128651:
            case 128653:
            case 128654:
            case 128656:
            case 128660:
            case 128662:
            case 128664:
            case 128667:
            case 128668:
            case 128669:
            case 128670:
            case 128671:
            case 128672:
            case 128673:
            case 128675:
            case 128678:
            case 128680:
            case 128681:
            case 128682:
            case 128683:
            case 128686:
            case 128687:
            case 128688:
            case 128689:
            case 128691:
            case 128692:
            case 128693:
            case 128695:
            case 128696:
            case 128703:
            case 128705:
            case 128706:
            case 128707:
            case 128708:
            case 128709:
                return true;
            default:
                return false;
        }
    }

    public static SpannableStringBuilder a(String str, Context context, Paint paint) {
        return a(str, context, paint, 1.0f);
    }

    public static SpannableStringBuilder a(String str, Context context) {
        return a(str, context, b);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int b(int r2, int r3) {
        /*
        r0 = 127487; // 0x1f1ff float:1.78647E-40 double:6.2987E-319;
        r1 = 127462; // 0x1f1e6 float:1.78612E-40 double:6.29746E-319;
        if (r2 < r1) goto L_0x0020;
    L_0x0008:
        if (r2 > r0) goto L_0x0020;
    L_0x000a:
        if (r3 < r1) goto L_0x0020;
    L_0x000c:
        if (r3 > r0) goto L_0x0020;
    L_0x000e:
        r0 = r2 - r1;
        r0 = r0 + 65;
        r1 = r3 - r1;
        r1 = r1 + 65;
        r0 = r0 << 8;
        r0 = r0 | r1;
        switch(r0) {
            case 16709: goto L_0x009c;
            case 16722: goto L_0x0068;
            case 16724: goto L_0x00b1;
            case 16725: goto L_0x00b6;
            case 16961: goto L_0x00bb;
            case 16965: goto L_0x00c0;
            case 16978: goto L_0x005c;
            case 17217: goto L_0x00a8;
            case 17224: goto L_0x008c;
            case 17225: goto L_0x00c5;
            case 17228: goto L_0x0080;
            case 17229: goto L_0x00ca;
            case 17230: goto L_0x002c;
            case 17231: goto L_0x007c;
            case 17234: goto L_0x00cf;
            case 17477: goto L_0x0030;
            case 17498: goto L_0x00d4;
            case 17731: goto L_0x00d9;
            case 17735: goto L_0x00a4;
            case 17747: goto L_0x0034;
            case 18002: goto L_0x0038;
            case 18242: goto L_0x003c;
            case 18248: goto L_0x00de;
            case 18258: goto L_0x00e3;
            case 18507: goto L_0x0084;
            case 18510: goto L_0x00e8;
            case 18514: goto L_0x00ed;
            case 18756: goto L_0x00ac;
            case 18764: goto L_0x0090;
            case 18766: goto L_0x0054;
            case 18770: goto L_0x00f2;
            case 18772: goto L_0x0040;
            case 19023: goto L_0x00f7;
            case 19024: goto L_0x0044;
            case 19282: goto L_0x0048;
            case 19290: goto L_0x00fc;
            case 19522: goto L_0x0101;
            case 19800: goto L_0x0058;
            case 19801: goto L_0x0074;
            case 20039: goto L_0x0088;
            case 20044: goto L_0x006c;
            case 20549: goto L_0x0106;
            case 20564: goto L_0x010b;
            case 21077: goto L_0x004c;
            case 21313: goto L_0x0060;
            case 21319: goto L_0x0098;
            case 21337: goto L_0x0110;
            case 21576: goto L_0x0094;
            case 21586: goto L_0x0070;
            case 21591: goto L_0x00a0;
            case 21825: goto L_0x0115;
            case 21843: goto L_0x0050;
            case 21849: goto L_0x011a;
            case 22085: goto L_0x0078;
            case 22597: goto L_0x011f;
            case 23105: goto L_0x0064;
            default: goto L_0x001c;
        };
    L_0x001c:
        r0 = com.whatsapp.util.Log.e;
        if (r0 == 0) goto L_0x017e;
    L_0x0020:
        r0 = 8419; // 0x20e3 float:1.1798E-41 double:4.1595E-320;
        if (r3 != r0) goto L_0x017e;
    L_0x0024:
        r0 = 35;
        if (r2 != r0) goto L_0x0124;
    L_0x0028:
        r0 = 57872; // 0xe210 float:8.1096E-41 double:2.85926E-319;
    L_0x002b:
        return r0;
    L_0x002c:
        r0 = 58643; // 0xe513 float:8.2176E-41 double:2.89735E-319;
        goto L_0x002b;
    L_0x0030:
        r0 = 58638; // 0xe50e float:8.217E-41 double:2.8971E-319;
        goto L_0x002b;
    L_0x0034:
        r0 = 58641; // 0xe511 float:8.2174E-41 double:2.89725E-319;
        goto L_0x002b;
    L_0x0038:
        r0 = 58637; // 0xe50d float:8.2168E-41 double:2.89705E-319;
        goto L_0x002b;
    L_0x003c:
        r0 = 58640; // 0xe510 float:8.2172E-41 double:2.8972E-319;
        goto L_0x002b;
    L_0x0040:
        r0 = 58639; // 0xe50f float:8.2171E-41 double:2.89715E-319;
        goto L_0x002b;
    L_0x0044:
        r0 = 58635; // 0xe50b float:8.2165E-41 double:2.89695E-319;
        goto L_0x002b;
    L_0x0048:
        r0 = 58644; // 0xe514 float:8.2178E-41 double:2.8974E-319;
        goto L_0x002b;
    L_0x004c:
        r0 = 58642; // 0xe512 float:8.2175E-41 double:2.8973E-319;
        goto L_0x002b;
    L_0x0050:
        r0 = 58636; // 0xe50c float:8.2167E-41 double:2.897E-319;
        goto L_0x002b;
    L_0x0054:
        r0 = 60417; // 0xec01 float:8.4662E-41 double:2.985E-319;
        goto L_0x002b;
    L_0x0058:
        r0 = 60418; // 0xec02 float:8.4664E-41 double:2.98505E-319;
        goto L_0x002b;
    L_0x005c:
        r0 = 60419; // 0xec03 float:8.4665E-41 double:2.9851E-319;
        goto L_0x002b;
    L_0x0060:
        r0 = 60420; // 0xec04 float:8.4666E-41 double:2.98514E-319;
        goto L_0x002b;
    L_0x0064:
        r0 = 60421; // 0xec05 float:8.4668E-41 double:2.9852E-319;
        goto L_0x002b;
    L_0x0068:
        r0 = 60422; // 0xec06 float:8.4669E-41 double:2.98524E-319;
        goto L_0x002b;
    L_0x006c:
        r0 = 60423; // 0xec07 float:8.467E-41 double:2.9853E-319;
        goto L_0x002b;
    L_0x0070:
        r0 = 60424; // 0xec08 float:8.4672E-41 double:2.98534E-319;
        goto L_0x002b;
    L_0x0074:
        r0 = 60425; // 0xec09 float:8.4673E-41 double:2.9854E-319;
        goto L_0x002b;
    L_0x0078:
        r0 = 60426; // 0xec0a float:8.4675E-41 double:2.98544E-319;
        goto L_0x002b;
    L_0x007c:
        r0 = 60427; // 0xec0b float:8.4676E-41 double:2.9855E-319;
        goto L_0x002b;
    L_0x0080:
        r0 = 60428; // 0xec0c float:8.4678E-41 double:2.98554E-319;
        goto L_0x002b;
    L_0x0084:
        r0 = 60429; // 0xec0d float:8.4679E-41 double:2.9856E-319;
        goto L_0x002b;
    L_0x0088:
        r0 = 60430; // 0xec0e float:8.468E-41 double:2.98564E-319;
        goto L_0x002b;
    L_0x008c:
        r0 = 60431; // 0xec0f float:8.4682E-41 double:2.9857E-319;
        goto L_0x002b;
    L_0x0090:
        r0 = 60432; // 0xec10 float:8.4683E-41 double:2.98574E-319;
        goto L_0x002b;
    L_0x0094:
        r0 = 60433; // 0xec11 float:8.4685E-41 double:2.9858E-319;
        goto L_0x002b;
    L_0x0098:
        r0 = 60434; // 0xec12 float:8.4686E-41 double:2.98584E-319;
        goto L_0x002b;
    L_0x009c:
        r0 = 60435; // 0xec13 float:8.4687E-41 double:2.9859E-319;
        goto L_0x002b;
    L_0x00a0:
        r0 = 60436; // 0xec14 float:8.4689E-41 double:2.98594E-319;
        goto L_0x002b;
    L_0x00a4:
        r0 = 60437; // 0xec15 float:8.469E-41 double:2.986E-319;
        goto L_0x002b;
    L_0x00a8:
        r0 = 60438; // 0xec16 float:8.4692E-41 double:2.98603E-319;
        goto L_0x002b;
    L_0x00ac:
        r0 = 60439; // 0xec17 float:8.4693E-41 double:2.9861E-319;
        goto L_0x002b;
    L_0x00b1:
        r0 = 60440; // 0xec18 float:8.4694E-41 double:2.98613E-319;
        goto L_0x002b;
    L_0x00b6:
        r0 = 60441; // 0xec19 float:8.4696E-41 double:2.9862E-319;
        goto L_0x002b;
    L_0x00bb:
        r0 = 60442; // 0xec1a float:8.4697E-41 double:2.98623E-319;
        goto L_0x002b;
    L_0x00c0:
        r0 = 60443; // 0xec1b float:8.4699E-41 double:2.9863E-319;
        goto L_0x002b;
    L_0x00c5:
        r0 = 60444; // 0xec1c float:8.47E-41 double:2.98633E-319;
        goto L_0x002b;
    L_0x00ca:
        r0 = 60445; // 0xec1d float:8.4701E-41 double:2.9864E-319;
        goto L_0x002b;
    L_0x00cf:
        r0 = 60446; // 0xec1e float:8.4703E-41 double:2.98643E-319;
        goto L_0x002b;
    L_0x00d4:
        r0 = 60447; // 0xec1f float:8.4704E-41 double:2.9865E-319;
        goto L_0x002b;
    L_0x00d9:
        r0 = 60448; // 0xec20 float:8.4706E-41 double:2.98653E-319;
        goto L_0x002b;
    L_0x00de:
        r0 = 60449; // 0xec21 float:8.4707E-41 double:2.9866E-319;
        goto L_0x002b;
    L_0x00e3:
        r0 = 60450; // 0xec22 float:8.4708E-41 double:2.98663E-319;
        goto L_0x002b;
    L_0x00e8:
        r0 = 60451; // 0xec23 float:8.471E-41 double:2.9867E-319;
        goto L_0x002b;
    L_0x00ed:
        r0 = 60452; // 0xec24 float:8.4711E-41 double:2.98673E-319;
        goto L_0x002b;
    L_0x00f2:
        r0 = 60453; // 0xec25 float:8.4713E-41 double:2.98678E-319;
        goto L_0x002b;
    L_0x00f7:
        r0 = 60454; // 0xec26 float:8.4714E-41 double:2.9868E-319;
        goto L_0x002b;
    L_0x00fc:
        r0 = 60455; // 0xec27 float:8.4715E-41 double:2.98687E-319;
        goto L_0x002b;
    L_0x0101:
        r0 = 60456; // 0xec28 float:8.4717E-41 double:2.9869E-319;
        goto L_0x002b;
    L_0x0106:
        r0 = 60457; // 0xec29 float:8.4718E-41 double:2.98697E-319;
        goto L_0x002b;
    L_0x010b:
        r0 = 60458; // 0xec2a float:8.472E-41 double:2.987E-319;
        goto L_0x002b;
    L_0x0110:
        r0 = 60459; // 0xec2b float:8.4721E-41 double:2.98707E-319;
        goto L_0x002b;
    L_0x0115:
        r0 = 60460; // 0xec2c float:8.4723E-41 double:2.9871E-319;
        goto L_0x002b;
    L_0x011a:
        r0 = 60461; // 0xec2d float:8.4724E-41 double:2.98717E-319;
        goto L_0x002b;
    L_0x011f:
        r0 = 60462; // 0xec2e float:8.4725E-41 double:2.9872E-319;
        goto L_0x002b;
    L_0x0124:
        r0 = 49;
        if (r2 != r0) goto L_0x012d;
    L_0x0128:
        r0 = 57884; // 0xe21c float:8.1113E-41 double:2.85985E-319;
        goto L_0x002b;
    L_0x012d:
        r0 = 50;
        if (r2 != r0) goto L_0x0136;
    L_0x0131:
        r0 = 57885; // 0xe21d float:8.1114E-41 double:2.8599E-319;
        goto L_0x002b;
    L_0x0136:
        r0 = 51;
        if (r2 != r0) goto L_0x013f;
    L_0x013a:
        r0 = 57886; // 0xe21e float:8.1116E-41 double:2.85995E-319;
        goto L_0x002b;
    L_0x013f:
        r0 = 52;
        if (r2 != r0) goto L_0x0148;
    L_0x0143:
        r0 = 57887; // 0xe21f float:8.1117E-41 double:2.86E-319;
        goto L_0x002b;
    L_0x0148:
        r0 = 53;
        if (r2 != r0) goto L_0x0151;
    L_0x014c:
        r0 = 57888; // 0xe220 float:8.1118E-41 double:2.86005E-319;
        goto L_0x002b;
    L_0x0151:
        r0 = 54;
        if (r2 != r0) goto L_0x015a;
    L_0x0155:
        r0 = 57889; // 0xe221 float:8.112E-41 double:2.8601E-319;
        goto L_0x002b;
    L_0x015a:
        r0 = 55;
        if (r2 != r0) goto L_0x0163;
    L_0x015e:
        r0 = 57890; // 0xe222 float:8.1121E-41 double:2.86015E-319;
        goto L_0x002b;
    L_0x0163:
        r0 = 56;
        if (r2 != r0) goto L_0x016c;
    L_0x0167:
        r0 = 57891; // 0xe223 float:8.1123E-41 double:2.8602E-319;
        goto L_0x002b;
    L_0x016c:
        r0 = 57;
        if (r2 != r0) goto L_0x0175;
    L_0x0170:
        r0 = 57892; // 0xe224 float:8.1124E-41 double:2.86024E-319;
        goto L_0x002b;
    L_0x0175:
        r0 = 48;
        if (r2 != r0) goto L_0x017e;
    L_0x0179:
        r0 = 57893; // 0xe225 float:8.1125E-41 double:2.8603E-319;
        goto L_0x002b;
    L_0x017e:
        r0 = 0;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.a5.b(int, int):int");
    }
}
