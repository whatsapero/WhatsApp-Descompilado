package com.google.android.gms.internal;

import android.os.Parcel;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class jg {
    private final View JJ;
    private final a Mw;

    public final class a implements SafeParcelable {
        public static final jw CREATOR;
        private final int CK;
        private final String DZ;
        private final int JI;
        private final String JK;
        private final List Kh;

        static {
            CREATOR = new jw();
        }

        a(int i, String str, List list, int i2, String str2) {
            this.Kh = new ArrayList();
            this.CK = i;
            this.DZ = str;
            this.Kh.addAll(list);
            this.JI = i2;
            this.JK = str2;
        }

        public a(String str, Collection collection, int i, String str2) {
            this(3, str, new ArrayList(collection), i, str2);
        }

        public int describeContents() {
            return 0;
        }

        public String getAccountName() {
            return this.DZ;
        }

        public int getVersionCode() {
            return this.CK;
        }

        public int hn() {
            return this.JI;
        }

        public List ho() {
            return new ArrayList(this.Kh);
        }

        public String hq() {
            return this.JK;
        }

        public void writeToParcel(Parcel parcel, int i) {
            jw.a(this, parcel, i);
        }
    }

    public jg(String str, Collection collection, int i, View view, String str2) {
        this.Mw = new a(str, collection, i, str2);
        this.JJ = view;
    }

    public String getAccountName() {
        return this.Mw.getAccountName();
    }

    public List ho() {
        return this.Mw.ho();
    }
}
