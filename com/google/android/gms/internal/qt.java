package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class qt {
    private qr azd;
    private Object aze;
    private List azf;

    qt() {
        this.azf = new ArrayList();
    }

    private byte[] toByteArray() {
        byte[] bArr = new byte[c()];
        a(qp.q(bArr));
        return bArr;
    }

    void a(qp qpVar) {
        boolean z = qw.a;
        try {
            if (this.aze != null) {
                this.azd.a(this.aze, qpVar);
                if (!z) {
                    return;
                }
            }
            for (qy qyVar : this.azf) {
                qyVar.a(qpVar);
                if (z) {
                    return;
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    int c() {
        boolean z = qw.a;
        int i = 0;
        if (this.aze != null) {
            i = this.azd.B(this.aze);
            if (!z) {
                return i;
            }
        }
        int i2 = i;
        for (qy qyVar : this.azf) {
            i = qyVar.c() + i2;
            if (z) {
                return i;
            }
            i2 = i;
        }
        return i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        try {
            if (!(obj instanceof qt)) {
                return false;
            }
            qt qtVar = (qt) obj;
            try {
                if (this.aze == null || qtVar.aze == null) {
                    try {
                        if (this.azf != null && qtVar.azf != null) {
                            return this.azf.equals(qtVar.azf);
                        }
                        try {
                            return Arrays.equals(toByteArray(), qtVar.toByteArray());
                        } catch (Throwable e) {
                            throw new IllegalStateException(e);
                        }
                    } catch (IOException e2) {
                        throw e2;
                    } catch (IOException e22) {
                        throw e22;
                    }
                } else if (this.azd != qtVar.azd) {
                    return false;
                } else {
                    try {
                        if (!this.azd.ayX.isArray()) {
                            return this.aze.equals(qtVar.aze);
                        }
                        try {
                            if (this.aze instanceof byte[]) {
                                return Arrays.equals((byte[]) this.aze, (byte[]) qtVar.aze);
                            }
                            try {
                                if (this.aze instanceof int[]) {
                                    return Arrays.equals((int[]) this.aze, (int[]) qtVar.aze);
                                }
                                try {
                                    if (this.aze instanceof long[]) {
                                        return Arrays.equals((long[]) this.aze, (long[]) qtVar.aze);
                                    }
                                    try {
                                        if (this.aze instanceof float[]) {
                                            return Arrays.equals((float[]) this.aze, (float[]) qtVar.aze);
                                        }
                                        try {
                                            if (this.aze instanceof double[]) {
                                                return Arrays.equals((double[]) this.aze, (double[]) qtVar.aze);
                                            }
                                            try {
                                                return this.aze instanceof boolean[] ? Arrays.equals((boolean[]) this.aze, (boolean[]) qtVar.aze) : Arrays.deepEquals((Object[]) this.aze, (Object[]) qtVar.aze);
                                            } catch (IOException e222) {
                                                throw e222;
                                            }
                                        } catch (IOException e2222) {
                                            throw e2222;
                                        }
                                    } catch (IOException e22222) {
                                        throw e22222;
                                    }
                                } catch (IOException e222222) {
                                    throw e222222;
                                }
                            } catch (IOException e2222222) {
                                throw e2222222;
                            }
                        } catch (IOException e22222222) {
                            throw e22222222;
                        }
                    } catch (IOException e222222222) {
                        throw e222222222;
                    }
                }
            } catch (IOException e2222222222) {
                throw e2222222222;
            } catch (IOException e22222222222) {
                try {
                    throw e22222222222;
                } catch (IOException e222222222222) {
                    throw e222222222222;
                }
            }
        } catch (IOException e2222222222222) {
            throw e2222222222222;
        }
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
