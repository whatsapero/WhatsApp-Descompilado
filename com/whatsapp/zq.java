package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.actionbarsherlock.R;
import org.whispersystems.libaxolotl.ay;

final class zq extends Handler {
    public void handleMessage(Message message) {
        String str;
        int i = App.az;
        switch (message.what) {
            case ay.f /*1*/:
                str = (String) message.obj;
                a(str);
                if (bd.b(str)) {
                    App.a(App.p.getApplicationContext(), App.p.getString(R.string.group_icon_updated), 0);
                    if (i == 0) {
                        return;
                    }
                }
                m8 d = App.P.d();
                if (d != null && str.equals(d.e)) {
                    App.a(App.p.getApplicationContext(), App.p.getString(R.string.profile_photo_updated), 0);
                }
                if (i == 0) {
                    return;
                }
                break;
            case ay.n /*2*/:
                break;
            case ay.p /*3*/:
                break;
            default:
                return;
        }
        str = (String) message.obj;
        a(str);
        App.a(str, message.arg1);
        App.a(App.p.getApplicationContext(), App.p.getString(bd.b(str) ? R.string.failed_update_photo : R.string.failed_update_profile_photo), 0);
        if (i == 0) {
            return;
        }
        str = (String) message.obj;
        a(str);
        App.a(str, message.arg1);
        App.a(App.p.getApplicationContext(), App.p.getString(R.string.failed_update_photo_not_authorized), 0);
    }

    private void a(String str) {
        m8 a = App.P.a(str);
        if (a != null) {
            a.c();
        }
        App.j(str);
    }

    zq() {
    }
}
