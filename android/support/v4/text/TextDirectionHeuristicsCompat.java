package android.support.v4.text;

import android.support.v4.app.Fragment;
import com.whatsapp.vk;
import java.util.Locale;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class TextDirectionHeuristicsCompat {
    public static final TextDirectionHeuristicCompat ANYRTL_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL;
    public static final TextDirectionHeuristicCompat LOCALE;
    public static final TextDirectionHeuristicCompat LTR;
    public static final TextDirectionHeuristicCompat RTL;
    public static int a;

    interface TextDirectionAlgorithm {
        int checkRtl(CharSequence charSequence, int i, int i2);
    }

    class AnyStrong implements TextDirectionAlgorithm {
        public static final AnyStrong INSTANCE_LTR;
        public static final AnyStrong INSTANCE_RTL;
        private final boolean mLookForRtl;

        static {
            INSTANCE_RTL = new AnyStrong(true);
            INSTANCE_LTR = new AnyStrong(false);
        }

        public int checkRtl(CharSequence charSequence, int i, int i2) {
            int i3 = a;
            int i4 = i + i2;
            int i5 = 0;
            while (i < i4) {
                switch (TextDirectionHeuristicsCompat.access$200(Character.getDirectionality(charSequence.charAt(i)))) {
                    case PBE.MD5 /*0*/:
                        if (!this.mLookForRtl) {
                            if (i3 == 0) {
                                i5 = 1;
                                break;
                            }
                        }
                        return 0;
                    case ay.f /*1*/:
                        if (this.mLookForRtl) {
                            i5 = 1;
                            break;
                        }
                        return 1;
                }
                i++;
                if (i3 != 0) {
                    if (i5 == 0) {
                        return this.mLookForRtl ? 1 : 0;
                    } else {
                        if (Fragment.a != 0) {
                            return 2;
                        }
                        a = i3 + 1;
                        return 2;
                    }
                }
            }
            if (i5 == 0) {
                if (Fragment.a != 0) {
                    return 2;
                }
                a = i3 + 1;
                return 2;
            } else if (this.mLookForRtl) {
            }
        }

        private AnyStrong(boolean z) {
            this.mLookForRtl = z;
        }
    }

    class FirstStrong implements TextDirectionAlgorithm {
        public static final FirstStrong INSTANCE;

        static {
            INSTANCE = new FirstStrong();
        }

        private FirstStrong() {
        }

        public int checkRtl(CharSequence charSequence, int i, int i2) {
            int i3 = a;
            int i4 = i + i2;
            int i5 = 2;
            while (i < i4 && r0 == 2) {
                i5 = TextDirectionHeuristicsCompat.access$100(Character.getDirectionality(charSequence.charAt(i)));
                i++;
                if (i3 != 0) {
                    break;
                }
            }
            return i5;
        }
    }

    abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {
        private final TextDirectionAlgorithm mAlgorithm;

        protected abstract boolean defaultIsRtl();

        private boolean doCheck(CharSequence charSequence, int i, int i2) {
            try {
                switch (this.mAlgorithm.checkRtl(charSequence, i, i2)) {
                    case PBE.MD5 /*0*/:
                        return true;
                    case ay.f /*1*/:
                        return false;
                    default:
                        return defaultIsRtl();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        public TextDirectionHeuristicImpl(TextDirectionAlgorithm textDirectionAlgorithm) {
            this.mAlgorithm = textDirectionAlgorithm;
        }

        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            int i3 = a;
            try {
                if (charSequence != null && i >= 0 && i2 >= 0) {
                    if (charSequence.length() - i2 >= i) {
                        try {
                            boolean defaultIsRtl;
                            if (this.mAlgorithm == null) {
                                defaultIsRtl = defaultIsRtl();
                            } else {
                                defaultIsRtl = doCheck(charSequence, i, i2);
                                if (i3 != 0) {
                                    Fragment.a++;
                                }
                            }
                            return defaultIsRtl;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                }
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {
        private final boolean mDefaultIsRtl;

        protected boolean defaultIsRtl() {
            return this.mDefaultIsRtl;
        }

        private TextDirectionHeuristicInternal(TextDirectionAlgorithm textDirectionAlgorithm, boolean z) {
            super(textDirectionAlgorithm);
            this.mDefaultIsRtl = z;
        }

        TextDirectionHeuristicInternal(TextDirectionAlgorithm textDirectionAlgorithm, boolean z, AnonymousClass_1 anonymousClass_1) {
            this(textDirectionAlgorithm, z);
        }
    }

    class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        public static final TextDirectionHeuristicLocale INSTANCE;

        static {
            INSTANCE = new TextDirectionHeuristicLocale();
        }

        protected boolean defaultIsRtl() {
            return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }

        public TextDirectionHeuristicLocale() {
            super(null);
        }
    }

    private static int isRtlTextOrFormat(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
            case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
            case vk.SherlockTheme_actionModeBackground /*15*/:
                return 1;
            case ay.f /*1*/:
            case ay.n /*2*/:
            case vk.SherlockTheme_actionModeSplitBackground /*16*/:
            case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                return 0;
            default:
                return 2;
        }
    }

    static int access$200(int i) {
        return isRtlText(i);
    }

    static {
        LTR = new TextDirectionHeuristicInternal(null, false, null);
        RTL = new TextDirectionHeuristicInternal(null, true, null);
        FIRSTSTRONG_LTR = new TextDirectionHeuristicInternal(FirstStrong.INSTANCE, false, null);
        FIRSTSTRONG_RTL = new TextDirectionHeuristicInternal(FirstStrong.INSTANCE, true, null);
        ANYRTL_LTR = new TextDirectionHeuristicInternal(AnyStrong.INSTANCE_RTL, false, null);
        LOCALE = TextDirectionHeuristicLocale.INSTANCE;
    }

    static int access$100(int i) {
        return isRtlTextOrFormat(i);
    }

    private static int isRtlText(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                return 1;
            case ay.f /*1*/:
            case ay.n /*2*/:
                return 0;
            default:
                return 2;
        }
    }
}
