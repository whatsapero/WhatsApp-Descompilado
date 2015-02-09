package com.whatsapp;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.MotionEvent;
import com.actionbarsherlock.R;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.undobar.UndoBarController;
import com.whatsapp.util.y;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class Conversations extends DialogToastFragmentActivity {
    private static final String[] z;
    String f;
    private MenuItem g;
    private a3a h;

    static {
        String[] strArr = new String[26];
        String str = "A~gfwAe";
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
                        i3 = 34;
                        break;
                    case ay.f /*1*/:
                        i3 = 17;
                        break;
                    case ay.n /*2*/:
                        i3 = 9;
                        break;
                    case ay.p /*3*/:
                        i3 = 18;
                        break;
                    default:
                        i3 = 22;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>m{wN~n2eMw}ewPt$stMd}?bM<ljfKcl";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>m{wN~n2eGc\u007f{uG<ljbG\u007fz{yL<hqbKgl";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>m{wN~n2eGc\u007f{uG<ljbG\u007fz{yL<ljfKclv";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>m{wN~n2eGc\u007f{uG<ljbG\u007fz{yL<e{pGe`\u007fs";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>m{wN~n2eGc\u007f{uG<ljbG\u007fz{yL<ysoOtgf";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>j`sCel";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>j`sCel";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>j~yAz$edM\u007fn";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>ze;Giy{dGu";
                    obj = 9;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>j`sCel=xM<dw;Mc$\u007feEb}}dG<mp";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "A~gdsPbhf\u007fM\u007fz2tMdgqs\u0002ef2{Cxg";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "A~d<wLu{}\u007fF?j}xVpjfe";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>fbbK~ga9L~`|bG\u007f}=e[b}w{\u000frf|bCr}a;Cay?xMe$tyW\u007fm";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "C\u007fm`yKu'{xVtgf8Cr}{yL?_[Su";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>fbbK~ga9QhzfsO<j}xVpjfe\u000fpyb;L~}?pMdgv";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>{weW|l";
                    obj = 16;
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    str = "A~gdsPbhf\u007fM\u007fz2tMdgqs\u0002ef2{Cxg";
                    i = 18;
                    strArr2 = strArr3;
                    obj = 17;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    strArr2 = strArr3;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>{weW|l";
                    obj = 18;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>{weW|l=xM<dw;Mc$\u007feEb}}dG<mp";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "Gi`fIEcfgf}{`v";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    str = "G\u007fmMqP~|bIHxm";
                    obj = 21;
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    strArr2 = strArr3;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>yscQt";
                    obj = 22;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>yscQt";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>mweVcfk";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "A~gdsPbhf\u007fM\u007fzsuVx\u007f{b[>m{wN~n2eGc\u007f{uG<ljbG\u007fz{yL<{}zNshq}";
                    obj = null;
                    break;
            }
        }
    }

    private void b() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: com.whatsapp.Conversations.b():void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:113)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:223)
	at jadx.core.ProcessClass.process(ProcessClass.java:20)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
Caused by: java.lang.NullPointerException
	at jadx.core.dex.trycatch.TryCatchBlock.removeWholeBlock(TryCatchBlock.java:76)
	at jadx.core.dex.trycatch.TryCatchBlock.removeHandler(TryCatchBlock.java:60)
	at jadx.core.dex.nodes.MethodNode.initTryCatches(MethodNode.java:286)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:102)
	... 8 more
