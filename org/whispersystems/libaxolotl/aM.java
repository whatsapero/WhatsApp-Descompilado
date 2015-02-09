package org.whispersystems.libaxolotl;

public class am {
    private final Object a;
    private final Object b;

    public Object a() {
        return this.b;
    }

    private boolean a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        return (obj == null || obj2 == null) ? false : obj.equals(obj2);
    }

    public boolean equals(Object obj) {
        return (obj instanceof am) && a(((am) obj).a(), a()) && a(((am) obj).b(), b());
    }

    public int hashCode() {
        return a().hashCode() ^ b().hashCode();
    }

    public am(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public Object b() {
        return this.a;
    }
}
