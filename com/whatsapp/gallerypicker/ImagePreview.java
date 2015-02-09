package com.whatsapp.gallerypicker;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.MediaGalleryImageView;
import com.whatsapp.PhotoView;
import com.whatsapp.ee;
import com.whatsapp.util.Log;
import com.whatsapp.util.g;
import com.whatsapp.util.u;
import com.whatsapp.vk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ImagePreview extends SherlockActivity {
    private static u J;
    private static final String[] K;
    public static int y;
    private Uri A;
    private ImageView B;
    private Handler C;
    private View D;
    private View E;
    private OnGlobalLayoutListener F;
    private HashMap G;
    private ee H;
    private Drawable I;
    private ViewGroup b;
    private int c;
    private ImageView d;
    private float e;
    private ThumbsGrid f;
    private HashMap g;
    private int[] h;
    private ViewPager i;
    private Drawable j;
    private boolean k;
    private boolean l;
    private s m;
    private float n;
    private View o;
    private TextView p;
    private int q;
    private int r;
    private HashMap s;
    private ArrayList t;
    private HashMap u;
    private Handler v;
    private Runnable w;
    private z x;
    private ViewGroup z;

    class AnonymousClass_2 extends MediaGalleryImageView {
        final ImagePreview z;

        AnonymousClass_2(ImagePreview imagePreview, Context context) {
            this.z = imagePreview;
            super(context);
        }

        protected void onMeasure(int i, int i2) {
            int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
            setMeasuredDimension(defaultSize, defaultSize);
        }

        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (ImagePreview.e(this.z)) {
                canvas.drawColor(1727987712);
            }
        }
    }

    class AnonymousClass_5 extends ImageView {
        final ImagePreview a;

        AnonymousClass_5(ImagePreview imagePreview, Context context) {
            this.a = imagePreview;
            super(context);
        }

        protected void onMeasure(int i, int i2) {
            int defaultSize = getDefaultSize(getSuggestedMinimumHeight(), i2);
            setMeasuredDimension(defaultSize, defaultSize);
        }

        public void onDraw(Canvas canvas) {
            if (!(isSelected() || isPressed())) {
                canvas.drawColor(-15658735);
            }
            super.onDraw(canvas);
        }
    }

    class ThumbImageView extends MediaGalleryImageView {
        final ImagePreview A;
        private Uri B;
        private Matrix z;

        public ThumbImageView(ImagePreview imagePreview, Context context, Uri uri) {
            this.A = imagePreview;
            super(context);
            this.z = new Matrix();
            setScaleType(ScaleType.CENTER_CROP);
            a(uri);
            setOnClickListener(new ap(this, imagePreview));
            setOnTouchListener(new bl(this, imagePreview));
        }

        static Uri a(ThumbImageView thumbImageView) {
            return thumbImageView.B;
        }

        private void a(Uri uri) {
            Uri uri2;
            this.B = uri;
            int i = (int) (72.0f * getResources().getDisplayMetrics().density);
            if (ImagePreview.c(this.A).containsKey(uri)) {
                uri2 = (Uri) ImagePreview.c(this.A).get(uri);
            } else {
                uri2 = uri;
            }
            setBackgroundResource(R.color.gallery_cell);
            new ab(this, uri2, i).execute(new Void[0]);
        }

        public void onDraw(Canvas canvas) {
            canvas.save();
            if (ImagePreview.m(this.A) == this) {
                canvas.drawColor(-15658735);
                return;
            }
            this.x = false;
            if (ImagePreview.j(this.A).containsKey(this.B)) {
                this.z.setRotate((float) ((Integer) ImagePreview.j(this.A).get(this.B)).intValue(), (float) (getWidth() / 2), (float) (getHeight() / 2));
                canvas.concat(this.z);
            }
            super.onDraw(canvas);
            canvas.restore();
        }

        protected void onMeasure(int i, int i2) {
            int defaultSize = getDefaultSize(getSuggestedMinimumHeight(), i2);
            setMeasuredDimension(defaultSize, defaultSize);
        }

        static void a(ThumbImageView thumbImageView, Uri uri) {
            thumbImageView.a(uri);
        }
    }

    class ThumbsGrid extends ViewGroup {
        final ImagePreview a;
        int b;

        public void onMeasure(int i, int i2) {
            int i3 = 2;
            super.onMeasure(i, i2);
            int i4 = (int) (72.0f * getResources().getDisplayMetrics().density);
            int childCount = getChildCount();
            int measuredWidth = getMeasuredWidth();
            if (childCount > 0 && measuredWidth > 0) {
                this.b = measuredWidth / i4;
                i4 = ((this.b + childCount) - 1) / this.b;
                if (childCount % this.b == 1) {
                    this.b++;
                    i4 = ((this.b + childCount) - 1) / this.b;
                }
                if (i4 > 2) {
                    this.b = ((childCount + 2) - 1) / 2;
                } else {
                    i3 = i4;
                }
                setMeasuredDimension(getMeasuredWidth(), i3 * (measuredWidth / this.b));
            }
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = y;
            int childCount = getChildCount();
            if (this.b != 0) {
                int i6 = (int) (2.0f * getResources().getDisplayMetrics().density);
                int i7 = (i3 - i) / this.b;
                int i8 = 0;
                while (i8 < childCount) {
                    int i9 = (i8 % this.b) * i7;
                    int i10 = (i8 / this.b) * i7;
                    getChildAt(i8).layout((i + i9) + i6, (i2 + i10) + i6, ((i9 + i) + i7) - i6, ((i10 + i2) + i7) - i6);
                    i8++;
                    if (i5 != 0) {
                        return;
                    }
                }
            }
        }

        @SuppressLint({"NewApi"})
        public ThumbsGrid(ImagePreview imagePreview, Context context) {
            this.a = imagePreview;
            super(context);
            if (VERSION.SDK_INT >= 11) {
                setLayoutTransition(new LayoutTransition());
            }
        }
    }

    static View f(ImagePreview imagePreview) {
        return imagePreview.E;
    }

    static HashMap w(ImagePreview imagePreview) {
        return imagePreview.G;
    }

    static int[] d(ImagePreview imagePreview) {
        return imagePreview.h;
    }

    static void a(ImagePreview imagePreview, PhotoView photoView, Uri uri) {
        imagePreview.a(photoView, uri);
    }

    static void h(ImagePreview imagePreview) {
        imagePreview.b();
    }

    static float b(ImagePreview imagePreview, float f) {
        imagePreview.e = f;
        return f;
    }

    static View i(ImagePreview imagePreview) {
        return imagePreview.o;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem r7) {
        /*
        r6_this = this;
        r2 = 1;
        r3 = 0;
        r0 = r7.getItemId();
        switch(r0) {
            case 0: goto L_0x0010;
            case 1: goto L_0x00a6;
            case 16908332: goto L_0x000b;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = r3;
    L_0x000a:
        return r0;
    L_0x000b:
        r6.finish();
        r0 = r2;
        goto L_0x000a;
    L_0x0010:
        r4 = new android.content.Intent;
        r0 = com.whatsapp.wallpaper.CropImage.class;
        r4.<init>(r6, r0);
        r0 = r6.t;
        r1 = r6.q;
        r0 = r0.get(r1);
        r0 = (android.net.Uri) r0;
        r1 = K;
        r5 = 17;
        r1 = r1[r5];
        r4.putExtra(r1, r3);
        r1 = K;
        r5 = 23;
        r1 = r1[r5];
        r4.putExtra(r1, r3);
        r1 = K;
        r5 = 22;
        r1 = r1[r5];
        r4.putExtra(r1, r3);
        r1 = K;
        r3 = 21;
        r1 = r1[r3];
        r3 = com.whatsapp.ge.h;
        r4.putExtra(r1, r3);
        r1 = K;
        r3 = 20;
        r1 = r1[r3];
        r3 = r0.getLastPathSegment();
        r3 = com.whatsapp.App.t(r3);
        r3 = android.net.Uri.fromFile(r3);
        r4.putExtra(r1, r3);
        r1 = K;
        r3 = 19;
        r1 = r1[r3];
        r3 = android.graphics.Bitmap.CompressFormat.JPEG;
        r3 = r3.toString();
        r4.putExtra(r1, r3);
        r4.setData(r0);
        r1 = r6.G;
        r1 = r1.containsKey(r0);
        if (r1 == 0) goto L_0x0087;
    L_0x0076:
        r1 = r6.G;
        r1 = r1.get(r0);
        r1 = (android.graphics.Rect) r1;
        r3 = K;
        r5 = 24;
        r3 = r3[r5];
        r4.putExtra(r3, r1);
    L_0x0087:
        r1 = r6.s;
        r1 = r1.containsKey(r0);
        if (r1 == 0) goto L_0x00a0;
    L_0x008f:
        r1 = K;
        r3 = 18;
        r1 = r1[r3];
        r3 = r6.s;
        r0 = r3.get(r0);
        r0 = (java.io.Serializable) r0;
        r4.putExtra(r1, r0);
    L_0x00a0:
        r6.startActivityForResult(r4, r2);
        r0 = r2;
        goto L_0x000a;
    L_0x00a6:
        r0 = r6.q;
        if (r0 < 0) goto L_0x010a;
    L_0x00aa:
        r0 = r6.t;
        r1 = r6.q;
        r0 = r0.get(r1);
        r0 = (android.net.Uri) r0;
        r1 = r6.s;
        r1 = r1.get(r0);
        r1 = (java.lang.Integer) r1;
        if (r1 != 0) goto L_0x00c2;
    L_0x00be:
        r1 = java.lang.Integer.valueOf(r3);
    L_0x00c2:
        r1 = r1.intValue();
        r1 = r1 + 90;
        r1 = java.lang.Integer.valueOf(r1);
        r3 = r1.intValue();
        r4 = 360; // 0x168 float:5.04E-43 double:1.78E-321;
        if (r3 < r4) goto L_0x00de;
    L_0x00d4:
        r1 = r1.intValue();
        r1 = r1 + -360;
        r1 = java.lang.Integer.valueOf(r1);
    L_0x00de:
        r3 = r1.intValue();
        if (r3 != 0) goto L_0x00ed;
    L_0x00e4:
        r3 = r6.s;
        r3.remove(r0);
        r3 = y;
        if (r3 == 0) goto L_0x00f2;
    L_0x00ed:
        r3 = r6.s;
        r3.put(r0, r1);
    L_0x00f2:
        r1 = r6.f;
        r3 = r6.q;
        r1 = r1.getChildAt(r3);
        r1.invalidate();
        r1 = r6.i;
        r0 = r1.findViewWithTag(r0);
        r0 = (com.whatsapp.PhotoView) r0;
        if (r0 == 0) goto L_0x010a;
    L_0x0107:
        r0.d();
    L_0x010a:
        r0 = r2;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ImagePreview.onOptionsItemSelected(com.actionbarsherlock.view.MenuItem):boolean");
    }

    static boolean o(ImagePreview imagePreview) {
        return imagePreview.k;
    }

    private void a() {
        int i = y;
        this.f.removeAllViews();
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            this.f.addView(new ThumbImageView(this, this, (Uri) it.next()));
            if (i != 0) {
                break;
            }
        }
        if (this.t.size() < this.r) {
            this.f.addView(this.B);
        }
    }

    static HashMap j(ImagePreview imagePreview) {
        return imagePreview.s;
    }

    static Uri a(ImagePreview imagePreview, Uri uri) {
        imagePreview.A = uri;
        return uri;
    }

    static int a(ImagePreview imagePreview) {
        return imagePreview.q;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        DialogToastActivity.a(menuItem);
        return super.onMenuItemSelected(i, menuItem);
    }

    static HashMap c(ImagePreview imagePreview) {
        return imagePreview.u;
    }

    static {
        String[] strArr = new String[25];
        String str = "[^E.(BAA?$WD\u000b-(AGV&4";
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
                        i3 = 50;
                        break;
                    case ay.f /*1*/:
                        i3 = 51;
                        break;
                    case ay.n /*2*/:
                        i3 = 36;
                        break;
                    case ay.p /*3*/:
                        i3 = 73;
                        break;
                    default:
                        i3 = 77;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "S]@;\"[W\n #FVJ=cWKP;,\u001c`p\u001b\bs~";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "@\\P(9[\\J:";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "QAK9?WPP:";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "GAM:";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "@VG =[VJ=";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "QAK98@ZW";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "_R\\\u0016$FVI:";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "QRT=$]]";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "QRT=$]]W";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "@VG=";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "QAK9?WPP:";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "GAM:";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "QAK98@ZW";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "@\\P(9[\\J:";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "QRT=$]]W";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "APE%(gCm/\u0003WV@,)";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "@\\P(9[\\J";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "]FP98FuK; SG";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "]FP98F";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "_R\\\n?]C";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "T_E=9W]v&9SGM&#";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "QAK9\u000fK|Q==GGw 7W";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "[]M=$S_v,.F";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    K = strArr3;
                    J = new u(256);
                default:
                    strArr2[i] = str;
                    str = "[^E.(BAA?$WD\u000b*?WRP,";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onDestroy() {
        Log.i(K[0]);
        super.onDestroy();
        this.o.getViewTreeObserver().removeGlobalOnLayoutListener(this.F);
        J.putAll(this.s);
        if (this.x != null) {
            this.x.d();
            this.x = null;
        }
    }

    static TextView k(ImagePreview imagePreview) {
        return imagePreview.p;
    }

    static Runnable s(ImagePreview imagePreview) {
        return imagePreview.w;
    }

    static int b(ImagePreview imagePreview, int i) {
        imagePreview.c = i;
        return i;
    }

    static ViewGroup g(ImagePreview imagePreview) {
        return imagePreview.z;
    }

    static ArrayList q(ImagePreview imagePreview) {
        return imagePreview.t;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r10) {
        /*
        r9_this = this;
        r8 = 4;
        r7 = 0;
        r6 = 1;
        r2 = y;
        r0 = K;
        r0 = r0[r6];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r10);
        com.whatsapp.App.a5();
        r0 = r9.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r6);
        r0 = r9.getSupportActionBar();
        r0.setDisplayShowHomeEnabled(r7);
        if (r10 != 0) goto L_0x025d;
    L_0x0022:
        r0 = r9.getIntent();
        r1 = K;
        r3 = 2;
        r1 = r1[r3];
        r0 = r0.getParcelableArrayListExtra(r1);
        r9.t = r0;
        r0 = r9.getIntent();
        r0 = r0.getExtras();
        if (r2 == 0) goto L_0x0046;
    L_0x003b:
        r1 = K;
        r3 = 5;
        r1 = r1[r3];
        r1 = r10.getParcelableArrayList(r1);
        r9.t = r1;
    L_0x0046:
        r1 = r0;
        r0 = new java.util.HashMap;
        r0.<init>();
        r9.g = r0;
        r0 = r9.t;
        r3 = r0.iterator();
    L_0x0054:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0077;
    L_0x005a:
        r0 = r3.next();
        r0 = (android.net.Uri) r0;
        r4 = K;
        r5 = 9;
        r4 = r4[r5];
        r4 = r0.getQueryParameter(r4);
        r5 = android.text.TextUtils.isEmpty(r4);
        if (r5 != 0) goto L_0x0075;
    L_0x0070:
        r5 = r9.g;
        r5.put(r0, r4);
    L_0x0075:
        if (r2 == 0) goto L_0x0054;
    L_0x0077:
        if (r1 == 0) goto L_0x00d0;
    L_0x0079:
        r0 = K;
        r2 = 3;
        r0 = r0[r2];
        r0 = r1.getSerializable(r0);
        r0 = (java.util.HashMap) r0;
        r9.s = r0;
        r0 = r9.s;
        if (r0 != 0) goto L_0x0091;
    L_0x008a:
        r0 = new java.util.HashMap;
        r0.<init>();
        r9.s = r0;
    L_0x0091:
        r0 = K;
        r2 = 7;
        r0 = r0[r2];
        r0 = r1.getSerializable(r0);
        r0 = (java.util.HashMap) r0;
        r9.u = r0;
        r0 = r9.u;
        if (r0 != 0) goto L_0x00a9;
    L_0x00a2:
        r0 = new java.util.HashMap;
        r0.<init>();
        r9.u = r0;
    L_0x00a9:
        r0 = K;
        r0 = r0[r8];
        r0 = r1.getSerializable(r0);
        r0 = (java.util.HashMap) r0;
        r9.G = r0;
        r0 = r9.G;
        if (r0 != 0) goto L_0x00c0;
    L_0x00b9:
        r0 = new java.util.HashMap;
        r0.<init>();
        r9.G = r0;
    L_0x00c0:
        r0 = K;
        r2 = 10;
        r0 = r0[r2];
        r0 = r1.getSerializable(r0);
        r0 = (java.util.HashMap) r0;
        if (r0 == 0) goto L_0x00d0;
    L_0x00ce:
        r9.g = r0;
    L_0x00d0:
        r0 = r9.s;
        r1 = J;
        r0.putAll(r1);
        r0 = r9.getIntent();
        r1 = K;
        r2 = 6;
        r1 = r1[r2];
        r0 = r0.getStringExtra(r1);
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x00f9;
    L_0x00ea:
        r1 = r9.getSupportActionBar();
        r2 = r9.getBaseContext();
        r0 = com.whatsapp.util.a5.d(r0, r2);
        r1.setTitle(r0);
    L_0x00f9:
        r0 = r9.getIntent();
        r1 = K;
        r2 = 8;
        r1 = r1[r2];
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0 = r0.getIntExtra(r1, r2);
        r9.r = r0;
        r0 = r9.t;
        if (r0 != 0) goto L_0x0114;
    L_0x0110:
        r9.finish();
    L_0x0113:
        return;
    L_0x0114:
        r0 = r9.getResources();
        r1 = 2130838879; // 0x7f02055f float:1.7282753E38 double:1.052774287E-314;
        r0 = r0.getDrawable(r1);
        r9.j = r0;
        r0 = r9.getResources();
        r1 = 2130838878; // 0x7f02055e float:1.728275E38 double:1.0527742864E-314;
        r0 = r0.getDrawable(r1);
        r9.I = r0;
        r0 = 2130903160; // 0x7f030078 float:1.741313E38 double:1.052806046E-314;
        r9.setContentView(r0);
        r0 = 2131427862; // 0x7f0b0216 float:1.8477352E38 double:1.053065283E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r9.b = r0;
        r0 = 2131427864; // 0x7f0b0218 float:1.8477356E38 double:1.053065284E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r9.p = r0;
        r0 = 2131427863; // 0x7f0b0217 float:1.8477354E38 double:1.0530652837E-314;
        r0 = r9.findViewById(r0);
        r9.E = r0;
        r0 = 2131427865; // 0x7f0b0219 float:1.8477358E38 double:1.0530652847E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r9.z = r0;
        r0 = new com.whatsapp.gallerypicker.ImagePreview$2;
        r0.<init>(r9, r9);
        r9.d = r0;
        r0 = r9.d;
        r0.setSelected(r6);
        r0 = r9.d;
        r1 = android.widget.ImageView.ScaleType.CENTER_CROP;
        r0.setScaleType(r1);
        r0 = r9.z;
        r1 = r9.d;
        r0.addView(r1);
        r0 = 2131427629; // 0x7f0b012d float:1.847688E38 double:1.053065168E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.support.v4.view.ViewPager) r0;
        r9.i = r0;
        r0 = r9.i;
        r1 = 1094713344; // 0x41400000 float:12.0 double:5.408602553E-315;
        r2 = r9.getResources();
        r2 = r2.getDisplayMetrics();
        r2 = r2.density;
        r1 = r1 * r2;
        r1 = (int) r1;
        r0.setPageMargin(r1);
        r0 = new com.whatsapp.gallerypicker.s;
        r1 = 0;
        r0.<init>(r9, r1);
        r9.m = r0;
        r0 = r9.i;
        r1 = r9.m;
        r0.setAdapter(r1);
        r0 = r9.i;
        r1 = new com.whatsapp.gallerypicker.b3;
        r1.<init>(r9);
        r0.setOnPageChangeListener(r1);
        r0 = 2131427774; // 0x7f0b01be float:1.8477174E38 double:1.0530652397E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = 2131624817; // 0x7f0e0371 float:1.8876824E38 double:1.053162592E-314;
        r0.setText(r1);
        r1 = new com.whatsapp.gallerypicker.av;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = new com.whatsapp.gallerypicker.ImagePreview$5;
        r0.<init>(r9, r9);
        r9.B = r0;
        r0 = r9.B;
        r1 = android.widget.ImageView.ScaleType.CENTER;
        r0.setScaleType(r1);
        r0 = r9.B;
        r1 = 2130838774; // 0x7f0204f6 float:1.728254E38 double:1.052774235E-314;
        r0.setImageResource(r1);
        r0 = r9.B;
        r1 = 2130839096; // 0x7f020638 float:1.7283193E38 double:1.052774394E-314;
        r0.setBackgroundResource(r1);
        r0 = r9.B;
        r1 = new com.whatsapp.gallerypicker.h;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = new com.whatsapp.gallerypicker.l;
        r0.<init>(r9, r9);
        r9.H = r0;
        r0 = r9.H;
        r1 = new com.whatsapp.gallerypicker.x;
        r1.<init>(r9);
        r0.a(r1);
        r0 = 2131427775; // 0x7f0b01bf float:1.8477176E38 double:1.05306524E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = new com.whatsapp.gallerypicker.u;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = 2131427861; // 0x7f0b0215 float:1.847735E38 double:1.0530652827E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r1 = new com.whatsapp.gallerypicker.ImagePreview$ThumbsGrid;
        r1.<init>(r9, r9);
        r9.f = r1;
        r1 = r9.f;
        r0.addView(r1);
        r1 = r9.r;
        if (r1 != 0) goto L_0x0234;
    L_0x0229:
        r1 = r9.t;
        r1 = r1.size();
        if (r1 != r6) goto L_0x0234;
    L_0x0231:
        r0.setVisibility(r8);
    L_0x0234:
        r0 = 2131427858; // 0x7f0b0212 float:1.8477344E38 double:1.053065281E-314;
        r0 = r9.findViewById(r0);
        r9.o = r0;
        r0 = r9.o;
        r0 = r0.getViewTreeObserver();
        r1 = r9.F;
        r0.addOnGlobalLayoutListener(r1);
        r9.a();
        r9.a(r7);
        r0 = new com.whatsapp.gallerypicker.z;
        r1 = r9.getContentResolver();
        r2 = r9.v;
        r0.<init>(r1, r2);
        r9.x = r0;
        goto L_0x0113;
    L_0x025d:
        r0 = r10;
        goto L_0x003b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ImagePreview.onCreate(android.os.Bundle):void");
    }

    static ThumbsGrid p(ImagePreview imagePreview) {
        return imagePreview.f;
    }

    private void b() {
        int i = y;
        if (this.x != null) {
            this.x.d();
            this.x = null;
        }
        z.b();
        if (this.i != null) {
            int i2 = 0;
            while (i2 < this.i.getChildCount()) {
                View childAt = this.i.getChildAt(i2);
                if (childAt instanceof PhotoView) {
                    ((PhotoView) childAt).f();
                }
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
        }
        App.a5();
    }

    static ViewPager l(ImagePreview imagePreview) {
        return imagePreview.i;
    }

    static Drawable r(ImagePreview imagePreview) {
        return imagePreview.j;
    }

    static ViewGroup n(ImagePreview imagePreview) {
        return imagePreview.b;
    }

    private void a(int i) {
        int i2 = y;
        this.q = i;
        int childCount = this.f.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            boolean z;
            View childAt = this.f.getChildAt(i3);
            if (i3 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            int i4 = i3 + 1;
            if (i2 == 0) {
                i3 = i4;
            } else {
                return;
            }
        }
    }

    static int x(ImagePreview imagePreview) {
        return imagePreview.c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r12) {
        /*
        r11_this = this;
        r10 = y;
        r0 = r11.D;
        if (r0 == 0) goto L_0x01dd;
    L_0x0006:
        r0 = r12.getAction();
        r1 = 2;
        if (r0 != r1) goto L_0x018f;
    L_0x000d:
        r0 = r11.b;
        r1 = 0;
        r0.setVisibility(r1);
        r0 = r11.z;
        r1 = r11.h;
        r0.getLocationOnScreen(r1);
        r0 = r11.z;
        r1 = r12.getX();
        r1 = (int) r1;
        r2 = r11.h;
        r3 = 0;
        r2 = r2[r3];
        r1 = r1 - r2;
        r2 = r11.n;
        r2 = (int) r2;
        r1 = r1 - r2;
        r2 = r12.getY();
        r2 = (int) r2;
        r3 = r11.h;
        r4 = 1;
        r3 = r3[r4];
        r2 = r2 - r3;
        r3 = r11.e;
        r3 = (int) r3;
        r2 = r2 - r3;
        r3 = 0;
        r4 = 0;
        r0.setPadding(r1, r2, r3, r4);
        r0 = r11.E;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = r11.b;
        r4 = r4.getHeight();
        r5 = r11.i;
        r5 = r5.getHeight();
        r4 = r4 - r5;
        r0.setPadding(r1, r2, r3, r4);
        r0 = r11.p;
        r1 = r11.h;
        r0.getLocationOnScreen(r1);
        r0 = r11.h;
        r1 = 1;
        r0 = r0[r1];
        r1 = r11.p;
        r1 = r1.getHeight();
        r0 = r0 + r1;
        r1 = r11.z;
        r1 = r1.getHeight();
        r1 = r1 - r0;
        if (r1 <= 0) goto L_0x0088;
    L_0x0070:
        r2 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r3 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r4 = (float) r1;
        r5 = r12.getY();
        r0 = (float) r0;
        r0 = r5 - r0;
        r0 = r4 - r0;
        r0 = r0 * r3;
        r1 = (float) r1;
        r0 = r0 / r1;
        r0 = java.lang.Math.min(r2, r0);
        r0 = (int) r0;
        if (r10 == 0) goto L_0x0089;
    L_0x0088:
        r0 = 0;
    L_0x0089:
        if (r0 >= 0) goto L_0x008c;
    L_0x008b:
        r0 = 0;
    L_0x008c:
        r1 = 70;
        if (r0 <= r1) goto L_0x00c3;
    L_0x0090:
        r1 = r11.E;
        r2 = r0 * 2;
        r2 = r2 / 3;
        r2 = r2 * 255;
        r2 = r2 / 100;
        r2 = r2 << 24;
        r1.setBackgroundColor(r2);
        r1 = r11.l;
        if (r1 != 0) goto L_0x00b7;
    L_0x00a3:
        r1 = r0 * 255;
        r1 = r1 / 100;
        r2 = r11.p;
        r3 = r1 << 24;
        r4 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r3 = r3 | r4;
        r2.setTextColor(r3);
        r2 = r11.j;
        r2.setAlpha(r1);
    L_0x00b7:
        r1 = r11.E;
        r1.clearAnimation();
        r1 = r11.C;
        r2 = r11.w;
        r1.removeCallbacks(r2);
    L_0x00c3:
        r1 = 100;
        if (r0 != r1) goto L_0x018b;
    L_0x00c7:
        r0 = 1;
        r9 = r0;
    L_0x00c9:
        if (r9 == 0) goto L_0x0128;
    L_0x00cb:
        r0 = r11.l;
        if (r0 != 0) goto L_0x0128;
    L_0x00cf:
        r0 = 1;
        r11.l = r0;
        r0 = r11.p;
        r1 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        r0.setTextColor(r1);
        r0 = r11.p;
        r1 = r11.I;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r0.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4);
        r0 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1 = r11.z;
        r1 = r1.getWidth();
        r1 = (float) r1;
        r0 = r0 * r1;
        r1 = r11.p;
        r1 = r1.getWidth();
        r1 = (float) r1;
        r2 = r0 / r1;
        r0 = new android.view.animation.ScaleAnimation;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = 1;
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r7 = 1;
        r8 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r4 = r2;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r1 = new android.view.animation.BounceInterpolator;
        r1.<init>();
        r0.setInterpolator(r1);
        r2 = 800; // 0x320 float:1.121E-42 double:3.953E-321;
        r0.setDuration(r2);
        r1 = 1;
        r0.setFillAfter(r1);
        r1 = r11.p;
        r1.clearAnimation();
        r1 = r11.p;
        r1.startAnimation(r0);
        r0 = r11.d;
        r0.invalidate();
        if (r10 == 0) goto L_0x0184;
    L_0x0128:
        if (r9 != 0) goto L_0x0184;
    L_0x012a:
        r0 = r11.l;
        if (r0 == 0) goto L_0x0184;
    L_0x012e:
        r0 = 0;
        r11.l = r0;
        r0 = r11.p;
        r1 = -1;
        r0.setTextColor(r1);
        r0 = r11.p;
        r1 = r11.j;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r0.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4);
        r0 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1 = r11.z;
        r1 = r1.getWidth();
        r1 = (float) r1;
        r0 = r0 * r1;
        r1 = r11.p;
        r1 = r1.getWidth();
        r1 = (float) r1;
        r1 = r0 / r1;
        r0 = new android.view.animation.ScaleAnimation;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = 1;
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r7 = 1;
        r8 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r3 = r1;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r1 = new android.view.animation.LinearInterpolator;
        r1.<init>();
        r0.setInterpolator(r1);
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r0.setDuration(r2);
        r1 = 1;
        r0.setFillAfter(r1);
        r1 = r11.p;
        r1.clearAnimation();
        r1 = r11.p;
        r1.startAnimation(r0);
        r0 = r11.d;
        r0.invalidate();
    L_0x0184:
        r0 = r11.D;
        r0.invalidate();
        r0 = 1;
    L_0x018a:
        return r0;
    L_0x018b:
        r0 = 0;
        r9 = r0;
        goto L_0x00c9;
    L_0x018f:
        r0 = r12.getAction();
        r1 = 1;
        if (r0 != r1) goto L_0x01a3;
    L_0x0196:
        r0 = r11.l;
        if (r0 == 0) goto L_0x01a3;
    L_0x019a:
        r0 = r11.A;
        r1 = r11.D;
        r11.a(r0, r1);
        if (r10 == 0) goto L_0x01a8;
    L_0x01a3:
        r0 = r11.D;
        r0.invalidate();
    L_0x01a8:
        r0 = 0;
        r11.l = r0;
        r0 = 0;
        r11.A = r0;
        r0 = 0;
        r11.D = r0;
        r0 = r11.b;
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r11.j;
        r1 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0.setAlpha(r1);
        r0 = r11.p;
        r0.clearAnimation();
        r0 = r11.p;
        r1 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r0.setTextColor(r1);
        r0 = r11.p;
        r1 = r11.j;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r0.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4);
        r0 = r11.C;
        r1 = r11.w;
        r0.removeCallbacks(r1);
    L_0x01dd:
        r0 = super.dispatchTouchEvent(r12);
        goto L_0x018a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ImagePreview.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    static Handler v(ImagePreview imagePreview) {
        return imagePreview.C;
    }

    static HashMap b(ImagePreview imagePreview) {
        return imagePreview.g;
    }

    static boolean a(ImagePreview imagePreview, boolean z) {
        imagePreview.k = z;
        return z;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList(K[13], this.t);
        bundle.putSerializable(K[15], this.s);
        bundle.putSerializable(K[14], this.u);
        bundle.putSerializable(K[12], this.G);
        bundle.putSerializable(K[16], this.g);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case ay.f /*1*/:
                if (i2 == -1) {
                    Uri uri = (Uri) this.t.get(this.q);
                    this.u.put(uri, Uri.fromFile(App.t(uri.getLastPathSegment())));
                    Rect rect = (Rect) intent.getParcelableExtra(K[11]);
                    if (rect != null) {
                        this.G.put(uri, rect);
                    }
                    z.a(uri.toString());
                    PhotoView photoView = (PhotoView) this.i.findViewWithTag(uri);
                    if (photoView != null) {
                        a(photoView, uri);
                    }
                    ThumbImageView.a((ThumbImageView) this.f.getChildAt(this.q), uri);
                }
            default:
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (App.G != 3 || i != 84) {
            return super.onKeyDown(i, keyEvent);
        }
        g.a((Activity) this, false);
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, (int) R.string.crop).setIcon((int) R.drawable.ic_action_crop).setShowAsAction(2);
        menu.add(0, 1, 0, (int) R.string.rotate_right).setIcon((int) R.drawable.ic_action_rotate_right).setShowAsAction(2);
        if (App.G == 3) {
            g.b((Activity) this);
        }
        return true;
    }

    private void a(PhotoView photoView, Uri uri) {
        Uri uri2;
        photoView.setTag(uri);
        if (this.u.containsKey(uri)) {
            uri2 = (Uri) this.u.get(uri);
        } else {
            uri2 = uri;
        }
        this.x.a(new as(this, Math.max(this.i.getMeasuredHeight(), this.i.getMeasuredWidth()), uri2, uri), new g(this, photoView, uri));
        if (this.s.containsKey(uri)) {
            photoView.setRotation((float) ((Integer) this.s.get(uri)).intValue(), false);
        }
    }

    static ImageView t(ImagePreview imagePreview) {
        return imagePreview.d;
    }

    static View m(ImagePreview imagePreview) {
        return imagePreview.D;
    }

    static ee u(ImagePreview imagePreview) {
        return imagePreview.H;
    }

    private void a(Uri uri, View view) {
        this.t.remove(uri);
        this.s.remove(uri);
        this.u.remove(uri);
        this.G.remove(uri);
        this.g.remove(uri);
        this.f.removeView(view);
        this.m.notifyDataSetChanged();
        if (this.q >= this.t.size()) {
            this.q = this.t.size() - 1;
        }
        if (this.q >= 0) {
            this.i.setCurrentItem(this.q);
            a(this.q);
        }
        if (this.t.size() == this.r - 1) {
            this.f.addView(this.B);
        }
        if (this.t.isEmpty()) {
            finish();
        }
    }

    static void a(ImagePreview imagePreview, int i) {
        imagePreview.a(i);
    }

    static View a(ImagePreview imagePreview, View view) {
        imagePreview.D = view;
        return view;
    }

    static float a(ImagePreview imagePreview, float f) {
        imagePreview.n = f;
        return f;
    }

    public ImagePreview() {
        this.s = new HashMap();
        this.u = new HashMap();
        this.G = new HashMap();
        this.g = new HashMap();
        this.v = new Handler();
        this.h = new int[2];
        this.F = new a(this);
        this.C = new Handler();
        this.w = new n(this);
    }

    static boolean e(ImagePreview imagePreview) {
        return imagePreview.l;
    }
}
