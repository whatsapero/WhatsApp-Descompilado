package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class MenuBuilder implements Menu {
    public static int a;
    private static final int[] sCategoryToOrder;
    private static final String[] z;
    private ArrayList mActionItems;
    private Callback mCallback;
    private final Context mContext;
    private ContextMenuInfo mCurrentMenuInfo;
    private int mDefaultShowAsAction;
    private MenuItemImpl mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mIsActionItemsStale;
    private boolean mIsClosing;
    private boolean mIsVisibleItemsStale;
    private ArrayList mItems;
    private boolean mItemsChangedWhileDispatchPrevented;
    private ArrayList mNonActionItems;
    private boolean mOptionalIconsVisible;
    private CopyOnWriteArrayList mPresenters;
    private boolean mPreventDispatchingItemsChanged;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private ArrayList mTempShortcutItemList;
    private ArrayList mVisibleItems;

    public interface Callback {
        boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem);

        void onMenuModeChange(MenuBuilder menuBuilder);
    }

    public interface ItemInvoker {
        boolean invokeItem(MenuItemImpl menuItemImpl);
    }

    boolean dispatchMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        try {
            if (this.mCallback != null) {
                if (this.mCallback.onMenuItemSelected(menuBuilder, menuItem)) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean bindNativeOverflow(android.view.Menu r12, android.view.MenuItem.OnMenuItemClickListener r13, java.util.HashMap r14) {
        /*
        r11_this = this;
        r0 = 0;
        r2 = 1;
        r3 = a;
        r1 = r11.getNonActionItems();
        if (r1 == 0) goto L_0x0010;
    L_0x000a:
        r4 = r1.size();	 Catch:{ IllegalArgumentException -> 0x0012 }
        if (r4 != 0) goto L_0x0014;
    L_0x0010:
        r2 = r0;
    L_0x0011:
        return r2;
    L_0x0012:
        r0 = move-exception;
        throw r0;
    L_0x0014:
        r12.clear();
        r4 = r1.iterator();
        r1 = r0;
    L_0x001c:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0139;
    L_0x0022:
        r0 = r4.next();
        r0 = (com.actionbarsherlock.internal.view.menu.MenuItemImpl) r0;
        r5 = r0.isVisible();	 Catch:{ IllegalArgumentException -> 0x0133 }
        if (r5 != 0) goto L_0x0030;
    L_0x002e:
        if (r3 == 0) goto L_0x001c;
    L_0x0030:
        r1 = r0.hasSubMenu();
        if (r1 == 0) goto L_0x00cd;
    L_0x0036:
        r1 = r0.getGroupId();
        r5 = r0.getItemId();
        r6 = r0.getOrder();
        r7 = r0.getTitle();
        r5 = r12.addSubMenu(r1, r5, r6, r7);
        r1 = r0.getSubMenu();
        r1 = (com.actionbarsherlock.internal.view.menu.SubMenuBuilder) r1;
        r1 = r1.getVisibleItems();
        r6 = r1.iterator();
    L_0x0058:
        r1 = r6.hasNext();
        if (r1 == 0) goto L_0x00c7;
    L_0x005e:
        r1 = r6.next();
        r1 = (com.actionbarsherlock.internal.view.menu.MenuItemImpl) r1;
        r7 = r1.getGroupId();
        r8 = r1.getItemId();
        r9 = r1.getOrder();
        r10 = r1.getTitle();
        r7 = r5.add(r7, r8, r9, r10);
        r8 = r1.getIcon();	 Catch:{ IllegalArgumentException -> 0x0135 }
        r7.setIcon(r8);	 Catch:{ IllegalArgumentException -> 0x0135 }
        r7.setOnMenuItemClickListener(r13);	 Catch:{ IllegalArgumentException -> 0x0135 }
        r8 = r1.isEnabled();	 Catch:{ IllegalArgumentException -> 0x0135 }
        r7.setEnabled(r8);	 Catch:{ IllegalArgumentException -> 0x0135 }
        r8 = r1.getIntent();	 Catch:{ IllegalArgumentException -> 0x0135 }
        r7.setIntent(r8);	 Catch:{ IllegalArgumentException -> 0x0135 }
        r8 = r1.getNumericShortcut();	 Catch:{ IllegalArgumentException -> 0x0135 }
        r7.setNumericShortcut(r8);	 Catch:{ IllegalArgumentException -> 0x0135 }
        r8 = r1.getAlphabeticShortcut();	 Catch:{ IllegalArgumentException -> 0x0135 }
        r7.setAlphabeticShortcut(r8);	 Catch:{ IllegalArgumentException -> 0x0135 }
        r8 = r1.getTitleCondensed();	 Catch:{ IllegalArgumentException -> 0x0135 }
        r7.setTitleCondensed(r8);	 Catch:{ IllegalArgumentException -> 0x0135 }
        r8 = r1.isCheckable();	 Catch:{ IllegalArgumentException -> 0x0135 }
        r7.setCheckable(r8);	 Catch:{ IllegalArgumentException -> 0x0135 }
        r8 = r1.isChecked();	 Catch:{ IllegalArgumentException -> 0x0135 }
        r7.setChecked(r8);	 Catch:{ IllegalArgumentException -> 0x0135 }
        r8 = r1.isExclusiveCheckable();	 Catch:{ IllegalArgumentException -> 0x0135 }
        if (r8 == 0) goto L_0x00c2;
    L_0x00b9:
        r8 = r1.getGroupId();	 Catch:{ IllegalArgumentException -> 0x0135 }
        r9 = 1;
        r10 = 1;
        r5.setGroupCheckable(r8, r9, r10);	 Catch:{ IllegalArgumentException -> 0x0135 }
    L_0x00c2:
        r14.put(r7, r1);
        if (r3 == 0) goto L_0x0058;
    L_0x00c7:
        r1 = r5.getItem();
        if (r3 == 0) goto L_0x00e1;
    L_0x00cd:
        r1 = r0.getGroupId();
        r5 = r0.getItemId();
        r6 = r0.getOrder();
        r7 = r0.getTitle();
        r1 = r12.add(r1, r5, r6, r7);
    L_0x00e1:
        r5 = r0.getIcon();	 Catch:{ IllegalArgumentException -> 0x0137 }
        r1.setIcon(r5);	 Catch:{ IllegalArgumentException -> 0x0137 }
        r1.setOnMenuItemClickListener(r13);	 Catch:{ IllegalArgumentException -> 0x0137 }
        r5 = r0.isEnabled();	 Catch:{ IllegalArgumentException -> 0x0137 }
        r1.setEnabled(r5);	 Catch:{ IllegalArgumentException -> 0x0137 }
        r5 = r0.getIntent();	 Catch:{ IllegalArgumentException -> 0x0137 }
        r1.setIntent(r5);	 Catch:{ IllegalArgumentException -> 0x0137 }
        r5 = r0.getNumericShortcut();	 Catch:{ IllegalArgumentException -> 0x0137 }
        r1.setNumericShortcut(r5);	 Catch:{ IllegalArgumentException -> 0x0137 }
        r5 = r0.getAlphabeticShortcut();	 Catch:{ IllegalArgumentException -> 0x0137 }
        r1.setAlphabeticShortcut(r5);	 Catch:{ IllegalArgumentException -> 0x0137 }
        r5 = r0.getTitleCondensed();	 Catch:{ IllegalArgumentException -> 0x0137 }
        r1.setTitleCondensed(r5);	 Catch:{ IllegalArgumentException -> 0x0137 }
        r5 = r0.isCheckable();	 Catch:{ IllegalArgumentException -> 0x0137 }
        r1.setCheckable(r5);	 Catch:{ IllegalArgumentException -> 0x0137 }
        r5 = r0.isChecked();	 Catch:{ IllegalArgumentException -> 0x0137 }
        r1.setChecked(r5);	 Catch:{ IllegalArgumentException -> 0x0137 }
        r5 = r0.isExclusiveCheckable();	 Catch:{ IllegalArgumentException -> 0x0137 }
        if (r5 == 0) goto L_0x012b;
    L_0x0122:
        r5 = r0.getGroupId();	 Catch:{ IllegalArgumentException -> 0x0137 }
        r6 = 1;
        r7 = 1;
        r12.setGroupCheckable(r5, r6, r7);	 Catch:{ IllegalArgumentException -> 0x0137 }
    L_0x012b:
        r14.put(r1, r0);
        if (r3 != 0) goto L_0x0011;
    L_0x0130:
        r1 = r2;
        goto L_0x001c;
    L_0x0133:
        r0 = move-exception;
        throw r0;
    L_0x0135:
        r0 = move-exception;
        throw r0;
    L_0x0137:
        r0 = move-exception;
        throw r0;
    L_0x0139:
        r2 = r1;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuBuilder.bindNativeOverflow(android.view.Menu, android.view.MenuItem$OnMenuItemClickListener, java.util.HashMap):boolean");
    }

    public MenuItem findItem(int i) {
        int i2 = a;
        int size = size();
        int i3 = 0;
        while (i3 < size) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.mItems.get(i3);
            try {
                if (menuItemImpl.getItemId() == i) {
                    return menuItemImpl;
                }
                if (menuItemImpl.hasSubMenu()) {
                    MenuItem findItem = menuItemImpl.getSubMenu().findItem(i);
                    if (findItem != null) {
                        return findItem;
                    }
                }
                int i4 = i3 + 1;
                if (i2 != 0) {
                    break;
                }
                i3 = i4;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return null;
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    void onItemVisibleChanged(MenuItemImpl menuItemImpl) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return addInternal(i, i2, i3, this.mResources.getString(i4));
    }

    private void setHeaderInternal(int r5, java.lang.CharSequence r6, int r7, android.graphics.drawable.Drawable r8, android.view.View r9) {
        /* JADX: method processing error */
/*
        Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:71)
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
        r4_this = this;
        r3 = 0;
        r0 = a;
        r1 = r4.getResources();
        if (r9 == 0) goto L_0x0013;
    L_0x0009:
        r4.mHeaderView = r9;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r2 = 0;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r4.mHeaderTitle = r2;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r2 = 0;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r4.mHeaderIcon = r2;	 Catch:{ IllegalArgumentException -> 0x0036 }
        if (r0 == 0) goto L_0x0031;
    L_0x0013:
        if (r5 <= 0) goto L_0x001d;
    L_0x0015:
        r2 = r1.getText(r5);	 Catch:{ IllegalArgumentException -> 0x003a }
        r4.mHeaderTitle = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        if (r0 == 0) goto L_0x0021;
    L_0x001d:
        if (r6 == 0) goto L_0x0021;
    L_0x001f:
        r4.mHeaderTitle = r6;	 Catch:{ IllegalArgumentException -> 0x003c }
    L_0x0021:
        if (r7 <= 0) goto L_0x002b;
    L_0x0023:
        r1 = r1.getDrawable(r7);	 Catch:{ IllegalArgumentException -> 0x003e }
        r4.mHeaderIcon = r1;	 Catch:{ IllegalArgumentException -> 0x003e }
        if (r0 == 0) goto L_0x002f;
    L_0x002b:
        if (r8 == 0) goto L_0x002f;
    L_0x002d:
        r4.mHeaderIcon = r8;	 Catch:{ IllegalArgumentException -> 0x0040 }
    L_0x002f:
        r4.mHeaderView = r3;
    L_0x0031:
        r0 = 0;
        r4.onItemsChanged(r0);
        return;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuBuilder.setHeaderInternal(int, java.lang.CharSequence, int, android.graphics.drawable.Drawable, android.view.View):void");
    }

    public void startDispatchingItemsChanged() {
        try {
            this.mPreventDispatchingItemsChanged = false;
            if (this.mItemsChangedWhileDispatchPrevented) {
                this.mItemsChangedWhileDispatchPrevented = false;
                onItemsChanged(true);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int i2 = a;
        int size = this.mItems.size();
        int i3 = 0;
        while (i3 < size) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.mItems.get(i3);
            try {
                if (menuItemImpl.getGroupId() == i) {
                    menuItemImpl.setExclusiveCheckable(z2);
                    menuItemImpl.setCheckable(z);
                }
                int i4 = i3 + 1;
                if (i2 == 0) {
                    i3 = i4;
                } else {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public void changeMenuMode() {
        try {
            if (this.mCallback != null) {
                this.mCallback.onMenuModeChange(this);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    void onItemActionRequestChanged(MenuItemImpl menuItemImpl) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void clear() {
        try {
            if (this.mExpandedItem != null) {
                collapseItemActionView(this.mExpandedItem);
            }
            this.mItems.clear();
            onItemsChanged(true);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    protected MenuBuilder setHeaderTitleInt(CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public MenuBuilder setDefaultShowAsAction(int i) {
        this.mDefaultShowAsAction = i;
        return this;
    }

    public void stopDispatchingItemsChanged() {
        try {
            if (!this.mPreventDispatchingItemsChanged) {
                this.mPreventDispatchingItemsChanged = true;
                this.mItemsChangedWhileDispatchPrevented = false;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    protected String getActionViewStatesKey() {
        return z[0];
    }

    public void restoreActionViewStates(Bundle bundle) {
        int i = a;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
            try {
                if (VERSION.SDK_INT >= 11 || sparseParcelableArray != null) {
                    MenuItem item;
                    int i2;
                    int size = size();
                    int i3 = 0;
                    while (i3 < size) {
                        item = getItem(i3);
                        View actionView = item.getActionView();
                        if (actionView != null) {
                            try {
                                if (actionView.getId() != -1) {
                                    actionView.restoreHierarchyState(sparseParcelableArray);
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        if (item.hasSubMenu()) {
                            ((SubMenuBuilder) item.getSubMenu()).restoreActionViewStates(bundle);
                        }
                        i2 = i3 + 1;
                        if (i != 0) {
                            break;
                        }
                        i3 = i2;
                    }
                    i2 = bundle.getInt(z[1]);
                    if (i2 > 0) {
                        item = findItem(i2);
                        if (item != null) {
                            try {
                                item.expandActionView();
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        }
                    }
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setShortcutsVisibleInner(boolean r4) {
        /*
        r3_this = this;
        r0 = 1;
        if (r4 == 0) goto L_0x001e;
    L_0x0003:
        r1 = r3.mResources;	 Catch:{ IllegalArgumentException -> 0x001a }
        r1 = r1.getConfiguration();	 Catch:{ IllegalArgumentException -> 0x001a }
        r1 = r1.keyboard;	 Catch:{ IllegalArgumentException -> 0x001a }
        if (r1 == r0) goto L_0x001e;
    L_0x000d:
        r1 = r3.mResources;	 Catch:{ IllegalArgumentException -> 0x001c }
        r2 = com.actionbarsherlock.R.bool.abs__config_showMenuShortcutsWhenKeyboardPresent;	 Catch:{ IllegalArgumentException -> 0x001c }
        r1 = r1.getBoolean(r2);	 Catch:{ IllegalArgumentException -> 0x001c }
        if (r1 == 0) goto L_0x001e;
    L_0x0017:
        r3.mShortcutsVisible = r0;
        return;
    L_0x001a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001c }
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        r0 = 0;
        goto L_0x0017;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuBuilder.setShortcutsVisibleInner(boolean):void");
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.mItems.get(i);
    }

    public boolean hasVisibleItems() {
        int i = a;
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            try {
                if (((MenuItemImpl) this.mItems.get(i2)).isVisible()) {
                    return true;
                }
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return false;
    }

    boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    ArrayList getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    private void dispatchPresenterUpdate(boolean r6) {
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
        r5_this = this;
        r2 = a;
        r0 = r5.mPresenters;	 Catch:{ IllegalArgumentException -> 0x000b }
        r0 = r0.isEmpty();	 Catch:{ IllegalArgumentException -> 0x000b }
        if (r0 == 0) goto L_0x000d;
    L_0x000a:
        return;
    L_0x000b:
        r0 = move-exception;
        throw r0;
    L_0x000d:
        r5.stopDispatchingItemsChanged();
        r0 = r5.mPresenters;
        r3 = r0.iterator();
    L_0x0016:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0036;
    L_0x001c:
        r0 = r3.next();
        r0 = (java.lang.ref.WeakReference) r0;
        r1 = r0.get();
        r1 = (com.actionbarsherlock.internal.view.menu.MenuPresenter) r1;
        if (r1 != 0) goto L_0x0031;
    L_0x002a:
        r4 = r5.mPresenters;	 Catch:{ IllegalArgumentException -> 0x003a }
        r4.remove(r0);	 Catch:{ IllegalArgumentException -> 0x003a }
        if (r2 == 0) goto L_0x0034;	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x0031:
        r1.updateMenuView(r6);	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x0034:
        if (r2 == 0) goto L_0x0016;
    L_0x0036:
        r5.startDispatchingItemsChanged();
        goto L_0x000a;
    L_0x003a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuBuilder.dispatchPresenterUpdate(boolean):void");
    }

    public void addMenuPresenter(MenuPresenter menuPresenter) {
        this.mPresenters.add(new WeakReference(menuPresenter));
        menuPresenter.initForMenu(this.mContext, this);
        this.mIsActionItemsStale = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void flagActionItems() {
        /*
        r7_this = this;
        r3 = 0;
        r4 = a;
        r0 = r7.mIsActionItemsStale;	 Catch:{ IllegalArgumentException -> 0x0008 }
        if (r0 != 0) goto L_0x000a;
    L_0x0007:
        return;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r0 = r7.mPresenters;
        r5 = r0.iterator();
        r2 = r3;
    L_0x0011:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0089;
    L_0x0017:
        r0 = r5.next();
        r0 = (java.lang.ref.WeakReference) r0;
        r1 = r0.get();
        r1 = (com.actionbarsherlock.internal.view.menu.MenuPresenter) r1;
        if (r1 != 0) goto L_0x002c;
    L_0x0025:
        r6 = r7.mPresenters;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r6.remove(r0);	 Catch:{ IllegalArgumentException -> 0x0069 }
        if (r4 == 0) goto L_0x0087;
    L_0x002c:
        r0 = r1.flagActionItems();
        r0 = r0 | r2;
    L_0x0031:
        if (r4 == 0) goto L_0x0085;
    L_0x0033:
        if (r0 == 0) goto L_0x006f;
    L_0x0035:
        r0 = r7.mActionItems;
        r0.clear();
        r0 = r7.mNonActionItems;
        r0.clear();
        r2 = r7.getVisibleItems();
        r5 = r2.size();
        r1 = r3;
    L_0x0048:
        if (r1 >= r5) goto L_0x0066;
    L_0x004a:
        r0 = r2.get(r1);
        r0 = (com.actionbarsherlock.internal.view.menu.MenuItemImpl) r0;
        r6 = r0.isActionButton();	 Catch:{ IllegalArgumentException -> 0x006b }
        if (r6 == 0) goto L_0x005d;
    L_0x0056:
        r6 = r7.mActionItems;	 Catch:{ IllegalArgumentException -> 0x006d }
        r6.add(r0);	 Catch:{ IllegalArgumentException -> 0x006d }
        if (r4 == 0) goto L_0x0062;
    L_0x005d:
        r6 = r7.mNonActionItems;	 Catch:{ IllegalArgumentException -> 0x006d }
        r6.add(r0);	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x0062:
        r0 = r1 + 1;
        if (r4 == 0) goto L_0x0083;
    L_0x0066:
        r7.mIsActionItemsStale = r3;
        goto L_0x0007;
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;
    L_0x006f:
        r0 = r7.mActionItems;
        r0.clear();
        r0 = r7.mNonActionItems;
        r0.clear();
        r0 = r7.mNonActionItems;
        r1 = r7.getVisibleItems();
        r0.addAll(r1);
        goto L_0x0066;
    L_0x0083:
        r1 = r0;
        goto L_0x0048;
    L_0x0085:
        r2 = r0;
        goto L_0x0011;
    L_0x0087:
        r0 = r2;
        goto L_0x0031;
    L_0x0089:
        r0 = r2;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuBuilder.flagActionItems():void");
    }

    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean dispatchSubMenuSelected(com.actionbarsherlock.internal.view.menu.SubMenuBuilder r7) {
        /*
        r6_this = this;
        r0 = 0;
        r3 = a;
        r1 = r6.mPresenters;	 Catch:{ IllegalArgumentException -> 0x000c }
        r1 = r1.isEmpty();	 Catch:{ IllegalArgumentException -> 0x000c }
        if (r1 == 0) goto L_0x000e;
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r1 = r6.mPresenters;
        r4 = r1.iterator();
        r2 = r0;
    L_0x0015:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x003f;
    L_0x001b:
        r0 = r4.next();
        r0 = (java.lang.ref.WeakReference) r0;
        r1 = r0.get();
        r1 = (com.actionbarsherlock.internal.view.menu.MenuPresenter) r1;
        if (r1 != 0) goto L_0x0030;
    L_0x0029:
        r5 = r6.mPresenters;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5.remove(r0);	 Catch:{ IllegalArgumentException -> 0x003b }
        if (r3 == 0) goto L_0x003d;
    L_0x0030:
        if (r2 != 0) goto L_0x003d;
    L_0x0032:
        r2 = r1.onSubMenuSelected(r7);
        r0 = r2;
    L_0x0037:
        if (r3 != 0) goto L_0x000b;
    L_0x0039:
        r2 = r0;
        goto L_0x0015;
    L_0x003b:
        r0 = move-exception;
        throw r0;
    L_0x003d:
        r0 = r2;
        goto L_0x0037;
    L_0x003f:
        r0 = r2;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuBuilder.dispatchSubMenuSelected(com.actionbarsherlock.internal.view.menu.SubMenuBuilder):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean expandItemActionView(com.actionbarsherlock.internal.view.menu.MenuItemImpl r7) {
        /*
        r6_this = this;
        r0 = 0;
        r3 = a;
        r1 = r6.mPresenters;	 Catch:{ IllegalArgumentException -> 0x000c }
        r1 = r1.isEmpty();	 Catch:{ IllegalArgumentException -> 0x000c }
        if (r1 == 0) goto L_0x000e;
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r6.stopDispatchingItemsChanged();
        r1 = r6.mPresenters;
        r4 = r1.iterator();
        r2 = r0;
    L_0x0018:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x004d;
    L_0x001e:
        r0 = r4.next();
        r0 = (java.lang.ref.WeakReference) r0;
        r1 = r0.get();
        r1 = (com.actionbarsherlock.internal.view.menu.MenuPresenter) r1;
        if (r1 != 0) goto L_0x0033;
    L_0x002c:
        r5 = r6.mPresenters;	 Catch:{ IllegalArgumentException -> 0x0047 }
        r5.remove(r0);	 Catch:{ IllegalArgumentException -> 0x0047 }
        if (r3 == 0) goto L_0x004b;
    L_0x0033:
        r0 = r1.expandItemActionView(r6, r7);
        if (r0 == 0) goto L_0x003b;
    L_0x0039:
        if (r3 == 0) goto L_0x003d;
    L_0x003b:
        if (r3 == 0) goto L_0x0049;
    L_0x003d:
        r6.startDispatchingItemsChanged();	 Catch:{ IllegalArgumentException -> 0x0045 }
        if (r0 == 0) goto L_0x000b;
    L_0x0042:
        r6.mExpandedItem = r7;	 Catch:{ IllegalArgumentException -> 0x0045 }
        goto L_0x000b;
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        r2 = r0;
        goto L_0x0018;
    L_0x004b:
        r0 = r2;
        goto L_0x003b;
    L_0x004d:
        r0 = r2;
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuBuilder.expandItemActionView(com.actionbarsherlock.internal.view.menu.MenuItemImpl):boolean");
    }

    public MenuBuilder getRootMenu() {
        return this;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i, i2, i3, charSequence);
        SubMenu subMenuBuilder = new SubMenuBuilder(this.mContext, this, menuItemImpl);
        menuItemImpl.setSubMenu(subMenuBuilder);
        return subMenuBuilder;
    }

    void setExclusiveItemChecked(MenuItem menuItem) {
        int i = a;
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        int i2 = 0;
        while (i2 < size) {
            MenuItem menuItem2 = (MenuItemImpl) this.mItems.get(i2);
            try {
                if (menuItem2.getGroupId() == groupId) {
                    if (menuItem2.isExclusiveCheckable()) {
                        try {
                            if (menuItem2.isCheckable()) {
                                boolean z;
                                if (menuItem2 == menuItem) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                menuItem2.setCheckedInt(z);
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                }
                int i3 = i2 + 1;
                if (i == 0) {
                    i2 = i3;
                } else {
                    return;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        try {
        }
    }

    Resources getResources() {
        return this.mResources;
    }

    ArrayList getVisibleItems() {
        int i = a;
        try {
            if (!this.mIsVisibleItemsStale) {
                return this.mVisibleItems;
            }
            this.mVisibleItems.clear();
            int size = this.mItems.size();
            int i2 = 0;
            while (i2 < size) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) this.mItems.get(i2);
                try {
                    if (menuItemImpl.isVisible()) {
                        this.mVisibleItems.add(menuItemImpl);
                    }
                    int i3 = i2 + 1;
                    if (i != 0) {
                        break;
                    }
                    i2 = i3;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            this.mIsVisibleItemsStale = false;
            this.mIsActionItemsStale = true;
            return this.mVisibleItems;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean collapseItemActionView(com.actionbarsherlock.internal.view.menu.MenuItemImpl r7) {
        /*
        r6_this = this;
        r0 = 0;
        r3 = a;
        r1 = r6.mPresenters;	 Catch:{ IllegalArgumentException -> 0x0010 }
        r1 = r1.isEmpty();	 Catch:{ IllegalArgumentException -> 0x0010 }
        if (r1 != 0) goto L_0x000f;
    L_0x000b:
        r1 = r6.mExpandedItem;	 Catch:{ IllegalArgumentException -> 0x0012 }
        if (r1 == r7) goto L_0x0014;
    L_0x000f:
        return r0;
    L_0x0010:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0012 }
    L_0x0012:
        r0 = move-exception;
        throw r0;
    L_0x0014:
        r6.stopDispatchingItemsChanged();
        r1 = r6.mPresenters;
        r4 = r1.iterator();
        r2 = r0;
    L_0x001e:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0054;
    L_0x0024:
        r0 = r4.next();
        r0 = (java.lang.ref.WeakReference) r0;
        r1 = r0.get();
        r1 = (com.actionbarsherlock.internal.view.menu.MenuPresenter) r1;
        if (r1 != 0) goto L_0x0039;
    L_0x0032:
        r5 = r6.mPresenters;	 Catch:{ IllegalArgumentException -> 0x004e }
        r5.remove(r0);	 Catch:{ IllegalArgumentException -> 0x004e }
        if (r3 == 0) goto L_0x0052;
    L_0x0039:
        r0 = r1.collapseItemActionView(r6, r7);
        if (r0 == 0) goto L_0x0041;
    L_0x003f:
        if (r3 == 0) goto L_0x0043;
    L_0x0041:
        if (r3 == 0) goto L_0x0050;
    L_0x0043:
        r6.startDispatchingItemsChanged();	 Catch:{ IllegalArgumentException -> 0x004c }
        if (r0 == 0) goto L_0x000f;
    L_0x0048:
        r1 = 0;
        r6.mExpandedItem = r1;	 Catch:{ IllegalArgumentException -> 0x004c }
        goto L_0x000f;
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r2 = r0;
        goto L_0x001e;
    L_0x0052:
        r0 = r2;
        goto L_0x0041;
    L_0x0054:
        r0 = r2;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuBuilder.collapseItemActionView(com.actionbarsherlock.internal.view.menu.MenuItemImpl):boolean");
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return addInternal(i, i2, i3, charSequence);
    }

    public void setGroupVisible(int i, boolean z) {
        Object obj;
        int i2 = a;
        int size = this.mItems.size();
        int i3 = 0;
        Object obj2 = null;
        while (i3 < size) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.mItems.get(i3);
            try {
                if (menuItemImpl.getGroupId() == i && menuItemImpl.setVisibleInt(z)) {
                    obj = 1;
                } else {
                    obj = obj2;
                }
                int i4 = i3 + 1;
                if (i2 != 0) {
                    break;
                }
                i3 = i4;
                obj2 = obj;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        obj = obj2;
        if (obj != null) {
            try {
                onItemsChanged(true);
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    public void close() {
        close(true);
    }

    public MenuItemImpl getExpandedItem() {
        return this.mExpandedItem;
    }

    static {
        String[] strArr = new String[4];
        String str = "%aS|\u0015-k\rc\u001f*z\ro\u00190fX`\f-j@}\u000e%{R}";
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
                        i3 = 68;
                        break;
                    case ay.f /*1*/:
                        i3 = 15;
                        break;
                    case ay.n /*2*/:
                        i3 = 55;
                        break;
                    case ay.p /*3*/:
                        i3 = 14;
                        break;
                    default:
                        i3 = 122;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "%aS|\u0015-k\rc\u001f*z\rk\u00024nYj\u001f nTz\u0013+aAg\u001f3";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "+}Sk\bdkXk\tdaXzZ'`Yz\u001b-a\u0017oZ2n[g\u001edlVz\u001f#`EwT";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    sCategoryToOrder = new int[]{1, 4, 5, 3, 2, 0};
                default:
                    strArr2[i] = str;
                    str = "%aS|\u0015-k\rc\u001f*z\rk\u00024nYj\u001f nTz\u0013+aAg\u001f3";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void removeMenuPresenter(MenuPresenter menuPresenter) {
        int i = a;
        Iterator it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter2 = (MenuPresenter) weakReference.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                try {
                    this.mPresenters.remove(weakReference);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            if (i != 0) {
                return;
            }
        }
    }

    private static int getOrdering(int i) {
        int i2 = (-65536 & i) >> 16;
        try {
            if (i2 >= 0) {
                if (i2 < sCategoryToOrder.length) {
                    return (sCategoryToOrder[i2] << 16) | (65535 & i);
                }
            }
            throw new IllegalArgumentException(z[3]);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        int ordering = getOrdering(i3);
        MenuItem menuItemImpl = new MenuItemImpl(this, i, i2, i3, ordering, charSequence, this.mDefaultShowAsAction);
        try {
            if (this.mCurrentMenuInfo != null) {
                menuItemImpl.setMenuInfo(this.mCurrentMenuInfo);
            }
            this.mItems.add(findInsertIndex(this.mItems, ordering), menuItemImpl);
            onItemsChanged(true);
            return menuItemImpl;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void setQwertyMode(boolean z) {
        this.mQwertyMode = z;
        onItemsChanged(false);
    }

    final void close(boolean r6) {
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
        r5_this = this;
        r2 = a;
        r0 = r5.mIsClosing;	 Catch:{ IllegalArgumentException -> 0x0007 }
        if (r0 == 0) goto L_0x0009;
    L_0x0006:
        return;
    L_0x0007:
        r0 = move-exception;
        throw r0;
    L_0x0009:
        r0 = 1;
        r5.mIsClosing = r0;
        r0 = r5.mPresenters;
        r3 = r0.iterator();
    L_0x0012:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0032;
    L_0x0018:
        r0 = r3.next();
        r0 = (java.lang.ref.WeakReference) r0;
        r1 = r0.get();
        r1 = (com.actionbarsherlock.internal.view.menu.MenuPresenter) r1;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r4 = r5.mPresenters;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r4.remove(r0);	 Catch:{ IllegalArgumentException -> 0x0036 }
        if (r2 == 0) goto L_0x0030;	 Catch:{ IllegalArgumentException -> 0x0036 }
    L_0x002d:
        r1.onCloseMenu(r5, r6);	 Catch:{ IllegalArgumentException -> 0x0036 }
    L_0x0030:
        if (r2 == 0) goto L_0x0012;
    L_0x0032:
        r0 = 0;
        r5.mIsClosing = r0;
        goto L_0x0006;
    L_0x0036:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.view.menu.MenuBuilder.close(boolean):void");
    }

    public MenuBuilder(Context context) {
        int i = a;
        this.mDefaultShowAsAction = 0;
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mOptionalIconsVisible = false;
        this.mIsClosing = false;
        this.mTempShortcutItemList = new ArrayList();
        this.mPresenters = new CopyOnWriteArrayList();
        this.mContext = context;
        this.mResources = context.getResources();
        this.mItems = new ArrayList();
        this.mVisibleItems = new ArrayList();
        this.mIsVisibleItemsStale = true;
        this.mActionItems = new ArrayList();
        this.mNonActionItems = new ArrayList();
        this.mIsActionItemsStale = true;
        setShortcutsVisibleInner(true);
        if (SherlockActivity.a) {
            a = i + 1;
        }
    }

    public boolean performItemAction(MenuItem menuItem, int i) {
        int i2 = a;
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        if (menuItemImpl != null) {
            try {
                if (menuItemImpl.isEnabled()) {
                    boolean invoke = menuItemImpl.invoke();
                    try {
                        boolean expandActionView;
                        if (menuItemImpl.hasCollapsibleActionView()) {
                            expandActionView = menuItemImpl.expandActionView() | invoke;
                            if (!expandActionView) {
                                return expandActionView;
                            }
                            close(true);
                            if (i2 == 0) {
                                return expandActionView;
                            }
                            invoke = expandActionView;
                        }
                        if (menuItem.hasSubMenu()) {
                            close(false);
                            SubMenuBuilder subMenuBuilder = (SubMenuBuilder) menuItem.getSubMenu();
                            ActionProvider actionProvider = menuItem.getActionProvider();
                            if (actionProvider != null) {
                                try {
                                    if (actionProvider.hasSubMenu()) {
                                        actionProvider.onPrepareSubMenu(subMenuBuilder);
                                    }
                                } catch (IllegalArgumentException e) {
                                    throw e;
                                }
                            }
                            expandActionView = dispatchSubMenuSelected(subMenuBuilder) | invoke;
                            if (!expandActionView) {
                                try {
                                    close(true);
                                } catch (IllegalArgumentException e2) {
                                    throw e2;
                                }
                            }
                            if (i2 == 0) {
                                return expandActionView;
                            }
                        }
                        expandActionView = invoke;
                        if ((i & 1) != 0) {
                            return expandActionView;
                        }
                        try {
                            close(true);
                            return expandActionView;
                        } catch (IllegalArgumentException e22) {
                            throw e22;
                        }
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        }
        return false;
    }

    void onItemsChanged(boolean z) {
        try {
            try {
                if (!this.mPreventDispatchingItemsChanged) {
                    if (z) {
                        this.mIsVisibleItemsStale = true;
                        this.mIsActionItemsStale = true;
                    }
                    dispatchPresenterUpdate(z);
                    if (a == 0) {
                        return;
                    }
                }
                this.mItemsChangedWhileDispatchPrevented = true;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    ArrayList getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.mResources.getString(i4));
    }

    public int size() {
        return this.mItems.size();
    }

    private static int findInsertIndex(ArrayList arrayList, int i) {
        int i2 = a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            try {
                if (((MenuItemImpl) arrayList.get(size)).getOrdering() <= i) {
                    return size + 1;
                }
                int i3 = size - 1;
                if (i2 != 0) {
                    break;
                }
                size = i3;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return 0;
    }

    public void saveActionViewStates(Bundle bundle) {
        SparseArray sparseArray;
        int i = a;
        int size = size();
        int i2 = 0;
        SparseArray sparseArray2 = null;
        while (i2 < size) {
            int i3;
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null) {
                try {
                } catch (IllegalArgumentException e) {
                    throw e;
                }
                if (actionView.getId() != -1) {
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                    }
                    try {
                        actionView.saveHierarchyState(sparseArray2);
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                    if (item.isActionViewExpanded()) {
                        bundle.putInt(z[2], item.getItemId());
                        sparseArray = sparseArray2;
                        if (item.hasSubMenu()) {
                            ((SubMenuBuilder) item.getSubMenu()).saveActionViewStates(bundle);
                        }
                        i3 = i2 + 1;
                        if (i != 0) {
                            break;
                        }
                        i2 = i3;
                        sparseArray2 = sparseArray;
                    }
                }
            }
            sparseArray = sparseArray2;
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).saveActionViewStates(bundle);
            }
            i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
            sparseArray2 = sparseArray;
        }
        sparseArray = sparseArray2;
        if (sparseArray != null) {
            try {
                bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
    }
}
