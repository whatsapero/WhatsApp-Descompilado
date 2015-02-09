package com.whatsapp;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class a_2 extends ObjectInputStream {
    private static final String z;
    final c_ a;

    static {
        char[] toCharArray = "0BBX8;L[\u0005.#]\u0001\u0002<".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 83;
                    break;
                case ay.f /*1*/:
                    i2 = 45;
                    break;
                case ay.n /*2*/:
                    i2 = 47;
                    break;
                case ay.p /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
        return z.equals(readClassDescriptor.getName()) ? ObjectStreamClass.lookup(EmojiPicker$EmojiWeight.class) : readClassDescriptor;
    }

    a_2(c_ c_Var, InputStream inputStream) {
        this.a = c_Var;
        super(inputStream);
    }
}
