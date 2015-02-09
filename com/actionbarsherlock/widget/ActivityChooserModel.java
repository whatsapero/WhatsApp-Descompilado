package com.actionbarsherlock.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import com.actionbarsherlock.widget.ActivityChooserModel.HistoricalRecord;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;
import org.xmlpull.v1.XmlSerializer;

class ActivityChooserModel extends DataSetObservable {
    private static final String LOG_TAG;
    private static final Executor SERIAL_EXECUTOR;
    private static final Map sDataModelRegistry;
    private static final Object sRegistryLock;
    private static final String z;
    private final List mActivites;
    private OnChooseActivityListener mActivityChoserModelPolicy;
    private ActivitySorter mActivitySorter;
    private boolean mCanReadHistoricalData;
    private final Context mContext;
    private final List mHistoricalRecords;
    private boolean mHistoricalRecordsChanged;
    private final String mHistoryFileName;
    private int mHistoryMaxSize;
    private final Object mInstanceLock;
    private Intent mIntent;
    private boolean mReadShareHistoryCalled;

    public interface ActivityChooserModelClient {
    }

    public final class ActivityResolveInfo implements Comparable {
        private static final String[] z;
        public final ResolveInfo resolveInfo;
        public float weight;

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
            r2 = "\u00156\u0007\u001f1\u00116=\u001e;\bi";
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
            r0 = "\\s\u0003\u00154\u0000;\u0000J";
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
            r2 = 93;
        L_0x0038:
            r2 = r2 ^ r9;
            r2 = (char) r2;
            r6[r8] = r2;
            r2 = r8 + 1;
            r8 = r2;
            goto L_0x0012;
        L_0x0040:
            r2 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
            goto L_0x0038;
        L_0x0043:
            r2 = 83;
            goto L_0x0038;
        L_0x0046:
            r2 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
            goto L_0x0038;
        L_0x0049:
            r2 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
            goto L_0x0038;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.ActivityChooserModel.ActivityResolveInfo.<clinit>():void");
        }

        public int hashCode() {
            return Float.floatToIntBits(this.weight) + 31;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(z[0]).append(this.resolveInfo.toString());
            stringBuilder.append(z[1]).append(new BigDecimal((double) this.weight));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }

        public int compareTo(Object obj) {
            return compareTo((com.actionbarsherlock.widget.ActivityChooserModel.ActivityResolveInfo) obj);
        }

