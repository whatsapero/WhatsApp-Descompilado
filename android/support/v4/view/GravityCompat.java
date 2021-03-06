package android.support.v4.view;

import android.os.Build.VERSION;

public class GravityCompat {
    static final GravityCompatImpl IMPL;

    interface GravityCompatImpl {
        int getAbsoluteGravity(int i, int i2);
    }

    class GravityCompatImplBase implements GravityCompatImpl {
        public int getAbsoluteGravity(int i, int i2) {
            return -8388609 & i;
        }

        GravityCompatImplBase() {
        }
    }

    class GravityCompatImplJellybeanMr1 implements GravityCompatImpl {
        GravityCompatImplJellybeanMr1() {
        }

        public int getAbsoluteGravity(int i, int i2) {
            return GravityCompatJellybeanMr1.getAbsoluteGravity(i, i2);
        }
    }

    public static int getAbsoluteGravity(int i, int i2) {
        return IMPL.getAbsoluteGravity(i, i2);
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            IMPL = new GravityCompatImplJellybeanMr1();
        } else {
            IMPL = new GravityCompatImplBase();
        }
    }
}
