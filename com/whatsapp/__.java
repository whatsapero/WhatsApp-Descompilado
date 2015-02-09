package com.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class __ extends BaseAdapter implements Filterable {
    private static final String[] z;
    private String a;
    private Filter b;
    final ConversationsFragment c;

    static {
        String[] strArr = new String[9];
        String str = "IW";
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
                        i3 = 105;
                        break;
                    case ay.f /*1*/:
                        i3 = 109;
                        break;
                    case ay.n /*2*/:
                        i3 = 1;
                        break;
                    case ay.p /*3*/:
                        i3 = 46;
                        break;
                    default:
                        i3 = 121;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\n\u0002oX\u001c\u001b\u001e`Z\u0010\u0006\u0003rq\u000b\u0006\u001a.C\u0010\u001a\u001eh@\u001e6\u001flZ&\u001a\u001fb\u0014";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "\u000b\u001fnO\u001d\n\frZ";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "\u0003\u0004e\u000e\u0014\u001c\u001eu\u000e\u0017\u0006\u0019!L\u001cI\bl^\r\u0010";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "SM";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0005\fxA\f\u001d2h@\u001f\u0005\fuK\u000b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u000e\u001fn[\t6\u0003nZ\u0010\n\bAZ\u001c\u0004\u001d";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u000e\u001fn[\t6\u0003nZ\u0010\n\bAZ\u001c\u0004\u001d";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u000b\u001fnO\u001d\n\frZ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private int a(m8 m8Var, b bVar) {
        try {
            try {
                if (bVar.e.b) {
                    switch (bVar.a) {
                        case aj.i /*4*/:
                            return R.drawable.msg_status_server_receive;
                        case aV.r /*5*/:
                            return R.drawable.msg_status_client_received;
                        case a8.n /*8*/:
                        case a6.z /*13*/:
                            return R.drawable.msg_status_client_read;
                        default:
                            return R.drawable.msg_status_gray_waiting;
                    }
                }
                try {
                    return m8Var.a == 0 ? R.drawable.msg_status_read : R.drawable.msg_status_unread;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isEmpty() {
        /*
        r2_this = this;
        r0 = 0;
        r1 = super.isEmpty();	 Catch:{ IllegalStateException -> 0x0019 }
        if (r1 == 0) goto L_0x0018;
    L_0x0007:
        r1 = r2.c;	 Catch:{ IllegalStateException -> 0x001b }
        r1 = com.whatsapp.ConversationsFragment.j(r1);	 Catch:{ IllegalStateException -> 0x001b }
        if (r1 == 0) goto L_0x0017;
    L_0x000f:
        r1 = r2.a;	 Catch:{ IllegalStateException -> 0x001d }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IllegalStateException -> 0x001d }
        if (r1 != 0) goto L_0x0018;
    L_0x0017:
        r0 = 1;
    L_0x0018:
        return r0;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.__.isEmpty():boolean");
    }

    public Filter getFilter() {
        return this.b;
    }

    public long getItemId(int i) {
        return (long) ((String) ConversationsFragment.i(this.c).get(i)).hashCode();
    }

    static String a(__ __, String str) {
        __.a = str;
        return str;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        boolean z;
        _f _fVar;
        View view2;
        LayoutInflater layoutInflater;
        _f _fVar2;
        View a;
        _f _fVar3;
        boolean z2 = true;
        int i2 = App.az;
        String a2 = a(i);
        m8 d = App.P.d(a2);
        if (d == null) {
            d = new m8(a2);
        }
        boolean contains = d.e.contains(z[7]);
        if (view != null) {
            z = false;
        } else if (i2 != 0) {
            z = true;
        } else {
            z = true;
            _fVar = null;
            view2 = null;
            if (z) {
                layoutInflater = (LayoutInflater) this.c.getActivity().getSystemService(z[6]);
                _fVar2 = new _f();
                if (contains) {
                    a = b7.a(layoutInflater, R.layout.conversations_notice_row, viewGroup, false);
                    _fVar2.a = (TextView) a.findViewById(R.id.conversations_row_notice);
                    _fVar2.c = a.findViewById(R.id.progressbar_small);
                    if (i2 == 0) {
                        _fVar3 = _fVar2;
                        view2 = a;
                    }
                }
                View a3 = b7.a(layoutInflater, R.layout.conversations_row, viewGroup, false);
                _fVar2.b = (TextView) a3.findViewById(R.id.conversations_row_contact_name);
                _fVar2.c = a3.findViewById(R.id.progressbar_small);
                _fVar2.d = (ImageView) a3.findViewById(R.id.contact_photo);
                _fVar2.i = a3.findViewById(R.id.contact_selector);
                _fVar2.h = (TextView) a3.findViewById(R.id.single_msg_tv);
                _fVar2.l = (TextView) a3.findViewById(R.id.msg_from_tv);
                _fVar2.k = (TextView) a3.findViewById(R.id.conversations_row_message_count);
                _fVar2.j = (ImageView) a3.findViewById(R.id.status_indicator);
                _fVar2.m = (ImageView) a3.findViewById(R.id.media_indicator);
                _fVar2.n = (ImageView) a3.findViewById(R.id.mute_indicator);
                _fVar2.e = (ImageView) a3.findViewById(R.id.location_indicator);
                _fVar2.o = a3.findViewById(R.id.archived_indicator);
                _fVar2.f = (TextView) a3.findViewById(R.id.conversations_row_date);
                _fVar3 = _fVar2;
                view2 = a3;
            } else {
                _fVar3 = _fVar;
            }
            _fVar3.g = d.e;
            view2.setTag(_fVar3);
            a(this.c.getActivity(), view2, d, contains, _fVar3);
            return view2;
        }
        _fVar = (_f) view.getTag();
        if (contains == _fVar.g.contains(z[8])) {
            z2 = z;
        } else if (i2 == 0) {
            z = true;
            view2 = null;
            if (z) {
                _fVar3 = _fVar;
            } else {
                layoutInflater = (LayoutInflater) this.c.getActivity().getSystemService(z[6]);
                _fVar2 = new _f();
                if (contains) {
                    a = b7.a(layoutInflater, R.layout.conversations_notice_row, viewGroup, false);
                    _fVar2.a = (TextView) a.findViewById(R.id.conversations_row_notice);
                    _fVar2.c = a.findViewById(R.id.progressbar_small);
                    if (i2 == 0) {
                        _fVar3 = _fVar2;
                        view2 = a;
                    }
                }
                View a32 = b7.a(layoutInflater, R.layout.conversations_row, viewGroup, false);
                _fVar2.b = (TextView) a32.findViewById(R.id.conversations_row_contact_name);
                _fVar2.c = a32.findViewById(R.id.progressbar_small);
                _fVar2.d = (ImageView) a32.findViewById(R.id.contact_photo);
                _fVar2.i = a32.findViewById(R.id.contact_selector);
                _fVar2.h = (TextView) a32.findViewById(R.id.single_msg_tv);
                _fVar2.l = (TextView) a32.findViewById(R.id.msg_from_tv);
                _fVar2.k = (TextView) a32.findViewById(R.id.conversations_row_message_count);
                _fVar2.j = (ImageView) a32.findViewById(R.id.status_indicator);
                _fVar2.m = (ImageView) a32.findViewById(R.id.media_indicator);
                _fVar2.n = (ImageView) a32.findViewById(R.id.mute_indicator);
                _fVar2.e = (ImageView) a32.findViewById(R.id.location_indicator);
                _fVar2.o = a32.findViewById(R.id.archived_indicator);
                _fVar2.f = (TextView) a32.findViewById(R.id.conversations_row_date);
                _fVar3 = _fVar2;
                view2 = a32;
            }
            _fVar3.g = d.e;
            view2.setTag(_fVar3);
            a(this.c.getActivity(), view2, d, contains, _fVar3);
            return view2;
        }
        z = z2;
        view2 = view;
        if (z) {
            layoutInflater = (LayoutInflater) this.c.getActivity().getSystemService(z[6]);
            _fVar2 = new _f();
            if (contains) {
                a = b7.a(layoutInflater, R.layout.conversations_notice_row, viewGroup, false);
                _fVar2.a = (TextView) a.findViewById(R.id.conversations_row_notice);
                _fVar2.c = a.findViewById(R.id.progressbar_small);
                if (i2 == 0) {
                    _fVar3 = _fVar2;
                    view2 = a;
                }
            }
            View a322 = b7.a(layoutInflater, R.layout.conversations_row, viewGroup, false);
            _fVar2.b = (TextView) a322.findViewById(R.id.conversations_row_contact_name);
            _fVar2.c = a322.findViewById(R.id.progressbar_small);
            _fVar2.d = (ImageView) a322.findViewById(R.id.contact_photo);
            _fVar2.i = a322.findViewById(R.id.contact_selector);
            _fVar2.h = (TextView) a322.findViewById(R.id.single_msg_tv);
            _fVar2.l = (TextView) a322.findViewById(R.id.msg_from_tv);
            _fVar2.k = (TextView) a322.findViewById(R.id.conversations_row_message_count);
            _fVar2.j = (ImageView) a322.findViewById(R.id.status_indicator);
            _fVar2.m = (ImageView) a322.findViewById(R.id.media_indicator);
            _fVar2.n = (ImageView) a322.findViewById(R.id.mute_indicator);
            _fVar2.e = (ImageView) a322.findViewById(R.id.location_indicator);
            _fVar2.o = a322.findViewById(R.id.archived_indicator);
            _fVar2.f = (TextView) a322.findViewById(R.id.conversations_row_date);
            _fVar3 = _fVar2;
            view2 = a322;
        } else {
            _fVar3 = _fVar;
        }
        _fVar3.g = d.e;
        view2.setTag(_fVar3);
        a(this.c.getActivity(), view2, d, contains, _fVar3);
        return view2;
    }

    public String a(int i) {
        return (String) ConversationsFragment.i(this.c).get(i);
    }

    static String a(__ __) {
        return __.a;
    }

    public Object getItem(int i) {
        return a(i);
    }

    public boolean hasStableIds() {
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r14, android.view.View r15, com.whatsapp.m8 r16, boolean r17, com.whatsapp._f r18) {
        /*
        r13_this = this;
        r5 = com.whatsapp.App.az;
        if (r17 == 0) goto L_0x0068;
    L_0x0004:
        r2 = com.whatsapp.App.aJ;
        r0 = r16;
        r3 = r0.e;
        r2 = r2.B(r3);
        r0 = r18;
        r3 = r0.a;	 Catch:{ IllegalStateException -> 0x0062 }
        r4 = r13.c;	 Catch:{ IllegalStateException -> 0x0062 }
        r4 = com.whatsapp.ConversationsFragment.e(r4);	 Catch:{ IllegalStateException -> 0x0062 }
        r4 = r4.f;	 Catch:{ IllegalStateException -> 0x0062 }
        r3.setText(r4);	 Catch:{ IllegalStateException -> 0x0062 }
        if (r2 == 0) goto L_0x0027;
    L_0x001f:
        r2 = r2.k;	 Catch:{ IllegalStateException -> 0x0064 }
        r6 = -2;
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r2 != 0) goto L_0x0045;
    L_0x0027:
        r0 = r18;
        r2 = r0.a;	 Catch:{ IllegalStateException -> 0x0066 }
        r3 = r13.c;	 Catch:{ IllegalStateException -> 0x0066 }
        r3 = r3.getResources();	 Catch:{ IllegalStateException -> 0x0066 }
        r4 = 2131296300; // 0x7f09002c float:1.8210513E38 double:1.053000283E-314;
        r3 = r3.getColor(r4);	 Catch:{ IllegalStateException -> 0x0066 }
        r2.setTextColor(r3);	 Catch:{ IllegalStateException -> 0x0066 }
        r0 = r18;
        r2 = r0.c;	 Catch:{ IllegalStateException -> 0x0066 }
        r3 = 4;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0066 }
        if (r5 == 0) goto L_0x0061;
    L_0x0045:
        r0 = r18;
        r2 = r0.a;	 Catch:{ IllegalStateException -> 0x0066 }
        r3 = r13.c;	 Catch:{ IllegalStateException -> 0x0066 }
        r3 = r3.getResources();	 Catch:{ IllegalStateException -> 0x0066 }
        r4 = 2131296285; // 0x7f09001d float:1.8210482E38 double:1.0530002755E-314;
        r3 = r3.getColor(r4);	 Catch:{ IllegalStateException -> 0x0066 }
        r2.setTextColor(r3);	 Catch:{ IllegalStateException -> 0x0066 }
        r0 = r18;
        r2 = r0.c;	 Catch:{ IllegalStateException -> 0x0066 }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0066 }
    L_0x0061:
        return;
    L_0x0062:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0064 }
    L_0x0064:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0066 }
    L_0x0066:
        r2 = move-exception;
        throw r2;
    L_0x0068:
        r0 = r16;
        r2 = r0.e;	 Catch:{ IllegalStateException -> 0x007d }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ IllegalStateException -> 0x007d }
        if (r2 == 0) goto L_0x007f;
    L_0x0072:
        r2 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x007d }
        r3 = z;	 Catch:{ IllegalStateException -> 0x007d }
        r4 = 4;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x007d }
        r2.<init>(r3);	 Catch:{ IllegalStateException -> 0x007d }
        throw r2;	 Catch:{ IllegalStateException -> 0x007d }
    L_0x007d:
        r2 = move-exception;
        throw r2;
    L_0x007f:
        r2 = r13.c;	 Catch:{ IllegalStateException -> 0x07b9 }
        r2 = com.whatsapp.ConversationsFragment.h(r2);	 Catch:{ IllegalStateException -> 0x07b9 }
        r0 = r18;
        r3 = r0.d;	 Catch:{ IllegalStateException -> 0x07b9 }
        r0 = r16;
        r2.b(r0, r3);	 Catch:{ IllegalStateException -> 0x07b9 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x07b9 }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x07b9 }
        r0 = r16;
        r3 = r0.e;	 Catch:{ IllegalStateException -> 0x07b9 }
        r2 = r2.equals(r3);	 Catch:{ IllegalStateException -> 0x07b9 }
        if (r2 != 0) goto L_0x00c6;
    L_0x009d:
        r2 = r16.b();	 Catch:{ IllegalStateException -> 0x07bb }
        if (r2 != 0) goto L_0x00c6;
    L_0x00a3:
        r2 = com.whatsapp.ge.n;	 Catch:{ IllegalStateException -> 0x07bb }
        if (r2 == 0) goto L_0x00c6;
    L_0x00a7:
        r0 = r18;
        r2 = r0.d;
        r3 = 1;
        r2.setEnabled(r3);
        r2 = new com.whatsapp.qo;
        r0 = r16;
        r2.<init>(r13, r0);
        r0 = r18;
        r3 = r0.i;	 Catch:{ IllegalStateException -> 0x07bd }
        r3.setOnClickListener(r2);	 Catch:{ IllegalStateException -> 0x07bd }
        r0 = r18;
        r3 = r0.d;	 Catch:{ IllegalStateException -> 0x07bd }
        r3.setOnClickListener(r2);	 Catch:{ IllegalStateException -> 0x07bd }
        if (r5 == 0) goto L_0x00f2;
    L_0x00c6:
        r0 = r18;
        r2 = r0.d;	 Catch:{ IllegalStateException -> 0x07bf }
        r3 = 0;
        r2.setEnabled(r3);	 Catch:{ IllegalStateException -> 0x07bf }
        r0 = r18;
        r2 = r0.i;	 Catch:{ IllegalStateException -> 0x07bf }
        r3 = 0;
        r2.setOnClickListener(r3);	 Catch:{ IllegalStateException -> 0x07bf }
        r0 = r18;
        r2 = r0.d;	 Catch:{ IllegalStateException -> 0x07bf }
        r3 = 0;
        r2.setOnClickListener(r3);	 Catch:{ IllegalStateException -> 0x07bf }
        r2 = com.whatsapp.ge.n;	 Catch:{ IllegalStateException -> 0x07bf }
        if (r2 != 0) goto L_0x00f2;
    L_0x00e2:
        r0 = r18;
        r2 = r0.i;	 Catch:{ IllegalStateException -> 0x07bf }
        r3 = 0;
        r2.setClickable(r3);	 Catch:{ IllegalStateException -> 0x07bf }
        r0 = r18;
        r2 = r0.d;	 Catch:{ IllegalStateException -> 0x07bf }
        r3 = 0;
        r2.setClickable(r3);	 Catch:{ IllegalStateException -> 0x07bf }
    L_0x00f2:
        r0 = r18;
        r2 = r0.h;	 Catch:{ IllegalStateException -> 0x07c1 }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x07c1 }
        r0 = r18;
        r2 = r0.l;	 Catch:{ IllegalStateException -> 0x07c1 }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x07c1 }
        r0 = r18;
        r2 = r0.f;	 Catch:{ IllegalStateException -> 0x07c1 }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x07c1 }
        r0 = r18;
        r2 = r0.k;	 Catch:{ IllegalStateException -> 0x07c1 }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x07c1 }
        r0 = r18;
        r2 = r0.j;	 Catch:{ IllegalStateException -> 0x07c1 }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x07c1 }
        r0 = r18;
        r2 = r0.m;	 Catch:{ IllegalStateException -> 0x07c1 }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x07c1 }
        r0 = r18;
        r2 = r0.b;	 Catch:{ IllegalStateException -> 0x07c1 }
        r3 = 0;
        r4 = 0;
        r6 = 0;
        r7 = 0;
        r2.setPadding(r3, r4, r6, r7);	 Catch:{ IllegalStateException -> 0x07c1 }
        r2 = r16.l();	 Catch:{ IllegalStateException -> 0x07c1 }
        if (r2 == 0) goto L_0x0147;
    L_0x0133:
        r0 = r16;
        r2 = r0.N;	 Catch:{ IllegalStateException -> 0x07c1 }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ IllegalStateException -> 0x07c1 }
        if (r2 == 0) goto L_0x0147;
    L_0x013d:
        r0 = r16;
        r2 = r0.e;
        r2 = com.whatsapp.bd.h(r2);
        if (r5 == 0) goto L_0x014d;
    L_0x0147:
        r0 = r16;
        r2 = r0.a(r14);
    L_0x014d:
        r3 = r13.c;
        r3 = r3.getActivity();
        r3 = r3.getBaseContext();
        r0 = r18;
        r4 = r0.b;
        r4 = r4.getPaint();
        r3 = com.whatsapp.util.a5.a(r2, r3, r4);
        r4 = r13.a;
        r4 = android.text.TextUtils.isEmpty(r4);
        if (r4 != 0) goto L_0x01ee;
    L_0x016b:
        r4 = com.whatsapp.util.a5.b(r2);
        r4 = r4.toLowerCase();
        r6 = r13.a;	 Catch:{ IllegalStateException -> 0x07c3 }
        r6 = r6.toLowerCase();	 Catch:{ IllegalStateException -> 0x07c3 }
        r6 = r4.startsWith(r6);	 Catch:{ IllegalStateException -> 0x07c3 }
        if (r6 == 0) goto L_0x01a6;
    L_0x017f:
        if (r3 != 0) goto L_0x0186;
    L_0x0181:
        r3 = new android.text.SpannableStringBuilder;
        r3.<init>(r2);
    L_0x0186:
        r6 = new android.text.style.ForegroundColorSpan;
        r7 = r13.c;
        r7 = r7.getResources();
        r8 = 2131296306; // 0x7f090032 float:1.8210525E38 double:1.053000286E-314;
        r7 = r7.getColor(r8);
        r6.<init>(r7);
        r7 = 0;
        r8 = r13.a;
        r8 = r8.length();
        r9 = 33;
        r3.setSpan(r6, r7, r8, r9);
        if (r5 == 0) goto L_0x01ee;
    L_0x01a6:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = " ";
        r6 = r6.append(r7);
        r7 = r13.a;
        r7 = r7.toLowerCase();
        r6 = r6.append(r7);
        r6 = r6.toString();
        r4 = r4.indexOf(r6);
        if (r4 <= 0) goto L_0x01ee;
    L_0x01c5:
        if (r3 != 0) goto L_0x01cc;
    L_0x01c7:
        r3 = new android.text.SpannableStringBuilder;
        r3.<init>(r2);
    L_0x01cc:
        r6 = new android.text.style.ForegroundColorSpan;
        r7 = r13.c;
        r7 = r7.getResources();
        r8 = 2131296306; // 0x7f090032 float:1.8210525E38 double:1.053000286E-314;
        r7 = r7.getColor(r8);
        r6.<init>(r7);
        r7 = r4 + 1;
        r4 = r4 + 1;
        r8 = r13.a;
        r8 = r8.length();
        r4 = r4 + r8;
        r8 = 33;
        r3.setSpan(r6, r7, r4, r8);
    L_0x01ee:
        r0 = r18;
        r4 = r0.b;	 Catch:{ IllegalStateException -> 0x07c5 }
        if (r3 != 0) goto L_0x07c7;
    L_0x01f4:
        r4.setText(r2);	 Catch:{ IllegalStateException -> 0x07ca }
        r0 = r16;
        r2 = r0.a;	 Catch:{ IllegalStateException -> 0x07ca }
        if (r2 <= 0) goto L_0x0216;
    L_0x01fd:
        r0 = r18;
        r2 = r0.k;	 Catch:{ IllegalStateException -> 0x07cc }
        r0 = r16;
        r3 = r0.a;	 Catch:{ IllegalStateException -> 0x07cc }
        r3 = java.lang.Integer.toString(r3);	 Catch:{ IllegalStateException -> 0x07cc }
        r2.setText(r3);	 Catch:{ IllegalStateException -> 0x07cc }
        r0 = r18;
        r2 = r0.k;	 Catch:{ IllegalStateException -> 0x07cc }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x07cc }
        if (r5 == 0) goto L_0x021f;
    L_0x0216:
        r0 = r18;
        r2 = r0.k;	 Catch:{ IllegalStateException -> 0x07cc }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x07cc }
    L_0x021f:
        r2 = com.whatsapp.App.aJ;
        r0 = r16;
        r3 = r0.e;
        r6 = r2.B(r3);
        r3 = "";
        r2 = "";
        if (r6 == 0) goto L_0x0264;
    L_0x022f:
        r4 = r6.j;	 Catch:{ IllegalStateException -> 0x07ce }
        if (r4 != 0) goto L_0x0264;
    L_0x0233:
        r8 = r6.k;	 Catch:{ IllegalStateException -> 0x07d0 }
        r10 = 2;
        r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x0243;
    L_0x023b:
        r8 = r6.k;	 Catch:{ IllegalStateException -> 0x07d2 }
        r10 = 3;
        r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r4 != 0) goto L_0x0264;
    L_0x0243:
        r0 = r18;
        r4 = r0.b;	 Catch:{ IllegalStateException -> 0x07d4 }
        r7 = r13.c;	 Catch:{ IllegalStateException -> 0x07d4 }
        r7 = r7.getResources();	 Catch:{ IllegalStateException -> 0x07d4 }
        r8 = 2131296285; // 0x7f09001d float:1.8210482E38 double:1.0530002755E-314;
        r7 = r7.getColor(r8);	 Catch:{ IllegalStateException -> 0x07d4 }
        r4.setTextColor(r7);	 Catch:{ IllegalStateException -> 0x07d4 }
        r0 = r18;
        r4 = r0.b;	 Catch:{ IllegalStateException -> 0x07d4 }
        r7 = r6.f();	 Catch:{ IllegalStateException -> 0x07d4 }
        r4.setText(r7);	 Catch:{ IllegalStateException -> 0x07d4 }
        if (r5 == 0) goto L_0x0278;
    L_0x0264:
        r0 = r18;
        r4 = r0.b;	 Catch:{ IllegalStateException -> 0x07d4 }
        r7 = r13.c;	 Catch:{ IllegalStateException -> 0x07d4 }
        r7 = r7.getResources();	 Catch:{ IllegalStateException -> 0x07d4 }
        r8 = 2131296268; // 0x7f09000c float:1.8210448E38 double:1.053000267E-314;
        r7 = r7.getColor(r8);	 Catch:{ IllegalStateException -> 0x07d4 }
        r4.setTextColor(r7);	 Catch:{ IllegalStateException -> 0x07d4 }
    L_0x0278:
        r0 = r18;
        r4 = r0.c;
        r7 = 8;
        r4.setVisibility(r7);
        r0 = r18;
        r4 = r0.j;
        r7 = 0;
        r4.setVisibility(r7);
        r0 = r18;
        r4 = r0.m;
        r7 = 8;
        r4.setVisibility(r7);
        if (r6 == 0) goto L_0x04c7;
    L_0x0294:
        r4 = r6.j;
        if (r4 != 0) goto L_0x02b8;
    L_0x0298:
        r2 = r6.a;	 Catch:{ IllegalStateException -> 0x07d6 }
        r3 = 6;
        if (r2 == r3) goto L_0x02a3;
    L_0x029d:
        r2 = r6.f();
        if (r5 == 0) goto L_0x046a;
    L_0x02a3:
        r2 = r6.k;	 Catch:{ IllegalStateException -> 0x07d8 }
        r2 = (int) r2;
        switch(r2) {
            case 2: goto L_0x07ed;
            case 3: goto L_0x07da;
            default: goto L_0x02a9;
        };
    L_0x02a9:
        r2 = com.whatsapp.ConversationRowDivider.c(r6);
    L_0x02ad:
        r0 = r18;
        r3 = r0.j;	 Catch:{ IllegalStateException -> 0x0801 }
        r7 = 8;
        r3.setVisibility(r7);	 Catch:{ IllegalStateException -> 0x0801 }
        if (r5 == 0) goto L_0x046a;
    L_0x02b8:
        r2 = 1;
        if (r4 != r2) goto L_0x02fb;
    L_0x02bb:
        r0 = r18;
        r2 = r0.m;	 Catch:{ IllegalStateException -> 0x0805 }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0805 }
        r2 = r6.e;	 Catch:{ IllegalStateException -> 0x0805 }
        r2 = r2.b;	 Catch:{ IllegalStateException -> 0x0805 }
        if (r2 != 0) goto L_0x02db;
    L_0x02c9:
        r0 = r16;
        r2 = r0.a;	 Catch:{ IllegalStateException -> 0x0807 }
        if (r2 <= 0) goto L_0x02db;
    L_0x02cf:
        r0 = r18;
        r2 = r0.m;	 Catch:{ IllegalStateException -> 0x0809 }
        r3 = 2130837777; // 0x7f020111 float:1.7280518E38 double:1.0527737425E-314;
        r2.setImageResource(r3);	 Catch:{ IllegalStateException -> 0x0809 }
        if (r5 == 0) goto L_0x02e5;
    L_0x02db:
        r0 = r18;
        r2 = r0.m;	 Catch:{ IllegalStateException -> 0x0809 }
        r3 = 2130837776; // 0x7f020110 float:1.7280516E38 double:1.052773742E-314;
        r2.setImageResource(r3);	 Catch:{ IllegalStateException -> 0x0809 }
    L_0x02e5:
        r2 = r6.v;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 == 0) goto L_0x02f7;
    L_0x02ed:
        r2 = r13.c;
        r2 = com.whatsapp.ConversationsFragment.e(r2);
        r2 = r2.j;
        if (r5 == 0) goto L_0x046a;
    L_0x02f7:
        r2 = r6.v;
        if (r5 == 0) goto L_0x046a;
    L_0x02fb:
        r2 = 2;
        if (r4 != r2) goto L_0x0372;
    L_0x02fe:
        r2 = r6.w;	 Catch:{ IllegalStateException -> 0x080b }
        r3 = 1;
        if (r2 != r3) goto L_0x0368;
    L_0x0303:
        r2 = r6.p;	 Catch:{ IllegalStateException -> 0x080b }
        if (r2 == 0) goto L_0x0310;
    L_0x0307:
        r2 = r6.p;
        r2 = (long) r2;
        r2 = android.text.format.DateUtils.formatElapsedTime(r2);
        if (r5 == 0) goto L_0x0318;
    L_0x0310:
        r2 = r13.c;
        r2 = com.whatsapp.ConversationsFragment.e(r2);
        r2 = r2.h;
    L_0x0318:
        r0 = r18;
        r3 = r0.m;	 Catch:{ IllegalStateException -> 0x080d }
        r7 = 0;
        r3.setVisibility(r7);	 Catch:{ IllegalStateException -> 0x080d }
        r3 = r6.e;	 Catch:{ IllegalStateException -> 0x080d }
        r3 = r3.b;	 Catch:{ IllegalStateException -> 0x080d }
        if (r3 == 0) goto L_0x0344;
    L_0x0326:
        r3 = r6.a;	 Catch:{ IllegalStateException -> 0x080f }
        r7 = 8;
        if (r3 != r7) goto L_0x0338;
    L_0x032c:
        r0 = r18;
        r3 = r0.m;	 Catch:{ IllegalStateException -> 0x0811 }
        r7 = 2130837780; // 0x7f020114 float:1.7280524E38 double:1.052773744E-314;
        r3.setImageResource(r7);	 Catch:{ IllegalStateException -> 0x0811 }
        if (r5 == 0) goto L_0x046a;
    L_0x0338:
        r0 = r18;
        r3 = r0.m;	 Catch:{ IllegalStateException -> 0x0813 }
        r7 = 2130837778; // 0x7f020112 float:1.728052E38 double:1.052773743E-314;
        r3.setImageResource(r7);	 Catch:{ IllegalStateException -> 0x0813 }
        if (r5 == 0) goto L_0x046a;
    L_0x0344:
        r3 = r6.a;	 Catch:{ IllegalStateException -> 0x0815 }
        r7 = 9;
        if (r3 == r7) goto L_0x0350;
    L_0x034a:
        r3 = r6.a;	 Catch:{ IllegalStateException -> 0x0817 }
        r7 = 10;
        if (r3 != r7) goto L_0x035c;
    L_0x0350:
        r0 = r18;
        r3 = r0.m;	 Catch:{ IllegalStateException -> 0x0819 }
        r7 = 2130837780; // 0x7f020114 float:1.7280524E38 double:1.052773744E-314;
        r3.setImageResource(r7);	 Catch:{ IllegalStateException -> 0x0819 }
        if (r5 == 0) goto L_0x046a;
    L_0x035c:
        r0 = r18;
        r3 = r0.m;	 Catch:{ IllegalStateException -> 0x0819 }
        r7 = 2130837779; // 0x7f020113 float:1.7280522E38 double:1.0527737435E-314;
        r3.setImageResource(r7);	 Catch:{ IllegalStateException -> 0x0819 }
        if (r5 == 0) goto L_0x046a;
    L_0x0368:
        r2 = r13.c;
        r2 = com.whatsapp.ConversationsFragment.e(r2);
        r2 = r2.a;
        if (r5 == 0) goto L_0x046a;
    L_0x0372:
        r2 = 3;
        if (r4 != r2) goto L_0x03bd;
    L_0x0375:
        r0 = r18;
        r2 = r0.m;	 Catch:{ IllegalStateException -> 0x081b }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x081b }
        r0 = r18;
        r2 = r0.m;	 Catch:{ IllegalStateException -> 0x081b }
        r3 = 0;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x081b }
        r2 = r6.e;	 Catch:{ IllegalStateException -> 0x081b }
        r2 = r2.b;	 Catch:{ IllegalStateException -> 0x081b }
        if (r2 != 0) goto L_0x039d;
    L_0x038b:
        r0 = r16;
        r2 = r0.a;	 Catch:{ IllegalStateException -> 0x081d }
        if (r2 <= 0) goto L_0x039d;
    L_0x0391:
        r0 = r18;
        r2 = r0.m;	 Catch:{ IllegalStateException -> 0x081f }
        r3 = 2130837782; // 0x7f020116 float:1.7280528E38 double:1.052773745E-314;
        r2.setImageResource(r3);	 Catch:{ IllegalStateException -> 0x081f }
        if (r5 == 0) goto L_0x03a7;
    L_0x039d:
        r0 = r18;
        r2 = r0.m;	 Catch:{ IllegalStateException -> 0x081f }
        r3 = 2130837781; // 0x7f020115 float:1.7280526E38 double:1.0527737445E-314;
        r2.setImageResource(r3);	 Catch:{ IllegalStateException -> 0x081f }
    L_0x03a7:
        r2 = r6.v;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 == 0) goto L_0x03b9;
    L_0x03af:
        r2 = r13.c;
        r2 = com.whatsapp.ConversationsFragment.e(r2);
        r2 = r2.b;
        if (r5 == 0) goto L_0x046a;
    L_0x03b9:
        r2 = r6.v;
        if (r5 == 0) goto L_0x046a;
    L_0x03bd:
        r2 = 4;
        if (r4 != r2) goto L_0x03ca;
    L_0x03c0:
        r2 = r13.c;
        r2 = com.whatsapp.ConversationsFragment.e(r2);
        r2 = r2.c;
        if (r5 == 0) goto L_0x046a;
    L_0x03ca:
        r2 = 5;
        if (r4 != r2) goto L_0x0412;
    L_0x03cd:
        r2 = r13.c;
        r2 = com.whatsapp.ConversationsFragment.e(r2);
        r2 = r2.d;
        r3 = r6.H;	 Catch:{ IllegalStateException -> 0x0821 }
        if (r3 == 0) goto L_0x03f8;
    L_0x03d9:
        r3 = r6.H;	 Catch:{ IllegalStateException -> 0x0821 }
        r3 = r3.length();	 Catch:{ IllegalStateException -> 0x0821 }
        if (r3 <= 0) goto L_0x03f8;
    L_0x03e1:
        r3 = r6.H;
        r7 = "\n";
        r3 = r3.split(r7);
        r7 = r3.length;	 Catch:{ IllegalStateException -> 0x0823 }
        if (r7 <= 0) goto L_0x03f8;
    L_0x03ec:
        r7 = 0;
        r7 = r3[r7];	 Catch:{ IllegalStateException -> 0x0823 }
        r7 = r7.length();	 Catch:{ IllegalStateException -> 0x0823 }
        if (r7 <= 0) goto L_0x03f8;
    L_0x03f5:
        r2 = 0;
        r2 = r3[r2];
    L_0x03f8:
        r0 = r18;
        r3 = r0.m;	 Catch:{ IllegalStateException -> 0x0825 }
        r7 = 0;
        r3.setVisibility(r7);	 Catch:{ IllegalStateException -> 0x0825 }
        r0 = r18;
        r7 = r0.m;	 Catch:{ IllegalStateException -> 0x0825 }
        r0 = r16;
        r3 = r0.a;	 Catch:{ IllegalStateException -> 0x0825 }
        if (r3 <= 0) goto L_0x0827;
    L_0x040a:
        r3 = 2130838894; // 0x7f02056e float:1.7282783E38 double:1.0527742943E-314;
    L_0x040d:
        r7.setImageResource(r3);	 Catch:{ IllegalStateException -> 0x082c }
        if (r5 == 0) goto L_0x046a;
    L_0x0412:
        r2 = 8;
        if (r4 != r2) goto L_0x0461;
    L_0x0416:
        r2 = r6.p;	 Catch:{ IllegalStateException -> 0x0830 }
        if (r2 != 0) goto L_0x042b;
    L_0x041a:
        r2 = r6.e;	 Catch:{ IllegalStateException -> 0x0830 }
        r2 = r2.b;	 Catch:{ IllegalStateException -> 0x0830 }
        if (r2 != 0) goto L_0x042b;
    L_0x0420:
        r2 = r13.c;
        r3 = 2131624184; // 0x7f0e00f8 float:1.887554E38 double:1.053162279E-314;
        r2 = r2.getString(r3);
        if (r5 == 0) goto L_0x046a;
    L_0x042b:
        r2 = r6.e;	 Catch:{ IllegalStateException -> 0x0832 }
        r2 = r2.b;	 Catch:{ IllegalStateException -> 0x0832 }
        if (r2 == 0) goto L_0x0449;
    L_0x0431:
        r2 = r13.c;
        r3 = 2131624185; // 0x7f0e00f9 float:1.8875543E38 double:1.0531622797E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r7 = 0;
        r8 = r6.p;
        r8 = (long) r8;
        r8 = android.text.format.DateUtils.formatElapsedTime(r8);
        r4[r7] = r8;
        r2 = r2.getString(r3, r4);
        if (r5 == 0) goto L_0x046a;
    L_0x0449:
        r2 = r13.c;
        r3 = 2131624183; // 0x7f0e00f7 float:1.8875539E38 double:1.0531622787E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r7 = 0;
        r8 = r6.p;
        r8 = (long) r8;
        r8 = android.text.format.DateUtils.formatElapsedTime(r8);
        r4[r7] = r8;
        r2 = r2.getString(r3, r4);
        if (r5 == 0) goto L_0x046a;
    L_0x0461:
        r2 = r13.c;
        r3 = 2131624189; // 0x7f0e00fd float:1.887555E38 double:1.0531622816E-314;
        r2 = r2.getString(r3);
    L_0x046a:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = r13.c;
        r4 = r4.getActivity();
        r8 = com.whatsapp.App.f(r6);
        r4 = com.whatsapp.util.bm.h(r4, r8);
        r3 = r3.append(r4);
        r4 = " ";
        r3 = r3.append(r4);
        r3 = r3.toString();
        r0 = r16;
        r4 = r13.a(r0, r6);
        if (r4 == 0) goto L_0x04ba;
    L_0x0493:
        r7 = r6.a;	 Catch:{ IllegalStateException -> 0x0834 }
        r8 = 6;
        if (r7 != r8) goto L_0x04a2;
    L_0x0498:
        r0 = r18;
        r7 = r0.j;	 Catch:{ IllegalStateException -> 0x0836 }
        r8 = 0;
        r7.setImageBitmap(r8);	 Catch:{ IllegalStateException -> 0x0836 }
        if (r5 == 0) goto L_0x04c2;
    L_0x04a2:
        r0 = r18;
        r7 = r0.j;	 Catch:{ IllegalStateException -> 0x0838 }
        r8 = new com.whatsapp.util.bd;	 Catch:{ IllegalStateException -> 0x0838 }
        r9 = r13.c;	 Catch:{ IllegalStateException -> 0x0838 }
        r9 = r9.getResources();	 Catch:{ IllegalStateException -> 0x0838 }
        r4 = r9.getDrawable(r4);	 Catch:{ IllegalStateException -> 0x0838 }
        r8.<init>(r4);	 Catch:{ IllegalStateException -> 0x0838 }
        r7.setImageDrawable(r8);	 Catch:{ IllegalStateException -> 0x0838 }
        if (r5 == 0) goto L_0x04c2;
    L_0x04ba:
        r0 = r18;
        r4 = r0.j;	 Catch:{ IllegalStateException -> 0x0838 }
        r7 = 0;
        r4.setImageBitmap(r7);	 Catch:{ IllegalStateException -> 0x0838 }
    L_0x04c2:
        if (r5 == 0) goto L_0x0878;
    L_0x04c4:
        r12 = r3;
        r3 = r2;
        r2 = r12;
    L_0x04c7:
        r0 = r18;
        r4 = r0.j;	 Catch:{ IllegalStateException -> 0x083a }
        r7 = 0;
        r4.setImageBitmap(r7);	 Catch:{ IllegalStateException -> 0x083a }
        r4 = r2;
    L_0x04d0:
        r0 = r18;
        r2 = r0.n;	 Catch:{ IllegalStateException -> 0x083c }
        if (r2 == 0) goto L_0x04e8;
    L_0x04d6:
        r0 = r18;
        r7 = r0.n;	 Catch:{ IllegalStateException -> 0x083e }
        r0 = r16;
        r2 = r0.e;	 Catch:{ IllegalStateException -> 0x083e }
        r2 = com.whatsapp.notification.t.e(r14, r2);	 Catch:{ IllegalStateException -> 0x083e }
        if (r2 == 0) goto L_0x0840;
    L_0x04e4:
        r2 = 0;
    L_0x04e5:
        r7.setVisibility(r2);
    L_0x04e8:
        r0 = r18;
        r2 = r0.e;	 Catch:{ IllegalStateException -> 0x0844 }
        if (r2 == 0) goto L_0x0502;
    L_0x04ee:
        r0 = r18;
        r7 = r0.e;	 Catch:{ IllegalStateException -> 0x0846 }
        r2 = com.whatsapp.lh.b;	 Catch:{ IllegalStateException -> 0x0846 }
        r0 = r16;
        r8 = r0.e;	 Catch:{ IllegalStateException -> 0x0846 }
        r2 = r2.a(r8);	 Catch:{ IllegalStateException -> 0x0846 }
        if (r2 == 0) goto L_0x0848;
    L_0x04fe:
        r2 = 0;
    L_0x04ff:
        r7.setVisibility(r2);
    L_0x0502:
        r0 = r18;
        r2 = r0.o;	 Catch:{ IllegalStateException -> 0x084c }
        if (r2 == 0) goto L_0x051c;
    L_0x0508:
        r0 = r18;
        r7 = r0.o;	 Catch:{ IllegalStateException -> 0x084e }
        r2 = com.whatsapp.App.aJ;	 Catch:{ IllegalStateException -> 0x084e }
        r0 = r16;
        r8 = r0.e;	 Catch:{ IllegalStateException -> 0x084e }
        r2 = r2.q(r8);	 Catch:{ IllegalStateException -> 0x084e }
        if (r2 == 0) goto L_0x0850;
    L_0x0518:
        r2 = 0;
    L_0x0519:
        r7.setVisibility(r2);
    L_0x051c:
        r0 = r18;
        r2 = r0.l;	 Catch:{ IllegalStateException -> 0x0854 }
        r7 = 8;
        r2.setVisibility(r7);	 Catch:{ IllegalStateException -> 0x0854 }
        r2 = r16.w();	 Catch:{ IllegalStateException -> 0x0854 }
        if (r2 != 0) goto L_0x0531;
    L_0x052b:
        r2 = r16.l();	 Catch:{ IllegalStateException -> 0x0856 }
        if (r2 == 0) goto L_0x05f5;
    L_0x0531:
        r2 = android.text.TextUtils.isEmpty(r3);	 Catch:{ IllegalStateException -> 0x0858 }
        if (r2 != 0) goto L_0x05f5;
    L_0x0537:
        r2 = r6.a;	 Catch:{ IllegalStateException -> 0x085a }
        r7 = 6;
        if (r2 == r7) goto L_0x05f5;
    L_0x053c:
        r2 = r6.F;	 Catch:{ IllegalStateException -> 0x085c }
        if (r2 == 0) goto L_0x05d2;
    L_0x0540:
        r2 = r6.e;	 Catch:{ IllegalStateException -> 0x085e }
        r2 = r2.b;	 Catch:{ IllegalStateException -> 0x085e }
        if (r2 == 0) goto L_0x054b;
    L_0x0546:
        r2 = r6.a;	 Catch:{ IllegalStateException -> 0x085e }
        r7 = 6;
        if (r2 != r7) goto L_0x05d2;
    L_0x054b:
        r2 = com.whatsapp.App.P;
        r7 = r6.F;
        r7 = r2.a(r7);
        r2 = r7.e;
        r8 = com.whatsapp.App.af();
        r2 = r2.contains(r8);
        if (r2 == 0) goto L_0x0569;
    L_0x055f:
        r2 = r13.c;
        r2 = com.whatsapp.ConversationsFragment.e(r2);
        r2 = r2.e;
        if (r5 == 0) goto L_0x056d;
    L_0x0569:
        r2 = r7.o();
    L_0x056d:
        r7 = com.whatsapp.App.as();	 Catch:{ IllegalStateException -> 0x0860 }
        if (r7 == 0) goto L_0x0579;
    L_0x0573:
        r7 = com.whatsapp.b7.a(r2);	 Catch:{ IllegalStateException -> 0x0862 }
        if (r7 != 0) goto L_0x0585;
    L_0x0579:
        r7 = com.whatsapp.App.as();	 Catch:{ IllegalStateException -> 0x0864 }
        if (r7 != 0) goto L_0x059d;
    L_0x057f:
        r7 = com.whatsapp.b7.a(r2);	 Catch:{ IllegalStateException -> 0x0864 }
        if (r7 != 0) goto L_0x059d;
    L_0x0585:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r2 = r7.append(r2);
        r7 = z;
        r8 = 5;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r2 = r2.toString();
        if (r5 == 0) goto L_0x05b3;
    L_0x059d:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = z;
        r9 = 0;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r2 = r7.append(r2);
        r2 = r2.toString();
    L_0x05b3:
        r0 = r18;
        r7 = r0.l;	 Catch:{ IllegalStateException -> 0x0866 }
        r8 = r13.c;	 Catch:{ IllegalStateException -> 0x0866 }
        r8 = r8.getActivity();	 Catch:{ IllegalStateException -> 0x0866 }
        r8 = r8.getBaseContext();	 Catch:{ IllegalStateException -> 0x0866 }
        r2 = com.whatsapp.util.a5.c(r2, r8);	 Catch:{ IllegalStateException -> 0x0866 }
        r7.setText(r2);	 Catch:{ IllegalStateException -> 0x0866 }
        r0 = r18;
        r2 = r0.l;	 Catch:{ IllegalStateException -> 0x0866 }
        r7 = 0;
        r2.setVisibility(r7);	 Catch:{ IllegalStateException -> 0x0866 }
        if (r5 == 0) goto L_0x05f5;
    L_0x05d2:
        r2 = r6.e;	 Catch:{ IllegalStateException -> 0x0868 }
        r2 = r2.b;	 Catch:{ IllegalStateException -> 0x0868 }
        if (r2 != 0) goto L_0x05f5;
    L_0x05d8:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0868 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0868 }
        r7 = z;	 Catch:{ IllegalStateException -> 0x0868 }
        r8 = 2;
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0868 }
        r2 = r2.append(r7);	 Catch:{ IllegalStateException -> 0x0868 }
        r6 = com.whatsapp.util.Log.a(r6);	 Catch:{ IllegalStateException -> 0x0868 }
        r2 = r2.append(r6);	 Catch:{ IllegalStateException -> 0x0868 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0868 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x0868 }
    L_0x05f5:
        r2 = 0;
        r6 = r16.l();	 Catch:{ IllegalStateException -> 0x086a }
        if (r6 != 0) goto L_0x061f;
    L_0x05fc:
        r6 = r16.w();	 Catch:{ IllegalStateException -> 0x086c }
        if (r6 == 0) goto L_0x0606;
    L_0x0602:
        r6 = com.whatsapp.ge.q;	 Catch:{ IllegalStateException -> 0x086c }
        if (r6 == 0) goto L_0x061f;
    L_0x0606:
        r2 = r16.g();
        if (r2 == 0) goto L_0x061f;
    L_0x060c:
        r0 = r18;
        r3 = r0.l;
        r6 = 8;
        r3.setVisibility(r6);
        r0 = r18;
        r3 = r0.m;
        r6 = 8;
        r3.setVisibility(r6);
        r3 = r2;
    L_0x061f:
        r6 = r13.c;
        r6 = r6.getActivity();
        r6 = r6.getWindow();
        r6 = r6.getDecorView();
        r6 = r6.getWidth();
        r6 = (float) r6;
        r7 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r8 = r13.c;
        r8 = r8.getResources();
        r8 = r8.getDisplayMetrics();
        r8 = r8.density;
        r7 = r7 * r8;
        r8 = r13.c;
        r8 = r8.getResources();
        r8 = r8.getConfiguration();
        r8 = r8.fontScale;
        r7 = r7 * r8;
        r6 = r6 / r7;
        r6 = (int) r6;
        r7 = r3.length();
        if (r7 <= r6) goto L_0x065b;
    L_0x0656:
        r7 = 0;
        r3 = r3.substring(r7, r6);
    L_0x065b:
        r0 = r18;
        r6 = r0.h;	 Catch:{ IllegalStateException -> 0x086e }
        r7 = r13.c;	 Catch:{ IllegalStateException -> 0x086e }
        r7 = r7.getActivity();	 Catch:{ IllegalStateException -> 0x086e }
        r7 = r7.getBaseContext();	 Catch:{ IllegalStateException -> 0x086e }
        r0 = r18;
        r8 = r0.h;	 Catch:{ IllegalStateException -> 0x086e }
        r8 = r8.getPaint();	 Catch:{ IllegalStateException -> 0x086e }
        r3 = com.whatsapp.util.a5.b(r3, r7, r8);	 Catch:{ IllegalStateException -> 0x086e }
        r6.setText(r3);	 Catch:{ IllegalStateException -> 0x086e }
        r0 = r18;
        r3 = r0.f;	 Catch:{ IllegalStateException -> 0x086e }
        r3.setText(r4);	 Catch:{ IllegalStateException -> 0x086e }
        r0 = r16;
        r3 = r0.a;	 Catch:{ IllegalStateException -> 0x086e }
        if (r3 <= 0) goto L_0x06c4;
    L_0x0685:
        r0 = r18;
        r3 = r0.b;	 Catch:{ IllegalStateException -> 0x0870 }
        com.whatsapp.am1.a(r3);	 Catch:{ IllegalStateException -> 0x0870 }
        r0 = r18;
        r3 = r0.b;	 Catch:{ IllegalStateException -> 0x0870 }
        r4 = -14342875; // 0xffffffffff252525 float:-2.1951548E38 double:NaN;
        r3.setTextColor(r4);	 Catch:{ IllegalStateException -> 0x0870 }
        r0 = r18;
        r3 = r0.h;	 Catch:{ IllegalStateException -> 0x0870 }
        com.whatsapp.am1.a(r3);	 Catch:{ IllegalStateException -> 0x0870 }
        r0 = r18;
        r3 = r0.h;	 Catch:{ IllegalStateException -> 0x0870 }
        r4 = -14342875; // 0xffffffffff252525 float:-2.1951548E38 double:NaN;
        r3.setTextColor(r4);	 Catch:{ IllegalStateException -> 0x0870 }
        r0 = r18;
        r3 = r0.l;	 Catch:{ IllegalStateException -> 0x0870 }
        com.whatsapp.am1.a(r3);	 Catch:{ IllegalStateException -> 0x0870 }
        r0 = r18;
        r3 = r0.l;	 Catch:{ IllegalStateException -> 0x0870 }
        r4 = -14342875; // 0xffffffffff252525 float:-2.1951548E38 double:NaN;
        r3.setTextColor(r4);	 Catch:{ IllegalStateException -> 0x0870 }
        r0 = r18;
        r3 = r0.f;	 Catch:{ IllegalStateException -> 0x0870 }
        r4 = -14342875; // 0xffffffffff252525 float:-2.1951548E38 double:NaN;
        r3.setTextColor(r4);	 Catch:{ IllegalStateException -> 0x0870 }
        if (r5 == 0) goto L_0x0701;
    L_0x06c4:
        r0 = r18;
        r3 = r0.b;	 Catch:{ IllegalStateException -> 0x0870 }
        com.whatsapp.am1.a(r3);	 Catch:{ IllegalStateException -> 0x0870 }
        r0 = r18;
        r3 = r0.b;	 Catch:{ IllegalStateException -> 0x0870 }
        r4 = -14342875; // 0xffffffffff252525 float:-2.1951548E38 double:NaN;
        r3.setTextColor(r4);	 Catch:{ IllegalStateException -> 0x0870 }
        r0 = r18;
        r3 = r0.h;	 Catch:{ IllegalStateException -> 0x0870 }
        com.whatsapp.am1.b(r3);	 Catch:{ IllegalStateException -> 0x0870 }
        r0 = r18;
        r3 = r0.h;	 Catch:{ IllegalStateException -> 0x0870 }
        r4 = -10066330; // 0xffffffffff666666 float:-3.0625412E38 double:NaN;
        r3.setTextColor(r4);	 Catch:{ IllegalStateException -> 0x0870 }
        r0 = r18;
        r3 = r0.l;	 Catch:{ IllegalStateException -> 0x0870 }
        com.whatsapp.am1.b(r3);	 Catch:{ IllegalStateException -> 0x0870 }
        r0 = r18;
        r3 = r0.l;	 Catch:{ IllegalStateException -> 0x0870 }
        r4 = -10066330; // 0xffffffffff666666 float:-3.0625412E38 double:NaN;
        r3.setTextColor(r4);	 Catch:{ IllegalStateException -> 0x0870 }
        r0 = r18;
        r3 = r0.f;	 Catch:{ IllegalStateException -> 0x0870 }
        r4 = -6776680; // 0xffffffffff989898 float:NaN double:NaN;
        r3.setTextColor(r4);	 Catch:{ IllegalStateException -> 0x0870 }
    L_0x0701:
        if (r2 == 0) goto L_0x0727;
    L_0x0703:
        r0 = r18;
        r2 = r0.j;	 Catch:{ IllegalStateException -> 0x0872 }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0872 }
        r0 = r18;
        r2 = r0.h;	 Catch:{ IllegalStateException -> 0x0872 }
        com.whatsapp.am1.a(r2);	 Catch:{ IllegalStateException -> 0x0872 }
        r0 = r18;
        r2 = r0.h;	 Catch:{ IllegalStateException -> 0x0872 }
        r3 = r13.c;	 Catch:{ IllegalStateException -> 0x0872 }
        r3 = r3.getResources();	 Catch:{ IllegalStateException -> 0x0872 }
        r4 = 2131296280; // 0x7f090018 float:1.8210472E38 double:1.053000273E-314;
        r3 = r3.getColor(r4);	 Catch:{ IllegalStateException -> 0x0872 }
        r2.setTextColor(r3);	 Catch:{ IllegalStateException -> 0x0872 }
    L_0x0727:
        r2 = z;	 Catch:{ IllegalStateException -> 0x0874 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0874 }
        r0 = r16;
        r3 = r0.e;	 Catch:{ IllegalStateException -> 0x0874 }
        r2 = r2.equals(r3);	 Catch:{ IllegalStateException -> 0x0874 }
        if (r2 == 0) goto L_0x076c;
    L_0x0736:
        r0 = r18;
        r2 = r0.h;	 Catch:{ IllegalStateException -> 0x0874 }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0874 }
        r0 = r18;
        r2 = r0.l;	 Catch:{ IllegalStateException -> 0x0874 }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0874 }
        r0 = r18;
        r2 = r0.f;	 Catch:{ IllegalStateException -> 0x0874 }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0874 }
        r0 = r18;
        r2 = r0.k;	 Catch:{ IllegalStateException -> 0x0874 }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0874 }
        r0 = r18;
        r2 = r0.j;	 Catch:{ IllegalStateException -> 0x0874 }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0874 }
        r0 = r18;
        r2 = r0.m;	 Catch:{ IllegalStateException -> 0x0874 }
        r3 = 8;
        r2.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0874 }
    L_0x076c:
        r2 = r13.c;	 Catch:{ IllegalStateException -> 0x0876 }
        r2 = com.whatsapp.ConversationsFragment.a(r2);	 Catch:{ IllegalStateException -> 0x0876 }
        if (r2 == 0) goto L_0x0061;
    L_0x0774:
        r2 = r13.c;	 Catch:{ IllegalStateException -> 0x0876 }
        r2 = com.whatsapp.ConversationsFragment.a(r2);	 Catch:{ IllegalStateException -> 0x0876 }
        r0 = r16;
        r3 = r0.e;	 Catch:{ IllegalStateException -> 0x0876 }
        r2 = r2.equals(r3);	 Catch:{ IllegalStateException -> 0x0876 }
        if (r2 == 0) goto L_0x0061;
    L_0x0784:
        r2 = r13.c;
        r3 = 0;
        com.whatsapp.ConversationsFragment.b(r2, r3);
        r11 = new android.view.animation.AnimationSet;
        r2 = 1;
        r11.<init>(r2);
        r2 = new android.view.animation.ScaleAnimation;
        r3 = 0;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = 0;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r7 = 1;
        r8 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r9 = 1;
        r10 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10);
        r3 = new android.view.animation.AlphaAnimation;
        r4 = 0;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3.<init>(r4, r5);
        r11.addAnimation(r2);
        r11.addAnimation(r3);
        r2 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r11.setDuration(r2);
        r15.startAnimation(r11);
        goto L_0x0061;
    L_0x07b9:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x07bb }
    L_0x07bb:
        r2 = move-exception;
        throw r2;
    L_0x07bd:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x07bf }
    L_0x07bf:
        r2 = move-exception;
        throw r2;
    L_0x07c1:
        r2 = move-exception;
        throw r2;
    L_0x07c3:
        r2 = move-exception;
        throw r2;
    L_0x07c5:
        r2 = move-exception;
        throw r2;
    L_0x07c7:
        r2 = r3;
        goto L_0x01f4;
    L_0x07ca:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x07cc }
    L_0x07cc:
        r2 = move-exception;
        throw r2;
    L_0x07ce:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x07d0 }
    L_0x07d0:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x07d2 }
    L_0x07d2:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x07d4 }
    L_0x07d4:
        r2 = move-exception;
        throw r2;
    L_0x07d6:
        r2 = move-exception;
        throw r2;
    L_0x07d8:
        r2 = move-exception;
        throw r2;
    L_0x07da:
        r2 = r13.c;
        r2 = com.whatsapp.ConversationsFragment.e(r2);
        r2 = r2.i;
        r0 = r18;
        r3 = r0.c;
        r7 = 8;
        r3.setVisibility(r7);
        if (r5 == 0) goto L_0x02ad;
    L_0x07ed:
        r2 = r13.c;
        r2 = com.whatsapp.ConversationsFragment.e(r2);
        r2 = r2.g;
        r0 = r18;
        r3 = r0.c;
        r7 = 0;
        r3.setVisibility(r7);
        if (r5 == 0) goto L_0x02ad;
    L_0x07ff:
        goto L_0x02a9;
    L_0x0801:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0803 }
    L_0x0803:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0805 }
    L_0x0805:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0807 }
    L_0x0807:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0809 }
    L_0x0809:
        r2 = move-exception;
        throw r2;
    L_0x080b:
        r2 = move-exception;
        throw r2;
    L_0x080d:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x080f }
    L_0x080f:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0811 }
    L_0x0811:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0813 }
    L_0x0813:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0815 }
    L_0x0815:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0817 }
    L_0x0817:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0819 }
    L_0x0819:
        r2 = move-exception;
        throw r2;
    L_0x081b:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x081d }
    L_0x081d:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x081f }
    L_0x081f:
        r2 = move-exception;
        throw r2;
    L_0x0821:
        r2 = move-exception;
        throw r2;
    L_0x0823:
        r2 = move-exception;
        throw r2;
    L_0x0825:
        r2 = move-exception;
        throw r2;
    L_0x0827:
        r3 = 2130838893; // 0x7f02056d float:1.7282781E38 double:1.052774294E-314;
        goto L_0x040d;
    L_0x082c:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x082e }
    L_0x082e:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0830 }
    L_0x0830:
        r2 = move-exception;
        throw r2;
    L_0x0832:
        r2 = move-exception;
        throw r2;
    L_0x0834:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0836 }
    L_0x0836:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0838 }
    L_0x0838:
        r2 = move-exception;
        throw r2;
    L_0x083a:
        r2 = move-exception;
        throw r2;
    L_0x083c:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x083e }
    L_0x083e:
        r2 = move-exception;
        throw r2;
    L_0x0840:
        r2 = 8;
        goto L_0x04e5;
    L_0x0844:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0846 }
    L_0x0846:
        r2 = move-exception;
        throw r2;
    L_0x0848:
        r2 = 8;
        goto L_0x04ff;
    L_0x084c:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x084e }
    L_0x084e:
        r2 = move-exception;
        throw r2;
    L_0x0850:
        r2 = 8;
        goto L_0x0519;
    L_0x0854:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0856 }
    L_0x0856:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0858 }
    L_0x0858:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x085a }
    L_0x085a:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x085c }
    L_0x085c:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x085e }
    L_0x085e:
        r2 = move-exception;
        throw r2;
    L_0x0860:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0862 }
    L_0x0862:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0864 }
    L_0x0864:
        r2 = move-exception;
        throw r2;
    L_0x0866:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0868 }
    L_0x0868:
        r2 = move-exception;
        throw r2;
    L_0x086a:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x086c }
    L_0x086c:
        r2 = move-exception;
        throw r2;
    L_0x086e:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0870 }
    L_0x0870:
        r2 = move-exception;
        throw r2;
    L_0x0872:
        r2 = move-exception;
        throw r2;
    L_0x0874:
        r2 = move-exception;
        throw r2;
    L_0x0876:
        r2 = move-exception;
        throw r2;
    L_0x0878:
        r4 = r3;
        r3 = r2;
        goto L_0x04d0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.__.a(android.content.Context, android.view.View, com.whatsapp.m8, boolean, com.whatsapp._f):void");
    }

    __(ConversationsFragment conversationsFragment) {
        this.c = conversationsFragment;
        this.b = new rm(this, null);
    }

    public int getCount() {
        return ConversationsFragment.i(this.c).size();
    }
}
