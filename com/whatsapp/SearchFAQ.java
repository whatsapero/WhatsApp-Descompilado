package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import com.actionbarsherlock.R;
import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.as;
import com.whatsapp.fieldstats.e;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class SearchFAQ extends DialogToastListActivity {
    private static final String[] z;
    private String i;
    private e j;
    private HashMap k;
    private String l;
    private String m;
    private String n;
    private ArrayList o;

    static {
        String[] strArr = new String[19];
        String str = "P\u0011\u000e\u0001\u0002[\u001f\u0017\\\u0014C\u000eM|\u0010R\f\u0000G3r/MZ\u0007_\r";
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
                        i3 = 51;
                        break;
                    case ay.f /*1*/:
                        i3 = 126;
                        break;
                    case ay.n /*2*/:
                        i3 = 99;
                        break;
                    case ay.p /*3*/:
                        i3 = 47;
                        break;
                    default:
                        i3 = 117;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "R\u0010\u0007]\u001aZ\u001aMF\u001bG\u001b\r[[V\u0006\u0017]\u0014\u001d-7}0r3";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "P\u0011\u000e\u0001\u0002[\u001f\u0017\\\u0014C\u000eM|\u0010R\f\u0000G3r/MK\u0010@\u001d\u0011F\u0005G\u0017\fA\u0006";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "P\u0011\u000e\u0001\u0002[\u001f\u0017\\\u0014C\u000eM|\u0010R\f\u0000G3r/M_\u0007\\\u001c\u000fJ\u0018";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "P\u0011\u000e\u0001\u0002[\u001f\u0017\\\u0014C\u000eM|\u0010R\f\u0000G3r/MI\u0007\\\u0013";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "P\u0011\u000e\u0001\u0002[\u001f\u0017\\\u0014C\u000eM|\u0010R\f\u0000G3r/M\\\u0001R\n\u0016\\";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "P\u0011\u000e\u0001\u0002[\u001f\u0017\\\u0014C\u000eM|\u0010R\f\u0000G3r/M[\u001cG\u0012\u0006\\";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "P\u0011\u000e\u0001\u0002[\u001f\u0017\\\u0014C\u000eM|\u0010R\f\u0000G3r/ML\u001aF\u0010\u0017";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "P\u0011\u000e\u0001\u0002[\u001f\u0017\\\u0014C\u000eM|\u0010R\f\u0000G3r/MZ\u0007_\r";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "_\u001f\u001a@\u0000G!\nA\u0013_\u001f\u0017J\u0007";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "P\u0011\u000e\u0001\u0002[\u001f\u0017\\\u0014C\u000eM|\u0010R\f\u0000G3r/M_\u0007\\\u001c\u000fJ\u0018";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "P\u0011\u000e\u0001\u0002[\u001f\u0017\\\u0014C\u000eM|\u0010R\f\u0000G3r/M\\\u0001R\n\u0016\\";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "P\u0011\u000e\u0001\u0002[\u001f\u0017\\\u0014C\u000eM|\u0010R\f\u0000G3r/MK\u0010@\u001d\u0011F\u0005G\u0017\fA\u0006";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "P\u0011\u000e\u0001\u0002[\u001f\u0017\\\u0014C\u000eM|\u0010R\f\u0000G3r/M[\u001cG\u0012\u0006\\";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "P\u0011\u000e\u0001\u0002[\u001f\u0017\\\u0014C\u000eM|\u0010R\f\u0000G3r/MI\u0007\\\u0013";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "R\u0010\u0007]\u001aZ\u001aMF\u001bG\u001b\r[[V\u0006\u0017]\u0014\u001d-7}0r3";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "v\f\u0011@\u0007\u0013\u000e\u0002]\u0006Z\u0010\u0004\u000f\u0011\\\u000b\u0001C\u0010\u0013\u0011\u0016[U\\\u0018C";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "G\u0011\u0017N\u0019l\n\nB\u0010l\r\u0013J\u001bG";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "P\u0011\u000e\u0001\u0002[\u001f\u0017\\\u0014C\u000eM|\u0010R\f\u0000G3r/ML\u001aF\u0010\u0017";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static String a(SearchFAQ searchFAQ, String str) {
        searchFAQ.i = str;
        return str;
    }

    static String e(SearchFAQ searchFAQ) {
        return searchFAQ.n;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            double doubleValue;
            double doubleValue2 = Double.valueOf((double) intent.getLongExtra(z[18], 0)).doubleValue();
            if (this.k.containsKey(this.i)) {
                doubleValue = ((Double) this.k.get(this.i)).doubleValue() + doubleValue2;
            } else {
                doubleValue = doubleValue2;
            }
            try {
                this.k.put(this.i, Double.valueOf(doubleValue));
                if (this.j.a == null) {
                    this.j.a = Double.valueOf(0.0d);
                }
                if (doubleValue > this.j.a.doubleValue()) {
                    try {
                        this.j.h = Double.valueOf(this.i);
                        this.j.a = Double.valueOf(doubleValue);
                    } catch (Exception e) {
                        Log.e(z[17] + this.i);
                    }
                }
                try {
                    if (this.j.d == null) {
                        this.j.d = Double.valueOf(0.0d);
                    }
                    e eVar = this.j;
                    eVar.d = Double.valueOf(doubleValue2 + eVar.d.doubleValue());
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Exception e22) {
                throw e22;
            }
        }
    }

    static ArrayList c(SearchFAQ searchFAQ) {
        return searchFAQ.o;
    }

    public static void a(Context context, String str, String str2, ArrayList arrayList, String str3, int i, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        Intent intent = new Intent(context, SearchFAQ.class);
        intent.putExtra(z[5], str);
        intent.putExtra(z[4], str2);
        intent.putExtra(z[6], str3);
        intent.putExtra(z[1], i);
        intent.putStringArrayListExtra(z[7], arrayList2);
        intent.putStringArrayListExtra(z[3], arrayList3);
        intent.putStringArrayListExtra(z[0], arrayList4);
        intent.putParcelableArrayListExtra(z[2], arrayList);
        context.startActivity(intent);
    }

    public void onDestroy() {
        super.onDestroy();
        al.a((Context) this, this.j);
    }

    static String d(SearchFAQ searchFAQ) {
        return searchFAQ.m;
    }

    static String b(SearchFAQ searchFAQ) {
        return searchFAQ.l;
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case ay.f /*1*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(R.string.register_preparing));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            default:
                return super.onCreateDialog(i);
        }
    }

    public void onCreate(Bundle bundle) {
        int i = App.az;
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.search_faq);
        Intent intent = getIntent();
        this.l = intent.getStringExtra(z[15]);
        this.m = intent.getStringExtra(z[11]);
        this.n = intent.getStringExtra(z[12]);
        this.o = intent.getParcelableArrayListExtra(z[16]);
        this.j = new e();
        this.j.j = this.m;
        this.j.n = Double.valueOf((double) as.PROBLEM_DESCRIPTION.getCode());
        this.k = new HashMap();
        ((Button) findViewById(R.id.search_faq_footer)).setOnClickListener(new azk(this));
        ArrayList stringArrayListExtra = intent.getStringArrayListExtra(z[14]);
        ArrayList stringArrayListExtra2 = intent.getStringArrayListExtra(z[13]);
        ArrayList stringArrayListExtra3 = intent.getStringArrayListExtra(z[9]);
        int intExtra = intent.getIntExtra(z[8], 0);
        List arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < intExtra) {
            arrayList.add(new q(this, (String) stringArrayListExtra.get(i2), (String) stringArrayListExtra2.get(i2), (String) stringArrayListExtra3.get(i2)));
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        ListAdapter aoVar = new ao(this, this, R.layout.search_faq_row, arrayList);
        View listView = getListView();
        listView.addHeaderView(b7.a((LayoutInflater) getSystemService(z[10]), R.layout.search_faq_header, null));
        setListAdapter(aoVar);
        registerForContextMenu(listView);
    }

    static e a(SearchFAQ searchFAQ) {
        return searchFAQ.j;
    }
}
