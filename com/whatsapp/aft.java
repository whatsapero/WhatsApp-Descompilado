package com.whatsapp;

import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.bm;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class aft implements OnClickListener {
    private static final String[] z;
    final Conversation a;

    static {
        String[] strArr = new String[7];
        String str = "m\u001f!tx|\u0003.vta\u001e`aok\u0011;g2b\u001f.fxo\u0002#kx|_=gpa\u0006*jxo\u0014*p";
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
                        i3 = 14;
                        break;
                    case ay.f /*1*/:
                        i3 = 112;
                        break;
                    case ay.n /*2*/:
                        i3 = 79;
                        break;
                    case ay.p /*3*/:
                        i3 = 2;
                        break;
                    default:
                        i3 = 29;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "m\u001f!tx|\u0003.vta\u001e`nro\u0014*cob\u0019*p2f\u0015.fx|\u0013!v=";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "m\u001f!tx|\u0003.vta\u001e`nro\u0014*cob\u0019*p2|\u0015\"mkk\u0018*cyk\u0002o*sk\u0007r";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "m\u001f!tx|\u0003.vta\u001e`aok\u0011;g2b\u001f.fxo\u0002#kx|_'g|j\u0015=aszP";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\"P?pxxM";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "m\u001f!tx|\u0003.vta\u001e`nro\u0014*cob\u0019*p2`\u0005#n";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\"P6rr}M";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    aft(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        if (Conversation.S(this.a) == null) {
            Log.i(z[6]);
            return;
        }
        int e;
        int i;
        boolean z;
        int count = this.a.aS.getCursor().getCount();
        if (this.a.bd.getChildCount() > 1) {
            ConversationRow conversationRow = (ConversationRow) this.a.bd.getChildAt(1);
            int a = conversationRow.a();
            boolean z2 = conversationRow.n;
            e = conversationRow.e();
            i = a;
            z = z2;
        } else {
            e = 0;
            i = 0;
            z = false;
        }
        Conversation.g(this.a, true);
        int bottom = Conversation.S(this.a).getBottom();
        Cursor a2 = App.aJ.a(this.a.u, Conversation.e(this.a, true), null, Conversation.q(this.a));
        Conversation.a(this.a, a2);
        this.a.aS.changeCursor(a2);
        this.a.aS.getCursor().requery();
        boolean h = App.aJ.h(this.a.u);
        if (!(h || Conversation.S(this.a) == null)) {
            Conversation.S(this.a).setVisibility(8);
            this.a.bd.removeHeaderView(Conversation.S(this.a));
            Log.i(z[4] + this.a.bd.getHeaderViewsCount());
            Conversation.a(this.a, null);
            Log.i(z[0]);
            this.a.aS.notifyDataSetChanged();
        }
        int count2 = this.a.aS.getCursor().getCount();
        Conversation.b(this.a, count2 - count);
        if (count2 != 0 && count2 > count && Conversation.c(this.a) < count2) {
            int i2;
            b bVar = (b) this.a.aS.getItem(Conversation.c(this.a));
            b bVar2 = (b) this.a.aS.getItem(Conversation.c(this.a) - 1);
            boolean z3;
            if (bVar == null || bVar2 == null) {
                z3 = false;
            } else {
                z3 = bm.a(bVar2.D, bVar.D);
            }
            this.a.bd.setTranscriptMode(0);
            if (!(z && r5)) {
                i = 0;
            }
            if (Conversation.H(this.a) && bVar.e.b == bVar2.e.b && !bVar.e.b && bVar.j == bVar2.j && bVar.j == null && bVar.F != null && bVar2.F != null && bVar.F.equals(bVar2.F)) {
                i += e;
            }
            Conversation conversation = this.a;
            a = Conversation.c(this.a);
            if (!h || Conversation.c(this.a) >= count2 - 1) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            Conversation.b(conversation, i2 + a);
            this.a.bd.setSelectionFromTop(Conversation.c(this.a), bottom + i);
        } else if (h && Conversation.S(this.a) != null) {
            Conversation.S(this.a).setVisibility(8);
            this.a.bd.removeHeaderView(Conversation.S(this.a));
            Log.i(z[2] + this.a.bd.getHeaderViewsCount());
            Conversation.a(this.a, null);
            Log.i(z[3] + count2 + z[5] + count + z[1] + Conversation.c(this.a) + ")");
            this.a.aS.notifyDataSetChanged();
        }
    }
}
