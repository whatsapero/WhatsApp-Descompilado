package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.internal.jv;
import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public final class ConnectionResult {
    public static final ConnectionResult Iu;
    private final int Iv;
    private final PendingIntent mPendingIntent;

    static {
        Iu = new ConnectionResult(0, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this.Iv = i;
        this.mPendingIntent = pendingIntent;
    }

    private String gt() {
        switch (this.Iv) {
            case PBE.MD5 /*0*/:
                return "SUCCESS";
            case ay.f /*1*/:
                return "SERVICE_MISSING";
            case ay.n /*2*/:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case ay.p /*3*/:
                return "SERVICE_DISABLED";
            case aj.i /*4*/:
                return "SIGN_IN_REQUIRED";
            case aV.r /*5*/:
                return "INVALID_ACCOUNT";
            case aV.i /*6*/:
                return "RESOLUTION_REQUIRED";
            case a8.s /*7*/:
                return "NETWORK_ERROR";
            case a8.n /*8*/:
                return "INTERNAL_ERROR";
            case a6.D /*9*/:
                return "SERVICE_INVALID";
            case a6.h /*10*/:
                return "DEVELOPER_ERROR";
            case a6.e /*11*/:
                return "LICENSE_CHECK_FAILED";
            case a6.z /*13*/:
                return "CANCELED";
            case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                return "TIMEOUT";
            case vk.SherlockTheme_actionModeBackground /*15*/:
                return "INTERRUPTED";
            default:
                return "unknown status code " + this.Iv;
        }
    }

    public int getErrorCode() {
        return this.Iv;
    }

    public PendingIntent getResolution() {
        return this.mPendingIntent;
    }

    public boolean hasResolution() {
        return (this.Iv == 0 || this.mPendingIntent == null) ? false : true;
    }

    public boolean isSuccess() {
        return this.Iv == 0;
    }

    public void startResolutionForResult(Activity activity, int i) {
        if (hasResolution()) {
            activity.startIntentSenderForResult(this.mPendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public String toString() {
        return jv.h(this).a("statusCode", gt()).a("resolution", this.mPendingIntent).toString();
    }
}
