package com.whatsapp.preference;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.whatsapp.DialogToastActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class WaMultiSelectListPreference extends WaListPreference {
    private static final String[] z;
    private String b;
    private String c;
    private boolean[] d;
    private String e;

    static {
        String[] strArr = new String[3];
        String str = "\u001c\u000434\u0013\u0002\u00143%\u0019%=63\u000e\u0001\u0003:&\u001f#\u00141#\u001fq\u0003:1\u000f8\u0003:3Z0\u001f\u007f%\u0014%\u00036%\tq\u0010-2\u001b(Q>.\u001eq\u00101`\u001f?\u0005-9,0\u001d*%\tq\u0010-2\u001b(Q((\u00132\u0019\u007f!\b4Q=/\u000e9Q+(\u001fq\u0002>-\u001fq\u001d:.\u001d%\u0019";
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
                        i3 = 81;
                        break;
                    case ay.f /*1*/:
                        i3 = 113;
                        break;
                    case ay.n /*2*/:
                        i3 = 95;
                        break;
                    case ay.p /*3*/:
                        i3 = 64;
                        break;
                    default:
                        i3 = 122;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u001e'b\tG\t\u0002:0\u001b#\u0010+/\b\tL\u0016},\u001e";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "}Q";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void c(String str) {
        try {
            if (callChangeListener(a((CharSequence) str))) {
                setValue(str);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public WaMultiSelectListPreference(Context context) {
        this(context, null);
    }

    private CharSequence a(List list) {
        int i = WaListPreference.a;
        try {
            if (list.isEmpty()) {
                if (!TextUtils.isEmpty(this.c)) {
                    return this.c;
                }
            }
            Iterable arrayList = new ArrayList();
            CharSequence[] entries = getEntries();
            CharSequence[] entryValues = getEntryValues();
            try {
                try {
                    if (list.size() == entryValues.length) {
                        if (!TextUtils.isEmpty(this.b)) {
                            return this.b;
                        }
                    }
                    int length = entryValues.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        try {
                            if (list.contains(entryValues[i2])) {
                                arrayList.add((String) entries[i3]);
                            }
                            i3++;
                            int i4 = i2 + 1;
                            if (i != 0) {
                                break;
                            }
                            i2 = i4;
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                    return a(arrayList, z[1]);
                }
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    public void a(String str) {
        this.b = str;
    }

    private void a() {
        int i = WaListPreference.a;
        CharSequence[] entryValues = getEntryValues();
        CharSequence[] a = a(getValue());
        if (a != null) {
            List asList = Arrays.asList(a);
            int i2 = 0;
            while (i2 < entryValues.length) {
                this.d[i2] = asList.contains(entryValues[i2]);
                i2++;
                if (i != 0) {
                    return;
                }
            }
        }
    }

    protected void onDialogClosed(boolean z) {
        int i = WaListPreference.a;
        List arrayList = new ArrayList();
        CharSequence[] entryValues = getEntryValues();
        if (z && entryValues != null) {
            int i2 = 0;
            while (i2 < entryValues.length) {
                if (this.d[i2]) {
                    arrayList.add((String) entryValues[i2]);
                }
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
            String a = a(arrayList, this.e);
            setSummary(a(arrayList));
            c(a);
        }
    }

    public void b(String str) {
        this.c = str;
    }

    protected void onPrepareDialogBuilder(Builder builder) {
        CharSequence[] entries = getEntries();
        CharSequence[] entryValues = getEntryValues();
        try {
            if (!(entries == null || entryValues == null)) {
                if (entries.length == entryValues.length) {
                    a();
                    builder.setMultiChoiceItems(entries, this.d, new c(this));
                    return;
                }
            }
            throw new IllegalStateException(z[0]);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected void onSetInitialValue(boolean z, Object obj) {
        CharSequence a;
        int i = WaListPreference.a;
        if (obj == null) {
            Object obj2 = new Object[0];
            if (i == 0) {
                obj = obj2;
                a = a(Arrays.asList(obj), this.e);
                if (z) {
                    a = getPersistedString(a);
                }
                setSummary(a(Arrays.asList(a(a))));
                c(a);
                if (DialogToastActivity.i) {
                    WaListPreference.a = i + 1;
                }
            }
        }
        obj = (CharSequence[]) obj;
        a = a(Arrays.asList(obj), this.e);
        if (z) {
            a = getPersistedString(a);
        }
        try {
            setSummary(a(Arrays.asList(a(a))));
            c(a);
            if (DialogToastActivity.i) {
                WaListPreference.a = i + 1;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private CharSequence[] a(CharSequence charSequence) {
        try {
            if (charSequence != null) {
                if (!"".equals(charSequence)) {
                    return ((String) charSequence).split(this.e);
                }
            }
            return new CharSequence[0];
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected static String a(Iterable iterable, String str) {
        int i = WaListPreference.a;
        try {
            if (iterable != null) {
                Iterator it = iterable.iterator();
                if (it.hasNext()) {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(it.next()));
                    while (it.hasNext()) {
                        stringBuilder.append(str).append(it.next());
                        if (i != 0) {
                            break;
                        }
                    }
                    return stringBuilder.toString();
                }
            }
            return "";
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected Object onGetDefaultValue(TypedArray typedArray, int i) {
        return typedArray.getTextArray(i);
    }

    public void a(CharSequence[] charSequenceArr) {
        onSetInitialValue(false, charSequenceArr);
    }

    public WaMultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new boolean[getEntries().length];
        this.e = z[2];
    }

    static boolean[] a(WaMultiSelectListPreference waMultiSelectListPreference) {
        return waMultiSelectListPreference.d;
    }
}
