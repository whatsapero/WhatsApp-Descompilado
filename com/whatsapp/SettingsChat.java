package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import com.actionbarsherlock.R;
import com.whatsapp.util.bm;
import java.util.Calendar;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class SettingsChat extends DialogToastPreferenceActivity {
    private static final String[] z;
    private Handler h;
    private String i;

    static {
        String[] strArr = new String[39];
        String str = "\u0019;[mO\b'ToC\u0015:\u001azI\u000e=Cr^\u0003&Ph\u0005\u0014;\u0018hZ\u001b7P";
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
                        i3 = 122;
                        break;
                    case ay.f /*1*/:
                        i3 = 84;
                        break;
                    case ay.n /*2*/:
                        i3 = 53;
                        break;
                    case ay.p /*3*/:
                        i3 = 27;
                        break;
                    default:
                        i3 = 42;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0019;[oK\u0019 ";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0013;\u0018~X\b;G";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0019;[mO\b'ToC\u0015:\u001azI\u000e=Cr^\u0003&Ph_\u0016 \u001axX\u0015$\\vK\u001d1\u001atE\u0017yPiX\u0015&";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0015;X";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0015!Ak_\u000e";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\t1AoC\u00143F4]\u001b8YkK\n1G4X\u001f'Po";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0013'j\u007fO\u001c5@w^";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0019;[mO\b'ToC\u0015:\u001azI\u000e=Cr^\u0003&Ph\u0005\u0015;X6O\b&Zi";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "Z(\u0015";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0015!Ak_\u000e\f";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0014;\u0018hZ\u001b7P";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u001f&GtXW;Zv";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\r5YwZ\u001b$Pi\n\u001c&Zv\n\n3^!";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\b1QRN";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0013'jiO\t1A";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0015!Ak_\u000e\r";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "Z\u000f";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0019;[mO\b'ToC\u0015:\u001azI\u000e=Cr^\u0003&Ph\u0005\u001c5\\w\u0005\u0016;T\u007f\u0007\u00139T|O";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0019&Zkh\u0003\u001b@oZ\u000f frP\u001f";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0018!VpO\u000e\u000bQrY\n8Tbu\u00145X~";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\t1AoC\u00143F4]\u001b8YkK\n1G4C\u0014\"TwC\u001e\u000bSrF\u001fn";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0015!Ak_\u000e\u0012ZiG\u001b ";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\r5YwZ\u001b$Pi\u0005\u0019&Zk\u0005\u00121\\|B\u000en";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\r5YwZ\u001b$Pi\u0005\t1AnZU'Gx\u0010";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\t1AoC\u00143F4]\u001b8YkK\n1G4N\u001f2TnF\u000e";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    str = "\t7TwO";
                    obj = 26;
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    strArr2 = strArr3;
                    str = "\u0017'Rh^\u0015&PDN\u001f8PoO%5Ywu\u0019<ToY";
                    obj = 27;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u001f9TrF%7]z^%<\\h^\u0015&L";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\t1AoC\u00143FD]\u001b8YkK\n1G";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0017'Rh^\u0015&PDI\u00161Tiu\u001b8YDI\u00125Ah";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0013:En^%1[oO\b\u000bF~D\u001e";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0017'Rh^\u0015&PDH\u001b7^nZ%:Zl";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u0017'Rh^\u0015&PDK\b7]r\\\u001f\u000bTwF%7]z^\t";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0017'Rh^\u0015&PDK\b7]r\\\u001f\u000bTwF%7]z^\t";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0013:A~X\u001c5V~u\u001c;[ou\t=O~";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\t1AoC\u00143FDK\u000f Z\u007fE\r:YtK\u001e";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0017'Rh^\u0015&PDH\u001b7^nZ%:Zl";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\t7TwO/$|}d\u001f1Q~N";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public SettingsChat() {
        this.h = new Handler();
        this.i = null;
    }

    static Handler a(SettingsChat settingsChat) {
        return settingsChat.h;
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case ay.p /*3*/:
                return new Builder(this).setMessage(R.string.clear_all_chats_ask).setPositiveButton(R.string.ok, new avl(this)).setNeutralButton(R.string.cancel, null).create();
            case aj.i /*4*/:
                return new Builder(this).setMessage(R.string.delete_all_chats_ask).setPositiveButton(R.string.ok, new _m(this)).setNeutralButton(R.string.cancel, null).create();
            case aV.r /*5*/:
                boolean z;
                if (v.d() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new Builder(this).setMessage(z ? R.string.archive_all_chats_ask : R.string.unarchive_all_chats_ask).setPositiveButton(R.string.ok, new nb(this, z)).setNeutralButton(R.string.cancel, null).create();
            case aV.i /*6*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setTitle(getString(R.string.processing));
                progressDialog.setMessage(getString(R.string.register_wait_message));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case a8.n /*8*/:
                Calendar instance = Calendar.getInstance();
                instance.set(14, 0);
                instance.set(13, 0);
                instance.set(12, 0);
                instance.set(11, 4);
                Dialog cpVar = new cp(this);
                cpVar.setTitle(getString(R.string.msg_store_backup_db_title));
                cpVar.setMessage(getString(App.aT() ? R.string.settings_backup_db_now_message : R.string.settings_backup_db_now_message_shared_storage, new Object[]{bm.i(this, instance.getTimeInMillis())}));
                cpVar.setIndeterminate(true);
                cpVar.setCancelable(false);
                return cpVar;
            case a6.D /*9*/:
                return new Builder(this).setTitle(getString(R.string.msg_store_backup_skipped)).setMessage(getString(App.aT() ? R.string.read_only_media_message : R.string.read_only_media_message_shared_storage)).setNeutralButton(R.string.ok, new p4(this)).create();
            case a6.h /*10*/:
                return new Builder(this).setTitle(getString(R.string.msg_store_backup_skipped)).setMessage(getString(App.aT() ? R.string.no_media_message : R.string.no_media_message_shared_storage)).setNeutralButton(R.string.ok, new afz(this)).create();
            case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                if (this.i == null) {
                    return super.onCreateDialog(i);
                }
                m8 a = App.P.a(this.i);
                return new Builder(this).setMessage(R.string.email_conversation_ask_about_media).setPositiveButton(R.string.attach_media, new a5p(this, a)).setNeutralButton(R.string.without_media, new zj(this, a)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences_chat);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference(z[32]);
        checkBoxPreference.setOnPreferenceClickListener(new sd(this, checkBoxPreference));
        findPreference(z[37]).setOnPreferenceClickListener(new amu(this));
        ListPreference listPreference = (ListPreference) findPreference(z[36]);
        listPreference.setTitle(getString(R.string.settings_font_size_with_value, new Object[]{listPreference.getEntry()}));
        listPreference.setOnPreferenceChangeListener(new _s(this));
        findPreference(z[30]).setOnPreferenceClickListener(new _c(this));
        findPreference(z[29]).setOnPreferenceClickListener(new u2(this));
        findPreference(z[33]).setOnPreferenceClickListener(new ht(this));
        findPreference(z[28]).setOnPreferenceClickListener(new afg(this));
        findPreference(z[31]).setOnPreferenceClickListener(new j(this));
        Preference findPreference = findPreference(z[34]);
        int i = (v.d() > 0 || v.a() == 0) ? R.string.archive_all_chats : R.string.unarchive_all_chats;
        findPreference.setTitle(i);
        findPreference(z[35]).setOnPreferenceClickListener(new b0(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.net.Uri r8, int r9, int r10, int r11) {
        /*
        r7_this = this;
        r6 = 0;
        if (r8 != 0) goto L_0x0010;
    L_0x0003:
        r1 = 1;
        r3 = 0;
        r0 = r7;
        r2 = r9;
        r4 = r10;
        r5 = r11;
        com.whatsapp.wallpaper.p.a(r0, r1, r2, r3, r4, r5);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0019;
    L_0x0010:
        r2 = -1;
        r0 = r7;
        r1 = r6;
        r3 = r8;
        r4 = r6;
        r5 = r6;
        com.whatsapp.wallpaper.p.a(r0, r1, r2, r3, r4, r5);
    L_0x0019:
        com.whatsapp.util.f.a(r7, r8);
        r0 = r7.getBaseContext();
        r1 = 2131625110; // 0x7f0e0496 float:1.8877419E38 double:1.0531627367E-314;
        r1 = r7.getString(r1);
        com.whatsapp.App.a(r0, r1, r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsChat.a(android.net.Uri, int, int, int):void");
    }

    protected void onResume() {
        super.onResume();
        a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
        r10_this = this;
        r5 = -1;
        r2 = 0;
        r9 = 1;
        r8 = 0;
        r6 = com.whatsapp.App.az;
        if (r12 != 0) goto L_0x006d;
    L_0x0008:
        if (r13 == 0) goto L_0x006d;
    L_0x000a:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x0074 }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x0074 }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ FileNotFoundException -> 0x0074 }
        if (r0 == 0) goto L_0x002b;
    L_0x0016:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x0076 }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x0076 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ FileNotFoundException -> 0x0076 }
        r0 = com.whatsapp.App.p;	 Catch:{ FileNotFoundException -> 0x0076 }
        r1 = 2131624289; // 0x7f0e0161 float:1.8875754E38 double:1.053162331E-314;
        r0 = r0.getString(r1);	 Catch:{ FileNotFoundException -> 0x0076 }
        com.whatsapp.App.a(r10, r0);	 Catch:{ FileNotFoundException -> 0x0076 }
    L_0x002b:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x0078 }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x0078 }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ FileNotFoundException -> 0x0078 }
        if (r0 == 0) goto L_0x004c;
    L_0x0038:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x0078 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x0078 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ FileNotFoundException -> 0x0078 }
        r0 = com.whatsapp.App.p;	 Catch:{ FileNotFoundException -> 0x0078 }
        r1 = 2131624285; // 0x7f0e015d float:1.8875745E38 double:1.053162329E-314;
        r0 = r0.getString(r1);	 Catch:{ FileNotFoundException -> 0x0078 }
        com.whatsapp.App.a(r10, r0);	 Catch:{ FileNotFoundException -> 0x0078 }
    L_0x004c:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x007a }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x007a }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ FileNotFoundException -> 0x007a }
        if (r0 == 0) goto L_0x006d;
    L_0x0058:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x007a }
        r1 = 19;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x007a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ FileNotFoundException -> 0x007a }
        r0 = com.whatsapp.App.p;	 Catch:{ FileNotFoundException -> 0x007a }
        r1 = 2131624280; // 0x7f0e0158 float:1.8875735E38 double:1.0531623266E-314;
        r0 = r0.getString(r1);	 Catch:{ FileNotFoundException -> 0x007a }
        com.whatsapp.App.a(r10, r0);	 Catch:{ FileNotFoundException -> 0x007a }
    L_0x006d:
        switch(r11) {
            case 17: goto L_0x00c3;
            case 18: goto L_0x0090;
            case 104: goto L_0x007c;
            default: goto L_0x0070;
        };
    L_0x0070:
        super.onActivityResult(r11, r12, r13);
    L_0x0073:
        return;
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r0 = move-exception;
        throw r0;
    L_0x007a:
        r0 = move-exception;
        throw r0;
    L_0x007c:
        if (r12 != r5) goto L_0x0070;
    L_0x007e:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x0150 }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x0150 }
        r0 = r13.getStringExtra(r0);	 Catch:{ FileNotFoundException -> 0x0150 }
        r10.i = r0;	 Catch:{ FileNotFoundException -> 0x0150 }
        r0 = 19;
        r10.showDialog(r0);	 Catch:{ FileNotFoundException -> 0x0150 }
        if (r6 == 0) goto L_0x0070;
    L_0x0090:
        if (r12 != r5) goto L_0x00a6;
    L_0x0092:
        if (r13 == 0) goto L_0x0070;
    L_0x0094:
        r0 = r13.getData();	 Catch:{ FileNotFoundException -> 0x0156 }
        if (r0 == 0) goto L_0x0070;
    L_0x009a:
        r0 = r13.getData();	 Catch:{ FileNotFoundException -> 0x0158 }
        r1 = -1;
        r3 = 0;
        r4 = 0;
        r10.a(r0, r1, r3, r4);	 Catch:{ FileNotFoundException -> 0x0158 }
        if (r6 == 0) goto L_0x0070;
    L_0x00a6:
        if (r13 == 0) goto L_0x0070;
    L_0x00a8:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x015c }
        r1 = 13;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x015c }
        r1 = 1;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ FileNotFoundException -> 0x015c }
        if (r0 == 0) goto L_0x0070;
    L_0x00b5:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x015e }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x015e }
        com.whatsapp.util.Log.e(r0);	 Catch:{ FileNotFoundException -> 0x015e }
        r0 = 7;
        r10.showDialog(r0);	 Catch:{ FileNotFoundException -> 0x015e }
        if (r6 == 0) goto L_0x0070;
    L_0x00c3:
        if (r12 != r5) goto L_0x0070;
    L_0x00c5:
        if (r13 == 0) goto L_0x0070;
    L_0x00c7:
        r7 = com.whatsapp.wallpaper.p.c(r10);
        r0 = r13.getData();
        if (r0 == 0) goto L_0x0201;
    L_0x00d1:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 25;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r13.getData();
        r1 = r1.toString();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.e;
        r1 = r13.getData();
        r3 = r2;
        r4 = r2;
        r5 = r2;
        r1 = r0.query(r1, r2, r3, r4, r5);
        if (r1 == 0) goto L_0x0171;
    L_0x0102:
        r1.moveToFirst();	 Catch:{ all -> 0x0166 }
        r0 = z;	 Catch:{ all -> 0x0166 }
        r2 = 21;
        r0 = r0[r2];	 Catch:{ all -> 0x0166 }
        r0 = r1.getColumnIndex(r0);	 Catch:{ all -> 0x0166 }
        if (r0 < 0) goto L_0x0171;
    L_0x0111:
        r0 = r1.getString(r0);	 Catch:{ FileNotFoundException -> 0x0164 }
        r2 = com.whatsapp.yf.l;	 Catch:{ FileNotFoundException -> 0x0164 }
        r0 = r0.equals(r2);	 Catch:{ FileNotFoundException -> 0x0164 }
        if (r0 == 0) goto L_0x0171;
    L_0x011d:
        r0 = new android.graphics.BitmapFactory$Options;	 Catch:{ all -> 0x0166 }
        r0.<init>();	 Catch:{ all -> 0x0166 }
        r2 = 1;
        r0.inJustDecodeBounds = r2;	 Catch:{ all -> 0x0166 }
        r2 = com.whatsapp.App.e;	 Catch:{ FileNotFoundException -> 0x016d }
        r3 = r13.getData();	 Catch:{ FileNotFoundException -> 0x016d }
        r2 = r2.openInputStream(r3);	 Catch:{ FileNotFoundException -> 0x016d }
        r3 = 0;
        android.graphics.BitmapFactory.decodeStream(r2, r3, r0);	 Catch:{ FileNotFoundException -> 0x016d }
        r2 = r0.outWidth;	 Catch:{ FileNotFoundException -> 0x016d }
        r3 = r7.x;	 Catch:{ FileNotFoundException -> 0x016d }
        if (r2 != r3) goto L_0x0171;
    L_0x0139:
        r0 = r0.outHeight;	 Catch:{ FileNotFoundException -> 0x016d }
        r2 = r7.y;	 Catch:{ FileNotFoundException -> 0x016d }
        if (r0 != r2) goto L_0x0171;
    L_0x013f:
        r0 = r13.getData();	 Catch:{ FileNotFoundException -> 0x016d }
        r2 = -1;
        r3 = 0;
        r4 = 0;
        r10.a(r0, r2, r3, r4);	 Catch:{ FileNotFoundException -> 0x016d }
        if (r1 == 0) goto L_0x0073;
    L_0x014b:
        r1.close();
        goto L_0x0073;
    L_0x0150:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0152 }
    L_0x0152:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0154 }
    L_0x0154:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0156 }
    L_0x0156:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0158 }
    L_0x0158:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x015a }
    L_0x015a:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x015c }
    L_0x015c:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x015e }
    L_0x015e:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0160 }
    L_0x0160:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0162 }
    L_0x0162:
        r0 = move-exception;
        throw r0;
    L_0x0164:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0166 }
    L_0x0166:
        r0 = move-exception;
        if (r1 == 0) goto L_0x016c;
    L_0x0169:
        r1.close();	 Catch:{ FileNotFoundException -> 0x02d9 }
    L_0x016c:
        throw r0;
    L_0x016d:
        r0 = move-exception;
        com.whatsapp.util.Log.c(r0);	 Catch:{ all -> 0x0166 }
    L_0x0171:
        if (r1 == 0) goto L_0x0176;
    L_0x0173:
        r1.close();	 Catch:{ FileNotFoundException -> 0x02d7 }
    L_0x0176:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 24;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r7.x;
        r0 = r0.append(r1);
        r1 = z;
        r2 = 10;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r7.y;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.wallpaper.CropImage.class;
        r0.<init>(r10, r1);
        r1 = z;
        r2 = 11;
        r1 = r1[r2];
        r2 = r7.x;
        r0.putExtra(r1, r2);
        r1 = z;
        r2 = 17;
        r1 = r1[r2];
        r2 = r7.y;
        r0.putExtra(r1, r2);
        r1 = z;
        r2 = 27;
        r1 = r1[r2];
        r0.putExtra(r1, r9);
        r1 = z;
        r1 = r1[r9];
        r0.putExtra(r1, r9);
        r1 = z;
        r2 = 20;
        r1 = r1[r2];
        r0.putExtra(r1, r9);
        r1 = r13.getData();
        r0.setData(r1);
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r2 = com.whatsapp.wallpaper.p.a();
        r0.putExtra(r1, r2);
        r1 = z;
        r2 = 23;
        r1 = r1[r2];
        r2 = android.graphics.Bitmap.CompressFormat.JPEG;
        r2 = r2.toString();
        r0.putExtra(r1, r2);
        r1 = 18;
        r10.startActivityForResult(r0, r1);
        if (r6 == 0) goto L_0x0070;
    L_0x0201:
        r0 = z;
        r1 = 15;
        r0 = r0[r1];
        r0 = r13.getIntExtra(r0, r8);
        if (r0 == 0) goto L_0x0253;
    L_0x020d:
        r1 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x02db }
        r1.<init>();	 Catch:{ FileNotFoundException -> 0x02db }
        r2 = z;	 Catch:{ FileNotFoundException -> 0x02db }
        r3 = 14;
        r2 = r2[r3];	 Catch:{ FileNotFoundException -> 0x02db }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x02db }
        r1 = r1.append(r0);	 Catch:{ FileNotFoundException -> 0x02db }
        r2 = z;	 Catch:{ FileNotFoundException -> 0x02db }
        r3 = 18;
        r2 = r2[r3];	 Catch:{ FileNotFoundException -> 0x02db }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x02db }
        r2 = r7.x;	 Catch:{ FileNotFoundException -> 0x02db }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x02db }
        r2 = ",";
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x02db }
        r2 = r7.y;	 Catch:{ FileNotFoundException -> 0x02db }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x02db }
        r2 = "]";
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x02db }
        r1 = r1.toString();	 Catch:{ FileNotFoundException -> 0x02db }
        com.whatsapp.util.Log.i(r1);	 Catch:{ FileNotFoundException -> 0x02db }
        r1 = 0;
        r2 = r7.x;	 Catch:{ FileNotFoundException -> 0x02db }
        r3 = r7.y;	 Catch:{ FileNotFoundException -> 0x02db }
        r10.a(r1, r0, r2, r3);	 Catch:{ FileNotFoundException -> 0x02db }
        if (r6 == 0) goto L_0x0070;
    L_0x0253:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x02dd }
        r1 = 16;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x02dd }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ FileNotFoundException -> 0x02dd }
        if (r0 == 0) goto L_0x027c;
    L_0x0260:
        com.whatsapp.wallpaper.p.a(r10);	 Catch:{ FileNotFoundException -> 0x02df }
        r0 = r10.getBaseContext();	 Catch:{ FileNotFoundException -> 0x02df }
        r1 = 2131625109; // 0x7f0e0495 float:1.8877417E38 double:1.053162736E-314;
        r1 = r10.getString(r1);	 Catch:{ FileNotFoundException -> 0x02df }
        r2 = 0;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ FileNotFoundException -> 0x02df }
        r0 = z;	 Catch:{ FileNotFoundException -> 0x02df }
        r1 = 7;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x02df }
        com.whatsapp.util.Log.i(r0);	 Catch:{ FileNotFoundException -> 0x02df }
        if (r6 == 0) goto L_0x0070;
    L_0x027c:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x02e1 }
        r1 = 8;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x02e1 }
        r1 = 0;
        r0 = r13.getBooleanExtra(r0, r1);	 Catch:{ FileNotFoundException -> 0x02e1 }
        if (r0 == 0) goto L_0x02a6;
    L_0x0289:
        com.whatsapp.wallpaper.p.e(r10);	 Catch:{ FileNotFoundException -> 0x02d5 }
        r0 = r10.getBaseContext();	 Catch:{ FileNotFoundException -> 0x02d5 }
        r1 = 2131625110; // 0x7f0e0496 float:1.8877419E38 double:1.0531627367E-314;
        r1 = r10.getString(r1);	 Catch:{ FileNotFoundException -> 0x02d5 }
        r2 = 0;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ FileNotFoundException -> 0x02d5 }
        r0 = z;	 Catch:{ FileNotFoundException -> 0x02d5 }
        r1 = 26;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x02d5 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ FileNotFoundException -> 0x02d5 }
        if (r6 == 0) goto L_0x0070;
    L_0x02a6:
        r0 = r10.getBaseContext();	 Catch:{ FileNotFoundException -> 0x02d5 }
        r1 = 2131624300; // 0x7f0e016c float:1.8875776E38 double:1.0531623365E-314;
        r1 = r10.getString(r1);	 Catch:{ FileNotFoundException -> 0x02d5 }
        r2 = 0;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ FileNotFoundException -> 0x02d5 }
        r0 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x02d5 }
        r0.<init>();	 Catch:{ FileNotFoundException -> 0x02d5 }
        r1 = z;	 Catch:{ FileNotFoundException -> 0x02d5 }
        r2 = 22;
        r1 = r1[r2];	 Catch:{ FileNotFoundException -> 0x02d5 }
        r0 = r0.append(r1);	 Catch:{ FileNotFoundException -> 0x02d5 }
        r1 = r13.toString();	 Catch:{ FileNotFoundException -> 0x02d5 }
        r0 = r0.append(r1);	 Catch:{ FileNotFoundException -> 0x02d5 }
        r0 = r0.toString();	 Catch:{ FileNotFoundException -> 0x02d5 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ FileNotFoundException -> 0x02d5 }
        goto L_0x0070;
    L_0x02d5:
        r0 = move-exception;
        throw r0;
    L_0x02d7:
        r0 = move-exception;
        throw r0;
    L_0x02d9:
        r0 = move-exception;
        throw r0;
    L_0x02db:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x02dd }
    L_0x02dd:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x02df }
    L_0x02df:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x02e1 }
    L_0x02e1:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x02d5 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsChat.onActivityResult(int, int, android.content.Intent):void");
    }

    static void b(SettingsChat settingsChat) {
        settingsChat.a();
    }

    public static void b() {
        ho y = App.y();
        if (y instanceof SettingsChat) {
            ((SettingsChat) y).a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r6_this = this;
        r1 = com.whatsapp.App.az;
        r2 = com.whatsapp.App.aB();
        r0 = "";
        r4 = 0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x0017;
    L_0x000e:
        r0 = 2131624603; // 0x7f0e029b float:1.887639E38 double:1.053162486E-314;
        r0 = r6.getString(r0);
        if (r1 == 0) goto L_0x002a;
    L_0x0017:
        r4 = -1;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x0026;
    L_0x001d:
        r0 = 2131625039; // 0x7f0e044f float:1.8877275E38 double:1.0531627016E-314;
        r0 = r6.getString(r0);
        if (r1 == 0) goto L_0x002a;
    L_0x0026:
        r0 = com.whatsapp.util.bm.k(r6, r2);
    L_0x002a:
        r1 = z;
        r2 = 38;
        r1 = r1[r2];
        r1 = r6.findPreference(r1);
        r2 = 2131624876; // 0x7f0e03ac float:1.8876944E38 double:1.053162621E-314;
        r2 = r6.getString(r2);
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r4 = 0;
        r3[r4] = r0;
        r0 = java.lang.String.format(r2, r3);
        r1.setSummary(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsChat.a():void");
    }
}
