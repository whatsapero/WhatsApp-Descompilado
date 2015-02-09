package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class TextEmojiLabel extends TextView {
    private static boolean b;
    private static final Factory e;
    private static final String[] z;
    private BufferType a;
    private _h c;
    private CharSequence d;
    private int f;

    protected void onMeasure(int r1, int r2) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: com.whatsapp.TextEmojiLabel.onMeasure(int, int):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:113)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:223)
	at jadx.core.ProcessClass.process(ProcessClass.java:20)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
Caused by: java.lang.NullPointerException
	at jadx.core.dex.trycatch.TryCatchBlock.removeWholeBlock(TryCatchBlock.java:76)
	at jadx.core.dex.trycatch.TryCatchBlock.removeHandler(TryCatchBlock.java:60)
	at jadx.core.dex.nodes.MethodNode.initTryCatches(MethodNode.java:286)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 8 more
*/
        /*
        r0_this = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 == r1) goto L_0x000c;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 17;
        if (r0 != r1) goto L_0x009d;
        super.onMeasure(r5, r6);
        r0 = r4.getMeasuredWidth();
        r1 = r4.getPaddingLeft();
        r0 = r0 - r1;
        r1 = r4.getPaddingRight();
        r0 = r0 - r1;
        r1 = r4.f;
        if (r1 == r0) goto L_0x004f;
        r1 = r4.d;
        r1 = r1 instanceof android.text.Spanned;
        if (r1 == 0) goto L_0x004f;
        r1 = r4.getEllipsize();
        if (r1 == 0) goto L_0x004f;
        r4.f = r0;
        r1 = r4.d;
        r2 = r4.getPaint();
        r0 = (float) r0;
        r3 = r4.getEllipsize();
        r0 = android.text.TextUtils.ellipsize(r1, r2, r0, r3);
        if (r0 == 0) goto L_0x004f;
        r1 = r4.getText();
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x004f;
        r1 = r4.a;
        super.setText(r0, r1);
        return;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 11;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r4.a(r5, r6);
        goto L_0x000f;
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 12;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r4.a(r5, r6);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x000f;
        super.onMeasure(r5, r6);
        goto L_0x000f;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TextEmojiLabel.onMeasure(int, int):void");
    }

    public void setLinkHandler(_h _hVar) {
        this.c = _hVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"WrongCall"})
    private void a(int r9, int r10) {
        /*
        r8_this = this;
        r6 = 10;
        r5 = 0;
        r2 = com.whatsapp.App.az;
        r1 = new android.text.SpannableStringBuilder;
        r0 = r8.d;
        r1.<init>(r0);
        r0 = r1.length();
        r3 = android.text.style.MetricAffectingSpan.class;
        r0 = r1.nextSpanTransition(r5, r0, r3);
    L_0x0016:
        if (r0 < 0) goto L_0x0031;
    L_0x0018:
        r3 = r1.length();
        if (r0 >= r3) goto L_0x0031;
    L_0x001e:
        r3 = " ";
        r1.insert(r0, r3);
        r0 = r0 + 1;
        r3 = r1.length();
        r4 = android.text.style.MetricAffectingSpan.class;
        r0 = r1.nextSpanTransition(r0, r3, r4);
        if (r2 == 0) goto L_0x0016;
    L_0x0031:
        r8.d = r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        super.setText(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        super.onMeasure(r9, r10);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
    L_0x0039:
        return;
    L_0x003a:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r3 = r3[r5];
        r1 = r1.append(r3);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r1 = new android.text.SpannableStringBuilder;
        r0 = r8.d;
        r1.<init>(r0);
        r0 = android.text.TextUtils.indexOf(r1, r6, r5);
        r7 = r0;
        r0 = r1;
        r1 = r7;
    L_0x0065:
        if (r1 < 0) goto L_0x0077;
    L_0x0067:
        r3 = r1 + 1;
        r4 = " ";
        r0 = r0.replace(r1, r3, r4);
        r1 = r1 + 1;
        r1 = android.text.TextUtils.indexOf(r0, r6, r1);
        if (r2 == 0) goto L_0x0065;
    L_0x0077:
        r8.d = r0;
        super.setText(r0);
        super.onMeasure(r9, r10);
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TextEmojiLabel.a(int, int):void");
    }

    private String a(CharSequence charSequence) {
        int i = App.az;
        String str = "";
        int i2 = 0;
        while (i2 < charSequence.length()) {
            str = str + z[1] + Integer.toHexString(charSequence.charAt(i2)) + z[2];
            i2++;
            if (i != 0) {
                break;
            }
        }
        return str;
    }

    private void a() {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
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
        r9_this = this;
        r2 = com.whatsapp.App.az;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 7;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r9.getMeasuredWidth();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r3 = r9.getText();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r4 = 5;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r1 = r9.a(r3);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r4 = r9.getLayout();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r5 = 6;
        r1 = r1[r5];
        r0 = r0.append(r1);
        r1 = r4.getLineCount();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = 0;
    L_0x0062:
        r1 = r4.getLineCount();
        if (r0 >= r1) goto L_0x0106;
    L_0x0068:
        r5 = r4.getLineStart(r0);
        r1 = r4.getLineCount();
        r1 = r1 + -1;
        if (r0 != r1) goto L_0x007a;
    L_0x0074:
        r1 = r3.length();
        if (r2 == 0) goto L_0x0080;
    L_0x007a:
        r1 = r0 + 1;
        r1 = r4.getLineStart(r1);
    L_0x0080:
        if (r5 > r1) goto L_0x00cb;
    L_0x0082:
        r6 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r6.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r7 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r8 = 10;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r7 = r7[r8];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r6 = r6.append(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r6 = r6.append(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r7 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r8 = 4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r7 = r7[r8];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r6 = r6.append(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r6 = r6.append(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r7 = "-";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r6 = r6.append(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r6 = r6.append(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r7 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r8 = 9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r7 = r7[r8];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r6 = r6.append(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r7 = r3.subSequence(r5, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r7 = r9.a(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r6 = r6.append(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r6 = r6.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        com.whatsapp.util.Log.e(r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        if (r2 == 0) goto L_0x0102;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
    L_0x00cb:
        r6 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r6.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r7 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r8 = 8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r7 = r7[r8];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r6 = r6.append(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r6 = r6.append(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r7 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r8 = 3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r7 = r7[r8];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r6 = r6.append(r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r5 = r6.append(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r6 = "-";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r5 = r5.append(r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r1 = r5.append(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r5 = ")";	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r1 = r1.append(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        r1 = r1.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107 }
    L_0x0102:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0062;
    L_0x0106:
        return;
    L_0x0107:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TextEmojiLabel.a():void");
    }

    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable e) {
            Log.c(e);
            a();
            throw new RuntimeException(e);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.c != null) {
            CharSequence text = getText();
            try {
                if ((text instanceof Spannable) && getLayout() != null) {
                    return this.c.onTouchEvent(this, (Spannable) text, motionEvent) | onTouchEvent;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        return onTouchEvent;
    }

    public TextEmojiLabel(Context context) {
        super(context);
        try {
            if (VERSION.SDK_INT < 11) {
                if (!b) {
                    return;
                }
            }
            setSpannableFactory(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setText(java.lang.CharSequence r7, android.widget.TextView.BufferType r8) {
        /*
        r6_this = this;
        r0 = 0;
        r3 = com.whatsapp.App.az;
        r1 = b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005a }
        if (r1 == 0) goto L_0x003a;
    L_0x0007:
        if (r7 == 0) goto L_0x003a;
    L_0x0009:
        r1 = "\u25a1";
        r1 = 0;
        r5 = r0;
        r0 = r1;
        r1 = r5;
    L_0x000f:
        r2 = r7.length();
        if (r1 >= r2) goto L_0x0037;
    L_0x0015:
        r2 = r7.charAt(r1);
        r4 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r4) goto L_0x0031;
    L_0x001e:
        r4 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r2 > r4) goto L_0x0031;
    L_0x0023:
        if (r0 != 0) goto L_0x002a;
    L_0x0025:
        r0 = new android.text.SpannableStringBuilder;
        r0.<init>(r7);
    L_0x002a:
        r2 = r1 + 1;
        r4 = "\u25a1";
        r0.replace(r1, r2, r4);
    L_0x0031:
        r2 = r0;
        r0 = r1 + 1;
        if (r3 == 0) goto L_0x0064;
    L_0x0036:
        r0 = r2;
    L_0x0037:
        if (r0 == 0) goto L_0x003a;
    L_0x0039:
        r7 = r0;
    L_0x003a:
        r6.d = r7;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005c }
        r6.a = r8;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005c }
        r0 = 0;
        r6.f = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005c }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005c }
        r1 = 11;
        if (r0 >= r1) goto L_0x004b;
    L_0x0047:
        r0 = b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005e }
        if (r0 == 0) goto L_0x0056;
    L_0x004b:
        r0 = r7 instanceof android.text.Spanned;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0060 }
        if (r0 == 0) goto L_0x0056;
    L_0x004f:
        r0 = android.widget.TextView.BufferType.SPANNABLE;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0062 }
        super.setText(r7, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0062 }
        if (r3 == 0) goto L_0x0059;
    L_0x0056:
        super.setText(r7, r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0062 }
    L_0x0059:
        return;
    L_0x005a:
        r0 = move-exception;
        throw r0;
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r1 = r0;
        r0 = r2;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TextEmojiLabel.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void");
    }

    public TextEmojiLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (VERSION.SDK_INT < 11) {
                if (!b) {
                    return;
                }
            }
            setSpannableFactory(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public TextEmojiLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (VERSION.SDK_INT < 11) {
                if (!b) {
                    return;
                }
            }
            setSpannableFactory(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    static {
        String[] strArr = new String[13];
        String str = "6~Wl_/tEqV#yJt\u0015/~NkO0~\u001e8";
        boolean z = true;
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
                        i3 = 66;
                        break;
                    case ay.f /*1*/:
                        i3 = 27;
                        break;
                    case ay.n /*2*/:
                        i3 = 47;
                        break;
                    case ay.p /*3*/:
                        i3 = 24;
                        break;
                    default:
                        i3 = 58;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "n;";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "b3";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "b3";
                    i = 4;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "6~Wl\u0000b";
                    z = true;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ".rA}e!tZvNx;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "/~NkO0~KoS&oG\"\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ".rA}\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "k!\u000f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = ".rA}\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "6~Wl_/tEqV#yJt\u0015/~NkO0~\u000f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "6~Wl_/tEqV#yJt\u0015/~NkO0~\u000f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = false;
                    try {
                        Class cls = Layout.class;
                        char[] toCharArray2 = "2i@{_1h{wi7k_wH6^BwP+".toCharArray();
                        int length2 = toCharArray2.length;
                        char[] cArr2 = toCharArray2;
                        for (int i4 = 0; length2 > i4; i4++) {
                            int i5;
                            char c2 = cArr2[i4];
                            switch (i4 % 5) {
                                case PBE.MD5 /*0*/:
                                    i5 = 66;
                                    break;
                                case ay.f /*1*/:
                                    i5 = 27;
                                    break;
                                case ay.n /*2*/:
                                    i5 = 47;
                                    break;
                                case ay.p /*3*/:
                                    i5 = 24;
                                    break;
                                default:
                                    i5 = 58;
                                    break;
                            }
                            cArr2[i4] = (char) (i5 ^ c2);
                        }
                        String intern = new String(cArr2).intern();
                        cls.getDeclaredMethod(intern, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE});
                        b = true;
                    } catch (SecurityException e) {
                    } catch (NoSuchMethodException e2) {
                    }
                    e = new sr();
                default:
                    strArr2[i] = str;
                    str = "rc";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }
}
