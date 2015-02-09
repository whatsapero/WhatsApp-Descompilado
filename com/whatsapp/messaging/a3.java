package com.whatsapp.messaging;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Messenger;
import com.whatsapp.protocol.j;
import com.whatsapp.util.ai;
import com.whatsapp.util.z;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class a3 extends HandlerThread {
    private static final String z;
    private final ai a;
    private Handler b;
    private final z c;
    private final o d;
    private final Messenger e;
    private Handler f;
    private j g;

    static {
        char[] toCharArray = "mn.$EHH/\"E[x".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 58;
                    break;
                case ay.f /*1*/:
                    i2 = 28;
                    break;
                case ay.n /*2*/:
                    i2 = 71;
                    break;
                case ay.p /*3*/:
                    i2 = 80;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void onLooperPrepared() {
        this.b = new bf(this, this.c);
        this.f = new bf(this, this.a);
        ar.a(this.e, new Messenger(new bz(this)));
    }

    public a3(Messenger messenger) {
        super(z);
        this.c = new z();
        this.a = new ai();
        this.d = new ap(this);
        this.e = messenger;
    }

    static Messenger b(a3 a3Var) {
        return a3Var.e;
    }

    private void a(j jVar) {
        this.g = jVar;
        this.c.b();
        this.a.a();
    }

    static j e(a3 a3Var) {
        return a3Var.g;
    }

    static void a(a3 a3Var, j jVar) {
        a3Var.a(jVar);
    }

    static Handler a(a3 a3Var) {
        return a3Var.f;
    }

    static Handler c(a3 a3Var) {
        return a3Var.b;
    }

    static void a(a3 a3Var, Message message) {
        a3Var.a(message);
    }

    static void d(a3 a3Var) {
        a3Var.a();
    }

    private void a() {
        this.c.a();
        this.a.b();
    }

    private void a(Message message) {
        au.a(this.d, message);
    }

    private void b(Message message) {
        a();
        message.getTarget().sendMessageAtFrontOfQueue(Message.obtain(message));
        ar.a(this.e, this.g);
    }

    static void b(a3 a3Var, Message message) {
        a3Var.b(message);
    }
}
