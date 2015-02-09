package android.support.v4.text;

import android.os.Build.VERSION;

public class ICUCompat {
    private static final ICUCompatImpl IMPL;

    interface ICUCompatImpl {
        String addLikelySubtags(String str);

        String getScript(String str);
    }

    class ICUCompatImplBase implements ICUCompatImpl {
        public String getScript(String str) {
            return null;
        }

        public String addLikelySubtags(String str) {
            return str;
        }

        ICUCompatImplBase() {
        }
    }

    class ICUCompatImplIcs implements ICUCompatImpl {
        public String getScript(String str) {
            return ICUCompatIcs.getScript(str);
        }

        ICUCompatImplIcs() {
        }

        public String addLikelySubtags(String str) {
            return ICUCompatIcs.addLikelySubtags(str);
        }
    }

    public static String addLikelySubtags(String str) {
        return IMPL.addLikelySubtags(str);
    }

    static {
        if (VERSION.SDK_INT >= 14) {
            IMPL = new ICUCompatImplIcs();
        } else {
            IMPL = new ICUCompatImplBase();
        }
    }

    public static String getScript(String str) {
        return IMPL.getScript(str);
    }
}
