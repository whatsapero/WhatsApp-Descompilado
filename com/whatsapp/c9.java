package com.whatsapp;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class c9 extends PhoneStateListener {
    private static final String[] z;
    final VerifyNumber a;

    static {
        String[] strArr = new String[5];
        String str = "[^eL}TUbHyHI8V~_M~F~\u0000HcDoH\u0014xU~_ZcJi\u0000UbH~_Rt\u0005";
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
                        i3 = 45;
                        break;
                    case ay.f /*1*/:
                        i3 = 59;
                        break;
                    case ay.n /*2*/:
                        i3 = 23;
                        break;
                    case ay.p /*3*/:
                        i3 = 37;
                        break;
                    default:
                        i3 = 27;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "[^eL}TUbHyHI8V~_M~F~\u0000HcDoH\u0014xU~_ZcJi\u0000Z{UsL\u0016dMt_O7";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "[^eL}TUbHyHI8V~_M~F~\u0000HcDoH\u0014eJz@RyB;";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "[^eL}TUbHyHI8V~_M~F~\u0000HcDoH\u0014xU~_ZcJi\u0000Z{UsL\u0016{JuJ\u001b";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "[^eL}TUbHyHI8V~_M~F~\u0000HcDoH\u0014dQzY^7";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        if (signalStrength != null) {
        }
    }

    public void onSignalStrengthChanged(int i) {
    }

    public void onDataActivity(int i) {
    }

    public void onCallForwardingIndicatorChanged(boolean z) {
    }

    public void onCallStateChanged(int i, String str) {
    }

    public void onCellLocationChanged(CellLocation cellLocation) {
        if (cellLocation != null) {
        }
    }

    public void onDataConnectionStateChanged(int i, int i2) {
    }

    c9(VerifyNumber verifyNumber) {
        this.a = verifyNumber;
    }

    public void onDataConnectionStateChanged(int i) {
    }

    public void onMessageWaitingIndicatorChanged(boolean z) {
    }

    public void onServiceStateChanged(ServiceState serviceState) {
        if (serviceState != null) {
            this.a.n = serviceState.getRoaming();
            Log.i(z[4] + serviceState.getOperatorAlphaLong());
            Log.i(z[2] + serviceState.getOperatorAlphaShort());
            Log.i(z[0] + serviceState.getOperatorNumeric());
            Log.i(z[3] + this.a.n);
            Log.i(z[1] + serviceState.getState());
            this.a.a(serviceState);
        }
    }
}
