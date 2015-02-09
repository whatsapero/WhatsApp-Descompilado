package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import java.util.ArrayList;
import java.util.Collection;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class CallLogActivity extends DialogToastFragmentActivity implements anq {
    private static final String[] z;
    private ListView f;
    private ArrayList g;
    private v9 h;
    private be i;
    private ImageView j;
    private View k;
    private m8 l;

    static {
        String[] strArr = new String[10];
        String str = "\u001e1n";
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
                        i3 = 116;
                        break;
                    case ay.f /*1*/:
                        i3 = 88;
                        break;
                    case ay.n /*2*/:
                        i3 = 10;
                        break;
                    case ay.p /*3*/:
                        i3 = 1;
                        break;
                    default:
                        i3 = 100;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u001e1n";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u00179fm\b\u001b?%t\u0014\u00109~d";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u00179fm\b\u001b?%b\u0016\u00119~d";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u00179fm\u0017";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001e1n";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001e1n";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u00179fm\b\u001b?%e\u0001\u0018=~d";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001e1n";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u00179fm\b\u001b?%e\u0001\u0007,xn\u001d";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static int b(b bVar) {
        if (bVar.e.b) {
            return R.string.outgoing_call;
        }
        return bVar.p > 0 ? R.string.incoming_call : R.string.conversations_most_recent_call_missed;
    }

    public void a() {
        d();
    }

    public void onDestroy() {
        Log.i(z[1]);
        super.onDestroy();
        if (this.h != null) {
            this.h.cancel(true);
        }
        App.a((anq) this);
    }

    public void a(Collection collection) {
    }

    public void c(String str) {
        if (str.equals(getIntent().getStringExtra(z[6]))) {
            d();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r7) {
        /*
        r6_this = this;
        r5 = 1;
        r4 = 0;
        r1 = com.whatsapp.App.az;
        r0 = z;
        r2 = 4;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r7);
        r0 = r6.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r5);
        r0 = 2130903086; // 0x7f03002e float:1.741298E38 double:1.0528060094E-314;
        r6.setContentView(r0);
        r0 = 16908298; // 0x102000a float:2.3877257E-38 double:8.353809E-317;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.ListView) r0;
        r6.f = r0;
        r0 = r6.getLayoutInflater();
        r2 = 2130903087; // 0x7f03002f float:1.7412982E38 double:1.05280601E-314;
        r3 = r6.f;
        r0 = com.whatsapp.b7.a(r0, r2, r3, r4);
        r2 = r6.f;
        r3 = 0;
        r2.addHeaderView(r0, r3, r4);
        r0 = 2131427513; // 0x7f0b00b9 float:1.8476644E38 double:1.053065111E-314;
        r0 = r6.findViewById(r0);
        r6.k = r0;
        r0 = r6.k;
        r0.setClickable(r5);
        r0 = r6.f;
        r2 = new com.whatsapp.yo;
        r2.<init>(r6);
        r0.setOnScrollListener(r2);
        r0 = r6.f;
        r0 = r0.getViewTreeObserver();
        r2 = new com.whatsapp.z3;
        r2.<init>(r6);
        r0.addOnGlobalLayoutListener(r2);
        r0 = 2131427593; // 0x7f0b0109 float:1.8476807E38 double:1.0530651503E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r6.j = r0;
        r0 = r6.j;
        r2 = new com.whatsapp.a5s;
        r2.<init>(r6);
        r0.setOnClickListener(r2);
        r0 = 2131427595; // 0x7f0b010b float:1.847681E38 double:1.0530651513E-314;
        r0 = r6.findViewById(r0);
        r2 = new com.whatsapp.qn;
        r2.<init>(r6);
        r0.setOnClickListener(r2);
        r0 = new com.whatsapp.be;
        r2 = 2130903186; // 0x7f030092 float:1.7413183E38 double:1.052806059E-314;
        r0.<init>(r6, r6, r2);
        r6.i = r0;
        r0 = r6.f;
        r2 = r6.i;
        r0.setAdapter(r2);
        r0 = r6.getIntent();
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r0 = r0.getParcelableArrayListExtra(r2);
        if (r0 == 0) goto L_0x011c;
    L_0x00a4:
        r2 = new java.util.ArrayList;
        r2.<init>();
        r6.g = r2;
        r2 = r0.iterator();
    L_0x00af:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x00cc;
    L_0x00b5:
        r0 = r2.next();
        r0 = (android.os.Parcelable) r0;
        r0 = (com.whatsapp.w4) r0;
        r3 = com.whatsapp.App.aJ;
        r0 = r0.a;
        r0 = r3.b(r0);
        r3 = r6.g;
        r3.add(r0);
        if (r1 == 0) goto L_0x00af;
    L_0x00cc:
        r0 = r6.i;
        r2 = r6.g;
        r0.a(r2);
        r0 = r6.g;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x011c;
    L_0x00db:
        r0 = r6.g;
        r0 = r0.get(r4);
        r0 = (com.whatsapp.protocol.b) r0;
        r2 = com.whatsapp.App.f(r0);
        r0 = 2131427600; // 0x7f0b0110 float:1.847682E38 double:1.053065154E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        com.whatsapp.am1.b(r0);
        r4 = android.text.format.DateUtils.isToday(r2);
        if (r4 == 0) goto L_0x0101;
    L_0x00f9:
        r4 = 2131625023; // 0x7f0e043f float:1.8877242E38 double:1.0531626937E-314;
        r0.setText(r4);
        if (r1 == 0) goto L_0x011c;
    L_0x0101:
        r4 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r4 = r4 + r2;
        r4 = android.text.format.DateUtils.isToday(r4);
        if (r4 == 0) goto L_0x0113;
    L_0x010b:
        r4 = 2131625133; // 0x7f0e04ad float:1.8877465E38 double:1.053162748E-314;
        r0.setText(r4);
        if (r1 == 0) goto L_0x011c;
    L_0x0113:
        r1 = 16;
        r1 = android.text.format.DateUtils.formatDateTime(r6, r2, r1);
        r0.setText(r1);
    L_0x011c:
        r6.d();
        com.whatsapp.App.b(r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.CallLogActivity.onCreate(android.os.Bundle):void");
    }

    static void b(CallLogActivity callLogActivity) {
        callLogActivity.b();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            case R.id.menuitem_clear_call_log:
                Log.i(z[8]);
                if (this.g == null) {
                    return true;
                }
                App.aJ.b(this.g);
                finish();
                return true;
            default:
                return false;
        }
    }

    static ImageView a(CallLogActivity callLogActivity) {
        return callLogActivity.j;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, (int) R.id.menuitem_clear_call_log, 0, (int) R.string.clear_single_log).setIcon((int) R.drawable.ic_action_delete).setShowAsAction(2);
        return true;
    }

    public void a(String str) {
        if (str.equals(getIntent().getStringExtra(z[0]))) {
            d();
        }
    }

    public void b(String str) {
        if (str.equals(getIntent().getStringExtra(z[7]))) {
            ((TextView) findViewById(R.id.conversation_contact_status)).setText(this.l.u());
        }
    }

    private void d() {
        Log.i(z[3]);
        this.l = v.b(getIntent().getStringExtra(z[2]));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mid_avatar_size);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.l.j(), dimensionPixelSize, dimensionPixelSize, true);
        if (createScaledBitmap != null) {
            this.j.setImageBitmap(createScaledBitmap);
        }
        TextView textView = (TextView) findViewById(R.id.conversation_contact_name);
        textView.setText(a5.b(this.l.a((Context) this), getBaseContext(), textView.getPaint()));
        ((TextView) findViewById(R.id.conversation_contact_status)).setText(this.l.u());
        if (this.h != null) {
            this.h.cancel(true);
        }
        this.h = new v9(this);
        a5w.a(this.h, new Void[0]);
    }

    public void d(String str) {
        if (str.equals(getIntent().getStringExtra(z[9]))) {
            d();
        }
    }

    static m8 c(CallLogActivity callLogActivity) {
        return callLogActivity.l;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r4_this = this;
        r1 = com.whatsapp.App.az;
        r0 = r4.f;
        r2 = 0;
        r0 = r0.getChildAt(r2);
        if (r0 == 0) goto L_0x0052;
    L_0x000b:
        r2 = r4.f;
        r2 = r2.getWidth();
        r3 = r4.f;
        r3 = r3.getHeight();
        if (r2 <= r3) goto L_0x003e;
    L_0x0019:
        r2 = r4.f;
        r2 = r2.getFirstVisiblePosition();
        if (r2 != 0) goto L_0x0027;
    L_0x0021:
        r0 = r0.getTop();
        if (r1 == 0) goto L_0x0030;
    L_0x0027:
        r0 = r4.k;
        r0 = r0.getHeight();
        r0 = -r0;
        r0 = r0 + 1;
    L_0x0030:
        r2 = r4.k;
        r3 = r4.k;
        r3 = r3.getTop();
        r0 = r0 - r3;
        r2.offsetTopAndBottom(r0);
        if (r1 == 0) goto L_0x0052;
    L_0x003e:
        r0 = r4.k;
        r0 = r0.getTop();
        if (r0 == 0) goto L_0x0052;
    L_0x0046:
        r0 = r4.k;
        r1 = r4.k;
        r1 = r1.getTop();
        r1 = -r1;
        r0.offsetTopAndBottom(r1);
    L_0x0052:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.CallLogActivity.b():void");
    }

    public static int a(b bVar) {
        if (bVar.e.b) {
            return R.drawable.call_out;
        }
        return bVar.p > 0 ? R.drawable.call_inc : R.drawable.call_missed;
    }
}
