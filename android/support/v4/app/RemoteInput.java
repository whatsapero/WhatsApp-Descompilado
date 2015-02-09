package android.support.v4.app;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory;
import android.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class RemoteInput extends android.support.v4.app.RemoteInputCompatBase.RemoteInput {
    public static final Factory FACTORY;
    private static final Impl IMPL;
    private final boolean mAllowFreeFormInput;
    private final CharSequence[] mChoices;
    private final Bundle mExtras;
    private final CharSequence mLabel;
    private final String mResultKey;

    public final class Builder {
        private static final String z;
        private boolean mAllowFreeFormInput;
        private CharSequence[] mChoices;
        private Bundle mExtras;
        private CharSequence mLabel;
        private final String mResultKey;

        static {
            char[] toCharArray = "f:7a:@\u007f/q/\u0014<%zq@\u007f&qvZ*(x".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 52;
                        break;
                    case ay.f /*1*/:
                        i2 = 95;
                        break;
                    case ay.n /*2*/:
                        i2 = 68;
                        break;
                    case ay.p /*3*/:
                        i2 = 20;
                        break;
                    default:
                        i2 = 86;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public RemoteInput build() {
            return new RemoteInput(this.mResultKey, this.mLabel, this.mChoices, this.mAllowFreeFormInput, this.mExtras);
        }

        public android.support.v4.app.RemoteInput.Builder setChoices(CharSequence[] charSequenceArr) {
            this.mChoices = charSequenceArr;
            return this;
        }

        public android.support.v4.app.RemoteInput.Builder setLabel(CharSequence charSequence) {
            this.mLabel = charSequence;
            return this;
        }

        public Builder(String str) {
            this.mAllowFreeFormInput = true;
            this.mExtras = new Bundle();
            if (str == null) {
                throw new IllegalArgumentException(z);
            }
            this.mResultKey = str;
        }
    }

    interface Impl {
        Bundle getResultsFromIntent(Intent intent);
    }

    class ImplApi20 implements Impl {
        ImplApi20() {
        }

        public Bundle getResultsFromIntent(Intent intent) {
            return RemoteInputCompatApi20.getResultsFromIntent(intent);
        }
    }

    class ImplBase implements Impl {
        private static final String[] z;

        static {
            /* JADX: method processing error */
/*
            Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
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
            r2 = "8k\f8\t\u000fG\u000f'\b\u001e.\b$]\u0005`\r.]\u0019{\u0011'\u0012\u0018z\u00043]\f|\u000e:]+^(w1\u000fx\u0004;][8";
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
            r0 = "8k\f8\t\u000fG\u000f'\b\u001e";
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
                case 3: goto L_0x0049;
                default: goto L_0x0036;
            };
        L_0x0036:
            r2 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        L_0x0038:
            r2 = r2 ^ r9;
            r2 = (char) r2;
            r6[r8] = r2;
            r2 = r8 + 1;
            r8 = r2;
            goto L_0x0012;
        L_0x0040:
            r2 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
            goto L_0x0038;
        L_0x0043:
            r2 = 14;
            goto L_0x0038;
        L_0x0046:
            r2 = 97;
            goto L_0x0038;
        L_0x0049:
            r2 = 87;
            goto L_0x0038;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.RemoteInput.ImplBase.<clinit>():void");
        }

        public Bundle getResultsFromIntent(Intent intent) {
            Log.w(z[1], z[0]);
            return null;
        }

        ImplBase() {
        }
    }

    class ImplJellybean implements Impl {
        public Bundle getResultsFromIntent(Intent intent) {
            return RemoteInputCompatJellybean.getResultsFromIntent(intent);
        }

        ImplJellybean() {
        }
    }

    public CharSequence getLabel() {
        return this.mLabel;
    }

    public String getResultKey() {
        return this.mResultKey;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle) {
        this.mResultKey = str;
        this.mLabel = charSequence;
        this.mChoices = charSequenceArr;
        this.mAllowFreeFormInput = z;
        this.mExtras = bundle;
    }

    public boolean getAllowFreeFormInput() {
        return this.mAllowFreeFormInput;
    }

    static {
        if (VERSION.SDK_INT >= 20) {
            IMPL = new ImplApi20();
        } else if (VERSION.SDK_INT >= 16) {
            IMPL = new ImplJellybean();
        } else {
            IMPL = new ImplBase();
        }
        FACTORY = new Factory() {
        };
    }

    public CharSequence[] getChoices() {
        return this.mChoices;
    }

    public static Bundle getResultsFromIntent(Intent intent) {
        return IMPL.getResultsFromIntent(intent);
    }
}
