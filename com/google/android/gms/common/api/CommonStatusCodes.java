package com.google.android.gms.common.api;

import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class CommonStatusCodes {
    public static String getStatusCodeString(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
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
                return "ERROR_OPERATION_FAILED";
            case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                return "INTERRUPTED";
            case vk.SherlockTheme_actionModeBackground /*15*/:
                return "TIMEOUT";
            case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                return "CANCELED";
            case 3000:
                return "AUTH_API_INVALID_CREDENTIALS";
            case 3001:
                return "AUTH_API_ACCESS_FORBIDDEN";
            case 3002:
                return "AUTH_API_CLIENT_ERROR";
            case 3003:
                return "AUTH_API_SERVER_ERROR";
            case 3004:
                return "AUTH_TOKEN_ERROR";
            case 3005:
                return "AUTH_URL_RESOLUTION";
            default:
                return "unknown status code: " + i;
        }
    }
}
