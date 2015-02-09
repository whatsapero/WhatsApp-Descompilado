package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.text.TextUtils;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class Main extends VerifyMessageStoreActivity {
    private static final String[] z;
    private Uri k;
    private ww l;

    static {
        String[] strArr = new String[27];
        String str = "SJ4\u0005\u0004[F<W\u0014GM{\u0003\u001f\u0012F:\u0003\u0019DM{\u001b\u0019PZ:\u0005\u0019W[{\u001a\u0019A[2\u0019\u0017";
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
                        i3 = 91;
                        break;
                    case ay.p /*3*/:
                        i3 = 119;
                        break;
                    default:
                        i3 = 112;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "_G.\u0019\u0004WL";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "_I2\u0019_QZ>\u0016\u0004W\u00079\u0016\u0013Y]+\u0011\u0019^M(\u0011\u001fGF?W";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "_G.\u0019\u0004WL\u0004\u0005\u001f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "A@4\u0000/@M<\u001e\u0003FZ:\u0003\u0019]F\u0004\u0011\u0019@[/(\u0014^O";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "_I2\u0019_QZ>\u0016\u0004W";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "_I2\u0019_VA:\u001b\u001fU\u0007.\u0019\u0003GX+\u0018\u0002FM?";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "_I2\u0019_VA:\u001b\u001fU\u0007+\u0016\u0003A_4\u0005\u0014";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "_I2\u0019_VA:\u001b\u001fU\u0007.\u0007\u0017@I?\u0012";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "_I2\u0019_VA:\u001b\u001fU\u0007(\u001f\u0005FL4\u0000\u001e";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "_I2\u0019_\\Gv\u001a\u0015\u001dZ>\u0010\u001eSE>";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "A@4\u0000/@M<\u001e\u0003FZ:\u0003\u0019]F\u0004\u0011\u0019@[/(\u0014^O";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "_I2\u0019_A@4\u0000PVA:\u001b\u001fU\b(\u000e\u001eQ";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "_I2\u0019_UG/\u00181Q\\2\u0001\u0019FQ";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "QG6Y\u0007ZI/\u0004\u0011BXu!\u0015@A=\u000e#_[u\u0014\u0018SF<\u0012\u001eGE9\u0012\u0002";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "_I2\u0019__Mt\u0005\u0015UF:\u001a\u0015";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\t\b?\u0012\u0016S]7\u0003PFG{2%~i";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "A@4\u0000/@M<\u001e\u0003FZ:\u0003\u0019]F\u0004\u0011\u0019@[/(\u0014^O";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "_I2\u0019_[F-\u0016\u001c[Lt\u0005\u0015UA(\u0003\u0002S\\2\u0018\u001e\u0012[/\u0016\u0004W\u0015";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "XA?";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "SF?\u0005\u001f[Lu\u001e\u001eFM5\u0003^SK/\u001e\u001f\\\u0006\u001669|";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "_I2\u0019_@M8\u0005\u0015S\\>(\u0003ZG)\u0003\u0013G\\";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "A@4\u0005\u0004Q]/(\u0006WZ(\u001e\u001f\\";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "XA?";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "A@4\u0005\u0004Q]/(\u0006WZ(\u001e\u001f\\";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "QG6Y\u0007ZI/\u0004\u0011BX\u0004\u0007\u0002WN>\u0005\u0015\\K>\u0004";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "A@4\u0000/@M<\u001e\u0003FZ:\u0003\u0019]F\u0004\u0011\u0019@[/(\u0014^O";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void d() {
        /*
        r6_this = this;
        r2 = 2;
        r5 = 1;
        r4 = 0;
        r0 = com.whatsapp.App.az;
        super.d();
        r1 = com.whatsapp.App.an;
        if (r1 != 0) goto L_0x00a9;
    L_0x000c:
        r0 = r6.isFinishing();
        if (r0 != 0) goto L_0x004f;
    L_0x0012:
        r0 = com.whatsapp.App.e(r6);
        switch(r0) {
            case 0: goto L_0x0050;
            case 1: goto L_0x0071;
            case 2: goto L_0x0079;
            case 3: goto L_0x0019;
            case 4: goto L_0x008a;
            case 5: goto L_0x0071;
            case 6: goto L_0x00a1;
            default: goto L_0x0019;
        };
    L_0x0019:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 19;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = z;
        r2 = 17;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        com.whatsapp.App.d(r6, r4);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.EULA.class;
        r0.<init>(r6, r1);
    L_0x0047:
        if (r0 == 0) goto L_0x004f;
    L_0x0049:
        r6.startActivity(r0);
        r6.finish();
    L_0x004f:
        return;
    L_0x0050:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.EULA.class;
        r0.<init>(r6, r1);
        r1 = r6.getIntent();
        r2 = z;
        r3 = 12;
        r2 = r2[r3];
        r1 = r1.getBooleanExtra(r2, r4);
        if (r1 == 0) goto L_0x0047;
    L_0x0067:
        r1 = z;
        r2 = 18;
        r1 = r1[r2];
        r0.putExtra(r1, r5);
        goto L_0x0047;
    L_0x0071:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.RegisterPhone.class;
        r0.<init>(r6, r1);
        goto L_0x0047;
    L_0x0079:
        r0 = z;
        r1 = 11;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.RegisterName.class;
        r0.<init>(r6, r1);
        goto L_0x0047;
    L_0x008a:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.VerifySms.class;
        r0.<init>(r6, r1);
        r1 = com.whatsapp.ChangeNumber.g();
        if (r1 == 0) goto L_0x0047;
    L_0x0097:
        r1 = z;
        r2 = 15;
        r1 = r1[r2];
        r0.putExtra(r1, r5);
        goto L_0x0047;
    L_0x00a1:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.DeleteAccountConfirmation.class;
        r0.<init>(r6, r1);
        goto L_0x0047;
    L_0x00a9:
        r1 = com.whatsapp.App.e(r6);
        if (r1 != r2) goto L_0x00c6;
    L_0x00af:
        r0 = z;
        r1 = 16;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.RegisterName.class;
        r0.<init>(r6, r1);
        r6.startActivity(r0);
        r6.finish();
        goto L_0x004f;
    L_0x00c6:
        r1 = 3;
        com.whatsapp.App.d(r6, r1);
        r1 = com.whatsapp.st.e();
        r6.k = r1;
        r1 = com.whatsapp.App.G;
        if (r1 != r5) goto L_0x00e3;
    L_0x00d4:
        r1 = r6.k;
        if (r1 == 0) goto L_0x00e3;
    L_0x00d8:
        r1 = r6.isFinishing();
        if (r1 != 0) goto L_0x013f;
    L_0x00de:
        r6.showDialog(r4);
        if (r0 == 0) goto L_0x013f;
    L_0x00e3:
        r1 = com.whatsapp.App.v;
        if (r1 != 0) goto L_0x00f2;
    L_0x00e7:
        r1 = r6.isFinishing();
        if (r1 != 0) goto L_0x013f;
    L_0x00ed:
        r6.showDialog(r5);
        if (r0 == 0) goto L_0x013f;
    L_0x00f2:
        r1 = com.whatsapp.App.aU;
        if (r1 == 0) goto L_0x0101;
    L_0x00f6:
        r1 = r6.isFinishing();
        if (r1 != 0) goto L_0x013f;
    L_0x00fc:
        r6.showDialog(r2);
        if (r0 == 0) goto L_0x013f;
    L_0x0101:
        r1 = com.whatsapp.bd.e;
        if (r1 == 0) goto L_0x0133;
    L_0x0105:
        r1 = r6.l;
        if (r1 == 0) goto L_0x0113;
    L_0x0109:
        r1 = r6.l;
        r1 = r1.getStatus();
        r2 = android.os.AsyncTask.Status.RUNNING;
        if (r1 == r2) goto L_0x0123;
    L_0x0113:
        r1 = new com.whatsapp.ww;
        r1.<init>(r6);
        r6.l = r1;
        r1 = r6.l;
        r2 = new java.lang.Void[r4];
        com.whatsapp.a5w.a(r1, r2);
        if (r0 == 0) goto L_0x013f;
    L_0x0123:
        r1 = z;
        r2 = 13;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r6.showDialog(r1);
        if (r0 == 0) goto L_0x013f;
    L_0x0133:
        r0 = z;
        r1 = 14;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r6.f();
    L_0x013f:
        r0 = com.whatsapp.App.p;
        r0 = r0.B;
        r1 = com.whatsapp.App.p;
        r0.a(r1);
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Main.d():void");
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                Log.i(z[9]);
                return new Builder(this).setTitle(R.string.upgrade_question).setMessage(R.string.upgrade_message).setCancelable(false).setPositiveButton(R.string.yes, new a5x(this)).setNeutralButton(R.string.notes, new a1a(this)).setNegativeButton(R.string.later, new t2(this)).create();
            case ay.f /*1*/:
                Log.i(z[8]);
                return new Builder(this).setTitle(R.string.alert).setCancelable(false).setMessage(R.string.register_verify_again).setNeutralButton(R.string.ok, new _j(this)).create();
            case ay.n /*2*/:
                Log.i(z[10]);
                return new Builder(this).setTitle(R.string.alert).setCancelable(false).setMessage(R.string.manually_install_software).setNeutralButton(R.string.ok, new _1(this)).create();
            case ay.p /*3*/:
                Log.i(z[7]);
                return new Builder(this).setTitle(R.string.app_name).setCancelable(false).setMessage(R.string.device_unsupported).setNeutralButton(R.string.ok, new qk(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    public static Class b() {
        return ge.n ? HomeActivity.class : Conversations.class;
    }

    static void a(Main main) {
        main.f();
    }

    static Uri b(Main main) {
        return main.k;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r7) {
        /*
        r6_this = this;
        r3 = 6;
        r4 = 1;
        r5 = 0;
        r0 = com.whatsapp.App.az;
        super.onCreate(r7);
        r1 = z;
        r1 = r1[r3];
        com.whatsapp.util.Log.i(r1);
        r1 = 0;
        r1 = com.whatsapp.util.WhatsAppLibLoader.a(r1);
        if (r1 != 0) goto L_0x0021;
    L_0x0016:
        r0 = z;
        r0 = r0[r5];
        com.whatsapp.util.Log.i(r0);
        r6.finish();
    L_0x0020:
        return;
    L_0x0021:
        r1 = new android.widget.LinearLayout;
        r1.<init>(r6);
        r6.setContentView(r1);
        r1 = com.whatsapp.App.e(r6);
        r2 = com.whatsapp.App.an;
        if (r2 != 0) goto L_0x005d;
    L_0x0031:
        if (r1 != 0) goto L_0x005d;
    L_0x0033:
        r0 = r6.isFinishing();
        if (r0 != 0) goto L_0x0020;
    L_0x0039:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.EULA.class;
        r0.<init>(r6, r1);
        r1 = r6.getIntent();
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r1 = r1.getBooleanExtra(r2, r5);
        if (r1 == 0) goto L_0x0056;
    L_0x004f:
        r1 = z;
        r1 = r1[r4];
        r0.putExtra(r1, r4);
    L_0x0056:
        r6.startActivity(r0);
        r6.finish();
        goto L_0x0020;
    L_0x005d:
        if (r1 != r3) goto L_0x0073;
    L_0x005f:
        r0 = r6.isFinishing();
        if (r0 != 0) goto L_0x0020;
    L_0x0065:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.DeleteAccountConfirmation.class;
        r0.<init>(r6, r1);
        r6.startActivity(r0);
        r6.finish();
        goto L_0x0020;
    L_0x0073:
        r1 = com.whatsapp.App.an;
        if (r1 == 0) goto L_0x00cd;
    L_0x0077:
        r1 = com.whatsapp.App.aJ;
        r1 = r1.e();
        if (r1 != 0) goto L_0x00cd;
    L_0x007f:
        r1 = android.os.Environment.getExternalStorageState();
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r2 = r1.equals(r2);
        if (r2 != 0) goto L_0x00a0;
    L_0x008e:
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x00a0;
    L_0x0099:
        r1 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r6.showDialog(r1);
        if (r0 == 0) goto L_0x00cb;
    L_0x00a0:
        r1 = com.whatsapp.App.aJ;
        r1 = r1.w();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        if (r1 <= 0) goto L_0x00c8;
    L_0x00c1:
        r1 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r6.showDialog(r1);
        if (r0 == 0) goto L_0x00cb;
    L_0x00c8:
        r6.a(r5);
    L_0x00cb:
        if (r0 == 0) goto L_0x0020;
    L_0x00cd:
        r6.d();
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Main.onCreate(android.os.Bundle):void");
    }

    private void f() {
        String stringExtra = getIntent().getStringExtra(z[20]);
        if (!TextUtils.isEmpty(stringExtra)) {
            m8 a = App.P.a(stringExtra);
            if (!(a == null || ((a.w() || a.b()) && a.N == null))) {
                if (!isFinishing()) {
                    startActivity(Conversation.a(a));
                    finish();
                    return;
                }
                return;
            }
        }
        a();
    }

    static void c(Main main) {
        main.a();
    }

    private void a() {
        if (!isFinishing()) {
            Intent intent = getIntent();
            if (!(intent == null || z[21].equals(intent.getAction()) || (intent.getFlags() & 67108864) == 0 || intent.hasExtra(z[24]))) {
                SharedPreferences sharedPreferences = getSharedPreferences(z[26], 0);
                if (sharedPreferences != null && sharedPreferences.getInt(z[25], 0) == 0) {
                    Log.i(z[22]);
                    RegisterName.a(this, getString(R.string.app_name), 0);
                    RegisterName.a((Context) this, getString(R.string.app_name));
                    Editor edit = sharedPreferences.edit();
                    edit.putInt(z[23], 1);
                    edit.commit();
                }
            }
            startActivity(new Intent(this, b()));
            finish();
        }
    }

    public Main() {
        this.k = null;
        this.l = null;
    }
}