*/
        /*
        r0_this = this;
        r2 = 0;
        r0 = com.whatsapp.b1.g();
        if (r0 != 0) goto L_0x001d;
        r0 = com.whatsapp.b1.b();
        if (r0 != 0) goto L_0x001d;
        r0 = new com.whatsapp.av2;
        r1 = 0;
        r0.<init>(r3, r1);
        r1 = 0;
        r1 = new java.lang.Void[r1];
        com.whatsapp.a5w.a(r0, r1);
        r0 = com.whatsapp.App.az;
        if (r0 == 0) goto L_0x0024;
        r0 = com.whatsapp.b1.i();
        r3.b(r0);
        return;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        throw r0;
        r0 = move-exception;
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        r3.b(r2);
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversations.b():void");
    }

    static void a(Conversations conversations, boolean z) {
        conversations.b(z);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(boolean r3) {
        /*
        r2_this = this;
        if (r3 != 0) goto L_0x000f;
    L_0x0002:
        r0 = r2.isFinishing();	 Catch:{ IllegalArgumentException -> 0x000d }
        if (r0 != 0) goto L_0x000c;
    L_0x0008:
        r0 = 0;
        r2.showDialog(r0);	 Catch:{ IllegalArgumentException -> 0x000d }
    L_0x000c:
        return;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r0 = com.whatsapp.App.P;	 Catch:{ IllegalArgumentException -> 0x003d }
        r0 = r0.d();	 Catch:{ IllegalArgumentException -> 0x003d }
        r0 = r0.a();	 Catch:{ IllegalArgumentException -> 0x003d }
        r0 = r0.exists();	 Catch:{ IllegalArgumentException -> 0x003d }
        if (r0 != 0) goto L_0x000c;
    L_0x001f:
        r0 = com.whatsapp.App.U;	 Catch:{ IllegalArgumentException -> 0x003f }
        if (r0 == 0) goto L_0x000c;
    L_0x0023:
        r0 = com.whatsapp.ProfilePhotoReminder.m;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r0 != 0) goto L_0x000c;
    L_0x0027:
        r0 = com.whatsapp.App.a();	 Catch:{ IllegalArgumentException -> 0x003b }
        if (r0 == 0) goto L_0x000c;
    L_0x002d:
        r0 = 1;
        com.whatsapp.ProfilePhotoReminder.m = r0;	 Catch:{ IllegalArgumentException -> 0x003b }
        r0 = new android.content.Intent;	 Catch:{ IllegalArgumentException -> 0x003b }
        r1 = com.whatsapp.ProfilePhotoReminder.class;
        r0.<init>(r2, r1);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2.startActivity(r0);	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x000c;
    L_0x003b:
        r0 = move-exception;
        throw r0;
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x003b }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversations.b(boolean):void");
    }

    public void onPause() {
        Log.i(z[24]);
        y yVar = new y(z[23]);
        super.onPause();
        UndoBarController.b((Activity) this);
        yVar.c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem r7) {
        /*
        r6_this = this;
        r5 = 11;
        r0 = 0;
        r2 = 1;
        r3 = com.whatsapp.App.az;
        r1 = r7.getItemId();
        switch(r1) {
            case 0: goto L_0x000e;
            case 1: goto L_0x001a;
            case 2: goto L_0x0026;
            case 3: goto L_0x0032;
            case 4: goto L_0x0041;
            case 5: goto L_0x000d;
            case 6: goto L_0x000d;
            case 7: goto L_0x009d;
            case 8: goto L_0x000d;
            case 9: goto L_0x00a3;
            case 10: goto L_0x00b0;
            case 11: goto L_0x0112;
            default: goto L_0x000d;
        };
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.ContactPicker.class;
        r0.<init>(r6, r1);
        r6.startActivityForResult(r0, r2);
        r0 = r2;
        goto L_0x000d;
    L_0x001a:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.SetStatus.class;
        r0.<init>(r6, r1);
        r6.startActivity(r0);
        r0 = r2;
        goto L_0x000d;
    L_0x0026:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Settings.class;
        r0.<init>(r6, r1);
        r6.startActivity(r0);
        r0 = r2;
        goto L_0x000d;
    L_0x0032:
        r6.finish();
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Advanced.class;
        r0.<init>(r6, r1);
        r6.startActivity(r0);
        r0 = r2;
        goto L_0x000d;
    L_0x0041:
        r0 = new android.content.Intent;
        r1 = z;
        r4 = 15;
        r1 = r1[r4];
        r4 = android.provider.ContactsContract.Contacts.CONTENT_URI;
        r0.<init>(r1, r4);
        r1 = r6.getPackageManager();	 Catch:{ ActivityNotFoundException -> 0x0089 }
        r1 = r0.resolveActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x0089 }
        r0.setComponent(r1);	 Catch:{ ActivityNotFoundException -> 0x0089 }
        r1 = r0.getComponent();	 Catch:{ ActivityNotFoundException -> 0x0089 }
        if (r1 == 0) goto L_0x0064;
    L_0x005f:
        r6.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x0089 }
        if (r3 == 0) goto L_0x0087;
    L_0x0064:
        r0 = r6.getPackageManager();	 Catch:{ ActivityNotFoundException -> 0x008f }
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x008f }
        r4 = 13;
        r1 = r1[r4];	 Catch:{ ActivityNotFoundException -> 0x008f }
        r0 = r0.getLaunchIntentForPackage(r1);	 Catch:{ ActivityNotFoundException -> 0x008f }
        if (r0 != 0) goto L_0x0084;
    L_0x0074:
        r1 = z;	 Catch:{ ActivityNotFoundException -> 0x008b }
        r4 = 14;
        r1 = r1[r4];	 Catch:{ ActivityNotFoundException -> 0x008b }
        com.whatsapp.util.Log.w(r1);	 Catch:{ ActivityNotFoundException -> 0x008b }
        r1 = 11;
        r6.showDialog(r1);	 Catch:{ ActivityNotFoundException -> 0x008b }
        if (r3 == 0) goto L_0x0087;
    L_0x0084:
        r6.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x008d }
    L_0x0087:
        r0 = r2;
        goto L_0x000d;
    L_0x0089:
        r0 = move-exception;
        throw r0;
    L_0x008b:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x008d }
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        r0 = z;
        r1 = 16;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
        r6.showDialog(r5);
        goto L_0x0087;
    L_0x009d:
        r6.onSearchRequested();
        r0 = r2;
        goto L_0x000d;
    L_0x00a3:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.ListMembersSelector.class;
        r0.<init>(r6, r1);
        r6.startActivity(r0);
        r0 = r2;
        goto L_0x000d;
    L_0x00b0:
        r1 = com.whatsapp.v.b();
        r4 = r1.iterator();
        r1 = r0;
    L_0x00b9:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0151;
    L_0x00bf:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r5 = com.whatsapp.bd.b(r0);	 Catch:{ ActivityNotFoundException -> 0x00fd }
        if (r5 == 0) goto L_0x014f;
    L_0x00cb:
        r5 = com.whatsapp.App.af();	 Catch:{ ActivityNotFoundException -> 0x00ff }
        r5 = r0.contains(r5);	 Catch:{ ActivityNotFoundException -> 0x00ff }
        if (r5 == 0) goto L_0x014f;
    L_0x00d5:
        r0 = com.whatsapp.m8.e(r0);	 Catch:{ ActivityNotFoundException -> 0x0101 }
        if (r0 != 0) goto L_0x014f;
    L_0x00db:
        r1 = r1 + 1;
        r0 = r1;
    L_0x00de:
        if (r3 == 0) goto L_0x014c;
    L_0x00e0:
        r1 = com.whatsapp.ge.a;	 Catch:{ ActivityNotFoundException -> 0x0103 }
        if (r0 < r1) goto L_0x0105;
    L_0x00e4:
        r0 = 2131624379; // 0x7f0e01bb float:1.8875936E38 double:1.0531623755E-314;
        r1 = 1;
        r1 = new java.lang.Object[r1];	 Catch:{ ActivityNotFoundException -> 0x0103 }
        r3 = 0;
        r4 = com.whatsapp.ge.a;	 Catch:{ ActivityNotFoundException -> 0x0103 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ ActivityNotFoundException -> 0x0103 }
        r1[r3] = r4;	 Catch:{ ActivityNotFoundException -> 0x0103 }
        r0 = r6.getString(r0, r1);	 Catch:{ ActivityNotFoundException -> 0x0103 }
        r6.f(r0);	 Catch:{ ActivityNotFoundException -> 0x0103 }
        r0 = r2;
        goto L_0x000d;
    L_0x00fd:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00ff }
    L_0x00ff:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0101 }
    L_0x0101:
        r0 = move-exception;
        throw r0;
    L_0x0103:
        r0 = move-exception;
        throw r0;
    L_0x0105:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.NewGroup.class;
        r0.<init>(r6, r1);
        r6.startActivity(r0);
        r0 = r2;
        goto L_0x000d;
    L_0x0112:
        r0 = com.whatsapp.a12.m();	 Catch:{ ActivityNotFoundException -> 0x0144 }
        if (r0 == 0) goto L_0x0124;
    L_0x0118:
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x0146 }
        r1 = com.whatsapp.WebSessionsActivity.class;
        r0.<init>(r6, r1);	 Catch:{ ActivityNotFoundException -> 0x0146 }
        r6.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x0146 }
        if (r3 == 0) goto L_0x0141;
    L_0x0124:
        r0 = com.whatsapp.App.a();	 Catch:{ ActivityNotFoundException -> 0x0148 }
        if (r0 == 0) goto L_0x0136;
    L_0x012a:
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x014a }
        r1 = com.whatsapp.qrcode.QrCodeActivity.class;
        r0.<init>(r6, r1);	 Catch:{ ActivityNotFoundException -> 0x014a }
        r6.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x014a }
        if (r3 == 0) goto L_0x0141;
    L_0x0136:
        r0 = r6.getBaseContext();	 Catch:{ ActivityNotFoundException -> 0x014a }
        r1 = 2131624584; // 0x7f0e0288 float:1.8876352E38 double:1.053162477E-314;
        r3 = 0;
        com.whatsapp.App.b(r0, r1, r3);	 Catch:{ ActivityNotFoundException -> 0x014a }
    L_0x0141:
        r0 = r2;
        goto L_0x000d;
    L_0x0144:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0146 }
    L_0x0146:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0148 }
    L_0x0148:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x014a }
    L_0x014a:
        r0 = move-exception;
        throw r0;
    L_0x014c:
        r1 = r0;
        goto L_0x00b9;
    L_0x014f:
        r0 = r1;
        goto L_0x00de;
    L_0x0151:
        r0 = r1;
        goto L_0x00e0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversations.onOptionsItemSelected(com.actionbarsherlock.view.MenuItem):boolean");
    }

    protected void onStart() {
        super.onStart();
        ac.a(this.h);
    }

    public void onDestroy() {
        Log.i(z[25]);
        super.onDestroy();
    }

    public static void a(Activity activity, int i) {
        App.q = true;
        App.p.a7();
        activity.showDialog(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu r11) {
        /*
        r10_this = this;
        r9 = 10;
        r8 = 3;
        r7 = 2;
        r2 = 1;
        r1 = 0;
        r3 = com.whatsapp.App.az;
        r4 = r10.getResources();
        r0 = com.whatsapp.v.d();
        if (r0 == 0) goto L_0x0043;
    L_0x0012:
        r0 = r10.getSherlock();
        r5 = new com.whatsapp.amw;
        r5.<init>(r10);
        r0 = com.whatsapp.a_7.a(r10, r0, r5);
        r5 = 7;
        r6 = 2131624804; // 0x7f0e0364 float:1.8876798E38 double:1.0531625855E-314;
        r5 = r11.add(r1, r5, r1, r6);
        r0 = r5.setActionView(r0);
        r5 = 2130838802; // 0x7f020512 float:1.7282597E38 double:1.052774249E-314;
        r0 = r0.setIcon(r5);
        r10.g = r0;
        r0 = r10.g;
        r0.setShowAsAction(r9);
        r0 = r10.g;
        r5 = new com.whatsapp.ke;
        r5.<init>(r10);
        r0.setOnActionExpandListener(r5);
    L_0x0043:
        r0 = 2131624514; // 0x7f0e0242 float:1.887621E38 double:1.053162442E-314;
        r0 = r11.add(r1, r1, r1, r0);
        r5 = 2130838784; // 0x7f020500 float:1.728256E38 double:1.05277424E-314;
        r0 = r0.setIcon(r5);
        r5 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r0 = r0.setAlphabeticShortcut(r5);
        r0.setShowAsAction(r7);
        r0 = android.os.Build.VERSION.SDK_INT;
        r5 = 14;
        if (r0 < r5) goto L_0x006a;
    L_0x0060:
        r0 = android.view.ViewConfiguration.get(r10);
        r0 = r0.hasPermanentMenuKey();
        if (r3 == 0) goto L_0x0073;
    L_0x006a:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x013a }
        r5 = 11;
        if (r0 < r5) goto L_0x0072;
    L_0x0070:
        if (r3 == 0) goto L_0x0142;
    L_0x0072:
        r0 = r2;
    L_0x0073:
        if (r0 == 0) goto L_0x0090;
    L_0x0075:
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = 2131624514; // 0x7f0e0242 float:1.887621E38 double:1.053162442E-314;
        r0 = r11.add(r0, r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x013c }
        r1 = 2130838852; // 0x7f020544 float:1.7282698E38 double:1.0527742736E-314;
        r0 = r0.setIcon(r1);	 Catch:{ IllegalArgumentException -> 0x013c }
        r1 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r0 = r0.setAlphabeticShortcut(r1);	 Catch:{ IllegalArgumentException -> 0x013c }
        r1 = 0;
        r0.setShowAsAction(r1);	 Catch:{ IllegalArgumentException -> 0x013c }
    L_0x0090:
        r0 = 0;
        r1 = 10;
        r2 = 0;
        r3 = 2131624510; // 0x7f0e023e float:1.8876202E38 double:1.05316244E-314;
        r0 = r11.add(r0, r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x013e }
        r1 = 2130838844; // 0x7f02053c float:1.7282682E38 double:1.0527742696E-314;
        r0 = r0.setIcon(r1);	 Catch:{ IllegalArgumentException -> 0x013e }
        r1 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r0.setAlphabeticShortcut(r1);	 Catch:{ IllegalArgumentException -> 0x013e }
        r0 = 0;
        r1 = 9;
        r2 = 0;
        r3 = 2131624511; // 0x7f0e023f float:1.8876204E38 double:1.0531624407E-314;
        r0 = r11.add(r0, r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x013e }
        r1 = 2130838835; // 0x7f020533 float:1.7282664E38 double:1.052774265E-314;
        r0 = r0.setIcon(r1);	 Catch:{ IllegalArgumentException -> 0x013e }
        r1 = 98;
        r0.setAlphabeticShortcut(r1);	 Catch:{ IllegalArgumentException -> 0x013e }
        r0 = com.whatsapp.App.N();	 Catch:{ IllegalArgumentException -> 0x013e }
        if (r0 == 0) goto L_0x00db;
    L_0x00c4:
        r0 = 0;
        r1 = 11;
        r2 = 0;
        r3 = 2131624521; // 0x7f0e0249 float:1.8876224E38 double:1.0531624457E-314;
        r0 = r11.add(r0, r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x013e }
        r1 = 2130838862; // 0x7f02054e float:1.7282718E38 double:1.0527742785E-314;
        r0 = r0.setIcon(r1);	 Catch:{ IllegalArgumentException -> 0x013e }
        r1 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r0.setAlphabeticShortcut(r1);	 Catch:{ IllegalArgumentException -> 0x013e }
    L_0x00db:
        r0 = 0;
        r1 = 4;
        r2 = 0;
        r3 = 2131624508; // 0x7f0e023c float:1.8876198E38 double:1.053162439E-314;
        r0 = r11.add(r0, r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0140 }
        r1 = 2130838840; // 0x7f020538 float:1.7282674E38 double:1.0527742677E-314;
        r0 = r0.setIcon(r1);	 Catch:{ IllegalArgumentException -> 0x0140 }
        r1 = 99;
        r0.setAlphabeticShortcut(r1);	 Catch:{ IllegalArgumentException -> 0x0140 }
        r0 = 0;
        r1 = 2;
        r2 = 0;
        r3 = 2131624519; // 0x7f0e0247 float:1.887622E38 double:1.0531624447E-314;
        r0 = r11.add(r0, r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0140 }
        r1 = 2130838858; // 0x7f02054a float:1.728271E38 double:1.0527742766E-314;
        r0 = r0.setIcon(r1);	 Catch:{ IllegalArgumentException -> 0x0140 }
        r1 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r0.setAlphabeticShortcut(r1);	 Catch:{ IllegalArgumentException -> 0x0140 }
        r0 = 0;
        r1 = 1;
        r2 = 0;
        r3 = 2131624520; // 0x7f0e0248 float:1.8876222E38 double:1.053162445E-314;
        r0 = r11.add(r0, r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0140 }
        r1 = 2130838861; // 0x7f02054d float:1.7282716E38 double:1.052774278E-314;
        r0 = r0.setIcon(r1);	 Catch:{ IllegalArgumentException -> 0x0140 }
        r1 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r0.setAlphabeticShortcut(r1);	 Catch:{ IllegalArgumentException -> 0x0140 }
        r0 = com.whatsapp.App.aa;	 Catch:{ IllegalArgumentException -> 0x0140 }
        if (r0 != r8) goto L_0x0135;
    L_0x0121:
        r0 = 0;
        r1 = 3;
        r2 = 0;
        r3 = 2131624509; // 0x7f0e023d float:1.88762E38 double:1.0531624397E-314;
        r0 = r11.add(r0, r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0140 }
        r1 = 2130838955; // 0x7f0205ab float:1.7282907E38 double:1.0527743245E-314;
        r1 = r4.getDrawable(r1);	 Catch:{ IllegalArgumentException -> 0x0140 }
        r0.setIcon(r1);	 Catch:{ IllegalArgumentException -> 0x0140 }
    L_0x0135:
        r0 = super.onCreateOptionsMenu(r11);
        return r0;
    L_0x013a:
        r0 = move-exception;
        throw r0;
    L_0x013c:
        r0 = move-exception;
        throw r0;
    L_0x013e:
        r0 = move-exception;
        throw r0;
    L_0x0140:
        r0 = move-exception;
        throw r0;
    L_0x0142:
        r0 = r1;
        goto L_0x0073;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversations.onCreateOptionsMenu(com.actionbarsherlock.view.Menu):boolean");
    }

    public boolean onSearchRequested() {
        try {
            if (this.g != null) {
                this.g.expandActionView();
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onPrepareDialog(int r4, android.app.Dialog r5) {
        /*
        r3_this = this;
        r1 = com.whatsapp.App.az;
        switch(r4) {
            case 117: goto L_0x0015;
            case 118: goto L_0x0021;
            case 119: goto L_0x002d;
            case 120: goto L_0x0005;
            case 121: goto L_0x0009;
            default: goto L_0x0005;
        };
    L_0x0005:
        super.onPrepareDialog(r4, r5);	 Catch:{ IllegalArgumentException -> 0x003a }
    L_0x0008:
        return;
    L_0x0009:
        r0 = r5;
        r0 = (android.app.AlertDialog) r0;
        r2 = com.whatsapp.a_3.a();
        r0.setMessage(r2);
        if (r1 == 0) goto L_0x0008;
    L_0x0015:
        r0 = r5;
        r0 = (android.app.AlertDialog) r0;
        r2 = com.whatsapp.a_3.b();
        r0.setMessage(r2);
        if (r1 == 0) goto L_0x0008;
    L_0x0021:
        r0 = r5;
        r0 = (android.app.AlertDialog) r0;
        r2 = com.whatsapp.a_3.c();
        r0.setMessage(r2);
        if (r1 == 0) goto L_0x0008;
    L_0x002d:
        r0 = r5;
        r0 = (android.app.AlertDialog) r0;
        r2 = com.whatsapp.a_3.d();	 Catch:{ IllegalArgumentException -> 0x003a }
        r0.setMessage(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        if (r1 == 0) goto L_0x0008;
    L_0x0039:
        goto L_0x0005;
    L_0x003a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversations.onPrepareDialog(int, android.app.Dialog):void");
    }

    public Conversations() {
        this.h = new a3o(this);
        this.f = null;
    }

    private void d() {
        b1.d();
        a5w.a(new av2(this, null), new Void[0]);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case PBE.MD5 /*0*/:
                return new Builder(this).setTitle(R.string.initialization_fail_title).setMessage(getString(R.string.initialization_fail_message, new Object[]{getString(R.string.connectivity_self_help_instructions)})).setCancelable(false).setPositiveButton(R.string.initialization_fail_retry, new alu(this)).create();
            case ay.f /*1*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setTitle(getString(R.string.register_xmpp_title));
                progressDialog.setMessage(getString(R.string.register_wait_message));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case a6.e /*11*/:
                return new Builder(this).setMessage(R.string.view_contact_unsupport).setNeutralButton(R.string.ok, new nq(this)).create();
            case 115:
                Log.i(z[2]);
                return ac.a((Activity) this);
            case 116:
                return a_3.a((Activity) this, this.f);
            case 117:
                Log.w(z[3]);
                return a_3.b(this);
            case 118:
                Log.w(z[4]);
                return a_3.f(this);
            case 119:
                Log.w(z[6]);
                return a_3.a((Activity) this, false);
            case 120:
                Log.w(z[5]);
                return a_3.d(this);
            case 121:
                Log.w(z[1]);
                return a_3.c(this);
            default:
                return super.onCreateDialog(i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
        r4_this = this;
        r0 = com.whatsapp.App.az;
        r1 = z;
        r2 = 19;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r1 = new com.whatsapp.util.y;
        r2 = z;
        r3 = 17;
        r2 = r2[r3];
        r1.<init>(r2);
        super.onResume();	 Catch:{ IllegalArgumentException -> 0x004c }
        r2 = com.whatsapp.App.an;	 Catch:{ IllegalArgumentException -> 0x004c }
        if (r2 == 0) goto L_0x002c;
    L_0x001d:
        r2 = com.whatsapp.App.aJ;	 Catch:{ IllegalArgumentException -> 0x004e }
        r2 = r2.e();	 Catch:{ IllegalArgumentException -> 0x004e }
        if (r2 == 0) goto L_0x002c;
    L_0x0025:
        r2 = com.whatsapp.App.e(r4);	 Catch:{ IllegalArgumentException -> 0x004e }
        r3 = 3;
        if (r2 == r3) goto L_0x0050;
    L_0x002c:
        r0 = z;
        r1 = 20;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = z;
        r1 = 18;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r4, r1);
        r4.startActivity(r0);
        r4.finish();
    L_0x004b:
        return;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        com.whatsapp.notification.t.b();	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = com.whatsapp.App.V;	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2.stop();	 Catch:{ IllegalArgumentException -> 0x0091 }
        r2 = com.whatsapp.App.al();	 Catch:{ IllegalArgumentException -> 0x0091 }
        if (r2 == 0) goto L_0x0063;
    L_0x005e:
        r4.e();	 Catch:{ IllegalArgumentException -> 0x0093 }
        if (r0 == 0) goto L_0x008d;
    L_0x0063:
        r2 = com.whatsapp.App.X;	 Catch:{ IllegalArgumentException -> 0x0095 }
        if (r2 == 0) goto L_0x0071;
    L_0x0067:
        r2 = new com.whatsapp.DialogToastFragmentActivity$ClockWrongDialogFragment;	 Catch:{ IllegalArgumentException -> 0x0097 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0097 }
        r4.b(r2);	 Catch:{ IllegalArgumentException -> 0x0097 }
        if (r0 == 0) goto L_0x008d;
    L_0x0071:
        r2 = com.whatsapp.App.T;	 Catch:{ IllegalArgumentException -> 0x0099 }
        if (r2 == 0) goto L_0x007f;
    L_0x0075:
        r2 = new com.whatsapp.DialogToastFragmentActivity$SoftwareExpiredDialogFragment;	 Catch:{ IllegalArgumentException -> 0x009b }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x009b }
        r4.b(r2);	 Catch:{ IllegalArgumentException -> 0x009b }
        if (r0 == 0) goto L_0x008d;
    L_0x007f:
        r0 = com.whatsapp.App.aQ();	 Catch:{ IllegalArgumentException -> 0x009d }
        if (r0 == 0) goto L_0x008d;
    L_0x0085:
        r0 = new com.whatsapp.HomeActivity$SoftwareAboutToExpireDialogFragment;	 Catch:{ IllegalArgumentException -> 0x009d }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x009d }
        r4.c(r0);	 Catch:{ IllegalArgumentException -> 0x009d }
    L_0x008d:
        r1.c();
        goto L_0x004b;
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0093 }
    L_0x0093:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0095 }
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0097 }
    L_0x0097:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0099 }
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x009b }
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversations.onResume():void");
    }

    static bt b(Conversations conversations) {
        return conversations.a();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    private void c(DialogFragment dialogFragment) {
        try {
            if (getSupportFragmentManager().findFragmentByTag(dialogFragment.getClass().getName()) == null) {
                dialogFragment.show(getSupportFragmentManager(), dialogFragment.getClass().getName());
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void b(DialogFragment dialogFragment) {
        App.q = true;
        App.p.a7();
        c(dialogFragment);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNewIntent(android.content.Intent r3) {
        /*
        r2_this = this;
        super.onNewIntent(r3);
        r0 = z;
        r1 = 21;
        r0 = r0[r1];
        r0 = r3.getStringExtra(r0);
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x0049 }
        if (r1 != 0) goto L_0x002c;
    L_0x0013:
        r1 = com.whatsapp.bd.f(r0);	 Catch:{ IllegalArgumentException -> 0x004b }
        if (r1 != 0) goto L_0x0020;
    L_0x0019:
        com.whatsapp.App.a(r0);	 Catch:{ IllegalArgumentException -> 0x004d }
        r1 = com.whatsapp.App.az;	 Catch:{ IllegalArgumentException -> 0x004d }
        if (r1 == 0) goto L_0x002c;
    L_0x0020:
        r1 = 1;
        com.whatsapp.App.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x004d }
        r1 = new com.whatsapp.vv;	 Catch:{ IllegalArgumentException -> 0x004d }
        r1.<init>(r2, r0);	 Catch:{ IllegalArgumentException -> 0x004d }
        com.whatsapp.util.br.a(r1);	 Catch:{ IllegalArgumentException -> 0x004d }
    L_0x002c:
        r0 = z;
        r1 = 22;
        r0 = r0[r1];
        r0 = r3.getStringExtra(r0);
        r1 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x004f }
        if (r1 != 0) goto L_0x0048;
    L_0x003c:
        r1 = 1;
        com.whatsapp.App.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x004f }
        r1 = new com.whatsapp.qv;	 Catch:{ IllegalArgumentException -> 0x004f }
        r1.<init>(r2, r0);	 Catch:{ IllegalArgumentException -> 0x004f }
        com.whatsapp.util.br.a(r1);	 Catch:{ IllegalArgumentException -> 0x004f }
    L_0x0048:
        return;
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversations.onNewIntent(android.content.Intent):void");
    }

    private void e() {
        try {
            try {
                if (!ChangeNumber.g()) {
                    this.f = ac.a((Activity) this, false);
                    if (this.f != null) {
                        showDialog(116);
                    }
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private bt a() {
        int i = App.az;
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (fragments != null) {
            for (Fragment fragment : fragments) {
                try {
                    if (!(fragment instanceof ConversationsFragment)) {
                        if (i != 0) {
                            break;
                        }
                    }
                    return (bt) fragment;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
        r2_this = this;
        switch(r3) {
            case 1: goto L_0x0007;
            default: goto L_0x0003;
        };
    L_0x0003:
        super.onActivityResult(r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0025 }
    L_0x0006:
        return;
    L_0x0007:
        r0 = -1;
        if (r4 != r0) goto L_0x0006;
    L_0x000a:
        r0 = z;
        r1 = 0;
        r0 = r0[r1];
        r0 = r5.getStringExtra(r0);
        r1 = com.whatsapp.App.P;
        r0 = r1.a(r0);
        r0 = com.whatsapp.Conversation.a(r0);	 Catch:{ IllegalArgumentException -> 0x0025 }
        r2.startActivity(r0);	 Catch:{ IllegalArgumentException -> 0x0025 }
        r0 = com.whatsapp.App.az;	 Catch:{ IllegalArgumentException -> 0x0025 }
        if (r0 == 0) goto L_0x0006;
    L_0x0024:
        goto L_0x0003;
    L_0x0025:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversations.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
        r5_this = this;
        r4 = 3;
        r0 = com.whatsapp.App.az;
        r1 = new com.whatsapp.util.y;
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r1.<init>(r2);
        r2 = com.whatsapp.App.G;	 Catch:{ IllegalArgumentException -> 0x0049 }
        if (r2 != r4) goto L_0x0014;
    L_0x0011:
        com.whatsapp.util.g.a(r5);	 Catch:{ IllegalArgumentException -> 0x0049 }
    L_0x0014:
        super.onCreate(r6);	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = com.whatsapp.App.an;	 Catch:{ IllegalArgumentException -> 0x004b }
        if (r2 == 0) goto L_0x0029;
    L_0x001b:
        r2 = com.whatsapp.App.aJ;	 Catch:{ IllegalArgumentException -> 0x004d }
        r2 = r2.e();	 Catch:{ IllegalArgumentException -> 0x004d }
        if (r2 == 0) goto L_0x0029;
    L_0x0023:
        r2 = com.whatsapp.App.e(r5);	 Catch:{ IllegalArgumentException -> 0x004d }
        if (r2 == r4) goto L_0x004f;
    L_0x0029:
        r0 = z;
        r1 = 11;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = z;
        r1 = 12;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r5, r1);
        r5.startActivity(r0);
        r5.finish();
    L_0x0048:
        return;
    L_0x0049:
        r0 = move-exception;
        throw r0;
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r2 = com.whatsapp.App.V;	 Catch:{ IllegalArgumentException -> 0x00cc }
        r2.stop();	 Catch:{ IllegalArgumentException -> 0x00cc }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00cc }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00cc }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalArgumentException -> 0x00cc }
        com.whatsapp.App.a5();	 Catch:{ IllegalArgumentException -> 0x00cc }
        r2 = 2130903071; // 0x7f03001f float:1.741295E38 double:1.052806002E-314;
        r5.setContentView(r2);	 Catch:{ IllegalArgumentException -> 0x00cc }
        if (r6 != 0) goto L_0x007f;
    L_0x0068:
        r2 = r5.getSupportFragmentManager();	 Catch:{ IllegalArgumentException -> 0x00cc }
        r2 = r2.beginTransaction();	 Catch:{ IllegalArgumentException -> 0x00cc }
        r3 = 2131427500; // 0x7f0b00ac float:1.8476618E38 double:1.0530651044E-314;
        r4 = new com.whatsapp.ConversationsFragment;	 Catch:{ IllegalArgumentException -> 0x00cc }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x00cc }
        r2 = r2.add(r3, r4);	 Catch:{ IllegalArgumentException -> 0x00cc }
        r2.commit();	 Catch:{ IllegalArgumentException -> 0x00cc }
    L_0x007f:
        r2 = com.whatsapp.App.p;	 Catch:{ IllegalArgumentException -> 0x00ce }
        r2 = r2.x();	 Catch:{ IllegalArgumentException -> 0x00ce }
        if (r2 == 0) goto L_0x009a;
    L_0x0087:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00d0 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r2 = new com.whatsapp.DialogToastFragmentActivity$ClockWrongDialogFragment;	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x00d0 }
        r5.b(r2);	 Catch:{ IllegalArgumentException -> 0x00d0 }
        if (r0 == 0) goto L_0x00c1;
    L_0x009a:
        r2 = com.whatsapp.App.ax();	 Catch:{ IllegalArgumentException -> 0x00d2 }
        if (r2 == 0) goto L_0x00b3;
    L_0x00a0:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x00d4 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r2 = new com.whatsapp.DialogToastFragmentActivity$SoftwareExpiredDialogFragment;	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x00d4 }
        r5.b(r2);	 Catch:{ IllegalArgumentException -> 0x00d4 }
        if (r0 == 0) goto L_0x00c1;
    L_0x00b3:
        r0 = com.whatsapp.App.aQ();	 Catch:{ IllegalArgumentException -> 0x00d6 }
        if (r0 == 0) goto L_0x00c1;
    L_0x00b9:
        r0 = new com.whatsapp.HomeActivity$SoftwareAboutToExpireDialogFragment;	 Catch:{ IllegalArgumentException -> 0x00d6 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x00d6 }
        r5.c(r0);	 Catch:{ IllegalArgumentException -> 0x00d6 }
    L_0x00c1:
        r5.e();
        r5.b();
        r1.c();
        goto L_0x0048;
    L_0x00cc:
        r0 = move-exception;
        throw r0;
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d0 }
    L_0x00d0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d2 }
    L_0x00d2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d4 }
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d6 }
    L_0x00d6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversations.onCreate(android.os.Bundle):void");
    }

    static void a(Conversations conversations) {
        conversations.d();
    }

    protected void onStop() {
        super.onStop();
        ac.b(this.h);
    }
}
