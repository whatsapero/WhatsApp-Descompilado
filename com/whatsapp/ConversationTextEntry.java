package com.whatsapp;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.text.Editable.Factory;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

public class ConversationTextEntry extends EditText {
    private static final Factory a;
    private static boolean c;
    private static final String[] z;
    private int b;

    public void setInputEnterAction(int i) {
        this.b = i;
        setRawInputType(180225);
        int i2 = 4;
        if (i == 0) {
            i2 = 1073741828;
        }
        try {
            if (VERSION.SDK_INT >= 14 && z[0].equals(Secure.getString(App.e, z[1]))) {
                i2 |= 268435456;
            }
            setImeOptions(i2);
        } catch (SecurityException e) {
            throw e;
        }
    }

    public void setInputEnterSend(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        setInputEnterAction(i);
    }

    public ConversationTextEntry(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            if (VERSION.SDK_INT < 11) {
                if (!c) {
                    return;
                }
            }
            setEditableFactory(a);
        } catch (SecurityException e) {
            throw e;
        }
    }

    public ConversationTextEntry(Context context) {
        super(context);
        try {
            if (VERSION.SDK_INT < 11) {
                if (!c) {
                    return;
                }
            }
            setEditableFactory(a);
        } catch (SecurityException e) {
            throw e;
        }
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
        r7 = 80;
        r8 = 57;
        r0 = 2;
        r4 = 1;
        r1 = 0;
        r3 = new java.lang.String[r0];
        r2 = "3V\u000ey\u0003$ZM6\u00054K\f>\u000f~Q\u00174\u0002=\\Ly#\u0004z*\u001a.\u0003\\\u0011!\u00023\\";
        r0 = -1;
        r5 = r3;
        r6 = r3;
        r3 = r1;
    L_0x000f:
        r2 = r2.toCharArray();
        r9 = r2.length;
        r10 = r9;
        r11 = r1;
        r9 = r2;
    L_0x0017:
        if (r10 > r11) goto L_0x006a;
    L_0x0019:
        r2 = new java.lang.String;
        r2.<init>(r9);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002e;
            default: goto L_0x0025;
        };
    L_0x0025:
        r5[r3] = r2;
        r0 = "4\\\u00056\u001e<M<>\u0005 L\u0017\b\u00065M\u000b8\u000f";
        r2 = r0;
        r3 = r4;
        r5 = r6;
        r0 = r1;
        goto L_0x000f;
    L_0x002e:
        r5[r3] = r2;
        z = r6;
        c = r1;
        r4 = android.text.Layout.class;	 Catch:{ SecurityException -> 0x00a2, NoSuchMethodException -> 0x00a0 }
        r0 = " K\f4\u000e#J788%I\u00138\u0019$|\u000e8\u00019";	 Catch:{ SecurityException -> 0x00a2, NoSuchMethodException -> 0x00a0 }
        r0 = r0.toCharArray();
        r2 = r0.length;
        r3 = r1;
        r1 = r0;
    L_0x003f:
        if (r2 > r3) goto L_0x0085;
    L_0x0041:
        r0 = new java.lang.String;
        r0.<init>(r1);
        r0 = r0.intern();
        r1 = 3;
        r1 = new java.lang.Class[r1];	 Catch:{ SecurityException -> 0x00a2, NoSuchMethodException -> 0x00a0 }
        r2 = 0;	 Catch:{ SecurityException -> 0x00a2, NoSuchMethodException -> 0x00a0 }
        r3 = java.lang.CharSequence.class;	 Catch:{ SecurityException -> 0x00a2, NoSuchMethodException -> 0x00a0 }
        r1[r2] = r3;	 Catch:{ SecurityException -> 0x00a2, NoSuchMethodException -> 0x00a0 }
        r2 = 1;	 Catch:{ SecurityException -> 0x00a2, NoSuchMethodException -> 0x00a0 }
        r3 = java.lang.Integer.TYPE;	 Catch:{ SecurityException -> 0x00a2, NoSuchMethodException -> 0x00a0 }
        r1[r2] = r3;	 Catch:{ SecurityException -> 0x00a2, NoSuchMethodException -> 0x00a0 }
        r2 = 2;	 Catch:{ SecurityException -> 0x00a2, NoSuchMethodException -> 0x00a0 }
        r3 = java.lang.Integer.TYPE;	 Catch:{ SecurityException -> 0x00a2, NoSuchMethodException -> 0x00a0 }
        r1[r2] = r3;	 Catch:{ SecurityException -> 0x00a2, NoSuchMethodException -> 0x00a0 }
        r4.getDeclaredMethod(r0, r1);	 Catch:{ SecurityException -> 0x00a2, NoSuchMethodException -> 0x00a0 }
        r0 = 1;	 Catch:{ SecurityException -> 0x00a2, NoSuchMethodException -> 0x00a0 }
        c = r0;	 Catch:{ SecurityException -> 0x00a2, NoSuchMethodException -> 0x00a0 }
    L_0x0062:
        r0 = new com.whatsapp.x9;
        r0.<init>();
        a = r0;
        return;
    L_0x006a:
        r12 = r9[r11];
        r2 = r11 % 5;
        switch(r2) {
            case 0: goto L_0x007b;
            case 1: goto L_0x007d;
            case 2: goto L_0x007f;
            case 3: goto L_0x0082;
            default: goto L_0x0071;
        };
    L_0x0071:
        r2 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
    L_0x0073:
        r2 = r2 ^ r12;
        r2 = (char) r2;
        r9[r11] = r2;
        r2 = r11 + 1;
        r11 = r2;
        goto L_0x0017;
    L_0x007b:
        r2 = r7;
        goto L_0x0073;
    L_0x007d:
        r2 = r8;
        goto L_0x0073;
    L_0x007f:
        r2 = 99;
        goto L_0x0073;
    L_0x0082:
        r2 = 87;
        goto L_0x0073;
    L_0x0085:
        r5 = r1[r3];
        r0 = r3 % 5;
        switch(r0) {
            case 0: goto L_0x0096;
            case 1: goto L_0x0098;
            case 2: goto L_0x009a;
            case 3: goto L_0x009d;
            default: goto L_0x008c;
        };
    L_0x008c:
        r0 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
    L_0x008e:
        r0 = r0 ^ r5;
        r0 = (char) r0;
        r1[r3] = r0;
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x003f;
    L_0x0096:
        r0 = r7;
        goto L_0x008e;
    L_0x0098:
        r0 = r8;
        goto L_0x008e;
    L_0x009a:
        r0 = 99;
        goto L_0x008e;
    L_0x009d:
        r0 = 87;
        goto L_0x008e;
    L_0x00a0:
        r0 = move-exception;
        goto L_0x0062;
    L_0x00a2:
        r0 = move-exception;
        goto L_0x0062;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationTextEntry.<clinit>():void");
    }

    public void setInputEnterDone(boolean z) {
        int i;
        if (z) {
            i = 6;
        } else {
            i = 0;
        }
        setInputEnterAction(i);
    }

    public ConversationTextEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            if (VERSION.SDK_INT < 11) {
                if (!c) {
                    return;
                }
            }
            setEditableFactory(a);
        } catch (SecurityException e) {
            throw e;
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.b != 0) {
            int i = editorInfo.imeOptions & 255;
            try {
                if ((this.b & i) != 0) {
                    editorInfo.imeOptions = i ^ editorInfo.imeOptions;
                    editorInfo.imeOptions |= this.b;
                }
                try {
                    if ((editorInfo.imeOptions & 1073741824) != 0) {
                        editorInfo.imeOptions &= -1073741825;
                    }
                } catch (SecurityException e) {
                    throw e;
                }
            } catch (SecurityException e2) {
                throw e2;
            }
        }
        return onCreateInputConnection;
    }
}
