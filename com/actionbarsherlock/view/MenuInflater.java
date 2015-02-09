package com.actionbarsherlock.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;
import org.xmlpull.v1.XmlPullParserException;

public class MenuInflater {
    private static final Class[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    private static final Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    private static final String[] z;
    private final Object[] mActionProviderConstructorArguments;
    private final Object[] mActionViewConstructorArguments;
    private Context mContext;
    private Object mRealOwner;

    class InflatedOnMenuItemClickListener implements OnMenuItemClickListener {
        private static final Class[] PARAM_TYPES;
        private static final String[] z;
        private Method mMethod;
        private Object mRealOwner;

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.mMethod.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.mMethod.invoke(this.mRealOwner, new Object[]{menuItem})).booleanValue();
                }
                this.mMethod.invoke(this.mRealOwner, new Object[]{menuItem});
                return true;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public InflatedOnMenuItemClickListener(Object obj, String str) {
            this.mRealOwner = obj;
            Class cls = obj.getClass();
            try {
                this.mMethod = cls.getMethod(str, PARAM_TYPES);
            } catch (Throwable e) {
                InflateException inflateException = new InflateException(z[1] + str + z[0] + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        static {
            /* JADX: method processing error */
/*
            Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
            /*
            r4 = 1;
            r1 = 0;
            r0 = 2;
            r3 = new java.lang.String[r0];
            r2 = "~\r\u001an\u00192\u0005\u0007=Z";
            r0 = -1;
            r5 = r3;
            r6 = r3;
            r3 = r1;
        L_0x000b:
            r2 = r2.toCharArray();
            r7 = r2.length;
            r8 = r7;
            r9 = r1;
            r7 = r2;
        L_0x0013:
            if (r8 > r9) goto L_0x0037;
        L_0x0015:
            r2 = new java.lang.String;
            r2.<init>(r7);
            r2 = r2.intern();
            switch(r0) {
                case 0: goto L_0x002a;
                default: goto L_0x0021;
            };
        L_0x0021:
            r5[r3] = r2;
            r0 = "\u001d\u000b\u0001\"\u001e0C\u0000n\b;\u0017\u001b\"\f;D\u0019+\u0014+D\u001d:\u001f3D\u001b 92\r\u0017%Z6\u0005\u001a*\u0016;\u0016T";
            r2 = r0;
            r3 = r4;
            r5 = r6;
            r0 = r1;
            goto L_0x000b;
        L_0x002a:
            r5[r3] = r2;
            z = r6;
            r0 = new java.lang.Class[r4];
            r2 = com.actionbarsherlock.view.MenuItem.class;
            r0[r1] = r2;
            PARAM_TYPES = r0;
            return;
        L_0x0037:
            r10 = r7[r9];
            r2 = r9 % 5;
            switch(r2) {
                case 0: goto L_0x0048;
                case 1: goto L_0x004b;
                case 2: goto L_0x004e;
                case 3: goto L_0x0051;
                default: goto L_0x003e;
            };
        L_0x003e:
            r2 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        L_0x0040:
            r2 = r2 ^ r10;
            r2 = (char) r2;
            r7[r9] = r2;
            r2 = r9 + 1;
            r9 = r2;
            goto L_0x0013;
        L_0x0048:
            r2 = 94;
            goto L_0x0040;
        L_0x004b:
            r2 = 100;
            goto L_0x0040;
        L_0x004e:
            r2 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
            goto L_0x0040;
        L_0x0051:
            r2 = 78;
            goto L_0x0040;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.view.MenuInflater.InflatedOnMenuItemClickListener.<clinit>():void");
        }
    }

    class MenuState {
        private static final String[] z;
        private int groupCategory;
        private int groupCheckable;
        private boolean groupEnabled;
        private int groupId;
        private int groupOrder;
        private boolean groupVisible;
        private ActionProvider itemActionProvider;
        private String itemActionProviderClassName;
        private String itemActionViewClassName;
        private int itemActionViewLayout;
        private boolean itemAdded;
        private char itemAlphabeticShortcut;
        private int itemCategoryOrder;
        private int itemCheckable;
        private boolean itemChecked;
        private boolean itemEnabled;
        private int itemIconResId;
        private int itemId;
        private String itemListenerMethodName;
        private char itemNumericShortcut;
        private int itemShowAsAction;
        private CharSequence itemTitle;
        private CharSequence itemTitleCondensed;
        private boolean itemVisible;
        private Menu menu;
        final MenuInflater this$0;

        static {
            String[] strArr = new String[7];
            String str = "R+\u0012mRq(\u0010yoz<";
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
                            i3 = 31;
                            break;
                        case ay.f /*1*/:
                            i3 = 78;
                            break;
                        case ay.n /*2*/:
                            i3 = 124;
                            break;
                        case ay.p /*3*/:
                            i3 = 24;
                            break;
                        default:
                            i3 = 27;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "\\/\u0012vtkn\u0015vhk/\u0012lr~:\u00198xs/\u000fk!?";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "R+\u0012mRq(\u0010yoz<";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        str = "R+\u0012mRq(\u0010yoz<";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "V)\u0012wiv \u001b8zk:\u000eqyj:\u00198<v:\u0019uZ|:\u0015wuI'\u0019oW~7\u0013mo8`\\Yxk'\u0013v;i'\u0019o;~\"\u000e}z{7\\kkz-\u0015~rz*R";
                        obj = 4;
                        break;
                    case aj.i /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "K&\u00198zq*\u000ewr{t\u0013vXs'\u001fs;~:\bjr};\b};|/\u0012vtkn\u001e};j=\u0019|;h'\bprqn\u001d8iz=\bjr|:\u0019|;|!\u0012l~g:";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case aV.r /*5*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "V)\u0012wiv \u001b8zk:\u000eqyj:\u00198<~-\bqtq\u001e\u000ewmv*\u0019jXs/\u000fk<1n={ov!\u00128mv+\u000b8zs<\u0019y\u007ffn\u000fh~|'\u001aq~{`";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public boolean hasAddedItem() {
            return this.itemAdded;
        }

        static ActionProvider access$000(MenuState menuState) {
            return menuState.itemActionProvider;
        }

        public SubMenu addSubMenuItem() {
            this.itemAdded = true;
            SubMenu addSubMenu = this.menu.addSubMenu(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle);
            setItem(addSubMenu.getItem());
            return addSubMenu;
        }

        private Object newInstance(String str, Class[] clsArr, Object[] objArr) {
            try {
                return MenuInflater.access$100(this.this$0).getClassLoader().loadClass(str).getConstructor(clsArr).newInstance(objArr);
            } catch (Throwable e) {
                Log.w(z[3], z[2] + str, e);
                return null;
            }
        }

        public void addItem() {
            this.itemAdded = true;
            setItem(this.menu.add(this.groupId, this.itemId, this.itemCategoryOrder, this.itemTitle));
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void readItem(android.util.AttributeSet r10) {
            /*
            r9_this = this;
            r8 = 3;
            r3 = 0;
            r2 = 1;
            r1 = 0;
            r4 = com.actionbarsherlock.view.ActionMode.a;
            r0 = r9.this$0;
            r0 = com.actionbarsherlock.view.MenuInflater.access$100(r0);
            r5 = com.actionbarsherlock.R.styleable.SherlockMenuItem;
            r5 = r0.obtainStyledAttributes(r10, r5);
            r0 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_id;
            r0 = r5.getResourceId(r0, r1);
            r9.itemId = r0;
            r0 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_menuCategory;
            r6 = r9.groupCategory;
            r0 = r5.getInt(r0, r6);
            r6 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_orderInCategory;
            r7 = r9.groupOrder;
            r6 = r5.getInt(r6, r7);
            r7 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
            r0 = r0 & r7;
            r7 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
            r6 = r6 & r7;
            r0 = r0 | r6;
            r9.itemCategoryOrder = r0;	 Catch:{ IllegalStateException -> 0x012d }
            r0 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_title;	 Catch:{ IllegalStateException -> 0x012d }
            r0 = r5.getText(r0);	 Catch:{ IllegalStateException -> 0x012d }
            r9.itemTitle = r0;	 Catch:{ IllegalStateException -> 0x012d }
            r0 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_titleCondensed;	 Catch:{ IllegalStateException -> 0x012d }
            r0 = r5.getText(r0);	 Catch:{ IllegalStateException -> 0x012d }
            r9.itemTitleCondensed = r0;	 Catch:{ IllegalStateException -> 0x012d }
            r0 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_icon;	 Catch:{ IllegalStateException -> 0x012d }
            r6 = 0;
            r0 = r5.getResourceId(r0, r6);	 Catch:{ IllegalStateException -> 0x012d }
            r9.itemIconResId = r0;	 Catch:{ IllegalStateException -> 0x012d }
            r0 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_alphabeticShortcut;	 Catch:{ IllegalStateException -> 0x012d }
            r0 = r5.getString(r0);	 Catch:{ IllegalStateException -> 0x012d }
            r0 = r9.getShortcut(r0);	 Catch:{ IllegalStateException -> 0x012d }
            r9.itemAlphabeticShortcut = r0;	 Catch:{ IllegalStateException -> 0x012d }
            r0 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_numericShortcut;	 Catch:{ IllegalStateException -> 0x012d }
            r0 = r5.getString(r0);	 Catch:{ IllegalStateException -> 0x012d }
            r0 = r9.getShortcut(r0);	 Catch:{ IllegalStateException -> 0x012d }
            r9.itemNumericShortcut = r0;	 Catch:{ IllegalStateException -> 0x012d }
            r0 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_checkable;	 Catch:{ IllegalStateException -> 0x012d }
            r0 = r5.hasValue(r0);	 Catch:{ IllegalStateException -> 0x012d }
            if (r0 == 0) goto L_0x0082;
        L_0x006d:
            r0 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_checkable;	 Catch:{ IllegalStateException -> 0x012f }
            r6 = 0;
            r0 = r5.getBoolean(r0, r6);	 Catch:{ IllegalStateException -> 0x012f }
            if (r0 == 0) goto L_0x0131;
        L_0x0076:
            r0 = r2;
        L_0x0077:
            r9.itemCheckable = r0;	 Catch:{ IllegalStateException -> 0x0134 }
            if (r4 == 0) goto L_0x0086;
        L_0x007b:
            r0 = com.actionbarsherlock.app.SherlockActivity.a;	 Catch:{ IllegalStateException -> 0x0136 }
            if (r0 == 0) goto L_0x0138;
        L_0x007f:
            r0 = r1;
        L_0x0080:
            com.actionbarsherlock.app.SherlockActivity.a = r0;
        L_0x0082:
            r0 = r9.groupCheckable;
            r9.itemCheckable = r0;
        L_0x0086:
            r0 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_checked;
            r0 = r5.getBoolean(r0, r1);
            r9.itemChecked = r0;
            r0 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_visible;
            r6 = r9.groupVisible;
            r0 = r5.getBoolean(r0, r6);
            r9.itemVisible = r0;
            r0 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_enabled;
            r6 = r9.groupEnabled;
            r0 = r5.getBoolean(r0, r6);
            r9.itemEnabled = r0;
            r0 = new android.util.TypedValue;
            r0.<init>();
            r6 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_showAsAction;	 Catch:{ IllegalStateException -> 0x013b }
            r5.getValue(r6, r0);	 Catch:{ IllegalStateException -> 0x013b }
            r6 = r0.type;	 Catch:{ IllegalStateException -> 0x013b }
            r7 = 17;
            if (r6 != r7) goto L_0x013d;
        L_0x00b2:
            r0 = r0.data;	 Catch:{ IllegalStateException -> 0x013b }
        L_0x00b4:
            r9.itemShowAsAction = r0;
            r0 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_onClick;
            r0 = r5.getString(r0);
            r9.itemListenerMethodName = r0;
            r0 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_actionLayout;
            r0 = r5.getResourceId(r0, r1);
            r9.itemActionViewLayout = r0;
            r0 = new android.util.TypedValue;
            r0.<init>();
            r6 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_actionViewClass;	 Catch:{ IllegalStateException -> 0x0140 }
            r5.getValue(r6, r0);	 Catch:{ IllegalStateException -> 0x0140 }
            r6 = r0.type;	 Catch:{ IllegalStateException -> 0x0140 }
            if (r6 != r8) goto L_0x0142;
        L_0x00d4:
            r0 = r0.string;	 Catch:{ IllegalStateException -> 0x0140 }
            r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0140 }
        L_0x00da:
            r9.itemActionViewClassName = r0;
            r0 = new android.util.TypedValue;
            r0.<init>();
            r6 = com.actionbarsherlock.R.styleable.SherlockMenuItem_android_actionProviderClass;	 Catch:{ IllegalStateException -> 0x0144 }
            r5.getValue(r6, r0);	 Catch:{ IllegalStateException -> 0x0144 }
            r6 = r0.type;	 Catch:{ IllegalStateException -> 0x0144 }
            if (r6 != r8) goto L_0x0146;
        L_0x00ea:
            r0 = r0.string;	 Catch:{ IllegalStateException -> 0x0144 }
            r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0144 }
        L_0x00f0:
            r9.itemActionProviderClassName = r0;	 Catch:{ IllegalStateException -> 0x0148 }
            r0 = r9.itemActionProviderClassName;	 Catch:{ IllegalStateException -> 0x0148 }
            if (r0 == 0) goto L_0x014a;
        L_0x00f6:
            if (r2 == 0) goto L_0x0116;
        L_0x00f8:
            r0 = r9.itemActionViewLayout;	 Catch:{ IllegalStateException -> 0x014c }
            if (r0 != 0) goto L_0x0116;
        L_0x00fc:
            r0 = r9.itemActionViewClassName;	 Catch:{ IllegalStateException -> 0x014e }
            if (r0 != 0) goto L_0x0116;
        L_0x0100:
            r0 = r9.itemActionProviderClassName;	 Catch:{ IllegalStateException -> 0x0150 }
            r6 = com.actionbarsherlock.view.MenuInflater.access$200();	 Catch:{ IllegalStateException -> 0x0150 }
            r7 = r9.this$0;	 Catch:{ IllegalStateException -> 0x0150 }
            r7 = com.actionbarsherlock.view.MenuInflater.access$300(r7);	 Catch:{ IllegalStateException -> 0x0150 }
            r0 = r9.newInstance(r0, r6, r7);	 Catch:{ IllegalStateException -> 0x0150 }
            r0 = (com.actionbarsherlock.view.ActionProvider) r0;	 Catch:{ IllegalStateException -> 0x0150 }
            r9.itemActionProvider = r0;	 Catch:{ IllegalStateException -> 0x0150 }
            if (r4 == 0) goto L_0x0127;
        L_0x0116:
            if (r2 == 0) goto L_0x0125;
        L_0x0118:
            r0 = z;	 Catch:{ IllegalStateException -> 0x0152 }
            r2 = 0;
            r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0152 }
            r2 = z;	 Catch:{ IllegalStateException -> 0x0152 }
            r4 = 1;
            r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x0152 }
            android.util.Log.w(r0, r2);	 Catch:{ IllegalStateException -> 0x0152 }
        L_0x0125:
            r9.itemActionProvider = r3;
        L_0x0127:
            r5.recycle();
            r9.itemAdded = r1;
            return;
        L_0x012d:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x012f }
        L_0x012f:
            r0 = move-exception;
            throw r0;
        L_0x0131:
            r0 = r1;
            goto L_0x0077;
        L_0x0134:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0136 }
        L_0x0136:
            r0 = move-exception;
            throw r0;
        L_0x0138:
            r0 = r2;
            goto L_0x0080;
        L_0x013b:
            r0 = move-exception;
            throw r0;
        L_0x013d:
            r0 = -1;
            goto L_0x00b4;
        L_0x0140:
            r0 = move-exception;
            throw r0;
        L_0x0142:
            r0 = r3;
            goto L_0x00da;
        L_0x0144:
            r0 = move-exception;
            throw r0;
        L_0x0146:
            r0 = r3;
            goto L_0x00f0;
        L_0x0148:
            r0 = move-exception;
            throw r0;
        L_0x014a:
            r2 = r1;
            goto L_0x00f6;
        L_0x014c:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x014e }
        L_0x014e:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0150 }
        L_0x0150:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0152 }
        L_0x0152:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.view.MenuInflater.MenuState.readItem(android.util.AttributeSet):void");
        }

        public MenuState(MenuInflater menuInflater, Menu menu) {
            this.this$0 = menuInflater;
            this.menu = menu;
            resetGroup();
        }

        public void resetGroup() {
            this.groupId = 0;
            this.groupCategory = 0;
            this.groupOrder = 0;
            this.groupCheckable = 0;
            this.groupVisible = true;
            this.groupEnabled = true;
        }

        private char getShortcut(String str) {
            return str == null ? '\u0000' : str.charAt(0);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void setItem(com.actionbarsherlock.view.MenuItem r8) {
            /*
            r7_this = this;
            r2 = 0;
            r1 = 1;
            r3 = com.actionbarsherlock.view.ActionMode.a;
            r0 = r7.itemChecked;	 Catch:{ IllegalStateException -> 0x005c }
            r0 = r8.setChecked(r0);	 Catch:{ IllegalStateException -> 0x005c }
            r4 = r7.itemVisible;	 Catch:{ IllegalStateException -> 0x005c }
            r0 = r0.setVisible(r4);	 Catch:{ IllegalStateException -> 0x005c }
            r4 = r7.itemEnabled;	 Catch:{ IllegalStateException -> 0x005c }
            r4 = r0.setEnabled(r4);	 Catch:{ IllegalStateException -> 0x005c }
            r0 = r7.itemCheckable;	 Catch:{ IllegalStateException -> 0x005c }
            if (r0 < r1) goto L_0x005e;
        L_0x001a:
            r0 = r1;
        L_0x001b:
            r0 = r4.setCheckable(r0);	 Catch:{ IllegalStateException -> 0x0060 }
            r4 = r7.itemTitleCondensed;	 Catch:{ IllegalStateException -> 0x0060 }
            r0 = r0.setTitleCondensed(r4);	 Catch:{ IllegalStateException -> 0x0060 }
            r4 = r7.itemIconResId;	 Catch:{ IllegalStateException -> 0x0060 }
            r0 = r0.setIcon(r4);	 Catch:{ IllegalStateException -> 0x0060 }
            r4 = r7.itemAlphabeticShortcut;	 Catch:{ IllegalStateException -> 0x0060 }
            r0 = r0.setAlphabeticShortcut(r4);	 Catch:{ IllegalStateException -> 0x0060 }
            r4 = r7.itemNumericShortcut;	 Catch:{ IllegalStateException -> 0x0060 }
            r0.setNumericShortcut(r4);	 Catch:{ IllegalStateException -> 0x0060 }
            r0 = r7.itemShowAsAction;	 Catch:{ IllegalStateException -> 0x0060 }
            if (r0 < 0) goto L_0x003f;
        L_0x003a:
            r0 = r7.itemShowAsAction;	 Catch:{ IllegalStateException -> 0x0060 }
            r8.setShowAsAction(r0);	 Catch:{ IllegalStateException -> 0x0060 }
        L_0x003f:
            r0 = r7.itemListenerMethodName;	 Catch:{ IllegalStateException -> 0x0062 }
            if (r0 == 0) goto L_0x0074;
        L_0x0043:
            r0 = r7.this$0;	 Catch:{ IllegalStateException -> 0x005a }
            r0 = com.actionbarsherlock.view.MenuInflater.access$100(r0);	 Catch:{ IllegalStateException -> 0x005a }
            r0 = r0.isRestricted();	 Catch:{ IllegalStateException -> 0x005a }
            if (r0 == 0) goto L_0x0064;
        L_0x004f:
            r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x005a }
            r1 = z;	 Catch:{ IllegalStateException -> 0x005a }
            r2 = 6;
            r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x005a }
            r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x005a }
            throw r0;	 Catch:{ IllegalStateException -> 0x005a }
        L_0x005a:
            r0 = move-exception;
            throw r0;
        L_0x005c:
            r0 = move-exception;
            throw r0;
        L_0x005e:
            r0 = r2;
            goto L_0x001b;
        L_0x0060:
            r0 = move-exception;
            throw r0;
        L_0x0062:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x005a }
        L_0x0064:
            r0 = new com.actionbarsherlock.view.MenuInflater$InflatedOnMenuItemClickListener;
            r4 = r7.this$0;
            r4 = com.actionbarsherlock.view.MenuInflater.access$400(r4);
            r5 = r7.itemListenerMethodName;
            r0.<init>(r4, r5);
            r8.setOnMenuItemClickListener(r0);
        L_0x0074:
            r0 = r7.itemCheckable;	 Catch:{ IllegalStateException -> 0x00cd }
            r4 = 2;
            if (r0 < r4) goto L_0x008f;
        L_0x0079:
            r0 = r8 instanceof com.actionbarsherlock.internal.view.menu.MenuItemImpl;	 Catch:{ IllegalStateException -> 0x00cd }
            if (r0 == 0) goto L_0x0086;
        L_0x007d:
            r0 = r8;
            r0 = (com.actionbarsherlock.internal.view.menu.MenuItemImpl) r0;
            r4 = 1;
            r0.setExclusiveCheckable(r4);	 Catch:{ IllegalStateException -> 0x00cf }
            if (r3 == 0) goto L_0x008f;
        L_0x0086:
            r0 = r7.menu;	 Catch:{ IllegalStateException -> 0x00cf }
            r4 = r7.groupId;	 Catch:{ IllegalStateException -> 0x00cf }
            r5 = 1;
            r6 = 1;
            r0.setGroupCheckable(r4, r5, r6);	 Catch:{ IllegalStateException -> 0x00cf }
        L_0x008f:
            r0 = r7.itemActionViewClassName;
            if (r0 == 0) goto L_0x00d7;
        L_0x0093:
            r0 = r7.itemActionViewClassName;
            r2 = com.actionbarsherlock.view.MenuInflater.access$500();
            r4 = r7.this$0;
            r4 = com.actionbarsherlock.view.MenuInflater.access$600(r4);
            r0 = r7.newInstance(r0, r2, r4);
            r0 = (android.view.View) r0;
            r8.setActionView(r0);
            r0 = r1;
        L_0x00a9:
            r1 = r7.itemActionViewLayout;	 Catch:{ IllegalStateException -> 0x00d1 }
            if (r1 <= 0) goto L_0x00c3;
        L_0x00ad:
            if (r0 != 0) goto L_0x00b6;
        L_0x00af:
            r0 = r7.itemActionViewLayout;
            r8.setActionView(r0);
            if (r3 == 0) goto L_0x00c3;
        L_0x00b6:
            r0 = z;	 Catch:{ IllegalStateException -> 0x00d3 }
            r1 = 4;
            r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x00d3 }
            r1 = z;	 Catch:{ IllegalStateException -> 0x00d3 }
            r2 = 5;
            r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x00d3 }
            android.util.Log.w(r0, r1);	 Catch:{ IllegalStateException -> 0x00d3 }
        L_0x00c3:
            r0 = r7.itemActionProvider;	 Catch:{ IllegalStateException -> 0x00d5 }
            if (r0 == 0) goto L_0x00cc;
        L_0x00c7:
            r0 = r7.itemActionProvider;	 Catch:{ IllegalStateException -> 0x00d5 }
            r8.setActionProvider(r0);	 Catch:{ IllegalStateException -> 0x00d5 }
        L_0x00cc:
            return;
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
            r0 = move-exception;
            throw r0;
        L_0x00d7:
            r0 = r2;
            goto L_0x00a9;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.view.MenuInflater.MenuState.setItem(com.actionbarsherlock.view.MenuItem):void");
        }

        public void readGroup(AttributeSet attributeSet) {
            boolean z = false;
            boolean z2 = ActionMode.a;
            TypedArray obtainStyledAttributes = MenuInflater.access$100(this.this$0).obtainStyledAttributes(attributeSet, R.styleable.SherlockMenuGroup);
            try {
                this.groupId = obtainStyledAttributes.getResourceId(R.styleable.SherlockMenuGroup_android_id, 0);
                this.groupCategory = obtainStyledAttributes.getInt(R.styleable.SherlockMenuGroup_android_menuCategory, 0);
                this.groupOrder = obtainStyledAttributes.getInt(R.styleable.SherlockMenuGroup_android_orderInCategory, 0);
                this.groupCheckable = obtainStyledAttributes.getInt(R.styleable.SherlockMenuGroup_android_checkableBehavior, 0);
                this.groupVisible = obtainStyledAttributes.getBoolean(R.styleable.SherlockMenuGroup_android_visible, true);
                this.groupEnabled = obtainStyledAttributes.getBoolean(R.styleable.SherlockMenuGroup_android_enabled, true);
                obtainStyledAttributes.recycle();
                if (SherlockActivity.a) {
                    if (!z2) {
                        z = true;
                    }
                    ActionMode.a = z;
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
    }

    static Class[] access$500() {
        return ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    }

    static Object[] access$300(MenuInflater menuInflater) {
        return menuInflater.mActionProviderConstructorArguments;
    }

    static {
        String[] strArr = new String[11];
        String str = "|A\u001d\u000e";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 17;
                        break;
                    case ay.f /*1*/:
                        i4 = 36;
                        break;
                    case ay.n /*2*/:
                        i4 = 115;
                        break;
                    case ay.p /*3*/:
                        i4 = 123;
                        break;
                    default:
                        i4 = 18;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "T\\\u0003\u001eqeM\u001d\u001c2|A\u001d\u000e>1C\u001c\u000f2";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "vV\u001c\u000eb";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "|A\u001d\u000e";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "DJ\u0016\u0003btG\u0007\u001ev1A\u001d\u001f2~BS\u001f}rQ\u001e\u001e|e";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "|A\u001d\u000e";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "xP\u0016\u0016";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "xP\u0016\u0016";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "TV\u0001\u0014`1M\u001d\u001d~pP\u001a\u0015u1I\u0016\u0015g1|>7";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "TV\u0001\u0014`1M\u001d\u001d~pP\u001a\u0015u1I\u0016\u0015g1|>7";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ACTION_VIEW_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class};
                    ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
                default:
                    strArr2[i2] = str;
                    str = "vV\u001c\u000eb";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    static Object access$400(MenuInflater menuInflater) {
        return menuInflater.mRealOwner;
    }

    static Context access$100(MenuInflater menuInflater) {
        return menuInflater.mContext;
    }

    public MenuInflater(Context context) {
        this.mContext = context;
        this.mRealOwner = context;
        this.mActionViewConstructorArguments = new Object[]{context};
        this.mActionProviderConstructorArguments = this.mActionViewConstructorArguments;
    }

    static Class[] access$200() {
        return ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    }

    public void inflate(int i, Menu menu) {
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.mContext.getResources().getLayout(i);
            parseMenu(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (Throwable e) {
            throw new InflateException(z[10], e);
        } catch (Throwable e2) {
            throw new InflateException(z[9], e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                try {
                    xmlResourceParser.close();
                } catch (XmlPullParserException e3) {
                    throw e3;
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parseMenu(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, com.actionbarsherlock.view.Menu r15) {
        /*
        r12_this = this;
        r5 = 0;
        r1 = 2;
        r2 = 1;
        r6 = 0;
        r7 = com.actionbarsherlock.view.ActionMode.a;
        r8 = new com.actionbarsherlock.view.MenuInflater$MenuState;
        r8.<init>(r12, r15);
        r0 = r13.getEventType();
    L_0x000f:
        if (r0 != r1) goto L_0x0044;
    L_0x0011:
        r1 = r13.getName();
        r0 = z;
        r3 = 6;
        r0 = r0[r3];
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0026;
    L_0x0020:
        r0 = r13.next();
        if (r7 == 0) goto L_0x004a;
    L_0x0026:
        r0 = new java.lang.RuntimeException;	 Catch:{ InflateException -> 0x0042 }
        r2 = new java.lang.StringBuilder;	 Catch:{ InflateException -> 0x0042 }
        r2.<init>();	 Catch:{ InflateException -> 0x0042 }
        r3 = z;	 Catch:{ InflateException -> 0x0042 }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ InflateException -> 0x0042 }
        r2 = r2.append(r3);	 Catch:{ InflateException -> 0x0042 }
        r1 = r2.append(r1);	 Catch:{ InflateException -> 0x0042 }
        r1 = r1.toString();	 Catch:{ InflateException -> 0x0042 }
        r0.<init>(r1);	 Catch:{ InflateException -> 0x0042 }
        throw r0;	 Catch:{ InflateException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r0 = r13.next();
        if (r0 != r2) goto L_0x000f;
    L_0x004a:
        r4 = r6;
        r1 = r5;
        r3 = r6;
    L_0x004d:
        if (r4 != 0) goto L_0x0059;
    L_0x004f:
        switch(r0) {
            case 1: goto L_0x00fc;
            case 2: goto L_0x005a;
            case 3: goto L_0x011e;
            default: goto L_0x0052;
        };
    L_0x0052:
        r0 = r4;
    L_0x0053:
        r4 = r13.next();
        if (r7 == 0) goto L_0x0122;
    L_0x0059:
        return;
    L_0x005a:
        if (r3 == 0) goto L_0x005e;
    L_0x005c:
        if (r7 == 0) goto L_0x0052;
    L_0x005e:
        r0 = r13.getName();
        r9 = z;	 Catch:{ InflateException -> 0x00a9 }
        r10 = 3;
        r9 = r9[r10];	 Catch:{ InflateException -> 0x00a9 }
        r9 = r0.equals(r9);	 Catch:{ InflateException -> 0x00a9 }
        if (r9 == 0) goto L_0x0072;
    L_0x006d:
        r8.readGroup(r14);	 Catch:{ InflateException -> 0x00ab }
        if (r7 == 0) goto L_0x0052;
    L_0x0072:
        r9 = z;	 Catch:{ InflateException -> 0x00ad }
        r10 = 7;
        r9 = r9[r10];	 Catch:{ InflateException -> 0x00ad }
        r9 = r0.equals(r9);	 Catch:{ InflateException -> 0x00ad }
        if (r9 == 0) goto L_0x0082;
    L_0x007d:
        r8.readItem(r14);	 Catch:{ InflateException -> 0x00af }
        if (r7 == 0) goto L_0x0052;
    L_0x0082:
        r9 = z;	 Catch:{ InflateException -> 0x00af }
        r10 = 0;
        r9 = r9[r10];	 Catch:{ InflateException -> 0x00af }
        r9 = r0.equals(r9);	 Catch:{ InflateException -> 0x00af }
        if (r9 == 0) goto L_0x0096;
    L_0x008d:
        r9 = r8.addSubMenuItem();
        r12.parseMenu(r13, r14, r9);
        if (r7 == 0) goto L_0x0052;
    L_0x0096:
        if (r7 == 0) goto L_0x0119;
    L_0x0098:
        r1 = r2;
    L_0x0099:
        r3 = r13.getName();
        if (r1 == 0) goto L_0x00b3;
    L_0x009f:
        r9 = r3.equals(r0);	 Catch:{ InflateException -> 0x00b1 }
        if (r9 == 0) goto L_0x00b3;
    L_0x00a5:
        r0 = r4;
        r1 = r5;
        r3 = r6;
        goto L_0x0053;
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;
    L_0x00b1:
        r0 = move-exception;
        throw r0;
    L_0x00b3:
        r9 = z;	 Catch:{ InflateException -> 0x0109 }
        r10 = 1;
        r9 = r9[r10];	 Catch:{ InflateException -> 0x0109 }
        r9 = r3.equals(r9);	 Catch:{ InflateException -> 0x0109 }
        if (r9 == 0) goto L_0x00c3;
    L_0x00be:
        r8.resetGroup();	 Catch:{ InflateException -> 0x010b }
        if (r7 == 0) goto L_0x012c;
    L_0x00c3:
        r9 = z;	 Catch:{ InflateException -> 0x010d }
        r10 = 8;
        r9 = r9[r10];	 Catch:{ InflateException -> 0x010d }
        r9 = r3.equals(r9);	 Catch:{ InflateException -> 0x010d }
        if (r9 == 0) goto L_0x00ef;
    L_0x00cf:
        r9 = r8.hasAddedItem();	 Catch:{ InflateException -> 0x010f }
        if (r9 != 0) goto L_0x012c;
    L_0x00d5:
        r9 = com.actionbarsherlock.view.MenuInflater.MenuState.access$000(r8);	 Catch:{ InflateException -> 0x0111 }
        if (r9 == 0) goto L_0x00ea;
    L_0x00db:
        r9 = com.actionbarsherlock.view.MenuInflater.MenuState.access$000(r8);	 Catch:{ InflateException -> 0x0113 }
        r9 = r9.hasSubMenu();	 Catch:{ InflateException -> 0x0113 }
        if (r9 == 0) goto L_0x00ea;
    L_0x00e5:
        r8.addSubMenuItem();	 Catch:{ InflateException -> 0x0115 }
        if (r7 == 0) goto L_0x012c;
    L_0x00ea:
        r8.addItem();	 Catch:{ InflateException -> 0x0117 }
        if (r7 == 0) goto L_0x012c;
    L_0x00ef:
        r9 = z;	 Catch:{ InflateException -> 0x0117 }
        r10 = 4;
        r9 = r9[r10];	 Catch:{ InflateException -> 0x0117 }
        r3 = r3.equals(r9);	 Catch:{ InflateException -> 0x0117 }
        if (r3 == 0) goto L_0x012c;
    L_0x00fa:
        if (r7 == 0) goto L_0x0127;
    L_0x00fc:
        r0 = new java.lang.RuntimeException;	 Catch:{ InflateException -> 0x0107 }
        r1 = z;	 Catch:{ InflateException -> 0x0107 }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ InflateException -> 0x0107 }
        r0.<init>(r1);	 Catch:{ InflateException -> 0x0107 }
        throw r0;	 Catch:{ InflateException -> 0x0107 }
    L_0x0107:
        r0 = move-exception;
        throw r0;
    L_0x0109:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x010b }
    L_0x010b:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x010d }
    L_0x010d:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x010f }
    L_0x010f:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x0111 }
    L_0x0111:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x0113 }
    L_0x0113:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x0115 }
    L_0x0115:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x0117 }
    L_0x0117:
        r0 = move-exception;
        throw r0;
    L_0x0119:
        r1 = r0;
        r3 = r2;
        r0 = r4;
        goto L_0x0053;
    L_0x011e:
        r0 = r1;
        r1 = r3;
        goto L_0x0099;
    L_0x0122:
        r11 = r0;
        r0 = r4;
        r4 = r11;
        goto L_0x004d;
    L_0x0127:
        r3 = r1;
        r1 = r0;
        r0 = r2;
        goto L_0x0053;
    L_0x012c:
        r3 = r1;
        r1 = r0;
        r0 = r4;
        goto L_0x0053;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.view.MenuInflater.parseMenu(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, com.actionbarsherlock.view.Menu):void");
    }

    public MenuInflater(Context context, Object obj) {
        this.mContext = context;
        this.mRealOwner = obj;
        this.mActionViewConstructorArguments = new Object[]{context};
        this.mActionProviderConstructorArguments = this.mActionViewConstructorArguments;
    }

    static Object[] access$600(MenuInflater menuInflater) {
        return menuInflater.mActionViewConstructorArguments;
    }
}
