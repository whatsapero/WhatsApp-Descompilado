package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ListView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.SherlockListFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.whatsapp.notification.t;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.undobar.UndoBarController;
import com.whatsapp.util.y;
import java.util.ArrayList;
import java.util.Collection;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ConversationsFragment extends SherlockListFragment implements anq, _2, bt {
    private static final String[] z;
    TextView b;
    private fk c;
    private __ d;
    private ab e;
    private ArrayList f;
    private String g;
    TextView h;
    private ListView i;
    private int j;
    private String k;

    public class ClearAllMessagesDialogFragment extends DialogFragment {
        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setMessage(R.string.clear_all_chats_ask).setPositiveButton(R.string.ok, new ep(this)).setNeutralButton(R.string.cancel, null).create();
        }
    }

    public class DeleteAllMessagesDialogFragment extends DialogFragment {
        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setMessage(R.string.delete_all_chats_ask).setPositiveButton(R.string.ok, new i1(this)).setNeutralButton(R.string.cancel, null).create();
        }
    }

    public class DeleteBroadcastListDialogFragment extends DialogFragment {
        private static final String z;

        static {
            char[] toCharArray = "\u000e\u0006z".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 100;
                        break;
                    case ay.f /*1*/:
                        i2 = 111;
                        break;
                    case ay.n /*2*/:
                        i2 = 30;
                        break;
                    case ay.p /*3*/:
                        i2 = 93;
                        break;
                    default:
                        i2 = 12;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.app.Dialog onCreateDialog(android.os.Bundle r7) {
            /*
            r6_this = this;
            r5 = 1;
            r0 = com.whatsapp.App.P;
            r1 = r6.getArguments();
            r2 = z;
            r1 = r1.getString(r2);
            r1 = r0.a(r1);
            r0 = r1.N;
            r0 = android.text.TextUtils.isEmpty(r0);
            if (r0 == 0) goto L_0x0024;
        L_0x0019:
            r0 = 2131624234; // 0x7f0e012a float:1.8875642E38 double:1.053162304E-314;
            r0 = r6.getString(r0);
            r2 = com.whatsapp.App.az;
            if (r2 == 0) goto L_0x0038;
        L_0x0024:
            r0 = 2131624233; // 0x7f0e0129 float:1.887564E38 double:1.0531623034E-314;
            r2 = new java.lang.Object[r5];
            r3 = 0;
            r4 = r6.getActivity();
            r4 = r1.a(r4);
            r2[r3] = r4;
            r0 = r6.getString(r0, r2);
        L_0x0038:
            r2 = new android.app.AlertDialog$Builder;
            r3 = r6.getActivity();
            r2.<init>(r3);
            r3 = r6.getActivity();
            r3 = r3.getBaseContext();
            r0 = com.whatsapp.util.a5.d(r0, r3);
            r0 = r2.setMessage(r0);
            r0 = r0.setCancelable(r5);
            r2 = 2131624059; // 0x7f0e007b float:1.8875287E38 double:1.0531622174E-314;
            r3 = new com.whatsapp.a59;
            r3.<init>(r6);
            r0 = r0.setNegativeButton(r2, r3);
            r2 = 2131624204; // 0x7f0e010c float:1.8875581E38 double:1.053162289E-314;
            r3 = new com.whatsapp.asa;
            r3.<init>(r6, r1);
            r0 = r0.setPositiveButton(r2, r3);
            r0 = r0.create();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.DeleteBroadcastListDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
        }
    }

    public class DeleteContactDialogFragment extends DialogFragment {
        private static final String z;

        static {
            char[] toCharArray = "\u0017I!".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 125;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 69;
                        break;
                    case ay.p /*3*/:
                        i2 = 113;
                        break;
                    default:
                        i2 = 46;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setMessage(a5.d(getString(R.string.delete_contact_dialog_title, new Object[]{App.P.a(getArguments().getString(z)).a(getActivity())}), getActivity().getBaseContext())).setCancelable(true).setNegativeButton(R.string.cancel, new ba(this)).setPositiveButton(R.string.delete, new x7(this, App.P.a(getArguments().getString(z)))).create();
        }
    }

    public class DeleteGroupDialogFragment extends DialogFragment {
        private static final String z;

        static {
            char[] toCharArray = "_I\u001d".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 53;
                        break;
                    case ay.f /*1*/:
                        i2 = 32;
                        break;
                    case ay.n /*2*/:
                        i2 = 121;
                        break;
                    case ay.p /*3*/:
                        i2 = 84;
                        break;
                    default:
                        i2 = 9;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setMessage(a5.d(getString(R.string.delete_group_dialog_title, new Object[]{App.P.a(getArguments().getString(z)).a(getActivity())}), getActivity().getBaseContext())).setCancelable(true).setNegativeButton(R.string.cancel, new a5m(this)).setPositiveButton(R.string.delete, new dp(this, App.P.a(getArguments().getString(z)))).create();
        }
    }

    public class EmailConversationMediaChoiceDialogFragment extends DialogFragment {
        private static final String z;

        static {
            char[] toCharArray = "!\u0006\u0002".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 75;
                        break;
                    case ay.f /*1*/:
                        i2 = 111;
                        break;
                    case ay.n /*2*/:
                        i2 = 102;
                        break;
                    case ay.p /*3*/:
                        i2 = 111;
                        break;
                    default:
                        i2 = 108;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public Dialog onCreateDialog(Bundle bundle) {
            m8 a = App.P.a(getArguments().getString(z));
            return new Builder(getActivity()).setMessage(R.string.email_conversation_ask_about_media).setPositiveButton(R.string.attach_media, new alc(this, a)).setNeutralButton(R.string.without_media, new jf(this, a)).create();
        }
    }

    public class ExitGroupDialogFragment extends DialogFragment {
        private static final String z;

        static {
            char[] toCharArray = "!c4".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case PBE.MD5 /*0*/:
                        i2 = 75;
                        break;
                    case ay.f /*1*/:
                        i2 = 10;
                        break;
                    case ay.n /*2*/:
                        i2 = 80;
                        break;
                    case ay.p /*3*/:
                        i2 = 36;
                        break;
                    default:
                        i2 = 87;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setMessage(a5.d(getString(R.string.exit_group_dialog_title, new Object[]{App.P.a(getArguments().getString(z)).a(getActivity())}), getActivity().getBaseContext())).setCancelable(true).setNegativeButton(R.string.cancel, new he(this)).setPositiveButton(R.string.exit, new rb(this, App.P.a(getArguments().getString(z)))).create();
        }
    }

    public class ViewContactsNotSupportedDialogFragment extends DialogFragment {
        public Dialog onCreateDialog(Bundle bundle) {
            return new Builder(getActivity()).setMessage(R.string.view_contact_unsupport).setNeutralButton(R.string.ok, new ol(this)).create();
        }
    }

    static {
        String[] strArr = new String[28];
        String str = "\u0006gP+N";
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
                        i3 = 118;
                        break;
                    case ay.f /*1*/:
                        i3 = 15;
                        break;
                    case ay.n /*2*/:
                        i3 = 63;
                        break;
                    case ay.p /*3*/:
                        i3 = 69;
                        break;
                    default:
                        i3 = 43;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u0000a[kJ\u0018kM*B\u0012!\\0Y\u0005`MkB\u0002jRjH\u0019aK$H\u0002";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u0006gP+N){F5N";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0017a[7D\u001fk\u0011,E\u0002jQ1\u0005\u0017lK,D\u0018!v\u000bx3]k";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0015`Q3N\u0004|^1B\u0019aLjH\u0019aK S\u0002/L<X\u0002jReH\u0019aK$H\u0002/S,X\u0002/\\*^\u001ak\u001f+D\u0002/Y*^\u0018k";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0006gP+N";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0017a[7D\u001fk\u0011,E\u0002jQ1\u0005\u0017lK,D\u0018!v\u000bx3]k\u001ad$Pz\u0001b\"";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0015`Rk\\\u001enK6J\u0006\u007f`5Y\u0013iZ7N\u0018lZ6";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0012jS _\u0013P\\-J\u0002P\\*^\u0018{";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0015`Q3N\u0004|^1B\u0019aLjY\u0013|J(N";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ":`Q\"{\u0004jL6N\u0012]P2a\u001fk";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0015`Q3N\u0004|^1B\u0019aLjH\u0004j^1N";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0015`Q3N\u0004|^1B\u0019aLjH\u0004j^1N";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0012jS _\u0013P\\-J\u0002P\\*^\u0018{";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    str = "\u0015`Q3N\u0004|^1B\u0019aLjX\u0013{[ G\u0013{Z&C\u0017{\u0010#J\u001fcZ!";
                    obj = 14;
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    strArr2 = strArr3;
                    str = "\u0015`Rk\\\u001enK6J\u0006\u007f`5Y\u0013iZ7N\u0018lZ6";
                    obj = 15;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0011}P0[)aP1B\u0015j\u007f1N\u001b\u007f";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0015`Q1J\u0015{";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0015`Q3N\u0004|^1B\u0019aLjY\u0013|J)_VlP+_\u0017lKeE\u0019{\u001f$O\u0012j[";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0015`Q3N\u0004|^1B\u0019aLjY\u0013|J)_Y|T,[YlP+_\u0017lKeE\u0019{\u001f$O\u0012j[";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0015`Q3N\u0004|^1B\u0019aLjO\u0013|K7D\u000f";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u001cf[";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = ":`Q\"{\u0004jL6N\u0012]P2a\u001fk";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0015`Q3N\u0004|^1B\u0019aLj[\u0017zL ";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0014}P$O\u0015nL1";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0015`Q3N\u0004|^1B\u0019aLjH\u0019aK S\u0002 Q0G\u001a";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0011}P0[)aP1B\u0015j\u007f1N\u001b\u007f";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u0015`Q3N\u0004|^1B\u0019aLjO\u0013cZ1NYhM*^\u00065";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static ArrayList a(ConversationsFragment conversationsFragment, ArrayList arrayList) {
        conversationsFragment.f = arrayList;
        return arrayList;
    }

    public void a(String str, boolean z) {
        getActivity().runOnUiThread(new z(this, str, z));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
        r5_this = this;
        r4 = -1;
        r0 = com.whatsapp.App.az;
        switch(r6) {
            case 1: goto L_0x0007;
            case 10: goto L_0x0022;
            case 11: goto L_0x0051;
            default: goto L_0x0006;
        };
    L_0x0006:
        return;
    L_0x0007:
        if (r7 != r4) goto L_0x0006;
    L_0x0009:
        r1 = z;
        r2 = 18;
        r1 = r1[r2];
        r1 = r8.getStringExtra(r1);
        r2 = com.whatsapp.App.P;
        r1 = r2.a(r1);
        r1 = com.whatsapp.Conversation.a(r1);	 Catch:{ ActivityNotFoundException -> 0x006e }
        r5.startActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x006e }
        if (r0 == 0) goto L_0x0006;
    L_0x0022:
        if (r7 != r4) goto L_0x0046;
    L_0x0024:
        r1 = com.whatsapp.App.P;
        r2 = r5.g;
        r1 = r1.a(r2);
        if (r8 == 0) goto L_0x003f;
    L_0x002e:
        r2 = r8.getData();	 Catch:{ ActivityNotFoundException -> 0x0070 }
        if (r2 == 0) goto L_0x003f;
    L_0x0034:
        r2 = com.whatsapp.App.P;	 Catch:{ ActivityNotFoundException -> 0x0072 }
        r3 = r8.getData();	 Catch:{ ActivityNotFoundException -> 0x0072 }
        r2.a(r3, r1);	 Catch:{ ActivityNotFoundException -> 0x0072 }
        if (r0 == 0) goto L_0x0044;
    L_0x003f:
        r2 = com.whatsapp.App.P;	 Catch:{ ActivityNotFoundException -> 0x0072 }
        r2.i(r1);	 Catch:{ ActivityNotFoundException -> 0x0072 }
    L_0x0044:
        if (r0 == 0) goto L_0x0006;
    L_0x0046:
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x0074 }
        r2 = 19;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0074 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ActivityNotFoundException -> 0x0074 }
        if (r0 == 0) goto L_0x0006;
    L_0x0051:
        if (r7 != r4) goto L_0x0062;
    L_0x0053:
        r1 = com.whatsapp.App.P;
        r2 = r5.g;
        r1 = r1.a(r2);
        r2 = com.whatsapp.App.P;	 Catch:{ ActivityNotFoundException -> 0x006c }
        r2.i(r1);	 Catch:{ ActivityNotFoundException -> 0x006c }
        if (r0 == 0) goto L_0x0006;
    L_0x0062:
        r0 = z;	 Catch:{ ActivityNotFoundException -> 0x006c }
        r1 = 20;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x006c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x006c }
        goto L_0x0006;
    L_0x006c:
        r0 = move-exception;
        throw r0;
    L_0x006e:
        r0 = move-exception;
        throw r0;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onPause() {
        Log.i(z[24]);
        super.onPause();
        UndoBarController.b(getActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.conversations, viewGroup, false);
    }

    static void g(ConversationsFragment conversationsFragment) {
        conversationsFragment.c();
    }

    public void onResume() {
        Log.i(z[10]);
        super.onResume();
        t.b();
        App.V.stop();
    }

    public void b(String str) {
        a(App.p, str);
    }

    protected void a(int i) {
        int i2 = App.az;
        if (this.i.getLastVisiblePosition() < this.i.getAdapter().getCount() - 1) {
            int childCount = this.i.getChildCount();
            int i3 = 0;
            int i4 = 0;
            while (i4 < childCount) {
                int i5;
                View childAt = this.i.getChildAt(i4);
                if (childAt.getTop() >= i) {
                    Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                    translateAnimation.setDuration(150);
                    translateAnimation.setStartOffset((long) (((int) Math.sqrt((double) (i3 * 300))) * 8));
                    translateAnimation.setFillAfter(false);
                    childAt.startAnimation(translateAnimation);
                    i5 = i3 + 1;
                } else {
                    i5 = i3;
                }
                int i6 = i4 + 1;
                if (i2 == 0) {
                    i4 = i6;
                    i3 = i5;
                } else {
                    return;
                }
            }
        }
    }

    static __ f(ConversationsFragment conversationsFragment) {
        return conversationsFragment.d;
    }

    public void onStop() {
        super.onStop();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateContextMenu(android.view.ContextMenu r8, android.view.View r9, android.view.ContextMenu.ContextMenuInfo r10) {
        /*
        r7_this = this;
        r6 = 2131427341; // 0x7f0b000d float:1.8476296E38 double:1.053065026E-314;
        r5 = 0;
        r1 = com.whatsapp.App.az;
        super.onCreateContextMenu(r8, r9, r10);
        r10 = (android.widget.AdapterView.AdapterContextMenuInfo) r10;
        r0 = r10.targetView;
        r0 = r0.getTag();
        r0 = (com.whatsapp._f) r0;
        if (r0 != 0) goto L_0x0021;
    L_0x0015:
        r0 = z;	 Catch:{ ActivityNotFoundException -> 0x001f }
        r1 = 26;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x001f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x001f }
    L_0x001e:
        return;
    L_0x001f:
        r0 = move-exception;
        throw r0;
    L_0x0021:
        r2 = r0.g;
        r7.g = r2;
        r2 = com.whatsapp.App.P;
        r3 = r7.g;
        r2 = r2.a(r3);
        r3 = z;	 Catch:{ ActivityNotFoundException -> 0x004b }
        r4 = 25;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x004b }
        r4 = r0.g;	 Catch:{ ActivityNotFoundException -> 0x004b }
        r3 = r3.equals(r4);	 Catch:{ ActivityNotFoundException -> 0x004b }
        if (r3 == 0) goto L_0x004d;
    L_0x003b:
        r0 = 0;
        r1 = 2131427341; // 0x7f0b000d float:1.8476296E38 double:1.053065026E-314;
        r2 = 0;
        r3 = 2131624224; // 0x7f0e0120 float:1.8875622E38 double:1.053162299E-314;
        r3 = r7.getString(r3);	 Catch:{ ActivityNotFoundException -> 0x004b }
        r8.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x004b }
        goto L_0x001e;
    L_0x004b:
        r0 = move-exception;
        throw r0;
    L_0x004d:
        r3 = r2.b();	 Catch:{ ActivityNotFoundException -> 0x006c }
        if (r3 == 0) goto L_0x0070;
    L_0x0053:
        r0 = r2.e;	 Catch:{ ActivityNotFoundException -> 0x006e }
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x006e }
        r2 = 27;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x006e }
        r0 = r0.contains(r1);	 Catch:{ ActivityNotFoundException -> 0x006e }
        if (r0 != 0) goto L_0x001e;
    L_0x0061:
        r0 = 2131624230; // 0x7f0e0126 float:1.8875634E38 double:1.053162302E-314;
        r0 = r7.getString(r0);
        r8.add(r5, r6, r5, r0);
        goto L_0x001e;
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;
    L_0x0070:
        r3 = r2.e;	 Catch:{ ActivityNotFoundException -> 0x01be }
        r4 = com.whatsapp.bd.g();	 Catch:{ ActivityNotFoundException -> 0x01be }
        r3 = r3.equals(r4);	 Catch:{ ActivityNotFoundException -> 0x01be }
        if (r3 != 0) goto L_0x001e;
    L_0x007c:
        r3 = r2.h;	 Catch:{ ActivityNotFoundException -> 0x01c0 }
        if (r3 != 0) goto L_0x00d6;
    L_0x0080:
        r3 = r2.w();	 Catch:{ ActivityNotFoundException -> 0x01c2 }
        if (r3 == 0) goto L_0x009f;
    L_0x0086:
        r0 = r0.c;	 Catch:{ ActivityNotFoundException -> 0x01c4 }
        r0 = r0.getVisibility();	 Catch:{ ActivityNotFoundException -> 0x01c4 }
        if (r0 == 0) goto L_0x001e;
    L_0x008e:
        r0 = 0;
        r3 = 2131427343; // 0x7f0b000f float:1.84763E38 double:1.053065027E-314;
        r4 = 0;
        r5 = 2131624410; // 0x7f0e01da float:1.8875999E38 double:1.053162391E-314;
        r5 = r7.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01c6 }
        r8.add(r0, r3, r4, r5);	 Catch:{ ActivityNotFoundException -> 0x01c6 }
        if (r1 == 0) goto L_0x00e5;
    L_0x009f:
        r0 = r2.l();	 Catch:{ ActivityNotFoundException -> 0x01c8 }
        if (r0 == 0) goto L_0x00b6;
    L_0x00a5:
        r0 = 0;
        r3 = 2131427343; // 0x7f0b000f float:1.84763E38 double:1.053065027E-314;
        r4 = 0;
        r5 = 2131624475; // 0x7f0e021b float:1.887613E38 double:1.053162423E-314;
        r5 = r7.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01ca }
        r8.add(r0, r3, r4, r5);	 Catch:{ ActivityNotFoundException -> 0x01ca }
        if (r1 == 0) goto L_0x00e5;
    L_0x00b6:
        r0 = 0;
        r3 = 2131427336; // 0x7f0b0008 float:1.8476285E38 double:1.0530650233E-314;
        r4 = 0;
        r5 = 2131623974; // 0x7f0e0026 float:1.8875115E38 double:1.0531621754E-314;
        r5 = r7.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01cc }
        r8.add(r0, r3, r4, r5);	 Catch:{ ActivityNotFoundException -> 0x01cc }
        r0 = 0;
        r3 = 2131427337; // 0x7f0b0009 float:1.8476287E38 double:1.053065024E-314;
        r4 = 0;
        r5 = 2131623977; // 0x7f0e0029 float:1.887512E38 double:1.053162177E-314;
        r5 = r7.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01cc }
        r8.add(r0, r3, r4, r5);	 Catch:{ ActivityNotFoundException -> 0x01cc }
        if (r1 == 0) goto L_0x00e5;
    L_0x00d6:
        r0 = 0;
        r3 = 2131427339; // 0x7f0b000b float:1.8476291E38 double:1.053065025E-314;
        r4 = 0;
        r5 = 2131625074; // 0x7f0e0472 float:1.8877346E38 double:1.053162719E-314;
        r5 = r7.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01cc }
        r8.add(r0, r3, r4, r5);	 Catch:{ ActivityNotFoundException -> 0x01cc }
    L_0x00e5:
        r0 = r2.l();	 Catch:{ ActivityNotFoundException -> 0x01ce }
        if (r0 != 0) goto L_0x0100;
    L_0x00eb:
        r0 = com.whatsapp.App.ag();	 Catch:{ ActivityNotFoundException -> 0x01d0 }
        if (r0 != 0) goto L_0x0100;
    L_0x00f1:
        r0 = 0;
        r3 = 2131427340; // 0x7f0b000c float:1.8476293E38 double:1.0530650253E-314;
        r4 = 0;
        r5 = 2131623982; // 0x7f0e002e float:1.887513E38 double:1.0531621794E-314;
        r5 = r7.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01d0 }
        r8.add(r0, r3, r4, r5);	 Catch:{ ActivityNotFoundException -> 0x01d0 }
    L_0x0100:
        r0 = com.whatsapp.App.aJ;	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        r3 = r2.e;	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        r0 = r0.q(r3);	 Catch:{ ActivityNotFoundException -> 0x01d2 }
        if (r0 == 0) goto L_0x0134;
    L_0x010a:
        r0 = r2.e;	 Catch:{ ActivityNotFoundException -> 0x01d4 }
        r0 = com.whatsapp.m8.b(r0);	 Catch:{ ActivityNotFoundException -> 0x01d4 }
        if (r0 == 0) goto L_0x0123;
    L_0x0112:
        r0 = 0;
        r3 = 2131427344; // 0x7f0b0010 float:1.8476302E38 double:1.0530650273E-314;
        r4 = 0;
        r5 = 2131625032; // 0x7f0e0448 float:1.887726E38 double:1.053162698E-314;
        r5 = r7.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        r8.add(r0, r3, r4, r5);	 Catch:{ ActivityNotFoundException -> 0x01d6 }
        if (r1 == 0) goto L_0x015c;
    L_0x0123:
        r0 = 0;
        r3 = 2131427344; // 0x7f0b0010 float:1.8476302E38 double:1.0530650273E-314;
        r4 = 0;
        r5 = 2131625033; // 0x7f0e0449 float:1.8877263E38 double:1.0531626986E-314;
        r5 = r7.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01d8 }
        r8.add(r0, r3, r4, r5);	 Catch:{ ActivityNotFoundException -> 0x01d8 }
        if (r1 == 0) goto L_0x015c;
    L_0x0134:
        r0 = r2.e;	 Catch:{ ActivityNotFoundException -> 0x01da }
        r0 = com.whatsapp.m8.b(r0);	 Catch:{ ActivityNotFoundException -> 0x01da }
        if (r0 == 0) goto L_0x014d;
    L_0x013c:
        r0 = 0;
        r3 = 2131427338; // 0x7f0b000a float:1.847629E38 double:1.0530650243E-314;
        r4 = 0;
        r5 = 2131624010; // 0x7f0e004a float:1.8875188E38 double:1.053162193E-314;
        r5 = r7.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01dc }
        r8.add(r0, r3, r4, r5);	 Catch:{ ActivityNotFoundException -> 0x01dc }
        if (r1 == 0) goto L_0x015c;
    L_0x014d:
        r0 = 0;
        r3 = 2131427338; // 0x7f0b000a float:1.847629E38 double:1.0530650243E-314;
        r4 = 0;
        r5 = 2131624011; // 0x7f0e004b float:1.887519E38 double:1.0531621937E-314;
        r5 = r7.getString(r5);	 Catch:{ ActivityNotFoundException -> 0x01dc }
        r8.add(r0, r3, r4, r5);	 Catch:{ ActivityNotFoundException -> 0x01dc }
    L_0x015c:
        r0 = r2.w();	 Catch:{ ActivityNotFoundException -> 0x01de }
        if (r0 == 0) goto L_0x017b;
    L_0x0162:
        r3 = 0;
        r4 = 2131427341; // 0x7f0b000d float:1.8476296E38 double:1.053065026E-314;
        r5 = 0;
        r0 = r2.e;	 Catch:{ ActivityNotFoundException -> 0x01e0 }
        r0 = com.whatsapp.bd.f(r0);	 Catch:{ ActivityNotFoundException -> 0x01e0 }
        if (r0 == 0) goto L_0x01e2;
    L_0x016f:
        r0 = 2131624309; // 0x7f0e0175 float:1.8875794E38 double:1.053162341E-314;
    L_0x0172:
        r0 = r7.getString(r0);	 Catch:{ ActivityNotFoundException -> 0x01e6 }
        r8.add(r3, r4, r5, r0);	 Catch:{ ActivityNotFoundException -> 0x01e6 }
        if (r1 == 0) goto L_0x01a1;
    L_0x017b:
        r0 = r2.l();	 Catch:{ ActivityNotFoundException -> 0x01e8 }
        if (r0 == 0) goto L_0x0192;
    L_0x0181:
        r0 = 0;
        r2 = 2131427341; // 0x7f0b000d float:1.8476296E38 double:1.053065026E-314;
        r3 = 0;
        r4 = 2131624232; // 0x7f0e0128 float:1.8875638E38 double:1.053162303E-314;
        r4 = r7.getString(r4);	 Catch:{ ActivityNotFoundException -> 0x01ea }
        r8.add(r0, r2, r3, r4);	 Catch:{ ActivityNotFoundException -> 0x01ea }
        if (r1 == 0) goto L_0x01a1;
    L_0x0192:
        r0 = 0;
        r1 = 2131427341; // 0x7f0b000d float:1.8476296E38 double:1.053065026E-314;
        r2 = 0;
        r3 = 2131624225; // 0x7f0e0121 float:1.8875624E38 double:1.0531622994E-314;
        r3 = r7.getString(r3);	 Catch:{ ActivityNotFoundException -> 0x01ea }
        r8.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x01ea }
    L_0x01a1:
        r0 = com.whatsapp.App.aJ;	 Catch:{ ActivityNotFoundException -> 0x01bc }
        r1 = r7.g;	 Catch:{ ActivityNotFoundException -> 0x01bc }
        r0 = r0.B(r1);	 Catch:{ ActivityNotFoundException -> 0x01bc }
        if (r0 == 0) goto L_0x001e;
    L_0x01ab:
        r0 = 0;
        r1 = 2131427342; // 0x7f0b000e float:1.8476298E38 double:1.0530650263E-314;
        r2 = 0;
        r3 = 2131624258; // 0x7f0e0142 float:1.887569E38 double:1.0531623157E-314;
        r3 = r7.getString(r3);	 Catch:{ ActivityNotFoundException -> 0x01bc }
        r8.add(r0, r1, r2, r3);	 Catch:{ ActivityNotFoundException -> 0x01bc }
        goto L_0x001e;
    L_0x01bc:
        r0 = move-exception;
        throw r0;
    L_0x01be:
        r0 = move-exception;
        throw r0;
    L_0x01c0:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01c2 }
    L_0x01c2:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01c4 }
    L_0x01c4:
        r0 = move-exception;
        throw r0;
    L_0x01c6:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01c8 }
    L_0x01c8:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01ca }
    L_0x01ca:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01cc }
    L_0x01cc:
        r0 = move-exception;
        throw r0;
    L_0x01ce:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01d0 }
    L_0x01d0:
        r0 = move-exception;
        throw r0;
    L_0x01d2:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01d4 }
    L_0x01d4:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01d6 }
    L_0x01d6:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01d8 }
    L_0x01d8:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01da }
    L_0x01da:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01dc }
    L_0x01dc:
        r0 = move-exception;
        throw r0;
    L_0x01de:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01e0 }
    L_0x01e0:
        r0 = move-exception;
        throw r0;
    L_0x01e2:
        r0 = 2131624230; // 0x7f0e0126 float:1.8875634E38 double:1.053162302E-314;
        goto L_0x0172;
    L_0x01e6:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01e8 }
    L_0x01e8:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01ea }
    L_0x01ea:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    private View a(String str) {
        int i = App.az;
        if (str == null) {
            return null;
        }
        int i2 = 0;
        while (i2 < this.i.getChildCount()) {
            View childAt = this.i.getChildAt(i2);
            Object tag = childAt.getTag();
            if (tag instanceof _f) {
                try {
                    if (str.equals(((_f) tag).g)) {
                        return childAt;
                    }
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            }
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        return null;
    }

    public void a(Collection collection) {
    }

    public void onStart() {
        super.onStart();
    }

    static int j(ConversationsFragment conversationsFragment) {
        return conversationsFragment.j;
    }

    private void d() {
        int c = App.P.c();
        View findViewById = getView().findViewById(R.id.conversations_empty_no_contacts);
        View findViewById2 = getView().findViewById(R.id.conversations_empty);
        try {
            if (c > 0) {
                findViewById2.setVisibility(0);
                this.i.setEmptyView(findViewById2);
                findViewById.setVisibility(8);
                if (App.az == 0) {
                    return;
                }
            }
            findViewById.setVisibility(0);
            this.i.setEmptyView(findViewById);
            findViewById2.setVisibility(8);
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onContextItemSelected(android.view.MenuItem r8) {
        /*
        r7_this = this;
        r6 = 2;
        r5 = 0;
        r1 = 1;
        r2 = com.whatsapp.App.az;
        r0 = r8.getItemId();
        switch(r0) {
            case 2131427336: goto L_0x00d3;
            case 2131427337: goto L_0x0121;
            case 2131427338: goto L_0x01a8;
            case 2131427339: goto L_0x0011;
            case 2131427340: goto L_0x01c4;
            case 2131427341: goto L_0x0028;
            case 2131427342: goto L_0x016a;
            case 2131427343: goto L_0x01d4;
            case 2131427344: goto L_0x01b6;
            default: goto L_0x000c;
        };
    L_0x000c:
        r0 = super.onContextItemSelected(r8);
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = com.whatsapp.App.P;
        r2 = r7.g;
        r0 = r0.a(r2);
        r2 = r0.h;	 Catch:{ ActivityNotFoundException -> 0x0026 }
        if (r2 == 0) goto L_0x0024;
    L_0x001d:
        r2 = r7.getActivity();	 Catch:{ ActivityNotFoundException -> 0x0026 }
        com.whatsapp.ContactInfo.a(r0, r2);	 Catch:{ ActivityNotFoundException -> 0x0026 }
    L_0x0024:
        r0 = r1;
        goto L_0x0010;
    L_0x0026:
        r0 = move-exception;
        throw r0;
    L_0x0028:
        r0 = com.whatsapp.App.P;
        r3 = r7.g;
        r0 = r0.a(r3);
        r3 = r0.w();	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        if (r3 == 0) goto L_0x0094;
    L_0x0036:
        r3 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        r3.<init>();	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        r4 = z;	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        r3 = r3.append(r4);	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        r3 = r3.append(r0);	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        r3 = r3.toString();	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        r3 = com.whatsapp.bd.e;	 Catch:{ ActivityNotFoundException -> 0x00c1 }
        if (r3 == 0) goto L_0x0060;
    L_0x0053:
        r3 = r7.getActivity();	 Catch:{ ActivityNotFoundException -> 0x00c3 }
        r4 = 2131624436; // 0x7f0e01f4 float:1.8876052E38 double:1.0531624037E-314;
        r5 = 0;
        com.whatsapp.App.b(r3, r4, r5);	 Catch:{ ActivityNotFoundException -> 0x00c3 }
        if (r2 == 0) goto L_0x00be;
    L_0x0060:
        r3 = r0.e;	 Catch:{ ActivityNotFoundException -> 0x00c5 }
        r3 = com.whatsapp.bd.f(r3);	 Catch:{ ActivityNotFoundException -> 0x00c5 }
        if (r3 == 0) goto L_0x0081;
    L_0x0068:
        r3 = r0.b();	 Catch:{ ActivityNotFoundException -> 0x00c7 }
        if (r3 != 0) goto L_0x0081;
    L_0x006e:
        r3 = new com.whatsapp.ConversationsFragment$ExitGroupDialogFragment;	 Catch:{ ActivityNotFoundException -> 0x00c9 }
        r3.<init>();	 Catch:{ ActivityNotFoundException -> 0x00c9 }
        r3 = r7.a(r0, r3);	 Catch:{ ActivityNotFoundException -> 0x00c9 }
        r4 = r7.getFragmentManager();	 Catch:{ ActivityNotFoundException -> 0x00c9 }
        r5 = 0;
        r3.show(r4, r5);	 Catch:{ ActivityNotFoundException -> 0x00c9 }
        if (r2 == 0) goto L_0x00be;
    L_0x0081:
        r3 = new com.whatsapp.ConversationsFragment$DeleteGroupDialogFragment;	 Catch:{ ActivityNotFoundException -> 0x00cb }
        r3.<init>();	 Catch:{ ActivityNotFoundException -> 0x00cb }
        r3 = r7.a(r0, r3);	 Catch:{ ActivityNotFoundException -> 0x00cb }
        r4 = r7.getFragmentManager();	 Catch:{ ActivityNotFoundException -> 0x00cb }
        r5 = 0;
        r3.show(r4, r5);	 Catch:{ ActivityNotFoundException -> 0x00cb }
        if (r2 == 0) goto L_0x00be;
    L_0x0094:
        r3 = r0.l();	 Catch:{ ActivityNotFoundException -> 0x00cd }
        if (r3 == 0) goto L_0x00ad;
    L_0x009a:
        r3 = new com.whatsapp.ConversationsFragment$DeleteBroadcastListDialogFragment;	 Catch:{ ActivityNotFoundException -> 0x00cf }
        r3.<init>();	 Catch:{ ActivityNotFoundException -> 0x00cf }
        r3 = r7.a(r0, r3);	 Catch:{ ActivityNotFoundException -> 0x00cf }
        r4 = r7.getFragmentManager();	 Catch:{ ActivityNotFoundException -> 0x00cf }
        r5 = 0;
        r3.show(r4, r5);	 Catch:{ ActivityNotFoundException -> 0x00cf }
        if (r2 == 0) goto L_0x00be;
    L_0x00ad:
        r2 = new com.whatsapp.ConversationsFragment$DeleteContactDialogFragment;	 Catch:{ ActivityNotFoundException -> 0x00d1 }
        r2.<init>();	 Catch:{ ActivityNotFoundException -> 0x00d1 }
        r0 = r7.a(r0, r2);	 Catch:{ ActivityNotFoundException -> 0x00d1 }
        r2 = r7.getFragmentManager();	 Catch:{ ActivityNotFoundException -> 0x00d1 }
        r3 = 0;
        r0.show(r2, r3);	 Catch:{ ActivityNotFoundException -> 0x00d1 }
    L_0x00be:
        r0 = r1;
        goto L_0x0010;
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00c7 }
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00cb }
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00cf }
    L_0x00cf:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00d1 }
    L_0x00d1:
        r0 = move-exception;
        throw r0;
    L_0x00d3:
        r0 = com.whatsapp.App.P;
        r3 = r7.g;
        r0 = r0.a(r3);
        r0 = r0.a();
        r3 = new android.content.Intent;
        r4 = z;
        r5 = 4;
        r4 = r4[r5];
        r5 = android.provider.ContactsContract.Contacts.CONTENT_URI;
        r3.<init>(r4, r5);
        r4 = z;	 Catch:{ ActivityNotFoundException -> 0x011d }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ ActivityNotFoundException -> 0x011d }
        r3.putExtra(r4, r0);	 Catch:{ ActivityNotFoundException -> 0x011d }
        r0 = r7.getActivity();	 Catch:{ ActivityNotFoundException -> 0x011d }
        r0 = r0.getPackageManager();	 Catch:{ ActivityNotFoundException -> 0x011d }
        r0 = r3.resolveActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x011d }
        r3.setComponent(r0);	 Catch:{ ActivityNotFoundException -> 0x011d }
        r0 = r3.getComponent();	 Catch:{ ActivityNotFoundException -> 0x011d }
        if (r0 == 0) goto L_0x010f;
    L_0x0108:
        r0 = 10;
        r7.startActivityForResult(r3, r0);	 Catch:{ ActivityNotFoundException -> 0x011d }
        if (r2 == 0) goto L_0x011a;
    L_0x010f:
        r0 = z;	 Catch:{ ActivityNotFoundException -> 0x011f }
        r2 = 5;
        r0 = r0[r2];	 Catch:{ ActivityNotFoundException -> 0x011f }
        com.whatsapp.util.Log.w(r0);	 Catch:{ ActivityNotFoundException -> 0x011f }
        com.whatsapp.App.q();	 Catch:{ ActivityNotFoundException -> 0x011f }
    L_0x011a:
        r0 = r1;
        goto L_0x0010;
    L_0x011d:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x011f }
    L_0x011f:
        r0 = move-exception;
        throw r0;
    L_0x0121:
        r0 = new android.content.Intent;
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r0.<init>(r2);
        r2 = z;
        r2 = r2[r6];
        r0.setType(r2);
        r2 = z;
        r2 = r2[r5];
        r3 = com.whatsapp.App.P;
        r4 = r7.g;
        r3 = r3.a(r4);
        r4 = r7.getActivity();
        r3 = r3.a(r4);
        r0.putExtra(r2, r3);
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r0.putExtra(r2, r6);
        r2 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0.setFlags(r2);
        r2 = 11;
        r7.startActivityForResult(r0, r2);	 Catch:{ ActivityNotFoundException -> 0x015e }
    L_0x015b:
        r0 = r1;
        goto L_0x0010;
    L_0x015e:
        r0 = move-exception;
        r0 = r7.getActivity();
        r2 = 2131623970; // 0x7f0e0022 float:1.8875107E38 double:1.0531621734E-314;
        com.whatsapp.App.b(r0, r2, r5);
        goto L_0x015b;
    L_0x016a:
        r0 = com.whatsapp.App.d;	 Catch:{ ActivityNotFoundException -> 0x019c }
        if (r0 != 0) goto L_0x0172;
    L_0x016e:
        r0 = com.whatsapp.App.aF;	 Catch:{ ActivityNotFoundException -> 0x019e }
        if (r0 == 0) goto L_0x0180;
    L_0x0172:
        r0 = com.whatsapp.App.aT();	 Catch:{ ActivityNotFoundException -> 0x01a0 }
        if (r0 == 0) goto L_0x01a2;
    L_0x0178:
        r0 = 2131624582; // 0x7f0e0286 float:1.8876348E38 double:1.053162476E-314;
    L_0x017b:
        r7.c(r0);	 Catch:{ ActivityNotFoundException -> 0x01a6 }
        if (r2 == 0) goto L_0x0199;
    L_0x0180:
        r0 = com.whatsapp.App.P;	 Catch:{ ActivityNotFoundException -> 0x01a6 }
        r2 = r7.g;	 Catch:{ ActivityNotFoundException -> 0x01a6 }
        r0 = r0.a(r2);	 Catch:{ ActivityNotFoundException -> 0x01a6 }
        r2 = new com.whatsapp.ConversationsFragment$EmailConversationMediaChoiceDialogFragment;	 Catch:{ ActivityNotFoundException -> 0x01a6 }
        r2.<init>();	 Catch:{ ActivityNotFoundException -> 0x01a6 }
        r0 = r7.a(r0, r2);	 Catch:{ ActivityNotFoundException -> 0x01a6 }
        r2 = r7.getFragmentManager();	 Catch:{ ActivityNotFoundException -> 0x01a6 }
        r3 = 0;
        r0.show(r2, r3);	 Catch:{ ActivityNotFoundException -> 0x01a6 }
    L_0x0199:
        r0 = r1;
        goto L_0x0010;
    L_0x019c:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x019e }
    L_0x019e:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01a0 }
    L_0x01a0:
        r0 = move-exception;
        throw r0;
    L_0x01a2:
        r0 = 2131624583; // 0x7f0e0287 float:1.887635E38 double:1.0531624763E-314;
        goto L_0x017b;
    L_0x01a6:
        r0 = move-exception;
        throw r0;
    L_0x01a8:
        r0 = r8.getMenuInfo();
        r0 = (android.widget.AdapterView.AdapterContextMenuInfo) r0;
        r0 = r0.targetView;
        r7.b(r0);
        r0 = r1;
        goto L_0x0010;
    L_0x01b6:
        r0 = r8.getMenuInfo();
        r0 = (android.widget.AdapterView.AdapterContextMenuInfo) r0;
        r0 = r0.targetView;
        r7.a(r0);
        r0 = r1;
        goto L_0x0010;
    L_0x01c4:
        r0 = com.whatsapp.App.P;
        r2 = com.whatsapp.App.P;
        r3 = r7.g;
        r2 = r2.a(r3);
        r0.g(r2);
        r0 = r1;
        goto L_0x0010;
    L_0x01d4:
        r0 = com.whatsapp.App.P;
        r3 = r7.g;
        r0 = r0.a(r3);
        r3 = r0.l();	 Catch:{ ActivityNotFoundException -> 0x01f5 }
        if (r3 == 0) goto L_0x01eb;
    L_0x01e2:
        r3 = r7.getActivity();	 Catch:{ ActivityNotFoundException -> 0x01f7 }
        com.whatsapp.ListChatInfo.a(r0, r3);	 Catch:{ ActivityNotFoundException -> 0x01f7 }
        if (r2 == 0) goto L_0x01f2;
    L_0x01eb:
        r2 = r7.getActivity();	 Catch:{ ActivityNotFoundException -> 0x01f7 }
        com.whatsapp.GroupChatInfo.a(r0, r2);	 Catch:{ ActivityNotFoundException -> 0x01f7 }
    L_0x01f2:
        r0 = r1;
        goto L_0x0010;
    L_0x01f5:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x01f7 }
    L_0x01f7:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.onContextItemSelected(android.view.MenuItem):boolean");
    }

    private static void b(int i) {
        Editor edit = App.p.getSharedPreferences(z[16], 0).edit();
        try {
            edit.putInt(z[14], i);
            if (!edit.commit()) {
                Log.e(z[15]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public void onDestroy() {
        Log.i(z[21]);
        super.onDestroy();
        App.a((anq) this);
        App.b((_2) this);
        this.c.a();
    }

    private void a(Context context, String str) {
        if (this.d != null) {
            View a = a(str);
            if (a != null) {
                _f _fVar = (_f) a.getTag();
                m8 b = v.b(str);
                this.d.a(context, a, b, b.e.contains(z[17]), _fVar);
            }
        }
    }

    static String a(ConversationsFragment conversationsFragment) {
        return conversationsFragment.k;
    }

    public void c(String str) {
        a(App.p, str);
    }

    private DialogFragment a(m8 m8Var, DialogFragment dialogFragment) {
        Bundle bundle = new Bundle();
        bundle.putString(z[22], m8Var.e);
        dialogFragment.setArguments(bundle);
        return dialogFragment;
    }

    void f(String str) {
        ((ho) getActivity()).f(str);
    }

    public void e(String str) {
        getActivity().runOnUiThread(new v2(this));
    }

    public ConversationsFragment() {
        this.c = new fk();
        this.e = null;
    }

    static ListView c(ConversationsFragment conversationsFragment) {
        return conversationsFragment.i;
    }

    static fk h(ConversationsFragment conversationsFragment) {
        return conversationsFragment.c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem r7) {
        /*
        r6_this = this;
        r0 = 0;
        r2 = 1;
        r3 = com.whatsapp.App.az;
        r1 = r7.getItemId();
        switch(r1) {
            case 2131427346: goto L_0x001c;
            case 2131427347: goto L_0x000b;
            case 2131427348: goto L_0x000b;
            case 2131427349: goto L_0x000c;
            case 2131427350: goto L_0x002c;
            case 2131427351: goto L_0x000b;
            case 2131427352: goto L_0x0091;
            default: goto L_0x000b;
        };
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = new android.content.Intent;
        r1 = r6.getActivity();
        r3 = com.whatsapp.ContactPicker.class;
        r0.<init>(r1, r3);
        r6.startActivityForResult(r0, r2);
        r0 = r2;
        goto L_0x000b;
    L_0x001c:
        r0 = new android.content.Intent;
        r1 = r6.getActivity();
        r3 = com.whatsapp.ListMembersSelector.class;
        r0.<init>(r1, r3);
        r6.startActivity(r0);
        r0 = r2;
        goto L_0x000b;
    L_0x002c:
        r1 = com.whatsapp.v.b();
        r4 = r1.iterator();
        r1 = r0;
    L_0x0035:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x00d8;
    L_0x003b:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r5 = com.whatsapp.bd.b(r0);	 Catch:{ ActivityNotFoundException -> 0x0078 }
        if (r5 == 0) goto L_0x00d6;
    L_0x0047:
        r5 = com.whatsapp.App.af();	 Catch:{ ActivityNotFoundException -> 0x007a }
        r5 = r0.contains(r5);	 Catch:{ ActivityNotFoundException -> 0x007a }
        if (r5 == 0) goto L_0x00d6;
    L_0x0051:
        r0 = com.whatsapp.m8.e(r0);	 Catch:{ ActivityNotFoundException -> 0x007c }
        if (r0 != 0) goto L_0x00d6;
    L_0x0057:
        r1 = r1 + 1;
        r0 = r1;
    L_0x005a:
        if (r3 == 0) goto L_0x00d3;
    L_0x005c:
        r1 = com.whatsapp.ge.a;	 Catch:{ ActivityNotFoundException -> 0x007e }
        if (r0 < r1) goto L_0x0080;
    L_0x0060:
        r0 = 2131624379; // 0x7f0e01bb float:1.8875936E38 double:1.0531623755E-314;
        r1 = 1;
        r1 = new java.lang.Object[r1];	 Catch:{ ActivityNotFoundException -> 0x007e }
        r3 = 0;
        r4 = com.whatsapp.ge.a;	 Catch:{ ActivityNotFoundException -> 0x007e }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ ActivityNotFoundException -> 0x007e }
        r1[r3] = r4;	 Catch:{ ActivityNotFoundException -> 0x007e }
        r0 = r6.getString(r0, r1);	 Catch:{ ActivityNotFoundException -> 0x007e }
        r6.f(r0);	 Catch:{ ActivityNotFoundException -> 0x007e }
        r0 = r2;
        goto L_0x000b;
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        r0 = new android.content.Intent;
        r1 = r6.getActivity();
        r3 = com.whatsapp.NewGroup.class;
        r0.<init>(r1, r3);
        r6.startActivity(r0);
        r0 = r2;
        goto L_0x000b;
    L_0x0091:
        r0 = com.whatsapp.a12.m();	 Catch:{ ActivityNotFoundException -> 0x00cb }
        if (r0 == 0) goto L_0x00a7;
    L_0x0097:
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x00cd }
        r1 = r6.getActivity();	 Catch:{ ActivityNotFoundException -> 0x00cd }
        r4 = com.whatsapp.WebSessionsActivity.class;
        r0.<init>(r1, r4);	 Catch:{ ActivityNotFoundException -> 0x00cd }
        r6.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x00cd }
        if (r3 == 0) goto L_0x00c8;
    L_0x00a7:
        r0 = com.whatsapp.App.a();	 Catch:{ ActivityNotFoundException -> 0x00cf }
        if (r0 == 0) goto L_0x00bd;
    L_0x00ad:
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x00d1 }
        r1 = r6.getActivity();	 Catch:{ ActivityNotFoundException -> 0x00d1 }
        r4 = com.whatsapp.qrcode.QrCodeActivity.class;
        r0.<init>(r1, r4);	 Catch:{ ActivityNotFoundException -> 0x00d1 }
        r6.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x00d1 }
        if (r3 == 0) goto L_0x00c8;
    L_0x00bd:
        r0 = r6.getActivity();	 Catch:{ ActivityNotFoundException -> 0x00d1 }
        r1 = 2131624584; // 0x7f0e0288 float:1.8876352E38 double:1.053162477E-314;
        r3 = 0;
        com.whatsapp.App.b(r0, r1, r3);	 Catch:{ ActivityNotFoundException -> 0x00d1 }
    L_0x00c8:
        r0 = r2;
        goto L_0x000b;
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00cf }
    L_0x00cf:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00d1 }
    L_0x00d1:
        r0 = move-exception;
        throw r0;
    L_0x00d3:
        r1 = r0;
        goto L_0x0035;
    L_0x00d6:
        r0 = r1;
        goto L_0x005a;
    L_0x00d8:
        r0 = r1;
        goto L_0x005c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.onOptionsItemSelected(com.actionbarsherlock.view.MenuItem):boolean");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(z[23], this.g);
    }

    static ab e(ConversationsFragment conversationsFragment) {
        return conversationsFragment.e;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    static View a(ConversationsFragment conversationsFragment, String str) {
        return conversationsFragment.a(str);
    }

    public void a(String str) {
        a(App.p, str);
    }

    static String b(ConversationsFragment conversationsFragment, String str) {
        conversationsFragment.k = str;
        return str;
    }

    static void d(int i) {
        b(i);
    }

    private void b(View view) {
        Animation animationSet = new AnimationSet(true);
        Animation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        int top = view.getTop();
        animationSet.setDuration(300);
        view.startAnimation(animationSet);
        animationSet.setAnimationListener(new amb(this, top));
    }

    public void a() {
        try {
            c();
            try {
                if (this.d == null) {
                    return;
                }
                if (this.d.getCount() == 0) {
                    d();
                }
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    private static int e() {
        return App.p.getSharedPreferences(z[8], 0).getInt(z[9], 0);
    }

    static int g() {
        return e();
    }

    void c(int i) {
        ((ho) getActivity()).a(i);
    }

    static String d(ConversationsFragment conversationsFragment) {
        return conversationsFragment.g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void f() {
        /*
        r7_this = this;
        r1 = 8;
        r0 = 0;
        r2 = com.whatsapp.v.j();	 Catch:{ ActivityNotFoundException -> 0x004a }
        r7.j = r2;	 Catch:{ ActivityNotFoundException -> 0x004a }
        r2 = r7.j;	 Catch:{ ActivityNotFoundException -> 0x004a }
        if (r2 <= 0) goto L_0x0036;
    L_0x000d:
        r2 = r7.h;	 Catch:{ ActivityNotFoundException -> 0x004c }
        r3 = 2131624013; // 0x7f0e004d float:1.8875194E38 double:1.0531621947E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ ActivityNotFoundException -> 0x004c }
        r5 = 0;
        r6 = r7.j;	 Catch:{ ActivityNotFoundException -> 0x004c }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ ActivityNotFoundException -> 0x004c }
        r4[r5] = r6;	 Catch:{ ActivityNotFoundException -> 0x004c }
        r3 = r7.getString(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x004c }
        r2.setText(r3);	 Catch:{ ActivityNotFoundException -> 0x004c }
        r2 = r7.h;	 Catch:{ ActivityNotFoundException -> 0x004c }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ ActivityNotFoundException -> 0x004c }
        r2 = r7.b;	 Catch:{ ActivityNotFoundException -> 0x004c }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ ActivityNotFoundException -> 0x004c }
        r2 = com.whatsapp.App.az;	 Catch:{ ActivityNotFoundException -> 0x004c }
        if (r2 == 0) goto L_0x0049;
    L_0x0036:
        r2 = r7.h;	 Catch:{ ActivityNotFoundException -> 0x004e }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ ActivityNotFoundException -> 0x004e }
        r2 = r7.b;	 Catch:{ ActivityNotFoundException -> 0x004e }
        r3 = e();	 Catch:{ ActivityNotFoundException -> 0x004e }
        r4 = 3;
        if (r3 >= r4) goto L_0x0050;
    L_0x0046:
        r2.setVisibility(r0);
    L_0x0049:
        return;
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r0 = r1;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.f():void");
    }

    protected void a(View view) {
        App.aJ.b(this.g, false);
    }

    protected void h() {
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.conversations_tip_row, this.i, false);
        this.i.addFooterView(inflate, null, true);
        this.b = (TextView) inflate.findViewById(R.id.conversations_row_tip_tv);
        inflate = getActivity().getLayoutInflater().inflate(R.layout.conversations_tip_row, this.i, false);
        inflate.setBackgroundResource(R.drawable.selector_orange_gradient);
        inflate.setOnClickListener(new wn(this));
        this.i.addFooterView(inflate, null, true);
        this.h = (TextView) inflate.findViewById(R.id.conversations_row_tip_tv);
    }

    static ArrayList i(ConversationsFragment conversationsFragment) {
        return conversationsFragment.f;
    }

    public void a(CharSequence charSequence) {
        this.d.getFilter().filter(charSequence);
    }

    static void b(ConversationsFragment conversationsFragment) {
        conversationsFragment.d();
    }

    protected ArrayList a() {
        return v.e();
    }

    public void onActivityCreated(Bundle bundle) {
        boolean z = true;
        y yVar = new y(z[12]);
        try {
            super.onActivityCreated(bundle);
            setHasOptionsMenu(true);
            if (this.e == null) {
                this.e = new ab();
                this.e.f = getString(R.string.group_sync_tap_retry);
                this.e.i = getString(R.string.group_created_failed);
                this.e.g = getString(R.string.group_creating);
                this.e.j = getString(R.string.conversations_most_recent_image);
                this.e.a = getString(R.string.conversations_most_recent_audio);
                this.e.h = getString(R.string.conversations_most_recent_voice);
                this.e.b = getString(R.string.conversations_most_recent_video);
                this.e.d = getString(R.string.conversations_most_recent_location);
                this.e.c = getString(R.string.conversations_most_recent_contact);
                this.e.e = getString(R.string.group_subject_changed_you_pronoun);
            }
            try {
                Log.i(z[13]);
                App.a5();
                App.b((anq) this);
                App.a((_2) this);
                this.f = a();
                this.i = getListView();
                ListView listView = this.i;
                if (VERSION.SDK_INT >= 11) {
                    z = false;
                }
                try {
                    listView.setFastScrollEnabled(z);
                    if (VERSION.SDK_INT < 11) {
                        this.i.setSelector(R.drawable.selector_orange_gradient);
                    }
                    try {
                        this.i.setScrollbarFadingEnabled(true);
                        h();
                        f();
                        this.i.setOnScrollListener(new a5t(this));
                        this.d = new __(this);
                        this.i.setAdapter(this.d);
                        this.i.setOnItemClickListener(new nn(this));
                        if (this.d.getCount() == 0) {
                            d();
                        }
                        try {
                            registerForContextMenu(this.i);
                            getView().findViewById(R.id.button_tell_a_friend).setOnClickListener(new qp(this));
                            getView().findViewById(R.id.search_in_contacts).setOnClickListener(new qe(this));
                            if (bundle != null) {
                                this.g = bundle.getString(z[11]);
                            }
                            yVar.c();
                        } catch (ActivityNotFoundException e) {
                            throw e;
                        }
                    } catch (ActivityNotFoundException e2) {
                        throw e2;
                    }
                } catch (ActivityNotFoundException e22) {
                    throw e22;
                }
            } catch (ActivityNotFoundException e222) {
                throw e222;
            }
        } catch (ActivityNotFoundException e2222) {
            throw e2222;
        }
    }

    public void d(String str) {
        a(App.p, str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
        r2_this = this;
        r0 = r2.d;	 Catch:{ ActivityNotFoundException -> 0x003d }
        if (r0 == 0) goto L_0x003c;
    L_0x0004:
        r0 = r2.d;	 Catch:{ ActivityNotFoundException -> 0x003f }
        r0 = com.whatsapp.__.a(r0);	 Catch:{ ActivityNotFoundException -> 0x003f }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ ActivityNotFoundException -> 0x003f }
        if (r0 == 0) goto L_0x001a;
    L_0x0010:
        r0 = r2.a();	 Catch:{ ActivityNotFoundException -> 0x0041 }
        r2.f = r0;	 Catch:{ ActivityNotFoundException -> 0x0041 }
        r0 = com.whatsapp.App.az;	 Catch:{ ActivityNotFoundException -> 0x0041 }
        if (r0 == 0) goto L_0x0029;
    L_0x001a:
        r0 = r2.d;	 Catch:{ ActivityNotFoundException -> 0x0041 }
        r0 = r0.getFilter();	 Catch:{ ActivityNotFoundException -> 0x0041 }
        r1 = r2.d;	 Catch:{ ActivityNotFoundException -> 0x0041 }
        r1 = com.whatsapp.__.a(r1);	 Catch:{ ActivityNotFoundException -> 0x0041 }
        r0.filter(r1);	 Catch:{ ActivityNotFoundException -> 0x0041 }
    L_0x0029:
        r2.f();	 Catch:{ ActivityNotFoundException -> 0x0043 }
        r0 = r2.d;	 Catch:{ ActivityNotFoundException -> 0x0043 }
        r0.notifyDataSetChanged();	 Catch:{ ActivityNotFoundException -> 0x0043 }
        r0 = r2.d;	 Catch:{ ActivityNotFoundException -> 0x0043 }
        r0 = r0.getCount();	 Catch:{ ActivityNotFoundException -> 0x0043 }
        if (r0 != 0) goto L_0x003c;
    L_0x0039:
        r2.d();	 Catch:{ ActivityNotFoundException -> 0x0043 }
    L_0x003c:
        return;
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationsFragment.b():void");
    }

    private void c() {
        try {
            if (this.d != null) {
                this.d.notifyDataSetChanged();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }
}
