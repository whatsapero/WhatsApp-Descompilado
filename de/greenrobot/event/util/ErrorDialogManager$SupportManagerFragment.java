package de.greenrobot.event.util;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import de.greenrobot.event.g;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ErrorDialogManager$SupportManagerFragment extends Fragment {
    private static final String[] z;
    private boolean b;
    private g c;
    protected boolean d;
    private Object e;
    protected Bundle f;

    static {
        String[] strArr = new String[4];
        String str = "\u007fGMaR~G\rtOyM\u0017(EmG\rrBnQMcRiM\u0011YDrC\u000fiG";
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
                        i3 = 27;
                        break;
                    case ay.f /*1*/:
                        i3 = 34;
                        break;
                    case ay.n /*2*/:
                        i3 = 99;
                        break;
                    case ay.p /*3*/:
                        i3 = 6;
                        break;
                    default:
                        i3 = 32;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u007fGMaR~G\rtOyM\u0017(EmG\rrBnQMcRiM\u0011YDrC\u000fiGDO\u0002hA|G\u0011";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u007fGMaR~G\rtOyM\u0017(EmG\rrBnQMcRiM\u0011YDrC\u000fiGDO\u0002hA|G\u0011";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u007fGMaR~G\rtOyM\u0017(EmG\rrBnQMcRiM\u0011YDrC\u000fiG";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onEventMainThread(b bVar) {
        if (f.a(this.e, bVar)) {
            f.a(bVar);
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.executePendingTransactions();
            DialogFragment dialogFragment = (DialogFragment) fragmentManager.findFragmentByTag(z[0]);
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
            dialogFragment = (DialogFragment) f.a.a(bVar, this.d, this.f);
            if (dialogFragment != null) {
                dialogFragment.show(fragmentManager, z[1]);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = f.a.b.b();
        this.c.a((Object) this);
        this.b = true;
    }

    public void onResume() {
        super.onResume();
        if (this.b) {
            this.b = false;
            if (!h.a) {
                return;
            }
        }
        this.c = f.a.b.b();
        this.c.a((Object) this);
    }

    public static void a(Activity activity, Object obj, boolean z, Bundle bundle) {
        boolean z2 = h.a;
        FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
        ErrorDialogManager$SupportManagerFragment errorDialogManager$SupportManagerFragment = (ErrorDialogManager$SupportManagerFragment) supportFragmentManager.findFragmentByTag(z[2]);
        if (errorDialogManager$SupportManagerFragment == null) {
            errorDialogManager$SupportManagerFragment = new ErrorDialogManager$SupportManagerFragment();
            supportFragmentManager.beginTransaction().add((Fragment) errorDialogManager$SupportManagerFragment, z[3]).commit();
            supportFragmentManager.executePendingTransactions();
        }
        errorDialogManager$SupportManagerFragment.d = z;
        errorDialogManager$SupportManagerFragment.f = bundle;
        errorDialogManager$SupportManagerFragment.e = obj;
        if (g.o != 0) {
            h.a = !z2;
        }
    }

    public void onPause() {
        this.c.d(this);
        super.onPause();
    }
}
