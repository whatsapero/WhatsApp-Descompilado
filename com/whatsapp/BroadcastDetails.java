package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.protocol.b;
import com.whatsapp.protocol.m;
import com.whatsapp.util.Log;
import com.whatsapp.util.bo;
import com.whatsapp.wallpaper.p;
import java.util.ArrayList;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class BroadcastDetails extends DialogToastActivity {
    private static final String[] z;
    private final anq j;
    private final fc k;
    private b l;
    private m8 m;
    private final fk n;
    private String[] o;
    private af0 p;

    static {
        String[] strArr = new String[6];
        String str = "\u0000\u0006\u0010Z\u0005\u0001\u0015\fO\u0005\u0007\u0000\u001eR\r\u0011[\u001b^\u0012\u0016\u0006\u0010B";
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
                        i3 = 98;
                        break;
                    case ay.f /*1*/:
                        i3 = 116;
                        break;
                    case ay.n /*2*/:
                        i3 = 127;
                        break;
                    case ay.p /*3*/:
                        i3 = 59;
                        break;
                    default:
                        i3 = 97;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u000b\u0010";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0000\u0006\u0010Z\u0005\u0001\u0015\fO\u0005\u0007\u0000\u001eR\r\u0011[\u001cI\u0004\u0003\u0000\u001a";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0000\u0006\u0010Z\u0005\u0001\u0015\fO";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0000\u0006\u0010Z\u0005\u0001\u0015\fO";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0000\u0006\u0010Z\u0005\u0001\u0015\fO";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static b e(BroadcastDetails broadcastDetails) {
        return broadcastDetails.l;
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case ay.p /*3*/:
                if (this.m == null) {
                    return super.onCreateDialog(i);
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(getString(R.string.message_contact_name, new Object[]{this.m.o()}));
                arrayList2.add(Integer.valueOf(1));
                arrayList.add(getString(R.string.call_contact_name, new Object[]{this.m.o()}));
                arrayList2.add(Integer.valueOf(4));
                if (this.m.h != null) {
                    arrayList.add(getString(R.string.view_contact_name, new Object[]{this.m.o()}));
                    arrayList2.add(Integer.valueOf(0));
                }
                CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
                arrayList.toArray(charSequenceArr);
                Builder builder = new Builder(this);
                builder.setItems(charSequenceArr, new a_r(this, arrayList2));
                Dialog create = builder.create();
                create.setOnCancelListener(new fv(this));
                create.requestWindowFeature(1);
                return create;
            default:
                return super.onCreateDialog(i);
        }
    }

    private boolean a(m8 m8Var, int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                if (m8Var.h != null) {
                    ContactInfo.a(m8Var, (Activity) this);
                    break;
                }
                break;
            case ay.f /*1*/:
                startActivity(Conversation.a(m8Var));
                break;
            case aj.i /*4*/:
                App.b(m8Var, (Activity) this);
                break;
        }
        return true;
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

    static String[] d(BroadcastDetails broadcastDetails) {
        return broadcastDetails.o;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.broadcast_details);
        Log.i(z[3]);
        App.aJ.b(this.k);
        App.b(this.j);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        this.l = App.aJ.b(new m(z[4], true, intent.getStringExtra(z[2])));
        if (this.l == null || this.l.F == null) {
            finish();
            return;
        }
        this.o = this.l.F.split(",");
        ListView listView = (ListView) findViewById(16908298);
        this.p = new af0(this, this);
        listView.setAdapter(this.p);
        listView.setOnItemClickListener(new ala(this));
        getSupportActionBar().setTitle(String.format(App.aX.a(R.plurals.broadcast_to_n_contacts, this.o.length), new Object[]{Integer.valueOf(this.o.length)}));
        ((TextView) findViewById(R.id.broadcast_details_divider)).setText(getString(R.string.broadcast_recipients_list, new Object[]{Integer.valueOf(this.o.length)}));
        View a = Conversation.a((Context) this, this.l);
        a.f();
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.conversation_row_center);
        viewGroup.addView(a, -2, -2);
        ((LayoutParams) a.getChildAt(1).getLayoutParams()).rightMargin = 0;
        ((LayoutParams) a.getChildAt(1).getLayoutParams()).leftMargin = 0;
        ((LayoutParams) a.getChildAt(1).getLayoutParams()).addRule(11, 0);
        Drawable f = p.f(this);
        if (f != null) {
            a = findViewById(R.id.conversation_row_holder);
            a.setBackgroundDrawable(new avp(this, f, a));
        }
        View findViewById = findViewById(R.id.conversation_row_holder);
        viewGroup.measure(MeasureSpec.makeMeasureSpec(-1, 0), MeasureSpec.makeMeasureSpec(-2, 0));
        int height = getWindowManager().getDefaultDisplay().getHeight() / 2;
        if (viewGroup.getMeasuredHeight() > height) {
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(-1, height));
        }
        bo.c(z[5]);
    }

    static af0 a(BroadcastDetails broadcastDetails) {
        return broadcastDetails.p;
    }

    static m8 a(BroadcastDetails broadcastDetails, m8 m8Var) {
        broadcastDetails.m = m8Var;
        return m8Var;
    }

    static boolean a(BroadcastDetails broadcastDetails, m8 m8Var, int i) {
        return broadcastDetails.a(m8Var, i);
    }

    public void onDestroy() {
        Log.i(z[0]);
        super.onDestroy();
        this.n.a();
        App.aJ.a(this.k);
        App.a(this.j);
        bo.a(z[1]);
    }

    static fk b(BroadcastDetails broadcastDetails) {
        return broadcastDetails.n;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    static m8 c(BroadcastDetails broadcastDetails) {
        return broadcastDetails.m;
    }

    public BroadcastDetails() {
        this.n = new fk();
        this.k = new g5(this);
        this.j = new as(this);
    }
}
