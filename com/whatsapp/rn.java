package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class rn extends AsyncTask {
    private static final String[] z;
    final VerifySms a;
    s b;

    static {
        String[] strArr = new String[25];
        String str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx";
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
                        i3 = 89;
                        break;
                    case ay.f /*1*/:
                        i3 = 48;
                        break;
                    case ay.n /*2*/:
                        i3 = 29;
                        break;
                    case ay.p /*3*/:
                        i3 = 32;
                        break;
                    default:
                        i3 = 85;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f#<BtF<<T0B -\u001dxX%0BxD";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f 7Q\u007fL0tDr\r%8BnEx+UiR,\u0018ViE'";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "/_tC0tDxM%6B|R<5I0U;8F|I98RqE";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f0+BrR";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "+UzI&-Uo\u000f%1_sEz?QtL0=\u001diOx,@yA!<\u001dxX%0B|T<6^";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f&-QqE";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f0+BrRx>ExS&<T0T:6\u001d{A&-";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f0+BrRx-_r\r88^d\r2,UnS0*";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f#<BtF<<T";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f0+BrRx4YnS<7W";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "<BoO'y]tS&0^z";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f 7Q\u007fL0tDr\r%8BnEx+UiR,\u0018ViE'";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "0^mU!\u0006]xT=6T";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f<7SrR'<Si";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f0+BrRx:_sN0:DtV<-I";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f0+BrRx;\\rC><T";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f!<]mO'8BtL,tEsA#8YqA75U";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f'<DoY4?DxRu?QtL0=\u0010iOu)QoS0";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f 7Q\u007fL0tDr\r%8BnEx+UiR,\u0018ViE'";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f0+BrRu";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f66Tx\u000f";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "/UoI3 FrI6<\u001fkE'0VdV:0Sx\u000f<6UoR:+\u0010";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "+U{U&<T";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "+UzI&-Uo\u000f%1_sEz?QtL0=\u001diOx,@yA!<\u001dxX%0B|T<6^";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected x0 a(String[] strArr) {
        Log.i(z[22] + strArr[0]);
        x0 x0Var = x0.ERROR_UNSPECIFIED;
        try {
            this.b = fm.a(VerifySms.A(this.a), VerifySms.a(this.a), strArr[0], ui.TYPED);
            switch (g7.a[this.b.f.ordinal()]) {
                case ay.f /*1*/:
                case ay.n /*2*/:
                    App.b(App.p, this.b.g);
                    break;
            }
            App.f(App.p, this.b.b);
            return this.b.f;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            Log.e(z[21] + e2.toString());
            return x0Var;
        } catch (IOException e3) {
            String toString = e3.toString();
            try {
                Log.w(z[23] + toString);
                if (toString != null && toString.contains(z[24])) {
                    x0Var = x0.ERROR_UNSPECIFIED;
                    if (App.az == 0) {
                        return x0Var;
                    }
                }
                return x0.ERROR_CONNECTIVITY;
            } catch (IOException e32) {
                throw e32;
            }
        }
    }

    protected Object doInBackground(Object[] objArr) {
        return a((String[]) objArr);
    }

    protected void onPreExecute() {
        try {
            Log.i(z[0]);
            if (!this.a.isFinishing()) {
                this.a.showDialog(24);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    protected rn(VerifySms verifySms) {
        this.a = verifySms;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(com.whatsapp.x0 r13) {
        /*
        r12_this = this;
        r8 = 10;
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r7 = 0;
        r9 = 3;
        r6 = 1;
        r2 = com.whatsapp.App.az;
        r0 = r12.a;
        r1 = 24;
        r0.removeDialog(r1);
        r0 = com.whatsapp.x0.YES;
        if (r13 != r0) goto L_0x003c;
    L_0x0014:
        r0 = z;
        r0 = r0[r8];
        com.whatsapp.util.Log.i(r0);
        r0 = r12.b;
        r0 = r0.d;
        r1 = r12.b;
        r1 = r1.b;
        com.whatsapp.a54.a(r0, r1);
        r0 = com.whatsapp.atf.WHATSAPP_INITIATED;	 Catch:{ NumberFormatException -> 0x01fa }
        r1 = r12.b;	 Catch:{ NumberFormatException -> 0x01fa }
        r4 = r1.e;	 Catch:{ NumberFormatException -> 0x01fa }
        r4 = r4 * r10;
        com.whatsapp.ac.a(r0, r4);	 Catch:{ NumberFormatException -> 0x01fa }
    L_0x0030:
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x0204 }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x0204 }
        r1 = 1;
        com.whatsapp.VerifySms.a(r0, r1);	 Catch:{ NumberFormatException -> 0x0204 }
        if (r2 == 0) goto L_0x01ef;
    L_0x003c:
        r0 = com.whatsapp.x0.EXPIRED;	 Catch:{ NumberFormatException -> 0x0204 }
        if (r13 != r0) goto L_0x0069;
    L_0x0040:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r12.b;
        r0 = r0.d;
        r1 = r12.b;
        r1 = r1.b;
        com.whatsapp.a54.a(r0, r1);
        r0 = com.whatsapp.atf.WHATSAPP_INITIATED;	 Catch:{ NumberFormatException -> 0x0206 }
        r1 = r12.b;	 Catch:{ NumberFormatException -> 0x0206 }
        r4 = r1.e;	 Catch:{ NumberFormatException -> 0x0206 }
        r4 = r4 * r10;
        com.whatsapp.ac.a(r0, r4);	 Catch:{ NumberFormatException -> 0x0206 }
    L_0x005d:
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x0211 }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x0211 }
        r1 = 1;
        com.whatsapp.VerifySms.a(r0, r1);	 Catch:{ NumberFormatException -> 0x0211 }
        if (r2 == 0) goto L_0x01ef;
    L_0x0069:
        r0 = com.whatsapp.x0.FAIL_MISMATCH;	 Catch:{ NumberFormatException -> 0x0211 }
        if (r13 != r0) goto L_0x0143;
    L_0x006d:
        r0 = z;	 Catch:{ NumberFormatException -> 0x0213 }
        r1 = 15;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0213 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0213 }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x0213 }
        r0 = com.whatsapp.VerifySms.e(r0);	 Catch:{ NumberFormatException -> 0x0213 }
        r1 = "";
        r0.setText(r1);	 Catch:{ NumberFormatException -> 0x0213 }
        r0 = com.whatsapp.VerifySms.C();	 Catch:{ NumberFormatException -> 0x0213 }
        r1 = 13;
        if (r0 != r1) goto L_0x00c4;
    L_0x0089:
        com.whatsapp.VerifySms.a(r9);
        r0 = r12.a;
        r1 = r12.a;
        r3 = 2131625062; // 0x7f0e0466 float:1.8877321E38 double:1.053162713E-314;
        r4 = new java.lang.Object[r6];
        r5 = r12.a;
        r6 = 2131625056; // 0x7f0e0460 float:1.887731E38 double:1.05316271E-314;
        r5 = r5.getString(r6);
        r4[r7] = r5;
        r1 = r1.getString(r3, r4);
        r0.g(r1);
        r0 = com.whatsapp.App.p;
        r1 = z;
        r3 = 14;
        r1 = r1[r3];
        r0 = r0.getSystemService(r1);
        r0 = (android.view.inputmethod.InputMethodManager) r0;
        r1 = r12.a;
        r1 = com.whatsapp.VerifySms.e(r1);
        r1 = r1.getWindowToken();
        r0.hideSoftInputFromWindow(r1, r7);
        if (r2 == 0) goto L_0x01ef;
    L_0x00c4:
        com.whatsapp.VerifySms.a(r8);
        r0 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r3 = r12.b;
        r3 = r3.a;
        if (r3 == 0) goto L_0x00d9;
    L_0x00d0:
        r3 = r12.b;	 Catch:{ NumberFormatException -> 0x0215 }
        r3 = r3.a;	 Catch:{ NumberFormatException -> 0x0215 }
        r0 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x0215 }
        r0 = r0 * r10;
    L_0x00d9:
        r3 = com.whatsapp.VerifySms.i();	 Catch:{ NumberFormatException -> 0x0221 }
        if (r3 <= 0) goto L_0x012a;
    L_0x00df:
        r4 = 0;
        r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r3 <= 0) goto L_0x010c;
    L_0x00e5:
        r3 = r12.a;	 Catch:{ NumberFormatException -> 0x0223 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x0223 }
        r5 = 2131624775; // 0x7f0e0347 float:1.887674E38 double:1.053162571E-314;
        r6 = 2;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x0223 }
        r7 = 0;
        r8 = r12.a;	 Catch:{ NumberFormatException -> 0x0223 }
        r8 = com.whatsapp.util.bm.g(r8, r0);	 Catch:{ NumberFormatException -> 0x0223 }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x0223 }
        r7 = 1;
        r8 = com.whatsapp.VerifySms.d();	 Catch:{ NumberFormatException -> 0x0223 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ NumberFormatException -> 0x0223 }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x0223 }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x0223 }
        r3.g(r4);	 Catch:{ NumberFormatException -> 0x0223 }
        if (r2 == 0) goto L_0x013c;
    L_0x010c:
        r3 = r12.a;	 Catch:{ NumberFormatException -> 0x0225 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x0225 }
        r5 = 2131624774; // 0x7f0e0346 float:1.8876737E38 double:1.0531625707E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x0225 }
        r7 = 0;
        r8 = com.whatsapp.VerifySms.d();	 Catch:{ NumberFormatException -> 0x0225 }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ NumberFormatException -> 0x0225 }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x0225 }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x0225 }
        r3.g(r4);	 Catch:{ NumberFormatException -> 0x0225 }
        if (r2 == 0) goto L_0x013c;
    L_0x012a:
        r3 = r12.a;	 Catch:{ NumberFormatException -> 0x0227 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x0227 }
        r5 = 2131624772; // 0x7f0e0344 float:1.8876733E38 double:1.0531625697E-314;
        r4 = r4.getString(r5);	 Catch:{ NumberFormatException -> 0x0227 }
        r3.g(r4);	 Catch:{ NumberFormatException -> 0x0227 }
        r3 = 3;
        com.whatsapp.VerifySms.a(r3);	 Catch:{ NumberFormatException -> 0x0227 }
    L_0x013c:
        r3 = r12.a;	 Catch:{ NumberFormatException -> 0x0229 }
        com.whatsapp.VerifySms.a(r3, r0);	 Catch:{ NumberFormatException -> 0x0229 }
        if (r2 == 0) goto L_0x01ef;
    L_0x0143:
        r0 = com.whatsapp.x0.ERROR_UNSPECIFIED;	 Catch:{ NumberFormatException -> 0x0229 }
        if (r13 != r0) goto L_0x015d;
    L_0x0147:
        r0 = z;	 Catch:{ NumberFormatException -> 0x022b }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x022b }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x022b }
        r0 = 11;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x022b }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x022b }
        r1 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r0.e(r1);	 Catch:{ NumberFormatException -> 0x022b }
        if (r2 == 0) goto L_0x01ef;
    L_0x015d:
        r0 = com.whatsapp.x0.FAIL_MISSING;	 Catch:{ NumberFormatException -> 0x022d }
        if (r13 != r0) goto L_0x0196;
    L_0x0161:
        r0 = z;	 Catch:{ NumberFormatException -> 0x022f }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x022f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x022f }
        r0 = z;	 Catch:{ NumberFormatException -> 0x022f }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x022f }
        com.whatsapp.App.v(r0);	 Catch:{ NumberFormatException -> 0x022f }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x022f }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x022f }
        r1 = r12.a;	 Catch:{ NumberFormatException -> 0x022f }
        r3 = 2131625062; // 0x7f0e0466 float:1.8877321E38 double:1.053162713E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x022f }
        r5 = 0;
        r6 = r12.a;	 Catch:{ NumberFormatException -> 0x022f }
        r7 = 2131625056; // 0x7f0e0460 float:1.887731E38 double:1.05316271E-314;
        r6 = r6.getString(r7);	 Catch:{ NumberFormatException -> 0x022f }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x022f }
        r1 = r1.getString(r3, r4);	 Catch:{ NumberFormatException -> 0x022f }
        r0.g(r1);	 Catch:{ NumberFormatException -> 0x022f }
        if (r2 == 0) goto L_0x01ef;
    L_0x0196:
        r0 = com.whatsapp.x0.FAIL_TOO_MANY_GUESSES;	 Catch:{ NumberFormatException -> 0x0231 }
        if (r13 != r0) goto L_0x0251;
    L_0x019a:
        r0 = z;	 Catch:{ NumberFormatException -> 0x0233 }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0233 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0233 }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x0233 }
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x0233 }
        r0 = r0.a;	 Catch:{ NumberFormatException -> 0x0233 }
        if (r0 != 0) goto L_0x01bd;
    L_0x01ad:
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x0235 }
        r1 = r12.a;	 Catch:{ NumberFormatException -> 0x0235 }
        r3 = 2131624762; // 0x7f0e033a float:1.8876713E38 double:1.0531625647E-314;
        r1 = r1.getString(r3);	 Catch:{ NumberFormatException -> 0x0235 }
        r0.g(r1);	 Catch:{ NumberFormatException -> 0x0235 }
        if (r2 == 0) goto L_0x01ef;
    L_0x01bd:
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x0237 }
        r0 = r0.a;	 Catch:{ NumberFormatException -> 0x0237 }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0237 }
        r0 = r0 * r10;
        r3 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x0237 }
        r3.a(r0);	 Catch:{ NumberFormatException -> 0x0237 }
        r3 = r12.a;	 Catch:{ NumberFormatException -> 0x0237 }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x0237 }
        r5 = 2131624764; // 0x7f0e033c float:1.8876717E38 double:1.0531625657E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x0237 }
        r7 = 0;
        r8 = r12.a;	 Catch:{ NumberFormatException -> 0x0237 }
        r8 = com.whatsapp.util.bm.g(r8, r0);	 Catch:{ NumberFormatException -> 0x0237 }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x0237 }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x0237 }
        r3.g(r4);	 Catch:{ NumberFormatException -> 0x0237 }
        r3 = 10;
        com.whatsapp.VerifySms.a(r3);	 Catch:{ NumberFormatException -> 0x0237 }
        r3 = r12.a;	 Catch:{ NumberFormatException -> 0x0237 }
        com.whatsapp.VerifySms.a(r3, r0);	 Catch:{ NumberFormatException -> 0x0237 }
    L_0x01ef:
        r0 = r12.a;
        com.whatsapp.VerifySms.t(r0);
        r0 = r12.a;
        com.whatsapp.VerifySms.o(r0);
        return;
    L_0x01fa:
        r0 = move-exception;
        r0 = z;
        r0 = r0[r6];
        com.whatsapp.util.Log.e(r0);
        goto L_0x0030;
    L_0x0204:
        r0 = move-exception;
        throw r0;
    L_0x0206:
        r0 = move-exception;
        r0 = z;
        r1 = 6;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        goto L_0x005d;
    L_0x0211:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0213 }
    L_0x0213:
        r0 = move-exception;
        throw r0;
    L_0x0215:
        r3 = move-exception;
        r3 = z;
        r4 = 19;
        r3 = r3[r4];
        com.whatsapp.util.Log.w(r3);
        goto L_0x00d9;
    L_0x0221:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0223 }
    L_0x0223:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0225 }
    L_0x0225:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0227 }
    L_0x0227:
        r0 = move-exception;
        throw r0;
    L_0x0229:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x022b }
    L_0x022b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x022d }
    L_0x022d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x022f }
    L_0x022f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0231 }
    L_0x0231:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0233 }
    L_0x0233:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0235 }
    L_0x0235:
        r0 = move-exception;
        throw r0;
    L_0x0237:
        r0 = move-exception;
        r0 = z;	 Catch:{ NumberFormatException -> 0x03a7 }
        r1 = 20;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x03a7 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x03a7 }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x03a7 }
        r1 = r12.a;	 Catch:{ NumberFormatException -> 0x03a7 }
        r3 = 2131624762; // 0x7f0e033a float:1.8876713E38 double:1.0531625647E-314;
        r1 = r1.getString(r3);	 Catch:{ NumberFormatException -> 0x03a7 }
        r0.g(r1);	 Catch:{ NumberFormatException -> 0x03a7 }
        if (r2 == 0) goto L_0x01ef;
    L_0x0251:
        r0 = com.whatsapp.x0.FAIL_GUESSED_TOO_FAST;	 Catch:{ NumberFormatException -> 0x03a7 }
        if (r13 != r0) goto L_0x02c6;
    L_0x0255:
        r0 = z;	 Catch:{ NumberFormatException -> 0x03a9 }
        r1 = 8;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x03a9 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x03a9 }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x03a9 }
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x03a9 }
        r0 = r0.a;	 Catch:{ NumberFormatException -> 0x03a9 }
        if (r0 != 0) goto L_0x0278;
    L_0x0268:
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x03ab }
        r1 = r12.a;	 Catch:{ NumberFormatException -> 0x03ab }
        r3 = 2131624760; // 0x7f0e0338 float:1.8876709E38 double:1.0531625637E-314;
        r1 = r1.getString(r3);	 Catch:{ NumberFormatException -> 0x03ab }
        r0.g(r1);	 Catch:{ NumberFormatException -> 0x03ab }
        if (r2 == 0) goto L_0x01ef;
    L_0x0278:
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x02ac }
        r0 = r0.a;	 Catch:{ NumberFormatException -> 0x02ac }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x02ac }
        r0 = r0 * r10;
        r3 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x02ac }
        r3.a(r0);	 Catch:{ NumberFormatException -> 0x02ac }
        r3 = r12.a;	 Catch:{ NumberFormatException -> 0x02ac }
        r4 = r12.a;	 Catch:{ NumberFormatException -> 0x02ac }
        r5 = 2131624761; // 0x7f0e0339 float:1.887671E38 double:1.053162564E-314;
        r6 = 1;
        r6 = new java.lang.Object[r6];	 Catch:{ NumberFormatException -> 0x02ac }
        r7 = 0;
        r8 = r12.a;	 Catch:{ NumberFormatException -> 0x02ac }
        r8 = com.whatsapp.util.bm.g(r8, r0);	 Catch:{ NumberFormatException -> 0x02ac }
        r6[r7] = r8;	 Catch:{ NumberFormatException -> 0x02ac }
        r4 = r4.getString(r5, r6);	 Catch:{ NumberFormatException -> 0x02ac }
        r3.g(r4);	 Catch:{ NumberFormatException -> 0x02ac }
        r3 = 10;
        com.whatsapp.VerifySms.a(r3);	 Catch:{ NumberFormatException -> 0x02ac }
        r3 = r12.a;	 Catch:{ NumberFormatException -> 0x02ac }
        com.whatsapp.VerifySms.a(r3, r0);	 Catch:{ NumberFormatException -> 0x02ac }
        goto L_0x01ef;
    L_0x02ac:
        r0 = move-exception;
        r0 = z;	 Catch:{ NumberFormatException -> 0x03ad }
        r1 = 13;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x03ad }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x03ad }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x03ad }
        r1 = r12.a;	 Catch:{ NumberFormatException -> 0x03ad }
        r3 = 2131624760; // 0x7f0e0338 float:1.8876709E38 double:1.0531625637E-314;
        r1 = r1.getString(r3);	 Catch:{ NumberFormatException -> 0x03ad }
        r0.g(r1);	 Catch:{ NumberFormatException -> 0x03ad }
        if (r2 == 0) goto L_0x01ef;
    L_0x02c6:
        r0 = com.whatsapp.x0.ERROR_CONNECTIVITY;	 Catch:{ NumberFormatException -> 0x03ad }
        if (r13 != r0) goto L_0x02f7;
    L_0x02ca:
        r0 = z;	 Catch:{ NumberFormatException -> 0x03af }
        r1 = 16;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x03af }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x03af }
        r0 = 11;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x03af }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x03af }
        r1 = r12.a;	 Catch:{ NumberFormatException -> 0x03af }
        r3 = 2131624725; // 0x7f0e0315 float:1.8876638E38 double:1.0531625464E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ NumberFormatException -> 0x03af }
        r5 = 0;
        r6 = r12.a;	 Catch:{ NumberFormatException -> 0x03af }
        r7 = 2131624132; // 0x7f0e00c4 float:1.8875435E38 double:1.0531622535E-314;
        r6 = r6.getString(r7);	 Catch:{ NumberFormatException -> 0x03af }
        r4[r5] = r6;	 Catch:{ NumberFormatException -> 0x03af }
        r1 = r1.getString(r3, r4);	 Catch:{ NumberFormatException -> 0x03af }
        r0.g(r1);	 Catch:{ NumberFormatException -> 0x03af }
        if (r2 == 0) goto L_0x01ef;
    L_0x02f7:
        r0 = com.whatsapp.x0.FAIL_BLOCKED;	 Catch:{ NumberFormatException -> 0x03b1 }
        if (r13 != r0) goto L_0x0310;
    L_0x02fb:
        r0 = z;	 Catch:{ NumberFormatException -> 0x03b3 }
        r1 = 17;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x03b3 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x03b3 }
        r0 = 12;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x03b3 }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x03b3 }
        com.whatsapp.VerifySms.u(r0);	 Catch:{ NumberFormatException -> 0x03b3 }
        if (r2 == 0) goto L_0x01ef;
    L_0x0310:
        r0 = com.whatsapp.x0.FAIL_STALE;	 Catch:{ NumberFormatException -> 0x03b5 }
        if (r13 != r0) goto L_0x032a;
    L_0x0314:
        r0 = z;	 Catch:{ NumberFormatException -> 0x03b7 }
        r1 = 7;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x03b7 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x03b7 }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x03b7 }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x03b7 }
        r1 = 2131624758; // 0x7f0e0336 float:1.8876705E38 double:1.0531625628E-314;
        r0.f(r1);	 Catch:{ NumberFormatException -> 0x03b7 }
        if (r2 == 0) goto L_0x01ef;
    L_0x032a:
        r0 = com.whatsapp.x0.FAIL_TEMPORARILY_UNAVAILABLE;	 Catch:{ NumberFormatException -> 0x03b9 }
        if (r13 != r0) goto L_0x01ef;
    L_0x032e:
        r0 = z;	 Catch:{ NumberFormatException -> 0x03bb }
        r1 = 18;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x03bb }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NumberFormatException -> 0x03bb }
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x03bb }
        r1 = z;	 Catch:{ NumberFormatException -> 0x03bb }
        r3 = 4;
        r1 = r1[r3];	 Catch:{ NumberFormatException -> 0x03bb }
        r0.b(r1);	 Catch:{ NumberFormatException -> 0x03bb }
        r0 = 3;
        com.whatsapp.VerifySms.a(r0);	 Catch:{ NumberFormatException -> 0x03bb }
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x03bb }
        r0 = r0.a;	 Catch:{ NumberFormatException -> 0x03bb }
        if (r0 != 0) goto L_0x035b;
    L_0x034b:
        r0 = r12.a;	 Catch:{ NumberFormatException -> 0x03bd }
        r1 = r12.a;	 Catch:{ NumberFormatException -> 0x03bd }
        r3 = 2131624760; // 0x7f0e0338 float:1.8876709E38 double:1.0531625637E-314;
        r1 = r1.getString(r3);	 Catch:{ NumberFormatException -> 0x03bd }
        r0.g(r1);	 Catch:{ NumberFormatException -> 0x03bd }
        if (r2 == 0) goto L_0x01ef;
    L_0x035b:
        r0 = r12.b;	 Catch:{ NumberFormatException -> 0x038f }
        r0 = r0.a;	 Catch:{ NumberFormatException -> 0x038f }
        r0 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x038f }
        r0 = r0 * r10;
        r2 = com.whatsapp.App.p;	 Catch:{ NumberFormatException -> 0x038f }
        r2.a(r0);	 Catch:{ NumberFormatException -> 0x038f }
        r2 = r12.a;	 Catch:{ NumberFormatException -> 0x038f }
        r3 = r12.a;	 Catch:{ NumberFormatException -> 0x038f }
        r4 = 2131624761; // 0x7f0e0339 float:1.887671E38 double:1.053162564E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ NumberFormatException -> 0x038f }
        r6 = 0;
        r7 = r12.a;	 Catch:{ NumberFormatException -> 0x038f }
        r7 = com.whatsapp.util.bm.g(r7, r0);	 Catch:{ NumberFormatException -> 0x038f }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x038f }
        r3 = r3.getString(r4, r5);	 Catch:{ NumberFormatException -> 0x038f }
        r2.g(r3);	 Catch:{ NumberFormatException -> 0x038f }
        r2 = 10;
        com.whatsapp.VerifySms.a(r2);	 Catch:{ NumberFormatException -> 0x038f }
        r2 = r12.a;	 Catch:{ NumberFormatException -> 0x038f }
        com.whatsapp.VerifySms.a(r2, r0);	 Catch:{ NumberFormatException -> 0x038f }
        goto L_0x01ef;
    L_0x038f:
        r0 = move-exception;
        r0 = z;
        r0 = r0[r9];
        com.whatsapp.util.Log.w(r0);
        r0 = r12.a;
        r1 = r12.a;
        r2 = 2131624760; // 0x7f0e0338 float:1.8876709E38 double:1.0531625637E-314;
        r1 = r1.getString(r2);
        r0.g(r1);
        goto L_0x01ef;
    L_0x03a7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03a9 }
    L_0x03a9:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03ab }
    L_0x03ab:
        r0 = move-exception;
        throw r0;
    L_0x03ad:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03af }
    L_0x03af:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03b1 }
    L_0x03b1:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03b3 }
    L_0x03b3:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03b5 }
    L_0x03b5:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03b7 }
    L_0x03b7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03b9 }
    L_0x03b9:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03bb }
    L_0x03bb:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x03bd }
    L_0x03bd:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.rn.a(com.whatsapp.x0):void");
    }

    protected void onPostExecute(Object obj) {
        a((x0) obj);
    }
}
