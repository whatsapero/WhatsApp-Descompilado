package com.whatsapp;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.SeekBar;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class VoiceNoteSeekBar extends SeekBar {
    private int a;
    private MotionEvent b;

    public VoiceNoteSeekBar(Context context) {
        super(context);
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public VoiceNoteSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT >= 14) {
            return super.onTouchEvent(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case PBE.MD5 /*0*/:
                if (this.b != null) {
                    this.b.recycle();
                }
                this.b = MotionEvent.obtain(motionEvent);
                return true;
            case ay.f /*1*/:
            case ay.p /*3*/:
                if (this.b != null) {
                    this.b.recycle();
                    this.b = null;
                }
                return super.onTouchEvent(motionEvent);
            case ay.n /*2*/:
                if (this.b != null && Math.abs(motionEvent.getX() - this.b.getX()) > ((float) this.a)) {
                    super.onTouchEvent(this.b);
                    this.b.recycle();
                    this.b = null;
                }
                return this.b == null ? super.onTouchEvent(motionEvent) : true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public VoiceNoteSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
