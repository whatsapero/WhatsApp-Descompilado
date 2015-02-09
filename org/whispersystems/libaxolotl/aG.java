package org.whispersystems.libaxolotl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ag {
    private bn a;
    private boolean b;
    private LinkedList c;

    public void a(bn bnVar) {
        this.a = bnVar;
    }

    public void b(bn bnVar) {
        this.c.addFirst(this.a);
        this.a = bnVar;
        if (this.c.size() > 40) {
            this.c.removeLast();
        }
    }

    public byte[] e() {
        boolean z = a6.B;
        Iterable linkedList = new LinkedList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            linkedList.add(((bn) it.next()).e());
            if (z) {
                break;
            }
        }
        return aw.j().a(this.a.e()).a(linkedList).j().b();
    }

    public void c() {
        b(new bn());
    }

    public List d() {
        return this.c;
    }

    public bn a() {
        return this.a;
    }

    public ag(byte[] bArr) {
        boolean z = a6.B;
        this.a = new bn();
        this.c = new LinkedList();
        this.b = false;
        aw a = aw.a(bArr);
        this.a = new bn(a.m());
        this.b = false;
        for (a6 a6Var : a.g()) {
            this.c.add(new bn(a6Var));
            if (z) {
                return;
            }
        }
    }

    public ag() {
        this.a = new bn();
        this.c = new LinkedList();
        this.b = false;
        this.b = true;
    }

    public boolean b() {
        return this.b;
    }

    public boolean a(int i, byte[] bArr) {
        boolean z = a6.B;
        if (this.a.b() == i && Arrays.equals(bArr, this.a.k())) {
            return true;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            bn bnVar = (bn) it.next();
            if (bnVar.b() != i || !Arrays.equals(bArr, bnVar.k())) {
                if (z) {
                    break;
                }
            }
            return true;
        }
        return false;
    }
}
