package android.support.v4.text;

import java.util.Locale;

public final class BidiFormatter {
    private static final BidiFormatter DEFAULT_LTR_INSTANCE;
    private static final BidiFormatter DEFAULT_RTL_INSTANCE;
    private static TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC;
    private static final String LRM_STRING;
    private static final String RLM_STRING;
    private final TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
    private final int mFlags;
    private final boolean mIsRtlContext;

    public final class Builder {
        private int mFlags;
        private boolean mIsRtlContext;
        private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;

        private static BidiFormatter getDefaultInstanceFromContext(boolean z) {
            return z ? BidiFormatter.access$200() : BidiFormatter.access$300();
        }

        public Builder() {
            initialize(BidiFormatter.access$000(Locale.getDefault()));
        }

        public android.support.v4.text.BidiFormatter.Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
            this.mTextDirectionHeuristicCompat = textDirectionHeuristicCompat;
            return this;
        }

        private void initialize(boolean z) {
            this.mIsRtlContext = z;
            this.mTextDirectionHeuristicCompat = BidiFormatter.access$100();
            this.mFlags = 2;
        }

        public BidiFormatter build() {
            return (this.mFlags == 2 && this.mTextDirectionHeuristicCompat == BidiFormatter.access$100()) ? getDefaultInstanceFromContext(this.mIsRtlContext) : new BidiFormatter(this.mIsRtlContext, this.mFlags, this.mTextDirectionHeuristicCompat, null);
        }
    }

    BidiFormatter(boolean z, int i, TextDirectionHeuristicCompat textDirectionHeuristicCompat, AnonymousClass_1 anonymousClass_1) {
        this(z, i, textDirectionHeuristicCompat);
    }

    private BidiFormatter(boolean z, int i, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.mIsRtlContext = z;
        this.mFlags = i;
        this.mDefaultTextDirectionHeuristicCompat = textDirectionHeuristicCompat;
    }

    private static boolean isRtlLocale(Locale locale) {
        return TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1;
    }

    static BidiFormatter access$300() {
        return DEFAULT_LTR_INSTANCE;
    }

    static boolean access$000(Locale locale) {
        return isRtlLocale(locale);
    }

    static {
        DEFAULT_TEXT_DIRECTION_HEURISTIC = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        LRM_STRING = Character.toString('\u200e');
        RLM_STRING = Character.toString('\u200f');
        DEFAULT_LTR_INSTANCE = new BidiFormatter(false, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);
        DEFAULT_RTL_INSTANCE = new BidiFormatter(true, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);
    }

    static TextDirectionHeuristicCompat access$100() {
        return DEFAULT_TEXT_DIRECTION_HEURISTIC;
    }

    public boolean isRtl(String str) {
        return this.mDefaultTextDirectionHeuristicCompat.isRtl(str, 0, str.length());
    }

    static BidiFormatter access$200() {
        return DEFAULT_RTL_INSTANCE;
    }
}
