package com.google;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

final class cv implements Serializable {
    private static final long serialVersionUID = 0;
    private static final String[] z;
    private byte[] a;
    private String b;

    static {
        int i;
        int i2;
        String[] strArr = new String[6];
        char[] toCharArray = "\u001b7jX$+y\u007fUh(0e^h>+dN'n;~\\.+++Y$/*x".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 89;
                    break;
                case ay.n /*2*/:
                    i2 = 11;
                    break;
                case ay.p /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u001b7jX$+y\u007fUh-8gVh <|x='5o_:n4nN !=".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 89;
                    break;
                case ay.n /*2*/:
                    i2 = 11;
                    break;
                case ay.p /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u001b7jX$+y\u007fUh(0e^h <|x='5o_:n4nN !=".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 89;
                    break;
                case ay.n /*2*/:
                    i2 = 11;
                    break;
                case ay.p /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\u001b7jX$+y\u007fUh;7o_:=-jT,n)yU<!yiO.(<y".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 89;
                    break;
                case ay.n /*2*/:
                    i2 = 11;
                    break;
                case ay.p /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u000b+yU:n:jV$'7l\u001a&+.IO!\"=nH".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 89;
                    break;
                case ay.n /*2*/:
                    i2 = 11;
                    break;
                case ay.p /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = " <|x='5o_:".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 78;
                    break;
                case ay.f /*1*/:
                    i2 = 89;
                    break;
                case ay.n /*2*/:
                    i2 = 11;
                    break;
                case ay.p /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[5] = new String(cArr).intern();
        z = strArr;
    }

    cv(a1 a1Var) {
        this.b = a1Var.getClass().getName();
        this.a = a1Var.b();
    }

    protected Object readResolve() {
        try {
            aJ aJVar = (aJ) Class.forName(this.b).getMethod(z[5], new Class[0]).invoke(null, new Object[0]);
            aJVar.a(this.a);
            return aJVar.a();
        } catch (Throwable e) {
            throw new RuntimeException(z[0], e);
        } catch (Throwable e2) {
            throw new RuntimeException(z[2], e2);
        } catch (Throwable e22) {
            throw new RuntimeException(z[1], e22);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(z[4], e3.getCause());
        } catch (Throwable e222) {
            throw new RuntimeException(z[3], e222);
        }
    }
}
