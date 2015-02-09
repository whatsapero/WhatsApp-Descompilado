package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class MotionEventCompat {
    static final MotionEventVersionImpl IMPL;

    interface MotionEventVersionImpl {
        int findPointerIndex(MotionEvent motionEvent, int i);

        int getPointerCount(MotionEvent motionEvent);

        int getPointerId(MotionEvent motionEvent, int i);

        float getX(MotionEvent motionEvent, int i);

        float getY(MotionEvent motionEvent, int i);
    }

    class BaseMotionEventVersionImpl implements MotionEventVersionImpl {
        private static final String[] z;

        static {
            String[] strArr = new String[3];
            String str = "3\u001b:\u00166\u0000\u0005>R\u0001C\r0^\u0000C\u00070OS\u0010\u001c/K\u001c\u0011\u001d\u007fV\u0006\u000f\u001d6K\u001f\u0006I/T\u001a\r\u001d:I\u0000";
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
                            i3 = 99;
                            break;
                        case ay.f /*1*/:
                            i3 = 105;
                            break;
                        case ay.n /*2*/:
                            i3 = 95;
                            break;
                        case ay.p /*3*/:
                            i3 = 59;
                            break;
                        default:
                            i3 = 115;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        i = 2;
                        strArr2 = strArr3;
                        str = "3\u001b:\u00166\u0000\u0005>R\u0001C\r0^\u0000C\u00070OS\u0010\u001c/K\u001c\u0011\u001d\u007fV\u0006\u000f\u001d6K\u001f\u0006I/T\u001a\r\u001d:I\u0000";
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "3\u001b:\u00166\u0000\u0005>R\u0001C\r0^\u0000C\u00070OS\u0010\u001c/K\u001c\u0011\u001d\u007fV\u0006\u000f\u001d6K\u001f\u0006I/T\u001a\r\u001d:I\u0000";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        BaseMotionEventVersionImpl() {
        }

        public int getPointerCount(MotionEvent motionEvent) {
            return 1;
        }

        public int findPointerIndex(MotionEvent motionEvent, int i) {
            return i == 0 ? 0 : -1;
        }

        public int getPointerId(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return 0;
            }
            throw new IndexOutOfBoundsException(z[1]);
        }

        public float getX(MotionEvent motionEvent, int i) {
            if (i == 0) {
                try {
                    return motionEvent.getX();
                } catch (IndexOutOfBoundsException e) {
                    throw e;
                }
            }
            throw new IndexOutOfBoundsException(z[0]);
        }

        public float getY(MotionEvent motionEvent, int i) {
            if (i == 0) {
                try {
                    return motionEvent.getY();
                } catch (IndexOutOfBoundsException e) {
                    throw e;
                }
            }
            throw new IndexOutOfBoundsException(z[2]);
        }
    }

    class EclairMotionEventVersionImpl implements MotionEventVersionImpl {
        public float getY(MotionEvent motionEvent, int i) {
            return MotionEventCompatEclair.getY(motionEvent, i);
        }

        public int getPointerId(MotionEvent motionEvent, int i) {
            return MotionEventCompatEclair.getPointerId(motionEvent, i);
        }

        public int findPointerIndex(MotionEvent motionEvent, int i) {
            return MotionEventCompatEclair.findPointerIndex(motionEvent, i);
        }

        public float getX(MotionEvent motionEvent, int i) {
            return MotionEventCompatEclair.getX(motionEvent, i);
        }

        EclairMotionEventVersionImpl() {
        }

        public int getPointerCount(MotionEvent motionEvent) {
            return MotionEventCompatEclair.getPointerCount(motionEvent);
        }
    }

    public static int findPointerIndex(MotionEvent motionEvent, int i) {
        return IMPL.findPointerIndex(motionEvent, i);
    }

    public static int getPointerId(MotionEvent motionEvent, int i) {
        return IMPL.getPointerId(motionEvent, i);
    }

    public static int getActionIndex(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    public static int getPointerCount(MotionEvent motionEvent) {
        return IMPL.getPointerCount(motionEvent);
    }

    public static float getY(MotionEvent motionEvent, int i) {
        return IMPL.getY(motionEvent, i);
    }

    static {
        if (VERSION.SDK_INT >= 5) {
            IMPL = new EclairMotionEventVersionImpl();
        } else {
            IMPL = new BaseMotionEventVersionImpl();
        }
    }

    public static float getX(MotionEvent motionEvent, int i) {
        return IMPL.getX(motionEvent, i);
    }

    public static int getActionMasked(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }
}
