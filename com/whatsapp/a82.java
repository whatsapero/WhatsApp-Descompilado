package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a82 implements OnClickListener {
    private static final String z;
    final c_ a;

    static {
        char[] toCharArray = "\rO0{h".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 104;
                    break;
                case ay.f /*1*/:
                    i2 = 34;
                    break;
                case ay.n /*2*/:
                    i2 = 95;
                    break;
                case ay.p /*3*/:
                    i2 = 17;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a82(c_ c_Var) {
        this.a = c_Var;
    }

    public void onClick(View view) {
        int i;
        int i2 = 0;
        int i3 = App.az;
        int intValue = ((Integer) view.getTag()).intValue();
        Iterator it = c_.b().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            EmojiPicker$EmojiWeight emojiPicker$EmojiWeight = (EmojiPicker$EmojiWeight) it.next();
            try {
                if (emojiPicker$EmojiWeight.code != intValue) {
                    emojiPicker$EmojiWeight.weight *= 0.9f;
                    if (i3 == 0) {
                        i = i4;
                        if (i3 != 0) {
                            break;
                        }
                        i4 = i;
                    }
                }
                emojiPicker$EmojiWeight.weight += 1.0f;
                i = 1;
                if (i3 != 0) {
                    break;
                }
                i4 = i;
            } catch (FileNotFoundException e) {
                throw e;
            }
        }
        i = i4;
        if (i == 0) {
            try {
                c_.b().add(new EmojiPicker$EmojiWeight(intValue, 1.0f));
            } catch (FileNotFoundException e2) {
                throw e2;
            }
        }
        Collections.sort(c_.b(), c_.e(this.a));
        i4 = c_.b().size() - 1;
        while (i4 > 35) {
            try {
                if (((EmojiPicker$EmojiWeight) c_.b().get(i4)).weight < 0.1f) {
                    c_.b().remove(i4);
                }
                i = i4 - 1;
                if (i3 == 0) {
                    i4 = i;
                }
            } catch (FileNotFoundException e22) {
                throw e22;
            }
        }
        try {
            break;
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(App.p.getFilesDir(), z)));
            objectOutputStream.writeObject(c_.b());
            objectOutputStream.close();
        } catch (Throwable e3) {
            Log.c(e3);
        } catch (Throwable e32) {
            Log.c(e32);
        }
        try {
            if (c_.e() != 0) {
                c_.f(this.a)[0].notifyDataSetChanged();
            }
            if (c_.g(this.a) != null) {
                int[] g = a5.g(intValue);
                if (g == null) {
                    try {
                        c_.g(this.a).a(a5.d(intValue));
                        if (i3 == 0) {
                            return;
                        }
                    } catch (FileNotFoundException e222) {
                        throw e222;
                    }
                }
                i4 = g.length;
                while (i2 < i4) {
                    c_.g(this.a).a(g[i2]);
                    i2++;
                    if (i3 != 0) {
                        return;
                    }
                }
            }
        } catch (FileNotFoundException e2222) {
            throw e2222;
        }
    }
}
