package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.util.Log;
import com.whatsapp.util.bl;
import java.io.File;
import java.io.IOException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class RecordAudio extends DialogToastActivity {
    private static final String[] z;
    private ProgressBar j;
    private View k;
    private Button l;
    private File m;
    private String n;
    private Handler o;
    private ImageButton p;
    private boolean q;
    private TextView r;
    private ant s;
    private long t;
    private bl u;
    private TextView v;
    private int w;
    private SeekBar x;
    private Button y;

    static {
        String[] strArr = new String[15];
        String str = "\u0015j\u0018:[\u001es\u0000\u0000O\u0019~\t\u0000Y\u0011f\u0004";
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
                        i3 = 112;
                        break;
                    case ay.f /*1*/:
                        i3 = 18;
                        break;
                    case ay.n /*2*/:
                        i3 = 108;
                        break;
                    case ay.p /*3*/:
                        i3 = 95;
                        break;
                    default:
                        i3 = 41;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0002w\u000f0[\u0014s\u0019;@\u001f=\b:Z\u0004`\u0003&";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0002w\u000f0[\u0014s\u0019;@\u001f=\b:Z\u0004`\u0003&\u0006\u0003f\u0003/Y\u001cs\u0015:[";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0002w\u000f0[\u0014s\u0019;@\u001f=\u001c-L\u0000s\u001e:\t\u0011g\b6FPv\u0019-H\u0004{\u00031\u0013";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0016{\u0000:Y\u0011f\u0004";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0015j\u0018:[\u001es\u0000\u0000O\u0019~\t\u0000Y\u0011f\u0004";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0011g\b6F_}\u000b8\u0012Pq\u0003;L\u0013aQ0Y\u0005a";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0000~\r&K\u0011q\u0007\u0000F\u001e~\u0015";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0002w\u000f0[\u0014s\u0019;@\u001f=\u001c3H\tp\r<B/t\u00053LJ";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u001d}\u00191]\u0015v";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u001a{\b";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0011g\b6F_!\u000b/Y";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0011p\u0003-]\u0019|\u000b\u007fM\u0005wL+FP|\r+@\u0006wL3@\u0012`\r-@\u0015aL2@\u0003a\u00051N";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0002w\u000f0[\u0014s\u0019;@\u001f=\u000f-L\u0011f\t";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0002w\u000f0[\u0014s\u0019;@\u001f=\b:Z\u0004`\u0003&\u0006\u0003f\u0003/[\u0015q\u0003-M\u0015`";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static Handler d(RecordAudio recordAudio) {
        return recordAudio.o;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.w != 0 && this.m != null && !this.q) {
            bundle.putCharSequence(z[0], this.m.getAbsolutePath());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
        r9_this = this;
        r4 = 2131427976; // 0x7f0b0288 float:1.8477583E38 double:1.0530653395E-314;
        r8 = 4;
        r7 = 3;
        r6 = 1;
        r5 = 0;
        r1 = com.whatsapp.App.az;
        super.onCreate(r10);
        r2 = 1;
        r9.requestWindowFeature(r2);
        r0 = 2130903194; // 0x7f03009a float:1.74132E38 double:1.052806063E-314;
        r9.setContentView(r0);
        r0 = z;
        r2 = 14;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = 0;
        r0 = com.whatsapp.util.WhatsAppLibLoader.a(r0);
        if (r0 != 0) goto L_0x0034;
    L_0x0027:
        r0 = z;
        r1 = 13;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r9.finish();
    L_0x0033:
        return;
    L_0x0034:
        r0 = com.whatsapp.App.an;
        if (r0 == 0) goto L_0x003e;
    L_0x0038:
        r0 = com.whatsapp.App.e(r9);
        if (r0 == r7) goto L_0x0042;
    L_0x003e:
        r9.finish();
        goto L_0x0033;
    L_0x0042:
        r0 = android.os.Environment.getExternalStorageState();
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0056;
    L_0x0052:
        r9.showDialog(r5);
        goto L_0x0033;
    L_0x0056:
        r0 = r9.getIntent();
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r0 = r0.getBooleanExtra(r2, r5);
        r9.q = r0;
        r0 = r9.getIntent();
        r2 = z;
        r3 = 11;
        r2 = r2[r3];
        r0 = r0.getStringExtra(r2);
        r9.n = r0;
        r0 = 2131427980; // 0x7f0b028c float:1.8477592E38 double:1.0530653415E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r9.r = r0;
        r0 = 2131427978; // 0x7f0b028a float:1.8477587E38 double:1.0530653405E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r9.v = r0;
        r0 = 2131427983; // 0x7f0b028f float:1.8477598E38 double:1.053065343E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r9.y = r0;
        r0 = 2131427982; // 0x7f0b028e float:1.8477596E38 double:1.0530653425E-314;
        r0 = r9.findViewById(r0);
        r9.k = r0;
        r0 = 2131427977; // 0x7f0b0289 float:1.8477585E38 double:1.05306534E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r9.p = r0;
        r0 = 2131427981; // 0x7f0b028d float:1.8477594E38 double:1.053065342E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r9.l = r0;
        r0 = 2131427979; // 0x7f0b028b float:1.847759E38 double:1.053065341E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.ProgressBar) r0;
        r9.j = r0;
        r0 = 2131427727; // 0x7f0b018f float:1.8477078E38 double:1.0530652165E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.SeekBar) r0;
        r9.x = r0;
        r0 = r9.x;
        r2 = new com.whatsapp.a9;
        r2.<init>(r9);
        r0.setOnSeekBarChangeListener(r2);
        r0 = r9.q;
        if (r0 == 0) goto L_0x0148;
    L_0x00da:
        r0 = r9.getIntent();
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r2 = r0.getStringExtra(r2);
        r0 = new java.io.File;
        r0.<init>(r2);
        r9.m = r0;
        r0 = com.whatsapp.Conversation.r();
        if (r0 == 0) goto L_0x00fa;
    L_0x00f4:
        r0 = com.whatsapp.Conversation.t();
        r0.q = r6;
    L_0x00fa:
        r0 = r9.l;
        r3 = 2131624816; // 0x7f0e0370 float:1.8876822E38 double:1.0531625914E-314;
        r0.setText(r3);
        r0 = r9.findViewById(r4);
        r0.setVisibility(r5);
        r0 = 2131427975; // 0x7f0b0287 float:1.8477581E38 double:1.053065339E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r3 = 2131624687; // 0x7f0e02ef float:1.887656E38 double:1.0531625277E-314;
        r0.setText(r3);
        r0 = r9.findViewById(r4);
        r0 = (android.widget.TextView) r0;
        r3 = r9.m;
        r3 = r3.getName();
        r0.setText(r3);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r9.b();
        r9.w = r8;
        if (r1 == 0) goto L_0x01ce;
    L_0x0148:
        r0 = 0;
        if (r10 == 0) goto L_0x0154;
    L_0x014b:
        r0 = z;
        r2 = 6;
        r0 = r0[r2];
        r0 = r10.getCharSequence(r0);
    L_0x0154:
        if (r0 == 0) goto L_0x0177;
    L_0x0156:
        r2 = new java.io.File;
        r0 = r0.toString();
        r2.<init>(r0);
        r9.m = r2;
        r0 = r9.j;
        r2 = r9.j;
        r2 = r2.getMax();
        r0.setProgress(r2);
        r9.b();
        r2 = 0;
        r9.t = r2;
        r9.w = r8;
        if (r1 == 0) goto L_0x01a7;
    L_0x0177:
        r0 = "";
        r1 = 2;
        r0 = com.whatsapp.util.f.a(r9, r0, r1, r5, r5);
        r1 = r0.getAbsolutePath();
        r0 = com.whatsapp.App.aa;
        if (r0 < r7) goto L_0x01c7;
    L_0x0186:
        r0 = z;
        r2 = 7;
        r0 = r0[r2];
    L_0x018b:
        r0 = com.whatsapp.ant.a(r1, r0);
        r9.s = r0;
        r0 = r9.r;
        r2 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r1 = android.text.format.DateUtils.formatElapsedTime(r2);
        r0.setText(r1);
        r0 = r9.v;
        r2 = 0;
        r1 = android.text.format.DateUtils.formatElapsedTime(r2);
        r0.setText(r1);
    L_0x01a7:
        r0 = com.whatsapp.App.aP();
        r2 = com.whatsapp.ge.k;
        r2 = r2 * 1024;
        r2 = r2 * 1024;
        r2 = (long) r2;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x01ce;
    L_0x01b6:
        r0 = com.whatsapp.App.p;
        r0 = r9.getApplicationContext();
        r1 = 2131624285; // 0x7f0e015d float:1.8875745E38 double:1.053162329E-314;
        com.whatsapp.App.b(r0, r1, r6);
        r9.finish();
        goto L_0x0033;
    L_0x01c7:
        r0 = z;
        r2 = 12;
        r0 = r0[r2];
        goto L_0x018b;
    L_0x01ce:
        r0 = r9.w;
        r9.c(r0);
        r0 = r9.y;
        r1 = new com.whatsapp.asl;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = r9.l;
        r1 = new com.whatsapp.p5;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = r9.p;
        r1 = new com.whatsapp.p3;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = new com.whatsapp._n;
        r0.<init>(r9);
        r9.o = r0;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RecordAudio.onCreate(android.os.Bundle):void");
    }

    static File a(RecordAudio recordAudio, File file) {
        recordAudio.m = file;
        return file;
    }

    static ProgressBar m(RecordAudio recordAudio) {
        return recordAudio.j;
    }

    static String h(RecordAudio recordAudio) {
        return recordAudio.n;
    }

    public RecordAudio() {
        this.w = 0;
    }

    static int a(RecordAudio recordAudio) {
        return recordAudio.w;
    }

    static bl j(RecordAudio recordAudio) {
        return recordAudio.u;
    }

    static File l(RecordAudio recordAudio) {
        return recordAudio.m;
    }

    static long a(RecordAudio recordAudio, long j) {
        recordAudio.t = j;
        return j;
    }

    static void b(RecordAudio recordAudio, int i) {
        recordAudio.c(i);
    }

    private void d(int i) {
        b();
        if (this.u != null) {
            this.w = 3;
            this.o.sendEmptyMessage(0);
            this.p.setImageResource(R.drawable.mviewer_pause);
            App.c((Context) this);
            this.u.d();
            if (i > 0) {
                this.u.b(i);
                this.x.setProgress(this.u.f());
            }
        }
    }

    static void i(RecordAudio recordAudio) {
        recordAudio.a();
    }

    static void c(RecordAudio recordAudio, int i) {
        recordAudio.d(i);
    }

    public void onDestroy() {
        try {
            Log.i(z[2]);
            super.onDestroy();
            if (this.w == 1) {
                Log.i(z[1]);
            }
            try {
                if (this.s != null) {
                    this.s.f();
                }
            } catch (Throwable e) {
                Log.c(e);
            }
            try {
                if (this.s != null) {
                    this.s.a();
                }
            } catch (Throwable e2) {
                Log.c(e2);
            }
            try {
                if (this.u != null) {
                    if (this.u.c()) {
                        Log.i(z[3]);
                        this.u.g();
                    }
                    this.u.a();
                }
            } catch (Exception e3) {
                throw e3;
            } catch (Exception e32) {
                throw e32;
            }
        } catch (Exception e322) {
            throw e322;
        }
    }

    static ImageButton g(RecordAudio recordAudio) {
        return recordAudio.p;
    }

    static long e(RecordAudio recordAudio) {
        return recordAudio.t;
    }

    static TextView f(RecordAudio recordAudio) {
        return recordAudio.v;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(int r9) {
        /*
        r8_this = this;
        r7 = 2131624710; // 0x7f0e0306 float:1.8876607E38 double:1.053162539E-314;
        r6 = 2130838990; // 0x7f0205ce float:1.7282978E38 double:1.052774342E-314;
        r5 = 4;
        r4 = 8;
        r1 = 0;
        r2 = com.whatsapp.App.az;
        switch(r9) {
            case 0: goto L_0x0010;
            case 1: goto L_0x003d;
            case 2: goto L_0x000f;
            case 3: goto L_0x0065;
            case 4: goto L_0x00a1;
            case 5: goto L_0x00da;
            default: goto L_0x000f;
        };
    L_0x000f:
        return;
    L_0x0010:
        r0 = r8.l;
        r3 = 2131624709; // 0x7f0e0305 float:1.8876605E38 double:1.0531625385E-314;
        r0.setText(r3);
        r0 = r8.y;
        r0.setVisibility(r1);
        r0 = r8.k;
        r0.setVisibility(r1);
        r0 = r8.p;
        r0.setVisibility(r4);
        r0 = r8.v;
        r0.setVisibility(r1);
        r0 = r8.j;
        r0.setVisibility(r1);
        r0 = r8.x;
        r0.setVisibility(r5);
        r0 = r8.j;
        r0.setProgress(r1);
        if (r2 == 0) goto L_0x000f;
    L_0x003d:
        r0 = r8.l;
        r3 = 2131624711; // 0x7f0e0307 float:1.887661E38 double:1.0531625395E-314;
        r0.setText(r3);
        r0 = r8.y;
        r0.setVisibility(r4);
        r0 = r8.k;
        r0.setVisibility(r4);
        r0 = r8.p;
        r0.setVisibility(r4);
        r0 = r8.v;
        r0.setVisibility(r1);
        r0 = r8.j;
        r0.setVisibility(r1);
        r0 = r8.x;
        r0.setVisibility(r5);
        if (r2 == 0) goto L_0x000f;
    L_0x0065:
        r0 = r8.l;
        r0.setText(r7);
        r0 = r8.y;
        r0.setVisibility(r1);
        r0 = r8.k;
        r0.setVisibility(r1);
        r0 = r8.p;
        r0.setVisibility(r1);
        r0 = r8.p;
        r3 = 2130838989; // 0x7f0205cd float:1.7282976E38 double:1.0527743413E-314;
        r0.setImageResource(r3);
        r0 = r8.v;
        r0.setVisibility(r4);
        r0 = r8.j;
        r0.setVisibility(r5);
        r0 = r8.x;
        r0.setVisibility(r1);
        r3 = r8.x;
        r0 = r8.u;
        if (r0 == 0) goto L_0x00e1;
    L_0x0096:
        r0 = r8.u;
        r0 = r0.e();
    L_0x009c:
        r3.setMax(r0);
        if (r2 == 0) goto L_0x000f;
    L_0x00a1:
        r0 = r8.l;
        r0.setText(r7);
        r0 = r8.y;
        r0.setVisibility(r1);
        r0 = r8.k;
        r0.setVisibility(r1);
        r0 = r8.p;
        r0.setVisibility(r1);
        r0 = r8.p;
        r0.setImageResource(r6);
        r0 = r8.v;
        r0.setVisibility(r4);
        r0 = r8.j;
        r0.setVisibility(r5);
        r0 = r8.x;
        r0.setVisibility(r1);
        r0 = r8.x;
        r3 = r8.u;
        if (r3 == 0) goto L_0x00d5;
    L_0x00cf:
        r1 = r8.u;
        r1 = r1.e();
    L_0x00d5:
        r0.setMax(r1);
        if (r2 == 0) goto L_0x000f;
    L_0x00da:
        r0 = r8.p;
        r0.setImageResource(r6);
        goto L_0x000f;
    L_0x00e1:
        r0 = r1;
        goto L_0x009c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RecordAudio.c(int):void");
    }

    private void b() {
        try {
            if (this.u != null) {
                this.u.a();
                this.u = null;
            }
            this.u = bl.a(this.m.getAbsolutePath());
            this.u.a(new um(this));
            this.u.a(new azv(this));
            this.u.h();
            Log.i(z[4] + this.u.e());
            this.w = 5;
            this.x.setMax(this.u.e());
            this.r.setText(DateUtils.formatElapsedTime((long) (this.u.e() / 1000)));
        } catch (IOException e) {
            throw e;
        } catch (Throwable e2) {
            Log.c(e2);
            a(R.string.error_load_preview_audio);
        }
        this.x.setProgress(0);
        this.p.setImageResource(R.drawable.mviewer_play);
    }

    static int a(RecordAudio recordAudio, int i) {
        recordAudio.w = i;
        return i;
    }

    static ant b(RecordAudio recordAudio) {
        return recordAudio.s;
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                return new Builder(this).setTitle(App.aT() ? R.string.record_need_sd_card_title : R.string.record_need_sd_card_title_shared_storage).setMessage(App.aT() ? R.string.record_need_sd_card_message : R.string.record_need_sd_card_message_shared_storage).setNeutralButton(R.string.ok, new a5r(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    static TextView c(RecordAudio recordAudio) {
        return recordAudio.r;
    }

    static SeekBar k(RecordAudio recordAudio) {
        return recordAudio.x;
    }

    private void a() {
        if (this.s != null) {
            try {
                this.s.f();
            } catch (Throwable e) {
                Log.c(e);
            }
            try {
                this.s.a();
            } catch (Throwable e2) {
                Log.c(e2);
            }
            this.s = null;
        }
        this.j.setProgress(this.j.getMax());
        b();
    }

    static boolean n(RecordAudio recordAudio) {
        return recordAudio.q;
    }
}
