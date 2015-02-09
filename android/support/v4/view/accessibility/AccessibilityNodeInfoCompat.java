package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.app.Fragment;
import android.view.View;
import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class AccessibilityNodeInfoCompat {
    private static final AccessibilityNodeInfoImpl IMPL;
    public static int a;
    private static final String[] z;
    private final Object mInfo;

    interface AccessibilityNodeInfoImpl {
        void addAction(Object obj, int i);

        void addChild(Object obj, View view);

        int getActions(Object obj);

        void getBoundsInParent(Object obj, Rect rect);

        void getBoundsInScreen(Object obj, Rect rect);

        CharSequence getClassName(Object obj);

        CharSequence getContentDescription(Object obj);

        int getMovementGranularities(Object obj);

        CharSequence getPackageName(Object obj);

        CharSequence getText(Object obj);

        String getViewIdResourceName(Object obj);

        boolean isAccessibilityFocused(Object obj);

        boolean isCheckable(Object obj);

        boolean isChecked(Object obj);

        boolean isClickable(Object obj);

        boolean isEnabled(Object obj);

        boolean isFocusable(Object obj);

        boolean isFocused(Object obj);

        boolean isLongClickable(Object obj);

        boolean isPassword(Object obj);

        boolean isScrollable(Object obj);

        boolean isSelected(Object obj);

        boolean isVisibleToUser(Object obj);

        Object obtain(Object obj);

        void recycle(Object obj);

        void setAccessibilityFocused(Object obj, boolean z);

        void setBoundsInParent(Object obj, Rect rect);

        void setBoundsInScreen(Object obj, Rect rect);

        void setClassName(Object obj, CharSequence charSequence);

        void setClickable(Object obj, boolean z);

        void setContentDescription(Object obj, CharSequence charSequence);

        void setEnabled(Object obj, boolean z);

        void setFocusable(Object obj, boolean z);

        void setFocused(Object obj, boolean z);

        void setLongClickable(Object obj, boolean z);

        void setMovementGranularities(Object obj, int i);

        void setPackageName(Object obj, CharSequence charSequence);

        void setParent(Object obj, View view);

        void setScrollable(Object obj, boolean z);

        void setSelected(Object obj, boolean z);

        void setSource(Object obj, View view);

        void setVisibleToUser(Object obj, boolean z);
    }

    class AccessibilityNodeInfoStubImpl implements AccessibilityNodeInfoImpl {
        public int getActions(Object obj) {
            return 0;
        }

        public void setClassName(Object obj, CharSequence charSequence) {
        }

        public boolean isFocusable(Object obj) {
            return false;
        }

        public void setFocusable(Object obj, boolean z) {
        }

        public boolean isAccessibilityFocused(Object obj) {
            return false;
        }

        public void addChild(Object obj, View view) {
        }

        public void setLongClickable(Object obj, boolean z) {
        }

        public void setBoundsInParent(Object obj, Rect rect) {
        }

        public boolean isClickable(Object obj) {
            return false;
        }

        public void setScrollable(Object obj, boolean z) {
        }

        public boolean isChecked(Object obj) {
            return false;
        }

        public void setMovementGranularities(Object obj, int i) {
        }

        public boolean isEnabled(Object obj) {
            return false;
        }

        public void recycle(Object obj) {
        }

        public void getBoundsInParent(Object obj, Rect rect) {
        }

        public void setAccessibilityFocused(Object obj, boolean z) {
        }

        public boolean isPassword(Object obj) {
            return false;
        }

        public int getMovementGranularities(Object obj) {
            return 0;
        }

        public boolean isScrollable(Object obj) {
            return false;
        }

        public Object obtain(Object obj) {
            return null;
        }

        public void setSelected(Object obj, boolean z) {
        }

        public boolean isLongClickable(Object obj) {
            return false;
        }

        public void setParent(Object obj, View view) {
        }

        public void setBoundsInScreen(Object obj, Rect rect) {
        }

        public CharSequence getPackageName(Object obj) {
            return null;
        }

        public CharSequence getContentDescription(Object obj) {
            return null;
        }

        public boolean isFocused(Object obj) {
            return false;
        }

        public void setClickable(Object obj, boolean z) {
        }

        public void setFocused(Object obj, boolean z) {
        }

        public void setContentDescription(Object obj, CharSequence charSequence) {
        }

        public void setVisibleToUser(Object obj, boolean z) {
        }

        public CharSequence getClassName(Object obj) {
            return null;
        }

        public void setPackageName(Object obj, CharSequence charSequence) {
        }

        public void addAction(Object obj, int i) {
        }

        AccessibilityNodeInfoStubImpl() {
        }

        public boolean isVisibleToUser(Object obj) {
            return false;
        }

        public void setEnabled(Object obj, boolean z) {
        }

        public void setSource(Object obj, View view) {
        }

        public CharSequence getText(Object obj) {
            return null;
        }

        public boolean isCheckable(Object obj) {
            return false;
        }

        public void getBoundsInScreen(Object obj, Rect rect) {
        }

        public boolean isSelected(Object obj) {
            return false;
        }

        public String getViewIdResourceName(Object obj) {
            return null;
        }
    }

    class AccessibilityNodeInfoIcsImpl extends AccessibilityNodeInfoStubImpl {
        public int getActions(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getActions(obj);
        }

        AccessibilityNodeInfoIcsImpl() {
        }

        public void getBoundsInScreen(Object obj, Rect rect) {
            AccessibilityNodeInfoCompatIcs.getBoundsInScreen(obj, rect);
        }

        public boolean isClickable(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isClickable(obj);
        }

        public void setSelected(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setSelected(obj, z);
        }

        public void setClassName(Object obj, CharSequence charSequence) {
            AccessibilityNodeInfoCompatIcs.setClassName(obj, charSequence);
        }

        public void getBoundsInParent(Object obj, Rect rect) {
            AccessibilityNodeInfoCompatIcs.getBoundsInParent(obj, rect);
        }

        public void setClickable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setClickable(obj, z);
        }

        public boolean isPassword(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isPassword(obj);
        }

        public void setBoundsInScreen(Object obj, Rect rect) {
            AccessibilityNodeInfoCompatIcs.setBoundsInScreen(obj, rect);
        }

        public void setBoundsInParent(Object obj, Rect rect) {
            AccessibilityNodeInfoCompatIcs.setBoundsInParent(obj, rect);
        }

        public Object obtain(Object obj) {
            return AccessibilityNodeInfoCompatIcs.obtain(obj);
        }

        public void setParent(Object obj, View view) {
            AccessibilityNodeInfoCompatIcs.setParent(obj, view);
        }

        public boolean isCheckable(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isCheckable(obj);
        }

        public CharSequence getText(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getText(obj);
        }

        public CharSequence getContentDescription(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getContentDescription(obj);
        }

        public boolean isEnabled(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isEnabled(obj);
        }

        public boolean isLongClickable(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isLongClickable(obj);
        }

        public void setSource(Object obj, View view) {
            AccessibilityNodeInfoCompatIcs.setSource(obj, view);
        }

        public void setLongClickable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setLongClickable(obj, z);
        }

        public CharSequence getClassName(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getClassName(obj);
        }

        public void addAction(Object obj, int i) {
            AccessibilityNodeInfoCompatIcs.addAction(obj, i);
        }

        public void recycle(Object obj) {
            AccessibilityNodeInfoCompatIcs.recycle(obj);
        }

        public boolean isSelected(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isSelected(obj);
        }

        public boolean isChecked(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isChecked(obj);
        }

        public CharSequence getPackageName(Object obj) {
            return AccessibilityNodeInfoCompatIcs.getPackageName(obj);
        }

        public boolean isScrollable(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isScrollable(obj);
        }

        public void setContentDescription(Object obj, CharSequence charSequence) {
            AccessibilityNodeInfoCompatIcs.setContentDescription(obj, charSequence);
        }

        public void setEnabled(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setEnabled(obj, z);
        }

        public void setFocusable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setFocusable(obj, z);
        }

        public boolean isFocused(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isFocused(obj);
        }

        public void addChild(Object obj, View view) {
            AccessibilityNodeInfoCompatIcs.addChild(obj, view);
        }

        public void setPackageName(Object obj, CharSequence charSequence) {
            AccessibilityNodeInfoCompatIcs.setPackageName(obj, charSequence);
        }

        public void setFocused(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setFocused(obj, z);
        }

        public boolean isFocusable(Object obj) {
            return AccessibilityNodeInfoCompatIcs.isFocusable(obj);
        }

        public void setScrollable(Object obj, boolean z) {
            AccessibilityNodeInfoCompatIcs.setScrollable(obj, z);
        }
    }

    class AccessibilityNodeInfoJellybeanImpl extends AccessibilityNodeInfoIcsImpl {
        public boolean isVisibleToUser(Object obj) {
            return AccessibilityNodeInfoCompatJellyBean.isVisibleToUser(obj);
        }

        public void setMovementGranularities(Object obj, int i) {
            AccessibilityNodeInfoCompatJellyBean.setMovementGranularities(obj, i);
        }

        public boolean isAccessibilityFocused(Object obj) {
            return AccessibilityNodeInfoCompatJellyBean.isAccessibilityFocused(obj);
        }

        public void setAccessibilityFocused(Object obj, boolean z) {
            AccessibilityNodeInfoCompatJellyBean.setAccesibilityFocused(obj, z);
        }

        public int getMovementGranularities(Object obj) {
            return AccessibilityNodeInfoCompatJellyBean.getMovementGranularities(obj);
        }

        public void setVisibleToUser(Object obj, boolean z) {
            AccessibilityNodeInfoCompatJellyBean.setVisibleToUser(obj, z);
        }

        AccessibilityNodeInfoJellybeanImpl() {
        }
    }

    class AccessibilityNodeInfoJellybeanMr2Impl extends AccessibilityNodeInfoJellybeanImpl {
        AccessibilityNodeInfoJellybeanMr2Impl() {
        }

        public String getViewIdResourceName(Object obj) {
            return AccessibilityNodeInfoCompatJellybeanMr2.getViewIdResourceName(obj);
        }
    }

    class AccessibilityNodeInfoKitKatImpl extends AccessibilityNodeInfoJellybeanMr2Impl {
        AccessibilityNodeInfoKitKatImpl() {
        }
    }

    class AccessibilityNodeInfoApi21Impl extends AccessibilityNodeInfoKitKatImpl {
        AccessibilityNodeInfoApi21Impl() {
        }
    }

    public void setClickable(boolean z) {
        IMPL.setClickable(this.mInfo, z);
    }

    public void addChild(View view) {
        IMPL.addChild(this.mInfo, view);
    }

    public void getBoundsInScreen(Rect rect) {
        IMPL.getBoundsInScreen(this.mInfo, rect);
    }

    public AccessibilityNodeInfoCompat(Object obj) {
        this.mInfo = obj;
    }

    public void setClassName(CharSequence charSequence) {
        IMPL.setClassName(this.mInfo, charSequence);
    }

    public void setMovementGranularities(int i) {
        IMPL.setMovementGranularities(this.mInfo, i);
    }

    public void setFocusable(boolean z) {
        IMPL.setFocusable(this.mInfo, z);
    }

    public int getActions() {
        return IMPL.getActions(this.mInfo);
    }

    public void setScrollable(boolean z) {
        IMPL.setScrollable(this.mInfo, z);
    }

    public int getMovementGranularities() {
        return IMPL.getMovementGranularities(this.mInfo);
    }

    public String toString() {
        int i = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        getBoundsInParent(rect);
        stringBuilder.append(z[34] + rect);
        getBoundsInScreen(rect);
        stringBuilder.append(z[35] + rect);
        stringBuilder.append(z[23]).append(getPackageName());
        stringBuilder.append(z[20]).append(getClassName());
        stringBuilder.append(z[19]).append(getText());
        stringBuilder.append(z[25]).append(getContentDescription());
        stringBuilder.append(z[26]).append(getViewIdResourceName());
        stringBuilder.append(z[21]).append(isCheckable());
        stringBuilder.append(z[24]).append(isChecked());
        stringBuilder.append(z[36]).append(isFocusable());
        stringBuilder.append(z[29]).append(isFocused());
        stringBuilder.append(z[32]).append(isSelected());
        stringBuilder.append(z[22]).append(isClickable());
        stringBuilder.append(z[37]).append(isLongClickable());
        stringBuilder.append(z[31]).append(isEnabled());
        stringBuilder.append(z[27]).append(isPassword());
        stringBuilder.append(z[28] + isScrollable());
        stringBuilder.append(z[33]);
        int actions = getActions();
        while (actions != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            actions &= numberOfTrailingZeros ^ -1;
            stringBuilder.append(getActionSymbolicName(numberOfTrailingZeros));
            if (actions != 0) {
                stringBuilder.append(z[30]);
                continue;
            }
            if (i != 0) {
                Fragment.a++;
                break;
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void setBoundsInParent(Rect rect) {
        IMPL.setBoundsInParent(this.mInfo, rect);
    }

    public void setLongClickable(boolean z) {
        IMPL.setLongClickable(this.mInfo, z);
    }

    public boolean isCheckable() {
        return IMPL.isCheckable(this.mInfo);
    }

    public boolean isScrollable() {
        return IMPL.isScrollable(this.mInfo);
    }

    public CharSequence getContentDescription() {
        return IMPL.getContentDescription(this.mInfo);
    }

    public boolean isChecked() {
        return IMPL.isChecked(this.mInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        return this.mInfo == null ? accessibilityNodeInfoCompat.mInfo == null : this.mInfo.equals(accessibilityNodeInfoCompat.mInfo);
    }

    public CharSequence getClassName() {
        return IMPL.getClassName(this.mInfo);
    }

    public CharSequence getPackageName() {
        return IMPL.getPackageName(this.mInfo);
    }

    public void getBoundsInParent(Rect rect) {
        IMPL.getBoundsInParent(this.mInfo, rect);
    }

    public boolean isLongClickable() {
        return IMPL.isLongClickable(this.mInfo);
    }

    public Object getInfo() {
        return this.mInfo;
    }

    public void setVisibleToUser(boolean z) {
        IMPL.setVisibleToUser(this.mInfo, z);
    }

    public CharSequence getText() {
        return IMPL.getText(this.mInfo);
    }

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return wrapNonNullInstance(IMPL.obtain(accessibilityNodeInfoCompat.mInfo));
    }

    public void setSource(View view) {
        IMPL.setSource(this.mInfo, view);
    }

    public void setFocused(boolean z) {
        IMPL.setFocused(this.mInfo, z);
    }

    public void setParent(View view) {
        IMPL.setParent(this.mInfo, view);
    }

    public boolean isSelected() {
        return IMPL.isSelected(this.mInfo);
    }

    private static String getActionSymbolicName(int i) {
        switch (i) {
            case ay.f /*1*/:
                return z[1];
            case ay.n /*2*/:
                return z[11];
            case aj.i /*4*/:
                return z[7];
            case a8.n /*8*/:
                return z[2];
            case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                return z[5];
            case vk.SherlockTheme_searchDropdownBackground /*32*/:
                return z[17];
            case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                return z[3];
            case 128:
                return z[8];
            case 256:
                return z[9];
            case 512:
                return z[0];
            case 1024:
                return z[12];
            case 2048:
                return z[13];
            case 4096:
                return z[14];
            case 8192:
                return z[16];
            case 16384:
                return z[15];
            case 32768:
                return z[4];
            case 65536:
                return z[18];
            case 131072:
                return z[6];
            default:
                return z[10];
        }
    }

    public int hashCode() {
        return this.mInfo == null ? 0 : this.mInfo.hashCode();
    }

    public void recycle() {
        IMPL.recycle(this.mInfo);
    }

    public boolean isVisibleToUser() {
        return IMPL.isVisibleToUser(this.mInfo);
    }

    public boolean isFocused() {
        return IMPL.isFocused(this.mInfo);
    }

    public void setAccessibilityFocused(boolean z) {
        IMPL.setAccessibilityFocused(this.mInfo, z);
    }

    public void setEnabled(boolean z) {
        IMPL.setEnabled(this.mInfo, z);
    }

    public void setBoundsInScreen(Rect rect) {
        IMPL.setBoundsInScreen(this.mInfo, rect);
    }

    public void setPackageName(CharSequence charSequence) {
        IMPL.setPackageName(this.mInfo, charSequence);
    }

    public void setSelected(boolean z) {
        IMPL.setSelected(this.mInfo, z);
    }

    public String getViewIdResourceName() {
        return IMPL.getViewIdResourceName(this.mInfo);
    }

    public boolean isClickable() {
        return IMPL.isClickable(this.mInfo);
    }

    public boolean isPassword() {
        return IMPL.isPassword(this.mInfo);
    }

    public void addAction(int i) {
        IMPL.addAction(this.mInfo, i);
    }

    static {
        String[] strArr = new String[38];
        String str = "\u0015t2Sj\u001ah6H`\u0002~)Ov\u000bv2Eh\u001ba#W`\u001ac9]w\u0015y3Vd\u0006~2C";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 84;
                        break;
                    case ay.f /*1*/:
                        i3 = 55;
                        break;
                    case ay.n /*2*/:
                        i3 = 102;
                        break;
                    case ay.p /*3*/:
                        i3 = 26;
                        break;
                    default:
                        i3 = 37;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "\u0015t2Sj\u001ah%V`\u0015e9I`\u0018r%Nl\u001by";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u0015t2Sj\u001ah'Yf\u0011d5Sg\u001d{/N|\u000bq)Yp\u0007";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u0015t2Sj\u001ah6[v\u0000r";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0015t2Sj\u001ah%Vl\u0017|";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0015t2Sj\u001ah5_q\u000bd#V`\u0017c/Uk";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0015t2Sj\u001ah5_i\u0011t2";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0015t2Sj\u001ah%V`\u0015e9[f\u0017r5Il\u0016~*Sq\rh Uf\u0001d";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0015t2Sj\u001ah(_}\u0000h'Nz\u0019x0_h\u0011y2Eb\u0006v(Oi\u0015e/N|";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0015t2Sj\u001ah3Tn\u001ax1T";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0015t2Sj\u001ah%V`\u0015e9\\j\u0017b5";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0015t2Sj\u001ah(_}\u0000h.Nh\u0018h#V`\u0019r(N";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0015t2Sj\u001ah6H`\u0002~)Ov\u000b\u007f2Wi\u000br*_h\u0011y2";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    str = "\u0015t2Sj\u001ah5Yw\u001b{*Ec\u001be1[w\u0010";
                    obj = 13;
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    strArr2 = strArr3;
                    str = "\u0015t2Sj\u001ah%Uu\r";
                    obj = 14;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    str = "\u0015t2Sj\u001ah5Yw\u001b{*Eg\u0015t-Md\u0006s";
                    obj = 15;
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    strArr2 = strArr3;
                    str = "\u0015t2Sj\u001ah*Uk\u0013h%Vl\u0017|";
                    obj = 16;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    str = "\u0015t2Sj\u001ah%Oq";
                    obj = 17;
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    str = "o\u0017\u0012\u007f] \rF";
                    i = 19;
                    strArr2 = strArr3;
                    obj = 18;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    strArr2 = strArr3;
                    str = "o\u0017\u0005vD'D({H1\rF";
                    obj = 19;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "o\u0017\u0005r@7\\\u0007xI1\rF";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "o\u0017\u0005vL7\\\u0007xI1\rF";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "o\u0017\u0016{F?V\u0001\u007fk5Z\u0003 \u0005";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "o\u0017\u0005r@7\\\u0003~\u001ft";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "o\u0017\u0005uK R\bna1D\u0005hL$C\u000fuKn\u0017";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "o\u0017\u0010s@#~\u0002 \u0005";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "o\u0017\u0016{V'@\thAn\u0017";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "o\u0017\u0015yW;[\n{G8R\\:";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "o\u0017\u0000uF!D\u0003~\u001ft";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "x\u0017";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "o\u0017\u0003tD6[\u0003~\u001ft";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "o\u0017\u0015\u007fI1T\u0012\u007fAn\u0017";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "o\u0017=";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "o\u0017\u0004uP:S\u0015SK\u0004V\u0014\u007fK \rF";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "o\u0017\u0004uP:S\u0015SK\u0007T\u0014\u007f@:\rF";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "o\u0017\u0000uF!D\u0007xI1\rF";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "o\u0017\nuK3t\nsF?V\u0004v@n\u0017";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    z = strArr3;
                    if (VERSION.SDK_INT >= 21) {
                        IMPL = new AccessibilityNodeInfoApi21Impl();
                    } else if (VERSION.SDK_INT >= 19) {
                        IMPL = new AccessibilityNodeInfoKitKatImpl();
                    } else if (VERSION.SDK_INT >= 18) {
                        IMPL = new AccessibilityNodeInfoJellybeanMr2Impl();
                    } else if (VERSION.SDK_INT >= 16) {
                        IMPL = new AccessibilityNodeInfoJellybeanImpl();
                    } else if (VERSION.SDK_INT >= 14) {
                        IMPL = new AccessibilityNodeInfoIcsImpl();
                    } else {
                        IMPL = new AccessibilityNodeInfoStubImpl();
                    }
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u0015t2Sj\u001ah Uf\u0001d";
                    obj = null;
                    break;
            }
        }
    }

    public boolean isFocusable() {
        return IMPL.isFocusable(this.mInfo);
    }

    public boolean isEnabled() {
        return IMPL.isEnabled(this.mInfo);
    }

    public boolean isAccessibilityFocused() {
        return IMPL.isAccessibilityFocused(this.mInfo);
    }

    public void setContentDescription(CharSequence charSequence) {
        IMPL.setContentDescription(this.mInfo, charSequence);
    }

    static AccessibilityNodeInfoCompat wrapNonNullInstance(Object obj) {
        return obj != null ? new AccessibilityNodeInfoCompat(obj) : null;
    }
}
