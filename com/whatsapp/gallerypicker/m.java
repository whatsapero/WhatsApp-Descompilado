package com.whatsapp.gallerypicker;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.actionbarsherlock.R;

class m implements OnClickListener {
    final s a;
    final ImageButton b;

    m(s sVar, ImageButton imageButton) {
        this.a = sVar;
        this.b = imageButton;
    }

    public void onClick(View view) {
        int i = ImagePreview.y;
        if (ImagePreview.u(this.a.a).isShowing()) {
            ImagePreview.u(this.a.a).dismiss();
            if (i == 0) {
                return;
            }
        }
        ImagePreview.u(this.a.a).a(this.b, this.b, this.b, true);
        int childCount = ImagePreview.l(this.a.a).getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            ImageButton imageButton = (ImageButton) ImagePreview.l(this.a.a).getChildAt(i2).findViewById(R.id.emoji_picker_btn);
            if (imageButton != null) {
                imageButton.setImageResource(R.drawable.emoji_kbd_white);
            }
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }
}
