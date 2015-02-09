package com.whatsapp.contact;

import android.annotation.TargetApi;
import android.content.ContentProvider;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ContactProvider extends ContentProvider {
    public static final String[] a;
    private static final UriMatcher c;
    public static int d;
    public static final Uri e;
    public static final Uri f;
    private static final String[] z;
    private g b;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 31;
                    break;
                case ay.f /*1*/:
                    i2 = 97;
                    break;
                case ay.n /*2*/:
                    i2 = 79;
                    break;
                case ay.p /*3*/:
                    i2 = 19;
                    break;
                default:
                    i2 = 34;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 34);
        }
        return toCharArray;
    }

    public String getType(Uri uri) {
        try {
            switch (c.match(uri)) {
                case ay.f /*1*/:
                    return z[15];
                case ay.n /*2*/:
                    return z[14];
                default:
                    throw new IllegalArgumentException(z[13] + uri);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri insert(android.net.Uri r6, android.content.ContentValues r7) {
        /*
        r5_this = this;
        r2 = 3;
        r0 = 0;
        r4 = 0;
        r1 = c;
        r1 = r1.match(r6);
        if (r1 != r2) goto L_0x0037;
    L_0x000b:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0021 }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x0021 }
        r0 = r7.containsKey(r0);	 Catch:{ IllegalArgumentException -> 0x0021 }
        if (r0 != 0) goto L_0x0023;
    L_0x0016:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0021 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0021 }
        r2 = 6;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0021 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0021 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        r0 = r5.b;
        r1 = new java.io.File;
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r2 = r7.getAsString(r2);
        r1.<init>(r2);
        r0.a(r1);
    L_0x0036:
        return r6;
    L_0x0037:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r7.containsKey(r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r2 == 0) goto L_0x004f;
    L_0x0042:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = 0;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x0077 }
        r0 = r7.getAsBoolean(r0);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r0 = r0.booleanValue();	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x004f:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00af }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00af }
        r7.remove(r2);	 Catch:{ IllegalArgumentException -> 0x00af }
        switch(r1) {
            case 1: goto L_0x0079;
            default: goto L_0x005a;
        };
    L_0x005a:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r6);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        if (r0 == 0) goto L_0x008e;
    L_0x007b:
        r0 = r5.b;
        r0 = r0.getWritableDatabase();
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r0 = r0.replaceOrThrow(r1, r4, r7);
        r2 = d;
        if (r2 == 0) goto L_0x009d;
    L_0x008e:
        r0 = r5.b;
        r0 = r0.getWritableDatabase();
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0 = r0.insertOrThrow(r1, r4, r7);
    L_0x009d:
        r2 = e;
        r6 = android.content.ContentUris.withAppendedId(r2, r0);
        r0 = r5.getContext();
        r0 = r0.getContentResolver();
        r0.notifyChange(r6, r4);
        goto L_0x0036;
    L_0x00af:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.ContactProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    public static boolean a(Uri uri) {
        if (uri != null) {
            try {
                if (TextUtils.equals(uri.getScheme(), z[9])) {
                    if (TextUtils.equals(uri.getAuthority(), z[10])) {
                        return true;
                    }
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        try {
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int update(android.net.Uri r5, android.content.ContentValues r6, java.lang.String r7, java.lang.String[] r8) {
        /*
        r4_this = this;
        r0 = d;
        r1 = c;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r1 = r1.match(r5);	 Catch:{ IllegalArgumentException -> 0x0057 }
        switch(r1) {
            case 1: goto L_0x002a;
            case 2: goto L_0x002c;
            default: goto L_0x000b;
        };
    L_0x000b:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0028 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0028 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0028 }
        r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x0028 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0028 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0028 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        if (r0 == 0) goto L_0x003a;
    L_0x002c:
        r2 = android.content.ContentUris.parseId(r5);
        r7 = r4.a(r7);
        r8 = r4.a(r8, r2);
        if (r0 != 0) goto L_0x000b;
    L_0x003a:
        r0 = r4.b;
        r0 = r0.getWritableDatabase();
        r1 = z;
        r2 = 16;
        r1 = r1[r2];
        r0 = r0.update(r1, r6, r7, r8);
        r1 = r4.getContext();
        r1 = r1.getContentResolver();
        r2 = 0;
        r1.notifyChange(r5, r2);
        return r0;
    L_0x0057:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.ContactProvider.update(android.net.Uri, android.content.ContentValues, java.lang.String, java.lang.String[]):int");
    }

    public boolean onCreate() {
        this.b = new g(getContext());
        return true;
    }

    private String a(String str) {
        try {
            return TextUtils.isEmpty(str) ? z[12] : z[11] + str + ")";
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    @TargetApi(11)
    public void shutdown() {
        super.shutdown();
    }

    private String[] a(String[] strArr, long j) {
        if (strArr == null) {
            try {
                return new String[]{String.valueOf(j)};
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        strArr2[0] = String.valueOf(j);
        return strArr2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r10, java.lang.String[] r11, java.lang.String r12, java.lang.String[] r13, java.lang.String r14) {
        /*
        r9_this = this;
        r5 = 0;
        r8 = d;
        r0 = new android.database.sqlite.SQLiteQueryBuilder;
        r0.<init>();
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x007e }
        r2 = 21;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x007e }
        r0.setTables(r1);	 Catch:{ IllegalArgumentException -> 0x007e }
        r1 = c;	 Catch:{ IllegalArgumentException -> 0x007e }
        r1 = r1.match(r10);	 Catch:{ IllegalArgumentException -> 0x007e }
        switch(r1) {
            case 1: goto L_0x0039;
            case 2: goto L_0x003b;
            default: goto L_0x001a;
        };
    L_0x001a:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0037 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0037 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0037 }
        r1 = r1.append(r10);	 Catch:{ IllegalArgumentException -> 0x0037 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0037 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0037 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0037 }
    L_0x0037:
        r0 = move-exception;
        throw r0;
    L_0x0039:
        if (r8 == 0) goto L_0x005b;
    L_0x003b:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0037 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r3 = 20;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0037 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0037 }
        r2 = android.content.ContentUris.parseId(r10);	 Catch:{ IllegalArgumentException -> 0x0037 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0037 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0037 }
        r0.appendWhere(r1);	 Catch:{ IllegalArgumentException -> 0x0037 }
        if (r8 != 0) goto L_0x001a;
    L_0x005b:
        r1 = r9.b;
        r1 = r1.getReadableDatabase();
        r2 = r11;
        r3 = r12;
        r4 = r13;
        r6 = r5;
        r7 = r14;
        r0 = r0.query(r1, r2, r3, r4, r5, r6, r7);
        r1 = r9.getContext();	 Catch:{ IllegalArgumentException -> 0x0082 }
        r1 = r1.getContentResolver();	 Catch:{ IllegalArgumentException -> 0x0082 }
        r0.setNotificationUri(r1, r10);	 Catch:{ IllegalArgumentException -> 0x0082 }
        r1 = com.whatsapp.DialogToastActivity.i;	 Catch:{ IllegalArgumentException -> 0x0082 }
        if (r1 == 0) goto L_0x007d;
    L_0x0079:
        r1 = r8 + 1;
        d = r1;	 Catch:{ IllegalArgumentException -> 0x0082 }
    L_0x007d:
        return r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0080 }
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0037 }
    L_0x0082:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.ContactProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int delete(android.net.Uri r6, java.lang.String r7, java.lang.String[] r8) {
        /*
        r5_this = this;
        r4 = 0;
        r0 = d;
        r1 = c;	 Catch:{ IllegalArgumentException -> 0x004e }
        r1 = r1.match(r6);	 Catch:{ IllegalArgumentException -> 0x004e }
        switch(r1) {
            case 1: goto L_0x0029;
            case 2: goto L_0x002b;
            case 3: goto L_0x0039;
            default: goto L_0x000c;
        };
    L_0x000c:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 19;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r6);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0029:
        if (r0 == 0) goto L_0x0054;
    L_0x002b:
        r2 = android.content.ContentUris.parseId(r6);
        r7 = r5.a(r7);
        r8 = r5.a(r8, r2);
        if (r0 == 0) goto L_0x0054;
    L_0x0039:
        r0 = r5.b;	 Catch:{ IllegalArgumentException -> 0x0050 }
        r0 = r0.b();	 Catch:{ IllegalArgumentException -> 0x0050 }
        if (r0 == 0) goto L_0x0052;
    L_0x0041:
        r0 = 1;
    L_0x0042:
        r1 = r5.getContext();
        r1 = r1.getContentResolver();
        r1.notifyChange(r6, r4);
    L_0x004d:
        return r0;
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r0 = 0;
        goto L_0x0042;
    L_0x0054:
        r0 = r5.b;
        r0 = r0.getWritableDatabase();
        r1 = z;
        r2 = 18;
        r1 = r1[r2];
        r0 = r0.delete(r1, r7, r8);
        r1 = r5.getContext();
        r1 = r1.getContentResolver();
        r1.notifyChange(r6, r4);
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.ContactProvider.delete(android.net.Uri, java.lang.String, java.lang.String[]):int");
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
    }

    static {
        String[] strArr = new String[23];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "@>&}Qz\u0013;LMm>=vRs\u0000,v}@";
        int i2 = -1;
        while (true) {
            str = z(z(str));
            switch (i2) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "h\u0000\u0010pMq\u0015.pVl";
                    i = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "@>&}Qz\u0013;LMm>=vRs\u0000,v}@";
                    i = 3;
                    strArr2 = strArr3;
                    i2 = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "o\u0000;{";
                    i2 = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "o\u0000;{";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "o\u0000;{\u0002v\u0012or\u0002m\u0004>fKm\u0004+3T~\r:v";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "@>&}Qz\u0013;LMm>=vRs\u0000,v}@";
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "J\u000f$}Mh\u000foFpVA";
                    i2 = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "|\u000e!gGq\u0015";
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "|\u000e\"=Uw\u0000;`Co\u0011acPp\u0017&wGmO,|Lk\u0000,g";
                    i2 = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "@\b+3\u001f?^oRl[Ag";
                    i2 = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "@\b+3\u001f?^";
                    i2 = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "J\u000f$}Mh\u000foFpVA";
                    i2 = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "i\u000f+=Cq\u0005=|K{O,fPl\u000e==Kk\u0004\"<Tq\u0005apMrO8{Ck\u0012.cR1\u0011=|Tv\u0005*a\f|\u000e!gC|\u0015";
                    i2 = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "i\u000f+=Cq\u0005=|K{O,fPl\u000e==Fv\u0013`eL{O,|O1\u0016'rVl\u0000?c\fo\u0013 eK{\u0004==Ap\u000f;rAk";
                    i2 = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "h\u0000\u0010pMq\u0015.pVl";
                    i2 = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "J\u000f$}Mh\u000foFpVA";
                    i2 = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "h\u0000\u0010pMq\u0015.pVl";
                    i2 = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "J\u000f$}Mh\u000foFpVA";
                    i2 = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "@\b+3\u001f?";
                    i2 = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "h\u0000\u0010pMq\u0015.pVl";
                    i2 = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "J\u000f$}Mh\u000foFpVA";
                    i2 = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    z = strArr3;
                    str = "|\u000e!gGq\u0015u<\r|\u000e\"=Uw\u0000;`Co\u0011acPp\u0017&wGmO,|Lk\u0000,g\r|\u000e!gC|\u0015<";
                    i2 = -1;
                    while (true) {
                        str = z(z(str));
                        switch (i2) {
                            case PBE.MD5 /*0*/:
                                f = Uri.parse(str);
                                String[] strArr4 = new String[1];
                                str = "|\u000e:}V7>&w\u000b? \u001c3}|\u000e:}V";
                                i2 = 22;
                                strArr2 = strArr4;
                                strArr3 = strArr4;
                                i = 0;
                                break;
                            default:
                                e = Uri.parse(str);
                                str = "|\u000e!gGq\u0015u<\r|\u000e\"=Uw\u0000;`Co\u0011acPp\u0017&wGmO,|Lk\u0000,g\r|\u000e!gC|\u0015<<F}\u0007&\u007fG";
                                i2 = 0;
                        }
                    }
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    a = strArr3;
                    c = new UriMatcher(-1);
                    UriMatcher uriMatcher = c;
                    str = "|\u000e\"=Uw\u0000;`Co\u0011acPp\u0017&wGmO,|Lk\u0000,g";
                    i2 = -1;
                    while (true) {
                        String z = z(z(str));
                        switch (i2) {
                            case PBE.MD5 /*0*/:
                                str = "|\u000e!gC|\u0015<<\u0001";
                                i2 = 0;
                                break;
                            case ay.f /*1*/:
                                str = "|\u000e!gC|\u0015<<F}\u0007&\u007fG";
                                i2 = 1;
                                break;
                            default:
                                str = "|\u000e!gC|\u0015<";
                                i2 = -1;
                                break;
                        }
                        str = z(z(str));
                        switch (i2) {
                            case PBE.MD5 /*0*/:
                                uriMatcher.addURI(z, str, 2);
                                uriMatcher = c;
                                str = "|\u000e\"=Uw\u0000;`Co\u0011acPp\u0017&wGmO,|Lk\u0000,g";
                                i2 = 1;
                                break;
                            case ay.f /*1*/:
                                uriMatcher.addURI(z, str, 3);
                            default:
                                uriMatcher.addURI(z, str, 1);
                                uriMatcher = c;
                                str = "|\u000e\"=Uw\u0000;`Co\u0011acPp\u0017&wGmO,|Lk\u0000,g";
                                i2 = 0;
                                break;
                        }
                    }
                default:
                    strArr2[i] = str;
                    str = "h\u0000\u0010pMq\u0015.pVl";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }
}
