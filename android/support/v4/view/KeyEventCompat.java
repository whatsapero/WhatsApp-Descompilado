package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class KeyEventCompat {
    static final KeyEventVersionImpl IMPL;

    interface KeyEventVersionImpl {
        boolean metaStateHasModifiers(int i, int i2);

        boolean metaStateHasNoModifiers(int i);

        void startTracking(KeyEvent keyEvent);
    }

    class BaseKeyEventVersionImpl implements KeyEventVersionImpl {
        private static final String z;

        static {
            char[] toCharArray = "8*\u0004\u001a\u000e(,\u0015W\n4?\u0013".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 90;
                        break;
                    case ay.f /*1*/:
                        i2 = 75;
                        break;
                    case ay.n /*2*/:
                        i2 = 96;
                        break;
                    case ay.p /*3*/:
                        i2 = 58;
                        break;
                    default:
                        i2 = 111;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        BaseKeyEventVersionImpl() {
        }

        private static int metaStateFilterDirectionalModifiers(int i, int i2, int i3, int i4, int i5) {
            Object obj = 1;
            Object obj2 = (i2 & i3) != 0 ? 1 : null;
            int i6 = i4 | i5;
            if ((i2 & i6) == 0) {
                obj = null;
            }
            if (obj2 == null) {
                return obj != null ? i & (i3 ^ -1) : i;
            } else {
                if (obj == null) {
                    return i & (i6 ^ -1);
                }
                try {
                    throw new IllegalArgumentException(z);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }

        public boolean metaStateHasNoModifiers(int i) {
            try {
                return (normalizeMetaState(i) & 247) == 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        public boolean metaStateHasModifiers(int i, int i2) {
            return metaStateFilterDirectionalModifiers(metaStateFilterDirectionalModifiers(normalizeMetaState(i) & 247, i2, 1, 64, 128), i2, 2, 16, 32) == i2;
        }

        public int normalizeMetaState(int i) {
            int i2;
            if ((i & 192) != 0) {
                i2 = i | 1;
            } else {
                i2 = i;
            }
            if ((i2 & 48) != 0) {
                i2 |= 2;
            }
            return i2 & 247;
        }

        public void startTracking(KeyEvent keyEvent) {
        }
    }

    class EclairKeyEventVersionImpl extends BaseKeyEventVersionImpl {
        EclairKeyEventVersionImpl() {
        }

        public void startTracking(KeyEvent keyEvent) {
            KeyEventCompatEclair.startTracking(keyEvent);
        }
    }

    class HoneycombKeyEventVersionImpl extends EclairKeyEventVersionImpl {
        public int normalizeMetaState(int i) {
            return KeyEventCompatHoneycomb.normalizeMetaState(i);
        }

        public boolean metaStateHasNoModifiers(int i) {
            return KeyEventCompatHoneycomb.metaStateHasNoModifiers(i);
        }

        public boolean metaStateHasModifiers(int i, int i2) {
            return KeyEventCompatHoneycomb.metaStateHasModifiers(i, i2);
        }

        HoneycombKeyEventVersionImpl() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            IMPL = new HoneycombKeyEventVersionImpl();
        } else {
            IMPL = new BaseKeyEventVersionImpl();
        }
    }

    public static boolean hasModifiers(KeyEvent keyEvent, int i) {
        return IMPL.metaStateHasModifiers(keyEvent.getMetaState(), i);
    }

    public static void startTracking(KeyEvent keyEvent) {
        IMPL.startTracking(keyEvent);
    }

    public static boolean hasNoModifiers(KeyEvent keyEvent) {
        return IMPL.metaStateHasNoModifiers(keyEvent.getMetaState());
    }
}
