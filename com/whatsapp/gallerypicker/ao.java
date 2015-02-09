package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ao {
    public static final String a;
    public static final String b;
    private static final String[] z;

    public static p c() {
        p pVar = new p();
        pVar.a = true;
        return pVar;
    }

    private static boolean b() {
        String str = Environment.getExternalStorageDirectory().toString() + z[5];
        File file = new File(str);
        try {
            if (!file.isDirectory() && !file.mkdirs()) {
                return false;
            }
            file = new File(str, z[6]);
            try {
                if (file.exists()) {
                    file.delete();
                }
                if (!file.createNewFile()) {
                    return false;
                }
                file.delete();
                return true;
            } catch (IOException e) {
                throw e;
            } catch (IOException e2) {
                return false;
            }
        } catch (IOException e3) {
            throw e3;
        } catch (IOException e32) {
            throw e32;
        }
    }

    static {
        String[] strArr = new String[7];
        String str = "\u001e&.\u0018wG";
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
                        i3 = 104;
                        break;
                    case ay.f /*1*/:
                        i3 = 79;
                        break;
                    case ay.n /*2*/:
                        i3 = 74;
                        break;
                    case ay.p /*3*/:
                        i3 = 125;
                        break;
                    default:
                        i3 = 24;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0005 ?\u0013l\r+";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\r7>\u0018j\u0006.&";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u001e &\bu\r";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "G\u000b\t4U";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "F?8\u0012z\r";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    StringBuilder append = new StringBuilder().append(Environment.getExternalStorageDirectory().toString());
                    char[] toCharArray2 = "G\u000b\t4UG\f+\u0010}\u001a.".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (int i4 = 0; length2 > i4; i4++) {
                        int i5;
                        char c2 = cArr2[i4];
                        switch (i4 % 5) {
                            case PBE.MD5 /*0*/:
                                i5 = 104;
                                break;
                            case ay.f /*1*/:
                                i5 = 79;
                                break;
                            case ay.n /*2*/:
                                i5 = 74;
                                break;
                            case ay.p /*3*/:
                                i5 = 125;
                                break;
                            default:
                                i5 = 24;
                                break;
                        }
                        cArr2[i4] = (char) (i5 ^ c2);
                    }
                    a = append.append(new String(cArr2).intern()).toString();
                    b = a(a);
                default:
                    strArr2[i] = str;
                    str = "\u0005 ?\u0013l\r+\u0015\u000fw";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static boolean a(boolean z) {
        String externalStorageState = Environment.getExternalStorageState();
        try {
            if (z[2].equals(externalStorageState)) {
                return z ? b() : true;
            } else {
                if (!z) {
                    try {
                        if (z[1].equals(externalStorageState)) {
                            return true;
                        }
                    } catch (UnsupportedOperationException e) {
                        throw e;
                    }
                }
                return false;
            }
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }

    public static boolean a(aw awVar) {
        return b(awVar.d());
    }

    public static boolean b(String str) {
        return str == null ? false : str.startsWith(z[0]);
    }

    private static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursor = null;
        if (contentResolver != null) {
            try {
                cursor = contentResolver.query(uri, strArr, str, strArr2, str2);
            } catch (UnsupportedOperationException e) {
            }
        }
        return cursor;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.gallerypicker.v a(android.content.ContentResolver r9, com.whatsapp.gallerypicker.p r10) {
        /*
        r8 = 0;
        r1 = com.whatsapp.gallerypicker.ImagePreview.y;
        r0 = r10.b;
        r2 = r10.d;
        r3 = r10.c;
        r4 = r10.e;
        r5 = r10.f;
        r6 = r10.a;
        if (r6 != 0) goto L_0x0013;
    L_0x0011:
        if (r9 != 0) goto L_0x001c;
    L_0x0013:
        r0 = new com.whatsapp.gallerypicker.bf;	 Catch:{ UnsupportedOperationException -> 0x001a }
        r1 = 0;
        r0.<init>(r1);	 Catch:{ UnsupportedOperationException -> 0x001a }
    L_0x0019:
        return r0;
    L_0x001a:
        r0 = move-exception;
        throw r0;
    L_0x001c:
        if (r5 == 0) goto L_0x0026;
    L_0x001e:
        r0 = new com.whatsapp.gallerypicker.az;	 Catch:{ UnsupportedOperationException -> 0x0024 }
        r0.<init>(r9, r5);	 Catch:{ UnsupportedOperationException -> 0x0024 }
        goto L_0x0019;
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r5 = a(r8);
        r6 = new java.util.ArrayList;
        r6.<init>();
        if (r5 == 0) goto L_0x0051;
    L_0x0031:
        r5 = com.whatsapp.gallerypicker.bq.INTERNAL;	 Catch:{ UnsupportedOperationException -> 0x0093 }
        if (r0 == r5) goto L_0x0051;
    L_0x0035:
        r5 = r2 & 1;
        if (r5 == 0) goto L_0x0043;
    L_0x0039:
        r5 = new com.whatsapp.gallerypicker.a6;	 Catch:{ UnsupportedOperationException -> 0x0095 }
        r7 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;	 Catch:{ UnsupportedOperationException -> 0x0095 }
        r5.<init>(r9, r7, r3, r4);	 Catch:{ UnsupportedOperationException -> 0x0095 }
        r6.add(r5);	 Catch:{ UnsupportedOperationException -> 0x0095 }
    L_0x0043:
        r5 = r2 & 4;
        if (r5 == 0) goto L_0x0051;
    L_0x0047:
        r5 = new com.whatsapp.gallerypicker.ar;	 Catch:{ UnsupportedOperationException -> 0x0097 }
        r7 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI;	 Catch:{ UnsupportedOperationException -> 0x0097 }
        r5.<init>(r9, r7, r3, r4);	 Catch:{ UnsupportedOperationException -> 0x0097 }
        r6.add(r5);	 Catch:{ UnsupportedOperationException -> 0x0097 }
    L_0x0051:
        r5 = com.whatsapp.gallerypicker.bq.INTERNAL;	 Catch:{ UnsupportedOperationException -> 0x0099 }
        if (r0 == r5) goto L_0x0059;
    L_0x0055:
        r5 = com.whatsapp.gallerypicker.bq.ALL;	 Catch:{ UnsupportedOperationException -> 0x009b }
        if (r0 != r5) goto L_0x0067;
    L_0x0059:
        r0 = r2 & 1;
        if (r0 == 0) goto L_0x0067;
    L_0x005d:
        r0 = new com.whatsapp.gallerypicker.a6;	 Catch:{ UnsupportedOperationException -> 0x009d }
        r2 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI;	 Catch:{ UnsupportedOperationException -> 0x009d }
        r0.<init>(r9, r2, r3, r4);	 Catch:{ UnsupportedOperationException -> 0x009d }
        r6.add(r0);	 Catch:{ UnsupportedOperationException -> 0x009d }
    L_0x0067:
        r2 = r6.iterator();
    L_0x006b:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0085;
    L_0x0071:
        r0 = r2.next();
        r0 = (com.whatsapp.gallerypicker.aq) r0;
        r4 = r0.a();	 Catch:{ UnsupportedOperationException -> 0x009f }
        if (r4 == 0) goto L_0x0083;
    L_0x007d:
        r0.e();	 Catch:{ UnsupportedOperationException -> 0x009f }
        r2.remove();	 Catch:{ UnsupportedOperationException -> 0x009f }
    L_0x0083:
        if (r1 == 0) goto L_0x006b;
    L_0x0085:
        r0 = r6.size();
        r1 = 1;
        if (r0 != r1) goto L_0x00a1;
    L_0x008c:
        r0 = r6.get(r8);
        r0 = (com.whatsapp.gallerypicker.aq) r0;
        goto L_0x0019;
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0095 }
    L_0x0095:
        r0 = move-exception;
        throw r0;
    L_0x0097:
        r0 = move-exception;
        throw r0;
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x009b }
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r1 = new com.whatsapp.gallerypicker.bt;
        r0 = r6.size();
        r0 = new com.whatsapp.gallerypicker.v[r0];
        r0 = r6.toArray(r0);
        r0 = (com.whatsapp.gallerypicker.v[]) r0;
        r1.<init>(r0, r3);
        r0 = r1;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ao.a(android.content.ContentResolver, com.whatsapp.gallerypicker.p):com.whatsapp.gallerypicker.v");
    }

    public static boolean a(ContentResolver contentResolver) {
        Cursor a = a(contentResolver, MediaStore.getMediaScannerUri(), new String[]{z[4]}, null, null, null);
        if (a == null) {
            return false;
        }
        try {
            boolean equals;
            if (a.getCount() == 1) {
                a.moveToFirst();
                equals = z[3].equals(a.getString(0));
            } else {
                equals = false;
            }
            a.close();
            return equals;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public static v a(ContentResolver contentResolver, bq bqVar, int i, int i2, String str) {
        return a(contentResolver, a(bqVar, i, i2, str));
    }

    public static String a(String str) {
        return String.valueOf(str.toLowerCase().hashCode());
    }

    public static p a(bq bqVar, int i, int i2, String str) {
        p pVar = new p();
        pVar.b = bqVar;
        pVar.d = i;
        pVar.c = i2;
        pVar.e = str;
        return pVar;
    }

    public static v a() {
        return a(null, c());
    }
}
