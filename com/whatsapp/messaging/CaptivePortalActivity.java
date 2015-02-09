package com.whatsapp.messaging;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.b7;
import com.whatsapp.ce;
import com.whatsapp.p8;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class CaptivePortalActivity extends Activity {
    private static b7 a;
    private static final String[] z;

    public static String a(WifiInfo wifiInfo) {
        if (wifiInfo == null) {
            return null;
        }
        String ssid = wifiInfo.getSSID();
        if (ssid == null || ssid.length() < 2) {
            return ssid;
        }
        if (ssid.startsWith("\"") || ssid.startsWith("'")) {
            return (ssid.endsWith("\"") || ssid.endsWith("'")) ? ssid.substring(1, ssid.length() - 1) : ssid;
        } else {
            return ssid;
        }
    }

    public void onCreate(Bundle bundle) {
        int networkId;
        String a;
        boolean z = au.a;
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (VERSION.SDK_INT >= 11) {
            setFinishOnTouchOutside(false);
        }
        WifiInfo connectionInfo = ((WifiManager) getSystemService(z[3])).getConnectionInfo();
        if (connectionInfo != null) {
            networkId = connectionInfo.getNetworkId();
        } else {
            networkId = -1;
        }
        if (connectionInfo != null) {
            a = a(connectionInfo);
        } else {
            a = null;
        }
        setContentView(b7.a(getLayoutInflater(), R.layout.wifi_alert, null));
        getWindow().setLayout(-1, -2);
        Button button = (Button) findViewById(R.id.close_button);
        Button button2 = (Button) findViewById(R.id.disable_wifi_network_button);
        Button button3 = (Button) findViewById(R.id.disable_wifi_button);
        TextView textView = (TextView) findViewById(R.id.wifi_alert_text_view);
        View findViewById = findViewById(R.id.disable_wifi_network_button_separator);
        button.setOnClickListener(new aj(this));
        if (connectionInfo != null) {
            button2.setText(getString(R.string.forget_wifi_network, new Object[]{a}));
            textView.setText(getString(R.string.wifi_network_blocked_explanation, new Object[]{a}));
            if (z) {
                boolean z2;
                if (DialogToastActivity.i) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                DialogToastActivity.i = z2;
            }
            button3.setOnClickListener(new aq(this));
            button2.setOnClickListener(new b6(this, networkId, a));
            Log.i(z[4] + a);
        }
        button2.setVisibility(8);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        textView.setText(R.string.wifi_blocked_explanation);
        button3.setOnClickListener(new aq(this));
        button2.setOnClickListener(new b6(this, networkId, a));
        Log.i(z[4] + a);
    }

    public static synchronized void a(Context context) {
        synchronized (CaptivePortalActivity.class) {
            a.clear();
            context.deleteFile(z[0]);
        }
    }

    static {
        String[] strArr = new String[5];
        String str = "g$1URx6+ERz8,Xk}49Ed{9\u0007]bs";
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
                        i3 = 20;
                        break;
                    case ay.f /*1*/:
                        i3 = 87;
                        break;
                    case ay.n /*2*/:
                        i3 = 88;
                        break;
                    case ay.p /*3*/:
                        i3 = 49;
                        break;
                    default:
                        i3 = 13;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "w6(Edb2xAbf#9]";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "c>>X";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "w6(Edb2xAbf#9]-u4,X{}#!\u0011nf29Ehpw>^\u007f4";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new b7(null);
                default:
                    strArr2[i] = str;
                    str = "w6(Edb2xAbf#9]74";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onResume() {
        super.onResume();
        p8.b.sendEmptyMessageDelayed(1, 3000);
    }

    protected void onPause() {
        super.onPause();
        p8.b.removeMessages(1);
        App.r();
    }

    public static boolean a(NetworkInfo networkInfo) {
        Throwable th;
        try {
            if (networkInfo.getType() != 1) {
                return false;
            }
            HttpURLConnection httpURLConnection = null;
            HttpURLConnection httpURLConnection2;
            try {
                httpURLConnection2 = (HttpURLConnection) new URL(ce.i).openConnection();
                try {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setConnectTimeout(10000);
                    httpURLConnection2.setReadTimeout(10000);
                    httpURLConnection2.setUseCaches(false);
                    httpURLConnection2.getInputStream();
                    if (httpURLConnection2.getResponseCode() == 204) {
                        if (httpURLConnection2 != null) {
                            try {
                                httpURLConnection2.disconnect();
                            } catch (IOException e) {
                                throw e;
                            }
                        }
                        return false;
                    }
                    App.v(z[2]);
                    Log.i(z[1] + networkInfo);
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (IOException e2) {
                            throw e2;
                        }
                    }
                    return true;
                } catch (IOException e3) {
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (IOException e22) {
                            throw e22;
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    httpURLConnection = httpURLConnection2;
                    th = th2;
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (IOException e222) {
                            throw e222;
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                httpURLConnection2 = null;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (IOException e2222) {
            throw e2222;
        }
    }
}
