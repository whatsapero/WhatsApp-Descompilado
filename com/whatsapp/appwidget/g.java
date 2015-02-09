package com.whatsapp.appwidget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService.RemoteViewsFactory;
import com.actionbarsherlock.R;
import com.whatsapp.App;
import com.whatsapp.m8;
import com.whatsapp.notification.t;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.bm;
import java.util.ArrayList;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

@TargetApi(11)
public class g implements RemoteViewsFactory {
    private static final String[] z;
    private final Context a;
    private ArrayList b;

    static {
        String[] strArr = new String[4];
        String str = "S=f";
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
                        i3 = 57;
                        break;
                    case ay.f /*1*/:
                        i3 = 84;
                        break;
                    case ay.n /*2*/:
                        i3 = 2;
                        break;
                    case ay.p /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 92;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "N=f/9M\"k-+J2c+(V&{g3W0g;(K;{";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "N=f/9M\"k-+J2c+(V&{g3W7p-=M1";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "N=f/9M\"k-+J2c+(V&{g3W0c<=J1v+4X:e-8";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public void onDataSetChanged() {
        boolean z = WidgetProvider.b;
        Log.i(z[1]);
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ArrayList b = WidgetProvider.b();
            this.b.clear();
            if (b != null) {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    a aVar = new a(null);
                    m8 a = App.P.a(bVar.e.c);
                    aVar.c = a.e;
                    aVar.a = a5.a(a.a(this.a));
                    aVar.b = a5.a(t.a(this.a, bVar, a, false, false));
                    aVar.d = bm.h(this.a, App.f(bVar));
                    this.b.add(aVar);
                    if (z) {
                        break;
                    }
                }
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public RemoteViews getViewAt(int i) {
        if (i >= this.b.size()) {
            return null;
        }
        RemoteViews remoteViews = new RemoteViews(this.a.getPackageName(), R.layout.widget_row);
        a aVar = (a) this.b.get(i);
        remoteViews.setTextViewText(R.id.heading, aVar.a);
        remoteViews.setTextViewText(R.id.content, aVar.b);
        remoteViews.setTextViewText(R.id.date, aVar.d);
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString(z[0], aVar.c);
        intent.putExtras(bundle);
        remoteViews.setOnClickFillInIntent(R.id.widget_row, intent);
        return remoteViews;
    }

    public void onDestroy() {
        Log.i(z[2]);
    }

    public g(Context context) {
        this.b = new ArrayList();
        this.a = context;
    }

    public void onCreate() {
        Log.i(z[3]);
        onDataSetChanged();
    }

    public int getCount() {
        return this.b.size();
    }
}
