package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.os.Handler;
import com.actionbarsherlock.R;
import com.whatsapp.App.Me;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public abstract class ata {
    protected static cp a;
    private static final String[] z;
    private Handler b;
    private Activity c;
    protected boolean d;

    protected abstract void a();

    protected abstract void c();

    protected void a(boolean z, boolean z2) {
        if (!(z2 || this.c.isFinishing() || (this.d && !z))) {
            this.c.showDialog(100);
        }
        Me d = App.d(this.c);
        d.jabber_id = App.a(App.p);
        if (d.jabber_id == null) {
            Log.e(z[11]);
            App.d(this.c, 1);
            this.c.startActivity(new Intent(this.c, RegisterPhone.class));
            this.c.finish();
            return;
        }
        int a;
        App.an = d;
        App.a7 = false;
        App.l(this.c.getApplication());
        App.n();
        MessageService.a(App.p);
        if (z) {
            a = App.aJ.a(App.aJ.a(new jr(this, z, z2), new amh(this)));
        } else {
            a = 0;
        }
        if (a == 0) {
            a5w.a(new x(this, z, this.d, z2), new Object[0]);
            if (App.az == 0) {
                return;
            }
        }
        this.b.sendEmptyMessageDelayed(1, 32000);
    }

    protected void b() {
        int w = App.aJ.w();
        Log.i(z[0] + w);
        if (w > 0) {
            this.c.showDialog(103);
            if (App.az == 0) {
                return;
            }
        }
        a(false, true);
    }

    static Handler a(ata com_whatsapp_ata) {
        return com_whatsapp_ata.b;
    }

    static {
        String[] strArr = new String[12];
        String str = "n6$&Ya>%(Ll<$*\u0010m 3'Vk'9=Fq537Vk'%`]y0=:O~::*L~<#![8";
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
                        i3 = 24;
                        break;
                    case ay.f /*1*/:
                        i3 = 83;
                        break;
                    case ay.n /*2*/:
                        i3 = 86;
                        break;
                    case ay.p /*3*/:
                        i3 = 79;
                        break;
                    default:
                        i3 = 63;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "n6$&Ya>%(Ll<$*\u0010|:7#P\u007f|$*Ll<$*";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "n6$&Ya>%(Ll<$*\u0010|:7#P\u007f|$*Ll<$*[m6\" Zj!9=";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "n6$&Ya>%(Ll<$*\u0010|:7#P\u007f|1=Pm#%6Q{";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "n6$&Ya>%(Ll<$*\u0010|:7#P\u007f|5.Qv<\"b\\w=8*\\l";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "n6$&Ya>%(Ll<$*\u0010|:7#P\u007f|%*Km#";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "n6$&Ya>%(Ll<$*\u0010|:7#P\u007f|$*Ll<$*Yj<;-^{8#?[m6\" Zj!9=\\y!2!Pl59:Q|2%$M}'$6";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "n6$&Ya>%(Ll<$*\u0010|:7#P\u007f|;*[q25.M|=9;Yw&8+^k8$*Kj*";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "n6$&Ya>%(Ll<$*\u0010|:7#P\u007f|=*Fk6$9V{6#!^n2?#^z?3";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "n6$&Ya>%(Ll<$*\u0010|:7#P\u007f|;<Xk'9=Z}!$ M";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "j61&Ll6$!^u6y\"Zk 7(Zk'9=Zn6$&Yq62`Rq %&Q\u007f~&.My>%o]w&8,Z8'9oM}4&'Pv6";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = null;
                default:
                    strArr2[i] = str;
                    str = "n6$&Ya>%(Ll<$*\u0010|:7#P\u007f|;<Xk'9=Zv<\"=Zk'9=Z|";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public ata(Activity activity) {
        this.d = false;
        this.b = new yw(this);
        this.c = activity;
    }

    protected Dialog a(int i) {
        switch (i) {
            case 100:
                Log.i(z[6]);
                a = new cp(this.c);
                a.setTitle(this.c.getString(R.string.msg_store_migrate_title));
                a.setMessage(this.c.getString(R.string.msg_store_migrate_message));
                a.setIndeterminate(false);
                a.setCancelable(false);
                a.setProgressStyle(1);
                return a;
            case 101:
                Log.i(z[10]);
                return new Builder(this.c).setTitle(R.string.alert).setMessage(this.c.getString(R.string.msg_store_error_found)).setNeutralButton(R.string.ok, new op(this)).create();
            case 102:
                Log.i(z[8]);
                return new Builder(this.c).setTitle(R.string.alert).setMessage(this.c.getString(App.aT() ? R.string.msg_store_media_card_not_found_ask_retry : R.string.msg_store_media_card_not_found_ask_retry_shared_storage)).setNegativeButton(R.string.retry, new f2(this)).setPositiveButton(R.string.skip, new ea(this)).setCancelable(false).create();
            case 103:
                Log.i(z[2]);
                return new Builder(this.c).setTitle(R.string.msg_store_backup_found).setMessage(this.c.getString(R.string.msg_store_creation_backup_message)).setPositiveButton(R.string.yes, new h8(this)).setNegativeButton(R.string.no, new uq(this)).setCancelable(false).create();
            case 104:
                Log.i(z[4]);
                Dialog cpVar = new cp(this.c);
                cpVar.setTitle(this.c.getString(R.string.register_xmpp_title));
                cpVar.setMessage(this.c.getString(R.string.register_wait_message));
                cpVar.setIndeterminate(true);
                cpVar.setCancelable(false);
                return cpVar;
            case 105:
                Log.i(z[3]);
                return new Builder(this.c).setTitle(R.string.msg_store_previous_error_occurred).setMessage(this.c.getString(R.string.msg_store_lost_due_to_previous_error) + " " + this.c.getString(R.string.msg_store_creation_backup_message)).setPositiveButton(R.string.yes, new _z(this)).setNegativeButton(R.string.no, new ku(this)).setCancelable(false).create();
            case 106:
                return new Builder(this.c).setTitle(R.string.msg_store_confirm).setMessage(this.c.getString(R.string.msg_store_last_confirmation_not_to_restore)).setPositiveButton(R.string.msg_store_do_not_restore, new a_t(this)).setNegativeButton(R.string.msg_store_restore_db, new a3f(this)).setCancelable(false).create();
            case 107:
                Log.i(z[7]);
                return new Builder(this.c).setTitle(R.string.alert).setMessage(this.c.getString(R.string.msg_store_lost_due_to_previous_error) + " " + this.c.getString(App.aT() ? R.string.msg_store_media_card_not_found_ask_retry : R.string.msg_store_media_card_not_found_ask_retry_shared_storage)).setNegativeButton(R.string.retry, new alp(this)).setPositiveButton(R.string.skip, new a1b(this)).setCancelable(false).create();
            case 108:
                Log.i(z[1]);
                return new Builder(this.c).setTitle(R.string.alert).setMessage(this.c.getString(R.string.msg_store_error_not_restored)).setNeutralButton(R.string.ok, null).create();
            case 200:
                Log.i(z[5]);
                return a(200, (int) R.string.msg_store_unable_to_start_restore_no_connectivity);
            case 201:
                Log.i(z[9]);
                return a(201, (int) R.string.msg_store_unable_to_start_restore_process);
            default:
                return null;
        }
    }

    protected void a(boolean z) {
        this.d = z;
    }

    static Activity b(ata com_whatsapp_ata) {
        return com_whatsapp_ata.c;
    }

    protected void b(boolean z) {
        a(z, false);
    }

    private Dialog a(int i, int i2) {
        return new Builder(this.c).setMessage(i2).setCancelable(false).setPositiveButton(R.string.retry, new om(this, i)).setNeutralButton(R.string.msg_store_do_not_restore, new yz(this, i)).create();
    }
}
