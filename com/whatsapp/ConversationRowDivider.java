package com.whatsapp;

import android.content.Context;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import java.util.Vector;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ConversationRowDivider extends ConversationRow {
    private static final String[] L;
    private final DividerView J;
    OnClickListener K;

    static {
        String[] strArr = new String[4];
        String str = "')\u0007:\u0012\u0006.Z,\n\u0017tG(\u000e";
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
                        i3 = 103;
                        break;
                    case ay.f /*1*/:
                        i3 = 90;
                        break;
                    case ay.n /*2*/:
                        i3 = 41;
                        break;
                    case ay.p /*3*/:
                        i3 = 77;
                        break;
                    default:
                        i3 = 122;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "G0@)G";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "G)\u0014";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    L = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u00033_$\u001e\u0002(v?\u0015\u0010u[?G";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ConversationRowDivider(Context context, b bVar) {
        super(context, bVar);
        this.K = new vy(this);
        setClickable(false);
        setLongClickable(false);
        this.J = (DividerView) findViewById(R.id.info);
        b(bVar);
    }

    private void b(b bVar) {
        this.w = bVar;
        setClickable(false);
        this.J.setTextSize(a(getResources()));
        if (bVar.a == -1 && bVar.j == (byte) -1) {
            this.J.setText(App.p.getString(R.string.failed_to_load_message));
            return;
        }
        String c = c(this.h);
        CharSequence a = a5.a(c, getContext(), this.J.getPaint(), 1.4f);
        if (this.h.k == 1 || this.h.k == 11) {
            a = ConversationRowText.a(c, a8, a);
        }
        DividerView dividerView = this.J;
        if (a == null) {
            a = c;
        }
        dividerView.setText(a);
        if (!(App.P.h(this.h.F) || !bd.b(bVar.e.c) || this.h.k == 15 || this.h.k == 16)) {
            setClickable(true);
            this.J.setOnClickListener(this.K);
            this.J.setBackgroundResource(R.drawable.selector_orange_gradient);
        }
        setTag(bVar);
    }

    public static String c(b bVar) {
        m8 m8Var;
        String str;
        String[] strArr = null;
        if (TextUtils.isEmpty(bVar.F)) {
            m8Var = null;
            str = null;
        } else {
            m8 a = App.P.a(bVar.F);
            str = a.d();
            m8Var = a;
        }
        String d;
        Vector vector;
        switch ((int) bVar.k) {
            case ay.f /*1*/:
                if (bVar.f() != null) {
                    strArr = bVar.f().split("\n");
                }
                int lastIndexOf;
                if (strArr != null && strArr.length == 2 && (bVar.F == null || (strArr[0].endsWith(L[0]) && strArr[1].lastIndexOf("\"") > strArr[1].indexOf("\"")))) {
                    d = App.P.a(strArr[0]).d();
                    if (strArr[1].lastIndexOf("\"") <= strArr[1].indexOf("\"")) {
                        Log.e(L[1] + bVar.F + L[2] + strArr[0] + L[3] + strArr[1]);
                    }
                    return App.p.getString(R.string.group_subject_changed_by_name, new Object[]{d, strArr[1].substring(lastIndexOf + 1, r3)});
                } else if (App.P.h(bVar.F)) {
                    int indexOf = bVar.f().indexOf("\"");
                    lastIndexOf = bVar.f().lastIndexOf("\"");
                    if (indexOf == 0 && lastIndexOf == bVar.f().length() - 1 && indexOf != lastIndexOf) {
                        d = bVar.f().substring(indexOf + 1, lastIndexOf);
                        return App.p.getString(R.string.group_subject_changed_by_you, new Object[]{d});
                    }
                    return App.p.getString(R.string.group_subject_changed_by_you, new Object[]{bVar.f()});
                } else {
                    return App.p.getString(R.string.group_subject_changed_by_name, new Object[]{str, bVar.f()});
                }
            case aj.i /*4*/:
                if (m8.b(bVar.e.c)) {
                    return App.p.getString(R.string.list_recipient_added, new Object[]{str});
                } else if (App.P.h(bVar.F)) {
                    return App.p.getString(R.string.group_participant_added_you);
                } else {
                    return App.p.getString(R.string.group_participant_added_name, new Object[]{str});
                }
            case aV.r /*5*/:
                if (App.P.h(bVar.F)) {
                    return App.p.getString(R.string.group_participant_left_you);
                }
                return App.p.getString(R.string.group_participant_left_name, new Object[]{str});
            case aV.i /*6*/:
                if (bVar.F == null) {
                    return "";
                }
                if (App.P.h(bVar.F)) {
                    return bVar.f() == null ? App.p.getString(R.string.photo_removed_by_you) : App.p.getString(R.string.photo_changed_by_you);
                } else {
                    d = App.P.a(bVar.F).d();
                    if (bVar.f() == null) {
                        return App.p.getString(R.string.photo_removed_by, new Object[]{d});
                    }
                    return App.p.getString(R.string.photo_changed_by, new Object[]{d});
                }
            case a8.s /*7*/:
                if (m8.b(bVar.e.c)) {
                    return App.p.getString(R.string.list_recipient_removed, new Object[]{str});
                } else if (App.P.h(bVar.F)) {
                    return App.p.getString(R.string.group_participant_removed_you);
                } else {
                    return App.p.getString(R.string.group_participant_removed_name, new Object[]{str});
                }
            case a8.n /*8*/:
                return App.p.getString(R.string.cannot_send_to_group_not_member);
            case a6.D /*9*/:
                vector = (Vector) bVar.A;
                if (TextUtils.isEmpty(bVar.f())) {
                    return App.aX.a(R.plurals.you_created_list_unnamed, vector.size(), new Object[]{Integer.valueOf(vector.size())});
                }
                return App.aX.a(R.plurals.you_created_list, vector.size(), new Object[]{bVar.f(), Integer.valueOf(vector.size())});
            case a6.h /*10*/:
                boolean z;
                if (((String) bVar.A) != null) {
                    z = true;
                } else {
                    z = false;
                }
                Log.b(z);
                CharSequence toString = Character.toString('\u00a0');
                if (m8Var.h()) {
                    return App.p.getString(R.string.group_participant_changed_number_unknown_name, new Object[]{str.replace(" ", toString), m3.b(d).replace(" ", toString)});
                }
                return App.p.getString(R.string.group_participant_changed_number, new Object[]{str, m8Var.a().replace(" ", toString), m3.b(d).replace(" ", toString)});
            case a6.e /*11*/:
                if (App.P.h(bVar.F)) {
                    return App.p.getString(R.string.group_created_by_you, new Object[]{bVar.f()});
                }
                return App.p.getString(R.string.group_created_by_name, new Object[]{str, bVar.f()});
            case a6.s /*12*/:
                vector = (Vector) bVar.A;
                if (App.P.h(bVar.F)) {
                    return App.p.getString(R.string.group_participants_you_added_names, new Object[]{bd.a(vector)});
                } else if (str == null) {
                    if (vector.size() == 1 && App.P.h((String) vector.get(0))) {
                        return App.p.getString(R.string.group_participant_added_you);
                    }
                    return App.p.getString(R.string.group_participant_added_name, new Object[]{bd.a(vector)});
                } else if (vector.size() == 1 && App.P.h((String) vector.get(0))) {
                    return App.p.getString(R.string.group_participants_name_added_you, new Object[]{str});
                } else {
                    return App.p.getString(R.string.group_participants_name_added_names, new Object[]{str, bd.a(vector)});
                }
            case a6.z /*13*/:
                vector = (Vector) bVar.A;
                return App.p.getString(R.string.group_participant_left_name, new Object[]{bd.a(vector)});
            case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                vector = (Vector) bVar.A;
                if (App.P.h(bVar.F)) {
                    return App.p.getString(R.string.group_participants_you_removed_names, new Object[]{bd.a(vector)});
                } else if (str == null) {
                    if (vector.size() == 1 && App.P.h((String) vector.get(0))) {
                        return App.p.getString(R.string.group_participant_removed_you);
                    }
                    return App.p.getString(R.string.group_participant_removed_name, new Object[]{bd.a(vector)});
                } else if (vector.size() == 1 && App.P.h((String) vector.get(0))) {
                    return App.p.getString(R.string.group_participants_name_removed_you, new Object[]{str});
                } else {
                    return App.p.getString(R.string.group_participants_name_removed_names, new Object[]{str, bd.a(vector)});
                }
            case vk.SherlockTheme_actionModeBackground /*15*/:
                vector = (Vector) bVar.A;
                if (vector.size() == 1 && App.P.h((String) vector.get(0))) {
                    return App.p.getString(R.string.group_participant_promoted_you);
                }
                return App.aX.a(R.plurals.group_participant_promoted_names, vector.size(), new Object[]{bd.a(vector)});
            case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                vector = (Vector) bVar.A;
                if (vector.size() == 1 && App.P.h((String) vector.get(0))) {
                    return App.p.getString(R.string.group_participant_demoted_you);
                }
                return App.aX.a(R.plurals.group_participant_demoted_names, vector.size(), new Object[]{bd.a(vector)});
            case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                if (App.P.h(bVar.F)) {
                    return App.p.getString(R.string.group_ended_you);
                }
                return App.p.getString(R.string.group_ended_name, new Object[]{str});
            default:
                return null;
        }
    }

    public void a(b bVar, boolean z) {
        if (this.w != bVar || z) {
            this.w = bVar;
            this.h = bVar;
            b(bVar);
        }
        super.a(bVar, z);
    }

    protected int l() {
        return R.layout.conversation_divider_row;
    }

    protected int d() {
        return R.layout.conversation_divider_row;
    }

    public void g() {
        b(this.w);
        super.g();
    }
}
