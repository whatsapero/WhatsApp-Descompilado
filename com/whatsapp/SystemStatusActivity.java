package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class SystemStatusActivity extends DialogToastActivity {
    private static final String[] z;
    private String j;
    private boolean k;
    private int l;
    private boolean m;
    private String n;
    private final List o;
    private ArrayList p;
    private boolean q;

    static {
        String[] strArr = new String[38];
        String str = "1#\u00134>#.\u00154e2;\u00154/";
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
                        i3 = 90;
                        break;
                    case ay.n /*2*/:
                        i3 = 96;
                        break;
                    case ay.p /*3*/:
                        i3 = 71;
                        break;
                    default:
                        i3 = 74;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = " (\u000f&.!;\u00133";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "1#\u000e$";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "0?\u0007.96(\u00013#-4";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001d(\u0005$/,.\f>";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "!2\u00013";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "1.\u0012.$%";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "HP";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "0?\u0007.96(\u00013#-4";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "1#\u00133//\u0005\u00133+6/\u0013\u0018";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "*.\u001479xuO0\"#.\u0013&:2t\u0003('m;\u000e#8-3\u0004";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "!5\ri=*;\u00144+2*N\u001431.\u0005*\u00196;\u001429\u00039\u0014.<+.\u0019i<'(\u0013.%,";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "!5\ri=*;\u00144+2*N\u001431.\u0005*\u00196;\u001429\u00039\u0014.<+.\u0019i9'(\u0016\"8$?\u00013?0?\u00132$#,\u0001.&#8\f\"";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "!5\ri=*;\u00144+2*N\u001431.\u0005*\u00196;\u001429\u00039\u0014.<+.\u0019i,05\r";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "1#\u00134>#.\u00154e!(\u0005&>'";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "HP";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "bz\u2042g";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "1#\u00134>#.\u00154e!(\u0005&>'u\u0004(=,u\u001338+4\u0007j$-.M!%74\u0004g";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "!5\ri=*;\u00144+2*N\u001431.\u0005*\u00196;\u001429\u00039\u0014.<+.\u0019i96;\u001429-4\f>";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "1.\u0012.$%";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "i,\u000559+5\u000e";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "0?\u0007.96(\u00013#-4";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "0?\u0007.96(\u00013#-4";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "1#\u00133//\u0005\u00133+6/\u0013\u0018";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "!5\ri=*;\u00144+2*N\u001431.\u0005*\u00196;\u001429\u00039\u0014.<+.\u0019i//;\t+";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u001d<\u0005&>7(\u0005";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u001d>\u00054)03\u00103#-4";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "!5\ri=*;\u00144+2*N\u001431.\u0005*\u00196;\u001429\u00039\u0014.<+.\u0019i>;*\u0005";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "1#\u00134>#.\u00154e!(\u0005&>'u\rj.--\u000eh96(\t)-o4\u000f3g$5\u0015).b";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "1#\u00134>#.\u00154e0?\u00132''";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "1#\u00134>#.\u00154e&?\u001338-#";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "!5\ri=*;\u00144+2*N\u001431.\u0005*\u00196;\u001429\u00039\u0014.<+.\u0019i96;\u001429-4\f>";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "!5\ri=*;\u00144+2*N\u001431.\u0005*\u00196;\u001429\u00039\u0014.<+.\u0019i<'(\u0013.%,";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "!5\ri=*;\u00144+2*N\u001431.\u0005*\u00196;\u001429\u00039\u0014.<+.\u0019i9'(\u0016\"8$?\u00013?0?\u00132$#,\u0001.&#8\f\"";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "!5\ri=*;\u00144+2*N\u001431.\u0005*\u00196;\u001429\u00039\u0014.<+.\u0019i//;\t+";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "!5\ri=*;\u00144+2*N\u001431.\u0005*\u00196;\u001429\u00039\u0014.<+.\u0019i>;*\u0005";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "!5\ri=*;\u00144+2*N\u001431.\u0005*\u00196;\u001429\u00039\u0014.<+.\u0019i,05\r";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "1.\u00013?1";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(z[31]);
    }

    public SystemStatusActivity() {
        this.o = Arrays.asList(new String[]{z[2], z[4], z[3], z[1]});
    }

    public void onResume() {
        super.onResume();
        Log.i(z[30]);
    }

    static int c(SystemStatusActivity systemStatusActivity) {
        return systemStatusActivity.l;
    }

    public static void a(Context context, String str, Integer num, boolean z, boolean z2, ArrayList arrayList, boolean z3) {
        Intent intent = new Intent(context, SystemStatusActivity.class);
        intent.putExtra(z[37], str);
        intent.putExtra(z[35], z);
        intent.putExtra(z[33], z2);
        intent.putStringArrayListExtra(z[34], arrayList);
        intent.putExtra(z[32], z3);
        if (num != null) {
            intent.putExtra(z[36], num);
        }
        context.startActivity(intent);
    }

    static String a(SystemStatusActivity systemStatusActivity) {
        return systemStatusActivity.n;
    }

    public void onPause() {
        super.onPause();
        Log.i(z[0]);
    }

    static String b(SystemStatusActivity systemStatusActivity) {
        return systemStatusActivity.j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
        r11_this = this;
        r5 = com.whatsapp.App.az;
        r0 = z;
        r1 = 15;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r12);
        r0 = r11.getSupportActionBar();
        r1 = 1;
        r0.setDisplayHomeAsUpEnabled(r1);
        r0 = r11.getSupportActionBar();
        r1 = 1;
        r0.setDisplayShowCustomEnabled(r1);
        r0 = 2130903208; // 0x7f0300a8 float:1.7413227E38 double:1.0528060697E-314;
        r11.setContentView(r0);
        r0 = r11.getIntent();
        r1 = z;
        r2 = 14;
        r1 = r1[r2];
        r1 = r0.getStringExtra(r1);
        r11.n = r1;
        r1 = z;
        r2 = 28;
        r1 = r1[r2];
        r2 = 0;
        r1 = r0.getIntExtra(r1, r2);
        r11.l = r1;
        r1 = r11.getSupportActionBar();
        r2 = 2131625001; // 0x7f0e0429 float:1.8877198E38 double:1.053162683E-314;
        r1.setTitle(r2);
        r1 = z;
        r2 = 25;
        r1 = r1[r2];
        r2 = 1;
        r1 = r0.getBooleanExtra(r1, r2);
        r11.k = r1;
        r1 = z;
        r2 = 12;
        r1 = r1[r2];
        r2 = 1;
        r1 = r0.getBooleanExtra(r1, r2);
        r11.q = r1;
        r1 = z;
        r2 = 19;
        r1 = r1[r2];
        r2 = 0;
        r1 = r0.getBooleanExtra(r1, r2);
        r11.m = r1;
        r1 = z;
        r2 = 13;
        r1 = r1[r2];
        r0 = r0.getStringArrayListExtra(r1);
        r11.p = r0;
        r0 = r11.p;
        r1 = z;
        r2 = 22;
        r1 = r1[r2];
        r0 = r0.remove(r1);
        r4 = 0;
        r1 = r11.q;
        if (r1 != 0) goto L_0x0178;
    L_0x008f:
        r0 = com.whatsapp.App.G;
        r1 = 2;
        if (r0 != r1) goto L_0x0151;
    L_0x0094:
        r0 = 2131624748; // 0x7f0e032c float:1.8876684E38 double:1.053162558E-314;
        r0 = r11.getString(r0);
    L_0x009b:
        r1 = r11.k;
        if (r1 == 0) goto L_0x0173;
    L_0x009f:
        r1 = 2131625003; // 0x7f0e042b float:1.8877202E38 double:1.053162684E-314;
    L_0x00a2:
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r2[r3] = r0;
        r0 = r11.getString(r1, r2);
    L_0x00ac:
        if (r0 != 0) goto L_0x00cb;
    L_0x00ae:
        r1 = r11.m;
        if (r1 == 0) goto L_0x00bb;
    L_0x00b2:
        r0 = 2131624877; // 0x7f0e03ad float:1.8876946E38 double:1.0531626215E-314;
        r0 = r11.getString(r0);
        if (r5 == 0) goto L_0x00cb;
    L_0x00bb:
        r1 = r11.n;
        r2 = r11.j;
        r3 = r11.l;
        r3 = java.lang.Integer.valueOf(r3);
        com.whatsapp.UserFeedbackActivity.a(r11, r1, r2, r3);
        r11.finish();
    L_0x00cb:
        r1 = r0;
        r0 = 2131427995; // 0x7f0b029b float:1.8477622E38 double:1.053065349E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r0.setText(r1);
        r0 = r11.m;
        if (r0 != 0) goto L_0x0144;
    L_0x00dc:
        r0 = r11.k;
        if (r0 == 0) goto L_0x0144;
    L_0x00e0:
        r0 = r11.j;
        if (r0 != 0) goto L_0x0120;
    L_0x00e4:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "+";
        r0 = r0.append(r1);
        r1 = "+";
        r2 = r11.p;
        r1 = android.text.TextUtils.join(r1, r2);
        r0 = r0.append(r1);
        r0 = r0.toString();
        r11.j = r0;
        r0 = r11.q;
        if (r0 != 0) goto L_0x0120;
    L_0x0105:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r11.j;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 21;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        r11.j = r0;
    L_0x0120:
        r1 = new com.whatsapp.hq;
        r1.<init>(r11);
        r0 = 2131427998; // 0x7f0b029e float:1.8477628E38 double:1.0530653504E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r0.setOnClickListener(r1);
        r0 = 2131427999; // 0x7f0b029f float:1.847763E38 double:1.053065351E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = new com.whatsapp.als;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
        if (r5 == 0) goto L_0x0150;
    L_0x0144:
        r0 = 2131427996; // 0x7f0b029c float:1.8477624E38 double:1.0530653494E-314;
        r0 = r11.findViewById(r0);
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0150:
        return;
    L_0x0151:
        r0 = com.whatsapp.App.G;
        if (r0 != 0) goto L_0x015e;
    L_0x0155:
        r0 = 2131624749; // 0x7f0e032d float:1.8876687E38 double:1.0531625583E-314;
        r0 = r11.getString(r0);
        goto L_0x009b;
    L_0x015e:
        r0 = 2131624750; // 0x7f0e032e float:1.8876689E38 double:1.053162559E-314;
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        r3 = z;
        r4 = 11;
        r3 = r3[r4];
        r1[r2] = r3;
        r0 = r11.getString(r0, r1);
        goto L_0x009b;
    L_0x0173:
        r1 = 2131625002; // 0x7f0e042a float:1.88772E38 double:1.0531626833E-314;
        goto L_0x00a2;
    L_0x0178:
        r1 = r11.l;
        r2 = 1;
        if (r1 == r2) goto L_0x01c6;
    L_0x017d:
        if (r0 == 0) goto L_0x0397;
    L_0x017f:
        r0 = r11.k;
        if (r0 != 0) goto L_0x01bc;
    L_0x0183:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = 2131624994; // 0x7f0e0422 float:1.8877183E38 double:1.0531626794E-314;
        r1 = r11.getString(r1);
        r0 = r0.append(r1);
        r1 = " ";
        r1 = r0.append(r1);
        r0 = r11.o;
        r2 = z;
        r3 = 23;
        r2 = r2[r3];
        r0 = r0.contains(r2);
        if (r0 == 0) goto L_0x01b8;
    L_0x01a7:
        r0 = 2131624970; // 0x7f0e040a float:1.8877135E38 double:1.0531626675E-314;
    L_0x01aa:
        r0 = r11.getString(r0);
        r0 = r1.append(r0);
        r0 = r0.toString();
        goto L_0x00ac;
    L_0x01b8:
        r0 = 2131624968; // 0x7f0e0408 float:1.887713E38 double:1.0531626665E-314;
        goto L_0x01aa;
    L_0x01bc:
        r0 = z;
        r1 = 9;
        r0 = r0[r1];
        r11.j = r0;
        if (r5 == 0) goto L_0x0397;
    L_0x01c6:
        r0 = r11.p;
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x01e4;
    L_0x01d3:
        r0 = r11.k;
        if (r0 == 0) goto L_0x01e0;
    L_0x01d7:
        r0 = 2131624967; // 0x7f0e0407 float:1.8877129E38 double:1.053162666E-314;
    L_0x01da:
        r0 = r11.getString(r0);
        goto L_0x00ac;
    L_0x01e0:
        r0 = 2131624966; // 0x7f0e0406 float:1.8877127E38 double:1.0531626655E-314;
        goto L_0x01da;
    L_0x01e4:
        r0 = r11.p;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x0397;
    L_0x01ec:
        r3 = "";
        r2 = 0;
        r1 = 0;
        r0 = r11.p;
        r6 = r0.iterator();
    L_0x01f6:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x027e;
    L_0x01fc:
        r0 = r6.next();
        r0 = (java.lang.String) r0;
        r7 = r11.getResources();
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = z;
        r10 = 24;
        r9 = r9[r10];
        r8 = r8.append(r9);
        r8 = r8.append(r0);
        r9 = z;
        r10 = 26;
        r9 = r9[r10];
        r8 = r8.append(r9);
        r8 = r8.toString();
        r9 = z;
        r10 = 20;
        r9 = r9[r10];
        r10 = r11.getPackageName();
        r7 = r7.getIdentifier(r8, r9, r10);
        if (r7 == 0) goto L_0x0262;
    L_0x0237:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1 = r1.append(r3);
        r3 = z;
        r8 = 17;
        r3 = r3[r8];
        r1 = r1.append(r3);
        r3 = r11.getString(r7);
        r1 = r1.append(r3);
        r3 = "\n";
        r1 = r1.append(r3);
        r3 = r1.toString();
        r1 = r2 + 1;
        if (r5 == 0) goto L_0x039a;
    L_0x0260:
        r2 = r1;
        r1 = r0;
    L_0x0262:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = z;
        r9 = 29;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r0 = r7.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x027c:
        if (r5 == 0) goto L_0x01f6;
    L_0x027e:
        r0 = 1;
        if (r2 <= r0) goto L_0x02f6;
    L_0x0281:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0 = r0.append(r3);
        r1 = "\n";
        r0 = r0.append(r1);
        r0 = r0.toString();
        r1 = r11.k;
        if (r1 == 0) goto L_0x02c7;
    L_0x0298:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = 2131624982; // 0x7f0e0416 float:1.887716E38 double:1.0531626734E-314;
        r2 = r11.getString(r2);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = 2131624984; // 0x7f0e0418 float:1.8877163E38 double:1.0531626744E-314;
        r1 = r11.getString(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        goto L_0x00ac;
    L_0x02c7:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = 2131624981; // 0x7f0e0415 float:1.8877157E38 double:1.053162673E-314;
        r2 = r11.getString(r2);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 16;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = 2131624983; // 0x7f0e0417 float:1.8877161E38 double:1.053162674E-314;
        r1 = r11.getString(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        goto L_0x00ac;
    L_0x02f6:
        if (r2 <= 0) goto L_0x0397;
    L_0x02f8:
        r2 = r11.getPackageName();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = z;
        r6 = 10;
        r3 = r3[r6];
        r0 = r0.append(r3);
        r0 = r0.append(r1);
        r3 = z;
        r6 = 27;
        r3 = r3[r6];
        r3 = r0.append(r3);
        r0 = r11.k;
        if (r0 == 0) goto L_0x0361;
    L_0x031d:
        r0 = z;
        r6 = 5;
        r0 = r0[r6];
    L_0x0322:
        r0 = r3.append(r0);
        r0 = r0.toString();
        r3 = r11.getResources();
        r6 = z;
        r7 = 7;
        r6 = r6[r7];
        r0 = r3.getIdentifier(r0, r6, r2);
        if (r0 == 0) goto L_0x0374;
    L_0x0339:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r11.getString(r0);
        r0 = r2.append(r0);
        r2 = " ";
        r2 = r0.append(r2);
        r0 = r11.k;
        if (r0 == 0) goto L_0x0364;
    L_0x0350:
        r0 = 2131624969; // 0x7f0e0409 float:1.8877133E38 double:1.053162667E-314;
    L_0x0353:
        r0 = r11.getString(r0);
        r0 = r2.append(r0);
        r0 = r0.toString();
        goto L_0x00ac;
    L_0x0361:
        r0 = "";
        goto L_0x0322;
    L_0x0364:
        r0 = r11.o;
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x0370;
    L_0x036c:
        r0 = 2131624970; // 0x7f0e040a float:1.8877135E38 double:1.0531626675E-314;
        goto L_0x0353;
    L_0x0370:
        r0 = 2131624968; // 0x7f0e0408 float:1.887713E38 double:1.0531626665E-314;
        goto L_0x0353;
    L_0x0374:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 18;
        r1 = r1[r2];
        r1 = r0.append(r1);
        r0 = r11.p;
        r2 = 0;
        r0 = r0.get(r2);
        r0 = (java.lang.String) r0;
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x0397:
        r0 = r4;
        goto L_0x00ac;
    L_0x039a:
        r2 = r1;
        r1 = r0;
        goto L_0x027c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SystemStatusActivity.onCreate(android.os.Bundle):void");
    }
}
