package com.whatsapp.util;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;

public class b9 {
    public static Signature[] a(Context context) {
        String packageName = context.getPackageName();
        if (context.getPackageManager() == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(packageName, 64).signatures;
        } catch (NameNotFoundException e) {
            return null;
        }
    }
}
