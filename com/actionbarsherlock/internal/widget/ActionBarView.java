package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.actionbarsherlock.ActionBarSherlock;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.OnNavigationListener;
import com.actionbarsherlock.internal.view.menu.ActionMenuItem;
import com.actionbarsherlock.internal.view.menu.MenuBuilder;
import com.actionbarsherlock.internal.view.menu.MenuItemImpl;
import com.actionbarsherlock.internal.view.menu.MenuPresenter;
import com.actionbarsherlock.internal.view.menu.SubMenuBuilder;
import com.actionbarsherlock.internal.widget.IcsAdapterView.OnItemSelectedListener;
import com.actionbarsherlock.view.CollapsibleActionView;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.Window.Callback;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ActionBarView extends AbsActionBarView {
    private static final String[] z;
    private OnNavigationListener mCallback;
    private ActionBarContextView mContextView;
    private View mCustomNavView;
    private int mDisplayOptions;
    View mExpandedActionView;
    private final OnClickListener mExpandedActionViewUpListener;
    private HomeView mExpandedHomeLayout;
    private ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private HomeView mHomeLayout;
    private Drawable mIcon;
    private boolean mIncludeTabs;
    private int mIndeterminateProgressStyle;
    private IcsProgressBar mIndeterminateProgressView;
    private boolean mIsCollapsable;
    private boolean mIsCollapsed;
    private int mItemPadding;
    private IcsLinearLayout mListNavLayout;
    private Drawable mLogo;
    private ActionMenuItem mLogoNavItem;
    private final OnItemSelectedListener mNavItemSelectedListener;
    private int mNavigationMode;
    private MenuBuilder mOptionsMenu;
    private int mProgressBarPadding;
    private int mProgressStyle;
    private IcsProgressBar mProgressView;
    private IcsSpinner mSpinner;
    private SpinnerAdapter mSpinnerAdapter;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private ScrollingTabContainerView mTabScrollView;
    private CharSequence mTitle;
    private LinearLayout mTitleLayout;
    private int mTitleStyleRes;
    private View mTitleUpView;
    private TextView mTitleView;
    private final OnClickListener mUpClickListener;
    private boolean mUserTitle;
    Callback mWindowCallback;

    class ExpandedActionViewMenuPresenter implements MenuPresenter {
        MenuItemImpl mCurrentExpandedItem;
        MenuBuilder mMenu;
        final ActionBarView this$0;

        public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
            return false;
        }

        ExpandedActionViewMenuPresenter(ActionBarView actionBarView, AnonymousClass_1 anonymousClass_1) {
            this(actionBarView);
        }

        private ExpandedActionViewMenuPresenter(ActionBarView actionBarView) {
            this.this$0 = actionBarView;
        }

        public void initForMenu(Context context, MenuBuilder menuBuilder) {
            if (!(this.mMenu == null || this.mCurrentExpandedItem == null)) {
                this.mMenu.collapseItemActionView(this.mCurrentExpandedItem);
            }
            this.mMenu = menuBuilder;
        }

        public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            this.this$0.mExpandedActionView = menuItemImpl.getActionView();
            ActionBarView.access$600(this.this$0).setIcon(ActionBarView.access$500(this.this$0).getConstantState().newDrawable());
            this.mCurrentExpandedItem = menuItemImpl;
            if (this.this$0.mExpandedActionView.getParent() != this.this$0) {
                this.this$0.addView(this.this$0.mExpandedActionView);
            }
            if (ActionBarView.access$600(this.this$0).getParent() != this.this$0) {
                this.this$0.addView(ActionBarView.access$600(this.this$0));
            }
            ActionBarView.access$700(this.this$0).setVisibility(8);
            if (ActionBarView.access$800(this.this$0) != null) {
                ActionBarView.access$800(this.this$0).setVisibility(8);
            }
            if (ActionBarView.access$900(this.this$0) != null) {
                ActionBarView.access$900(this.this$0).setVisibility(8);
            }
            if (ActionBarView.access$1000(this.this$0) != null) {
                ActionBarView.access$1000(this.this$0).setVisibility(8);
            }
            if (ActionBarView.access$1100(this.this$0) != null) {
                ActionBarView.access$1100(this.this$0).setVisibility(8);
            }
            this.this$0.requestLayout();
            menuItemImpl.setActionViewExpanded(true);
            if (this.this$0.mExpandedActionView instanceof CollapsibleActionView) {
                ((CollapsibleActionView) this.this$0.mExpandedActionView).onActionViewExpanded();
            }
            return true;
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean collapseItemActionView(com.actionbarsherlock.internal.view.menu.MenuBuilder r6, com.actionbarsherlock.internal.view.menu.MenuItemImpl r7) {
            /*
            r5_this = this;
            r4 = 1;
            r3 = 0;
            r2 = 0;
            r0 = r5.this$0;
            r0 = r0.mExpandedActionView;
            r0 = r0 instanceof com.actionbarsherlock.view.CollapsibleActionView;
            if (r0 == 0) goto L_0x0014;
        L_0x000b:
            r0 = r5.this$0;
            r0 = r0.mExpandedActionView;
            r0 = (com.actionbarsherlock.view.CollapsibleActionView) r0;
            r0.onActionViewCollapsed();
        L_0x0014:
            r0 = r5.this$0;
            r1 = r5.this$0;
            r1 = r1.mExpandedActionView;
            r0.removeView(r1);
            r0 = r5.this$0;
            r1 = r5.this$0;
            r1 = com.actionbarsherlock.internal.widget.ActionBarView.access$600(r1);
            r0.removeView(r1);
            r0 = r5.this$0;
            r0.mExpandedActionView = r3;
            r0 = r5.this$0;
            r0 = com.actionbarsherlock.internal.widget.ActionBarView.access$1200(r0);
            r0 = r0 & 2;
            if (r0 == 0) goto L_0x003f;
        L_0x0036:
            r0 = r5.this$0;
            r0 = com.actionbarsherlock.internal.widget.ActionBarView.access$700(r0);
            r0.setVisibility(r2);
        L_0x003f:
            r0 = r5.this$0;
            r0 = com.actionbarsherlock.internal.widget.ActionBarView.access$1200(r0);
            r0 = r0 & 8;
            if (r0 == 0) goto L_0x0063;
        L_0x0049:
            r0 = r5.this$0;
            r0 = com.actionbarsherlock.internal.widget.ActionBarView.access$800(r0);
            if (r0 != 0) goto L_0x005a;
        L_0x0051:
            r0 = r5.this$0;
            com.actionbarsherlock.internal.widget.ActionBarView.access$1300(r0);
            r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
            if (r0 == 0) goto L_0x0063;
        L_0x005a:
            r0 = r5.this$0;
            r0 = com.actionbarsherlock.internal.widget.ActionBarView.access$800(r0);
            r0.setVisibility(r2);
        L_0x0063:
            r0 = r5.this$0;
            r0 = com.actionbarsherlock.internal.widget.ActionBarView.access$900(r0);
            if (r0 == 0) goto L_0x007d;
        L_0x006b:
            r0 = r5.this$0;
            r0 = com.actionbarsherlock.internal.widget.ActionBarView.access$1400(r0);
            r1 = 2;
            if (r0 != r1) goto L_0x007d;
        L_0x0074:
            r0 = r5.this$0;
            r0 = com.actionbarsherlock.internal.widget.ActionBarView.access$900(r0);
            r0.setVisibility(r2);
        L_0x007d:
            r0 = r5.this$0;
            r0 = com.actionbarsherlock.internal.widget.ActionBarView.access$1000(r0);
            if (r0 == 0) goto L_0x0096;
        L_0x0085:
            r0 = r5.this$0;
            r0 = com.actionbarsherlock.internal.widget.ActionBarView.access$1400(r0);
            if (r0 != r4) goto L_0x0096;
        L_0x008d:
            r0 = r5.this$0;
            r0 = com.actionbarsherlock.internal.widget.ActionBarView.access$1000(r0);
            r0.setVisibility(r2);
        L_0x0096:
            r0 = r5.this$0;
            r0 = com.actionbarsherlock.internal.widget.ActionBarView.access$1100(r0);
            if (r0 == 0) goto L_0x00b1;
        L_0x009e:
            r0 = r5.this$0;
            r0 = com.actionbarsherlock.internal.widget.ActionBarView.access$1200(r0);
            r0 = r0 & 16;
            if (r0 == 0) goto L_0x00b1;
        L_0x00a8:
            r0 = r5.this$0;
            r0 = com.actionbarsherlock.internal.widget.ActionBarView.access$1100(r0);
            r0.setVisibility(r2);
        L_0x00b1:
            r0 = r5.this$0;
            r0 = com.actionbarsherlock.internal.widget.ActionBarView.access$600(r0);
            r0.setIcon(r3);
            r5.mCurrentExpandedItem = r3;
            r0 = r5.this$0;
            r0.requestLayout();
            r7.setActionViewExpanded(r2);
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarView.ExpandedActionViewMenuPresenter.collapseItemActionView(com.actionbarsherlock.internal.view.menu.MenuBuilder, com.actionbarsherlock.internal.view.menu.MenuItemImpl):boolean");
        }

        public void updateMenuView(boolean z) {
            Object obj = null;
            boolean z2 = AbsActionBarView.b;
            if (this.mCurrentExpandedItem != null) {
                if (this.mMenu != null) {
                    int size = this.mMenu.size();
                    int i = 0;
                    while (i < size) {
                        if (this.mMenu.getItem(i) == this.mCurrentExpandedItem) {
                            obj = 1;
                            if (!z2) {
                                break;
                            }
                        }
                        i++;
                        if (z2) {
                            break;
                        }
                    }
                }
                if (obj == null) {
                    collapseItemActionView(this.mMenu, this.mCurrentExpandedItem);
                }
            }
        }

        public boolean flagActionItems() {
            return false;
        }
    }

    public class HomeView extends FrameLayout {
        private ImageView mIconView;
        private View mUpView;
        private int mUpWidth;

        public HomeView(Context context) {
            this(context, null);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected void onMeasure(int r12, int r13) {
            /*
            r11_this = this;
            r3 = 0;
            r10 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
            r1 = r11.mUpView;
            r0 = r11;
            r2 = r12;
            r4 = r13;
            r5 = r3;
            r0.measureChildWithMargins(r1, r2, r3, r4, r5);
            r0 = r11.mUpView;
            r0 = r0.getLayoutParams();
            r0 = (android.widget.FrameLayout.LayoutParams) r0;
            r1 = r0.leftMargin;
            r2 = r11.mUpView;
            r2 = r2.getMeasuredWidth();
            r1 = r1 + r2;
            r2 = r0.rightMargin;
            r1 = r1 + r2;
            r11.mUpWidth = r1;
            r1 = r11.mUpView;
            r1 = r1.getVisibility();
            r2 = 8;
            if (r1 != r2) goto L_0x0081;
        L_0x002c:
            r7 = r3;
        L_0x002d:
            r1 = r0.topMargin;
            r2 = r11.mUpView;
            r2 = r2.getMeasuredHeight();
            r1 = r1 + r2;
            r0 = r0.bottomMargin;
            r1 = r1 + r0;
            r5 = r11.mIconView;
            r4 = r11;
            r6 = r12;
            r8 = r13;
            r9 = r3;
            r4.measureChildWithMargins(r5, r6, r7, r8, r9);
            r0 = r11.mIconView;
            r0 = r0.getLayoutParams();
            r0 = (android.widget.FrameLayout.LayoutParams) r0;
            r2 = r0.leftMargin;
            r3 = r11.mIconView;
            r3 = r3.getMeasuredWidth();
            r2 = r2 + r3;
            r3 = r0.rightMargin;
            r2 = r2 + r3;
            r2 = r2 + r7;
            r3 = r0.topMargin;
            r4 = r11.mIconView;
            r4 = r4.getMeasuredHeight();
            r3 = r3 + r4;
            r0 = r0.bottomMargin;
            r0 = r0 + r3;
            r0 = java.lang.Math.max(r1, r0);
            r4 = android.view.View.MeasureSpec.getMode(r12);
            r5 = android.view.View.MeasureSpec.getMode(r13);
            r3 = android.view.View.MeasureSpec.getSize(r12);
            r1 = android.view.View.MeasureSpec.getSize(r13);
            switch(r4) {
                case -2147483648: goto L_0x0084;
                case 1073741824: goto L_0x008a;
                default: goto L_0x007a;
            };
        L_0x007a:
            switch(r5) {
                case -2147483648: goto L_0x008c;
                case 1073741824: goto L_0x0092;
                default: goto L_0x007d;
            };
        L_0x007d:
            r11.setMeasuredDimension(r2, r0);
            return;
        L_0x0081:
            r7 = r11.mUpWidth;
            goto L_0x002d;
        L_0x0084:
            r2 = java.lang.Math.min(r2, r3);
            if (r10 == 0) goto L_0x007a;
        L_0x008a:
            r2 = r3;
            goto L_0x007a;
        L_0x008c:
            r0 = java.lang.Math.min(r0, r1);
            if (r10 == 0) goto L_0x007d;
        L_0x0092:
            r0 = r1;
            goto L_0x007d;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarView.HomeView.onMeasure(int, int):void");
        }

        public int getLeftOffset() {
            return this.mUpView.getVisibility() == 8 ? this.mUpWidth : 0;
        }

        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            onPopulateAccessibilityEvent(accessibilityEvent);
            return true;
        }

        protected void onFinishInflate() {
            this.mUpView = findViewById(R.id.abs__up);
            if (ActionBarSherlock.isRtl) {
                ((ImageView) this.mUpView).setImageResource(R.drawable.abs__ic_ab_back_rtl_holo_dark);
            }
            this.mIconView = (ImageView) findViewById(R.id.abs__home);
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams;
            int measuredHeight;
            int measuredWidth;
            int i5;
            int i6;
            int i7;
            boolean z2 = AbsActionBarView.b;
            int i8 = (i4 - i2) / 2;
            boolean isLayoutRtl = AbsActionBarView.isLayoutRtl();
            int width = getWidth();
            if (this.mUpView.getVisibility() != 8) {
                layoutParams = (LayoutParams) this.mUpView.getLayoutParams();
                measuredHeight = this.mUpView.getMeasuredHeight();
                measuredWidth = this.mUpView.getMeasuredWidth();
                i5 = (layoutParams.leftMargin + measuredWidth) + layoutParams.rightMargin;
                i6 = i8 - (measuredHeight / 2);
                measuredHeight += i6;
                if (isLayoutRtl) {
                    i7 = width - measuredWidth;
                    i3 -= i5;
                    if (!z2) {
                        measuredWidth = width;
                        this.mUpView.layout(i7, i6, measuredWidth, measuredHeight);
                        measuredWidth = i5;
                    }
                }
                i7 = 0;
                i += i5;
                this.mUpView.layout(i7, i6, measuredWidth, measuredHeight);
                measuredWidth = i5;
            } else {
                measuredWidth = 0;
            }
            layoutParams = (LayoutParams) this.mIconView.getLayoutParams();
            i5 = this.mIconView.getMeasuredHeight();
            measuredHeight = this.mIconView.getMeasuredWidth();
            i6 = (i3 - i) / 2;
            i8 = Math.max(layoutParams.topMargin, i8 - (i5 / 2));
            i5 += i8;
            if (isLayoutRtl) {
                i7 = layoutParams.rightMargin;
            } else {
                i7 = layoutParams.leftMargin;
            }
            i6 = Math.max(i7, i6 - (measuredHeight / 2));
            if (isLayoutRtl) {
                i7 = (width - measuredWidth) - i6;
                width = i7 - measuredHeight;
                if (!z2) {
                    measuredWidth = width;
                    this.mIconView.layout(measuredWidth, i8, i7, i5);
                }
            }
            measuredWidth += i6;
            i7 = measuredWidth + measuredHeight;
            this.mIconView.layout(measuredWidth, i8, i7, i5);
        }

        public HomeView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void setUp(boolean z) {
            this.mUpView.setVisibility(z ? 0 : 8);
        }

        public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            if (VERSION.SDK_INT >= 14) {
                super.onPopulateAccessibilityEvent(accessibilityEvent);
            }
            CharSequence contentDescription = getContentDescription();
            if (!TextUtils.isEmpty(contentDescription)) {
                accessibilityEvent.getText().add(contentDescription);
            }
        }

        public void setIcon(Drawable drawable) {
            this.mIconView.setImageDrawable(drawable);
        }

        public boolean dispatchHoverEvent(MotionEvent motionEvent) {
            return onHoverEvent(motionEvent);
        }
    }

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR;
        int expandedMenuItemId;
        boolean isOverflowOpen;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.expandedMenuItemId = parcel.readInt();
            this.isOverflowOpen = parcel.readInt() != 0;
        }

        SavedState(Parcel parcel, AnonymousClass_1 anonymousClass_1) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.expandedMenuItemId);
            parcel.writeInt(this.isOverflowOpen ? 1 : 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        static {
            CREATOR = new Creator() {
                public Object[] newArray(int i) {
                    return newArray(i);
                }

                public Object createFromParcel(Parcel parcel) {
                    return createFromParcel(parcel);
                }

                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }

                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }
            };
        }
    }

    static {
        String[] strArr = new String[14];
        String str = "\u0018\u001a9|\u001b\u000e\u001d)fT\u0006\u0017wxZ\u0016\u001c8`d\u0018\u001a)`SRQ uO\f\u001b\u0012dZ\u001d\u0016#`\u0019O[\"f\u001b\t\u001a!xd\u001f\u0012?qU\u001bZ";
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
                        i3 = 111;
                        break;
                    case ay.f /*1*/:
                        i3 = 115;
                        break;
                    case ay.n /*2*/:
                        i3 = 77;
                        break;
                    case ay.p /*3*/:
                        i3 = 20;
                        break;
                    default:
                        i3 = 59;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0018\u001a9|\u001b\u000e\u001d)fT\u0006\u0017wxZ\u0016\u001c8`d\u0007\u0016$sS\u001bNocI\u000e\u0003\u0012wT\u0001\u0007(zOM";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "O\u0010,z\u001b\u0000\u001d!m\u001b\r\u0016maH\n\u0017m";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0003\u001c*{";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u000e\u00109}M\u0006\u00074";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0003\u001c*{";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ".\u001d)fT\u0006\u0017\u0000uU\u0006\u0015(gOA\u000b x";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0001\u0012 q";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u000e\u0003=xR\f\u00129}T\u0001";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = ".\u00109}T\u00011,fm\u0006\u0016:";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ".\u00109}T\u00011,fm\u0006\u0016:";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ".\u00109}M\u0006\u000744X\u0000\u001e={U\n\u001d94U\u000e\u001e(4U\u0000\u0007mrT\u001a\u001d)5";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ".\u00109}M\u0006\u000744X\u0000\u001e={U\n\u001d94U\u000e\u001e(4U\u0000\u0007mrT\u001a\u001d)5";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "O\u0010,z\u001b\u0000\u001d!m\u001b\r\u0016maH\n\u0017m";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public ActionBarView(android.content.Context r1, android.util.AttributeSet r2) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: com.actionbarsherlock.internal.widget.ActionBarView.<init>(android.content.Context, android.util.AttributeSet):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:113)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:223)
	at jadx.core.ProcessClass.process(ProcessClass.java:20)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
Caused by: java.lang.NullPointerException
	at jadx.core.dex.trycatch.TryCatchBlock.removeWholeBlock(TryCatchBlock.java:76)
	at jadx.core.dex.trycatch.TryCatchBlock.removeHandler(TryCatchBlock.java:60)
	at jadx.core.dex.nodes.MethodNode.initTryCatches(MethodNode.java:286)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 8 more
*/
        /*
        r0_this = this;
        r11 = 11;
        r9 = 1;
        r8 = 0;
        r10 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r12.<init>(r13, r14);
        r1 = -1;
        r12.mDisplayOptions = r1;
        r1 = new com.actionbarsherlock.internal.widget.ActionBarView$1;
        r1.<init>(r12);
        r12.mNavItemSelectedListener = r1;
        r1 = new com.actionbarsherlock.internal.widget.ActionBarView$2;
        r1.<init>(r12);
        r12.mExpandedActionViewUpListener = r1;
        r1 = new com.actionbarsherlock.internal.widget.ActionBarView$3;
        r1.<init>(r12);
        r12.mUpClickListener = r1;
        r12.setBackgroundResource(r8);
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar;
        r2 = com.actionbarsherlock.R.attr.actionBarStyle;
        r2 = r13.obtainStyledAttributes(r14, r1, r2, r8);
        r3 = r13.getApplicationInfo();
        r4 = r13.getPackageManager();
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_navigationMode;
        r5 = 0;
        r1 = r2.getInt(r1, r5);
        r12.mNavigationMode = r1;
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_title;
        r1 = r2.getText(r1);
        r12.mTitle = r1;
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_subtitle;
        r1 = r2.getText(r1);
        r12.mSubtitle = r1;
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_logo;
        r1 = r2.getDrawable(r1);
        r12.mLogo = r1;
        r1 = r12.mLogo;
        if (r1 != 0) goto L_0x0092;
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 >= r11) goto L_0x0076;
        r1 = r13 instanceof android.app.Activity;
        if (r1 == 0) goto L_0x0092;
        r1 = r13;
        r1 = (android.app.Activity) r1;
        r1 = loadLogoFromManifest(r1);
        if (r1 == 0) goto L_0x0074;
        r5 = r13.getResources();
        r1 = r5.getDrawable(r1);
        r12.mLogo = r1;
        if (r10 == 0) goto L_0x0092;
        r1 = r13 instanceof android.app.Activity;
        if (r1 == 0) goto L_0x0088;
        r0 = r13;
        r0 = (android.app.Activity) r0;
        r1 = r0;
        r1 = r1.getComponentName();
        r1 = r4.getActivityLogo(r1);
        r12.mLogo = r1;
        r1 = r12.mLogo;
        if (r1 != 0) goto L_0x0092;
        r1 = r3.loadLogo(r4);
        r12.mLogo = r1;
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_icon;
        r1 = r2.getDrawable(r1);
        r12.mIcon = r1;
        r1 = r12.mIcon;
        if (r1 != 0) goto L_0x00ba;
        r1 = r13 instanceof android.app.Activity;
        if (r1 == 0) goto L_0x00b0;
        r0 = r13;
        r0 = (android.app.Activity) r0;
        r1 = r0;
        r1 = r1.getComponentName();
        r1 = r4.getActivityIcon(r1);
        r12.mIcon = r1;
        r1 = r12.mIcon;
        if (r1 != 0) goto L_0x00ba;
        r1 = r3.loadIcon(r4);
        r12.mIcon = r1;
        r3 = android.view.LayoutInflater.from(r13);
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_homeLayout;
        r4 = com.actionbarsherlock.R.layout.abs__action_bar_home;
        r4 = r2.getResourceId(r1, r4);
        r1 = r3.inflate(r4, r12, r8);
        r1 = (com.actionbarsherlock.internal.widget.ActionBarView.HomeView) r1;
        r12.mHomeLayout = r1;
        r1 = r3.inflate(r4, r12, r8);
        r1 = (com.actionbarsherlock.internal.widget.ActionBarView.HomeView) r1;
        r12.mExpandedHomeLayout = r1;
        r1 = r12.mExpandedHomeLayout;
        r1.setUp(r9);
        r1 = r12.mExpandedHomeLayout;
        r4 = r12.mExpandedActionViewUpListener;
        r1.setOnClickListener(r4);
        r1 = r12.mExpandedHomeLayout;
        r4 = r12.getResources();
        r5 = com.actionbarsherlock.R.string.abs__action_bar_up_description;
        r4 = r4.getText(r5);
        r1.setContentDescription(r4);
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_titleTextStyle;
        r1 = r2.getResourceId(r1, r8);
        r12.mTitleStyleRes = r1;
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_subtitleTextStyle;
        r1 = r2.getResourceId(r1, r8);
        r12.mSubtitleStyleRes = r1;
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_progressBarStyle;
        r1 = r2.getResourceId(r1, r8);
        r12.mProgressStyle = r1;
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_indeterminateProgressStyle;
        r1 = r2.getResourceId(r1, r8);
        r12.mIndeterminateProgressStyle = r1;
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_progressBarPadding;
        r1 = r2.getDimensionPixelOffset(r1, r8);
        r12.mProgressBarPadding = r1;
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_itemPadding;
        r1 = r2.getDimensionPixelOffset(r1, r8);
        r12.mItemPadding = r1;
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_displayOptions;
        r1 = r2.getInt(r1, r8);
        r12.setDisplayOptions(r1);
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_customNavigationLayout;
        r1 = r2.getResourceId(r1, r8);
        if (r1 == 0) goto L_0x0143;
        r4 = 0;
        r1 = r3.inflate(r1, r12, r4);
        r12.mCustomNavView = r1;
        r1 = 0;
        r12.mNavigationMode = r1;
        r1 = r12.mDisplayOptions;
        r1 = r1 | 16;
        r12.setDisplayOptions(r1);
        r1 = com.actionbarsherlock.R.styleable.SherlockActionBar_height;
        r3 = 0;
        r1 = r2.getLayoutDimension(r1, r3);
        r12.mContentHeight = r1;
        r2.recycle();
        r1 = new com.actionbarsherlock.internal.view.menu.ActionMenuItem;
        r3 = 0;
        r4 = 16908332; // 0x102002c float:2.3877352E-38 double:8.353826E-317;
        r5 = 0;
        r6 = 0;
        r7 = r12.mTitle;
        r2 = r13;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.mLogoNavItem = r1;
        r1 = r12.mHomeLayout;
        r2 = r12.mUpClickListener;
        r1.setOnClickListener(r2);
        r1 = r12.mHomeLayout;
        r2 = 1;
        r1.setClickable(r2);
        r1 = r12.mHomeLayout;
        r2 = 1;
        r1.setFocusable(r2);
        r1 = com.actionbarsherlock.app.SherlockActivity.a;
        if (r1 == 0) goto L_0x017b;
        if (r10 == 0) goto L_0x01b6;
        r1 = r8;
        com.actionbarsherlock.internal.widget.AbsActionBarView.b = r1;
        return;
        r1 = move-exception;
        throw r1;
        r1 = move-exception;
        throw r1;
        r1 = move-exception;
        throw r1;
        r1 = move-exception;
        throw r1;
        r1 = move-exception;
        throw r1;
        r1 = move-exception;
        r5 = z;
        r6 = 10;
        r5 = r5[r6];
        r6 = z;
        r7 = 13;
        r6 = r6[r7];
        android.util.Log.e(r5, r6, r1);
        goto L_0x0088;
        r1 = move-exception;
        throw r1;
        r1 = move-exception;
        throw r1;
        r1 = move-exception;
        throw r1;
        r1 = move-exception;
        r5 = z;
        r5 = r5[r11];
        r6 = z;
        r7 = 12;
        r6 = r6[r7];
        android.util.Log.e(r5, r6, r1);
        goto L_0x00b0;
        r1 = move-exception;
        throw r1;
        r1 = move-exception;
        throw r1;
        r1 = move-exception;
        throw r1;
        r1 = move-exception;
        throw r1;
        r1 = r9;
        goto L_0x0179;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            if (this.mActionMenuPresenter != null) {
                this.mActionMenuPresenter.hideOverflowMenu();
                this.mActionMenuPresenter.hideSubMenus();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.mUserTitle = true;
        setTitleImpl(charSequence);
    }

    public void collapseActionView() {
        try {
            MenuItemImpl menuItemImpl;
            if (this.mExpandedMenuPresenter == null) {
                menuItemImpl = null;
            } else {
                menuItemImpl = this.mExpandedMenuPresenter.mCurrentExpandedItem;
            }
            if (menuItemImpl != null) {
                try {
                    menuItemImpl.collapseActionView();
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMenu(com.actionbarsherlock.view.Menu r7, com.actionbarsherlock.internal.view.menu.MenuPresenter.Callback r8) {
        /*
        r6_this = this;
        r5 = -1;
        r2 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r0 = r6.mOptionsMenu;	 Catch:{ IllegalStateException -> 0x0008 }
        if (r7 != r0) goto L_0x000a;
    L_0x0007:
        return;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r0 = r6.mOptionsMenu;	 Catch:{ IllegalStateException -> 0x00e1 }
        if (r0 == 0) goto L_0x001c;
    L_0x000e:
        r0 = r6.mOptionsMenu;	 Catch:{ IllegalStateException -> 0x00e1 }
        r1 = r6.mActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x00e1 }
        r0.removeMenuPresenter(r1);	 Catch:{ IllegalStateException -> 0x00e1 }
        r0 = r6.mOptionsMenu;	 Catch:{ IllegalStateException -> 0x00e1 }
        r1 = r6.mExpandedMenuPresenter;	 Catch:{ IllegalStateException -> 0x00e1 }
        r0.removeMenuPresenter(r1);	 Catch:{ IllegalStateException -> 0x00e1 }
    L_0x001c:
        r7 = (com.actionbarsherlock.internal.view.menu.MenuBuilder) r7;
        r6.mOptionsMenu = r7;
        r0 = r6.mMenuView;
        if (r0 == 0) goto L_0x0033;
    L_0x0024:
        r0 = r6.mMenuView;
        r0 = r0.getParent();
        r0 = (android.view.ViewGroup) r0;
        if (r0 == 0) goto L_0x0033;
    L_0x002e:
        r1 = r6.mMenuView;	 Catch:{ IllegalStateException -> 0x00e3 }
        r0.removeView(r1);	 Catch:{ IllegalStateException -> 0x00e3 }
    L_0x0033:
        r0 = r6.mActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x00e5 }
        if (r0 != 0) goto L_0x0054;
    L_0x0037:
        r0 = new com.actionbarsherlock.internal.view.menu.ActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x00e5 }
        r1 = r6.mContext;	 Catch:{ IllegalStateException -> 0x00e5 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x00e5 }
        r6.mActionMenuPresenter = r0;	 Catch:{ IllegalStateException -> 0x00e5 }
        r0 = r6.mActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x00e5 }
        r0.setCallback(r8);	 Catch:{ IllegalStateException -> 0x00e5 }
        r0 = r6.mActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x00e5 }
        r1 = com.actionbarsherlock.R.id.abs__action_menu_presenter;	 Catch:{ IllegalStateException -> 0x00e5 }
        r0.setId(r1);	 Catch:{ IllegalStateException -> 0x00e5 }
        r0 = new com.actionbarsherlock.internal.widget.ActionBarView$ExpandedActionViewMenuPresenter;	 Catch:{ IllegalStateException -> 0x00e5 }
        r1 = 0;
        r0.<init>(r6, r1);	 Catch:{ IllegalStateException -> 0x00e5 }
        r6.mExpandedMenuPresenter = r0;	 Catch:{ IllegalStateException -> 0x00e5 }
    L_0x0054:
        r3 = new android.view.ViewGroup$LayoutParams;
        r0 = -2;
        r3.<init>(r0, r5);
        r0 = r6.mSplitActionBar;
        if (r0 != 0) goto L_0x008a;
    L_0x005e:
        r0 = r6.mActionMenuPresenter;
        r1 = r6.getContext();
        r4 = com.actionbarsherlock.R.bool.abs__action_bar_expanded_action_views_exclusive;
        r1 = com.actionbarsherlock.internal.ResourcesCompat.getResources_getBoolean(r1, r4);
        r0.setExpandedActionViewsExclusive(r1);
        r6.configPresenters(r7);
        r0 = r6.mActionMenuPresenter;
        r0 = r0.getMenuView(r6);
        r0 = (com.actionbarsherlock.internal.view.menu.ActionMenuView) r0;
        r1 = r0.getParent();
        r1 = (android.view.ViewGroup) r1;
        if (r1 == 0) goto L_0x0085;
    L_0x0080:
        if (r1 == r6) goto L_0x0085;
    L_0x0082:
        r1.removeView(r0);	 Catch:{ IllegalStateException -> 0x00e7 }
    L_0x0085:
        r6.addView(r0, r3);
        if (r2 == 0) goto L_0x00dd;
    L_0x008a:
        r0 = r6.mActionMenuPresenter;
        r1 = 0;
        r0.setExpandedActionViewsExclusive(r1);
        r0 = r6.mActionMenuPresenter;
        r1 = r6.getContext();
        r1 = r1.getResources();
        r1 = r1.getDisplayMetrics();
        r1 = r1.widthPixels;
        r4 = 1;
        r0.setWidthLimit(r1, r4);
        r0 = r6.mActionMenuPresenter;
        r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0.setItemLimit(r1);
        r3.width = r5;
        r6.configPresenters(r7);
        r0 = r6.mActionMenuPresenter;
        r0 = r0.getMenuView(r6);
        r0 = (com.actionbarsherlock.internal.view.menu.ActionMenuView) r0;
        r1 = r6.mSplitView;
        if (r1 == 0) goto L_0x00da;
    L_0x00bd:
        r1 = r0.getParent();
        r1 = (android.view.ViewGroup) r1;
        if (r1 == 0) goto L_0x00cc;
    L_0x00c5:
        r4 = r6.mSplitView;	 Catch:{ IllegalStateException -> 0x00e9 }
        if (r1 == r4) goto L_0x00cc;
    L_0x00c9:
        r1.removeView(r0);	 Catch:{ IllegalStateException -> 0x00e9 }
    L_0x00cc:
        r1 = r6.getAnimatedVisibility();	 Catch:{ IllegalStateException -> 0x00eb }
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x00eb }
        r1 = r6.mSplitView;	 Catch:{ IllegalStateException -> 0x00eb }
        r1.addView(r0, r3);	 Catch:{ IllegalStateException -> 0x00eb }
        if (r2 == 0) goto L_0x00dd;
    L_0x00da:
        r0.setLayoutParams(r3);	 Catch:{ IllegalStateException -> 0x00eb }
    L_0x00dd:
        r6.mMenuView = r0;
        goto L_0x0007;
    L_0x00e1:
        r0 = move-exception;
        throw r0;
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        throw r0;
    L_0x00e7:
        r0 = move-exception;
        throw r0;
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarView.setMenu(com.actionbarsherlock.view.Menu, com.actionbarsherlock.internal.view.menu.MenuPresenter$Callback):void");
    }

    public void setDropdownSelectedPosition(int i) {
        this.mSpinner.setSelection(i);
    }

    static void access$1300(ActionBarView actionBarView) {
        actionBarView.initTitle();
    }

    public void setEmbeddedTabView(ScrollingTabContainerView scrollingTabContainerView) {
        try {
            if (this.mTabScrollView != null) {
                removeView(this.mTabScrollView);
            }
            try {
                this.mTabScrollView = scrollingTabContainerView;
                try {
                    this.mIncludeTabs = scrollingTabContainerView != null;
                    if (this.mIncludeTabs && this.mNavigationMode == 2) {
                        addView(this.mTabScrollView);
                        ViewGroup.LayoutParams layoutParams = this.mTabScrollView.getLayoutParams();
                        layoutParams.width = -2;
                        layoutParams.height = -1;
                        scrollingTabContainerView.setAllowCollapse(true);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
            this.mTitleView = null;
            this.mSubtitleView = null;
            this.mTitleUpView = null;
            if (this.mTitleLayout != null) {
                if (this.mTitleLayout.getParent() == this) {
                    removeView(this.mTitleLayout);
                }
            }
            try {
                this.mTitleLayout = null;
                if ((this.mDisplayOptions & 8) != 0) {
                    initTitle();
                }
                try {
                    if (this.mTabScrollView != null && this.mIncludeTabs) {
                        ViewGroup.LayoutParams layoutParams = this.mTabScrollView.getLayoutParams();
                        if (layoutParams != null) {
                            try {
                                layoutParams.width = -2;
                                layoutParams.height = -1;
                            } catch (IllegalStateException e) {
                                throw e;
                            }
                        }
                        this.mTabScrollView.setAllowCollapse(true);
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    public void setIcon(int i) {
        setIcon(this.mContext.getResources().getDrawable(i));
    }

    public void initProgress() {
        this.mProgressView = new IcsProgressBar(this.mContext, null, 0, this.mProgressStyle);
        this.mProgressView.setId(R.id.abs__progress_horizontal);
        this.mProgressView.setMax(10000);
        addView(this.mProgressView);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setNavigationMode(int r6) {
        /*
        r5_this = this;
        r4 = 0;
        r1 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r0 = r5.mNavigationMode;
        if (r6 == r0) goto L_0x0012;
    L_0x0007:
        switch(r0) {
            case 1: goto L_0x0013;
            case 2: goto L_0x001e;
            default: goto L_0x000a;
        };
    L_0x000a:
        switch(r6) {
            case 1: goto L_0x0034;
            case 2: goto L_0x0084;
            default: goto L_0x000d;
        };
    L_0x000d:
        r5.mNavigationMode = r6;
        r5.requestLayout();
    L_0x0012:
        return;
    L_0x0013:
        r0 = r5.mListNavLayout;	 Catch:{ IllegalStateException -> 0x002e }
        if (r0 == 0) goto L_0x000a;
    L_0x0017:
        r0 = r5.mListNavLayout;	 Catch:{ IllegalStateException -> 0x0030 }
        r5.removeView(r0);	 Catch:{ IllegalStateException -> 0x0030 }
        if (r1 == 0) goto L_0x000a;
    L_0x001e:
        r0 = r5.mTabScrollView;	 Catch:{ IllegalStateException -> 0x0032 }
        if (r0 == 0) goto L_0x000a;
    L_0x0022:
        r0 = r5.mIncludeTabs;	 Catch:{ IllegalStateException -> 0x002c }
        if (r0 == 0) goto L_0x000a;
    L_0x0026:
        r0 = r5.mTabScrollView;	 Catch:{ IllegalStateException -> 0x002c }
        r5.removeView(r0);	 Catch:{ IllegalStateException -> 0x002c }
        goto L_0x000a;
    L_0x002c:
        r0 = move-exception;
        throw r0;
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002c }
    L_0x0034:
        r0 = r5.mSpinner;	 Catch:{ IllegalStateException -> 0x0095 }
        if (r0 != 0) goto L_0x0065;
    L_0x0038:
        r0 = new com.actionbarsherlock.internal.widget.IcsSpinner;
        r2 = r5.mContext;
        r3 = com.actionbarsherlock.R.attr.actionDropDownStyle;
        r0.<init>(r2, r4, r3);
        r5.mSpinner = r0;
        r0 = r5.mContext;
        r0 = android.view.LayoutInflater.from(r0);
        r2 = com.actionbarsherlock.R.layout.abs__action_bar_tab_bar_view;
        r0 = r0.inflate(r2, r4);
        r0 = (com.actionbarsherlock.internal.widget.IcsLinearLayout) r0;
        r5.mListNavLayout = r0;
        r0 = new android.widget.LinearLayout$LayoutParams;
        r2 = -2;
        r3 = -1;
        r0.<init>(r2, r3);
        r2 = 17;
        r0.gravity = r2;
        r2 = r5.mListNavLayout;
        r3 = r5.mSpinner;
        r2.addView(r3, r0);
    L_0x0065:
        r0 = r5.mSpinner;	 Catch:{ IllegalStateException -> 0x0097 }
        r0 = r0.getAdapter();	 Catch:{ IllegalStateException -> 0x0097 }
        r2 = r5.mSpinnerAdapter;	 Catch:{ IllegalStateException -> 0x0097 }
        if (r0 == r2) goto L_0x0076;
    L_0x006f:
        r0 = r5.mSpinner;	 Catch:{ IllegalStateException -> 0x0097 }
        r2 = r5.mSpinnerAdapter;	 Catch:{ IllegalStateException -> 0x0097 }
        r0.setAdapter(r2);	 Catch:{ IllegalStateException -> 0x0097 }
    L_0x0076:
        r0 = r5.mSpinner;	 Catch:{ IllegalStateException -> 0x0099 }
        r2 = r5.mNavItemSelectedListener;	 Catch:{ IllegalStateException -> 0x0099 }
        r0.setOnItemSelectedListener(r2);	 Catch:{ IllegalStateException -> 0x0099 }
        r0 = r5.mListNavLayout;	 Catch:{ IllegalStateException -> 0x0099 }
        r5.addView(r0);	 Catch:{ IllegalStateException -> 0x0099 }
        if (r1 == 0) goto L_0x000d;
    L_0x0084:
        r0 = r5.mTabScrollView;	 Catch:{ IllegalStateException -> 0x009b }
        if (r0 == 0) goto L_0x000d;
    L_0x0088:
        r0 = r5.mIncludeTabs;	 Catch:{ IllegalStateException -> 0x0093 }
        if (r0 == 0) goto L_0x000d;
    L_0x008c:
        r0 = r5.mTabScrollView;	 Catch:{ IllegalStateException -> 0x0093 }
        r5.addView(r0);	 Catch:{ IllegalStateException -> 0x0093 }
        goto L_0x000d;
    L_0x0093:
        r0 = move-exception;
        throw r0;
    L_0x0095:
        r0 = move-exception;
        throw r0;
    L_0x0097:
        r0 = move-exception;
        throw r0;
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x009b }
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0093 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarView.setNavigationMode(int):void");
    }

    static LinearLayout access$800(ActionBarView actionBarView) {
        return actionBarView.mTitleLayout;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        try {
            if (this.mExpandedMenuPresenter != null) {
                if (this.mExpandedMenuPresenter.mCurrentExpandedItem != null) {
                    savedState.expandedMenuItemId = this.mExpandedMenuPresenter.mCurrentExpandedItem.getItemId();
                }
            }
            savedState.isOverflowOpen = isOverflowMenuShowing();
            return savedState;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    protected void onFinishInflate() {
        try {
            super.onFinishInflate();
            addView(this.mHomeLayout);
            if (this.mCustomNavView != null && (this.mDisplayOptions & 16) != 0) {
                ActionBarView parent = this.mCustomNavView.getParent();
                if (parent != this) {
                    try {
                        if (parent instanceof ViewGroup) {
                            parent.removeView(this.mCustomNavView);
                        }
                        addView(this.mCustomNavView);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public boolean hasEmbeddedTabs() {
        return this.mIncludeTabs;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r22, int r23) {
        /*
        r21_this = this;
        r15 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r16 = r21.getChildCount();
        r0 = r21;
        r2 = r0.mIsCollapsable;
        if (r2 == 0) goto L_0x0052;
    L_0x000c:
        r3 = 0;
        r2 = 0;
        r20 = r2;
        r2 = r3;
        r3 = r20;
    L_0x0013:
        r0 = r16;
        if (r3 >= r0) goto L_0x003b;
    L_0x0017:
        r0 = r21;
        r4 = r0.getChildAt(r3);
        r5 = r4.getVisibility();	 Catch:{ IllegalStateException -> 0x004a }
        r6 = 8;
        if (r5 == r6) goto L_0x0037;
    L_0x0025:
        r0 = r21;
        r5 = r0.mMenuView;	 Catch:{ IllegalStateException -> 0x004c }
        if (r4 != r5) goto L_0x0035;
    L_0x002b:
        r0 = r21;
        r4 = r0.mMenuView;	 Catch:{ IllegalStateException -> 0x004e }
        r4 = r4.getChildCount();	 Catch:{ IllegalStateException -> 0x004e }
        if (r4 == 0) goto L_0x0037;
    L_0x0035:
        r2 = r2 + 1;
    L_0x0037:
        r3 = r3 + 1;
        if (r15 == 0) goto L_0x0013;
    L_0x003b:
        if (r2 != 0) goto L_0x0052;
    L_0x003d:
        r2 = 0;
        r3 = 0;
        r0 = r21;
        r0.setMeasuredDimension(r2, r3);	 Catch:{ IllegalStateException -> 0x0050 }
        r2 = 1;
        r0 = r21;
        r0.mIsCollapsed = r2;	 Catch:{ IllegalStateException -> 0x0050 }
    L_0x0049:
        return;
    L_0x004a:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x004c }
    L_0x004c:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x004e }
    L_0x004e:
        r2 = move-exception;
        throw r2;
    L_0x0050:
        r2 = move-exception;
        throw r2;
    L_0x0052:
        r2 = 0;
        r0 = r21;
        r0.mIsCollapsed = r2;
        r2 = android.view.View.MeasureSpec.getMode(r22);
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r2 == r3) goto L_0x008e;
    L_0x005f:
        r2 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x008c }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x008c }
        r3.<init>();	 Catch:{ IllegalStateException -> 0x008c }
        r4 = r21.getClass();	 Catch:{ IllegalStateException -> 0x008c }
        r4 = r4.getSimpleName();	 Catch:{ IllegalStateException -> 0x008c }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x008c }
        r4 = z;	 Catch:{ IllegalStateException -> 0x008c }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x008c }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x008c }
        r4 = z;	 Catch:{ IllegalStateException -> 0x008c }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x008c }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x008c }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x008c }
        r2.<init>(r3);	 Catch:{ IllegalStateException -> 0x008c }
        throw r2;	 Catch:{ IllegalStateException -> 0x008c }
    L_0x008c:
        r2 = move-exception;
        throw r2;
    L_0x008e:
        r2 = android.view.View.MeasureSpec.getMode(r23);
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r2 == r3) goto L_0x00c5;
    L_0x0096:
        r2 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x00c3 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00c3 }
        r3.<init>();	 Catch:{ IllegalStateException -> 0x00c3 }
        r4 = r21.getClass();	 Catch:{ IllegalStateException -> 0x00c3 }
        r4 = r4.getSimpleName();	 Catch:{ IllegalStateException -> 0x00c3 }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x00c3 }
        r4 = z;	 Catch:{ IllegalStateException -> 0x00c3 }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00c3 }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x00c3 }
        r4 = z;	 Catch:{ IllegalStateException -> 0x00c3 }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x00c3 }
        r3 = r3.append(r4);	 Catch:{ IllegalStateException -> 0x00c3 }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x00c3 }
        r2.<init>(r3);	 Catch:{ IllegalStateException -> 0x00c3 }
        throw r2;	 Catch:{ IllegalStateException -> 0x00c3 }
    L_0x00c3:
        r2 = move-exception;
        throw r2;
    L_0x00c5:
        r17 = android.view.View.MeasureSpec.getSize(r22);
        r0 = r21;
        r2 = r0.mContentHeight;	 Catch:{ IllegalStateException -> 0x02f3 }
        if (r2 <= 0) goto L_0x02f5;
    L_0x00cf:
        r0 = r21;
        r2 = r0.mContentHeight;	 Catch:{ IllegalStateException -> 0x02f3 }
        r4 = r2;
    L_0x00d4:
        r2 = r21.getPaddingTop();
        r3 = r21.getPaddingBottom();
        r18 = r2 + r3;
        r2 = r21.getPaddingLeft();
        r3 = r21.getPaddingRight();
        r10 = r4 - r18;
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r5);
        r2 = r17 - r2;
        r6 = r2 - r3;
        r5 = r6 / 2;
        r0 = r21;
        r2 = r0.mExpandedActionView;	 Catch:{ IllegalStateException -> 0x02fc }
        if (r2 == 0) goto L_0x02fe;
    L_0x00fa:
        r0 = r21;
        r2 = r0.mExpandedHomeLayout;	 Catch:{ IllegalStateException -> 0x02fc }
    L_0x00fe:
        r3 = r2.getVisibility();
        r8 = 8;
        if (r3 == r8) goto L_0x040e;
    L_0x0106:
        r8 = r2.getLayoutParams();
        r3 = r8.width;
        if (r3 >= 0) goto L_0x0116;
    L_0x010e:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3);
        if (r15 == 0) goto L_0x011e;
    L_0x0116:
        r3 = r8.width;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8);
    L_0x011e:
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8);
        r2.measure(r3, r8);
        r3 = r2.getMeasuredWidth();
        r2 = r2.getLeftOffset();
        r2 = r2 + r3;
        r3 = 0;
        r6 = r6 - r2;
        r6 = java.lang.Math.max(r3, r6);
        r3 = 0;
        r2 = r6 - r2;
        r3 = java.lang.Math.max(r3, r2);
    L_0x013d:
        r0 = r21;
        r2 = r0.mMenuView;	 Catch:{ IllegalStateException -> 0x0304 }
        if (r2 == 0) goto L_0x040b;
    L_0x0143:
        r0 = r21;
        r2 = r0.mMenuView;	 Catch:{ IllegalStateException -> 0x0304 }
        r2 = r2.getParent();	 Catch:{ IllegalStateException -> 0x0304 }
        r0 = r21;
        if (r2 != r0) goto L_0x040b;
    L_0x014f:
        r0 = r21;
        r2 = r0.mMenuView;
        r8 = 0;
        r0 = r21;
        r6 = r0.measureChildView(r2, r6, r7, r8);
        r2 = 0;
        r0 = r21;
        r8 = r0.mMenuView;
        r8 = r8.getMeasuredWidth();
        r5 = r5 - r8;
        r2 = java.lang.Math.max(r2, r5);
    L_0x0168:
        r0 = r21;
        r5 = r0.mIndeterminateProgressView;	 Catch:{ IllegalStateException -> 0x0306 }
        if (r5 == 0) goto L_0x0408;
    L_0x016e:
        r0 = r21;
        r5 = r0.mIndeterminateProgressView;	 Catch:{ IllegalStateException -> 0x0306 }
        r5 = r5.getVisibility();	 Catch:{ IllegalStateException -> 0x0306 }
        r8 = 8;
        if (r5 == r8) goto L_0x0408;
    L_0x017a:
        r0 = r21;
        r5 = r0.mIndeterminateProgressView;
        r8 = 0;
        r0 = r21;
        r6 = r0.measureChildView(r5, r6, r7, r8);
        r5 = 0;
        r0 = r21;
        r7 = r0.mIndeterminateProgressView;
        r7 = r7.getMeasuredWidth();
        r2 = r2 - r7;
        r2 = java.lang.Math.max(r5, r2);
        r14 = r2;
    L_0x0194:
        r0 = r21;
        r2 = r0.mTitleLayout;	 Catch:{ IllegalStateException -> 0x0308 }
        if (r2 == 0) goto L_0x030e;
    L_0x019a:
        r0 = r21;
        r2 = r0.mTitleLayout;	 Catch:{ IllegalStateException -> 0x030a }
        r2 = r2.getVisibility();	 Catch:{ IllegalStateException -> 0x030a }
        r5 = 8;
        if (r2 == r5) goto L_0x030e;
    L_0x01a6:
        r0 = r21;
        r2 = r0.mDisplayOptions;	 Catch:{ IllegalStateException -> 0x030c }
        r2 = r2 & 8;
        if (r2 == 0) goto L_0x030e;
    L_0x01ae:
        r2 = 1;
        r5 = r2;
    L_0x01b0:
        r0 = r21;
        r2 = r0.mExpandedActionView;	 Catch:{ IllegalStateException -> 0x0312 }
        if (r2 != 0) goto L_0x01bd;
    L_0x01b6:
        r0 = r21;
        r2 = r0.mNavigationMode;	 Catch:{ IllegalStateException -> 0x0314 }
        switch(r2) {
            case 1: goto L_0x031a;
            case 2: goto L_0x0360;
            default: goto L_0x01bd;
        };
    L_0x01bd:
        r7 = r6;
        r6 = r3;
    L_0x01bf:
        r2 = 0;
        r0 = r21;
        r3 = r0.mExpandedActionView;
        if (r3 == 0) goto L_0x03b5;
    L_0x01c6:
        r0 = r21;
        r2 = r0.mExpandedActionView;
        r13 = r2;
    L_0x01cb:
        if (r13 == 0) goto L_0x0252;
    L_0x01cd:
        r2 = r13.getLayoutParams();
        r0 = r21;
        r3 = r0.generateLayoutParams(r2);
        r2 = r3 instanceof com.actionbarsherlock.app.ActionBar.LayoutParams;	 Catch:{ IllegalStateException -> 0x03cc }
        if (r2 == 0) goto L_0x03ce;
    L_0x01db:
        r0 = r3;
        r0 = (com.actionbarsherlock.app.ActionBar.LayoutParams) r0;	 Catch:{ IllegalStateException -> 0x03cc }
        r2 = r0;
        r12 = r2;
    L_0x01e0:
        r8 = 0;
        r2 = 0;
        if (r12 == 0) goto L_0x01ee;
    L_0x01e4:
        r2 = r12.leftMargin;
        r8 = r12.rightMargin;
        r8 = r8 + r2;
        r2 = r12.topMargin;
        r9 = r12.bottomMargin;
        r2 = r2 + r9;
    L_0x01ee:
        r0 = r21;
        r9 = r0.mContentHeight;
        if (r9 > 0) goto L_0x01f8;
    L_0x01f4:
        r9 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r15 == 0) goto L_0x03fe;
    L_0x01f8:
        r9 = r3.height;	 Catch:{ IllegalStateException -> 0x03d2 }
        r11 = -2;
        if (r9 == r11) goto L_0x03d4;
    L_0x01fd:
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x01ff:
        r11 = r9;
    L_0x0200:
        r19 = 0;
        r9 = r3.height;	 Catch:{ IllegalStateException -> 0x03d8 }
        if (r9 < 0) goto L_0x03da;
    L_0x0206:
        r9 = r3.height;	 Catch:{ IllegalStateException -> 0x03d8 }
        r9 = java.lang.Math.min(r9, r10);	 Catch:{ IllegalStateException -> 0x03d8 }
    L_0x020c:
        r2 = r9 - r2;
        r0 = r19;
        r19 = java.lang.Math.max(r0, r2);
        r2 = r3.width;	 Catch:{ IllegalStateException -> 0x03dd }
        r9 = -2;
        if (r2 == r9) goto L_0x03df;
    L_0x0219:
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x021b:
        r10 = 0;
        r9 = r3.width;	 Catch:{ IllegalStateException -> 0x03e3 }
        if (r9 < 0) goto L_0x03e5;
    L_0x0220:
        r9 = r3.width;	 Catch:{ IllegalStateException -> 0x03e3 }
        r9 = java.lang.Math.min(r9, r7);	 Catch:{ IllegalStateException -> 0x03e3 }
    L_0x0226:
        r9 = r9 - r8;
        r10 = java.lang.Math.max(r10, r9);
        if (r12 == 0) goto L_0x03ea;
    L_0x022d:
        r9 = r12.gravity;	 Catch:{ IllegalStateException -> 0x03e8 }
    L_0x022f:
        r9 = r9 & 7;
        r12 = 1;
        if (r9 != r12) goto L_0x03fb;
    L_0x0234:
        r3 = r3.width;	 Catch:{ IllegalStateException -> 0x03ee }
        r9 = -1;
        if (r3 != r9) goto L_0x03fb;
    L_0x0239:
        r3 = java.lang.Math.min(r6, r14);
        r3 = r3 * 2;
    L_0x023f:
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2);
        r0 = r19;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r11);
        r13.measure(r2, r3);
        r2 = r13.getMeasuredWidth();
        r2 = r2 + r8;
        r7 = r7 - r2;
    L_0x0252:
        r0 = r21;
        r2 = r0.mExpandedActionView;	 Catch:{ IllegalStateException -> 0x03f0 }
        if (r2 != 0) goto L_0x027c;
    L_0x0258:
        if (r5 == 0) goto L_0x027c;
    L_0x025a:
        r0 = r21;
        r2 = r0.mTitleLayout;
        r0 = r21;
        r3 = r0.mContentHeight;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5);
        r5 = 0;
        r0 = r21;
        r0.measureChildView(r2, r7, r3, r5);
        r2 = 0;
        r0 = r21;
        r3 = r0.mTitleLayout;
        r3 = r3.getMeasuredWidth();
        r3 = r6 - r3;
        java.lang.Math.max(r2, r3);
    L_0x027c:
        r0 = r21;
        r2 = r0.mContentHeight;
        if (r2 > 0) goto L_0x02a6;
    L_0x0282:
        r3 = 0;
        r2 = 0;
        r5 = r2;
        r2 = r3;
    L_0x0286:
        r0 = r16;
        if (r5 >= r0) goto L_0x029d;
    L_0x028a:
        r0 = r21;
        r3 = r0.getChildAt(r5);
        r3 = r3.getMeasuredHeight();
        r3 = r3 + r18;
        if (r3 <= r2) goto L_0x0299;
    L_0x0298:
        r2 = r3;
    L_0x0299:
        r3 = r5 + 1;
        if (r15 == 0) goto L_0x03f8;
    L_0x029d:
        r0 = r21;
        r1 = r17;
        r0.setMeasuredDimension(r1, r2);	 Catch:{ IllegalStateException -> 0x03f2 }
        if (r15 == 0) goto L_0x02ad;
    L_0x02a6:
        r0 = r21;
        r1 = r17;
        r0.setMeasuredDimension(r1, r4);	 Catch:{ IllegalStateException -> 0x03f2 }
    L_0x02ad:
        r0 = r21;
        r2 = r0.mContextView;	 Catch:{ IllegalStateException -> 0x03f4 }
        if (r2 == 0) goto L_0x02be;
    L_0x02b3:
        r0 = r21;
        r2 = r0.mContextView;	 Catch:{ IllegalStateException -> 0x03f4 }
        r3 = r21.getMeasuredHeight();	 Catch:{ IllegalStateException -> 0x03f4 }
        r2.setContentHeight(r3);	 Catch:{ IllegalStateException -> 0x03f4 }
    L_0x02be:
        r0 = r21;
        r2 = r0.mProgressView;	 Catch:{ IllegalStateException -> 0x03f6 }
        if (r2 == 0) goto L_0x0049;
    L_0x02c4:
        r0 = r21;
        r2 = r0.mProgressView;	 Catch:{ IllegalStateException -> 0x02f1 }
        r2 = r2.getVisibility();	 Catch:{ IllegalStateException -> 0x02f1 }
        r3 = 8;
        if (r2 == r3) goto L_0x0049;
    L_0x02d0:
        r0 = r21;
        r2 = r0.mProgressView;	 Catch:{ IllegalStateException -> 0x02f1 }
        r0 = r21;
        r3 = r0.mProgressBarPadding;	 Catch:{ IllegalStateException -> 0x02f1 }
        r3 = r3 * 2;
        r3 = r17 - r3;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4);	 Catch:{ IllegalStateException -> 0x02f1 }
        r4 = r21.getMeasuredHeight();	 Catch:{ IllegalStateException -> 0x02f1 }
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5);	 Catch:{ IllegalStateException -> 0x02f1 }
        r2.measure(r3, r4);	 Catch:{ IllegalStateException -> 0x02f1 }
        goto L_0x0049;
    L_0x02f1:
        r2 = move-exception;
        throw r2;
    L_0x02f3:
        r2 = move-exception;
        throw r2;
    L_0x02f5:
        r2 = android.view.View.MeasureSpec.getSize(r23);
        r4 = r2;
        goto L_0x00d4;
    L_0x02fc:
        r2 = move-exception;
        throw r2;
    L_0x02fe:
        r0 = r21;
        r2 = r0.mHomeLayout;
        goto L_0x00fe;
    L_0x0304:
        r2 = move-exception;
        throw r2;
    L_0x0306:
        r2 = move-exception;
        throw r2;
    L_0x0308:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x030a }
    L_0x030a:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x030c }
    L_0x030c:
        r2 = move-exception;
        throw r2;
    L_0x030e:
        r2 = 0;
        r5 = r2;
        goto L_0x01b0;
    L_0x0312:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0314 }
    L_0x0314:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0316 }
    L_0x0316:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0318 }
    L_0x0318:
        r2 = move-exception;
        throw r2;
    L_0x031a:
        r0 = r21;
        r2 = r0.mListNavLayout;	 Catch:{ IllegalStateException -> 0x0316 }
        if (r2 == 0) goto L_0x01bd;
    L_0x0320:
        if (r5 == 0) goto L_0x03a6;
    L_0x0322:
        r0 = r21;
        r2 = r0.mItemPadding;	 Catch:{ IllegalStateException -> 0x0318 }
        r2 = r2 * 2;
    L_0x0328:
        r7 = 0;
        r6 = r6 - r2;
        r6 = java.lang.Math.max(r7, r6);
        r7 = 0;
        r2 = r3 - r2;
        r2 = java.lang.Math.max(r7, r2);
        r0 = r21;
        r3 = r0.mListNavLayout;
        r7 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7);
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8);
        r3.measure(r7, r8);
        r0 = r21;
        r3 = r0.mListNavLayout;
        r7 = r3.getMeasuredWidth();
        r3 = 0;
        r6 = r6 - r7;
        r3 = java.lang.Math.max(r3, r6);
        r6 = 0;
        r2 = r2 - r7;
        r2 = java.lang.Math.max(r6, r2);
        if (r15 == 0) goto L_0x0404;
    L_0x035e:
        r6 = r3;
        r3 = r2;
    L_0x0360:
        r0 = r21;
        r2 = r0.mTabScrollView;	 Catch:{ IllegalStateException -> 0x03ac }
        if (r2 == 0) goto L_0x01bd;
    L_0x0366:
        if (r5 == 0) goto L_0x03b0;
    L_0x0368:
        r0 = r21;
        r2 = r0.mItemPadding;	 Catch:{ IllegalStateException -> 0x03ae }
        r2 = r2 * 2;
    L_0x036e:
        r7 = 0;
        r6 = r6 - r2;
        r6 = java.lang.Math.max(r7, r6);
        r7 = 0;
        r2 = r3 - r2;
        r2 = java.lang.Math.max(r7, r2);
        r0 = r21;
        r3 = r0.mTabScrollView;
        r7 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7);
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8);
        r3.measure(r7, r8);
        r0 = r21;
        r3 = r0.mTabScrollView;
        r7 = r3.getMeasuredWidth();
        r3 = 0;
        r6 = r6 - r7;
        r3 = java.lang.Math.max(r3, r6);
        r6 = 0;
        r2 = r2 - r7;
        r2 = java.lang.Math.max(r6, r2);
        r6 = r2;
        r7 = r3;
        goto L_0x01bf;
    L_0x03a6:
        r0 = r21;
        r2 = r0.mItemPadding;
        goto L_0x0328;
    L_0x03ac:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x03ae }
    L_0x03ae:
        r2 = move-exception;
        throw r2;
    L_0x03b0:
        r0 = r21;
        r2 = r0.mItemPadding;
        goto L_0x036e;
    L_0x03b5:
        r0 = r21;
        r3 = r0.mDisplayOptions;	 Catch:{ IllegalStateException -> 0x03ca }
        r3 = r3 & 16;
        if (r3 == 0) goto L_0x0401;
    L_0x03bd:
        r0 = r21;
        r3 = r0.mCustomNavView;	 Catch:{ IllegalStateException -> 0x03ca }
        if (r3 == 0) goto L_0x0401;
    L_0x03c3:
        r0 = r21;
        r2 = r0.mCustomNavView;
        r13 = r2;
        goto L_0x01cb;
    L_0x03ca:
        r2 = move-exception;
        throw r2;
    L_0x03cc:
        r2 = move-exception;
        throw r2;
    L_0x03ce:
        r2 = 0;
        r12 = r2;
        goto L_0x01e0;
    L_0x03d2:
        r2 = move-exception;
        throw r2;
    L_0x03d4:
        r9 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        goto L_0x01ff;
    L_0x03d8:
        r2 = move-exception;
        throw r2;
    L_0x03da:
        r9 = r10;
        goto L_0x020c;
    L_0x03dd:
        r2 = move-exception;
        throw r2;
    L_0x03df:
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        goto L_0x021b;
    L_0x03e3:
        r2 = move-exception;
        throw r2;
    L_0x03e5:
        r9 = r7;
        goto L_0x0226;
    L_0x03e8:
        r2 = move-exception;
        throw r2;
    L_0x03ea:
        r9 = 19;
        goto L_0x022f;
    L_0x03ee:
        r2 = move-exception;
        throw r2;
    L_0x03f0:
        r2 = move-exception;
        throw r2;
    L_0x03f2:
        r2 = move-exception;
        throw r2;
    L_0x03f4:
        r2 = move-exception;
        throw r2;
    L_0x03f6:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x02f1 }
    L_0x03f8:
        r5 = r3;
        goto L_0x0286;
    L_0x03fb:
        r3 = r10;
        goto L_0x023f;
    L_0x03fe:
        r11 = r9;
        goto L_0x0200;
    L_0x0401:
        r13 = r2;
        goto L_0x01cb;
    L_0x0404:
        r6 = r2;
        r7 = r3;
        goto L_0x01bf;
    L_0x0408:
        r14 = r2;
        goto L_0x0194;
    L_0x040b:
        r2 = r5;
        goto L_0x0168;
    L_0x040e:
        r3 = r5;
        goto L_0x013d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarView.onMeasure(int, int):void");
    }

    static IcsSpinner access$1000(ActionBarView actionBarView) {
        return actionBarView.mSpinner;
    }

    public void setContextView(ActionBarContextView actionBarContextView) {
        this.mContextView = actionBarContextView;
    }

    public int getNavigationMode() {
        return this.mNavigationMode;
    }

    static int access$1200(ActionBarView actionBarView) {
        return actionBarView.mDisplayOptions;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
        r18_this = this;
        r17 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r1 = r23 - r21;
        r2 = r18.getPaddingTop();
        r1 = r1 - r2;
        r2 = r18.getPaddingBottom();
        r5 = r1 - r2;
        if (r5 > 0) goto L_0x0012;
    L_0x0011:
        return;
    L_0x0012:
        r6 = isLayoutRtl();
        if (r6 == 0) goto L_0x01ad;
    L_0x0018:
        r1 = 1;
        r13 = r1;
    L_0x001a:
        if (r6 == 0) goto L_0x01b3;
    L_0x001c:
        r9 = r18.getPaddingLeft();	 Catch:{ IllegalStateException -> 0x01b1 }
    L_0x0020:
        if (r6 == 0) goto L_0x01bf;
    L_0x0022:
        r1 = r22 - r20;
        r2 = r18.getPaddingRight();	 Catch:{ IllegalStateException -> 0x01bd }
        r1 = r1 - r2;
        r7 = r1;
    L_0x002a:
        r4 = r18.getPaddingTop();
        r0 = r18;
        r1 = r0.mExpandedActionView;	 Catch:{ IllegalStateException -> 0x01c6 }
        if (r1 == 0) goto L_0x01c8;
    L_0x0034:
        r0 = r18;
        r2 = r0.mExpandedHomeLayout;	 Catch:{ IllegalStateException -> 0x01c6 }
    L_0x0038:
        r8 = 0;
        r1 = 0;
        r3 = r2.getVisibility();
        r10 = 8;
        if (r3 == r10) goto L_0x02f5;
    L_0x0042:
        r10 = r2.getLeftOffset();
        r3 = next(r7, r10, r6);
        r1 = r18;
        r1 = r1.positionChild(r2, r3, r4, r5, r6);
        r1 = r1 + r7;
        r1 = next(r1, r10, r6);
        r16 = r1;
        r3 = r1;
    L_0x0058:
        r0 = r18;
        r1 = r0.mExpandedActionView;	 Catch:{ IllegalStateException -> 0x01ce }
        if (r1 != 0) goto L_0x008e;
    L_0x005e:
        r0 = r18;
        r1 = r0.mTitleLayout;	 Catch:{ IllegalStateException -> 0x01d0 }
        if (r1 == 0) goto L_0x01d6;
    L_0x0064:
        r0 = r18;
        r1 = r0.mTitleLayout;	 Catch:{ IllegalStateException -> 0x01d2 }
        r1 = r1.getVisibility();	 Catch:{ IllegalStateException -> 0x01d2 }
        r2 = 8;
        if (r1 == r2) goto L_0x01d6;
    L_0x0070:
        r0 = r18;
        r1 = r0.mDisplayOptions;	 Catch:{ IllegalStateException -> 0x01d4 }
        r1 = r1 & 8;
        if (r1 == 0) goto L_0x01d6;
    L_0x0078:
        r1 = 1;
        r10 = r1;
    L_0x007a:
        if (r10 == 0) goto L_0x0087;
    L_0x007c:
        r0 = r18;
        r2 = r0.mTitleLayout;
        r1 = r18;
        r1 = r1.positionChild(r2, r3, r4, r5, r6);
        r3 = r3 + r1;
    L_0x0087:
        r0 = r18;
        r1 = r0.mNavigationMode;	 Catch:{ IllegalStateException -> 0x023f }
        switch(r1) {
            case 0: goto L_0x01da;
            case 1: goto L_0x01dc;
            case 2: goto L_0x02f2;
            default: goto L_0x008e;
        };
    L_0x008e:
        r15 = r8;
        r14 = r3;
    L_0x0090:
        r0 = r18;
        r1 = r0.mMenuView;	 Catch:{ IllegalStateException -> 0x0247 }
        if (r1 == 0) goto L_0x00ba;
    L_0x0096:
        r0 = r18;
        r1 = r0.mMenuView;	 Catch:{ IllegalStateException -> 0x0249 }
        r1 = r1.getParent();	 Catch:{ IllegalStateException -> 0x0249 }
        r0 = r18;
        if (r1 != r0) goto L_0x00ba;
    L_0x00a2:
        r0 = r18;
        r8 = r0.mMenuView;	 Catch:{ IllegalStateException -> 0x024b }
        if (r6 != 0) goto L_0x024d;
    L_0x00a8:
        r12 = 1;
    L_0x00a9:
        r7 = r18;
        r10 = r4;
        r11 = r5;
        r7.positionChild(r8, r9, r10, r11, r12);
        r0 = r18;
        r1 = r0.mMenuView;
        r1 = r1.getMeasuredWidth();
        r1 = r1 * r13;
        r9 = r9 + r1;
    L_0x00ba:
        r0 = r18;
        r1 = r0.mIndeterminateProgressView;	 Catch:{ IllegalStateException -> 0x0250 }
        if (r1 == 0) goto L_0x00e4;
    L_0x00c0:
        r0 = r18;
        r1 = r0.mIndeterminateProgressView;	 Catch:{ IllegalStateException -> 0x0252 }
        r1 = r1.getVisibility();	 Catch:{ IllegalStateException -> 0x0252 }
        r2 = 8;
        if (r1 == r2) goto L_0x00e4;
    L_0x00cc:
        r0 = r18;
        r8 = r0.mIndeterminateProgressView;	 Catch:{ IllegalStateException -> 0x0254 }
        if (r6 != 0) goto L_0x0256;
    L_0x00d2:
        r12 = 1;
    L_0x00d3:
        r7 = r18;
        r10 = r4;
        r11 = r5;
        r7.positionChild(r8, r9, r10, r11, r12);
        r0 = r18;
        r1 = r0.mIndeterminateProgressView;
        r1 = r1.getMeasuredWidth();
        r1 = r1 * r13;
        r9 = r9 + r1;
    L_0x00e4:
        r1 = 0;
        r0 = r18;
        r2 = r0.mExpandedActionView;
        if (r2 == 0) goto L_0x0259;
    L_0x00eb:
        r0 = r18;
        r1 = r0.mExpandedActionView;
        r10 = r1;
    L_0x00f0:
        if (r10 == 0) goto L_0x017b;
    L_0x00f2:
        r1 = r10.getLayoutParams();
        r2 = r1 instanceof com.actionbarsherlock.app.ActionBar.LayoutParams;	 Catch:{ IllegalStateException -> 0x0270 }
        if (r2 == 0) goto L_0x0272;
    L_0x00fa:
        r1 = (com.actionbarsherlock.app.ActionBar.LayoutParams) r1;	 Catch:{ IllegalStateException -> 0x0270 }
    L_0x00fc:
        if (r1 == 0) goto L_0x0277;
    L_0x00fe:
        r2 = r1.gravity;	 Catch:{ IllegalStateException -> 0x0275 }
    L_0x0100:
        r11 = r10.getMeasuredWidth();
        r4 = 0;
        r3 = 0;
        if (r1 == 0) goto L_0x02e1;
    L_0x0108:
        if (r6 == 0) goto L_0x027d;
    L_0x010a:
        r3 = r1.rightMargin;	 Catch:{ IllegalStateException -> 0x027b }
    L_0x010c:
        r4 = next(r14, r3, r6);
        if (r6 == 0) goto L_0x0283;
    L_0x0112:
        r3 = r1.leftMargin;	 Catch:{ IllegalStateException -> 0x0281 }
    L_0x0114:
        r3 = r3 * r13;
        r9 = r9 + r3;
        r3 = r1.topMargin;
        r1 = r1.bottomMargin;
        r7 = r1;
        r8 = r3;
        r3 = r9;
    L_0x011d:
        r1 = 8388615; // 0x800007 float:1.1754953E-38 double:4.1445265E-317;
        r1 = r1 & r2;
        r5 = 1;
        if (r1 != r5) goto L_0x014a;
    L_0x0124:
        r5 = r18.getRight();
        r9 = r18.getLeft();
        r5 = r5 - r9;
        r5 = r5 - r11;
        r5 = r5 / 2;
        if (r6 == 0) goto L_0x013e;
    L_0x0132:
        r9 = r5 + r11;
        if (r9 <= r4) goto L_0x0139;
    L_0x0136:
        r1 = 5;
        if (r17 == 0) goto L_0x013c;
    L_0x0139:
        if (r5 >= r3) goto L_0x013c;
    L_0x013b:
        r1 = 3;
    L_0x013c:
        if (r17 == 0) goto L_0x0148;
    L_0x013e:
        r9 = r5 + r11;
        if (r5 >= r4) goto L_0x0145;
    L_0x0142:
        r1 = 3;
        if (r17 == 0) goto L_0x0148;
    L_0x0145:
        if (r9 <= r3) goto L_0x0148;
    L_0x0147:
        r1 = 5;
    L_0x0148:
        if (r17 == 0) goto L_0x02de;
    L_0x014a:
        if (r2 != 0) goto L_0x02de;
    L_0x014c:
        r1 = 8388611; // 0x800003 float:1.1754948E-38 double:4.1445245E-317;
        r5 = r1;
    L_0x0150:
        r1 = 0;
        switch(r5) {
            case 1: goto L_0x0287;
            case 2: goto L_0x0154;
            case 3: goto L_0x0295;
            case 4: goto L_0x0154;
            case 5: goto L_0x029a;
            default: goto L_0x0154;
        };
    L_0x0154:
        r3 = r1;
    L_0x0155:
        r1 = r2 & 112;
        if (r2 != 0) goto L_0x02db;
    L_0x0159:
        r1 = 16;
        r2 = r1;
    L_0x015c:
        r1 = 0;
        switch(r2) {
            case 16: goto L_0x02a6;
            case 48: goto L_0x02c3;
            case 80: goto L_0x02ca;
            default: goto L_0x0160;
        };
    L_0x0160:
        r2 = r10.getMeasuredWidth();
        r5 = r3 + r2;
        r7 = r10.getMeasuredHeight();
        r7 = r7 + r1;
        r10.layout(r3, r1, r5, r7);
        r1 = r3 - r16;
        r3 = 0;
        r1 = java.lang.Math.max(r1, r3);
        java.lang.Math.min(r15, r1);
        next(r4, r2, r6);
    L_0x017b:
        r0 = r18;
        r1 = r0.mProgressView;
        if (r1 == 0) goto L_0x0011;
    L_0x0181:
        r0 = r18;
        r1 = r0.mProgressView;
        r1.bringToFront();
        r0 = r18;
        r1 = r0.mProgressView;
        r1 = r1.getMeasuredHeight();
        r1 = r1 / 2;
        r0 = r18;
        r2 = r0.mProgressView;
        r0 = r18;
        r3 = r0.mProgressBarPadding;
        r4 = -r1;
        r0 = r18;
        r5 = r0.mProgressBarPadding;
        r0 = r18;
        r6 = r0.mProgressView;
        r6 = r6.getMeasuredWidth();
        r5 = r5 + r6;
        r2.layout(r3, r4, r5, r1);
        goto L_0x0011;
    L_0x01ad:
        r1 = -1;
        r13 = r1;
        goto L_0x001a;
    L_0x01b1:
        r1 = move-exception;
        throw r1;
    L_0x01b3:
        r1 = r22 - r20;
        r2 = r18.getPaddingRight();
        r9 = r1 - r2;
        goto L_0x0020;
    L_0x01bd:
        r1 = move-exception;
        throw r1;
    L_0x01bf:
        r1 = r18.getPaddingLeft();
        r7 = r1;
        goto L_0x002a;
    L_0x01c6:
        r1 = move-exception;
        throw r1;
    L_0x01c8:
        r0 = r18;
        r2 = r0.mHomeLayout;
        goto L_0x0038;
    L_0x01ce:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x01d0 }
    L_0x01d0:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x01d2 }
    L_0x01d2:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x01d4 }
    L_0x01d4:
        r1 = move-exception;
        throw r1;
    L_0x01d6:
        r1 = 0;
        r10 = r1;
        goto L_0x007a;
    L_0x01da:
        if (r17 == 0) goto L_0x008e;
    L_0x01dc:
        r0 = r18;
        r1 = r0.mListNavLayout;	 Catch:{ IllegalStateException -> 0x0243 }
        if (r1 == 0) goto L_0x008e;
    L_0x01e2:
        if (r10 == 0) goto L_0x01ec;
    L_0x01e4:
        r0 = r18;
        r1 = r0.mItemPadding;
        r3 = next(r3, r1, r6);
    L_0x01ec:
        r1 = r3 - r16;
        r2 = 0;
        r1 = java.lang.Math.max(r1, r2);
        r7 = java.lang.Math.min(r8, r1);
        r0 = r18;
        r2 = r0.mListNavLayout;
        r1 = r18;
        r1 = r1.positionChild(r2, r3, r4, r5, r6);
        r1 = r1 + r3;
        r0 = r18;
        r2 = r0.mItemPadding;
        r3 = next(r1, r2, r6);
        if (r17 == 0) goto L_0x02ee;
    L_0x020c:
        r1 = r7;
    L_0x020d:
        r0 = r18;
        r2 = r0.mTabScrollView;	 Catch:{ IllegalStateException -> 0x0245 }
        if (r2 == 0) goto L_0x02ea;
    L_0x0213:
        if (r10 == 0) goto L_0x021d;
    L_0x0215:
        r0 = r18;
        r2 = r0.mItemPadding;
        r3 = next(r3, r2, r6);
    L_0x021d:
        r2 = r3 - r16;
        r7 = 0;
        r2 = java.lang.Math.max(r2, r7);
        r7 = java.lang.Math.min(r1, r2);
        r0 = r18;
        r2 = r0.mTabScrollView;
        r1 = r18;
        r1 = r1.positionChild(r2, r3, r4, r5, r6);
        r1 = r1 + r3;
        r0 = r18;
        r2 = r0.mItemPadding;
        r3 = next(r1, r2, r6);
        r15 = r7;
        r14 = r3;
        goto L_0x0090;
    L_0x023f:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x0241 }
    L_0x0241:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x0243 }
    L_0x0243:
        r1 = move-exception;
        throw r1;
    L_0x0245:
        r1 = move-exception;
        throw r1;
    L_0x0247:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x0249 }
    L_0x0249:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x024b }
    L_0x024b:
        r1 = move-exception;
        throw r1;
    L_0x024d:
        r12 = 0;
        goto L_0x00a9;
    L_0x0250:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x0252 }
    L_0x0252:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x0254 }
    L_0x0254:
        r1 = move-exception;
        throw r1;
    L_0x0256:
        r12 = 0;
        goto L_0x00d3;
    L_0x0259:
        r0 = r18;
        r2 = r0.mDisplayOptions;	 Catch:{ IllegalStateException -> 0x026e }
        r2 = r2 & 16;
        if (r2 == 0) goto L_0x02e7;
    L_0x0261:
        r0 = r18;
        r2 = r0.mCustomNavView;	 Catch:{ IllegalStateException -> 0x026e }
        if (r2 == 0) goto L_0x02e7;
    L_0x0267:
        r0 = r18;
        r1 = r0.mCustomNavView;
        r10 = r1;
        goto L_0x00f0;
    L_0x026e:
        r1 = move-exception;
        throw r1;
    L_0x0270:
        r1 = move-exception;
        throw r1;
    L_0x0272:
        r1 = 0;
        goto L_0x00fc;
    L_0x0275:
        r1 = move-exception;
        throw r1;
    L_0x0277:
        r2 = 19;
        goto L_0x0100;
    L_0x027b:
        r1 = move-exception;
        throw r1;
    L_0x027d:
        r3 = r1.leftMargin;
        goto L_0x010c;
    L_0x0281:
        r1 = move-exception;
        throw r1;
    L_0x0283:
        r3 = r1.rightMargin;
        goto L_0x0114;
    L_0x0287:
        r1 = r18.getRight();
        r5 = r18.getLeft();
        r1 = r1 - r5;
        r1 = r1 - r11;
        r1 = r1 / 2;
        if (r17 == 0) goto L_0x0154;
    L_0x0295:
        if (r6 == 0) goto L_0x02a1;
    L_0x0297:
        r1 = r3;
    L_0x0298:
        if (r17 == 0) goto L_0x0154;
    L_0x029a:
        if (r6 == 0) goto L_0x02a3;
    L_0x029c:
        r1 = r4 - r11;
    L_0x029e:
        r3 = r1;
        goto L_0x0155;
    L_0x02a1:
        r1 = r4;
        goto L_0x0298;
    L_0x02a3:
        r1 = r3 - r11;
        goto L_0x029e;
    L_0x02a6:
        r1 = r18.getPaddingTop();
        r2 = r18.getBottom();
        r5 = r18.getTop();
        r2 = r2 - r5;
        r5 = r18.getPaddingBottom();
        r2 = r2 - r5;
        r1 = r2 - r1;
        r2 = r10.getMeasuredHeight();
        r1 = r1 - r2;
        r1 = r1 / 2;
        if (r17 == 0) goto L_0x0160;
    L_0x02c3:
        r1 = r18.getPaddingTop();
        r1 = r1 + r8;
        if (r17 == 0) goto L_0x0160;
    L_0x02ca:
        r1 = r18.getHeight();
        r2 = r18.getPaddingBottom();
        r1 = r1 - r2;
        r2 = r10.getMeasuredHeight();
        r1 = r1 - r2;
        r1 = r1 - r7;
        goto L_0x0160;
    L_0x02db:
        r2 = r1;
        goto L_0x015c;
    L_0x02de:
        r5 = r1;
        goto L_0x0150;
    L_0x02e1:
        r7 = r3;
        r8 = r4;
        r4 = r14;
        r3 = r9;
        goto L_0x011d;
    L_0x02e7:
        r10 = r1;
        goto L_0x00f0;
    L_0x02ea:
        r15 = r1;
        r14 = r3;
        goto L_0x0090;
    L_0x02ee:
        r15 = r7;
        r14 = r3;
        goto L_0x0090;
    L_0x02f2:
        r1 = r8;
        goto L_0x020d;
    L_0x02f5:
        r16 = r1;
        r3 = r7;
        goto L_0x0058;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarView.onLayout(boolean, int, int, int, int):void");
    }

    static int access$1400(ActionBarView actionBarView) {
        return actionBarView.mNavigationMode;
    }

    public void setCustomNavigationView(View view) {
        try {
            Object obj = (this.mDisplayOptions & 16) != 0 ? 1 : null;
            try {
                if (!(this.mCustomNavView == null || obj == null)) {
                    removeView(this.mCustomNavView);
                }
                try {
                    this.mCustomNavView = view;
                    if (this.mCustomNavView != null && obj != null) {
                        addView(this.mCustomNavView);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            } catch (IllegalStateException e222) {
                throw e222;
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    static Drawable access$500(ActionBarView actionBarView) {
        return actionBarView.mIcon;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean isCollapsed() {
        return this.mIsCollapsed;
    }

    public void setWindowCallback(Callback callback) {
        this.mWindowCallback = callback;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSplitActionBar(boolean r3) {
        /*
        r2_this = this;
        r0 = r2.mSplitActionBar;	 Catch:{ IllegalStateException -> 0x003d }
        if (r0 == r3) goto L_0x003c;
    L_0x0004:
        r0 = r2.mMenuView;	 Catch:{ IllegalStateException -> 0x003d }
        if (r0 == 0) goto L_0x002d;
    L_0x0008:
        r0 = r2.mMenuView;
        r0 = r0.getParent();
        r0 = (android.view.ViewGroup) r0;
        if (r0 == 0) goto L_0x0017;
    L_0x0012:
        r1 = r2.mMenuView;	 Catch:{ IllegalStateException -> 0x003f }
        r0.removeView(r1);	 Catch:{ IllegalStateException -> 0x003f }
    L_0x0017:
        if (r3 == 0) goto L_0x0028;
    L_0x0019:
        r0 = r2.mSplitView;	 Catch:{ IllegalStateException -> 0x0041 }
        if (r0 == 0) goto L_0x002d;
    L_0x001d:
        r0 = r2.mSplitView;	 Catch:{ IllegalStateException -> 0x0043 }
        r1 = r2.mMenuView;	 Catch:{ IllegalStateException -> 0x0043 }
        r0.addView(r1);	 Catch:{ IllegalStateException -> 0x0043 }
        r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;	 Catch:{ IllegalStateException -> 0x0043 }
        if (r0 == 0) goto L_0x002d;
    L_0x0028:
        r0 = r2.mMenuView;	 Catch:{ IllegalStateException -> 0x0043 }
        r2.addView(r0);	 Catch:{ IllegalStateException -> 0x0043 }
    L_0x002d:
        r0 = r2.mSplitView;	 Catch:{ IllegalStateException -> 0x0045 }
        if (r0 == 0) goto L_0x0039;
    L_0x0031:
        r1 = r2.mSplitView;	 Catch:{ IllegalStateException -> 0x0047 }
        if (r3 == 0) goto L_0x0049;
    L_0x0035:
        r0 = 0;
    L_0x0036:
        r1.setVisibility(r0);
    L_0x0039:
        super.setSplitActionBar(r3);
    L_0x003c:
        return;
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r0 = move-exception;
        throw r0;
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        r0 = 8;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarView.setSplitActionBar(boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initTitle() {
        /*
        r6_this = this;
        r4 = 8;
        r1 = 1;
        r2 = 0;
        r0 = r6.mTitleLayout;
        if (r0 != 0) goto L_0x00a8;
    L_0x0008:
        r0 = r6.getContext();
        r0 = android.view.LayoutInflater.from(r0);
        r3 = com.actionbarsherlock.R.layout.abs__action_bar_title_item;	 Catch:{ IllegalStateException -> 0x00c9 }
        r5 = 0;
        r0 = r0.inflate(r3, r6, r5);	 Catch:{ IllegalStateException -> 0x00c9 }
        r0 = (android.widget.LinearLayout) r0;	 Catch:{ IllegalStateException -> 0x00c9 }
        r6.mTitleLayout = r0;	 Catch:{ IllegalStateException -> 0x00c9 }
        r0 = r6.mTitleLayout;	 Catch:{ IllegalStateException -> 0x00c9 }
        r3 = com.actionbarsherlock.R.id.abs__action_bar_title;	 Catch:{ IllegalStateException -> 0x00c9 }
        r0 = r0.findViewById(r3);	 Catch:{ IllegalStateException -> 0x00c9 }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x00c9 }
        r6.mTitleView = r0;	 Catch:{ IllegalStateException -> 0x00c9 }
        r0 = r6.mTitleLayout;	 Catch:{ IllegalStateException -> 0x00c9 }
        r3 = com.actionbarsherlock.R.id.abs__action_bar_subtitle;	 Catch:{ IllegalStateException -> 0x00c9 }
        r0 = r0.findViewById(r3);	 Catch:{ IllegalStateException -> 0x00c9 }
        r0 = (android.widget.TextView) r0;	 Catch:{ IllegalStateException -> 0x00c9 }
        r6.mSubtitleView = r0;	 Catch:{ IllegalStateException -> 0x00c9 }
        r0 = r6.mTitleLayout;	 Catch:{ IllegalStateException -> 0x00c9 }
        r3 = com.actionbarsherlock.R.id.abs__up;	 Catch:{ IllegalStateException -> 0x00c9 }
        r0 = r0.findViewById(r3);	 Catch:{ IllegalStateException -> 0x00c9 }
        r6.mTitleUpView = r0;	 Catch:{ IllegalStateException -> 0x00c9 }
        r0 = com.actionbarsherlock.ActionBarSherlock.isRtl;	 Catch:{ IllegalStateException -> 0x00c9 }
        if (r0 == 0) goto L_0x004a;
    L_0x0041:
        r0 = r6.mTitleUpView;	 Catch:{ IllegalStateException -> 0x00c9 }
        r0 = (android.widget.ImageView) r0;	 Catch:{ IllegalStateException -> 0x00c9 }
        r3 = com.actionbarsherlock.R.drawable.abs__ic_ab_back_rtl_holo_dark;	 Catch:{ IllegalStateException -> 0x00c9 }
        r0.setImageResource(r3);	 Catch:{ IllegalStateException -> 0x00c9 }
    L_0x004a:
        r0 = r6.mTitleLayout;	 Catch:{ IllegalStateException -> 0x00cb }
        r3 = r6.mUpClickListener;	 Catch:{ IllegalStateException -> 0x00cb }
        r0.setOnClickListener(r3);	 Catch:{ IllegalStateException -> 0x00cb }
        r0 = r6.mTitleStyleRes;	 Catch:{ IllegalStateException -> 0x00cb }
        if (r0 == 0) goto L_0x005e;
    L_0x0055:
        r0 = r6.mTitleView;	 Catch:{ IllegalStateException -> 0x00cb }
        r3 = r6.mContext;	 Catch:{ IllegalStateException -> 0x00cb }
        r5 = r6.mTitleStyleRes;	 Catch:{ IllegalStateException -> 0x00cb }
        r0.setTextAppearance(r3, r5);	 Catch:{ IllegalStateException -> 0x00cb }
    L_0x005e:
        r0 = r6.mTitle;	 Catch:{ IllegalStateException -> 0x00cd }
        if (r0 == 0) goto L_0x0069;
    L_0x0062:
        r0 = r6.mTitleView;	 Catch:{ IllegalStateException -> 0x00cd }
        r3 = r6.mTitle;	 Catch:{ IllegalStateException -> 0x00cd }
        r0.setText(r3);	 Catch:{ IllegalStateException -> 0x00cd }
    L_0x0069:
        r0 = r6.mSubtitleStyleRes;	 Catch:{ IllegalStateException -> 0x00cf }
        if (r0 == 0) goto L_0x0076;
    L_0x006d:
        r0 = r6.mSubtitleView;	 Catch:{ IllegalStateException -> 0x00cf }
        r3 = r6.mContext;	 Catch:{ IllegalStateException -> 0x00cf }
        r5 = r6.mSubtitleStyleRes;	 Catch:{ IllegalStateException -> 0x00cf }
        r0.setTextAppearance(r3, r5);	 Catch:{ IllegalStateException -> 0x00cf }
    L_0x0076:
        r0 = r6.mSubtitle;	 Catch:{ IllegalStateException -> 0x00d1 }
        if (r0 == 0) goto L_0x0087;
    L_0x007a:
        r0 = r6.mSubtitleView;	 Catch:{ IllegalStateException -> 0x00d1 }
        r3 = r6.mSubtitle;	 Catch:{ IllegalStateException -> 0x00d1 }
        r0.setText(r3);	 Catch:{ IllegalStateException -> 0x00d1 }
        r0 = r6.mSubtitleView;	 Catch:{ IllegalStateException -> 0x00d1 }
        r3 = 0;
        r0.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x00d1 }
    L_0x0087:
        r0 = r6.mDisplayOptions;	 Catch:{ IllegalStateException -> 0x00d3 }
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x00d5;
    L_0x008d:
        r0 = r1;
    L_0x008e:
        r3 = r6.mDisplayOptions;	 Catch:{ IllegalStateException -> 0x00d7 }
        r3 = r3 & 2;
        if (r3 == 0) goto L_0x00d9;
    L_0x0094:
        r3 = r1;
    L_0x0095:
        r5 = r6.mTitleUpView;	 Catch:{ IllegalStateException -> 0x00db }
        if (r3 != 0) goto L_0x009c;
    L_0x0099:
        if (r0 == 0) goto L_0x00df;
    L_0x009b:
        r4 = r2;
    L_0x009c:
        r5.setVisibility(r4);	 Catch:{ IllegalStateException -> 0x00e1 }
        r4 = r6.mTitleLayout;	 Catch:{ IllegalStateException -> 0x00e1 }
        if (r0 == 0) goto L_0x00e5;
    L_0x00a3:
        if (r3 != 0) goto L_0x00e5;
    L_0x00a5:
        r4.setEnabled(r1);
    L_0x00a8:
        r0 = r6.mTitleLayout;	 Catch:{ IllegalStateException -> 0x00e7 }
        r6.addView(r0);	 Catch:{ IllegalStateException -> 0x00e7 }
        r0 = r6.mExpandedActionView;	 Catch:{ IllegalStateException -> 0x00e7 }
        if (r0 != 0) goto L_0x00c1;
    L_0x00b1:
        r0 = r6.mTitle;	 Catch:{ IllegalStateException -> 0x00e9 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalStateException -> 0x00e9 }
        if (r0 == 0) goto L_0x00c8;
    L_0x00b9:
        r0 = r6.mSubtitle;	 Catch:{ IllegalStateException -> 0x00eb }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalStateException -> 0x00eb }
        if (r0 == 0) goto L_0x00c8;
    L_0x00c1:
        r0 = r6.mTitleLayout;	 Catch:{ IllegalStateException -> 0x00eb }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x00eb }
    L_0x00c8:
        return;
    L_0x00c9:
        r0 = move-exception;
        throw r0;
    L_0x00cb:
        r0 = move-exception;
        throw r0;
    L_0x00cd:
        r0 = move-exception;
        throw r0;
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r0 = move-exception;
        throw r0;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r0 = r2;
        goto L_0x008e;
    L_0x00d7:
        r0 = move-exception;
        throw r0;
    L_0x00d9:
        r3 = r2;
        goto L_0x0095;
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00dd }
    L_0x00dd:
        r0 = move-exception;
        throw r0;
    L_0x00df:
        r4 = 4;
        goto L_0x009c;
    L_0x00e1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00e3 }
    L_0x00e3:
        r0 = move-exception;
        throw r0;
    L_0x00e5:
        r1 = r2;
        goto L_0x00a5;
    L_0x00e7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00e9 }
    L_0x00e9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00eb }
    L_0x00eb:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarView.initTitle():void");
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    private static int loadLogoFromManifest(android.app.Activity r13) {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:72)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIncludingExcHandlers(DepthRegionTraversal.java:36)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:53)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r6 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r1 = 0;
        r0 = r13.getClass();	 Catch:{ Exception -> 0x00d6 }
        r7 = r0.getName();	 Catch:{ Exception -> 0x00d6 }
        r0 = r13.getApplicationInfo();	 Catch:{ Exception -> 0x00d6 }
        r8 = r0.packageName;	 Catch:{ Exception -> 0x00d6 }
        r0 = 0;	 Catch:{ Exception -> 0x00d6 }
        r0 = r13.createPackageContext(r8, r0);	 Catch:{ Exception -> 0x00d6 }
        r0 = r0.getAssets();	 Catch:{ Exception -> 0x00d6 }
        r2 = z;	 Catch:{ Exception -> 0x00d6 }
        r3 = 7;	 Catch:{ Exception -> 0x00d6 }
        r2 = r2[r3];	 Catch:{ Exception -> 0x00d6 }
        r9 = r0.openXmlResourceParser(r2);	 Catch:{ Exception -> 0x00d6 }
        r0 = r9.getEventType();	 Catch:{ Exception -> 0x00d6 }
        r12 = r0;
        r0 = r1;
        r1 = r12;
    L_0x002a:
        r2 = 1;
        if (r1 == r2) goto L_0x00d3;
    L_0x002d:
        r2 = 2;
        if (r1 != r2) goto L_0x00cd;
    L_0x0030:
        r3 = r9.getName();	 Catch:{ Exception -> 0x00e2 }
        r1 = z;	 Catch:{ Exception -> 0x00e2 }
        r2 = 9;	 Catch:{ Exception -> 0x00e2 }
        r1 = r1[r2];	 Catch:{ Exception -> 0x00e2 }
        r1 = r1.equals(r3);	 Catch:{ Exception -> 0x00e2 }
        if (r1 == 0) goto L_0x0066;	 Catch:{ Exception -> 0x00e2 }
    L_0x0040:
        r1 = r9.getAttributeCount();	 Catch:{ Exception -> 0x00e2 }
        r1 = r1 + -1;
        r2 = r1;
        r1 = r0;
    L_0x0048:
        if (r2 < 0) goto L_0x00f2;
    L_0x004a:
        r0 = z;	 Catch:{ Exception -> 0x00d6 }
        r4 = 4;	 Catch:{ Exception -> 0x00d6 }
        r0 = r0[r4];	 Catch:{ Exception -> 0x00d6 }
        r4 = r9.getAttributeName(r2);	 Catch:{ Exception -> 0x00d6 }
        r0 = r0.equals(r4);	 Catch:{ Exception -> 0x00d6 }
        if (r0 == 0) goto L_0x00ef;	 Catch:{ Exception -> 0x00d6 }
    L_0x0059:
        r0 = 0;	 Catch:{ Exception -> 0x00d6 }
        r0 = r9.getAttributeResourceValue(r2, r0);	 Catch:{ Exception -> 0x00d6 }
        if (r6 == 0) goto L_0x0064;
    L_0x0060:
        r1 = r2 + -1;
        if (r6 == 0) goto L_0x00eb;
    L_0x0064:
        if (r6 == 0) goto L_0x00cd;
    L_0x0066:
        r1 = r0;
        r0 = z;	 Catch:{ Exception -> 0x00d4 }
        r2 = 5;	 Catch:{ Exception -> 0x00d4 }
        r0 = r0[r2];	 Catch:{ Exception -> 0x00d4 }
        r0 = r0.equals(r3);	 Catch:{ Exception -> 0x00d4 }
        if (r0 == 0) goto L_0x00e9;
    L_0x0072:
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r0 = r9.getAttributeCount();	 Catch:{ Exception -> 0x00d6 }
        r0 = r0 + -1;	 Catch:{ Exception -> 0x00d6 }
        r12 = r0;	 Catch:{ Exception -> 0x00d6 }
        r0 = r2;	 Catch:{ Exception -> 0x00d6 }
        r2 = r4;	 Catch:{ Exception -> 0x00d6 }
        r4 = r3;	 Catch:{ Exception -> 0x00d6 }
        r3 = r12;	 Catch:{ Exception -> 0x00d6 }
    L_0x0080:
        if (r3 < 0) goto L_0x00c6;	 Catch:{ Exception -> 0x00d6 }
    L_0x0082:
        r5 = r9.getAttributeName(r3);	 Catch:{ Exception -> 0x00d6 }
        r10 = z;	 Catch:{ Exception -> 0x00d6 }
        r11 = 6;	 Catch:{ Exception -> 0x00d6 }
        r10 = r10[r11];	 Catch:{ Exception -> 0x00d6 }
        r10 = r10.equals(r5);	 Catch:{ Exception -> 0x00d6 }
        if (r10 == 0) goto L_0x009c;	 Catch:{ Exception -> 0x00d6 }
    L_0x0091:
        r2 = 0;	 Catch:{ Exception -> 0x00d6 }
        r2 = r9.getAttributeResourceValue(r3, r2);	 Catch:{ Exception -> 0x00d6 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x00d6 }
        if (r6 == 0) goto L_0x00e4;
    L_0x009c:
        r10 = z;	 Catch:{ Exception -> 0x00de }
        r11 = 8;	 Catch:{ Exception -> 0x00de }
        r10 = r10[r11];	 Catch:{ Exception -> 0x00de }
        r5 = r10.equals(r5);	 Catch:{ Exception -> 0x00de }
        if (r5 == 0) goto L_0x00e4;
    L_0x00a8:
        r4 = r9.getAttributeValue(r3);	 Catch:{ Exception -> 0x00d6 }
        r4 = com.actionbarsherlock.internal.ActionBarSherlockCompat.cleanActivityName(r8, r4);	 Catch:{ Exception -> 0x00d6 }
        r5 = r7.equals(r4);	 Catch:{ Exception -> 0x00e0 }
        if (r5 != 0) goto L_0x00b8;
    L_0x00b6:
        if (r6 == 0) goto L_0x00c6;
    L_0x00b8:
        r0 = 1;
        r5 = r2;
    L_0x00ba:
        if (r5 == 0) goto L_0x00c2;
    L_0x00bc:
        if (r4 == 0) goto L_0x00c2;
    L_0x00be:
        r1 = r5.intValue();	 Catch:{ Exception -> 0x00d6 }
    L_0x00c2:
        r2 = r3 + -1;
        if (r6 == 0) goto L_0x00e6;
    L_0x00c6:
        r12 = r0;
        r0 = r1;
        r1 = r12;
        if (r1 == 0) goto L_0x00cd;
    L_0x00cb:
        if (r6 == 0) goto L_0x00d3;
    L_0x00cd:
        r1 = r9.nextToken();	 Catch:{ Exception -> 0x00e2 }
        if (r6 == 0) goto L_0x002a;
    L_0x00d3:
        return r0;
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00d6 }
    L_0x00d6:
        r0 = move-exception;
        r12 = r0;
        r0 = r1;
        r1 = r12;
    L_0x00da:
        r1.printStackTrace();
        goto L_0x00d3;
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00d6 }
    L_0x00e0:
        r0 = move-exception;	 Catch:{ Exception -> 0x00d6 }
        throw r0;	 Catch:{ Exception -> 0x00d6 }
    L_0x00e2:
        r1 = move-exception;
        goto L_0x00da;
    L_0x00e4:
        r5 = r2;
        goto L_0x00ba;
    L_0x00e6:
        r3 = r2;
        r2 = r5;
        goto L_0x0080;
    L_0x00e9:
        r0 = r1;
        goto L_0x00cd;
    L_0x00eb:
        r2 = r1;
        r1 = r0;
        goto L_0x0048;
    L_0x00ef:
        r0 = r1;
        goto L_0x0060;
    L_0x00f2:
        r0 = r1;
        goto L_0x0064;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarView.loadLogoFromManifest(android.app.Activity):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setIcon(android.graphics.drawable.Drawable r2) {
        /*
        r1_this = this;
        r1.mIcon = r2;	 Catch:{ IllegalStateException -> 0x0014 }
        if (r2 == 0) goto L_0x0013;
    L_0x0004:
        r0 = r1.mDisplayOptions;	 Catch:{ IllegalStateException -> 0x0016 }
        r0 = r0 & 1;
        if (r0 == 0) goto L_0x000e;
    L_0x000a:
        r0 = r1.mLogo;	 Catch:{ IllegalStateException -> 0x0018 }
        if (r0 != 0) goto L_0x0013;
    L_0x000e:
        r0 = r1.mHomeLayout;	 Catch:{ IllegalStateException -> 0x0018 }
        r0.setIcon(r2);	 Catch:{ IllegalStateException -> 0x0018 }
    L_0x0013:
        return;
    L_0x0014:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0016 }
    L_0x0016:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0018 }
    L_0x0018:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarView.setIcon(android.graphics.drawable.Drawable):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDisplayOptions(int r9) {
        /*
        r8_this = this;
        r5 = 8;
        r0 = -1;
        r2 = 1;
        r3 = 0;
        r6 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r1 = r8.mDisplayOptions;	 Catch:{ IllegalStateException -> 0x00d9 }
        if (r1 != r0) goto L_0x00db;
    L_0x000b:
        r8.mDisplayOptions = r9;	 Catch:{ IllegalStateException -> 0x00e0 }
        r1 = r0 & 31;
        if (r1 == 0) goto L_0x009d;
    L_0x0011:
        r1 = r9 & 2;
        if (r1 == 0) goto L_0x00e4;
    L_0x0015:
        r1 = r2;
    L_0x0016:
        if (r1 == 0) goto L_0x00e9;
    L_0x0018:
        r4 = r8.mExpandedActionView;	 Catch:{ IllegalStateException -> 0x00e7 }
        if (r4 != 0) goto L_0x00e9;
    L_0x001c:
        r4 = r3;
    L_0x001d:
        r7 = r8.mHomeLayout;	 Catch:{ IllegalStateException -> 0x00ec }
        r7.setVisibility(r4);	 Catch:{ IllegalStateException -> 0x00ec }
        r4 = r0 & 4;
        if (r4 == 0) goto L_0x0036;
    L_0x0026:
        r4 = r9 & 4;
        if (r4 == 0) goto L_0x00f0;
    L_0x002a:
        r4 = r2;
    L_0x002b:
        r7 = r8.mHomeLayout;	 Catch:{ IllegalStateException -> 0x00f3 }
        r7.setUp(r4);	 Catch:{ IllegalStateException -> 0x00f3 }
        if (r4 == 0) goto L_0x0036;
    L_0x0032:
        r4 = 1;
        r8.setHomeButtonEnabled(r4);	 Catch:{ IllegalStateException -> 0x00f3 }
    L_0x0036:
        r4 = r0 & 1;
        if (r4 == 0) goto L_0x004c;
    L_0x003a:
        r4 = r8.mLogo;	 Catch:{ IllegalStateException -> 0x00f5 }
        if (r4 == 0) goto L_0x00f9;
    L_0x003e:
        r4 = r9 & 1;
        if (r4 == 0) goto L_0x00f9;
    L_0x0042:
        r4 = r2;
    L_0x0043:
        r7 = r8.mHomeLayout;	 Catch:{ IllegalStateException -> 0x00fc }
        if (r4 == 0) goto L_0x00fe;
    L_0x0047:
        r4 = r8.mLogo;	 Catch:{ IllegalStateException -> 0x00fc }
    L_0x0049:
        r7.setIcon(r4);
    L_0x004c:
        r4 = r0 & 8;
        if (r4 == 0) goto L_0x005e;
    L_0x0050:
        r4 = r9 & 8;
        if (r4 == 0) goto L_0x0059;
    L_0x0054:
        r8.initTitle();	 Catch:{ IllegalStateException -> 0x0102 }
        if (r6 == 0) goto L_0x005e;
    L_0x0059:
        r4 = r8.mTitleLayout;	 Catch:{ IllegalStateException -> 0x0102 }
        r8.removeView(r4);	 Catch:{ IllegalStateException -> 0x0102 }
    L_0x005e:
        r4 = r8.mTitleLayout;	 Catch:{ IllegalStateException -> 0x0104 }
        if (r4 == 0) goto L_0x0080;
    L_0x0062:
        r4 = r0 & 6;
        if (r4 == 0) goto L_0x0080;
    L_0x0066:
        r4 = r8.mDisplayOptions;	 Catch:{ IllegalStateException -> 0x0108 }
        r4 = r4 & 4;
        if (r4 == 0) goto L_0x010a;
    L_0x006c:
        r4 = r2;
    L_0x006d:
        r7 = r8.mTitleUpView;	 Catch:{ IllegalStateException -> 0x010d }
        if (r1 != 0) goto L_0x0074;
    L_0x0071:
        if (r4 == 0) goto L_0x0111;
    L_0x0073:
        r5 = r3;
    L_0x0074:
        r7.setVisibility(r5);	 Catch:{ IllegalStateException -> 0x0114 }
        r5 = r8.mTitleLayout;	 Catch:{ IllegalStateException -> 0x0114 }
        if (r1 != 0) goto L_0x0118;
    L_0x007b:
        if (r4 == 0) goto L_0x0118;
    L_0x007d:
        r5.setEnabled(r2);
    L_0x0080:
        r0 = r0 & 16;
        if (r0 == 0) goto L_0x0098;
    L_0x0084:
        r0 = r8.mCustomNavView;	 Catch:{ IllegalStateException -> 0x011b }
        if (r0 == 0) goto L_0x0098;
    L_0x0088:
        r0 = r9 & 16;
        if (r0 == 0) goto L_0x0093;
    L_0x008c:
        r0 = r8.mCustomNavView;	 Catch:{ IllegalStateException -> 0x011f }
        r8.addView(r0);	 Catch:{ IllegalStateException -> 0x011f }
        if (r6 == 0) goto L_0x0098;
    L_0x0093:
        r0 = r8.mCustomNavView;	 Catch:{ IllegalStateException -> 0x011f }
        r8.removeView(r0);	 Catch:{ IllegalStateException -> 0x011f }
    L_0x0098:
        r8.requestLayout();	 Catch:{ IllegalStateException -> 0x0121 }
        if (r6 == 0) goto L_0x00a0;
    L_0x009d:
        r8.invalidate();	 Catch:{ IllegalStateException -> 0x0121 }
    L_0x00a0:
        r0 = r8.mHomeLayout;	 Catch:{ IllegalStateException -> 0x0123 }
        r0 = r0.isEnabled();	 Catch:{ IllegalStateException -> 0x0123 }
        if (r0 != 0) goto L_0x00b0;
    L_0x00a8:
        r0 = r8.mHomeLayout;	 Catch:{ IllegalStateException -> 0x0125 }
        r1 = 0;
        r0.setContentDescription(r1);	 Catch:{ IllegalStateException -> 0x0125 }
        if (r6 == 0) goto L_0x00d8;
    L_0x00b0:
        r0 = r9 & 4;
        if (r0 == 0) goto L_0x00c7;
    L_0x00b4:
        r0 = r8.mHomeLayout;	 Catch:{ IllegalStateException -> 0x0129 }
        r1 = r8.mContext;	 Catch:{ IllegalStateException -> 0x0129 }
        r1 = r1.getResources();	 Catch:{ IllegalStateException -> 0x0129 }
        r2 = com.actionbarsherlock.R.string.abs__action_bar_up_description;	 Catch:{ IllegalStateException -> 0x0129 }
        r1 = r1.getText(r2);	 Catch:{ IllegalStateException -> 0x0129 }
        r0.setContentDescription(r1);	 Catch:{ IllegalStateException -> 0x0129 }
        if (r6 == 0) goto L_0x00d8;
    L_0x00c7:
        r0 = r8.mHomeLayout;	 Catch:{ IllegalStateException -> 0x0129 }
        r1 = r8.mContext;	 Catch:{ IllegalStateException -> 0x0129 }
        r1 = r1.getResources();	 Catch:{ IllegalStateException -> 0x0129 }
        r2 = com.actionbarsherlock.R.string.abs__action_bar_home_description;	 Catch:{ IllegalStateException -> 0x0129 }
        r1 = r1.getText(r2);	 Catch:{ IllegalStateException -> 0x0129 }
        r0.setContentDescription(r1);	 Catch:{ IllegalStateException -> 0x0129 }
    L_0x00d8:
        return;
    L_0x00d9:
        r0 = move-exception;
        throw r0;
    L_0x00db:
        r0 = r8.mDisplayOptions;
        r0 = r0 ^ r9;
        goto L_0x000b;
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;
    L_0x00e4:
        r1 = r3;
        goto L_0x0016;
    L_0x00e7:
        r0 = move-exception;
        throw r0;
    L_0x00e9:
        r4 = r5;
        goto L_0x001d;
    L_0x00ec:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ee }
    L_0x00ee:
        r0 = move-exception;
        throw r0;
    L_0x00f0:
        r4 = r3;
        goto L_0x002b;
    L_0x00f3:
        r0 = move-exception;
        throw r0;
    L_0x00f5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00f7 }
    L_0x00f7:
        r0 = move-exception;
        throw r0;
    L_0x00f9:
        r4 = r3;
        goto L_0x0043;
    L_0x00fc:
        r0 = move-exception;
        throw r0;
    L_0x00fe:
        r4 = r8.mIcon;
        goto L_0x0049;
    L_0x0102:
        r0 = move-exception;
        throw r0;
    L_0x0104:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0106 }
    L_0x0106:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0108 }
    L_0x0108:
        r0 = move-exception;
        throw r0;
    L_0x010a:
        r4 = r3;
        goto L_0x006d;
    L_0x010d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x010f }
    L_0x010f:
        r0 = move-exception;
        throw r0;
    L_0x0111:
        r5 = 4;
        goto L_0x0074;
    L_0x0114:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0116 }
    L_0x0116:
        r0 = move-exception;
        throw r0;
    L_0x0118:
        r2 = r3;
        goto L_0x007d;
    L_0x011b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x011d }
    L_0x011d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x011f }
    L_0x011f:
        r0 = move-exception;
        throw r0;
    L_0x0121:
        r0 = move-exception;
        throw r0;
    L_0x0123:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0125 }
    L_0x0125:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0127 }
    L_0x0127:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0129 }
    L_0x0129:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarView.setDisplayOptions(int):void");
    }

    static OnNavigationListener access$000(ActionBarView actionBarView) {
        return actionBarView.mCallback;
    }

    public void initIndeterminateProgress() {
        this.mIndeterminateProgressView = new IcsProgressBar(this.mContext, null, 0, this.mIndeterminateProgressStyle);
        this.mIndeterminateProgressView.setId(R.id.abs__progress_circular);
        addView(this.mIndeterminateProgressView);
    }

    public boolean isSplitActionBar() {
        return this.mSplitActionBar;
    }

    static ActionMenuItem access$200(ActionBarView actionBarView) {
        return actionBarView.mLogoNavItem;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        try {
            super.onRestoreInstanceState(savedState.getSuperState());
            if (savedState.expandedMenuItemId != 0) {
                if (!(this.mExpandedMenuPresenter == null || this.mOptionsMenu == null)) {
                    MenuItem findItem = this.mOptionsMenu.findItem(savedState.expandedMenuItemId);
                    if (findItem != null) {
                        try {
                            findItem.expandActionView();
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                }
            }
            try {
                if (savedState.isOverflowOpen) {
                    postShowOverflowMenu();
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSubtitle(java.lang.CharSequence r5) {
        /*
        r4_this = this;
        r2 = 8;
        r1 = 0;
        r4.mSubtitle = r5;	 Catch:{ IllegalStateException -> 0x0039 }
        r0 = r4.mSubtitleView;	 Catch:{ IllegalStateException -> 0x0039 }
        if (r0 == 0) goto L_0x0038;
    L_0x0009:
        r0 = r4.mSubtitleView;	 Catch:{ IllegalStateException -> 0x003b }
        r0.setText(r5);	 Catch:{ IllegalStateException -> 0x003b }
        r3 = r4.mSubtitleView;	 Catch:{ IllegalStateException -> 0x003b }
        if (r5 == 0) goto L_0x003d;
    L_0x0012:
        r0 = r1;
    L_0x0013:
        r3.setVisibility(r0);	 Catch:{ IllegalStateException -> 0x003f }
        r0 = r4.mExpandedActionView;	 Catch:{ IllegalStateException -> 0x003f }
        if (r0 != 0) goto L_0x0047;
    L_0x001a:
        r0 = r4.mDisplayOptions;	 Catch:{ IllegalStateException -> 0x0041 }
        r0 = r0 & 8;
        if (r0 == 0) goto L_0x0047;
    L_0x0020:
        r0 = r4.mTitle;	 Catch:{ IllegalStateException -> 0x0043 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalStateException -> 0x0043 }
        if (r0 == 0) goto L_0x0030;
    L_0x0028:
        r0 = r4.mSubtitle;	 Catch:{ IllegalStateException -> 0x0045 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalStateException -> 0x0045 }
        if (r0 != 0) goto L_0x0047;
    L_0x0030:
        r0 = 1;
    L_0x0031:
        r3 = r4.mTitleLayout;	 Catch:{ IllegalStateException -> 0x0049 }
        if (r0 == 0) goto L_0x004b;
    L_0x0035:
        r3.setVisibility(r1);
    L_0x0038:
        return;
    L_0x0039:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x003b }
    L_0x003b:
        r0 = move-exception;
        throw r0;
    L_0x003d:
        r0 = r2;
        goto L_0x0013;
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r0 = r1;
        goto L_0x0031;
    L_0x0049:
        r0 = move-exception;
        throw r0;
    L_0x004b:
        r1 = r2;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarView.setSubtitle(java.lang.CharSequence):void");
    }

    public int getDisplayOptions() {
        return this.mDisplayOptions;
    }

    static ExpandedActionViewMenuPresenter access$100(ActionBarView actionBarView) {
        return actionBarView.mExpandedMenuPresenter;
    }

    static HomeView access$700(ActionBarView actionBarView) {
        return actionBarView.mHomeLayout;
    }

    public void setWindowTitle(CharSequence charSequence) {
        try {
            if (!this.mUserTitle) {
                setTitleImpl(charSequence);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ActionBar.LayoutParams(getContext(), attributeSet);
    }

    private void configPresenters(MenuBuilder menuBuilder) {
        try {
            if (menuBuilder != null) {
                menuBuilder.addMenuPresenter(this.mActionMenuPresenter);
                menuBuilder.addMenuPresenter(this.mExpandedMenuPresenter);
                if (!AbsActionBarView.b) {
                    return;
                }
            }
            this.mActionMenuPresenter.initForMenu(this.mContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mContext, null);
            this.mActionMenuPresenter.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static View access$1100(ActionBarView actionBarView) {
        return actionBarView.mCustomNavView;
    }

    public int getDropdownSelectedPosition() {
        return this.mSpinner.getSelectedItemPosition();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setHomeButtonEnabled(boolean r5) {
        /*
        r4_this = this;
        r0 = com.actionbarsherlock.internal.widget.AbsActionBarView.b;
        r1 = r4.mHomeLayout;	 Catch:{ IllegalStateException -> 0x0041 }
        r1.setEnabled(r5);	 Catch:{ IllegalStateException -> 0x0041 }
        r1 = r4.mHomeLayout;	 Catch:{ IllegalStateException -> 0x0041 }
        r1.setFocusable(r5);	 Catch:{ IllegalStateException -> 0x0041 }
        if (r5 != 0) goto L_0x0016;
    L_0x000e:
        r1 = r4.mHomeLayout;	 Catch:{ IllegalStateException -> 0x0043 }
        r2 = 0;
        r1.setContentDescription(r2);	 Catch:{ IllegalStateException -> 0x0043 }
        if (r0 == 0) goto L_0x0040;
    L_0x0016:
        r1 = r4.mDisplayOptions;	 Catch:{ IllegalStateException -> 0x0045 }
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x002f;
    L_0x001c:
        r1 = r4.mHomeLayout;	 Catch:{ IllegalStateException -> 0x0047 }
        r2 = r4.mContext;	 Catch:{ IllegalStateException -> 0x0047 }
        r2 = r2.getResources();	 Catch:{ IllegalStateException -> 0x0047 }
        r3 = com.actionbarsherlock.R.string.abs__action_bar_up_description;	 Catch:{ IllegalStateException -> 0x0047 }
        r2 = r2.getText(r3);	 Catch:{ IllegalStateException -> 0x0047 }
        r1.setContentDescription(r2);	 Catch:{ IllegalStateException -> 0x0047 }
        if (r0 == 0) goto L_0x0040;
    L_0x002f:
        r0 = r4.mHomeLayout;	 Catch:{ IllegalStateException -> 0x0047 }
        r1 = r4.mContext;	 Catch:{ IllegalStateException -> 0x0047 }
        r1 = r1.getResources();	 Catch:{ IllegalStateException -> 0x0047 }
        r2 = com.actionbarsherlock.R.string.abs__action_bar_home_description;	 Catch:{ IllegalStateException -> 0x0047 }
        r1 = r1.getText(r2);	 Catch:{ IllegalStateException -> 0x0047 }
        r0.setContentDescription(r1);	 Catch:{ IllegalStateException -> 0x0047 }
    L_0x0040:
        return;
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarView.setHomeButtonEnabled(boolean):void");
    }

    public void setCollapsable(boolean z) {
        this.mIsCollapsable = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setTitleImpl(java.lang.CharSequence r4) {
        /*
        r3_this = this;
        r1 = 0;
        r3.mTitle = r4;	 Catch:{ IllegalStateException -> 0x0038 }
        r0 = r3.mTitleView;	 Catch:{ IllegalStateException -> 0x0038 }
        if (r0 == 0) goto L_0x002e;
    L_0x0007:
        r0 = r3.mTitleView;	 Catch:{ IllegalStateException -> 0x003a }
        r0.setText(r4);	 Catch:{ IllegalStateException -> 0x003a }
        r0 = r3.mExpandedActionView;	 Catch:{ IllegalStateException -> 0x003a }
        if (r0 != 0) goto L_0x0042;
    L_0x0010:
        r0 = r3.mDisplayOptions;	 Catch:{ IllegalStateException -> 0x003c }
        r0 = r0 & 8;
        if (r0 == 0) goto L_0x0042;
    L_0x0016:
        r0 = r3.mTitle;	 Catch:{ IllegalStateException -> 0x003e }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalStateException -> 0x003e }
        if (r0 == 0) goto L_0x0026;
    L_0x001e:
        r0 = r3.mSubtitle;	 Catch:{ IllegalStateException -> 0x0040 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalStateException -> 0x0040 }
        if (r0 != 0) goto L_0x0042;
    L_0x0026:
        r0 = 1;
    L_0x0027:
        r2 = r3.mTitleLayout;	 Catch:{ IllegalStateException -> 0x0044 }
        if (r0 == 0) goto L_0x0046;
    L_0x002b:
        r2.setVisibility(r1);
    L_0x002e:
        r0 = r3.mLogoNavItem;	 Catch:{ IllegalStateException -> 0x0049 }
        if (r0 == 0) goto L_0x0037;
    L_0x0032:
        r0 = r3.mLogoNavItem;	 Catch:{ IllegalStateException -> 0x0049 }
        r0.setTitle(r4);	 Catch:{ IllegalStateException -> 0x0049 }
    L_0x0037:
        return;
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = r1;
        goto L_0x0027;
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r1 = 8;
        goto L_0x002b;
    L_0x0049:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.widget.ActionBarView.setTitleImpl(java.lang.CharSequence):void");
    }

    static ScrollingTabContainerView access$900(ActionBarView actionBarView) {
        return actionBarView.mTabScrollView;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams == null ? generateDefaultLayoutParams() : layoutParams;
    }

    static HomeView access$600(ActionBarView actionBarView) {
        return actionBarView.mExpandedHomeLayout;
    }

    public boolean hasExpandedActionView() {
        try {
            if (this.mExpandedMenuPresenter != null) {
                if (this.mExpandedMenuPresenter.mCurrentExpandedItem != null) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ActionBar.LayoutParams(19);
    }
}
