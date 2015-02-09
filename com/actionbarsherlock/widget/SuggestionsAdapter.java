package com.actionbarsherlock.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.widget.ResourceCursorAdapter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.vk;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.WeakHashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class SuggestionsAdapter extends ResourceCursorAdapter implements OnClickListener {
    private static final String[] z;
    private boolean mClosed;
    private int mFlagsCol;
    private int mIconName1Col;
    private int mIconName2Col;
    private WeakHashMap mOutsideDrawablesCache;
    private Context mProviderContext;
    private int mQueryRefinement;
    private SearchView mSearchView;
    private int mText1Col;
    private int mText2Col;
    private int mText2UrlCol;
    private ColorStateList mUrlColor;

    final class ChildViewCache {
        public final ImageView mIcon1;
        public final ImageView mIcon2;
        public final ImageView mIconRefine;
        public final TextView mText1;
        public final TextView mText2;

        public ChildViewCache(View view) {
            this.mText1 = (TextView) view.findViewById(16908308);
            this.mText2 = (TextView) view.findViewById(16908309);
            this.mIcon1 = (ImageView) view.findViewById(16908295);
            this.mIcon2 = (ImageView) view.findViewById(16908296);
            this.mIconRefine = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    static {
        String[] strArr = new String[40];
        String str = "v#\u001cM8V\"\u0012E3V\u0017\u001fK-Q3\t";
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
                        i3 = 37;
                        break;
                    case ay.f /*1*/:
                        i3 = 86;
                        break;
                    case ay.n /*2*/:
                        i3 = 123;
                        break;
                    case ay.p /*3*/:
                        i3 = 42;
                        break;
                    default:
                        i3 = 93;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "L8$Z/J1\tO.V";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "V3\u001aX>M\t\b_:B3\b^\u0002T#\u001eX$";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "F9\u0015^8K\"";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "I?\u0016C)";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "D8\u001fX2L2UX8V9\u000eX>@lT\u0005";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "l5\u0014D}W3\bE(W5\u001e\n3J\"[L2P8\u001f\u0010}";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "v#\u001cM8V\"\u0012E3V\u0017\u001fK-Q3\t";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "v#\u001cM8V\"\u0012E3V\u0017\u001fK-Q3\t";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "v3\u001aX>Mv\b_:B3\b^4J8\b\n,P3\tS}Q>\tO*\u00057\u0015\n8]5\u001eZ)L9\u0015\u0004";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "k9[Z<F=\u001aM8\u00050\u0014_3Av\u001dE/\u00057\u000e^5J$\u0012^$\u001fv";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "v?\u0015M1@v\u000bK)Mv\bO:H3\u0015^}L%[D2Qv\u001a\n/@%\u0014_/F3[c\u0019\u001fv";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "k9[Z<Q>A\n";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "h9\tO}Q>\u001aD}Q!\u0014\n-D\"\u0013\n.@1\u0016O3Q%A\n";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "k9[X8V9\u000eX>@v\u001dE(K2[L2Wl[";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "k9[K(Q>\u0014X4Q/A\n";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "V#\u001cM8V\"$C3Q3\u0015^\u0002T#\u001eX$";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "P8\u001eR-@5\u000fO9\u00053\tX2Wv\tO)W?\u001e\\4K1[\\<I?\u001f\n>J:\u000eG3\u00050\tE0\u00055\u000eX.J$W\n9L2[^5@v\tO0J\"\u001e\n-W9\u0018O.Vv\u001fC8\u001a";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "v#\u001cM8V\"\u0012E3V\u0017\u001fK-Q3\t";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "@$\tE/\u00055\u0013K3B?\u0015M}F#\tY2Wv\u001aD9\u00055\u001aI5L8\u001c\n>J:\u000eG3V";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "V#\u001cM8V\"$^8]\"$\u0018";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "V#\u001cM8V\"$^8]\"$\u0018\u0002P$\u0017";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "q$\u0012O9\u0005\"\u0014\n>M7\u0015M8\u00055\u000eX.J$[K;Q3\t\n<A7\u000b^8Wv\fK.\u00055\u0017E.@2U";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "v#\u001cM8V\"\u0012E3V\u0017\u001fK-Q3\t";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "V#\u001cM8V\"$^8]\"$\u001b";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "V#\u001cM8V\"$C>J8$\u001b";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "V#\u001cM8V\"$L1D1\b";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "v#\u001cM8V\"\u0012E3V\u0017\u001fK-Q3\t";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "V#\u001cM8V\"$C>J8$\u0018";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "D8\u001fX2L2UX8V9\u000eX>@";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "w3\bE(W5\u001e\n9J3\b\n3J\"[O%L%\u000f\u0010}";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\tv";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "v#\u001cM8V\"\u0012E3V\u0017\u001fK-Q3\t";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "l5\u0014D}K9\u000f\n;J#\u0015Ng\u0005";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "`$\tE/\u00055\u0017E.L8\u001c\n4F9\u0015\n.Q$\u001eK0\u00050\u0014X}";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "`$\tE/\u00055\u0017E.L8\u001c\n4F9\u0015\n.Q$\u001eK0\u00050\u0014X}";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    str = "c7\u0012F8Av\u000fE}J&\u001eD}";
                    obj = 36;
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    strArr2 = strArr3;
                    str = "v#\u001cM8V\"\u0012E3V\u0017\u001fK-Q3\t";
                    obj = 37;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "v#\u001cM8V\"\u0012E3V\u0017\u001fK-Q3\t";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "v3\u001aX>Mv\b_:B3\b^4J8\b\n>P$\bE/\u0005\"\u0013X8Rv\u001eR>@&\u000fC2Kx";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private CharSequence formatUrl(CharSequence charSequence) {
        if (this.mUrlColor == null) {
            TypedValue typedValue = new TypedValue();
            this.mContext.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
            this.mUrlColor = this.mContext.getResources().getColorStateList(typedValue.resourceId);
        }
        CharSequence spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.mUrlColor, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        updateSpinnerState(getCursor());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable getTheDrawable(android.net.Uri r8) {
        /*
        r7_this = this;
        r6 = 1;
        r5 = 0;
        r2 = r8.getAuthority();
        r0 = android.text.TextUtils.isEmpty(r2);	 Catch:{ NameNotFoundException -> 0x0029 }
        if (r0 == 0) goto L_0x002b;
    L_0x000c:
        r0 = new java.io.FileNotFoundException;	 Catch:{ NameNotFoundException -> 0x0029 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x0029 }
        r1.<init>();	 Catch:{ NameNotFoundException -> 0x0029 }
        r2 = z;	 Catch:{ NameNotFoundException -> 0x0029 }
        r3 = 16;
        r2 = r2[r3];	 Catch:{ NameNotFoundException -> 0x0029 }
        r1 = r1.append(r2);	 Catch:{ NameNotFoundException -> 0x0029 }
        r1 = r1.append(r8);	 Catch:{ NameNotFoundException -> 0x0029 }
        r1 = r1.toString();	 Catch:{ NameNotFoundException -> 0x0029 }
        r0.<init>(r1);	 Catch:{ NameNotFoundException -> 0x0029 }
        throw r0;	 Catch:{ NameNotFoundException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = r7.mContext;	 Catch:{ NameNotFoundException -> 0x005a }
        r0 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x005a }
        r3 = r0.getResourcesForApplication(r2);	 Catch:{ NameNotFoundException -> 0x005a }
        r1 = r8.getPathSegments();
        if (r1 != 0) goto L_0x0078;
    L_0x003b:
        r0 = new java.io.FileNotFoundException;	 Catch:{ NameNotFoundException -> 0x0058 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x0058 }
        r1.<init>();	 Catch:{ NameNotFoundException -> 0x0058 }
        r2 = z;	 Catch:{ NameNotFoundException -> 0x0058 }
        r3 = 13;
        r2 = r2[r3];	 Catch:{ NameNotFoundException -> 0x0058 }
        r1 = r1.append(r2);	 Catch:{ NameNotFoundException -> 0x0058 }
        r1 = r1.append(r8);	 Catch:{ NameNotFoundException -> 0x0058 }
        r1 = r1.toString();	 Catch:{ NameNotFoundException -> 0x0058 }
        r0.<init>(r1);	 Catch:{ NameNotFoundException -> 0x0058 }
        throw r0;	 Catch:{ NameNotFoundException -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        r0 = move-exception;
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 11;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0078:
        r0 = r1.size();
        if (r0 != r6) goto L_0x00c8;
    L_0x007e:
        r0 = 0;
        r0 = r1.get(r0);	 Catch:{ NumberFormatException -> 0x00aa }
        r0 = (java.lang.String) r0;	 Catch:{ NumberFormatException -> 0x00aa }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00aa }
    L_0x0089:
        if (r0 != 0) goto L_0x00fe;
    L_0x008b:
        r0 = new java.io.FileNotFoundException;	 Catch:{ NameNotFoundException -> 0x00a8 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x00a8 }
        r1.<init>();	 Catch:{ NameNotFoundException -> 0x00a8 }
        r2 = z;	 Catch:{ NameNotFoundException -> 0x00a8 }
        r3 = 15;
        r2 = r2[r3];	 Catch:{ NameNotFoundException -> 0x00a8 }
        r1 = r1.append(r2);	 Catch:{ NameNotFoundException -> 0x00a8 }
        r1 = r1.append(r8);	 Catch:{ NameNotFoundException -> 0x00a8 }
        r1 = r1.toString();	 Catch:{ NameNotFoundException -> 0x00a8 }
        r0.<init>(r1);	 Catch:{ NameNotFoundException -> 0x00a8 }
        throw r0;	 Catch:{ NameNotFoundException -> 0x00a8 }
    L_0x00a8:
        r0 = move-exception;
        throw r0;
    L_0x00aa:
        r0 = move-exception;
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 12;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r8);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00c8:
        r4 = 2;
        if (r0 != r4) goto L_0x00df;
    L_0x00cb:
        r0 = r1.get(r6);
        r0 = (java.lang.String) r0;
        r1 = r1.get(r5);
        r1 = (java.lang.String) r1;
        r0 = r3.getIdentifier(r0, r1, r2);
        r1 = com.actionbarsherlock.widget.SearchView.a;	 Catch:{ NameNotFoundException -> 0x00fc }
        if (r1 == 0) goto L_0x0089;
    L_0x00df:
        r0 = new java.io.FileNotFoundException;	 Catch:{ NameNotFoundException -> 0x00fc }
        r1 = new java.lang.StringBuilder;	 Catch:{ NameNotFoundException -> 0x00fc }
        r1.<init>();	 Catch:{ NameNotFoundException -> 0x00fc }
        r2 = z;	 Catch:{ NameNotFoundException -> 0x00fc }
        r3 = 14;
        r2 = r2[r3];	 Catch:{ NameNotFoundException -> 0x00fc }
        r1 = r1.append(r2);	 Catch:{ NameNotFoundException -> 0x00fc }
        r1 = r1.append(r8);	 Catch:{ NameNotFoundException -> 0x00fc }
        r1 = r1.toString();	 Catch:{ NameNotFoundException -> 0x00fc }
        r0.<init>(r1);	 Catch:{ NameNotFoundException -> 0x00fc }
        throw r0;	 Catch:{ NameNotFoundException -> 0x00fc }
    L_0x00fc:
        r0 = move-exception;
        throw r0;
    L_0x00fe:
        r0 = r3.getDrawable(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.SuggestionsAdapter.getTheDrawable(android.net.Uri):android.graphics.drawable.Drawable");
    }

    private void storeInIconCache(String str, Drawable drawable) {
        if (drawable != null) {
            try {
                this.mOutsideDrawablesCache.put(str, drawable.getConstantState());
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public static String getColumnString(Cursor cursor, String str) {
        return getStringOrNull(cursor, cursor.getColumnIndex(str));
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        try {
            if (tag instanceof CharSequence) {
                this.mSearchView.onQueryRefine((CharSequence) tag);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private Drawable getIcon2(Cursor cursor) {
        try {
            return this.mIconName2Col == -1 ? null : getDrawableFromResourceValue(cursor.getString(this.mIconName2Col));
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bindView(android.view.View r9, android.content.Context r10, android.database.Cursor r11) {
        /*
        r8_this = this;
        r7 = 2;
        r6 = 1;
        r1 = 0;
        r3 = com.actionbarsherlock.widget.SearchView.a;
        r0 = r9.getTag();
        r0 = (com.actionbarsherlock.widget.SuggestionsAdapter.ChildViewCache) r0;
        r2 = r8.mFlagsCol;
        r4 = -1;
        if (r2 == r4) goto L_0x0016;
    L_0x0010:
        r1 = r8.mFlagsCol;
        r1 = r11.getInt(r1);
    L_0x0016:
        r2 = r0.mText1;
        if (r2 == 0) goto L_0x0025;
    L_0x001a:
        r2 = r8.mText1Col;
        r2 = getStringOrNull(r11, r2);
        r4 = r0.mText1;
        r8.setViewText(r4, r2);
    L_0x0025:
        r2 = r0.mText2;
        if (r2 == 0) goto L_0x0062;
    L_0x0029:
        r2 = r8.mText2UrlCol;
        r2 = getStringOrNull(r11, r2);
        if (r2 == 0) goto L_0x00ab;
    L_0x0031:
        r2 = r8.formatUrl(r2);
    L_0x0035:
        r4 = android.text.TextUtils.isEmpty(r2);	 Catch:{ RuntimeException -> 0x00b2 }
        if (r4 == 0) goto L_0x004d;
    L_0x003b:
        r4 = r0.mText1;	 Catch:{ RuntimeException -> 0x00b4 }
        if (r4 == 0) goto L_0x005d;
    L_0x003f:
        r4 = r0.mText1;	 Catch:{ RuntimeException -> 0x00b6 }
        r5 = 0;
        r4.setSingleLine(r5);	 Catch:{ RuntimeException -> 0x00b6 }
        r4 = r0.mText1;	 Catch:{ RuntimeException -> 0x00b6 }
        r5 = 2;
        r4.setMaxLines(r5);	 Catch:{ RuntimeException -> 0x00b6 }
        if (r3 == 0) goto L_0x005d;
    L_0x004d:
        r4 = r0.mText1;	 Catch:{ RuntimeException -> 0x00b8 }
        if (r4 == 0) goto L_0x005d;
    L_0x0051:
        r4 = r0.mText1;	 Catch:{ RuntimeException -> 0x00b8 }
        r5 = 1;
        r4.setSingleLine(r5);	 Catch:{ RuntimeException -> 0x00b8 }
        r4 = r0.mText1;	 Catch:{ RuntimeException -> 0x00b8 }
        r5 = 1;
        r4.setMaxLines(r5);	 Catch:{ RuntimeException -> 0x00b8 }
    L_0x005d:
        r4 = r0.mText2;
        r8.setViewText(r4, r2);
    L_0x0062:
        r2 = r0.mIcon1;	 Catch:{ RuntimeException -> 0x00ba }
        if (r2 == 0) goto L_0x0070;
    L_0x0066:
        r2 = r0.mIcon1;	 Catch:{ RuntimeException -> 0x00ba }
        r4 = r8.getIcon1(r11);	 Catch:{ RuntimeException -> 0x00ba }
        r5 = 4;
        r8.setViewDrawable(r2, r4, r5);	 Catch:{ RuntimeException -> 0x00ba }
    L_0x0070:
        r2 = r0.mIcon2;	 Catch:{ RuntimeException -> 0x00bc }
        if (r2 == 0) goto L_0x007f;
    L_0x0074:
        r2 = r0.mIcon2;	 Catch:{ RuntimeException -> 0x00bc }
        r4 = r8.getIcon2(r11);	 Catch:{ RuntimeException -> 0x00bc }
        r5 = 8;
        r8.setViewDrawable(r2, r4, r5);	 Catch:{ RuntimeException -> 0x00bc }
    L_0x007f:
        r2 = r8.mQueryRefinement;	 Catch:{ RuntimeException -> 0x00be }
        if (r2 == r7) goto L_0x008b;
    L_0x0083:
        r2 = r8.mQueryRefinement;	 Catch:{ RuntimeException -> 0x00c0 }
        if (r2 != r6) goto L_0x00a3;
    L_0x0087:
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x00a3;
    L_0x008b:
        r1 = r0.mIconRefine;	 Catch:{ RuntimeException -> 0x00c4 }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ RuntimeException -> 0x00c4 }
        r1 = r0.mIconRefine;	 Catch:{ RuntimeException -> 0x00c4 }
        r2 = r0.mText1;	 Catch:{ RuntimeException -> 0x00c4 }
        r2 = r2.getText();	 Catch:{ RuntimeException -> 0x00c4 }
        r1.setTag(r2);	 Catch:{ RuntimeException -> 0x00c4 }
        r1 = r0.mIconRefine;	 Catch:{ RuntimeException -> 0x00c4 }
        r1.setOnClickListener(r8);	 Catch:{ RuntimeException -> 0x00c4 }
        if (r3 == 0) goto L_0x00aa;
    L_0x00a3:
        r0 = r0.mIconRefine;	 Catch:{ RuntimeException -> 0x00c4 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ RuntimeException -> 0x00c4 }
    L_0x00aa:
        return;
    L_0x00ab:
        r2 = r8.mText2Col;
        r2 = getStringOrNull(r11, r2);
        goto L_0x0035;
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00b6 }
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00b8 }
    L_0x00b8:
        r0 = move-exception;
        throw r0;
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r0 = move-exception;
        throw r0;
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00c2 }
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00c4 }
    L_0x00c4:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.SuggestionsAdapter.bindView(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    public void changeCursor(Cursor cursor) {
        try {
            try {
                if (this.mClosed) {
                    Log.w(z[24], z[23]);
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
                try {
                    super.changeCursor(cursor);
                    if (cursor != null) {
                        this.mText1Col = cursor.getColumnIndex(z[25]);
                        this.mText2Col = cursor.getColumnIndex(z[21]);
                        this.mText2UrlCol = cursor.getColumnIndex(z[22]);
                        this.mIconName1Col = cursor.getColumnIndex(z[26]);
                        this.mIconName2Col = cursor.getColumnIndex(z[29]);
                        this.mFlagsCol = cursor.getColumnIndex(z[27]);
                    }
                } catch (Throwable e) {
                    Log.e(z[28], z[20], e);
                }
            }
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        }
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        updateSpinnerState(getCursor());
    }

    private void setViewDrawable(ImageView imageView, Drawable drawable, int i) {
        try {
            imageView.setImageDrawable(drawable);
            if (drawable == null) {
                imageView.setVisibility(i);
                try {
                    if (!SearchView.a) {
                        return;
                    }
                }
            }
            imageView.setVisibility(0);
            drawable.setVisible(false, false);
            drawable.setVisible(true, false);
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    private Drawable getIcon1(Cursor cursor) {
        try {
            if (this.mIconName1Col == -1) {
                return null;
            }
            Drawable drawableFromResourceValue = getDrawableFromResourceValue(cursor.getString(this.mIconName1Col));
            return drawableFromResourceValue == null ? getDefaultIcon1(cursor) : drawableFromResourceValue;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        if (charSequence == null) {
            try {
                String str = "";
            } catch (RuntimeException e) {
                throw e;
            }
        }
        str = charSequence.toString();
        try {
            if (this.mSearchView.getVisibility() != 0 || this.mSearchView.getWindowVisibility() != 0) {
                return null;
            }
            try {
                Cursor suggestions = getSuggestions(str, 50);
                if (suggestions != null) {
                    suggestions.getCount();
                    return suggestions;
                }
            } catch (Throwable e2) {
                Log.w(z[9], z[10], e2);
            }
            return null;
        } catch (RuntimeException e3) {
            throw e3;
        } catch (RuntimeException e32) {
            throw e32;
        }
    }

    private static String getStringOrNull(Cursor cursor, int i) {
        String str = null;
        if (i != -1) {
            try {
                str = cursor.getString(i);
            } catch (Throwable e) {
                Log.e(z[19], z[18], e);
            }
        }
        return str;
    }

    private Drawable getDefaultIcon1(Cursor cursor) {
        return this.mContext.getPackageManager().getDefaultActivityIcon();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (Throwable e) {
            Log.w(z[0], z[1], e);
            View newView = newView(this.mContext, this.mCursor, viewGroup);
            if (newView != null) {
                ((ChildViewCache) newView.getTag()).mText1.setText(e.toString());
            }
            return newView;
        }
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View newView = super.newView(context, cursor, viewGroup);
        newView.setTag(new ChildViewCache(newView));
        return newView;
    }

    private void setViewText(TextView textView, CharSequence charSequence) {
        try {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
                try {
                    if (!SearchView.a) {
                        return;
                    }
                }
            }
            textView.setVisibility(0);
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    public Cursor getSuggestions(String str, int i) {
        Builder fragment = new Builder().scheme(z[4]).query("").fragment("");
        try {
            fragment.appendPath(z[3]);
            fragment.appendPath(str);
            if (i > 0) {
                fragment.appendQueryParameter(z[5], String.valueOf(i));
            }
            return this.mContext.getContentResolver().query(fragment.build(), null, null, null, null);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private Drawable getDrawable(Uri uri) {
        InputStream openInputStream;
        try {
            if (z[30].equals(uri.getScheme())) {
                return getTheDrawable(uri);
            }
            openInputStream = this.mProviderContext.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException(z[37] + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
                return createFromStream;
            } catch (Throwable e) {
                Log.e(z[38], z[35] + uri, e);
                return createFromStream;
            }
        } catch (NotFoundException e2) {
            throw e2;
        } catch (NotFoundException e3) {
            throw new FileNotFoundException(z[31] + uri);
        } catch (FileNotFoundException e4) {
            Log.w(z[33], z[34] + uri + z[32] + e4.getMessage());
            return null;
        } catch (Throwable th) {
            try {
                openInputStream.close();
            } catch (Throwable e5) {
                Log.e(z[39], z[36] + uri, e5);
            }
        }
    }

    private void updateSpinnerState(Cursor cursor) {
        if (cursor != null) {
            try {
                Bundle extras = cursor.getExtras();
            } catch (RuntimeException e) {
                throw e;
            }
        }
        extras = null;
        if (extras != null) {
            try {
                if (!extras.getBoolean(z[2])) {
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
    }

    private Drawable getDrawableFromResourceValue(String str) {
        try {
            if (str != null) {
                try {
                    if (str.length() != 0) {
                        if (!"0".equals(str)) {
                            Drawable checkIconCache;
                            try {
                                int parseInt = Integer.parseInt(str);
                                String str2 = z[6] + this.mProviderContext.getPackageName() + "/" + parseInt;
                                checkIconCache = checkIconCache(str2);
                                if (checkIconCache != null) {
                                    return checkIconCache;
                                }
                                checkIconCache = this.mProviderContext.getResources().getDrawable(parseInt);
                                storeInIconCache(str2, checkIconCache);
                                return checkIconCache;
                            } catch (NumberFormatException e) {
                                checkIconCache = checkIconCache(str);
                                if (checkIconCache != null) {
                                    return checkIconCache;
                                }
                                checkIconCache = getDrawable(Uri.parse(str));
                                storeInIconCache(str, checkIconCache);
                                return checkIconCache;
                            } catch (NotFoundException e2) {
                                Log.w(z[8], z[7] + str);
                                return null;
                            }
                        }
                    }
                } catch (NumberFormatException e3) {
                    throw e3;
                }
            }
            return null;
        } catch (NumberFormatException e32) {
            throw e32;
        } catch (NumberFormatException e322) {
            throw e322;
        }
    }

    public CharSequence convertToString(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String columnString = getColumnString(cursor, z[17]);
        return columnString != null ? columnString : null;
    }

    private Drawable checkIconCache(String str) {
        ConstantState constantState = (ConstantState) this.mOutsideDrawablesCache.get(str);
        return constantState == null ? null : constantState.newDrawable();
    }
}
