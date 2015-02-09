package com.whatsapp;

import android.support.v4.text.TextDirectionHeuristicCompat;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class vm implements TextDirectionHeuristicCompat {
    vm() {
    }

    public boolean isRtl(CharSequence charSequence, int i, int i2) {
        int i3 = App.az;
        int i4 = i;
        while (i4 < i + i2) {
            int codePointAt = Character.codePointAt(charSequence, i4);
            int charCount = Character.charCount(codePointAt);
            if (codePointAt < 127462 || codePointAt > 127487) {
                switch (Character.getDirectionality(codePointAt)) {
                    case PBE.MD5 /*0*/:
                    case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    case vk.SherlockTheme_actionModeBackground /*15*/:
                        return false;
                    case ay.f /*1*/:
                    case ay.n /*2*/:
                    case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                        return true;
                }
            }
            i4 += charCount;
            if (i3 != 0) {
                return false;
            }
        }
        return false;
    }
}
