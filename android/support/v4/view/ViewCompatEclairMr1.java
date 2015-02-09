package android.support.v4.view;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class ViewCompatEclairMr1 {
    private static Method sChildrenDrawingOrderMethod;
    private static final String[] z;

    static {
        String[] strArr = new String[9];
        String str = "FK\u001a}2\\B\nL?[j\u001c_-\\@\tq(QK\u001c{4TL\u0002[>";
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
                        i3 = 53;
                        break;
                    case ay.f /*1*/:
                        i3 = 46;
                        break;
                    case ay.n /*2*/:
                        i3 = 110;
                        break;
                    case ay.p /*3*/:
                        i3 = 62;
                        break;
                    default:
                        i3 = 90;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "`@\u000f\\6P\u000e\u001aQz\\@\u0018Q1P\u000e\rV3YJ\u001c[4q\\\u000fI3[I!L>P\\+P;WB\u000bZ";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "`@\u000f\\6P\u000e\u001aQzSG\u0000ZzVF\u0007R>GK\u0000z(TY\u0007P=z\\\n[(p@\u000f\\6PJ";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "`@\u000f\\6P\u000e\u001aQz\\@\u0018Q1P\u000e\rV3YJ\u001c[4q\\\u000fI3[I!L>P\\+P;WB\u000bZ";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "cG\u000bI\u0019ZC\u001e_.";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "cG\u000bI\u0019ZC\u001e_.";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "cG\u000bI\u0019ZC\u001e_.";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "cG\u000bI\u0019ZC\u001e_.";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "`@\u000f\\6P\u000e\u001aQz\\@\u0018Q1P\u000e\rV3YJ\u001c[4q\\\u000fI3[I!L>P\\+P;WB\u000bZ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static boolean isOpaque(View view) {
        return view.isOpaque();
    }

    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z) {
        try {
            if (sChildrenDrawingOrderMethod == null) {
                try {
                    sChildrenDrawingOrderMethod = ViewGroup.class.getDeclaredMethod(z[0], new Class[]{Boolean.TYPE});
                } catch (Throwable e) {
                    Log.e(z[6], z[3], e);
                }
                sChildrenDrawingOrderMethod.setAccessible(true);
            }
            try {
                sChildrenDrawingOrderMethod.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (Throwable e2) {
                Log.e(z[7], z[4], e2);
            } catch (Throwable e22) {
                Log.e(z[5], z[1], e22);
            } catch (Throwable e222) {
                Log.e(z[8], z[2], e222);
            }
        } catch (IllegalAccessException e3) {
            throw e3;
        }
    }
}
