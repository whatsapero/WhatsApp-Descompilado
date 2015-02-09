package com.whatsapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class _t extends SQLiteOpenHelper {
    private static final String[] z;
    private final Context a;

    static {
        String[] strArr = new String[29];
        String str = "A]4p\u0012SK%F\u000eXKxK\u0003";
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
                        i3 = 54;
                        break;
                    case ay.f /*1*/:
                        i3 = 56;
                        break;
                    case ay.n /*2*/:
                        i3 = 86;
                        break;
                    case ay.p /*3*/:
                        i3 = 47;
                        break;
                    default:
                        i3 = 97;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "A]4\\\u0004EK?@\u000fEL9]\u0004\u0019[9]\u0013CH\"\u0000\u0013SU9Y\bX_";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "A]4\\\u0004EK?@\u000fEL9]\u0004\u0019]8L\u0013OH\"J\u0005\u0019J3B\u000e@Q8H";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "A]4\\\u0004EK?@\u000fEL9]\u0004\u0019K!F\u0015UP?A\u0006\u001bL9\u0002\u0016DQ\"N\u0003Z]";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "A]4\\\u0004EK?@\u000fEL9]\u0004\u0019K\"N\u0002]W J\u0013PT9X\u0004DJ9]";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "PQ:JA_KvJ\u000fUJ/_\u0015S\\";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "A]4\\\u0004EK?@\u000fEL9]\u0004\u0019K\"N\u0002]W J\u0013PT9X\u0004DJ9]NUW$]\u0014FLy]\u0004[W F\u000fQ";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "YV\u0015@\u0013DM&[\bYV";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "CH1]\u0000R]v]\u0004W\\{@\u000fZAvK\u0000BY4N\u0012S";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "A]4\\\u0004EK?@\u000fEL9]\u0004\u0019[9]\u0013CH\"\u0000\u0013SU9Y\bX_";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "PQ:JA_KvJ\u000fUJ/_\u0015S\\";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "YV\u0015@\u0013DM&[\bYV";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "A]4\\\u0004EK?@\u000fEL9]\u0004\u0019K\"N\u0002]W J\u0013PT9X\u0004DJ9]NUW$]\u0014FLy]\u0004[W F\u000fQ";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "A]4\\\u0004EK?@\u000fEL9]\u0004\u0019]8L\u0013OH\"J\u0005\u0019J3B\u000e@Q8H";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "A]4\\\u0004EK?@\u000fEL9]\u0004\u0019K\"N\u0002]W J\u0013PT9X\u0004DJ9]";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "wt\u0002j3\u0016l\u0017m-s\u0018%J\u0012EQ9A\u0012\u0016y\u0012kABQ;J\u000eCLvm.yt\u0013n/";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "A]4\\\u0004EK?@\u000fEL9]\u0004\u0019M&H\u0013W\\3\u000f\u0007DW;\u000f";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0016L9\u000f";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "wt\u0002j3\u0016l\u0017m-s\u0018%J\u0012EQ9A\u0012\u0016y\u0012kAS@&F\u0013WL?@\u000f\u0016q\u0018{$q}\u0004";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "A]4\\\u0004EK?@\u000fEL9]\u0004\u0019M&H\u0013W\\3\u000f\u0014XS8@\u0016X\u00189C\u0005\u0016N3]\u0012_W8";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "uj\u0013n5s\u0018\u0003a(gm\u0013\u000f(x|\u0013wATJ9X\u0012SJ\tF\u0005iQ8K\u0004N\u0018\u0019aAE]%\\\bYV%\u0007\u0003DW!\\\u0004Dg?KH\r";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "uj\u0013n5s\u0018\u0002n#z}v\\\u0004EK?@\u000fE\u0018~p\bR\u0018\u001fa5s\u007f\u0013}Afj\u001fb davd$o\u0018\u0017z5yq\u0018l3su\u0013a5\u001aZ$@\u0016E]$p\bR\u0018\u0002j9b\u0014%J\u0002D]\"\u000f5s`\u0002\u0003\u0015YS3AAb}\u000e{MYKv{$nlzM\u0013YO%J\u0013iL/_\u0004\u0016l\u0013w5\u001aT7[Ad}\u0017cMZW8\u000f3sy\u001a\u0003\u0000U[#]\u0000UAv}$wtz_\rW[3p\u000fWU3\u000f5s`\u0002\u0003\rWK\"p\u0000UL?Y\u0004\u0016q\u0018{$q}\u0004\u0003\u0015_U3@\u0014B\u0018\u0014`.z}\u0017aMS@&F\u0013WL?@\u000f\u0016q\u0018{$q}\u0004\u0006Z";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "rj\u0019\u007fAby\u0014c$\u0016q\u0010\u000f$nq\u0005{2\u0016K3\\\u0012_W8\\";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "A]4\\\u0004EK?@\u000fEL9]\u0004\u0019\\3C\u0004B]{K\u0000BY4N\u0012S";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "A]4\\\u0004EK?@\u000fEL9]\u0004\u0019\\3C\u0004B]{K\u0000BY4N\u0012S\u0017$J\u0012CT\"\u0012DT";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "A]4p\u0012SK%F\u000eXKxK\u0003";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0016L9\u000f";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "A]4\\\u0004EK?@\u000fEL9]\u0004\u0019\\9X\u000fQJ7K\u0004\u0016^$@\f\u0016";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u001bR9Z\u0013XY:";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public SQLiteDatabase getWritableDatabase() {
        int i = App.az;
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w(z[10]);
            a();
            return super.getWritableDatabase();
        } catch (SQLiteException e2) {
            try {
                if (e2.toString().contains(z[11])) {
                    Log.w(z[14]);
                    a();
                    return super.getWritableDatabase();
                }
                throw e2;
            } catch (SQLiteDatabaseCorruptException e3) {
                throw e3;
            }
        } catch (StackOverflowError e4) {
            Log.w(z[15]);
            StackTraceElement[] stackTrace = e4.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (i2 < length) {
                try {
                    if (!stackTrace[i2].getMethodName().equals(z[12])) {
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    Log.w(z[13]);
                    a();
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseCorruptException e32) {
                    throw e32;
                }
            }
            throw e4;
        }
    }

    public SQLiteDatabase getReadableDatabase() {
        int i = App.az;
        try {
            return super.getReadableDatabase();
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w(z[2]);
            a();
            return super.getReadableDatabase();
        } catch (SQLiteException e2) {
            String toString = e2.toString();
            try {
                if (toString.contains(z[6])) {
                    Log.w(z[3]);
                    a();
                    return super.getReadableDatabase();
                }
                try {
                    if (toString.contains(z[9])) {
                        Log.w(z[4]);
                        return getWritableDatabase();
                    }
                    throw e2;
                } catch (SQLiteDatabaseCorruptException e3) {
                    throw e3;
                }
            } catch (SQLiteDatabaseCorruptException e32) {
                throw e32;
            }
        } catch (StackOverflowError e4) {
            Log.w(z[5]);
            StackTraceElement[] stackTrace = e4.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (i2 < length) {
                try {
                    if (!stackTrace[i2].getMethodName().equals(z[8])) {
                        i2++;
                        if (i != 0) {
                            break;
                        }
                    }
                    Log.w(z[7]);
                    a();
                    return super.getReadableDatabase();
                } catch (SQLiteDatabaseCorruptException e322) {
                    throw e322;
                }
            }
            throw e4;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(z[23]);
        sQLiteDatabase.execSQL(z[22]);
        sQLiteDatabase.execSQL(z[21]);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            Log.i(z[17] + i + z[18] + i2);
            switch (i) {
                case ay.f /*1*/:
                    sQLiteDatabase.execSQL(z[16]);
                    sQLiteDatabase.execSQL(z[19]);
                    try {
                        if (App.az != 0) {
                            break;
                        }
                        return;
                    }
            }
            Log.e(z[20]);
            onCreate(sQLiteDatabase);
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        } catch (SQLiteDatabaseCorruptException e2) {
            throw e2;
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.i(z[28] + i + z[27] + i2);
        onCreate(sQLiteDatabase);
    }

    private File b() {
        File c = c();
        return new File(c.getPath(), c.getName() + z[1]);
    }

    _t(Context context) {
        super(context, z[0], null, 2);
        this.a = context;
    }

    private File c() {
        return this.a.getDatabasePath(z[26]);
    }

    boolean a() {
        boolean delete;
        synchronized (this) {
            close();
            Log.i(z[24]);
            delete = c().delete();
            b().delete();
            Log.a(z[25], null, new Object[]{Boolean.valueOf(delete)});
        }
        return delete;
    }
}
