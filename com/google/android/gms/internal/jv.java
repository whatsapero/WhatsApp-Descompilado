package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class jv {

    public final class a {
        private final List Nr;
        private final Object Ns;

        private a(Object obj) {
            this.Ns = jx.i(obj);
            this.Nr = new ArrayList();
        }

        a(Object obj, AnonymousClass_1 anonymousClass_1) {
            this(obj);
        }

        public com.google.android.gms.internal.jv.a a(String str, Object obj) {
            this.Nr.add(((String) jx.i(str)) + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            boolean z = qw.a;
            StringBuilder append = new StringBuilder(100).append(this.Ns.getClass().getSimpleName()).append('{');
            int size = this.Nr.size();
            int i = 0;
            while (i < size) {
                append.append((String) this.Nr.get(i));
                if (i < size - 1) {
                    append.append(", ");
                }
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            }
            return append.append('}').toString();
        }
    }

    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static a h(Object obj) {
        return new a(obj, null);
    }

    public static int hashCode(Object[] objArr) {
        return Arrays.hashCode(objArr);
    }
}
