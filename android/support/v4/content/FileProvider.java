package android.support.v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.whatsapp.vk;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class FileProvider extends ContentProvider {
    private static final String[] COLUMNS;
    private static final File DEVICE_ROOT;
    private static HashMap sCache;
    private static final String[] z;
    private PathStrategy mStrategy;

    interface PathStrategy {
        File getFileForUri(Uri uri);
    }

    class SimplePathStrategy implements PathStrategy {
        private static final String[] z;
        private final String mAuthority;
        private final HashMap mRoots;

        static {
            String[] strArr = new String[5];
            String str = "=\u001c5<\u0011\u001e\b+-\u0011\u001d\u0012,yS\u0016]=4A\u0007\u0004";
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
                            i3 = 115;
                            break;
                        case ay.f /*1*/:
                            i3 = 125;
                            break;
                        case ay.n /*2*/:
                            i3 = 88;
                            break;
                        case ay.p /*3*/:
                            i3 = 89;
                            break;
                        default:
                            i3 = 49;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "5\u001c15T\u0017],6\u0011\u0001\u0018+6]\u0005\u0018x:P\u001d\u001260R\u0012\u0011x)P\u0007\u0015x?^\u0001]";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "&\u00139;]\u0016],6\u0011\u0015\u00146=\u0011\u0010\u00126?X\u0014\b*<US\u000f76ES\u001b7+\u0011";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "!\u0018+6]\u0005\u0018<yA\u0012\t0y[\u0006\u0010(<US\u001f= ^\u001d\u0019x:^\u001d\u001b1>D\u0001\u0018<yC\u001c\u0012,";
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "5\u001c15T\u0017],6\u0011\u0001\u0018+6]\u0005\u0018x:P\u001d\u001260R\u0012\u0011x)P\u0007\u0015x?^\u0001]";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public SimplePathStrategy(String str) {
            this.mRoots = new HashMap();
            this.mAuthority = str;
        }

        public void addRoot(String str, File file) {
            try {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException(z[0]);
                }
                try {
                    this.mRoots.put(str, file.getCanonicalFile());
                } catch (Throwable e) {
                    throw new IllegalArgumentException(z[1] + file, e);
                }
            } catch (IOException e2) {
                throw e2;
            }
        }

        public File getFileForUri(Uri uri) {
            boolean z = Loader.a;
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = (File) this.mRoots.get(decode);
            if (file == null) {
                try {
                    throw new IllegalArgumentException(z[3] + uri);
                } catch (IOException e) {
                    throw e;
                }
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                try {
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        try {
                            if (Fragment.a != 0) {
                                Loader.a = !z;
                            }
                            return canonicalFile;
                        } catch (IOException e2) {
                            throw e2;
                        } catch (IOException e22) {
                            throw e22;
                        }
                    }
                    throw new SecurityException(z[4]);
                } catch (IOException e222) {
                    throw e222;
                }
            } catch (IOException e3) {
                throw new IllegalArgumentException(z[2] + file2);
            }
        }
    }

    private static PathStrategy getPathStrategy(Context context, String str) {
        PathStrategy pathStrategy;
        synchronized (sCache) {
            try {
                pathStrategy = (PathStrategy) sCache.get(str);
                if (pathStrategy == null) {
                    pathStrategy = parsePathStrategy(context, str);
                    sCache.put(str, pathStrategy);
                }
            } catch (Throwable e) {
                throw new IllegalArgumentException(z[13], e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException(z[12], e2);
            } catch (Throwable th) {
            }
        }
        return pathStrategy;
    }

    static {
        String[] strArr = new String[24];
        String str = "\u000e\u0013\b[\r\f\u0002\f^\u000b\u0001L\u0017T\u0010\n\u0017UD\u0010\u001d\u0006\u0019Z";
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
                        i4 = 111;
                        break;
                    case ay.f /*1*/:
                        i4 = 99;
                        break;
                    case ay.n /*2*/:
                        i4 = 120;
                        break;
                    case ay.p /*3*/:
                        i4 = 55;
                        break;
                    default:
                        i4 = 100;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "?\u0011\u0017A\r\u000b\u0006\n\u0017\t\u001a\u0010\f\u0017\u0003\u001d\u0002\u0016CD\u001a\u0011\u0011\u0017\u0014\n\u0011\u0015^\u0017\u001c\n\u0017Y\u0017";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\u000e\r\u001cE\u000b\u0006\u0007VD\u0011\u001f\u0013\u0017E\u0010A%1{!03*x2&'=e;?\",\u007f7";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "\u0001\u0002\u0015R";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\t\n\u0014R\u0017B\u0013\u0019C\f";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\f\u0002\u001b_\u0001B\u0013\u0019C\f";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u001d\f\u0017CI\u001f\u0002\f_";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\n\u001b\fR\u0016\u0001\u0002\u0014\u001a\u0014\u000e\u0017\u0010";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u001f\u0002\f_";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\"\n\u000bD\r\u0001\u0004XV\n\u000b\u0011\u0017^\u0000A\u0010\rG\u0014\u0000\u0011\f\u0019\"&/=h4=,.~ *1'g%;++\u0017\t\n\u0017\u0019\u001a\u0000\u000e\u0017\u0019";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "!\fXR\u001c\u001b\u0006\nY\u0005\u0003C\rG\u0000\u000e\u0017\u001dD";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = ")\u0002\u0011[\u0001\u000bC\fXD\u001f\u0002\nD\u0001O\u0002\u0016S\u0016\u0000\n\u001c\u0019\u0017\u001a\u0013\bX\u0016\u001bM>~(*<(e+9*<r6039c,<C\u0015R\u0010\u000eN\u001cV\u0010\u000e";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = ")\u0002\u0011[\u0001\u000bC\fXD\u001f\u0002\nD\u0001O\u0002\u0016S\u0016\u0000\n\u001c\u0019\u0017\u001a\u0013\bX\u0016\u001bM>~(*<(e+9*<r6039c,<C\u0015R\u0010\u000eN\u001cV\u0010\u000e";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "!\fXR\u001c\u001b\u0006\nY\u0005\u0003C\u0011Y\u0017\n\u0011\fD";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "0\u0007\u0011D\u0014\u0003\u0002\u0001h\n\u000e\u000e\u001d";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "0\u0010\u0011M\u0001";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "0\u0007\u0011D\u0014\u0003\u0002\u0001h\n\u000e\u000e\u001d";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "0\u0010\u0011M\u0001";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "\u0018\u0002";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "\u001d\u0014";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "\u001d\u0014\f";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "&\r\u000eV\b\u0006\u0007XZ\u000b\u000b\u0006B\u0017";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "\u0018\u0017";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    strArr = new String[2];
                    str = "0\u0007\u0011D\u0014\u0003\u0002\u0001h\n\u000e\u000e\u001d";
                    i = 23;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    str = "0\u0010\u0011M\u0001";
                    i = 24;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    COLUMNS = strArr3;
                    DEVICE_ROOT = new File("/");
                    sCache = new HashMap();
                default:
                    strArr2[i2] = str;
                    str = "?\u0011\u0017A\r\u000b\u0006\n\u0017\t\u001a\u0010\f\u0017\n\u0000\u0017XU\u0001O\u0006\u0000G\u000b\u001d\u0017\u001dS";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private static File buildPath(File file, String[] strArr) {
        boolean z = Loader.a;
        int length = strArr.length;
        int i = 0;
        File file2 = file;
        while (i < length) {
            String str = strArr[i];
            if (str != null) {
                file2 = new File(file2, str);
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return file2;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.mStrategy.getFileForUri(uri), modeToMode(str));
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i = 0;
        boolean z = Loader.a;
        File fileForUri = this.mStrategy.getFileForUri(uri);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = strArr[i2];
            try {
                int i3;
                if (z[15].equals(obj)) {
                    strArr3[i] = z[17];
                    i3 = i + 1;
                    objArr[i] = fileForUri.getName();
                    if (z) {
                        Fragment.a++;
                    }
                    i = i3;
                    i3 = i2 + 1;
                    if (!z) {
                        break;
                    }
                    i2 = i3;
                } else {
                    i3 = i;
                }
                try {
                } catch (SecurityException e) {
                    throw e;
                }
                if (z[18].equals(obj)) {
                    strArr3[i3] = z[16];
                    i = i3 + 1;
                    objArr[i3] = Long.valueOf(fileForUri.length());
                    i3 = i2 + 1;
                    if (!z) {
                        break;
                    }
                    i2 = i3;
                }
                i = i3;
                i3 = i2 + 1;
                if (!z) {
                    break;
                }
                i2 = i3;
            } catch (SecurityException e2) {
                throw e2;
            }
        }
        String[] copyOf = copyOf(strArr3, i);
        Object[] copyOf2 = copyOf(objArr, i);
        Cursor matrixCursor = new MatrixCursor(copyOf, 1);
        matrixCursor.addRow(copyOf2);
        return matrixCursor;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        try {
            super.attachInfo(context, providerInfo);
            if (providerInfo.exported) {
                throw new SecurityException(z[1]);
            }
            try {
                if (providerInfo.grantUriPermissions) {
                    this.mStrategy = getPathStrategy(context, providerInfo.authority);
                    return;
                }
                throw new SecurityException(z[2]);
            } catch (SecurityException e) {
                throw e;
            }
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    private static Object[] copyOf(Object[] objArr, int i) {
        Object obj = new Object[i];
        System.arraycopy(objArr, 0, obj, 0, i);
        return obj;
    }

    private static String[] copyOf(String[] strArr, int i) {
        Object obj = new Object[i];
        System.arraycopy(strArr, 0, obj, 0, i);
        return obj;
    }

    public String getType(Uri uri) {
        File fileForUri = this.mStrategy.getFileForUri(uri);
        int lastIndexOf = fileForUri.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileForUri.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return z[0];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int modeToMode(java.lang.String r4) {
        /*
        r1 = android.support.v4.content.Loader.a;
        r0 = "r";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x000e;
    L_0x000a:
        r0 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        if (r1 == 0) goto L_0x007d;
    L_0x000e:
        r0 = "w";
        r0 = r0.equals(r4);	 Catch:{ SecurityException -> 0x0075 }
        if (r0 != 0) goto L_0x0022;
    L_0x0016:
        r0 = z;	 Catch:{ SecurityException -> 0x0075 }
        r2 = 23;
        r0 = r0[r2];	 Catch:{ SecurityException -> 0x0075 }
        r0 = r0.equals(r4);	 Catch:{ SecurityException -> 0x0075 }
        if (r0 == 0) goto L_0x0026;
    L_0x0022:
        r0 = 738197504; // 0x2c000000 float:1.8189894E-12 double:3.647180266E-315;
        if (r1 == 0) goto L_0x007d;
    L_0x0026:
        r0 = z;	 Catch:{ SecurityException -> 0x0077 }
        r2 = 19;
        r0 = r0[r2];	 Catch:{ SecurityException -> 0x0077 }
        r0 = r0.equals(r4);	 Catch:{ SecurityException -> 0x0077 }
        if (r0 == 0) goto L_0x0036;
    L_0x0032:
        r0 = 704643072; // 0x2a000000 float:1.1368684E-13 double:3.481399345E-315;
        if (r1 == 0) goto L_0x007d;
    L_0x0036:
        r0 = z;	 Catch:{ SecurityException -> 0x0079 }
        r2 = 20;
        r0 = r0[r2];	 Catch:{ SecurityException -> 0x0079 }
        r0 = r0.equals(r4);	 Catch:{ SecurityException -> 0x0079 }
        if (r0 == 0) goto L_0x0046;
    L_0x0042:
        r0 = 939524096; // 0x38000000 float:3.0517578E-5 double:4.641865793E-315;
        if (r1 == 0) goto L_0x007d;
    L_0x0046:
        r0 = z;	 Catch:{ SecurityException -> 0x007b }
        r2 = 21;
        r0 = r0[r2];	 Catch:{ SecurityException -> 0x007b }
        r0 = r0.equals(r4);	 Catch:{ SecurityException -> 0x007b }
        if (r0 == 0) goto L_0x0056;
    L_0x0052:
        r0 = 1006632960; // 0x3c000000 float:0.0078125 double:4.973427635E-315;
        if (r1 == 0) goto L_0x007d;
    L_0x0056:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ SecurityException -> 0x0073 }
        r1 = new java.lang.StringBuilder;	 Catch:{ SecurityException -> 0x0073 }
        r1.<init>();	 Catch:{ SecurityException -> 0x0073 }
        r2 = z;	 Catch:{ SecurityException -> 0x0073 }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ SecurityException -> 0x0073 }
        r1 = r1.append(r2);	 Catch:{ SecurityException -> 0x0073 }
        r1 = r1.append(r4);	 Catch:{ SecurityException -> 0x0073 }
        r1 = r1.toString();	 Catch:{ SecurityException -> 0x0073 }
        r0.<init>(r1);	 Catch:{ SecurityException -> 0x0073 }
        throw r0;	 Catch:{ SecurityException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.FileProvider.modeToMode(java.lang.String):int");
    }

    public boolean onCreate() {
        return true;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException(z[14]);
    }

    private static PathStrategy parsePathStrategy(Context context, String str) {
        boolean z = Loader.a;
        PathStrategy simplePathStrategy = new SimplePathStrategy(str);
        XmlResourceParser loadXmlMetaData = context.getPackageManager().resolveContentProvider(str, 128).loadXmlMetaData(context.getPackageManager(), z[3]);
        if (loadXmlMetaData == null) {
            try {
                throw new IllegalArgumentException(z[10]);
            } catch (SecurityException e) {
                throw e;
            }
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                break;
            } else if (next == 2) {
                File buildPath;
                String name = loadXmlMetaData.getName();
                String attributeValue = loadXmlMetaData.getAttributeValue(null, z[4]);
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, z[9]);
                if (z[7].equals(name)) {
                    buildPath = buildPath(DEVICE_ROOT, new String[]{attributeValue2});
                } else if (z[5].equals(name)) {
                    buildPath = buildPath(context.getFilesDir(), new String[]{attributeValue2});
                } else if (z[6].equals(name)) {
                    buildPath = buildPath(context.getCacheDir(), new String[]{attributeValue2});
                } else if (z[8].equals(name)) {
                    buildPath = buildPath(Environment.getExternalStorageDirectory(), new String[]{attributeValue2});
                } else {
                    buildPath = null;
                }
                if (buildPath != null) {
                    try {
                        simplePathStrategy.addRoot(attributeValue, buildPath);
                    } catch (SecurityException e2) {
                        throw e2;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        return simplePathStrategy;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException(z[11]);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        try {
            return this.mStrategy.getFileForUri(uri).delete() ? 1 : 0;
        } catch (SecurityException e) {
            throw e;
        }
    }
}
