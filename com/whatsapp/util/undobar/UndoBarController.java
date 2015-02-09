package com.whatsapp.util.undobar;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.vk;
import java.lang.reflect.Method;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class UndoBarController extends LinearLayout {
    private static Animation c;
    public static int f;
    public static final c j;
    public static final c k;
    private static Animation o;
    public static final c q;
    static final boolean r;
    private static final String[] z;
    private boolean a;
    private boolean b;
    private final TextView d;
    private String e;
    private Parcelable g;
    private final Handler h;
    private CharSequence i;
    private c l;
    private final TextView m;
    private int n;
    private float p;
    private a s;
    private final Runnable t;

    static {
        boolean z = true;
        String[] strArr = new String[20];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "\u0006?Tjc\u000e5";
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
                        i4 = 103;
                        break;
                    case ay.f /*1*/:
                        i4 = 81;
                        break;
                    case ay.n /*2*/:
                        i4 = 48;
                        break;
                    case ay.p /*3*/:
                        i4 = 24;
                        break;
                    default:
                        i4 = 12;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0004>^~e\u0000\u000eCpc\u0010\u001fQne\u00000Dqc\t\u0013Qj";
                    i = 2;
                    strArr2 = strArr3;
                    i2 = true;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0006?Tjc\u000e5";
                    i2 = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u0005>_t";
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0012?TwS\u0014%Iti";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u00118Cqn\u000b4";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0012?TwS\n4Ckm\u00004";
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0012?TwS\u0013>[}b";
                    i2 = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\t0Fqk\u0006%Ywb83QjS\u000f4Y\u007fd\u0013";
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\t0Fqk\u0006%Ywb83QjS\u000f4Y\u007fd\u0013\u000e\\yb\u0003\"Sy|\u0002";
                    i2 = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0014%ItiG<EkxG?_l,\u00054\u0010}a\u0017%I6";
                    i2 = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    str = "\u00164]m\"\u000f&\u001eum\u000e?[}u\u0014";
                    i2 = 11;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    strArr2 = strArr3;
                    str = "\u00004D";
                    i2 = 12;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0006?Tjc\u000e5\u001ew\u007fI\u0002Ikx\u0002<`jc\u00174Ble\u0002\"";
                    i2 = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u00108^|c\u0010";
                    i2 = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u00118Cqn\u000b4";
                    i2 = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0012?TwS\n4Ckm\u00004";
                    i2 = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0012?TwS\u0013>[}b";
                    i2 = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0012?TwS\u0014%Iti";
                    i2 = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        if (UndoBarController.class.desiredAssertionStatus()) {
                            z = false;
                        }
                        r = z;
                        j = new c(R.drawable.ic_undobar_undo, R.string.undo);
                        k = new c(R.drawable.ic_retry, R.string.retry, -1);
                        q = new c(-1, -1, 5000);
                        o = b(null);
                        c = a(null);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                default:
                    strArr2[i] = str;
                    str = "\u00038]}b";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            try {
                this.i = bundle.getCharSequence(z[7]);
                this.g = bundle.getParcelable(z[8]);
                this.l = (c) bundle.getParcelable(z[5]);
                if (bundle.getInt(z[6]) == 0) {
                    a(true, this.i, this.g);
                    return;
                }
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"NewApi"})
    private float a(android.view.WindowManager r4) {
        /*
        r3_this = this;
        r0 = new android.util.DisplayMetrics;
        r0.<init>();
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x002f }
        r2 = 16;
        if (r1 < r2) goto L_0x0016;
    L_0x000b:
        r1 = r4.getDefaultDisplay();	 Catch:{ IllegalArgumentException -> 0x0031 }
        r1.getRealMetrics(r0);	 Catch:{ IllegalArgumentException -> 0x0031 }
        r1 = f;	 Catch:{ IllegalArgumentException -> 0x0031 }
        if (r1 == 0) goto L_0x001d;
    L_0x0016:
        r1 = r4.getDefaultDisplay();	 Catch:{ IllegalArgumentException -> 0x0031 }
        r1.getMetrics(r0);	 Catch:{ IllegalArgumentException -> 0x0031 }
    L_0x001d:
        r1 = r0.widthPixels;
        r1 = (float) r1;
        r2 = r0.density;
        r1 = r1 / r2;
        r2 = r0.heightPixels;
        r2 = (float) r2;
        r0 = r0.density;
        r0 = r2 / r0;
        r0 = java.lang.Math.min(r1, r0);
        return r0;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.undobar.UndoBarController.a(android.view.WindowManager):float");
    }

    @TargetApi(14)
    private boolean b(Context context) {
        boolean z = true;
        boolean z2 = false;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(z[2], z[4], z[3]);
        if (identifier != 0) {
            boolean z3 = resources.getBoolean(identifier);
            try {
                if (!"1".equals(this.e)) {
                    z2 = z3;
                } else if (f == 0) {
                    return false;
                }
                return "0".equals(this.e) ? true : z2;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                z = false;
            }
            return z;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putCharSequence(z[17], this.i);
        bundle.putParcelable(z[18], this.g);
        bundle.putParcelable(z[19], this.l);
        bundle.putInt(z[16], getVisibility());
        return bundle;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r5) {
        /*
        r4_this = this;
        r3 = 8;
        r0 = f;
        r1 = r4.h;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r2 = r4.t;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r1.removeCallbacks(r2);	 Catch:{ IllegalArgumentException -> 0x0032 }
        r1 = 0;
        r4.g = r1;	 Catch:{ IllegalArgumentException -> 0x0032 }
        if (r5 == 0) goto L_0x0017;
    L_0x0010:
        r1 = 8;
        r4.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x0034 }
        if (r0 == 0) goto L_0x0031;
    L_0x0017:
        r4.clearAnimation();	 Catch:{ IllegalArgumentException -> 0x0036 }
        r1 = r4.l;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r1 = r1.f;	 Catch:{ IllegalArgumentException -> 0x0036 }
        if (r1 == 0) goto L_0x0029;
    L_0x0020:
        r1 = r4.l;	 Catch:{ IllegalArgumentException -> 0x0038 }
        r1 = r1.f;	 Catch:{ IllegalArgumentException -> 0x0038 }
        r4.startAnimation(r1);	 Catch:{ IllegalArgumentException -> 0x0038 }
        if (r0 == 0) goto L_0x002e;
    L_0x0029:
        r0 = c;	 Catch:{ IllegalArgumentException -> 0x0038 }
        r4.startAnimation(r0);	 Catch:{ IllegalArgumentException -> 0x0038 }
    L_0x002e:
        r4.setVisibility(r3);
    L_0x0031:
        return;
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.undobar.UndoBarController.a(boolean):void");
    }

    private static UndoBarController a(Activity activity) {
        UndoBarController c = c(activity);
        if (c != null) {
            return c;
        }
        View undoBarController = new UndoBarController(activity, null);
        ((ViewGroup) activity.findViewById(16908290)).addView(undoBarController);
        return undoBarController;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r7, java.lang.CharSequence r8, android.os.Parcelable r9) {
        /*
        r6_this = this;
        r0 = f;
        r6.g = r9;	 Catch:{ IllegalArgumentException -> 0x00cb }
        r6.i = r8;	 Catch:{ IllegalArgumentException -> 0x00cb }
        r1 = r6.d;	 Catch:{ IllegalArgumentException -> 0x00cb }
        r2 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00cb }
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x00cb }
        r1 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00cb }
        r1 = r1.a;	 Catch:{ IllegalArgumentException -> 0x00cb }
        if (r1 <= 0) goto L_0x0049;
    L_0x0013:
        r1 = r6.m;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x00cd }
        r1 = 2131428006; // 0x7f0b02a6 float:1.8477644E38 double:1.0530653543E-314;
        r1 = r6.findViewById(r1);	 Catch:{ IllegalArgumentException -> 0x00cd }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x00cd }
        r1 = r6.m;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r2 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r2 = r2.a;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x00cd }
        r1 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r1 = r1.c;	 Catch:{ IllegalArgumentException -> 0x00cd }
        if (r1 <= 0) goto L_0x005c;
    L_0x0033:
        r1 = r6.m;	 Catch:{ IllegalArgumentException -> 0x00cf }
        r2 = r6.getResources();	 Catch:{ IllegalArgumentException -> 0x00cf }
        r3 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00cf }
        r3 = r3.c;	 Catch:{ IllegalArgumentException -> 0x00cf }
        r2 = r2.getDrawable(r3);	 Catch:{ IllegalArgumentException -> 0x00cf }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x00cf }
        if (r0 == 0) goto L_0x005c;
    L_0x0049:
        r1 = r6.m;	 Catch:{ IllegalArgumentException -> 0x00cf }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x00cf }
        r1 = 2131428006; // 0x7f0b02a6 float:1.8477644E38 double:1.0530653543E-314;
        r1 = r6.findViewById(r1);	 Catch:{ IllegalArgumentException -> 0x00cf }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x00cf }
    L_0x005c:
        r1 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r1 = r1.b;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        if (r1 <= 0) goto L_0x0070;
    L_0x0062:
        r1 = 2131428004; // 0x7f0b02a4 float:1.847764E38 double:1.0530653534E-314;
        r1 = r6.findViewById(r1);	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r2 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r2 = r2.b;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r1.setBackgroundResource(r2);	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x0070:
        r1 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r2 = r6.t;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r1.removeCallbacks(r2);	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r1 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r2 = r1.d;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r4 = 0;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x008c;
    L_0x0081:
        r1 = r6.h;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r2 = r6.t;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r3 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r4 = r3.d;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r1.postDelayed(r2, r4);	 Catch:{ IllegalArgumentException -> 0x00d3 }
    L_0x008c:
        if (r7 != 0) goto L_0x00a5;
    L_0x008e:
        r6.clearAnimation();	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r1 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r1 = r1.e;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        if (r1 == 0) goto L_0x00a0;
    L_0x0097:
        r1 = r6.l;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r1 = r1.e;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r6.startAnimation(r1);	 Catch:{ IllegalArgumentException -> 0x00d7 }
        if (r0 == 0) goto L_0x00a5;
    L_0x00a0:
        r0 = o;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r6.startAnimation(r0);	 Catch:{ IllegalArgumentException -> 0x00d7 }
    L_0x00a5:
        r0 = 0;
        r6.setVisibility(r0);	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = 19;
        if (r0 < r1) goto L_0x00ca;
    L_0x00af:
        r0 = r6.n;	 Catch:{ IllegalArgumentException -> 0x00db }
        if (r0 == 0) goto L_0x00ca;
    L_0x00b3:
        r0 = r6.n;	 Catch:{ IllegalArgumentException -> 0x00dd }
        r1 = 1;
        if (r0 == r1) goto L_0x00bc;
    L_0x00b8:
        r0 = r6.a;	 Catch:{ IllegalArgumentException -> 0x00df }
        if (r0 == 0) goto L_0x00ca;
    L_0x00bc:
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = r6.getContext();	 Catch:{ IllegalArgumentException -> 0x00df }
        r3 = r6.a(r3);	 Catch:{ IllegalArgumentException -> 0x00df }
        r6.setPadding(r0, r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x00df }
    L_0x00ca:
        return;
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00cf }
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r0 = move-exception;
        throw r0;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d7 }
    L_0x00d7:
        r0 = move-exception;
        throw r0;
    L_0x00d9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00db }
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00dd }
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00df }
    L_0x00df:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.undobar.UndoBarController.a(boolean, java.lang.CharSequence, android.os.Parcelable):void");
    }

    private void a(a aVar) {
        this.s = aVar;
    }

    private boolean a() {
        try {
            if (this.p < 600.0f) {
                if (!this.b) {
                    try {
                        return false;
                    }
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static void b(Activity activity) {
        UndoBarController c = c(activity);
        if (c != null) {
            try {
                c.setVisibility(8);
                c.h.removeCallbacks(c.t);
                if (c.s instanceof b) {
                    ((b) c.s).a();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    private static UndoBarController c(Activity activity) {
        View findViewById = activity.findViewById(R.id._undobar);
        return findViewById != null ? (UndoBarController) findViewById.getParent() : null;
    }

    private static Animation a(AnimationListener animationListener) {
        Animation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 1.0f);
        translateAnimation.setDuration(500);
        translateAnimation.setInterpolator(new AnticipateOvershootInterpolator(1.0f));
        translateAnimation.setAnimationListener(animationListener);
        return translateAnimation;
    }

    public static UndoBarController a(Activity activity, CharSequence charSequence, a aVar, Parcelable parcelable, boolean z, c cVar, int i) {
        UndoBarController a = a(activity);
        if (cVar == null) {
            try {
                throw new IllegalArgumentException(z[11]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        a.l = cVar;
        a.a(aVar);
        a.a(z, charSequence, parcelable);
        a.n = i;
        return a;
    }

    static Parcelable a(UndoBarController undoBarController) {
        return undoBarController.g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(14)
    private int a(android.content.Context r5) {
        /*
        r4_this = this;
        r1 = 0;
        r2 = r5.getResources();
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0027 }
        r3 = 14;
        if (r0 < r3) goto L_0x003a;
    L_0x000b:
        r0 = r4.b(r5);	 Catch:{ IllegalArgumentException -> 0x0029 }
        if (r0 == 0) goto L_0x003a;
    L_0x0011:
        r0 = r4.b;	 Catch:{ IllegalArgumentException -> 0x0029 }
        if (r0 == 0) goto L_0x001f;
    L_0x0015:
        r0 = z;
        r3 = 9;
        r0 = r0[r3];
        r3 = f;	 Catch:{ IllegalArgumentException -> 0x002b }
        if (r3 == 0) goto L_0x0035;
    L_0x001f:
        r0 = r4.a();	 Catch:{ IllegalArgumentException -> 0x002d }
        if (r0 != 0) goto L_0x002f;
    L_0x0025:
        r0 = r1;
    L_0x0026:
        return r0;
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = z;
        r1 = 10;
        r0 = r0[r1];
    L_0x0035:
        r0 = r4.a(r2, r0);
        goto L_0x0026;
    L_0x003a:
        r0 = r1;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.undobar.UndoBarController.a(android.content.Context):int");
    }

    private int a(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, z[1], z[0]);
        return identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
    }

    static void a(UndoBarController undoBarController, boolean z) {
        undoBarController.a(z);
    }

    private UndoBarController(Context context, AttributeSet attributeSet) {
        boolean z = true;
        super(context, attributeSet);
        this.l = j;
        this.h = new Handler();
        this.t = new e(this);
        this.n = -1;
        LayoutInflater.from(context).inflate(R.layout.undobar, this, true);
        this.d = (TextView) findViewById(R.id.undobar_message);
        this.m = (TextView) findViewById(R.id.undobar_button);
        this.m.setOnClickListener(new f(this));
        a(true);
        if (VERSION.SDK_INT >= 19) {
            WindowManager windowManager = (WindowManager) context.getSystemService(z[15]);
            if (getResources().getConfiguration().orientation != 1) {
                z = false;
            }
            this.b = z;
            try {
                Method declaredMethod = Class.forName(z[14]).getDeclaredMethod(z[13], new Class[]{String.class});
                declaredMethod.setAccessible(true);
                this.e = (String) declaredMethod.invoke(null, new Object[]{z[12]});
            } catch (Throwable th) {
                this.e = null;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16843759, 16843760});
            try {
                this.a = obtainStyledAttributes.getBoolean(1, false);
                try {
                    if (!r) {
                        if (getContext() == null) {
                            throw new AssertionError();
                        }
                    }
                    if ((((Activity) getContext()).getWindow().getAttributes().flags & 134217728) != 0) {
                        this.a = true;
                    }
                    this.p = a(windowManager);
                } catch (Throwable th2) {
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    static a b(UndoBarController undoBarController) {
        return undoBarController.s;
    }

    private static Animation b(AnimationListener animationListener) {
        Animation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
        translateAnimation.setDuration(500);
        translateAnimation.setInterpolator(new OvershootInterpolator(1.0f));
        translateAnimation.setAnimationListener(animationListener);
        return translateAnimation;
    }
}
