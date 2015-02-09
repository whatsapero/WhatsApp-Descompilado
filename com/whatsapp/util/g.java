package com.whatsapp.util;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.vk;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class g {
    private static Map a;
    public static boolean b;
    private static int c;
    private static Set d;
    private static String e;
    private static String f;
    private static boolean g;
    private static FileWriter h;
    public static File i;
    private static Map j;
    private static Map k;
    private static String l;
    private static JSONObject m;
    private static JSONArray n;
    private static String o;
    private static final String[] z;

    static FileWriter a() {
        return h;
    }

    private static void a(View view, List list) {
        int i = Log.e;
        if (view instanceof ViewGroup) {
            int childCount = ((ViewGroup) view).getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                a(((ViewGroup) view).getChildAt(i2), list);
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
            if (i == 0) {
                return;
            }
        }
        try {
            if (view instanceof TextView) {
                list.add((TextView) view);
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    static boolean a(boolean z) {
        g = z;
        return z;
    }

    static String e() {
        return e;
    }

    static void b(View view, long j, boolean z, Activity activity) {
        a(view, j, z, activity);
    }

    private static void b(String str, AttributeSet attributeSet, LayoutInflater layoutInflater, View[] viewArr) {
        try {
            layoutInflater.inflate(new ah(viewArr, layoutInflater, str, attributeSet), null, false);
        } catch (InflateException e) {
        }
    }

    static String a(String str) {
        f = str;
        return str;
    }

    static JSONArray c() {
        return n;
    }

    static boolean b(View view) {
        return a(view);
    }

    public static void b(Activity activity) {
        try {
            if (App.G != 3) {
                throw new UnsupportedOperationException();
            }
            try {
                Log.i(z[36]);
                if (e != null) {
                    LayoutInflater layoutInflater = activity.getLayoutInflater();
                    try {
                        if (layoutInflater.getFactory() != null) {
                            Log.i(z[37]);
                        } else {
                            layoutInflater.setFactory(new ae(activity));
                        }
                    } catch (UnsupportedOperationException e) {
                        throw e;
                    }
                }
            } catch (UnsupportedOperationException e2) {
                throw e2;
            }
        } catch (UnsupportedOperationException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r13, android.view.ViewGroup r14) {
        /*
        r12 = 0;
        r3 = com.whatsapp.util.Log.e;
        r0 = z;
        r1 = 33;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = new java.util.ArrayList;
        r0.<init>();
        a(r14, r0);
        r4 = r0.iterator();
    L_0x0018:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x002e;
    L_0x001e:
        r0 = r4.next();
        r0 = (android.widget.TextView) r0;
        r1 = r0.getText();	 Catch:{ UnsupportedOperationException -> 0x002f }
        r1 = r1.length();	 Catch:{ UnsupportedOperationException -> 0x002f }
        if (r1 > 0) goto L_0x0031;
    L_0x002e:
        return;
    L_0x002f:
        r0 = move-exception;
        throw r0;
    L_0x0031:
        r1 = r0.getRootView();
        r2 = d;
        r2.add(r1);
        r2 = r1.getHeight();
        r5 = r1.getWidth();
        r2 = r2 * r5;
        r6 = (long) r2;
        r2 = r1.hashCode();
        r8 = (long) r2;
        r10 = r1.getDrawingTime();
        r8 = r8 + r10;
        r6 = r6 + r8;
        r1 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r1.<init>();	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r2 = z;	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r5 = 34;
        r2 = r2[r5];	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r1 = r1.append(r2);	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r1 = r1.append(r6);	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r1 = r1.toString();	 Catch:{ UnsupportedOperationException -> 0x0089 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r1 = 1;
        a(r0, r6, r1, r13);	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r1 = a;	 Catch:{ UnsupportedOperationException -> 0x0089 }
        if (r1 == 0) goto L_0x007d;
    L_0x0071:
        r1 = a;	 Catch:{ UnsupportedOperationException -> 0x0087 }
        r2 = java.lang.Long.valueOf(r6);	 Catch:{ UnsupportedOperationException -> 0x0087 }
        r1 = r1.containsKey(r2);	 Catch:{ UnsupportedOperationException -> 0x0087 }
        if (r1 != 0) goto L_0x008b;
    L_0x007d:
        r0 = z;	 Catch:{ UnsupportedOperationException -> 0x0087 }
        r1 = 32;
        r0 = r0[r1];	 Catch:{ UnsupportedOperationException -> 0x0087 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ UnsupportedOperationException -> 0x0087 }
        goto L_0x002e;
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0087 }
    L_0x008b:
        r1 = a;
        r2 = java.lang.Long.valueOf(r6);
        r1 = r1.get(r2);
        r1 = (java.lang.Integer) r1;
        r5 = r1.intValue();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r6 = 35;
        r2 = r2[r6];
        r1 = r1.append(r2);
        r1 = r1.append(r5);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r0.getLayout();
        r6 = r0.getPaint();
        r2 = r0.getText();
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = z;
        r9 = 31;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r7 = r7.append(r2);
        r7 = r7.toString();
        com.whatsapp.util.Log.i(r7);
        r7 = r0.getLineCount();
        if (r7 <= 0) goto L_0x00f3;
    L_0x00e1:
        r8 = r7 + -1;
        r8 = r1.getLineStart(r8);
        r7 = r7 + -1;
        r1 = r1.getLineEnd(r7);
        r1 = r2.subSequence(r8, r1);
        if (r3 == 0) goto L_0x00f4;
    L_0x00f3:
        r1 = r2;
    L_0x00f4:
        r2 = r2.toString();
        r7 = r0.getWidth();
        r8 = r0.getCompoundPaddingLeft();
        r7 = r7 - r8;
        r8 = r0.getCompoundPaddingRight();
        r7 = r7 - r8;
        r7 = (float) r7;
        r8 = r1.length();
        r1 = r6.measureText(r1, r12, r8);
        r6 = 0;
        r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r6 <= 0) goto L_0x0182;
    L_0x0114:
        r0 = a(r0);	 Catch:{ UnsupportedOperationException -> 0x0186 }
        if (r0 == 0) goto L_0x0182;
    L_0x011a:
        r0 = android.text.TextUtils.isEmpty(r2);	 Catch:{ UnsupportedOperationException -> 0x0188 }
        if (r0 != 0) goto L_0x0182;
    L_0x0120:
        r0 = h;	 Catch:{ UnsupportedOperationException -> 0x0188 }
        if (r0 == 0) goto L_0x0182;
    L_0x0124:
        r6 = new org.json.JSONArray;
        r6.<init>();
        r0 = 10;
        if (r5 >= r0) goto L_0x018c;
    L_0x012d:
        r0 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x018a }
        r0.<init>();	 Catch:{ UnsupportedOperationException -> 0x018a }
        r8 = "0";
        r0 = r0.append(r8);	 Catch:{ UnsupportedOperationException -> 0x018a }
        r0 = r0.append(r5);	 Catch:{ UnsupportedOperationException -> 0x018a }
        r0 = r0.toString();	 Catch:{ UnsupportedOperationException -> 0x018a }
    L_0x0140:
        r5 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r5.<init>();	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r8 = e;	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r5 = r5.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r8 = "-";
        r5 = r5.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r0 = r5.append(r0);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r0 = r0.toString();	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r6.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r6.put(r2);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r8 = (double) r7;	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r0 = java.lang.Double.valueOf(r8);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r6.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r8 = (double) r1;	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r0 = java.lang.Double.valueOf(r8);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r6.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r0 <= 0) goto L_0x0179;
    L_0x0173:
        r0 = 1;
        r6.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0193 }
        if (r3 == 0) goto L_0x017d;
    L_0x0179:
        r0 = 0;
        r6.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0193 }
    L_0x017d:
        r0 = n;
        r0.put(r6);
    L_0x0182:
        if (r3 == 0) goto L_0x0018;
    L_0x0184:
        goto L_0x002e;
    L_0x0186:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0188 }
    L_0x0188:
        r0 = move-exception;
        throw r0;
    L_0x018a:
        r0 = move-exception;
        throw r0;
    L_0x018c:
        r0 = java.lang.String.valueOf(r5);
        goto L_0x0140;
    L_0x0191:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0193 }
    L_0x0193:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.g.a(android.app.Activity, android.view.ViewGroup):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.view.ViewGroup r11, android.app.Activity r12, boolean r13) {
        /*
        r10 = 0;
        r3 = com.whatsapp.util.Log.e;
        r0 = e;	 Catch:{ UnsupportedOperationException -> 0x0008 }
        if (r0 != 0) goto L_0x000a;
    L_0x0007:
        return;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r0 = z;
        r1 = 49;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r11.getHeight();
        r1 = r11.getWidth();
        r0 = r0 * r1;
        r0 = (long) r0;
        r2 = r11.hashCode();
        r4 = (long) r2;
        r6 = r11.getDrawingTime();
        r4 = r4 + r6;
        r0 = r0 + r4;
        r2 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0061 }
        r2.<init>();	 Catch:{ UnsupportedOperationException -> 0x0061 }
        r4 = z;	 Catch:{ UnsupportedOperationException -> 0x0061 }
        r5 = 53;
        r4 = r4[r5];	 Catch:{ UnsupportedOperationException -> 0x0061 }
        r2 = r2.append(r4);	 Catch:{ UnsupportedOperationException -> 0x0061 }
        r2 = r2.append(r0);	 Catch:{ UnsupportedOperationException -> 0x0061 }
        r2 = r2.toString();	 Catch:{ UnsupportedOperationException -> 0x0061 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ UnsupportedOperationException -> 0x0061 }
        a(r11, r0, r13, r12);	 Catch:{ UnsupportedOperationException -> 0x0061 }
        r2 = a;	 Catch:{ UnsupportedOperationException -> 0x0061 }
        if (r2 == 0) goto L_0x0055;
    L_0x0049:
        r2 = a;	 Catch:{ UnsupportedOperationException -> 0x005f }
        r4 = java.lang.Long.valueOf(r0);	 Catch:{ UnsupportedOperationException -> 0x005f }
        r2 = r2.containsKey(r4);	 Catch:{ UnsupportedOperationException -> 0x005f }
        if (r2 != 0) goto L_0x0063;
    L_0x0055:
        r0 = z;	 Catch:{ UnsupportedOperationException -> 0x005f }
        r1 = 52;
        r0 = r0[r1];	 Catch:{ UnsupportedOperationException -> 0x005f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ UnsupportedOperationException -> 0x005f }
        goto L_0x0007;
    L_0x005f:
        r0 = move-exception;
        throw r0;
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x005f }
    L_0x0063:
        r2 = a;
        r0 = java.lang.Long.valueOf(r0);
        r0 = r2.get(r0);
        r0 = (java.lang.Integer) r0;
        r4 = r0.intValue();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 50;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = new java.util.ArrayList;
        r0.<init>();
        a(r11, r0);
        r5 = r0.iterator();
    L_0x0099:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0007;
    L_0x009f:
        r0 = r5.next();
        r0 = (android.widget.TextView) r0;
        r1 = r0.getLayout();
        r6 = r0.getPaint();
        r2 = r0.getText();
        r7 = g;	 Catch:{ UnsupportedOperationException -> 0x0180 }
        if (r7 == 0) goto L_0x00bb;
    L_0x00b5:
        r7 = -16711936; // 0xffffffffff00ff00 float:-1.7146522E38 double:NaN;
        r0.setTextColor(r7);	 Catch:{ UnsupportedOperationException -> 0x0180 }
    L_0x00bb:
        r7 = r0.getLineCount();
        if (r7 <= 0) goto L_0x00d3;
    L_0x00c1:
        r8 = r7 + -1;
        r8 = r1.getLineStart(r8);
        r7 = r7 + -1;
        r1 = r1.getLineEnd(r7);
        r1 = r2.subSequence(r8, r1);
        if (r3 == 0) goto L_0x00d4;
    L_0x00d3:
        r1 = r2;
    L_0x00d4:
        r7 = r1.length();
        r1 = r6.measureText(r1, r10, r7);
        r6 = r0.getWidth();
        r7 = r0.getCompoundPaddingLeft();
        r6 = r6 - r7;
        r7 = r0.getCompoundPaddingRight();
        r6 = r6 - r7;
        r6 = (float) r6;
        r2 = r2.toString();
        r7 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0182 }
        r7.<init>();	 Catch:{ UnsupportedOperationException -> 0x0182 }
        r8 = z;	 Catch:{ UnsupportedOperationException -> 0x0182 }
        r9 = 51;
        r8 = r8[r9];	 Catch:{ UnsupportedOperationException -> 0x0182 }
        r7 = r7.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0182 }
        r7 = r7.append(r2);	 Catch:{ UnsupportedOperationException -> 0x0182 }
        r7 = r7.toString();	 Catch:{ UnsupportedOperationException -> 0x0182 }
        com.whatsapp.util.Log.i(r7);	 Catch:{ UnsupportedOperationException -> 0x0182 }
        r7 = 0;
        r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r7 <= 0) goto L_0x017c;
    L_0x010e:
        r0 = a(r0);	 Catch:{ UnsupportedOperationException -> 0x0184 }
        if (r0 == 0) goto L_0x017c;
    L_0x0114:
        r0 = android.text.TextUtils.isEmpty(r2);	 Catch:{ UnsupportedOperationException -> 0x0186 }
        if (r0 != 0) goto L_0x017c;
    L_0x011a:
        r0 = h;	 Catch:{ UnsupportedOperationException -> 0x0186 }
        if (r0 == 0) goto L_0x017c;
    L_0x011e:
        r7 = new org.json.JSONArray;
        r7.<init>();
        r0 = 10;
        if (r4 >= r0) goto L_0x018a;
    L_0x0127:
        r0 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0188 }
        r0.<init>();	 Catch:{ UnsupportedOperationException -> 0x0188 }
        r8 = "0";
        r0 = r0.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0188 }
        r0 = r0.append(r4);	 Catch:{ UnsupportedOperationException -> 0x0188 }
        r0 = r0.toString();	 Catch:{ UnsupportedOperationException -> 0x0188 }
    L_0x013a:
        r8 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x018f }
        r8.<init>();	 Catch:{ UnsupportedOperationException -> 0x018f }
        r9 = e;	 Catch:{ UnsupportedOperationException -> 0x018f }
        r8 = r8.append(r9);	 Catch:{ UnsupportedOperationException -> 0x018f }
        r9 = "-";
        r8 = r8.append(r9);	 Catch:{ UnsupportedOperationException -> 0x018f }
        r0 = r8.append(r0);	 Catch:{ UnsupportedOperationException -> 0x018f }
        r0 = r0.toString();	 Catch:{ UnsupportedOperationException -> 0x018f }
        r7.put(r0);	 Catch:{ UnsupportedOperationException -> 0x018f }
        r7.put(r2);	 Catch:{ UnsupportedOperationException -> 0x018f }
        r8 = (double) r6;	 Catch:{ UnsupportedOperationException -> 0x018f }
        r0 = java.lang.Double.valueOf(r8);	 Catch:{ UnsupportedOperationException -> 0x018f }
        r7.put(r0);	 Catch:{ UnsupportedOperationException -> 0x018f }
        r8 = (double) r1;	 Catch:{ UnsupportedOperationException -> 0x018f }
        r0 = java.lang.Double.valueOf(r8);	 Catch:{ UnsupportedOperationException -> 0x018f }
        r7.put(r0);	 Catch:{ UnsupportedOperationException -> 0x018f }
        r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0173;
    L_0x016d:
        r0 = 1;
        r7.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        if (r3 == 0) goto L_0x0177;
    L_0x0173:
        r0 = 0;
        r7.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0191 }
    L_0x0177:
        r0 = n;
        r0.put(r7);
    L_0x017c:
        if (r3 == 0) goto L_0x0099;
    L_0x017e:
        goto L_0x0007;
    L_0x0180:
        r0 = move-exception;
        throw r0;
    L_0x0182:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0184 }
    L_0x0184:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0186 }
    L_0x0186:
        r0 = move-exception;
        throw r0;
    L_0x0188:
        r0 = move-exception;
        throw r0;
    L_0x018a:
        r0 = java.lang.String.valueOf(r4);
        goto L_0x013a;
    L_0x018f:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0191 }
    L_0x0191:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.g.a(android.view.ViewGroup, android.app.Activity, boolean):void");
    }

    public static void a(Activity activity) {
        LayoutInflater.from(activity).setFactory(new bk(activity));
    }

    static void a(CharSequence charSequence, Activity activity) {
        b(charSequence, activity);
    }

    static void a(String str, AttributeSet attributeSet, LayoutInflater layoutInflater, View[] viewArr) {
        b(str, attributeSet, layoutInflater, viewArr);
    }

    static {
        String[] strArr = new String[54];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "\u0017\u000b";
        int i2 = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case PBE.MD5 /*0*/:
                        i4 = 126;
                        break;
                    case ay.f /*1*/:
                        i4 = 124;
                        break;
                    case ay.n /*2*/:
                        i4 = 126;
                        break;
                    case ay.p /*3*/:
                        i4 = 50;
                        break;
                    default:
                        i4 = 78;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "\u0017\u0018";
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u000f\u001bF;\u000e\\\u001d]#\u000e\u0010\u001bF+D\\";
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "^\u0018\u0017@+\u001d\b\u0011@7";
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "<.";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u000f\u001bF\u001b\u000e\\\u001d@+\u001f\b\u0017\\)^\b\fG \u001d\u001d\n[!\u0010\u000f^T'\u0012\u0019^W6\u001d\u0019\u000eF'\u0011\u0012^";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] \r";
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u000f\u001bF\u001b\u000e\\\u0013S*\u001b\\-Q<\u001b\u0019\u0010A&\u0011\b\r\u0012*\u0017\u000e\u001bQ:\u0011\u000e\u0007";
                    i2 = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "P\u0016\r] ";
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u000e\b";
                    i2 = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u000f\u001bF\u001b\u000e\\\u0013S*\u001b\\";
                    i2 = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0016\u0019";
                    i2 = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0004\u0014";
                    i2 = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0017\u0012";
                    i2 = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "P\u0016\r] ";
                    i2 = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] \rQ";
                    i2 = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\b\u001fY+-\u001f\fW+\u0010\u000f\u0016]:^\u000f\u001d@+\u001b\u0012\rZ!\n\\\rG-\u001d\u0019\rAn\t\u0015\nZn\r\u0015\u001a\u0012";
                    i2 = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\b\u001fY+-\u001f\fW+\u0010\u000f\u0016]:^\u0015\u0010Q<\u001b\u0011\u001b\\:\u001b\u0018-{\n\u0017\u000f^F<\u000b\u0019E\u0012=\u0017\u0018^[=^";
                    i2 = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "P\f\u0010U";
                    i2 = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\b\u001fY+-\u001f\fW+\u0010\u000f\u0016]:^QSF<\u000b\u0012\u001dS:\u0017\u0013\u0010A\u001d\u001d\u000e\u001bW \r\u0014\u0011F\u0007:G";
                    i2 = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\b\u001fY+-\u001f\fW+\u0010\u000f\u0016]:^\u001e\u0017F#\u001f\f^A/\u0013\u0019E\u0012:\u0011#\t@'\n\u0019D\u0012";
                    i2 = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\t\u0015\u0010V!\t";
                    i2 = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\b\u001fY+-\u001f\fW+\u0010\u000f\u0016]:^\u000f\u0017VnC\\\f]!\n(\u0011a\u0007:R\u0019W:V\u0017\u001bKgE\\\r[*^\u0015\r\u0012";
                    i2 = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\b\u001fY+-\u001f\fW+\u0010\u000f\u0016]:^\u001d\nF+\u0013\f\n\u0012=\u001d\u000e\u001bW \r\u0014\u0011Fn\u0011\u001a^T;\u0012\u0010^S-\n\u0015\b[:\u0007";
                    i2 = 23;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\b\u001fY+-\u001f\fW+\u0010\u000f\u0016]:^\u001d\nF+\u0013\f\n\u0012=\u001d\u000e\u001bW \r\u0014\u0011Fn\u0011\u001a^_+\u0010\t";
                    i2 = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\b\u001fY+-\u001f\fW+\u0010\u000f\u0016]:^\u0015\u0011\u0012+\u0006\u001f\u001bB:\u0017\u0013\u0010";
                    i2 = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\b\u001fY+-\u001f\fW+\u0010\u000f\u0016]:^\u0019\u0006Q+\u000e\b\u0017] ^\u001f\fW/\n\u0015\u0010Un\u0018\u0015\u0012Wn";
                    i2 = 26;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimary /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "^\u000e\u0011]:D\\";
                    i2 = 27;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\b\u001fY+-\u001f\fW+\u0010\u000f\u0016]:^\u000f\u001b@'\u001b\u000f^[=^\u0012\u000b^\"";
                    i2 = 28;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\b\u001fY+-\u001f\fW+\u0010\u000f\u0016]:^\u0014\u001b[)\u0016\b^F!\u0011\\\u0012S<\u0019\u0019^\u001fp^\u0010\u0017Y+\u0012\u0005^\\!\n\\\u001f\u0012#\u001b\u0012\u000b\tn\u001c\u0011!Z+\u0017\u001b\u0016FnC\\";
                    i2 = 29;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerItemStyle /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u001a\u0017\\*0\u0019\ts \u001a\u000e\u0011[*^\b\u001bJ:D\\";
                    i2 = 30;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u001a\u0017\\*0\u0019\ts \u001a\u000e\u0011[*^\u000f\u0015[>\u000e\u0019\u001a";
                    i2 = 31;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u001a\u0017\\*0\u0019\ts \u001a\u000e\u0011[*";
                    i2 = 32;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchDropdownBackground /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u001a\u0017\\*0\u0019\ts \u001a\u000e\u0011[*^\u0017\u001bKt^";
                    i2 = 33;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewCloseIcon /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u001a\u0017\\*0\u0019\ts \u001a\u000e\u0011[*^\u000f\u0017Vt^";
                    i2 = 34;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewGoIcon /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u001a\u0017\\*3\u0019\u0010G\u001a\f\t\u0010Q/\n\u0015\u0011\\=";
                    i2 = 35;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u001a\u0017\\*3\u0019\u0010G\u001a\f\t\u0010Q/\n\u0015\u0011\\=^\u001a\u001fQ:\u0011\u000e\u0007\u0012/\u0012\u000e\u001bS*\u0007\\\u001bJ'\r\b\r";
                    i2 = 36;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u001a\u0017\\/\u0012\u0015\u0004Wn4/1|n\u001b\u0004\u001dW>\n\u0015\u0011\\n";
                    i2 = 37;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQuery /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "P\f\u0010U";
                    i2 = 38;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u001a\u0017\\/\u0012\u0015\u0004Wn\u001d\u0013\u0013B\"\u001b\b\u001b";
                    i2 = 39;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextField /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u0012\u0013\u001dS\"\u001b";
                    i2 = 40;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "?\u0012\u001a@!\u0017\u0018";
                    i2 = 41;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textColorSearchUrl /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\r\b\f[ \u0019\u000f";
                    i2 = 42;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_searchResultListItemHeight /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u000e\u0010\u001fF(\u0011\u000e\u0013";
                    i2 = 43;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultTitle /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u001a\u0017\\/\u0012\u0015\u0004Wn\u001b\u0004\u001dW>\n\u0015\u0011\\n\u001d\u0010\u0011A'\u0010\u001b^F<\u000b\u0012\u001dS:\u0017\u0013\u0010An\u0018\u0015\u0012Wn";
                    i2 = 44;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSearchResultSubtitle /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "0\u0019\t\u0012\u001d\u001b\u000e\u0017W=";
                    i2 = 45;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemHeightSmall /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "V\u0019PU`^?6s\u001a-U";
                    i2 = 46;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingLeft /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "<\u0019\u0019[ ^/\u001b@'\u001b\u000f";
                    i2 = 47;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_listPreferredItemPaddingRight /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u001a\u0017\\**\u000e\u000b\\-\u001f\b\u0017] \r";
                    i2 = 48;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceListItemSmall /*48*/:
                    strArr2[i] = str;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u001a\u0017\\**\u000e\u000b\\-\u001f\b\u0017] \r\\\r[*D\\";
                    i2 = 49;
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowMinWidthMajor /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    strArr2 = strArr3;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u001a\u0017\\**\u000e\u000b\\-\u001f\b\u0017] \r\\\nW6\nF^";
                    i2 = 50;
                    break;
                case vk.SherlockTheme_windowMinWidthMinor /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u001a\u0017\\**\u000e\u000b\\-\u001f\b\u0017] \r\\\rY'\u000e\f\u001bV";
                    i2 = 51;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_dividerVertical /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\n\u000e\u000b\\-\u001f\b\u0017] +\b\u0017^=Q\u001a\u0017\\**\u000e\u000b\\-\u001f\b\u0017] \r\\\u0015W7D\\";
                    i2 = 52;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionDropDownStyle /*52*/:
                    strArr2[i] = str;
                    z = strArr3;
                    h = null;
                    e = null;
                    char[] toCharArray2 = "\u001f\u0012\u001a@!\u0017\u0018S".toCharArray();
                    i = toCharArray2.length;
                    toCharArray = toCharArray2;
                    for (int i5 = 0; i > i5; i5++) {
                        char c2 = toCharArray[i5];
                        switch (i5 % 5) {
                            case PBE.MD5 /*0*/:
                                i2 = 126;
                                break;
                            case ay.f /*1*/:
                                i2 = 124;
                                break;
                            case ay.n /*2*/:
                                i2 = 126;
                                break;
                            case ay.p /*3*/:
                                i2 = 50;
                                break;
                            default:
                                i2 = 78;
                                break;
                        }
                        toCharArray[i5] = (char) (i2 ^ c2);
                    }
                    o = new String(toCharArray).intern();
                    f = null;
                    c = -1;
                    m = null;
                    n = null;
                    b = false;
                    d = new HashSet();
                    a = null;
                    j = null;
                    k = new HashMap();
                    g = false;
                    l = "";
                    i = null;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "-\u001f\fW+\u0010\u000f\u0016]:\r";
                    i2 = false;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(java.lang.CharSequence r8, android.app.Activity r9) {
        /*
        r6 = 1;
        r2 = com.whatsapp.util.Log.e;
        r0 = r8.toString();
        r1 = 32;
        r3 = 95;
        r3 = r0.replace(r1, r3);
        r0 = z;
        r1 = 7;
        r0 = r0[r1];
        r0 = z;
        r1 = 9;
        r0 = r0[r1];
        r0 = java.util.Locale.getDefault();
        r0 = r0.getLanguage();
        r1 = java.util.Locale.getDefault();
        r1 = r1.getCountry();
        r4 = z;
        r5 = 14;
        r4 = r4[r5];
        r4 = r0.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x003d;
    L_0x0036:
        r0 = z;
        r4 = 2;
        r0 = r0[r4];
        if (r2 == 0) goto L_0x01db;
    L_0x003d:
        r4 = z;	 Catch:{ IOException -> 0x01a8 }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ IOException -> 0x01a8 }
        r4 = r0.equalsIgnoreCase(r4);	 Catch:{ IOException -> 0x01a8 }
        if (r4 == 0) goto L_0x0050;
    L_0x0048:
        r0 = z;
        r4 = 12;
        r0 = r0[r4];
        if (r2 == 0) goto L_0x01db;
    L_0x0050:
        r4 = z;	 Catch:{ IOException -> 0x01aa }
        r5 = 13;
        r4 = r4[r5];	 Catch:{ IOException -> 0x01aa }
        r4 = r0.equalsIgnoreCase(r4);	 Catch:{ IOException -> 0x01aa }
        if (r4 == 0) goto L_0x0075;
    L_0x005c:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r4.append(r0);
        r4 = "_";
        r0 = r0.append(r4);
        r0 = r0.append(r1);
        r0 = r0.toString();
        if (r2 == 0) goto L_0x01db;
    L_0x0075:
        r4 = z;	 Catch:{ IOException -> 0x01ac }
        r5 = 10;
        r4 = r4[r5];	 Catch:{ IOException -> 0x01ac }
        r4 = r0.equalsIgnoreCase(r4);	 Catch:{ IOException -> 0x01ac }
        if (r4 == 0) goto L_0x01db;
    L_0x0081:
        r4 = z;	 Catch:{ IOException -> 0x01ae }
        r5 = 5;
        r4 = r4[r5];	 Catch:{ IOException -> 0x01ae }
        r4 = r4.equalsIgnoreCase(r1);	 Catch:{ IOException -> 0x01ae }
        if (r4 == 0) goto L_0x01db;
    L_0x008c:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r4.append(r0);
        r4 = "_";
        r0 = r0.append(r4);
        r0 = r0.append(r1);
        r0 = r0.toString();
        r1 = r0;
    L_0x00a4:
        r0 = l;	 Catch:{ IOException -> 0x01b0 }
        r0 = r1.equalsIgnoreCase(r0);	 Catch:{ IOException -> 0x01b0 }
        if (r0 != 0) goto L_0x00b1;
    L_0x00ac:
        r0 = k;	 Catch:{ IOException -> 0x01b0 }
        r0.clear();	 Catch:{ IOException -> 0x01b0 }
    L_0x00b1:
        r0 = com.whatsapp.App.ao;
        r4 = new java.io.File;
        r5 = z;
        r5 = r5[r6];
        r4.<init>(r0, r5);
        r0 = r4.exists();	 Catch:{ IOException -> 0x01b2 }
        if (r0 != 0) goto L_0x00ce;
    L_0x00c2:
        r4.mkdir();	 Catch:{ IOException -> 0x01b2 }
        r0 = z;	 Catch:{ IOException -> 0x01b2 }
        r5 = 8;
        r0 = r0[r5];	 Catch:{ IOException -> 0x01b2 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x01b2 }
    L_0x00ce:
        r0 = new java.io.File;
        r0.<init>(r4, r1);
        r4 = r0.exists();	 Catch:{ IOException -> 0x01b4 }
        if (r4 != 0) goto L_0x0104;
    L_0x00d9:
        r0.mkdir();	 Catch:{ IOException -> 0x01b4 }
        r4 = k;	 Catch:{ IOException -> 0x01b4 }
        r4.clear();	 Catch:{ IOException -> 0x01b4 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01b4 }
        r4.<init>();	 Catch:{ IOException -> 0x01b4 }
        r5 = z;	 Catch:{ IOException -> 0x01b4 }
        r6 = 11;
        r5 = r5[r6];	 Catch:{ IOException -> 0x01b4 }
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x01b4 }
        r4 = r4.append(r1);	 Catch:{ IOException -> 0x01b4 }
        r5 = z;	 Catch:{ IOException -> 0x01b4 }
        r6 = 4;
        r5 = r5[r6];	 Catch:{ IOException -> 0x01b4 }
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x01b4 }
        r4 = r4.toString();	 Catch:{ IOException -> 0x01b4 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x01b4 }
    L_0x0104:
        i = r0;
        r4 = new java.io.File;
        r0 = i;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 16;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r1);
        r6 = z;
        r7 = 15;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.toString();
        r4.<init>(r0, r5);
        e = r3;	 Catch:{ IOException -> 0x01b6 }
        r0 = k;	 Catch:{ IOException -> 0x01b6 }
        r3 = e;	 Catch:{ IOException -> 0x01b6 }
        r0 = r0.containsKey(r3);	 Catch:{ IOException -> 0x01b6 }
        if (r0 == 0) goto L_0x014c;
    L_0x013a:
        r0 = k;	 Catch:{ IOException -> 0x01b6 }
        r3 = e;	 Catch:{ IOException -> 0x01b6 }
        r0 = r0.get(r3);	 Catch:{ IOException -> 0x01b6 }
        r0 = (java.lang.Integer) r0;	 Catch:{ IOException -> 0x01b6 }
        r0 = r0.intValue();	 Catch:{ IOException -> 0x01b6 }
        c = r0;	 Catch:{ IOException -> 0x01b6 }
        if (r2 == 0) goto L_0x014f;
    L_0x014c:
        r0 = 0;
        c = r0;	 Catch:{ IOException -> 0x01b8 }
    L_0x014f:
        r0 = r4.exists();	 Catch:{ IOException -> 0x01ba }
        if (r0 != 0) goto L_0x0158;
    L_0x0155:
        r4.createNewFile();	 Catch:{ IOException -> 0x01ba }
    L_0x0158:
        r0 = new java.io.FileWriter;	 Catch:{ IOException -> 0x01bc }
        r2 = r4.getAbsoluteFile();	 Catch:{ IOException -> 0x01bc }
        r3 = 1;
        r0.<init>(r2, r3);	 Catch:{ IOException -> 0x01bc }
        h = r0;	 Catch:{ IOException -> 0x01bc }
    L_0x0164:
        l = r1;
        r0 = new java.util.HashMap;
        r0.<init>();
        a = r0;
        r0 = new java.util.HashMap;
        r0.<init>();
        j = r0;
        r0 = new org.json.JSONObject;
        r0.<init>();
        m = r0;
        r0 = new org.json.JSONArray;
        r0.<init>();
        n = r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = e;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r9.finish();
        r0 = r9.getIntent();
        r9.startActivity(r0);
        return;
    L_0x01a8:
        r0 = move-exception;
        throw r0;
    L_0x01aa:
        r0 = move-exception;
        throw r0;
    L_0x01ac:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01ae }
    L_0x01ae:
        r0 = move-exception;
        throw r0;
    L_0x01b0:
        r0 = move-exception;
        throw r0;
    L_0x01b2:
        r0 = move-exception;
        throw r0;
    L_0x01b4:
        r0 = move-exception;
        throw r0;
    L_0x01b6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01b8 }
    L_0x01b8:
        r0 = move-exception;
        throw r0;
    L_0x01ba:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01bc }
    L_0x01bc:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r0.toString();
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0164;
    L_0x01db:
        r1 = r0;
        goto L_0x00a4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.g.b(java.lang.CharSequence, android.app.Activity):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.view.View r11, long r12, boolean r14, android.app.Activity r15) {
        /*
        r8 = com.whatsapp.util.Log.e;
        r0 = z;
        r1 = 22;
        r0 = r0[r1];
        r0 = r15.getSystemService(r0);
        r0 = (android.view.WindowManager) r0;
        r0 = r0.getDefaultDisplay();
        r2 = r0.getHeight();
        r3 = r0.getWidth();
        r5 = r11.getRootView();
        if (r5 != 0) goto L_0x0021;
    L_0x0020:
        return;
    L_0x0021:
        r0 = 1;
        r5.setDrawingCacheEnabled(r0);
        r6 = r5.getDrawingCache();
        if (r6 == 0) goto L_0x0020;
    L_0x002b:
        r0 = r6.getHeight();
        if (r14 == 0) goto L_0x0052;
    L_0x0031:
        r1 = r2 + -25;
        if (r0 < r1) goto L_0x0052;
    L_0x0035:
        r1 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x0050 }
        r1.<init>();	 Catch:{ OutOfMemoryError -> 0x0050 }
        r2 = z;	 Catch:{ OutOfMemoryError -> 0x0050 }
        r3 = 30;
        r2 = r2[r3];	 Catch:{ OutOfMemoryError -> 0x0050 }
        r1 = r1.append(r2);	 Catch:{ OutOfMemoryError -> 0x0050 }
        r0 = r1.append(r0);	 Catch:{ OutOfMemoryError -> 0x0050 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x0050 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x0050 }
        goto L_0x0020;
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r0 = a;	 Catch:{ OutOfMemoryError -> 0x0078 }
        if (r0 != 0) goto L_0x005d;
    L_0x0056:
        r0 = new java.util.HashMap;	 Catch:{ OutOfMemoryError -> 0x0078 }
        r0.<init>();	 Catch:{ OutOfMemoryError -> 0x0078 }
        a = r0;	 Catch:{ OutOfMemoryError -> 0x0078 }
    L_0x005d:
        r0 = j;	 Catch:{ OutOfMemoryError -> 0x007a }
        if (r0 != 0) goto L_0x0068;
    L_0x0061:
        r0 = new java.util.HashMap;	 Catch:{ OutOfMemoryError -> 0x007a }
        r0.<init>();	 Catch:{ OutOfMemoryError -> 0x007a }
        j = r0;	 Catch:{ OutOfMemoryError -> 0x007a }
    L_0x0068:
        r0 = e;	 Catch:{ OutOfMemoryError -> 0x0076 }
        if (r0 != 0) goto L_0x007c;
    L_0x006c:
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0076 }
        r1 = 29;
        r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x0076 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x0076 }
        goto L_0x0020;
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r0 = move-exception;
        throw r0;
    L_0x007a:
        r0 = move-exception;
        throw r0;
    L_0x007c:
        r1 = 0;
        r0 = a;
        r4 = java.lang.Long.valueOf(r12);
        r0 = r0.containsKey(r4);
        if (r0 == 0) goto L_0x00b5;
    L_0x0089:
        r0 = a;
        r4 = java.lang.Long.valueOf(r12);
        r0 = r0.get(r4);
        r0 = (java.lang.Integer) r0;
        r4 = r0.intValue();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r7 = z;
        r9 = 23;
        r7 = r7[r9];
        r0 = r0.append(r7);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r8 == 0) goto L_0x02de;
    L_0x00b5:
        r0 = c;
        r4 = r0 + 1;
        c = r4;
        r0 = 1;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r7 = z;
        r9 = 18;
        r7 = r7[r9];
        r1 = r1.append(r7);
        r1 = r1.append(r4);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r7 = r0;
    L_0x00d7:
        if (r14 == 0) goto L_0x010f;
    L_0x00d9:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = 25;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ OutOfMemoryError -> 0x028d }
        r0 = android.graphics.Bitmap.createBitmap(r3, r2, r0);	 Catch:{ OutOfMemoryError -> 0x028d }
    L_0x00e8:
        r1 = new android.graphics.Canvas;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1.<init>(r0);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r2 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;
        r2 = r15.findViewById(r2);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r2 = r2.getRootView();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r2.draw(r1);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r2 = 2;
        r2 = new int[r2];	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r5.getLocationOnScreen(r2);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r3 = 0;
        r3 = r2[r3];	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r3 = (float) r3;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r5 = 1;
        r2 = r2[r5];	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r2 = (float) r2;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r5 = 0;
        r1.drawBitmap(r6, r3, r2, r5);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        if (r8 == 0) goto L_0x02db;
    L_0x010f:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = 24;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r5 = r6;
    L_0x0119:
        r2 = 0;
        r9 = new java.util.HashSet;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r9.<init>();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0 = j;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0 = r0.keySet();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r10 = r0.iterator();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
    L_0x0129:
        r0 = r10.hasNext();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        if (r0 == 0) goto L_0x02d7;
    L_0x012f:
        r0 = r10.next();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = j;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = r1.get(r0);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = (java.lang.Integer) r1;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r3 = r1.intValue();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        if (r14 == 0) goto L_0x02d3;
    L_0x0143:
        r1 = r0.sameAs(r5);	 Catch:{ OutOfMemoryError -> 0x0299 }
        if (r1 != 0) goto L_0x014f;
    L_0x0149:
        r1 = r0.sameAs(r6);	 Catch:{ OutOfMemoryError -> 0x029b }
        if (r1 == 0) goto L_0x02d3;
    L_0x014f:
        r1 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1.<init>();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r2 = z;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r4 = 21;
        r2 = r2[r4];	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r2 = r0.sameAs(r5);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r2 = z;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r4 = 28;
        r2 = r2[r4];	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r2 = r0.sameAs(r6);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = r1.toString();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        com.whatsapp.util.Log.i(r1);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = 1;
        if (r8 == 0) goto L_0x02d0;
    L_0x0182:
        r2 = r3;
    L_0x0183:
        r4 = c;	 Catch:{ OutOfMemoryError -> 0x02be }
        r3 = r4 - r3;
        r4 = 3;
        if (r3 <= r4) goto L_0x018d;
    L_0x018a:
        r9.add(r0);	 Catch:{ OutOfMemoryError -> 0x02c0 }
    L_0x018d:
        if (r8 == 0) goto L_0x02cc;
    L_0x018f:
        r3 = r9.iterator();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
    L_0x0193:
        r0 = r3.hasNext();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        if (r0 == 0) goto L_0x01a6;
    L_0x0199:
        r0 = r3.next();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r4 = j;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r4.remove(r0);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        if (r8 == 0) goto L_0x0193;
    L_0x01a6:
        if (r1 == 0) goto L_0x01cc;
    L_0x01a8:
        if (r7 == 0) goto L_0x01cc;
    L_0x01aa:
        r0 = c;	 Catch:{ OutOfMemoryError -> 0x02c2 }
        r0 = r0 + -1;
        c = r0;	 Catch:{ OutOfMemoryError -> 0x02c2 }
        r0 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x02c2 }
        r0.<init>();	 Catch:{ OutOfMemoryError -> 0x02c2 }
        r1 = z;	 Catch:{ OutOfMemoryError -> 0x02c2 }
        r3 = 20;
        r1 = r1[r3];	 Catch:{ OutOfMemoryError -> 0x02c2 }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x02c2 }
        r1 = c;	 Catch:{ OutOfMemoryError -> 0x02c2 }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x02c2 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x02c2 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x02c2 }
    L_0x01cc:
        r0 = 10;
        if (r2 >= r0) goto L_0x02c6;
    L_0x01d0:
        r0 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x02c4 }
        r0.<init>();	 Catch:{ OutOfMemoryError -> 0x02c4 }
        r1 = "0";
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x02c4 }
        r0 = r0.append(r2);	 Catch:{ OutOfMemoryError -> 0x02c4 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x02c4 }
    L_0x01e3:
        r1 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r3 = i;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r4 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r4.<init>();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r7 = o;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r4 = r4.append(r7);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r7 = f;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r4 = r4.append(r7);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r7 = "-";
        r4 = r4.append(r7);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r7 = e;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r4 = r4.append(r7);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r7 = "-";
        r4 = r4.append(r7);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0 = r4.append(r0);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r4 = z;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r7 = 19;
        r4 = r4[r7];	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0 = r0.append(r4);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0 = r0.toString();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1.<init>(r3, r0);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0.<init>(r1);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = android.graphics.Bitmap.CompressFormat.PNG;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r3 = 100;
        r5.compress(r1, r3, r0);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = a;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r3 = java.lang.Long.valueOf(r12);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r4 = java.lang.Integer.valueOf(r2);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1.put(r3, r4);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = j;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r3 = java.lang.Integer.valueOf(r2);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1.put(r6, r3);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = j;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r3 = java.lang.Integer.valueOf(r2);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1.put(r5, r3);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0.flush();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0.close();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0.<init>();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r1 = z;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r3 = 17;
        r1 = r1[r3];	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0 = r0.append(r1);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0 = r0.append(r2);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0 = r0.toString();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        goto L_0x0020;
    L_0x026c:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 27;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0020;
    L_0x028d:
        r0 = move-exception;
        java.lang.System.gc();	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0 = android.graphics.Bitmap.Config.ARGB_4444;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        r0 = android.graphics.Bitmap.createBitmap(r3, r2, r0);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        goto L_0x00e8;
    L_0x0299:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x029b }
    L_0x029b:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
    L_0x029d:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 26;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0020;
    L_0x02be:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x02c0 }
    L_0x02c0:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
    L_0x02c2:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
    L_0x02c4:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
    L_0x02c6:
        r0 = java.lang.String.valueOf(r2);	 Catch:{ FileNotFoundException -> 0x026c, IOException -> 0x029d }
        goto L_0x01e3;
    L_0x02cc:
        r4 = r2;
        r2 = r1;
        goto L_0x0129;
    L_0x02d0:
        r2 = r3;
        goto L_0x018f;
    L_0x02d3:
        r1 = r2;
        r2 = r4;
        goto L_0x0183;
    L_0x02d7:
        r1 = r2;
        r2 = r4;
        goto L_0x018f;
    L_0x02db:
        r5 = r0;
        goto L_0x0119;
    L_0x02de:
        r7 = r1;
        goto L_0x00d7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.g.a(android.view.View, long, boolean, android.app.Activity):void");
    }

    private static boolean a(View view) {
        View rootView = view.getRootView();
        while (view != rootView) {
            try {
                if (view.getVisibility() != 0) {
                    return false;
                }
                ViewParent parent = view.getParent();
                if (parent == null) {
                    return false;
                }
                try {
                    if (!(parent instanceof View)) {
                        return true;
                    }
                    View view2 = (View) parent;
                    if (view2 == null) {
                        return false;
                    }
                    view = view2;
                } catch (UnsupportedOperationException e) {
                    throw e;
                }
            } catch (UnsupportedOperationException e2) {
                throw e2;
            }
        }
        return true;
    }

    static Map d() {
        return a;
    }

    public static void b() {
        int i = Log.e;
        try {
            if (h != null) {
                m.put(z[44], z[42]);
                m.put(z[41], l);
                m.put(z[43], n);
                h.write(m.toString() + "\n");
                h.flush();
                h.close();
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (IOException e2) {
            Log.e(z[45] + e2.toString());
        } catch (JSONException e3) {
            Log.e(z[38] + e3.toString());
        }
        k.put(e, Integer.valueOf(c));
        int i2 = c + 1;
        while (true) {
            String str;
            if (i2 < 10) {
                str = "0" + i2;
            } else {
                str = String.valueOf(i2);
            }
            File file = new File(i, o + f + "-" + e + "-" + str + z[39]);
            try {
                if (!file.exists() && i == 0) {
                    break;
                }
                file.delete();
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            } catch (IOException e22) {
                throw e22;
            } catch (IOException e222) {
                throw e222;
            }
        }
        try {
            h = null;
            e = null;
            c = 0;
            m = null;
            n = null;
            a = null;
            j = null;
            i = null;
            Log.i(z[40]);
            if (DialogToastActivity.i) {
                Log.e = i + 1;
            }
        } catch (IOException e2222) {
            throw e2222;
        }
    }

    public static void a(Activity activity, boolean z) {
        a((ViewGroup) activity.findViewById(16908290).getRootView(), activity, z);
    }

    public static Builder c(Activity activity) {
        Builder builder = new Builder(activity);
        builder.setTitle(z[46]);
        builder.setMessage(z[47]);
        View inflate = activity.getLayoutInflater().inflate(R.layout.truncation_setup_dialog, null);
        builder.setView(inflate);
        builder.setPositiveButton(z[48], new ay((EditText) inflate.findViewById(R.id.series_entry), (CheckBox) inflate.findViewById(R.id.chkOrientation), (CheckBox) inflate.findViewById(R.id.chkVisual), activity));
        return builder;
    }

    static Set f() {
        return d;
    }
}
