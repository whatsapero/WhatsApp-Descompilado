package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.util.Log;
import com.whatsapp.vk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class PropertyValuesHolder implements Cloneable {
    private static Class[] DOUBLE_VARIANTS;
    private static Class[] FLOAT_VARIANTS;
    private static Class[] INTEGER_VARIANTS;
    private static final TypeEvaluator sFloatEvaluator;
    private static final HashMap sGetterPropertyMap;
    private static final TypeEvaluator sIntEvaluator;
    private static final HashMap sSetterPropertyMap;
    private static final String[] z;
    private Object mAnimatedValue;
    private TypeEvaluator mEvaluator;
    private Method mGetter;
    KeyframeSet mKeyframeSet;
    final ReentrantReadWriteLock mPropertyMapLock;
    String mPropertyName;
    Method mSetter;
    final Object[] mTmpValueArray;
    Class mValueType;

    class FloatPropertyValuesHolder extends PropertyValuesHolder {
        private static final String[] z;
        float mFloatAnimatedValue;
        FloatKeyframeSet mFloatKeyframeSet;

        static {
            /* JADX: method processing error */
/*
            Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
            /*
            r1 = 0;
            r0 = 2;
            r3 = new java.lang.String[r0];
            r2 = "#\u001bH\u001bY\u0001\u001d^=]\u001f\u001cB\u0018t\u001c\u0005C\u000eN";
            r0 = -1;
            r4 = r3;
            r5 = r3;
            r3 = r1;
        L_0x000a:
            r2 = r2.toCharArray();
            r6 = r2.length;
            r7 = r6;
            r8 = r1;
            r6 = r2;
        L_0x0012:
            if (r7 > r8) goto L_0x002f;
        L_0x0014:
            r2 = new java.lang.String;
            r2.<init>(r6);
            r2 = r2.intern();
            switch(r0) {
                case 0: goto L_0x002a;
                default: goto L_0x0020;
            };
        L_0x0020:
            r4[r3] = r2;
            r2 = 1;
            r0 = "#\u001bH\u001bY\u0001\u001d^=]\u001f\u001cB\u0018t\u001c\u0005C\u000eN";
            r3 = r2;
            r4 = r5;
            r2 = r0;
            r0 = r1;
            goto L_0x000a;
        L_0x002a:
            r4[r3] = r2;
            z = r5;
            return;
        L_0x002f:
            r9 = r6[r8];
            r2 = r8 % 5;
            switch(r2) {
                case 0: goto L_0x0040;
                case 1: goto L_0x0043;
                case 2: goto L_0x0046;
                case 3: goto L_0x0049;
                default: goto L_0x0036;
            };
        L_0x0036:
            r2 = 60;
        L_0x0038:
            r2 = r2 ^ r9;
            r2 = (char) r2;
            r6[r8] = r2;
            r2 = r8 + 1;
            r8 = r2;
            goto L_0x0012;
        L_0x0040:
            r2 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
            goto L_0x0038;
        L_0x0043:
            r2 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
            goto L_0x0038;
        L_0x0046:
            r2 = 39;
            goto L_0x0038;
        L_0x0049:
            r2 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
            goto L_0x0038;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.animation.PropertyValuesHolder.FloatPropertyValuesHolder.<clinit>():void");
        }

        public Object clone() {
            return clone();
        }

        void setAnimatedValue(Object obj) {
            if (this.mSetter != null) {
                try {
                    this.mTmpValueArray[0] = Float.valueOf(this.mFloatAnimatedValue);
                    this.mSetter.invoke(obj, this.mTmpValueArray);
                } catch (InvocationTargetException e) {
                    Log.e(z[0], e.toString());
                } catch (IllegalAccessException e2) {
                    Log.e(z[1], e2.toString());
                }
            }
        }

        void calculateValue(float f) {
            this.mFloatAnimatedValue = this.mFloatKeyframeSet.getFloatValue(f);
        }

        public PropertyValuesHolder clone() {
            return clone();
        }

        public void setFloatValues(float[] fArr) {
            super.setFloatValues(fArr);
            this.mFloatKeyframeSet = (FloatKeyframeSet) this.mKeyframeSet;
        }

        Object getAnimatedValue() {
            return Float.valueOf(this.mFloatAnimatedValue);
        }

        public FloatPropertyValuesHolder(String str, float[] fArr) {
            super(str, null);
            setFloatValues(fArr);
        }

        public FloatPropertyValuesHolder clone() {
            FloatPropertyValuesHolder floatPropertyValuesHolder = (FloatPropertyValuesHolder) super.clone();
            floatPropertyValuesHolder.mFloatKeyframeSet = (FloatKeyframeSet) floatPropertyValuesHolder.mKeyframeSet;
            return floatPropertyValuesHolder;
        }

        void setupSetter(Class cls) {
            super.setupSetter(cls);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.reflect.Method getPropertyFunction(java.lang.Class r10, java.lang.String r11, java.lang.Class r12) {
        /*
        r9_this = this;
        r1 = 0;
        r7 = 1;
        r3 = 0;
        r4 = com.actionbarsherlock.internal.nineoldandroids.animation.Animator.a;
        r0 = r9.mPropertyName;
        r5 = getMethodName(r11, r0);
        r0 = 0;
        if (r12 != 0) goto L_0x0057;
    L_0x000e:
        r0 = r10.getMethod(r5, r0);	 Catch:{ NoSuchMethodException -> 0x0013 }
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = move-exception;
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = r10.getSimpleName();
        r3 = r3.append(r4);
        r4 = z;
        r5 = 9;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r4 = z;
        r5 = 11;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r4 = r9.mPropertyName;
        r3 = r3.append(r4);
        r4 = z;
        r5 = 13;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r0 = r3.append(r0);
        r0 = r0.toString();
        android.util.Log.e(r2, r0);
        r0 = r1;
        goto L_0x0012;
    L_0x0057:
        r6 = new java.lang.Class[r7];
        r0 = r9.mValueType;
        r2 = java.lang.Float.class;
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0067;
    L_0x0063:
        r0 = FLOAT_VARIANTS;
        if (r4 == 0) goto L_0x0089;
    L_0x0067:
        r0 = r9.mValueType;	 Catch:{ NoSuchMethodException -> 0x009a }
        r2 = java.lang.Integer.class;
        r0 = r0.equals(r2);	 Catch:{ NoSuchMethodException -> 0x009a }
        if (r0 == 0) goto L_0x0075;
    L_0x0071:
        r0 = INTEGER_VARIANTS;
        if (r4 == 0) goto L_0x0089;
    L_0x0075:
        r0 = r9.mValueType;	 Catch:{ NoSuchMethodException -> 0x009c }
        r2 = java.lang.Double.class;
        r0 = r0.equals(r2);	 Catch:{ NoSuchMethodException -> 0x009c }
        if (r0 == 0) goto L_0x0083;
    L_0x007f:
        r0 = DOUBLE_VARIANTS;
        if (r4 == 0) goto L_0x0089;
    L_0x0083:
        r0 = new java.lang.Class[r7];
        r2 = r9.mValueType;
        r0[r3] = r2;
    L_0x0089:
        r7 = r0.length;
        r2 = r3;
    L_0x008b:
        if (r2 >= r7) goto L_0x00a3;
    L_0x008d:
        r8 = r0[r2];
        r6[r3] = r8;
        r1 = r10.getMethod(r5, r6);	 Catch:{ NoSuchMethodException -> 0x009e }
        r9.mValueType = r8;	 Catch:{ NoSuchMethodException -> 0x009e }
        r0 = r1;
        goto L_0x0012;
    L_0x009a:
        r0 = move-exception;
        throw r0;
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r8 = move-exception;
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x008b;
    L_0x00a3:
        r0 = r1;
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 10;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r11);
        r3 = z;
        r4 = 5;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.mPropertyName;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 12;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r10.getSimpleName();
        r2 = r2.append(r3);
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.mValueType;
        r2 = r2.append(r3);
        r2 = r2.toString();
        android.util.Log.e(r1, r2);
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.animation.PropertyValuesHolder.getPropertyFunction(java.lang.Class, java.lang.String, java.lang.Class):java.lang.reflect.Method");
    }

    void setupSetterAndGetter(Object obj) {
        boolean z = Animator.a;
        Class cls = obj.getClass();
        try {
            if (this.mSetter == null) {
                setupSetter(cls);
            }
            Iterator it = this.mKeyframeSet.mKeyframes.iterator();
            while (it.hasNext()) {
                Keyframe keyframe = (Keyframe) it.next();
                try {
                    if (!keyframe.hasValue()) {
                        if (this.mGetter == null) {
                            setupGetter(cls);
                        }
                        try {
                            keyframe.setValue(this.mGetter.invoke(obj, new Object[0]));
                            continue;
                        } catch (InvocationTargetException e) {
                            Log.e(z[2], e.toString());
                            continue;
                        } catch (IllegalAccessException e2) {
                            Log.e(z[1], e2.toString());
                            continue;
                        }
                    }
                    if (z) {
                        return;
                    }
                } catch (InvocationTargetException e3) {
                    throw e3;
                } catch (InvocationTargetException e32) {
                    throw e32;
                }
            }
        } catch (InvocationTargetException e322) {
            throw e322;
        }
    }

    private void setupGetter(Class cls) {
        this.mGetter = setupSetterOrGetter(cls, sGetterPropertyMap, z[0], null);
    }

    public String toString() {
        return this.mPropertyName + z[4] + this.mKeyframeSet.toString();
    }

    void setupSetter(Class cls) {
        this.mSetter = setupSetterOrGetter(cls, sSetterPropertyMap, z[3], this.mValueType);
    }

    public void setFloatValues(float[] fArr) {
        this.mValueType = Float.TYPE;
        this.mKeyframeSet = KeyframeSet.ofFloat(fArr);
    }

    public static PropertyValuesHolder ofFloat(String str, float[] fArr) {
        return new FloatPropertyValuesHolder(str, fArr);
    }

    Object getAnimatedValue() {
        return this.mAnimatedValue;
    }

    private Method setupSetterOrGetter(Class cls, HashMap hashMap, String str, Class cls2) {
        Method method = null;
        try {
            this.mPropertyMapLock.writeLock().lock();
            HashMap hashMap2 = (HashMap) hashMap.get(cls);
            if (hashMap2 != null) {
                method = (Method) hashMap2.get(this.mPropertyName);
            }
            if (method == null) {
                method = getPropertyFunction(cls, str, cls2);
                if (hashMap2 == null) {
                    hashMap2 = new HashMap();
                    hashMap.put(cls, hashMap2);
                }
                hashMap2.put(this.mPropertyName, method);
            }
            Method method2 = method;
            this.mPropertyMapLock.writeLock().unlock();
            return method2;
        } catch (Throwable th) {
            this.mPropertyMapLock.writeLock().unlock();
        }
    }

    PropertyValuesHolder(String str, AnonymousClass_1 anonymousClass_1) {
        this(str);
    }

    static {
        String[] strArr = new String[16];
        String str = "\u001ezb";
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
                        i4 = 121;
                        break;
                    case ay.f /*1*/:
                        i4 = 31;
                        break;
                    case ay.n /*2*/:
                        i4 = 22;
                        break;
                    case ay.p /*3*/:
                        i4 = 114;
                        break;
                    default:
                        i4 = 73;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case PBE.MD5 /*0*/:
                    strArr2[i2] = str;
                    str = ")my\u0002,\u000bko$(\u0015js\u0001\u0001\u0016sr\u0017;";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i2] = str;
                    str = "\nzb";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i2] = str;
                    str = "C?";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\rzdR9\u000bpf\u0017;\rf6";
                    i = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "Yh\u007f\u0006!Yiw\u001e<\u001c?b\u000b9\u001c?";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = ")my\u0002,\u000bko$(\u0015js\u0001\u0001\u0016sr\u0017;";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = ")my\u0002,\u000bko$(\u0015js\u0001\u0001\u0016sr\u0017;";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "Y26";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = ":pc\u001e-\u00178bR/\u0010qrR";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = ":pc\u001e-\u00178bR/\u0010qrR'\u00162w\u0000.Yrs\u0006!\u0016{6\u0014&\u000b?f\u0000&\tzd\u00060Y";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "Yyy\u0000i";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "C?";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = ")my\u0002,\u000bko$(\u0015js\u0001\u0001\u0016sr\u0017;";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = ")my\u0002,\u000bko$(\u0015js\u0001\u0001\u0016sr\u0017;";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    sIntEvaluator = new IntEvaluator();
                    sFloatEvaluator = new FloatEvaluator();
                    FLOAT_VARIANTS = new Class[]{Float.TYPE, Float.class, Double.TYPE, Integer.TYPE, Double.class, Integer.class};
                    INTEGER_VARIANTS = new Class[]{Integer.TYPE, Integer.class, Float.TYPE, Double.TYPE, Float.class, Double.class};
                    DOUBLE_VARIANTS = new Class[]{Double.TYPE, Double.class, Float.TYPE, Integer.TYPE, Float.class, Integer.class};
                    sSetterPropertyMap = new HashMap();
                    sGetterPropertyMap = new HashMap();
                default:
                    strArr2[i2] = str;
                    str = ")my\u0002,\u000bko$(\u0015js\u0001\u0001\u0016sr\u0017;";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    static String getMethodName(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        char toUpperCase = Character.toUpperCase(str2.charAt(0));
        return str + toUpperCase + str2.substring(1);
    }

    public PropertyValuesHolder clone() {
        try {
            PropertyValuesHolder propertyValuesHolder = (PropertyValuesHolder) super.clone();
            propertyValuesHolder.mPropertyName = this.mPropertyName;
            propertyValuesHolder.mKeyframeSet = this.mKeyframeSet.clone();
            propertyValuesHolder.mEvaluator = this.mEvaluator;
            return propertyValuesHolder;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    void calculateValue(float f) {
        this.mAnimatedValue = this.mKeyframeSet.getValue(f);
    }

    public void setPropertyName(String str) {
        this.mPropertyName = str;
    }

    void setAnimatedValue(Object obj) {
        if (this.mSetter != null) {
            try {
                this.mTmpValueArray[0] = getAnimatedValue();
                this.mSetter.invoke(obj, this.mTmpValueArray);
            } catch (InvocationTargetException e) {
                Log.e(z[14], e.toString());
            } catch (IllegalAccessException e2) {
                Log.e(z[15], e2.toString());
            }
        }
    }

    private PropertyValuesHolder(String str) {
        this.mSetter = null;
        this.mGetter = null;
        this.mKeyframeSet = null;
        this.mPropertyMapLock = new ReentrantReadWriteLock();
        this.mTmpValueArray = new Object[1];
        this.mPropertyName = str;
    }

    public Object clone() {
        return clone();
    }

    public String getPropertyName() {
        return this.mPropertyName;
    }

    void init() {
        if (this.mEvaluator == null) {
            TypeEvaluator typeEvaluator = this.mValueType == Integer.class ? sIntEvaluator : this.mValueType == Float.class ? sFloatEvaluator : null;
            this.mEvaluator = typeEvaluator;
        }
        if (this.mEvaluator != null) {
            this.mKeyframeSet.setEvaluator(this.mEvaluator);
        }
    }
}
