package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.jx;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class a {
    private LifecycleDelegate Tu;
    private Bundle Tv;
    private LinkedList Tw;
    private final f Tx;

    interface a {
        void b(LifecycleDelegate lifecycleDelegate);

        int getState();
    }

    class AnonymousClass_2 implements a {
        final Bundle TA;
        final Bundle TB;
        final a Ty;
        final Activity Tz;

        AnonymousClass_2(a aVar, Activity activity, Bundle bundle, Bundle bundle2) {
            this.Ty = aVar;
            this.Tz = activity;
            this.TA = bundle;
            this.TB = bundle2;
        }

        public void b(LifecycleDelegate lifecycleDelegate) {
            a.b(this.Ty).onInflate(this.Tz, this.TA, this.TB);
        }

        public int getState() {
            return 0;
        }
    }

    class AnonymousClass_3 implements a {
        final Bundle TB;
        final a Ty;

        AnonymousClass_3(a aVar, Bundle bundle) {
            this.Ty = aVar;
            this.TB = bundle;
        }

        public void b(LifecycleDelegate lifecycleDelegate) {
            a.b(this.Ty).onCreate(this.TB);
        }

        public int getState() {
            return 1;
        }
    }

    class AnonymousClass_4 implements a {
        final Bundle TB;
        final FrameLayout TC;
        final LayoutInflater TD;
        final ViewGroup TE;
        final a Ty;

        AnonymousClass_4(a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.Ty = aVar;
            this.TC = frameLayout;
            this.TD = layoutInflater;
            this.TE = viewGroup;
            this.TB = bundle;
        }

        public void b(LifecycleDelegate lifecycleDelegate) {
            this.TC.removeAllViews();
            this.TC.addView(a.b(this.Ty).onCreateView(this.TD, this.TE, this.TB));
        }

        public int getState() {
            return 2;
        }
    }

    final class AnonymousClass_5 implements OnClickListener {
        final int TF;
        final Context nf;

        AnonymousClass_5(Context context, int i) {
            this.nf = context;
            this.TF = i;
        }

        public void onClick(View view) {
            this.nf.startActivity(GooglePlayServicesUtil.aj(this.TF));
        }
    }

    public a() {
        this.Tx = new f() {
            final a Ty;

            {
                this.Ty = r1;
            }

            public void a(LifecycleDelegate lifecycleDelegate) {
                boolean z = com.google.android.gms.dynamic.d.a.a;
                a.a(this.Ty, lifecycleDelegate);
                Iterator it = a.a(this.Ty).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).b(a.b(this.Ty));
                    if (z) {
                        break;
                    }
                }
                a.a(this.Ty).clear();
                a.a(this.Ty, null);
                if (jx.a != 0) {
                    com.google.android.gms.dynamic.d.a.a = !z;
                }
            }
        };
    }

    static Bundle a(a aVar, Bundle bundle) {
        aVar.Tv = bundle;
        return bundle;
    }

    static LifecycleDelegate a(a aVar, LifecycleDelegate lifecycleDelegate) {
        aVar.Tu = lifecycleDelegate;
        return lifecycleDelegate;
    }

    static LinkedList a(a aVar) {
        return aVar.Tw;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.os.Bundle r2, com.google.android.gms.dynamic.a.a r3) {
        /*
        r1_this = this;
        r0 = r1.Tu;
        if (r0 == 0) goto L_0x000a;
    L_0x0004:
        r0 = r1.Tu;
        r3.b(r0);
    L_0x0009:
        return;
    L_0x000a:
        r0 = r1.Tw;
        if (r0 != 0) goto L_0x0015;
    L_0x000e:
        r0 = new java.util.LinkedList;
        r0.<init>();
        r1.Tw = r0;
    L_0x0015:
        r0 = r1.Tw;
        r0.add(r3);
        if (r2 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r1.Tv;
        if (r0 != 0) goto L_0x002c;
    L_0x0020:
        r0 = r2.clone();
        r0 = (android.os.Bundle) r0;
        r1.Tv = r0;
        r0 = com.google.android.gms.dynamic.d.a.a;
        if (r0 == 0) goto L_0x0031;
    L_0x002c:
        r0 = r1.Tv;
        r0.putAll(r2);
    L_0x0031:
        r0 = r1.Tx;
        r1.a(r0);
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamic.a.a(android.os.Bundle, com.google.android.gms.dynamic.a$a):void");
    }

    static LifecycleDelegate b(a aVar) {
        return aVar.Tu;
    }

    public static void b(FrameLayout frameLayout) {
        boolean z = com.google.android.gms.dynamic.d.a.a;
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        CharSequence b = GooglePlayServicesUtil.b(context, isGooglePlayServicesAvailable);
        CharSequence c = GooglePlayServicesUtil.c(context, isGooglePlayServicesAvailable);
        View linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        View textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setText(b);
        linearLayout.addView(textView);
        if (c != null) {
            View button = new Button(context);
            button.setLayoutParams(new LayoutParams(-2, -2));
            button.setText(c);
            linearLayout.addView(button);
            button.setOnClickListener(new AnonymousClass_5(context, isGooglePlayServicesAvailable));
        }
        if (z) {
            jx.a++;
        }
    }

    private void cG(int i) {
        boolean z = com.google.android.gms.dynamic.d.a.a;
        while (!this.Tw.isEmpty() && ((a) this.Tw.getLast()).getState() >= i) {
            this.Tw.removeLast();
            if (z) {
                return;
            }
        }
    }

    protected void a(FrameLayout frameLayout) {
        b(frameLayout);
    }

    protected abstract void a(f fVar);

    public LifecycleDelegate je() {
        return this.Tu;
    }

    public void onCreate(Bundle bundle) {
        a(bundle, new AnonymousClass_3(this, bundle));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        a(bundle, new AnonymousClass_4(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.Tu == null) {
            a(frameLayout);
        }
        return frameLayout;
    }

    public void onDestroy() {
        if (this.Tu != null) {
            this.Tu.onDestroy();
            if (!com.google.android.gms.dynamic.d.a.a) {
                return;
            }
        }
        cG(1);
    }

    public void onDestroyView() {
        if (this.Tu != null) {
            this.Tu.onDestroyView();
            if (!com.google.android.gms.dynamic.d.a.a) {
                return;
            }
        }
        cG(2);
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        a(bundle2, new AnonymousClass_2(this, activity, bundle, bundle2));
    }

    public void onLowMemory() {
        if (this.Tu != null) {
            this.Tu.onLowMemory();
        }
    }

    public void onPause() {
        if (this.Tu != null) {
            this.Tu.onPause();
            if (!com.google.android.gms.dynamic.d.a.a) {
                return;
            }
        }
        cG(5);
    }

    public void onResume() {
        a(null, new a() {
            final a Ty;

            {
                this.Ty = r1;
            }

            public void b(LifecycleDelegate lifecycleDelegate) {
                a.b(this.Ty).onResume();
            }

            public int getState() {
                return 5;
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (this.Tu != null) {
            this.Tu.onSaveInstanceState(bundle);
            if (!com.google.android.gms.dynamic.d.a.a) {
                return;
            }
        }
        if (this.Tv != null) {
            bundle.putAll(this.Tv);
        }
    }
}
