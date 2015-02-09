package com.whatsapp;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.view.MotionEvent;
import android.view.View;

public abstract class n extends CharacterStyle implements UpdateAppearance {
    public abstract boolean a(View view, MotionEvent motionEvent);

    public abstract void updateDrawState(TextPaint textPaint);
}
