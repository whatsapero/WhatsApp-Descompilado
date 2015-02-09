package com.whatsapp.adm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.amazon.device.messaging.ADMMessageReceiver;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.c2dm.a;
import com.whatsapp.c2dm.b;
import com.whatsapp.util.Log;
import com.whatsapp.vk;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ADMMessageHandler extends ADMMessageHandlerBase {
    public static int b;
    private static final String[] z;
    private final ADM a;
    private final a c;
    private final Context d;

    public class Receiver extends ADMMessageReceiver {
        public Receiver() {
            super(ADMMessageHandler.class);
        }
    }

    static {
        String[] strArr = new String[16];
        String str = "f\u0018";
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
                        i3 = 15;
                        break;
                    case ay.f /*1*/:
                        i3 = 104;
                        break;
                    case ay.n /*2*/:
                        i3 = 125;
                        break;
                    case ay.p /*3*/:
                        i3 = 1;
                        break;
                    default:
                        i3 = 80;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "c\u001c";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "n\u0004\u0011n'P\r\u0005q9}\r\u0019";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "n\f\u0010";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "N,0!#j\u0006\u0019h>hH\u0011`$j\u001b\t!\u0011K%]s5h\u0001\u000eu\"n\u001c\u0014n>F\f]u?/?\u0015`$|)\rqp\u007f\u001d\u000eip|\r\u000fw5}\u001bS";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "N,0!\"j\u0019\bd#{\u0001\u0013fp}\r\u000fd7f\u001b\ts1{\u0001\u0012o~";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "N,0!9|H\u000fd7f\u001b\td\"j\f]`>kH*i1{\u001b<q /\u001b\u0018s&j\u001a\u000e!8n\u001e\u0018!3`\u001a\u000fd3{H\u000fd7f\u001b\ts1{\u0001\u0012opF,]g?}H<E\u001d!";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "l\u0007\u0010/'g\t\tr1\u007f\u0018S`4bF<E\u001dB\r\u000er1h\r5`>k\u0004\u0018s";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "N,0.\"j\u000f\u0014r$j\u001a\u0018e\u007f*\u001b]` \u007f>\u0018s#f\u0007\u0013<uk";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "N,0.\"j\u000f\u0014r$j\u001a\u0018e\u007fa\r\n";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "N=)I\u0015A<4B\u0011[!2O\u000fI)4M\u0015K";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "N,0.\"j\u000f\u0014r$}\t\th?aG\u0018s\"`\u001aR$#";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "F&+@\u001cF,\"R\u0015A,8S";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "N,0.\"j\u000f\u0014r$}\t\th?aG\u0018s\"`\u001aR$#";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\\-/W\u0019L-\"O\u001f[7<W\u0011F$<C\u001cJ";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "f\f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onMessage(Intent intent) {
        boolean z = false;
        int i = b;
        Bundle extras = intent.getExtras();
        extras.getString(z[1]);
        extras.getString(z[0]);
        extras.getString(z[2]);
        extras.getBoolean(z[3]);
        b.a(this.d, intent);
        if (i != 0) {
            if (!DialogToastActivity.i) {
                z = true;
            }
            DialogToastActivity.i = z;
        }
    }

    private void a() {
        if (this.a.getRegistrationId() == null) {
            this.a.startRegister();
        }
    }

    protected void onRegistrationError(String str) {
        if (str.equals(z[15])) {
            Log.a(z[14], null, new Object[]{str});
            this.c.j();
            a();
            if (b == 0) {
                return;
            }
        }
        if (str.equals(z[13]) || str.equals(z[11])) {
            Log.c(z[12], null, new Object[]{str});
            this.c.a();
            this.c.h();
        }
    }

    public ADMMessageHandler() {
        this(App.p);
    }

    protected void onRegistered(String str) {
        if (str != null) {
            int b = this.c.b();
            Log.a(z[9], null, new Object[]{str, Integer.valueOf(b)});
            this.c.i();
            if (this.c.c() == null) {
                Log.i(z[10]);
                App.c((Context) this, 0);
            }
            this.c.a(str);
            if (b > 0) {
                this.c.a(b);
            }
            a(str);
        }
    }

    private void a(String str) {
        App.a(str, z[4]);
    }

    protected void onUnregistered(String str) {
        this.c.a();
        this.c.h();
    }

    public ADMMessageHandler(Context context) {
        int i = b;
        super(z[8]);
        this.d = context;
        this.a = new ADM(context);
        this.c = new a(context);
        if (DialogToastActivity.i) {
            b = i + 1;
        }
    }

    public void b(String str) {
        int i = b;
        if (this.a.getRegistrationId() == null) {
            Log.i(z[6]);
            a();
            if (i == 0) {
                return;
            }
        }
        if (str == null || !str.equals(this.a.getRegistrationId())) {
            Log.i(z[5]);
            a(this.a.getRegistrationId());
            if (i == 0) {
                return;
            }
        }
        Log.i(z[7]);
    }
}
