package com.google;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class a5 implements Externalizable {
    private static final long serialVersionUID = 1;
    private List a;

    public int d() {
        return this.a.size();
    }

    public void writeExternal(ObjectOutput objectOutput) {
        int i = c8.b;
        int d = d();
        objectOutput.writeInt(d);
        int i2 = 0;
        while (i2 < d) {
            ((f8) this.a.get(i2)).writeExternal(objectOutput);
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public static al a() {
        return new al();
    }

    public a5 c() {
        this.a.clear();
        return this;
    }

    public List b() {
        return this.a;
    }

    public a5() {
        this.a = new ArrayList();
    }

    public a5 a(f8 f8Var) {
        if (f8Var == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.a.add(f8Var);
        return this;
    }

    public void readExternal(ObjectInput objectInput) {
        int i = c8.b;
        int readInt = objectInput.readInt();
        int i2 = 0;
        while (i2 < readInt) {
            f8 f8Var = new f8();
            f8Var.readExternal(objectInput);
            this.a.add(f8Var);
            i2++;
            if (i != 0) {
                return;
            }
        }
    }
}
