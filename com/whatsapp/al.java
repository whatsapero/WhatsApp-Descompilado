package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class al extends Drawable {
    final ConversationRow a;

    protected boolean onStateChange(int[] iArr) {
        return true;
    }

    public void draw(Canvas canvas) {
    }

    public boolean isStateful() {
        return true;
    }

    al(ConversationRow conversationRow) {
        this.a = conversationRow;
    }

    protected boolean onLevelChange(int i) {
        return true;
    }

    public void setAlpha(int i) {
    }

    public boolean setState(int[] iArr) {
        invalidateSelf();
        return true;
    }

    public int getOpacity() {
        return -3;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
