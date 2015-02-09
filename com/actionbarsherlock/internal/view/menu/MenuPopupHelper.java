package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import com.actionbarsherlock.R;
import com.actionbarsherlock.internal.view.View_HasStateListenerSupport;
import com.actionbarsherlock.internal.view.View_OnAttachStateChangeListener;
import com.actionbarsherlock.internal.view.menu.MenuPresenter.Callback;
import com.actionbarsherlock.internal.view.menu.MenuView.ItemView;
import com.actionbarsherlock.internal.widget.IcsListPopupWindow;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class MenuPopupHelper implements OnItemClickListener, OnKeyListener, OnGlobalLayoutListener, OnDismissListener, View_OnAttachStateChangeListener, MenuPresenter {
    static final int ITEM_LAYOUT;
    private static final String z;
    private MenuAdapter mAdapter;
    private View mAnchorView;
    private Context mContext;
    boolean mForceShowIcon;
    private LayoutInflater mInflater;
    private ViewGroup mMeasureParent;
    private MenuBuilder mMenu;
    private boolean mOverflowOnly;
    private IcsListPopupWindow mPopup;
    private int mPopupMaxWidth;
    private Callback mPresenterCallback;
    private ViewTreeObserver mTreeObserver;

    class ExpandedIndexObserver extends DataSetObserver {
        final MenuPopupHelper this$0;

        public void onChanged() {
            MenuPopupHelper.access$500(this.this$0).findExpandedIndex();
        }

        private ExpandedIndexObserver(MenuPopupHelper menuPopupHelper) {
            this.this$0 = menuPopupHelper;
        }

        ExpandedIndexObserver(MenuPopupHelper menuPopupHelper, AnonymousClass_1 anonymousClass_1) {
            this(menuPopupHelper);
        }
    }

    class MenuAdapter extends BaseAdapter {
        private MenuBuilder mAdapterMenu;
        private int mExpandedIndex;
        final MenuPopupHelper this$0;

        static MenuBuilder access$000(MenuAdapter menuAdapter) {
            return menuAdapter.mAdapterMenu;
        }

        public MenuAdapter(MenuPopupHelper menuPopupHelper, MenuBuilder menuBuilder) {
            this.this$0 = menuPopupHelper;
            this.mExpandedIndex = -1;
            this.mAdapterMenu = menuBuilder;
            registerDataSetObserver(new ExpandedIndexObserver(menuPopupHelper, null));
            findExpandedIndex();
        }

        void findExpandedIndex() {
            int i = MenuBuilder.a;
            MenuItemImpl expandedItem = MenuPopupHelper.access$400(this.this$0).getExpandedItem();
            if (expandedItem != null) {
                ArrayList nonActionItems = MenuPopupHelper.access$400(this.this$0).getNonActionItems();
                int size = nonActionItems.size();
                int i2 = 0;
                while (i2 < size) {
                    if (((MenuItemImpl) nonActionItems.get(i2)) == expandedItem) {
                        this.mExpandedIndex = i2;
                        return;
                    }
                    int i3 = i2 + 1;
                    if (i != 0) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.mExpandedIndex = -1;
        }

        public Object getItem(int i) {
            return getItem(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate;
            if (view == null) {
                inflate = MenuPopupHelper.access$300(this.this$0).inflate(ITEM_LAYOUT, viewGroup, false);
            } else {
                inflate = view;
            }
            ItemView itemView = (ItemView) inflate;
            if (this.this$0.mForceShowIcon) {
                ((ListMenuItemView) inflate).setForceShowIcon(true);
            }
            itemView.initialize(getItem(i), 0);
            return inflate;
        }

        public int getCount() {
            ArrayList nonActionItems;
            if (MenuPopupHelper.access$200(this.this$0)) {
                nonActionItems = this.mAdapterMenu.getNonActionItems();
            } else {
                nonActionItems = this.mAdapterMenu.getVisibleItems();
            }
            return this.mExpandedIndex < 0 ? nonActionItems.size() : nonActionItems.size() - 1;
        }

        public MenuItemImpl getItem(int i) {
            ArrayList nonActionItems = MenuPopupHelper.access$200(this.this$0) ? this.mAdapterMenu.getNonActionItems() : this.mAdapterMenu.getVisibleItems();
            if (this.mExpandedIndex >= 0 && i >= this.mExpandedIndex) {
                i++;
            }
            return (MenuItemImpl) nonActionItems.get(i);
        }
    }

    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder) {
        this(context, menuBuilder, null, false);
    }

    public void onDismiss() {
        try {
            this.mPopup = null;
            this.mMenu.close();
            if (this.mTreeObserver != null) {
                if (!this.mTreeObserver.isAlive()) {
                    this.mTreeObserver = this.mAnchorView.getViewTreeObserver();
                }
                this.mTreeObserver.removeGlobalOnLayoutListener(this);
                this.mTreeObserver = null;
            }
            ((View_HasStateListenerSupport) this.mAnchorView).removeOnAttachStateChangeListener(this);
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        try {
            if (menuBuilder == this.mMenu) {
                try {
                    dismiss();
                    if (this.mPresenterCallback != null) {
                        this.mPresenterCallback.onCloseMenu(menuBuilder, z);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static LayoutInflater access$300(MenuPopupHelper menuPopupHelper) {
        return menuPopupHelper.mInflater;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSubMenuSelected(com.actionbarsherlock.internal.view.menu.SubMenuBuilder r10) {
        /*
        r9_this = this;
        r0 = 1;
        r1 = 0;
        r4 = com.actionbarsherlock.internal.view.menu.MenuBuilder.a;
        r2 = r10.hasVisibleItems();
        if (r2 == 0) goto L_0x0050;
    L_0x000a:
        r5 = new com.actionbarsherlock.internal.view.menu.MenuPopupHelper;
        r2 = r9.mContext;
        r3 = r9.mAnchorView;
        r5.<init>(r2, r10, r3, r1);
        r2 = r9.mPresenterCallback;
        r5.setCallback(r2);
        r6 = r10.size();
        r3 = r1;
        r2 = r1;
    L_0x001e:
        if (r3 >= r6) goto L_0x0037;
    L_0x0020:
        r7 = r10.getItem(r3);
        r8 = r7.isVisible();	 Catch:{ IllegalStateException -> 0x004a }
        if (r8 == 0) goto L_0x0033;
    L_0x002a:
        r7 = r7.getIcon();	 Catch:{ IllegalStateException -> 0x004a }
        if (r7 == 0) goto L_0x0033;
    L_0x0030:
        if (r4 == 0) goto L_0x0052;
    L_0x0032:
        r2 = r0;
    L_0x0033:
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x001e;
    L_0x0037:
        r5.setForceShowIcon(r2);	 Catch:{ IllegalStateException -> 0x004c }
        r2 = r5.tryShow();	 Catch:{ IllegalStateException -> 0x004c }
        if (r2 == 0) goto L_0x0050;
    L_0x0040:
        r1 = r9.mPresenterCallback;	 Catch:{ IllegalStateException -> 0x004e }
        if (r1 == 0) goto L_0x0049;
    L_0x0044:
        r1 = r9.mPresenterCallback;	 Catch:{ IllegalStateException -> 0x004e }
        r1.onOpenSubMenu(r10);	 Catch:{ IllegalStateException -> 0x004e }
    L_0x0049:
        return r0;
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r0 = r1;
        goto L_0x0049;
    L_0x0052:
        r2 = r0;
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuPopupHelper.onSubMenuSelected(com.actionbarsherlock.internal.view.menu.SubMenuBuilder):boolean");
    }

    public void onViewDetachedFromWindow(View view) {
        try {
            if (this.mTreeObserver != null) {
                if (!this.mTreeObserver.isAlive()) {
                    this.mTreeObserver = view.getViewTreeObserver();
                }
                this.mTreeObserver.removeGlobalOnLayoutListener(this);
            }
            ((View_HasStateListenerSupport) view).removeOnAttachStateChangeListener(this);
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void initForMenu(Context context, MenuBuilder menuBuilder) {
    }

    static MenuAdapter access$500(MenuPopupHelper menuPopupHelper) {
        return menuPopupHelper.mAdapter;
    }

    public boolean tryShow() {
        this.mPopup = new IcsListPopupWindow(this.mContext, null, R.attr.popupMenuStyle);
        this.mPopup.setOnDismissListener(this);
        this.mPopup.setOnItemClickListener(this);
        this.mAdapter = new MenuAdapter(this, this.mMenu);
        this.mPopup.setAdapter(this.mAdapter);
        this.mPopup.setModal(true);
        View view = this.mAnchorView;
        if (view != null) {
            try {
                boolean z;
                if (this.mTreeObserver == null) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    this.mTreeObserver = view.getViewTreeObserver();
                    if (z) {
                        this.mTreeObserver.addOnGlobalLayoutListener(this);
                    }
                    try {
                        ((View_HasStateListenerSupport) view).addOnAttachStateChangeListener(this);
                        this.mPopup.setAnchorView(view);
                        if (MenuBuilder.a == 0) {
                            this.mPopup.setContentWidth(Math.min(measureContentWidth(this.mAdapter), this.mPopupMaxWidth));
                            this.mPopup.setInputMethodMode(2);
                            this.mPopup.show();
                            this.mPopup.getListView().setOnKeyListener(this);
                            return true;
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
        return false;
    }

    public void dismiss() {
        try {
            if (isShowing()) {
                this.mPopup.dismiss();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static {
        char[] toCharArray = "PLO\u0019QrYT\u001cIxEQ\ts=J@\u0002or]\u0001\u000ed=\\R\te=^H\u0018ir\\UL`s\t@\u0002buFS".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 29;
                    break;
                case ay.f /*1*/:
                    i2 = 41;
                    break;
                case ay.n /*2*/:
                    i2 = 33;
                    break;
                case ay.p /*3*/:
                    i2 = 108;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        ITEM_LAYOUT = R.layout.abs__popup_menu_item_layout;
    }

    private int measureContentWidth(ListAdapter listAdapter) {
        int i = 0;
        int i2 = MenuBuilder.a;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i3 = 0;
        int i4 = 0;
        View view = null;
        while (i3 < count) {
            View view2;
            int itemViewType = listAdapter.getItemViewType(i3);
            if (itemViewType != i4) {
                view2 = null;
            } else {
                itemViewType = i4;
                view2 = view;
            }
            try {
                if (this.mMeasureParent == null) {
                    this.mMeasureParent = new FrameLayout(this.mContext);
                }
                view = listAdapter.getView(i3, view2, this.mMeasureParent);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i = Math.max(i, view.getMeasuredWidth());
                i4 = i3 + 1;
                if (i2 != 0) {
                    break;
                }
                i3 = i4;
                i4 = itemViewType;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return i;
    }

    static boolean access$200(MenuPopupHelper menuPopupHelper) {
        return menuPopupHelper.mOverflowOnly;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MenuAdapter menuAdapter = this.mAdapter;
        MenuAdapter.access$000(menuAdapter).performItemAction(menuAdapter.getItem(i), 0);
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        try {
            if (keyEvent.getAction() == 1 && i == 82) {
                dismiss();
                return true;
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

    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
    }

    public void updateMenuView(boolean z) {
        try {
            if (this.mAdapter != null) {
                this.mAdapter.notifyDataSetChanged();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public MenuPopupHelper(Context context, MenuBuilder menuBuilder, View view, boolean z) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
        this.mMenu = menuBuilder;
        this.mOverflowOnly = z;
        Resources resources = context.getResources();
        this.mPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abs__config_prefDialogWidth));
        this.mAnchorView = view;
        menuBuilder.addMenuPresenter(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
        r1_this = this;
        r0 = r1.isShowing();
        if (r0 == 0) goto L_0x0022;
    L_0x0006:
        r0 = r1.mAnchorView;
        if (r0 == 0) goto L_0x0010;
    L_0x000a:
        r0 = r0.isShown();	 Catch:{ IllegalStateException -> 0x0023 }
        if (r0 != 0) goto L_0x0017;
    L_0x0010:
        r1.dismiss();	 Catch:{ IllegalStateException -> 0x0025 }
        r0 = com.actionbarsherlock.internal.view.menu.MenuBuilder.a;	 Catch:{ IllegalStateException -> 0x0025 }
        if (r0 == 0) goto L_0x0022;
    L_0x0017:
        r0 = r1.isShowing();	 Catch:{ IllegalStateException -> 0x0027 }
        if (r0 == 0) goto L_0x0022;
    L_0x001d:
        r0 = r1.mPopup;	 Catch:{ IllegalStateException -> 0x0027 }
        r0.show();	 Catch:{ IllegalStateException -> 0x0027 }
    L_0x0022:
        return;
    L_0x0023:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0027 }
    L_0x0027:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuPopupHelper.onGlobalLayout():void");
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void setAnchorView(View view) {
        this.mAnchorView = view;
    }

    public void setCallback(Callback callback) {
        this.mPresenterCallback = callback;
    }

    public boolean isShowing() {
        try {
            if (this.mPopup != null) {
                if (this.mPopup.isShowing()) {
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

    static MenuBuilder access$400(MenuPopupHelper menuPopupHelper) {
        return menuPopupHelper.mMenu;
    }

    public void show() {
        try {
            if (!tryShow()) {
                throw new IllegalStateException(z);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
