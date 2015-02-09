package com.whatsapp.util.undobar;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.animation.Animation;
import com.whatsapp.DialogToastActivity;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class c implements Parcelable {
    public static final Creator CREATOR;
    private static final String[] z;
    int a;
    int b;
    int c;
    long d;
    Animation e;
    Animation f;

    public c(int i, int i2, long j) {
        this(i, i2);
        this.d = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        c cVar = (c) obj;
        return this.b == cVar.b && this.d == cVar.d && this.c == cVar.c && this.a == cVar.a;
    }

    public c(Parcel parcel) {
        this.d = 5000;
        this.c = parcel.readInt();
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.d = parcel.readLong();
    }

    public c(int i, int i2) {
        this.d = 5000;
        this.c = i;
        this.a = i2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        int i = UndoBarController.f;
        String str = z[0] + this.c + z[2] + this.a + z[4] + this.b + z[1] + this.d + z[3] + this.e + z[5] + this.f + '}';
        if (DialogToastActivity.i) {
            UndoBarController.f = i + 1;
        }
        return str;
    }

    static {
        String[] strArr = new String[6];
        String str = "D-\u0000V{p17M@}&\u001fPZ~-6\\J,";
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
                        i3 = 17;
                        break;
                    case ay.f /*1*/:
                        i3 = 67;
                        break;
                    case ay.n /*2*/:
                        i3 = 100;
                        break;
                    case ay.p /*3*/:
                        i3 = 57;
                        break;
                    default:
                        i3 = 57;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "=c\u0010PM}&6\\J,";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "=c\rWx\u007f*\tXMx,\n\u0004";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "=c\u0006^kt0Y";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "=c\u000bLMP-\rTXe*\u000bW\u0004";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    CREATOR = new g();
                default:
                    strArr2[i] = str;
                    str = "=c\u0000LKp7\rVW,";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeLong(this.d);
    }
}
