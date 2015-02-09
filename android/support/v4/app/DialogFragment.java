package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class DialogFragment extends Fragment implements OnCancelListener, OnDismissListener {
    private static final String[] z;
    int mBackStackId;
    boolean mCancelable;
    Dialog mDialog;
    boolean mDismissed;
    boolean mShownByMe;
    boolean mShowsDialog;
    int mStyle;
    int mTheme;
    boolean mViewDestroyed;

    static {
        String[] strArr = new String[15];
        String str = "^Ij\u0006'Fwz\u00074^Ig\f ";
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
                        i3 = 50;
                        break;
                    case ay.f /*1*/:
                        i3 = 40;
                        break;
                    case ay.n /*2*/:
                        i3 = 19;
                        break;
                    case ay.p /*3*/:
                        i3 = 105;
                        break;
                    default:
                        i3 = 82;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "SFw\u001b=[L)\u001d:WEv";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "SFw\u001b=[L)\n3\\Kv\u00053PDv";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "SFw\u001b=[L)\u001a3DMw-;SD|\u000e\u0001FIg\f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "SFw\u001b=[L)\u000b3QC@\u001d3QCZ\r";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "SFw\u001b=[L)\u001a&KDv";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "SFw\u001b=[L)\u001a:]_`-;SD|\u000e";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "SFw\u001b=[L)\n3\\Kv\u00053PDv";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "SFw\u001b=[L)\u001a:]_`-;SD|\u000e";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "SFw\u001b=[L)\u000b3QC@\u001d3QCZ\r";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "SFw\u001b=[L)\u001a&KDv";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "SFw\u001b=[L)\u001d:WEv";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "SFw\u001b=[L)\u001a3DMw-;SD|\u000e\u0001FIg\f";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "vAr\u0005=Una\b5_M}\u001drQI}I<]\\3\u000b7\u0012Ig\u001d3Q@v\rrFG3\brQG}\u001d3[Fv\u001brDAv\u001e";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "^Ij\u0006'Fwz\u00074^Ig\f ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    void dismissInternal(boolean z) {
        boolean z2 = FragmentActivity.a;
        try {
            if (!this.mDismissed) {
                try {
                    this.mDismissed = true;
                    this.mShownByMe = false;
                    if (this.mDialog != null) {
                        this.mDialog.dismiss();
                        this.mDialog = null;
                    }
                    try {
                        this.mViewDestroyed = true;
                        if (this.mBackStackId >= 0) {
                            getFragmentManager().popBackStack(this.mBackStackId, 1);
                            this.mBackStackId = -1;
                            if (!z2) {
                                return;
                            }
                        }
                        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
                        try {
                            beginTransaction.remove(this);
                            if (z) {
                                beginTransaction.commitAllowingStateLoss();
                                if (!z2) {
                                    return;
                                }
                            }
                            beginTransaction.commit();
                        } catch (IllegalStateException e) {
                            throw e;
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        try {
            if (!this.mViewDestroyed) {
                dismissInternal(true);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void onDetach() {
        try {
            super.onDetach();
            try {
                if (!this.mShownByMe) {
                    if (!this.mDismissed) {
                        this.mDismissed = true;
                    }
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void onStop() {
        try {
            super.onStop();
            if (this.mDialog != null) {
                this.mDialog.hide();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void dismiss() {
        dismissInternal(false);
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add((Fragment) this, str);
        beginTransaction.commit();
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onAttach(Activity activity) {
        try {
            super.onAttach(activity);
            if (!this.mShownByMe) {
                this.mDismissed = false;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        try {
            if (!this.mShowsDialog) {
                return super.getLayoutInflater(bundle);
            }
            try {
                this.mDialog = onCreateDialog(bundle);
                switch (this.mStyle) {
                    case ay.f /*1*/:
                    case ay.n /*2*/:
                        break;
                    case ay.p /*3*/:
                        this.mDialog.getWindow().addFlags(24);
                        break;
                }
                this.mDialog.requestWindowFeature(1);
                try {
                    return this.mDialog != null ? (LayoutInflater) this.mDialog.getContext().getSystemService(z[0]) : (LayoutInflater) this.mActivity.getSystemService(z[1]);
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(getActivity(), getTheme());
    }

    public void onDestroyView() {
        try {
            super.onDestroyView();
            if (this.mDialog != null) {
                this.mViewDestroyed = true;
                this.mDialog.dismiss();
                this.mDialog = null;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void setCancelable(boolean z) {
        try {
            this.mCancelable = z;
            if (this.mDialog != null) {
                this.mDialog.setCancelable(z);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.mDialog != null) {
            Bundle onSaveInstanceState = this.mDialog.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                try {
                    bundle.putBundle(z[4], onSaveInstanceState);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        }
        try {
            if (this.mStyle != 0) {
                bundle.putInt(z[6], this.mStyle);
            }
            try {
                if (this.mTheme != 0) {
                    bundle.putInt(z[2], this.mTheme);
                }
                try {
                    if (!this.mCancelable) {
                        bundle.putBoolean(z[3], this.mCancelable);
                    }
                    try {
                        if (!this.mShowsDialog) {
                            bundle.putBoolean(z[7], this.mShowsDialog);
                        }
                        try {
                            if (this.mBackStackId != -1) {
                                bundle.putInt(z[5], this.mBackStackId);
                            }
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        } catch (IllegalStateException e22222) {
            throw e22222;
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        try {
            super.onCreate(bundle);
            if (this.mContainerId != 0) {
                z = false;
            }
            try {
                this.mShowsDialog = z;
                if (bundle != null) {
                    this.mStyle = bundle.getInt(z[11], 0);
                    this.mTheme = bundle.getInt(z[12], 0);
                    this.mCancelable = bundle.getBoolean(z[8], true);
                    this.mShowsDialog = bundle.getBoolean(z[9], this.mShowsDialog);
                    this.mBackStackId = bundle.getInt(z[10], -1);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void onActivityCreated(Bundle bundle) {
        try {
            super.onActivityCreated(bundle);
            if (this.mShowsDialog) {
                View view = getView();
                if (view != null) {
                    try {
                        if (view.getParent() != null) {
                            throw new IllegalStateException(z[14]);
                        }
                        this.mDialog.setContentView(view);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                this.mDialog.setOwnerActivity(getActivity());
                this.mDialog.setCancelable(this.mCancelable);
                this.mDialog.setOnCancelListener(this);
                this.mDialog.setOnDismissListener(this);
                if (bundle != null) {
                    Bundle bundle2 = bundle.getBundle(z[13]);
                    if (bundle2 != null) {
                        try {
                            this.mDialog.onRestoreInstanceState(bundle2);
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    }
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void onStart() {
        try {
            super.onStart();
            if (this.mDialog != null) {
                this.mViewDestroyed = false;
                this.mDialog.show();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public DialogFragment() {
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
    }

    public int getTheme() {
        return this.mTheme;
    }
}
