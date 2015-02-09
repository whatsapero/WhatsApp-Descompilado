package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import com.whatsapp.util.b0;
import com.whatsapp.wallpaper.CropImage;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class zv {
    private static final String[] z;

    static {
        String[] strArr = new String[40];
        String str = "rp\u0000\tfy~\u0019TpaoCN\u007fez\u0003S?p|\u0019N~\u007f1?bBTK2wC^Y$kTNO%hE^";
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
                        i3 = 17;
                        break;
                    case ay.f /*1*/:
                        i3 = 31;
                        break;
                    case ay.n /*2*/:
                        i3 = 109;
                        break;
                    case ay.p /*3*/:
                        i3 = 39;
                        break;
                    default:
                        i3 = 17;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "pq\tU~x{CN\u007fez\u0003S?tg\u0019Up?V#nEX^!xX_K(iEB";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "pq\tU~x{CJtuv\f\tprk\u0004H\u007f?V fVT@.fAEJ?b";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "xr\f@t>5";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "~j\u0019Wde";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "`j\bUh";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "pq\tU~x{CN\u007fez\u0003S?p|\u0019N~\u007f1=nRZ";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "rp\u0000\tfy~\u0019TpaoCN\u007fez\u0003S?p|\u0019N~\u007f1>bPC\\%xAYP9h";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "rp\u0000\tfy~\u0019TpaoCN\u007fez\u0003S?p|\u0019N~\u007f1?bBTK2`C^J=xAYP9h";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "|~\u0015ax}z>Nkt";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "b|\fKt";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "pl\u001dBreF";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "am\u0002Ax}z\u0004Iw~0\u000eU~ao\u0005He~0\u0003H<xq\u001dRe<l\u0019UtprM";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "am\u0002Ax}z\u0004Iw~0\u000eU~ao\u0005He~0\u0003He<~\u0003\nx|~\nB1";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "pl\u001dBreG";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "~j\u0019Wde";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    str = "~j\u0019WdeF";
                    obj = 16;
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    strArr2 = strArr3;
                    str = "b|\fKtDo$A_tz\tBu";
                    obj = 17;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "rm\u0002WShP\u0018Sadk>Nkt";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "~j\u0019WdeY\u0002U|pk";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "am\u0002Ax}z\u0004Iw~0\u000eU~ao\u0005He~0\u0003H<u~\u0019F";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "am\u0002Ax}z\u0004Iw~0\u000eU~ao\u0005He~0M";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "~j\u0019WdeG";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "|v\u0003dc~o";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "er\u001dW";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "er\u001dS";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "am\u0002Ax}z\u0004Iw~0\u001eB\u007fuo\u0005He~0\u000eF\u007f\u007fp\u0019\u0007bpi\b\u0007eyj\u0000E";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "am\u0002Ax}z\u0004Iw~0\u001eB\u007fuo\u0005He~";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "am\u0002Ax}z\u0004Iw~0\u001eB\u007fuo\u0005He~";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "am\u0002Ax}z\u0004Iw~0\u001eB\u007fuo\u0005He~0\u000eF\u007f\u007fp\u0019\u0007ut|\u0002Ct1k\u0005R|s";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    str = "er\u001dN";
                    obj = 30;
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    strArr2 = strArr3;
                    str = "am\u0002Ax}z\u0004Iw~0\fDexi\u0004Shcz\u001e\b\u007f~2\u001eWprz";
                    obj = 31;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u007fp@Tap|\b";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "am\u0002Ax}z\u0004Iw~0\fDexi\u0004Shcz\u001e\bwpv\u0001\b}~~\t\nx|~\nB";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u007fp\u0019\np<v\u0000Fvt";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "am\u0002Ax}z\u0004Iw~0\fDexi\u0004Shcz\u001e\bwpv\u0001\b\u007f~k@F<xr\f@t";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "tm\u001fHc<p\u0002J";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "am\u0002Ax}z\u0004Iw~0\fDexi\u0004Shcz\u001e\b~~r@Bccp\u001f";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "xp@Bccp\u001f";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "~j\u0019Wde";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static boolean b(m8 m8Var, Activity activity) {
        Throwable e;
        Throwable th;
        try {
            if (App.a()) {
                try {
                    File a = a();
                    byte[] bArr = new byte[((int) a.length())];
                    new FileInputStream(a).read(bArr);
                    Options options = new Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    options.inSampleSize = Math.min(options.outWidth, options.outHeight) / 96;
                    options.inJustDecodeBounds = false;
                    options.inScaled = false;
                    options.inDither = true;
                    if (VERSION.SDK_INT >= 10) {
                        options.inPreferQualityOverSpeed = true;
                    }
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    if (decodeByteArray != null) {
                        FileInputStream fileInputStream;
                        byte[] bArr2;
                        Config config = decodeByteArray.getConfig();
                        if (config == null) {
                            config = Config.ARGB_8888;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(96, 96, config);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setFilterBitmap(true);
                        paint.setDither(true);
                        canvas.drawBitmap(decodeByteArray, new Rect(0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight()), new Rect(0, 0, 96, 96), paint);
                        decodeByteArray.recycle();
                        Closeable fileOutputStream;
                        try {
                            fileOutputStream = new FileOutputStream(c());
                            if (fileOutputStream != null) {
                                try {
                                    createBitmap.compress(CompressFormat.JPEG, 75, fileOutputStream);
                                } catch (IOException e2) {
                                    throw e2;
                                } catch (IOException e3) {
                                    e = e3;
                                }
                            }
                            b0.a(fileOutputStream);
                        } catch (IOException e4) {
                            e = e4;
                            fileOutputStream = null;
                            try {
                                Log.b(z[27], e);
                                b0.a(fileOutputStream);
                            } catch (Throwable th2) {
                                th = th2;
                                b0.a(fileOutputStream);
                                throw th;
                            }
                            createBitmap.recycle();
                            a = c();
                            fileInputStream = new FileInputStream(a);
                            bArr2 = new byte[((int) a.length())];
                            fileInputStream.read(bArr2);
                            App.a(new a89(m8Var.e, bArr, bArr2));
                            if (App.az == 0) {
                                return true;
                            }
                            App.b(activity.getBaseContext(), (int) R.string.error_load_image, 0);
                            Log.e(z[30]);
                            return false;
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = null;
                            b0.a(fileOutputStream);
                            throw th;
                        }
                        createBitmap.recycle();
                        a = c();
                        fileInputStream = new FileInputStream(a);
                        bArr2 = new byte[((int) a.length())];
                        fileInputStream.read(bArr2);
                        App.a(new a89(m8Var.e, bArr, bArr2));
                        if (App.az == 0) {
                            return true;
                        }
                    }
                    App.b(activity.getBaseContext(), (int) R.string.error_load_image, 0);
                    Log.e(z[30]);
                    return false;
                } catch (IOException e5) {
                    throw e5;
                } catch (Throwable th4) {
                    App.b(activity.getBaseContext(), (int) R.string.error_load_image, 0);
                    Log.b(z[28], th4);
                    return false;
                } catch (IOException e52) {
                    throw e52;
                } catch (Throwable th42) {
                    App.b(activity.getBaseContext(), (int) R.string.error_load_image, 0);
                    Log.b(z[29], th42);
                    return false;
                }
            }
            App.b(activity.getBaseContext(), (int) R.string.coldsync_no_network, 0);
            return false;
        }
    }

    public static void a(m8 m8Var, Activity activity) {
        App.a(new a89(m8Var.e, null, null));
    }

    public static File b() {
        return App.t(z[31]);
    }

    private static void a(Context context, Intent intent, List list) {
        int i = App.az;
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 1) {
            list.add(intent);
            if (i == 0) {
                return;
            }
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = (Intent) intent.clone();
            intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            list.add(intent2);
            if (i != 0) {
                return;
            }
        }
    }

    public static File a() {
        return App.t(z[25]);
    }

    public static void a(Intent intent, m8 m8Var, Activity activity, int i, ho hoVar) {
        int i2 = App.az;
        Uri uri = null;
        if (intent != null) {
            uri = intent.getData();
        }
        if (uri == null) {
            try {
                if (b().exists()) {
                    uri = Uri.fromFile(b());
                }
            } catch (IOException e) {
                throw e;
            }
        }
        a().delete();
        try {
            if (uri != null) {
                try {
                    InputStream openInputStream = App.e.openInputStream(uri);
                    if (openInputStream != null) {
                        Options options = new Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(openInputStream, null, options);
                        openInputStream.close();
                        if (options.outWidth <= 0 || options.outHeight <= 0) {
                            Log.e(z[14] + uri);
                            hoVar.a(R.string.error_file_is_not_a_image);
                            return;
                        } else if (options.outWidth < 192 || options.outHeight < 192) {
                            hoVar.f(String.format(App.aX.a(R.plurals.error_image_dimensions_too_small, 192), new Object[]{Integer.valueOf(192)}));
                            return;
                        } else if (i2 == 0) {
                            Intent intent2 = new Intent(activity, CropImage.class);
                            intent2.putExtra(z[23], 640);
                            intent2.putExtra(z[17], 640);
                            intent2.putExtra(z[24], 192);
                            intent2.putExtra(z[15], 1);
                            intent2.putExtra(z[12], 1);
                            intent2.putExtra(z[11], true);
                            intent2.putExtra(z[18], false);
                            intent2.putExtra(z[19], false);
                            intent2.putExtra(z[10], 61440);
                            intent2.setData(uri);
                            intent2.putExtra(z[16], Uri.fromFile(a()));
                            intent2.putExtra(z[20], CompressFormat.JPEG.toString());
                            activity.startActivityForResult(intent2, i);
                            if (i2 == 0) {
                                return;
                            }
                        }
                    }
                    Log.e(z[13] + uri);
                    hoVar.a(R.string.error_load_image);
                    return;
                } catch (IOException e2) {
                    throw e2;
                } catch (IOException e22) {
                    throw e22;
                } catch (Throwable e3) {
                    Log.b(z[22] + uri, e3);
                    hoVar.a(R.string.error_load_image);
                    return;
                }
            }
            Log.e(z[21]);
            hoVar.a(R.string.error_file_is_not_a_image);
        } catch (IOException e4) {
            throw e4;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.whatsapp.m8 r9, android.app.Activity r10, int r11) {
        /*
        r7 = 0;
        r8 = 0;
        r4 = com.whatsapp.App.az;
        r0 = com.whatsapp.ac.c();
        if (r0 == 0) goto L_0x001f;
    L_0x000a:
        r0 = r9.w();
        if (r0 == 0) goto L_0x001b;
    L_0x0010:
        r0 = 2131624327; // 0x7f0e0187 float:1.887583E38 double:1.05316235E-314;
    L_0x0013:
        r0 = r10.getString(r0);
        com.whatsapp.App.b(r10, r0, r8);
    L_0x001a:
        return;
    L_0x001b:
        r0 = 2131624330; // 0x7f0e018a float:1.8875837E38 double:1.0531623513E-314;
        goto L_0x0013;
    L_0x001f:
        r5 = new android.content.Intent;
        r0 = z;
        r1 = 7;
        r0 = r0[r1];
        r1 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI;
        r5.<init>(r0, r1);
        r0 = z;
        r1 = 4;
        r0 = r0[r1];
        r5.setType(r0);
        r0 = b();
        r0.delete();
        r0 = b();
        r0 = android.net.Uri.fromFile(r0);
        r1 = new android.content.Intent;
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1.<init>(r2);
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r3 = r1.putExtra(r2, r0);
        r1 = new android.content.Intent;
        r2 = z;
        r6 = 8;
        r2 = r2[r6];
        r1.<init>(r2);
        r2 = z;
        r6 = 5;
        r2 = r2[r6];
        r0 = r1.putExtra(r2, r0);
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r2 = r9.N;
        r2 = r0.putExtra(r1, r2);
        r0 = r9.w();
        if (r0 == 0) goto L_0x008e;
    L_0x007a:
        r1 = new android.content.Intent;
        r0 = z;
        r6 = 9;
        r0 = r0[r6];
        r1.<init>(r0, r7);
        r0 = 2131624430; // 0x7f0e01ee float:1.887604E38 double:1.0531624007E-314;
        r0 = r10.getString(r0);
        if (r4 == 0) goto L_0x009e;
    L_0x008e:
        r1 = new android.content.Intent;
        r0 = z;
        r0 = r0[r8];
        r1.<init>(r0, r7);
        r0 = 2131624695; // 0x7f0e02f7 float:1.8876577E38 double:1.0531625316E-314;
        r0 = r10.getString(r0);
    L_0x009e:
        r6 = new java.util.ArrayList;
        r6.<init>();
        r7 = r9.a();
        r7 = r7.exists();
        if (r7 == 0) goto L_0x00be;
    L_0x00ad:
        a(r10, r5, r6);
        a(r10, r3, r6);
        r7 = r9.w();
        if (r7 == 0) goto L_0x00d0;
    L_0x00b9:
        r6.add(r2);
        if (r4 == 0) goto L_0x00d0;
    L_0x00be:
        r1 = r9.w();
        if (r1 == 0) goto L_0x00cc;
    L_0x00c4:
        a(r10, r5, r6);
        a(r10, r3, r6);
        if (r4 == 0) goto L_0x00ef;
    L_0x00cc:
        a(r10, r5, r6);
        r1 = r3;
    L_0x00d0:
        r1 = android.content.Intent.createChooser(r1, r0);
        r0 = r6.isEmpty();
        if (r0 != 0) goto L_0x00ea;
    L_0x00da:
        r0 = z;
        r2 = 2;
        r2 = r0[r2];
        r0 = new android.content.Intent[r8];
        r0 = r6.toArray(r0);
        r0 = (android.os.Parcelable[]) r0;
        r1.putExtra(r2, r0);
    L_0x00ea:
        r10.startActivityForResult(r1, r11);
        goto L_0x001a;
    L_0x00ef:
        r1 = r2;
        goto L_0x00d0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.zv.a(com.whatsapp.m8, android.app.Activity, int):void");
    }

    public static File c() {
        return App.t(z[26]);
    }

    public static void a(Intent intent, ho hoVar) {
        int i = App.az;
        if (intent.getBooleanExtra(z[37], false)) {
            Log.e(z[38]);
            App.a(hoVar, App.p.getString(R.string.error_out_of_memory));
            if (i == 0) {
                return;
            }
        }
        if (intent.getBooleanExtra(z[33], false)) {
            Log.e(z[32]);
            App.a(hoVar, App.p.getString(R.string.error_no_disc_space));
            if (i == 0) {
                return;
            }
        }
        if (intent.getBooleanExtra(z[39], false)) {
            Log.e(z[34]);
            App.a(hoVar, App.p.getString(R.string.error_load_image));
            if (i == 0) {
                return;
            }
        }
        if (intent.getBooleanExtra(z[35], false)) {
            Log.e(z[36]);
            App.a(hoVar, App.p.getString(R.string.error_file_is_not_a_image));
        }
    }
}
