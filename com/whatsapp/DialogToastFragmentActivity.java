package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.View;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.g;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class DialogToastFragmentActivity extends SherlockFragmentActivity implements ho {
    private static final String z;
    private b9 c;
    private boolean d;
    private boolean e;

    public class ClockWrongDialogFragment extends DialogFragment {
        private static final String z;
        boolean b;

        static {
            char[] toCharArray = "v\u0012\u0019Pfz\u0014\u0015Y&y]\u0017Y&}\u0016YB;q\u0013\u0013".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 30;
                        break;
                    case ay.f /*1*/:
                        i2 = 125;
                        break;
                    case ay.n /*2*/:
                        i2 = 116;
                        break;
                    case ay.p /*3*/:
                        i2 = 53;
                        break;
                    default:
                        i2 = 73;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public void onConfigurationChanged(Configuration configuration) {
            this.b = false;
            dismiss();
            new com.whatsapp.DialogToastFragmentActivity.ClockWrongDialogFragment().show(getActivity().getSupportFragmentManager(), getClass().getName());
        }

        public ClockWrongDialogFragment() {
            this.b = true;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (this.b && getActivity() != null) {
                getActivity().finish();
            }
        }

        public Dialog onCreateDialog(Bundle bundle) {
            Log.w(z);
            return a_3.a(getActivity());
        }
    }

    public class LoginFailedDialogFragment extends DialogFragment {
        public void onDismiss(DialogInterface dialogInterface) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setMessage(R.string.login_failure_password).setCancelable(false).setNeutralButton(R.string.overlay_reregister, new a8x(this)).create();
        }
    }

    public class MessageDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[4];
            String str = "\u0019;";
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
                            i3 = 112;
                            break;
                        case ay.f /*1*/:
                            i3 = 95;
                            break;
                        case ay.n /*2*/:
                            i3 = 77;
                            break;
                        case ay.p /*3*/:
                            i3 = 125;
                            break;
                        default:
                            i3 = 29;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "\u0019;";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        strArr2 = strArr3;
                        str = "\u001d:>\u000e|\u0017:";
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "\u001d:>\u000e|\u0017:";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        private static DialogFragment b(int i) {
            DialogFragment messageDialogFragment = new com.whatsapp.DialogToastFragmentActivity.MessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(z[0], i);
            messageDialogFragment.setArguments(bundle);
            return messageDialogFragment;
        }

        static DialogFragment a(int i) {
            return b(i);
        }

        private static DialogFragment b(String str) {
            DialogFragment messageDialogFragment = new com.whatsapp.DialogToastFragmentActivity.MessageDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[3], str);
            messageDialogFragment.setArguments(bundle);
            return messageDialogFragment;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.app.Dialog onCreateDialog(android.os.Bundle r5) {
            /*
            r4_this = this;
            r3 = 1;
            r0 = r4.getArguments();
            r1 = z;
            r2 = 2;
            r1 = r1[r2];
            r1 = r0.getInt(r1);
            if (r1 != 0) goto L_0x0020;
        L_0x0010:
            r0 = r4.getArguments();
            r2 = z;
            r2 = r2[r3];
            r0 = r0.getString(r2);
            r2 = com.whatsapp.App.az;
            if (r2 == 0) goto L_0x0024;
        L_0x0020:
            r0 = r4.getString(r1);
        L_0x0024:
            r1 = new android.app.AlertDialog$Builder;
            r2 = r4.getActivity();
            r1.<init>(r2);
            r0 = r1.setMessage(r0);
            r0 = r0.setCancelable(r3);
            r1 = 2131624632; // 0x7f0e02b8 float:1.887645E38 double:1.0531625005E-314;
            r2 = new com.whatsapp.asw;
            r2.<init>(r4);
            r0 = r0.setNeutralButton(r1, r2);
            r0 = r0.create();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DialogToastFragmentActivity.MessageDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
        }

        static DialogFragment a(String str) {
            return b(str);
        }
    }

    public class ProgressDialogFragment extends DialogFragment {
        private static final String[] z;
        private boolean b;

        static {
            String[] strArr = new String[6];
            String str = "ca&\u0016>ia\n\f;";
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
                            i3 = 14;
                            break;
                        case ay.f /*1*/:
                            i3 = 4;
                            break;
                        case ay.n /*2*/:
                            i3 = 85;
                            break;
                        case ay.p /*3*/:
                            i3 = 101;
                            break;
                        default:
                            i3 = 95;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "ca&\u0016>ia\n\f;";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "zm!\t:Qm1";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        str = "ca&\u0016>ia\n\f;";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "zm!\t:Qm1";
                        obj = 4;
                        break;
                    case aj.i /*4*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "zm!\t:Qm1";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        private static DialogFragment a(int i, int i2) {
            DialogFragment progressDialogFragment = new com.whatsapp.DialogToastFragmentActivity.ProgressDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(z[5], i);
            bundle.putInt(z[4], i2);
            progressDialogFragment.setArguments(bundle);
            return progressDialogFragment;
        }

        public ProgressDialogFragment() {
            this.b = false;
            Bundle bundle = new Bundle();
            bundle.putInt(z[1], R.string.processing);
            bundle.putInt(z[0], R.string.register_wait_message);
            setArguments(bundle);
        }

        public Dialog onCreateDialog(Bundle bundle) {
            int i = getArguments().getInt(z[3]);
            int i2 = getArguments().getInt(z[2]);
            Dialog progressDialog = new ProgressDialog(getActivity());
            if (i != 0) {
                progressDialog.setTitle(getString(i));
            }
            progressDialog.setMessage(getString(i2));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        }

        public void a() {
            if (isResumed()) {
                dismiss();
                if (App.az == 0) {
                    return;
                }
            }
            this.b = true;
        }

        static DialogFragment b(int i, int i2) {
            return a(i, i2);
        }

        public void onStart() {
            super.onStart();
            if (this.b) {
                dismiss();
                this.b = false;
            }
        }
    }

    public class SoftwareExpiredDialogFragment extends DialogFragment {
        private static final String z;

        static {
            char[] toCharArray = "$\u0006\u0017\rj(\u0000\u001b\u0004*+I\t\u0007#8\u001e\u001b\u001a a\f\u0002\u0018,>\f\u001e".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 76;
                        break;
                    case ay.f /*1*/:
                        i2 = 105;
                        break;
                    case ay.n /*2*/:
                        i2 = 122;
                        break;
                    case ay.p /*3*/:
                        i2 = 104;
                        break;
                    default:
                        i2 = 69;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public Dialog onCreateDialog(Bundle bundle) {
            Log.w(z);
            return a_3.e(getActivity());
        }

        public void onDismiss(DialogInterface dialogInterface) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    static {
        char[] toCharArray = "_~\u0000X,\\c\u000eU0Oq\u0013U$Vr\u000f@\"Xc\bB*OnN[-Yv\u0002_3Ir\u0012G&_8\u0000W7Ra\b@:\u001by\u000e\u0014\"Xc\bB&".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 59;
                    break;
                case ay.f /*1*/:
                    i2 = 23;
                    break;
                case ay.n /*2*/:
                    i2 = 97;
                    break;
                case ay.p /*3*/:
                    i2 = 52;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        try {
            super.onRestoreInstanceState(bundle);
        } catch (Throwable e) {
            Log.b(e);
        }
    }

    protected void onResume() {
        try {
            App.b((ho) this);
            super.onResume();
            if (this.d) {
                this.c.sendEmptyMessageDelayed(0, 3000);
            }
            this.e = true;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public DialogToastFragmentActivity() {
        this.d = true;
        this.e = true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case 16908332:
                    finish();
                    return true;
                default:
                    return super.onOptionsItemSelected(menuItem);
            }
        } catch (NullPointerException e) {
            throw e;
        }
        throw e;
    }

    protected void onPause() {
        try {
            App.a((ho) this);
            super.onPause();
            if (this.c.hasMessages(0)) {
                this.c.removeMessages(0);
            }
            App.r();
            this.e = false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void a(DialogFragment dialogFragment) {
        try {
            if (getSupportFragmentManager().findFragmentByTag(dialogFragment.getClass().getName()) == null) {
                dialogFragment.show(getSupportFragmentManager(), dialogFragment.getClass().getName());
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public boolean e() {
        try {
            if (isFinishing()) {
                return false;
            }
            a(new LoginFailedDialogFragment());
            return true;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public boolean a() {
        try {
            if (isFinishing()) {
                return false;
            }
            App.q = true;
            App.p.a7();
            a(new SoftwareExpiredDialogFragment());
            return true;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            if (App.G == 3) {
                g.b((Activity) this);
            }
            return super.onCreateOptionsMenu(menu);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        try {
            if (App.G == 3) {
                g.b((Activity) this);
            }
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void a(int i) {
        try {
            if (!isFinishing()) {
                MessageDialogFragment.a(i).show(getSupportFragmentManager(), null);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    @Deprecated
    public void f(String str) {
        try {
            if (!isFinishing()) {
                MessageDialogFragment.a(str).show(getSupportFragmentManager(), null);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void onBackPressed() {
        try {
            if (this.e) {
                super.onBackPressed();
                try {
                    if (App.az == 0) {
                        return;
                    }
                }
            }
            Log.e(z);
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = new b9();
    }

    public void a(int i, int i2) {
        a(ProgressDialogFragment.b(i, i2));
    }

    public void setContentView(int i) {
        setContentView(b7.a(getLayoutInflater(), i, null, false));
    }

    public boolean d() {
        try {
            if (isFinishing()) {
                return false;
            }
            App.q = true;
            App.p.a7();
            a(new ClockWrongDialogFragment());
            return true;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            if (App.G == 3) {
                switch (i) {
                    case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                        g.c(this).show();
                        return true;
                    case vk.SherlockTheme_textAppearanceSmall /*25*/:
                        g.b();
                        return true;
                    case 84:
                        g.a((Activity) this, false);
                        return true;
                }
            }
            return super.onKeyDown(i, keyEvent);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void c() {
        ProgressDialogFragment progressDialogFragment = (ProgressDialogFragment) getSupportFragmentManager().findFragmentByTag(ProgressDialogFragment.class.getName());
        if (progressDialogFragment != null) {
            try {
                progressDialogFragment.dismiss();
            } catch (NullPointerException e) {
                throw e;
            }
        }
    }
}
