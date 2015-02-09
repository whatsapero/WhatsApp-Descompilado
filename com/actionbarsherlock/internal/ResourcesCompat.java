package com.actionbarsherlock.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.actionbarsherlock.R;

public final class ResourcesCompat {
    public static int a;
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
        r2 = "*4lAg\b4'Ff\u000b?`Jz_(b\\g\n(dJ(6\u001e'";
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
        if (r7 > r8) goto L_0x002f;
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
        r0 = "*4lAg\b4'Mg\u00106bNf_(b\\g\n(dJ(6\u001e'";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x002f:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0043;
            case 2: goto L_0x0046;
            case 3: goto L_0x0048;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 8;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        goto L_0x0038;
    L_0x0043:
        r2 = 90;
        goto L_0x0038;
    L_0x0046:
        r2 = 7;
        goto L_0x0038;
    L_0x0048:
        r2 = 47;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.ResourcesCompat.<clinit>():void");
    }

    public static boolean getResources_getBoolean(Context context, int i) {
        try {
            if (VERSION.SDK_INT >= 13) {
                return context.getResources().getBoolean(i);
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float f = ((float) displayMetrics.widthPixels) / displayMetrics.density;
            float f2 = ((float) displayMetrics.heightPixels) / displayMetrics.density;
            if (f < f2) {
                f2 = f;
            }
            try {
                if (i == R.bool.abs__action_bar_embed_tabs) {
                    return f >= 480.0f;
                } else {
                    try {
                        if (i == R.bool.abs__split_action_bar_is_narrow) {
                            return f < 480.0f;
                        } else {
                            try {
                                if (i == R.bool.abs__action_bar_expanded_action_views_exclusive) {
                                    return f2 < 600.0f;
                                } else {
                                    try {
                                        if (i == R.bool.abs__config_allowActionMenuItemTextWithIcon) {
                                            return f >= 480.0f;
                                        } else {
                                            throw new IllegalArgumentException(z[1] + i);
                                        }
                                    } catch (IllegalArgumentException e) {
                                        throw e;
                                    } catch (IllegalArgumentException e2) {
                                        throw e2;
                                    }
                                }
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            } catch (IllegalArgumentException e222) {
                                throw e222;
                            }
                        }
                    } catch (IllegalArgumentException e2222) {
                        throw e2222;
                    } catch (IllegalArgumentException e22222) {
                        throw e22222;
                    }
                }
            } catch (IllegalArgumentException e222222) {
                throw e222222;
            } catch (IllegalArgumentException e2222222) {
                throw e2222222;
            }
        } catch (IllegalArgumentException e22222222) {
            throw e22222222;
        }
    }

    public static int getResources_getInteger(Context context, int i) {
        try {
            if (VERSION.SDK_INT >= 13) {
                return context.getResources().getInteger(i);
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float f = ((float) displayMetrics.widthPixels) / displayMetrics.density;
            try {
                if (i != R.integer.abs__max_action_buttons) {
                    throw new IllegalArgumentException(z[0] + i);
                } else if (f >= 600.0f) {
                    return 5;
                } else {
                    if (f >= 500.0f) {
                        return 4;
                    }
                    return f >= 360.0f ? 3 : 2;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }
}
