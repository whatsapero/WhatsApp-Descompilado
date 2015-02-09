package com.whatsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.ActionBar;
import com.whatsapp.fieldstats.au;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ListMembersSelector extends MultipleContactsSelector {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\f4F\u0013C-3\u001b\u0005[<i\u0006\u0001_";
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
                        i3 = 76;
                        break;
                    case ay.f /*1*/:
                        i3 = 71;
                        break;
                    case ay.n /*2*/:
                        i3 = 104;
                        break;
                    case ay.p /*3*/:
                        i3 = 100;
                        break;
                    default:
                        i3 = 43;
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
                    str = " .\u001b\u0010F)*\n\u0001Y?4\r\bN/3\u0007\u0016\u0004/5\r\u0005_)";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = " .\u001b\u0010F)*\n\u0001Y?4\r\bN/3\u0007\u0016\u0004(\"\u001b\u0010Y#>";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected String b() {
        return getString(R.string.new_list);
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[2]);
        super.onCreate(bundle);
        ak4.a(au.NEW_BROADCAST_LIST);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        supportActionBar.setTitle((int) R.string.new_list);
    }

    public void onDestroy() {
        Log.i(z[1]);
        super.onDestroy();
    }

    protected int f() {
        return ge.f == 0 ? -1 : ge.f;
    }

    protected int j() {
        return 2;
    }

    protected void h() {
        int i = App.az;
        String c = v.c();
        Vector vector = new Vector(this.k.size());
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            vector.add(((m8) it.next()).e);
            if (i != 0) {
                break;
            }
        }
        bd.a(c, vector);
        b bVar = new b(c, "", null);
        bVar.D = App.a2();
        bVar.a = 6;
        bVar.k = 9;
        bVar.A = vector;
        bVar.F = App.af() + z[0];
        App.aJ.f(bVar);
        HashSet hashSet = new HashSet();
        it = this.k.iterator();
        while (it.hasNext()) {
            hashSet.add(((m8) it.next()).e);
            if (i != 0) {
                break;
            }
        }
        App.n(c);
        startActivity(Conversation.a(v.a(c, "", System.currentTimeMillis())));
        finish();
    }

    protected int e() {
        return R.string.create;
    }

    protected void a(ListView listView) {
        View textView = new TextView(this);
        textView.setTextSize(ConversationRow.b(getResources()));
        textView.setPadding(0, getResources().getDimensionPixelSize(R.dimen.conversation_row_padding), 0, getResources().getDimensionPixelSize(R.dimen.conversation_row_padding));
        textView.setText(getString(R.string.broadcast_to_recipients_note, new Object[]{"\u202a" + VerifyNumber.a(App.an.cc, App.an.jabber_id.substring(App.an.cc.length())) + "\u202c"}));
        listView.addFooterView(textView);
    }

    protected String a() {
        return getString(R.string.list_recipients).toUpperCase();
    }

    protected void d() {
        super.d();
    }

    protected int g() {
        return R.string.broadcast_reach_limit;
    }
}
