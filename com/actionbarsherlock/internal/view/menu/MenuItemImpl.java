package com.actionbarsherlock.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import com.actionbarsherlock.internal.view.menu.MenuView.ItemView;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnActionExpandListener;
import com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener;
import com.actionbarsherlock.view.SubMenu;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class MenuItemImpl implements MenuItem {
    private static String sDeleteShortcutLabel;
    private static String sEnterShortcutLabel;
    private static String sPrependShortcutLabel;
    private static String sSpaceShortcutLabel;
    private static final String[] z;
    private ActionProvider mActionProvider;
    private View mActionView;
    private final int mCategoryOrder;
    private OnMenuItemClickListener mClickListener;
    private int mFlags;
    private final int mGroup;
    private Drawable mIconDrawable;
    private int mIconResId;
    private final int mId;
    private Intent mIntent;
    private boolean mIsActionViewExpanded;
    private Runnable mItemCallback;
    private MenuBuilder mMenu;
    private ContextMenuInfo mMenuInfo;
    private OnActionExpandListener mOnActionExpandListener;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private int mShowAsAction;
    private SubMenuBuilder mSubMenu;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;

    static {
        String[] strArr = new String[3];
        String str = "\u001dN2\u000f\u000f\u000fU\"\u0019\u0013\u001aO2\u0016\u000f\u000fJ*\u0019\t\u001d*]\u000b\u0018\u0001Q\"\u0019\u0003\u0011G>\f\u0019\u0001H\"\u0011\u0016\u0011T2\u0017\u001db&\u001c64nU5\u0017\u0007\u0011G.\u0007\u0011\rR4\u0017\u001e\u0011H8\u000e\u0015\u001c&\u001c*5nk\b,%/j\u0011!p+~\u001e4%=o\u000b=~";
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
                        i3 = 78;
                        break;
                    case ay.f /*1*/:
                        i3 = 6;
                        break;
                    case ay.n /*2*/:
                        i3 = 125;
                        break;
                    case ay.p /*3*/:
                        i3 = 88;
                        break;
                    default:
                        i3 = 80;
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
                    str = "\rg\u0013\u007f$n`\u001464ng\u001e,98o\t!p:i]01 b\u0011=p'h\t=>:=]17 i\u000f1>)";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0003c\u0013-\u0019:c\u0010\u0011=>j";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int getOrder() {
        return this.mCategoryOrder;
    }

    public boolean hasSubMenu() {
        try {
            return this.mSubMenu != null;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public boolean isVisible() {
        try {
            return (this.mFlags & 8) == 0;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public boolean isExclusiveCheckable() {
        try {
            return (this.mFlags & 4) != 0;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    void setCheckedInt(boolean z) {
        int i = 0;
        int i2 = this.mFlags;
        try {
            int i3 = this.mFlags & -3;
            if (z) {
                i = 2;
            }
            try {
                this.mFlags = i | i3;
                if (i2 != this.mFlags) {
                    this.mMenu.onItemsChanged(false);
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public boolean requiresActionButton() {
        try {
            return (this.mShowAsAction & 2) == 2;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public boolean shouldShowIcon() {
        return this.mMenu.getOptionalIconsVisible();
    }

    public MenuItem setIcon(Drawable drawable) {
        this.mIconResId = 0;
        this.mIconDrawable = drawable;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.mTitleCondensed = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.mTitle;
        }
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mClickListener = onMenuItemClickListener;
        return this;
    }

    public boolean isEnabled() {
        try {
            return (this.mFlags & 16) != 0;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public boolean isChecked() {
        try {
            return (this.mFlags & 2) == 2;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public void setActionViewExpanded(boolean z) {
        this.mIsActionViewExpanded = z;
        this.mMenu.onItemsChanged(false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.actionbarsherlock.view.MenuItem setActionView(android.view.View r3) {
        /*
        r2_this = this;
        r2.mActionView = r3;	 Catch:{ ActivityNotFoundException -> 0x001d }
        r0 = 0;
        r2.mActionProvider = r0;	 Catch:{ ActivityNotFoundException -> 0x001d }
        if (r3 == 0) goto L_0x0017;
    L_0x0007:
        r0 = r3.getId();	 Catch:{ ActivityNotFoundException -> 0x001f }
        r1 = -1;
        if (r0 != r1) goto L_0x0017;
    L_0x000e:
        r0 = r2.mId;	 Catch:{ ActivityNotFoundException -> 0x0021 }
        if (r0 <= 0) goto L_0x0017;
    L_0x0012:
        r0 = r2.mId;	 Catch:{ ActivityNotFoundException -> 0x0021 }
        r3.setId(r0);	 Catch:{ ActivityNotFoundException -> 0x0021 }
    L_0x0017:
        r0 = r2.mMenu;
        r0.onItemActionRequestChanged(r2);
        return r2;
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuItemImpl.setActionView(android.view.View):com.actionbarsherlock.view.MenuItem");
    }

    public boolean isActionViewExpanded() {
        return this.mIsActionViewExpanded;
    }

    void setSubMenu(SubMenuBuilder subMenuBuilder) {
        this.mSubMenu = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(getTitle());
    }

    public SubMenu getSubMenu() {
        return this.mSubMenu;
    }

    public boolean collapseActionView() {
        try {
            if ((this.mShowAsAction & 8) == 0) {
                return false;
            }
            try {
                if (this.mActionView == null) {
                    return true;
                }
                try {
                    if (this.mOnActionExpandListener != null) {
                        if (!this.mOnActionExpandListener.onMenuItemActionCollapse(this)) {
                            return false;
                        }
                    }
                    return this.mMenu.collapseItemActionView(this);
                } catch (ActivityNotFoundException e) {
                    throw e;
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                }
            } catch (ActivityNotFoundException e22) {
                throw e22;
            }
        } catch (ActivityNotFoundException e222) {
            throw e222;
        }
    }

    public MenuItem setNumericShortcut(char c) {
        try {
            if (this.mShortcutNumericChar != c) {
                this.mShortcutNumericChar = c;
                this.mMenu.onItemsChanged(false);
            }
            return this;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public boolean requestsActionButton() {
        try {
            return (this.mShowAsAction & 1) == 1;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public void setExclusiveCheckable(boolean z) {
        try {
            int i;
            int i2 = this.mFlags & -5;
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            this.mFlags = i | i2;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public char getAlphabeticShortcut() {
        return this.mShortcutAlphabeticChar;
    }

    public char getNumericShortcut() {
        return this.mShortcutNumericChar;
    }

    public boolean isActionButton() {
        try {
            return (this.mFlags & 32) == 32;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    void setMenuInfo(ContextMenuInfo contextMenuInfo) {
        this.mMenuInfo = contextMenuInfo;
    }

    public void setIsActionButton(boolean z) {
        try {
            if (z) {
                this.mFlags |= 32;
                if (MenuBuilder.a == 0) {
                    return;
                }
            }
            this.mFlags &= -33;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public MenuItem setActionView(int i) {
        Context context = this.mMenu.getContext();
        setActionView(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    boolean shouldShowShortcut() {
        try {
            if (this.mMenu.isShortcutsVisible()) {
                if (getShortcut() != '\u0000') {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public MenuItem setIcon(int i) {
        this.mIconDrawable = null;
        this.mIconResId = i;
        this.mMenu.onItemsChanged(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = 0;
        int i2 = this.mFlags;
        try {
            int i3 = this.mFlags & -2;
            if (z) {
                i = 1;
            }
            try {
                this.mFlags = i | i3;
                if (i2 != this.mFlags) {
                    this.mMenu.onItemsChanged(false);
                }
                return this;
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public boolean hasCollapsibleActionView() {
        try {
            if ((this.mShowAsAction & 8) != 0) {
                if (this.mActionView != null) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    java.lang.String getShortcutLabel() {
        /*
        r4_this = this;
        r0 = com.actionbarsherlock.internal.view.menu.MenuBuilder.a;
        r1 = r4.getShortcut();
        if (r1 != 0) goto L_0x000d;
    L_0x0008:
        r0 = "";
    L_0x000a:
        return r0;
    L_0x000b:
        r0 = move-exception;
        throw r0;
    L_0x000d:
        r2 = new java.lang.StringBuilder;
        r3 = sPrependShortcutLabel;
        r2.<init>(r3);
        switch(r1) {
            case 8: goto L_0x0026;
            case 10: goto L_0x001f;
            case 32: goto L_0x002d;
            default: goto L_0x0017;
        };
    L_0x0017:
        r2.append(r1);	 Catch:{ ActivityNotFoundException -> 0x0039 }
    L_0x001a:
        r0 = r2.toString();
        goto L_0x000a;
    L_0x001f:
        r3 = sEnterShortcutLabel;	 Catch:{ ActivityNotFoundException -> 0x0035 }
        r2.append(r3);	 Catch:{ ActivityNotFoundException -> 0x0035 }
        if (r0 == 0) goto L_0x001a;
    L_0x0026:
        r3 = sDeleteShortcutLabel;	 Catch:{ ActivityNotFoundException -> 0x0037 }
        r2.append(r3);	 Catch:{ ActivityNotFoundException -> 0x0037 }
        if (r0 == 0) goto L_0x001a;
    L_0x002d:
        r3 = sSpaceShortcutLabel;	 Catch:{ ActivityNotFoundException -> 0x0039 }
        r2.append(r3);	 Catch:{ ActivityNotFoundException -> 0x0039 }
        if (r0 == 0) goto L_0x001a;
    L_0x0034:
        goto L_0x0017;
    L_0x0035:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0037 }
    L_0x0037:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0039 }
    L_0x0039:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuItemImpl.getShortcutLabel():java.lang.String");
    }

    char getShortcut() {
        try {
            return this.mMenu.isQwertyMode() ? this.mShortcutAlphabeticChar : this.mShortcutNumericChar;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.mId;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.mOnActionExpandListener = onActionExpandListener;
        return this;
    }

    public String toString() {
        return this.mTitle.toString();
    }

    public View getActionView() {
        try {
            if (this.mActionView != null) {
                return this.mActionView;
            }
            try {
                if (this.mActionProvider == null) {
                    return null;
                }
                this.mActionView = this.mActionProvider.onCreateActionView();
                return this.mActionView;
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public boolean isCheckable() {
        try {
            return (this.mFlags & 1) == 1;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public boolean invoke() {
        try {
            if (this.mClickListener != null && this.mClickListener.onMenuItemClick(this)) {
                return true;
            }
            try {
                if (this.mMenu.dispatchMenuItemSelected(this.mMenu.getRootMenu(), this)) {
                    return true;
                }
                try {
                    if (this.mItemCallback != null) {
                        this.mItemCallback.run();
                        return true;
                    }
                    try {
                        if (this.mIntent != null) {
                            try {
                                this.mMenu.getContext().startActivity(this.mIntent);
                                return true;
                            } catch (Throwable e) {
                                Log.e(z[1], z[2], e);
                            }
                        }
                        try {
                            if (this.mActionProvider != null) {
                                if (this.mActionProvider.onPerformDefaultAction()) {
                                    return true;
                                }
                            }
                            return false;
                        } catch (ActivityNotFoundException e2) {
                            throw e2;
                        } catch (ActivityNotFoundException e22) {
                            throw e22;
                        }
                    } catch (IllegalArgumentException e3) {
                        throw e3;
                    }
                } catch (ActivityNotFoundException e222) {
                    throw e222;
                }
            } catch (ActivityNotFoundException e2222) {
                throw e2222;
            }
        } catch (ActivityNotFoundException e22222) {
            throw e22222;
        } catch (ActivityNotFoundException e222222) {
            throw e222222;
        }
    }

    public boolean showsTextAsAction() {
        try {
            return (this.mShowAsAction & 4) == 4;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public MenuItem setTitle(CharSequence charSequence) {
        try {
            this.mTitle = charSequence;
            this.mMenu.onItemsChanged(false);
            if (this.mSubMenu != null) {
                this.mSubMenu.setHeaderTitle(charSequence);
            }
            return this;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public Drawable getIcon() {
        try {
            if (this.mIconDrawable != null) {
                return this.mIconDrawable;
            }
            try {
                return this.mIconResId != 0 ? this.mMenu.getResources().getDrawable(this.mIconResId) : null;
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public boolean expandActionView() {
        try {
            if ((this.mShowAsAction & 8) == 0) {
                return false;
            }
            try {
                if (this.mActionView == null) {
                    return false;
                }
                try {
                    if (this.mOnActionExpandListener != null) {
                        if (!this.mOnActionExpandListener.onMenuItemActionExpand(this)) {
                            return false;
                        }
                    }
                    return this.mMenu.expandItemActionView(this);
                } catch (ActivityNotFoundException e) {
                    throw e;
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                }
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        } catch (ActivityNotFoundException e222) {
            throw e222;
        }
    }

    public int getOrdering() {
        return this.mOrdering;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setShowAsAction(int r4) {
        /*
        r3_this = this;
        r0 = r4 & 3;
        switch(r0) {
            case 0: goto L_0x0012;
            case 1: goto L_0x0012;
            case 2: goto L_0x0012;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ ActivityNotFoundException -> 0x0010 }
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x0010 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0010 }
        r0.<init>(r1);	 Catch:{ ActivityNotFoundException -> 0x0010 }
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0010 }
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r0 = com.actionbarsherlock.internal.view.menu.MenuBuilder.a;	 Catch:{ ActivityNotFoundException -> 0x0010 }
        if (r0 != 0) goto L_0x0005;
    L_0x0016:
        r3.mShowAsAction = r4;
        r0 = r3.mMenu;
        r0.onItemActionRequestChanged(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuItemImpl.setShowAsAction(int):void");
    }

    public CharSequence getTitleCondensed() {
        try {
            return this.mTitleCondensed != null ? this.mTitleCondensed : this.mTitle;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.actionbarsherlock.view.MenuItem setChecked(boolean r2) {
        /*
        r1_this = this;
        r0 = r1.mFlags;	 Catch:{ ActivityNotFoundException -> 0x0013 }
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x000f;
    L_0x0006:
        r0 = r1.mMenu;	 Catch:{ ActivityNotFoundException -> 0x0015 }
        r0.setExclusiveItemChecked(r1);	 Catch:{ ActivityNotFoundException -> 0x0015 }
        r0 = com.actionbarsherlock.internal.view.menu.MenuBuilder.a;	 Catch:{ ActivityNotFoundException -> 0x0015 }
        if (r0 == 0) goto L_0x0012;
    L_0x000f:
        r1.setCheckedInt(r2);	 Catch:{ ActivityNotFoundException -> 0x0015 }
    L_0x0012:
        return r1;
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuItemImpl.setChecked(boolean):com.actionbarsherlock.view.MenuItem");
    }

    public int getGroupId() {
        return this.mGroup;
    }

    MenuItemImpl(MenuBuilder menuBuilder, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.mIconResId = 0;
        this.mFlags = 16;
        this.mShowAsAction = 0;
        this.mIsActionViewExpanded = false;
        this.mMenu = menuBuilder;
        this.mId = i2;
        this.mGroup = i;
        this.mCategoryOrder = i3;
        this.mOrdering = i4;
        this.mTitle = charSequence;
        this.mShowAsAction = i5;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        try {
            if (this.mShortcutAlphabeticChar != c) {
                this.mShortcutAlphabeticChar = Character.toLowerCase(c);
                this.mMenu.onItemsChanged(false);
            }
            return this;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.actionbarsherlock.view.MenuItem setEnabled(boolean r3) {
        /*
        r2_this = this;
        if (r3 == 0) goto L_0x000c;
    L_0x0002:
        r0 = r2.mFlags;	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r0 = r0 | 16;
        r2.mFlags = r0;	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r0 = com.actionbarsherlock.internal.view.menu.MenuBuilder.a;	 Catch:{ ActivityNotFoundException -> 0x0019 }
        if (r0 == 0) goto L_0x0012;
    L_0x000c:
        r0 = r2.mFlags;	 Catch:{ ActivityNotFoundException -> 0x0019 }
        r0 = r0 & -17;
        r2.mFlags = r0;	 Catch:{ ActivityNotFoundException -> 0x0019 }
    L_0x0012:
        r0 = r2.mMenu;
        r1 = 0;
        r0.onItemsChanged(r1);
        return r2;
    L_0x0019:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuItemImpl.setEnabled(boolean):com.actionbarsherlock.view.MenuItem");
    }

    boolean setVisibleInt(boolean z) {
        int i = this.mFlags;
        try {
            try {
                this.mFlags = (z ? 0 : 8) | (this.mFlags & -9);
                return i != this.mFlags;
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public MenuItem setTitle(int i) {
        return setTitle(this.mMenu.getContext().getString(i));
    }

    public MenuItem setVisible(boolean z) {
        try {
            if (setVisibleInt(z)) {
                this.mMenu.onItemVisibleChanged(this);
            }
            return this;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        this.mActionView = null;
        this.mActionProvider = actionProvider;
        this.mMenu.onItemsChanged(true);
        return this;
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.mTitle;
    }

    public ActionProvider getActionProvider() {
        return this.mActionProvider;
    }

    CharSequence getTitleForItemView(ItemView itemView) {
        if (itemView != null) {
            try {
                if (itemView.prefersCondensedTitle()) {
                    return getTitleCondensed();
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        return getTitle();
    }
}
