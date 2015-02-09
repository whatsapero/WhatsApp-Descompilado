package com.whatsapp;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.view.View;
import java.io.File;
import java.util.ArrayList;

public class VideoTimelineView extends View {
    private int a;
    private Rect b;
    private ArrayList c;
    private AsyncTask d;
    private File e;
    private RectF f;
    private Paint g;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onDraw(android.graphics.Canvas r10) {
        /*
        r9_this = this;
        r4 = 0;
        r2 = 0;
        r3 = com.whatsapp.App.az;
        super.onDraw(r10);
        r0 = r9.e;
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return;
    L_0x000c:
        r0 = r9.a;
        r1 = r9.getWidth();
        if (r0 == r1) goto L_0x0028;
    L_0x0014:
        r0 = r9.getWidth();
        r9.a = r0;
        r9.c = r4;
        r0 = r9.d;
        if (r0 == 0) goto L_0x0028;
    L_0x0020:
        r0 = r9.d;
        r1 = 1;
        r0.cancel(r1);
        r9.d = r4;
    L_0x0028:
        r0 = r9.c;
        if (r0 != 0) goto L_0x005c;
    L_0x002c:
        r0 = r9.d;
        if (r0 != 0) goto L_0x000b;
    L_0x0030:
        r0 = r9.getWidth();
        r1 = r9.getHeight();
        r0 = r0 / r1;
        r1 = r9.getHeight();
        r1 = (float) r1;
        r4 = r9.getWidth();
        r4 = (float) r4;
        r5 = (float) r0;
        r4 = r4 / r5;
        r5 = new java.util.ArrayList;
        r5.<init>(r0);
        r9.c = r5;
        r5 = new com.whatsapp.am3;
        r5.<init>(r9, r4, r1, r0);
        r9.d = r5;
        r0 = r9.d;
        r1 = new java.lang.Void[r2];
        r0.execute(r1);
        if (r3 == 0) goto L_0x000b;
    L_0x005c:
        r0 = r9.getWidth();
        r1 = r9.getHeight();
        r0 = r0 / r1;
        r1 = r9.getWidth();
        r1 = (float) r1;
        r0 = (float) r0;
        r4 = r1 / r0;
        r0 = r9.f;
        r1 = 0;
        r0.top = r1;
        r0 = r9.f;
        r1 = r9.getHeight();
        r1 = (float) r1;
        r0.bottom = r1;
        r1 = r2;
    L_0x007c:
        r0 = r9.c;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x000b;
    L_0x0084:
        r0 = r9.f;
        r5 = (float) r1;
        r5 = r5 * r4;
        r0.left = r5;
        r0 = r9.f;
        r5 = r9.f;
        r5 = r5.left;
        r5 = r5 + r4;
        r0.right = r5;
        r0 = r9.c;
        r0 = r0.get(r1);
        r0 = (android.graphics.Bitmap) r0;
        if (r0 == 0) goto L_0x00e3;
    L_0x009d:
        r5 = r0.getWidth();
        r6 = r0.getHeight();
        if (r5 <= r6) goto L_0x00c2;
    L_0x00a7:
        r7 = r9.b;
        r7.top = r2;
        r7 = r9.b;
        r7.bottom = r6;
        r7 = r9.b;
        r8 = r5 - r6;
        r8 = r8 / 2;
        r7.left = r8;
        r7 = r9.b;
        r8 = r9.b;
        r8 = r8.left;
        r8 = r8 + r6;
        r7.right = r8;
        if (r3 == 0) goto L_0x00da;
    L_0x00c2:
        r7 = r9.b;
        r7.left = r2;
        r7 = r9.b;
        r7.right = r5;
        r7 = r9.b;
        r6 = r6 - r5;
        r6 = r6 / 2;
        r7.top = r6;
        r6 = r9.b;
        r7 = r9.b;
        r7 = r7.top;
        r5 = r5 + r7;
        r6.bottom = r5;
    L_0x00da:
        r5 = r9.b;
        r6 = r9.f;
        r7 = r9.g;
        r10.drawBitmap(r0, r5, r6, r7);
    L_0x00e3:
        r0 = r1 + 1;
        if (r3 != 0) goto L_0x000b;
    L_0x00e7:
        r1 = r0;
        goto L_0x007c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VideoTimelineView.onDraw(android.graphics.Canvas):void");
    }

    public VideoTimelineView(Context context) {
        super(context);
        this.g = new Paint(1);
        this.f = new RectF();
        this.b = new Rect();
    }

    static Paint a(VideoTimelineView videoTimelineView) {
        return videoTimelineView.g;
    }

    static ArrayList c(VideoTimelineView videoTimelineView) {
        return videoTimelineView.c;
    }

    public void setVideoFile(File file) {
        this.e = file;
        this.c = null;
        if (this.d != null) {
            this.d.cancel(true);
            this.d = null;
        }
        invalidate();
    }

    static File b(VideoTimelineView videoTimelineView) {
        return videoTimelineView.e;
    }
}
