package com.whatsapp;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.PopupWindow;
import com.actionbarsherlock.R;

public class nc extends PopupWindow {
    public nc(Activity activity) {
        super(activity);
        View frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new LayoutParams(-2, -2));
        b7.a(activity.getLayoutInflater(), R.layout.attachment_picker, frameLayout, true);
        frameLayout.getChildAt(0).setVisibility(0);
        setContentView(frameLayout);
        frameLayout.measure(MeasureSpec.makeMeasureSpec(-2, 0), MeasureSpec.makeMeasureSpec(-2, 0));
        setBackgroundDrawable(new BitmapDrawable());
        setWidth(frameLayout.getMeasuredWidth());
        setHeight(frameLayout.getMeasuredHeight());
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setTouchInterceptor(new sy(this, frameLayout, activity));
    }

    public void a(View view) {
        int i = (int) (am1.a().g * 8.0f);
        if (VERSION.SDK_INT >= 19) {
            showAsDropDown(view, 0, -i, 8388661);
            if (App.az == 0) {
                return;
            }
        }
        showAsDropDown(view, 0, -i);
    }
}
