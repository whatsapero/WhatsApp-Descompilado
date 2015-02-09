package com.whatsapp.gallerypicker;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.ActionMode.Callback;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.g;
import com.whatsapp.vk;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ImageGallery extends DialogToastActivity {
    private static final String[] U;
    private static Bitmap k;
    private static Bitmap n;
    private static SimpleDateFormat z;
    private BroadcastReceiver A;
    private v B;
    private a5 C;
    private int D;
    private Handler E;
    private int F;
    private ContentObserver G;
    private a5 H;
    private a5 I;
    private Calendar J;
    private boolean K;
    private z L;
    private Callback M;
    private AsyncTask N;
    private HashMap O;
    private String P;
    private an Q;
    private ArrayList R;
    private int S;
    private String T;
    private int j;
    private boolean l;
    private ActionMode m;
    private int o;
    private View p;
    private long q;
    private MenuItem r;
    private HashMap s;
    private Drawable t;
    private GridView u;
    private HashSet v;
    private boolean w;
    private HashMap x;
    private HashMap y;

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            if (this.v != null) {
                bundle.putParcelableArrayList(U[5], new ArrayList(this.v));
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static {
        String[] strArr = new String[52];
        String str = "C\u0014VmL[\u001e@,DQTQ6_F\u0015@mI\\\b\u001d*@T\u001dW";
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
                        i4 = 53;
                        break;
                    case ay.f /*1*/:
                        i4 = 122;
                        break;
                    case ay.n /*2*/:
                        i4 = 50;
                        break;
                    case ay.p /*3*/:
                        i4 = 67;
                        break;
                    default:
                        i4 = 45;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "W\u000fQ(HA3V";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "W\u000fQ(HA3V";
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "W\u000fQ(HA3V";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "T\u0014V1B\\\u001e\u001c*CA\u001f\\7\u0003P\u0002F1L\u001b)f\u0011ht7";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "X\u001bJ\u001cDA\u001f_0";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "E\bW5DP\r";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "T\u0014V1B\\\u001e\u001c*CA\u001f\\7\u0003P\u0002F1L\u001b)f\u0011ht7";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\\\u0017S$HR\u001b^/HG\u0003\u001d _P\u001bF&\u0002";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "T\u0014V1B\\\u001e\u001c*CA\u001f\\7\u0003P\u0002F1L\u001b\t[9Hy\u0013_*Y";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "G\u001fQ*]\\\u001f\\7";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "C\u001f@!";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "\\\u0017S$HR\u001b^/HG\u0003\u001d _P\u001bF&";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "T\u0014V1B\\\u001e\u001c*CA\u001f\\7\u0003P\u0002F1L\u001b)f\u0011ht7";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "T\u0014V1B\\\u001e\u001c*CA\u001f\\7\u0003P\u0002F1L\u001b)f\u0011ht7";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "G\u0015F\"Y\\\u0015\\0";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "V\u001bB7DZ\u0014A";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "V\b]3XG\u0013A";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "V\b]3_P\u0019F0";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "\\\u0017S$HR\u001b^/HG\u0003\u001d3L@\tW";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "V\b]3_P\u0019F0";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "G\u001fQ*]\\\u001f\\7";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "V\b]3XG\u0013A";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "T\u0014V1B\\\u001e\u001c*CA\u001f\\7\u0003P\u0002F1L\u001b)f\u0011ht7";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "V\u001bB7DZ\u0014A";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "C\u001f@!";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "T\u0014V1B\\\u001e\u001c*CA\u001f\\7\u0003P\u0002F1L\u001b)f\u0011ht7";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "S\u0013^&rE\u001bF+";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "W\u000fQ(HA%G1D";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "T\u0014V1B\\\u001e\u001c*CA\u001f\\7\u0003P\u0002F1L\u001b)f\u0011ht7";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "X\u001bJ\u001cDA\u001f_0";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "G\u0015F\"Y\\\u0015\\0";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "S\u0013^&rE\u001bF+";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "A\u0013F/H";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "W\u000fQ(HA%G1D";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "\\\u0017S$HR\u001b^/HG\u0003\u001d1HW\u001bY&\r@\u0014_,X[\u000eW'\u0017";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "\u0015\tQ\"C[\u0013\\$\u0017";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "C\u0013V&B\u001aP";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "C\u0014VmL[\u001e@,DQTQ6_F\u0015@mI\\\b\u001d5DQ\u001f]";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "\\\u0014Q/XQ\u001fm.HQ\u0013S";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "B\u0013\\'BB.[7AP";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "T\u0014V1B\\\u001e\u001c*CA\u001f\\7\u0003T\u0019F*B[T\u007f\u0006i|;m\u0010nt4|\u0006\u007fj)f\u0002\u007fa?v";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "T\u0014V1B\\\u001e\u001c*CA\u001f\\7\u0003T\u0019F*B[T\u007f\u0006i|;m\u0016cx5g\ryp>";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "T\u0014V1B\\\u001e\u001c*CA\u001f\\7\u0003T\u0019F*B[T\u007f\u0006i|;m\u000eb`4f\u0006i";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i2] = str;
                    str = "T\u0014V1B\\\u001e\u001c*CA\u001f\\7\u0003T\u0019F*B[T\u007f\u0006i|;m\u0006gp9f";
                    i = 44;
                    i2 = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    strArr2 = strArr3;
                    str = "\\\u0017S$HR\u001b^/HG\u0003\u001d1HF\u000f_&";
                    i = 45;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "S\u0013^&";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "T\u0014V1B\\\u001e\u001c*CA\u001f\\7\u0003T\u0019F*B[T\u007f\u0006i|;m\u0010nt4|\u0006\u007fj<{\rdf2w\u0007";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "\\\u0017S$HR\u001b^/HG\u0003\u001d'HF\u000e@,T";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i2] = str;
                    str = "x7\u007f\u000e";
                    i = 49;
                    i2 = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    strArr2 = strArr3;
                    str = "y6~\u000f";
                    i = 50;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i2] = str;
                    U = strArr3;
                    try {
                        z = new SimpleDateFormat(U[51], Locale.getDefault());
                    } catch (IllegalArgumentException e) {
                        z = new SimpleDateFormat(U[50], Locale.getDefault());
                    }
                default:
                    strArr2[i2] = str;
                    str = "\\\u0017S$H\u001aP";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private boolean a(String str) {
        try {
            if (!str.equals(U[0])) {
                try {
                    if (!str.equals(U[1])) {
                        return false;
                    }
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static Callback c(ImageGallery imageGallery) {
        return imageGallery.M;
    }

    public ImageGallery() {
        this.l = true;
        this.w = false;
        this.q = Long.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.A = null;
        this.K = true;
        this.v = new HashSet();
        this.y = new HashMap();
        this.O = new HashMap();
        this.x = new HashMap();
        this.s = new HashMap();
        this.R = new ArrayList();
        this.E = new Handler();
        this.G = new af(this, this.E);
        this.M = new t(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case 16908332:
                    finish();
                    return true;
                default:
                    return false;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static void a(ImageGallery imageGallery, boolean z, boolean z2) {
        imageGallery.a(z, z2);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            if (App.G == 3) {
                g.b((Activity) this);
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static MenuItem h(ImageGallery imageGallery) {
        return imageGallery.r;
    }

    private boolean b(String str) {
        try {
            if (!str.equals(U[39])) {
                if (!str.equals(U[38])) {
                    try {
                        return false;
                    }
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public a5 a(long j) {
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(new Date(j));
            if (instance.after(this.C)) {
                return this.C;
            }
            try {
                if (instance.after(this.I)) {
                    return this.I;
                }
                try {
                    if (instance.after(this.H)) {
                        return this.H;
                    }
                    try {
                        return instance.after(this.J) ? new a5(this, 4, new GregorianCalendar(instance.get(1), instance.get(2), 1)) : new a5(this, 5, new GregorianCalendar(instance.get(1), 1, 1));
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public void onCreate(Bundle bundle) {
        int i = ImagePreview.y;
        try {
            Collection parcelableArrayList;
            String toString;
            Log.i(U[13]);
            super.onCreate(bundle);
            requestWindowFeature(5);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            setContentView(R.layout.image_gallery);
            this.q = getIntent().getLongExtra(U[10], Long.MAX_VALUE);
            this.j = getIntent().getIntExtra(U[6], Integer.MAX_VALUE);
            this.l = getIntent().getBooleanExtra(U[7], true);
            this.T = getIntent().getStringExtra(U[12]);
            this.P = getIntent().getStringExtra(U[11]);
            this.S = getResources().getColor(R.color.gallery_cell);
            this.t = new ColorDrawable(this.S);
            this.F = getResources().getDimensionPixelSize(R.dimen.gallery_picker_item_thumb_size);
            this.p = findViewById(R.id.no_images);
            this.u = (GridView) findViewById(R.id.grid);
            this.u.setOnItemClickListener(new ac(this));
            if (this.j > 1) {
                this.u.setOnItemLongClickListener(new bz(this));
            }
            this.Q = new an(this);
            this.u.setAdapter(this.Q);
            a();
            this.L = new z(getContentResolver(), new Handler());
            if (bundle != null) {
                parcelableArrayList = bundle.getParcelableArrayList(U[14]);
            } else {
                parcelableArrayList = getIntent().getParcelableArrayListExtra(U[8]);
            }
            if (parcelableArrayList != null) {
                try {
                    if (!parcelableArrayList.isEmpty()) {
                        this.v.clear();
                        this.v.addAll(parcelableArrayList);
                        this.m = startActionMode(this.M);
                        this.Q.notifyDataSetChanged();
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            Uri data = getIntent().getData();
            if (data != null) {
                try {
                    toString = data.toString();
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            toString = "";
            try {
                Log.i(U[9] + toString);
                a(false, ao.a(getContentResolver()));
                if (DialogToastActivity.i) {
                    ImagePreview.y = i + 1;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.HashSet r12) {
        /*
        r11_this = this;
        r1 = 1;
        r10 = -1;
        r2 = com.whatsapp.gallerypicker.ImagePreview.y;
        if (r12 == 0) goto L_0x000c;
    L_0x0006:
        r0 = r12.isEmpty();	 Catch:{ IOException -> 0x000d }
        if (r0 == 0) goto L_0x0011;
    L_0x000c:
        return;
    L_0x000d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x000f }
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r3.addAll(r12);	 Catch:{ IOException -> 0x015f }
        r0 = r11.l;	 Catch:{ IOException -> 0x015f }
        if (r0 == 0) goto L_0x0138;
    L_0x001d:
        r0 = r11.o;	 Catch:{ IOException -> 0x015f }
        if (r0 != r1) goto L_0x0084;
    L_0x0021:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.gallerypicker.ImagePreview.class;
        r0.<init>(r11, r1);
        r1 = U;	 Catch:{ IOException -> 0x0161 }
        r4 = 26;
        r1 = r1[r4];	 Catch:{ IOException -> 0x0161 }
        r4 = r11.T;	 Catch:{ IOException -> 0x0161 }
        r0.putExtra(r1, r4);	 Catch:{ IOException -> 0x0161 }
        r1 = U;	 Catch:{ IOException -> 0x0161 }
        r4 = 22;
        r1 = r1[r4];	 Catch:{ IOException -> 0x0161 }
        r4 = r11.P;	 Catch:{ IOException -> 0x0161 }
        r0.putExtra(r1, r4);	 Catch:{ IOException -> 0x0161 }
        r1 = U;	 Catch:{ IOException -> 0x0161 }
        r4 = 31;
        r1 = r1[r4];	 Catch:{ IOException -> 0x0161 }
        r4 = r11.j;	 Catch:{ IOException -> 0x0161 }
        r0.putExtra(r1, r4);	 Catch:{ IOException -> 0x0161 }
        r1 = U;	 Catch:{ IOException -> 0x0161 }
        r4 = 24;
        r1 = r1[r4];	 Catch:{ IOException -> 0x0161 }
        r0.putExtra(r1, r3);	 Catch:{ IOException -> 0x0161 }
        r1 = U;	 Catch:{ IOException -> 0x0161 }
        r4 = 32;
        r1 = r1[r4];	 Catch:{ IOException -> 0x0161 }
        r4 = r11.y;	 Catch:{ IOException -> 0x0161 }
        r0.putExtra(r1, r4);	 Catch:{ IOException -> 0x0161 }
        r1 = U;	 Catch:{ IOException -> 0x0161 }
        r4 = 23;
        r1 = r1[r4];	 Catch:{ IOException -> 0x0161 }
        r4 = r11.O;	 Catch:{ IOException -> 0x0161 }
        r0.putExtra(r1, r4);	 Catch:{ IOException -> 0x0161 }
        r1 = U;	 Catch:{ IOException -> 0x0161 }
        r4 = 21;
        r1 = r1[r4];	 Catch:{ IOException -> 0x0161 }
        r4 = r11.x;	 Catch:{ IOException -> 0x0161 }
        r0.putExtra(r1, r4);	 Catch:{ IOException -> 0x0161 }
        r1 = U;	 Catch:{ IOException -> 0x0161 }
        r4 = 25;
        r1 = r1[r4];	 Catch:{ IOException -> 0x0161 }
        r4 = r11.s;	 Catch:{ IOException -> 0x0161 }
        r0.putExtra(r1, r4);	 Catch:{ IOException -> 0x0161 }
        r1 = 1;
        r11.startActivityForResult(r0, r1);	 Catch:{ IOException -> 0x0161 }
        if (r2 == 0) goto L_0x000c;
    L_0x0084:
        r0 = r11.o;	 Catch:{ IOException -> 0x0161 }
        r1 = 4;
        if (r0 != r1) goto L_0x0111;
    L_0x0089:
        r1 = 0;
        r0 = 0;
        r0 = r3.get(r0);	 Catch:{ IOException -> 0x0163 }
        r0 = (android.net.Uri) r0;	 Catch:{ IOException -> 0x0163 }
        r0 = com.whatsapp.util.f.e(r0);	 Catch:{ IOException -> 0x0163 }
    L_0x0095:
        if (r0 == 0) goto L_0x0104;
    L_0x0097:
        r1 = com.whatsapp.id.a(r0);	 Catch:{ IOException -> 0x016a }
        if (r1 == 0) goto L_0x00c2;
    L_0x009d:
        r1 = new android.content.Intent;
        r4 = com.whatsapp.VideoPreviewActivity.class;
        r1.<init>(r11, r4);
        r4 = U;	 Catch:{ IOException -> 0x016c }
        r5 = 28;
        r4 = r4[r5];	 Catch:{ IOException -> 0x016c }
        r5 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x016c }
        r1.putExtra(r4, r5);	 Catch:{ IOException -> 0x016c }
        r4 = U;	 Catch:{ IOException -> 0x016c }
        r5 = 34;
        r4 = r4[r5];	 Catch:{ IOException -> 0x016c }
        r5 = r11.P;	 Catch:{ IOException -> 0x016c }
        r1.putExtra(r4, r5);	 Catch:{ IOException -> 0x016c }
        r4 = 2;
        r11.startActivityForResult(r1, r4);	 Catch:{ IOException -> 0x016c }
        if (r2 == 0) goto L_0x010f;
    L_0x00c2:
        r4 = r0.length();	 Catch:{ IOException -> 0x016e }
        r1 = com.whatsapp.ge.k;	 Catch:{ IOException -> 0x016e }
        r6 = (long) r1;	 Catch:{ IOException -> 0x016e }
        r8 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r6 = r6 * r8;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x00e9;
    L_0x00d1:
        r1 = 2131624333; // 0x7f0e018d float:1.8875843E38 double:1.053162353E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ IOException -> 0x016e }
        r5 = 0;
        r6 = com.whatsapp.ge.k;	 Catch:{ IOException -> 0x016e }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IOException -> 0x016e }
        r4[r5] = r6;	 Catch:{ IOException -> 0x016e }
        r1 = r11.getString(r1, r4);	 Catch:{ IOException -> 0x016e }
        r11.f(r1);	 Catch:{ IOException -> 0x016e }
        if (r2 == 0) goto L_0x010f;
    L_0x00e9:
        r1 = new android.content.Intent;
        r1.<init>();
        r4 = U;	 Catch:{ IOException -> 0x0170 }
        r5 = 33;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0170 }
        r0 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x0170 }
        r1.putExtra(r4, r0);	 Catch:{ IOException -> 0x0170 }
        r0 = -1;
        r11.setResult(r0, r1);	 Catch:{ IOException -> 0x0170 }
        r11.finish();	 Catch:{ IOException -> 0x0170 }
        if (r2 == 0) goto L_0x010f;
    L_0x0104:
        r0 = r11.getBaseContext();	 Catch:{ IOException -> 0x0170 }
        r1 = 2131624908; // 0x7f0e03cc float:1.887701E38 double:1.053162637E-314;
        r4 = 0;
        com.whatsapp.App.b(r0, r1, r4);	 Catch:{ IOException -> 0x0170 }
    L_0x010f:
        if (r2 == 0) goto L_0x000c;
    L_0x0111:
        r0 = new android.content.Intent;
        r0.<init>();
        r1 = U;
        r4 = 29;
        r1 = r1[r4];
        r4 = r11.getIntent();
        r4 = r4.getData();
        r0.putExtra(r1, r4);
        r1 = U;
        r4 = 30;
        r1 = r1[r4];
        r0.putParcelableArrayListExtra(r1, r3);
        r11.setResult(r10, r0);
        r11.finish();
        if (r2 == 0) goto L_0x000c;
    L_0x0138:
        r0 = new android.content.Intent;
        r0.<init>();
        r1 = U;
        r2 = 35;
        r1 = r1[r2];
        r2 = r11.getIntent();
        r2 = r2.getData();
        r0.putExtra(r1, r2);
        r1 = U;
        r2 = 27;
        r1 = r1[r2];
        r0.putParcelableArrayListExtra(r1, r3);
        r11.setResult(r10, r0);
        r11.finish();
        goto L_0x000c;
    L_0x015f:
        r0 = move-exception;
        throw r0;
    L_0x0161:
        r0 = move-exception;
        throw r0;
    L_0x0163:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);
        r0 = r1;
        goto L_0x0095;
    L_0x016a:
        r0 = move-exception;
        throw r0;
    L_0x016c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x016e }
    L_0x016e:
        r0 = move-exception;
        throw r0;
    L_0x0170:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ImageGallery.a(java.util.HashSet):void");
    }

    static int a(ImageGallery imageGallery, int i) {
        imageGallery.D = i;
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
        r6_this = this;
        r5 = 1;
        r4 = 2;
        r3 = -1;
        r1 = com.whatsapp.gallerypicker.ImagePreview.y;
        switch(r7) {
            case 1: goto L_0x0009;
            case 2: goto L_0x00b5;
            default: goto L_0x0008;
        };
    L_0x0008:
        return;
    L_0x0009:
        if (r8 != r3) goto L_0x0014;
    L_0x000b:
        r0 = -1;
        r6.setResult(r0, r9);	 Catch:{ IllegalArgumentException -> 0x00cf }
        r6.finish();	 Catch:{ IllegalArgumentException -> 0x00cf }
        if (r1 == 0) goto L_0x0008;
    L_0x0014:
        if (r8 != r4) goto L_0x001f;
    L_0x0016:
        r0 = 2;
        r6.setResult(r0);	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r6.finish();	 Catch:{ IllegalArgumentException -> 0x00d3 }
        if (r1 == 0) goto L_0x0008;
    L_0x001f:
        if (r8 != r5) goto L_0x0008;
    L_0x0021:
        r0 = U;
        r2 = 15;
        r0 = r0[r2];
        r0 = r9.getParcelableArrayListExtra(r0);
        r2 = r6.v;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r2.clear();	 Catch:{ IllegalArgumentException -> 0x00d5 }
        if (r0 == 0) goto L_0x0037;
    L_0x0032:
        r2 = r6.v;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r2.addAll(r0);	 Catch:{ IllegalArgumentException -> 0x00d5 }
    L_0x0037:
        r0 = r6.m;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        if (r0 != 0) goto L_0x0045;
    L_0x003b:
        r0 = r6.M;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r0 = r6.startActionMode(r0);	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r6.m = r0;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        if (r1 == 0) goto L_0x004a;
    L_0x0045:
        r0 = r6.m;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r0.invalidate();	 Catch:{ IllegalArgumentException -> 0x00d9 }
    L_0x004a:
        r0 = U;	 Catch:{ IllegalArgumentException -> 0x00db }
        r2 = 16;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00db }
        r0 = r9.getSerializableExtra(r0);	 Catch:{ IllegalArgumentException -> 0x00db }
        r0 = (java.util.HashMap) r0;	 Catch:{ IllegalArgumentException -> 0x00db }
        r6.y = r0;	 Catch:{ IllegalArgumentException -> 0x00db }
        r0 = r6.y;	 Catch:{ IllegalArgumentException -> 0x00db }
        if (r0 != 0) goto L_0x0063;
    L_0x005c:
        r0 = new java.util.HashMap;	 Catch:{ IllegalArgumentException -> 0x00db }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x00db }
        r6.y = r0;	 Catch:{ IllegalArgumentException -> 0x00db }
    L_0x0063:
        r0 = U;	 Catch:{ IllegalArgumentException -> 0x00dd }
        r2 = 18;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00dd }
        r0 = r9.getSerializableExtra(r0);	 Catch:{ IllegalArgumentException -> 0x00dd }
        r0 = (java.util.HashMap) r0;	 Catch:{ IllegalArgumentException -> 0x00dd }
        r6.O = r0;	 Catch:{ IllegalArgumentException -> 0x00dd }
        r0 = r6.O;	 Catch:{ IllegalArgumentException -> 0x00dd }
        if (r0 != 0) goto L_0x007c;
    L_0x0075:
        r0 = new java.util.HashMap;	 Catch:{ IllegalArgumentException -> 0x00dd }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x00dd }
        r6.O = r0;	 Catch:{ IllegalArgumentException -> 0x00dd }
    L_0x007c:
        r0 = U;	 Catch:{ IllegalArgumentException -> 0x00df }
        r2 = 19;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00df }
        r0 = r9.getSerializableExtra(r0);	 Catch:{ IllegalArgumentException -> 0x00df }
        r0 = (java.util.HashMap) r0;	 Catch:{ IllegalArgumentException -> 0x00df }
        r6.x = r0;	 Catch:{ IllegalArgumentException -> 0x00df }
        r0 = r6.x;	 Catch:{ IllegalArgumentException -> 0x00df }
        if (r0 != 0) goto L_0x0095;
    L_0x008e:
        r0 = new java.util.HashMap;	 Catch:{ IllegalArgumentException -> 0x00df }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x00df }
        r6.x = r0;	 Catch:{ IllegalArgumentException -> 0x00df }
    L_0x0095:
        r0 = U;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r2 = 17;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r0 = r9.getSerializableExtra(r0);	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r0 = (java.util.HashMap) r0;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r6.s = r0;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r0 = r6.s;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        if (r0 != 0) goto L_0x00ae;
    L_0x00a7:
        r0 = new java.util.HashMap;	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x00e1 }
        r6.s = r0;	 Catch:{ IllegalArgumentException -> 0x00e1 }
    L_0x00ae:
        r0 = r6.Q;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r0.notifyDataSetChanged();	 Catch:{ IllegalArgumentException -> 0x00e3 }
        if (r1 == 0) goto L_0x0008;
    L_0x00b5:
        if (r8 == r3) goto L_0x00b9;
    L_0x00b7:
        if (r8 != r5) goto L_0x00c2;
    L_0x00b9:
        r0 = -1;
        r6.setResult(r0, r9);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r6.finish();	 Catch:{ IllegalArgumentException -> 0x00e9 }
        if (r1 == 0) goto L_0x0008;
    L_0x00c2:
        if (r8 != r4) goto L_0x0008;
    L_0x00c4:
        r0 = 2;
        r6.setResult(r0);	 Catch:{ IllegalArgumentException -> 0x00cd }
        r6.finish();	 Catch:{ IllegalArgumentException -> 0x00cd }
        goto L_0x0008;
    L_0x00cd:
        r0 = move-exception;
        throw r0;
    L_0x00cf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x00d1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d3 }
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r0 = move-exception;
        throw r0;
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d9 }
    L_0x00d9:
        r0 = move-exception;
        throw r0;
    L_0x00db:
        r0 = move-exception;
        throw r0;
    L_0x00dd:
        r0 = move-exception;
        throw r0;
    L_0x00df:
        r0 = move-exception;
        throw r0;
    L_0x00e1:
        r0 = move-exception;
        throw r0;
    L_0x00e3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e5 }
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e9 }
    L_0x00e9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00cd }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ImageGallery.onActivityResult(int, int, android.content.Intent):void");
    }

    public static Bitmap a(aw awVar, Context context) {
        try {
            if (ao.a(awVar)) {
                if (k == null) {
                    k = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_missing_thumbnail_video);
                }
                return k;
            }
            try {
                if (n == null) {
                    n = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_missing_thumbnail_picture);
                }
                return n;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    static int e(ImageGallery imageGallery) {
        return imageGallery.S;
    }

    static int b(ImageGallery imageGallery) {
        return imageGallery.D;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            if (this.K) {
                return false;
            }
            try {
                if (App.G != 3 || i != 84) {
                    return super.onKeyDown(i, keyEvent);
                }
                g.a((Activity) this, false);
                return true;
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void onDestroy() {
        try {
            Log.i(U[49]);
            super.onDestroy();
            if (this.N != null) {
                this.N.cancel(true);
                this.N = null;
            }
            try {
                if (this.L != null) {
                    this.L.d();
                    this.L = null;
                }
                try {
                    if (this.B != null) {
                        this.B.b(this.G);
                        this.B.e();
                        this.B = null;
                    }
                    this.D = 0;
                    this.M = null;
                    this.m = null;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void onResume() {
        Log.i(U[46]);
        super.onResume();
        this.u.requestFocus();
        this.K = false;
        IntentFilter intentFilter = new IntentFilter(U[44]);
        intentFilter.addAction(U[43]);
        intentFilter.addAction(U[42]);
        intentFilter.addAction(U[48]);
        intentFilter.addAction(U[45]);
        intentFilter.addDataScheme(U[47]);
        this.A = new BroadcastReceiver() {
            private static final String[] z;
            final ImageGallery a;

            static {
                String[] strArr = new String[10];
                String str = "\u0000\u000b3\u0013\b\u000e\u0007>\u0018\b\u001b\u001f}\u0006\b\n\u0003;\u0002\b\u0004\u00036\u001d\f\u000b\u0014=\u0015\t\n\u0007!\u0000B(%\u0006=\"'9\u001f1) '\r!#$)\u0007:9,\"";
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
                                i3 = 105;
                                break;
                            case ay.f /*1*/:
                                i3 = 102;
                                break;
                            case ay.n /*2*/:
                                i3 = 82;
                                break;
                            case ay.p /*3*/:
                                i3 = 116;
                                break;
                            default:
                                i3 = 109;
                                break;
                        }
                        cArr[i2] = (char) (i3 ^ c);
                    }
                    str = new String(cArr).intern();
                    switch (obj) {
                        case PBE.MD5 /*0*/:
                            strArr2[i] = str;
                            str = "\b\b6\u0006\u0002\u0000\u0002|\u001d\u0003\u001d\u0003<\u0000C\b\u0005&\u001d\u0002\u0007H\u001f1) '\r9\"<(\u00061)";
                            i = 2;
                            strArr2 = strArr3;
                            obj = 1;
                            break;
                        case ay.f /*1*/:
                            strArr2[i] = str;
                            str = "\b\b6\u0006\u0002\u0000\u0002|\u001d\u0003\u001d\u0003<\u0000C\b\u0005&\u001d\u0002\u0007H\u001f1) '\r!#$)\u0007:9,\"";
                            i = 3;
                            strArr2 = strArr3;
                            obj = 2;
                            break;
                        case ay.n /*2*/:
                            strArr2[i] = str;
                            str = "\u0000\u000b3\u0013\b\u000e\u0007>\u0018\b\u001b\u001f}\u0006\b\n\u0003;\u0002\b\u0004\u00036\u001d\f\u000b\u0014=\u0015\t\n\u0007!\u0000B(%\u0006=\"'9\u001f1) '\r1',%\u0006";
                            i = 4;
                            strArr2 = strArr3;
                            obj = 3;
                            break;
                        case ay.p /*3*/:
                            strArr2[i] = str;
                            i = 5;
                            strArr2 = strArr3;
                            str = "\u0000\u000b3\u0013\b\u000e\u0007>\u0018\b\u001b\u001f}\u0006\b\n\u0003;\u0002\b\u0004\u00036\u001d\f\u000b\u0014=\u0015\t\n\u0007!\u0000B(%\u0006=\"'9\u001f1) '\r'.((\u001c1?65\u00065?=#\u0016";
                            obj = 4;
                            break;
                        case aj.i /*4*/:
                            strArr2[i] = str;
                            i = 6;
                            str = "\b\b6\u0006\u0002\u0000\u0002|\u001d\u0003\u001d\u0003<\u0000C\b\u0005&\u001d\u0002\u0007H\u001f1) '\r1',%\u0006";
                            obj = 5;
                            strArr2 = strArr3;
                            break;
                        case aV.r /*5*/:
                            strArr2[i] = str;
                            i = 7;
                            str = "\u0000\u000b3\u0013\b\u000e\u0007>\u0018\b\u001b\u001f}\u0006\b\n\u0003;\u0002\b\u0004\u00036\u001d\f\u000b\u0014=\u0015\t\n\u0007!\u0000B(%\u0006=\"'9\u001f1) '\r9\"<(\u00061)";
                            obj = 6;
                            strArr2 = strArr3;
                            break;
                        case aV.i /*6*/:
                            strArr2[i] = str;
                            i = 8;
                            str = "\b\b6\u0006\u0002\u0000\u0002|\u001d\u0003\u001d\u0003<\u0000C\b\u0005&\u001d\u0002\u0007H\u001f1) '\r'.((\u001c1?65\u00065?=#\u0016";
                            obj = 7;
                            strArr2 = strArr3;
                            break;
                        case a8.s /*7*/:
                            strArr2[i] = str;
                            i = 9;
                            str = "\u0000\u000b3\u0013\b\u000e\u0007>\u0018\b\u001b\u001f}\u0006\b\n\u0003;\u0002\b\u0004\u00036\u001d\f\u000b\u0014=\u0015\t\n\u0007!\u0000B(%\u0006=\"'9\u001f1) '\r'.((\u001c1?6 \u001b:$:.\u00170";
                            obj = 8;
                            strArr2 = strArr3;
                            break;
                        case a8.n /*8*/:
                            strArr2[i] = str;
                            z = strArr3;
                        default:
                            strArr2[i] = str;
                            str = "\b\b6\u0006\u0002\u0000\u0002|\u001d\u0003\u001d\u0003<\u0000C\b\u0005&\u001d\u0002\u0007H\u001f1) '\r'.((\u001c1?6 \u001b:$:.\u00170";
                            i = 1;
                            strArr2 = strArr3;
                            obj = null;
                            break;
                    }
                }
            }

            {
                this.a = r1;
            }

            public void onReceive(Context context, Intent intent) {
                int i = ImagePreview.y;
                String action = intent.getAction();
                if (action.equals(z[2])) {
                    Log.i(z[7]);
                    if (i == 0) {
                        return;
                    }
                }
                if (action.equals(z[3])) {
                    Log.i(z[0]);
                    ImageGallery.a(this.a, true, false);
                    if (i == 0) {
                        return;
                    }
                }
                if (action.equals(z[8])) {
                    Log.i(z[5]);
                    ImageGallery.a(this.a, false, true);
                    if (i == 0) {
                        return;
                    }
                }
                if (action.equals(z[1])) {
                    Log.i(z[9]);
                    ImageGallery.a(this.a, false, false);
                    if (i == 0) {
                        return;
                    }
                }
                if (action.equals(z[6])) {
                    Log.i(z[4]);
                    ImageGallery.a(this.a, true, false);
                }
            }
        };
        registerReceiver(this.A, intentFilter);
    }

    private void a(boolean z, boolean z2) {
        try {
            Log.i(U[36] + z + U[37] + z2);
            if (this.N != null) {
                this.N.cancel(true);
            }
            try {
                if (this.B != null) {
                    this.B.b(this.G);
                    this.B.e();
                    this.B = null;
                }
                try {
                    boolean z3;
                    setSupportProgressBarIndeterminateVisibility(true);
                    if (z) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    try {
                        int i;
                        this.B = a(z3);
                        this.R.clear();
                        this.B.a(this.G);
                        View view = this.p;
                        if (this.B.b() > 0) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        view.setVisibility(i);
                        this.C = new a5(this, 1, Calendar.getInstance());
                        this.C.add(6, -2);
                        this.I = new a5(this, 2, Calendar.getInstance());
                        this.I.add(6, -7);
                        this.H = new a5(this, 3, Calendar.getInstance());
                        this.H.add(6, -28);
                        this.J = Calendar.getInstance();
                        this.J.add(6, -366);
                        this.D = 0;
                        this.Q.notifyDataSetChanged();
                        this.N = new bs(this, z, z2);
                        this.N.execute(new Void[0]);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    static SimpleDateFormat b() {
        return z;
    }

    static void a(ImageGallery imageGallery, aw awVar) {
        imageGallery.a(awVar);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    static ActionMode a(ImageGallery imageGallery, ActionMode actionMode) {
        imageGallery.m = actionMode;
        return actionMode;
    }

    static ActionMode l(ImageGallery imageGallery) {
        return imageGallery.m;
    }

    public void onPause() {
        try {
            Log.i(U[20]);
            super.onPause();
            this.K = true;
            if (this.A != null) {
                unregisterReceiver(this.A);
                this.A = null;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static HashSet a(ImageGallery imageGallery) {
        return imageGallery.v;
    }

    static z i(ImageGallery imageGallery) {
        return imageGallery.L;
    }

    static v k(ImageGallery imageGallery) {
        return imageGallery.B;
    }

    static v a(ImageGallery imageGallery, boolean z) {
        return imageGallery.a(z);
    }

    static Drawable g(ImageGallery imageGallery) {
        return imageGallery.t;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.gallerypicker.aw r5) {
        /*
        r4_this = this;
        r0 = com.whatsapp.gallerypicker.ImagePreview.y;
        if (r5 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r1 = r4.m;	 Catch:{ IllegalArgumentException -> 0x006f }
        if (r1 == 0) goto L_0x005f;
    L_0x0009:
        r1 = r4.v;	 Catch:{ IllegalArgumentException -> 0x0071 }
        r2 = r5.a();	 Catch:{ IllegalArgumentException -> 0x0071 }
        r1 = r1.contains(r2);	 Catch:{ IllegalArgumentException -> 0x0071 }
        if (r1 == 0) goto L_0x0020;
    L_0x0015:
        r1 = r4.v;	 Catch:{ IllegalArgumentException -> 0x0073 }
        r2 = r5.a();	 Catch:{ IllegalArgumentException -> 0x0073 }
        r1.remove(r2);	 Catch:{ IllegalArgumentException -> 0x0073 }
        if (r0 == 0) goto L_0x0044;
    L_0x0020:
        r1 = r4.v;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r1 = r1.size();	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = r4.j;	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r1 >= r2) goto L_0x0035;
    L_0x002a:
        r1 = r4.v;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = r5.a();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1.add(r2);	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r0 == 0) goto L_0x0044;
    L_0x0035:
        r1 = r4.getBaseContext();	 Catch:{ IllegalArgumentException -> 0x0077 }
        r2 = 2131624910; // 0x7f0e03ce float:1.8877013E38 double:1.053162638E-314;
        r3 = 0;
        r1 = android.widget.Toast.makeText(r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0077 }
        r1.show();	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0044:
        r1 = r4.v;	 Catch:{ IllegalArgumentException -> 0x0079 }
        r1 = r1.isEmpty();	 Catch:{ IllegalArgumentException -> 0x0079 }
        if (r1 == 0) goto L_0x0053;
    L_0x004c:
        r1 = r4.m;	 Catch:{ IllegalArgumentException -> 0x007b }
        r1.finish();	 Catch:{ IllegalArgumentException -> 0x007b }
        if (r0 == 0) goto L_0x0058;
    L_0x0053:
        r1 = r4.m;	 Catch:{ IllegalArgumentException -> 0x007b }
        r1.invalidate();	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x0058:
        r1 = r4.Q;
        r1.notifyDataSetChanged();
        if (r0 == 0) goto L_0x0004;
    L_0x005f:
        r0 = new java.util.HashSet;
        r0.<init>();
        r1 = r5.a();
        r0.add(r1);
        r4.a(r0);
        goto L_0x0004;
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ImageGallery.a(com.whatsapp.gallerypicker.aw):void");
    }

    static int j(ImageGallery imageGallery) {
        return imageGallery.F;
    }

    static void a(ImageGallery imageGallery, HashSet hashSet) {
        imageGallery.a(hashSet);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        try {
            if (this.K) {
                return false;
            }
            try {
                if (App.G == 3) {
                    g.b((Activity) this);
                }
                return true;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.whatsapp.gallerypicker.v a(boolean r8) {
        /*
        r7_this = this;
        r6 = 4;
        r1 = 1;
        r2 = 2;
        r0 = r7.getIntent();
        r4 = r0.getData();
        if (r4 == 0) goto L_0x003b;
    L_0x000d:
        r0 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0039 }
    L_0x0011:
        r3 = com.whatsapp.gallerypicker.ag.i;	 Catch:{ IllegalArgumentException -> 0x003e }
        r3 = r3.toString();	 Catch:{ IllegalArgumentException -> 0x003e }
        r0 = r0.startsWith(r3);	 Catch:{ IllegalArgumentException -> 0x003e }
        if (r0 == 0) goto L_0x0060;
    L_0x001d:
        r0 = r7.o;	 Catch:{ IllegalArgumentException -> 0x0040 }
        if (r0 != r6) goto L_0x0046;
    L_0x0021:
        r3 = new com.whatsapp.gallerypicker.a0;	 Catch:{ IllegalArgumentException -> 0x0042 }
        r5 = r7.getContentResolver();	 Catch:{ IllegalArgumentException -> 0x0042 }
        r0 = r7.w;	 Catch:{ IllegalArgumentException -> 0x0042 }
        if (r0 == 0) goto L_0x0044;
    L_0x002b:
        r0 = r1;
    L_0x002c:
        r1 = U;
        r1 = r1[r2];
        r1 = r4.getQueryParameter(r1);
        r3.<init>(r5, r0, r1);
        r0 = r3;
    L_0x0038:
        return r0;
    L_0x0039:
        r0 = move-exception;
        throw r0;
    L_0x003b:
        r0 = "";
        goto L_0x0011;
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r0 = r2;
        goto L_0x002c;
    L_0x0046:
        r0 = new com.whatsapp.gallerypicker.ag;	 Catch:{ IllegalArgumentException -> 0x005c }
        r3 = r7.getContentResolver();	 Catch:{ IllegalArgumentException -> 0x005c }
        r5 = r7.w;	 Catch:{ IllegalArgumentException -> 0x005c }
        if (r5 == 0) goto L_0x005e;
    L_0x0050:
        r2 = U;
        r2 = r2[r6];
        r2 = r4.getQueryParameter(r2);
        r0.<init>(r3, r1, r2);
        goto L_0x0038;
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r1 = r2;
        goto L_0x0050;
    L_0x0060:
        if (r8 != 0) goto L_0x006a;
    L_0x0062:
        r0 = com.whatsapp.gallerypicker.ao.c();
        r3 = com.whatsapp.gallerypicker.ImagePreview.y;	 Catch:{ IllegalArgumentException -> 0x008a }
        if (r3 == 0) goto L_0x0081;
    L_0x006a:
        r3 = com.whatsapp.gallerypicker.bq.EXTERNAL;	 Catch:{ IllegalArgumentException -> 0x008c }
        r5 = r7.o;	 Catch:{ IllegalArgumentException -> 0x008c }
        r0 = r7.w;	 Catch:{ IllegalArgumentException -> 0x008c }
        if (r0 == 0) goto L_0x008e;
    L_0x0072:
        if (r4 == 0) goto L_0x0092;
    L_0x0074:
        r0 = U;	 Catch:{ IllegalArgumentException -> 0x0090 }
        r2 = 3;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x0090 }
        r0 = r4.getQueryParameter(r0);	 Catch:{ IllegalArgumentException -> 0x0090 }
    L_0x007d:
        r0 = com.whatsapp.gallerypicker.ao.a(r3, r5, r1, r0);
    L_0x0081:
        r1 = r7.getContentResolver();
        r0 = com.whatsapp.gallerypicker.ao.a(r1, r0);
        goto L_0x0038;
    L_0x008a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        throw r0;
    L_0x008e:
        r1 = r2;
        goto L_0x0072;
    L_0x0090:
        r0 = move-exception;
        throw r0;
    L_0x0092:
        r0 = 0;
        goto L_0x007d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ImageGallery.a(boolean):com.whatsapp.gallerypicker.v");
    }

    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        DialogToastActivity.a(menuItem);
        return super.onMenuItemSelected(i, menuItem);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r7_this = this;
        r6 = 4;
        r5 = 1;
        r0 = 5;
        r7.o = r0;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r0 = r7.j;	 Catch:{ IllegalArgumentException -> 0x00a4 }
        if (r0 <= r5) goto L_0x0013;
    L_0x0009:
        r0 = r7.getSupportActionBar();	 Catch:{ IllegalArgumentException -> 0x00a4 }
        r1 = 2131624814; // 0x7f0e036e float:1.8876818E38 double:1.0531625904E-314;
        r0.setSubtitle(r1);	 Catch:{ IllegalArgumentException -> 0x00a4 }
    L_0x0013:
        r0 = r7.getIntent();
        if (r0 == 0) goto L_0x0083;
    L_0x0019:
        r1 = r0.resolveType(r7);
        if (r1 == 0) goto L_0x003d;
    L_0x001f:
        r2 = r7.a(r1);	 Catch:{ IllegalArgumentException -> 0x00a6 }
        if (r2 == 0) goto L_0x002e;
    L_0x0025:
        r2 = 1;
        r7.o = r2;	 Catch:{ IllegalArgumentException -> 0x00a6 }
        r2 = 2131624674; // 0x7f0e02e2 float:1.8876534E38 double:1.0531625213E-314;
        r7.setTitle(r2);	 Catch:{ IllegalArgumentException -> 0x00a6 }
    L_0x002e:
        r1 = r7.b(r1);	 Catch:{ IllegalArgumentException -> 0x00a8 }
        if (r1 == 0) goto L_0x003d;
    L_0x0034:
        r1 = 4;
        r7.o = r1;	 Catch:{ IllegalArgumentException -> 0x00a8 }
        r1 = 2131624675; // 0x7f0e02e3 float:1.8876536E38 double:1.0531625217E-314;
        r7.setTitle(r1);	 Catch:{ IllegalArgumentException -> 0x00a8 }
    L_0x003d:
        r1 = r0.getExtras();
        if (r1 == 0) goto L_0x00ac;
    L_0x0043:
        r0 = U;	 Catch:{ IllegalArgumentException -> 0x00aa }
        r2 = 41;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00aa }
        r0 = r1.getString(r0);	 Catch:{ IllegalArgumentException -> 0x00aa }
    L_0x004d:
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x0071;
    L_0x0053:
        r2 = new android.text.TextPaint;
        r2.<init>();
        r3 = r7.getResources();
        r4 = 2131361797; // 0x7f0a0005 float:1.8343356E38 double:1.053032643E-314;
        r3 = r3.getDimension(r4);
        r2.setTextSize(r3);
        r3 = r7.getBaseContext();
        r0 = com.whatsapp.util.a5.b(r0, r3, r2);
        r7.setTitle(r0);
    L_0x0071:
        if (r1 == 0) goto L_0x0083;
    L_0x0073:
        r0 = U;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r2 = 40;
        r0 = r0[r2];	 Catch:{ IllegalArgumentException -> 0x00ae }
        r2 = r7.o;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0 = r1.getInt(r0, r2);	 Catch:{ IllegalArgumentException -> 0x00ae }
        r0 = r0 & 5;
        r7.o = r0;	 Catch:{ IllegalArgumentException -> 0x00ae }
    L_0x0083:
        r0 = r7.o;	 Catch:{ IllegalArgumentException -> 0x00b0 }
        if (r0 != r5) goto L_0x0095;
    L_0x0087:
        r0 = r7.getSupportActionBar();	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r1 = 2130838827; // 0x7f02052b float:1.7282647E38 double:1.052774261E-314;
        r0.setIcon(r1);	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r0 = com.whatsapp.gallerypicker.ImagePreview.y;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        if (r0 == 0) goto L_0x00a3;
    L_0x0095:
        r0 = r7.o;	 Catch:{ IllegalArgumentException -> 0x00b4 }
        if (r0 != r6) goto L_0x00a3;
    L_0x0099:
        r0 = r7.getSupportActionBar();	 Catch:{ IllegalArgumentException -> 0x00b4 }
        r1 = 2130838888; // 0x7f020568 float:1.7282771E38 double:1.0527742914E-314;
        r0.setIcon(r1);	 Catch:{ IllegalArgumentException -> 0x00b4 }
    L_0x00a3:
        return;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r0 = move-exception;
        throw r0;
    L_0x00a8:
        r0 = move-exception;
        throw r0;
    L_0x00aa:
        r0 = move-exception;
        throw r0;
    L_0x00ac:
        r0 = 0;
        goto L_0x004d;
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b2 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ImageGallery.a():void");
    }

    static ArrayList f(ImageGallery imageGallery) {
        return imageGallery.R;
    }

    static an d(ImageGallery imageGallery) {
        return imageGallery.Q;
    }

    static MenuItem a(ImageGallery imageGallery, MenuItem menuItem) {
        imageGallery.r = menuItem;
        return menuItem;
    }
}
