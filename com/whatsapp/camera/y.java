package com.whatsapp.camera;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import com.actionbarsherlock.R;
import com.whatsapp.App;
import com.whatsapp.ContactPicker;
import com.whatsapp.util.f;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class y extends AsyncTask {
    private static final String[] z;
    final File a;
    final boolean b;
    final byte[] c;
    final r d;

    static {
        String[] strArr = new String[11];
        String str = "y4Y\u001e)w";
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
                        i3 = 31;
                        break;
                    case ay.f /*1*/:
                        i3 = 88;
                        break;
                    case ay.n /*2*/:
                        i3 = 48;
                        break;
                    case ay.p /*3*/:
                        i3 = 110;
                        break;
                    default:
                        i3 = 4;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "~6T\u001ckv<\u001e\u0007jk=^\u001a*z D\u001ce1\u000bd<A^\u0015";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "|9]\u000bv~9S\u001ami1D\u0017+?\u001dB\u001ckmxS\u0002kl1^\t$y1\\\u000b>?";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "|9]\u000bv~9S\u001ami1D\u0017+?\u001dB\u001ckmxQ\rgz+C\u0007jxxV\u0007hzb\u0010";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "|9]\u000bv~9S\u001ami1D\u0017+?\u001dB\u001ckmxS\u0002kl1^\t$y1\\\u000b>?";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "|9]\u000bv~9S\u001ami1D\u0017+?\u001dB\u001ckmxS\u0002kl1^\t$y1\\\u000b>?";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "|9]\u000bv~9S\u001ami1D\u0017+?\u001eY\u0002a?6_\u001a$y7E\u0000`%x";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "|9]\u000bv~9S\u001ami1D\u0017+y9Y\u0002a{x";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "|9]\u000bv~9S\u001ami1D\u0017+?\u001dB\u001ckmxS\u0002kl1^\t$y1\\\u000b>?";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "y4Y\u001e)w";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "v5Q\ta0r";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onPostExecute(Object obj) {
        a((Boolean) obj);
    }

    y(r rVar, File file, byte[] bArr, boolean z) {
        this.d = rVar;
        this.a = file;
        this.c = bArr;
        this.b = z;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.Boolean a(java.lang.Void[] r7) {
        /*
        r6_this = this;
        r0 = java.lang.Boolean.TRUE;
        r2 = 0;
        r1 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x007f, IOException -> 0x00ca }
        r3 = r6.a;	 Catch:{ FileNotFoundException -> 0x007f, IOException -> 0x00ca }
        r1.<init>(r3);	 Catch:{ FileNotFoundException -> 0x007f, IOException -> 0x00ca }
        r2 = r6.c;	 Catch:{ FileNotFoundException -> 0x0173, IOException -> 0x016f }
        r1.write(r2);	 Catch:{ FileNotFoundException -> 0x0173, IOException -> 0x016f }
        if (r1 == 0) goto L_0x0014;
    L_0x0011:
        r1.close();	 Catch:{ IOException -> 0x005e }
    L_0x0014:
        r1 = r0.booleanValue();	 Catch:{ IOException -> 0x013f }
        if (r1 == 0) goto L_0x005d;
    L_0x001a:
        r1 = r6.d;	 Catch:{ IOException -> 0x013f }
        r1 = r1.a;	 Catch:{ IOException -> 0x013f }
        r1 = com.whatsapp.camera.CameraActivity.w(r1);	 Catch:{ IOException -> 0x013f }
        if (r1 == 0) goto L_0x005d;
    L_0x0024:
        r1 = r6.d;	 Catch:{ IOException -> 0x0141 }
        r1 = r1.a;	 Catch:{ IOException -> 0x0141 }
        r1 = com.whatsapp.camera.CameraActivity.v(r1);	 Catch:{ IOException -> 0x0141 }
        if (r1 != 0) goto L_0x005d;
    L_0x002e:
        r1 = r6.a;
        r1 = android.net.Uri.fromFile(r1);
        r2 = r6.b;
        if (r2 == 0) goto L_0x004c;
    L_0x0038:
        r1 = r1.buildUpon();
        r2 = z;
        r3 = 10;
        r2 = r2[r3];
        r3 = "1";
        r1 = r1.appendQueryParameter(r2, r3);
        r1 = r1.build();
    L_0x004c:
        r2 = r6.d;	 Catch:{ IOException -> 0x0168, OutOfMemoryError -> 0x0166, bx -> 0x0143, SecurityException -> 0x016a }
        r2 = r2.a;	 Catch:{ IOException -> 0x0168, OutOfMemoryError -> 0x0166, bx -> 0x0143, SecurityException -> 0x016a }
        r3 = r6.d;	 Catch:{ IOException -> 0x0168, OutOfMemoryError -> 0x0166, bx -> 0x0143, SecurityException -> 0x016a }
        r3 = r3.a;	 Catch:{ IOException -> 0x0168, OutOfMemoryError -> 0x0166, bx -> 0x0143, SecurityException -> 0x016a }
        r3 = com.whatsapp.camera.CameraActivity.w(r3);	 Catch:{ IOException -> 0x0168, OutOfMemoryError -> 0x0166, bx -> 0x0143, SecurityException -> 0x016a }
        r3 = r3.e;	 Catch:{ IOException -> 0x0168, OutOfMemoryError -> 0x0166, bx -> 0x0143, SecurityException -> 0x016a }
        com.whatsapp.util.f.a(r2, r3, r1);	 Catch:{ IOException -> 0x0168, OutOfMemoryError -> 0x0166, bx -> 0x0143, SecurityException -> 0x016a }
    L_0x005d:
        return r0;
    L_0x005e:
        r1 = move-exception;
        r0 = java.lang.Boolean.FALSE;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.getMessage();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0014;
    L_0x007f:
        r0 = move-exception;
        r1 = r2;
    L_0x0081:
        r2 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x016c }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x016c }
        r3.<init>();	 Catch:{ all -> 0x016c }
        r4 = z;	 Catch:{ all -> 0x016c }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ all -> 0x016c }
        r3 = r3.append(r4);	 Catch:{ all -> 0x016c }
        r0 = r0.getMessage();	 Catch:{ all -> 0x016c }
        r0 = r3.append(r0);	 Catch:{ all -> 0x016c }
        r0 = r0.toString();	 Catch:{ all -> 0x016c }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x016c }
        if (r1 == 0) goto L_0x0179;
    L_0x00a2:
        r1.close();	 Catch:{ IOException -> 0x00a8 }
        r0 = r2;
        goto L_0x0014;
    L_0x00a8:
        r1 = move-exception;
        r0 = java.lang.Boolean.FALSE;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.getMessage();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0014;
    L_0x00ca:
        r0 = move-exception;
    L_0x00cb:
        r1 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x0114 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0114 }
        r3.<init>();	 Catch:{ all -> 0x0114 }
        r4 = z;	 Catch:{ all -> 0x0114 }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ all -> 0x0114 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0114 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0114 }
        r0 = r3.append(r0);	 Catch:{ all -> 0x0114 }
        r0 = r0.toString();	 Catch:{ all -> 0x0114 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x0114 }
        if (r2 == 0) goto L_0x0176;
    L_0x00ec:
        r2.close();	 Catch:{ IOException -> 0x00f2 }
        r0 = r1;
        goto L_0x0014;
    L_0x00f2:
        r1 = move-exception;
        r0 = java.lang.Boolean.FALSE;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 5;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.getMessage();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x0014;
    L_0x0114:
        r0 = move-exception;
    L_0x0115:
        if (r2 == 0) goto L_0x011a;
    L_0x0117:
        r2.close();	 Catch:{ IOException -> 0x011d, OutOfMemoryError -> 0x011b }
    L_0x011a:
        throw r0;
    L_0x011b:
        r0 = move-exception;
        throw r0;
    L_0x011d:
        r1 = move-exception;
        r2 = java.lang.Boolean.FALSE;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.getMessage();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x011a;
    L_0x013f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0141 }
    L_0x0141:
        r0 = move-exception;
        throw r0;
    L_0x0143:
        r0 = move-exception;
    L_0x0144:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = java.lang.Boolean.FALSE;
        goto L_0x005d;
    L_0x0166:
        r0 = move-exception;
        goto L_0x0144;
    L_0x0168:
        r0 = move-exception;
        goto L_0x0144;
    L_0x016a:
        r0 = move-exception;
        goto L_0x0144;
    L_0x016c:
        r0 = move-exception;
        r2 = r1;
        goto L_0x0115;
    L_0x016f:
        r0 = move-exception;
        r2 = r1;
        goto L_0x00cb;
    L_0x0173:
        r0 = move-exception;
        goto L_0x0081;
    L_0x0176:
        r0 = r1;
        goto L_0x0014;
    L_0x0179:
        r0 = r2;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.y.a(java.lang.Void[]):java.lang.Boolean");
    }

    protected void a(Boolean bool) {
        int i = CameraActivity.l;
        try {
            this.d.a.findViewById(R.id.save_progress).setVisibility(8);
            if (!bool.booleanValue()) {
                App.b(this.d.a, (int) R.string.camera_failed, 1);
                this.d.a.finish();
                if (i == 0) {
                    return;
                }
            }
            Uri fromFile = Uri.fromFile(this.a);
            if (this.b) {
                fromFile = fromFile.buildUpon().appendQueryParameter(z[0], "1").build();
            }
            try {
                if (CameraActivity.v(this.d.a)) {
                    CameraActivity.a(this.d.a, fromFile);
                    if (i == 0) {
                        return;
                    }
                }
                if (CameraActivity.w(this.d.a) == null) {
                    Intent intent = new Intent(this.d.a.getBaseContext(), ContactPicker.class);
                    intent.setType(z[1]);
                    intent.putExtra(z[2], fromFile);
                    this.d.a.startActivity(intent);
                }
                f.a(this.d.a, Uri.fromFile(this.a));
                this.d.a.finish();
            } catch (SecurityException e) {
                throw e;
            } catch (SecurityException e2) {
                throw e2;
            }
        } catch (SecurityException e22) {
            throw e22;
        }
    }
}
