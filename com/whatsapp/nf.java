package com.whatsapp;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDatabaseCorruptException;

class nf extends CursorWrapper {
    private mi a;

    public nf(Cursor cursor, mi miVar) {
        super(cursor);
        this.a = miVar;
    }

    public void deactivate() {
        super.deactivate();
    }

    public int getCount() {
        try {
            return super.getCount();
        } catch (SQLiteDatabaseCorruptException e) {
            App.aJ.L();
            throw e;
        }
    }

    public boolean requery() {
        try {
            if (this.a != null) {
                this.a.b();
            }
            Boolean valueOf = Boolean.valueOf(super.requery());
            try {
                if (this.a != null) {
                    this.a.a();
                }
                return valueOf.booleanValue();
            } catch (SQLiteDatabaseCorruptException e) {
                throw e;
            }
        } catch (SQLiteDatabaseCorruptException e2) {
            throw e2;
        }
    }
}
