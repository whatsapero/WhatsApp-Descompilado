package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.ge;
import com.whatsapp.util.bx;
import com.whatsapp.util.f;
import java.io.FileNotFoundException;
import java.io.IOException;

class as implements y {
    final Uri a;
    final ImagePreview b;
    final int c;
    final Uri d;

    public String b() {
        return this.a.toString();
    }

    as(ImagePreview imagePreview, int i, Uri uri, Uri uri2) {
        this.b = imagePreview;
        this.c = i;
        this.d = uri;
        this.a = uri2;
    }

    public Bitmap a() {
        try {
            int i;
            if (this.c == 0) {
                i = ge.h;
            } else {
                i = Math.min(this.c, ge.h);
            }
            return f.a(this.d, i, i);
        } catch (FileNotFoundException e) {
            throw e;
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            try {
                return null;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            return null;
        } catch (bx e4) {
            e4.printStackTrace();
            return null;
        } catch (FileNotFoundException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
