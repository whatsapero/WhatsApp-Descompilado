package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.jo;
import com.whatsapp.vk;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.ay;

public final class GooglePlayServicesUtil {
    public static boolean Jg;
    public static boolean Jh;
    private static int Ji;
    private static final Object Jj;
    public static int a;

    static {
        Jg = false;
        Jh = false;
        Ji = -1;
        Jj = new Object();
    }

    private static void D(Context context) {
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable e) {
            Log.wtf("GooglePlayServicesUtil", "This should never happen.", e);
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            int i = bundle.getInt("com.google.android.gms.version");
            if (i != 6587000) {
                throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 6587000 but found " + i + ".  You must have the" + " following declaration within the <application> element: " + "    <meta-data android:name=\"" + "com.google.android.gms.version" + "\" android:value=\"@integer/google_play_services_version\" />");
            }
            return;
        }
        throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.app.Dialog a(int r5, android.app.Activity r6, android.support.v4.app.Fragment r7, int r8, android.content.DialogInterface.OnCancelListener r9) {
        /*
        r1 = 0;
        r0 = com.google.android.gms.internal.lc.K(r6);	 Catch:{ IllegalStateException -> 0x008b }
        if (r0 == 0) goto L_0x000c;
    L_0x0007:
        r0 = 2;
        if (r5 != r0) goto L_0x000c;
    L_0x000a:
        r5 = 42;
    L_0x000c:
        r0 = com.google.android.gms.internal.ll.ij();
        if (r0 == 0) goto L_0x0123;
    L_0x0012:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r2 = r6.getTheme();
        r3 = 16843529; // 0x1010309 float:2.3695736E-38 double:8.321809E-317;
        r4 = 1;
        r2.resolveAttribute(r3, r0, r4);
        r2 = r6.getResources();
        r0 = r0.resourceId;
        r0 = r2.getResourceEntryName(r0);
        r2 = "Theme.Dialog.Alert";
        r0 = r2.equals(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x0034:
        r0 = new android.app.AlertDialog$Builder;
        r2 = 5;
        r0.<init>(r6, r2);
    L_0x003a:
        if (r0 != 0) goto L_0x0120;
    L_0x003c:
        r0 = new android.app.AlertDialog$Builder;
        r0.<init>(r6);
        r2 = r0;
    L_0x0042:
        r0 = b(r6, r5);	 Catch:{ IllegalStateException -> 0x008d }
        r2.setMessage(r0);	 Catch:{ IllegalStateException -> 0x008d }
        if (r9 == 0) goto L_0x004e;
    L_0x004b:
        r2.setOnCancelListener(r9);	 Catch:{ IllegalStateException -> 0x008d }
    L_0x004e:
        r3 = aj(r5);
        if (r7 != 0) goto L_0x005d;
    L_0x0054:
        r0 = new com.google.android.gms.internal.jh;
        r0.<init>(r6, r3, r8);
        r4 = a;
        if (r4 == 0) goto L_0x0062;
    L_0x005d:
        r0 = new com.google.android.gms.internal.jh;
        r0.<init>(r7, r3, r8);
    L_0x0062:
        r3 = c(r6, r5);
        if (r3 == 0) goto L_0x006b;
    L_0x0068:
        r2.setPositiveButton(r3, r0);	 Catch:{ IllegalStateException -> 0x008f }
    L_0x006b:
        switch(r5) {
            case 0: goto L_0x0091;
            case 1: goto L_0x0098;
            case 2: goto L_0x00ae;
            case 3: goto L_0x00a3;
            case 4: goto L_0x0093;
            case 5: goto L_0x0100;
            case 6: goto L_0x0093;
            case 7: goto L_0x00d6;
            case 8: goto L_0x00e8;
            case 9: goto L_0x00c4;
            case 10: goto L_0x00f4;
            case 11: goto L_0x0113;
            case 42: goto L_0x00b9;
            default: goto L_0x006e;
        };
    L_0x006e:
        r0 = "GooglePlayServicesUtil";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = "Unexpected error code ";
        r1 = r1.append(r3);
        r1 = r1.append(r5);
        r1 = r1.toString();
        android.util.Log.e(r0, r1);
        r0 = r2.create();
    L_0x008a:
        return r0;
    L_0x008b:
        r0 = move-exception;
        throw r0;
    L_0x008d:
        r0 = move-exception;
        throw r0;
    L_0x008f:
        r0 = move-exception;
        throw r0;
    L_0x0091:
        r0 = r1;
        goto L_0x008a;
    L_0x0093:
        r0 = r2.create();
        goto L_0x008a;
    L_0x0098:
        r0 = common_google_play_services_install_title;
        r0 = r2.setTitle(r0);
        r0 = r0.create();
        goto L_0x008a;
    L_0x00a3:
        r0 = common_google_play_services_enable_title;
        r0 = r2.setTitle(r0);
        r0 = r0.create();
        goto L_0x008a;
    L_0x00ae:
        r0 = common_google_play_services_update_title;
        r0 = r2.setTitle(r0);
        r0 = r0.create();
        goto L_0x008a;
    L_0x00b9:
        r0 = common_android_wear_update_title;
        r0 = r2.setTitle(r0);
        r0 = r0.create();
        goto L_0x008a;
    L_0x00c4:
        r0 = "GooglePlayServicesUtil";
        r1 = "Google Play services is invalid. Cannot recover.";
        android.util.Log.e(r0, r1);
        r0 = common_google_play_services_unsupported_title;
        r0 = r2.setTitle(r0);
        r0 = r0.create();
        goto L_0x008a;
    L_0x00d6:
        r0 = "GooglePlayServicesUtil";
        r1 = "Network error occurred. Please retry request later.";
        android.util.Log.e(r0, r1);
        r0 = common_google_play_services_network_error_title;
        r0 = r2.setTitle(r0);
        r0 = r0.create();
        goto L_0x008a;
    L_0x00e8:
        r0 = "GooglePlayServicesUtil";
        r1 = "Internal error occurred. Please see logs for detailed information";
        android.util.Log.e(r0, r1);
        r0 = r2.create();
        goto L_0x008a;
    L_0x00f4:
        r0 = "GooglePlayServicesUtil";
        r1 = "Developer error occurred. Please see logs for detailed information";
        android.util.Log.e(r0, r1);
        r0 = r2.create();
        goto L_0x008a;
    L_0x0100:
        r0 = "GooglePlayServicesUtil";
        r1 = "An invalid account was specified when connecting. Please provide a valid account.";
        android.util.Log.e(r0, r1);
        r0 = common_google_play_services_invalid_account_title;
        r0 = r2.setTitle(r0);
        r0 = r0.create();
        goto L_0x008a;
    L_0x0113:
        r0 = "GooglePlayServicesUtil";
        r1 = "The application is not licensed to the user.";
        android.util.Log.e(r0, r1);
        r0 = r2.create();
        goto L_0x008a;
    L_0x0120:
        r2 = r0;
        goto L_0x0042;
    L_0x0123:
        r0 = r1;
        goto L_0x003a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.a(int, android.app.Activity, android.support.v4.app.Fragment, int, android.content.DialogInterface$OnCancelListener):android.app.Dialog");
    }

    public static boolean a(PackageManager packageManager, PackageInfo packageInfo) {
        boolean z = true;
        if (packageInfo == null) {
            return false;
        }
        try {
            if (c(packageManager)) {
                return a(packageInfo, true) != null;
            } else {
                try {
                    if (a(packageInfo, false) == null) {
                        z = false;
                    }
                    if (z) {
                        return z;
                    }
                    try {
                        if (a(packageInfo, true) == null) {
                            return z;
                        }
                        Log.w("GooglePlayServicesUtil", "Test-keys aren't accepted on this build.");
                        return z;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.res.Resources r4) {
        /*
        r1 = 1;
        r2 = 0;
        if (r4 != 0) goto L_0x0005;
    L_0x0004:
        return r2;
    L_0x0005:
        r0 = r4.getConfiguration();	 Catch:{ IllegalStateException -> 0x0021 }
        r0 = r0.screenLayout;	 Catch:{ IllegalStateException -> 0x0021 }
        r0 = r0 & 15;
        r3 = 3;
        if (r0 <= r3) goto L_0x0023;
    L_0x0010:
        r0 = r1;
    L_0x0011:
        r3 = com.google.android.gms.internal.ll.ig();	 Catch:{ IllegalStateException -> 0x0025 }
        if (r3 == 0) goto L_0x0019;
    L_0x0017:
        if (r0 != 0) goto L_0x001f;
    L_0x0019:
        r0 = b(r4);	 Catch:{ IllegalStateException -> 0x0029 }
        if (r0 == 0) goto L_0x002b;
    L_0x001f:
        r2 = r1;
        goto L_0x0004;
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        r0 = r2;
        goto L_0x0011;
    L_0x0025:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0027 }
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r1 = r2;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.a(android.content.res.Resources):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(android.content.pm.PackageInfo r5, boolean r6) {
        /*
        r0 = 0;
        r3 = 0;
        r1 = r5.signatures;	 Catch:{ IllegalStateException -> 0x0010 }
        r1 = r1.length;	 Catch:{ IllegalStateException -> 0x0010 }
        r2 = 1;
        if (r1 == r2) goto L_0x0012;
    L_0x0008:
        r1 = "GooglePlayServicesUtil";
        r2 = "Package has more than one signature.";
        android.util.Log.w(r1, r2);	 Catch:{ IllegalStateException -> 0x0010 }
    L_0x000f:
        return r0;
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r1 = r5.signatures;
        r1 = r1[r3];
        r1 = r1.toByteArray();
        if (r6 == 0) goto L_0x0024;
    L_0x001c:
        r2 = com.google.android.gms.common.b.gu();
        r3 = a;
        if (r3 == 0) goto L_0x0028;
    L_0x0024:
        r2 = com.google.android.gms.common.b.gv();
    L_0x0028:
        r2 = r2.contains(r1);	 Catch:{ IllegalStateException -> 0x0030 }
        if (r2 == 0) goto L_0x0032;
    L_0x002e:
        r0 = r1;
        goto L_0x000f;
    L_0x0030:
        r0 = move-exception;
        throw r0;
    L_0x0032:
        r2 = "GooglePlayServicesUtil";
        r3 = 2;
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ IllegalStateException -> 0x0059 }
        if (r2 == 0) goto L_0x000f;
    L_0x003b:
        r2 = "GooglePlayServicesUtil";
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0059 }
        r3.<init>();	 Catch:{ IllegalStateException -> 0x0059 }
        r4 = "Signature not valid.  Found: \n";
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x0059 }
        r4 = 0;
        r1 = android.util.Base64.encodeToString(r1, r4);	 Catch:{ IllegalStateException -> 0x0059 }
        r1 = r3.append(r1);	 Catch:{ IllegalStateException -> 0x0059 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0059 }
        android.util.Log.v(r2, r1);	 Catch:{ IllegalStateException -> 0x0059 }
        goto L_0x000f;
    L_0x0059:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.a(android.content.pm.PackageInfo, boolean):byte[]");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(android.content.pm.PackageInfo r6, byte[][] r7) {
        /*
        r1 = 0;
        r0 = 0;
        r3 = a;
        r2 = r6.signatures;	 Catch:{ IllegalStateException -> 0x0013 }
        r2 = r2.length;	 Catch:{ IllegalStateException -> 0x0013 }
        r4 = 1;
        if (r2 == r4) goto L_0x0015;
    L_0x000a:
        r0 = "GooglePlayServicesUtil";
        r2 = "Package has more than one signature.";
        android.util.Log.w(r0, r2);	 Catch:{ IllegalStateException -> 0x0013 }
        r0 = r1;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r2 = r6.signatures;
        r2 = r2[r0];
        r4 = r2.toByteArray();
    L_0x001d:
        r2 = r7.length;
        if (r0 >= r2) goto L_0x0030;
    L_0x0020:
        r2 = r7[r0];
        r5 = java.util.Arrays.equals(r2, r4);	 Catch:{ IllegalStateException -> 0x002a }
        if (r5 == 0) goto L_0x002c;
    L_0x0028:
        r0 = r2;
        goto L_0x0012;
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x001d;
    L_0x0030:
        r0 = "GooglePlayServicesUtil";
        r2 = 2;
        r0 = android.util.Log.isLoggable(r0, r2);	 Catch:{ IllegalStateException -> 0x0058 }
        if (r0 == 0) goto L_0x0056;
    L_0x0039:
        r0 = "GooglePlayServicesUtil";
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0058 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0058 }
        r3 = "Signature not valid.  Found: \n";
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0058 }
        r3 = 0;
        r3 = android.util.Base64.encodeToString(r4, r3);	 Catch:{ IllegalStateException -> 0x0058 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x0058 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0058 }
        android.util.Log.v(r0, r2);	 Catch:{ IllegalStateException -> 0x0058 }
    L_0x0056:
        r0 = r1;
        goto L_0x0012;
    L_0x0058:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.a(android.content.pm.PackageInfo, byte[][]):byte[]");
    }

    public static Intent aj(int i) {
        switch (i) {
            case ay.f /*1*/:
            case ay.n /*2*/:
                try {
                    return jo.ba("com.google.android.gms");
                } catch (IllegalStateException e) {
                    throw e;
                }
            case ay.p /*3*/:
                return jo.aY("com.google.android.gms");
            case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                return jo.hE();
            default:
                return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(android.content.Context r3, int r4) {
        /*
        r1 = a;
        r2 = r3.getResources();
        switch(r4) {
            case 1: goto L_0x0010;
            case 2: goto L_0x0032;
            case 3: goto L_0x002a;
            case 5: goto L_0x0052;
            case 7: goto L_0x004a;
            case 9: goto L_0x0042;
            case 42: goto L_0x003a;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = common_google_play_services_unknown_issue;
        r0 = r2.getString(r0);
    L_0x000f:
        return r0;
    L_0x0010:
        r0 = r3.getResources();	 Catch:{ IllegalStateException -> 0x005b }
        r0 = a(r0);	 Catch:{ IllegalStateException -> 0x005b }
        if (r0 == 0) goto L_0x0022;
    L_0x001a:
        r0 = common_google_play_services_install_text_tablet;
        r0 = r2.getString(r0);
        if (r1 == 0) goto L_0x0028;
    L_0x0022:
        r0 = common_google_play_services_install_text_phone;
        r0 = r2.getString(r0);
    L_0x0028:
        if (r1 == 0) goto L_0x000f;
    L_0x002a:
        r0 = common_google_play_services_enable_text;
        r0 = r2.getString(r0);
        if (r1 == 0) goto L_0x000f;
    L_0x0032:
        r0 = common_google_play_services_update_text;
        r0 = r2.getString(r0);
        if (r1 == 0) goto L_0x000f;
    L_0x003a:
        r0 = common_android_wear_update_text;
        r0 = r2.getString(r0);
        if (r1 == 0) goto L_0x000f;
    L_0x0042:
        r0 = common_google_play_services_unsupported_text;
        r0 = r2.getString(r0);
        if (r1 == 0) goto L_0x000f;
    L_0x004a:
        r0 = common_google_play_services_network_error_text;
        r0 = r2.getString(r0);
        if (r1 == 0) goto L_0x000f;
    L_0x0052:
        r0 = common_google_play_services_invalid_account_text;
        r0 = r2.getString(r0);
        if (r1 == 0) goto L_0x000f;
    L_0x005a:
        goto L_0x0009;
    L_0x005b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.b(android.content.Context, int):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(android.content.pm.PackageManager r8) {
        /*
        r0 = 1;
        r1 = 0;
        r3 = Jj;
        monitor-enter(r3);
        r2 = Ji;	 Catch:{ all -> 0x003c }
        r4 = -1;
        if (r2 != r4) goto L_0x002d;
    L_0x000a:
        r2 = "com.google.android.gms";
        r4 = 64;
        r2 = r8.getPackageInfo(r2, r4);	 Catch:{ NameNotFoundException -> 0x0037 }
        r4 = 1;
        r4 = new byte[r4][];	 Catch:{ NameNotFoundException -> 0x0033 }
        r5 = 0;
        r6 = com.google.android.gms.common.b.Jc;	 Catch:{ NameNotFoundException -> 0x0033 }
        r7 = 1;
        r6 = r6[r7];	 Catch:{ NameNotFoundException -> 0x0033 }
        r4[r5] = r6;	 Catch:{ NameNotFoundException -> 0x0033 }
        r2 = a(r2, r4);	 Catch:{ NameNotFoundException -> 0x0033 }
        if (r2 == 0) goto L_0x002a;
    L_0x0023:
        r2 = 1;
        Ji = r2;	 Catch:{ NameNotFoundException -> 0x0033 }
        r2 = a;	 Catch:{ NameNotFoundException -> 0x0033 }
        if (r2 == 0) goto L_0x002d;
    L_0x002a:
        r2 = 0;
        Ji = r2;	 Catch:{ NameNotFoundException -> 0x0035 }
    L_0x002d:
        monitor-exit(r3);	 Catch:{ all -> 0x003c }
        r2 = Ji;	 Catch:{ NameNotFoundException -> 0x003f }
        if (r2 == 0) goto L_0x0041;
    L_0x0032:
        return r0;
    L_0x0033:
        r2 = move-exception;
        throw r2;	 Catch:{ NameNotFoundException -> 0x0035 }
    L_0x0035:
        r2 = move-exception;
        throw r2;	 Catch:{ NameNotFoundException -> 0x0037 }
    L_0x0037:
        r2 = move-exception;
        r2 = 0;
        Ji = r2;	 Catch:{ all -> 0x003c }
        goto L_0x002d;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x003c }
        throw r0;
    L_0x003f:
        r0 = move-exception;
        throw r0;
    L_0x0041:
        r0 = r1;
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.b(android.content.pm.PackageManager):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(android.content.res.Resources r4) {
        /*
        r0 = 0;
        r1 = r4.getConfiguration();
        r2 = com.google.android.gms.internal.ll.ii();	 Catch:{ IllegalStateException -> 0x001a }
        if (r2 == 0) goto L_0x0019;
    L_0x000b:
        r2 = r1.screenLayout;	 Catch:{ IllegalStateException -> 0x001c }
        r2 = r2 & 15;
        r3 = 3;
        if (r2 > r3) goto L_0x0019;
    L_0x0012:
        r1 = r1.smallestScreenWidthDp;	 Catch:{ IllegalStateException -> 0x001e }
        r2 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        if (r1 < r2) goto L_0x0019;
    L_0x0018:
        r0 = 1;
    L_0x0019:
        return r0;
    L_0x001a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001c }
    L_0x001c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.b(android.content.res.Resources):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(android.content.Context r3, int r4) {
        /*
        r1 = a;
        r2 = r3.getResources();
        switch(r4) {
            case 1: goto L_0x0011;
            case 2: goto L_0x0021;
            case 3: goto L_0x0019;
            case 42: goto L_0x0021;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = 17039370; // 0x104000a float:2.42446E-38 double:8.4185673E-317;
        r0 = r2.getString(r0);
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = common_google_play_services_install_button;
        r0 = r2.getString(r0);
        if (r1 == 0) goto L_0x0010;
    L_0x0019:
        r0 = common_google_play_services_enable_button;
        r0 = r2.getString(r0);
        if (r1 == 0) goto L_0x0010;
    L_0x0021:
        r0 = common_google_play_services_update_button;
        r0 = r2.getString(r0);
        if (r1 == 0) goto L_0x0010;
    L_0x0029:
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.c(android.content.Context, int):java.lang.String");
    }

    public static boolean c(PackageManager packageManager) {
        try {
            if (!b(packageManager)) {
                if (gw()) {
                    try {
                        return false;
                    }
                }
            }
            return true;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public static boolean e(Context context, int i) {
        if (i == 1) {
            try {
                if (context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled) {
                    return true;
                }
            } catch (NameNotFoundException e) {
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        return false;
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public static boolean gw() {
        try {
            return Jg ? Jh : "user".equals(Build.TYPE);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int isGooglePlayServicesAvailable(android.content.Context r10) {
        /*
        r4 = 2;
        r2 = 1;
        r1 = 0;
        r3 = 9;
        r5 = r10.getPackageManager();
        r0 = com.google.android.gms.internal.jf.Mv;
        if (r0 != 0) goto L_0x0016;
    L_0x000d:
        r0 = r10.getResources();	 Catch:{ Throwable -> 0x005b }
        r6 = common_google_play_services_unknown_issue;	 Catch:{ Throwable -> 0x005b }
        r0.getString(r6);	 Catch:{ Throwable -> 0x005b }
    L_0x0016:
        r0 = com.google.android.gms.internal.jf.Mv;	 Catch:{ Throwable -> 0x0064 }
        if (r0 != 0) goto L_0x001d;
    L_0x001a:
        D(r10);	 Catch:{ Throwable -> 0x0064 }
    L_0x001d:
        r0 = "com.google.android.gms";
        r6 = 64;
        r6 = r5.getPackageInfo(r0, r6);	 Catch:{ NameNotFoundException -> 0x0066 }
        r0 = r6.versionCode;	 Catch:{ Throwable -> 0x006f }
        r0 = com.google.android.gms.internal.lc.aU(r0);	 Catch:{ Throwable -> 0x006f }
        if (r0 == 0) goto L_0x00c8;
    L_0x002d:
        r0 = gw();	 Catch:{ Throwable -> 0x006f }
        if (r0 == 0) goto L_0x0073;
    L_0x0033:
        r0 = r1;
    L_0x0034:
        r7 = 3;
        r7 = new byte[r7][];	 Catch:{ Throwable -> 0x0075 }
        r8 = 0;
        r9 = com.google.android.gms.common.b.Ix;	 Catch:{ Throwable -> 0x0075 }
        r9 = r9[r0];	 Catch:{ Throwable -> 0x0075 }
        r7[r8] = r9;	 Catch:{ Throwable -> 0x0075 }
        r8 = 1;
        r9 = com.google.android.gms.common.b.IE;	 Catch:{ Throwable -> 0x0075 }
        r9 = r9[r0];	 Catch:{ Throwable -> 0x0075 }
        r7[r8] = r9;	 Catch:{ Throwable -> 0x0075 }
        r8 = 2;
        r9 = com.google.android.gms.common.b.IC;	 Catch:{ Throwable -> 0x0075 }
        r0 = r9[r0];	 Catch:{ Throwable -> 0x0075 }
        r7[r8] = r0;	 Catch:{ Throwable -> 0x0075 }
        r0 = a(r6, r7);	 Catch:{ Throwable -> 0x0075 }
        if (r0 != 0) goto L_0x0077;
    L_0x0052:
        r0 = "GooglePlayServicesUtil";
        r1 = "Google Play Services signature invalid on Glass.";
        android.util.Log.w(r0, r1);	 Catch:{ Throwable -> 0x0075 }
        r2 = r3;
    L_0x005a:
        return r2;
    L_0x005b:
        r0 = move-exception;
        r0 = "GooglePlayServicesUtil";
        r6 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.";
        android.util.Log.e(r0, r6);
        goto L_0x0016;
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = move-exception;
        r0 = "GooglePlayServicesUtil";
        r1 = "Google Play services is missing.";
        android.util.Log.w(r0, r1);
        goto L_0x005a;
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r0 = r2;
        goto L_0x0034;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = r10.getPackageName();
        r7 = 64;
        r7 = r5.getPackageInfo(r0, r7);	 Catch:{ NameNotFoundException -> 0x00a9 }
        r8 = a(r5, r7);	 Catch:{ NameNotFoundException -> 0x00a9 }
        if (r8 != 0) goto L_0x00c4;
    L_0x0087:
        r1 = "GooglePlayServicesUtil";
        r2 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x00a9 }
        r2.<init>();	 Catch:{ NameNotFoundException -> 0x00a9 }
        r4 = "Calling package ";
        r2 = r2.append(r4);	 Catch:{ NameNotFoundException -> 0x00a9 }
        r4 = r7.packageName;	 Catch:{ NameNotFoundException -> 0x00a9 }
        r2 = r2.append(r4);	 Catch:{ NameNotFoundException -> 0x00a9 }
        r4 = " signature invalid on Glass.";
        r2 = r2.append(r4);	 Catch:{ NameNotFoundException -> 0x00a9 }
        r2 = r2.toString();	 Catch:{ NameNotFoundException -> 0x00a9 }
        android.util.Log.w(r1, r2);	 Catch:{ NameNotFoundException -> 0x00a9 }
        r2 = r3;
        goto L_0x005a;
    L_0x00a9:
        r1 = move-exception;
        r1 = "GooglePlayServicesUtil";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = "Could not get info for calling package: ";
        r2 = r2.append(r4);
        r0 = r2.append(r0);
        r0 = r0.toString();
        android.util.Log.w(r1, r0);
        r2 = r3;
        goto L_0x005a;
    L_0x00c4:
        r0 = a;	 Catch:{ Throwable -> 0x00e0 }
        if (r0 == 0) goto L_0x0125;
    L_0x00c8:
        r0 = com.google.android.gms.internal.lc.K(r10);	 Catch:{ Throwable -> 0x00e0 }
        if (r0 == 0) goto L_0x00e6;
    L_0x00ce:
        r0 = com.google.android.gms.common.b.Ix;	 Catch:{ Throwable -> 0x00e2 }
        r0 = a(r6, r0);	 Catch:{ Throwable -> 0x00e2 }
        if (r0 != 0) goto L_0x0125;
    L_0x00d6:
        r0 = "GooglePlayServicesUtil";
        r1 = "Google Play services signature invalid.";
        android.util.Log.w(r0, r1);	 Catch:{ Throwable -> 0x00e4 }
        r2 = r3;
        goto L_0x005a;
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ Throwable -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;
    L_0x00e6:
        r0 = "com.android.vending";
        r7 = 64;
        r0 = r5.getPackageInfo(r0, r7);	 Catch:{ NameNotFoundException -> 0x0100 }
        r7 = com.google.android.gms.common.b.Ix;
        r0 = a(r0, r7);
        if (r0 != 0) goto L_0x010d;
    L_0x00f6:
        r0 = "GooglePlayServicesUtil";
        r1 = "Google Play Store signature invalid.";
        android.util.Log.w(r0, r1);	 Catch:{ Throwable -> 0x010b }
        r2 = r3;
        goto L_0x005a;
    L_0x0100:
        r0 = move-exception;
        r0 = "GooglePlayServicesUtil";
        r1 = "Google Play Store is missing.";
        android.util.Log.w(r0, r1);
        r2 = r3;
        goto L_0x005a;
    L_0x010b:
        r0 = move-exception;
        throw r0;
    L_0x010d:
        r7 = 1;
        r7 = new byte[r7][];	 Catch:{ Throwable -> 0x0123 }
        r8 = 0;
        r7[r8] = r0;	 Catch:{ Throwable -> 0x0123 }
        r0 = a(r6, r7);	 Catch:{ Throwable -> 0x0123 }
        if (r0 != 0) goto L_0x0125;
    L_0x0119:
        r0 = "GooglePlayServicesUtil";
        r1 = "Google Play services signature invalid.";
        android.util.Log.w(r0, r1);	 Catch:{ Throwable -> 0x0123 }
        r2 = r3;
        goto L_0x005a;
    L_0x0123:
        r0 = move-exception;
        throw r0;
    L_0x0125:
        r0 = 6587000; // 0x648278 float:9.230353E-39 double:3.2544104E-317;
        r0 = com.google.android.gms.internal.lc.aS(r0);
        r3 = r6.versionCode;
        r3 = com.google.android.gms.internal.lc.aS(r3);
        if (r3 >= r0) goto L_0x0153;
    L_0x0134:
        r0 = "GooglePlayServicesUtil";
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0151 }
        r1.<init>();	 Catch:{ Throwable -> 0x0151 }
        r2 = "Google Play services out of date.  Requires 6587000 but found ";
        r1 = r1.append(r2);	 Catch:{ Throwable -> 0x0151 }
        r2 = r6.versionCode;	 Catch:{ Throwable -> 0x0151 }
        r1 = r1.append(r2);	 Catch:{ Throwable -> 0x0151 }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x0151 }
        android.util.Log.w(r0, r1);	 Catch:{ Throwable -> 0x0151 }
        r2 = r4;
        goto L_0x005a;
    L_0x0151:
        r0 = move-exception;
        throw r0;
    L_0x0153:
        r0 = "com.google.android.gms";
        r3 = 0;
        r0 = r5.getApplicationInfo(r0, r3);	 Catch:{ NameNotFoundException -> 0x0161 }
        r0 = r0.enabled;	 Catch:{ Throwable -> 0x016e }
        if (r0 != 0) goto L_0x0170;
    L_0x015e:
        r2 = 3;
        goto L_0x005a;
    L_0x0161:
        r0 = move-exception;
        r1 = "GooglePlayServicesUtil";
        r3 = "Google Play services missing when getting application info.";
        android.util.Log.wtf(r1, r3);
        r0.printStackTrace();
        goto L_0x005a;
    L_0x016e:
        r0 = move-exception;
        throw r0;
    L_0x0170:
        r2 = r1;
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(android.content.Context):int");
    }

    public static boolean isUserRecoverableError(int i) {
        switch (i) {
            case ay.f /*1*/:
            case ay.n /*2*/:
            case ay.p /*3*/:
            case a6.D /*9*/:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean showErrorDialogFragment(int r5, android.app.Activity r6, android.support.v4.app.Fragment r7, int r8, android.content.DialogInterface.OnCancelListener r9) {
        /*
        r0 = 0;
        r1 = a;
        r2 = a(r5, r6, r7, r8, r9);
        if (r2 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r0 = r6 instanceof android.support.v4.app.FragmentActivity;	 Catch:{ NoClassDefFoundError -> 0x0043 }
    L_0x000c:
        if (r0 == 0) goto L_0x0020;
    L_0x000e:
        r0 = r6;
        r0 = (android.support.v4.app.FragmentActivity) r0;
        r0 = r0.getSupportFragmentManager();
        r3 = com.google.android.gms.common.SupportErrorDialogFragment.newInstance(r2, r9);
        r4 = "GooglePlayServicesErrorDialog";
        r3.show(r0, r4);	 Catch:{ NoClassDefFoundError -> 0x003f }
        if (r1 == 0) goto L_0x0041;
    L_0x0020:
        r0 = com.google.android.gms.internal.ll.ig();	 Catch:{ NoClassDefFoundError -> 0x003f }
        if (r0 == 0) goto L_0x0035;
    L_0x0026:
        r0 = r6.getFragmentManager();
        r2 = com.google.android.gms.common.ErrorDialogFragment.newInstance(r2, r9);
        r3 = "GooglePlayServicesErrorDialog";
        r2.show(r0, r3);	 Catch:{ NoClassDefFoundError -> 0x003d }
        if (r1 == 0) goto L_0x0041;
    L_0x0035:
        r0 = new java.lang.RuntimeException;	 Catch:{ NoClassDefFoundError -> 0x003d }
        r1 = "This Activity does not support Fragments.";
        r0.<init>(r1);	 Catch:{ NoClassDefFoundError -> 0x003d }
        throw r0;	 Catch:{ NoClassDefFoundError -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r0 = move-exception;
        throw r0;
    L_0x0041:
        r0 = 1;
        goto L_0x0009;
    L_0x0043:
        r3 = move-exception;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtil.showErrorDialogFragment(int, android.app.Activity, android.support.v4.app.Fragment, int, android.content.DialogInterface$OnCancelListener):boolean");
    }
}
