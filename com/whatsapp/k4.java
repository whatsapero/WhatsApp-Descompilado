package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.actionbarsherlock.R;
import com.whatsapp.util.g;

public class k4 extends Dialog {
    private final int a;
    private final Activity b;

    public k4(Activity activity, int i) {
        super(activity, R.style.FullScreenDialog);
        this.b = activity;
        this.a = i;
    }

    public void a() {
        onCreate(onSaveInstanceState());
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (App.G == 3) {
            ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
            switch (i) {
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    return true;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    g.b();
                    return true;
                case 84:
                    g.a(viewGroup, this.b, false);
                    return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(b7.a(getWindow().getLayoutInflater(), this.a, null, false));
        getWindow().setLayout(-1, -1);
    }
}
