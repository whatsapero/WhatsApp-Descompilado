package com.whatsapp.appwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.m8;
import com.whatsapp.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

class e implements Runnable {
    private final AtomicBoolean a;
    private final int[] b;
    private final AppWidgetManager c;
    private final Context d;

    static AppWidgetManager c(e eVar) {
        return eVar.c;
    }

    e(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        boolean z = WidgetProvider.b;
        this.a = new AtomicBoolean();
        this.d = context;
        this.c = appWidgetManager;
        this.b = iArr;
        if (DialogToastActivity.i) {
            WidgetProvider.b = !z;
        }
    }

    private boolean b() {
        return this.a.get();
    }

    static int[] a(e eVar) {
        return eVar.b;
    }

    private ArrayList a() {
        boolean z = WidgetProvider.b;
        if (b()) {
            return null;
        }
        ArrayList b = v.b();
        List arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!b()) {
                m8 a = App.P.a(str);
                if (a.a > 0) {
                    Collection a2 = App.aJ.a(str, Math.min(a.a, 100));
                    if (a2 != null) {
                        arrayList.addAll(a2);
                        continue;
                    } else {
                        continue;
                    }
                }
                if (z) {
                    break;
                }
            }
            return null;
        }
        Collections.sort(arrayList, new f(this));
        return arrayList;
    }

    static Context b(e eVar) {
        return eVar.d;
    }

    public void c() {
        this.a.set(true);
    }

    public void run() {
        ArrayList a = a();
        if (a != null) {
            App.p.U().post(new b(this, a));
        }
    }
}
