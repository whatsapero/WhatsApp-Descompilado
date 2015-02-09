package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.bd;
import com.whatsapp.util.bf;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ConversationRowImage extends ConversationRowMedia {
    private static final Drawable O;
    private static final Drawable S;
    private static final Drawable T;
    private static final Drawable U;
    private static bf Y;
    private static final String[] ab;
    private final TextView N;
    private final View P;
    private final TextEmojiLabel Q;
    private final CircularProgressBar R;
    private final View V;
    private final RowImageView W;
    private bf X;

    public class RowImageView extends ImageView {
        private int a;
        private Bitmap b;
        private boolean c;
        private Paint d;
        private int e;
        private boolean f;
        private MediaData g;

        protected void onMeasure(int i, int i2) {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int min = (Math.min(decorView.getWidth(), decorView.getHeight()) * 70) / 100;
            int i3 = (this.a * min) / this.e;
            if (i3 > min) {
                if (App.az != 0) {
                    i3 = min;
                } else {
                    i3 = min;
                    setMeasuredDimension(min, i3);
                }
            }
            if (min * 10 > i3 * 24) {
                i3 = (min * 10) / 24;
            }
            setMeasuredDimension(min, i3);
        }

        static MediaData a(com.whatsapp.ConversationRowImage.RowImageView rowImageView, MediaData mediaData) {
            rowImageView.g = mediaData;
            return mediaData;
        }

        private void a() {
            this.d.setAntiAlias(true);
            this.d.setDither(true);
            this.d.setFilterBitmap(true);
            this.d.setColor(-1);
        }

        public RowImageView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.d = new Paint();
            a();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected void onDraw(android.graphics.Canvas r9) {
            /*
            r8_this = this;
            r7 = 0;
            r1 = com.whatsapp.App.az;
            r0 = r8.d;
            r2 = -1;
            r0.setColor(r2);
            r2 = new android.graphics.Rect;
            r0 = r8.getWidth();
            r3 = r8.getHeight();
            r2.<init>(r7, r7, r0, r3);
            r0 = r8.b;
            if (r0 == 0) goto L_0x00c0;
        L_0x001a:
            r3 = new android.graphics.Rect;
            r0 = r8.b;
            r0 = r0.getWidth();
            r4 = r8.b;
            r4 = r4.getHeight();
            r3.<init>(r7, r7, r0, r4);
            r0 = r8.b;
            r0 = r0.getHeight();
            r4 = r8.b;
            r4 = r4.getWidth();
            if (r0 <= r4) goto L_0x007d;
        L_0x0039:
            r0 = r8.b;
            r0 = r0.getWidth();
            r3.bottom = r0;
            r0 = r8.g;
            r0 = r0.faceY;
            if (r0 <= 0) goto L_0x00f2;
        L_0x0047:
            r0 = r8.g;
            r0 = r0.faceY;
        L_0x004b:
            r4 = r8.e;
            r4 = r4 / 3;
            if (r0 <= r4) goto L_0x007b;
        L_0x0051:
            r4 = r3.bottom;
            r5 = r8.b;
            r5 = r5.getHeight();
            r6 = r8.b;
            r6 = r6.getHeight();
            r0 = r0 * r6;
            r6 = r8.a;
            r0 = r0 / r6;
            r6 = r4 * 2;
            r6 = r6 / 3;
            r0 = r0 + r6;
            r0 = java.lang.Math.min(r5, r0);
            r3.bottom = r0;
            r0 = r3.bottom;
            r0 = r0 - r4;
            r3.top = r0;
            r0 = r3.top;
            if (r0 >= 0) goto L_0x007b;
        L_0x0077:
            r3.top = r7;
            r3.bottom = r4;
        L_0x007b:
            if (r1 == 0) goto L_0x00b9;
        L_0x007d:
            r0 = r8.b;
            r0 = r0.getWidth();
            r0 = r0 * 10;
            r4 = r8.b;
            r4 = r4.getHeight();
            r4 = r4 * 24;
            if (r0 <= r4) goto L_0x00b9;
        L_0x008f:
            r0 = r8.b;
            r0 = r0.getWidth();
            r4 = r8.b;
            r4 = r4.getHeight();
            r4 = r4 * 24;
            r4 = r4 / 10;
            r0 = r0 - r4;
            r0 = r0 / 2;
            r3.left = r0;
            r0 = r8.b;
            r0 = r0.getWidth();
            r4 = r8.b;
            r4 = r4.getHeight();
            r4 = r4 * 24;
            r4 = r4 / 10;
            r0 = r0 + r4;
            r0 = r0 / 2;
            r3.right = r0;
        L_0x00b9:
            r0 = r8.b;
            r4 = r8.d;
            r9.drawBitmap(r0, r3, r2, r4);
        L_0x00c0:
            r0 = r8.f;
            if (r0 == 0) goto L_0x00ce;
        L_0x00c4:
            r0 = r8.c;
            if (r0 == 0) goto L_0x00f8;
        L_0x00c8:
            r0 = com.whatsapp.ConversationRowImage.d();
        L_0x00cc:
            if (r1 == 0) goto L_0x00d6;
        L_0x00ce:
            r0 = r8.c;
            if (r0 == 0) goto L_0x00fd;
        L_0x00d2:
            r0 = com.whatsapp.ConversationRowImage.b();
        L_0x00d6:
            r0.setBounds(r2);
            r0.draw(r9);
            r0 = r8.d;
            r1 = 855638016; // 0x33000000 float:2.9802322E-8 double:4.22741349E-315;
            r0.setColor(r1);
            r0 = r8.d;
            r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r0.setStrokeWidth(r1);
            r0 = r8.d;
            r1 = android.graphics.Paint.Style.STROKE;
            r0.setStyle(r1);
            return;
        L_0x00f2:
            r0 = r8.a;
            r0 = r0 / 3;
            goto L_0x004b;
        L_0x00f8:
            r0 = com.whatsapp.ConversationRowImage.a();
            goto L_0x00cc;
        L_0x00fd:
            r0 = com.whatsapp.ConversationRowImage.c();
            goto L_0x00d6;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowImage.RowImageView.onDraw(android.graphics.Canvas):void");
        }

        static int a(com.whatsapp.ConversationRowImage.RowImageView rowImageView, int i) {
            rowImageView.a = i;
            return i;
        }

        public RowImageView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.d = new Paint();
            a();
        }

        public RowImageView(Context context) {
            super(context);
            this.d = new Paint();
            a();
        }

        static int a(com.whatsapp.ConversationRowImage.RowImageView rowImageView) {
            return rowImageView.e;
        }

        static Bitmap a(com.whatsapp.ConversationRowImage.RowImageView rowImageView, Bitmap bitmap) {
            rowImageView.b = bitmap;
            return bitmap;
        }

        static boolean a(com.whatsapp.ConversationRowImage.RowImageView rowImageView, boolean z) {
            rowImageView.f = z;
            return z;
        }

        static int b(com.whatsapp.ConversationRowImage.RowImageView rowImageView, int i) {
            rowImageView.e = i;
            return i;
        }

        static boolean b(com.whatsapp.ConversationRowImage.RowImageView rowImageView, boolean z) {
            rowImageView.c = z;
            return z;
        }
    }

    protected int l() {
        return R.layout.conversation_row_image_right;
    }

    static Drawable a() {
        return O;
    }

    static {
        String[] strArr = new String[16];
        String str = "\u0006\u0019d\r$=\ny\u0001%'";
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
                        i3 = 73;
                        break;
                    case ay.f /*1*/:
                        i3 = 107;
                        break;
                    case ay.n /*2*/:
                        i3 = 13;
                        break;
                    case ay.p /*3*/:
                        i3 = 104;
                        break;
                    default:
                        i3 = 74;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "i\u001b\u007f\u0007-;\u000e~\u001bp";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "i\u001f\u007f\t$:\rh\u001a8 \u0005jR";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "#\u0002i";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "i\u0005l\u0005/s";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "i\u001e\u007f\u0004p";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "i\u0006h\f#(4~\u00010,Q";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "(\u0007h\u001a>";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "9\u0004~";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "i\u001ft\u0018/s";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\"\u000et";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "?\u0002h\u001f',\u0018~\t-,D-\u000e8&\u0006R\u0005/s";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    str = "i\u001f\u007f\t$:\rh\u001a8,\u000f7";
                    obj = 12;
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    strArr2 = strArr3;
                    str = "i\rd\u0004/s";
                    obj = 13;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "i\u001fd\u0005/:\u001fl\u0005:s";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    ab = strArr3;
                    T = new bd(App.p.getApplicationContext().getResources().getDrawable(R.drawable.balloon_incoming_frame));
                    O = new bd(App.p.getApplicationContext().getResources().getDrawable(R.drawable.balloon_incoming_frame_botshade));
                    U = new bd(App.p.getApplicationContext().getResources().getDrawable(R.drawable.balloon_outgoing_frame));
                    S = new bd(App.p.getApplicationContext().getResources().getDrawable(R.drawable.balloon_outgoing_frame_botshade));
                    Y = new os();
                default:
                    strArr2[i] = str;
                    str = "i\rd\u0004/\u001a\u0002w\rp";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(b bVar, boolean z) {
        Object obj;
        if (!z) {
            try {
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
            if (bVar == this.w) {
                obj = null;
                super.a(bVar, z);
                if (obj != null) {
                    c(bVar);
                }
            }
        }
        obj = 1;
        try {
            super.a(bVar, z);
            if (obj != null) {
                c(bVar);
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected int a(int r5) {
        /*
        r4_this = this;
        r0 = 2130838964; // 0x7f0205b4 float:1.7282925E38 double:1.052774329E-314;
        r2 = com.whatsapp.App.az;
        r1 = r4.w;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0014 }
        r1 = r1.v;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0014 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0014 }
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r0 = super.a(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0014 }
    L_0x0013:
        return r0;
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r1 = 13;
        r1 = com.whatsapp.protocol.f.a(r5, r1);
        if (r1 < 0) goto L_0x0023;
    L_0x001e:
        r1 = 2130838958; // 0x7f0205ae float:1.7282913E38 double:1.052774326E-314;
        if (r2 == 0) goto L_0x003c;
    L_0x0023:
        r1 = 5;
        r1 = com.whatsapp.protocol.f.a(r5, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0046 }
        if (r1 < 0) goto L_0x002f;
    L_0x002a:
        r1 = 2130838962; // 0x7f0205b2 float:1.7282921E38 double:1.052774328E-314;
        if (r2 == 0) goto L_0x003c;
    L_0x002f:
        r1 = 4;
        r1 = com.whatsapp.protocol.f.a(r5, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        if (r1 != 0) goto L_0x003b;
    L_0x0036:
        r1 = 2130838960; // 0x7f0205b0 float:1.7282917E38 double:1.052774327E-314;
        if (r2 == 0) goto L_0x003c;
    L_0x003b:
        r1 = r0;
    L_0x003c:
        r2 = com.whatsapp.App.aa;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004a }
        r3 = 3;
        if (r2 != r3) goto L_0x0044;
    L_0x0041:
        r2 = 7;
        if (r5 == r2) goto L_0x0013;
    L_0x0044:
        r0 = r1;
        goto L_0x0013;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowImage.a(int):int");
    }

    protected int d() {
        return R.layout.conversation_row_image_left;
    }

    static RowImageView a(ConversationRowImage conversationRowImage) {
        return conversationRowImage.W;
    }

    public void g() {
        super.g();
        c(this.w);
    }

    static Drawable d() {
        return S;
    }

    static Drawable c() {
        return T;
    }

    static Drawable b() {
        return U;
    }

    public ConversationRowImage(Context context, b bVar) {
        super(context, bVar);
        this.X = new lr(this);
        this.N = (TextView) findViewById(R.id.control_btn);
        this.W = (RowImageView) findViewById(R.id.image);
        this.R = (CircularProgressBar) findViewById(R.id.progress_bar);
        this.V = findViewById(R.id.cancel_download);
        this.P = findViewById(R.id.control_frame);
        this.Q = (TextEmojiLabel) findViewById(R.id.caption);
        this.Q.setLinkHandler(new _h());
        this.Q.setAutoLinkMask(0);
        this.Q.setLinksClickable(false);
        this.Q.setFocusable(false);
        this.Q.setClickable(false);
        this.Q.setLongClickable(false);
        c(bVar);
    }

    protected void b(b bVar) {
        boolean z = false;
        MediaData mediaData = (MediaData) bVar.A;
        try {
            if (!bVar.e.b) {
                if (!mediaData.transferred) {
                    return;
                }
            }
            if (mediaData.file != null) {
                z = new File(Uri.fromFile(mediaData.file).getPath()).exists();
            }
            try {
                if (z) {
                    Log.i(ab[12] + bVar.e.b + ab[10] + bVar.j + ab[5] + bVar.H + ab[6] + bVar.t + ab[14] + mediaData.file + ab[2] + mediaData.progress + ab[13] + mediaData.transferred + ab[3] + mediaData.transferring + ab[1] + mediaData.fileSize + ab[7] + bVar.k + ab[15] + bVar.D);
                    try {
                        getContext().startActivity(MediaView.a(bVar, bVar.e.c, getContext(), this.W));
                        if (!MediaView.f()) {
                            return;
                        }
                        if (getContext() instanceof Activity) {
                            ((Activity) getContext()).overridePendingTransition(0, 0);
                            return;
                        }
                        return;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw e;
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw e2;
                    }
                }
                Intent intent = new Intent(getContext(), MediaGallery.class);
                intent.putExtra(ab[9], -1);
                intent.putExtra(ab[8], true);
                intent.putExtra(ab[4], bVar.e.c);
                intent.putExtra(ab[11], bVar.e.hashCode());
                getContext().startActivity(intent);
            }
        } catch (ArrayIndexOutOfBoundsException e22) {
            throw e22;
        } catch (ArrayIndexOutOfBoundsException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(com.whatsapp.protocol.b r13) {
        /*
        r12_this = this;
        r10 = -2;
        r4 = 0;
        r2 = 1;
        r11 = 8;
        r3 = 0;
        r6 = com.whatsapp.App.az;
        r0 = r13.A;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r12.W;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        r5 = 0;
        com.whatsapp.ConversationRowImage.RowImageView.a(r1, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        r1 = r12.W;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        com.whatsapp.ConversationRowImage.RowImageView.a(r1, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        r1 = r0.transferring;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        if (r1 == 0) goto L_0x0085;
    L_0x001b:
        r1 = r12.P;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        r5 = 0;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        r1 = r12.R;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        r5 = 0;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        r1 = r12.V;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        r5 = 0;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        r1 = r12.N;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        r5 = "";
        r1.setText(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        r1 = r12.N;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        r1 = r13.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        r1 = r1.b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032c }
        if (r1 == 0) goto L_0x0048;
    L_0x0041:
        r1 = r12.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032e }
        r12.setOnClickListener(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032e }
        if (r6 == 0) goto L_0x004c;
    L_0x0048:
        r1 = 0;
        r12.setOnClickListener(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0330 }
    L_0x004c:
        r1 = r12.N;
        r5 = r12.M;
        r1.setOnClickListener(r5);
        r1 = r12.R;
        r5 = r12.M;
        r1.setOnClickListener(r5);
        r8 = r0.progress;
        r1 = (int) r8;
        r5 = r0.transcoder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0332 }
        if (r5 == 0) goto L_0x0398;
    L_0x0061:
        r5 = r0.transcoder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0332 }
        r5 = r5.b();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0332 }
        if (r5 == 0) goto L_0x0398;
    L_0x0069:
        r5 = r0.uploader;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0334 }
        if (r5 != 0) goto L_0x0071;
    L_0x006d:
        r1 = r1 / 2;
        if (r6 == 0) goto L_0x0398;
    L_0x0071:
        r1 = r1 / 2;
        r1 = r1 + 50;
        r5 = r1;
    L_0x0076:
        r7 = r12.R;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0336 }
        if (r5 != 0) goto L_0x0338;
    L_0x007a:
        r1 = r2;
    L_0x007b:
        r7.setIndeterminate(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x033b }
        r1 = r12.R;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x033b }
        r1.setProgress(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x033b }
        if (r6 == 0) goto L_0x014a;
    L_0x0085:
        r1 = r0.transferred;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x033b }
        if (r1 != 0) goto L_0x009d;
    L_0x0089:
        r1 = r13.l;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x033d }
        if (r1 == 0) goto L_0x00cf;
    L_0x008d:
        r1 = r13.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x033f }
        r1 = r1.b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x033f }
        if (r1 == 0) goto L_0x00cf;
    L_0x0093:
        r1 = r13.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0341 }
        r1 = r1.c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0341 }
        r1 = com.whatsapp.m8.b(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0341 }
        if (r1 != 0) goto L_0x00cf;
    L_0x009d:
        r1 = r12.P;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
        r1 = r12.N;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
        r5 = 2131624681; // 0x7f0e02e9 float:1.8876549E38 double:1.0531625247E-314;
        r1.setText(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
        r1 = r12.N;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
        r1 = r12.R;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
        r1 = r12.V;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
        r1 = r12.N;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
        r5 = r12.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
        r1.setOnClickListener(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
        r1 = r12.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
        r12.setOnClickListener(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
        if (r6 == 0) goto L_0x014a;
    L_0x00cf:
        r1 = r12.P;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
        r5 = 0;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
        r1 = r12.R;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
        r1 = r12.V;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
        r1 = r12.N;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
        r5 = 0;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
        r1 = r13.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
        r1 = r1.b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
        if (r1 == 0) goto L_0x034d;
    L_0x00ef:
        r1 = r0.file;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0347 }
        if (r1 != 0) goto L_0x034d;
    L_0x00f3:
        r1 = r13.t;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0349 }
        if (r1 == 0) goto L_0x034d;
    L_0x00f7:
        r1 = r2;
    L_0x00f8:
        r5 = r13.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0350 }
        r5 = r5.b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0350 }
        if (r5 == 0) goto L_0x0121;
    L_0x00fe:
        if (r1 != 0) goto L_0x0121;
    L_0x0100:
        r1 = r12.N;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0352 }
        r5 = 2131624799; // 0x7f0e035f float:1.8876788E38 double:1.053162583E-314;
        r1.setText(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0352 }
        r1 = r12.N;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0352 }
        r5 = 2130837739; // 0x7f0200eb float:1.728044E38 double:1.0527737237E-314;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r1.setCompoundDrawablesWithIntrinsicBounds(r5, r7, r8, r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0352 }
        r1 = r12.N;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0352 }
        r5 = r12.J;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0352 }
        r1.setOnClickListener(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0352 }
        r1 = r12.L;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0352 }
        r12.setOnClickListener(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0352 }
        if (r6 == 0) goto L_0x0145;
    L_0x0121:
        r1 = r12.N;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0354 }
        r5 = com.whatsapp.App.p;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0354 }
        r8 = r13.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0354 }
        r5 = android.text.format.Formatter.formatShortFileSize(r5, r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0354 }
        r1.setText(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0354 }
        r1 = r12.N;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0354 }
        r5 = 2130837695; // 0x7f0200bf float:1.7280351E38 double:1.052773702E-314;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r1.setCompoundDrawablesWithIntrinsicBounds(r5, r7, r8, r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0354 }
        r1 = r12.N;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0354 }
        r5 = r12.K;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0354 }
        r1.setOnClickListener(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0354 }
        r1 = r12.K;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0354 }
        r12.setOnClickListener(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0354 }
    L_0x0145:
        r1 = r12.N;
        r1.setVisibility(r3);
    L_0x014a:
        r1 = 2131427716; // 0x7f0b0184 float:1.8477056E38 double:1.053065211E-314;
        r7 = r12.findViewById(r1);
        r1 = r13.v;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x01e8;
    L_0x0159:
        r1 = r12.Q;
        r1.setVisibility(r3);
        r1 = com.whatsapp.App.as();
        if (r1 == 0) goto L_0x0395;
    L_0x0164:
        r1 = r13.v;
        r5 = 10;
        r1 = r1.lastIndexOf(r5);
        if (r1 <= 0) goto L_0x0358;
    L_0x016e:
        r5 = r13.v;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0356 }
        r1 = r5.substring(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0356 }
    L_0x0174:
        r5 = com.whatsapp.b7.c;
        r1 = r5.isRtl(r1);
        if (r1 != 0) goto L_0x0395;
    L_0x017c:
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r3);
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r3);
        r7.measure(r1, r5);
        r1 = r7.getMeasuredWidth();
    L_0x018b:
        r5 = r13.v;
        if (r1 != 0) goto L_0x01a2;
    L_0x018f:
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r5 = r8.append(r5);
        r8 = "\n";
        r5 = r5.append(r8);
        r5 = r5.toString();
    L_0x01a2:
        r8 = r12.Q;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        com.whatsapp.ConversationRowText.setMessageText(r5, r8, r1, r13);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r1 = r12.y;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r5 = r12.getContext();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r5 = r5.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r8 = 2131296283; // 0x7f09001b float:1.8210478E38 double:1.0530002745E-314;
        r5 = r5.getColor(r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r1.setTextColor(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r1 = r12.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r5 = 2131361831; // 0x7f0a0027 float:1.8343425E38 double:1.0530326596E-314;
        r1 = r1.getDimensionPixelSize(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r5 = 0;
        r8 = r12.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r9 = 2131361831; // 0x7f0a0027 float:1.8343425E38 double:1.0530326596E-314;
        r8 = r8.getDimensionPixelSize(r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r9 = r12.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r10 = 2131361829; // 0x7f0a0025 float:1.8343421E38 double:1.0530326586E-314;
        r9 = r9.getDimensionPixelSize(r10);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r7.setPadding(r1, r5, r8, r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r1 = r12.W;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r5 = 0;
        com.whatsapp.ConversationRowImage.RowImageView.a(r1, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        if (r6 == 0) goto L_0x022e;
    L_0x01e8:
        r1 = r12.Q;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r1 = r12.y;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r5 = r12.getContext();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r5 = r5.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r8 = 2131296284; // 0x7f09001c float:1.821048E38 double:1.053000275E-314;
        r5 = r5.getColor(r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r1.setTextColor(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r1 = r12.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r5 = 2131361832; // 0x7f0a0028 float:1.8343427E38 double:1.05303266E-314;
        r1 = r1.getDimensionPixelSize(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r5 = 0;
        r8 = r12.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r9 = 2131361832; // 0x7f0a0028 float:1.8343427E38 double:1.05303266E-314;
        r8 = r8.getDimensionPixelSize(r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r9 = r12.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r10 = 2131361830; // 0x7f0a0026 float:1.8343423E38 double:1.053032659E-314;
        r9 = r9.getDimensionPixelSize(r10);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r7.setPadding(r1, r5, r8, r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r1 = r12.W;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
        r5 = 1;
        com.whatsapp.ConversationRowImage.RowImageView.a(r1, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035c }
    L_0x022e:
        r1 = r12.W;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035e }
        r5 = r13.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035e }
        r5 = r5.b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035e }
        com.whatsapp.ConversationRowImage.RowImageView.b(r1, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035e }
        r1 = r12.y;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035e }
        if (r1 == 0) goto L_0x0265;
    L_0x023b:
        r1 = r13.l;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035e }
        if (r1 == 0) goto L_0x025c;
    L_0x023f:
        r1 = r13.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0360 }
        r1 = r1.b;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0360 }
        if (r1 == 0) goto L_0x025c;
    L_0x0245:
        r1 = r13.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0362 }
        r1 = r1.c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0362 }
        r1 = com.whatsapp.m8.d(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0362 }
        if (r1 != 0) goto L_0x025c;
    L_0x024f:
        r1 = r12.y;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
        r5 = 2130837687; // 0x7f0200b7 float:1.7280335E38 double:1.052773698E-314;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r1.setCompoundDrawablesWithIntrinsicBounds(r5, r7, r8, r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
        if (r6 == 0) goto L_0x0265;
    L_0x025c:
        r1 = r12.y;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0366 }
        r5 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r1.setCompoundDrawablesWithIntrinsicBounds(r5, r7, r8, r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0366 }
    L_0x0265:
        r5 = new android.graphics.BitmapFactory$Options;
        r5.<init>();
        r1 = 1;
        r5.inJustDecodeBounds = r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0368 }
        r1 = r0.file;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0368 }
        if (r1 == 0) goto L_0x036c;
    L_0x0271:
        r1 = r0.file;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0368 }
        r1 = r1.exists();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0368 }
        if (r1 == 0) goto L_0x036c;
    L_0x0279:
        if (r2 == 0) goto L_0x0286;
    L_0x027b:
        r1 = r0.file;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036f }
        r1 = r1.getAbsolutePath();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036f }
        android.graphics.BitmapFactory.decodeFile(r1, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036f }
        if (r6 == 0) goto L_0x02aa;
    L_0x0286:
        r1 = r13.O;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0371 }
        if (r1 != 0) goto L_0x0379;
    L_0x028a:
        r1 = r13.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0371 }
        if (r1 == 0) goto L_0x0392;
    L_0x0290:
        r1 = r13.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0373 }
        r1 = r1.length();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0373 }
        if (r1 <= 0) goto L_0x0392;
    L_0x029a:
        r1 = r13.f();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0375, StringIndexOutOfBoundsException -> 0x0390, IllegalArgumentException -> 0x038e }
        r7 = 0;
        r1 = android.backport.util.Base64.decode(r1, r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0375, StringIndexOutOfBoundsException -> 0x0390, IllegalArgumentException -> 0x038e }
    L_0x02a3:
        if (r1 == 0) goto L_0x02aa;
    L_0x02a5:
        r4 = 0;
        r7 = r1.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x037f }
        android.graphics.BitmapFactory.decodeByteArray(r1, r4, r7, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x037f }
    L_0x02aa:
        r1 = r5.outWidth;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0381 }
        if (r1 <= 0) goto L_0x02f5;
    L_0x02ae:
        r1 = r5.outHeight;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0381 }
        if (r1 <= 0) goto L_0x02f5;
    L_0x02b2:
        if (r2 == 0) goto L_0x02c9;
    L_0x02b4:
        r1 = new android.media.ExifInterface;	 Catch:{ IOException -> 0x038b }
        r0 = r0.file;	 Catch:{ IOException -> 0x038b }
        r0 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x038b }
        r1.<init>(r0);	 Catch:{ IOException -> 0x038b }
        r0 = ab;	 Catch:{ IOException -> 0x038b }
        r2 = 0;
        r0 = r0[r2];	 Catch:{ IOException -> 0x038b }
        r2 = 1;
        r3 = r1.getAttributeInt(r0, r2);	 Catch:{ IOException -> 0x038b }
    L_0x02c9:
        r0 = 6;
        if (r3 == r0) goto L_0x02ce;
    L_0x02cc:
        if (r3 != r11) goto L_0x02de;
    L_0x02ce:
        r0 = r12.W;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0383 }
        r1 = r5.outHeight;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0383 }
        com.whatsapp.ConversationRowImage.RowImageView.b(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0383 }
        r0 = r12.W;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0383 }
        r1 = r5.outWidth;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0383 }
        com.whatsapp.ConversationRowImage.RowImageView.a(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0383 }
        if (r6 == 0) goto L_0x02ec;
    L_0x02de:
        r0 = r12.W;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0383 }
        r1 = r5.outWidth;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0383 }
        com.whatsapp.ConversationRowImage.RowImageView.b(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0383 }
        r0 = r12.W;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0383 }
        r1 = r5.outHeight;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0383 }
        com.whatsapp.ConversationRowImage.RowImageView.a(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0383 }
    L_0x02ec:
        r0 = r12.W;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0385 }
        r1 = r12.X;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0385 }
        com.whatsapp.util.bo.a(r13, r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0385 }
        if (r6 == 0) goto L_0x0312;
    L_0x02f5:
        r0 = r12.W;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0385 }
        r1 = com.whatsapp.am1.a();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0385 }
        r1 = r1.q;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0385 }
        com.whatsapp.ConversationRowImage.RowImageView.b(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0385 }
        r0 = r12.W;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0385 }
        r1 = r12.W;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0385 }
        r1 = com.whatsapp.ConversationRowImage.RowImageView.a(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0385 }
        com.whatsapp.ConversationRowImage.RowImageView.a(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0385 }
        r0 = r12.W;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0385 }
        r1 = Y;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0385 }
        com.whatsapp.util.bo.a(r13, r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0385 }
    L_0x0312:
        r0 = r12.W;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0387 }
        r0.requestLayout();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0387 }
        r0 = aU;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0387 }
        if (r0 == 0) goto L_0x032b;
    L_0x031b:
        r0 = aU;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0389 }
        r1 = r13.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0389 }
        r0 = r0.equals(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0389 }
        if (r0 == 0) goto L_0x032b;
    L_0x0325:
        r0 = 0;
        aU = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0389 }
        r12.b(r13);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0389 }
    L_0x032b:
        return;
    L_0x032c:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x032e }
    L_0x032e:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0330 }
    L_0x0330:
        r0 = move-exception;
        throw r0;
    L_0x0332:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0334 }
    L_0x0334:
        r0 = move-exception;
        throw r0;
    L_0x0336:
        r0 = move-exception;
        throw r0;
    L_0x0338:
        r1 = r3;
        goto L_0x007b;
    L_0x033b:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x033d }
    L_0x033d:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x033f }
    L_0x033f:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0341 }
    L_0x0341:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0343 }
    L_0x0343:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
    L_0x0345:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0347 }
    L_0x0347:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0349 }
    L_0x0349:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x034b }
    L_0x034b:
        r0 = move-exception;
        throw r0;
    L_0x034d:
        r1 = r3;
        goto L_0x00f8;
    L_0x0350:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0352 }
    L_0x0352:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0354 }
    L_0x0354:
        r0 = move-exception;
        throw r0;
    L_0x0356:
        r0 = move-exception;
        throw r0;
    L_0x0358:
        r1 = r13.v;
        goto L_0x0174;
    L_0x035c:
        r0 = move-exception;
        throw r0;
    L_0x035e:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0360 }
    L_0x0360:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0362 }
    L_0x0362:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
    L_0x0364:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0366 }
    L_0x0366:
        r0 = move-exception;
        throw r0;
    L_0x0368:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036a }
    L_0x036a:
        r0 = move-exception;
        throw r0;
    L_0x036c:
        r2 = r3;
        goto L_0x0279;
    L_0x036f:
        r0 = move-exception;
        throw r0;
    L_0x0371:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0373 }
    L_0x0373:
        r0 = move-exception;
        throw r0;
    L_0x0375:
        r1 = move-exception;
    L_0x0376:
        r1 = r4;
        goto L_0x02a3;
    L_0x0379:
        r1 = r13.c();
        goto L_0x02a3;
    L_0x037f:
        r0 = move-exception;
        throw r0;
    L_0x0381:
        r0 = move-exception;
        throw r0;
    L_0x0383:
        r0 = move-exception;
        throw r0;
    L_0x0385:
        r0 = move-exception;
        throw r0;
    L_0x0387:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0389 }
    L_0x0389:
        r0 = move-exception;
        throw r0;
    L_0x038b:
        r0 = move-exception;
        goto L_0x02c9;
    L_0x038e:
        r1 = move-exception;
        goto L_0x0376;
    L_0x0390:
        r1 = move-exception;
        goto L_0x0376;
    L_0x0392:
        r1 = r4;
        goto L_0x02a3;
    L_0x0395:
        r1 = r3;
        goto L_0x018b;
    L_0x0398:
        r5 = r1;
        goto L_0x0076;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowImage.c(com.whatsapp.protocol.b):void");
    }
}
