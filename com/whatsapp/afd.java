package com.whatsapp;

class afd {
    String a;
    String b;

    afd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof afd)) {
            return false;
        }
        afd com_whatsapp_afd = (afd) obj;
        if (this.a == null) {
            if (com_whatsapp_afd.a != null) {
                return false;
            }
        } else if (!this.a.equals(com_whatsapp_afd.a)) {
            return false;
        }
        return this.b == null ? com_whatsapp_afd.b == null : this.b.equals(com_whatsapp_afd.b);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.a == null ? 0 : this.a.hashCode()) + 31) * 31;
        if (this.b != null) {
            i = this.b.hashCode();
        }
        return hashCode + i;
    }
}
