package android.support.v4.text;

import android.support.annotation.Nullable;
import java.util.Locale;
import org.whispersystems.libaxolotl.ay;

public class TextUtilsCompat {
    private static String ARAB_SCRIPT_SUBTAG;
    private static String HEBR_SCRIPT_SUBTAG;
    public static final Locale ROOT;

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
        r0 = new java.util.Locale;
        r2 = "";
        r3 = "";
        r0.<init>(r2, r3);
        ROOT = r0;
        r2 = "q\u0007,S";
        r0 = -1;
    L_0x000f:
        r2 = r2.toCharArray();
        r3 = r2.length;
        r4 = r3;
        r5 = r1;
        r3 = r2;
    L_0x0017:
        if (r4 > r5) goto L_0x002c;
    L_0x0019:
        r2 = new java.lang.String;
        r2.<init>(r3);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x0049;
            default: goto L_0x0025;
        };
    L_0x0025:
        ARAB_SCRIPT_SUBTAG = r2;
        r0 = "x\u0010/C";
        r2 = r0;
        r0 = r1;
        goto L_0x000f;
    L_0x002c:
        r6 = r3[r5];
        r2 = r5 % 5;
        switch(r2) {
            case 0: goto L_0x003d;
            case 1: goto L_0x0040;
            case 2: goto L_0x0043;
            case 3: goto L_0x0046;
            default: goto L_0x0033;
        };
    L_0x0033:
        r2 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
    L_0x0035:
        r2 = r2 ^ r6;
        r2 = (char) r2;
        r3[r5] = r2;
        r2 = r5 + 1;
        r5 = r2;
        goto L_0x0017;
    L_0x003d:
        r2 = 48;
        goto L_0x0035;
    L_0x0040:
        r2 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        goto L_0x0035;
    L_0x0043:
        r2 = 77;
        goto L_0x0035;
    L_0x0046:
        r2 = 49;
        goto L_0x0035;
    L_0x0049:
        HEBR_SCRIPT_SUBTAG = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.text.TextUtilsCompat.<clinit>():void");
    }

    public static int getLayoutDirectionFromLocale(@Nullable Locale locale) {
        if (!(locale == null || locale.equals(ROOT))) {
            String script = ICUCompat.getScript(ICUCompat.addLikelySubtags(locale.toString()));
            if (script == null) {
                return getLayoutDirectionFromFirstChar(locale);
            }
            if (script.equalsIgnoreCase(ARAB_SCRIPT_SUBTAG) || script.equalsIgnoreCase(HEBR_SCRIPT_SUBTAG)) {
                return 1;
            }
        }
        return 0;
    }

    private static int getLayoutDirectionFromFirstChar(Locale locale) {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
            case ay.f /*1*/:
            case ay.n /*2*/:
                return 1;
            default:
                return 0;
        }
    }
}
