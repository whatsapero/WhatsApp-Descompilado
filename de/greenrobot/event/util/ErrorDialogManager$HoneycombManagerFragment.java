package de.greenrobot.event.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import de.greenrobot.event.g;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

@TargetApi(11)
public class ErrorDialogManager$HoneycombManagerFragment extends Fragment {
    private static final String[] z;
    protected boolean a;
    private Object b;
    protected Bundle c;
    private g d;

    static {
        String[] strArr = new String[4];
        String str = "z\u001b%N?{\u001be[\"|\u0011\u007f\u0007(h\u001be]/k\r%L?l\u0011yv)w\u001fgF*A\u0013jG,y\u001by";
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
                        i3 = 30;
                        break;
                    case ay.f /*1*/:
                        i3 = 126;
                        break;
                    case ay.n /*2*/:
                        i3 = 11;
                        break;
                    case ay.p /*3*/:
                        i3 = 41;
                        break;
                    default:
                        i3 = 77;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "z\u001b%N?{\u001be[\"|\u0011\u007f\u0007(h\u001be]/k\r%L?l\u0011yv)w\u001fgF*";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "z\u001b%N?{\u001be[\"|\u0011\u007f\u0007(h\u001be]/k\r%L?l\u0011yv)w\u001fgF*";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "z\u001b%N?{\u001be[\"|\u0011\u007f\u0007(h\u001be]/k\r%L?l\u0011yv)w\u001fgF*A\u0013jG,y\u001by";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onEventMainThread(b bVar) {
        if (f.a(this.b, bVar)) {
            f.a(bVar);
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.executePendingTransactions();
            DialogFragment dialogFragment = (DialogFragment) fragmentManager.findFragmentByTag(z[2]);
            if (dialogFragment != null) {
                dialogFragment.dismiss();
            }
            dialogFragment = (DialogFragment) f.a.a(bVar, this.a, this.c);
            if (dialogFragment != null) {
                dialogFragment.show(fragmentManager, z[3]);
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.d = f.a.b.b();
        this.d.a((Object) this);
    }

    public static void a(Activity activity, Object obj, boolean z, Bundle bundle) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        ErrorDialogManager$HoneycombManagerFragment errorDialogManager$HoneycombManagerFragment = (ErrorDialogManager$HoneycombManagerFragment) fragmentManager.findFragmentByTag(z[0]);
        if (errorDialogManager$HoneycombManagerFragment == null) {
            errorDialogManager$HoneycombManagerFragment = new ErrorDialogManager$HoneycombManagerFragment();
            fragmentManager.beginTransaction().add(errorDialogManager$HoneycombManagerFragment, z[1]).commit();
            fragmentManager.executePendingTransactions();
        }
        errorDialogManager$HoneycombManagerFragment.a = z;
        errorDialogManager$HoneycombManagerFragment.c = bundle;
        errorDialogManager$HoneycombManagerFragment.b = obj;
    }

    public void onPause() {
        this.d.d(this);
        super.onPause();
    }
}
