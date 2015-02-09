package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import java.text.DateFormat;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class a_3 {
    private static final String[] z;

    static {
        String[] strArr = new String[8];
        String str = "a@@N(aQ_\u0000z1\u001c\u000e\u0012{<N^_";
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
                        i3 = 93;
                        break;
                    case ay.f /*1*/:
                        i3 = 34;
                        break;
                    case ay.n /*2*/:
                        i3 = 50;
                        break;
                    case ay.p /*3*/:
                        i3 = 97;
                        break;
                    default:
                        i3 = 22;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "a\rA\fw1N\f]9.OS\rzc";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "9KS\ry:\rE\u0000d3\u000fA\u0004d+KQ\u0004;8ZB\bd<V[\u000ex}OW\u0012e<EW\\x(N^";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "8ZB\bd<V[\u000ex\u0002FS\u0015s";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "8ZB\bd<V[\u000ex\u0002FS\u0015s";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "8ZB\bd<V[\u000ex\u0002FS\u0015s";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "8ZB\bd<V[\u000ex\u0002FS\u0015s";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "9KS\ry:\rE\u0000d3\u000fA\u0004d+KQ\u0004;8ZB\bd<V[\u000ex";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static Dialog a(Activity activity, String str) {
        Log.i(z[1]);
        if (str == null) {
            Log.e(z[3]);
            return null;
        }
        OnClickListener com_whatsapp_a1j = new a1j(activity);
        OnDismissListener h3Var = new h3();
        TextView textView = (TextView) activity.getLayoutInflater().inflate(R.layout.multiline_dialog_title, null);
        textView.setText(str);
        String string = activity.getString(R.string.pay_now);
        String string2 = activity.getString(R.string.pay_later);
        String string3 = activity.getString(R.string.pay_info);
        String string4 = activity.getString(R.string.pay_now_comment, new Object[]{App.k.a("1")});
        String string5 = activity.getString(R.string.pay_later_comment);
        String string6 = activity.getString(R.string.pay_info_comment);
        String str2 = z[0];
        String str3 = z[2];
        Spanned fromHtml = Html.fromHtml(string + str2 + string4 + str3);
        Spanned fromHtml2 = Html.fromHtml(string2 + str2 + string5 + str3);
        Spanned fromHtml3 = Html.fromHtml(string3 + str2 + string6 + str3);
        Dialog create = new Builder(activity).setCustomTitle(textView).setCancelable(false).setItems(new CharSequence[]{fromHtml, fromHtml2, fromHtml3}, com_whatsapp_a1j).create();
        create.setOnDismissListener(h3Var);
        return create;
    }

    private static OnClickListener b(Activity activity, boolean z) {
        return z ? new g(activity) : null;
    }

    public static Dialog a(Activity activity) {
        Dialog l5Var = new l5(activity, R.layout.clock_wrong, activity);
        l5Var.setOnCancelListener(new vl(activity));
        return l5Var;
    }

    public static String c() {
        DateFormat dateInstance = DateFormat.getDateInstance(2);
        long b = ac.b(z[6]);
        return App.p.getString(R.string.extension_expired, new Object[]{dateInstance.format(Long.valueOf(b))});
    }

    public static Dialog e(Activity activity) {
        Dialog llVar = new ll(activity, R.layout.software_too_old, activity);
        llVar.setOnCancelListener(new ri(activity));
        return llVar;
    }

    public static Dialog f(Activity activity) {
        return new Builder(activity).setMessage(c()).setPositiveButton(R.string.ok, null).create();
    }

    public static String d() {
        DateFormat dateInstance = DateFormat.getDateInstance(2);
        long b = ac.b(z[7]);
        return App.p.getString(R.string.extension_payment, new Object[]{dateInstance.format(Long.valueOf(b))});
    }

    public static Dialog c(Activity activity) {
        return new Builder(activity).setMessage(a()).setPositiveButton(R.string.ok, null).create();
    }

    public static Dialog a(Activity activity, boolean z) {
        Builder message = new Builder(activity).setMessage(d());
        message.setPositiveButton(R.string.ok, b(activity, z));
        return message.create();
    }

    public static String b() {
        DateFormat dateInstance = DateFormat.getDateInstance(2);
        long b = ac.b(z[5]);
        return App.p.getString(R.string.extension_active, new Object[]{dateInstance.format(Long.valueOf(b))});
    }

    public static Dialog d(Activity activity) {
        return new Builder(activity).setMessage(R.string.extension_lifetime).setPositiveButton(R.string.ok, null).create();
    }

    public static String a() {
        DateFormat dateInstance = DateFormat.getDateInstance(2);
        long b = ac.b(z[4]);
        return App.p.getString(R.string.extension_rollback, new Object[]{dateInstance.format(Long.valueOf(b))});
    }

    public static void a(Activity activity, AlertDialog alertDialog, boolean z) {
        alertDialog.setButton(-1, alertDialog.getButton(-1).getText(), b(activity, z));
    }

    public static Dialog b(Activity activity) {
        return new Builder(activity).setMessage(b()).setPositiveButton(R.string.ok, null).create();
    }
}
