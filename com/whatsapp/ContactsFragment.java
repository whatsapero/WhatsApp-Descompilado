package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import com.actionbarsherlock.R;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.app.SherlockListFragment;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.ActionMode.Callback;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.fieldstats.a7;
import com.whatsapp.fieldstats.au;
import com.whatsapp.util.br;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ContactsFragment extends SherlockListFragment implements bt, anq {
    private static final m8 c;
    private static final m8 e;
    private static final m8 g;
    private static final String[] z;
    private ArrayList b;
    private Handler d;
    private CharSequence f;
    private ActionMode h;
    private Callback i;
    private an4 j;
    private ArrayList k;
    private fk l;
    private vf m;
    private HashMap n;

    static void f(ContactsFragment contactsFragment) {
        contactsFragment.e();
    }

    private void a(boolean z) {
        if (App.an == null) {
            App.b(getActivity(), (int) R.string.finish_registration_first, 1);
            if (App.az == 0) {
                return;
            }
        }
        ((SherlockFragmentActivity) getActivity()).setSupportProgressBarIndeterminateVisibility(true);
        br.a(new a87(this, z));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.contact_picker_list, viewGroup, false);
    }

    static {
        String[] strArr = new String[5];
        String str = "72\u0019\u000fc?8S\u0014b\"9\u0013\t\"7?\t\u0014c8r43_\u0013\u000e)";
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
                        i3 = 86;
                        break;
                    case ay.f /*1*/:
                        i3 = 92;
                        break;
                    case ay.n /*2*/:
                        i3 = 125;
                        break;
                    case ay.p /*3*/:
                        i3 = 125;
                        break;
                    default:
                        i3 = 12;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "83P\u0010m\"?\u0015\u0018\u007f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "%1\u000e\tcl";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ">(\t\r\u007flsR\nd7(\u000e\u001c|&r\u001e\u0012ay8\u0011R";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    e = new m8("");
                    c = new m8("");
                    g = new m8("");
                default:
                    strArr2[i] = str;
                    str = " 2\u0019Sm88\u000f\u0012e2r\u001e\b~%3\u000fSh?.R\u001ec8(\u001c\u001ex";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(Collection collection) {
        this.m.notifyDataSetChanged();
    }

    static fk g(ContactsFragment contactsFragment) {
        return contactsFragment.l;
    }

    public void onDestroy() {
        super.onDestroy();
        App.a((anq) this);
        if (this.j != null) {
            this.j.cancel(true);
        }
        this.l.a();
    }

    static HashMap k(ContactsFragment contactsFragment) {
        return contactsFragment.n;
    }

    static CharSequence e(ContactsFragment contactsFragment) {
        return contactsFragment.f;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.menuitem_contacts_help:
                h();
                return true;
            case R.id.menuitem_new_contact:
                Intent intent = new Intent(z[0]);
                intent.setType(z[1]);
                startActivity(intent);
                return true;
            case R.id.menuitem_refresh:
                a(true);
                return true;
            case R.id.menuitem_tell_friend:
                ak4.a(au.TELL_A_FRIEND, a7.CONTACTS_MENU);
                App.c(getActivity());
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    static m8 d() {
        return g;
    }

    static void a(ContactsFragment contactsFragment, m8 m8Var) {
        contactsFragment.b(m8Var);
    }

    static m8 c() {
        return c;
    }

    static ArrayList d(ContactsFragment contactsFragment) {
        return contactsFragment.b;
    }

    static Handler a(ContactsFragment contactsFragment) {
        return contactsFragment.d;
    }

    @Deprecated
    private void a(int i) {
    }

    static ActionMode a(ContactsFragment contactsFragment, ActionMode actionMode) {
        contactsFragment.h = actionMode;
        return actionMode;
    }

    private void b(m8 m8Var) {
        ak4.a(au.TELL_A_FRIEND, a7.INVITE_NON_WA_CONTACT);
        App.a(getActivity(), Uri.parse(z[3] + m8Var.h.a()), getString(R.string.tell_a_friend_sms, new Object[]{z[4]}));
    }

    static boolean c(m8 m8Var) {
        return a(m8Var);
    }

    private void e() {
        if (this.j != null) {
            this.j.cancel(true);
        }
        this.j = new an4(this, null);
        a5w.a(this.j, new Void[0]);
    }

    @Deprecated
    private void f() {
    }

    static ArrayList a(ContactsFragment contactsFragment, CharSequence charSequence) {
        return contactsFragment.a(charSequence);
    }

    static m8 a() {
        return e;
    }

    static void a(ContactsFragment contactsFragment, int i) {
        contactsFragment.a(i);
    }

    private void h() {
        startActivity(new Intent(getActivity(), ContactPickerHelp.class));
    }

    static vf c(ContactsFragment contactsFragment) {
        return contactsFragment.m;
    }

    public void a(CharSequence charSequence) {
        this.m.getFilter().filter(charSequence);
    }

    public void d(String str) {
        m8 a = App.P.a(str);
        if (a != null) {
            if (m8.a(this.k, new atd(a))) {
                this.m.notifyDataSetChanged();
            }
        }
    }

    public void a(String str) {
        m8 a = App.P.a(str);
        if (a != null) {
            if (m8.a(this.k, new aty(a))) {
                this.m.notifyDataSetChanged();
            }
        }
    }

    public void a() {
        e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onContextItemSelected(android.view.MenuItem r5) {
        /*
        r4_this = this;
        r0 = r5.getItemId();
        switch(r0) {
            case 2131427357: goto L_0x000c;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.onContextItemSelected(r5);
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = r5.getMenuInfo();
        r0 = (android.widget.AdapterView.AdapterContextMenuInfo) r0;
        r1 = r4.getListView();
        r0 = r0.position;
        r0 = r1.getItemAtPosition(r0);
        r0 = (com.whatsapp.m8) r0;
        r1 = com.whatsapp.App.a();
        if (r1 != 0) goto L_0x0033;
    L_0x0024:
        r1 = r4.getActivity();
        r2 = 2131624620; // 0x7f0e02ac float:1.8876425E38 double:1.0531624946E-314;
        r3 = 0;
        com.whatsapp.App.b(r1, r2, r3);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0044;
    L_0x0033:
        r1 = r4.getActivity();
        r2 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r1.showDialog(r2);
        r1 = new com.whatsapp.gx;
        r1.<init>(r4, r0);
        com.whatsapp.util.br.a(r1);
    L_0x0044:
        r0 = 1;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactsFragment.onContextItemSelected(android.view.MenuItem):boolean");
    }

    static ArrayList i(ContactsFragment contactsFragment) {
        return contactsFragment.k;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        if (App.c(((m8) ((ListView) view).getItemAtPosition(((AdapterContextMenuInfo) contextMenuInfo).position)).e)) {
            contextMenu.add(0, R.id.menuitem_unblock_contact, 0, String.format(getString(R.string.block_list_menu_unblock), new Object[]{r0.N}));
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList a(java.lang.CharSequence r8) {
        /*
        r7_this = this;
        r2 = com.whatsapp.App.az;
        r0 = 0;
        if (r8 == 0) goto L_0x0049;
    L_0x0005:
        r0 = r8.toString();
        r0 = r0.toLowerCase();
        r1 = r0;
    L_0x000e:
        r3 = r7.k;
        monitor-enter(r3);
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0046 }
        r4.<init>();	 Catch:{ all -> 0x0046 }
        r0 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x0046 }
        if (r0 != 0) goto L_0x003f;
    L_0x001c:
        r0 = r7.k;	 Catch:{ all -> 0x0046 }
        r5 = r0.iterator();	 Catch:{ all -> 0x0046 }
    L_0x0022:
        r0 = r5.hasNext();	 Catch:{ all -> 0x0046 }
        if (r0 == 0) goto L_0x003d;
    L_0x0028:
        r0 = r5.next();	 Catch:{ all -> 0x0046 }
        r0 = (com.whatsapp.m8) r0;	 Catch:{ all -> 0x0046 }
        r6 = r0.h;	 Catch:{ all -> 0x0046 }
        if (r6 == 0) goto L_0x003b;
    L_0x0032:
        r6 = r0.c(r1);	 Catch:{ all -> 0x0046 }
        if (r6 == 0) goto L_0x003b;
    L_0x0038:
        r4.add(r0);	 Catch:{ all -> 0x0046 }
    L_0x003b:
        if (r2 == 0) goto L_0x0022;
    L_0x003d:
        if (r2 == 0) goto L_0x0044;
    L_0x003f:
        r0 = r7.k;	 Catch:{ all -> 0x0046 }
        r4.addAll(r0);	 Catch:{ all -> 0x0046 }
    L_0x0044:
        monitor-exit(r3);	 Catch:{ all -> 0x0046 }
        return r4;
    L_0x0046:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0046 }
        throw r0;
    L_0x0049:
        r1 = r0;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactsFragment.a(java.lang.CharSequence):java.util.ArrayList");
    }

    private void b() {
        if (this.h != null) {
            if (this.n.size() == 0) {
                this.h.finish();
                if (App.az == 0) {
                    return;
                }
            }
            this.h.setTitle(Integer.toString(this.n.size()));
        }
    }

    public void c(String str) {
        m8 a = App.P.a(str);
        if (a != null) {
            if (m8.a(this.k, new atw(a))) {
                this.m.notifyDataSetChanged();
            }
        }
    }

    public ContactsFragment() {
        this.k = new ArrayList();
        this.b = new ArrayList();
        this.l = new fk();
        this.d = new Handler();
    }

    static HashMap a(ContactsFragment contactsFragment, HashMap hashMap) {
        contactsFragment.n = hashMap;
        return hashMap;
    }

    public void b(String str) {
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    static CharSequence b(ContactsFragment contactsFragment, CharSequence charSequence) {
        contactsFragment.f = charSequence;
        return charSequence;
    }

    public boolean g() {
        if (this.h != null) {
            return false;
        }
        if (this.i == null) {
            this.i = new bb(this);
        }
        this.m.notifyDataSetChanged();
        this.h = ((SherlockFragmentActivity) getActivity()).startActionMode(this.i);
        return true;
    }

    private static boolean a(m8 m8Var) {
        return z[2].equals(m8Var.e);
    }

    static void h(ContactsFragment contactsFragment) {
        contactsFragment.f();
    }

    static void j(ContactsFragment contactsFragment) {
        contactsFragment.b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityCreated(android.os.Bundle r6) {
        /*
        r5_this = this;
        r4 = 1;
        super.onActivityCreated(r6);
        r5.setHasOptionsMenu(r4);
        r5.e();
        r0 = new com.whatsapp.v_;
        r1 = r5.getActivity();
        r2 = r5.b;
        r0.<init>(r5, r1, r2);
        r5.m = r0;
        r0 = r5.m;
        r5.setListAdapter(r0);
        r0 = r5.getListView();
        r0.setFastScrollEnabled(r4);
        r0.setScrollbarFadingEnabled(r4);
        r1 = r5.getView();
        r2 = 2131427640; // 0x7f0b0138 float:1.8476902E38 double:1.0530651735E-314;
        r1 = r1.findViewById(r2);
        r2 = 0;
        r1.setVisibility(r2);
        r2 = r5.getView();
        r3 = 2131427639; // 0x7f0b0137 float:1.84769E38 double:1.053065173E-314;
        r2 = r2.findViewById(r3);
        r3 = 8;
        r2.setVisibility(r3);
        r0.setEmptyView(r1);
        r1 = r5.getView();
        r2 = 2131427804; // 0x7f0b01dc float:1.8477235E38 double:1.0530652545E-314;
        r1 = r1.findViewById(r2);
        r2 = new com.whatsapp.qq;
        r2.<init>(r5);
        r1.setOnClickListener(r2);
        r0.setTextFilterEnabled(r4);
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 11;
        if (r1 < r2) goto L_0x0070;
    L_0x0064:
        r0.setFastScrollAlwaysVisible(r4);
        r1 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r0.setScrollBarStyle(r1);
        r1 = com.whatsapp.App.az;
        if (r1 == 0) goto L_0x0076;
    L_0x0070:
        r1 = 2130839096; // 0x7f020638 float:1.7283193E38 double:1.052774394E-314;
        r0.setSelector(r1);
    L_0x0076:
        r5.registerForContextMenu(r0);
        r1 = new com.whatsapp.xk;
        r1.<init>(r5);
        r0.setOnItemClickListener(r1);
        r1 = new com.whatsapp.a_0;
        r1.<init>(r5, r0);
        r0.setOnItemLongClickListener(r1);
        com.whatsapp.App.b(r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ContactsFragment.onActivityCreated(android.os.Bundle):void");
    }

    static void b(ContactsFragment contactsFragment) {
        contactsFragment.h();
    }
}
