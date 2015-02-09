package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import com.whatsapp.util.bd;
import java.text.NumberFormat;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ConversationRowLocation extends ConversationRow {
    private static int L;
    private static final String[] T;
    private final ImageView J;
    private final Button K;
    private final TextView M;
    private final TextView N;
    private final View O;
    private final View P;
    private q7 Q;
    private MediaData R;
    private final TextEmojiLabel S;

    public void a(b bVar, boolean z) {
        if (bVar != this.w || z) {
            b(bVar);
        }
        super.a(bVar, z);
    }

    public void g() {
        b(this.w);
        super.g();
    }

    protected int d() {
        return R.layout.conversation_location_row_left;
    }

    private static int b() {
        if (L < 0) {
            try {
                L = App.p.getPackageManager().getPackageInfo(T[3], 128).versionCode;
            } catch (NameNotFoundException e) {
                L = 0;
            }
        }
        return L;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.whatsapp.protocol.b r12) {
        /*
        r11_this = this;
        r6 = 0;
        r3 = 0;
        r10 = 1;
        r9 = 8;
        r8 = 0;
        r4 = com.whatsapp.App.az;
        r0 = r12.G;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 == 0) goto L_0x0023;
    L_0x000f:
        r0 = r12.K;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 == 0) goto L_0x0023;
    L_0x0015:
        r0 = r11.K;
        r1 = r11.Q;
        r0.setOnClickListener(r1);
        r0 = r11.K;
        r1 = r11.H;
        r0.setOnLongClickListener(r1);
    L_0x0023:
        r0 = 2131427707; // 0x7f0b017b float:1.8477038E38 double:1.0530652066E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        if (r0 == 0) goto L_0x0082;
    L_0x002e:
        r1 = r11.y;
        if (r1 == 0) goto L_0x0082;
    L_0x0032:
        r1 = r12.e;
        r1 = r1.b;
        if (r1 != 0) goto L_0x007a;
    L_0x0038:
        r1 = r11.k;
        if (r1 == 0) goto L_0x007a;
    L_0x003c:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r1 = com.whatsapp.App.as();
        if (r1 == 0) goto L_0x0252;
    L_0x0047:
        r1 = "";
    L_0x0049:
        r2 = r2.append(r1);
        r1 = r11.getContext();
        r6 = com.whatsapp.App.f(r12);
        r5 = com.whatsapp.util.bm.m(r1, r6);
        r1 = com.whatsapp.App.as();
        if (r1 == 0) goto L_0x0256;
    L_0x005f:
        r1 = " ";
    L_0x0061:
        r1 = r5.concat(r1);
        r1 = r2.append(r1);
        r1 = r1.toString();
        r0.setText(r1);
        r0.setVisibility(r8);
        r1 = r11.y;
        r1.setVisibility(r9);
        if (r4 == 0) goto L_0x0082;
    L_0x007a:
        r0.setVisibility(r9);
        r1 = r11.y;
        r1.setVisibility(r8);
    L_0x0082:
        r1 = r12.A;
        r1 = (com.whatsapp.MediaData) r1;
        r11.R = r1;
        r1 = r12.H;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x025a;
    L_0x0090:
        r1 = r12.H;
        r2 = "\n";
        r1 = r1.split(r2);
        r2 = r1;
    L_0x0099:
        if (r2 == 0) goto L_0x009e;
    L_0x009b:
        r1 = r2.length;
        if (r1 != 0) goto L_0x00b9;
    L_0x009e:
        r1 = r11.S;
        r1.setVisibility(r9);
        r1 = r11.N;
        r1.setVisibility(r9);
        r1 = r11.M;
        r1.setVisibility(r8);
        if (r0 == 0) goto L_0x00b2;
    L_0x00af:
        r0.setVisibility(r9);
    L_0x00b2:
        r0 = r11.y;
        r0.setVisibility(r8);
        if (r4 == 0) goto L_0x017a;
    L_0x00b9:
        r0 = r11.S;
        r0.setVisibility(r8);
        r0 = r12.t;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0119;
    L_0x00c6:
        r0 = r2.length;
        if (r0 <= r10) goto L_0x00d7;
    L_0x00c9:
        r0 = r2[r10];
        r1 = r2[r8];
        r0 = r0.startsWith(r1);
        if (r0 == 0) goto L_0x00d7;
    L_0x00d3:
        r0 = r2[r10];
        if (r4 == 0) goto L_0x00d9;
    L_0x00d7:
        r0 = r12.H;
    L_0x00d9:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r5 = T;
        r5 = r5[r10];
        r1 = r1.append(r5);
        r5 = T;
        r6 = 2;
        r5 = r5[r6];
        r6 = "+";
        r0 = r0.replaceAll(r5, r6);
        r0 = android.net.Uri.encode(r0);
        r0 = r1.append(r0);
        r1 = T;
        r1 = r1[r8];
        r0 = r0.append(r1);
        r6 = r12.K;
        r0 = r0.append(r6);
        r1 = ",";
        r0 = r0.append(r1);
        r6 = r12.G;
        r0 = r0.append(r6);
        r0 = r0.toString();
        if (r4 == 0) goto L_0x011b;
    L_0x0119:
        r0 = r12.t;
    L_0x011b:
        r1 = new android.text.SpannableStringBuilder;
        r5 = r2[r8];
        r1.<init>(r5);
        r5 = new com.whatsapp.o;
        r5.<init>(r0);
        r6 = r2[r8];
        r6 = r6.length();
        r7 = 18;
        r1.setSpan(r5, r8, r6, r7);
        r5 = r11.S;
        r6 = r2[r8];
        r7 = a8;
        r1 = com.whatsapp.ConversationRowText.a(r6, r7, r1);
        r6 = android.widget.TextView.BufferType.SPANNABLE;
        r5.setText(r1, r6);
        r1 = r11.N;
        r1.setVisibility(r8);
        r1 = r2.length;
        if (r1 <= r10) goto L_0x0164;
    L_0x0149:
        r1 = r2[r10];
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x0164;
    L_0x0151:
        r1 = r2[r10];
        r5 = a8;
        r1 = com.whatsapp.ConversationRowText.a(r1, r5, r3);
        r5 = r11.N;
        if (r1 != 0) goto L_0x015f;
    L_0x015d:
        r1 = r2[r10];
    L_0x015f:
        r5.setText(r1);
        if (r4 == 0) goto L_0x016b;
    L_0x0164:
        r1 = r11.N;
        r2 = "";
        r1.setText(r2);
    L_0x016b:
        r1 = new com.whatsapp.q0;
        r1.<init>(r11, r0);
        r0 = r11.N;
        r0.setOnClickListener(r1);
        r0 = r11.M;
        r0.setVisibility(r9);
    L_0x017a:
        r0 = r11.O;
        if (r0 == 0) goto L_0x0183;
    L_0x017e:
        r0 = r11.O;
        r0.setVisibility(r8);
    L_0x0183:
        r0 = r11.R;
        r0 = r0.transferring;
        if (r0 == 0) goto L_0x01b1;
    L_0x0189:
        r0 = r12.e;
        r0 = r0.b;
        if (r0 == 0) goto L_0x01aa;
    L_0x018f:
        r0 = r11.M;
        r0.setVisibility(r9);
        r0 = r11.S;
        r0.setVisibility(r9);
        r0 = r11.N;
        r0.setVisibility(r9);
        r0 = r11.P;
        r0.setVisibility(r8);
        r0 = r11.K;
        r0.setOnClickListener(r3);
        if (r4 == 0) goto L_0x021d;
    L_0x01aa:
        r0 = r11.P;
        r0.setVisibility(r8);
        if (r4 == 0) goto L_0x021d;
    L_0x01b1:
        r0 = r12.e;
        r0 = r0.b;
        if (r0 == 0) goto L_0x01bd;
    L_0x01b7:
        r0 = r11.R;
        r0 = r0.transferred;
        if (r0 == 0) goto L_0x01ea;
    L_0x01bd:
        r0 = r12.H;
        if (r0 == 0) goto L_0x01cb;
    L_0x01c1:
        r0 = "";
        r1 = r12.H;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x01d0;
    L_0x01cb:
        r0 = r11.M;
        r0.setVisibility(r8);
    L_0x01d0:
        r0 = r11.P;
        if (r0 == 0) goto L_0x01d9;
    L_0x01d4:
        r0 = r11.P;
        r0.setVisibility(r9);
    L_0x01d9:
        r0 = r11.M;
        r1 = r11.Q;
        r0.setOnClickListener(r1);
        r0 = r11.M;
        r1 = 2131625073; // 0x7f0e0471 float:1.8877344E38 double:1.0531627184E-314;
        r0.setText(r1);
        if (r4 == 0) goto L_0x021d;
    L_0x01ea:
        r0 = r12.H;
        if (r0 == 0) goto L_0x01f8;
    L_0x01ee:
        r0 = "";
        r1 = r12.H;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x01fd;
    L_0x01f8:
        r0 = r11.M;
        r0.setVisibility(r8);
    L_0x01fd:
        r0 = r11.P;
        if (r0 == 0) goto L_0x0206;
    L_0x0201:
        r0 = r11.P;
        r0.setVisibility(r9);
    L_0x0206:
        r0 = r11.M;
        r1 = 2131624799; // 0x7f0e035f float:1.8876788E38 double:1.053162583E-314;
        r0.setText(r1);
        r0 = r11.M;
        r1 = new com.whatsapp.qu;
        r1.<init>(r11, r3);
        r0.setOnClickListener(r1);
        r0 = r11.K;
        r0.setOnClickListener(r3);
    L_0x021d:
        r0 = com.whatsapp.util.bo.b(r12);
        if (r0 == 0) goto L_0x0237;
    L_0x0223:
        r1 = r11.J;
        r2 = new com.whatsapp.ex;
        r3 = r11.getContext();
        r5 = r12.e;
        r5 = r5.b;
        r2.<init>(r3, r0, r5);
        r1.setImageDrawable(r2);
        if (r4 == 0) goto L_0x0251;
    L_0x0237:
        r0 = r11.J;
        r1 = new com.whatsapp.ex;
        r2 = r11.getContext();
        r3 = r11.getContext();
        r3 = com.whatsapp.util.b0.g(r3);
        r4 = r12.e;
        r4 = r4.b;
        r1.<init>(r2, r3, r4);
        r0.setImageDrawable(r1);
    L_0x0251:
        return;
    L_0x0252:
        r1 = " ";
        goto L_0x0049;
    L_0x0256:
        r1 = "";
        goto L_0x0061;
    L_0x025a:
        r2 = r3;
        goto L_0x0099;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowLocation.b(com.whatsapp.protocol.b):void");
    }

    static {
        String[] strArr = new String[10];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "MYW\u001b\u0019";
        int i2 = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 107;
                        break;
                    case ay.f /*1*/:
                        i4 = 42;
                        break;
                    case ay.n /*2*/:
                        i4 = 59;
                        break;
                    case ay.p /*3*/:
                        i4 = 119;
                        break;
                    default:
                        i4 = 36;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "7Y\u0010";
                    i = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\bEVYC\u0004E\\\u001bAEKU\u0013V\u0004C_YE\u001bZHYI\nZH";
                    i = 3;
                    strArr2 = strArr3;
                    i2 = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0003^O\u0007WQ\u0005\u0014\u001aE\u001bY\u0015\u0010K\u0004MW\u0012\n\bEVXI\nZHHUVFT\u0014\u001eC";
                    i2 = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0003^O\u0007WQ\u0005\u0014\u001aE\u001bY\u0015\u0010K\u0004MW\u0012\n\bEVXI\nZHHUVFT\u0014\u001e";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\nD_\u0005K\u0002N\u0015\u001eJ\u001fOU\u0003\n\nIO\u001eK\u0005\u0004m>a<";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "K\u0002";
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0003^O\u0007WQ\u0005\u0014\u001aE\u001bY\u0015\u0010K\u0004MW\u0012\n\bEVXI\nZHHUV";
                    i2 = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "MP\u0006F\u0012";
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    T = strArr3;
                    L = -1;
                default:
                    strArr2[i] = str;
                    str = "\u0003^O\u0007WQ\u0005\u0014\u001aE\u001bY\u0015\u0010K\u0004MW\u0012\n\bEVXI\nZHHUV";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    protected int l() {
        return R.layout.conversation_location_row_right;
    }

    public static void a(Context context, double d, double d2, String str) {
        Uri parse;
        if (!TextUtils.isEmpty(str)) {
            str = str.replace("(", "[").replace(")", "]");
        }
        if (App.ag()) {
            parse = Uri.parse(T[8] + d + "," + d2);
        } else {
            String str2 = T[5] + d + "," + d2;
            if (!TextUtils.isEmpty(str) && (VERSION.SDK_INT > 10 || b() < 614050000)) {
                str2 = str2 + T[7] + str + ")";
            }
            parse = Uri.parse(str2);
        }
        if (NumberFormat.getInstance().format(1.1d).indexOf(",") > 0 && VERSION.SDK_INT >= 14 && b() >= 700000000 && b() < 702000000) {
            parse = Uri.parse(T[4] + d + "," + d2 + T[9]);
        }
        context.startActivity(new Intent(T[6], parse));
    }

    ConversationRowLocation(Context context, b bVar) {
        super(context, bVar);
        this.Q = new q7(this, null);
        this.J = (ImageView) findViewById(R.id.thumb);
        this.K = (Button) findViewById(R.id.thumb_button);
        this.M = (TextView) findViewById(R.id.control_btn);
        this.P = findViewById(R.id.map_progressbar);
        this.S = (TextEmojiLabel) findViewById(R.id.place_name);
        this.N = (TextView) findViewById(R.id.place_address);
        this.O = findViewById(R.id.message_info_holder);
        this.S.setLinkHandler(new _h());
        this.S.setAutoLinkMask(0);
        this.S.setLinksClickable(false);
        this.S.setFocusable(false);
        this.S.setClickable(false);
        this.S.setLongClickable(false);
        this.K.setBackgroundDrawable(new bd(context.getResources().getDrawable(bVar.e.b ? R.drawable.media_overlay_outgoing : R.drawable.media_overlay_incoming)));
        b(bVar);
    }
}
