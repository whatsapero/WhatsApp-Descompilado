package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import com.whatsapp.util.a5;
import com.whatsapp.util.a7;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ConversationRowText extends ConversationRow {
    private static final String[] K;
    private final TextEmojiLabel J;

    static {
        String[] strArr = new String[3];
        String str = "\u0002hB\u00142#o\u001f\u0002*25\u0002\u0006.";
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
                        i3 = 66;
                        break;
                    case ay.f /*1*/:
                        i3 = 27;
                        break;
                    case ay.n /*2*/:
                        i3 = 108;
                        break;
                    case ay.p /*3*/:
                        i3 = 99;
                        break;
                    default:
                        i3 = 90;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "b;";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    K = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0002hB\u00142#o\u001f\u0002*25\u0002\u0006.";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(b bVar, boolean z) {
        int i;
        if (bVar != this.w) {
            i = 1;
        } else {
            i = 0;
        }
        boolean z2 = i | z;
        super.a(bVar, z2);
        if (z2) {
            b(bVar);
        }
    }

    public void f() {
        super.f();
        if (App.as()) {
            this.J.setPadding(this.J.getPaddingLeft(), this.J.getPaddingTop(), this.J.getPaddingRight() * 4, this.J.getPaddingBottom());
        }
    }

    private void b(b bVar) {
        int measuredWidth;
        String f = bVar.f();
        if (App.as()) {
            boolean z;
            if (f != null) {
                String substring;
                boolean z2;
                int lastIndexOf = f.lastIndexOf(10);
                if (lastIndexOf > 0) {
                    substring = f.substring(lastIndexOf);
                } else {
                    substring = f;
                }
                if (b7.c.isRtl(substring)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                z = z2;
            } else {
                z = true;
            }
            View findViewById = findViewById(R.id.date_wrapper);
            LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
            if (z) {
                findViewById.measure(MeasureSpec.makeMeasureSpec(-2, 0), MeasureSpec.makeMeasureSpec(-2, 0));
                measuredWidth = findViewById.getMeasuredWidth();
            } else {
                measuredWidth = 0;
            }
            if (layoutParams.leftMargin != (-measuredWidth)) {
                ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                layoutParams2.leftMargin = -measuredWidth;
                layoutParams2.gravity = 80;
                findViewById.setLayoutParams(layoutParams2);
            }
        } else {
            measuredWidth = 0;
        }
        setMessageText(f, this.J, measuredWidth, bVar);
        this.J.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.J.clearAnimation();
        if ((f.length() == 1 && (f.charAt(0) == '\ue022' || f.charAt(0) == '\u2764')) || (f.length() == 2 && f.charAt(0) == '\u2764' && f.charAt(1) == '\ufe0f')) {
            this.J.setCompoundDrawablesWithIntrinsicBounds(R.drawable.large_e022, 0, 0, 0);
            Animation scaleAnimation = new ScaleAnimation(0.85f, 0.8f, 0.85f, 0.8f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setInterpolator(new DecelerateInterpolator());
            scaleAnimation.setDuration(500);
            scaleAnimation.setRepeatMode(2);
            scaleAnimation.setRepeatCount(-1);
            this.J.startAnimation(scaleAnimation);
            this.J.setText("");
        }
        ImageView imageView = (ImageView) findViewById(R.id.message_image);
        if (imageView != null) {
            imageView.setVisibility(8);
            if (bVar.A != null) {
                byte[] bArr = (byte[]) bVar.A;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                if (decodeByteArray != null) {
                    imageView.setVisibility(0);
                    float fontSpacing = this.J.getPaint().getFontSpacing() * 3.0f;
                    imageView.setImageBitmap(Bitmap.createScaledBitmap(decodeByteArray, (int) ((((float) decodeByteArray.getWidth()) * fontSpacing) / ((float) decodeByteArray.getHeight())), (int) fontSpacing, true));
                    a7.a(this.J.getText(), imageView, this.J, ((Activity) getContext()).getWindowManager().getDefaultDisplay());
                }
            }
        }
    }

    public void g() {
        b(this.w);
        super.g();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.whatsapp.protocol.b r8) {
        /*
        r2 = 1;
        r1 = 0;
        r3 = com.whatsapp.App.az;
        r0 = r8.e;
        r0 = r0.b;
        if (r0 == 0) goto L_0x000c;
    L_0x000a:
        if (r3 == 0) goto L_0x00ad;
    L_0x000c:
        r0 = r8.e;
        r0 = r0.c;
        r4 = com.whatsapp.v.b(r0);
        r0 = r4.w();
        if (r0 == 0) goto L_0x006e;
    L_0x001a:
        r0 = r8.F;
        if (r0 == 0) goto L_0x006c;
    L_0x001e:
        r0 = com.whatsapp.App.P;
        r5 = r8.F;
        r5 = r0.a(r5);
        r0 = com.whatsapp.App.P;
        r6 = r4.f();
        r6 = r0.a(r6);
        r0 = com.whatsapp.App.an;
        if (r0 == 0) goto L_0x00a2;
    L_0x0034:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r7 = com.whatsapp.App.an;
        r7 = r7.jabber_id;
        r0 = r0.append(r7);
        r7 = K;
        r7 = r7[r2];
        r0 = r0.append(r7);
        r0 = r0.toString();
    L_0x004d:
        r7 = r4.e;
        r7 = com.whatsapp.bd.a(r7);
        if (r7 != 0) goto L_0x0069;
    L_0x0055:
        if (r6 == 0) goto L_0x0063;
    L_0x0057:
        r7 = r6.h;
        if (r7 != 0) goto L_0x0069;
    L_0x005b:
        r6 = r6.e;
        r0 = r0.equals(r6);
        if (r0 != 0) goto L_0x0069;
    L_0x0063:
        if (r5 == 0) goto L_0x00a5;
    L_0x0065:
        r0 = r5.h;
        if (r0 == 0) goto L_0x00a5;
    L_0x0069:
        r0 = r2;
    L_0x006a:
        if (r3 == 0) goto L_0x00ab;
    L_0x006c:
        if (r3 == 0) goto L_0x00a1;
    L_0x006e:
        r0 = r4.h;
        if (r0 == 0) goto L_0x00a7;
    L_0x0072:
        r0 = r2;
    L_0x0073:
        if (r0 != 0) goto L_0x00ab;
    L_0x0075:
        r4 = r8.e;
        r4 = r4.c;
        if (r4 == 0) goto L_0x00ab;
    L_0x007b:
        r0 = r8.e;
        r0 = r0.c;
        r4 = K;
        r4 = r4[r1];
        r4 = r0.indexOf(r4);
        r0 = r2;
        r2 = r1;
    L_0x0089:
        if (r2 >= r4) goto L_0x00a0;
    L_0x008b:
        r5 = r8.e;
        r5 = r5.c;
        r5 = r5.charAt(r2);
        r5 = java.lang.Character.isDigit(r5);
        if (r5 == 0) goto L_0x009c;
    L_0x0099:
        if (r3 == 0) goto L_0x00a9;
    L_0x009b:
        r0 = r1;
    L_0x009c:
        r2 = r2 + 1;
        if (r3 == 0) goto L_0x0089;
    L_0x00a0:
        r1 = r0;
    L_0x00a1:
        return r1;
    L_0x00a2:
        r0 = "";
        goto L_0x004d;
    L_0x00a5:
        r0 = r1;
        goto L_0x006a;
    L_0x00a7:
        r0 = r1;
        goto L_0x0073;
    L_0x00a9:
        r0 = r1;
        goto L_0x00a0;
    L_0x00ab:
        r1 = r0;
        goto L_0x00a1;
    L_0x00ad:
        r1 = r2;
        goto L_0x00a1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowText.a(com.whatsapp.protocol.b):boolean");
    }

    public static void setMessageText(String str, TextEmojiLabel textEmojiLabel, int i, b bVar) {
        CharSequence spannableStringBuilder;
        int i2 = App.az;
        b7.a((TextView) textEmojiLabel, (CharSequence) str);
        textEmojiLabel.setTextSize(b(textEmojiLabel.getResources()));
        SpannableStringBuilder a = a(str, a8, a5.a(str, textEmojiLabel.getContext(), textEmojiLabel.getPaint(), 1.4f));
        if (i != 0) {
            if (a == null) {
                a = new SpannableStringBuilder(str);
            }
            a.append(K[2]);
            a.setSpan(new d1(i - ((int) textEmojiLabel.getPaint().measureText(" ")), (int) (textEmojiLabel.getTextSize() - textEmojiLabel.getResources().getDisplayMetrics().scaledDensity)), a.length() - 1, a.length(), 33);
        }
        if (a == null) {
            spannableStringBuilder = new SpannableStringBuilder(str);
        } else {
            Object obj = a;
        }
        Linkify.addLinks(spannableStringBuilder, 15);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        if (uRLSpanArr != null && uRLSpanArr.length > 0) {
            int i3;
            int spanEnd;
            if (a(bVar)) {
                int length = uRLSpanArr.length;
                i3 = 0;
                while (i3 < length) {
                    URLSpan uRLSpan = uRLSpanArr[i3];
                    spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    if (spannableStringBuilder.length() > spanEnd && spannableStringBuilder.charAt(spanEnd) == '/') {
                        spanEnd++;
                    }
                    spannableStringBuilder.setSpan(new o(uRLSpan.getURL()), spannableStringBuilder.getSpanStart(uRLSpan), spanEnd, spannableStringBuilder.getSpanFlags(uRLSpan));
                    spanEnd = i3 + 1;
                    if (i2 != 0) {
                        break;
                    }
                    i3 = spanEnd;
                }
            }
            i3 = uRLSpanArr.length;
            spanEnd = 0;
            while (spanEnd < i3) {
                spannableStringBuilder.removeSpan(uRLSpanArr[spanEnd]);
                spanEnd++;
                if (i2 != 0) {
                    break;
                }
            }
            textEmojiLabel.setText(spannableStringBuilder, BufferType.SPANNABLE);
            if (i2 == 0) {
                return;
            }
        }
        textEmojiLabel.setText(spannableStringBuilder);
    }

    protected int d() {
        return R.layout.conversation_text_row_left;
    }

    public static SpannableStringBuilder a(String str, String str2, SpannableStringBuilder spannableStringBuilder) {
        int i = App.az;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return spannableStringBuilder;
        }
        String toLowerCase = str.toLowerCase();
        String toLowerCase2 = str2.toLowerCase();
        int indexOf = toLowerCase.indexOf(toLowerCase2);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        while (indexOf >= 0) {
            if (spannableStringBuilder2 == null) {
                spannableStringBuilder2 = new SpannableStringBuilder(str);
            }
            spannableStringBuilder2.setSpan(new BackgroundColorSpan(-256), indexOf, toLowerCase2.length() + indexOf, 33);
            indexOf = toLowerCase.indexOf(toLowerCase2, indexOf + 1);
            if (i != 0) {
                return spannableStringBuilder2;
            }
        }
        return spannableStringBuilder2;
    }

    ConversationRowText(Context context, b bVar) {
        super(context, bVar);
        this.J = (TextEmojiLabel) findViewById(R.id.message_text);
        this.J.setLinkHandler(new _h());
        this.J.setAutoLinkMask(0);
        this.J.setLinksClickable(false);
        this.J.setFocusable(false);
        this.J.setClickable(false);
        this.J.setLongClickable(false);
        b(bVar);
    }

    protected int l() {
        return R.layout.conversation_text_row_right;
    }
}
