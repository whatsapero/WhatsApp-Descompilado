package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.qrcode.QrCodeActivity;
import com.whatsapp.util.Log;
import java.util.HashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class WebSessionsActivity extends DialogToastFragmentActivity {
    private static final String[] z;
    private View f;
    private HashMap g;
    private a5y h;
    private hu i;
    private View j;
    private ListView k;
    private final Runnable l;

    public class LogoutAllConfirmationDialogFragment extends DialogFragment {
        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setMessage(R.string.confirmation_delete_all_qr).setNegativeButton(R.string.cancel, null).setPositiveButton(R.string.log_out, new a8l(this)).create();
        }
    }

    static {
        String[] strArr = new String[3];
        String str = "\u0004t\u0018V\u0017\u0000b\u0013J\u001c\u0000>\u0019W\u0017\u0012e\u001f";
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
                        i3 = 115;
                        break;
                    case ay.f /*1*/:
                        i3 = 17;
                        break;
                    case ay.n /*2*/:
                        i3 = 122;
                        break;
                    case ay.p /*3*/:
                        i3 = 37;
                        break;
                    default:
                        i3 = 114;
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
                    str = "\u0004t\u0018V\u0017\u0000b\u0013J\u001c\u0000>\u001e@\u0001\u0007c\u0015\\";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0004t\u0018\u000b\u0005\u001bp\u000eV\u0013\u0003aTF\u001d\u001e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public WebSessionsActivity() {
        this.h = new amp(this);
        this.l = new alv(this);
    }

    static Runnable a(WebSessionsActivity webSessionsActivity) {
        return webSessionsActivity.l;
    }

    static View c(WebSessionsActivity webSessionsActivity) {
        return webSessionsActivity.j;
    }

    protected void onCreate(Bundle bundle) {
        Log.i(z[0]);
        super.onCreate(bundle);
        this.g = new HashMap();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.web_sessions);
        this.k = (ListView) findViewById(16908298);
        View a = b7.a(getLayoutInflater(), R.layout.web_sessions_header, null, false);
        this.f = a.findViewById(R.id.header);
        am1.b((TextView) a.findViewById(R.id.sessions_title));
        this.k.addHeaderView(a, null, false);
        a = b7.a(getLayoutInflater(), R.layout.web_sessions_footer, null, false);
        this.j = a.findViewById(R.id.footer);
        a.findViewById(R.id.logout_all).setOnClickListener(new qx(this));
        ((TextView) a.findViewById(R.id.hint)).setText(getString(R.string.qr_code_hint_2, new Object[]{z[1]}));
        this.k.addFooterView(a, null, false);
        this.i = new hu(this, null);
        this.i.a(a12.g());
        this.k.setVisibility(this.i.getCount() > 0 ? 0 : 8);
        this.k.setAdapter(this.i);
        this.k.setOnItemClickListener(new we(this));
        App.p.U().postDelayed(this.l, 30000);
        a12.b(this.h);
    }

    static void a(WebSessionsActivity webSessionsActivity, String str) {
        webSessionsActivity.a(str);
    }

    static HashMap b(WebSessionsActivity webSessionsActivity) {
        return webSessionsActivity.g;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, (int) R.id.menuitem_scan_qr, 0, (int) R.string.menuitem_scan_qr).setIcon((int) R.drawable.ic_action_add).setShowAsAction(2);
        return true;
    }

    static hu e(WebSessionsActivity webSessionsActivity) {
        return webSessionsActivity.i;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            case R.id.menuitem_scan_qr:
                if (App.a()) {
                    startActivity(new Intent(this, QrCodeActivity.class));
                    if (App.az == 0) {
                        return true;
                    }
                }
                App.b(getBaseContext(), (int) R.string.network_required, 0);
                return true;
            default:
                return false;
        }
    }

    private void a(String str, long j) {
        if (((CountDownTimer) this.g.get(str)) == null) {
            this.g.put(str, new asg(this, j - System.currentTimeMillis(), 60000, str).start());
        }
    }

    public void onDestroy() {
        int i = App.az;
        Log.i(z[2]);
        super.onDestroy();
        a12.a(this.h);
        App.p.U().removeCallbacks(this.l);
        for (CountDownTimer countDownTimer : this.g.values()) {
            countDownTimer.cancel();
            if (i != 0) {
                return;
            }
        }
    }

    private void a(String str) {
        CountDownTimer countDownTimer = (CountDownTimer) this.g.get(str);
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.g.remove(str);
        }
    }

    static void a(WebSessionsActivity webSessionsActivity, String str, long j) {
        webSessionsActivity.a(str, j);
    }

    static View d(WebSessionsActivity webSessionsActivity) {
        return webSessionsActivity.f;
    }
}
