package com.tonicartos.widget.stickygridheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class l extends BaseAdapter {
    private static boolean a;
    private static final String z;
    private View[] b;
    private StickyGridHeadersGridView c;
    private DataSetObserver d;
    private int e;
    private final Context f;
    private final List g;
    private final a h;
    private int i;

    static {
        char[] toCharArray = "M\u0005\u001a`@G\u0016\u0001jOV\u0014\u0012gNL\u0002\u0011bX[\u0010\u0017b[J\u0014\u0001tY_\u0001\u0003fY\u0011\u0016\u0016wMW\u001d\u001ffYH\u0018\u0016t\u000bI\u0003\u001cmL\u001e\u0005\nsN".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 62;
                    break;
                case ay.f /*1*/:
                    i2 = 113;
                    break;
                case ay.n /*2*/:
                    i2 = 115;
                    break;
                case ay.p /*3*/:
                    i2 = 3;
                    break;
                default:
                    i2 = 43;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private View b(int i, View view, ViewGroup viewGroup) {
        StickyGridHeadersBaseAdapterWrapper$HeaderFillerView stickyGridHeadersBaseAdapterWrapper$HeaderFillerView = (StickyGridHeadersBaseAdapterWrapper$HeaderFillerView) view;
        View stickyGridHeadersBaseAdapterWrapper$HeaderFillerView2 = new StickyGridHeadersBaseAdapterWrapper$HeaderFillerView(this, this.f);
        stickyGridHeadersBaseAdapterWrapper$HeaderFillerView2.setHeaderWidth(this.c.getWidth());
        return stickyGridHeadersBaseAdapterWrapper$HeaderFillerView2;
    }

    public boolean isEmpty() {
        return this.h.isEmpty();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
        r8_this = this;
        r2 = 0;
        r3 = com.tonicartos.widget.stickygridheaders.StickyGridHeadersGridView.i;
        r0 = 0;
        r1 = r10 instanceof com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapterWrapper$ReferenceView;
        if (r1 == 0) goto L_0x0096;
    L_0x0008:
        r10 = (com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapterWrapper$ReferenceView) r10;
        r0 = r10.getChildAt(r2);
    L_0x000e:
        r4 = r8.a(r9);
        r1 = r4.b;
        r5 = -2;
        if (r1 != r5) goto L_0x0094;
    L_0x0017:
        r1 = r4.c;
        r1 = r8.b(r1, r0, r11);
        r0 = r1;
        r0 = (com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapterWrapper$HeaderFillerView) r0;
        r5 = r4.c;
        r0.setHeaderId(r5);
        r0 = r1.getTag();
        r0 = (android.view.View) r0;
        r5 = r8.h;
        r6 = r4.c;
        r0 = r5.a(r6, r0, r11);
        r1.setTag(r0);
        if (r3 == 0) goto L_0x0052;
    L_0x0038:
        r0 = com.whatsapp.DialogToastActivity.i;
        if (r0 == 0) goto L_0x0092;
    L_0x003c:
        r0 = r2;
    L_0x003d:
        com.whatsapp.DialogToastActivity.i = r0;
    L_0x003f:
        r0 = r4.b;
        r2 = -1;
        if (r0 != r2) goto L_0x004a;
    L_0x0044:
        r1 = r8.a(r1, r11);
        if (r3 == 0) goto L_0x0052;
    L_0x004a:
        r0 = r8.h;
        r2 = r4.b;
        r1 = r0.getView(r2, r1, r11);
    L_0x0052:
        if (r10 != 0) goto L_0x005b;
    L_0x0054:
        r10 = new com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapterWrapper$ReferenceView;
        r0 = r8.f;
        r10.<init>(r8, r0);
    L_0x005b:
        r10.removeAllViews();
        r10.addView(r1);
        r10.setPosition(r9);
        r0 = r8.i;
        r10.setNumColumns(r0);
        r0 = r8.b;
        r1 = r8.i;
        r1 = r9 % r1;
        r0[r1] = r10;
        r0 = r8.b;
        r10.setRowSiblings(r0);
        r0 = a;
        if (r0 != 0) goto L_0x0091;
    L_0x007a:
        r0 = r8.i;
        r0 = r9 % r0;
        r1 = r8.i;
        r1 = r1 + -1;
        if (r0 == r1) goto L_0x008c;
    L_0x0084:
        r0 = r8.getCount();
        r0 = r0 + -1;
        if (r9 != r0) goto L_0x0091;
    L_0x008c:
        r0 = r8.i;
        r8.c(r0);
    L_0x0091:
        return r10;
    L_0x0092:
        r0 = 1;
        goto L_0x003d;
    L_0x0094:
        r1 = r0;
        goto L_0x003f;
    L_0x0096:
        r7 = r0;
        r0 = r10;
        r10 = r7;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonicartos.widget.stickygridheaders.l.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public long getItemId(int i) {
        n a = a(i);
        if (a.b == -2) {
            return -1;
        }
        return a.b == -1 ? -2 : this.h.getItemId(a.b);
    }

    public void e(int i) {
        this.i = i;
        c(i);
    }

    private StickyGridHeadersBaseAdapterWrapper$FillerView a(View view, ViewGroup viewGroup) {
        View view2;
        if (view == null || (view instanceof StickyGridHeadersBaseAdapterWrapper$FillerView)) {
            view2 = view;
        } else {
            Log.e(z + view + " " + view.getTag());
            view2 = null;
        }
        StickyGridHeadersBaseAdapterWrapper$FillerView stickyGridHeadersBaseAdapterWrapper$FillerView = (StickyGridHeadersBaseAdapterWrapper$FillerView) view2;
        return stickyGridHeadersBaseAdapterWrapper$FillerView == null ? new StickyGridHeadersBaseAdapterWrapper$FillerView(this, this.f) : stickyGridHeadersBaseAdapterWrapper$FillerView;
    }

    protected void a() {
        int i = 0;
        boolean z = StickyGridHeadersGridView.i;
        this.e = 0;
        int a = this.h.a();
        if (a == 0) {
            this.e = this.h.getCount();
            return;
        }
        while (i < a) {
            this.e += this.h.a(i) + this.i;
            i++;
            if (z) {
                return;
            }
        }
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.h.registerDataSetObserver(dataSetObserver);
    }

    public boolean isEnabled(int i) {
        n a = a(i);
        return (a.b == -1 || a.b == -2) ? false : this.h.isEnabled(a.b);
    }

    public int getItemViewType(int i) {
        n a = a(i);
        if (a.b == -2) {
            return 1;
        }
        if (a.b == -1) {
            return 0;
        }
        int itemViewType = this.h.getItemViewType(a.b);
        return itemViewType != -1 ? itemViewType + 2 : itemViewType;
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.h.unregisterDataSetObserver(dataSetObserver);
    }

    protected long b(int i) {
        return (long) a(i).c;
    }

    static View[] a(l lVar) {
        return lVar.b;
    }

    protected n a(int i) {
        boolean z = StickyGridHeadersGridView.i;
        int a = this.h.a();
        if (a == 0) {
            return i >= this.h.getCount() ? new n(this, -1, 0) : new n(this, i, 0);
        } else {
            int i2 = 0;
            int i3 = i;
            while (i2 < a) {
                int a2 = this.h.a(i2);
                if (i != 0) {
                    int i4 = i - this.i;
                    if (i4 >= 0) {
                        int i5 = i3 - this.i;
                        if (i4 >= a2) {
                            int d = d(i2);
                            i3 = i5 - d;
                            i = i4 - (a2 + d);
                            i2++;
                            if (z) {
                                break;
                            }
                        }
                        return new n(this, i5, i2);
                    }
                    return new n(this, -1, i2);
                }
                return new n(this, -2, i2);
            }
            return new n(this, -1, i2);
        }
    }

    public l(Context context, StickyGridHeadersGridView stickyGridHeadersGridView, a aVar) {
        this.d = new c(this);
        this.g = new ArrayList();
        this.i = 1;
        this.f = context;
        this.h = aVar;
        this.c = stickyGridHeadersGridView;
        aVar.registerDataSetObserver(this.d);
    }

    public Object getItem(int i) {
        n a = a(i);
        return (a.b == -1 || a.b == -2) ? null : this.h.getItem(a.b);
    }

    public boolean hasStableIds() {
        return this.h.hasStableIds();
    }

    protected View a(int i, View view, ViewGroup viewGroup) {
        return this.h.a() == 0 ? null : this.h.a(a(i).c, view, viewGroup);
    }

    public int getViewTypeCount() {
        return this.h.getViewTypeCount() + 2;
    }

    static List b(l lVar) {
        return lVar.g;
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    private void c(int i) {
        this.b = new View[i];
        Arrays.fill(this.b, null);
    }

    private int d(int i) {
        int a = this.h.a(i) % this.i;
        return a == 0 ? 0 : this.i - a;
    }

    public int getCount() {
        int i = 0;
        boolean z = StickyGridHeadersGridView.i;
        this.e = 0;
        int a = this.h.a();
        if (a == 0) {
            return this.h.getCount();
        }
        while (i < a) {
            this.e += (this.h.a(i) + d(i)) + this.i;
            i++;
            if (z) {
                break;
            }
        }
        return this.e;
    }
}
