package android.support.v4.text;

import android.util.Log;
import java.lang.reflect.Method;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ICUCompatIcs {
    private static Method sAddLikelySubtagsMethod;
    private static Method sGetScriptMethod;
    private static final String[] z;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 18;
                    break;
                case ay.f /*1*/:
                    i2 = 92;
                    break;
                case ay.n /*2*/:
                    i2 = 18;
                    break;
                case ay.p /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 104;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 104);
        }
        return toCharArray;
    }

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
        r4 = 2;
        r1 = -1;
        r3 = 1;
        r2 = 0;
        r0 = 4;
        r5 = new java.lang.String[r0];
        r0 = "[\u001fG`\u0007\u007f,sW!q/";
        r6 = r2;
        r7 = r5;
        r8 = r5;
        r5 = r0;
        r0 = r1;
    L_0x000e:
        r5 = z(r5);
        r5 = z(r5);
        switch(r0) {
            case 0: goto L_0x0022;
            case 1: goto L_0x002b;
            case 2: goto L_0x0035;
            default: goto L_0x0019;
        };
    L_0x0019:
        r7[r6] = r5;
        r0 = "[\u001fG`\u0007\u007f,sW!q/";
        r5 = r0;
        r6 = r3;
        r7 = r8;
        r0 = r2;
        goto L_0x000e;
    L_0x0022:
        r7[r6] = r5;
        r0 = "[\u001fG`\u0007\u007f,sW!q/";
        r5 = r0;
        r6 = r4;
        r7 = r8;
        r0 = r3;
        goto L_0x000e;
    L_0x002b:
        r7[r6] = r5;
        r5 = 3;
        r0 = "[\u001fG`\u0007\u007f,sW!q/";
        r6 = r5;
        r7 = r8;
        r5 = r0;
        r0 = r4;
        goto L_0x000e;
    L_0x0035:
        r7[r6] = r5;
        z = r8;
        r0 = "~5p@\u0007`9<J\u000bgr[`=";	 Catch:{ Exception -> 0x006a }
        r0 = z(r0);
        r0 = z(r0);
        r4 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x006a }
        if (r4 == 0) goto L_0x0078;
    L_0x0049:
        r0 = "u9fp\u000b`5bW";	 Catch:{ Exception -> 0x0088 }
        r3 = r4;
    L_0x004c:
        r0 = z(r0);
        r0 = z(r0);
        switch(r1) {
            case 0: goto L_0x0079;
            default: goto L_0x0057;
        };
    L_0x0057:
        r1 = 1;
        r1 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0088 }
        r5 = 0;	 Catch:{ Exception -> 0x0088 }
        r6 = java.lang.String.class;	 Catch:{ Exception -> 0x0088 }
        r1[r5] = r6;	 Catch:{ Exception -> 0x0088 }
        r0 = r3.getMethod(r0, r1);	 Catch:{ Exception -> 0x0088 }
        sGetScriptMethod = r0;	 Catch:{ Exception -> 0x0088 }
        r0 = "s8vo\u0001y9~Z;g>fB\u000fa";	 Catch:{ Exception -> 0x0088 }
        r1 = r2;
        r3 = r4;
        goto L_0x004c;
    L_0x006a:
        r0 = move-exception;
        r1 = "[\u001fG`\u0007\u007f,sW!q/";
        r1 = z(r1);
        r1 = z(r1);
        android.util.Log.w(r1, r0);
    L_0x0078:
        return;
    L_0x0079:
        r1 = 1;
        r1 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0088 }
        r2 = 0;	 Catch:{ Exception -> 0x0088 }
        r4 = java.lang.String.class;	 Catch:{ Exception -> 0x0088 }
        r1[r2] = r4;	 Catch:{ Exception -> 0x0088 }
        r0 = r3.getMethod(r0, r1);	 Catch:{ Exception -> 0x0088 }
        sAddLikelySubtagsMethod = r0;	 Catch:{ Exception -> 0x0088 }
        goto L_0x0078;
    L_0x0088:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x006a }
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.text.ICUCompatIcs.<clinit>():void");
    }

    public static String addLikelySubtags(String str) {
        try {
            if (sAddLikelySubtagsMethod != null) {
                return (String) sAddLikelySubtagsMethod.invoke(null, new Object[]{str});
            }
        } catch (Throwable e) {
            Log.w(z[3], e);
        } catch (Throwable e2) {
            Log.w(z[2], e2);
        }
        return str;
    }

    public static String getScript(String str) {
        try {
            if (sGetScriptMethod != null) {
                return (String) sGetScriptMethod.invoke(null, new Object[]{str});
            }
        } catch (Throwable e) {
            Log.w(z[0], e);
        } catch (Throwable e2) {
            Log.w(z[1], e2);
        }
        return null;
    }
}
