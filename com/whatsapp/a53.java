package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.actionbarsherlock.R;

class a53 extends AsyncTask {
    final Conversation a;

    a53(Conversation conversation, ak0 com_whatsapp_ak0) {
        this(conversation);
    }

    protected void onPostExecute(Object obj) {
        a((Bitmap) obj);
    }

    private a53(Conversation conversation) {
        this.a = conversation;
    }

    protected Bitmap a(Void[] voidArr) {
        Bitmap a = this.a.r.a(this.a.getResources().getDimensionPixelSize(R.dimen.conversation_imageview_size), this.a.getResources().getDimension(R.dimen.small_avatar_radius), false);
        return a == null ? this.a.r.j() : a;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(Bitmap bitmap) {
        Conversation.f(this.a).setImageDrawable(new ib(this.a, this.a.getResources(), bitmap));
        Conversation.f(this.a).setVisibility(0);
    }
}
