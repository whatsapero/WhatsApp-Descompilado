package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.messaging.bp;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class Advanced extends Activity {
    private static final String[] z;

    static {
        String[] strArr = new String[5];
        String str = "\u000b8S266(";
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
                        i3 = 66;
                        break;
                    case ay.f /*1*/:
                        i3 = 119;
                        break;
                    case ay.n /*2*/:
                        i3 = 7;
                        break;
                    case ay.p /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = 69;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "#\u0013q6+!\u0012cx!7\u001aw#$ \u001bbx#+\u001bb9$/\u0012'>6b\u0019r;)";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "#\u0013q6+!\u0012cx!7\u001aw#$ \u001bbx,-Zb%7-\u0005'";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "#\u0013q6+!\u0012cx!7\u001aw#$ \u001bbx&#\u0019i81b\u0014u2$6\u0012'3,0";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "#\u0013q6+!\u0012cx&0\u0012f# ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void a(Advanced advanced, File file, int i) {
        advanced.a(file, i);
    }

    protected Dialog onCreateDialog(int i) {
        CharSequence format = String.format(App.aX.a(R.plurals.service_expire_days, 3), new Object[]{Integer.valueOf(3)});
        OnClickListener ggVar = new gg(this);
        OnClickListener r8Var = new r8(this);
        OnClickListener kxVar = new kx(this);
        switch (i) {
            case ay.f /*1*/:
                return new Builder(this).setMessage(format).setCancelable(false).setPositiveButton(R.string.pay_info, ggVar).setNeutralButton(R.string.pay_now, kxVar).setNegativeButton(R.string.pay_later, r8Var).create();
            case ay.n /*2*/:
                return new Builder(this).setTitle(format).setItems(R.array.pay, new pg(this)).create();
            default:
                return null;
        }
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[1]);
        super.onCreate(bundle);
        setContentView(R.layout.advanced);
        ((TextView) findViewById(R.id.advanced_reconnects)).setText(Integer.toString(App.aV));
        findViewById(R.id.advanced_register).setOnClickListener(new ty(this));
        findViewById(R.id.advanced_register_name).setOnClickListener(new a8i(this));
        findViewById(R.id.advanced_reconnect).setOnClickListener(new _v(this));
        findViewById(R.id.advanced_logout).setOnClickListener(new se(this));
        findViewById(R.id.advanced_backup_db).setOnClickListener(new fb(this));
        findViewById(R.id.advanced_delete_me).setOnClickListener(new la(this));
        findViewById(R.id.advanced_delete_me_plus).setOnClickListener(new tx(this));
        findViewById(R.id.advanced_db_restore).setOnClickListener(new a3(this));
        findViewById(R.id.advanced_contact_restore).setOnClickListener(new i8(this));
        findViewById(R.id.advanced_log_to_sd).setOnClickListener(new pl(this));
        findViewById(R.id.advanced_kill_process).setOnClickListener(new a_y(this));
        findViewById(R.id.advanced_throw_exception).setOnClickListener(new ak6(this));
        findViewById(R.id.advanced_eat_memory).setOnClickListener(new a16(this));
        findViewById(R.id.advanced_eat_cpu).setOnClickListener(new tv(this));
        findViewById(R.id.advanced_eat_gc).setOnClickListener(new anz(this));
        EditText editText = (EditText) findViewById(R.id.advanced_io_test_count);
        findViewById(R.id.advanced_io_test_internal).setOnClickListener(new hd(this, editText));
        findViewById(R.id.advanced_io_test_external).setOnClickListener(new a30(this, editText));
        findViewById(R.id.advanced_dump_phone_btn).setOnClickListener(new ny(this));
        findViewById(R.id.advanced_dump_contacts_btn).setOnClickListener(new a5o(this));
        findViewById(R.id.advanced_dump_data_btn).setOnClickListener(new an8(this));
        findViewById(R.id.advanced_dump_raw_btn).setOnClickListener(new av(this));
        findViewById(R.id.advanced_dump_wacontacts_btn).setOnClickListener(new yy(this));
        findViewById(R.id.reset_registration_state_btn).setOnClickListener(new qh(this));
        findViewById(R.id.login_failed_btn).setOnClickListener(new af6(this));
        findViewById(R.id.reset_last_warning).setOnClickListener(new af5(this));
        findViewById(R.id.alert_dialog_horizontal).setOnClickListener(new k6(this));
        findViewById(R.id.alert_dialog_vertical).setOnClickListener(new an2(this));
        findViewById(R.id.clear_ssid_notification_map).setOnClickListener(new a_x(this));
        ((TextView) findViewById(R.id.hostname)).setText(bp.a((Context) this));
        findViewById(R.id.btn_view_corrupt_error_activity).setOnClickListener(new zy(this));
    }

    static void a(Uri uri, String str) {
        IOException e;
        Throwable th;
        if (str == null) {
            try {
                Log.w(z[2]);
                return;
            } catch (IOException e2) {
                throw e2;
            }
        }
        File file = App.ao;
        try {
            if (file.exists() || file.mkdirs()) {
                Cursor query;
                try {
                    PrintStream printStream = new PrintStream(new File(file, str));
                    query = App.e.query(uri, null, null, null, null);
                    try {
                        if (query != null) {
                            DatabaseUtils.dumpCursor(query, printStream);
                        }
                        query.close();
                        Cursor cursor = null;
                        if (null != null) {
                            try {
                                cursor.close();
                                return;
                            } catch (IOException e22) {
                                throw e22;
                            }
                        }
                        return;
                    } catch (IOException e222) {
                        throw e222;
                    } catch (IOException e3) {
                        e222 = e3;
                    }
                } catch (IOException e4) {
                    e222 = e4;
                    query = null;
                    try {
                        Log.e(z[3] + e222.toString());
                        if (query != null) {
                            query.close();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        if (query != null) {
                            try {
                                query.close();
                            } catch (IOException e2222) {
                                throw e2222;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    query = null;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            Log.w(z[4]);
        } catch (IOException e22222) {
            throw e22222;
        } catch (IOException e222222) {
            throw e222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.io.File r12, int r13) {
        /*
        r11_this = this;
        r4 = com.whatsapp.App.az;
        r5 = new java.io.File[r13];
        r0 = 0;
    L_0x0005:
        r1 = r5.length;
        if (r0 >= r1) goto L_0x0020;
    L_0x0008:
        r1 = new java.io.File;
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        r3 = java.lang.Integer.toString(r0);
        r2 = r2.concat(r3);
        r1.<init>(r12, r2);
        r5[r0] = r1;
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x0005;
    L_0x0020:
        android.os.SystemClock.elapsedRealtime();
        r1 = r5.length;
        r0 = 0;
    L_0x0025:
        if (r0 >= r1) goto L_0x003f;
    L_0x0027:
        r2 = r5[r0];
        r6 = android.os.SystemClock.elapsedRealtime();
        r2.createNewFile();	 Catch:{ IOException -> 0x00b1 }
    L_0x0030:
        r2 = android.os.SystemClock.elapsedRealtime();
        r2 = r2 - r6;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r2 <= 0) goto L_0x003b;
    L_0x003b:
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x0025;
    L_0x003f:
        r6 = 0;
        android.os.SystemClock.elapsedRealtime();
        r7 = r5.length;
        r0 = 0;
        r3 = r0;
    L_0x0046:
        if (r3 >= r7) goto L_0x0070;
    L_0x0048:
        r0 = r5[r3];
        r8 = android.os.SystemClock.elapsedRealtime();
        r2 = 0;
        r1 = new java.io.ObjectOutputStream;	 Catch:{ IOException -> 0x0095, all -> 0x00a5 }
        r10 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0095, all -> 0x00a5 }
        r10.<init>(r0);	 Catch:{ IOException -> 0x0095, all -> 0x00a5 }
        r1.<init>(r10);	 Catch:{ IOException -> 0x0095, all -> 0x00a5 }
        r1.writeObject(r6);	 Catch:{ IOException -> 0x00b7 }
        if (r1 == 0) goto L_0x0061;
    L_0x005e:
        r1.close();	 Catch:{ IOException -> 0x0090 }
    L_0x0061:
        r0 = android.os.SystemClock.elapsedRealtime();
        r0 = r0 - r8;
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x006c;
    L_0x006c:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x00b9;
    L_0x0070:
        android.os.SystemClock.elapsedRealtime();
        r1 = r5.length;
        r0 = 0;
    L_0x0075:
        if (r0 >= r1) goto L_0x008f;
    L_0x0077:
        r2 = r5[r0];
        r6 = android.os.SystemClock.elapsedRealtime();
        r2.delete();
        r2 = android.os.SystemClock.elapsedRealtime();
        r2 = r2 - r6;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r2 <= 0) goto L_0x008b;
    L_0x008b:
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x0075;
    L_0x008f:
        return;
    L_0x0090:
        r0 = move-exception;
        com.whatsapp.util.Log.b(r0);
        goto L_0x0061;
    L_0x0095:
        r0 = move-exception;
        r1 = r2;
    L_0x0097:
        com.whatsapp.util.Log.b(r0);	 Catch:{ all -> 0x00b4 }
        if (r1 == 0) goto L_0x0061;
    L_0x009c:
        r1.close();	 Catch:{ IOException -> 0x00a0 }
        goto L_0x0061;
    L_0x00a0:
        r0 = move-exception;
        com.whatsapp.util.Log.b(r0);
        goto L_0x0061;
    L_0x00a5:
        r0 = move-exception;
    L_0x00a6:
        if (r2 == 0) goto L_0x00ab;
    L_0x00a8:
        r2.close();	 Catch:{ IOException -> 0x00ac }
    L_0x00ab:
        throw r0;
    L_0x00ac:
        r1 = move-exception;
        com.whatsapp.util.Log.b(r1);
        goto L_0x00ab;
    L_0x00b1:
        r2 = move-exception;
        goto L_0x0030;
    L_0x00b4:
        r0 = move-exception;
        r2 = r1;
        goto L_0x00a6;
    L_0x00b7:
        r0 = move-exception;
        goto L_0x0097;
    L_0x00b9:
        r3 = r0;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Advanced.a(java.io.File, int):void");
    }
}