        public int compareTo(com.actionbarsherlock.widget.ActivityChooserModel.ActivityResolveInfo activityResolveInfo) {
            return Float.floatToIntBits(activityResolveInfo.weight) - Float.floatToIntBits(this.weight);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(this.weight) == Float.floatToIntBits(((com.actionbarsherlock.widget.ActivityChooserModel.ActivityResolveInfo) obj).weight);
        }
    }

    public interface ActivitySorter {
        void sort(Intent intent, List list, List list2);
    }

    public final class HistoricalRecord {
        private static final String[] z;
        public final ComponentName activity;
        public final long time;
        public final float weight;

        static {
            String[] strArr = new String[3];
            String str = "b8\u000f?\r<\"";
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
                            i3 = 89;
                            break;
                        case ay.f /*1*/:
                            i3 = 24;
                            break;
                        case ay.n /*2*/:
                            i3 = 123;
                            break;
                        case ay.p /*3*/:
                            i3 = 86;
                            break;
                        default:
                            i3 = 96;
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
                        str = "b8\u001a5\u00140n\u0012\"\u0019c";
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "b8\f3\t>p\u000fl";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public HistoricalRecord(ComponentName componentName, long j, float f) {
            this.activity = componentName;
            this.time = j;
            this.weight = f;
        }

        public int hashCode() {
            int i;
            if (this.activity == null) {
                i = 0;
            } else {
                i = this.activity.hashCode();
            }
            return ((((i + 31) * 31) + ((int) (this.time ^ (this.time >>> 32)))) * 31) + Float.floatToIntBits(this.weight);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            com.actionbarsherlock.widget.ActivityChooserModel.HistoricalRecord historicalRecord = (com.actionbarsherlock.widget.ActivityChooserModel.HistoricalRecord) obj;
            if (this.activity == null) {
                if (historicalRecord.activity != null) {
                    return false;
                }
            } else if (!this.activity.equals(historicalRecord.activity)) {
                return false;
            }
            if (this.time != historicalRecord.time) {
                return false;
            }
            return Float.floatToIntBits(this.weight) == Float.floatToIntBits(historicalRecord.weight);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(z[2]).append(this.activity);
            stringBuilder.append(z[0]).append(this.time);
            stringBuilder.append(z[1]).append(new BigDecimal((double) this.weight));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    final class HistoryPersister implements Runnable {
        private static final String[] z;
        final ActivityChooserModel this$0;

        static {
            String[] strArr = new String[12];
            String str = "=bV(\tXgV.\u000f\u0011~Cg\u0013\u0011cP(\t\u0011sE+[\nuG5\u0014\u001c0B.\u0017\u001d*\u0004";
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
                            i3 = 120;
                            break;
                        case ay.f /*1*/:
                            i3 = 16;
                            break;
                        case ay.n /*2*/:
                            i3 = 36;
                            break;
                        case ay.p /*3*/:
                            i3 = 71;
                            break;
                        default:
                            i3 = 123;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case PBE.MD5 /*0*/:
                        strArr2[i] = str;
                        str = "\u0010yW3\u0014\nyG&\u0017UbA$\u0014\ntW";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case ay.f /*1*/:
                        strArr2[i] = str;
                        str = "\u0010yW3\u0014\nyG&\u0017UbA$\u0014\nt";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case ay.n /*2*/:
                        strArr2[i] = str;
                        str = "\u0010yW3\u0014\nyG&\u0017UbA$\u0014\nt";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case ay.p /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "=bV(\tXgV.\u000f\u0011~Cg\u0013\u0011cP(\t\u0011sE+[\nuG5\u0014\u001c0B.\u0017\u001d*\u0004";
                        obj = 4;
                        break;
                    case aj.i /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "\u0019sP.\r\u0011d]";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case aV.r /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "=bV(\tXgV.\u000f\u0011~Cg\u0013\u0011cP(\t\u0011sE+[\nuG5\u0014\u001c0B.\u0017\u001d*\u0004";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case aV.i /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "\fyI\"";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case a8.s /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "\u0010yW3\u0014\nyG&\u0017UbA$\u0014\ntW";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case a8.n /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "\u000fuM \u0013\f";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case a6.D /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "=bV(\tXgV.\u000f\u0011~Cg\u0013\u0011cP(\t\u0011sE+[\nuG5\u0014\u001c0B.\u0017\u001d*\u0004";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case a6.h /*10*/:
                        strArr2[i] = str;
                        z = strArr3;
                    default:
                        strArr2[i] = str;
                        str = "-DbjC";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        HistoryPersister(ActivityChooserModel activityChooserModel, AnonymousClass_1 anonymousClass_1) {
            this(activityChooserModel);
        }

        private HistoryPersister(ActivityChooserModel activityChooserModel) {
            this.this$0 = activityChooserModel;
        }

        public void run() {
            boolean z = SearchView.a;
            synchronized (ActivityChooserModel.access$500(this.this$0)) {
                List arrayList = new ArrayList(ActivityChooserModel.access$600(this.this$0));
            }
            try {
                OutputStream openFileOutput = ActivityChooserModel.access$400(this.this$0).openFileOutput(ActivityChooserModel.access$300(this.this$0), 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument(z[1], Boolean.valueOf(true));
                    newSerializer.startTag(null, z[2]);
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        HistoricalRecord historicalRecord = (HistoricalRecord) arrayList.remove(0);
                        newSerializer.startTag(null, z[4]);
                        newSerializer.attribute(null, z[6], historicalRecord.activity.flattenToString());
                        newSerializer.attribute(null, z[8], String.valueOf(historicalRecord.time));
                        newSerializer.attribute(null, z[10], String.valueOf(historicalRecord.weight));
                        newSerializer.endTag(null, z[3]);
                        int i2 = i + 1;
                        if (z) {
                            break;
                        }
                        i = i2;
                    }
                    newSerializer.endTag(null, z[9]);
                    newSerializer.endDocument();
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (Throwable e2) {
                    Log.e(ActivityChooserModel.access$1100(), z[0] + ActivityChooserModel.access$300(this.this$0), e2);
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e3) {
                        }
                    }
                } catch (Throwable e22) {
                    Log.e(ActivityChooserModel.access$1100(), z[5] + ActivityChooserModel.access$300(this.this$0), e22);
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e4) {
                        }
                    }
                } catch (Throwable e222) {
                    Log.e(ActivityChooserModel.access$1100(), z[7] + ActivityChooserModel.access$300(this.this$0), e222);
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e5) {
                        }
                    }
                } catch (Throwable th) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e6) {
                        } catch (IllegalArgumentException e7) {
                            throw e7;
                        }
                    }
                }
            } catch (Throwable e2222) {
                Log.e(ActivityChooserModel.access$1100(), z[11] + ActivityChooserModel.access$300(this.this$0), e2222);
            }
        }
    }

    public interface OnChooseActivityListener {
        boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent);
    }

    public int getActivityCount() {
        int size;
        synchronized (this.mInstanceLock) {
            size = this.mActivites.size();
        }
        return size;
    }

    static List access$600(ActivityChooserModel activityChooserModel) {
        return activityChooserModel.mHistoricalRecords;
    }

    public ResolveInfo getActivity(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.mInstanceLock) {
            resolveInfo = ((ActivityResolveInfo) this.mActivites.get(i)).resolveInfo;
        }
        return resolveInfo;
    }

    public ResolveInfo getDefaultActivity() {
        synchronized (this.mInstanceLock) {
            if (this.mActivites.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((ActivityResolveInfo) this.mActivites.get(0)).resolveInfo;
            return resolveInfo;
        }
    }

    static Object access$500(ActivityChooserModel activityChooserModel) {
        return activityChooserModel.mInstanceLock;
    }

    static String access$1100() {
        return LOG_TAG;
    }

    public int getHistorySize() {
        int size;
        synchronized (this.mInstanceLock) {
            size = this.mHistoricalRecords.size();
        }
        return size;
    }

    private void persistHistoricalData() {
        synchronized (this.mInstanceLock) {
            try {
                if (!this.mReadShareHistoryCalled) {
                    throw new IllegalStateException(z);
                } else if (this.mHistoricalRecordsChanged) {
                    this.mHistoricalRecordsChanged = false;
                    this.mCanReadHistoricalData = true;
                    if (!TextUtils.isEmpty(this.mHistoryFileName)) {
                        SERIAL_EXECUTOR.execute(new HistoryPersister(this, null));
                    }
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
    }

    private boolean addHisoricalRecord(HistoricalRecord historicalRecord) {
        boolean add;
        synchronized (this.mInstanceLock) {
            try {
                add = this.mHistoricalRecords.add(historicalRecord);
                if (add) {
                    this.mHistoricalRecordsChanged = true;
                    pruneExcessiveHistoricalRecordsLocked();
                    persistHistoricalData();
                    sortActivities();
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
        return add;
    }

    public int getActivityIndex(ResolveInfo resolveInfo) {
        boolean z = SearchView.a;
        List list = this.mActivites;
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                if (((ActivityResolveInfo) list.get(i)).resolveInfo != resolveInfo) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                return i;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return -1;
    }

    private void sortActivities() {
        synchronized (this.mInstanceLock) {
            try {
                if (this.mActivitySorter != null) {
                    if (!this.mActivites.isEmpty()) {
                        this.mActivitySorter.sort(this.mIntent, this.mActivites, Collections.unmodifiableList(this.mHistoricalRecords));
                        notifyChanged();
                    }
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
            }
        }
    }

    static String access$300(ActivityChooserModel activityChooserModel) {
        return activityChooserModel.mHistoryFileName;
    }

    public Intent chooseActivity(int i) {
        ActivityResolveInfo activityResolveInfo = (ActivityResolveInfo) this.mActivites.get(i);
        ComponentName componentName = new ComponentName(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo.resolveInfo.activityInfo.name);
        Intent intent = new Intent(this.mIntent);
        intent.setComponent(componentName);
        if (this.mActivityChoserModelPolicy != null) {
            if (this.mActivityChoserModelPolicy.onChooseActivity(this, new Intent(intent))) {
                return null;
            }
        }
        addHisoricalRecord(new HistoricalRecord(componentName, System.currentTimeMillis(), 1.0f));
        return intent;
    }

    static {
        char[] toCharArray = "F>\u0016\u0002\u0004m2S\u0016\u001ff6\u0016\u0011\u0017d=\u0016\u0006\u0019(rD\u0017\u0017l\u0019_\u0001\u0002g#_\u0011\u0017d\u0015W\u0006\u0017".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 8;
                    break;
                case ay.f /*1*/:
                    i2 = 81;
                    break;
                case ay.n /*2*/:
                    i2 = 54;
                    break;
                case ay.p /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 118;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        LOG_TAG = ActivityChooserModel.class.getSimpleName();
        sRegistryLock = new Object();
        sDataModelRegistry = new HashMap();
        SERIAL_EXECUTOR = Executors.newSingleThreadExecutor();
    }

    private void pruneExcessiveHistoricalRecordsLocked() {
        boolean z = SearchView.a;
        List list = this.mHistoricalRecords;
        int size = list.size() - this.mHistoryMaxSize;
        if (size > 0) {
            this.mHistoricalRecordsChanged = true;
            int i = 0;
            while (i < size) {
                HistoricalRecord historicalRecord = (HistoricalRecord) list.remove(0);
                int i2 = i + 1;
                if (!z) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    static Context access$400(ActivityChooserModel activityChooserModel) {
        return activityChooserModel.mContext;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDefaultActivity(int r7) {
        /*
        r6_this = this;
        r0 = r6.mActivites;
        r0 = r0.get(r7);
        r0 = (com.actionbarsherlock.widget.ActivityChooserModel.ActivityResolveInfo) r0;
        r1 = r6.mActivites;
        r2 = 0;
        r1 = r1.get(r2);
        r1 = (com.actionbarsherlock.widget.ActivityChooserModel.ActivityResolveInfo) r1;
        if (r1 == 0) goto L_0x001f;
    L_0x0013:
        r1 = r1.weight;
        r2 = r0.weight;
        r1 = r1 - r2;
        r2 = 1084227584; // 0x40a00000 float:5.0 double:5.356796015E-315;
        r1 = r1 + r2;
        r2 = com.actionbarsherlock.widget.SearchView.a;
        if (r2 == 0) goto L_0x0021;
    L_0x001f:
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x0021:
        r2 = new android.content.ComponentName;
        r3 = r0.resolveInfo;
        r3 = r3.activityInfo;
        r3 = r3.packageName;
        r0 = r0.resolveInfo;
        r0 = r0.activityInfo;
        r0 = r0.name;
        r2.<init>(r3, r0);
        r0 = new com.actionbarsherlock.widget.ActivityChooserModel$HistoricalRecord;
        r4 = java.lang.System.currentTimeMillis();
        r0.<init>(r2, r4, r1);
        r6.addHisoricalRecord(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.widget.ActivityChooserModel.setDefaultActivity(int):void");
    }
}
