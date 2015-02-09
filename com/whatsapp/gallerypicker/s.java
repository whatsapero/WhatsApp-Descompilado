package com.whatsapp.gallerypicker;

import android.net.Uri;
import android.support.v4.view.PagerAdapter;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.PhotoView;
import com.whatsapp.alk;
import com.whatsapp.b7;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class s extends PagerAdapter {
    private static final String z;
    final ImagePreview a;

    static {
        char[] toCharArray = "cDo\u001f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 6;
                    break;
                case ay.f /*1*/:
                    i2 = 32;
                    break;
                case ay.n /*2*/:
                    i2 = 6;
                    break;
                case ay.p /*3*/:
                    i2 = 107;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private s(ImagePreview imagePreview) {
        this.a = imagePreview;
    }

    s(ImagePreview imagePreview, a aVar) {
        this(imagePreview);
    }

    public int getItemPosition(Object obj) {
        int indexOf = ImagePreview.q(this.a).indexOf((Uri) ((View) obj).getTag());
        return indexOf < 0 ? -2 : indexOf;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = this.a.getLayoutInflater().inflate(R.layout.image_preview_page, null, false);
        PhotoView photoView = (PhotoView) inflate.findViewById(R.id.photo);
        if (ImagePreview.o(this.a)) {
            photoView.setHeightForInitialScaleCalculation(ImagePreview.x(this.a));
        }
        Uri uri = (Uri) ImagePreview.q(this.a).get(i);
        ImagePreview.a(this.a, photoView, uri);
        TextView textView = (TextView) inflate.findViewById(R.id.counter);
        TextView textView2 = (ConversationTextEntry) inflate.findViewById(R.id.caption);
        textView2.setInputEnterDone(true);
        textView2.setOnEditorActionListener(new f(this, textView2));
        textView2.setTag(uri.toString() + z);
        textView2.setFilters(new InputFilter[]{new alk(160)});
        textView2.setText((CharSequence) ImagePreview.b(this.a).get(uri));
        textView2.addTextChangedListener(new i(this, textView2, textView, uri));
        b7.a(textView2);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.emoji_picker_btn);
        imageButton.setOnClickListener(new m(this, imageButton));
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public int getCount() {
        return ImagePreview.q(this.a).size();
    }
}
