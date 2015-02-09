package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilterClient {
    private static final String[] z;
    protected boolean mAutoRequery;
    protected ChangeObserver mChangeObserver;
    protected Context mContext;
    protected Cursor mCursor;
    protected CursorFilter mCursorFilter;
    protected DataSetObserver mDataSetObserver;
    protected boolean mDataValid;
    protected FilterQueryProvider mFilterQueryProvider;
    protected int mRowIDColumn;

    class ChangeObserver extends ContentObserver {
        final CursorAdapter this$0;

        public void onChange(boolean z) {
            this.this$0.onContentChanged();
        }

        public boolean deliverSelfNotifications() {
            return true;
        }
    }

    static {
        String[] strArr = new String[3];
        String str = "\u000b\u0002\u0016R9\u0006J\u0017\u001e0\u0007\u001b\u0006\u001e>\u001d\u001f\u0010Q/H\u0019\f\u001e-\u0007\u001e\nJ4\u0007\u0003C";
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
                        i3 = 104;
                        break;
                    case ay.f /*1*/:
                        i3 = 109;
                        break;
                    case ay.n /*2*/:
                        i3 = 99;
                        break;
                    case ay.p /*3*/:
                        i3 = 62;
                        break;
                    default:
                        i3 = 93;
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
                    str = "7\u0004\u0007";
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u001c\u0005\nM}\u001b\u0005\fK1\fM\fP1\u0011M\u0001[}\u000b\f\u000fR8\fM\u0014V8\u0006M\u0017V8H\u000e\u0016L.\u0007\u001fCW.H\u001b\u0002R4\f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public abstract void bindView(View view, Context context, Cursor cursor);

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            if (this.mDataValid) {
                try {
                    if (this.mCursor.moveToPosition(i)) {
                        if (view == null) {
                            View newView = newView(this.mContext, this.mCursor, viewGroup);
                            if (SlidingPaneLayout.a == 0) {
                                view = newView;
                            }
                        }
                        bindView(view, this.mContext, this.mCursor);
                        return view;
                    }
                    throw new IllegalStateException(z[0] + i);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            throw new IllegalStateException(z[1]);
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public abstract View newView(Context context, Cursor cursor, ViewGroup viewGroup);

    public CharSequence convertToString(Cursor cursor) {
        if (cursor != null) {
            return cursor.toString();
        }
        try {
            return "";
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public int getCount() {
        try {
            if (this.mDataValid) {
                if (this.mCursor != null) {
                    return this.mCursor.getCount();
                }
            }
            try {
                return 0;
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public Cursor swapCursor(Cursor cursor) {
        try {
            if (cursor == this.mCursor) {
                return null;
            }
            Cursor cursor2 = this.mCursor;
            if (cursor2 != null) {
                try {
                    if (this.mChangeObserver != null) {
                        cursor2.unregisterContentObserver(this.mChangeObserver);
                    }
                    try {
                        if (this.mDataSetObserver != null) {
                            cursor2.unregisterDataSetObserver(this.mDataSetObserver);
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            try {
                this.mCursor = cursor;
                try {
                    if (cursor != null) {
                        if (this.mChangeObserver != null) {
                            cursor.registerContentObserver(this.mChangeObserver);
                        }
                        try {
                            if (this.mDataSetObserver != null) {
                                cursor.registerDataSetObserver(this.mDataSetObserver);
                            }
                            this.mRowIDColumn = cursor.getColumnIndexOrThrow(z[2]);
                            this.mDataValid = true;
                            notifyDataSetChanged();
                            if (SlidingPaneLayout.a == 0) {
                                return cursor2;
                            }
                        } catch (IllegalStateException e22) {
                            throw e22;
                        }
                    }
                    this.mRowIDColumn = -1;
                    this.mDataValid = false;
                    notifyDataSetInvalidated();
                    return cursor2;
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            } catch (IllegalStateException e2222) {
                throw e2222;
            } catch (IllegalStateException e22222) {
                throw e22222;
            }
        } catch (IllegalStateException e222222) {
            throw e222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onContentChanged() {
        /*
        r1_this = this;
        r0 = r1.mAutoRequery;	 Catch:{ IllegalStateException -> 0x0019 }
        if (r0 == 0) goto L_0x0018;
    L_0x0004:
        r0 = r1.mCursor;	 Catch:{ IllegalStateException -> 0x001b }
        if (r0 == 0) goto L_0x0018;
    L_0x0008:
        r0 = r1.mCursor;	 Catch:{ IllegalStateException -> 0x001d }
        r0 = r0.isClosed();	 Catch:{ IllegalStateException -> 0x001d }
        if (r0 != 0) goto L_0x0018;
    L_0x0010:
        r0 = r1.mCursor;	 Catch:{ IllegalStateException -> 0x001d }
        r0 = r0.requery();	 Catch:{ IllegalStateException -> 0x001d }
        r1.mDataValid = r0;	 Catch:{ IllegalStateException -> 0x001d }
    L_0x0018:
        return;
    L_0x0019:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001b }
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.CursorAdapter.onContentChanged():void");
    }

    public Object getItem(int i) {
        try {
            if (this.mDataValid) {
                if (this.mCursor != null) {
                    this.mCursor.moveToPosition(i);
                    return this.mCursor;
                }
            }
            try {
                return null;
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        try {
            return this.mFilterQueryProvider != null ? this.mFilterQueryProvider.runQuery(charSequence) : this.mCursor;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return newView(context, cursor, viewGroup);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            if (!this.mDataValid) {
                return null;
            }
            this.mCursor.moveToPosition(i);
            if (view == null) {
                View newDropDownView = newDropDownView(this.mContext, this.mCursor, viewGroup);
                if (SlidingPaneLayout.a == 0) {
                    view = newDropDownView;
                }
            }
            bindView(view, this.mContext, this.mCursor);
            return view;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean hasStableIds() {
        return true;
    }

    public Filter getFilter() {
        try {
            if (this.mCursorFilter == null) {
                this.mCursorFilter = new CursorFilter(this);
            }
            return this.mCursorFilter;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void changeCursor(Cursor cursor) {
        Cursor swapCursor = swapCursor(cursor);
        if (swapCursor != null) {
            try {
                swapCursor.close();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getItemId(int r4) {
        /*
        r3_this = this;
        r0 = 0;
        r2 = r3.mDataValid;	 Catch:{ IllegalStateException -> 0x001b }
        if (r2 == 0) goto L_0x001a;
    L_0x0006:
        r2 = r3.mCursor;	 Catch:{ IllegalStateException -> 0x001d }
        if (r2 == 0) goto L_0x001a;
    L_0x000a:
        r2 = r3.mCursor;	 Catch:{ IllegalStateException -> 0x001f }
        r2 = r2.moveToPosition(r4);	 Catch:{ IllegalStateException -> 0x001f }
        if (r2 == 0) goto L_0x001a;
    L_0x0012:
        r0 = r3.mCursor;	 Catch:{ IllegalStateException -> 0x001f }
        r1 = r3.mRowIDColumn;	 Catch:{ IllegalStateException -> 0x001f }
        r0 = r0.getLong(r1);	 Catch:{ IllegalStateException -> 0x001f }
    L_0x001a:
        return r0;
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.CursorAdapter.getItemId(int):long");
    }

    public Cursor getCursor() {
        return this.mCursor;
    }
}
