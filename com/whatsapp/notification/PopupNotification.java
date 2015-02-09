package com.whatsapp.notification;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.text.method.TextKeyListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.App;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.GalleryView;
import com.whatsapp.ThumbnailButton;
import com.whatsapp.a11;
import com.whatsapp.a_3;
import com.whatsapp.ac;
import com.whatsapp.am1;
import com.whatsapp.anq;
import com.whatsapp.b7;
import com.whatsapp.cb;
import com.whatsapp.dz;
import com.whatsapp.m8;
import com.whatsapp.protocol.b;
import com.whatsapp.tf;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.b0;
import com.whatsapp.util.bd;
import com.whatsapp.util.bo;
import com.whatsapp.vk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class PopupNotification extends Activity implements anq {
    public static boolean H;
    private static final String[] M;
    public static PopupNotification u;
    private static int v;
    private tf A;
    private OnClickListener B;
    private TextView C;
    private String D;
    private View E;
    private dz F;
    private Runnable G;
    private Handler I;
    private float J;
    private a11 K;
    private ImageButton L;
    private HashSet a;
    private am1 b;
    private Handler c;
    private Runnable d;
    private WakeLock e;
    private SensorEventListener f;
    private SensorManager g;
    private ArrayList h;
    private TextView i;
    private HashSet j;
    private GalleryView k;
    private m8 l;
    private HashSet m;
    private View n;
    private View o;
    private ImageButton p;
    private Sensor q;
    private TextView r;
    private b s;
    private HashSet t;
    private Button w;
    private ConversationTextEntry x;
    private View y;
    private boolean z;

    static SensorEventListener r(PopupNotification popupNotification) {
        return popupNotification.f;
    }

    static float c(PopupNotification popupNotification) {
        return popupNotification.J;
    }

    static void e(PopupNotification popupNotification) {
        popupNotification.h();
    }

    static m8 t(PopupNotification popupNotification) {
        return popupNotification.l;
    }

    private View f(b bVar) {
        View thumbnailButton = new ThumbnailButton(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.popup_gallery_height);
        thumbnailButton.setMinimumHeight(dimensionPixelSize);
        thumbnailButton.setMaxHeight(dimensionPixelSize);
        thumbnailButton.setScaleType(ScaleType.FIT_CENTER);
        dimensionPixelSize = (int) this.b.y;
        try {
            thumbnailButton.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            thumbnailButton.setRadius(this.b.c);
            if (this.j.add(bVar.e.c)) {
                bo.c(bVar.e.c);
            }
            Bitmap b = bo.b(bVar);
            if (b == null) {
                b = b0.a((Context) this);
            }
            thumbnailButton.setImageBitmap(b);
            thumbnailButton.setOnClickListener(this.B);
            return thumbnailButton;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static b g(PopupNotification popupNotification) {
        return popupNotification.s;
    }

    public void a(String str) {
    }

    static GalleryView q(PopupNotification popupNotification) {
        return popupNotification.k;
    }

    private int c(int i) {
        try {
            return this.h.size() > 1 ? i + 1 : i;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void a(Collection collection) {
    }

    static HashSet b(PopupNotification popupNotification) {
        return popupNotification.t;
    }

    public void a() {
        try {
            if (!this.h.isEmpty()) {
                b(a(this.k.c()));
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
        r10_this = this;
        r9 = 0;
        r8 = 1;
        r1 = H;
        r0 = u;
        if (r0 != r10) goto L_0x00a6;
    L_0x0008:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = M;
        r3 = 19;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r10.t;
        r2 = r2.size();
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r10.t;
        r2 = r0.iterator();
    L_0x002e:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x00a6;
    L_0x0034:
        r0 = r2.next();
        r0 = (java.lang.String) r0;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = com.whatsapp.v.b(r0);
        r0 = r10.a;
        r5 = r0.iterator();
    L_0x0049:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0068;
    L_0x004f:
        r0 = r5.next();
        r0 = (com.whatsapp.protocol.m) r0;
        r6 = r0.c;	 Catch:{ IllegalArgumentException -> 0x00aa }
        if (r6 == 0) goto L_0x0066;
    L_0x0059:
        r6 = r0.c;	 Catch:{ IllegalArgumentException -> 0x00ac }
        r7 = r4.e;	 Catch:{ IllegalArgumentException -> 0x00ac }
        r6 = r6.equals(r7);	 Catch:{ IllegalArgumentException -> 0x00ac }
        if (r6 == 0) goto L_0x0066;
    L_0x0063:
        r3.add(r0);	 Catch:{ IllegalArgumentException -> 0x00ac }
    L_0x0066:
        if (r1 == 0) goto L_0x0049;
    L_0x0068:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x00ae }
        r5 = M;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r6 = 18;
        r5 = r5[r6];	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0 = r0.append(r5);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r5 = r3.size();	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0 = r0.append(r5);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r5 = "/";
        r0 = r0.append(r5);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r5 = r4.a;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0 = r0.append(r5);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x00ae }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0 = r3.size();	 Catch:{ IllegalArgumentException -> 0x00ae }
        r5 = r4.a;	 Catch:{ IllegalArgumentException -> 0x00ae }
        if (r0 != r5) goto L_0x00a4;
    L_0x009a:
        r0 = 0;
        r5 = 1;
        com.whatsapp.App.a(r4, r0, r5);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0 = r10.a;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0.removeAll(r3);	 Catch:{ IllegalArgumentException -> 0x00ae }
    L_0x00a4:
        if (r1 == 0) goto L_0x002e;
    L_0x00a6:
        com.whatsapp.App.a(r8, r8, r8, r9);
        return;
    L_0x00aa:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ac }
    L_0x00ac:
        r0 = move-exception;
        throw r0;
    L_0x00ae:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.h():void");
    }

    static ImageButton m(PopupNotification popupNotification) {
        return popupNotification.L;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View a(com.whatsapp.protocol.b r7) {
        /*
        r6_this = this;
        r1 = new com.whatsapp.ThumbnailTextButton;
        r1.<init>(r6);
        r0 = r6.getResources();
        r2 = 2131361869; // 0x7f0a004d float:1.8343503E38 double:1.0530326783E-314;
        r0 = r0.getDimensionPixelSize(r2);
        r1.setMinimumHeight(r0);
        r1.setMaxHeight(r0);
        r2 = android.widget.ImageView.ScaleType.FIT_CENTER;
        r1.setScaleType(r2);
        r2 = r6.b;
        r2 = r2.y;
        r2 = (int) r2;
        r1.setPadding(r2, r2, r2, r2);	 Catch:{ IllegalArgumentException -> 0x007f }
        r2 = r6.b;	 Catch:{ IllegalArgumentException -> 0x007f }
        r2 = r2.c;	 Catch:{ IllegalArgumentException -> 0x007f }
        r1.setRadius(r2);	 Catch:{ IllegalArgumentException -> 0x007f }
        r2 = r6.getResources();	 Catch:{ IllegalArgumentException -> 0x007f }
        r3 = 2130838938; // 0x7f02059a float:1.7282872E38 double:1.052774316E-314;
        r2 = r2.getDrawable(r3);	 Catch:{ IllegalArgumentException -> 0x007f }
        r1.setIcon(r2);	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = (float) r0;	 Catch:{ IllegalArgumentException -> 0x007f }
        r2 = 1088421888; // 0x40e00000 float:7.0 double:5.37751863E-315;
        r0 = r0 / r2;
        r1.setTextSize(r0);	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = 5;
        r1.setTextGravity(r0);	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = r6.j;	 Catch:{ IllegalArgumentException -> 0x007f }
        r2 = r7.e;	 Catch:{ IllegalArgumentException -> 0x007f }
        r2 = r2.c;	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = r0.add(r2);	 Catch:{ IllegalArgumentException -> 0x007f }
        if (r0 == 0) goto L_0x0056;
    L_0x004f:
        r0 = r7.e;	 Catch:{ IllegalArgumentException -> 0x007f }
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x007f }
        com.whatsapp.util.bo.c(r0);	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x0056:
        r0 = com.whatsapp.util.bo.b(r7);
        if (r0 == 0) goto L_0x0063;
    L_0x005c:
        r1.setImageBitmap(r0);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r0 = H;	 Catch:{ IllegalArgumentException -> 0x0081 }
        if (r0 == 0) goto L_0x006a;
    L_0x0063:
        r0 = com.whatsapp.util.b0.d(r6);	 Catch:{ IllegalArgumentException -> 0x0083 }
        r1.setImageBitmap(r0);	 Catch:{ IllegalArgumentException -> 0x0083 }
    L_0x006a:
        r0 = 0;
        r2 = r7.p;	 Catch:{ IllegalArgumentException -> 0x0096 }
        if (r2 == 0) goto L_0x0085;
    L_0x006f:
        r0 = r7.p;	 Catch:{ IllegalArgumentException -> 0x0096 }
        r2 = (long) r0;	 Catch:{ IllegalArgumentException -> 0x0096 }
        r0 = android.text.format.DateUtils.formatElapsedTime(r2);	 Catch:{ IllegalArgumentException -> 0x0096 }
    L_0x0076:
        r1.setText(r0);	 Catch:{ IllegalArgumentException -> 0x0096 }
    L_0x0079:
        r0 = r6.B;
        r1.setOnClickListener(r0);
        return r1;
    L_0x007f:
        r0 = move-exception;
        throw r0;
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        throw r0;
    L_0x0085:
        r2 = r7.k;	 Catch:{ IllegalArgumentException -> 0x0096 }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x0076;
    L_0x008d:
        r0 = com.whatsapp.App.p;	 Catch:{ IllegalArgumentException -> 0x0096 }
        r2 = r7.k;	 Catch:{ IllegalArgumentException -> 0x0096 }
        r0 = android.text.format.Formatter.formatShortFileSize(r0, r2);	 Catch:{ IllegalArgumentException -> 0x0096 }
        goto L_0x0076;
    L_0x0096:
        r0 = move-exception;
        goto L_0x0079;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.a(com.whatsapp.protocol.b):android.view.View");
    }

    static ArrayList k(PopupNotification popupNotification) {
        return popupNotification.h;
    }

    private void i() {
        int i = 0;
        try {
            if (this.l != null) {
                try {
                    if (!a(true)) {
                        try {
                            if (App.c(this.l.e)) {
                                showDialog(106);
                                return;
                            }
                            String trim = this.x.getText().toString().trim();
                            try {
                                if (trim.length() > 0) {
                                    App.a(this.l, a5.a(trim));
                                    TextKeyListener.clear(this.x.getText());
                                    if (!H) {
                                        InputMethodManager inputMethodManager = (InputMethodManager) App.p.getSystemService(M[10]);
                                        try {
                                            if (inputMethodManager.isFullscreenMode()) {
                                                inputMethodManager.hideSoftInputFromWindow(this.x.getWindowToken(), 0);
                                            }
                                            int c = this.k.c();
                                            int a = a(this.k.c());
                                            try {
                                                Log.i(M[13] + c + M[14] + a + M[11] + this.h.size());
                                                this.m.add(((b) this.h.get(a)).e);
                                                this.h.remove(a);
                                                if (this.h.isEmpty()) {
                                                    h();
                                                    finish();
                                                    return;
                                                }
                                                boolean z;
                                                this.k.removeViewAt(c);
                                                if (a >= this.h.size()) {
                                                    a--;
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (this.h.size() == 1) {
                                                    this.k.removeViewAt(this.k.getChildCount() - 1);
                                                    this.k.removeViewAt(0);
                                                    findViewById(R.id.navigation_holder).setVisibility(8);
                                                    findViewById(R.id.navigation_divider).setVisibility(8);
                                                    this.o.setVisibility(8);
                                                    this.y.setVisibility(8);
                                                } else {
                                                    i = a;
                                                }
                                                i = c(i);
                                                try {
                                                    this.k.setCurrentScreen(i);
                                                    if (this.s != null) {
                                                        this.a.add(this.s.e);
                                                    }
                                                    try {
                                                        if (this.l != null) {
                                                            this.t.add(this.l.e);
                                                        }
                                                        View childAt = this.k.getChildAt(i);
                                                        try {
                                                            int i2;
                                                            if (App.as()) {
                                                                i = 1;
                                                            } else {
                                                                i = -1;
                                                            }
                                                            if (z) {
                                                                i2 = -1;
                                                            } else {
                                                                i2 = 1;
                                                            }
                                                            Animation translateAnimation = new TranslateAnimation((float) (((i2 * i) * childAt.getWidth()) / 2), 0.0f, 0.0f, 0.0f);
                                                            translateAnimation.setDuration((long) v);
                                                            translateAnimation.setFillAfter(true);
                                                            childAt.startAnimation(translateAnimation);
                                                            return;
                                                        } catch (IllegalArgumentException e) {
                                                            throw e;
                                                        }
                                                    } catch (IllegalArgumentException e2) {
                                                        throw e2;
                                                    }
                                                } catch (IllegalArgumentException e22) {
                                                    throw e22;
                                                }
                                            } catch (IllegalArgumentException e222) {
                                                throw e222;
                                            }
                                        } catch (IllegalArgumentException e2222) {
                                            throw e2222;
                                        }
                                    }
                                }
                                Log.i(M[12] + this.h.size());
                            } catch (IllegalArgumentException e22222) {
                                throw e22222;
                            } catch (IllegalArgumentException e222222) {
                                throw e222222;
                            }
                        } catch (IllegalArgumentException e2222222) {
                            throw e2222222;
                        }
                    }
                } catch (IllegalArgumentException e22222222) {
                    throw e22222222;
                }
            }
        } catch (IllegalArgumentException e222222222) {
            throw e222222222;
        }
    }

    protected void onPause() {
        Log.i(M[6]);
        super.onPause();
        App.r();
    }

    private View d(b bVar) {
        try {
            switch (bVar.j) {
                case PBE.MD5 /*0*/:
                    return e(bVar);
                case ay.f /*1*/:
                    return f(bVar);
                case ay.n /*2*/:
                    return b(bVar);
                case ay.p /*3*/:
                    return a(bVar);
                case aj.i /*4*/:
                    return g(bVar);
                case aV.r /*5*/:
                    return c(bVar);
                default:
                    return new TextView(this);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    public PopupNotification() {
        boolean z = false;
        boolean z2 = H;
        this.z = false;
        this.h = new ArrayList();
        this.a = new HashSet();
        this.m = new HashSet();
        this.t = new HashSet();
        this.j = new HashSet();
        this.e = null;
        this.A = new v(this);
        this.J = 5.0f;
        this.I = new Handler();
        this.d = new at(this);
        this.c = new Handler();
        this.G = new n(this);
        this.D = null;
        if (DialogToastActivity.i) {
            if (!z2) {
                z = true;
            }
            H = z;
        }
    }

    static float a(PopupNotification popupNotification, float f) {
        popupNotification.J = f;
        return f;
    }

    static {
        String[] strArr = new String[30];
        String str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u0005T/i\u001f\u0002";
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
                        i3 = 68;
                        break;
                    case ay.f /*1*/:
                        i3 = 12;
                        break;
                    case ay.n /*2*/:
                        i3 = 106;
                        break;
                    case ay.p /*3*/:
                        i3 = 114;
                        break;
                    default:
                        i3 = 53;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "4c\u001d\u0017G";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "7i\u0004\u0001Z6";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u0011G!m\u001e\u0017";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+b";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u0002T1\u007f\u000f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u001b[-x\u001a\u001dE1|";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u0011Z1b\u001eH";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u0016P7x\u0018\u001dL";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "-b\u001a\u0007A\u001ba\u000f\u0006]+h";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "da\u000f\u0001F%k\u000f\u0001\u001b7e\u0010\u0017\u000f";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u0001P*h\u000f\u001cA6uE\u0017X4x\u0013RA!t\u001eR";
                    obj = 11;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    strArr2 = strArr3;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u0001P*h\u000f\u001cA6uERF'~\u000f\u0017[\u001b|\u0005\u0001\u000f";
                    obj = 12;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "da\u000f\u0001F%k\u000f-E+\u007fP";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u0005T/i\u001f\u0002\\\"b\u000f\u0017Q!h";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u0000P7y\u0007\u0017";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u0011Z*x\u000b\u0011Aix\u0002\u0007X&#\b\u0013F!:^_Q!o\u0005\u0016Pki\u0018\u0000Z6";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u001fF#6";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u0011Y!m\u0018\u001cZ0e\f\u001bV%x\u0003\u001d[76";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "f2";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "x#\u000bL";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "(m\u0013\u001d@0S\u0003\u001cS(m\u001e\u0017G";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = ",x\u001e\u0002F~#E\u001fT4\u007fD\u0015Z+k\u0006\u0017\u001b'c\u0007]X%|\u0019MDy";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "b\u007f\u0006\u001e\b";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0018\u007fA";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "xmJ\u001aG!jWP";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u0001A+|";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u0016\\%`\u0005\u0015\u00187c\f\u0006B%~\u000f_T&c\u001f\u0006\u00180cG\u0017M4e\u0018\u0017";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "(m\u0013\u001d@0S\u0003\u001cS(m\u001e\u0017G";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    M = strArr3;
                    v = 200;
                    u = null;
                default:
                    strArr2[i] = str;
                    str = "4c\u001a\u0007E*c\u001e\u001bS-o\u000b\u0006\\+bE\u0001A%~\u001e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void d() {
        if (this.l != null) {
            Bitmap j;
            Bitmap a = this.l.a(getResources().getDimensionPixelSize(R.dimen.small_avatar_size), getResources().getDimension(R.dimen.small_avatar_radius), true);
            if (a == null) {
                j = this.l.j();
            } else {
                j = a;
            }
            ((ImageView) findViewById(R.id.popup_thumb)).setImageBitmap(j);
        }
    }

    static void p(PopupNotification popupNotification) {
        popupNotification.b();
    }

    private void k() {
        try {
            App.T();
            if (this.s != null) {
                this.a.add(this.s.e);
            }
            try {
                if (this.h.size() > 1) {
                    int c = (this.k.c() - 1) + 1;
                    if (c >= this.h.size()) {
                        c = 0;
                    }
                    this.k.setCurrentScreen(c + 1);
                    View childAt = this.k.getChildAt(c + 1);
                    try {
                        if (App.as()) {
                            c = 1;
                        } else {
                            c = -1;
                        }
                        Animation translateAnimation = new TranslateAnimation((float) ((c * childAt.getWidth()) / 2), 0.0f, 0.0f, 0.0f);
                        translateAnimation.setDuration((long) v);
                        translateAnimation.setFillAfter(true);
                        childAt.startAnimation(translateAnimation);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public boolean c() {
        return this.z;
    }

    public void onBackPressed() {
        super.onBackPressed();
        h();
    }

    public void c(String str) {
    }

    private int a(int i) {
        try {
            return this.h.size() > 1 ? i - 1 : i;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static int g() {
        return v;
    }

    static ConversationTextEntry j(PopupNotification popupNotification) {
        return popupNotification.x;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View b(com.whatsapp.protocol.b r11) {
        /*
        r10_this = this;
        r3 = 2131361869; // 0x7f0a004d float:1.8343503E38 double:1.0530326783E-314;
        r2 = 1;
        r0 = r11.w;
        if (r0 != r2) goto L_0x0074;
    L_0x0008:
        r0 = M;
        r1 = 29;
        r0 = r0[r1];
        r0 = r10.getSystemService(r0);
        r0 = (android.view.LayoutInflater) r0;
        r1 = 2130903123; // 0x7f030053 float:1.7413055E38 double:1.0528060277E-314;
        r2 = 0;
        r3 = 0;
        r6 = r0.inflate(r1, r2, r3);
        r0 = 2131427708; // 0x7f0b017c float:1.847704E38 double:1.053065207E-314;
        r2 = r6.findViewById(r0);
        r2 = (android.widget.ImageButton) r2;
        r0 = 2131427733; // 0x7f0b0195 float:1.847709E38 double:1.0530652195E-314;
        r5 = r6.findViewById(r0);
        r5 = (android.widget.TextView) r5;
        r0 = 2131427464; // 0x7f0b0088 float:1.8476545E38 double:1.0530650866E-314;
        r3 = r6.findViewById(r0);
        r3 = (android.widget.ProgressBar) r3;
        r4 = new com.whatsapp.cb;
        r4.<init>(r10);
        r4.b(r11);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = new com.whatsapp.notification.m;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r1 = r10;
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r4.a(r0);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r0 = r11.p;	 Catch:{ IllegalArgumentException -> 0x0070 }
        if (r0 == 0) goto L_0x005b;
    L_0x004d:
        r0 = r11.p;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r0 = (long) r0;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r0 = android.text.format.DateUtils.formatElapsedTime(r0);	 Catch:{ IllegalArgumentException -> 0x0072 }
        r5.setText(r0);	 Catch:{ IllegalArgumentException -> 0x0072 }
        r0 = H;	 Catch:{ IllegalArgumentException -> 0x0072 }
        if (r0 == 0) goto L_0x0066;
    L_0x005b:
        r0 = com.whatsapp.App.p;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r8 = r11.k;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r0 = android.text.format.Formatter.formatShortFileSize(r0, r8);	 Catch:{ IllegalArgumentException -> 0x0072 }
        r5.setText(r0);	 Catch:{ IllegalArgumentException -> 0x0072 }
    L_0x0066:
        r0 = new com.whatsapp.notification.l;
        r0.<init>(r10, r4);
        r2.setOnClickListener(r0);
        r0 = r6;
    L_0x006f:
        return r0;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = new com.whatsapp.ThumbnailButton;
        r0.<init>(r10);
        r1 = r10.getResources();
        r1 = r1.getDimensionPixelSize(r3);
        r0.setMinimumHeight(r1);
        r1 = r10.getResources();
        r1 = r1.getDimensionPixelSize(r3);
        r0.setMaxHeight(r1);
        r0.setAdjustViewBounds(r2);
        r1 = android.widget.ImageView.ScaleType.FIT_CENTER;
        r0.setScaleType(r1);
        r1 = com.whatsapp.util.b0.c(r10);
        r0.setImageBitmap(r1);
        r1 = r10.B;
        r0.setOnClickListener(r1);
        goto L_0x006f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.b(com.whatsapp.protocol.b):android.view.View");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e() {
        /*
        r14_this = this;
        r13 = -1;
        r12 = -2;
        r2 = 1;
        r3 = 0;
        r5 = H;
        r0 = M;
        r1 = 7;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.notification.q.c();
        r1 = com.whatsapp.sg.GROUP;
        r6 = r0.a(r1);
        r0 = com.whatsapp.notification.q.c();
        r1 = com.whatsapp.sg.INDIVIDUAL;
        r7 = r0.a(r1);
        if (r6 != 0) goto L_0x002c;
    L_0x0024:
        if (r7 != 0) goto L_0x002c;
    L_0x0026:
        r14.finish();	 Catch:{ IllegalArgumentException -> 0x002a }
    L_0x0029:
        return;
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r0 = r14.k;	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0 = r0.c();	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r0 = r14.a(r0);	 Catch:{ IllegalArgumentException -> 0x00e5 }
        if (r0 != 0) goto L_0x00e9;
    L_0x0038:
        r0 = r14.x;	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r0 = r0.getText();	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r0 = r0.length();	 Catch:{ IllegalArgumentException -> 0x00e7 }
        if (r0 != 0) goto L_0x00e9;
    L_0x0048:
        r1 = r2;
    L_0x0049:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r14.h = r0;
        r0 = com.whatsapp.v.b();
        r4 = r0.iterator();
    L_0x0058:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x00b6;
    L_0x005e:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r8 = com.whatsapp.v.b(r0);
        r0 = r8.a;	 Catch:{ IllegalArgumentException -> 0x00ec }
        if (r0 <= 0) goto L_0x00b4;
    L_0x006c:
        r0 = r8.w();	 Catch:{ IllegalArgumentException -> 0x00ee }
        if (r0 == 0) goto L_0x0076;
    L_0x0072:
        if (r6 != 0) goto L_0x007a;
    L_0x0074:
        if (r5 == 0) goto L_0x0058;
    L_0x0076:
        if (r7 != 0) goto L_0x007a;
    L_0x0078:
        if (r5 == 0) goto L_0x0058;
    L_0x007a:
        r0 = com.whatsapp.App.aJ;
        r9 = r8.e;
        r10 = r8.a;
        r0 = r0.a(r9, r10);
        r9 = r0.iterator();
    L_0x0088:
        r0 = r9.hasNext();
        if (r0 == 0) goto L_0x00b4;
    L_0x008e:
        r0 = r9.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r10 = r14.m;	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r11 = r0.e;	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r10 = r10.contains(r11);	 Catch:{ IllegalArgumentException -> 0x00f2 }
        if (r10 != 0) goto L_0x00b2;
    L_0x009e:
        r10 = r8.w();	 Catch:{ IllegalArgumentException -> 0x00f4 }
        if (r10 != 0) goto L_0x00ad;
    L_0x00a4:
        if (r7 == 0) goto L_0x00b2;
    L_0x00a6:
        r10 = r14.h;	 Catch:{ IllegalArgumentException -> 0x00f8 }
        r10.add(r0);	 Catch:{ IllegalArgumentException -> 0x00f8 }
        if (r5 == 0) goto L_0x00b2;
    L_0x00ad:
        r10 = r14.h;	 Catch:{ IllegalArgumentException -> 0x00f8 }
        r10.add(r0);	 Catch:{ IllegalArgumentException -> 0x00f8 }
    L_0x00b2:
        if (r5 == 0) goto L_0x0088;
    L_0x00b4:
        if (r5 == 0) goto L_0x0058;
    L_0x00b6:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r4 = M;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r8 = 8;
        r4 = r4[r8];	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r0 = r0.append(r4);	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r4 = r14.h;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r4 = r4.size();	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r0 = r0.append(r4);	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x00e3 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r0 = r14.h;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r0 = r0.isEmpty();	 Catch:{ IllegalArgumentException -> 0x00e3 }
        if (r0 == 0) goto L_0x00fa;
    L_0x00de:
        r14.finish();	 Catch:{ IllegalArgumentException -> 0x00e3 }
        goto L_0x0029;
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;
    L_0x00e9:
        r1 = r3;
        goto L_0x0049;
    L_0x00ec:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ee }
    L_0x00ee:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f0 }
    L_0x00f0:
        r0 = move-exception;
        throw r0;
    L_0x00f2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f4 }
    L_0x00f4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f6 }
    L_0x00f6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f8 }
    L_0x00f8:
        r0 = move-exception;
        throw r0;
    L_0x00fa:
        r0 = r14.h;	 Catch:{ IllegalArgumentException -> 0x0289 }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x0289 }
        if (r0 != r2) goto L_0x012a;
    L_0x0102:
        r0 = 2131427952; // 0x7f0b0270 float:1.8477535E38 double:1.0530653277E-314;
        r0 = r14.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x028b }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x028b }
        r0 = 2131427951; // 0x7f0b026f float:1.8477533E38 double:1.053065327E-314;
        r0 = r14.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x028b }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x028b }
        r0 = r14.o;	 Catch:{ IllegalArgumentException -> 0x028b }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x028b }
        r0 = r14.y;	 Catch:{ IllegalArgumentException -> 0x028b }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x028b }
        if (r5 == 0) goto L_0x014c;
    L_0x012a:
        r0 = 2131427952; // 0x7f0b0270 float:1.8477535E38 double:1.0530653277E-314;
        r0 = r14.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x028b }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x028b }
        r0 = 2131427951; // 0x7f0b026f float:1.8477533E38 double:1.053065327E-314;
        r0 = r14.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x028b }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x028b }
        r0 = r14.o;	 Catch:{ IllegalArgumentException -> 0x028b }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x028b }
        r0 = r14.y;	 Catch:{ IllegalArgumentException -> 0x028b }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x028b }
    L_0x014c:
        r0 = r14.h;
        r4 = new com.whatsapp.notification.ak;
        r4.<init>(r14);
        java.util.Collections.sort(r0, r4);
        r0 = r14.k;
        r0.removeAllViews();
        r0 = r14.h;
        r0 = r0.size();
        if (r0 <= r2) goto L_0x0184;
    L_0x0163:
        r0 = new android.widget.TextView;
        r0.<init>(r14);
        r4 = 17;
        r0.setGravity(r4);
        r4 = new android.widget.RelativeLayout;
        r4.<init>(r14);
        r8 = new android.widget.RelativeLayout$LayoutParams;
        r8.<init>(r13, r12);
        r9 = 13;
        r8.addRule(r9);
        r4.addView(r0, r8);
        r0 = r14.k;
        r0.addView(r4);
    L_0x0184:
        r0 = r14.h;
        r4 = r0.iterator();
    L_0x018a:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x01bb;
    L_0x0190:
        r0 = r4.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r0 = r14.d(r0);
        r8 = new android.widget.RelativeLayout;
        r8.<init>(r14);
        r9 = new android.widget.ScrollView;
        r9.<init>(r14);
        r10 = new android.widget.RelativeLayout$LayoutParams;
        r10.<init>(r13, r12);
        r11 = 13;
        r10.addRule(r11);
        r9.addView(r0);
        r8.addView(r9, r10);
        r0 = r14.k;
        r0.addView(r8);
        if (r5 == 0) goto L_0x018a;
    L_0x01bb:
        r0 = r14.h;
        r0 = r0.size();
        if (r0 <= r2) goto L_0x01e4;
    L_0x01c3:
        r0 = new android.widget.TextView;
        r0.<init>(r14);
        r4 = 17;
        r0.setGravity(r4);
        r4 = new android.widget.RelativeLayout;
        r4.<init>(r14);
        r8 = new android.widget.RelativeLayout$LayoutParams;
        r8.<init>(r13, r12);
        r9 = 13;
        r8.addRule(r9);
        r4.addView(r0, r8);
        r0 = r14.k;
        r0.addView(r4);
    L_0x01e4:
        r0 = r14.s;	 Catch:{ IllegalArgumentException -> 0x028d }
        if (r0 == 0) goto L_0x02a2;
    L_0x01e8:
        if (r1 == 0) goto L_0x01f9;
    L_0x01ea:
        r0 = new android.os.Handler;
        r0.<init>();
        r4 = new com.whatsapp.notification.o;
        r4.<init>(r14);
        r0.post(r4);
        if (r5 == 0) goto L_0x02a2;
    L_0x01f9:
        r0 = r14.h;
        r8 = r0.iterator();
        r4 = r3;
    L_0x0200:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x021f;
    L_0x0206:
        r0 = r8.next();
        r0 = (com.whatsapp.protocol.b) r0;
        r0 = r0.e;	 Catch:{ IllegalArgumentException -> 0x028f }
        r9 = r14.s;	 Catch:{ IllegalArgumentException -> 0x028f }
        r9 = r9.e;	 Catch:{ IllegalArgumentException -> 0x028f }
        r0 = r0.equals(r9);	 Catch:{ IllegalArgumentException -> 0x028f }
        if (r0 == 0) goto L_0x021a;
    L_0x0218:
        if (r5 == 0) goto L_0x021f;
    L_0x021a:
        r0 = r4 + 1;
        if (r5 == 0) goto L_0x029f;
    L_0x021e:
        r4 = r0;
    L_0x021f:
        r0 = r14.h;
        r0 = r0.size();
        if (r4 != r0) goto L_0x0228;
    L_0x0227:
        r4 = r3;
    L_0x0228:
        r0 = r14.k;
        r4 = r14.c(r4);
        r0.setCurrentScreen(r4);
        r0 = 2130968576; // 0x7f040000 float:1.754581E38 double:1.052838366E-314;
        r4 = android.view.animation.AnimationUtils.loadAnimation(r14, r0);
        if (r1 == 0) goto L_0x0293;
    L_0x0239:
        r0 = r2;
    L_0x023a:
        r1 = v;
        r0 = r0 * r1;
        r0 = (long) r0;
        r4.setDuration(r0);
        r4.setFillAfter(r2);
        r0 = r14.r;
        r0.startAnimation(r4);
        r0 = r14.h;
        r0 = r0.get(r3);
        r0 = (com.whatsapp.protocol.b) r0;
        r0 = r0.e;
        r0 = r0.c;
        r0 = com.whatsapp.v.b(r0);
        r0 = r0.w();	 Catch:{ IllegalArgumentException -> 0x0295 }
        if (r0 == 0) goto L_0x0273;
    L_0x025f:
        r0 = 2;
        if (r6 == r0) goto L_0x0265;
    L_0x0262:
        r0 = 3;
        if (r6 != r0) goto L_0x0029;
    L_0x0265:
        r0 = r14.getWindow();	 Catch:{ IllegalArgumentException -> 0x029b }
        r1 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0.addFlags(r1);	 Catch:{ IllegalArgumentException -> 0x029b }
        r14.j();	 Catch:{ IllegalArgumentException -> 0x029b }
        if (r5 == 0) goto L_0x0029;
    L_0x0273:
        r0 = 2;
        if (r7 == r0) goto L_0x0279;
    L_0x0276:
        r0 = 3;
        if (r7 != r0) goto L_0x0029;
    L_0x0279:
        r0 = r14.getWindow();	 Catch:{ IllegalArgumentException -> 0x0287 }
        r1 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0.addFlags(r1);	 Catch:{ IllegalArgumentException -> 0x0287 }
        r14.j();	 Catch:{ IllegalArgumentException -> 0x0287 }
        goto L_0x0029;
    L_0x0287:
        r0 = move-exception;
        throw r0;
    L_0x0289:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x028b }
    L_0x028b:
        r0 = move-exception;
        throw r0;
    L_0x028d:
        r0 = move-exception;
        throw r0;
    L_0x028f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0291 }
    L_0x0291:
        r0 = move-exception;
        throw r0;
    L_0x0293:
        r0 = 2;
        goto L_0x023a;
    L_0x0295:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0297 }
    L_0x0297:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0299 }
    L_0x0299:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x029b }
    L_0x029b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x029d }
    L_0x029d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0287 }
    L_0x029f:
        r4 = r0;
        goto L_0x0200;
    L_0x02a2:
        r4 = r3;
        goto L_0x0228;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.e():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r4) {
        /*
        r3_this = this;
        r0 = r3.l;	 Catch:{ IllegalArgumentException -> 0x0033 }
        if (r0 == 0) goto L_0x0032;
    L_0x0004:
        r0 = r3.l;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r0 = r0.e;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r0 = r4.equals(r0);	 Catch:{ IllegalArgumentException -> 0x0035 }
        if (r0 == 0) goto L_0x0032;
    L_0x000e:
        r0 = com.whatsapp.bd.b(r4);	 Catch:{ IllegalArgumentException -> 0x0037 }
        if (r0 != 0) goto L_0x0032;
    L_0x0014:
        r0 = r3.i;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0037 }
        r2 = r3.l;	 Catch:{ IllegalArgumentException -> 0x0037 }
        r2 = r2.u();	 Catch:{ IllegalArgumentException -> 0x0037 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0037 }
        r2 = " ";
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0037 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0037 }
        r0.setText(r1);	 Catch:{ IllegalArgumentException -> 0x0037 }
    L_0x0032:
        return;
    L_0x0033:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0035 }
    L_0x0035:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0037 }
    L_0x0037:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.b(java.lang.String):void");
    }

    static SensorEventListener a(PopupNotification popupNotification, SensorEventListener sensorEventListener) {
        popupNotification.f = sensorEventListener;
        return sensorEventListener;
    }

    static void d(PopupNotification popupNotification) {
        popupNotification.i();
    }

    static ImageButton h(PopupNotification popupNotification) {
        return popupNotification.p;
    }

    static void i(PopupNotification popupNotification) {
        popupNotification.k();
    }

    static WakeLock n(PopupNotification popupNotification) {
        return popupNotification.e;
    }

    private void f() {
        try {
            App.T();
            if (this.s != null) {
                this.a.add(this.s.e);
            }
            try {
                if (this.h.size() > 1) {
                    int c = (this.k.c() - 1) - 1;
                    if (c < 0) {
                        c = this.h.size() - 1;
                    }
                    this.k.setCurrentScreen(c + 1);
                    View childAt = this.k.getChildAt(c + 1);
                    try {
                        if (App.as()) {
                            c = 1;
                        } else {
                            c = -1;
                        }
                        Animation translateAnimation = new TranslateAnimation((float) ((c * (-childAt.getWidth())) / 2), 0.0f, 0.0f, 0.0f);
                        translateAnimation.setDuration((long) v);
                        translateAnimation.setFillAfter(true);
                        childAt.startAnimation(translateAnimation);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View e(com.whatsapp.protocol.b r5) {
        /*
        r4_this = this;
        r3 = 0;
        r1 = new android.widget.TextView;
        r1.<init>(r4);
        r0 = "";
        r0 = r5.a;
        r2 = 6;
        if (r0 != r2) goto L_0x0015;
    L_0x000d:
        r0 = com.whatsapp.ConversationRowDivider.c(r5);
        r2 = H;
        if (r2 == 0) goto L_0x0019;
    L_0x0015:
        r0 = r5.f();
    L_0x0019:
        r0 = com.whatsapp.util.a5.d(r0, r4);
        r1.setText(r0);
        r0 = r4.getResources();
        r0 = com.whatsapp.ConversationRow.b(r0);
        r1.setTextSize(r0);
        r0 = 17;
        r1.setGravity(r0);
        r0 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1.setTextColor(r0);
        r0 = r4.b;
        r0 = r0.j;
        r0 = (int) r0;
        r2 = r4.b;
        r2 = r2.j;
        r2 = (int) r2;
        r1.setPadding(r0, r3, r2, r3);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.e(com.whatsapp.protocol.b):android.view.View");
    }

    private void b() {
        try {
            Log.i(M[0]);
            if (this.e != null) {
                if (!this.e.isHeld()) {
                    this.e.acquire();
                }
            }
            this.I.removeCallbacks(this.d);
            this.I.postDelayed(this.d, 5000);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static SensorManager o(PopupNotification popupNotification) {
        return popupNotification.g;
    }

    static a11 s(PopupNotification popupNotification) {
        return popupNotification.K;
    }

    protected void onResume() {
        Log.i(M[16]);
        super.onResume();
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case 115:
                Log.i(M[28]);
                return ac.a((Activity) this);
            case 116:
                try {
                    return a_3.a((Activity) this, this.D);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            default:
                return super.onCreateDialog(i);
        }
    }

    static HashSet f(PopupNotification popupNotification) {
        return popupNotification.a;
    }

    protected void onCreate(Bundle bundle) {
        boolean z = H;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(-1728053248));
        this.g = (SensorManager) getSystemService(M[3]);
        this.q = this.g.getDefaultSensor(8);
        Log.i(M[4]);
        PowerManager powerManager = (PowerManager) App.p.getSystemService(M[2]);
        if (powerManager != null) {
            try {
                this.e = powerManager.newWakeLock(268435466, M[5]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            setContentView(b7.a(getLayoutInflater(), R.layout.popup_notification, null, false));
            u = this;
            this.b = am1.a();
            this.k = (GalleryView) findViewById(R.id.gallery);
            this.x = (ConversationTextEntry) findViewById(R.id.entry);
            if (VERSION.SDK_INT < 11) {
                this.x.setBackgroundResource(R.drawable.popup_reply_input_field);
            }
            this.w = (Button) findViewById(R.id.popup_action_btn);
            this.C = (TextView) findViewById(R.id.popup_title);
            this.i = (TextView) findViewById(R.id.conversation_contact_status);
            this.r = (TextView) findViewById(R.id.popup_count);
            this.n = findViewById(R.id.next_btn);
            ((ImageView) this.n).setImageDrawable(new bd(getResources().getDrawable(R.drawable.selector_media_next)));
            this.o = findViewById(R.id.next_btn_ext);
            this.E = findViewById(R.id.prev_btn);
            ((ImageView) this.E).setImageDrawable(new bd(getResources().getDrawable(R.drawable.selector_media_prev)));
            this.y = findViewById(R.id.prev_btn_ext);
            this.p = (ImageButton) findViewById(R.id.send);
            this.L = (ImageButton) findViewById(R.id.voice_note_btn);
            this.k.setEventCallback(new i(this));
            ((Button) findViewById(R.id.popup_ok_btn)).setOnClickListener(new w(this));
            this.B = new al(this);
            this.w.setOnClickListener(this.B);
            OnClickListener hVar = new h(this);
            this.n.setOnClickListener(hVar);
            this.o.setOnClickListener(hVar);
            hVar = new a5(this);
            this.E.setOnClickListener(hVar);
            this.y.setOnClickListener(hVar);
            this.p.setImageDrawable(new bd(getResources().getDrawable(R.drawable.send_button_selector)));
            this.x.setOnClickListener(new a(this));
            this.F = new c(this, this, new u(this));
            this.L.setVisibility(0);
            this.p.setVisibility(8);
            this.x.addTextChangedListener(new r(this));
            this.x.setOnEditorActionListener(new s(this));
            this.p.setOnClickListener(new d(this));
            this.K = new a11(this);
            this.K.a(this.A);
            this.K.a(null);
            ImageButton imageButton = (ImageButton) findViewById(R.id.emoji_picker_btn);
            try {
                imageButton.setOnClickListener(new f(this, imageButton));
                e();
                App.b((anq) this);
                if (App.aQ()) {
                    showDialog(115);
                }
                if (z) {
                    try {
                        boolean z2;
                        if (DialogToastActivity.i) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        DialogToastActivity.i = z2;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    static int a(PopupNotification popupNotification, int i) {
        return popupNotification.c(i);
    }

    private boolean a(boolean z) {
        try {
            this.D = ac.a((Activity) this, z);
            if (this.D != null) {
                showDialog(116);
            }
            try {
                return this.D != null;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
        r3_this = this;
        r1 = H;
        r0 = M;
        r2 = 9;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        super.onDestroy();
        r0 = r3.j;
        r2 = r0.iterator();
    L_0x0014:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0025;
    L_0x001a:
        r0 = r2.next();
        r0 = (java.lang.String) r0;
        com.whatsapp.util.bo.a(r0);
        if (r1 == 0) goto L_0x0014;
    L_0x0025:
        r0 = r3.I;	 Catch:{ IllegalArgumentException -> 0x005d }
        r1 = r3.d;	 Catch:{ IllegalArgumentException -> 0x005d }
        r0.removeCallbacks(r1);	 Catch:{ IllegalArgumentException -> 0x005d }
        r0 = r3.c;	 Catch:{ IllegalArgumentException -> 0x005d }
        r1 = r3.G;	 Catch:{ IllegalArgumentException -> 0x005d }
        r0.removeCallbacks(r1);	 Catch:{ IllegalArgumentException -> 0x005d }
        r0 = r3.e;	 Catch:{ IllegalArgumentException -> 0x005d }
        if (r0 == 0) goto L_0x0044;
    L_0x0037:
        r0 = r3.e;	 Catch:{ IllegalArgumentException -> 0x005f }
        r0 = r0.isHeld();	 Catch:{ IllegalArgumentException -> 0x005f }
        if (r0 == 0) goto L_0x0044;
    L_0x003f:
        r0 = r3.e;	 Catch:{ IllegalArgumentException -> 0x005f }
        r0.release();	 Catch:{ IllegalArgumentException -> 0x005f }
    L_0x0044:
        r0 = r3.f;	 Catch:{ IllegalArgumentException -> 0x0061 }
        if (r0 == 0) goto L_0x004f;
    L_0x0048:
        r0 = r3.g;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r1 = r3.f;	 Catch:{ IllegalArgumentException -> 0x0061 }
        r0.unregisterListener(r1);	 Catch:{ IllegalArgumentException -> 0x0061 }
    L_0x004f:
        r0 = u;	 Catch:{ IllegalArgumentException -> 0x0063 }
        if (r0 != r3) goto L_0x0056;
    L_0x0053:
        r0 = 0;
        u = r0;	 Catch:{ IllegalArgumentException -> 0x0063 }
    L_0x0056:
        com.whatsapp.cb.j();
        com.whatsapp.App.a(r3);
        return;
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.onDestroy():void");
    }

    static void a(PopupNotification popupNotification) {
        popupNotification.f();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(java.lang.String r1) {
        /*
        r0 = u;	 Catch:{ IllegalArgumentException -> 0x0024 }
        if (r0 == 0) goto L_0x0023;
    L_0x0004:
        r0 = u;	 Catch:{ IllegalArgumentException -> 0x0026 }
        r0 = r0.c();	 Catch:{ IllegalArgumentException -> 0x0026 }
        if (r0 == 0) goto L_0x0023;
    L_0x000c:
        r0 = u;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r0 = r0.l;	 Catch:{ IllegalArgumentException -> 0x0028 }
        if (r0 == 0) goto L_0x0023;
    L_0x0012:
        r0 = u;	 Catch:{ IllegalArgumentException -> 0x002a }
        r0 = r0.l;	 Catch:{ IllegalArgumentException -> 0x002a }
        r0 = r0.e;	 Catch:{ IllegalArgumentException -> 0x002a }
        r0 = r1.equals(r0);	 Catch:{ IllegalArgumentException -> 0x002a }
        if (r0 == 0) goto L_0x0023;
    L_0x001e:
        r0 = u;	 Catch:{ IllegalArgumentException -> 0x002a }
        r0.finish();	 Catch:{ IllegalArgumentException -> 0x002a }
    L_0x0023:
        return;
    L_0x0024:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.e(java.lang.String):void");
    }

    static Sensor l(PopupNotification popupNotification) {
        return popupNotification.q;
    }

    public void onStop() {
        Log.i(M[27]);
        super.onStop();
        this.z = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View g(com.whatsapp.protocol.b r8) {
        /*
        r7_this = this;
        r6 = 17;
        r1 = 0;
        r2 = new android.widget.TextView;
        r2.<init>(r7);
        r0 = r8.H;
        r2.setText(r0);
        r0 = r7.getResources();
        r0 = com.whatsapp.ConversationRow.b(r0);
        r2.setTextSize(r0);
        r2.setGravity(r6);
        r0 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r2.setTextColor(r0);
        r0 = r8.f();	 Catch:{ UnsupportedEncodingException -> 0x009d, IOException -> 0x00a3, g -> 0x00a9 }
        r0 = defpackage.o.a(r0);	 Catch:{ UnsupportedEncodingException -> 0x009d, IOException -> 0x00a3, g -> 0x00a9 }
    L_0x0028:
        if (r0 == 0) goto L_0x0040;
    L_0x002a:
        r3 = r0.f;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        if (r3 == 0) goto L_0x0040;
    L_0x002e:
        r3 = r0.f;	 Catch:{ UnsupportedEncodingException -> 0x00b2 }
        r3 = r3.length;	 Catch:{ UnsupportedEncodingException -> 0x00b2 }
        if (r3 <= 0) goto L_0x0040;
    L_0x0033:
        r0 = r0.f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00b4, StringIndexOutOfBoundsException -> 0x00c1, IllegalArgumentException -> 0x00bf }
        r3 = 0;
        r0 = android.backport.util.Base64.decode(r0, r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00b4, StringIndexOutOfBoundsException -> 0x00c1, IllegalArgumentException -> 0x00bf }
        r3 = 0;
        r4 = r0.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00b4, StringIndexOutOfBoundsException -> 0x00c1, IllegalArgumentException -> 0x00bf }
        r1 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00b4, StringIndexOutOfBoundsException -> 0x00c1, IllegalArgumentException -> 0x00bf }
    L_0x0040:
        r0 = r7.getResources();
        r3 = 2130839111; // 0x7f020647 float:1.7283223E38 double:1.0527744016E-314;
        r0 = r0.getDrawable(r3);
        if (r1 == 0) goto L_0x006c;
    L_0x004d:
        r3 = r0.getIntrinsicWidth();
        r4 = r7.b;
        r4 = r4.c;
        r1 = com.whatsapp.util.f.a(r1, r3, r4);
        r3 = new android.graphics.drawable.BitmapDrawable;	 Catch:{ UnsupportedEncodingException -> 0x00bd }
        r4 = r7.getResources();	 Catch:{ UnsupportedEncodingException -> 0x00bd }
        r3.<init>(r4, r1);	 Catch:{ UnsupportedEncodingException -> 0x00bd }
        r1 = 0;
        r4 = 0;
        r5 = 0;
        r2.setCompoundDrawablesWithIntrinsicBounds(r3, r1, r4, r5);	 Catch:{ UnsupportedEncodingException -> 0x00bd }
        r1 = H;	 Catch:{ UnsupportedEncodingException -> 0x00bd }
        if (r1 == 0) goto L_0x0072;
    L_0x006c:
        r1 = 0;
        r3 = 0;
        r4 = 0;
        r2.setCompoundDrawablesWithIntrinsicBounds(r0, r1, r3, r4);	 Catch:{ UnsupportedEncodingException -> 0x00bd }
    L_0x0072:
        r0 = r7.b;
        r0 = r0.y;
        r0 = (int) r0;
        r2.setCompoundDrawablePadding(r0);
        r0 = r7.b;
        r0 = r0.y;
        r0 = (int) r0;
        r1 = r7.b;
        r1 = r1.y;
        r1 = (int) r1;
        r3 = r7.b;
        r3 = r3.y;
        r3 = (int) r3;
        r4 = r7.b;
        r4 = r4.y;
        r4 = (int) r4;
        r2.setPadding(r0, r1, r3, r4);
        r0 = new android.widget.RelativeLayout;
        r0.<init>(r7);
        r0.setGravity(r6);
        r0.addView(r2);
        return r0;
    L_0x009d:
        r0 = move-exception;
        com.whatsapp.util.Log.b(r0);
        r0 = r1;
        goto L_0x0028;
    L_0x00a3:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        r0 = r1;
        goto L_0x0028;
    L_0x00a9:
        r0 = move-exception;
        com.whatsapp.util.Log.b(r0);
        r0 = r1;
        goto L_0x0028;
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x00b2 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;
    L_0x00b4:
        r0 = move-exception;
    L_0x00b5:
        r3 = M;
        r3 = r3[r6];
        com.whatsapp.util.Log.b(r3, r0);
        goto L_0x0040;
    L_0x00bd:
        r0 = move-exception;
        throw r0;
    L_0x00bf:
        r0 = move-exception;
        goto L_0x00b5;
    L_0x00c1:
        r0 = move-exception;
        goto L_0x00b5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.g(com.whatsapp.protocol.b):android.view.View");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return cb.s() ? false : super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(int r8) {
        /*
        r7_this = this;
        r5 = 2;
        r2 = 0;
        r1 = 1;
        r3 = H;
        r0 = r7.h;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = r0.get(r8);	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = (com.whatsapp.protocol.b) r0;	 Catch:{ IllegalArgumentException -> 0x002b }
        r7.s = r0;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = r7.F;	 Catch:{ IllegalArgumentException -> 0x002b }
        r4 = r7.s;	 Catch:{ IllegalArgumentException -> 0x002b }
        r4 = r4.e;	 Catch:{ IllegalArgumentException -> 0x002b }
        r4 = r4.c;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0.a(r4);	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = r7.s;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = r0.e;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = com.whatsapp.v.b(r0);	 Catch:{ IllegalArgumentException -> 0x002b }
        r7.l = r0;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = r7.l;	 Catch:{ IllegalArgumentException -> 0x002b }
        if (r0 != 0) goto L_0x002d;
    L_0x002a:
        return;
    L_0x002b:
        r0 = move-exception;
        throw r0;
    L_0x002d:
        r0 = com.whatsapp.App.aX();	 Catch:{ IllegalArgumentException -> 0x011a }
        if (r0 == 0) goto L_0x0040;
    L_0x0033:
        r0 = r7.l;	 Catch:{ IllegalArgumentException -> 0x011c }
        r0 = r0.w();	 Catch:{ IllegalArgumentException -> 0x011c }
        if (r0 != 0) goto L_0x0040;
    L_0x003b:
        r0 = r7.l;	 Catch:{ IllegalArgumentException -> 0x011c }
        com.whatsapp.App.b(r0);	 Catch:{ IllegalArgumentException -> 0x011c }
    L_0x0040:
        r0 = r7.h;	 Catch:{ IllegalArgumentException -> 0x011e }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x011e }
        if (r0 == r1) goto L_0x004e;
    L_0x0048:
        r0 = com.whatsapp.App.aX();	 Catch:{ IllegalArgumentException -> 0x0120 }
        if (r0 == 0) goto L_0x0060;
    L_0x004e:
        r0 = r7.a;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r4 = r7.s;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r4 = r4.e;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0.add(r4);	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0 = r7.t;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r4 = r7.l;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r4 = r4.e;	 Catch:{ IllegalArgumentException -> 0x0120 }
        r0.add(r4);	 Catch:{ IllegalArgumentException -> 0x0120 }
    L_0x0060:
        r7.d();
        r0 = 2131625073; // 0x7f0e0471 float:1.8877344E38 double:1.0531627184E-314;
        r4 = r7.s;
        r4 = r4.j;
        if (r4 != r5) goto L_0x0071;
    L_0x006c:
        r0 = 2131624479; // 0x7f0e021f float:1.8876139E38 double:1.053162425E-314;
        if (r3 == 0) goto L_0x007b;
    L_0x0071:
        r4 = r7.s;	 Catch:{ IllegalArgumentException -> 0x0122 }
        r4 = r4.j;	 Catch:{ IllegalArgumentException -> 0x0122 }
        r5 = 3;
        if (r4 != r5) goto L_0x007b;
    L_0x0078:
        r0 = 2131625113; // 0x7f0e0499 float:1.8877425E38 double:1.053162738E-314;
    L_0x007b:
        r4 = r7.w;	 Catch:{ IllegalArgumentException -> 0x0124 }
        r4.setText(r0);	 Catch:{ IllegalArgumentException -> 0x0124 }
        r0 = r7.C;	 Catch:{ IllegalArgumentException -> 0x0124 }
        r4 = r7.l;	 Catch:{ IllegalArgumentException -> 0x0124 }
        r4 = r4.a(r7);	 Catch:{ IllegalArgumentException -> 0x0124 }
        r4 = com.whatsapp.util.a5.d(r4, r7);	 Catch:{ IllegalArgumentException -> 0x0124 }
        r0.setText(r4);	 Catch:{ IllegalArgumentException -> 0x0124 }
        r0 = r7.l;	 Catch:{ IllegalArgumentException -> 0x0124 }
        r0 = r0.w();	 Catch:{ IllegalArgumentException -> 0x0124 }
        if (r0 == 0) goto L_0x00bf;
    L_0x0097:
        r0 = r7.i;	 Catch:{ IllegalArgumentException -> 0x0126 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0126 }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x0126 }
        r5 = com.whatsapp.App.P;	 Catch:{ IllegalArgumentException -> 0x0126 }
        r6 = r7.s;	 Catch:{ IllegalArgumentException -> 0x0126 }
        r6 = r6.F;	 Catch:{ IllegalArgumentException -> 0x0126 }
        r5 = r5.a(r6);	 Catch:{ IllegalArgumentException -> 0x0126 }
        r5 = r5.a(r7);	 Catch:{ IllegalArgumentException -> 0x0126 }
        r4 = r4.append(r5);	 Catch:{ IllegalArgumentException -> 0x0126 }
        r5 = " ";
        r4 = r4.append(r5);	 Catch:{ IllegalArgumentException -> 0x0126 }
        r4 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0126 }
        r0.setText(r4);	 Catch:{ IllegalArgumentException -> 0x0126 }
        if (r3 == 0) goto L_0x00dd;
    L_0x00bf:
        r0 = r7.i;	 Catch:{ IllegalArgumentException -> 0x0126 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0126 }
        r3.<init>();	 Catch:{ IllegalArgumentException -> 0x0126 }
        r4 = r7.l;	 Catch:{ IllegalArgumentException -> 0x0126 }
        r4 = r4.u();	 Catch:{ IllegalArgumentException -> 0x0126 }
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x0126 }
        r4 = " ";
        r3 = r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x0126 }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x0126 }
        r0.setText(r3);	 Catch:{ IllegalArgumentException -> 0x0126 }
    L_0x00dd:
        r0 = r7.r;	 Catch:{ IllegalArgumentException -> 0x0128 }
        r3 = 2131624506; // 0x7f0e023a float:1.8876194E38 double:1.0531624382E-314;
        r4 = 2;
        r4 = new java.lang.Object[r4];	 Catch:{ IllegalArgumentException -> 0x0128 }
        r5 = 0;
        r6 = r8 + 1;
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IllegalArgumentException -> 0x0128 }
        r4[r5] = r6;	 Catch:{ IllegalArgumentException -> 0x0128 }
        r5 = 1;
        r6 = r7.h;	 Catch:{ IllegalArgumentException -> 0x0128 }
        r6 = r6.size();	 Catch:{ IllegalArgumentException -> 0x0128 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IllegalArgumentException -> 0x0128 }
        r4[r5] = r6;	 Catch:{ IllegalArgumentException -> 0x0128 }
        r3 = r7.getString(r3, r4);	 Catch:{ IllegalArgumentException -> 0x0128 }
        r0.setText(r3);	 Catch:{ IllegalArgumentException -> 0x0128 }
        r3 = r7.p;	 Catch:{ IllegalArgumentException -> 0x0128 }
        r0 = r7.x;	 Catch:{ IllegalArgumentException -> 0x0128 }
        r0 = r0.getText();	 Catch:{ IllegalArgumentException -> 0x0128 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x0128 }
        r0 = r0.length();	 Catch:{ IllegalArgumentException -> 0x0128 }
        if (r0 == 0) goto L_0x012a;
    L_0x0114:
        r0 = r1;
    L_0x0115:
        r3.setEnabled(r0);
        goto L_0x002a;
    L_0x011a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x011c }
    L_0x011c:
        r0 = move-exception;
        throw r0;
    L_0x011e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0120 }
    L_0x0120:
        r0 = move-exception;
        throw r0;
    L_0x0122:
        r0 = move-exception;
        throw r0;
    L_0x0124:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0126 }
    L_0x0126:
        r0 = move-exception;
        throw r0;
    L_0x0128:
        r0 = move-exception;
        throw r0;
    L_0x012a:
        r0 = r2;
        goto L_0x0115;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.b(int):void");
    }

    protected void onStart() {
        Log.i(M[1]);
        super.onStart();
        this.z = true;
    }

    public void d(String str) {
        try {
            try {
                if (this.l == null) {
                    return;
                }
                if (str.equals(this.l.e)) {
                    d();
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View c(com.whatsapp.protocol.b r12) {
        /*
        r11_this = this;
        r10 = 1;
        r4 = H;
        r5 = new android.widget.RelativeLayout;
        r5.<init>(r11);
        r0 = 17;
        r5.setGravity(r0);
        r0 = r11.getBaseContext();
        r1 = M;
        r2 = 22;
        r1 = r1[r2];
        r0 = r0.getSystemService(r1);
        r0 = (android.view.LayoutInflater) r0;
        r1 = 2130903108; // 0x7f030044 float:1.7413025E38 double:1.0528060203E-314;
        r6 = r0.inflate(r1, r5, r10);
        r0 = 2131427705; // 0x7f0b0179 float:1.8477034E38 double:1.0530652056E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131427706; // 0x7f0b017a float:1.8477036E38 double:1.053065206E-314;
        r1 = r6.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 0;
        r3 = r12.H;
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x0171;
    L_0x003f:
        r2 = r12.H;
        r3 = "\n";
        r2 = r2.split(r3);
        r3 = r2;
    L_0x0048:
        if (r3 == 0) goto L_0x004d;
    L_0x004a:
        r2 = r3.length;	 Catch:{ IllegalArgumentException -> 0x0163 }
        if (r2 != 0) goto L_0x0059;
    L_0x004d:
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x0165 }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x0165 }
        if (r4 == 0) goto L_0x011b;
    L_0x0059:
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x0167 }
        r2 = r12.t;	 Catch:{ IllegalArgumentException -> 0x0167 }
        if (r2 == 0) goto L_0x006b;
    L_0x0061:
        r2 = "";
        r7 = r12.t;	 Catch:{ IllegalArgumentException -> 0x0167 }
        r2 = r2.equals(r7);	 Catch:{ IllegalArgumentException -> 0x0167 }
        if (r2 == 0) goto L_0x00b2;
    L_0x006b:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r7 = M;
        r8 = 23;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r7 = r12.H;
        r8 = M;
        r9 = 25;
        r8 = r8[r9];
        r9 = "+";
        r7 = r7.replaceAll(r8, r9);
        r7 = android.net.Uri.encode(r7);
        r2 = r2.append(r7);
        r7 = M;
        r8 = 24;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r8 = r12.K;
        r2 = r2.append(r8);
        r7 = ",";
        r2 = r2.append(r7);
        r8 = r12.G;
        r2 = r2.append(r8);
        r2 = r2.toString();
        if (r4 == 0) goto L_0x00b4;
    L_0x00b2:
        r2 = r12.t;
    L_0x00b4:
        r7 = 0;
        r0.setAutoLinkMask(r7);	 Catch:{ IllegalArgumentException -> 0x0169 }
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0169 }
        r7.<init>();	 Catch:{ IllegalArgumentException -> 0x0169 }
        r8 = M;	 Catch:{ IllegalArgumentException -> 0x0169 }
        r9 = 26;
        r8 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x0169 }
        r7 = r7.append(r8);	 Catch:{ IllegalArgumentException -> 0x0169 }
        r7 = r7.append(r2);	 Catch:{ IllegalArgumentException -> 0x0169 }
        r8 = M;	 Catch:{ IllegalArgumentException -> 0x0169 }
        r9 = 20;
        r8 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x0169 }
        r7 = r7.append(r8);	 Catch:{ IllegalArgumentException -> 0x0169 }
        r8 = 0;
        r8 = r3[r8];	 Catch:{ IllegalArgumentException -> 0x0169 }
        r7 = r7.append(r8);	 Catch:{ IllegalArgumentException -> 0x0169 }
        r8 = M;	 Catch:{ IllegalArgumentException -> 0x0169 }
        r9 = 21;
        r8 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x0169 }
        r7 = r7.append(r8);	 Catch:{ IllegalArgumentException -> 0x0169 }
        r7 = r7.toString();	 Catch:{ IllegalArgumentException -> 0x0169 }
        r7 = android.text.Html.fromHtml(r7);	 Catch:{ IllegalArgumentException -> 0x0169 }
        r0.setText(r7);	 Catch:{ IllegalArgumentException -> 0x0169 }
        r7 = r3.length;	 Catch:{ IllegalArgumentException -> 0x0169 }
        if (r7 <= r10) goto L_0x010b;
    L_0x00f4:
        r7 = "";
        r8 = 1;
        r8 = r3[r8];	 Catch:{ IllegalArgumentException -> 0x016b }
        r7 = r7.equals(r8);	 Catch:{ IllegalArgumentException -> 0x016b }
        if (r7 != 0) goto L_0x010b;
    L_0x00ff:
        r7 = 0;
        r1.setVisibility(r7);	 Catch:{ IllegalArgumentException -> 0x016d }
        r7 = 1;
        r3 = r3[r7];	 Catch:{ IllegalArgumentException -> 0x016d }
        r1.setText(r3);	 Catch:{ IllegalArgumentException -> 0x016d }
        if (r4 == 0) goto L_0x0110;
    L_0x010b:
        r3 = 8;
        r1.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x016d }
    L_0x0110:
        r3 = new com.whatsapp.notification.p;
        r3.<init>(r11, r2);
        r0.setOnClickListener(r3);
        r1.setOnClickListener(r3);
    L_0x011b:
        r0 = 2131427626; // 0x7f0b012a float:1.8476874E38 double:1.0530651666E-314;
        r0 = r6.findViewById(r0);
        r0 = (com.whatsapp.ThumbnailButton) r0;
        r1 = r11.b;
        r1 = r1.y;
        r1 = (int) r1;
        r0.setPadding(r1, r1, r1, r1);	 Catch:{ IllegalArgumentException -> 0x016f }
        r1 = r11.b;	 Catch:{ IllegalArgumentException -> 0x016f }
        r1 = r1.c;	 Catch:{ IllegalArgumentException -> 0x016f }
        r0.setRadius(r1);	 Catch:{ IllegalArgumentException -> 0x016f }
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.setBorderSize(r1);	 Catch:{ IllegalArgumentException -> 0x016f }
        r1 = 1711276032; // 0x66000000 float:1.5111573E23 double:8.45482698E-315;
        r0.setBorderColor(r1);	 Catch:{ IllegalArgumentException -> 0x016f }
        r1 = r11.j;	 Catch:{ IllegalArgumentException -> 0x016f }
        r2 = r12.e;	 Catch:{ IllegalArgumentException -> 0x016f }
        r2 = r2.c;	 Catch:{ IllegalArgumentException -> 0x016f }
        r1 = r1.add(r2);	 Catch:{ IllegalArgumentException -> 0x016f }
        if (r1 == 0) goto L_0x0150;
    L_0x0149:
        r1 = r12.e;	 Catch:{ IllegalArgumentException -> 0x016f }
        r1 = r1.c;	 Catch:{ IllegalArgumentException -> 0x016f }
        com.whatsapp.util.bo.c(r1);	 Catch:{ IllegalArgumentException -> 0x016f }
    L_0x0150:
        r1 = com.whatsapp.util.bo.b(r12);
        if (r1 != 0) goto L_0x015a;
    L_0x0156:
        r1 = com.whatsapp.util.b0.g(r11);
    L_0x015a:
        r0.setImageBitmap(r1);
        r1 = r11.B;
        r0.setOnClickListener(r1);
        return r5;
    L_0x0163:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0165 }
    L_0x0165:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0167 }
    L_0x0167:
        r0 = move-exception;
        throw r0;
    L_0x0169:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x016b }
    L_0x016b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x016d }
    L_0x016d:
        r0 = move-exception;
        throw r0;
    L_0x016f:
        r0 = move-exception;
        throw r0;
    L_0x0171:
        r3 = r2;
        goto L_0x0048;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.c(com.whatsapp.protocol.b):android.view.View");
    }

    private void j() {
        try {
            Log.i(M[15]);
            this.J = 5.0f;
            this.c.removeCallbacks(this.G);
            this.c.postDelayed(this.G, 600);
            try {
                if (this.f != null) {
                    return;
                }
                if (this.q != null) {
                    this.f = new x(this);
                    this.g.registerListener(this.f, this.q, 0);
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
