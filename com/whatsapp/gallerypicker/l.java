package com.whatsapp.gallerypicker;

import android.app.Activity;
import android.widget.ImageButton;
import com.actionbarsherlock.R;
import com.whatsapp.ee;

class l extends ee {
    final ImagePreview i;

    public void dismiss() {
        int i = ImagePreview.y;
        super.dismiss();
        int childCount = ImagePreview.l(this.i).getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            ImageButton imageButton = (ImageButton) ImagePreview.l(this.i).getChildAt(i2).findViewById(R.id.emoji_picker_btn);
            if (imageButton != null) {
                imageButton.setImageResource(R.drawable.emoji_btn_white);
            }
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    l(ImagePreview imagePreview, Activity activity) {
        this.i = imagePreview;
        super(activity);
    }
}
