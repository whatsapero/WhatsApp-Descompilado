package com.whatsapp.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.zip.GZIPOutputStream;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class a2 {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "\u007fie";
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
                        i3 = 81;
                        break;
                    case ay.f /*1*/:
                        i3 = 14;
                        break;
                    case ay.n /*2*/:
                        i3 = 31;
                        break;
                    case ay.p /*3*/:
                        i3 = 1;
                        break;
                    default:
                        i3 = 35;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "\u007fie";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u007fie";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = "\u007fie";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static File a(File file) {
        return at.b(file, z[3]);
    }

    public static File a(File file, File file2) {
        WritableByteChannel newChannel;
        FileChannel fileChannel;
        Throwable th;
        FileChannel fileChannel2 = null;
        if (file2.exists()) {
            FileInputStream fileInputStream;
            File file3 = new File(file.getParentFile(), at.a(file, new Date(), z[0]));
            try {
                OutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file3, true));
                fileInputStream = new FileInputStream(file2);
                newChannel = Channels.newChannel(gZIPOutputStream);
            } catch (FileNotFoundException e) {
                fileChannel = null;
                newChannel = null;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (FileNotFoundException e2) {
                        throw e2;
                    }
                }
                if (newChannel != null) {
                    try {
                        newChannel.close();
                    } catch (FileNotFoundException e22) {
                        throw e22;
                    }
                }
                if (file3.exists()) {
                    return file3;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                newChannel = null;
                if (fileChannel2 != null) {
                    try {
                        fileChannel2.close();
                    } catch (FileNotFoundException e222) {
                        throw e222;
                    }
                }
                if (newChannel != null) {
                    try {
                        newChannel.close();
                    } catch (FileNotFoundException e2222) {
                        throw e2222;
                    }
                }
                throw th;
            }
            try {
                fileChannel = fileInputStream.getChannel();
                try {
                    at.a(fileChannel, newChannel);
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (newChannel != null) {
                        try {
                            newChannel.close();
                        } catch (FileNotFoundException e22222) {
                            throw e22222;
                        }
                    }
                } catch (FileNotFoundException e3) {
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (newChannel != null) {
                        newChannel.close();
                    }
                    if (file3.exists()) {
                        return file3;
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    fileChannel2 = fileChannel;
                    if (fileChannel2 != null) {
                        fileChannel2.close();
                    }
                    if (newChannel != null) {
                        newChannel.close();
                    }
                    throw th;
                }
            } catch (FileNotFoundException e4) {
                fileChannel = null;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                if (newChannel != null) {
                    newChannel.close();
                }
                if (file3.exists()) {
                    return file3;
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
                if (newChannel != null) {
                    newChannel.close();
                }
                throw th;
            }
            try {
                if (file3.exists()) {
                    return file3;
                }
            } catch (FileNotFoundException e222222) {
                throw e222222;
            }
        }
        return null;
    }

    public static ArrayList a(File file, int i) {
        return at.a(file, i, z[1]);
    }

    public static void b(File file, int i) {
        at.b(file, i, z[2]);
    }

    public static boolean b(File file, File file2) {
        return at.b(file, file2);
    }
}
