package com.whatsapp;

import android.telephony.PhoneNumberUtils;
import android.text.TextWatcher;
import com.google.as;
import com.google.c8;
import java.util.Locale;

public class a5_ implements TextWatcher {
    private boolean a;
    private int b;
    private boolean c;
    private as d;

    private String a(char c, boolean z) {
        if (!z) {
            return this.d.d(c);
        }
        try {
            return this.d.a(c);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void beforeTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
        r3_this = this;
        r0 = com.whatsapp.App.az;
        r1 = r3.c;	 Catch:{ IllegalArgumentException -> 0x000b }
        if (r1 != 0) goto L_0x000a;
    L_0x0006:
        r1 = r3.a;	 Catch:{ IllegalArgumentException -> 0x000d }
        if (r1 == 0) goto L_0x000f;
    L_0x000a:
        return;
    L_0x000b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x000d }
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        if (r6 != 0) goto L_0x001c;
    L_0x0011:
        r1 = r4.length();	 Catch:{ IllegalArgumentException -> 0x0040 }
        if (r1 != r5) goto L_0x001c;
    L_0x0017:
        r1 = 1;
        r3.b = r1;	 Catch:{ IllegalArgumentException -> 0x0042 }
        if (r0 == 0) goto L_0x000a;
    L_0x001c:
        if (r7 != 0) goto L_0x002d;
    L_0x001e:
        r1 = r5 + r6;
        r2 = r4.length();	 Catch:{ IllegalArgumentException -> 0x0046 }
        if (r1 != r2) goto L_0x002d;
    L_0x0026:
        if (r6 <= 0) goto L_0x002d;
    L_0x0028:
        r1 = 0;
        r3.b = r1;	 Catch:{ IllegalArgumentException -> 0x004a }
        if (r0 == 0) goto L_0x000a;
    L_0x002d:
        if (r6 <= 0) goto L_0x003a;
    L_0x002f:
        r1 = r3.a(r4, r5, r6);	 Catch:{ IllegalArgumentException -> 0x004e }
        if (r1 != 0) goto L_0x003a;
    L_0x0035:
        r1 = 2;
        r3.b = r1;	 Catch:{ IllegalArgumentException -> 0x003e }
        if (r0 == 0) goto L_0x000a;
    L_0x003a:
        r0 = 3;
        r3.b = r0;	 Catch:{ IllegalArgumentException -> 0x003e }
        goto L_0x000a;
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0046 }
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003e }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5_.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    private String a(CharSequence charSequence, int i) {
        char c;
        boolean z;
        String str;
        int i2 = App.az;
        int i3 = i - 1;
        String str2 = null;
        this.d.h();
        int length = charSequence.length();
        int i4 = 0;
        boolean z2 = false;
        char c2 = '\u0000';
        while (i4 < length) {
            char charAt = charSequence.charAt(i4);
            try {
                String str3;
                char c3;
                if (PhoneNumberUtils.isNonSeparator(charAt)) {
                    if (c2 != '\u0000') {
                        str2 = a(c2, z2);
                        z2 = false;
                    }
                    str3 = str2;
                    c = charAt;
                } else {
                    c3 = c2;
                    str3 = str2;
                    c = c3;
                }
                if (i4 == i3) {
                    z2 = true;
                }
                i4++;
                if (i2 != 0) {
                    z = z2;
                    str = str3;
                    break;
                }
                c3 = c;
                str2 = str3;
                c2 = c3;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        z = z2;
        str = str2;
        c = c2;
        return c != '\u0000' ? a(c, z) : str;
    }

    private void a() {
        this.a = true;
        this.d.h();
    }

    public a5_(String str) {
        this.c = false;
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.d = c8.a().j(str);
    }

    public a5_() {
        this(Locale.getDefault().getCountry());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
        r3_this = this;
        r2 = 3;
        r0 = r3.c;	 Catch:{ IllegalArgumentException -> 0x000a }
        if (r0 != 0) goto L_0x0009;
    L_0x0005:
        r0 = r3.a;	 Catch:{ IllegalArgumentException -> 0x000c }
        if (r0 == 0) goto L_0x000e;
    L_0x0009:
        return;
    L_0x000a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x000c }
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r0 = r3.b;	 Catch:{ IllegalArgumentException -> 0x003b }
        if (r0 != r2) goto L_0x001d;
    L_0x0012:
        if (r7 <= 0) goto L_0x001d;
    L_0x0014:
        r0 = r3.a(r4, r5, r7);	 Catch:{ IllegalArgumentException -> 0x003f }
        if (r0 != 0) goto L_0x001d;
    L_0x001a:
        r0 = 2;
        r3.b = r0;	 Catch:{ IllegalArgumentException -> 0x003f }
    L_0x001d:
        r0 = r3.b;	 Catch:{ IllegalArgumentException -> 0x0041 }
        r1 = 1;
        if (r0 != r1) goto L_0x0031;
    L_0x0022:
        if (r7 <= 0) goto L_0x0031;
    L_0x0024:
        r0 = r3.a(r4, r5, r7);	 Catch:{ IllegalArgumentException -> 0x0045 }
        if (r0 == 0) goto L_0x0031;
    L_0x002a:
        r3.a();	 Catch:{ IllegalArgumentException -> 0x0047 }
        r0 = com.whatsapp.App.az;	 Catch:{ IllegalArgumentException -> 0x0047 }
        if (r0 == 0) goto L_0x0009;
    L_0x0031:
        r0 = r3.b;	 Catch:{ IllegalArgumentException -> 0x0039 }
        if (r0 != r2) goto L_0x0009;
    L_0x0035:
        r3.a();	 Catch:{ IllegalArgumentException -> 0x0039 }
        goto L_0x0009;
    L_0x0039:
        r0 = move-exception;
        throw r0;
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0039 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5_.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void afterTextChanged(android.text.Editable r8) {
        /*
        r7_this = this;
        r0 = 1;
        r1 = 0;
        monitor-enter(r7);
        r2 = r7.a;	 Catch:{ IllegalArgumentException -> 0x0011 }
        if (r2 == 0) goto L_0x001a;
    L_0x0007:
        r2 = r8.length();	 Catch:{ IllegalArgumentException -> 0x0013 }
        if (r2 == 0) goto L_0x0018;
    L_0x000d:
        r7.a = r0;	 Catch:{ all -> 0x0015 }
    L_0x000f:
        monitor-exit(r7);
        return;
    L_0x0011:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0013 }
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
    L_0x0018:
        r0 = r1;
        goto L_0x000d;
    L_0x001a:
        r0 = r7.c;	 Catch:{ IllegalArgumentException -> 0x0050 }
        if (r0 != 0) goto L_0x000f;
    L_0x001e:
        r0 = android.text.Selection.getSelectionEnd(r8);	 Catch:{ all -> 0x0015 }
        r3 = r7.a(r8, r0);	 Catch:{ all -> 0x0015 }
        if (r3 == 0) goto L_0x000f;
    L_0x0028:
        r0 = r7.d;	 Catch:{ all -> 0x0015 }
        r6 = r0.e();	 Catch:{ all -> 0x0015 }
        r0 = 1;
        r7.c = r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
        r1 = 0;
        r2 = r8.length();	 Catch:{ IllegalArgumentException -> 0x0052 }
        r4 = 0;
        r5 = r3.length();	 Catch:{ IllegalArgumentException -> 0x0052 }
        r0 = r8;
        r0.replace(r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r0 = r8.toString();	 Catch:{ IllegalArgumentException -> 0x0052 }
        r0 = r3.equals(r0);	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r0 == 0) goto L_0x004c;
    L_0x0049:
        android.text.Selection.setSelection(r8, r6);	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x004c:
        r0 = 0;
        r7.c = r0;	 Catch:{ all -> 0x0015 }
        goto L_0x000f;
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0015 }
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0015 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5_.afterTextChanged(android.text.Editable):void");
    }

    private boolean a(CharSequence charSequence, int i, int i2) {
        int i3 = App.az;
        int i4 = i;
        while (i4 < i + i2) {
            try {
                if (PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                    i4++;
                    if (i3 != 0) {
                        break;
                    }
                }
                return true;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return false;
    }
}
