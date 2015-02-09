package com.actionbarsherlock.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.widget.IcsLinearLayout;
import com.actionbarsherlock.internal.widget.IcsListPopupWindow;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.widget.ActivityChooserModel.ActivityChooserModelClient;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class ActivityChooserView extends ViewGroup implements ActivityChooserModelClient {
    private static final boolean IS_HONEYCOMB;
    private static final String z;
    private final IcsLinearLayout mActivityChooserContent;
    private final Drawable mActivityChooserContentBackground;
    private final ActivityChooserViewAdapter mAdapter;
    private final Callbacks mCallbacks;
    private final Context mContext;
    private int mDefaultActionButtonContentDescription;
    private final FrameLayout mDefaultActivityButton;
    private final ImageView mDefaultActivityButtonImage;
    private final FrameLayout mExpandActivityOverflowButton;
    private final ImageView mExpandActivityOverflowButtonImage;
    private int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    private boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private IcsListPopupWindow mListPopupWindow;
    private final DataSetObserver mModelDataSetOberver;
    private OnDismissListener mOnDismissListener;
    private final OnGlobalLayoutListener mOnGlobalLayoutListener;
    ActionProvider mProvider;

    class ActivityChooserViewAdapter extends BaseAdapter {
        private ActivityChooserModel mDataModel;
        private boolean mHighlightDefaultActivity;
        private int mMaxActivityCount;
        private boolean mShowDefaultActivity;
        private boolean mShowFooterView;
        final ActivityChooserView this$0;

        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case PBE.MD5 /*0*/:
                    try {
                        if (!this.mShowDefaultActivity) {
                            if (this.mDataModel.getDefaultActivity() != null) {
                                i++;
                            }
                        }
                        return this.mDataModel.getActivity(i);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                case ay.f /*1*/:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int measureContentWidth() {
            int i = 0;
            boolean z = SearchView.a;
            int i2 = this.mMaxActivityCount;
            this.mMaxActivityCount = Integer.MAX_VALUE;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i3 = 0;
            View view = null;
            while (i3 < count) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i = Math.max(i, view.getMeasuredWidth());
                i3++;
                if (z) {
                    break;
                }
            }
            this.mMaxActivityCount = i2;
            return i;
        }

        public int getHistorySize() {
            return this.mDataModel.getHistorySize();
        }

        public ActivityChooserModel getDataModel() {
            return this.mDataModel;
        }

        private ActivityChooserViewAdapter(ActivityChooserView activityChooserView) {
            this.this$0 = activityChooserView;
            this.mMaxActivityCount = 4;
            this.mShowDefaultActivity = true;
        }

        public boolean getShowDefaultActivity() {
            return this.mShowDefaultActivity;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
            /*
            r4_this = this;
            r3 = 1;
            r2 = 0;
            r0 = r4.getItemViewType(r5);
            switch(r0) {
                case 0: goto L_0x0044;
                case 1: goto L_0x000f;
                default: goto L_0x0009;
            };
        L_0x0009:
            r0 = new java.lang.IllegalArgumentException;
            r0.<init>();
            throw r0;
        L_0x000f:
            if (r6 == 0) goto L_0x0017;
        L_0x0011:
            r0 = r6.getId();	 Catch:{ IllegalArgumentException -> 0x0042 }
            if (r0 == r3) goto L_0x0041;
        L_0x0017:
            r0 = r4.this$0;
            r0 = r0.getContext();
            r0 = android.view.LayoutInflater.from(r0);
            r1 = com.actionbarsherlock.R.layout.abs__activity_chooser_view_list_item;
            r6 = r0.inflate(r1, r7, r2);
            r6.setId(r3);
            r0 = com.actionbarsherlock.R.id.abs__title;
            r0 = r6.findViewById(r0);
            r0 = (android.widget.TextView) r0;
            r1 = r4.this$0;
            r1 = com.actionbarsherlock.widget.ActivityChooserView.access$700(r1);
            r2 = com.actionbarsherlock.R.string.abs__activity_chooser_view_see_all;
            r1 = r1.getString(r2);
            r0.setText(r1);
        L_0x0041:
            return r6;
        L_0x0042:
            r0 = move-exception;
            throw r0;
        L_0x0044:
            if (r6 == 0) goto L_0x004e;
        L_0x0046:
            r0 = r6.getId();	 Catch:{ IllegalArgumentException -> 0x00ab }
            r1 = com.actionbarsherlock.R.id.abs__list_item;	 Catch:{ IllegalArgumentException -> 0x00ab }
            if (r0 == r1) goto L_0x005e;
        L_0x004e:
            r0 = r4.this$0;
            r0 = r0.getContext();
            r0 = android.view.LayoutInflater.from(r0);
            r1 = com.actionbarsherlock.R.layout.abs__activity_chooser_view_list_item;
            r6 = r0.inflate(r1, r7, r2);
        L_0x005e:
            r0 = r4.this$0;
            r0 = com.actionbarsherlock.widget.ActivityChooserView.access$700(r0);
            r2 = r0.getPackageManager();
            r0 = com.actionbarsherlock.R.id.abs__icon;
            r0 = r6.findViewById(r0);
            r0 = (android.widget.ImageView) r0;
            r1 = r4.getItem(r5);
            r1 = (android.content.pm.ResolveInfo) r1;
            r3 = r1.loadIcon(r2);
            r0.setImageDrawable(r3);
            r0 = com.actionbarsherlock.R.id.abs__title;
            r0 = r6.findViewById(r0);
            r0 = (android.widget.TextView) r0;
            r1 = r1.loadLabel(r2);	 Catch:{ IllegalArgumentException -> 0x00ad }
            r0.setText(r1);	 Catch:{ IllegalArgumentException -> 0x00ad }
            r0 = com.actionbarsherlock.widget.ActivityChooserView.access$1300();	 Catch:{ IllegalArgumentException -> 0x00ad }
            if (r0 == 0) goto L_0x0041;
        L_0x0092:
            r0 = r4.mShowDefaultActivity;	 Catch:{ IllegalArgumentException -> 0x00af }
            if (r0 == 0) goto L_0x00a4;
        L_0x0096:
            if (r5 != 0) goto L_0x00a4;
        L_0x0098:
            r0 = r4.mHighlightDefaultActivity;	 Catch:{ IllegalArgumentException -> 0x00b3 }
            if (r0 == 0) goto L_0x00a4;
        L_0x009c:
            r0 = 1;
            com.actionbarsherlock.widget.ActivityChooserView.SetActivated.invoke(r6, r0);	 Catch:{ IllegalArgumentException -> 0x00a9 }
            r0 = com.actionbarsherlock.widget.SearchView.a;	 Catch:{ IllegalArgumentException -> 0x00a9 }
            if (r0 == 0) goto L_0x0041;
        L_0x00a4:
            r0 = 0;
            com.actionbarsherlock.widget.ActivityChooserView.SetActivated.invoke(r6, r0);	 Catch:{ IllegalArgumentException -> 0x00a9 }
            goto L_0x0041;
        L_0x00a9:
            r0 = move-exception;
            throw r0;
        L_0x00ab:
            r0 = move-exception;
            throw r0;
        L_0x00ad:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00af }
        L_0x00af:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00b3 }
        L_0x00b3:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x00a9 }
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.ActivityChooserView.ActivityChooserViewAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        public void setShowFooterView(boolean z) {
            try {
                if (this.mShowFooterView != z) {
                    this.mShowFooterView = z;
                    notifyDataSetChanged();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        public void setMaxActivityCount(int i) {
            try {
                if (this.mMaxActivityCount != i) {
                    this.mMaxActivityCount = i;
                    notifyDataSetChanged();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        public int getItemViewType(int i) {
            try {
                if (this.mShowFooterView) {
                    if (i == getCount() - 1) {
                        return 1;
                    }
                }
                try {
                    return 0;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }

        ActivityChooserViewAdapter(ActivityChooserView activityChooserView, AnonymousClass_1 anonymousClass_1) {
            this(activityChooserView);
        }

        public int getCount() {
            int activityCount = this.mDataModel.getActivityCount();
            try {
                if (!this.mShowDefaultActivity) {
                    if (this.mDataModel.getDefaultActivity() != null) {
                        activityCount--;
                    }
                }
                activityCount = Math.min(activityCount, this.mMaxActivityCount);
                try {
                    return this.mShowFooterView ? activityCount + 1 : activityCount;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }

        public int getActivityCount() {
            return this.mDataModel.getActivityCount();
        }

        public void setShowDefaultActivity(boolean z, boolean z2) {
            try {
                if (this.mShowDefaultActivity == z) {
                    try {
                        if (this.mHighlightDefaultActivity == z2) {
                            return;
                        }
                    }
                }
                this.mShowDefaultActivity = z;
                this.mHighlightDefaultActivity = z2;
                notifyDataSetChanged();
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }

        public ResolveInfo getDefaultActivity() {
            return this.mDataModel.getDefaultActivity();
        }

        public int getViewTypeCount() {
            return 3;
        }

        public int getMaxActivityCount() {
            return this.mMaxActivityCount;
        }
    }

    class Callbacks implements OnItemClickListener, OnClickListener, OnLongClickListener, OnDismissListener {
        final ActivityChooserView this$0;

        public void onDismiss() {
            try {
                notifyOnDismissListener();
                if (this.this$0.mProvider != null) {
                    this.this$0.mProvider.subUiVisibilityChanged(false);
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        Callbacks(ActivityChooserView activityChooserView, AnonymousClass_1 anonymousClass_1) {
            this(activityChooserView);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onLongClick(android.view.View r4) {
            /*
            r3_this = this;
            r2 = 1;
            r0 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x0032 }
            r0 = com.actionbarsherlock.widget.ActivityChooserView.access$800(r0);	 Catch:{ IllegalArgumentException -> 0x0032 }
            if (r4 != r0) goto L_0x002a;
        L_0x0009:
            r0 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x0034 }
            r0 = com.actionbarsherlock.widget.ActivityChooserView.access$000(r0);	 Catch:{ IllegalArgumentException -> 0x0034 }
            r0 = r0.getCount();	 Catch:{ IllegalArgumentException -> 0x0034 }
            if (r0 <= 0) goto L_0x0036;
        L_0x0015:
            r0 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x0030 }
            r1 = 1;
            com.actionbarsherlock.widget.ActivityChooserView.access$602(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0030 }
            r0 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x0030 }
            r1 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x0030 }
            r1 = com.actionbarsherlock.widget.ActivityChooserView.access$1000(r1);	 Catch:{ IllegalArgumentException -> 0x0030 }
            com.actionbarsherlock.widget.ActivityChooserView.access$500(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0030 }
            r0 = com.actionbarsherlock.widget.SearchView.a;	 Catch:{ IllegalArgumentException -> 0x0030 }
            if (r0 == 0) goto L_0x0036;
        L_0x002a:
            r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0030 }
            r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0030 }
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0030 }
        L_0x0030:
            r0 = move-exception;
            throw r0;
        L_0x0032:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0034 }
        L_0x0034:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0030 }
        L_0x0036:
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.ActivityChooserView.Callbacks.onLongClick(android.view.View):boolean");
        }

        public void onClick(View view) {
            boolean z = SearchView.a;
            if (view == ActivityChooserView.access$800(this.this$0)) {
                this.this$0.dismissPopup();
                Intent chooseActivity = ActivityChooserView.access$000(this.this$0).getDataModel().chooseActivity(ActivityChooserView.access$000(this.this$0).getDataModel().getActivityIndex(ActivityChooserView.access$000(this.this$0).getDefaultActivity()));
                if (chooseActivity != null) {
                    try {
                        ActivityChooserView.access$700(this.this$0).startActivity(chooseActivity);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                if (!z) {
                    return;
                }
            }
            try {
                if (view == ActivityChooserView.access$900(this.this$0)) {
                    ActivityChooserView.access$602(this.this$0, false);
                    ActivityChooserView.access$500(this.this$0, ActivityChooserView.access$1000(this.this$0));
                    if (!z) {
                        return;
                    }
                }
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView r4, android.view.View r5, int r6, long r7) {
            /*
            r3_this = this;
            r1 = com.actionbarsherlock.widget.SearchView.a;
            r0 = r4.getAdapter();
            r0 = (com.actionbarsherlock.widget.ActivityChooserView.ActivityChooserViewAdapter) r0;
            r0 = r0.getItemViewType(r6);
            switch(r0) {
                case 0: goto L_0x0021;
                case 1: goto L_0x0017;
                default: goto L_0x000f;
            };
        L_0x000f:
            r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0015 }
            r0.<init>();	 Catch:{ IllegalArgumentException -> 0x0015 }
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0015 }
        L_0x0015:
            r0 = move-exception;
            throw r0;
        L_0x0017:
            r0 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x0067 }
            r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
            com.actionbarsherlock.widget.ActivityChooserView.access$500(r0, r2);	 Catch:{ IllegalArgumentException -> 0x0067 }
            if (r1 == 0) goto L_0x0066;
        L_0x0021:
            r0 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x0069 }
            r0.dismissPopup();	 Catch:{ IllegalArgumentException -> 0x0069 }
            r0 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x0069 }
            r0 = com.actionbarsherlock.widget.ActivityChooserView.access$600(r0);	 Catch:{ IllegalArgumentException -> 0x0069 }
            if (r0 == 0) goto L_0x003f;
        L_0x002e:
            if (r6 <= 0) goto L_0x0066;
        L_0x0030:
            r0 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x006d }
            r0 = com.actionbarsherlock.widget.ActivityChooserView.access$000(r0);	 Catch:{ IllegalArgumentException -> 0x006d }
            r0 = r0.getDataModel();	 Catch:{ IllegalArgumentException -> 0x006d }
            r0.setDefaultActivity(r6);	 Catch:{ IllegalArgumentException -> 0x006d }
            if (r1 == 0) goto L_0x0066;
        L_0x003f:
            r0 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x006f }
            r0 = com.actionbarsherlock.widget.ActivityChooserView.access$000(r0);	 Catch:{ IllegalArgumentException -> 0x006f }
            r0 = r0.getShowDefaultActivity();	 Catch:{ IllegalArgumentException -> 0x006f }
            if (r0 == 0) goto L_0x0071;
        L_0x004b:
            r0 = r3.this$0;
            r0 = com.actionbarsherlock.widget.ActivityChooserView.access$000(r0);
            r0 = r0.getDataModel();
            r0 = r0.chooseActivity(r6);
            if (r0 == 0) goto L_0x0064;
        L_0x005b:
            r2 = r3.this$0;	 Catch:{ IllegalArgumentException -> 0x0074 }
            r2 = com.actionbarsherlock.widget.ActivityChooserView.access$700(r2);	 Catch:{ IllegalArgumentException -> 0x0074 }
            r2.startActivity(r0);	 Catch:{ IllegalArgumentException -> 0x0074 }
        L_0x0064:
            if (r1 != 0) goto L_0x000f;
        L_0x0066:
            return;
        L_0x0067:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0069 }
        L_0x0069:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x006b }
        L_0x006b:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x006d }
        L_0x006d:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x006f }
        L_0x006f:
            r0 = move-exception;
            throw r0;
        L_0x0071:
            r6 = r6 + 1;
            goto L_0x004b;
        L_0x0074:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.ActivityChooserView.Callbacks.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }

        private Callbacks(ActivityChooserView activityChooserView) {
            this.this$0 = activityChooserView;
        }

        private void notifyOnDismissListener() {
            try {
                if (ActivityChooserView.access$1100(this.this$0) != null) {
                    ActivityChooserView.access$1100(this.this$0).onDismiss();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    class SetActivated {
        public static void invoke(View view, boolean z) {
            view.setActivated(z);
        }
    }

    static FrameLayout access$800(ActivityChooserView activityChooserView) {
        return activityChooserView.mDefaultActivityButton;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ActivityChooserModel dataModel = this.mAdapter.getDataModel();
        if (dataModel != null) {
            try {
                dataModel.registerObserver(this.mModelDataSetOberver);
            } catch (IllegalStateException e) {
            }
        }
        this.mIsAttachedToWindow = true;
    }

    static {
        char[] toCharArray = "ZyOzB`wOsLps\u00030\u0003P\u007f\u000b>Z{cO}BxzO=Pqb+\u007fWu[\u0000zFx)".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 20;
                    break;
                case ay.f /*1*/:
                    i2 = 22;
                    break;
                case ay.n /*2*/:
                    i2 = 111;
                    break;
                case ay.p /*3*/:
                    i2 = 30;
                    break;
                default:
                    i2 = 35;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        try {
            IS_HONEYCOMB = VERSION.SDK_INT >= 11;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static ActivityChooserViewAdapter access$000(ActivityChooserView activityChooserView) {
        return activityChooserView.mAdapter;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActivityChooserModel dataModel = this.mAdapter.getDataModel();
        if (dataModel != null) {
            try {
                dataModel.unregisterObserver(this.mModelDataSetOberver);
            } catch (IllegalStateException e) {
            }
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        try {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
            }
            this.mIsAttachedToWindow = false;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private IcsListPopupWindow getListPopupWindow() {
        try {
            if (this.mListPopupWindow == null) {
                this.mListPopupWindow = new IcsListPopupWindow(getContext());
                this.mListPopupWindow.setAdapter(this.mAdapter);
                this.mListPopupWindow.setAnchorView(this);
                this.mListPopupWindow.setModal(true);
                this.mListPopupWindow.setOnItemClickListener(this.mCallbacks);
                this.mListPopupWindow.setOnDismissListener(this.mCallbacks);
            }
            return this.mListPopupWindow;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static IcsListPopupWindow access$100(ActivityChooserView activityChooserView) {
        return activityChooserView.getListPopupWindow();
    }

    static boolean access$600(ActivityChooserView activityChooserView) {
        return activityChooserView.mIsSelectingDefaultActivity;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void showPopupUnchecked(int r6) {
        /*
        r5_this = this;
        r1 = 1;
        r2 = 0;
        r3 = com.actionbarsherlock.widget.SearchView.a;
        r0 = r5.mAdapter;	 Catch:{ IllegalStateException -> 0x0014 }
        r0 = r0.getDataModel();	 Catch:{ IllegalStateException -> 0x0014 }
        if (r0 != 0) goto L_0x0016;
    L_0x000c:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0014 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0014 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0014 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0014 }
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r0 = r5.getViewTreeObserver();	 Catch:{ IllegalStateException -> 0x009d }
        r4 = r5.mOnGlobalLayoutListener;	 Catch:{ IllegalStateException -> 0x009d }
        r0.addOnGlobalLayoutListener(r4);	 Catch:{ IllegalStateException -> 0x009d }
        r0 = r5.mDefaultActivityButton;	 Catch:{ IllegalStateException -> 0x009d }
        r0 = r0.getVisibility();	 Catch:{ IllegalStateException -> 0x009d }
        if (r0 != 0) goto L_0x009f;
    L_0x0027:
        r0 = r1;
    L_0x0028:
        r4 = r5.mAdapter;
        r4 = r4.getActivityCount();
        if (r0 == 0) goto L_0x00a1;
    L_0x0030:
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r6 == r2) goto L_0x0047;
    L_0x0035:
        r1 = r1 + r6;
        if (r4 <= r1) goto L_0x0047;
    L_0x0038:
        r1 = r5.mAdapter;	 Catch:{ IllegalStateException -> 0x00a3 }
        r2 = 1;
        r1.setShowFooterView(r2);	 Catch:{ IllegalStateException -> 0x00a3 }
        r1 = r5.mAdapter;	 Catch:{ IllegalStateException -> 0x00a3 }
        r2 = r6 + -1;
        r1.setMaxActivityCount(r2);	 Catch:{ IllegalStateException -> 0x00a3 }
        if (r3 == 0) goto L_0x0052;
    L_0x0047:
        r1 = r5.mAdapter;	 Catch:{ IllegalStateException -> 0x00a3 }
        r2 = 0;
        r1.setShowFooterView(r2);	 Catch:{ IllegalStateException -> 0x00a3 }
        r1 = r5.mAdapter;	 Catch:{ IllegalStateException -> 0x00a3 }
        r1.setMaxActivityCount(r6);	 Catch:{ IllegalStateException -> 0x00a3 }
    L_0x0052:
        r1 = r5.getListPopupWindow();
        r2 = r1.isShowing();	 Catch:{ IllegalStateException -> 0x00a5 }
        if (r2 != 0) goto L_0x009c;
    L_0x005c:
        r2 = r5.mIsSelectingDefaultActivity;	 Catch:{ IllegalStateException -> 0x00a7 }
        if (r2 != 0) goto L_0x0062;
    L_0x0060:
        if (r0 != 0) goto L_0x006a;
    L_0x0062:
        r2 = r5.mAdapter;	 Catch:{ IllegalStateException -> 0x00ab }
        r4 = 1;
        r2.setShowDefaultActivity(r4, r0);	 Catch:{ IllegalStateException -> 0x00ab }
        if (r3 == 0) goto L_0x0071;
    L_0x006a:
        r0 = r5.mAdapter;	 Catch:{ IllegalStateException -> 0x00ab }
        r2 = 0;
        r3 = 0;
        r0.setShowDefaultActivity(r2, r3);	 Catch:{ IllegalStateException -> 0x00ab }
    L_0x0071:
        r0 = r5.mAdapter;
        r0 = r0.measureContentWidth();
        r2 = r5.mListPopupMaxWidth;
        r0 = java.lang.Math.min(r0, r2);
        r1.setContentWidth(r0);	 Catch:{ IllegalStateException -> 0x00ad }
        r1.show();	 Catch:{ IllegalStateException -> 0x00ad }
        r0 = r5.mProvider;	 Catch:{ IllegalStateException -> 0x00ad }
        if (r0 == 0) goto L_0x008d;
    L_0x0087:
        r0 = r5.mProvider;	 Catch:{ IllegalStateException -> 0x00ad }
        r2 = 1;
        r0.subUiVisibilityChanged(r2);	 Catch:{ IllegalStateException -> 0x00ad }
    L_0x008d:
        r0 = r1.getListView();
        r1 = r5.mContext;
        r2 = com.actionbarsherlock.R.string.abs__activitychooserview_choose_application;
        r1 = r1.getString(r2);
        r0.setContentDescription(r1);
    L_0x009c:
        return;
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r0 = r2;
        goto L_0x0028;
    L_0x00a1:
        r1 = r2;
        goto L_0x0030;
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.ActivityChooserView.showPopupUnchecked(int):void");
    }

    static void access$400(ActivityChooserView activityChooserView) {
        activityChooserView.updateAppearance();
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        boolean z = SearchView.a;
        super(context, attributeSet, i);
        this.mModelDataSetOberver = new DataSetObserver() {
            final ActivityChooserView this$0;

            public void onChanged() {
                super.onChanged();
                ActivityChooserView.access$000(this.this$0).notifyDataSetChanged();
            }

            {
                this.this$0 = r1;
            }

            public void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.access$000(this.this$0).notifyDataSetInvalidated();
            }
        };
        this.mOnGlobalLayoutListener = new OnGlobalLayoutListener() {
            final ActivityChooserView this$0;

            {
                this.this$0 = r1;
            }

            public void onGlobalLayout() {
                if (this.this$0.isShowingPopup()) {
                    if (!this.this$0.isShown()) {
                        ActivityChooserView.access$100(this.this$0).dismiss();
                        if (!SearchView.a) {
                            return;
                        }
                    }
                    ActivityChooserView.access$100(this.this$0).show();
                    if (this.this$0.mProvider != null) {
                        this.this$0.mProvider.subUiVisibilityChanged(true);
                    }
                }
            }
        };
        this.mInitialActivityCount = 4;
        this.mContext = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SherlockActivityChooserView, i, 0);
        this.mInitialActivityCount = obtainStyledAttributes.getInt(R.styleable.SherlockActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.SherlockActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(this.mContext).inflate(R.layout.abs__activity_chooser_view, this, true);
        this.mCallbacks = new Callbacks(this, null);
        this.mActivityChooserContent = (IcsLinearLayout) findViewById(R.id.abs__activity_chooser_view_content);
        this.mActivityChooserContentBackground = this.mActivityChooserContent.getBackground();
        this.mDefaultActivityButton = (FrameLayout) findViewById(R.id.abs__default_activity_button);
        this.mDefaultActivityButton.setOnClickListener(this.mCallbacks);
        this.mDefaultActivityButton.setOnLongClickListener(this.mCallbacks);
        this.mDefaultActivityButtonImage = (ImageView) this.mDefaultActivityButton.findViewById(R.id.abs__image);
        this.mExpandActivityOverflowButton = (FrameLayout) findViewById(R.id.abs__expand_activities_button);
        this.mExpandActivityOverflowButton.setOnClickListener(this.mCallbacks);
        this.mExpandActivityOverflowButtonImage = (ImageView) this.mExpandActivityOverflowButton.findViewById(R.id.abs__image);
        this.mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
        this.mAdapter = new ActivityChooserViewAdapter(this, null);
        this.mAdapter.registerDataSetObserver(new DataSetObserver() {
            final ActivityChooserView this$0;

            public void onChanged() {
                super.onChanged();
                ActivityChooserView.access$400(this.this$0);
            }

            {
                this.this$0 = r1;
            }
        });
        Resources resources = context.getResources();
        try {
            this.mListPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abs__config_prefDialogWidth));
            if (SherlockActivity.a) {
                SearchView.a = !z;
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    protected void onMeasure(int i, int i2) {
        View view = this.mActivityChooserContent;
        if (this.mDefaultActivityButton.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    static FrameLayout access$900(ActivityChooserView activityChooserView) {
        return activityChooserView.mExpandActivityOverflowButton;
    }

    static boolean access$1300() {
        return IS_HONEYCOMB;
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            this.mActivityChooserContent.layout(0, 0, i3 - i, i4 - i2);
            if (getListPopupWindow().isShowing()) {
                showPopupUnchecked(this.mAdapter.getMaxActivityCount());
                try {
                    if (!SearchView.a) {
                        return;
                    }
                }
            }
            dismissPopup();
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public boolean dismissPopup() {
        if (isShowingPopup()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            try {
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return true;
    }

    static int access$1000(ActivityChooserView activityChooserView) {
        return activityChooserView.mInitialActivityCount;
    }

    static Context access$700(ActivityChooserView activityChooserView) {
        return activityChooserView.mContext;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateAppearance() {
        /*
        r7_this = this;
        r6 = 1;
        r5 = 0;
        r0 = com.actionbarsherlock.widget.SearchView.a;
        r1 = r7.mAdapter;	 Catch:{ IllegalStateException -> 0x008e }
        r1 = r1.getCount();	 Catch:{ IllegalStateException -> 0x008e }
        if (r1 <= 0) goto L_0x0014;
    L_0x000c:
        r1 = r7.mExpandActivityOverflowButton;	 Catch:{ IllegalStateException -> 0x0090 }
        r2 = 1;
        r1.setEnabled(r2);	 Catch:{ IllegalStateException -> 0x0090 }
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r1 = r7.mExpandActivityOverflowButton;	 Catch:{ IllegalStateException -> 0x0090 }
        r2 = 0;
        r1.setEnabled(r2);	 Catch:{ IllegalStateException -> 0x0090 }
    L_0x001a:
        r1 = r7.mAdapter;
        r1 = r1.getActivityCount();
        r2 = r7.mAdapter;
        r2 = r2.getHistorySize();
        if (r1 <= 0) goto L_0x0066;
    L_0x0028:
        if (r2 <= 0) goto L_0x0066;
    L_0x002a:
        r1 = r7.mDefaultActivityButton;
        r1.setVisibility(r5);
        r1 = r7.mAdapter;
        r1 = r1.getDefaultActivity();
        r2 = r7.mContext;
        r2 = r2.getPackageManager();
        r3 = r7.mDefaultActivityButtonImage;
        r4 = r1.loadIcon(r2);
        r3.setImageDrawable(r4);
        r3 = r7.mDefaultActionButtonContentDescription;
        if (r3 == 0) goto L_0x005d;
    L_0x0048:
        r1 = r1.loadLabel(r2);
        r2 = r7.mContext;
        r3 = r7.mDefaultActionButtonContentDescription;
        r4 = new java.lang.Object[r6];
        r4[r5] = r1;
        r1 = r2.getString(r3, r4);
        r2 = r7.mDefaultActivityButton;
        r2.setContentDescription(r1);
    L_0x005d:
        r1 = r7.mAdapter;	 Catch:{ IllegalStateException -> 0x0092 }
        r2 = 0;
        r3 = 0;
        r1.setShowDefaultActivity(r2, r3);	 Catch:{ IllegalStateException -> 0x0092 }
        if (r0 == 0) goto L_0x006d;
    L_0x0066:
        r1 = r7.mDefaultActivityButton;	 Catch:{ IllegalStateException -> 0x0092 }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IllegalStateException -> 0x0092 }
    L_0x006d:
        r1 = r7.mDefaultActivityButton;	 Catch:{ IllegalStateException -> 0x0094 }
        r1 = r1.getVisibility();	 Catch:{ IllegalStateException -> 0x0094 }
        if (r1 != 0) goto L_0x007e;
    L_0x0075:
        r1 = r7.mActivityChooserContent;	 Catch:{ IllegalStateException -> 0x0096 }
        r2 = r7.mActivityChooserContentBackground;	 Catch:{ IllegalStateException -> 0x0096 }
        r1.setBackgroundDrawable(r2);	 Catch:{ IllegalStateException -> 0x0096 }
        if (r0 == 0) goto L_0x008d;
    L_0x007e:
        r0 = r7.mActivityChooserContent;	 Catch:{ IllegalStateException -> 0x0096 }
        r1 = 0;
        r0.setBackgroundDrawable(r1);	 Catch:{ IllegalStateException -> 0x0096 }
        r0 = r7.mActivityChooserContent;	 Catch:{ IllegalStateException -> 0x0096 }
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r0.setPadding(r1, r2, r3, r4);	 Catch:{ IllegalStateException -> 0x0096 }
    L_0x008d:
        return;
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        throw r0;
    L_0x0092:
        r0 = move-exception;
        throw r0;
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0096 }
    L_0x0096:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.ActivityChooserView.updateAppearance():void");
    }

    static void access$500(ActivityChooserView activityChooserView, int i) {
        activityChooserView.showPopupUnchecked(i);
    }

    static boolean access$602(ActivityChooserView activityChooserView, boolean z) {
        activityChooserView.mIsSelectingDefaultActivity = z;
        return z;
    }

    static OnDismissListener access$1100(ActivityChooserView activityChooserView) {
        return activityChooserView.mOnDismissListener;
    }

    public boolean isShowingPopup() {
        return getListPopupWindow().isShowing();
    }
}
