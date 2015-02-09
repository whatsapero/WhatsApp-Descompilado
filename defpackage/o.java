package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal;
import android.provider.ContactsContract.Data;
import android.telephony.PhoneNumberUtils;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.util.Log;
import com.whatsapp.vk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class o {
    public static int a;
    public static HashMap i;
    public static HashMap m;
    private static final String[] z;
    public String b;
    public List c;
    public List d;
    public f e;
    public byte[] f;
    public String g;
    public List h;
    public Map j;
    private Context k;
    public List l;

    public void j(String str) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        int size = this.c.size();
        if (size == 0) {
            a(2, "", null, false);
            size = 1;
        }
        ((l) this.c.get(size - 1)).c = str;
    }

    public void h(String str) {
        int i = a;
        Cursor query = this.k.getContentResolver().query(StructuredPostal.CONTENT_URI, null, z[30], new String[]{str}, null);
        while (query.moveToNext()) {
            a(query);
            if (i != 0) {
                break;
            }
        }
        query.close();
    }

    public void b(String str) {
        int i = a;
        String[] strArr = new String[]{z[28], z[14], z[22], z[26], z[24], z[18], z[15]};
        Cursor query = this.k.getContentResolver().query(Data.CONTENT_URI, strArr, z[25], new String[]{str, z[29]}, null);
        while (query.moveToNext()) {
            this.e.g = query.getString(query.getColumnIndex(z[23]));
            this.e.b = query.getString(query.getColumnIndex(z[27]));
            this.e.c = query.getString(query.getColumnIndex(z[19]));
            this.e.e = query.getString(query.getColumnIndex(z[16]));
            this.e.f = query.getString(query.getColumnIndex(z[20]));
            this.e.h = query.getString(query.getColumnIndex(z[21]));
            this.e.a = query.getString(query.getColumnIndex(z[17]));
            if (i != 0) {
                break;
            }
        }
        query.close();
    }

    public void a(Class cls, int i, String str, String str2, boolean z) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        m mVar = new m();
        mVar.a = cls;
        mVar.e = i;
        mVar.d = str;
        mVar.f = str2;
        mVar.c = z;
        this.d.add(mVar);
    }

    public void f(String str) {
        Cursor query = this.k.getContentResolver().query(Data.CONTENT_URI, null, z[115], new String[]{str, z[111]}, null);
        if (query.moveToFirst()) {
            boolean z;
            String string = query.getString(query.getColumnIndex(z[112]));
            String string2 = query.getString(query.getColumnIndex(z[110]));
            StringBuilder append = new StringBuilder().append(string);
            if (string2 == null || string2.length() == 0) {
                string = "";
            } else {
                string = ";" + string2;
            }
            string2 = append.append(string).toString();
            String string3 = query.getString(query.getColumnIndex(z[114]));
            if (query.getInt(query.getColumnIndex(z[113])) == 1) {
                z = true;
            } else {
                z = false;
            }
            a(1, string2, string3, z);
        }
        query.close();
    }

    public void a(Cursor cursor) {
        boolean z;
        boolean z2 = false;
        int i = a;
        if (this.d == null) {
            this.d = new ArrayList();
        }
        m mVar = new m();
        mVar.a = StructuredPostal.class;
        mVar.e = cursor.getInt(cursor.getColumnIndex(z[38]));
        mVar.d = cursor.getString(cursor.getColumnIndex(z[35]));
        mVar.b = new p();
        String string = cursor.getString(cursor.getColumnIndex(z[42]));
        if (string != null) {
            mVar.b.a = string.replaceAll(z[39], " ");
        }
        mVar.b.b = cursor.getString(cursor.getColumnIndex(z[41]));
        mVar.b.c = cursor.getString(cursor.getColumnIndex(z[44]));
        mVar.b.d = cursor.getString(cursor.getColumnIndex(z[40]));
        mVar.b.e = cursor.getString(cursor.getColumnIndex(z[37]));
        mVar.f = cursor.getString(cursor.getColumnIndex(z[43]));
        if (cursor.getInt(cursor.getColumnIndex(z[36])) == 1) {
            z = true;
        } else {
            z = false;
        }
        mVar.c = z;
        this.d.add(mVar);
        if (i != 0) {
            if (!DialogToastActivity.i) {
                z2 = true;
            }
            DialogToastActivity.i = z2;
        }
    }

    public void a(int i, String str, p pVar, String str2, boolean z) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        m mVar = new m();
        mVar.a = StructuredPostal.class;
        mVar.e = i;
        mVar.d = str;
        mVar.b = pVar;
        mVar.f = str2;
        mVar.c = z;
        this.d.add(mVar);
    }

    public static o a(String str) {
        if (str == null) {
            return null;
        }
        a aVar = new a();
        n nVar = new n();
        if (!aVar.a(str, z[121], nVar)) {
            Log.w(z[120] + str);
        }
        Iterator it = nVar.e.iterator();
        return it.hasNext() ? a((q) it.next(), 0, str) : null;
    }

    public void i(String str) {
        int i = a;
        Cursor query = this.k.getContentResolver().query(Data.CONTENT_URI, null, z[117], new String[]{str, z[119]}, null);
        while (query.moveToNext()) {
            int i2 = query.getInt(query.getColumnIndex(z[116]));
            j jVar = new j();
            jVar.d = query.getString(query.getColumnIndex(z[118]));
            String string = this.k.getString(Im.getProtocolLabelResource(i2));
            for (Entry entry : i.entrySet()) {
                if (((String) entry.getValue()).equalsIgnoreCase(string)) {
                    jVar.e = (String) entry.getKey();
                    continue;
                }
                if (i != 0) {
                    break;
                }
            }
            jVar.a(this.k.getString(Im.getTypeLabelResource(i2)));
            a(jVar);
            if (i != 0) {
                break;
            }
        }
        query.close();
    }

    public void a(int i, String str, String str2, boolean z) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        l lVar = new l();
        lVar.b = i;
        lVar.d = str;
        lVar.c = str2;
        lVar.a = z;
        this.c.add(lVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.o a(defpackage.q r20, int r21, java.lang.String r22) {
        /*
        r12 = a;
        r0 = r20;
        r1 = r0.c;
        r2 = z;
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r2 = r2[r3];
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x001d;
    L_0x0012:
        r1 = z;
        r2 = 60;
        r1 = r1[r2];
        com.whatsapp.util.Log.e(r1);
        r1 = 0;
    L_0x001c:
        return r1;
    L_0x001d:
        r1 = new o;
        r1.<init>();
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r0 = r20;
        r6 = r0.a;
        r13 = r6.iterator();
        r8 = r2;
        r9 = r3;
        r10 = r4;
        r3 = r5;
    L_0x0032:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x0709;
    L_0x0038:
        r2 = r13.next();
        r7 = r2;
        r7 = (defpackage.j) r7;
        r14 = r7.e;
        r2 = r7.d;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 == 0) goto L_0x004b;
    L_0x0049:
        if (r12 == 0) goto L_0x0032;
    L_0x004b:
        r2 = z;
        r4 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r2 = r2[r4];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x00de;
    L_0x0057:
        r2 = r8;
        r4 = r10;
        r5 = r3;
        r3 = r9;
    L_0x005b:
        if (r12 == 0) goto L_0x06bb;
    L_0x005d:
        r8 = r2;
    L_0x005e:
        if (r4 != 0) goto L_0x0078;
    L_0x0060:
        r2 = r1.h;
        if (r2 == 0) goto L_0x0078;
    L_0x0064:
        r2 = r1.h;
        r2 = r2.size();
        if (r2 <= 0) goto L_0x0078;
    L_0x006c:
        r2 = r1.h;
        r4 = 0;
        r2 = r2.get(r4);
        r2 = (defpackage.k) r2;
        r4 = 1;
        r2.c = r4;
    L_0x0078:
        if (r5 != 0) goto L_0x009d;
    L_0x007a:
        r2 = r1.d;
        if (r2 == 0) goto L_0x009d;
    L_0x007e:
        r2 = r1.d;
        r4 = r2.iterator();
    L_0x0084:
        r2 = r4.hasNext();
        if (r2 == 0) goto L_0x009d;
    L_0x008a:
        r2 = r4.next();
        r2 = (defpackage.m) r2;
        r5 = r2.a;
        r6 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class;
        if (r5 != r6) goto L_0x009b;
    L_0x0096:
        r5 = 1;
        r2.c = r5;
        if (r12 == 0) goto L_0x009d;
    L_0x009b:
        if (r12 == 0) goto L_0x0084;
    L_0x009d:
        if (r3 != 0) goto L_0x00c2;
    L_0x009f:
        r2 = r1.d;
        if (r2 == 0) goto L_0x00c2;
    L_0x00a3:
        r2 = r1.d;
        r3 = r2.iterator();
    L_0x00a9:
        r2 = r3.hasNext();
        if (r2 == 0) goto L_0x00c2;
    L_0x00af:
        r2 = r3.next();
        r2 = (defpackage.m) r2;
        r4 = r2.a;
        r5 = android.provider.ContactsContract.CommonDataKinds.Email.class;
        if (r4 != r5) goto L_0x00c0;
    L_0x00bb:
        r4 = 1;
        r2.c = r4;
        if (r12 == 0) goto L_0x00c2;
    L_0x00c0:
        if (r12 == 0) goto L_0x00a9;
    L_0x00c2:
        if (r8 != 0) goto L_0x001c;
    L_0x00c4:
        r2 = r1.c;
        if (r2 == 0) goto L_0x001c;
    L_0x00c8:
        r2 = r1.c;
        r2 = r2.size();
        if (r2 <= 0) goto L_0x001c;
    L_0x00d0:
        r2 = r1.c;
        r3 = 0;
        r2 = r2.get(r3);
        r2 = (defpackage.l) r2;
        r3 = 1;
        r2.a = r3;
        goto L_0x001c;
    L_0x00de:
        r2 = z;
        r4 = 65;
        r2 = r2[r4];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x00f2;
    L_0x00ea:
        r2 = r1.e;
        r4 = r7.d;
        r2.d = r4;
        if (r12 == 0) goto L_0x0703;
    L_0x00f2:
        r2 = z;
        r4 = 67;
        r2 = r2[r4];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x010c;
    L_0x00fe:
        r2 = r1.e;
        r2 = r2.d;
        if (r2 != 0) goto L_0x010c;
    L_0x0104:
        r2 = r1.e;
        r4 = r7.d;
        r2.d = r4;
        if (r12 == 0) goto L_0x0703;
    L_0x010c:
        r2 = "N";
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x011f;
    L_0x0114:
        r2 = r1.e;
        r4 = r7.a;
        r0 = r21;
        a(r2, r4, r0);
        if (r12 == 0) goto L_0x0703;
    L_0x011f:
        r2 = z;
        r4 = 99;
        r2 = r2[r4];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0131;
    L_0x012b:
        r2 = r7.d;
        r1.g = r2;
        if (r12 == 0) goto L_0x0703;
    L_0x0131:
        r2 = z;
        r4 = 80;
        r2 = r2[r4];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0179;
    L_0x013d:
        r2 = r7.g;
        r4 = z;
        r5 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r4 = r4[r5];
        r2 = r2.contains(r4);
        if (r2 == 0) goto L_0x0174;
    L_0x014b:
        r2 = r1.g;
        if (r2 != 0) goto L_0x0174;
    L_0x014f:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = r7.d;
        r6 = r5.length();
        r2 = 0;
    L_0x015b:
        if (r2 >= r6) goto L_0x016c;
    L_0x015d:
        r11 = r5.charAt(r2);
        r15 = 59;
        if (r11 == r15) goto L_0x0168;
    L_0x0165:
        r4.append(r11);
    L_0x0168:
        r2 = r2 + 1;
        if (r12 == 0) goto L_0x015b;
    L_0x016c:
        r2 = r4.toString();
        r1.g = r2;
        if (r12 == 0) goto L_0x0703;
    L_0x0174:
        r1.a(r7);
        if (r12 == 0) goto L_0x0703;
    L_0x0179:
        r2 = z;
        r4 = 87;
        r2 = r2[r4];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0700;
    L_0x0185:
        r4 = r7.a;
        r2 = 1;
        r5 = r4.iterator();
        r4 = r2;
    L_0x018d:
        r2 = r5.hasNext();
        if (r2 == 0) goto L_0x06fd;
    L_0x0193:
        r2 = r5.next();
        r2 = (java.lang.String) r2;
        r2 = r2.length();
        if (r2 <= 0) goto L_0x06fa;
    L_0x019f:
        r2 = 0;
        if (r12 == 0) goto L_0x01a4;
    L_0x01a2:
        if (r12 == 0) goto L_0x06f7;
    L_0x01a4:
        if (r2 == 0) goto L_0x01a8;
    L_0x01a6:
        if (r12 == 0) goto L_0x0032;
    L_0x01a8:
        r5 = -1;
        r4 = "";
        r2 = 0;
        r6 = r7.g;
        r11 = r6.iterator();
        r6 = r3;
        r3 = r2;
    L_0x01b4:
        r2 = r11.hasNext();
        if (r2 == 0) goto L_0x06eb;
    L_0x01ba:
        r2 = r11.next();
        r2 = (java.lang.String) r2;
        r15 = z;
        r16 = 72;
        r15 = r15[r16];
        r15 = r2.equals(r15);
        if (r15 == 0) goto L_0x01d2;
    L_0x01cc:
        if (r6 != 0) goto L_0x01d2;
    L_0x01ce:
        r6 = 1;
        r3 = 1;
        if (r12 == 0) goto L_0x06e5;
    L_0x01d2:
        r15 = z;
        r16 = 82;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 == 0) goto L_0x01e3;
    L_0x01de:
        r5 = 1;
        r4 = "";
        if (r12 == 0) goto L_0x06e5;
    L_0x01e3:
        r15 = z;
        r16 = 63;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 != 0) goto L_0x01fb;
    L_0x01ef:
        r15 = z;
        r16 = 100;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 == 0) goto L_0x0200;
    L_0x01fb:
        r5 = 2;
        r4 = "";
        if (r12 == 0) goto L_0x06e5;
    L_0x0200:
        r15 = z;
        r16 = 84;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 == 0) goto L_0x0624;
    L_0x020c:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
    L_0x0210:
        if (r12 == 0) goto L_0x06f1;
    L_0x0212:
        r6 = r2;
        r11 = r5;
        r2 = r4;
        r5 = r3;
    L_0x0216:
        if (r2 >= 0) goto L_0x0219;
    L_0x0218:
        r2 = 1;
    L_0x0219:
        r15 = r7.a;
        r3 = r15.size();
        r4 = 0;
        r16 = 1;
        r0 = r16;
        if (r3 <= r0) goto L_0x0674;
    L_0x0226:
        r4 = new p;
        r4.<init>();
        r3 = r15.size();
        r16 = 2;
        r0 = r16;
        if (r3 <= r0) goto L_0x023e;
    L_0x0235:
        r3 = 2;
        r3 = r15.get(r3);
        r3 = (java.lang.String) r3;
        r4.a = r3;
    L_0x023e:
        r3 = r15.size();
        r16 = 3;
        r0 = r16;
        if (r3 <= r0) goto L_0x0251;
    L_0x0248:
        r3 = 3;
        r3 = r15.get(r3);
        r3 = (java.lang.String) r3;
        r4.b = r3;
    L_0x0251:
        r3 = r15.size();
        r16 = 4;
        r0 = r16;
        if (r3 <= r0) goto L_0x0264;
    L_0x025b:
        r3 = 4;
        r3 = r15.get(r3);
        r3 = (java.lang.String) r3;
        r4.c = r3;
    L_0x0264:
        r3 = r15.size();
        r16 = 5;
        r0 = r16;
        if (r3 <= r0) goto L_0x0277;
    L_0x026e:
        r3 = 5;
        r3 = r15.get(r3);
        r3 = (java.lang.String) r3;
        r4.d = r3;
    L_0x0277:
        r3 = r15.size();
        r16 = 6;
        r0 = r16;
        if (r3 <= r0) goto L_0x028a;
    L_0x0281:
        r3 = 6;
        r3 = r15.get(r3);
        r3 = (java.lang.String) r3;
        r4.e = r3;
    L_0x028a:
        r3 = r15.size();
        r16 = 7;
        r0 = r16;
        if (r3 <= r0) goto L_0x029f;
    L_0x0294:
        r3 = 7;
        r3 = r15.get(r3);
        r3 = (java.lang.String) r3;
        r4.f = r3;
        if (r12 == 0) goto L_0x02bb;
    L_0x029f:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r15 = z;
        r16 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r15 = r15[r16];
        r3 = r3.append(r15);
        r0 = r22;
        r3 = r3.append(r0);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
    L_0x02bb:
        r3 = r4.toString();
        r3 = r3.trim();
    L_0x02c3:
        r1.a(r2, r3, r4, r5, r6);
        if (r12 == 0) goto L_0x06b5;
    L_0x02c8:
        r2 = z;
        r3 = 73;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x032f;
    L_0x02d4:
        r4 = 1;
        r2 = 0;
        r3 = r7.g;
        r5 = r3.iterator();
        r3 = r2;
    L_0x02dd:
        r2 = r5.hasNext();
        if (r2 == 0) goto L_0x02fd;
    L_0x02e3:
        r2 = r5.next();
        r2 = (java.lang.String) r2;
        r6 = z;
        r15 = 95;
        r6 = r6[r15];
        r2 = r2.equals(r6);
        if (r2 == 0) goto L_0x06e2;
    L_0x02f5:
        if (r8 != 0) goto L_0x06e2;
    L_0x02f7:
        r8 = 1;
        r3 = 1;
        r2 = r3;
    L_0x02fa:
        if (r12 == 0) goto L_0x06df;
    L_0x02fc:
        r3 = r2;
    L_0x02fd:
        r2 = r7.a;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = r2.iterator();
    L_0x0308:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x0324;
    L_0x030e:
        r2 = r6.next();
        r2 = (java.lang.String) r2;
        r5.append(r2);
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x0308;
    L_0x031d:
        r2 = 32;
        r5.append(r2);
        if (r12 == 0) goto L_0x0308;
    L_0x0324:
        r2 = r5.toString();
        r5 = "";
        r1.a(r4, r2, r5, r3);
        if (r12 == 0) goto L_0x06b5;
    L_0x032f:
        r2 = z;
        r3 = 96;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0342;
    L_0x033b:
        r2 = r7.d;
        r1.j(r2);
        if (r12 == 0) goto L_0x06b5;
    L_0x0342:
        r2 = z;
        r3 = 70;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0355;
    L_0x034e:
        r2 = r7.d;
        r1.j(r2);
        if (r12 == 0) goto L_0x06b5;
    L_0x0355:
        r2 = z;
        r3 = 83;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x036b;
    L_0x0361:
        r2 = r7.d;
        r2 = r2.getBytes();
        r1.f = r2;
        if (r12 == 0) goto L_0x06b5;
    L_0x036b:
        r2 = z;
        r3 = 55;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0382;
    L_0x0377:
        r2 = z;
        r3 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r2 = r2[r3];
        com.whatsapp.util.Log.e(r2);
        if (r12 == 0) goto L_0x06b5;
    L_0x0382:
        r2 = z;
        r3 = 50;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0419;
    L_0x038e:
        r4 = -1;
        r3 = 0;
        r2 = 0;
        r5 = r7.g;
        r6 = r5.iterator();
        r5 = r4;
        r4 = r3;
        r3 = r2;
    L_0x039a:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x06d5;
    L_0x03a0:
        r2 = r6.next();
        r2 = (java.lang.String) r2;
        r15 = z;
        r16 = 74;
        r15 = r15[r16];
        r15 = r2.equals(r15);
        if (r15 == 0) goto L_0x03b8;
    L_0x03b2:
        if (r9 != 0) goto L_0x03b8;
    L_0x03b4:
        r9 = 1;
        r3 = 1;
        if (r12 == 0) goto L_0x06d0;
    L_0x03b8:
        r15 = z;
        r16 = 61;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 == 0) goto L_0x03c7;
    L_0x03c4:
        r5 = 1;
        if (r12 == 0) goto L_0x06d0;
    L_0x03c7:
        r15 = z;
        r16 = 57;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 == 0) goto L_0x03d6;
    L_0x03d3:
        r5 = 2;
        if (r12 == 0) goto L_0x06d0;
    L_0x03d6:
        r15 = z;
        r16 = 66;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 == 0) goto L_0x03e5;
    L_0x03e2:
        r5 = 4;
        if (r12 == 0) goto L_0x06d0;
    L_0x03e5:
        r15 = r2.toUpperCase();
        r16 = z;
        r17 = 98;
        r16 = r16[r17];
        r15 = r15.startsWith(r16);
        if (r15 == 0) goto L_0x03ff;
    L_0x03f5:
        if (r5 >= 0) goto L_0x03ff;
    L_0x03f7:
        r5 = 0;
        r4 = 2;
        r4 = r2.substring(r4);
        if (r12 == 0) goto L_0x06d0;
    L_0x03ff:
        if (r5 >= 0) goto L_0x06d0;
    L_0x0401:
        r5 = 0;
        r4 = r5;
        r19 = r2;
        r2 = r3;
        r3 = r19;
    L_0x0408:
        if (r12 == 0) goto L_0x06da;
    L_0x040a:
        r6 = r2;
        r5 = r3;
        r3 = r4;
    L_0x040d:
        if (r3 >= 0) goto L_0x0410;
    L_0x040f:
        r3 = 3;
    L_0x0410:
        r2 = android.provider.ContactsContract.CommonDataKinds.Email.class;
        r4 = r7.d;
        r1.a(r2, r3, r4, r5, r6);
        if (r12 == 0) goto L_0x06b5;
    L_0x0419:
        r2 = z;
        r3 = 68;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x04fb;
    L_0x0425:
        r5 = -1;
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r6 = r7.g;
        r15 = r6.iterator();
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
    L_0x0433:
        r2 = r15.hasNext();
        if (r2 == 0) goto L_0x06c7;
    L_0x0439:
        r2 = r15.next();
        r2 = (java.lang.String) r2;
        if (r3 == 0) goto L_0x0463;
    L_0x0441:
        r16 = z;
        r17 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equals(r0);
        if (r16 == 0) goto L_0x0452;
    L_0x044f:
        r6 = 5;
        if (r12 == 0) goto L_0x06c7;
    L_0x0452:
        r16 = z;
        r17 = 90;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equals(r0);
        if (r16 == 0) goto L_0x06c7;
    L_0x0460:
        r6 = 4;
        if (r12 == 0) goto L_0x06c7;
    L_0x0463:
        r16 = z;
        r17 = 81;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equals(r0);
        if (r16 == 0) goto L_0x0477;
    L_0x0471:
        if (r10 != 0) goto L_0x0477;
    L_0x0473:
        r10 = 1;
        r4 = 1;
        if (r12 == 0) goto L_0x06c1;
    L_0x0477:
        r16 = z;
        r17 = 64;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equalsIgnoreCase(r0);
        if (r16 == 0) goto L_0x0488;
    L_0x0485:
        r6 = 1;
        if (r12 == 0) goto L_0x06c1;
    L_0x0488:
        r16 = z;
        r17 = 58;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equalsIgnoreCase(r0);
        if (r16 == 0) goto L_0x0499;
    L_0x0496:
        r6 = 3;
        if (r12 == 0) goto L_0x06c1;
    L_0x0499:
        r16 = z;
        r17 = 49;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equalsIgnoreCase(r0);
        if (r16 == 0) goto L_0x04aa;
    L_0x04a7:
        r6 = 2;
        if (r12 == 0) goto L_0x06c1;
    L_0x04aa:
        r16 = z;
        r17 = 75;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equalsIgnoreCase(r0);
        if (r16 == 0) goto L_0x04bb;
    L_0x04b8:
        r6 = 6;
        if (r12 == 0) goto L_0x06c1;
    L_0x04bb:
        r16 = z;
        r17 = 54;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equalsIgnoreCase(r0);
        if (r16 == 0) goto L_0x04cc;
    L_0x04c9:
        r3 = 1;
        if (r12 == 0) goto L_0x06c1;
    L_0x04cc:
        r16 = z;
        r17 = 51;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equalsIgnoreCase(r0);
        if (r16 != 0) goto L_0x06c1;
    L_0x04da:
        r16 = z;
        r17 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r16 = r16[r17];
        r0 = r16;
        r16 = r2.equalsIgnoreCase(r0);
        if (r16 == 0) goto L_0x0678;
    L_0x04e8:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
    L_0x04ec:
        if (r12 == 0) goto L_0x06ca;
    L_0x04ee:
        r2 = r5;
        r5 = r4;
        r4 = r3;
    L_0x04f1:
        if (r2 >= 0) goto L_0x04f4;
    L_0x04f3:
        r2 = 1;
    L_0x04f4:
        r3 = r7.d;
        r1.b(r2, r3, r5, r4);
        if (r12 == 0) goto L_0x06b5;
    L_0x04fb:
        r2 = z;
        r3 = 86;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0510;
    L_0x0507:
        r2 = r1.l;
        r3 = r7.d;
        r2.add(r3);
        if (r12 == 0) goto L_0x06b5;
    L_0x0510:
        r2 = z;
        r3 = 94;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0521;
    L_0x051c:
        r1.a(r7);
        if (r12 == 0) goto L_0x06b5;
    L_0x0521:
        r2 = z;
        r3 = 76;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0532;
    L_0x052d:
        r1.a(r7);
        if (r12 == 0) goto L_0x06b5;
    L_0x0532:
        r2 = z;
        r3 = 69;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0543;
    L_0x053e:
        r1.a(r7);
        if (r12 == 0) goto L_0x06b5;
    L_0x0543:
        r2 = z;
        r3 = 91;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0554;
    L_0x054f:
        r1.a(r7);
        if (r12 == 0) goto L_0x06b5;
    L_0x0554:
        r2 = z;
        r3 = 71;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0565;
    L_0x0560:
        r1.a(r7);
        if (r12 == 0) goto L_0x06b5;
    L_0x0565:
        r2 = z;
        r3 = 77;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0576;
    L_0x0571:
        r1.a(r7);
        if (r12 == 0) goto L_0x06b5;
    L_0x0576:
        r2 = z;
        r3 = 88;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0587;
    L_0x0582:
        r1.a(r7);
        if (r12 == 0) goto L_0x06b5;
    L_0x0587:
        r2 = z;
        r3 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0598;
    L_0x0593:
        r1.a(r7);
        if (r12 == 0) goto L_0x06b5;
    L_0x0598:
        r2 = z;
        r3 = 53;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x05a9;
    L_0x05a4:
        r1.a(r7);
        if (r12 == 0) goto L_0x06b5;
    L_0x05a9:
        r2 = z;
        r3 = 48;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x05ba;
    L_0x05b5:
        r1.a(r7);
        if (r12 == 0) goto L_0x06b5;
    L_0x05ba:
        r2 = z;
        r3 = 79;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x05cb;
    L_0x05c6:
        r1.a(r7);
        if (r12 == 0) goto L_0x06b5;
    L_0x05cb:
        r2 = z;
        r3 = 89;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x05dc;
    L_0x05d7:
        r1.a(r7);
        if (r12 == 0) goto L_0x06b5;
    L_0x05dc:
        r2 = z;
        r3 = 78;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x05ed;
    L_0x05e8:
        r1.a(r7);
        if (r12 == 0) goto L_0x06b5;
    L_0x05ed:
        r2 = z;
        r3 = 92;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x05fe;
    L_0x05f9:
        r1.a(r7);
        if (r12 == 0) goto L_0x06b5;
    L_0x05fe:
        r2 = z;
        r3 = 85;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x0612;
    L_0x060a:
        r2 = r1.e;
        r3 = r7.d;
        r2.h = r3;
        if (r12 == 0) goto L_0x06b5;
    L_0x0612:
        r2 = z;
        r3 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x069e;
    L_0x061e:
        r2 = r8;
        r3 = r9;
        r4 = r10;
        r5 = r11;
        goto L_0x005b;
    L_0x0624:
        r15 = z;
        r16 = 97;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 != 0) goto L_0x06e5;
    L_0x0630:
        r15 = z;
        r16 = 59;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 != 0) goto L_0x06e5;
    L_0x063c:
        r15 = z;
        r16 = 62;
        r15 = r15[r16];
        r15 = r2.equalsIgnoreCase(r15);
        if (r15 == 0) goto L_0x064e;
    L_0x0648:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        goto L_0x0210;
    L_0x064e:
        r15 = r2.toUpperCase();
        r16 = z;
        r17 = 56;
        r16 = r16[r17];
        r15 = r15.startsWith(r16);
        if (r15 == 0) goto L_0x0668;
    L_0x065e:
        if (r5 >= 0) goto L_0x0668;
    L_0x0660:
        r5 = 0;
        r4 = 2;
        r4 = r2.substring(r4);
        if (r12 == 0) goto L_0x06e5;
    L_0x0668:
        if (r5 >= 0) goto L_0x06e5;
    L_0x066a:
        r5 = 0;
        r4 = r5;
        r5 = r6;
        r19 = r3;
        r3 = r2;
        r2 = r19;
        goto L_0x0210;
    L_0x0674:
        r3 = r7.d;
        goto L_0x02c3;
    L_0x0678:
        r16 = r2.toUpperCase();
        r17 = z;
        r18 = 52;
        r17 = r17[r18];
        r16 = r16.startsWith(r17);
        if (r16 == 0) goto L_0x0692;
    L_0x0688:
        if (r6 >= 0) goto L_0x0692;
    L_0x068a:
        r6 = 0;
        r5 = 2;
        r5 = r2.substring(r5);
        if (r12 == 0) goto L_0x06c1;
    L_0x0692:
        if (r6 >= 0) goto L_0x06c1;
    L_0x0694:
        r6 = 0;
        r5 = r6;
        r19 = r4;
        r4 = r2;
        r2 = r3;
        r3 = r19;
        goto L_0x04ec;
    L_0x069e:
        r2 = z;
        r3 = 93;
        r2 = r2[r3];
        r2 = r14.equals(r2);
        if (r2 == 0) goto L_0x06b2;
    L_0x06aa:
        r2 = r1.e;
        r3 = r7.d;
        r2.a = r3;
        if (r12 == 0) goto L_0x06b5;
    L_0x06b2:
        r1.a(r7);
    L_0x06b5:
        r2 = r8;
        r3 = r9;
        r4 = r10;
        r5 = r11;
        goto L_0x005b;
    L_0x06bb:
        r8 = r2;
        r9 = r3;
        r10 = r4;
        r3 = r5;
        goto L_0x0032;
    L_0x06c1:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        goto L_0x04ec;
    L_0x06c7:
        r2 = r6;
        goto L_0x04f1;
    L_0x06ca:
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        goto L_0x0433;
    L_0x06d0:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        goto L_0x0408;
    L_0x06d5:
        r6 = r3;
        r3 = r5;
        r5 = r4;
        goto L_0x040d;
    L_0x06da:
        r5 = r4;
        r4 = r3;
        r3 = r2;
        goto L_0x039a;
    L_0x06df:
        r3 = r2;
        goto L_0x02dd;
    L_0x06e2:
        r2 = r3;
        goto L_0x02fa;
    L_0x06e5:
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        goto L_0x0210;
    L_0x06eb:
        r2 = r5;
        r11 = r6;
        r6 = r3;
        r5 = r4;
        goto L_0x0216;
    L_0x06f1:
        r6 = r5;
        r5 = r4;
        r4 = r3;
        r3 = r2;
        goto L_0x01b4;
    L_0x06f7:
        r4 = r2;
        goto L_0x018d;
    L_0x06fa:
        r2 = r4;
        goto L_0x01a2;
    L_0x06fd:
        r2 = r4;
        goto L_0x01a4;
    L_0x0700:
        r11 = r3;
        goto L_0x02c8;
    L_0x0703:
        r2 = r8;
        r4 = r10;
        r5 = r3;
        r3 = r9;
        goto L_0x005b;
    L_0x0709:
        r4 = r10;
        r5 = r3;
        r3 = r9;
        goto L_0x005e;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o.a(q, int, java.lang.String):o");
    }

    public void c(String str) {
        Cursor query = this.k.getContentResolver().query(Data.CONTENT_URI, null, z[2], new String[]{str, z[3]}, null);
        if (query.moveToFirst()) {
            j jVar = new j();
            jVar.e = z[0];
            jVar.d = query.getString(query.getColumnIndex(z[1]));
            a(jVar);
        }
        query.close();
    }

    public void d(String str) {
        int i = a;
        Cursor query = this.k.getContentResolver().query(Phone.CONTENT_URI, null, z[12], new String[]{str}, null);
        while (query.moveToNext()) {
            boolean z;
            int i2 = query.getInt(query.getColumnIndex(z[9]));
            String string = query.getString(query.getColumnIndex(z[13]));
            String string2 = query.getString(query.getColumnIndex(z[10]));
            if (query.getInt(query.getColumnIndex(z[11])) == 1) {
                z = true;
            } else {
                z = false;
            }
            b(i2, string, string2, z);
            if (i != 0) {
                break;
            }
        }
        query.close();
    }

    public void b(int i, String str, String str2, boolean z) {
        int i2 = a;
        if (this.h == null) {
            this.h = new ArrayList();
        }
        k kVar = new k();
        kVar.b = i;
        StringBuilder stringBuilder = new StringBuilder();
        String trim = str.trim();
        int length = trim.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt = trim.charAt(i3);
            if (('0' <= charAt && charAt <= '9') || ((i3 == 0 && charAt == '+') || charAt == ',')) {
                stringBuilder.append(charAt);
            }
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        kVar.d = PhoneNumberUtils.formatNumber(stringBuilder.toString());
        kVar.a = str2;
        kVar.c = z;
        this.h.add(kVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.j r4) {
        /*
        r3_this = this;
        r0 = r4.d;
        if (r0 == 0) goto L_0x000c;
    L_0x0004:
        r0 = r4.d;
        r0 = r0.length();
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r1 = r4.e;
        r0 = r3.j;
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r0 = new java.util.HashMap;
        r0.<init>();
        r3.j = r0;
    L_0x001a:
        r0 = r3.j;
        r0 = r0.containsKey(r1);
        if (r0 != 0) goto L_0x0030;
    L_0x0022:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r2 = r3.j;
        r2.put(r1, r0);
        r2 = a;
        if (r2 == 0) goto L_0x0038;
    L_0x0030:
        r0 = r3.j;
        r0 = r0.get(r1);
        r0 = (java.util.List) r0;
    L_0x0038:
        r0.add(r4);
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o.a(j):void");
    }

    public static byte[] a(Context context, String str) {
        Cursor query = context.getContentResolver().query(Data.CONTENT_URI, new String[]{z[46]}, z[45], new String[]{str, z[47]}, null);
        return query.moveToFirst() ? query.getBlob(0) : null;
    }

    public String a() {
        int i = a;
        if (this.e.d != null) {
            return this.e.d;
        }
        if (this.d != null && this.d.size() > 0) {
            for (m mVar : this.d) {
                if (mVar.a != Email.class || !mVar.c) {
                    if (i != 0) {
                        break;
                    }
                }
                return mVar.d;
            }
        }
        if (this.h != null && this.h.size() > 0) {
            for (k kVar : this.h) {
                if (!kVar.c) {
                    if (i != 0) {
                        break;
                    }
                }
                return kVar.d;
            }
        }
        return "";
    }

    public o() {
        this.e = new f();
        this.l = new ArrayList();
    }

    public void e(String str) {
        int i = a;
        Cursor query = this.k.getContentResolver().query(Email.CONTENT_URI, null, z[4], new String[]{str}, null);
        while (query.moveToNext()) {
            boolean z;
            Class cls = Email.class;
            int i2 = query.getInt(query.getColumnIndex(z[8]));
            String string = query.getString(query.getColumnIndex(z[6]));
            String string2 = query.getString(query.getColumnIndex(z[7]));
            if (query.getInt(query.getColumnIndex(z[5])) == 1) {
                z = true;
            } else {
                z = false;
            }
            a(cls, i2, string, string2, z);
            if (i != 0) {
                break;
            }
        }
        query.close();
    }

    static {
        String[] strArr = new String[122];
        String str = "\u0006L\u0013\r6\tH\u0015";
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
                        i4 = 72;
                        break;
                    case ay.f /*1*/:
                        i4 = 5;
                        break;
                    case ay.n /*2*/:
                        i4 = 80;
                        break;
                    case ay.p /*3*/:
                        i4 = 70;
                        break;
                    default:
                        i4 = 120;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = "+j>2\u0019+q\u000f/\u001ch8pyX\tK\u0014f\u0015!h52\u00018`p{Xw";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = ">k4h\u0019&a\")\u0011,+33\n;j\"h\u0011<`=i\u0016!f;(\u0019%`";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "+j>2\u0019+q\u000f/\u001ch8py";
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    str = "!v\u000f6\n!h14\u0001";
                    i = 4;
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    strArr2 = strArr3;
                    str = ",d$'I";
                    i = 5;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = ",d$'K";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = ",d$'J";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = ",d$'J";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = ",d$'K";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "!v\u000f6\n!h14\u0001";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "+j>2\u0019+q\u000f/\u001ch8py";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = ",d$'I";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = ",d$'K";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = ",d$'A";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = ",d$'L";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = ",d$'A";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = ",d$'O";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = ",d$'M";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = ",d$'N";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = ",d$'O";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = ",d$'M";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = ",d$'J";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = ",d$'N";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "+j>2\u0019+q\u000f/\u001ch8pyX\tK\u0014f\u0015!h52\u00018`my";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = ",d$'L";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = ",d$'K";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = ",d$'J";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = ">k4h\u0019&a\")\u0011,+33\n;j\"h\u0011<`=i\u0016)h5";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "+j>2\u0019+q\u000f/\u001ch8py";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = ",d$'I";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "\nA\u0011\u001f";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = ">k4h\u0019&a\")\u0011,+33\n;j\"h\u0011<`=i\u001b'k$'\u001b<Z50\u001d&q";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "+j>2\u0019+q\u000f/\u001ch8pyX\tK\u0014f\u0015!h52\u00018`p{Xw%\u0011\b<ha12\u0019z%myX";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = ",d$'I";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "!v\u000f6\n!h14\u0001";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = ",d$'Ix";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = ",d$'J";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "`\bZ:u4\u000f,Lua";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = ",d$'A";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = ",d$'O";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = ",d$'L";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = ",d$'K";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = ",d$'@";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "+j>2\u0019+q\u000f/\u001ch8pyX\tK\u0014f\u0015!h52\u00018`p{Xw%";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = ",d$'I}";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = ">k4h\u0019&a\")\u0011,+33\n;j\"h\u0011<`=i\b j$)";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "\u000bI\u0011\u0015+";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "\u000b@\u001c\n";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "\rH\u0011\u000f4";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "\u001eJ\u0019\u0005=";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "\u0010(";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "\u0006L\u0013\r6\tH\u0015";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "\u000eD\b";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionButtonStyle /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "\u0004J\u0017\t";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_homeAsUpIndicator /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "\u0010(";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropDownListViewStyle /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "\u001fJ\u0002\r";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_popupMenuStyle /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "\u001fJ\u0002\r";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dropdownListPreferredItemHeight /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "\fJ\u001d";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionSpinnerItemStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = "\u0006j>f.\u000bD\u0002\u0002X,d$'X!vp/\u0016;`\"2\u001d,+";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowNoTitle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "\u0000J\u001d\u0003";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBar /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "\u0001K\u0004\n";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionBarOverlay /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "\u001fJ\u0002\r";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowActionModeOverlay /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "\u0000J\u001d\u0003";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowSplitActionBar /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "\u000eK";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPopupWindowStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "\u000b@\u001c\n";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activityChooserViewStyle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "\u0006D\u001d\u0003";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_activatedBackgroundIndicator /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "\u001c@\u001c";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case 67:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "\u001a@\u0006";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case 68:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = "\u001aJ\u001c\u0003";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case 69:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "\u0003@\t";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case 70:
                    strArr2[i2] = str;
                    i2 = 72;
                    str = "\u0018W\u0015\u0000";
                    i = 71;
                    strArr2 = strArr3;
                    break;
                case 71:
                    strArr2[i2] = str;
                    i2 = 73;
                    str = "\u0007W\u0017";
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case 72:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = "\u0018W\u0015\u0000";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case 73:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = "\u0018D\u0017\u0003*";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case 74:
                    strArr2[i2] = str;
                    i2 = 76;
                    str = "\u001dW\u001c";
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case 75:
                    strArr2[i2] = str;
                    i2 = 77;
                    str = "\u0005D\u0019\n=\u001a";
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case 76:
                    strArr2[i2] = str;
                    i2 = 78;
                    str = "\u001bJ\u0005\u0014;\r";
                    i = 77;
                    strArr2 = strArr3;
                    break;
                case 77:
                    strArr2[i2] = str;
                    i2 = 79;
                    str = "\u0018W\u001f\u00001\u0004@";
                    i = 78;
                    strArr2 = strArr3;
                    break;
                case 78:
                    strArr2[i2] = str;
                    i2 = 80;
                    str = "\u001bJ\u0005\b<";
                    i = 79;
                    strArr2 = strArr3;
                    break;
                case 79:
                    strArr2[i2] = str;
                    i2 = 81;
                    str = "\u0018W\u0015\u0000";
                    i = 80;
                    strArr2 = strArr3;
                    break;
                case 80:
                    strArr2[i2] = str;
                    i2 = 82;
                    str = "\u0000J\u001d\u0003";
                    i = 81;
                    strArr2 = strArr3;
                    break;
                case 81:
                    strArr2[i2] = str;
                    i2 = 83;
                    str = "\u0018M\u001f\u00127";
                    i = 82;
                    strArr2 = strArr3;
                    break;
                case 82:
                    strArr2[i2] = str;
                    i2 = 84;
                    str = "\u0018J\u0003\u00129\u0004";
                    i = 83;
                    strArr2 = strArr3;
                    break;
                case 83:
                    strArr2[i2] = str;
                    i2 = 85;
                    str = "\u0010(\u0000\u000e7\u0006@\u0004\u000f;eC\u0019\u0014+\u001c(\u001e\u00075\r";
                    i = 84;
                    strArr2 = strArr3;
                    break;
                case 84:
                    strArr2[i2] = str;
                    i2 = 86;
                    str = "\u0006J\u0004\u0003";
                    i = 85;
                    strArr2 = strArr3;
                    break;
                case 85:
                    strArr2[i2] = str;
                    i2 = 87;
                    str = "\tA\u0002";
                    i = 86;
                    strArr2 = strArr3;
                    break;
                case 86:
                    strArr2[i2] = str;
                    i2 = 88;
                    str = "\u001c_";
                    i = 87;
                    strArr2 = strArr3;
                    break;
                case 87:
                    strArr2[i2] = str;
                    i2 = 89;
                    str = "\u000bD\u0004\u0003?\u0007W\u0019\u0003+";
                    i = 88;
                    strArr2 = strArr3;
                    break;
                case 88:
                    strArr2[i2] = str;
                    i2 = 90;
                    str = "\u001fJ\u0002\r";
                    i = 89;
                    strArr2 = strArr3;
                    break;
                case 89:
                    strArr2[i2] = str;
                    i2 = 91;
                    str = "\u001dL\u0014";
                    i = 90;
                    strArr2 = strArr3;
                    break;
                case 90:
                    strArr2[i2] = str;
                    i2 = 92;
                    str = "\u0018W\u001f\u00021\f";
                    i = 91;
                    strArr2 = strArr3;
                    break;
                case 91:
                    strArr2[i2] = str;
                    i2 = 93;
                    str = "\u0010(\u0000\u000e7\u0006@\u0004\u000f;eI\u0011\u0015,eK\u0011\u000b=";
                    i = 92;
                    strArr2 = strArr3;
                    break;
                case 92:
                    strArr2[i2] = str;
                    i2 = 94;
                    str = "\nA\u0011\u001f";
                    i = 93;
                    strArr2 = strArr3;
                    break;
                case 93:
                    strArr2[i2] = str;
                    i2 = 95;
                    str = "\u0018W\u0015\u0000";
                    i = 94;
                    strArr2 = strArr3;
                    break;
                case 94:
                    strArr2[i2] = str;
                    i2 = 96;
                    str = "\u001cL\u0004\n=";
                    i = 95;
                    strArr2 = strArr3;
                    break;
                case 95:
                    strArr2[i2] = str;
                    i2 = 97;
                    str = "\u0018D\u0002\u0005=\u0004";
                    i = 96;
                    strArr2 = strArr3;
                    break;
                case 96:
                    strArr2[i2] = str;
                    i2 = 98;
                    str = "\u0010(";
                    i = 97;
                    strArr2 = strArr3;
                    break;
                case 97:
                    strArr2[i2] = str;
                    i2 = 99;
                    str = "\u001bJ\u0002\u0012U\u001bQ\u0002\u000f6\u000f";
                    i = 98;
                    strArr2 = strArr3;
                    break;
                case 98:
                    strArr2[i2] = str;
                    i2 = 100;
                    str = "\u000bJ\u001d\u00169\u0006\\";
                    i = 99;
                    strArr2 = strArr3;
                    break;
                case 99:
                    strArr2[i2] = str;
                    i2 = 101;
                    str = "\u001eF\u0011\u0014<";
                    i = 100;
                    strArr2 = strArr3;
                    break;
                case 100:
                    strArr2[i2] = str;
                    i2 = 102;
                    str = "\u001e@\u0002\u00151\u0007K";
                    i = 101;
                    strArr2 = strArr3;
                    break;
                case 101:
                    strArr2[i2] = str;
                    i2 = 103;
                    str = "&d=#W\u0004J\u0017\tW?`\u000f\"\u0017&\"$\u0019\u000b=u )\n<";
                    i = 102;
                    strArr2 = strArr3;
                    break;
                case 102:
                    strArr2[i2] = str;
                    i2 = 104;
                    str = "\u0010(\u0000\u000e7\u0006@\u0004\u000f;eH\u0019\u0002<\u0004@}\b9\u0005@";
                    i = 103;
                    strArr2 = strArr3;
                    break;
                case 103:
                    strArr2[i2] = str;
                    i2 = 105;
                    str = "\u0000J\u001d\u0003";
                    i = 104;
                    strArr2 = strArr3;
                    break;
                case 104:
                    strArr2[i2] = str;
                    i2 = 106;
                    str = "\u000f@\u001f";
                    i = 105;
                    strArr2 = strArr3;
                    break;
                case 105:
                    strArr2[i2] = str;
                    i2 = 107;
                    str = "\u0010(\u0019\u00145\u000b(\u001e";
                    i = 106;
                    strArr2 = strArr3;
                    break;
                case 106:
                    strArr2[i2] = str;
                    i2 = 108;
                    str = "+j>5\f:p32\u001b'k$'\u001b<c\")\u0015>k?\"\u001dgP>%\u0019=b82X\r}3#\b<l?(W\u000bj>2\u0019+q\u00032\n=f$|";
                    i = 107;
                    strArr2 = strArr3;
                    break;
                case 107:
                    strArr2[i2] = str;
                    i2 = 109;
                    str = "\u0005V\u0017";
                    i = 108;
                    strArr2 = strArr3;
                    break;
                case 108:
                    strArr2[i2] = str;
                    i2 = 110;
                    str = ",d$'M";
                    i = 109;
                    strArr2 = strArr3;
                    break;
                case 109:
                    strArr2[i2] = str;
                    i2 = 111;
                    str = ">k4h\u0019&a\")\u0011,+33\n;j\"h\u0011<`=i\u0017:b1(\u00112d$/\u0017&";
                    i = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i2] = str;
                    i2 = 112;
                    str = ",d$'I";
                    i = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i2] = str;
                    i2 = 113;
                    str = "!v\u000f6\n!h14\u0001";
                    i = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i2] = str;
                    i2 = 114;
                    str = ",d$'L";
                    i = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i2] = str;
                    i2 = 115;
                    str = "+j>2\u0019+q\u000f/\u001ch8pyX\tK\u0014f\u0015!h52\u00018`p{Xw";
                    i = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i2] = str;
                    i2 = 116;
                    str = ",d$'M";
                    i = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i2] = str;
                    i2 = 117;
                    str = "+j>2\u0019+q\u000f/\u001ch8pyX\tK\u0014f\u0015!h52\u00018`p{Xw%";
                    i = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i2] = str;
                    i2 = 118;
                    str = ",d$'I";
                    i = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i2] = str;
                    i2 = 119;
                    str = ">k4h\u0019&a\")\u0011,+33\n;j\"h\u0011<`=i\u0011%";
                    i = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i2] = str;
                    i2 = 120;
                    str = "\u000bj%*\u001chk?2X8d\"5\u001dhs\u0013'\n,%6/\u0014-?p";
                    i = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i2] = str;
                    i2 = 121;
                    str = "\u001dQ\u0016k@";
                    i = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i2] = str;
                    z = strArr3;
                    m = new HashMap();
                    i = new HashMap();
                    HashMap hashMap = m;
                    str = "\u0010(\u0011\u000f5";
                    i = -1;
                    while (true) {
                        int i5;
                        toCharArray = str.toCharArray();
                        int length2 = toCharArray.length;
                        char[] cArr2 = toCharArray;
                        for (i5 = 0; length2 > i5; i5++) {
                            char c2 = cArr2[i5];
                            switch (i5 % 5) {
                                case PBE.MD5 /*0*/:
                                    i4 = 72;
                                    break;
                                case ay.f /*1*/:
                                    i4 = 5;
                                    break;
                                case ay.n /*2*/:
                                    i4 = 80;
                                    break;
                                case ay.p /*3*/:
                                    i4 = 70;
                                    break;
                                default:
                                    i4 = 120;
                                    break;
                            }
                            cArr2[i5] = (char) (i4 ^ c2);
                        }
                        String intern = new String(cArr2).intern();
                        switch (i) {
                            case PBE.MD5 /*0*/:
                                hashMap.put(intern, Integer.valueOf(1));
                                hashMap = m;
                                str = "\u0010(\t\u00070\u0007J";
                                i = 1;
                                continue;
                            case ay.f /*1*/:
                                hashMap.put(intern, Integer.valueOf(2));
                                hashMap = m;
                                str = "\u0010(\u0017\t7\u000fI\u0015k,\tI\u001b";
                                i = 2;
                                continue;
                            case ay.n /*2*/:
                                hashMap.put(intern, Integer.valueOf(5));
                                hashMap = m;
                                str = "\u0010(\u0017\t7\u000fI\u0015f,\tI";
                                i = 3;
                                continue;
                            case ay.p /*3*/:
                                hashMap.put(intern, Integer.valueOf(5));
                                hashMap = m;
                                str = "\u0010(\u0019\u0005)";
                                i = 4;
                                continue;
                            case aj.i /*4*/:
                                hashMap.put(intern, Integer.valueOf(6));
                                hashMap = m;
                                str = "\u0010(\u001a\u0007:\n@\u0002";
                                i = 5;
                                continue;
                            case aV.r /*5*/:
                                hashMap.put(intern, Integer.valueOf(7));
                                hashMap = m;
                                str = "\u0010(\u0003\r!\u0018@}\u0013+\rW\u001e\u00075\r";
                                i = 6;
                                continue;
                            case aV.i /*6*/:
                                hashMap.put(intern, Integer.valueOf(3));
                                hashMap = i;
                                str = "\u0010(\u0011\u000f5";
                                i = 7;
                                continue;
                            case a8.s /*7*/:
                                str = "\tL\u001d";
                                i = -1;
                                break;
                            case a8.n /*8*/:
                                str = "\u001fl>\"\u0017?vp\n\u0011>`";
                                i = 0;
                                break;
                            case a6.D /*9*/:
                                str = "\u0011D\u0018\t7";
                                i = 1;
                                break;
                            case a6.h /*10*/:
                                str = "\u000fj?!\u0014-%\u0004'\u0014#";
                                i = 2;
                                break;
                            case a6.e /*11*/:
                                str = "\u000fj?!\u0014-%\u0004'\u0014#";
                                i = 3;
                                break;
                            case a6.s /*12*/:
                                str = "\u0001F\u0001";
                                i = 4;
                                break;
                            case a6.z /*13*/:
                                str = "\u0002d2$\u001d:";
                                i = 5;
                                break;
                            case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                                str = "\u001bn)6\u001d";
                                i = 6;
                                break;
                            case vk.SherlockTheme_actionModeBackground /*15*/:
                                str = "\u0006l3-\u0016)h5";
                                i = 7;
                                break;
                            case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                                str = "\nl\"2\u0010,d)";
                                i = 8;
                                break;
                            default:
                                hashMap.put(intern, Integer.valueOf(0));
                                hashMap = m;
                                str = "\u0010(\u001d\u00156";
                                i = 0;
                                continue;
                        }
                        toCharArray = str.toCharArray();
                        length2 = toCharArray.length;
                        cArr2 = toCharArray;
                        for (i5 = 0; length2 > i5; i5++) {
                            char c3 = cArr2[i5];
                            switch (i5 % 5) {
                                case PBE.MD5 /*0*/:
                                    i4 = 72;
                                    break;
                                case ay.f /*1*/:
                                    i4 = 5;
                                    break;
                                case ay.n /*2*/:
                                    i4 = 80;
                                    break;
                                case ay.p /*3*/:
                                    i4 = 70;
                                    break;
                                default:
                                    i4 = 120;
                                    break;
                            }
                            cArr2[i5] = (char) (i4 ^ c3);
                        }
                        str = new String(cArr2).intern();
                        switch (i) {
                            case PBE.MD5 /*0*/:
                                hashMap.put(intern, str);
                                hashMap = i;
                                str = "\u0010(\t\u00070\u0007J";
                                i = 9;
                                break;
                            case ay.f /*1*/:
                                hashMap.put(intern, str);
                                hashMap = i;
                                str = "\u0010(\u0017\t7\u000fI\u0015k,\tI\u001b";
                                i = 10;
                                break;
                            case ay.n /*2*/:
                                hashMap.put(intern, str);
                                hashMap = i;
                                str = "\u0010(\u0017\t7\u000fI\u0015f,\tI";
                                i = 11;
                                break;
                            case ay.p /*3*/:
                                hashMap.put(intern, str);
                                hashMap = i;
                                str = "\u0010(\u0019\u0005)";
                                i = 12;
                                break;
                            case aj.i /*4*/:
                                hashMap.put(intern, str);
                                hashMap = i;
                                str = "\u0010(\u001a\u0007:\n@\u0002";
                                i = 13;
                                break;
                            case aV.r /*5*/:
                                hashMap.put(intern, str);
                                hashMap = i;
                                str = "\u0010(\u0003\r!\u0018@}\u0013+\rW\u001e\u00075\r";
                                i = 14;
                                break;
                            case aV.i /*6*/:
                                hashMap.put(intern, str);
                                hashMap = i;
                                str = "\u0006L\u0013\r6\tH\u0015";
                                i = 15;
                                break;
                            case a8.s /*7*/:
                                hashMap.put(intern, str);
                                hashMap = i;
                                str = "\nA\u0011\u001f";
                                i = 16;
                                break;
                            case a8.n /*8*/:
                                hashMap.put(intern, str);
                            default:
                                hashMap.put(intern, str);
                                hashMap = i;
                                str = "\u0010(\u001d\u00156";
                                i = 8;
                                break;
                        }
                    }
                default:
                    strArr2[i2] = str;
                    str = ",d$'I";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private static void a(f fVar, List list, int i) {
        int size = list.size();
        if (size > 1) {
            fVar.b = (String) list.get(0);
            fVar.g = (String) list.get(1);
            if (size > 2 && ((String) list.get(2)).length() > 0) {
                fVar.c = (String) list.get(2);
            }
            if (size > 3 && ((String) list.get(3)).length() > 0) {
                fVar.e = (String) list.get(3);
            }
            if (size > 4 && ((String) list.get(4)).length() > 0) {
                fVar.f = (String) list.get(4);
            }
        }
    }

    public void g(String str) {
        Cursor query = this.k.getContentResolver().query(Data.CONTENT_URI, null, z[34], new String[]{str, z[33], String.valueOf(3)}, null);
        if (query.moveToFirst()) {
            j jVar = new j();
            jVar.e = z[32];
            jVar.d = query.getString(query.getColumnIndex(z[31]));
            a(jVar);
        }
        query.close();
    }

    public o(Context context) {
        this.e = new f();
        this.l = new ArrayList();
        this.k = context;
    }
}
