package com.whatsapp;

import java.util.Iterator;
import java.util.LinkedList;

public class i6 {
    private LinkedList a;
    private int b;

    public void a(byte[] bArr) {
        synchronized (this) {
            if (bArr != null) {
                this.a.addFirst(bArr);
            }
        }
    }

    public byte[] a(int i) {
        byte[] bArr;
        int i2 = App.az;
        synchronized (this) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                bArr = (byte[]) it.next();
                if (bArr.length < i) {
                    if (i2 != 0) {
                        break;
                    }
                }
                it.remove();
                break;
            }
            this.b += i;
            bArr = new byte[i];
        }
        return bArr;
    }

    public void a() {
        synchronized (this) {
            this.a.clear();
            this.b = 0;
        }
    }

    public i6() {
        this.b = 0;
        this.a = new LinkedList();
    }
}
