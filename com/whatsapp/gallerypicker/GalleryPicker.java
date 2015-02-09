package com.whatsapp.gallerypicker;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.b7;
import com.whatsapp.util.Log;
import com.whatsapp.util.g;
import com.whatsapp.vk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class GalleryPicker extends SherlockActivity {
    private static final String b;
    private static final j[] r;
    private static final String[] z;
    private Handler c;
    private int d;
    ArrayList e;
    volatile boolean f;
    private Drawable g;
    private BroadcastReceiver h;
    private boolean i;
    private z j;
    private int k;
    private View l;
    private Thread m;
    private boolean n;
    private GridView o;
    private ContentObserver p;
    private b_ q;
    private int s;

    private void a(boolean z, boolean z2, boolean z3) {
        Log.i(z[50] + z + z[51] + z2 + z[49] + this.i + z[48] + this.n);
        if (z != this.i || z2 != this.n || z3) {
            m();
            this.i = z;
            this.n = z2;
            a(this.n);
            if (this.i) {
                h();
                if (ImagePreview.y == 0) {
                    return;
                }
            }
            b();
            i();
        }
    }

    public void onCreate(Bundle bundle) {
        Serializable parcelableArrayListExtra;
        Uri uri;
        int i = ImagePreview.y;
        Log.i(z[24]);
        super.onCreate(bundle);
        requestWindowFeature(5);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        supportActionBar.setDisplayShowTitleEnabled(false);
        supportActionBar.setDisplayShowCustomEnabled(true);
        supportActionBar.setIcon(new aj(this));
        this.d = getIntent().getIntExtra(z[33], -1);
        if (this.d == -1) {
            this.d = getSharedPreferences(z[27], 0).getInt(z[23], 1);
        }
        View a = b7.a(getLayoutInflater(), R.layout.gallery_image_video_switch, null);
        supportActionBar.setCustomView(a);
        View findViewById = a.findViewById(R.id.images);
        a = a.findViewById(R.id.videos);
        findViewById.setOnClickListener(new c(this, findViewById, a));
        a.setOnClickListener(new br(this, findViewById, a));
        setContentView(R.layout.gallery_picker);
        this.k = getResources().getColor(R.color.gallery_cell);
        this.g = new ColorDrawable(this.k);
        this.s = getResources().getDimensionPixelSize(R.dimen.gallery_picker_folder_thumb_size);
        this.o = (GridView) findViewById(R.id.albums);
        this.o.setOnItemClickListener(new o(this));
        this.o.setOnCreateContextMenuListener(new bm(this));
        this.h = new BroadcastReceiver() {
            final GalleryPicker a;

            {
                this.a = r1;
            }

            public void onReceive(Context context, Intent intent) {
                GalleryPicker.a(this.a, intent);
            }
        };
        this.p = new ay(this, this.c);
        if (this.d == 1) {
            findViewById.setSelected(true);
            if (i != 0) {
                DialogToastActivity.i = !DialogToastActivity.i;
            }
            parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(z[25]);
            uri = (Uri) getIntent().getParcelableExtra(z[30]);
            if (uri != null) {
                Intent intent = new Intent(z[29], uri);
                intent.putExtra(z[36], this.d);
                intent.putExtra(z[26], getIntent().getBooleanExtra(z[35], true));
                intent.putExtra(z[41], getIntent().getStringExtra(z[34]));
                intent.putExtra(z[39], getIntent().getStringExtra(z[31]));
                intent.putExtra(z[28], getIntent().getLongExtra(z[38], Long.MAX_VALUE));
                intent.putExtra(z[37], getIntent().getIntExtra(z[40], Integer.MAX_VALUE));
                intent.putExtra(z[32], parcelableArrayListExtra);
                intent.setClass(this, ImageGallery.class);
                startActivityForResult(intent, 0);
            }
            l();
        }
        if (this.d == 4) {
            a.setSelected(true);
        }
        parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(z[25]);
        uri = (Uri) getIntent().getParcelableExtra(z[30]);
        if (uri != null) {
            Intent intent2 = new Intent(z[29], uri);
            intent2.putExtra(z[36], this.d);
            intent2.putExtra(z[26], getIntent().getBooleanExtra(z[35], true));
            intent2.putExtra(z[41], getIntent().getStringExtra(z[34]));
            intent2.putExtra(z[39], getIntent().getStringExtra(z[31]));
            intent2.putExtra(z[28], getIntent().getLongExtra(z[38], Long.MAX_VALUE));
            intent2.putExtra(z[37], getIntent().getIntExtra(z[40], Integer.MAX_VALUE));
            intent2.putExtra(z[32], parcelableArrayListExtra);
            intent2.setClass(this, ImageGallery.class);
            startActivityForResult(intent2, 0);
        }
        l();
    }

    static void a(GalleryPicker galleryPicker, boolean z, boolean z2) {
        galleryPicker.a(z, z2);
    }

    private void f() {
        int i = ImagePreview.y;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((v) it.next()).e();
            if (i != 0) {
                break;
            }
        }
        this.e.clear();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (App.G != 3 || i != 84) {
            return super.onKeyDown(i, keyEvent);
        }
        g.a((Activity) this, false);
        return true;
    }

    private void a(boolean z, boolean z2) {
        a(z, z2, false);
    }

    static boolean a(GalleryPicker galleryPicker, boolean z) {
        galleryPicker.n = z;
        return z;
    }

    static void a(GalleryPicker galleryPicker, at atVar) {
        galleryPicker.a(atVar);
    }

    private void l() {
        this.q = new b_(this, getLayoutInflater());
        this.o.setAdapter(this.q);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(z[4]);
        intentFilter.addAction(z[2]);
        intentFilter.addAction(z[0]);
        intentFilter.addAction(z[1]);
        intentFilter.addAction(z[3]);
        intentFilter.addDataScheme(z[5]);
        registerReceiver(this.h, intentFilter);
        getContentResolver().registerContentObserver(Media.EXTERNAL_CONTENT_URI, true, this.p);
        this.j = new z(getContentResolver(), this.c);
        this.i = false;
        this.n = false;
        i();
    }

    static boolean e(GalleryPicker galleryPicker) {
        return galleryPicker.i;
    }

    private void a() {
        if (!this.n && this.q.d.size() == 0) {
            h();
        }
    }

    static {
        String[] strArr = new String[52];
        String str = "}JA\u001dFu@\u000b\u0006GhAK\u001b\u0007}GQ\u0006Fr\nh*mUez<j]jk*{Cwq.{Haa";
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
                        i4 = 28;
                        break;
                    case ay.f /*1*/:
                        i4 = 36;
                        break;
                    case ay.n /*2*/:
                        i4 = 37;
                        break;
                    case ay.p /*3*/:
                        i4 = 111;
                        break;
                    default:
                        i4 = 41;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "}JA\u001dFu@\u000b\u0006GhAK\u001b\u0007}GQ\u0006Fr\nh*mUez:gQkp!}Y`";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "}JA\u001dFu@\u000b\u0006GhAK\u001b\u0007}GQ\u0006Fr\nh*mUez*cYgq";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "}JA\u001dFu@\u000b\u0006GhAK\u001b\u0007}GQ\u0006Fr\nh*mUez\"fIjq*m";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "zMI\n";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u007fKK\u001bLrP\u001f@\u0006\u007fKHA^tEQ\u001cHlT\u000b\u001f[sRL\u000bLn\nH\nMuE\n\r\\\u007fO@\u001bZ";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "{EI\u0003Ln]U\u0006JwAW@CsMKO@rP@\u001d[iTQ\nM";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u007fKHA^tEQ\u001cHlTz\u001f[yB@\u001dLrG@\u001c";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "{EI\u0003Ln]U\u0006JwAW@MyWQ\u001dFe";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "{EI\u0003Ln]U\u0006JwAW\u0006G\u007fHP\u000bL";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "}JA\u001dFu@\u000b\u0006GhAK\u001b\u0007}GQ\u0006Fr\nh*mUez<j]jk*{Cbl!`Ol`+";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "{EI\u0003Ln]U\u0006JwAW@[yG@\u0006_yI@\u000b@}FW\u0000HxGD\u001c]3ef;`Sjz\"lXmd0lVaf;";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "}JA\u001dFu@\u000b\u0006GhAK\u001b\u0007}GQ\u0006Fr\nh*mUez<j]jk*{Cwq.{Haa";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "{EI\u0003Ln]U\u0006JwAW@[yG@\u0006_yI@\u000b@}FW\u0000HxGD\u001c]3ef;`Sjz\"lXmd0|Rij:gHaa";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "}JA\u001dFu@\u000b\u0006GhAK\u001b\u0007}GQ\u0006Fr\nh*mUez\"fIjq*m";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "{EI\u0003Ln]U\u0006JwAW@[yG@\u0006_yI@\u000b@}FW\u0000HxGD\u001c]3ef;`Sjz\"lXmd0z_ek!lN{c&gUwm*m";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "{EI\u0003Ln]U\u0006JwAW@[yG@\u0006_yI@\u000b@}FW\u0000HxGD\u001c]3ef;`Sjz\"lXmd0dSqk;lX";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "}JA\u001dFu@\u000b\u0006GhAK\u001b\u0007}GQ\u0006Fr\nh*mUez:gQkp!}Y`";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "{EI\u0003Ln]U\u0006JwAW@[yG@\u0006_yI@\u000b@}FW\u0000HxGD\u001c]3ef;`Sjz\"lXmd0z_ek!lN{v;hNp`+";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "}JA\u001dFu@\u000b\u0006GhAK\u001b\u0007}GQ\u0006Fr\nh*mUez*cYgq";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "jMA\nF";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "jMA\nF";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "{EI\u0003Ln]U\u0006JwAW\u0006G\u007fHP\u000bL";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "{EI\u0003Ln]U\u0006JwAW@JnAD\u001bL";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "}JA\u001dFu@\u000b\u0006GhAK\u001b\u0007y\\Q\u001dH2wq=l]i";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "lV@\u0019@yS";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "\u007fKHA^tEQ\u001cHlTz\u001f[yB@\u001dLrG@\u001c";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "qE]0_u@@\u0000voM_\n";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "}JA\u001dFu@\u000b\u0006GhAK\u001b\u0007}GQ\u0006Fr\ns&lK";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "~QF\u0004Lh{P\u001d@";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "nAF\u0006YuAK\u001b";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "}JA\u001dFu@\u000b\u0006GhAK\u001b\u0007y\\Q\u001dH2wq=l]i";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "uJF\u0003\\xAz\u0002LxMD";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "jAW\r";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "lV@\u0019@yS";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "uJF\u0003\\xAz\u0002LxMD";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "qE]0@hAH\u001c";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "qE]0_u@@\u0000voM_\n";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "nAF\u0006YuAK\u001b";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "qE]0@hAH\u001c";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "jAW\r";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "[EI\u0003Ln]u\u0006JwAWO~sVN\n[";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "}JA\u001dFu@\u000b\u0006GhAK\u001b\u0007}GQ\u0006Fr\nu&jW";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "\u007fKHA^tEQ\u001cHlTz\u001f[yB@\u001dLrG@\u001c";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "uID\bL3\u000e";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "jMA\nF3\u000e";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "}JA\u001dFu@\u000b\u0006GhAK\u001b\u0007}GQ\u0006Fr\nu&jW";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "<KI\u000bZ\u007fEK\u0001@rC\u001f";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "<KI\u000b\\rIJ\u001aGhAAU";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "{EI\u0003Ln]U\u0006JwAW@[yFD\u0004L<QK\u0002FiJQ\nM&";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "<WF\u000eGrMK\b\u0013";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    b = ao.b;
                    r = new j[]{new j(2, 1, ao.b, R.string.gallery_camera_bucket_name), new j(3, 4, ao.b, R.string.gallery_camera_videos_bucket_name), new j(0, 1, null, R.string.all_images), new j(1, 4, null, R.string.all_videos)};
                default:
                    strArr2[i2] = str;
                    str = "}JA\u001dFu@\u000b\u0006GhAK\u001b\u0007}GQ\u0006Fr\nh*mUez<j]jk*{Cbl!`Ol`+";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    static int b(GalleryPicker galleryPicker, int i) {
        galleryPicker.d = i;
        return i;
    }

    private void a(at atVar) {
        if (this.q.getCount() == 0) {
            b();
        }
        this.q.a(atVar);
        this.q.a();
    }

    static Drawable i(GalleryPicker galleryPicker) {
        return galleryPicker.g;
    }

    static void a(GalleryPicker galleryPicker, int i) {
        galleryPicker.a(i);
    }

    private void i() {
        this.f = false;
        this.m = new a2(this, z[42]);
        bw.a().d(this.m);
        this.m.start();
    }

    private void m() {
        if (this.m != null) {
            bw.a().a(this.m, getContentResolver());
            this.f = true;
            try {
                this.m.join();
            } catch (InterruptedException e) {
                Log.i(z[7]);
            }
            this.m = null;
            this.c.removeMessages(0);
            this.q.b();
            this.q.a();
            f();
        }
    }

    public void a(boolean z) {
        setSupportProgressBarIndeterminateVisibility(z);
    }

    private void h() {
        if (this.l == null) {
            getLayoutInflater().inflate(R.layout.gallery_picker_no_images, (ViewGroup) findViewById(R.id.root));
            this.l = findViewById(R.id.no_images);
        }
        this.l.setVisibility(0);
    }

    static void h(GalleryPicker galleryPicker) {
        galleryPicker.a();
    }

    static int f(GalleryPicker galleryPicker) {
        return galleryPicker.d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k() {
        /*
        r15_this = this;
        r14 = 3;
        r13 = 2;
        r9 = 0;
        r10 = com.whatsapp.gallerypicker.ImagePreview.y;
        r0 = r;
        r11 = r0.length;
        r12 = new com.whatsapp.gallerypicker.v[r11];
        r8 = r9;
    L_0x000b:
        if (r8 >= r11) goto L_0x001e;
    L_0x000d:
        r0 = r;
        r1 = r0[r8];
        r0 = r1.d;
        r2 = r15.d;
        r0 = r0 & r2;
        if (r0 != 0) goto L_0x001a;
    L_0x0018:
        if (r10 == 0) goto L_0x009f;
    L_0x001a:
        r0 = r15.f;
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        return;
    L_0x001f:
        r0 = r1.d;
        r2 = r15.d;
        r0 = r0 & r2;
        r2 = r1.c;
        r3 = r15.getContentResolver();
        r0 = r15.a(r0, r2, r3);
        r12[r8] = r0;
        r0 = r12[r8];
        r0 = r0.a();
        if (r0 == 0) goto L_0x003f;
    L_0x0038:
        r0 = r12[r8];
        r0.e();
        if (r10 == 0) goto L_0x009f;
    L_0x003f:
        if (r8 != r13) goto L_0x0056;
    L_0x0041:
        r0 = r12[r9];
        r0 = r0.b();
        r2 = r12[r13];
        r2 = r2.b();
        if (r0 != r2) goto L_0x0056;
    L_0x004f:
        r0 = r12[r8];
        r0.e();
        if (r10 == 0) goto L_0x009f;
    L_0x0056:
        if (r8 != r14) goto L_0x006e;
    L_0x0058:
        r0 = 1;
        r0 = r12[r0];
        r0 = r0.b();
        r2 = r12[r14];
        r2 = r2.b();
        if (r0 != r2) goto L_0x006e;
    L_0x0067:
        r0 = r12[r8];
        r0.e();
        if (r10 == 0) goto L_0x009f;
    L_0x006e:
        r0 = new com.whatsapp.gallerypicker.at;
        r2 = r1.b;
        r3 = r15.d;
        r4 = r1.c;
        r5 = r15.getResources();
        r1 = r1.a;
        r5 = r5.getString(r1);
        r1 = r12[r8];
        r6 = r1.a(r9);
        r1 = r12[r8];
        r7 = r1.b();
        r1 = r15;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r1 = r12[r8];
        r1.e();
        r1 = r15.c;
        r2 = new com.whatsapp.gallerypicker.bk;
        r2.<init>(r15, r0);
        r1.post(r2);
    L_0x009f:
        r0 = r8 + 1;
        if (r10 != 0) goto L_0x001e;
    L_0x00a3:
        r8 = r0;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.GalleryPicker.k():void");
    }

    private void c() {
        int i = ImagePreview.y;
        Cursor query = getContentResolver().query(Uri.parse(z[6]), null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (!this.f || i != 0) {
                    aq a0Var;
                    if (this.d == 4) {
                        a0Var = new a0(getContentResolver(), 2, string);
                    } else {
                        a0Var = new ag(getContentResolver(), 2, string);
                    }
                    if (!a0Var.a()) {
                        this.c.post(new al(this, new at(this, 6, this.d, string, string2, a0Var.a(0), a0Var.b())));
                    }
                    a0Var.e();
                    if (i != 0) {
                        break;
                    }
                }
                break;
            }
            query.close();
        }
    }

    public void onStart() {
        super.onStart();
    }

    static int d(GalleryPicker galleryPicker) {
        return galleryPicker.s;
    }

    private void a(ContextMenu contextMenu, ContextMenuInfo contextMenuInfo) {
    }

    public void onStop() {
        super.onStop();
    }

    private void g() {
        this.c.post(new a4(this, ao.a(getContentResolver())));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            default:
                return false;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    static void a(GalleryPicker galleryPicker, Intent intent) {
        galleryPicker.a(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Intent intent;
        Intent intent2;
        PackageManager packageManager;
        List queryIntentActivities;
        int size;
        SubMenu subMenu;
        int i;
        int i2 = 0;
        int i3 = ImagePreview.y;
        if (this.d == 4) {
            intent = new Intent(z[43], Video.Media.INTERNAL_CONTENT_URI);
            intent.setType(z[46]);
            if (i3 == 0) {
                intent2 = intent;
                packageManager = getPackageManager();
                queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
                size = queryIntentActivities.size();
                if (size > 0) {
                    getSharedPreferences(z[44], 0);
                    getSupportMenuInflater().inflate(R.menu.gallery_picker, menu);
                    subMenu = menu.findItem(R.id.more).getSubMenu();
                    subMenu.clear();
                    menu.findItem(R.id.default_item).setVisible(false);
                    while (i2 < size) {
                        ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivities.get(i2);
                        Drawable loadIcon = resolveInfo.loadIcon(packageManager);
                        MenuItem add = subMenu.add(resolveInfo.loadLabel(packageManager));
                        add.setIcon(loadIcon);
                        add.setOnMenuItemClickListener(new b6(this, resolveInfo, intent2));
                        i = i2 + 1;
                        if (i3 != 0) {
                            break;
                        }
                        i2 = i;
                    }
                }
                return true;
            }
        }
        intent = new Intent(z[47], Media.INTERNAL_CONTENT_URI);
        intent.setType(z[45]);
        intent2 = intent;
        packageManager = getPackageManager();
        queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
        size = queryIntentActivities.size();
        if (size > 0) {
            getSharedPreferences(z[44], 0);
            getSupportMenuInflater().inflate(R.menu.gallery_picker, menu);
            subMenu = menu.findItem(R.id.more).getSubMenu();
            subMenu.clear();
            menu.findItem(R.id.default_item).setVisible(false);
            while (i2 < size) {
                ResolveInfo resolveInfo2 = (ResolveInfo) queryIntentActivities.get(i2);
                Drawable loadIcon2 = resolveInfo2.loadIcon(packageManager);
                MenuItem add2 = subMenu.add(resolveInfo2.loadLabel(packageManager));
                add2.setIcon(loadIcon2);
                add2.setOnMenuItemClickListener(new b6(this, resolveInfo2, intent2));
                i = i2 + 1;
                if (i3 != 0) {
                    break;
                }
                i2 = i;
            }
        }
        return true;
    }

    public void onDestroy() {
        Log.i(z[9]);
        super.onDestroy();
        e();
        z.b();
        getSharedPreferences(z[8], 0).edit().putInt(z[10], this.d).commit();
    }

    static void a(GalleryPicker galleryPicker, ContextMenu contextMenu, ContextMenuInfo contextMenuInfo) {
        galleryPicker.a(contextMenu, contextMenuInfo);
    }

    private void a(Intent intent) {
        int i = ImagePreview.y;
        String action = intent.getAction();
        if (action.equals(z[15])) {
            Log.i(z[17]);
            if (i == 0) {
                return;
            }
        }
        if (action.equals(z[18])) {
            Log.i(z[14]);
            a(true, false);
            if (i == 0) {
                return;
            }
        }
        if (action.equals(z[13])) {
            Log.i(z[19]);
            a(false, true);
            if (i == 0) {
                return;
            }
        }
        if (action.equals(z[11])) {
            Log.i(z[16]);
            a(false, false);
            if (i == 0) {
                return;
            }
        }
        if (action.equals(z[20])) {
            Log.i(z[12]);
            a(true, false);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3 = ImagePreview.y;
        switch (i) {
            case PBE.MD5 /*0*/:
                if (i2 == -1) {
                    if (this.d == 4) {
                        intent.putExtra(z[21], true);
                    }
                    setResult(-1, intent);
                    finish();
                    if (i3 == 0) {
                        return;
                    }
                }
                if (i2 == 2) {
                    setResult(2);
                    finish();
                    if (i3 == 0) {
                        return;
                    }
                }
                return;
                break;
            case ay.f /*1*/:
                break;
            default:
                return;
        }
        if (i2 == -1) {
            if (this.d == 4) {
                intent.putExtra(z[22], true);
            }
            setResult(-1, intent);
        }
        finish();
    }

    static int b(GalleryPicker galleryPicker) {
        return galleryPicker.k;
    }

    private void a(int i) {
        ((at) this.q.d.get(i)).a(this);
    }

    static boolean a(GalleryPicker galleryPicker) {
        return galleryPicker.n;
    }

    private void e() {
        if (this.j != null) {
            m();
            this.j.d();
            this.j = null;
            unregisterReceiver(this.h);
            getContentResolver().unregisterContentObserver(this.p);
            this.q = null;
            this.o.setAdapter(null);
        }
    }

    static void c(GalleryPicker galleryPicker) {
        galleryPicker.d();
    }

    static void a(GalleryPicker galleryPicker, boolean z, boolean z2, boolean z3) {
        galleryPicker.a(z, z2, z3);
    }

    public GalleryPicker() {
        this.d = 1;
        this.c = new Handler();
        this.f = false;
        this.e = new ArrayList();
    }

    private v a(int i, String str, ContentResolver contentResolver) {
        v a = ao.a(contentResolver, bq.EXTERNAL, i, 2, str);
        this.e.add(a);
        return a;
    }

    private void d() {
        g();
        if (!this.f) {
            k();
            if (!this.f) {
                j();
                if (!this.f) {
                    c();
                    if (!this.f) {
                        this.c.post(new a7(this));
                    }
                }
            }
        }
    }

    private void b() {
        if (this.l != null) {
            this.l.setVisibility(8);
        }
    }

    static z g(GalleryPicker galleryPicker) {
        return galleryPicker.j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j() {
        /*
        r11_this = this;
        r8 = com.whatsapp.gallerypicker.ImagePreview.y;
        r0 = r11.i;
        if (r0 != 0) goto L_0x0016;
    L_0x0006:
        r0 = r11.getContentResolver();
        r1 = com.whatsapp.gallerypicker.bq.EXTERNAL;
        r2 = r11.d;
        r3 = 2;
        r4 = 0;
        r0 = com.whatsapp.gallerypicker.ao.a(r0, r1, r2, r3, r4);
        if (r8 == 0) goto L_0x001a;
    L_0x0016:
        r0 = com.whatsapp.gallerypicker.ao.a();
    L_0x001a:
        r1 = r11.f;
        if (r1 == 0) goto L_0x0022;
    L_0x001e:
        r0.e();
    L_0x0021:
        return;
    L_0x0022:
        r1 = r0.c();
        r2 = new java.util.ArrayList;
        r1 = r1.entrySet();
        r2.<init>(r1);
        r1 = new com.whatsapp.gallerypicker.b8;
        r1.<init>(r11);
        java.util.Collections.sort(r2, r1);
        r0.e();
        r0 = r11.f;
        if (r0 != 0) goto L_0x0021;
    L_0x003e:
        r9 = r2.iterator();
    L_0x0042:
        r0 = r9.hasNext();
        if (r0 == 0) goto L_0x0021;
    L_0x0048:
        r0 = r9.next();
        r1 = r0;
        r1 = (java.util.Map.Entry) r1;
        r4 = r1.getKey();
        r4 = (java.lang.String) r4;
        if (r4 != 0) goto L_0x0059;
    L_0x0057:
        if (r8 == 0) goto L_0x0042;
    L_0x0059:
        r0 = r11.f;
        if (r0 != 0) goto L_0x0021;
    L_0x005d:
        r0 = b;
        r0 = r4.equals(r0);
        if (r0 != 0) goto L_0x009a;
    L_0x0065:
        r0 = r11.d;
        r2 = r11.getContentResolver();
        r10 = r11.a(r0, r4, r2);
        r0 = r10.a();
        if (r0 != 0) goto L_0x0097;
    L_0x0075:
        r0 = new com.whatsapp.gallerypicker.at;
        r2 = 5;
        r3 = r11.d;
        r5 = r1.getValue();
        r5 = (java.lang.String) r5;
        r1 = 0;
        r6 = r10.a(r1);
        r7 = r10.b();
        r1 = r11;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r1 = r11.c;
        r2 = new com.whatsapp.gallerypicker.ak;
        r2.<init>(r11, r0);
        r1.post(r2);
    L_0x0097:
        r10.e();
    L_0x009a:
        if (r8 == 0) goto L_0x0042;
    L_0x009c:
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.GalleryPicker.j():void");
    }
}
