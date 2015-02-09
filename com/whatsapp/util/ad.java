package com.whatsapp.util;

import com.whatsapp.App;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class ad {
    private static final String[] z;

    static {
        String[] strArr = new String[8];
        String str = "0\u0017AZ9&\u001fNW0'UZZ%z\u0015UGu";
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
                        i3 = 85;
                        break;
                    case ay.f /*1*/:
                        i3 = 122;
                        break;
                    case ay.n /*2*/:
                        i3 = 32;
                        break;
                    case ay.p /*3*/:
                        i3 = 51;
                        break;
                    default:
                        i3 = 85;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "0\u0017AZ9&\u001fNW0'UZZ%z\u0013N\u0013";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "9\u0015G@{/\u0013P";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "0\u0017AZ9&\u001fNW0'UZZ%u";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "0\u0017AZ9&\u001fNW0'UZZ%z\u0015UGu";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "0\u0017AZ9&\u001fNW0'UZZ%z\u0015UGu";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "0\u0017AZ9&\u001fNW0'UZZ%z\u0013N\u0013";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "0\u0017AZ9&\u001fNW0'UZZ%z\u0013N\u0013";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static File a(ArrayList arrayList) {
        ZipOutputStream zipOutputStream;
        IOException e;
        Throwable th;
        int i = Log.e;
        try {
            if (arrayList != null) {
                try {
                    if (App.ao != null) {
                        if (arrayList.size() != 0) {
                            File file = new File(App.ao, z[3]);
                            BufferedInputStream bufferedInputStream;
                            try {
                                zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                                try {
                                    File file2;
                                    byte[] bArr = new byte[16384];
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        file2 = (File) it.next();
                                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file2), 16384);
                                        try {
                                            zipOutputStream.putNextEntry(new ZipEntry(file2.getName()));
                                            do {
                                                int read = bufferedInputStream.read(bArr, 0, 16384);
                                                if (read == -1) {
                                                    break;
                                                }
                                                zipOutputStream.write(bArr, 0, read);
                                            } while (i == 0);
                                            bufferedInputStream.close();
                                            if (i != 0) {
                                                break;
                                            }
                                        } catch (IOException e2) {
                                            e = e2;
                                        }
                                    }
                                    BufferedInputStream bufferedInputStream2 = null;
                                    if (null != null) {
                                        try {
                                            bufferedInputStream2.close();
                                        } catch (IOException e3) {
                                            Log.e(z[2] + e3.toString());
                                            file2 = null;
                                        }
                                    }
                                    file2 = file;
                                    if (zipOutputStream == null) {
                                        return file2;
                                    }
                                    try {
                                        zipOutputStream.close();
                                        return file2;
                                    } catch (IOException e32) {
                                        Log.e(z[0] + e32.toString());
                                        return null;
                                    }
                                } catch (IOException e4) {
                                    e32 = e4;
                                    bufferedInputStream = null;
                                    try {
                                        Log.e(z[4] + e32.toString());
                                        if (bufferedInputStream != null) {
                                            try {
                                                bufferedInputStream.close();
                                            } catch (IOException e322) {
                                                Log.e(z[7] + e322.toString());
                                            }
                                        }
                                        if (zipOutputStream != null) {
                                            try {
                                                zipOutputStream.close();
                                            } catch (IOException e3222) {
                                                Log.e(z[5] + e3222.toString());
                                                return null;
                                            }
                                        }
                                        return null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (bufferedInputStream != null) {
                                            try {
                                                bufferedInputStream.close();
                                            } catch (IOException e5) {
                                                Log.e(z[1] + e5.toString());
                                            }
                                        }
                                        if (zipOutputStream != null) {
                                            try {
                                                zipOutputStream.close();
                                            } catch (IOException e52) {
                                                Log.e(z[6] + e52.toString());
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    bufferedInputStream = null;
                                    if (bufferedInputStream != null) {
                                        bufferedInputStream.close();
                                    }
                                    if (zipOutputStream != null) {
                                        zipOutputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e6) {
                                e3222 = e6;
                                zipOutputStream = null;
                                bufferedInputStream = null;
                                Log.e(z[4] + e3222.toString());
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                                if (zipOutputStream != null) {
                                    zipOutputStream.close();
                                }
                                return null;
                            } catch (Throwable th4) {
                                th = th4;
                                zipOutputStream = null;
                                bufferedInputStream = null;
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                                if (zipOutputStream != null) {
                                    zipOutputStream.close();
                                }
                                throw th;
                            }
                        }
                    }
                } catch (IOException e32222) {
                    throw e32222;
                }
            }
            return null;
        } catch (IOException e322222) {
            throw e322222;
        } catch (IOException e3222222) {
            throw e3222222;
        }
    }
}
