package com.whatsapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.actionbarsherlock.R;
import com.whatsapp.util.a5;
import java.util.ArrayList;
import java.util.Comparator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class c_ {
    private static int a;
    private static final int[] b;
    private static final int[] d;
    private static final int[] h;
    private static ArrayList i;
    private static final int[] k;
    private static int l;
    private static final akj[] m;
    private static final int[] s;
    private static int t;
    private static final String[] z;
    private int c;
    private int e;
    private ViewPager f;
    private int g;
    private tf j;
    private ImageView n;
    private OnClickListener o;
    private LayoutInflater p;
    private it q;
    private ViewGroup r;
    private xy[] u;
    private Comparator v;
    private Context w;

    static ArrayList b() {
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c_(android.content.Context r9, android.view.ViewGroup r10) {
        /*
        r8_this = this;
        r3 = 0;
        r7 = 1;
        r1 = 0;
        r4 = com.whatsapp.App.az;
        r8.<init>();
        r0 = m;
        r0 = r0.length;
        r0 = new com.whatsapp.xy[r0];
        r8.u = r0;
        r0 = new com.whatsapp.m5;
        r0.<init>(r8);
        r8.v = r0;
        r8.w = r9;
        r0 = i;
        if (r0 != 0) goto L_0x005e;
    L_0x001c:
        r0 = new java.io.File;
        r2 = com.whatsapp.App.p;
        r2 = r2.getFilesDir();
        r5 = z;
        r6 = 2;
        r5 = r5[r6];
        r0.<init>(r2, r5);
        r2 = r0.exists();
        if (r2 == 0) goto L_0x004b;
    L_0x0032:
        r2 = new com.whatsapp.a_2;	 Catch:{ Exception -> 0x0136, all -> 0x015f }
        r5 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x0136, all -> 0x015f }
        r5.<init>(r0);	 Catch:{ Exception -> 0x0136, all -> 0x015f }
        r2.<init>(r8, r5);	 Catch:{ Exception -> 0x0136, all -> 0x015f }
        r0 = r2.readObject();	 Catch:{ Exception -> 0x0180 }
        r0 = (java.util.ArrayList) r0;	 Catch:{ Exception -> 0x0180 }
        r0 = (java.util.ArrayList) r0;	 Catch:{ Exception -> 0x0180 }
        i = r0;	 Catch:{ Exception -> 0x0180 }
        if (r2 == 0) goto L_0x004b;
    L_0x0048:
        r2.close();	 Catch:{ IOException -> 0x0179 }
    L_0x004b:
        r0 = i;	 Catch:{ IOException -> 0x0167 }
        if (r0 != 0) goto L_0x005b;
    L_0x004f:
        r0 = new java.util.ArrayList;	 Catch:{ IOException -> 0x0169 }
        r0.<init>();	 Catch:{ IOException -> 0x0169 }
        i = r0;	 Catch:{ IOException -> 0x0169 }
        r0 = 1;
        a = r0;	 Catch:{ IOException -> 0x0169 }
        if (r4 == 0) goto L_0x005e;
    L_0x005b:
        r0 = 0;
        a = r0;	 Catch:{ IOException -> 0x0169 }
    L_0x005e:
        r0 = 2131427781; // 0x7f0b01c5 float:1.8477188E38 double:1.053065243E-314;
        r0 = r10.findViewById(r0);	 Catch:{ IOException -> 0x016b }
        r0 = (android.view.ViewGroup) r0;	 Catch:{ IOException -> 0x016b }
        r8.r = r0;	 Catch:{ IOException -> 0x016b }
        r0 = new com.whatsapp.it;	 Catch:{ IOException -> 0x016b }
        r2 = 0;
        r0.<init>(r8, r2);	 Catch:{ IOException -> 0x016b }
        r8.q = r0;	 Catch:{ IOException -> 0x016b }
        r0 = 2131427629; // 0x7f0b012d float:1.847688E38 double:1.053065168E-314;
        r0 = r10.findViewById(r0);	 Catch:{ IOException -> 0x016b }
        r0 = (android.support.v4.view.ViewPager) r0;	 Catch:{ IOException -> 0x016b }
        r8.f = r0;	 Catch:{ IOException -> 0x016b }
        r0 = r8.f;	 Catch:{ IOException -> 0x016b }
        r2 = 6;
        r0.setOffscreenPageLimit(r2);	 Catch:{ IOException -> 0x016b }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x016b }
        r2 = 11;
        if (r0 < r2) goto L_0x008f;
    L_0x0088:
        r0 = r8.f;	 Catch:{ IOException -> 0x016b }
        r2 = 1;
        r3 = 0;
        r0.setLayerType(r2, r3);	 Catch:{ IOException -> 0x016b }
    L_0x008f:
        r0 = r8.f;
        r2 = r8.q;
        r0.setAdapter(r2);
        r0 = r8.f;
        r2 = new com.whatsapp.ct;
        r2.<init>(r8);
        r0.setOnPageChangeListener(r2);
        r0 = com.whatsapp.App.p;
        r0 = r0.getBaseContext();
        r2 = z;
        r2 = r2[r7];
        r0 = r0.getSystemService(r2);
        r0 = (android.view.LayoutInflater) r0;
        r8.p = r0;
        r0 = com.whatsapp.am1.a();
        r0 = r0.B;
        r8.g = r0;
        r0 = com.whatsapp.am1.a();
        r0 = r0.f;
        r8.e = r0;
        r0 = r1;
    L_0x00c3:
        r2 = m;
        r2 = r2.length;
        if (r0 >= r2) goto L_0x00e2;
    L_0x00c8:
        r2 = m;
        r2 = r2[r0];
        r3 = r8.r;
        r5 = com.whatsapp.akj.a(r2);
        r3 = r3.findViewById(r5);
        r5 = new com.whatsapp.yr;
        r5.<init>(r8, r2);
        r3.setOnClickListener(r5);
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x00c3;
    L_0x00e2:
        r0 = com.whatsapp.App.as();	 Catch:{ IOException -> 0x016d }
        if (r0 == 0) goto L_0x016f;
    L_0x00e8:
        r0 = a;	 Catch:{ IOException -> 0x016d }
    L_0x00ea:
        r2 = r8.f;
        r2.setCurrentItem(r0, r1);
        r0 = a;
        r8.b(r0);
        r0 = new com.whatsapp.a82;
        r0.<init>(r8);
        r8.o = r0;
        r0 = 2131427794; // 0x7f0b01d2 float:1.8477214E38 double:1.0530652496E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r8.n = r0;
        r0 = r8.n;
        if (r0 == 0) goto L_0x0135;
    L_0x010a:
        r0 = new com.whatsapp.a8q;
        r0.<init>(r8);
        r1 = r8.n;
        r1.setClickable(r7);
        r1 = r8.n;
        r2 = new com.whatsapp.ca;
        r2.<init>(r8, r0);
        r1.setOnTouchListener(r2);
        r0 = r8.n;
        r1 = new com.whatsapp.util.bd;
        r2 = r8.w;
        r2 = r2.getResources();
        r3 = 2130839119; // 0x7f02064f float:1.728324E38 double:1.0527744055E-314;
        r2 = r2.getDrawable(r3);
        r1.<init>(r2);
        r0.setImageDrawable(r1);
    L_0x0135:
        return;
    L_0x0136:
        r0 = move-exception;
        r2 = r3;
    L_0x0138:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x017e }
        r3.<init>();	 Catch:{ all -> 0x017e }
        r5 = z;	 Catch:{ all -> 0x017e }
        r6 = 0;
        r5 = r5[r6];	 Catch:{ all -> 0x017e }
        r3 = r3.append(r5);	 Catch:{ all -> 0x017e }
        r0 = r0.toString();	 Catch:{ all -> 0x017e }
        r0 = r3.append(r0);	 Catch:{ all -> 0x017e }
        r0 = r0.toString();	 Catch:{ all -> 0x017e }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x017e }
        if (r2 == 0) goto L_0x004b;
    L_0x0157:
        r2.close();	 Catch:{ IOException -> 0x015c }
        goto L_0x004b;
    L_0x015c:
        r0 = move-exception;
        goto L_0x004b;
    L_0x015f:
        r0 = move-exception;
        r2 = r3;
    L_0x0161:
        if (r2 == 0) goto L_0x0166;
    L_0x0163:
        r2.close();	 Catch:{ IOException -> 0x017c }
    L_0x0166:
        throw r0;
    L_0x0167:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0169 }
    L_0x0169:
        r0 = move-exception;
        throw r0;
    L_0x016b:
        r0 = move-exception;
        throw r0;
    L_0x016d:
        r0 = move-exception;
        throw r0;
    L_0x016f:
        r0 = r8.u;
        r0 = r0.length;
        r0 = r0 + -1;
        r2 = a;
        r0 = r0 - r2;
        goto L_0x00ea;
    L_0x0179:
        r0 = move-exception;
        goto L_0x004b;
    L_0x017c:
        r1 = move-exception;
        goto L_0x0166;
    L_0x017e:
        r0 = move-exception;
        goto L_0x0161;
    L_0x0180:
        r0 = move-exception;
        goto L_0x0138;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.c_.<init>(android.content.Context, android.view.ViewGroup):void");
    }

    static int e() {
        return a;
    }

    static int i(c_ c_Var) {
        return c_Var.c;
    }

    static int c(int i) {
        a = i;
        return i;
    }

    static int d(c_ c_Var) {
        return c_Var.g;
    }

    static ViewPager a(c_ c_Var) {
        return c_Var.f;
    }

    static tf g(c_ c_Var) {
        return c_Var.j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r10) {
        /*
        r9_this = this;
        r2 = 0;
        r3 = com.whatsapp.App.az;
        r4 = m;
        r5 = r4.length;
        r1 = r2;
    L_0x0007:
        if (r1 >= r5) goto L_0x003f;
    L_0x0009:
        r6 = r4[r1];
        r0 = r9.r;
        r7 = com.whatsapp.akj.c(r6);
        r7 = r0.findViewById(r7);
        r0 = r9.r;
        r8 = com.whatsapp.akj.a(r6);
        r0 = r0.findViewById(r8);
        r0 = (android.widget.ImageView) r0;
        r0 = (android.widget.ImageView) r0;
        if (r0 == 0) goto L_0x003b;
    L_0x0025:
        r6 = com.whatsapp.akj.b(r6);
        if (r6 != r10) goto L_0x0034;
    L_0x002b:
        r6 = 1;
        r0.setSelected(r6);
        r7.setVisibility(r2);
        if (r3 == 0) goto L_0x003b;
    L_0x0034:
        r0.setSelected(r2);
        r0 = 4;
        r7.setVisibility(r0);
    L_0x003b:
        r0 = r1 + 1;
        if (r3 == 0) goto L_0x0040;
    L_0x003f:
        return;
    L_0x0040:
        r1 = r0;
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.c_.b(int):void");
    }

    static akj[] c() {
        return m;
    }

    static int d() {
        return t;
    }

    private static Drawable b(Context context, int i) {
        switch (i) {
            case 10004:
                return context.getResources().getDrawable(R.drawable.picker_em_2714);
            case 10006:
                return context.getResources().getDrawable(R.drawable.picker_em_2716);
            case 10133:
                return context.getResources().getDrawable(R.drawable.picker_em_2795);
            case 10134:
                return context.getResources().getDrawable(R.drawable.picker_em_2796);
            case 10135:
                return context.getResources().getDrawable(R.drawable.picker_em_2797);
            case 10160:
                return context.getResources().getDrawable(R.drawable.picker_em_27b0);
            case 12336:
                return context.getResources().getDrawable(R.drawable.picker_em_3030);
            case 57673:
                return context.getResources().getDrawable(R.drawable.picker_e149);
            case 57932:
                return context.getResources().getDrawable(R.drawable.picker_e24c);
            case 57934:
                return context.getResources().getDrawable(R.drawable.picker_e24e);
            case 57935:
                return context.getResources().getDrawable(R.drawable.picker_e24f);
            case 58679:
                return context.getResources().getDrawable(R.drawable.picker_e537);
            case 127932:
                return context.getResources().getDrawable(R.drawable.picker_em_1f3bc);
            case 128003:
                return context.getResources().getDrawable(R.drawable.picker_em_1f403);
            case 128028:
                return context.getResources().getDrawable(R.drawable.picker_em_1f41c);
            case 128178:
                return context.getResources().getDrawable(R.drawable.picker_em_1f4b2);
            case 128259:
                return context.getResources().getDrawable(R.drawable.picker_em_1f503);
            case 128281:
                return context.getResources().getDrawable(R.drawable.picker_em_1f519);
            case 128282:
                return context.getResources().getDrawable(R.drawable.picker_em_1f51a);
            case 128283:
                return context.getResources().getDrawable(R.drawable.picker_em_1f51b);
            case 128284:
                return context.getResources().getDrawable(R.drawable.picker_em_1f51c);
            default:
                return a5.a(context, i);
        }
    }

    static {
        String[] strArr = new String[3];
        String str = "\u0019gE@2\fcIA>\u000e%XO:\u0018xOI>\u0012~\n";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 124;
                        break;
                    case ay.f /*1*/:
                        i4 = 10;
                        break;
                    case ay.n /*2*/:
                        i4 = 42;
                        break;
                    case ay.p /*3*/:
                        i4 = 42;
                        break;
                    default:
                        i4 = 91;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "\u0019gE@2";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    t = 500;
                    l = 50;
                    if (VERSION.SDK_INT >= 12) {
                        t = ViewConfiguration.getKeyRepeatTimeout();
                        l = ViewConfiguration.getKeyRepeatDelay();
                    }
                    k = new int[]{58389, 57431, 128512, 57430, 58388, 58373, 57606, 58392, 58391, 128535, 128537, 57605, 58377, 128539, 58381, 58372, 58371, 58378, 58382, 57432, 58374, 58387, 58386, 58385, 58376, 58369, 58383, 128517, 57608, 128553, 128555, 58379, 57607, 57433, 58390, 128548, 58375, 128518, 128523, 58380, 128526, 128564, 128565, 58384, 128543, 128550, 128551, 128520, 57626, 128558, 128556, 128528, 128533, 128559, 128566, 128519, 58370, 128529, 58646, 58647, 57682, 58651, 58654, 58650, 57345, 57346, 57348, 57349, 58648, 58649, 58645, 57422, 58652, 128570, 128568, 128571, 128573, 128572, 128576, 128575, 128569, 128574, 128121, 128122, 128584, 128585, 128586, 57628, 57612, 57434, 57629, 58158, 58165, 128171, 128165, 58164, 58161, 128167, 57660, 58160, 58395, 58393, 58394, 128069, 58396, 57358, 58401, 58400, 57357, 57360, 57361, 58398, 57362, 58402, 57902, 57903, 57905, 57904, 58407, 58397, 57359, 58399, 57676, 57857, 57621, 58655, 58408, 128106, 128108, 128109, 57617, 58405, 58409, 58404, 58403, 57939, 128587, 58142, 58143, 58141, 128112, 128590, 128589, 58406, 58627, 57614, 58136, 57351, 128094, 58138, 57662, 58139, 57350, 58114, 128090, 58137, 127933, 128086, 58145, 58146, 57630, 58147, 128093, 128091, 128083, 58132, 58428, 58140, 58156, 58154, 58157, 58155, 57378, 57379, 58152, 58151, 128149, 128150, 128158, 58153, 128140, 57347, 57396, 57397, 128100, 128101, 128172, 58678, 128173};
                    d = new int[]{57426, 58666, 57423, 57427, 58660, 58668, 58673, 57424, 58663, 57425, 57611, 128061, 58667, 58671, 57609, 58664, 57370, 58665, 58662, 128060, 57429, 58657, 58659, 128037, 128035, 58670, 58669, 128034, 58661, 128029, 128028, 128030, 128012, 57610, 58433, 58658, 57369, 58656, 57428, 128011, 128004, 128015, 128000, 128003, 128005, 128007, 128009, 57652, 128016, 128019, 128021, 128022, 128001, 128002, 128050, 128033, 128010, 58672, 128042, 128006, 128008, 128041, 128062, 58118, 57392, 58116, 57616, 57394, 58117, 58115, 57624, 58439, 57625, 127807, 58436, 127812, 58120, 58119, 127794, 127795, 127792, 127793, 127804, 127760, 127774, 127773, 127770, 127761, 127762, 127763, 127764, 127765, 127766, 127767, 127768, 127772, 127771, 57420, 127757, 127758, 127759, 127755, 127756, 127776, 58159, 57418, 9925, 57417, 57661, 57419, 10052, 57416, 58435, 127745, 58444, 58430};
                    s = new int[]{58422, 58423, 58424, 58426, 58425, 58427, 57623, 58432, 58434, 58438, 58437, 57627, 58440, 57395, 57618, 127883, 58130, 127882, 58128, 57667, 128302, 57405, 57352, 128249, 57641, 57638, 57639, 58134, 128190, 57356, 57354, 57353, 128222, 128223, 57355, 57675, 57642, 57640, 57665, 128265, 128264, 128263, 58149, 128277, 57666, 58135, 9203, 8987, 9200, 8986, 57669, 57668, 128271, 128272, 57407, 128270, 57615, 128294, 128262, 128261, 128268, 128267, 57620, 128705, 57663, 128703, 57664, 128295, 128297, 57622, 128682, 58126, 58129, 57619, 128298, 58127, 57659, 57647, 128180, 128181, 128183, 128182, 128179, 128184, 57604, 128231, 128229, 128228, 9993, 57603, 128232, 128239, 57601, 128234, 128236, 128237, 57602, 128230, 58113, 128196, 128195, 128209, 128202, 128200, 128201, 128220, 128203, 128197, 128198, 128199, 128193, 128194, 58131, 128204, 128206, 10002, 9999, 128207, 128208, 128213, 128215, 128216, 128217, 128211, 128212, 128210, 128218, 57672, 128278, 128219, 128300, 128301, 128240, 58626, 58148, 57404, 58122, 127932, 57406, 58150, 127929, 127931, 57410, 57408, 57409, 57643, 127918, 127183, 127924, 57645, 127922, 57648, 58411, 58410, 57368, 57366, 57365, 58412, 127945, 127923, 57364, 128693, 128692, 57650, 127943, 57649, 57363, 127938, 58413, 57367, 127907, 57413, 58168, 58123, 127868, 57415, 58124, 57412, 127865, 127863, 57411, 127829, 57632, 58171, 127831, 127830, 58175, 58177, 127844, 58188, 58180, 127845, 58178, 58173, 58174, 58176, 58189, 58179, 58172, 57671, 58169, 127849, 127854, 58170, 127848, 58431, 58187, 57414, 127850, 127851, 127852, 127853, 127855, 58181, 127823, 58182, 127819, 127826, 127815, 58184, 58183, 127825, 127816, 127820, 127824, 127821, 127840, 58186, 58185, 127805};
                    b = new int[]{57398, 127969, 57687, 57400, 57683, 57685, 57677, 57686, 58625, 57688, 58429, 57399, 58628, 127972, 58442, 57670, 58629, 58630, 57634, 58632, 58633, 128510, 57403, 57421, 58441, 58443, 58653, 127753, 127904, 57636, 57633, 58419, 57858, 57372, 57653, 128675, 9875, 57613, 57373, 57631, 128641, 128642, 128650, 57401, 128670, 128646, 58421, 57375, 128648, 58420, 128669, 128651, 57374, 128654, 57689, 128653, 58414, 128664, 57371, 57690, 128662, 128667, 58415, 128680, 58418, 128660, 58416, 58417, 128656, 57654, 128673, 128671, 128672, 128668, 58144, 57680, 57637, 128678, 57678, 57938, 57655, 57865, 57402, 127982, 57651, 57635, 128511, 127914, 127917, 128205, 128681, 60417, 58638, 60419, 60418, 58641, 58639, 58640, 60420, 60421, 60439, 60422, 58636, 60424, 60423, 58642, 60425, 60427, 60426, 60428, 60430, 60429, 60432, 60431, 60437, 60435, 60434, 58637, 60438, 60433, 60436, 58643, 58644, 58635, 60453, 60459, 60440, 60455, 60457, 60448, 60456, 60454, 60441, 60446, 60449, 60443, 60451, 60460, 60458, 60461, 60452, 60450, 60442, 60447, 60444, 60445, 60462};
                    h = new int[]{57884, 57885, 57886, 57887, 57888, 57889, 57890, 57891, 57892, 57893, 128287, 128290, 57872, 128291, 57906, 57907, 57909, 57908, 128288, 128289, 128292, 57910, 57911, 57912, 57913, 8596, 8597, 128260, 57915, 57914, 128316, 128317, 8617, 8618, 8505, 57917, 57916, 9195, 9196, 10549, 10548, 57933, 128256, 128257, 128258, 57874, 57875, 57876, 127379, 127382, 57867, 58631, 57859, 57900, 57899, 57898, 127540, 127538, 57894, 57895, 57901, 57877, 57878, 57681, 57656, 57657, 57658, 58121, 128688, 128686, 57679, 57866, 57864, 57879, 57880, 57896, 9410, 128706, 128708, 128709, 128707, 127569, 58133, 58125, 127377, 127384, 57897, 128683, 57863, 128245, 128687, 128689, 128691, 128695, 128696, 9940, 57862, 10055, 10062, 9989, 57861, 57860, 57646, 57936, 57937, 58674, 58675, 58676, 58677, 128160, 57873, 9851, 57919, 57920, 57921, 57922, 57923, 57924, 57925, 57926, 57927, 57928, 57929, 57930, 57931, 57918, 57684, 57674, 128178, 57673, 57934, 57935, 58679, 57644, 12336, 57932, 128282, 128281, 128283, 128284, 58163, 58162, 57377, 57376, 58167, 58166, 128259, 57391, 128359, 57380, 128348, 57381, 128349, 57382, 128350, 57383, 128351, 57384, 128352, 57385, 57386, 57387, 57388, 57389, 57390, 128353, 128354, 128355, 128356, 128357, 128358, 10006, 10133, 10134, 10135, 57870, 57868, 57871, 57869, 128174, 128175, 10004, 9745, 128280, 128279, 10160, 57393, 57882, 57883, 9724, 9723, 9726, 9725, 9642, 9643, 128314, 11036, 11035, 9899, 9898, 57881, 128309, 128315, 128310, 128311, 128312, 128313};
                    a = 1;
                    r7 = new akj[6];
                    r7[2] = new akj(2, d, R.id.emoji_flower_btn, R.id.emoji_flower_marker, null);
                    r7[3] = new akj(3, s, R.id.emoji_bell_btn, R.id.emoji_bell_marker, null);
                    r7[4] = new akj(4, b, R.id.emoji_car_btn, R.id.emoji_car_marker, null);
                    r7[5] = new akj(5, h, R.id.emoji_symbols_btn, R.id.emoji_symbols_marker, null);
                    m = r7;
                default:
                    strArr2[i2] = str;
                    str = "\u0010kSE.\bUCD=\u0010k^O)";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    static Context b(c_ c_Var) {
        return c_Var.w;
    }

    static Comparator e(c_ c_Var) {
        return c_Var.v;
    }

    static int j(c_ c_Var) {
        return c_Var.e;
    }

    public void a(Drawable drawable) {
        this.r.setBackgroundDrawable(drawable);
    }

    static xy[] f(c_ c_Var) {
        return c_Var.u;
    }

    public void a(tf tfVar) {
        this.j = tfVar;
    }

    static int a() {
        return l;
    }

    public void a(boolean z) {
        if (this.n != null) {
            int i;
            ImageView imageView = this.n;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    static OnClickListener h(c_ c_Var) {
        return c_Var.o;
    }

    static void a(c_ c_Var, int i) {
        c_Var.b(i);
    }

    static LayoutInflater c(c_ c_Var) {
        return c_Var.p;
    }

    static Drawable a(Context context, int i) {
        return b(context, i);
    }

    public void a(int i) {
        int i2 = App.az;
        if (this.c != i) {
            this.c = i;
            int i3 = 1;
            while (i3 < this.u.length) {
                if (this.u[i3] != null) {
                    this.u[i3].notifyDataSetChanged();
                }
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
        }
        if (this.u[0] != null) {
            this.u[0].notifyDataSetChanged();
        }
    }
}
