package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class PagerAdapter {
    private static final String[] z;
    private DataSetObservable mObservable;

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r6 = 37;
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "!3`PL\u00013u\u0005H\u0016\"yJAS2tVQ\u00019hlQ\u0016;1RD\u0000v\u007fJQS9g@W\u0001?uA@\u001d";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000c:
        r2 = r2.toCharArray();
        r7 = r2.length;
        r8 = r7;
        r9 = r1;
        r7 = r2;
    L_0x0014:
        if (r8 > r9) goto L_0x0031;
    L_0x0016:
        r2 = new java.lang.String;
        r2.<init>(r7);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002c;
            default: goto L_0x0022;
        };
    L_0x0022:
        r4[r3] = r2;
        r2 = 1;
        r0 = "!3`PL\u00013u\u0005H\u0016\"yJAS?\u007fVQ\u00128eLD\u00073XQ@\u001evfDVS8~Q\u0005\u001c tWW\u001a2u@K";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000c;
    L_0x002c:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x0031:
        r10 = r7[r9];
        r2 = r9 % 5;
        switch(r2) {
            case 0: goto L_0x0041;
            case 1: goto L_0x0044;
            case 2: goto L_0x0047;
            case 3: goto L_0x004a;
            default: goto L_0x0038;
        };
    L_0x0038:
        r2 = r6;
    L_0x0039:
        r2 = r2 ^ r10;
        r2 = (char) r2;
        r7[r9] = r2;
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x0014;
    L_0x0041:
        r2 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x0039;
    L_0x0044:
        r2 = 86;
        goto L_0x0039;
    L_0x0047:
        r2 = 17;
        goto L_0x0039;
    L_0x004a:
        r2 = r6;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.PagerAdapter.<clinit>():void");
    }

    public abstract int getCount();

    public abstract boolean isViewFromObject(View view, Object obj);

    public PagerAdapter() {
        this.mObservable = new DataSetObservable();
    }

    public void finishUpdate(View view) {
    }

    public Object instantiateItem(View view, int i) {
        throw new UnsupportedOperationException(z[1]);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.mObservable.unregisterObserver(dataSetObserver);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        return instantiateItem((View) viewGroup, i);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.mObservable.registerObserver(dataSetObserver);
    }

    public void destroyItem(View view, int i, Object obj) {
        throw new UnsupportedOperationException(z[0]);
    }

    public Parcelable saveState() {
        return null;
    }

    public void startUpdate(View view) {
    }

    public void finishUpdate(ViewGroup viewGroup) {
        finishUpdate((View) viewGroup);
    }

    public void setPrimaryItem(View view, int i, Object obj) {
    }

    public float getPageWidth(int i) {
        return 1.0f;
    }

    public CharSequence getPageTitle(int i) {
        return null;
    }

    public void startUpdate(ViewGroup viewGroup) {
        startUpdate((View) viewGroup);
    }

    public void notifyDataSetChanged() {
        this.mObservable.notifyChanged();
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public int getItemPosition(Object obj) {
        return -1;
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        setPrimaryItem((View) viewGroup, i, obj);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        destroyItem((View) viewGroup, i, obj);
    }
}
