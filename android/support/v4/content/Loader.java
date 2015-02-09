package android.support.v4.content;

import android.content.Context;
import android.support.v4.util.DebugUtils;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class Loader {
    public static boolean a;
    private static final String[] z;
    boolean mAbandoned;
    boolean mContentChanged;
    Context mContext;
    int mId;
    OnLoadCompleteListener mListener;
    boolean mProcessingChange;
    boolean mReset;
    boolean mStarted;

    public interface OnLoadCompleteListener {
        void onLoadComplete(Loader loader, Object obj);
    }

    static {
        String[] strArr = new String[11];
        String str = ".\n\u0014BGz\u00029Yjf\u00069JLjZ";
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
                        i3 = 14;
                        break;
                    case ay.f /*1*/:
                        i3 = 103;
                        break;
                    case ay.n /*2*/:
                        i3 = 87;
                        break;
                    case ay.p /*3*/:
                        i3 = 45;
                        break;
                    default:
                        i3 = 41;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "c&5LGj\b9HM3";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "c4#L[z\u00023\u0010";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = ".\n\u0007_Fm\u0002$^@`\u0000\u0014EH`\u00002\u0010";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "c.3\u0010";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ".\n\u0005HZk\u0013j";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "Z\u000f2_L.\u000e$\rHb\u00152LMwG6\rEg\u0014#HGk\u0015w_Li\u000e$YL|\u00023";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ".\u000e3\u0010";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "@\bwA@}\u00132CL|G%HNg\u0014#H[";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "O\u0013#HD~\u0013>CN.\u00138\r\\`\u00152J@}\u00132_\tz\u000f2\r^|\b9J\tb\u000e$YL`\u0002%";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ".\n\u001bDZz\u00029H[3";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void registerListener(int i, OnLoadCompleteListener onLoadCompleteListener) {
        try {
            if (this.mListener != null) {
                throw new IllegalStateException(z[7]);
            }
            this.mListener = onLoadCompleteListener;
            this.mId = i;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected void onReset() {
    }

    protected void onStartLoading() {
    }

    protected void onStopLoading() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
        r2_this = this;
        r5.print(r3);	 Catch:{ IllegalStateException -> 0x0079 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0079 }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0079 }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x0079 }
        r0 = r2.mId;	 Catch:{ IllegalStateException -> 0x0079 }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x0079 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0079 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0079 }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x0079 }
        r0 = r2.mListener;	 Catch:{ IllegalStateException -> 0x0079 }
        r5.println(r0);	 Catch:{ IllegalStateException -> 0x0079 }
        r0 = r2.mStarted;	 Catch:{ IllegalStateException -> 0x0079 }
        if (r0 != 0) goto L_0x0029;
    L_0x0021:
        r0 = r2.mContentChanged;	 Catch:{ IllegalStateException -> 0x007b }
        if (r0 != 0) goto L_0x0029;
    L_0x0025:
        r0 = r2.mProcessingChange;	 Catch:{ IllegalStateException -> 0x007d }
        if (r0 == 0) goto L_0x0053;
    L_0x0029:
        r5.print(r3);	 Catch:{ IllegalStateException -> 0x007d }
        r0 = z;	 Catch:{ IllegalStateException -> 0x007d }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x007d }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x007d }
        r0 = r2.mStarted;	 Catch:{ IllegalStateException -> 0x007d }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x007d }
        r0 = z;	 Catch:{ IllegalStateException -> 0x007d }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x007d }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x007d }
        r0 = r2.mContentChanged;	 Catch:{ IllegalStateException -> 0x007d }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x007d }
        r0 = z;	 Catch:{ IllegalStateException -> 0x007d }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x007d }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x007d }
        r0 = r2.mProcessingChange;	 Catch:{ IllegalStateException -> 0x007d }
        r5.println(r0);	 Catch:{ IllegalStateException -> 0x007d }
    L_0x0053:
        r0 = r2.mAbandoned;	 Catch:{ IllegalStateException -> 0x007f }
        if (r0 != 0) goto L_0x005b;
    L_0x0057:
        r0 = r2.mReset;	 Catch:{ IllegalStateException -> 0x0081 }
        if (r0 == 0) goto L_0x0078;
    L_0x005b:
        r5.print(r3);	 Catch:{ IllegalStateException -> 0x0081 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0081 }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0081 }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x0081 }
        r0 = r2.mAbandoned;	 Catch:{ IllegalStateException -> 0x0081 }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x0081 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0081 }
        r1 = 6;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0081 }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x0081 }
        r0 = r2.mReset;	 Catch:{ IllegalStateException -> 0x0081 }
        r5.println(r0);	 Catch:{ IllegalStateException -> 0x0081 }
    L_0x0078:
        return;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.Loader.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public Loader(Context context) {
        this.mStarted = false;
        this.mAbandoned = false;
        this.mReset = true;
        this.mContentChanged = false;
        this.mProcessingChange = false;
        this.mContext = context.getApplicationContext();
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        DebugUtils.buildShortClassTag(this, stringBuilder);
        stringBuilder.append(z[8]);
        stringBuilder.append(this.mId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    protected void onAbandon() {
    }

    public void unregisterListener(OnLoadCompleteListener onLoadCompleteListener) {
        try {
            if (this.mListener == null) {
                throw new IllegalStateException(z[9]);
            }
            try {
                if (this.mListener != onLoadCompleteListener) {
                    throw new IllegalArgumentException(z[10]);
                }
                this.mListener = null;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void deliverResult(Object obj) {
        try {
            if (this.mListener != null) {
                this.mListener.onLoadComplete(this, obj);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public String dataToString(Object obj) {
        StringBuilder stringBuilder = new StringBuilder(64);
        DebugUtils.buildShortClassTag(obj, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public int getId() {
        return this.mId;
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }
}
