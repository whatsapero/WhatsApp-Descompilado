package com.google.android.gms.tagmanager;

import java.util.Collections;
import java.util.List;
import java.util.Map;

class cr {

    public class a {
        private final Map asM;
        private final com.google.android.gms.internal.d.a asN;

        public void a(String str, com.google.android.gms.internal.d.a aVar) {
            this.asM.put(str, aVar);
        }

        public Map ql() {
            return Collections.unmodifiableMap(this.asM);
        }

        public com.google.android.gms.internal.d.a qm() {
            return this.asN;
        }

        public String toString() {
            return "Properties: " + ql() + " pushAfterEvaluate: " + this.asN;
        }
    }

    public class e {
        private final List asR;
        private final List asS;
        private final List asT;
        private final List asU;
        private final List asV;
        private final List asW;
        private final List asZ;
        private final List ata;

        public List qA() {
            return this.asZ;
        }

        public List qB() {
            return this.ata;
        }

        public List qC() {
            return this.asW;
        }

        public List qt() {
            return this.asR;
        }

        public List qu() {
            return this.asS;
        }

        public List qv() {
            return this.asT;
        }

        public List qw() {
            return this.asU;
        }

        public List qx() {
            return this.asV;
        }

        public String toString() {
            return "Positive predicates: " + qt() + "  Negative predicates: " + qu() + "  Add tags: " + qv() + "  Remove tags: " + qw() + "  Add macros: " + qx() + "  Remove macros: " + qC();
        }
    }

    public class g extends Exception {
        public g(String str) {
            super(str);
        }
    }

    public static com.google.android.gms.internal.d.a g(com.google.android.gms.internal.d.a aVar) {
        com.google.android.gms.internal.d.a aVar2 = new com.google.android.gms.internal.d.a();
        aVar2.type = aVar.type;
        aVar2.gE = (int[]) aVar.gE.clone();
        if (aVar.gF) {
            aVar2.gF = aVar.gF;
        }
        return aVar2;
    }
}
