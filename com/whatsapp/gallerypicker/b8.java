package com.whatsapp.gallerypicker;

import com.whatsapp.yf;
import java.text.Collator;
import java.util.Comparator;
import java.util.Map.Entry;

class b8 implements Comparator {
    final GalleryPicker a;

    public int compare(Object obj, Object obj2) {
        return a((Entry) obj, (Entry) obj2);
    }

    b8(GalleryPicker galleryPicker) {
        this.a = galleryPicker;
    }

    public int a(Entry entry, Entry entry2) {
        int i = -1;
        int i2 = ImagePreview.y;
        Collator instance = Collator.getInstance();
        instance.setStrength(0);
        instance.setDecomposition(1);
        int compare = instance.compare((String) entry.getValue(), (String) entry2.getValue());
        if (compare == 0) {
            return compare;
        }
        if (yf.x.equals(entry.getValue())) {
            if (i2 == 0) {
                return -1;
            }
            compare = -1;
        }
        if (yf.x.equals(entry2.getValue())) {
            if (i2 == 0) {
                return 1;
            }
            compare = 1;
        }
        if (!yf.b.equals(entry.getValue())) {
            i = compare;
        } else if (i2 == 0) {
            return -1;
        }
        return yf.b.equals(entry2.getValue()) ? 1 : i;
    }
}
